package info.kwarc.mmt.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import info.kwarc.mmt.lF.LFPackage;
import info.kwarc.mmt.lF.Model;
import info.kwarc.mmt.lF.TempType;
import info.kwarc.mmt.lF.abbrevTermDeclaration;
import info.kwarc.mmt.lF.aliasDeclaration;
import info.kwarc.mmt.lF.anyConstruct;
import info.kwarc.mmt.lF.constantAssignment;
import info.kwarc.mmt.lF.fixityDeclaration;
import info.kwarc.mmt.lF.includeOps;
import info.kwarc.mmt.lF.internalViewDeclaration;
import info.kwarc.mmt.lF.linkBody;
import info.kwarc.mmt.lF.modelConstructNOSP;
import info.kwarc.mmt.lF.morphism;
import info.kwarc.mmt.lF.nameDeclaration;
import info.kwarc.mmt.lF.namespaceDeclaration;
import info.kwarc.mmt.lF.readDeclaration;
import info.kwarc.mmt.lF.sigBody;
import info.kwarc.mmt.lF.sigDeclaration;
import info.kwarc.mmt.lF.sigIncludeDeclaration;
import info.kwarc.mmt.lF.sigMetaDeclaration;
import info.kwarc.mmt.lF.structAssignment;
import info.kwarc.mmt.lF.structDeclaration;
import info.kwarc.mmt.lF.term;
import info.kwarc.mmt.lF.termDeclaration;
import info.kwarc.mmt.lF.termLambda;
import info.kwarc.mmt.lF.termPi;
import info.kwarc.mmt.lF.unknownBody;
import info.kwarc.mmt.lF.unknownBrackets;
import info.kwarc.mmt.lF.unknownConstruct;
import info.kwarc.mmt.lF.viewDeclaration;
import info.kwarc.mmt.lF.viewIncludeDeclaration;
import info.kwarc.mmt.lF.viewMetaDeclaration;
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
			case LFPackage.ABBREV_TERM_DECLARATION:
				if(context == grammarAccess.getTempTypeRule()) {
					sequence_TempType_abbrevTermDeclaration(context, (abbrevTermDeclaration) semanticObject); 
					return; 
				}
				else break;
			case LFPackage.ALIAS_DECLARATION:
				if(context == grammarAccess.getAliasDeclarationRule()) {
					sequence_aliasDeclaration_aliasDeclaration(context, (aliasDeclaration) semanticObject); 
					return; 
				}
				else break;
			case LFPackage.ANY_CONSTRUCT:
				if(context == grammarAccess.getAnyConstructRule()) {
					sequence_anyConstruct_anyConstruct(context, (anyConstruct) semanticObject); 
					return; 
				}
				else break;
			case LFPackage.CONSTANT_ASSIGNMENT:
				if(context == grammarAccess.getConstantAssignmentRule() ||
				   context == grammarAccess.getLinkConstructRule()) {
					sequence_constantAssignment_constantAssignment(context, (constantAssignment) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getTempTypeRule()) {
					sequence_TempType_constantAssignment(context, (constantAssignment) semanticObject); 
					return; 
				}
				else break;
			case LFPackage.FIXITY_DECLARATION:
				if(context == grammarAccess.getFixityDeclarationRule() ||
				   context == grammarAccess.getSigConstructNOSPRule() ||
				   context == grammarAccess.getSigConstructRule()) {
					sequence_fixityDeclaration_fixityDeclaration(context, (fixityDeclaration) semanticObject); 
					return; 
				}
				else break;
			case LFPackage.INCLUDE_OPS:
				if(context == grammarAccess.getIncludeOpsRule()) {
					sequence_includeOps_includeOps(context, (includeOps) semanticObject); 
					return; 
				}
				else break;
			case LFPackage.INTERNAL_VIEW_DECLARATION:
				if(context == grammarAccess.getTempTypeRule()) {
					sequence_TempType_internalViewDeclaration(context, (internalViewDeclaration) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getSigConstructNOSPRule() ||
				   context == grammarAccess.getSigConstructRule() ||
				   context == grammarAccess.getInternalViewDeclarationRule() ||
				   context == grammarAccess.getLinkDeclarationRule()) {
					sequence_internalViewDeclaration_internalViewDeclaration(context, (internalViewDeclaration) semanticObject); 
					return; 
				}
				else break;
			case LFPackage.LINK_BODY:
				if(context == grammarAccess.getLinkBodyRule()) {
					sequence_linkBody_linkBody(context, (linkBody) semanticObject); 
					return; 
				}
				else break;
			case LFPackage.MODEL_CONSTRUCT_NOSP:
				if(context == grammarAccess.getModelConstructNOSPRule()) {
					sequence_modelConstructNOSP_modelConstructNOSP(context, (modelConstructNOSP) semanticObject); 
					return; 
				}
				else break;
			case LFPackage.MORPHISM:
				if(context == grammarAccess.getMorphismRule()) {
					sequence_morphism_morphism(context, (morphism) semanticObject); 
					return; 
				}
				else break;
			case LFPackage.NAME_DECLARATION:
				if(context == grammarAccess.getNameDeclarationRule() ||
				   context == grammarAccess.getSigConstructNOSPRule() ||
				   context == grammarAccess.getSigConstructRule()) {
					sequence_nameDeclaration_nameDeclaration(context, (nameDeclaration) semanticObject); 
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
			case LFPackage.SIG_BODY:
				if(context == grammarAccess.getSigBodyRule()) {
					sequence_sigBody_sigBody(context, (sigBody) semanticObject); 
					return; 
				}
				else break;
			case LFPackage.SIG_DECLARATION:
				if(context == grammarAccess.getSigConstructNOSPRule() ||
				   context == grammarAccess.getSigConstructRule() ||
				   context == grammarAccess.getSigDeclarationRule()) {
					sequence_sigDeclaration_sigDeclaration(context, (sigDeclaration) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getTempTypeRule()) {
					sequence_TempType_sigDeclaration(context, (sigDeclaration) semanticObject); 
					return; 
				}
				else break;
			case LFPackage.SIG_INCLUDE_DECLARATION:
				if(context == grammarAccess.getTempTypeRule()) {
					sequence_TempType_sigIncludeDeclaration(context, (sigIncludeDeclaration) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getSigIncludeDeclarationRule() ||
				   context == grammarAccess.getSigConstructNOSPRule() ||
				   context == grammarAccess.getSigConstructRule() ||
				   context == grammarAccess.getLinkDeclarationRule()) {
					sequence_sigIncludeDeclaration_sigIncludeDeclaration(context, (sigIncludeDeclaration) semanticObject); 
					return; 
				}
				else break;
			case LFPackage.SIG_META_DECLARATION:
				if(context == grammarAccess.getSigMetaDeclarationRule() ||
				   context == grammarAccess.getSigConstructNOSPRule() ||
				   context == grammarAccess.getSigConstructRule() ||
				   context == grammarAccess.getLinkDeclarationRule()) {
					sequence_sigMetaDeclaration_sigMetaDeclaration(context, (sigMetaDeclaration) semanticObject); 
					return; 
				}
				else break;
			case LFPackage.STRUCT_ASSIGNMENT:
				if(context == grammarAccess.getStructAssignmentRule() ||
				   context == grammarAccess.getLinkConstructNOSPRule() ||
				   context == grammarAccess.getLinkConstructRule()) {
					sequence_structAssignment_structAssignment(context, (structAssignment) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getTempTypeRule()) {
					sequence_TempType_structAssignment(context, (structAssignment) semanticObject); 
					return; 
				}
				else break;
			case LFPackage.STRUCT_DECLARATION:
				if(context == grammarAccess.getTempTypeRule()) {
					sequence_TempType_structDeclaration(context, (structDeclaration) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getStructDeclarationRule() ||
				   context == grammarAccess.getSigConstructNOSPRule() ||
				   context == grammarAccess.getSigConstructRule() ||
				   context == grammarAccess.getLinkDeclarationRule()) {
					sequence_structDeclaration_structDeclaration(context, (structDeclaration) semanticObject); 
					return; 
				}
				else break;
			case LFPackage.TERM:
				if(context == grammarAccess.getTermArrAccess().getTermLeftAction_1_0() ||
				   context == grammarAccess.getTermAppOrLambdaOrPiRule() ||
				   context == grammarAccess.getTermLambdaOrPiRule()) {
					sequence_termLambdaOrPi_term(context, (term) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getTermAppThenLambdaOrPiRule()) {
					sequence_termAppThenLambdaOrPi_term(context, (term) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getTermBaseRule()) {
					sequence_termBase_term(context, (term) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getTermAppNoLambdaNoPiRule() ||
				   context == grammarAccess.getTermAppNoLambdaNoPiAccess().getTermLeftAction_1_0()) {
					sequence_termAppNoLambdaNoPi_term(context, (term) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getTermRule() ||
				   context == grammarAccess.getTermArrRule()) {
					sequence_termArr_term(context, (term) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getTermAtomicRule()) {
					sequence_termAtomic_term(context, (term) semanticObject); 
					return; 
				}
				else break;
			case LFPackage.TERM_DECLARATION:
				if(context == grammarAccess.getTempTypeRule()) {
					sequence_TempType_termDeclaration(context, (termDeclaration) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getTermDeclarationRule() ||
				   context == grammarAccess.getAbbrevTermDeclarationRule() ||
				   context == grammarAccess.getSigConstructNOSPRule() ||
				   context == grammarAccess.getSigConstructRule()) {
					sequence_termDeclaration_termDeclaration(context, (termDeclaration) semanticObject); 
					return; 
				}
				else break;
			case LFPackage.TERM_LAMBDA:
				if(context == grammarAccess.getTermLambdaRule()) {
					sequence_termLambda_termLambda(context, (termLambda) semanticObject); 
					return; 
				}
				else break;
			case LFPackage.TERM_PI:
				if(context == grammarAccess.getTermPiRule()) {
					sequence_termPi_termPi(context, (termPi) semanticObject); 
					return; 
				}
				else break;
			case LFPackage.UNKNOWN_BODY:
				if(context == grammarAccess.getUnknownBodyRule()) {
					sequence_unknownBody_unknownBody(context, (unknownBody) semanticObject); 
					return; 
				}
				else break;
			case LFPackage.UNKNOWN_BRACKETS:
				if(context == grammarAccess.getUnknownBracketsRule()) {
					sequence_unknownBrackets_unknownBrackets(context, (unknownBrackets) semanticObject); 
					return; 
				}
				else break;
			case LFPackage.UNKNOWN_CONSTRUCT:
				if(context == grammarAccess.getUnknownConstructRule() ||
				   context == grammarAccess.getSigConstructNOSPRule() ||
				   context == grammarAccess.getSigConstructRule() ||
				   context == grammarAccess.getLinkConstructNOSPRule() ||
				   context == grammarAccess.getLinkConstructRule()) {
					sequence_unknownConstruct_unknownConstruct(context, (unknownConstruct) semanticObject); 
					return; 
				}
				else break;
			case LFPackage.VIEW_DECLARATION:
				if(context == grammarAccess.getViewDeclarationRule() ||
				   context == grammarAccess.getLinkDeclarationRule()) {
					sequence_viewDeclaration_viewDeclaration(context, (viewDeclaration) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getTempTypeRule()) {
					sequence_TempType_viewDeclaration(context, (viewDeclaration) semanticObject); 
					return; 
				}
				else break;
			case LFPackage.VIEW_INCLUDE_DECLARATION:
				if(context == grammarAccess.getViewIncludeDeclarationRule() ||
				   context == grammarAccess.getLinkConstructNOSPRule() ||
				   context == grammarAccess.getLinkConstructRule()) {
					sequence_viewIncludeDeclaration_viewIncludeDeclaration(context, (viewIncludeDeclaration) semanticObject); 
					return; 
				}
				else break;
			case LFPackage.VIEW_META_DECLARATION:
				if(context == grammarAccess.getViewMetaDeclarationRule() ||
				   context == grammarAccess.getLinkConstructNOSPRule() ||
				   context == grammarAccess.getLinkConstructRule()) {
					sequence_viewMetaDeclaration_viewMetaDeclaration(context, (viewMetaDeclaration) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (
	 *         ((constructs+=modelConstructNOSP | constructs+=termDeclaration) (constructs+=modelConstructNOSP | constructs+=termDeclaration)*)? 
	 *         notInDocument+=anyTerminal*
	 *     )
	 *
	 * Features:
	 *    constructs[0, *]
	 *    notInDocument[0, *]
	 */
	protected void sequence_Model_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     fullURI=CID
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
		feeder.accept(grammarAccess.getTempTypeAccess().getFullURICIDTerminalRuleCall_10_0(), semanticObject.getFullURI());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {abbrevTermDeclaration}
	 *
	 * Features:
	 */
	protected void sequence_TempType_abbrevTermDeclaration(EObject context, abbrevTermDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {constantAssignment}
	 *
	 * Features:
	 */
	protected void sequence_TempType_constantAssignment(EObject context, constantAssignment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {internalViewDeclaration}
	 *
	 * Features:
	 */
	protected void sequence_TempType_internalViewDeclaration(EObject context, internalViewDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     {sigDeclaration}
	 *
	 * Features:
	 */
	protected void sequence_TempType_sigDeclaration(EObject context, sigDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {sigIncludeDeclaration}
	 *
	 * Features:
	 */
	protected void sequence_TempType_sigIncludeDeclaration(EObject context, sigIncludeDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {structAssignment}
	 *
	 * Features:
	 */
	protected void sequence_TempType_structAssignment(EObject context, structAssignment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {structDeclaration}
	 *
	 * Features:
	 */
	protected void sequence_TempType_structDeclaration(EObject context, structDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {termDeclaration}
	 *
	 * Features:
	 */
	protected void sequence_TempType_termDeclaration(EObject context, termDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {viewDeclaration}
	 *
	 * Features:
	 */
	protected void sequence_TempType_viewDeclaration(EObject context, viewDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (old=ID new=CID?)
	 *
	 * Features:
	 *    old[1, 1]
	 *    new[0, 1]
	 */
	protected void sequence_aliasDeclaration_aliasDeclaration(EObject context, aliasDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (t=unknownBody | (directive=anyDirective t=unknownBody?))
	 *
	 * Features:
	 *    t[0, 2]
	 *    directive[1, 1]
	 *         MANDATORY_IF_SET t
	 *         EXCLUDE_IF_SET t
	 */
	protected void sequence_anyConstruct_anyConstruct(EObject context, anyConstruct semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID def=term)
	 *
	 * Features:
	 *    name[1, 1]
	 *    def[1, 1]
	 */
	protected void sequence_constantAssignment_constantAssignment(EObject context, constantAssignment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((fixity=INFIXNONE | fixity=INFIXLEFT | fixity=INFIXRIGHT | fixity='%prefix' | fixity='%postfix') fixityLevel=CID name=ID)
	 *
	 * Features:
	 *    fixity[0, 5]
	 *    fixityLevel[1, 1]
	 *    name[1, 1]
	 */
	protected void sequence_fixityDeclaration_fixityDeclaration(EObject context, fixityDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (aliases+=aliasDeclaration*)
	 *
	 * Features:
	 *    aliases[0, *]
	 */
	protected void sequence_includeOps_includeOps(EObject context, includeOps semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=CID from=[sigDeclaration|ID] to=morphism? (def=linkBody | def=morphism))
	 *
	 * Features:
	 *    name[1, 1]
	 *    from[1, 1]
	 *    to[0, 1]
	 *    def[0, 2]
	 */
	protected void sequence_internalViewDeclaration_internalViewDeclaration(EObject context, internalViewDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (((constructs+=linkConstructNOSP | constructs+=constantAssignment) (constructs+=linkConstructNOSP | constructs+=constantAssignment)*)?)
	 *
	 * Features:
	 *    constructs[0, *]
	 */
	protected void sequence_linkBody_linkBody(EObject context, linkBody semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         namespaceDeclarations+=namespaceDeclaration | 
	 *         readDeclarations+=readDeclaration | 
	 *         sigDeclarations+=sigDeclaration | 
	 *         viewDeclarations+=viewDeclaration | 
	 *         rawDeclarations+=abbrevTermDeclaration | 
	 *         rawDeclarations+=nameDeclaration | 
	 *         rawDeclarations+=fixityDeclaration | 
	 *         rawDeclarations+=unknownConstruct
	 *     )
	 *
	 * Features:
	 *    namespaceDeclarations[0, 1]
	 *         EXCLUDE_IF_SET readDeclarations
	 *         EXCLUDE_IF_SET sigDeclarations
	 *         EXCLUDE_IF_SET viewDeclarations
	 *         EXCLUDE_IF_SET rawDeclarations
	 *         EXCLUDE_IF_SET rawDeclarations
	 *         EXCLUDE_IF_SET rawDeclarations
	 *         EXCLUDE_IF_SET rawDeclarations
	 *    readDeclarations[0, 1]
	 *         EXCLUDE_IF_SET namespaceDeclarations
	 *         EXCLUDE_IF_SET sigDeclarations
	 *         EXCLUDE_IF_SET viewDeclarations
	 *         EXCLUDE_IF_SET rawDeclarations
	 *         EXCLUDE_IF_SET rawDeclarations
	 *         EXCLUDE_IF_SET rawDeclarations
	 *         EXCLUDE_IF_SET rawDeclarations
	 *    sigDeclarations[0, 1]
	 *         EXCLUDE_IF_SET namespaceDeclarations
	 *         EXCLUDE_IF_SET readDeclarations
	 *         EXCLUDE_IF_SET viewDeclarations
	 *         EXCLUDE_IF_SET rawDeclarations
	 *         EXCLUDE_IF_SET rawDeclarations
	 *         EXCLUDE_IF_SET rawDeclarations
	 *         EXCLUDE_IF_SET rawDeclarations
	 *    viewDeclarations[0, 1]
	 *         EXCLUDE_IF_SET namespaceDeclarations
	 *         EXCLUDE_IF_SET readDeclarations
	 *         EXCLUDE_IF_SET sigDeclarations
	 *         EXCLUDE_IF_SET rawDeclarations
	 *         EXCLUDE_IF_SET rawDeclarations
	 *         EXCLUDE_IF_SET rawDeclarations
	 *         EXCLUDE_IF_SET rawDeclarations
	 *    rawDeclarations[0, 4]
	 *         EXCLUDE_IF_SET namespaceDeclarations
	 *         EXCLUDE_IF_SET readDeclarations
	 *         EXCLUDE_IF_SET sigDeclarations
	 *         EXCLUDE_IF_SET viewDeclarations
	 */
	protected void sequence_modelConstructNOSP_modelConstructNOSP(EObject context, modelConstructNOSP semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (linkRefs+=[linkDeclaration|ID] linkRefs+=[linkDeclaration|ID]*)
	 *
	 * Features:
	 *    linkRefs[1, *]
	 */
	protected void sequence_morphism_morphism(EObject context, morphism semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID alias=CID)
	 *
	 * Features:
	 *    name[1, 1]
	 *    alias[1, 1]
	 */
	protected void sequence_nameDeclaration_nameDeclaration(EObject context, nameDeclaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LFPackage.Literals.NAME_DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LFPackage.Literals.NAME_DECLARATION__NAME));
			if(transientValues.isValueTransient(semanticObject, LFPackage.Literals.NAME_DECLARATION__ALIAS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LFPackage.Literals.NAME_DECLARATION__ALIAS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNameDeclarationAccess().getNameIDParserRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getNameDeclarationAccess().getAliasCIDTerminalRuleCall_4_0(), semanticObject.getAlias());
		feeder.finish();
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
		feeder.accept(grammarAccess.getReadDeclarationAccess().getFileURISTRINGTerminalRuleCall_2_0(), semanticObject.getFile());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (((constructs+=sigConstructNOSP | constructs+=termDeclaration) (constructs+=sigConstructNOSP | constructs+=termDeclaration)*)?)
	 *
	 * Features:
	 *    constructs[0, *]
	 */
	protected void sequence_sigBody_sigBody(EObject context, sigBody semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=CID def=sigBody)
	 *
	 * Features:
	 *    name[1, 1]
	 *    def[1, 1]
	 */
	protected void sequence_sigDeclaration_sigDeclaration(EObject context, sigDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ref=[sigDeclaration|ID] incOpt=includeOps?)
	 *
	 * Features:
	 *    ref[1, 1]
	 *    incOpt[0, 1]
	 */
	protected void sequence_sigIncludeDeclaration_sigIncludeDeclaration(EObject context, sigIncludeDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ref=[sigDeclaration|ID]
	 *
	 * Features:
	 *    ref[1, 1]
	 */
	protected void sequence_sigMetaDeclaration_sigMetaDeclaration(EObject context, sigMetaDeclaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LFPackage.Literals.SIG_META_DECLARATION__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LFPackage.Literals.SIG_META_DECLARATION__REF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSigMetaDeclarationAccess().getRefSigDeclarationIDParserRuleCall_2_0_1(), semanticObject.getRef());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID def=morphism)
	 *
	 * Features:
	 *    name[1, 1]
	 *    def[1, 1]
	 */
	protected void sequence_structAssignment_structAssignment(EObject context, structAssignment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (def=morphism | (from=[sigDeclaration|ID] (def=linkBody | def=morphism)?))? incOpt=includeOps?)
	 *
	 * Features:
	 *    name[1, 1]
	 *    def[0, 3]
	 *    from[1, 1]
	 *         MANDATORY_IF_SET def
	 *         MANDATORY_IF_SET def
	 *         EXCLUDE_IF_SET def
	 *    incOpt[0, 1]
	 */
	protected void sequence_structDeclaration_structDeclaration(EObject context, structDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((left=termAppNoLambdaNoPi_term_1_0 right=termBase) | ((term=term type=term?)?))
	 *
	 * Features:
	 *    left[1, 1]
	 *         EXCLUDE_IF_UNSET right
	 *         MANDATORY_IF_SET right
	 *         EXCLUDE_IF_SET term
	 *         EXCLUDE_IF_SET type
	 *    right[1, 1]
	 *         EXCLUDE_IF_UNSET left
	 *         MANDATORY_IF_SET left
	 *         EXCLUDE_IF_SET term
	 *         EXCLUDE_IF_SET type
	 *    term[0, 1]
	 *         MANDATORY_IF_SET type
	 *         EXCLUDE_IF_SET left
	 *         EXCLUDE_IF_SET right
	 *    type[0, 1]
	 *         EXCLUDE_IF_UNSET term
	 *         EXCLUDE_IF_SET left
	 *         EXCLUDE_IF_SET right
	 */
	protected void sequence_termAppNoLambdaNoPi_term(EObject context, term semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=termAppNoLambdaNoPi right=termLambdaOrPi?)
	 *
	 * Features:
	 *    left[1, 1]
	 *    right[0, 1]
	 */
	protected void sequence_termAppThenLambdaOrPi_term(EObject context, term semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((left=termArr_term_1_0 right=termArr) | ((quantifiers+=termPi | quantifiers+=termLambda)+ right=termAppThenLambdaOrPi))
	 *
	 * Features:
	 *    left[1, 1]
	 *         EXCLUDE_IF_UNSET right
	 *         MANDATORY_IF_SET right
	 *         EXCLUDE_IF_SET quantifiers
	 *         EXCLUDE_IF_SET quantifiers
	 *         EXCLUDE_IF_SET right
	 *    right[2, 2]
	 *    quantifiers[0, *]
	 *         EXCLUDE_IF_UNSET right
	 *         EXCLUDE_IF_SET left
	 *         EXCLUDE_IF_SET right
	 */
	protected void sequence_termArr_term(EObject context, term semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (atom=TYPE | atom=UNDERSCORE | atom=ID)
	 *
	 * Features:
	 *    atom[0, 3]
	 */
	protected void sequence_termAtomic_term(EObject context, term semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((term=term type=term?)?)
	 *
	 * Features:
	 *    term[0, 1]
	 *         MANDATORY_IF_SET type
	 *    type[0, 1]
	 *         EXCLUDE_IF_UNSET term
	 */
	protected void sequence_termBase_term(EObject context, term semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=term? def=term?)
	 *
	 * Features:
	 *    name[1, 1]
	 *    type[0, 1]
	 *    def[0, 1]
	 */
	protected void sequence_termDeclaration_termDeclaration(EObject context, termDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((quantifiers+=termPi | quantifiers+=termLambda)+ right=termAppThenLambdaOrPi)
	 *
	 * Features:
	 *    right[1, 1]
	 *    quantifiers[0, *]
	 */
	protected void sequence_termLambdaOrPi_term(EObject context, term semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((name=CID | name=UNDERSCORE) type=term?)
	 *
	 * Features:
	 *    name[0, 2]
	 *    type[0, 1]
	 */
	protected void sequence_termLambda_termLambda(EObject context, termLambda semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((name=CID | name=UNDERSCORE) type=term?)
	 *
	 * Features:
	 *    name[0, 2]
	 *    type[0, 1]
	 */
	protected void sequence_termPi_termPi(EObject context, termPi semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         t+=term 
	 *         (
	 *             t+=unknownBrackets | 
	 *             t+=term | 
	 *             t+=unknownBrackets | 
	 *             t+=unknownBrackets | 
	 *             t+=term | 
	 *             t+=unknownBrackets | 
	 *             t+=term | 
	 *             t+=unknownBrackets
	 *         )*
	 *     )
	 *
	 * Features:
	 *    t[1, *]
	 */
	protected void sequence_unknownBody_unknownBody(EObject context, unknownBody semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (t+=anyConstruct*)
	 *
	 * Features:
	 *    t[0, *]
	 */
	protected void sequence_unknownBrackets_unknownBrackets(EObject context, unknownBrackets semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (directive=UNKNOWNDIRECTIVE t=unknownBody?)
	 *
	 * Features:
	 *    directive[1, 1]
	 *    t[0, 1]
	 */
	protected void sequence_unknownConstruct_unknownConstruct(EObject context, unknownConstruct semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=CID from=[sigDeclaration|ID] to=morphism (def=linkBody | def=morphism))
	 *
	 * Features:
	 *    name[1, 1]
	 *    from[1, 1]
	 *    to[1, 1]
	 *    def[0, 2]
	 */
	protected void sequence_viewDeclaration_viewDeclaration(EObject context, viewDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     def=morphism
	 *
	 * Features:
	 *    def[1, 1]
	 */
	protected void sequence_viewIncludeDeclaration_viewIncludeDeclaration(EObject context, viewIncludeDeclaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LFPackage.Literals.VIEW_INCLUDE_DECLARATION__DEF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LFPackage.Literals.VIEW_INCLUDE_DECLARATION__DEF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getViewIncludeDeclarationAccess().getDefMorphismParserRuleCall_2_0(), semanticObject.getDef());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     def=morphism
	 *
	 * Features:
	 *    def[1, 1]
	 */
	protected void sequence_viewMetaDeclaration_viewMetaDeclaration(EObject context, viewMetaDeclaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LFPackage.Literals.VIEW_META_DECLARATION__DEF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LFPackage.Literals.VIEW_META_DECLARATION__DEF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getViewMetaDeclarationAccess().getDefMorphismParserRuleCall_2_0(), semanticObject.getDef());
		feeder.finish();
	}
}
