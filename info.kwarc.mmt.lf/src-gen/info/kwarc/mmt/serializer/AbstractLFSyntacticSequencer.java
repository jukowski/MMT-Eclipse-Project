package info.kwarc.mmt.serializer;

import com.google.inject.Inject;
import info.kwarc.mmt.services.LFGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("restriction")
public class AbstractLFSyntacticSequencer extends AbstractSyntacticSequencer {

	protected LFGrammarAccess grammarAccess;
	protected AbstractElementAlias match_namespaceDeclaration_WSParserRuleCall_1_p;
	protected AbstractElementAlias match_namespaceDeclaration_WSParserRuleCall_2_1_a_EqualsSignKeyword_2_2_WSParserRuleCall_2_3_a;
	protected AbstractElementAlias match_namespaceDeclaration_WSParserRuleCall_4_a;
	protected AbstractElementAlias match_readDeclaration_WSParserRuleCall_1_p;
	protected AbstractElementAlias match_readDeclaration_WSParserRuleCall_3_a;
	protected AbstractElementAlias match_sigDefinitions_SOMETHINGParserRuleCall_3_1_a;
	protected AbstractElementAlias match_sigDefinitions_WSParserRuleCall_1_1_p;
	protected AbstractElementAlias match_sigDefinitions_WSParserRuleCall_2_1_p;
	protected AbstractElementAlias match_sigDefinitions_WSParserRuleCall_2_3_a_ColonKeyword_2_4_SOMETHINGParserRuleCall_2_5_a_IncludeOpsParserRuleCall_2_6_q;
	protected AbstractElementAlias match_sigDefinitions___WSParserRuleCall_1_3_0_p_IncludeOpsParserRuleCall_1_3_1__q;
	protected AbstractElementAlias match_signatureDeclaration_WSParserRuleCall_1_p;
	protected AbstractElementAlias match_signatureDeclaration_WSParserRuleCall_3_a_EqualsSignKeyword_4_WSParserRuleCall_5_a;
	protected AbstractElementAlias match_signatureDeclaration_WSParserRuleCall_3_a_EqualsSignKeyword_4_WSParserRuleCall_5_a_LeftCurlyBracketKeyword_6_RightCurlyBracketKeyword_8_WSParserRuleCall_9_a;
	protected AbstractElementAlias match_signatureDeclaration_WSParserRuleCall_9_a;
	protected AbstractElementAlias match_viewDeclaration_WSParserRuleCall_11_a_EqualsSignKeyword_12_WSParserRuleCall_13_a;
	protected AbstractElementAlias match_viewDeclaration_WSParserRuleCall_11_a_EqualsSignKeyword_12_WSParserRuleCall_13_a_LeftCurlyBracketKeyword_14_RightCurlyBracketKeyword_16_WSParserRuleCall_17_a;
	protected AbstractElementAlias match_viewDeclaration_WSParserRuleCall_17_a;
	protected AbstractElementAlias match_viewDeclaration_WSParserRuleCall_1_p;
	protected AbstractElementAlias match_viewDeclaration_WSParserRuleCall_3_a_ColonKeyword_4_WSParserRuleCall_5_a;
	protected AbstractElementAlias match_viewDeclaration_WSParserRuleCall_7_a_HyphenMinusGreaterThanSignKeyword_8_WSParserRuleCall_9_a;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (LFGrammarAccess) access;
		match_namespaceDeclaration_WSParserRuleCall_1_p = new TokenAlias(false, true, grammarAccess.getNamespaceDeclarationAccess().getWSParserRuleCall_1());
		match_namespaceDeclaration_WSParserRuleCall_2_1_a_EqualsSignKeyword_2_2_WSParserRuleCall_2_3_a = new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getNamespaceDeclarationAccess().getWSParserRuleCall_2_1()), new TokenAlias(false, false, grammarAccess.getNamespaceDeclarationAccess().getEqualsSignKeyword_2_2()), new TokenAlias(true, true, grammarAccess.getNamespaceDeclarationAccess().getWSParserRuleCall_2_3()));
		match_namespaceDeclaration_WSParserRuleCall_4_a = new TokenAlias(true, true, grammarAccess.getNamespaceDeclarationAccess().getWSParserRuleCall_4());
		match_readDeclaration_WSParserRuleCall_1_p = new TokenAlias(false, true, grammarAccess.getReadDeclarationAccess().getWSParserRuleCall_1());
		match_readDeclaration_WSParserRuleCall_3_a = new TokenAlias(true, true, grammarAccess.getReadDeclarationAccess().getWSParserRuleCall_3());
		match_sigDefinitions_SOMETHINGParserRuleCall_3_1_a = new TokenAlias(true, true, grammarAccess.getSigDefinitionsAccess().getSOMETHINGParserRuleCall_3_1());
		match_sigDefinitions_WSParserRuleCall_1_1_p = new TokenAlias(false, true, grammarAccess.getSigDefinitionsAccess().getWSParserRuleCall_1_1());
		match_sigDefinitions_WSParserRuleCall_2_1_p = new TokenAlias(false, true, grammarAccess.getSigDefinitionsAccess().getWSParserRuleCall_2_1());
		match_sigDefinitions_WSParserRuleCall_2_3_a_ColonKeyword_2_4_SOMETHINGParserRuleCall_2_5_a_IncludeOpsParserRuleCall_2_6_q = new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getSigDefinitionsAccess().getWSParserRuleCall_2_3()), new TokenAlias(false, false, grammarAccess.getSigDefinitionsAccess().getColonKeyword_2_4()), new TokenAlias(true, true, grammarAccess.getSigDefinitionsAccess().getSOMETHINGParserRuleCall_2_5()), new TokenAlias(true, false, grammarAccess.getSigDefinitionsAccess().getIncludeOpsParserRuleCall_2_6()));
		match_sigDefinitions___WSParserRuleCall_1_3_0_p_IncludeOpsParserRuleCall_1_3_1__q = new GroupAlias(true, false, new TokenAlias(false, true, grammarAccess.getSigDefinitionsAccess().getWSParserRuleCall_1_3_0()), new TokenAlias(false, false, grammarAccess.getSigDefinitionsAccess().getIncludeOpsParserRuleCall_1_3_1()));
		match_signatureDeclaration_WSParserRuleCall_1_p = new TokenAlias(false, true, grammarAccess.getSignatureDeclarationAccess().getWSParserRuleCall_1());
		match_signatureDeclaration_WSParserRuleCall_3_a_EqualsSignKeyword_4_WSParserRuleCall_5_a = new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getSignatureDeclarationAccess().getWSParserRuleCall_3()), new TokenAlias(false, false, grammarAccess.getSignatureDeclarationAccess().getEqualsSignKeyword_4()), new TokenAlias(true, true, grammarAccess.getSignatureDeclarationAccess().getWSParserRuleCall_5()));
		match_signatureDeclaration_WSParserRuleCall_3_a_EqualsSignKeyword_4_WSParserRuleCall_5_a_LeftCurlyBracketKeyword_6_RightCurlyBracketKeyword_8_WSParserRuleCall_9_a = new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getSignatureDeclarationAccess().getWSParserRuleCall_3()), new TokenAlias(false, false, grammarAccess.getSignatureDeclarationAccess().getEqualsSignKeyword_4()), new TokenAlias(true, true, grammarAccess.getSignatureDeclarationAccess().getWSParserRuleCall_5()), new TokenAlias(false, false, grammarAccess.getSignatureDeclarationAccess().getLeftCurlyBracketKeyword_6()), new TokenAlias(false, false, grammarAccess.getSignatureDeclarationAccess().getRightCurlyBracketKeyword_8()), new TokenAlias(true, true, grammarAccess.getSignatureDeclarationAccess().getWSParserRuleCall_9()));
		match_signatureDeclaration_WSParserRuleCall_9_a = new TokenAlias(true, true, grammarAccess.getSignatureDeclarationAccess().getWSParserRuleCall_9());
		match_viewDeclaration_WSParserRuleCall_11_a_EqualsSignKeyword_12_WSParserRuleCall_13_a = new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_11()), new TokenAlias(false, false, grammarAccess.getViewDeclarationAccess().getEqualsSignKeyword_12()), new TokenAlias(true, true, grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_13()));
		match_viewDeclaration_WSParserRuleCall_11_a_EqualsSignKeyword_12_WSParserRuleCall_13_a_LeftCurlyBracketKeyword_14_RightCurlyBracketKeyword_16_WSParserRuleCall_17_a = new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_11()), new TokenAlias(false, false, grammarAccess.getViewDeclarationAccess().getEqualsSignKeyword_12()), new TokenAlias(true, true, grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_13()), new TokenAlias(false, false, grammarAccess.getViewDeclarationAccess().getLeftCurlyBracketKeyword_14()), new TokenAlias(false, false, grammarAccess.getViewDeclarationAccess().getRightCurlyBracketKeyword_16()), new TokenAlias(true, true, grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_17()));
		match_viewDeclaration_WSParserRuleCall_17_a = new TokenAlias(true, true, grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_17());
		match_viewDeclaration_WSParserRuleCall_1_p = new TokenAlias(false, true, grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_1());
		match_viewDeclaration_WSParserRuleCall_3_a_ColonKeyword_4_WSParserRuleCall_5_a = new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_3()), new TokenAlias(false, false, grammarAccess.getViewDeclarationAccess().getColonKeyword_4()), new TokenAlias(true, true, grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_5()));
		match_viewDeclaration_WSParserRuleCall_7_a_HyphenMinusGreaterThanSignKeyword_8_WSParserRuleCall_9_a = new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_7()), new TokenAlias(false, false, grammarAccess.getViewDeclarationAccess().getHyphenMinusGreaterThanSignKeyword_8()), new TokenAlias(true, true, grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_9()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getSOMETHINGRule())
			return getSOMETHINGToken(ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getWSRule())
			return getWSToken(ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getIncludeOpsRule())
			return getincludeOpsToken(ruleCall, node);
		return "";
	}
	
	protected String getSOMETHINGToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	protected String getWSToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return " ";
	}
	protected String getincludeOpsToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "%open";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (!transition.isSyntacticallyAmbiguous())
			return;
		if(match_namespaceDeclaration_WSParserRuleCall_1_p.equals(transition.getAmbiguousSyntax()))
			emit_namespaceDeclaration_WSParserRuleCall_1_p(semanticObject, transition, fromNode, toNode);
		else if(match_namespaceDeclaration_WSParserRuleCall_2_1_a_EqualsSignKeyword_2_2_WSParserRuleCall_2_3_a.equals(transition.getAmbiguousSyntax()))
			emit_namespaceDeclaration_WSParserRuleCall_2_1_a_EqualsSignKeyword_2_2_WSParserRuleCall_2_3_a(semanticObject, transition, fromNode, toNode);
		else if(match_namespaceDeclaration_WSParserRuleCall_4_a.equals(transition.getAmbiguousSyntax()))
			emit_namespaceDeclaration_WSParserRuleCall_4_a(semanticObject, transition, fromNode, toNode);
		else if(match_readDeclaration_WSParserRuleCall_1_p.equals(transition.getAmbiguousSyntax()))
			emit_readDeclaration_WSParserRuleCall_1_p(semanticObject, transition, fromNode, toNode);
		else if(match_readDeclaration_WSParserRuleCall_3_a.equals(transition.getAmbiguousSyntax()))
			emit_readDeclaration_WSParserRuleCall_3_a(semanticObject, transition, fromNode, toNode);
		else if(match_sigDefinitions_SOMETHINGParserRuleCall_3_1_a.equals(transition.getAmbiguousSyntax()))
			emit_sigDefinitions_SOMETHINGParserRuleCall_3_1_a(semanticObject, transition, fromNode, toNode);
		else if(match_sigDefinitions_WSParserRuleCall_1_1_p.equals(transition.getAmbiguousSyntax()))
			emit_sigDefinitions_WSParserRuleCall_1_1_p(semanticObject, transition, fromNode, toNode);
		else if(match_sigDefinitions_WSParserRuleCall_2_1_p.equals(transition.getAmbiguousSyntax()))
			emit_sigDefinitions_WSParserRuleCall_2_1_p(semanticObject, transition, fromNode, toNode);
		else if(match_sigDefinitions_WSParserRuleCall_2_3_a_ColonKeyword_2_4_SOMETHINGParserRuleCall_2_5_a_IncludeOpsParserRuleCall_2_6_q.equals(transition.getAmbiguousSyntax()))
			emit_sigDefinitions_WSParserRuleCall_2_3_a_ColonKeyword_2_4_SOMETHINGParserRuleCall_2_5_a_IncludeOpsParserRuleCall_2_6_q(semanticObject, transition, fromNode, toNode);
		else if(match_sigDefinitions___WSParserRuleCall_1_3_0_p_IncludeOpsParserRuleCall_1_3_1__q.equals(transition.getAmbiguousSyntax()))
			emit_sigDefinitions___WSParserRuleCall_1_3_0_p_IncludeOpsParserRuleCall_1_3_1__q(semanticObject, transition, fromNode, toNode);
		else if(match_signatureDeclaration_WSParserRuleCall_1_p.equals(transition.getAmbiguousSyntax()))
			emit_signatureDeclaration_WSParserRuleCall_1_p(semanticObject, transition, fromNode, toNode);
		else if(match_signatureDeclaration_WSParserRuleCall_3_a_EqualsSignKeyword_4_WSParserRuleCall_5_a.equals(transition.getAmbiguousSyntax()))
			emit_signatureDeclaration_WSParserRuleCall_3_a_EqualsSignKeyword_4_WSParserRuleCall_5_a(semanticObject, transition, fromNode, toNode);
		else if(match_signatureDeclaration_WSParserRuleCall_3_a_EqualsSignKeyword_4_WSParserRuleCall_5_a_LeftCurlyBracketKeyword_6_RightCurlyBracketKeyword_8_WSParserRuleCall_9_a.equals(transition.getAmbiguousSyntax()))
			emit_signatureDeclaration_WSParserRuleCall_3_a_EqualsSignKeyword_4_WSParserRuleCall_5_a_LeftCurlyBracketKeyword_6_RightCurlyBracketKeyword_8_WSParserRuleCall_9_a(semanticObject, transition, fromNode, toNode);
		else if(match_signatureDeclaration_WSParserRuleCall_9_a.equals(transition.getAmbiguousSyntax()))
			emit_signatureDeclaration_WSParserRuleCall_9_a(semanticObject, transition, fromNode, toNode);
		else if(match_viewDeclaration_WSParserRuleCall_11_a_EqualsSignKeyword_12_WSParserRuleCall_13_a.equals(transition.getAmbiguousSyntax()))
			emit_viewDeclaration_WSParserRuleCall_11_a_EqualsSignKeyword_12_WSParserRuleCall_13_a(semanticObject, transition, fromNode, toNode);
		else if(match_viewDeclaration_WSParserRuleCall_11_a_EqualsSignKeyword_12_WSParserRuleCall_13_a_LeftCurlyBracketKeyword_14_RightCurlyBracketKeyword_16_WSParserRuleCall_17_a.equals(transition.getAmbiguousSyntax()))
			emit_viewDeclaration_WSParserRuleCall_11_a_EqualsSignKeyword_12_WSParserRuleCall_13_a_LeftCurlyBracketKeyword_14_RightCurlyBracketKeyword_16_WSParserRuleCall_17_a(semanticObject, transition, fromNode, toNode);
		else if(match_viewDeclaration_WSParserRuleCall_17_a.equals(transition.getAmbiguousSyntax()))
			emit_viewDeclaration_WSParserRuleCall_17_a(semanticObject, transition, fromNode, toNode);
		else if(match_viewDeclaration_WSParserRuleCall_1_p.equals(transition.getAmbiguousSyntax()))
			emit_viewDeclaration_WSParserRuleCall_1_p(semanticObject, transition, fromNode, toNode);
		else if(match_viewDeclaration_WSParserRuleCall_3_a_ColonKeyword_4_WSParserRuleCall_5_a.equals(transition.getAmbiguousSyntax()))
			emit_viewDeclaration_WSParserRuleCall_3_a_ColonKeyword_4_WSParserRuleCall_5_a(semanticObject, transition, fromNode, toNode);
		else if(match_viewDeclaration_WSParserRuleCall_7_a_HyphenMinusGreaterThanSignKeyword_8_WSParserRuleCall_9_a.equals(transition.getAmbiguousSyntax()))
			emit_viewDeclaration_WSParserRuleCall_7_a_HyphenMinusGreaterThanSignKeyword_8_WSParserRuleCall_9_a(semanticObject, transition, fromNode, toNode);
		else acceptNodes(transition, fromNode, toNode);
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
	 *     WS* '=' WS*
	 */
	protected void emit_namespaceDeclaration_WSParserRuleCall_2_1_a_EqualsSignKeyword_2_2_WSParserRuleCall_2_3_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
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
	 *     WS+
	 */
	protected void emit_readDeclaration_WSParserRuleCall_1_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
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
	 *     SOMETHING*
	 */
	protected void emit_sigDefinitions_SOMETHINGParserRuleCall_3_1_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_sigDefinitions_WSParserRuleCall_1_1_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_sigDefinitions_WSParserRuleCall_2_1_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS* ':' SOMETHING* includeOps?
	 */
	protected void emit_sigDefinitions_WSParserRuleCall_2_3_a_ColonKeyword_2_4_SOMETHINGParserRuleCall_2_5_a_IncludeOpsParserRuleCall_2_6_q(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     (WS+ includeOps)?
	 */
	protected void emit_sigDefinitions___WSParserRuleCall_1_3_0_p_IncludeOpsParserRuleCall_1_3_1__q(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_signatureDeclaration_WSParserRuleCall_1_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS* '=' WS*
	 */
	protected void emit_signatureDeclaration_WSParserRuleCall_3_a_EqualsSignKeyword_4_WSParserRuleCall_5_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     (
	     WS* 
	     '=' 
	     WS* 
	     '{' 
	     '}' 
	     WS*
	 )
	 */
	protected void emit_signatureDeclaration_WSParserRuleCall_3_a_EqualsSignKeyword_4_WSParserRuleCall_5_a_LeftCurlyBracketKeyword_6_RightCurlyBracketKeyword_8_WSParserRuleCall_9_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_signatureDeclaration_WSParserRuleCall_9_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS* '=' WS*
	 */
	protected void emit_viewDeclaration_WSParserRuleCall_11_a_EqualsSignKeyword_12_WSParserRuleCall_13_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     (
	     WS* 
	     '=' 
	     WS* 
	     '{' 
	     '}' 
	     WS*
	 )
	 */
	protected void emit_viewDeclaration_WSParserRuleCall_11_a_EqualsSignKeyword_12_WSParserRuleCall_13_a_LeftCurlyBracketKeyword_14_RightCurlyBracketKeyword_16_WSParserRuleCall_17_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_viewDeclaration_WSParserRuleCall_17_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_viewDeclaration_WSParserRuleCall_1_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS* ':' WS*
	 */
	protected void emit_viewDeclaration_WSParserRuleCall_3_a_ColonKeyword_4_WSParserRuleCall_5_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS* '->' WS*
	 */
	protected void emit_viewDeclaration_WSParserRuleCall_7_a_HyphenMinusGreaterThanSignKeyword_8_WSParserRuleCall_9_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
}
