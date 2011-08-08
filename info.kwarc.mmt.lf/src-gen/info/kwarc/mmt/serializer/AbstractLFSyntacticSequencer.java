package info.kwarc.mmt.serializer;

import com.google.inject.Inject;
import info.kwarc.mmt.services.LFGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("restriction")
public class AbstractLFSyntacticSequencer extends AbstractSyntacticSequencer {

	protected LFGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Model_WSParserRuleCall_1_a;
	protected AbstractElementAlias match_Model_WSParserRuleCall_1_p;
	protected AbstractElementAlias match_Model_WSParserRuleCall_2_1_0_a;
	protected AbstractElementAlias match_Model_WSParserRuleCall_2_1_0_p;
	protected AbstractElementAlias match_Model_WSParserRuleCall_2_2_a;
	protected AbstractElementAlias match_abbrevTermDeclaration_WSParserRuleCall_1_p;
	protected AbstractElementAlias match_abbrevTermDeclaration___AbbrevKeyword_0_WSParserRuleCall_1_p__q;
	protected AbstractElementAlias match_aliasDeclaration_WSParserRuleCall_1_0_a_AsKeyword_1_1_WSParserRuleCall_1_2_p;
	protected AbstractElementAlias match_anyConstruct_WSParserRuleCall_0_1_1_0_p;
	protected AbstractElementAlias match_anyConstruct_WSParserRuleCall_1_a;
	protected AbstractElementAlias match_constantAssignment_WSParserRuleCall_1_a_ASSIGNTerminalRuleCall_2_WSParserRuleCall_3_p;
	protected AbstractElementAlias match_constantAssignment_WSParserRuleCall_5_a;
	protected AbstractElementAlias match_fixityDeclaration_WSParserRuleCall_1_p;
	protected AbstractElementAlias match_fixityDeclaration_WSParserRuleCall_3_p;
	protected AbstractElementAlias match_fixityDeclaration_WSParserRuleCall_5_a;
	protected AbstractElementAlias match_includeOps_WSParserRuleCall_2_0_p;
	protected AbstractElementAlias match_internalViewDeclaration_WSParserRuleCall_11_1_p;
	protected AbstractElementAlias match_internalViewDeclaration_WSParserRuleCall_11_1_p_EQUALSTerminalRuleCall_12_WSParserRuleCall_13_a;
	protected AbstractElementAlias match_internalViewDeclaration_WSParserRuleCall_11_1_p_EQUALSTerminalRuleCall_12_WSParserRuleCall_13_p;
	protected AbstractElementAlias match_internalViewDeclaration_WSParserRuleCall_15_a;
	protected AbstractElementAlias match_internalViewDeclaration_WSParserRuleCall_1_p___ImplicitKeyword_2_0_WSParserRuleCall_2_1_p__q;
	protected AbstractElementAlias match_internalViewDeclaration_WSParserRuleCall_4_a_COLONTerminalRuleCall_5_WSParserRuleCall_6_a;
	protected AbstractElementAlias match_internalViewDeclaration_WSParserRuleCall_8_p_ARROWTerminalRuleCall_9_WSParserRuleCall_10_p;
	protected AbstractElementAlias match_internalViewDeclaration_WSParserRuleCall_8_p_ARROWTerminalRuleCall_9_WSParserRuleCall_10_p_EQUALSTerminalRuleCall_12_WSParserRuleCall_13_a;
	protected AbstractElementAlias match_internalViewDeclaration_WSParserRuleCall_8_p_ARROWTerminalRuleCall_9_WSParserRuleCall_10_p_EQUALSTerminalRuleCall_12_WSParserRuleCall_13_p;
	protected AbstractElementAlias match_linkBody_WSParserRuleCall_2_a;
	protected AbstractElementAlias match_linkBody_WSParserRuleCall_3_1_0_a;
	protected AbstractElementAlias match_linkBody_WSParserRuleCall_3_1_0_p;
	protected AbstractElementAlias match_linkBody_WSParserRuleCall_3_2_a;
	protected AbstractElementAlias match_morphism_WSParserRuleCall_1_0_p;
	protected AbstractElementAlias match_morphism___WSParserRuleCall_1_0_p_LinkRefsLinkDeclarationIDParserRuleCall_1_1_0_1__a;
	protected AbstractElementAlias match_nameDeclaration_WSParserRuleCall_1_p;
	protected AbstractElementAlias match_nameDeclaration_WSParserRuleCall_3_p;
	protected AbstractElementAlias match_nameDeclaration_WSParserRuleCall_5_a;
	protected AbstractElementAlias match_namespaceDeclaration_WSParserRuleCall_1_p;
	protected AbstractElementAlias match_namespaceDeclaration_WSParserRuleCall_2_1_p_EQUALSTerminalRuleCall_2_2_WSParserRuleCall_2_3_a;
	protected AbstractElementAlias match_namespaceDeclaration_WSParserRuleCall_4_a;
	protected AbstractElementAlias match_readDeclaration_WSParserRuleCall_1_a;
	protected AbstractElementAlias match_readDeclaration_WSParserRuleCall_3_a;
	protected AbstractElementAlias match_sigBody_WSParserRuleCall_2_a;
	protected AbstractElementAlias match_sigBody_WSParserRuleCall_2_p;
	protected AbstractElementAlias match_sigBody_WSParserRuleCall_3_1_0_a;
	protected AbstractElementAlias match_sigBody_WSParserRuleCall_3_1_0_p;
	protected AbstractElementAlias match_sigBody_WSParserRuleCall_3_2_a;
	protected AbstractElementAlias match_sigDeclaration_WSParserRuleCall_1_p;
	protected AbstractElementAlias match_sigDeclaration_WSParserRuleCall_3_p;
	protected AbstractElementAlias match_sigDeclaration_WSParserRuleCall_3_p_EQUALSTerminalRuleCall_4_WSParserRuleCall_5_p;
	protected AbstractElementAlias match_sigDeclaration_WSParserRuleCall_7_a;
	protected AbstractElementAlias match_sigIncludeDeclaration_WSParserRuleCall_1_p;
	protected AbstractElementAlias match_sigIncludeDeclaration_WSParserRuleCall_3_0_p;
	protected AbstractElementAlias match_sigIncludeDeclaration_WSParserRuleCall_4_a;
	protected AbstractElementAlias match_sigMetaDeclaration_WSParserRuleCall_1_p;
	protected AbstractElementAlias match_sigMetaDeclaration_WSParserRuleCall_3_a;
	protected AbstractElementAlias match_structAssignment_WSParserRuleCall_1_p;
	protected AbstractElementAlias match_structAssignment_WSParserRuleCall_3_a_ASSIGNTerminalRuleCall_4_WSParserRuleCall_5_p;
	protected AbstractElementAlias match_structAssignment_WSParserRuleCall_7_a;
	protected AbstractElementAlias match_structDeclaration_WSParserRuleCall_1_p___ImplicitKeyword_2_0_WSParserRuleCall_2_1_p__q;
	protected AbstractElementAlias match_structDeclaration_WSParserRuleCall_4_0_0_p_EQUALSTerminalRuleCall_4_0_1_WSParserRuleCall_4_0_2_p;
	protected AbstractElementAlias match_structDeclaration_WSParserRuleCall_4_1_0_a_COLONTerminalRuleCall_4_1_1_WSParserRuleCall_4_1_2_a;
	protected AbstractElementAlias match_structDeclaration_WSParserRuleCall_4_1_4_0_p;
	protected AbstractElementAlias match_structDeclaration_WSParserRuleCall_4_1_4_0_p_EQUALSTerminalRuleCall_4_1_4_1_WSParserRuleCall_4_1_4_2_a;
	protected AbstractElementAlias match_structDeclaration_WSParserRuleCall_4_1_4_0_p_EQUALSTerminalRuleCall_4_1_4_1_WSParserRuleCall_4_1_4_2_p;
	protected AbstractElementAlias match_structDeclaration_WSParserRuleCall_5_0_p;
	protected AbstractElementAlias match_structDeclaration_WSParserRuleCall_6_a;
	protected AbstractElementAlias match_termAppNoLambdaNoPi_WSParserRuleCall_1_1_p;
	protected AbstractElementAlias match_termAppOrLambdaOrPi_WSParserRuleCall_1_1_0_p;
	protected AbstractElementAlias match_termArr_WSParserRuleCall_1_1_p___ARROWTerminalRuleCall_1_2_0_or_LARROWTerminalRuleCall_1_2_1___WSParserRuleCall_1_3_p;
	protected AbstractElementAlias match_termBase_WSParserRuleCall_1_2_a;
	protected AbstractElementAlias match_termBase_WSParserRuleCall_1_2_p;
	protected AbstractElementAlias match_termBase_WSParserRuleCall_1_3_1_a;
	protected AbstractElementAlias match_termBase_WSParserRuleCall_1_3_2_3_a;
	protected AbstractElementAlias match_termDeclaration_WSParserRuleCall_1_0_0_a;
	protected AbstractElementAlias match_termDeclaration_WSParserRuleCall_1_0_0_a_COLONTerminalRuleCall_1_0_1_WSParserRuleCall_1_0_2_p;
	protected AbstractElementAlias match_termDeclaration_WSParserRuleCall_1_1_0_p_EQUALSTerminalRuleCall_1_1_1_WSParserRuleCall_1_1_2_p;
	protected AbstractElementAlias match_termDeclaration_WSParserRuleCall_2_a;
	protected AbstractElementAlias match_termLambdaOrPi_WSParserRuleCall_0_1_p;
	protected AbstractElementAlias match_termLambda_WSParserRuleCall_1_a;
	protected AbstractElementAlias match_termLambda_WSParserRuleCall_3_a;
	protected AbstractElementAlias match_termLambda_WSParserRuleCall_4_3_a;
	protected AbstractElementAlias match_termPi_WSParserRuleCall_1_a;
	protected AbstractElementAlias match_termPi_WSParserRuleCall_3_a;
	protected AbstractElementAlias match_termPi_WSParserRuleCall_4_3_a;
	protected AbstractElementAlias match_unknownBrackets_WSParserRuleCall_2_0_p;
	protected AbstractElementAlias match_unknownBrackets_WSParserRuleCall_3_a;
	protected AbstractElementAlias match_unknownConstruct_WSParserRuleCall_1_0_p;
	protected AbstractElementAlias match_unknownConstruct_WSParserRuleCall_2_a;
	protected AbstractElementAlias match_viewDeclaration_WSParserRuleCall_12_p_EQUALSTerminalRuleCall_13_WSParserRuleCall_14_a;
	protected AbstractElementAlias match_viewDeclaration_WSParserRuleCall_12_p_EQUALSTerminalRuleCall_13_WSParserRuleCall_14_p;
	protected AbstractElementAlias match_viewDeclaration_WSParserRuleCall_16_a;
	protected AbstractElementAlias match_viewDeclaration_WSParserRuleCall_1_p___ImplicitKeyword_2_0_WSParserRuleCall_2_1_p__q;
	protected AbstractElementAlias match_viewDeclaration_WSParserRuleCall_4_a_COLONTerminalRuleCall_5_WSParserRuleCall_6_a;
	protected AbstractElementAlias match_viewDeclaration_WSParserRuleCall_8_p_ARROWTerminalRuleCall_9_WSParserRuleCall_10_p;
	protected AbstractElementAlias match_viewIncludeDeclaration_WSParserRuleCall_1_p;
	protected AbstractElementAlias match_viewIncludeDeclaration_WSParserRuleCall_3_a;
	protected AbstractElementAlias match_viewMetaDeclaration_WSParserRuleCall_1_p;
	protected AbstractElementAlias match_viewMetaDeclaration_WSParserRuleCall_3_a;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (LFGrammarAccess) access;
		match_Model_WSParserRuleCall_1_a = new TokenAlias(true, true, grammarAccess.getModelAccess().getWSParserRuleCall_1());
		match_Model_WSParserRuleCall_1_p = new TokenAlias(false, true, grammarAccess.getModelAccess().getWSParserRuleCall_1());
		match_Model_WSParserRuleCall_2_1_0_a = new TokenAlias(true, true, grammarAccess.getModelAccess().getWSParserRuleCall_2_1_0());
		match_Model_WSParserRuleCall_2_1_0_p = new TokenAlias(false, true, grammarAccess.getModelAccess().getWSParserRuleCall_2_1_0());
		match_Model_WSParserRuleCall_2_2_a = new TokenAlias(true, true, grammarAccess.getModelAccess().getWSParserRuleCall_2_2());
		match_abbrevTermDeclaration_WSParserRuleCall_1_p = new TokenAlias(false, true, grammarAccess.getAbbrevTermDeclarationAccess().getWSParserRuleCall_1());
		match_abbrevTermDeclaration___AbbrevKeyword_0_WSParserRuleCall_1_p__q = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getAbbrevTermDeclarationAccess().getAbbrevKeyword_0()), new TokenAlias(false, true, grammarAccess.getAbbrevTermDeclarationAccess().getWSParserRuleCall_1()));
		match_aliasDeclaration_WSParserRuleCall_1_0_a_AsKeyword_1_1_WSParserRuleCall_1_2_p = new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getAliasDeclarationAccess().getWSParserRuleCall_1_0()), new TokenAlias(false, false, grammarAccess.getAliasDeclarationAccess().getAsKeyword_1_1()), new TokenAlias(false, true, grammarAccess.getAliasDeclarationAccess().getWSParserRuleCall_1_2()));
		match_anyConstruct_WSParserRuleCall_0_1_1_0_p = new TokenAlias(false, true, grammarAccess.getAnyConstructAccess().getWSParserRuleCall_0_1_1_0());
		match_anyConstruct_WSParserRuleCall_1_a = new TokenAlias(true, true, grammarAccess.getAnyConstructAccess().getWSParserRuleCall_1());
		match_constantAssignment_WSParserRuleCall_1_a_ASSIGNTerminalRuleCall_2_WSParserRuleCall_3_p = new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getConstantAssignmentAccess().getWSParserRuleCall_1()), new TokenAlias(false, false, grammarAccess.getConstantAssignmentAccess().getASSIGNTerminalRuleCall_2()), new TokenAlias(false, true, grammarAccess.getConstantAssignmentAccess().getWSParserRuleCall_3()));
		match_constantAssignment_WSParserRuleCall_5_a = new TokenAlias(true, true, grammarAccess.getConstantAssignmentAccess().getWSParserRuleCall_5());
		match_fixityDeclaration_WSParserRuleCall_1_p = new TokenAlias(false, true, grammarAccess.getFixityDeclarationAccess().getWSParserRuleCall_1());
		match_fixityDeclaration_WSParserRuleCall_3_p = new TokenAlias(false, true, grammarAccess.getFixityDeclarationAccess().getWSParserRuleCall_3());
		match_fixityDeclaration_WSParserRuleCall_5_a = new TokenAlias(true, true, grammarAccess.getFixityDeclarationAccess().getWSParserRuleCall_5());
		match_includeOps_WSParserRuleCall_2_0_p = new TokenAlias(false, true, grammarAccess.getIncludeOpsAccess().getWSParserRuleCall_2_0());
		match_internalViewDeclaration_WSParserRuleCall_11_1_p = new TokenAlias(false, true, grammarAccess.getInternalViewDeclarationAccess().getWSParserRuleCall_11_1());
		match_internalViewDeclaration_WSParserRuleCall_11_1_p_EQUALSTerminalRuleCall_12_WSParserRuleCall_13_a = new GroupAlias(false, false, new TokenAlias(false, true, grammarAccess.getInternalViewDeclarationAccess().getWSParserRuleCall_11_1()), new TokenAlias(false, false, grammarAccess.getInternalViewDeclarationAccess().getEQUALSTerminalRuleCall_12()), new TokenAlias(true, true, grammarAccess.getInternalViewDeclarationAccess().getWSParserRuleCall_13()));
		match_internalViewDeclaration_WSParserRuleCall_11_1_p_EQUALSTerminalRuleCall_12_WSParserRuleCall_13_p = new GroupAlias(false, false, new TokenAlias(false, true, grammarAccess.getInternalViewDeclarationAccess().getWSParserRuleCall_11_1()), new TokenAlias(false, false, grammarAccess.getInternalViewDeclarationAccess().getEQUALSTerminalRuleCall_12()), new TokenAlias(false, true, grammarAccess.getInternalViewDeclarationAccess().getWSParserRuleCall_13()));
		match_internalViewDeclaration_WSParserRuleCall_15_a = new TokenAlias(true, true, grammarAccess.getInternalViewDeclarationAccess().getWSParserRuleCall_15());
		match_internalViewDeclaration_WSParserRuleCall_1_p___ImplicitKeyword_2_0_WSParserRuleCall_2_1_p__q = new GroupAlias(false, false, new TokenAlias(false, true, grammarAccess.getInternalViewDeclarationAccess().getWSParserRuleCall_1()), new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getInternalViewDeclarationAccess().getImplicitKeyword_2_0()), new TokenAlias(false, true, grammarAccess.getInternalViewDeclarationAccess().getWSParserRuleCall_2_1())));
		match_internalViewDeclaration_WSParserRuleCall_4_a_COLONTerminalRuleCall_5_WSParserRuleCall_6_a = new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getInternalViewDeclarationAccess().getWSParserRuleCall_4()), new TokenAlias(false, false, grammarAccess.getInternalViewDeclarationAccess().getCOLONTerminalRuleCall_5()), new TokenAlias(true, true, grammarAccess.getInternalViewDeclarationAccess().getWSParserRuleCall_6()));
		match_internalViewDeclaration_WSParserRuleCall_8_p_ARROWTerminalRuleCall_9_WSParserRuleCall_10_p = new GroupAlias(false, false, new TokenAlias(false, true, grammarAccess.getInternalViewDeclarationAccess().getWSParserRuleCall_8()), new TokenAlias(false, false, grammarAccess.getInternalViewDeclarationAccess().getARROWTerminalRuleCall_9()), new TokenAlias(false, true, grammarAccess.getInternalViewDeclarationAccess().getWSParserRuleCall_10()));
		match_internalViewDeclaration_WSParserRuleCall_8_p_ARROWTerminalRuleCall_9_WSParserRuleCall_10_p_EQUALSTerminalRuleCall_12_WSParserRuleCall_13_a = new GroupAlias(false, false, new TokenAlias(false, true, grammarAccess.getInternalViewDeclarationAccess().getWSParserRuleCall_8()), new TokenAlias(false, false, grammarAccess.getInternalViewDeclarationAccess().getARROWTerminalRuleCall_9()), new TokenAlias(false, true, grammarAccess.getInternalViewDeclarationAccess().getWSParserRuleCall_10()), new TokenAlias(false, false, grammarAccess.getInternalViewDeclarationAccess().getEQUALSTerminalRuleCall_12()), new TokenAlias(true, true, grammarAccess.getInternalViewDeclarationAccess().getWSParserRuleCall_13()));
		match_internalViewDeclaration_WSParserRuleCall_8_p_ARROWTerminalRuleCall_9_WSParserRuleCall_10_p_EQUALSTerminalRuleCall_12_WSParserRuleCall_13_p = new GroupAlias(false, false, new TokenAlias(false, true, grammarAccess.getInternalViewDeclarationAccess().getWSParserRuleCall_8()), new TokenAlias(false, false, grammarAccess.getInternalViewDeclarationAccess().getARROWTerminalRuleCall_9()), new TokenAlias(false, true, grammarAccess.getInternalViewDeclarationAccess().getWSParserRuleCall_10()), new TokenAlias(false, false, grammarAccess.getInternalViewDeclarationAccess().getEQUALSTerminalRuleCall_12()), new TokenAlias(false, true, grammarAccess.getInternalViewDeclarationAccess().getWSParserRuleCall_13()));
		match_linkBody_WSParserRuleCall_2_a = new TokenAlias(true, true, grammarAccess.getLinkBodyAccess().getWSParserRuleCall_2());
		match_linkBody_WSParserRuleCall_3_1_0_a = new TokenAlias(true, true, grammarAccess.getLinkBodyAccess().getWSParserRuleCall_3_1_0());
		match_linkBody_WSParserRuleCall_3_1_0_p = new TokenAlias(false, true, grammarAccess.getLinkBodyAccess().getWSParserRuleCall_3_1_0());
		match_linkBody_WSParserRuleCall_3_2_a = new TokenAlias(true, true, grammarAccess.getLinkBodyAccess().getWSParserRuleCall_3_2());
		match_morphism_WSParserRuleCall_1_0_p = new TokenAlias(false, true, grammarAccess.getMorphismAccess().getWSParserRuleCall_1_0());
		match_morphism___WSParserRuleCall_1_0_p_LinkRefsLinkDeclarationIDParserRuleCall_1_1_0_1__a = new GroupAlias(true, true, new TokenAlias(false, true, grammarAccess.getMorphismAccess().getWSParserRuleCall_1_0()), new TokenAlias(false, false, grammarAccess.getMorphismAccess().getLinkRefsLinkDeclarationIDParserRuleCall_1_1_0_1()));
		match_nameDeclaration_WSParserRuleCall_1_p = new TokenAlias(false, true, grammarAccess.getNameDeclarationAccess().getWSParserRuleCall_1());
		match_nameDeclaration_WSParserRuleCall_3_p = new TokenAlias(false, true, grammarAccess.getNameDeclarationAccess().getWSParserRuleCall_3());
		match_nameDeclaration_WSParserRuleCall_5_a = new TokenAlias(true, true, grammarAccess.getNameDeclarationAccess().getWSParserRuleCall_5());
		match_namespaceDeclaration_WSParserRuleCall_1_p = new TokenAlias(false, true, grammarAccess.getNamespaceDeclarationAccess().getWSParserRuleCall_1());
		match_namespaceDeclaration_WSParserRuleCall_2_1_p_EQUALSTerminalRuleCall_2_2_WSParserRuleCall_2_3_a = new GroupAlias(false, false, new TokenAlias(false, true, grammarAccess.getNamespaceDeclarationAccess().getWSParserRuleCall_2_1()), new TokenAlias(false, false, grammarAccess.getNamespaceDeclarationAccess().getEQUALSTerminalRuleCall_2_2()), new TokenAlias(true, true, grammarAccess.getNamespaceDeclarationAccess().getWSParserRuleCall_2_3()));
		match_namespaceDeclaration_WSParserRuleCall_4_a = new TokenAlias(true, true, grammarAccess.getNamespaceDeclarationAccess().getWSParserRuleCall_4());
		match_readDeclaration_WSParserRuleCall_1_a = new TokenAlias(true, true, grammarAccess.getReadDeclarationAccess().getWSParserRuleCall_1());
		match_readDeclaration_WSParserRuleCall_3_a = new TokenAlias(true, true, grammarAccess.getReadDeclarationAccess().getWSParserRuleCall_3());
		match_sigBody_WSParserRuleCall_2_a = new TokenAlias(true, true, grammarAccess.getSigBodyAccess().getWSParserRuleCall_2());
		match_sigBody_WSParserRuleCall_2_p = new TokenAlias(false, true, grammarAccess.getSigBodyAccess().getWSParserRuleCall_2());
		match_sigBody_WSParserRuleCall_3_1_0_a = new TokenAlias(true, true, grammarAccess.getSigBodyAccess().getWSParserRuleCall_3_1_0());
		match_sigBody_WSParserRuleCall_3_1_0_p = new TokenAlias(false, true, grammarAccess.getSigBodyAccess().getWSParserRuleCall_3_1_0());
		match_sigBody_WSParserRuleCall_3_2_a = new TokenAlias(true, true, grammarAccess.getSigBodyAccess().getWSParserRuleCall_3_2());
		match_sigDeclaration_WSParserRuleCall_1_p = new TokenAlias(false, true, grammarAccess.getSigDeclarationAccess().getWSParserRuleCall_1());
		match_sigDeclaration_WSParserRuleCall_3_p = new TokenAlias(false, true, grammarAccess.getSigDeclarationAccess().getWSParserRuleCall_3());
		match_sigDeclaration_WSParserRuleCall_3_p_EQUALSTerminalRuleCall_4_WSParserRuleCall_5_p = new GroupAlias(false, false, new TokenAlias(false, true, grammarAccess.getSigDeclarationAccess().getWSParserRuleCall_3()), new TokenAlias(false, false, grammarAccess.getSigDeclarationAccess().getEQUALSTerminalRuleCall_4()), new TokenAlias(false, true, grammarAccess.getSigDeclarationAccess().getWSParserRuleCall_5()));
		match_sigDeclaration_WSParserRuleCall_7_a = new TokenAlias(true, true, grammarAccess.getSigDeclarationAccess().getWSParserRuleCall_7());
		match_sigIncludeDeclaration_WSParserRuleCall_1_p = new TokenAlias(false, true, grammarAccess.getSigIncludeDeclarationAccess().getWSParserRuleCall_1());
		match_sigIncludeDeclaration_WSParserRuleCall_3_0_p = new TokenAlias(false, true, grammarAccess.getSigIncludeDeclarationAccess().getWSParserRuleCall_3_0());
		match_sigIncludeDeclaration_WSParserRuleCall_4_a = new TokenAlias(true, true, grammarAccess.getSigIncludeDeclarationAccess().getWSParserRuleCall_4());
		match_sigMetaDeclaration_WSParserRuleCall_1_p = new TokenAlias(false, true, grammarAccess.getSigMetaDeclarationAccess().getWSParserRuleCall_1());
		match_sigMetaDeclaration_WSParserRuleCall_3_a = new TokenAlias(true, true, grammarAccess.getSigMetaDeclarationAccess().getWSParserRuleCall_3());
		match_structAssignment_WSParserRuleCall_1_p = new TokenAlias(false, true, grammarAccess.getStructAssignmentAccess().getWSParserRuleCall_1());
		match_structAssignment_WSParserRuleCall_3_a_ASSIGNTerminalRuleCall_4_WSParserRuleCall_5_p = new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getStructAssignmentAccess().getWSParserRuleCall_3()), new TokenAlias(false, false, grammarAccess.getStructAssignmentAccess().getASSIGNTerminalRuleCall_4()), new TokenAlias(false, true, grammarAccess.getStructAssignmentAccess().getWSParserRuleCall_5()));
		match_structAssignment_WSParserRuleCall_7_a = new TokenAlias(true, true, grammarAccess.getStructAssignmentAccess().getWSParserRuleCall_7());
		match_structDeclaration_WSParserRuleCall_1_p___ImplicitKeyword_2_0_WSParserRuleCall_2_1_p__q = new GroupAlias(false, false, new TokenAlias(false, true, grammarAccess.getStructDeclarationAccess().getWSParserRuleCall_1()), new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getStructDeclarationAccess().getImplicitKeyword_2_0()), new TokenAlias(false, true, grammarAccess.getStructDeclarationAccess().getWSParserRuleCall_2_1())));
		match_structDeclaration_WSParserRuleCall_4_0_0_p_EQUALSTerminalRuleCall_4_0_1_WSParserRuleCall_4_0_2_p = new GroupAlias(false, false, new TokenAlias(false, true, grammarAccess.getStructDeclarationAccess().getWSParserRuleCall_4_0_0()), new TokenAlias(false, false, grammarAccess.getStructDeclarationAccess().getEQUALSTerminalRuleCall_4_0_1()), new TokenAlias(false, true, grammarAccess.getStructDeclarationAccess().getWSParserRuleCall_4_0_2()));
		match_structDeclaration_WSParserRuleCall_4_1_0_a_COLONTerminalRuleCall_4_1_1_WSParserRuleCall_4_1_2_a = new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getStructDeclarationAccess().getWSParserRuleCall_4_1_0()), new TokenAlias(false, false, grammarAccess.getStructDeclarationAccess().getCOLONTerminalRuleCall_4_1_1()), new TokenAlias(true, true, grammarAccess.getStructDeclarationAccess().getWSParserRuleCall_4_1_2()));
		match_structDeclaration_WSParserRuleCall_4_1_4_0_p = new TokenAlias(false, true, grammarAccess.getStructDeclarationAccess().getWSParserRuleCall_4_1_4_0());
		match_structDeclaration_WSParserRuleCall_4_1_4_0_p_EQUALSTerminalRuleCall_4_1_4_1_WSParserRuleCall_4_1_4_2_a = new GroupAlias(false, false, new TokenAlias(false, true, grammarAccess.getStructDeclarationAccess().getWSParserRuleCall_4_1_4_0()), new TokenAlias(false, false, grammarAccess.getStructDeclarationAccess().getEQUALSTerminalRuleCall_4_1_4_1()), new TokenAlias(true, true, grammarAccess.getStructDeclarationAccess().getWSParserRuleCall_4_1_4_2()));
		match_structDeclaration_WSParserRuleCall_4_1_4_0_p_EQUALSTerminalRuleCall_4_1_4_1_WSParserRuleCall_4_1_4_2_p = new GroupAlias(false, false, new TokenAlias(false, true, grammarAccess.getStructDeclarationAccess().getWSParserRuleCall_4_1_4_0()), new TokenAlias(false, false, grammarAccess.getStructDeclarationAccess().getEQUALSTerminalRuleCall_4_1_4_1()), new TokenAlias(false, true, grammarAccess.getStructDeclarationAccess().getWSParserRuleCall_4_1_4_2()));
		match_structDeclaration_WSParserRuleCall_5_0_p = new TokenAlias(false, true, grammarAccess.getStructDeclarationAccess().getWSParserRuleCall_5_0());
		match_structDeclaration_WSParserRuleCall_6_a = new TokenAlias(true, true, grammarAccess.getStructDeclarationAccess().getWSParserRuleCall_6());
		match_termAppNoLambdaNoPi_WSParserRuleCall_1_1_p = new TokenAlias(false, true, grammarAccess.getTermAppNoLambdaNoPiAccess().getWSParserRuleCall_1_1());
		match_termAppOrLambdaOrPi_WSParserRuleCall_1_1_0_p = new TokenAlias(false, true, grammarAccess.getTermAppOrLambdaOrPiAccess().getWSParserRuleCall_1_1_0());
		match_termArr_WSParserRuleCall_1_1_p___ARROWTerminalRuleCall_1_2_0_or_LARROWTerminalRuleCall_1_2_1___WSParserRuleCall_1_3_p = new GroupAlias(false, false, new TokenAlias(false, true, grammarAccess.getTermArrAccess().getWSParserRuleCall_1_1()), new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getTermArrAccess().getARROWTerminalRuleCall_1_2_0()), new TokenAlias(false, false, grammarAccess.getTermArrAccess().getLARROWTerminalRuleCall_1_2_1())), new TokenAlias(false, true, grammarAccess.getTermArrAccess().getWSParserRuleCall_1_3()));
		match_termBase_WSParserRuleCall_1_2_a = new TokenAlias(true, true, grammarAccess.getTermBaseAccess().getWSParserRuleCall_1_2());
		match_termBase_WSParserRuleCall_1_2_p = new TokenAlias(false, true, grammarAccess.getTermBaseAccess().getWSParserRuleCall_1_2());
		match_termBase_WSParserRuleCall_1_3_1_a = new TokenAlias(true, true, grammarAccess.getTermBaseAccess().getWSParserRuleCall_1_3_1());
		match_termBase_WSParserRuleCall_1_3_2_3_a = new TokenAlias(true, true, grammarAccess.getTermBaseAccess().getWSParserRuleCall_1_3_2_3());
		match_termDeclaration_WSParserRuleCall_1_0_0_a = new TokenAlias(true, true, grammarAccess.getTermDeclarationAccess().getWSParserRuleCall_1_0_0());
		match_termDeclaration_WSParserRuleCall_1_0_0_a_COLONTerminalRuleCall_1_0_1_WSParserRuleCall_1_0_2_p = new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getTermDeclarationAccess().getWSParserRuleCall_1_0_0()), new TokenAlias(false, false, grammarAccess.getTermDeclarationAccess().getCOLONTerminalRuleCall_1_0_1()), new TokenAlias(false, true, grammarAccess.getTermDeclarationAccess().getWSParserRuleCall_1_0_2()));
		match_termDeclaration_WSParserRuleCall_1_1_0_p_EQUALSTerminalRuleCall_1_1_1_WSParserRuleCall_1_1_2_p = new GroupAlias(false, false, new TokenAlias(false, true, grammarAccess.getTermDeclarationAccess().getWSParserRuleCall_1_1_0()), new TokenAlias(false, false, grammarAccess.getTermDeclarationAccess().getEQUALSTerminalRuleCall_1_1_1()), new TokenAlias(false, true, grammarAccess.getTermDeclarationAccess().getWSParserRuleCall_1_1_2()));
		match_termDeclaration_WSParserRuleCall_2_a = new TokenAlias(true, true, grammarAccess.getTermDeclarationAccess().getWSParserRuleCall_2());
		match_termLambdaOrPi_WSParserRuleCall_0_1_p = new TokenAlias(false, true, grammarAccess.getTermLambdaOrPiAccess().getWSParserRuleCall_0_1());
		match_termLambda_WSParserRuleCall_1_a = new TokenAlias(true, true, grammarAccess.getTermLambdaAccess().getWSParserRuleCall_1());
		match_termLambda_WSParserRuleCall_3_a = new TokenAlias(true, true, grammarAccess.getTermLambdaAccess().getWSParserRuleCall_3());
		match_termLambda_WSParserRuleCall_4_3_a = new TokenAlias(true, true, grammarAccess.getTermLambdaAccess().getWSParserRuleCall_4_3());
		match_termPi_WSParserRuleCall_1_a = new TokenAlias(true, true, grammarAccess.getTermPiAccess().getWSParserRuleCall_1());
		match_termPi_WSParserRuleCall_3_a = new TokenAlias(true, true, grammarAccess.getTermPiAccess().getWSParserRuleCall_3());
		match_termPi_WSParserRuleCall_4_3_a = new TokenAlias(true, true, grammarAccess.getTermPiAccess().getWSParserRuleCall_4_3());
		match_unknownBrackets_WSParserRuleCall_2_0_p = new TokenAlias(false, true, grammarAccess.getUnknownBracketsAccess().getWSParserRuleCall_2_0());
		match_unknownBrackets_WSParserRuleCall_3_a = new TokenAlias(true, true, grammarAccess.getUnknownBracketsAccess().getWSParserRuleCall_3());
		match_unknownConstruct_WSParserRuleCall_1_0_p = new TokenAlias(false, true, grammarAccess.getUnknownConstructAccess().getWSParserRuleCall_1_0());
		match_unknownConstruct_WSParserRuleCall_2_a = new TokenAlias(true, true, grammarAccess.getUnknownConstructAccess().getWSParserRuleCall_2());
		match_viewDeclaration_WSParserRuleCall_12_p_EQUALSTerminalRuleCall_13_WSParserRuleCall_14_a = new GroupAlias(false, false, new TokenAlias(false, true, grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_12()), new TokenAlias(false, false, grammarAccess.getViewDeclarationAccess().getEQUALSTerminalRuleCall_13()), new TokenAlias(true, true, grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_14()));
		match_viewDeclaration_WSParserRuleCall_12_p_EQUALSTerminalRuleCall_13_WSParserRuleCall_14_p = new GroupAlias(false, false, new TokenAlias(false, true, grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_12()), new TokenAlias(false, false, grammarAccess.getViewDeclarationAccess().getEQUALSTerminalRuleCall_13()), new TokenAlias(false, true, grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_14()));
		match_viewDeclaration_WSParserRuleCall_16_a = new TokenAlias(true, true, grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_16());
		match_viewDeclaration_WSParserRuleCall_1_p___ImplicitKeyword_2_0_WSParserRuleCall_2_1_p__q = new GroupAlias(false, false, new TokenAlias(false, true, grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_1()), new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getViewDeclarationAccess().getImplicitKeyword_2_0()), new TokenAlias(false, true, grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_2_1())));
		match_viewDeclaration_WSParserRuleCall_4_a_COLONTerminalRuleCall_5_WSParserRuleCall_6_a = new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_4()), new TokenAlias(false, false, grammarAccess.getViewDeclarationAccess().getCOLONTerminalRuleCall_5()), new TokenAlias(true, true, grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_6()));
		match_viewDeclaration_WSParserRuleCall_8_p_ARROWTerminalRuleCall_9_WSParserRuleCall_10_p = new GroupAlias(false, false, new TokenAlias(false, true, grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_8()), new TokenAlias(false, false, grammarAccess.getViewDeclarationAccess().getARROWTerminalRuleCall_9()), new TokenAlias(false, true, grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_10()));
		match_viewIncludeDeclaration_WSParserRuleCall_1_p = new TokenAlias(false, true, grammarAccess.getViewIncludeDeclarationAccess().getWSParserRuleCall_1());
		match_viewIncludeDeclaration_WSParserRuleCall_3_a = new TokenAlias(true, true, grammarAccess.getViewIncludeDeclarationAccess().getWSParserRuleCall_3());
		match_viewMetaDeclaration_WSParserRuleCall_1_p = new TokenAlias(false, true, grammarAccess.getViewMetaDeclarationAccess().getWSParserRuleCall_1());
		match_viewMetaDeclaration_WSParserRuleCall_3_a = new TokenAlias(true, true, grammarAccess.getViewMetaDeclarationAccess().getWSParserRuleCall_3());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getARROWRule())
			return getARROWToken(ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getASSIGNRule())
			return getASSIGNToken(ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getCOLONRule())
			return getCOLONToken(ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getDOTRule())
			return getDOTToken(ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getEQUALSRule())
			return getEQUALSToken(ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getLARROWRule())
			return getLARROWToken(ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getLBRACKETRule())
			return getLBRACKETToken(ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getLCBRACKETRule())
			return getLCBRACKETToken(ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getLSBRACKETRule())
			return getLSBRACKETToken(ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getPERCENTRule())
			return getPERCENTToken(ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getRBRACKETRule())
			return getRBRACKETToken(ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getRCBRACKETRule())
			return getRCBRACKETToken(ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getRSBRACKETRule())
			return getRSBRACKETToken(ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getWSRule())
			return getWSToken(ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getAnyDirectiveRule())
			return getanyDirectiveToken(ruleCall, node);
		return "";
	}
	
	protected String getARROWToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "->";
	}
	protected String getASSIGNToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ":=";
	}
	protected String getCOLONToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ":";
	}
	protected String getDOTToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ".";
	}
	protected String getEQUALSToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "=";
	}
	protected String getLARROWToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "<-";
	}
	protected String getLBRACKETToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "(";
	}
	protected String getLCBRACKETToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "{";
	}
	protected String getLSBRACKETToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "[";
	}
	protected String getPERCENTToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "%";
	}
	protected String getRBRACKETToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ")";
	}
	protected String getRCBRACKETToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "}";
	}
	protected String getRSBRACKETToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "]";
	}
	protected String getWSToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return " ";
	}
	protected String getanyDirectiveToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "%";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (!transition.isSyntacticallyAmbiguous())
			return;
		if(match_Model_WSParserRuleCall_1_a.equals(transition.getAmbiguousSyntax()))
			emit_Model_WSParserRuleCall_1_a(semanticObject, transition, fromNode, toNode);
		else if(match_Model_WSParserRuleCall_1_p.equals(transition.getAmbiguousSyntax()))
			emit_Model_WSParserRuleCall_1_p(semanticObject, transition, fromNode, toNode);
		else if(match_Model_WSParserRuleCall_2_1_0_a.equals(transition.getAmbiguousSyntax()))
			emit_Model_WSParserRuleCall_2_1_0_a(semanticObject, transition, fromNode, toNode);
		else if(match_Model_WSParserRuleCall_2_1_0_p.equals(transition.getAmbiguousSyntax()))
			emit_Model_WSParserRuleCall_2_1_0_p(semanticObject, transition, fromNode, toNode);
		else if(match_Model_WSParserRuleCall_2_2_a.equals(transition.getAmbiguousSyntax()))
			emit_Model_WSParserRuleCall_2_2_a(semanticObject, transition, fromNode, toNode);
		else if(match_abbrevTermDeclaration_WSParserRuleCall_1_p.equals(transition.getAmbiguousSyntax()))
			emit_abbrevTermDeclaration_WSParserRuleCall_1_p(semanticObject, transition, fromNode, toNode);
		else if(match_abbrevTermDeclaration___AbbrevKeyword_0_WSParserRuleCall_1_p__q.equals(transition.getAmbiguousSyntax()))
			emit_abbrevTermDeclaration___AbbrevKeyword_0_WSParserRuleCall_1_p__q(semanticObject, transition, fromNode, toNode);
		else if(match_aliasDeclaration_WSParserRuleCall_1_0_a_AsKeyword_1_1_WSParserRuleCall_1_2_p.equals(transition.getAmbiguousSyntax()))
			emit_aliasDeclaration_WSParserRuleCall_1_0_a_AsKeyword_1_1_WSParserRuleCall_1_2_p(semanticObject, transition, fromNode, toNode);
		else if(match_anyConstruct_WSParserRuleCall_0_1_1_0_p.equals(transition.getAmbiguousSyntax()))
			emit_anyConstruct_WSParserRuleCall_0_1_1_0_p(semanticObject, transition, fromNode, toNode);
		else if(match_anyConstruct_WSParserRuleCall_1_a.equals(transition.getAmbiguousSyntax()))
			emit_anyConstruct_WSParserRuleCall_1_a(semanticObject, transition, fromNode, toNode);
		else if(match_constantAssignment_WSParserRuleCall_1_a_ASSIGNTerminalRuleCall_2_WSParserRuleCall_3_p.equals(transition.getAmbiguousSyntax()))
			emit_constantAssignment_WSParserRuleCall_1_a_ASSIGNTerminalRuleCall_2_WSParserRuleCall_3_p(semanticObject, transition, fromNode, toNode);
		else if(match_constantAssignment_WSParserRuleCall_5_a.equals(transition.getAmbiguousSyntax()))
			emit_constantAssignment_WSParserRuleCall_5_a(semanticObject, transition, fromNode, toNode);
		else if(match_fixityDeclaration_WSParserRuleCall_1_p.equals(transition.getAmbiguousSyntax()))
			emit_fixityDeclaration_WSParserRuleCall_1_p(semanticObject, transition, fromNode, toNode);
		else if(match_fixityDeclaration_WSParserRuleCall_3_p.equals(transition.getAmbiguousSyntax()))
			emit_fixityDeclaration_WSParserRuleCall_3_p(semanticObject, transition, fromNode, toNode);
		else if(match_fixityDeclaration_WSParserRuleCall_5_a.equals(transition.getAmbiguousSyntax()))
			emit_fixityDeclaration_WSParserRuleCall_5_a(semanticObject, transition, fromNode, toNode);
		else if(match_includeOps_WSParserRuleCall_2_0_p.equals(transition.getAmbiguousSyntax()))
			emit_includeOps_WSParserRuleCall_2_0_p(semanticObject, transition, fromNode, toNode);
		else if(match_internalViewDeclaration_WSParserRuleCall_11_1_p.equals(transition.getAmbiguousSyntax()))
			emit_internalViewDeclaration_WSParserRuleCall_11_1_p(semanticObject, transition, fromNode, toNode);
		else if(match_internalViewDeclaration_WSParserRuleCall_11_1_p_EQUALSTerminalRuleCall_12_WSParserRuleCall_13_a.equals(transition.getAmbiguousSyntax()))
			emit_internalViewDeclaration_WSParserRuleCall_11_1_p_EQUALSTerminalRuleCall_12_WSParserRuleCall_13_a(semanticObject, transition, fromNode, toNode);
		else if(match_internalViewDeclaration_WSParserRuleCall_11_1_p_EQUALSTerminalRuleCall_12_WSParserRuleCall_13_p.equals(transition.getAmbiguousSyntax()))
			emit_internalViewDeclaration_WSParserRuleCall_11_1_p_EQUALSTerminalRuleCall_12_WSParserRuleCall_13_p(semanticObject, transition, fromNode, toNode);
		else if(match_internalViewDeclaration_WSParserRuleCall_15_a.equals(transition.getAmbiguousSyntax()))
			emit_internalViewDeclaration_WSParserRuleCall_15_a(semanticObject, transition, fromNode, toNode);
		else if(match_internalViewDeclaration_WSParserRuleCall_1_p___ImplicitKeyword_2_0_WSParserRuleCall_2_1_p__q.equals(transition.getAmbiguousSyntax()))
			emit_internalViewDeclaration_WSParserRuleCall_1_p___ImplicitKeyword_2_0_WSParserRuleCall_2_1_p__q(semanticObject, transition, fromNode, toNode);
		else if(match_internalViewDeclaration_WSParserRuleCall_4_a_COLONTerminalRuleCall_5_WSParserRuleCall_6_a.equals(transition.getAmbiguousSyntax()))
			emit_internalViewDeclaration_WSParserRuleCall_4_a_COLONTerminalRuleCall_5_WSParserRuleCall_6_a(semanticObject, transition, fromNode, toNode);
		else if(match_internalViewDeclaration_WSParserRuleCall_8_p_ARROWTerminalRuleCall_9_WSParserRuleCall_10_p.equals(transition.getAmbiguousSyntax()))
			emit_internalViewDeclaration_WSParserRuleCall_8_p_ARROWTerminalRuleCall_9_WSParserRuleCall_10_p(semanticObject, transition, fromNode, toNode);
		else if(match_internalViewDeclaration_WSParserRuleCall_8_p_ARROWTerminalRuleCall_9_WSParserRuleCall_10_p_EQUALSTerminalRuleCall_12_WSParserRuleCall_13_a.equals(transition.getAmbiguousSyntax()))
			emit_internalViewDeclaration_WSParserRuleCall_8_p_ARROWTerminalRuleCall_9_WSParserRuleCall_10_p_EQUALSTerminalRuleCall_12_WSParserRuleCall_13_a(semanticObject, transition, fromNode, toNode);
		else if(match_internalViewDeclaration_WSParserRuleCall_8_p_ARROWTerminalRuleCall_9_WSParserRuleCall_10_p_EQUALSTerminalRuleCall_12_WSParserRuleCall_13_p.equals(transition.getAmbiguousSyntax()))
			emit_internalViewDeclaration_WSParserRuleCall_8_p_ARROWTerminalRuleCall_9_WSParserRuleCall_10_p_EQUALSTerminalRuleCall_12_WSParserRuleCall_13_p(semanticObject, transition, fromNode, toNode);
		else if(match_linkBody_WSParserRuleCall_2_a.equals(transition.getAmbiguousSyntax()))
			emit_linkBody_WSParserRuleCall_2_a(semanticObject, transition, fromNode, toNode);
		else if(match_linkBody_WSParserRuleCall_3_1_0_a.equals(transition.getAmbiguousSyntax()))
			emit_linkBody_WSParserRuleCall_3_1_0_a(semanticObject, transition, fromNode, toNode);
		else if(match_linkBody_WSParserRuleCall_3_1_0_p.equals(transition.getAmbiguousSyntax()))
			emit_linkBody_WSParserRuleCall_3_1_0_p(semanticObject, transition, fromNode, toNode);
		else if(match_linkBody_WSParserRuleCall_3_2_a.equals(transition.getAmbiguousSyntax()))
			emit_linkBody_WSParserRuleCall_3_2_a(semanticObject, transition, fromNode, toNode);
		else if(match_morphism_WSParserRuleCall_1_0_p.equals(transition.getAmbiguousSyntax()))
			emit_morphism_WSParserRuleCall_1_0_p(semanticObject, transition, fromNode, toNode);
		else if(match_morphism___WSParserRuleCall_1_0_p_LinkRefsLinkDeclarationIDParserRuleCall_1_1_0_1__a.equals(transition.getAmbiguousSyntax()))
			emit_morphism___WSParserRuleCall_1_0_p_LinkRefsLinkDeclarationIDParserRuleCall_1_1_0_1__a(semanticObject, transition, fromNode, toNode);
		else if(match_nameDeclaration_WSParserRuleCall_1_p.equals(transition.getAmbiguousSyntax()))
			emit_nameDeclaration_WSParserRuleCall_1_p(semanticObject, transition, fromNode, toNode);
		else if(match_nameDeclaration_WSParserRuleCall_3_p.equals(transition.getAmbiguousSyntax()))
			emit_nameDeclaration_WSParserRuleCall_3_p(semanticObject, transition, fromNode, toNode);
		else if(match_nameDeclaration_WSParserRuleCall_5_a.equals(transition.getAmbiguousSyntax()))
			emit_nameDeclaration_WSParserRuleCall_5_a(semanticObject, transition, fromNode, toNode);
		else if(match_namespaceDeclaration_WSParserRuleCall_1_p.equals(transition.getAmbiguousSyntax()))
			emit_namespaceDeclaration_WSParserRuleCall_1_p(semanticObject, transition, fromNode, toNode);
		else if(match_namespaceDeclaration_WSParserRuleCall_2_1_p_EQUALSTerminalRuleCall_2_2_WSParserRuleCall_2_3_a.equals(transition.getAmbiguousSyntax()))
			emit_namespaceDeclaration_WSParserRuleCall_2_1_p_EQUALSTerminalRuleCall_2_2_WSParserRuleCall_2_3_a(semanticObject, transition, fromNode, toNode);
		else if(match_namespaceDeclaration_WSParserRuleCall_4_a.equals(transition.getAmbiguousSyntax()))
			emit_namespaceDeclaration_WSParserRuleCall_4_a(semanticObject, transition, fromNode, toNode);
		else if(match_readDeclaration_WSParserRuleCall_1_a.equals(transition.getAmbiguousSyntax()))
			emit_readDeclaration_WSParserRuleCall_1_a(semanticObject, transition, fromNode, toNode);
		else if(match_readDeclaration_WSParserRuleCall_3_a.equals(transition.getAmbiguousSyntax()))
			emit_readDeclaration_WSParserRuleCall_3_a(semanticObject, transition, fromNode, toNode);
		else if(match_sigBody_WSParserRuleCall_2_a.equals(transition.getAmbiguousSyntax()))
			emit_sigBody_WSParserRuleCall_2_a(semanticObject, transition, fromNode, toNode);
		else if(match_sigBody_WSParserRuleCall_2_p.equals(transition.getAmbiguousSyntax()))
			emit_sigBody_WSParserRuleCall_2_p(semanticObject, transition, fromNode, toNode);
		else if(match_sigBody_WSParserRuleCall_3_1_0_a.equals(transition.getAmbiguousSyntax()))
			emit_sigBody_WSParserRuleCall_3_1_0_a(semanticObject, transition, fromNode, toNode);
		else if(match_sigBody_WSParserRuleCall_3_1_0_p.equals(transition.getAmbiguousSyntax()))
			emit_sigBody_WSParserRuleCall_3_1_0_p(semanticObject, transition, fromNode, toNode);
		else if(match_sigBody_WSParserRuleCall_3_2_a.equals(transition.getAmbiguousSyntax()))
			emit_sigBody_WSParserRuleCall_3_2_a(semanticObject, transition, fromNode, toNode);
		else if(match_sigDeclaration_WSParserRuleCall_1_p.equals(transition.getAmbiguousSyntax()))
			emit_sigDeclaration_WSParserRuleCall_1_p(semanticObject, transition, fromNode, toNode);
		else if(match_sigDeclaration_WSParserRuleCall_3_p.equals(transition.getAmbiguousSyntax()))
			emit_sigDeclaration_WSParserRuleCall_3_p(semanticObject, transition, fromNode, toNode);
		else if(match_sigDeclaration_WSParserRuleCall_3_p_EQUALSTerminalRuleCall_4_WSParserRuleCall_5_p.equals(transition.getAmbiguousSyntax()))
			emit_sigDeclaration_WSParserRuleCall_3_p_EQUALSTerminalRuleCall_4_WSParserRuleCall_5_p(semanticObject, transition, fromNode, toNode);
		else if(match_sigDeclaration_WSParserRuleCall_7_a.equals(transition.getAmbiguousSyntax()))
			emit_sigDeclaration_WSParserRuleCall_7_a(semanticObject, transition, fromNode, toNode);
		else if(match_sigIncludeDeclaration_WSParserRuleCall_1_p.equals(transition.getAmbiguousSyntax()))
			emit_sigIncludeDeclaration_WSParserRuleCall_1_p(semanticObject, transition, fromNode, toNode);
		else if(match_sigIncludeDeclaration_WSParserRuleCall_3_0_p.equals(transition.getAmbiguousSyntax()))
			emit_sigIncludeDeclaration_WSParserRuleCall_3_0_p(semanticObject, transition, fromNode, toNode);
		else if(match_sigIncludeDeclaration_WSParserRuleCall_4_a.equals(transition.getAmbiguousSyntax()))
			emit_sigIncludeDeclaration_WSParserRuleCall_4_a(semanticObject, transition, fromNode, toNode);
		else if(match_sigMetaDeclaration_WSParserRuleCall_1_p.equals(transition.getAmbiguousSyntax()))
			emit_sigMetaDeclaration_WSParserRuleCall_1_p(semanticObject, transition, fromNode, toNode);
		else if(match_sigMetaDeclaration_WSParserRuleCall_3_a.equals(transition.getAmbiguousSyntax()))
			emit_sigMetaDeclaration_WSParserRuleCall_3_a(semanticObject, transition, fromNode, toNode);
		else if(match_structAssignment_WSParserRuleCall_1_p.equals(transition.getAmbiguousSyntax()))
			emit_structAssignment_WSParserRuleCall_1_p(semanticObject, transition, fromNode, toNode);
		else if(match_structAssignment_WSParserRuleCall_3_a_ASSIGNTerminalRuleCall_4_WSParserRuleCall_5_p.equals(transition.getAmbiguousSyntax()))
			emit_structAssignment_WSParserRuleCall_3_a_ASSIGNTerminalRuleCall_4_WSParserRuleCall_5_p(semanticObject, transition, fromNode, toNode);
		else if(match_structAssignment_WSParserRuleCall_7_a.equals(transition.getAmbiguousSyntax()))
			emit_structAssignment_WSParserRuleCall_7_a(semanticObject, transition, fromNode, toNode);
		else if(match_structDeclaration_WSParserRuleCall_1_p___ImplicitKeyword_2_0_WSParserRuleCall_2_1_p__q.equals(transition.getAmbiguousSyntax()))
			emit_structDeclaration_WSParserRuleCall_1_p___ImplicitKeyword_2_0_WSParserRuleCall_2_1_p__q(semanticObject, transition, fromNode, toNode);
		else if(match_structDeclaration_WSParserRuleCall_4_0_0_p_EQUALSTerminalRuleCall_4_0_1_WSParserRuleCall_4_0_2_p.equals(transition.getAmbiguousSyntax()))
			emit_structDeclaration_WSParserRuleCall_4_0_0_p_EQUALSTerminalRuleCall_4_0_1_WSParserRuleCall_4_0_2_p(semanticObject, transition, fromNode, toNode);
		else if(match_structDeclaration_WSParserRuleCall_4_1_0_a_COLONTerminalRuleCall_4_1_1_WSParserRuleCall_4_1_2_a.equals(transition.getAmbiguousSyntax()))
			emit_structDeclaration_WSParserRuleCall_4_1_0_a_COLONTerminalRuleCall_4_1_1_WSParserRuleCall_4_1_2_a(semanticObject, transition, fromNode, toNode);
		else if(match_structDeclaration_WSParserRuleCall_4_1_4_0_p.equals(transition.getAmbiguousSyntax()))
			emit_structDeclaration_WSParserRuleCall_4_1_4_0_p(semanticObject, transition, fromNode, toNode);
		else if(match_structDeclaration_WSParserRuleCall_4_1_4_0_p_EQUALSTerminalRuleCall_4_1_4_1_WSParserRuleCall_4_1_4_2_a.equals(transition.getAmbiguousSyntax()))
			emit_structDeclaration_WSParserRuleCall_4_1_4_0_p_EQUALSTerminalRuleCall_4_1_4_1_WSParserRuleCall_4_1_4_2_a(semanticObject, transition, fromNode, toNode);
		else if(match_structDeclaration_WSParserRuleCall_4_1_4_0_p_EQUALSTerminalRuleCall_4_1_4_1_WSParserRuleCall_4_1_4_2_p.equals(transition.getAmbiguousSyntax()))
			emit_structDeclaration_WSParserRuleCall_4_1_4_0_p_EQUALSTerminalRuleCall_4_1_4_1_WSParserRuleCall_4_1_4_2_p(semanticObject, transition, fromNode, toNode);
		else if(match_structDeclaration_WSParserRuleCall_5_0_p.equals(transition.getAmbiguousSyntax()))
			emit_structDeclaration_WSParserRuleCall_5_0_p(semanticObject, transition, fromNode, toNode);
		else if(match_structDeclaration_WSParserRuleCall_6_a.equals(transition.getAmbiguousSyntax()))
			emit_structDeclaration_WSParserRuleCall_6_a(semanticObject, transition, fromNode, toNode);
		else if(match_termAppNoLambdaNoPi_WSParserRuleCall_1_1_p.equals(transition.getAmbiguousSyntax()))
			emit_termAppNoLambdaNoPi_WSParserRuleCall_1_1_p(semanticObject, transition, fromNode, toNode);
		else if(match_termAppOrLambdaOrPi_WSParserRuleCall_1_1_0_p.equals(transition.getAmbiguousSyntax()))
			emit_termAppOrLambdaOrPi_WSParserRuleCall_1_1_0_p(semanticObject, transition, fromNode, toNode);
		else if(match_termArr_WSParserRuleCall_1_1_p___ARROWTerminalRuleCall_1_2_0_or_LARROWTerminalRuleCall_1_2_1___WSParserRuleCall_1_3_p.equals(transition.getAmbiguousSyntax()))
			emit_termArr_WSParserRuleCall_1_1_p___ARROWTerminalRuleCall_1_2_0_or_LARROWTerminalRuleCall_1_2_1___WSParserRuleCall_1_3_p(semanticObject, transition, fromNode, toNode);
		else if(match_termBase_WSParserRuleCall_1_2_a.equals(transition.getAmbiguousSyntax()))
			emit_termBase_WSParserRuleCall_1_2_a(semanticObject, transition, fromNode, toNode);
		else if(match_termBase_WSParserRuleCall_1_2_p.equals(transition.getAmbiguousSyntax()))
			emit_termBase_WSParserRuleCall_1_2_p(semanticObject, transition, fromNode, toNode);
		else if(match_termBase_WSParserRuleCall_1_3_1_a.equals(transition.getAmbiguousSyntax()))
			emit_termBase_WSParserRuleCall_1_3_1_a(semanticObject, transition, fromNode, toNode);
		else if(match_termBase_WSParserRuleCall_1_3_2_3_a.equals(transition.getAmbiguousSyntax()))
			emit_termBase_WSParserRuleCall_1_3_2_3_a(semanticObject, transition, fromNode, toNode);
		else if(match_termDeclaration_WSParserRuleCall_1_0_0_a.equals(transition.getAmbiguousSyntax()))
			emit_termDeclaration_WSParserRuleCall_1_0_0_a(semanticObject, transition, fromNode, toNode);
		else if(match_termDeclaration_WSParserRuleCall_1_0_0_a_COLONTerminalRuleCall_1_0_1_WSParserRuleCall_1_0_2_p.equals(transition.getAmbiguousSyntax()))
			emit_termDeclaration_WSParserRuleCall_1_0_0_a_COLONTerminalRuleCall_1_0_1_WSParserRuleCall_1_0_2_p(semanticObject, transition, fromNode, toNode);
		else if(match_termDeclaration_WSParserRuleCall_1_1_0_p_EQUALSTerminalRuleCall_1_1_1_WSParserRuleCall_1_1_2_p.equals(transition.getAmbiguousSyntax()))
			emit_termDeclaration_WSParserRuleCall_1_1_0_p_EQUALSTerminalRuleCall_1_1_1_WSParserRuleCall_1_1_2_p(semanticObject, transition, fromNode, toNode);
		else if(match_termDeclaration_WSParserRuleCall_2_a.equals(transition.getAmbiguousSyntax()))
			emit_termDeclaration_WSParserRuleCall_2_a(semanticObject, transition, fromNode, toNode);
		else if(match_termLambdaOrPi_WSParserRuleCall_0_1_p.equals(transition.getAmbiguousSyntax()))
			emit_termLambdaOrPi_WSParserRuleCall_0_1_p(semanticObject, transition, fromNode, toNode);
		else if(match_termLambda_WSParserRuleCall_1_a.equals(transition.getAmbiguousSyntax()))
			emit_termLambda_WSParserRuleCall_1_a(semanticObject, transition, fromNode, toNode);
		else if(match_termLambda_WSParserRuleCall_3_a.equals(transition.getAmbiguousSyntax()))
			emit_termLambda_WSParserRuleCall_3_a(semanticObject, transition, fromNode, toNode);
		else if(match_termLambda_WSParserRuleCall_4_3_a.equals(transition.getAmbiguousSyntax()))
			emit_termLambda_WSParserRuleCall_4_3_a(semanticObject, transition, fromNode, toNode);
		else if(match_termPi_WSParserRuleCall_1_a.equals(transition.getAmbiguousSyntax()))
			emit_termPi_WSParserRuleCall_1_a(semanticObject, transition, fromNode, toNode);
		else if(match_termPi_WSParserRuleCall_3_a.equals(transition.getAmbiguousSyntax()))
			emit_termPi_WSParserRuleCall_3_a(semanticObject, transition, fromNode, toNode);
		else if(match_termPi_WSParserRuleCall_4_3_a.equals(transition.getAmbiguousSyntax()))
			emit_termPi_WSParserRuleCall_4_3_a(semanticObject, transition, fromNode, toNode);
		else if(match_unknownBrackets_WSParserRuleCall_2_0_p.equals(transition.getAmbiguousSyntax()))
			emit_unknownBrackets_WSParserRuleCall_2_0_p(semanticObject, transition, fromNode, toNode);
		else if(match_unknownBrackets_WSParserRuleCall_3_a.equals(transition.getAmbiguousSyntax()))
			emit_unknownBrackets_WSParserRuleCall_3_a(semanticObject, transition, fromNode, toNode);
		else if(match_unknownConstruct_WSParserRuleCall_1_0_p.equals(transition.getAmbiguousSyntax()))
			emit_unknownConstruct_WSParserRuleCall_1_0_p(semanticObject, transition, fromNode, toNode);
		else if(match_unknownConstruct_WSParserRuleCall_2_a.equals(transition.getAmbiguousSyntax()))
			emit_unknownConstruct_WSParserRuleCall_2_a(semanticObject, transition, fromNode, toNode);
		else if(match_viewDeclaration_WSParserRuleCall_12_p_EQUALSTerminalRuleCall_13_WSParserRuleCall_14_a.equals(transition.getAmbiguousSyntax()))
			emit_viewDeclaration_WSParserRuleCall_12_p_EQUALSTerminalRuleCall_13_WSParserRuleCall_14_a(semanticObject, transition, fromNode, toNode);
		else if(match_viewDeclaration_WSParserRuleCall_12_p_EQUALSTerminalRuleCall_13_WSParserRuleCall_14_p.equals(transition.getAmbiguousSyntax()))
			emit_viewDeclaration_WSParserRuleCall_12_p_EQUALSTerminalRuleCall_13_WSParserRuleCall_14_p(semanticObject, transition, fromNode, toNode);
		else if(match_viewDeclaration_WSParserRuleCall_16_a.equals(transition.getAmbiguousSyntax()))
			emit_viewDeclaration_WSParserRuleCall_16_a(semanticObject, transition, fromNode, toNode);
		else if(match_viewDeclaration_WSParserRuleCall_1_p___ImplicitKeyword_2_0_WSParserRuleCall_2_1_p__q.equals(transition.getAmbiguousSyntax()))
			emit_viewDeclaration_WSParserRuleCall_1_p___ImplicitKeyword_2_0_WSParserRuleCall_2_1_p__q(semanticObject, transition, fromNode, toNode);
		else if(match_viewDeclaration_WSParserRuleCall_4_a_COLONTerminalRuleCall_5_WSParserRuleCall_6_a.equals(transition.getAmbiguousSyntax()))
			emit_viewDeclaration_WSParserRuleCall_4_a_COLONTerminalRuleCall_5_WSParserRuleCall_6_a(semanticObject, transition, fromNode, toNode);
		else if(match_viewDeclaration_WSParserRuleCall_8_p_ARROWTerminalRuleCall_9_WSParserRuleCall_10_p.equals(transition.getAmbiguousSyntax()))
			emit_viewDeclaration_WSParserRuleCall_8_p_ARROWTerminalRuleCall_9_WSParserRuleCall_10_p(semanticObject, transition, fromNode, toNode);
		else if(match_viewIncludeDeclaration_WSParserRuleCall_1_p.equals(transition.getAmbiguousSyntax()))
			emit_viewIncludeDeclaration_WSParserRuleCall_1_p(semanticObject, transition, fromNode, toNode);
		else if(match_viewIncludeDeclaration_WSParserRuleCall_3_a.equals(transition.getAmbiguousSyntax()))
			emit_viewIncludeDeclaration_WSParserRuleCall_3_a(semanticObject, transition, fromNode, toNode);
		else if(match_viewMetaDeclaration_WSParserRuleCall_1_p.equals(transition.getAmbiguousSyntax()))
			emit_viewMetaDeclaration_WSParserRuleCall_1_p(semanticObject, transition, fromNode, toNode);
		else if(match_viewMetaDeclaration_WSParserRuleCall_3_a.equals(transition.getAmbiguousSyntax()))
			emit_viewMetaDeclaration_WSParserRuleCall_3_a(semanticObject, transition, fromNode, toNode);
		else acceptNodes(transition, fromNode, toNode);
	}

	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_Model_WSParserRuleCall_1_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_Model_WSParserRuleCall_1_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_Model_WSParserRuleCall_2_1_0_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_Model_WSParserRuleCall_2_1_0_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_Model_WSParserRuleCall_2_2_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_abbrevTermDeclaration_WSParserRuleCall_1_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     ('%abbrev' WS+)?
	 */
	protected void emit_abbrevTermDeclaration___AbbrevKeyword_0_WSParserRuleCall_1_p__q(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS* '%as' WS+
	 */
	protected void emit_aliasDeclaration_WSParserRuleCall_1_0_a_AsKeyword_1_1_WSParserRuleCall_1_2_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_anyConstruct_WSParserRuleCall_0_1_1_0_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_anyConstruct_WSParserRuleCall_1_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS* ASSIGN WS+
	 */
	protected void emit_constantAssignment_WSParserRuleCall_1_a_ASSIGNTerminalRuleCall_2_WSParserRuleCall_3_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_constantAssignment_WSParserRuleCall_5_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_fixityDeclaration_WSParserRuleCall_1_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_fixityDeclaration_WSParserRuleCall_3_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_fixityDeclaration_WSParserRuleCall_5_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_includeOps_WSParserRuleCall_2_0_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_internalViewDeclaration_WSParserRuleCall_11_1_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+ EQUALS WS*
	 */
	protected void emit_internalViewDeclaration_WSParserRuleCall_11_1_p_EQUALSTerminalRuleCall_12_WSParserRuleCall_13_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+ EQUALS WS+
	 */
	protected void emit_internalViewDeclaration_WSParserRuleCall_11_1_p_EQUALSTerminalRuleCall_12_WSParserRuleCall_13_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_internalViewDeclaration_WSParserRuleCall_15_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+ ('%implicit' WS+)?
	 */
	protected void emit_internalViewDeclaration_WSParserRuleCall_1_p___ImplicitKeyword_2_0_WSParserRuleCall_2_1_p__q(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS* COLON WS*
	 */
	protected void emit_internalViewDeclaration_WSParserRuleCall_4_a_COLONTerminalRuleCall_5_WSParserRuleCall_6_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+ ARROW WS+
	 */
	protected void emit_internalViewDeclaration_WSParserRuleCall_8_p_ARROWTerminalRuleCall_9_WSParserRuleCall_10_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+ ARROW WS+ EQUALS WS*
	 */
	protected void emit_internalViewDeclaration_WSParserRuleCall_8_p_ARROWTerminalRuleCall_9_WSParserRuleCall_10_p_EQUALSTerminalRuleCall_12_WSParserRuleCall_13_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+ ARROW WS+ EQUALS WS+
	 */
	protected void emit_internalViewDeclaration_WSParserRuleCall_8_p_ARROWTerminalRuleCall_9_WSParserRuleCall_10_p_EQUALSTerminalRuleCall_12_WSParserRuleCall_13_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_linkBody_WSParserRuleCall_2_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_linkBody_WSParserRuleCall_3_1_0_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_linkBody_WSParserRuleCall_3_1_0_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_linkBody_WSParserRuleCall_3_2_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_morphism_WSParserRuleCall_1_0_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     (WS+ linkRefs+=[linkDeclaration|ID])*
	 */
	protected void emit_morphism___WSParserRuleCall_1_0_p_LinkRefsLinkDeclarationIDParserRuleCall_1_1_0_1__a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_nameDeclaration_WSParserRuleCall_1_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_nameDeclaration_WSParserRuleCall_3_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_nameDeclaration_WSParserRuleCall_5_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_namespaceDeclaration_WSParserRuleCall_1_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+ EQUALS WS*
	 */
	protected void emit_namespaceDeclaration_WSParserRuleCall_2_1_p_EQUALSTerminalRuleCall_2_2_WSParserRuleCall_2_3_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_namespaceDeclaration_WSParserRuleCall_4_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_readDeclaration_WSParserRuleCall_1_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_readDeclaration_WSParserRuleCall_3_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_sigBody_WSParserRuleCall_2_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_sigBody_WSParserRuleCall_2_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_sigBody_WSParserRuleCall_3_1_0_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_sigBody_WSParserRuleCall_3_1_0_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_sigBody_WSParserRuleCall_3_2_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_sigDeclaration_WSParserRuleCall_1_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_sigDeclaration_WSParserRuleCall_3_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+ EQUALS WS+
	 */
	protected void emit_sigDeclaration_WSParserRuleCall_3_p_EQUALSTerminalRuleCall_4_WSParserRuleCall_5_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_sigDeclaration_WSParserRuleCall_7_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_sigIncludeDeclaration_WSParserRuleCall_1_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_sigIncludeDeclaration_WSParserRuleCall_3_0_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_sigIncludeDeclaration_WSParserRuleCall_4_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_sigMetaDeclaration_WSParserRuleCall_1_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_sigMetaDeclaration_WSParserRuleCall_3_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_structAssignment_WSParserRuleCall_1_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS* ASSIGN WS+
	 */
	protected void emit_structAssignment_WSParserRuleCall_3_a_ASSIGNTerminalRuleCall_4_WSParserRuleCall_5_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_structAssignment_WSParserRuleCall_7_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+ ('%implicit' WS+)?
	 */
	protected void emit_structDeclaration_WSParserRuleCall_1_p___ImplicitKeyword_2_0_WSParserRuleCall_2_1_p__q(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+ EQUALS WS+
	 */
	protected void emit_structDeclaration_WSParserRuleCall_4_0_0_p_EQUALSTerminalRuleCall_4_0_1_WSParserRuleCall_4_0_2_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS* COLON WS*
	 */
	protected void emit_structDeclaration_WSParserRuleCall_4_1_0_a_COLONTerminalRuleCall_4_1_1_WSParserRuleCall_4_1_2_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_structDeclaration_WSParserRuleCall_4_1_4_0_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+ EQUALS WS*
	 */
	protected void emit_structDeclaration_WSParserRuleCall_4_1_4_0_p_EQUALSTerminalRuleCall_4_1_4_1_WSParserRuleCall_4_1_4_2_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+ EQUALS WS+
	 */
	protected void emit_structDeclaration_WSParserRuleCall_4_1_4_0_p_EQUALSTerminalRuleCall_4_1_4_1_WSParserRuleCall_4_1_4_2_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_structDeclaration_WSParserRuleCall_5_0_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_structDeclaration_WSParserRuleCall_6_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_termAppNoLambdaNoPi_WSParserRuleCall_1_1_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_termAppOrLambdaOrPi_WSParserRuleCall_1_1_0_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+ (LARROW | ARROW) WS+
	 */
	protected void emit_termArr_WSParserRuleCall_1_1_p___ARROWTerminalRuleCall_1_2_0_or_LARROWTerminalRuleCall_1_2_1___WSParserRuleCall_1_3_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_termBase_WSParserRuleCall_1_2_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_termBase_WSParserRuleCall_1_2_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_termBase_WSParserRuleCall_1_3_1_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_termBase_WSParserRuleCall_1_3_2_3_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_termDeclaration_WSParserRuleCall_1_0_0_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS* COLON WS+
	 */
	protected void emit_termDeclaration_WSParserRuleCall_1_0_0_a_COLONTerminalRuleCall_1_0_1_WSParserRuleCall_1_0_2_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+ EQUALS WS+
	 */
	protected void emit_termDeclaration_WSParserRuleCall_1_1_0_p_EQUALSTerminalRuleCall_1_1_1_WSParserRuleCall_1_1_2_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_termDeclaration_WSParserRuleCall_2_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_termLambdaOrPi_WSParserRuleCall_0_1_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_termLambda_WSParserRuleCall_1_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_termLambda_WSParserRuleCall_3_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_termLambda_WSParserRuleCall_4_3_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_termPi_WSParserRuleCall_1_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_termPi_WSParserRuleCall_3_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_termPi_WSParserRuleCall_4_3_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_unknownBrackets_WSParserRuleCall_2_0_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_unknownBrackets_WSParserRuleCall_3_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_unknownConstruct_WSParserRuleCall_1_0_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_unknownConstruct_WSParserRuleCall_2_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+ EQUALS WS*
	 */
	protected void emit_viewDeclaration_WSParserRuleCall_12_p_EQUALSTerminalRuleCall_13_WSParserRuleCall_14_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+ EQUALS WS+
	 */
	protected void emit_viewDeclaration_WSParserRuleCall_12_p_EQUALSTerminalRuleCall_13_WSParserRuleCall_14_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_viewDeclaration_WSParserRuleCall_16_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+ ('%implicit' WS+)?
	 */
	protected void emit_viewDeclaration_WSParserRuleCall_1_p___ImplicitKeyword_2_0_WSParserRuleCall_2_1_p__q(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS* COLON WS*
	 */
	protected void emit_viewDeclaration_WSParserRuleCall_4_a_COLONTerminalRuleCall_5_WSParserRuleCall_6_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+ ARROW WS+
	 */
	protected void emit_viewDeclaration_WSParserRuleCall_8_p_ARROWTerminalRuleCall_9_WSParserRuleCall_10_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_viewIncludeDeclaration_WSParserRuleCall_1_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_viewIncludeDeclaration_WSParserRuleCall_3_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_viewMetaDeclaration_WSParserRuleCall_1_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_viewMetaDeclaration_WSParserRuleCall_3_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
}
