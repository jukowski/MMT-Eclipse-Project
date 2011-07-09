package info.kwarc.mmt.serializer;

import com.google.inject.Inject;
import info.kwarc.mmt.services.LFGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("restriction")
public class AbstractLFSyntacticSequencer extends AbstractSyntacticSequencer {

	protected LFGrammarAccess grammarAccess;
	protected AbstractElementAlias match_sigDefinitions_ColonEqualsSignKeyword_0_1_1_or_ColonKeyword_0_1_0;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (LFGrammarAccess) access;
		match_sigDefinitions_ColonEqualsSignKeyword_0_1_1_or_ColonKeyword_0_1_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getSigDefinitionsAccess().getColonEqualsSignKeyword_0_1_1()), new TokenAlias(false, false, grammarAccess.getSigDefinitionsAccess().getColonKeyword_0_1_0()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getNAMESPACERule())
			return getNAMESPACEToken(ruleCall, node);
		return "";
	}
	
	protected String getNAMESPACEToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (!transition.isSyntacticallyAmbiguous())
			return;
		if(match_sigDefinitions_ColonEqualsSignKeyword_0_1_1_or_ColonKeyword_0_1_0.equals(transition.getAmbiguousSyntax()))
			emit_sigDefinitions_ColonEqualsSignKeyword_0_1_1_or_ColonKeyword_0_1_0(semanticObject, transition, fromNode, toNode);
		else acceptNodes(transition, fromNode, toNode);
	}

	/**
	 * Syntax:
	 *     ':=' | ':'
	 */
	protected void emit_sigDefinitions_ColonEqualsSignKeyword_0_1_1_or_ColonKeyword_0_1_0(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
}
