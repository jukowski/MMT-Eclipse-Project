package info.kwarc.mmt.twelfIntegration;

import info.kwarc.mmt.lF.linkBody;
import info.kwarc.mmt.lF.namespaceDeclaration;
import info.kwarc.mmt.lF.sigConstruct;
import info.kwarc.mmt.lF.sigConstructNOSP;
import info.kwarc.mmt.lF.sigDeclaration;
import info.kwarc.mmt.lF.sigIncludeDeclaration;
import info.kwarc.mmt.lF.viewDeclaration;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.diagnostics.IDiagnosticConsumer;
import org.eclipse.xtext.linking.ILinker;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class LFParseEnricher implements ILinker {

	XPath xpath;
	XPathExpression theoryXPath;
	XPathExpression viewXPath;
	XPathExpression includeXPath;
	Map<String, Element> viewNodeMap, sigNodeMap; 
	Map<String, EObject> viewObjMap, sigObjMap; 
	Map<String, String> nmap; 

	public LFParseEnricher() {
		XPathFactory factory = XPathFactory.newInstance();
		xpath = factory.newXPath();
		try {
			theoryXPath = xpath.compile("//theory");
			viewXPath = xpath.compile("//view");
			viewXPath = xpath.compile("//include");
		} catch (XPathExpressionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private URI createURI(String[] segments) {
		StringBuffer bf = new StringBuffer();
		// bf.append(segments[0]); bf.append("://");
		for (int i = 1; i < segments.length - 1; ++i) {
			bf.append(segments[i]);
			bf.append("/");
		}
		String fname = segments[segments.length - 1];
		bf.append(fname.subSequence(0, fname.lastIndexOf('.')));
		bf.append(".omdoc");
		return URI.createURI(bf.toString());
	}
	
	Map<String, Element> createMapping(XPathExpression theoryXPath, Element e, String attr) {
		Map<String, Element> sigMap = new HashMap<String, Element>(); 
		Object result;
		try {
			result = theoryXPath.evaluate(e, XPathConstants.NODESET);
			NodeList nodes = (NodeList) result;
			for (int i = 0; i < nodes.getLength(); i++) {
				Element n = (Element) nodes.item(i);
				sigMap.put(n.getAttribute(attr), n); 
			}
		} catch (XPathExpressionException e1) {
		}
		return sigMap;
	}
	
	public EObject getRef(String URI) {
		return null;
	}
	
	public void syncConstructs(EObject model, Element e) {
		sigConstruct ll;
		TreeIterator<EObject> mainIter = model.eAllContents();
		while (mainIter.hasNext()) {
			EObject contr = mainIter.next();
						
			if (contr instanceof sigIncludeDeclaration) {
				sigIncludeDeclaration inc = (sigIncludeDeclaration) contr;
				String importName = NodeModelUtils.getNode(inc).getText();
				Boolean found = false;
				for (String namespace : nmap.keySet()) {
					if (importName.startsWith(namespace+".")) {
						String realURI = nmap.get(namespace);
						inc.setFullURI(realURI+importName.substring(namespace.length()));
						found = true;
						break;
					}
				}
				if (!found)
					inc.setFullURI(importName);

				/*
				if (importName.startsWith("t.")) {
					String proj = contr.eResource().getURI().segment(1);
					URI ol = contr.eResource().getURI();
					Logger.getAnonymousLogger().info(ol.toString());
					URI nu = URI.createURI("platform:/resource/"+proj+"/source/test.elf");
					Logger.getAnonymousLogger().info(nu.toString());
					Resource res = contr.eResource().getResourceSet().getResource(nu, true);
					TreeIterator<EObject> iter = res.getAllContents();
					while (iter.hasNext()) {
						EObject node = iter.next();
						if (node instanceof signatureDeclaration && ((signatureDeclaration) node).getSigName().equals(importName.substring(2))) {
							((includeConstruct) contr).setNamespace((signatureDeclaration)node);
						}
					}
				}
				if (sigObjMap.containsKey(importName)) {
					((includeConstruct) contr).setNamespace((signatureDeclaration)sigObjMap.get(importName));
				}*/
			}
			/*
			if (contr instanceof structConstruct) {
				structConstruct inc = (structConstruct) contr;
				String totalText = NodeModelUtils.getNode(inc).getText();
				String importName = totalText.substring(totalText.indexOf(':')+1).trim();
				if (sigObjMap.containsKey(importName)) {
					((structConstruct) contr).setNamespace((signatureDeclaration)sigObjMap.get(importName));
				}				
			}
				String namespace = ((includeConstruct) contr).getNamespace();
				if (namespace.indexOf('.')==-1) { // local link
					if (sigObjMap.containsKey(namespace)) {
						((includeConstruct) contr).setHyper(((signatureDeclaration) sigObjMap.get(namespace)).getDefs());
						continue;
					}
					if (viewObjMap.containsKey(namespace)) {
						((includeConstruct) contr).setHyper(((viewDeclaration) viewObjMap.get(namespace)).getViewDefs());
						continue; 
					}
				}
			} 
			
		} */
		}
	}
	
	public void enrich(EObject model, Element e) {
		String defaultNamespace = e.getAttribute("base");
		sigNodeMap = createMapping(theoryXPath, e, "name");
		viewNodeMap = createMapping(viewXPath, e, "name");
		sigObjMap = new HashMap<String, EObject>();
		viewObjMap = new HashMap<String, EObject>();		
		nmap = new HashMap<String, String>();
		
		TreeIterator<EObject> iter = model.eAllContents();
		while (iter.hasNext()) {
			EObject obj = iter.next();
			if (obj instanceof namespaceDeclaration) {
				namespaceDeclaration d = (namespaceDeclaration) obj;
				if (d.getName()!=null) {
					nmap.put(d.getName(), d.getFullURI());
				} else {
					nmap.put("BASE", d.getFullURI());
				}
			}
			if (obj instanceof sigDeclaration) {
				sigDeclaration sig = (sigDeclaration) obj;
				if (sigNodeMap.containsKey(sig.getName())) {
					sigObjMap.put(sig.getName(), obj);
					Element elem = sigNodeMap.get(sig.getName());
					String bs = defaultNamespace;
					if (elem.hasAttribute("base"))
						bs = elem.getAttribute("base");
					sig.setFullURI(bs + "?" + sig.getName());
					syncConstructs(sig.getDef(), elem);
				}
			}
			if (obj instanceof viewDeclaration) {
				viewDeclaration view = (viewDeclaration) obj;
				if (viewNodeMap.containsKey(view.getName())) {
					Element elem = sigNodeMap.get(view.getName());
					viewObjMap.put(view.getName(), obj);
					String bs = defaultNamespace;
					if (elem.hasAttribute("base"))
						bs = elem.getAttribute("base");
					view.setFullURI(bs + "?" + view.getName());
					syncConstructs(view.getDef(), elem);
				}				
			}
		} 
	}

	@Override
	public void linkModel(EObject model, IDiagnosticConsumer diagnosticsConsumer) {
		Resource res = model.eResource();
		URI srcURI = res.getURI();
		URI cURI = null;
		String[] segments = srcURI.segments();
		if (segments[2].equals("source")) {
			segments[2] = "compiled";
			cURI = createURI(segments);
		} else if (segments[2].equals("mars") && segments[4].equals("source")) {
			segments[4] = "compiled";
			cURI = createURI(segments);
		}
		if (cURI != null) {
			IResource file = ResourcesPlugin.getWorkspace().getRoot()
					.findMember(cURI.path());
			if (file == null)
				return;
			File f = new File(file.getLocation().toOSString());
			if (!f.exists())
				return;
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db;
			try {
				db = dbf.newDocumentBuilder();
				Document doc = db.parse(f);
				doc.getDocumentElement().normalize();

				enrich(model, doc.getDocumentElement());

			} catch (ParserConfigurationException e) {
				e.printStackTrace();
			} catch (SAXException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
