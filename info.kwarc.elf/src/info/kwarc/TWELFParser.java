package info.kwarc;

import info.kwarc.elf.signatureDeclaration;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parser.ParseResult;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import apc.AbstractFileUpdateParser;

public class TWELFParser extends AbstractFileUpdateParser {

	DocumentBuilder docBuilder;
	XPathExpression theoryXPath;
	XPathExpression omdocXPath;
	
	public TWELFParser() {
		initXMLFactories();
	}
	
	void initXMLFactories() {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		try {
			docBuilder = dbf.newDocumentBuilder();
			XPathFactory factory = XPathFactory.newInstance();
			XPath xpath = factory.newXPath();
			theoryXPath = xpath.compile("//theory");
			omdocXPath = xpath.compile("//omdoc");
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (XPathExpressionException e) {
			e.printStackTrace();
		}
	}
	
	String twelfExec = "/home/costea/kwarc/twelf/twelf-mod/bin/check-some";

	public String getResultFile() {
		return getFilePath()+".tmp";
	}

	void matchTheories(Document doc, EObject parseResult) {
		Object theories, omdoc;
		HashMap<String, Node> nodeMap = new HashMap<String, Node>(); 
		String defaultNamespace="default namespace";
		try {
			omdoc = omdocXPath.evaluate(doc, XPathConstants.NODESET);
			if (omdoc != null && omdoc instanceof NodeList) {
				NodeList omdocList = (NodeList) omdoc;
				Node baseNode = omdocList.item(0).getAttributes().getNamedItem("base");
				if (baseNode != null) {
					defaultNamespace = baseNode.getNodeValue();
				}
			}
			theories = theoryXPath.evaluate(doc, XPathConstants.NODESET);
			if (theories != null && theories instanceof NodeList) {
				NodeList theoryList = (NodeList) theories;
				
				for (int i=0; i<theoryList.getLength(); ++i) {
					Node theoryNode = theoryList.item(i);
					nodeMap.put(theoryNode.getAttributes().getNamedItem("name").getNodeValue(), theoryNode);					
				}
			}
			TreeIterator<EObject> objIter = parseResult.eAllContents();
			while (objIter.hasNext()) {
				EObject iter = objIter.next();
				if (iter instanceof signatureDeclaration) {
					signatureDeclaration sigDecl = (signatureDeclaration) iter;
					String sigName = ((signatureDeclaration) iter).getSigName();
					Node theoryNode = nodeMap.get(sigName);
					if (theoryNode != null) {
						Node baseNodeURI = theoryNode.getAttributes().getNamedItem("base");
						String baseURI=defaultNamespace;
						if (baseNodeURI != null) {
							baseURI=baseNodeURI.getNodeValue();
						}
						sigDecl.setFullURI(baseURI);
					}
				}
			}
		} catch (XPathExpressionException e) {
			e.printStackTrace();
		}
	}
	
	void processOMDoc(ParseResult parserResult, String omdocFile) {
		try {
			Document doc = docBuilder.parse(omdocFile);
			matchTheories(doc, getLastParserResult().getRootASTElement());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		}
	}

	void processErrors(ParseResult result, InputStream input) {
	}

	public IParseResult performParsing(String source) {
		FileWriter writer;
		String resFile = getResultFile();
		File f = new File(resFile);
		ParseResult pr = new ParseResult(); 
		String execLine = twelfExec+" -omdoc "+f.getParent()+" "+resFile;
		try {
			writer = new FileWriter(resFile);
			writer.write(source);
			writer.close();
			Process p = Runtime.getRuntime().exec(execLine);
			p.waitFor();
			if (p.exitValue()==0) {
				processOMDoc(pr, resFile+".omdoc");
			} 
			processErrors(pr, p.getErrorStream());			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return null;
	}

}
