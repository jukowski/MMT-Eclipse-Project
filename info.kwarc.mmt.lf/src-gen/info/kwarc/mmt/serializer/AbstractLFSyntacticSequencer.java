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
	protected AbstractElementAlias match_namespaceDeclaration_WSParserRuleCall_2_p;
	protected AbstractElementAlias match_namespaceDeclaration_WSParserRuleCall_3_1_a_EqualsSignKeyword_3_2_WSParserRuleCall_3_3_a;
	protected AbstractElementAlias match_namespaceDeclaration_WSParserRuleCall_5_a;
	protected AbstractElementAlias match_readDeclaration_WSParserRuleCall_2_p;
	protected AbstractElementAlias match_readDeclaration_WSParserRuleCall_4_a;
	protected AbstractElementAlias match_sigConstruct_SOMETHINGParserRuleCall_3_2_p;
	protected AbstractElementAlias match_sigConstruct_WSParserRuleCall_1_2_p;
	protected AbstractElementAlias match_sigConstruct_WSParserRuleCall_2_2_p;
	protected AbstractElementAlias match_sigDefinitions_WSParserRuleCall_1_p;
	protected AbstractElementAlias match_sigDefinitions_WSParserRuleCall_3_1_p;
	protected AbstractElementAlias match_sigDefinitions___FullStopKeyword_4_0_WSParserRuleCall_4_1_a__q;
	protected AbstractElementAlias match_signatureDeclaration_WSParserRuleCall_2_p;
	protected AbstractElementAlias match_signatureDeclaration_WSParserRuleCall_4_a_EqualsSignKeyword_5_WSParserRuleCall_6_p;
	protected AbstractElementAlias match_signatureDeclaration_WSParserRuleCall_8_a;
	protected AbstractElementAlias match_viewDeclaration_WSParserRuleCall_12_a;
	protected AbstractElementAlias match_viewDeclaration_WSParserRuleCall_16_a;
	protected AbstractElementAlias match_viewDeclaration_WSParserRuleCall_2_p;
	protected AbstractElementAlias match_viewDeclaration_WSParserRuleCall_4_a_ColonKeyword_5_WSParserRuleCall_6_a;
	protected AbstractElementAlias match_viewDeclaration_WSParserRuleCall_8_a_HyphenMinusGreaterThanSignKeyword_9_WSParserRuleCall_10_a;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (LFGrammarAccess) access;
		match_namespaceDeclaration_WSParserRuleCall_2_p = new TokenAlias(false, true, grammarAccess.getNamespaceDeclarationAccess().getWSParserRuleCall_2());
		match_namespaceDeclaration_WSParserRuleCall_3_1_a_EqualsSignKeyword_3_2_WSParserRuleCall_3_3_a = new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getNamespaceDeclarationAccess().getWSParserRuleCall_3_1()), new TokenAlias(false, false, grammarAccess.getNamespaceDeclarationAccess().getEqualsSignKeyword_3_2()), new TokenAlias(true, true, grammarAccess.getNamespaceDeclarationAccess().getWSParserRuleCall_3_3()));
		match_namespaceDeclaration_WSParserRuleCall_5_a = new TokenAlias(true, true, grammarAccess.getNamespaceDeclarationAccess().getWSParserRuleCall_5());
		match_readDeclaration_WSParserRuleCall_2_p = new TokenAlias(false, true, grammarAccess.getReadDeclarationAccess().getWSParserRuleCall_2());
		match_readDeclaration_WSParserRuleCall_4_a = new TokenAlias(true, true, grammarAccess.getReadDeclarationAccess().getWSParserRuleCall_4());
		match_sigConstruct_SOMETHINGParserRuleCall_3_2_p = new TokenAlias(false, true, grammarAccess.getSigConstructAccess().getSOMETHINGParserRuleCall_3_2());
		match_sigConstruct_WSParserRuleCall_1_2_p = new TokenAlias(false, true, grammarAccess.getSigConstructAccess().getWSParserRuleCall_1_2());
		match_sigConstruct_WSParserRuleCall_2_2_p = new TokenAlias(false, true, grammarAccess.getSigConstructAccess().getWSParserRuleCall_2_2());
		match_sigDefinitions_WSParserRuleCall_1_p = new TokenAlias(false, true, grammarAccess.getSigDefinitionsAccess().getWSParserRuleCall_1());
		match_sigDefinitions_WSParserRuleCall_3_1_p = new TokenAlias(false, true, grammarAccess.getSigDefinitionsAccess().getWSParserRuleCall_3_1());
		match_sigDefinitions___FullStopKeyword_4_0_WSParserRuleCall_4_1_a__q = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getSigDefinitionsAccess().getFullStopKeyword_4_0()), new TokenAlias(true, true, grammarAccess.getSigDefinitionsAccess().getWSParserRuleCall_4_1()));
		match_signatureDeclaration_WSParserRuleCall_2_p = new TokenAlias(false, true, grammarAccess.getSignatureDeclarationAccess().getWSParserRuleCall_2());
		match_signatureDeclaration_WSParserRuleCall_4_a_EqualsSignKeyword_5_WSParserRuleCall_6_p = new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getSignatureDeclarationAccess().getWSParserRuleCall_4()), new TokenAlias(false, false, grammarAccess.getSignatureDeclarationAccess().getEqualsSignKeyword_5()), new TokenAlias(false, true, grammarAccess.getSignatureDeclarationAccess().getWSParserRuleCall_6()));
		match_signatureDeclaration_WSParserRuleCall_8_a = new TokenAlias(true, true, grammarAccess.getSignatureDeclarationAccess().getWSParserRuleCall_8());
		match_viewDeclaration_WSParserRuleCall_12_a = new TokenAlias(true, true, grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_12());
		match_viewDeclaration_WSParserRuleCall_16_a = new TokenAlias(true, true, grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_16());
		match_viewDeclaration_WSParserRuleCall_2_p = new TokenAlias(false, true, grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_2());
		match_viewDeclaration_WSParserRuleCall_4_a_ColonKeyword_5_WSParserRuleCall_6_a = new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_4()), new TokenAlias(false, false, grammarAccess.getViewDeclarationAccess().getColonKeyword_5()), new TokenAlias(true, true, grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_6()));
		match_viewDeclaration_WSParserRuleCall_8_a_HyphenMinusGreaterThanSignKeyword_9_WSParserRuleCall_10_a = new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_8()), new TokenAlias(false, false, grammarAccess.getViewDeclarationAccess().getHyphenMinusGreaterThanSignKeyword_9()), new TokenAlias(true, true, grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_10()));
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
		if(match_namespaceDeclaration_WSParserRuleCall_2_p.equals(transition.getAmbiguousSyntax()))
			emit_namespaceDeclaration_WSParserRuleCall_2_p(semanticObject, transition, fromNode, toNode);
		else if(match_namespaceDeclaration_WSParserRuleCall_3_1_a_EqualsSignKeyword_3_2_WSParserRuleCall_3_3_a.equals(transition.getAmbiguousSyntax()))
			emit_namespaceDeclaration_WSParserRuleCall_3_1_a_EqualsSignKeyword_3_2_WSParserRuleCall_3_3_a(semanticObject, transition, fromNode, toNode);
		else if(match_namespaceDeclaration_WSParserRuleCall_5_a.equals(transition.getAmbiguousSyntax()))
			emit_namespaceDeclaration_WSParserRuleCall_5_a(semanticObject, transition, fromNode, toNode);
		else if(match_readDeclaration_WSParserRuleCall_2_p.equals(transition.getAmbiguousSyntax()))
			emit_readDeclaration_WSParserRuleCall_2_p(semanticObject, transition, fromNode, toNode);
		else if(match_readDeclaration_WSParserRuleCall_4_a.equals(transition.getAmbiguousSyntax()))
			emit_readDeclaration_WSParserRuleCall_4_a(semanticObject, transition, fromNode, toNode);
		else if(match_sigConstruct_SOMETHINGParserRuleCall_3_2_p.equals(transition.getAmbiguousSyntax()))
			emit_sigConstruct_SOMETHINGParserRuleCall_3_2_p(semanticObject, transition, fromNode, toNode);
		else if(match_sigConstruct_WSParserRuleCall_1_2_p.equals(transition.getAmbiguousSyntax()))
			emit_sigConstruct_WSParserRuleCall_1_2_p(semanticObject, transition, fromNode, toNode);
		else if(match_sigConstruct_WSParserRuleCall_2_2_p.equals(transition.getAmbiguousSyntax()))
			emit_sigConstruct_WSParserRuleCall_2_2_p(semanticObject, transition, fromNode, toNode);
		else if(match_sigDefinitions_WSParserRuleCall_1_p.equals(transition.getAmbiguousSyntax()))
			emit_sigDefinitions_WSParserRuleCall_1_p(semanticObject, transition, fromNode, toNode);
		else if(match_sigDefinitions_WSParserRuleCall_3_1_p.equals(transition.getAmbiguousSyntax()))
			emit_sigDefinitions_WSParserRuleCall_3_1_p(semanticObject, transition, fromNode, toNode);
		else if(match_sigDefinitions___FullStopKeyword_4_0_WSParserRuleCall_4_1_a__q.equals(transition.getAmbiguousSyntax()))
			emit_sigDefinitions___FullStopKeyword_4_0_WSParserRuleCall_4_1_a__q(semanticObject, transition, fromNode, toNode);
		else if(match_signatureDeclaration_WSParserRuleCall_2_p.equals(transition.getAmbiguousSyntax()))
			emit_signatureDeclaration_WSParserRuleCall_2_p(semanticObject, transition, fromNode, toNode);
		else if(match_signatureDeclaration_WSParserRuleCall_4_a_EqualsSignKeyword_5_WSParserRuleCall_6_p.equals(transition.getAmbiguousSyntax()))
			emit_signatureDeclaration_WSParserRuleCall_4_a_EqualsSignKeyword_5_WSParserRuleCall_6_p(semanticObject, transition, fromNode, toNode);
		else if(match_signatureDeclaration_WSParserRuleCall_8_a.equals(transition.getAmbiguousSyntax()))
			emit_signatureDeclaration_WSParserRuleCall_8_a(semanticObject, transition, fromNode, toNode);
		else if(match_viewDeclaration_WSParserRuleCall_12_a.equals(transition.getAmbiguousSyntax()))
			emit_viewDeclaration_WSParserRuleCall_12_a(semanticObject, transition, fromNode, toNode);
		else if(match_viewDeclaration_WSParserRuleCall_16_a.equals(transition.getAmbiguousSyntax()))
			emit_viewDeclaration_WSParserRuleCall_16_a(semanticObject, transition, fromNode, toNode);
		else if(match_viewDeclaration_WSParserRuleCall_2_p.equals(transition.getAmbiguousSyntax()))
			emit_viewDeclaration_WSParserRuleCall_2_p(semanticObject, transition, fromNode, toNode);
		else if(match_viewDeclaration_WSParserRuleCall_4_a_ColonKeyword_5_WSParserRuleCall_6_a.equals(transition.getAmbiguousSyntax()))
			emit_viewDeclaration_WSParserRuleCall_4_a_ColonKeyword_5_WSParserRuleCall_6_a(semanticObject, transition, fromNode, toNode);
		else if(match_viewDeclaration_WSParserRuleCall_8_a_HyphenMinusGreaterThanSignKeyword_9_WSParserRuleCall_10_a.equals(transition.getAmbiguousSyntax()))
			emit_viewDeclaration_WSParserRuleCall_8_a_HyphenMinusGreaterThanSignKeyword_9_WSParserRuleCall_10_a(semanticObject, transition, fromNode, toNode);
		else acceptNodes(transition, fromNode, toNode);
	}

	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_namespaceDeclaration_WSParserRuleCall_2_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS* '=' WS*
	 */
	protected void emit_namespaceDeclaration_WSParserRuleCall_3_1_a_EqualsSignKeyword_3_2_WSParserRuleCall_3_3_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_namespaceDeclaration_WSParserRuleCall_5_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_readDeclaration_WSParserRuleCall_2_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_readDeclaration_WSParserRuleCall_4_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     SOMETHING+
	 */
	protected void emit_sigConstruct_SOMETHINGParserRuleCall_3_2_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_sigConstruct_WSParserRuleCall_1_2_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_sigConstruct_WSParserRuleCall_2_2_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_sigDefinitions_WSParserRuleCall_1_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_sigDefinitions_WSParserRuleCall_3_1_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     ('.' WS*)?
	 */
	protected void emit_sigDefinitions___FullStopKeyword_4_0_WSParserRuleCall_4_1_a__q(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_signatureDeclaration_WSParserRuleCall_2_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS* '=' WS+
	 */
	protected void emit_signatureDeclaration_WSParserRuleCall_4_a_EqualsSignKeyword_5_WSParserRuleCall_6_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_signatureDeclaration_WSParserRuleCall_8_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_viewDeclaration_WSParserRuleCall_12_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
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
	 *     WS+
	 */
	protected void emit_viewDeclaration_WSParserRuleCall_2_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS* ':' WS*
	 */
	protected void emit_viewDeclaration_WSParserRuleCall_4_a_ColonKeyword_5_WSParserRuleCall_6_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS* '->' WS*
	 */
	protected void emit_viewDeclaration_WSParserRuleCall_8_a_HyphenMinusGreaterThanSignKeyword_9_WSParserRuleCall_10_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
}
