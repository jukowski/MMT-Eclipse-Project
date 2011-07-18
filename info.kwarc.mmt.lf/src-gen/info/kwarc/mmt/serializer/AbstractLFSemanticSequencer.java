package info.kwarc.mmt.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import info.kwarc.mmt.lF.JUSTSPACE;
import info.kwarc.mmt.lF.LFPackage;
import info.kwarc.mmt.lF.Model;
import info.kwarc.mmt.lF.TempType;
import info.kwarc.mmt.lF.namespaceDeclaration;
import info.kwarc.mmt.lF.readDeclaration;
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
	 *     (declarations+=namespaceDeclaration | declarations+=signatureDeclaration | declarations+=JUSTSPACE)*
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
		feeder.accept(grammarAccess.getReadDeclarationAccess().getFileURISTRINGParserRuleCall_2_0(), semanticObject.getFile());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         symbName=GID | 
	 *         namespace=NAMESPACE | 
	 *         structName=GID | 
	 *         (type=GID? precendece=INT) | 
	 *         tmp='%meta' | 
	 *         tmp='%abbrev'
	 *     )
	 *
	 * Features:
	 *    symbName[0, 1]
	 *         EXCLUDE_IF_SET namespace
	 *         EXCLUDE_IF_SET structName
	 *         EXCLUDE_IF_SET type
	 *         EXCLUDE_IF_SET precendece
	 *         EXCLUDE_IF_SET tmp
	 *         EXCLUDE_IF_SET tmp
	 *    namespace[0, 1]
	 *         EXCLUDE_IF_SET symbName
	 *         EXCLUDE_IF_SET structName
	 *         EXCLUDE_IF_SET type
	 *         EXCLUDE_IF_SET precendece
	 *         EXCLUDE_IF_SET tmp
	 *         EXCLUDE_IF_SET tmp
	 *    structName[0, 1]
	 *         EXCLUDE_IF_SET symbName
	 *         EXCLUDE_IF_SET namespace
	 *         EXCLUDE_IF_SET type
	 *         EXCLUDE_IF_SET precendece
	 *         EXCLUDE_IF_SET tmp
	 *         EXCLUDE_IF_SET tmp
	 *    type[0, 1]
	 *         EXCLUDE_IF_UNSET precendece
	 *         EXCLUDE_IF_SET symbName
	 *         EXCLUDE_IF_SET namespace
	 *         EXCLUDE_IF_SET structName
	 *         EXCLUDE_IF_SET tmp
	 *         EXCLUDE_IF_SET tmp
	 *    precendece[1, 1]
	 *         MANDATORY_IF_SET type
	 *         EXCLUDE_IF_SET symbName
	 *         EXCLUDE_IF_SET namespace
	 *         EXCLUDE_IF_SET structName
	 *         EXCLUDE_IF_SET tmp
	 *         EXCLUDE_IF_SET tmp
	 *    tmp[0, 2]
	 *         EXCLUDE_IF_SET symbName
	 *         EXCLUDE_IF_SET namespace
	 *         EXCLUDE_IF_SET structName
	 *         EXCLUDE_IF_SET type
	 *         EXCLUDE_IF_SET precendece
	 */
	protected void sequence_sigDefinitions_sigDefinitions(EObject context, sigDefinitions semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (sigName=CID sigDefinitions+=sigDefinitions*)
	 *
	 * Features:
	 *    sigName[1, 1]
	 *    sigDefinitions[0, *]
	 */
	protected void sequence_signatureDeclaration_signatureDeclaration(EObject context, signatureDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (viewID=GID from=NAMESPACE to=NAMESPACE viewDefinitions+=sigDefinitions*)
	 *
	 * Features:
	 *    viewID[1, 1]
	 *    from[1, 1]
	 *    to[1, 1]
	 *    viewDefinitions[0, *]
	 */
	protected void sequence_viewDeclaration_viewDeclaration(EObject context, viewDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
