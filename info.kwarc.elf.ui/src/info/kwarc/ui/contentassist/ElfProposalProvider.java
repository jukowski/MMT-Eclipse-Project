/*
* generated by Xtext
*/
package info.kwarc.ui.contentassist;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;

import info.kwarc.ui.contentassist.AbstractElfProposalProvider;
/**
 * see http://www.eclipse.org/Xtext/documentation/latest/xtext.html#contentAssist on how to customize content assistant
 */
public class ElfProposalProvider extends AbstractElfProposalProvider {
@Override
public void complete_sigDefinitions(EObject model, RuleCall ruleCall,
		ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
	// TODO Auto-generated method stub
	super.complete_sigDefinitions(model, ruleCall, context, acceptor);
}
}
