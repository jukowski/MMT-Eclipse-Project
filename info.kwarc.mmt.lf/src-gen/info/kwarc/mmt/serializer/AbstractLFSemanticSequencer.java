package info.kwarc.mmt.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import info.kwarc.mmt.lF.JUSTSPACE;
import info.kwarc.mmt.lF.LFPackage;
import info.kwarc.mmt.lF.Model;
import info.kwarc.mmt.lF.TempType;
import info.kwarc.mmt.lF.namespaceDeclaration;
import info.kwarc.mmt.lF.readDeclaration;
import info.kwarc.mmt.lF.sigConstruct;
import info.kwarc.mmt.lF.sigDefinitions;
import info.kwarc.mmt.lF.signatureDeclaration;
import info.kwarc.mmt.lF.viewDeclaration;
import info.kwarc.mmt.services.LFGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("restriction")
public class AbstractLFSemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected LFGrammarAccess grammarAccess;
	
	@Inject
	protected ISemanticSequencerDiagnosticProvider diagnosticProvider;
	
	@Inject
	protected ITransientValueService transientValues;
	
	@Inject
	@GenericSequencer
	protected Provider<ISemanticSequencer> genericSequencerProvider;
	
	protected ISemanticSequencer genericSequencer;
	
	
	@Override
	public void init(ISemanticSequencer sequencer, ISemanticSequenceAcceptor sequenceAcceptor, Acceptor errorAcceptor) {
		super.init(sequencer, sequenceAcceptor, errorAcceptor);
		this.genericSequencer = genericSequencerProvider.get();
		this.genericSequencer.init(sequencer, sequenceAcceptor, errorAcceptor);
	}
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == LFPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case LFPackage.JUSTSPACE:
				if(context == grammarAccess.getJUSTSPACERule()) {
					sequence_JUSTSPACE_JUSTSPACE(context, (JUSTSPACE) semanticObject); 
					return; 
				}
				else break;
			case LFPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case LFPackage.TEMP_TYPE:
				if(context == grammarAccess.getTempTypeRule()) {
					sequence_TempType_TempType(context, (TempType) semanticObject); 
					return; 
				}
				else break;
			case LFPackage.NAMESPACE_DECLARATION:
				if(context == grammarAccess.getTempTypeRule()) {
					sequence_TempType_namespaceDeclaration(context, (namespaceDeclaration) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getNamespaceDeclarationRule()) {
					sequence_namespaceDeclaration_namespaceDeclaration(context, (namespaceDeclaration) semanticObject); 
					return; 
				}
				else break;
			case LFPackage.READ_DECLARATION:
				if(context == grammarAccess.getReadDeclarationRule()) {
					sequence_readDeclaration_readDeclaration(context, (readDeclaration) semanticObject); 
					return; 
				}
				else break;
			case LFPackage.SIG_CONSTRUCT:
				if(context == grammarAccess.getSigConstructRule()) {
					sequence_sigConstruct_sigConstruct(context, (sigConstruct) semanticObject); 
					return; 
				}
				else break;
			case LFPackage.SIG_DEFINITIONS:
				if(context == grammarAccess.getSigDefinitionsRule()) {
					sequence_sigDefinitions_sigDefinitions(context, (sigDefinitions) semanticObject); 
					return; 
				}
				else break;
			case LFPackage.SIGNATURE_DECLARATION:
				if(context == grammarAccess.getTempTypeRule()) {
					sequence_TempType_signatureDeclaration(context, (signatureDeclaration) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getSignatureDeclarationRule()) {
					sequence_signatureDeclaration_signatureDeclaration(context, (signatureDeclaration) semanticObject); 
					return; 
				}
				else break;
			case LFPackage.VIEW_DECLARATION:
				if(context == grammarAccess.getViewDeclarationRule()) {
					sequence_viewDeclaration_viewDeclaration(context, (viewDeclaration) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     J=WS
	 *
	 * Features:
	 *    J[1, 1]
	 */
	protected void sequence_JUSTSPACE_JUSTSPACE(EObject context, JUSTSPACE semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LFPackage.Literals.JUSTSPACE__J) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LFPackage.Literals.JUSTSPACE__J));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getJUSTSPACEAccess().getJWSParserRuleCall_0(), semanticObject.getJ());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         declarations+=namespaceDeclaration | 
	 *         declarations+=signatureDeclaration | 
	 *         declarations+=viewDeclaration | 
	 *         declarations+=readDeclaration | 
	 *         declarations+=JUSTSPACE
	 *     )*
	 *
	 * Features:
	 *    declarations[0, *]
	 */
	protected void sequence_Model_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     fullURI=GID
	 *
	 * Features:
	 *    fullURI[1, 1]
	 */
	protected void sequence_TempType_TempType(EObject context, TempType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LFPackage.Literals.TEMP_TYPE__FULL_URI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LFPackage.Literals.TEMP_TYPE__FULL_URI));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTempTypeAccess().getFullURIGIDParserRuleCall_2_0(), semanticObject.getFullURI());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {namespaceDeclaration}
	 *
	 * Features:
	 */
	protected void sequence_TempType_namespaceDeclaration(EObject context, namespaceDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {signatureDeclaration}
	 *
	 * Features:
	 */
	protected void sequence_TempType_signatureDeclaration(EObject context, signatureDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=CID? uri=URISTRING)
	 *
	 * Features:
	 *    name[0, 1]
	 *    uri[1, 1]
	 */
	protected void sequence_namespaceDeclaration_namespaceDeclaration(EObject context, namespaceDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     file=URISTRING
	 *
	 * Features:
	 *    file[1, 1]
	 */
	protected void sequence_readDeclaration_readDeclaration(EObject context, readDeclaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LFPackage.Literals.READ_DECLARATION__FILE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LFPackage.Literals.READ_DECLARATION__FILE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getReadDeclarationAccess().getFileURISTRINGParserRuleCall_3_0(), semanticObject.getFile());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         symbName=GID | 
	 *         namespace=NAMESPACE | 
	 *         (structName=GID incOpt=includeOps?) | 
	 *         tmp='meta' | 
	 *         tmp='abbrev' | 
	 *         tmp='name' | 
	 *         tmp='pattern' | 
	 *         tmp='infix' | 
	 *         tmp='prefix' | 
	 *         tmp='postfix'
	 *     )
	 *
	 * Features:
	 *    symbName[0, 1]
	 *         EXCLUDE_IF_SET namespace
	 *         EXCLUDE_IF_SET structName
	 *         EXCLUDE_IF_SET incOpt
	 *         EXCLUDE_IF_SET tmp
	 *         EXCLUDE_IF_SET tmp
	 *         EXCLUDE_IF_SET tmp
	 *         EXCLUDE_IF_SET tmp
	 *         EXCLUDE_IF_SET tmp
	 *         EXCLUDE_IF_SET tmp
	 *         EXCLUDE_IF_SET tmp
	 *    namespace[0, 1]
	 *         EXCLUDE_IF_SET symbName
	 *         EXCLUDE_IF_SET structName
	 *         EXCLUDE_IF_SET incOpt
	 *         EXCLUDE_IF_SET tmp
	 *         EXCLUDE_IF_SET tmp
	 *         EXCLUDE_IF_SET tmp
	 *         EXCLUDE_IF_SET tmp
	 *         EXCLUDE_IF_SET tmp
	 *         EXCLUDE_IF_SET tmp
	 *         EXCLUDE_IF_SET tmp
	 *    structName[1, 1]
	 *         MANDATORY_IF_SET incOpt
	 *         EXCLUDE_IF_SET symbName
	 *         EXCLUDE_IF_SET namespace
	 *         EXCLUDE_IF_SET tmp
	 *         EXCLUDE_IF_SET tmp
	 *         EXCLUDE_IF_SET tmp
	 *         EXCLUDE_IF_SET tmp
	 *         EXCLUDE_IF_SET tmp
	 *         EXCLUDE_IF_SET tmp
	 *         EXCLUDE_IF_SET tmp
	 *    incOpt[0, 1]
	 *         EXCLUDE_IF_UNSET structName
	 *         EXCLUDE_IF_SET symbName
	 *         EXCLUDE_IF_SET namespace
	 *         EXCLUDE_IF_SET tmp
	 *         EXCLUDE_IF_SET tmp
	 *         EXCLUDE_IF_SET tmp
	 *         EXCLUDE_IF_SET tmp
	 *         EXCLUDE_IF_SET tmp
	 *         EXCLUDE_IF_SET tmp
	 *         EXCLUDE_IF_SET tmp
	 *    tmp[0, 7]
	 *         EXCLUDE_IF_SET symbName
	 *         EXCLUDE_IF_SET namespace
	 *         EXCLUDE_IF_SET structName
	 *         EXCLUDE_IF_SET incOpt
	 */
	protected void sequence_sigConstruct_sigConstruct(EObject context, sigConstruct semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (cons=sigConstruct fcons+=sigConstruct*)
	 *
	 * Features:
	 *    cons[1, 1]
	 *    fcons[0, *]
	 */
	protected void sequence_sigDefinitions_sigDefinitions(EObject context, sigDefinitions semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (sigName=GID defs=sigDefinitions)
	 *
	 * Features:
	 *    sigName[1, 1]
	 *    defs[1, 1]
	 */
	protected void sequence_signatureDeclaration_signatureDeclaration(EObject context, signatureDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (viewID=GID from=NAMESPACE to=NAMESPACE viewDefs=sigDefinitions)
	 *
	 * Features:
	 *    viewID[1, 1]
	 *    from[1, 1]
	 *    to[1, 1]
	 *    viewDefs[1, 1]
	 */
	protected void sequence_viewDeclaration_viewDeclaration(EObject context, viewDeclaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LFPackage.Literals.VIEW_DECLARATION__VIEW_ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LFPackage.Literals.VIEW_DECLARATION__VIEW_ID));
			if(transientValues.isValueTransient(semanticObject, LFPackage.Literals.VIEW_DECLARATION__FROM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LFPackage.Literals.VIEW_DECLARATION__FROM));
			if(transientValues.isValueTransient(semanticObject, LFPackage.Literals.VIEW_DECLARATION__TO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LFPackage.Literals.VIEW_DECLARATION__TO));
			if(transientValues.isValueTransient(semanticObject, LFPackage.Literals.VIEW_DECLARATION__VIEW_DEFS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LFPackage.Literals.VIEW_DECLARATION__VIEW_DEFS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getViewDeclarationAccess().getViewIDGIDParserRuleCall_3_0(), semanticObject.getViewID());
		feeder.accept(grammarAccess.getViewDeclarationAccess().getFromNAMESPACEParserRuleCall_7_0(), semanticObject.getFrom());
		feeder.accept(grammarAccess.getViewDeclarationAccess().getToNAMESPACEParserRuleCall_11_0(), semanticObject.getTo());
		feeder.accept(grammarAccess.getViewDeclarationAccess().getViewDefsSigDefinitionsParserRuleCall_15_0(), semanticObject.getViewDefs());
		feeder.finish();
	}
}
