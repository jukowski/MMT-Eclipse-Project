package info.kwarc.mmt.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import info.kwarc.mmt.services.LFGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLFParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_WS", "RULE_ML_COMMENT", "RULE_ML2_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "':'", "':='", "'.'", "'://'", "'/'", "'\"'", "'%read'", "'%namespace'", "'='", "'%sig'", "'{'", "'}'", "'%include'", "'%struct'", "'%view'", "'->'"
    };
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ML2_COMMENT=8;
    public static final int RULE_INT=5;
    public static final int RULE_WS=6;

    // delegates
    // delegators


        public InternalLFParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLFParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLFParser.tokenNames; }
    public String getGrammarFileName() { return "../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g"; }


     
     	private LFGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(LFGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModel"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:61:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:62:1: ( ruleModel EOF )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:63:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:70:1: ruleModel : ( ( rule__Model__DeclarationsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:74:2: ( ( ( rule__Model__DeclarationsAssignment )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:75:1: ( ( rule__Model__DeclarationsAssignment )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:75:1: ( ( rule__Model__DeclarationsAssignment )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:76:1: ( rule__Model__DeclarationsAssignment )*
            {
             before(grammarAccess.getModelAccess().getDeclarationsAssignment()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:77:1: ( rule__Model__DeclarationsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=17 && LA1_0<=18)||LA1_0==20||LA1_0==25) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:77:2: rule__Model__DeclarationsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Model__DeclarationsAssignment_in_ruleModel94);
            	    rule__Model__DeclarationsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getDeclarationsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleNAMESPACE"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:89:1: entryRuleNAMESPACE : ruleNAMESPACE EOF ;
    public final void entryRuleNAMESPACE() throws RecognitionException {
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:90:1: ( ruleNAMESPACE EOF )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:91:1: ruleNAMESPACE EOF
            {
             before(grammarAccess.getNAMESPACERule()); 
            pushFollow(FOLLOW_ruleNAMESPACE_in_entryRuleNAMESPACE122);
            ruleNAMESPACE();

            state._fsp--;

             after(grammarAccess.getNAMESPACERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNAMESPACE129); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNAMESPACE"


    // $ANTLR start "ruleNAMESPACE"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:98:1: ruleNAMESPACE : ( ( rule__NAMESPACE__Group__0 ) ) ;
    public final void ruleNAMESPACE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:102:2: ( ( ( rule__NAMESPACE__Group__0 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:103:1: ( ( rule__NAMESPACE__Group__0 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:103:1: ( ( rule__NAMESPACE__Group__0 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:104:1: ( rule__NAMESPACE__Group__0 )
            {
             before(grammarAccess.getNAMESPACEAccess().getGroup()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:105:1: ( rule__NAMESPACE__Group__0 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:105:2: rule__NAMESPACE__Group__0
            {
            pushFollow(FOLLOW_rule__NAMESPACE__Group__0_in_ruleNAMESPACE155);
            rule__NAMESPACE__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNAMESPACEAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNAMESPACE"


    // $ANTLR start "entryRuleURI"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:117:1: entryRuleURI : ruleURI EOF ;
    public final void entryRuleURI() throws RecognitionException {
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:118:1: ( ruleURI EOF )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:119:1: ruleURI EOF
            {
             before(grammarAccess.getURIRule()); 
            pushFollow(FOLLOW_ruleURI_in_entryRuleURI182);
            ruleURI();

            state._fsp--;

             after(grammarAccess.getURIRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleURI189); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleURI"


    // $ANTLR start "ruleURI"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:126:1: ruleURI : ( ( rule__URI__Group__0 ) ) ;
    public final void ruleURI() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:130:2: ( ( ( rule__URI__Group__0 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:131:1: ( ( rule__URI__Group__0 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:131:1: ( ( rule__URI__Group__0 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:132:1: ( rule__URI__Group__0 )
            {
             before(grammarAccess.getURIAccess().getGroup()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:133:1: ( rule__URI__Group__0 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:133:2: rule__URI__Group__0
            {
            pushFollow(FOLLOW_rule__URI__Group__0_in_ruleURI215);
            rule__URI__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getURIAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleURI"


    // $ANTLR start "entryRuleURISTRING"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:145:1: entryRuleURISTRING : ruleURISTRING EOF ;
    public final void entryRuleURISTRING() throws RecognitionException {
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:146:1: ( ruleURISTRING EOF )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:147:1: ruleURISTRING EOF
            {
             before(grammarAccess.getURISTRINGRule()); 
            pushFollow(FOLLOW_ruleURISTRING_in_entryRuleURISTRING242);
            ruleURISTRING();

            state._fsp--;

             after(grammarAccess.getURISTRINGRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleURISTRING249); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleURISTRING"


    // $ANTLR start "ruleURISTRING"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:154:1: ruleURISTRING : ( ( rule__URISTRING__Group__0 ) ) ;
    public final void ruleURISTRING() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:158:2: ( ( ( rule__URISTRING__Group__0 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:159:1: ( ( rule__URISTRING__Group__0 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:159:1: ( ( rule__URISTRING__Group__0 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:160:1: ( rule__URISTRING__Group__0 )
            {
             before(grammarAccess.getURISTRINGAccess().getGroup()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:161:1: ( rule__URISTRING__Group__0 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:161:2: rule__URISTRING__Group__0
            {
            pushFollow(FOLLOW_rule__URISTRING__Group__0_in_ruleURISTRING275);
            rule__URISTRING__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getURISTRINGAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleURISTRING"


    // $ANTLR start "entryRulereadDeclaration"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:173:1: entryRulereadDeclaration : rulereadDeclaration EOF ;
    public final void entryRulereadDeclaration() throws RecognitionException {
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:174:1: ( rulereadDeclaration EOF )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:175:1: rulereadDeclaration EOF
            {
             before(grammarAccess.getReadDeclarationRule()); 
            pushFollow(FOLLOW_rulereadDeclaration_in_entryRulereadDeclaration302);
            rulereadDeclaration();

            state._fsp--;

             after(grammarAccess.getReadDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulereadDeclaration309); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulereadDeclaration"


    // $ANTLR start "rulereadDeclaration"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:182:1: rulereadDeclaration : ( ( rule__ReadDeclaration__Group__0 ) ) ;
    public final void rulereadDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:186:2: ( ( ( rule__ReadDeclaration__Group__0 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:187:1: ( ( rule__ReadDeclaration__Group__0 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:187:1: ( ( rule__ReadDeclaration__Group__0 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:188:1: ( rule__ReadDeclaration__Group__0 )
            {
             before(grammarAccess.getReadDeclarationAccess().getGroup()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:189:1: ( rule__ReadDeclaration__Group__0 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:189:2: rule__ReadDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__ReadDeclaration__Group__0_in_rulereadDeclaration335);
            rule__ReadDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReadDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulereadDeclaration"


    // $ANTLR start "entryRulenamespaceDeclaration"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:201:1: entryRulenamespaceDeclaration : rulenamespaceDeclaration EOF ;
    public final void entryRulenamespaceDeclaration() throws RecognitionException {
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:202:1: ( rulenamespaceDeclaration EOF )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:203:1: rulenamespaceDeclaration EOF
            {
             before(grammarAccess.getNamespaceDeclarationRule()); 
            pushFollow(FOLLOW_rulenamespaceDeclaration_in_entryRulenamespaceDeclaration362);
            rulenamespaceDeclaration();

            state._fsp--;

             after(grammarAccess.getNamespaceDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulenamespaceDeclaration369); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulenamespaceDeclaration"


    // $ANTLR start "rulenamespaceDeclaration"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:210:1: rulenamespaceDeclaration : ( ( rule__NamespaceDeclaration__Group__0 ) ) ;
    public final void rulenamespaceDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:214:2: ( ( ( rule__NamespaceDeclaration__Group__0 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:215:1: ( ( rule__NamespaceDeclaration__Group__0 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:215:1: ( ( rule__NamespaceDeclaration__Group__0 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:216:1: ( rule__NamespaceDeclaration__Group__0 )
            {
             before(grammarAccess.getNamespaceDeclarationAccess().getGroup()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:217:1: ( rule__NamespaceDeclaration__Group__0 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:217:2: rule__NamespaceDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group__0_in_rulenamespaceDeclaration395);
            rule__NamespaceDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNamespaceDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulenamespaceDeclaration"


    // $ANTLR start "entryRulesignatureDeclaration"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:229:1: entryRulesignatureDeclaration : rulesignatureDeclaration EOF ;
    public final void entryRulesignatureDeclaration() throws RecognitionException {
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:230:1: ( rulesignatureDeclaration EOF )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:231:1: rulesignatureDeclaration EOF
            {
             before(grammarAccess.getSignatureDeclarationRule()); 
            pushFollow(FOLLOW_rulesignatureDeclaration_in_entryRulesignatureDeclaration422);
            rulesignatureDeclaration();

            state._fsp--;

             after(grammarAccess.getSignatureDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulesignatureDeclaration429); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulesignatureDeclaration"


    // $ANTLR start "rulesignatureDeclaration"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:238:1: rulesignatureDeclaration : ( ( rule__SignatureDeclaration__Group__0 ) ) ;
    public final void rulesignatureDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:242:2: ( ( ( rule__SignatureDeclaration__Group__0 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:243:1: ( ( rule__SignatureDeclaration__Group__0 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:243:1: ( ( rule__SignatureDeclaration__Group__0 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:244:1: ( rule__SignatureDeclaration__Group__0 )
            {
             before(grammarAccess.getSignatureDeclarationAccess().getGroup()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:245:1: ( rule__SignatureDeclaration__Group__0 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:245:2: rule__SignatureDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__SignatureDeclaration__Group__0_in_rulesignatureDeclaration455);
            rule__SignatureDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSignatureDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulesignatureDeclaration"


    // $ANTLR start "entryRulesigDefinitions"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:257:1: entryRulesigDefinitions : rulesigDefinitions EOF ;
    public final void entryRulesigDefinitions() throws RecognitionException {
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:258:1: ( rulesigDefinitions EOF )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:259:1: rulesigDefinitions EOF
            {
             before(grammarAccess.getSigDefinitionsRule()); 
            pushFollow(FOLLOW_rulesigDefinitions_in_entryRulesigDefinitions482);
            rulesigDefinitions();

            state._fsp--;

             after(grammarAccess.getSigDefinitionsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulesigDefinitions489); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulesigDefinitions"


    // $ANTLR start "rulesigDefinitions"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:266:1: rulesigDefinitions : ( ( rule__SigDefinitions__Alternatives ) ) ;
    public final void rulesigDefinitions() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:270:2: ( ( ( rule__SigDefinitions__Alternatives ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:271:1: ( ( rule__SigDefinitions__Alternatives ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:271:1: ( ( rule__SigDefinitions__Alternatives ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:272:1: ( rule__SigDefinitions__Alternatives )
            {
             before(grammarAccess.getSigDefinitionsAccess().getAlternatives()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:273:1: ( rule__SigDefinitions__Alternatives )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:273:2: rule__SigDefinitions__Alternatives
            {
            pushFollow(FOLLOW_rule__SigDefinitions__Alternatives_in_rulesigDefinitions515);
            rule__SigDefinitions__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSigDefinitionsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulesigDefinitions"


    // $ANTLR start "entryRuleviewDeclaration"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:287:1: entryRuleviewDeclaration : ruleviewDeclaration EOF ;
    public final void entryRuleviewDeclaration() throws RecognitionException {
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:288:1: ( ruleviewDeclaration EOF )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:289:1: ruleviewDeclaration EOF
            {
             before(grammarAccess.getViewDeclarationRule()); 
            pushFollow(FOLLOW_ruleviewDeclaration_in_entryRuleviewDeclaration544);
            ruleviewDeclaration();

            state._fsp--;

             after(grammarAccess.getViewDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleviewDeclaration551); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleviewDeclaration"


    // $ANTLR start "ruleviewDeclaration"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:296:1: ruleviewDeclaration : ( ( rule__ViewDeclaration__Group__0 ) ) ;
    public final void ruleviewDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:300:2: ( ( ( rule__ViewDeclaration__Group__0 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:301:1: ( ( rule__ViewDeclaration__Group__0 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:301:1: ( ( rule__ViewDeclaration__Group__0 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:302:1: ( rule__ViewDeclaration__Group__0 )
            {
             before(grammarAccess.getViewDeclarationAccess().getGroup()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:303:1: ( rule__ViewDeclaration__Group__0 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:303:2: rule__ViewDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__Group__0_in_ruleviewDeclaration577);
            rule__ViewDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getViewDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleviewDeclaration"


    // $ANTLR start "rule__Model__DeclarationsAlternatives_0"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:315:1: rule__Model__DeclarationsAlternatives_0 : ( ( rulenamespaceDeclaration ) | ( rulesignatureDeclaration ) | ( rulereadDeclaration ) | ( ruleviewDeclaration ) );
    public final void rule__Model__DeclarationsAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:319:1: ( ( rulenamespaceDeclaration ) | ( rulesignatureDeclaration ) | ( rulereadDeclaration ) | ( ruleviewDeclaration ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt2=1;
                }
                break;
            case 20:
                {
                alt2=2;
                }
                break;
            case 17:
                {
                alt2=3;
                }
                break;
            case 25:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:320:1: ( rulenamespaceDeclaration )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:320:1: ( rulenamespaceDeclaration )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:321:1: rulenamespaceDeclaration
                    {
                     before(grammarAccess.getModelAccess().getDeclarationsNamespaceDeclarationParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_rulenamespaceDeclaration_in_rule__Model__DeclarationsAlternatives_0613);
                    rulenamespaceDeclaration();

                    state._fsp--;

                     after(grammarAccess.getModelAccess().getDeclarationsNamespaceDeclarationParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:326:6: ( rulesignatureDeclaration )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:326:6: ( rulesignatureDeclaration )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:327:1: rulesignatureDeclaration
                    {
                     before(grammarAccess.getModelAccess().getDeclarationsSignatureDeclarationParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_rulesignatureDeclaration_in_rule__Model__DeclarationsAlternatives_0630);
                    rulesignatureDeclaration();

                    state._fsp--;

                     after(grammarAccess.getModelAccess().getDeclarationsSignatureDeclarationParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:332:6: ( rulereadDeclaration )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:332:6: ( rulereadDeclaration )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:333:1: rulereadDeclaration
                    {
                     before(grammarAccess.getModelAccess().getDeclarationsReadDeclarationParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_rulereadDeclaration_in_rule__Model__DeclarationsAlternatives_0647);
                    rulereadDeclaration();

                    state._fsp--;

                     after(grammarAccess.getModelAccess().getDeclarationsReadDeclarationParserRuleCall_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:338:6: ( ruleviewDeclaration )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:338:6: ( ruleviewDeclaration )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:339:1: ruleviewDeclaration
                    {
                     before(grammarAccess.getModelAccess().getDeclarationsViewDeclarationParserRuleCall_0_3()); 
                    pushFollow(FOLLOW_ruleviewDeclaration_in_rule__Model__DeclarationsAlternatives_0664);
                    ruleviewDeclaration();

                    state._fsp--;

                     after(grammarAccess.getModelAccess().getDeclarationsViewDeclarationParserRuleCall_0_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__DeclarationsAlternatives_0"


    // $ANTLR start "rule__SigDefinitions__Alternatives"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:349:1: rule__SigDefinitions__Alternatives : ( ( ( rule__SigDefinitions__Group_0__0 ) ) | ( ( rule__SigDefinitions__Group_1__0 ) ) | ( ( rule__SigDefinitions__Group_2__0 ) ) );
    public final void rule__SigDefinitions__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:353:1: ( ( ( rule__SigDefinitions__Group_0__0 ) ) | ( ( rule__SigDefinitions__Group_1__0 ) ) | ( ( rule__SigDefinitions__Group_2__0 ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt3=1;
                }
                break;
            case 23:
                {
                alt3=2;
                }
                break;
            case 24:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:354:1: ( ( rule__SigDefinitions__Group_0__0 ) )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:354:1: ( ( rule__SigDefinitions__Group_0__0 ) )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:355:1: ( rule__SigDefinitions__Group_0__0 )
                    {
                     before(grammarAccess.getSigDefinitionsAccess().getGroup_0()); 
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:356:1: ( rule__SigDefinitions__Group_0__0 )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:356:2: rule__SigDefinitions__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__SigDefinitions__Group_0__0_in_rule__SigDefinitions__Alternatives696);
                    rule__SigDefinitions__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSigDefinitionsAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:360:6: ( ( rule__SigDefinitions__Group_1__0 ) )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:360:6: ( ( rule__SigDefinitions__Group_1__0 ) )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:361:1: ( rule__SigDefinitions__Group_1__0 )
                    {
                     before(grammarAccess.getSigDefinitionsAccess().getGroup_1()); 
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:362:1: ( rule__SigDefinitions__Group_1__0 )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:362:2: rule__SigDefinitions__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__SigDefinitions__Group_1__0_in_rule__SigDefinitions__Alternatives714);
                    rule__SigDefinitions__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSigDefinitionsAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:366:6: ( ( rule__SigDefinitions__Group_2__0 ) )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:366:6: ( ( rule__SigDefinitions__Group_2__0 ) )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:367:1: ( rule__SigDefinitions__Group_2__0 )
                    {
                     before(grammarAccess.getSigDefinitionsAccess().getGroup_2()); 
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:368:1: ( rule__SigDefinitions__Group_2__0 )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:368:2: rule__SigDefinitions__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__SigDefinitions__Group_2__0_in_rule__SigDefinitions__Alternatives732);
                    rule__SigDefinitions__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSigDefinitionsAccess().getGroup_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SigDefinitions__Alternatives"


    // $ANTLR start "rule__SigDefinitions__Alternatives_0_1"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:377:1: rule__SigDefinitions__Alternatives_0_1 : ( ( ':' ) | ( ':=' ) );
    public final void rule__SigDefinitions__Alternatives_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:381:1: ( ( ':' ) | ( ':=' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( (LA4_0==12) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:382:1: ( ':' )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:382:1: ( ':' )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:383:1: ':'
                    {
                     before(grammarAccess.getSigDefinitionsAccess().getColonKeyword_0_1_0()); 
                    match(input,11,FOLLOW_11_in_rule__SigDefinitions__Alternatives_0_1766); 
                     after(grammarAccess.getSigDefinitionsAccess().getColonKeyword_0_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:390:6: ( ':=' )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:390:6: ( ':=' )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:391:1: ':='
                    {
                     before(grammarAccess.getSigDefinitionsAccess().getColonEqualsSignKeyword_0_1_1()); 
                    match(input,12,FOLLOW_12_in_rule__SigDefinitions__Alternatives_0_1786); 
                     after(grammarAccess.getSigDefinitionsAccess().getColonEqualsSignKeyword_0_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SigDefinitions__Alternatives_0_1"


    // $ANTLR start "rule__NAMESPACE__Group__0"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:406:1: rule__NAMESPACE__Group__0 : rule__NAMESPACE__Group__0__Impl rule__NAMESPACE__Group__1 ;
    public final void rule__NAMESPACE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:410:1: ( rule__NAMESPACE__Group__0__Impl rule__NAMESPACE__Group__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:411:2: rule__NAMESPACE__Group__0__Impl rule__NAMESPACE__Group__1
            {
            pushFollow(FOLLOW_rule__NAMESPACE__Group__0__Impl_in_rule__NAMESPACE__Group__0819);
            rule__NAMESPACE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NAMESPACE__Group__1_in_rule__NAMESPACE__Group__0822);
            rule__NAMESPACE__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NAMESPACE__Group__0"


    // $ANTLR start "rule__NAMESPACE__Group__0__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:418:1: rule__NAMESPACE__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__NAMESPACE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:422:1: ( ( RULE_ID ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:423:1: ( RULE_ID )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:423:1: ( RULE_ID )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:424:1: RULE_ID
            {
             before(grammarAccess.getNAMESPACEAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NAMESPACE__Group__0__Impl849); 
             after(grammarAccess.getNAMESPACEAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NAMESPACE__Group__0__Impl"


    // $ANTLR start "rule__NAMESPACE__Group__1"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:435:1: rule__NAMESPACE__Group__1 : rule__NAMESPACE__Group__1__Impl ;
    public final void rule__NAMESPACE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:439:1: ( rule__NAMESPACE__Group__1__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:440:2: rule__NAMESPACE__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NAMESPACE__Group__1__Impl_in_rule__NAMESPACE__Group__1878);
            rule__NAMESPACE__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NAMESPACE__Group__1"


    // $ANTLR start "rule__NAMESPACE__Group__1__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:446:1: rule__NAMESPACE__Group__1__Impl : ( ( rule__NAMESPACE__Group_1__0 )* ) ;
    public final void rule__NAMESPACE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:450:1: ( ( ( rule__NAMESPACE__Group_1__0 )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:451:1: ( ( rule__NAMESPACE__Group_1__0 )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:451:1: ( ( rule__NAMESPACE__Group_1__0 )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:452:1: ( rule__NAMESPACE__Group_1__0 )*
            {
             before(grammarAccess.getNAMESPACEAccess().getGroup_1()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:453:1: ( rule__NAMESPACE__Group_1__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==13) ) {
                    int LA5_2 = input.LA(2);

                    if ( (LA5_2==RULE_ID) ) {
                        int LA5_3 = input.LA(3);

                        if ( (LA5_3==EOF||LA5_3==13||(LA5_3>=15 && LA5_3<=16)||LA5_3==19||LA5_3==26) ) {
                            alt5=1;
                        }


                    }


                }


                switch (alt5) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:453:2: rule__NAMESPACE__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__NAMESPACE__Group_1__0_in_rule__NAMESPACE__Group__1__Impl905);
            	    rule__NAMESPACE__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getNAMESPACEAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NAMESPACE__Group__1__Impl"


    // $ANTLR start "rule__NAMESPACE__Group_1__0"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:467:1: rule__NAMESPACE__Group_1__0 : rule__NAMESPACE__Group_1__0__Impl rule__NAMESPACE__Group_1__1 ;
    public final void rule__NAMESPACE__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:471:1: ( rule__NAMESPACE__Group_1__0__Impl rule__NAMESPACE__Group_1__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:472:2: rule__NAMESPACE__Group_1__0__Impl rule__NAMESPACE__Group_1__1
            {
            pushFollow(FOLLOW_rule__NAMESPACE__Group_1__0__Impl_in_rule__NAMESPACE__Group_1__0940);
            rule__NAMESPACE__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NAMESPACE__Group_1__1_in_rule__NAMESPACE__Group_1__0943);
            rule__NAMESPACE__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NAMESPACE__Group_1__0"


    // $ANTLR start "rule__NAMESPACE__Group_1__0__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:479:1: rule__NAMESPACE__Group_1__0__Impl : ( '.' ) ;
    public final void rule__NAMESPACE__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:483:1: ( ( '.' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:484:1: ( '.' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:484:1: ( '.' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:485:1: '.'
            {
             before(grammarAccess.getNAMESPACEAccess().getFullStopKeyword_1_0()); 
            match(input,13,FOLLOW_13_in_rule__NAMESPACE__Group_1__0__Impl971); 
             after(grammarAccess.getNAMESPACEAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NAMESPACE__Group_1__0__Impl"


    // $ANTLR start "rule__NAMESPACE__Group_1__1"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:498:1: rule__NAMESPACE__Group_1__1 : rule__NAMESPACE__Group_1__1__Impl ;
    public final void rule__NAMESPACE__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:502:1: ( rule__NAMESPACE__Group_1__1__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:503:2: rule__NAMESPACE__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__NAMESPACE__Group_1__1__Impl_in_rule__NAMESPACE__Group_1__11002);
            rule__NAMESPACE__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NAMESPACE__Group_1__1"


    // $ANTLR start "rule__NAMESPACE__Group_1__1__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:509:1: rule__NAMESPACE__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__NAMESPACE__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:513:1: ( ( RULE_ID ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:514:1: ( RULE_ID )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:514:1: ( RULE_ID )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:515:1: RULE_ID
            {
             before(grammarAccess.getNAMESPACEAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NAMESPACE__Group_1__1__Impl1029); 
             after(grammarAccess.getNAMESPACEAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NAMESPACE__Group_1__1__Impl"


    // $ANTLR start "rule__URI__Group__0"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:530:1: rule__URI__Group__0 : rule__URI__Group__0__Impl rule__URI__Group__1 ;
    public final void rule__URI__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:534:1: ( rule__URI__Group__0__Impl rule__URI__Group__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:535:2: rule__URI__Group__0__Impl rule__URI__Group__1
            {
            pushFollow(FOLLOW_rule__URI__Group__0__Impl_in_rule__URI__Group__01062);
            rule__URI__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URI__Group__1_in_rule__URI__Group__01065);
            rule__URI__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URI__Group__0"


    // $ANTLR start "rule__URI__Group__0__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:542:1: rule__URI__Group__0__Impl : ( ( rule__URI__Group_0__0 )? ) ;
    public final void rule__URI__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:546:1: ( ( ( rule__URI__Group_0__0 )? ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:547:1: ( ( rule__URI__Group_0__0 )? )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:547:1: ( ( rule__URI__Group_0__0 )? )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:548:1: ( rule__URI__Group_0__0 )?
            {
             before(grammarAccess.getURIAccess().getGroup_0()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:549:1: ( rule__URI__Group_0__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==14) ) {
                    alt6=1;
                }
            }
            switch (alt6) {
                case 1 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:549:2: rule__URI__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__URI__Group_0__0_in_rule__URI__Group__0__Impl1092);
                    rule__URI__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getURIAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URI__Group__0__Impl"


    // $ANTLR start "rule__URI__Group__1"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:559:1: rule__URI__Group__1 : rule__URI__Group__1__Impl rule__URI__Group__2 ;
    public final void rule__URI__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:563:1: ( rule__URI__Group__1__Impl rule__URI__Group__2 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:564:2: rule__URI__Group__1__Impl rule__URI__Group__2
            {
            pushFollow(FOLLOW_rule__URI__Group__1__Impl_in_rule__URI__Group__11123);
            rule__URI__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URI__Group__2_in_rule__URI__Group__11126);
            rule__URI__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URI__Group__1"


    // $ANTLR start "rule__URI__Group__1__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:571:1: rule__URI__Group__1__Impl : ( ruleNAMESPACE ) ;
    public final void rule__URI__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:575:1: ( ( ruleNAMESPACE ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:576:1: ( ruleNAMESPACE )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:576:1: ( ruleNAMESPACE )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:577:1: ruleNAMESPACE
            {
             before(grammarAccess.getURIAccess().getNAMESPACEParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleNAMESPACE_in_rule__URI__Group__1__Impl1153);
            ruleNAMESPACE();

            state._fsp--;

             after(grammarAccess.getURIAccess().getNAMESPACEParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URI__Group__1__Impl"


    // $ANTLR start "rule__URI__Group__2"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:588:1: rule__URI__Group__2 : rule__URI__Group__2__Impl ;
    public final void rule__URI__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:592:1: ( rule__URI__Group__2__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:593:2: rule__URI__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__URI__Group__2__Impl_in_rule__URI__Group__21182);
            rule__URI__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URI__Group__2"


    // $ANTLR start "rule__URI__Group__2__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:599:1: rule__URI__Group__2__Impl : ( ( rule__URI__Group_2__0 )* ) ;
    public final void rule__URI__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:603:1: ( ( ( rule__URI__Group_2__0 )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:604:1: ( ( rule__URI__Group_2__0 )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:604:1: ( ( rule__URI__Group_2__0 )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:605:1: ( rule__URI__Group_2__0 )*
            {
             before(grammarAccess.getURIAccess().getGroup_2()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:606:1: ( rule__URI__Group_2__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==15) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:606:2: rule__URI__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__URI__Group_2__0_in_rule__URI__Group__2__Impl1209);
            	    rule__URI__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getURIAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URI__Group__2__Impl"


    // $ANTLR start "rule__URI__Group_0__0"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:622:1: rule__URI__Group_0__0 : rule__URI__Group_0__0__Impl rule__URI__Group_0__1 ;
    public final void rule__URI__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:626:1: ( rule__URI__Group_0__0__Impl rule__URI__Group_0__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:627:2: rule__URI__Group_0__0__Impl rule__URI__Group_0__1
            {
            pushFollow(FOLLOW_rule__URI__Group_0__0__Impl_in_rule__URI__Group_0__01246);
            rule__URI__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URI__Group_0__1_in_rule__URI__Group_0__01249);
            rule__URI__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URI__Group_0__0"


    // $ANTLR start "rule__URI__Group_0__0__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:634:1: rule__URI__Group_0__0__Impl : ( RULE_ID ) ;
    public final void rule__URI__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:638:1: ( ( RULE_ID ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:639:1: ( RULE_ID )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:639:1: ( RULE_ID )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:640:1: RULE_ID
            {
             before(grammarAccess.getURIAccess().getIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__URI__Group_0__0__Impl1276); 
             after(grammarAccess.getURIAccess().getIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URI__Group_0__0__Impl"


    // $ANTLR start "rule__URI__Group_0__1"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:651:1: rule__URI__Group_0__1 : rule__URI__Group_0__1__Impl ;
    public final void rule__URI__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:655:1: ( rule__URI__Group_0__1__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:656:2: rule__URI__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__URI__Group_0__1__Impl_in_rule__URI__Group_0__11305);
            rule__URI__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URI__Group_0__1"


    // $ANTLR start "rule__URI__Group_0__1__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:662:1: rule__URI__Group_0__1__Impl : ( '://' ) ;
    public final void rule__URI__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:666:1: ( ( '://' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:667:1: ( '://' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:667:1: ( '://' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:668:1: '://'
            {
             before(grammarAccess.getURIAccess().getColonSolidusSolidusKeyword_0_1()); 
            match(input,14,FOLLOW_14_in_rule__URI__Group_0__1__Impl1333); 
             after(grammarAccess.getURIAccess().getColonSolidusSolidusKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URI__Group_0__1__Impl"


    // $ANTLR start "rule__URI__Group_2__0"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:685:1: rule__URI__Group_2__0 : rule__URI__Group_2__0__Impl rule__URI__Group_2__1 ;
    public final void rule__URI__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:689:1: ( rule__URI__Group_2__0__Impl rule__URI__Group_2__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:690:2: rule__URI__Group_2__0__Impl rule__URI__Group_2__1
            {
            pushFollow(FOLLOW_rule__URI__Group_2__0__Impl_in_rule__URI__Group_2__01368);
            rule__URI__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URI__Group_2__1_in_rule__URI__Group_2__01371);
            rule__URI__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URI__Group_2__0"


    // $ANTLR start "rule__URI__Group_2__0__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:697:1: rule__URI__Group_2__0__Impl : ( '/' ) ;
    public final void rule__URI__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:701:1: ( ( '/' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:702:1: ( '/' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:702:1: ( '/' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:703:1: '/'
            {
             before(grammarAccess.getURIAccess().getSolidusKeyword_2_0()); 
            match(input,15,FOLLOW_15_in_rule__URI__Group_2__0__Impl1399); 
             after(grammarAccess.getURIAccess().getSolidusKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URI__Group_2__0__Impl"


    // $ANTLR start "rule__URI__Group_2__1"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:716:1: rule__URI__Group_2__1 : rule__URI__Group_2__1__Impl ;
    public final void rule__URI__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:720:1: ( rule__URI__Group_2__1__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:721:2: rule__URI__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__URI__Group_2__1__Impl_in_rule__URI__Group_2__11430);
            rule__URI__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URI__Group_2__1"


    // $ANTLR start "rule__URI__Group_2__1__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:727:1: rule__URI__Group_2__1__Impl : ( RULE_ID ) ;
    public final void rule__URI__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:731:1: ( ( RULE_ID ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:732:1: ( RULE_ID )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:732:1: ( RULE_ID )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:733:1: RULE_ID
            {
             before(grammarAccess.getURIAccess().getIDTerminalRuleCall_2_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__URI__Group_2__1__Impl1457); 
             after(grammarAccess.getURIAccess().getIDTerminalRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URI__Group_2__1__Impl"


    // $ANTLR start "rule__URISTRING__Group__0"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:748:1: rule__URISTRING__Group__0 : rule__URISTRING__Group__0__Impl rule__URISTRING__Group__1 ;
    public final void rule__URISTRING__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:752:1: ( rule__URISTRING__Group__0__Impl rule__URISTRING__Group__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:753:2: rule__URISTRING__Group__0__Impl rule__URISTRING__Group__1
            {
            pushFollow(FOLLOW_rule__URISTRING__Group__0__Impl_in_rule__URISTRING__Group__01490);
            rule__URISTRING__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URISTRING__Group__1_in_rule__URISTRING__Group__01493);
            rule__URISTRING__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URISTRING__Group__0"


    // $ANTLR start "rule__URISTRING__Group__0__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:760:1: rule__URISTRING__Group__0__Impl : ( '\"' ) ;
    public final void rule__URISTRING__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:764:1: ( ( '\"' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:765:1: ( '\"' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:765:1: ( '\"' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:766:1: '\"'
            {
             before(grammarAccess.getURISTRINGAccess().getQuotationMarkKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__URISTRING__Group__0__Impl1521); 
             after(grammarAccess.getURISTRINGAccess().getQuotationMarkKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URISTRING__Group__0__Impl"


    // $ANTLR start "rule__URISTRING__Group__1"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:779:1: rule__URISTRING__Group__1 : rule__URISTRING__Group__1__Impl rule__URISTRING__Group__2 ;
    public final void rule__URISTRING__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:783:1: ( rule__URISTRING__Group__1__Impl rule__URISTRING__Group__2 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:784:2: rule__URISTRING__Group__1__Impl rule__URISTRING__Group__2
            {
            pushFollow(FOLLOW_rule__URISTRING__Group__1__Impl_in_rule__URISTRING__Group__11552);
            rule__URISTRING__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URISTRING__Group__2_in_rule__URISTRING__Group__11555);
            rule__URISTRING__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URISTRING__Group__1"


    // $ANTLR start "rule__URISTRING__Group__1__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:791:1: rule__URISTRING__Group__1__Impl : ( ruleURI ) ;
    public final void rule__URISTRING__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:795:1: ( ( ruleURI ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:796:1: ( ruleURI )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:796:1: ( ruleURI )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:797:1: ruleURI
            {
             before(grammarAccess.getURISTRINGAccess().getURIParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleURI_in_rule__URISTRING__Group__1__Impl1582);
            ruleURI();

            state._fsp--;

             after(grammarAccess.getURISTRINGAccess().getURIParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URISTRING__Group__1__Impl"


    // $ANTLR start "rule__URISTRING__Group__2"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:808:1: rule__URISTRING__Group__2 : rule__URISTRING__Group__2__Impl ;
    public final void rule__URISTRING__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:812:1: ( rule__URISTRING__Group__2__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:813:2: rule__URISTRING__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__URISTRING__Group__2__Impl_in_rule__URISTRING__Group__21611);
            rule__URISTRING__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URISTRING__Group__2"


    // $ANTLR start "rule__URISTRING__Group__2__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:819:1: rule__URISTRING__Group__2__Impl : ( '\"' ) ;
    public final void rule__URISTRING__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:823:1: ( ( '\"' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:824:1: ( '\"' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:824:1: ( '\"' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:825:1: '\"'
            {
             before(grammarAccess.getURISTRINGAccess().getQuotationMarkKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__URISTRING__Group__2__Impl1639); 
             after(grammarAccess.getURISTRINGAccess().getQuotationMarkKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__URISTRING__Group__2__Impl"


    // $ANTLR start "rule__ReadDeclaration__Group__0"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:844:1: rule__ReadDeclaration__Group__0 : rule__ReadDeclaration__Group__0__Impl rule__ReadDeclaration__Group__1 ;
    public final void rule__ReadDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:848:1: ( rule__ReadDeclaration__Group__0__Impl rule__ReadDeclaration__Group__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:849:2: rule__ReadDeclaration__Group__0__Impl rule__ReadDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__ReadDeclaration__Group__0__Impl_in_rule__ReadDeclaration__Group__01676);
            rule__ReadDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ReadDeclaration__Group__1_in_rule__ReadDeclaration__Group__01679);
            rule__ReadDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadDeclaration__Group__0"


    // $ANTLR start "rule__ReadDeclaration__Group__0__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:856:1: rule__ReadDeclaration__Group__0__Impl : ( '%read' ) ;
    public final void rule__ReadDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:860:1: ( ( '%read' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:861:1: ( '%read' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:861:1: ( '%read' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:862:1: '%read'
            {
             before(grammarAccess.getReadDeclarationAccess().getReadKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__ReadDeclaration__Group__0__Impl1707); 
             after(grammarAccess.getReadDeclarationAccess().getReadKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadDeclaration__Group__0__Impl"


    // $ANTLR start "rule__ReadDeclaration__Group__1"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:875:1: rule__ReadDeclaration__Group__1 : rule__ReadDeclaration__Group__1__Impl rule__ReadDeclaration__Group__2 ;
    public final void rule__ReadDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:879:1: ( rule__ReadDeclaration__Group__1__Impl rule__ReadDeclaration__Group__2 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:880:2: rule__ReadDeclaration__Group__1__Impl rule__ReadDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__ReadDeclaration__Group__1__Impl_in_rule__ReadDeclaration__Group__11738);
            rule__ReadDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ReadDeclaration__Group__2_in_rule__ReadDeclaration__Group__11741);
            rule__ReadDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadDeclaration__Group__1"


    // $ANTLR start "rule__ReadDeclaration__Group__1__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:887:1: rule__ReadDeclaration__Group__1__Impl : ( ( rule__ReadDeclaration__FileAssignment_1 ) ) ;
    public final void rule__ReadDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:891:1: ( ( ( rule__ReadDeclaration__FileAssignment_1 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:892:1: ( ( rule__ReadDeclaration__FileAssignment_1 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:892:1: ( ( rule__ReadDeclaration__FileAssignment_1 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:893:1: ( rule__ReadDeclaration__FileAssignment_1 )
            {
             before(grammarAccess.getReadDeclarationAccess().getFileAssignment_1()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:894:1: ( rule__ReadDeclaration__FileAssignment_1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:894:2: rule__ReadDeclaration__FileAssignment_1
            {
            pushFollow(FOLLOW_rule__ReadDeclaration__FileAssignment_1_in_rule__ReadDeclaration__Group__1__Impl1768);
            rule__ReadDeclaration__FileAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReadDeclarationAccess().getFileAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadDeclaration__Group__1__Impl"


    // $ANTLR start "rule__ReadDeclaration__Group__2"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:904:1: rule__ReadDeclaration__Group__2 : rule__ReadDeclaration__Group__2__Impl ;
    public final void rule__ReadDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:908:1: ( rule__ReadDeclaration__Group__2__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:909:2: rule__ReadDeclaration__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ReadDeclaration__Group__2__Impl_in_rule__ReadDeclaration__Group__21798);
            rule__ReadDeclaration__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadDeclaration__Group__2"


    // $ANTLR start "rule__ReadDeclaration__Group__2__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:915:1: rule__ReadDeclaration__Group__2__Impl : ( '.' ) ;
    public final void rule__ReadDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:919:1: ( ( '.' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:920:1: ( '.' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:920:1: ( '.' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:921:1: '.'
            {
             before(grammarAccess.getReadDeclarationAccess().getFullStopKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__ReadDeclaration__Group__2__Impl1826); 
             after(grammarAccess.getReadDeclarationAccess().getFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadDeclaration__Group__2__Impl"


    // $ANTLR start "rule__NamespaceDeclaration__Group__0"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:940:1: rule__NamespaceDeclaration__Group__0 : rule__NamespaceDeclaration__Group__0__Impl rule__NamespaceDeclaration__Group__1 ;
    public final void rule__NamespaceDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:944:1: ( rule__NamespaceDeclaration__Group__0__Impl rule__NamespaceDeclaration__Group__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:945:2: rule__NamespaceDeclaration__Group__0__Impl rule__NamespaceDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group__0__Impl_in_rule__NamespaceDeclaration__Group__01863);
            rule__NamespaceDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group__1_in_rule__NamespaceDeclaration__Group__01866);
            rule__NamespaceDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamespaceDeclaration__Group__0"


    // $ANTLR start "rule__NamespaceDeclaration__Group__0__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:952:1: rule__NamespaceDeclaration__Group__0__Impl : ( '%namespace' ) ;
    public final void rule__NamespaceDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:956:1: ( ( '%namespace' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:957:1: ( '%namespace' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:957:1: ( '%namespace' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:958:1: '%namespace'
            {
             before(grammarAccess.getNamespaceDeclarationAccess().getNamespaceKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__NamespaceDeclaration__Group__0__Impl1894); 
             after(grammarAccess.getNamespaceDeclarationAccess().getNamespaceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamespaceDeclaration__Group__0__Impl"


    // $ANTLR start "rule__NamespaceDeclaration__Group__1"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:971:1: rule__NamespaceDeclaration__Group__1 : rule__NamespaceDeclaration__Group__1__Impl rule__NamespaceDeclaration__Group__2 ;
    public final void rule__NamespaceDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:975:1: ( rule__NamespaceDeclaration__Group__1__Impl rule__NamespaceDeclaration__Group__2 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:976:2: rule__NamespaceDeclaration__Group__1__Impl rule__NamespaceDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group__1__Impl_in_rule__NamespaceDeclaration__Group__11925);
            rule__NamespaceDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group__2_in_rule__NamespaceDeclaration__Group__11928);
            rule__NamespaceDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamespaceDeclaration__Group__1"


    // $ANTLR start "rule__NamespaceDeclaration__Group__1__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:983:1: rule__NamespaceDeclaration__Group__1__Impl : ( ( rule__NamespaceDeclaration__Group_1__0 )? ) ;
    public final void rule__NamespaceDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:987:1: ( ( ( rule__NamespaceDeclaration__Group_1__0 )? ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:988:1: ( ( rule__NamespaceDeclaration__Group_1__0 )? )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:988:1: ( ( rule__NamespaceDeclaration__Group_1__0 )? )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:989:1: ( rule__NamespaceDeclaration__Group_1__0 )?
            {
             before(grammarAccess.getNamespaceDeclarationAccess().getGroup_1()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:990:1: ( rule__NamespaceDeclaration__Group_1__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:990:2: rule__NamespaceDeclaration__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__NamespaceDeclaration__Group_1__0_in_rule__NamespaceDeclaration__Group__1__Impl1955);
                    rule__NamespaceDeclaration__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNamespaceDeclarationAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamespaceDeclaration__Group__1__Impl"


    // $ANTLR start "rule__NamespaceDeclaration__Group__2"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1000:1: rule__NamespaceDeclaration__Group__2 : rule__NamespaceDeclaration__Group__2__Impl rule__NamespaceDeclaration__Group__3 ;
    public final void rule__NamespaceDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1004:1: ( rule__NamespaceDeclaration__Group__2__Impl rule__NamespaceDeclaration__Group__3 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1005:2: rule__NamespaceDeclaration__Group__2__Impl rule__NamespaceDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group__2__Impl_in_rule__NamespaceDeclaration__Group__21986);
            rule__NamespaceDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group__3_in_rule__NamespaceDeclaration__Group__21989);
            rule__NamespaceDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamespaceDeclaration__Group__2"


    // $ANTLR start "rule__NamespaceDeclaration__Group__2__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1012:1: rule__NamespaceDeclaration__Group__2__Impl : ( ( rule__NamespaceDeclaration__UriAssignment_2 ) ) ;
    public final void rule__NamespaceDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1016:1: ( ( ( rule__NamespaceDeclaration__UriAssignment_2 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1017:1: ( ( rule__NamespaceDeclaration__UriAssignment_2 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1017:1: ( ( rule__NamespaceDeclaration__UriAssignment_2 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1018:1: ( rule__NamespaceDeclaration__UriAssignment_2 )
            {
             before(grammarAccess.getNamespaceDeclarationAccess().getUriAssignment_2()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1019:1: ( rule__NamespaceDeclaration__UriAssignment_2 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1019:2: rule__NamespaceDeclaration__UriAssignment_2
            {
            pushFollow(FOLLOW_rule__NamespaceDeclaration__UriAssignment_2_in_rule__NamespaceDeclaration__Group__2__Impl2016);
            rule__NamespaceDeclaration__UriAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNamespaceDeclarationAccess().getUriAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamespaceDeclaration__Group__2__Impl"


    // $ANTLR start "rule__NamespaceDeclaration__Group__3"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1029:1: rule__NamespaceDeclaration__Group__3 : rule__NamespaceDeclaration__Group__3__Impl ;
    public final void rule__NamespaceDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1033:1: ( rule__NamespaceDeclaration__Group__3__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1034:2: rule__NamespaceDeclaration__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group__3__Impl_in_rule__NamespaceDeclaration__Group__32046);
            rule__NamespaceDeclaration__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamespaceDeclaration__Group__3"


    // $ANTLR start "rule__NamespaceDeclaration__Group__3__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1040:1: rule__NamespaceDeclaration__Group__3__Impl : ( '.' ) ;
    public final void rule__NamespaceDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1044:1: ( ( '.' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1045:1: ( '.' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1045:1: ( '.' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1046:1: '.'
            {
             before(grammarAccess.getNamespaceDeclarationAccess().getFullStopKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__NamespaceDeclaration__Group__3__Impl2074); 
             after(grammarAccess.getNamespaceDeclarationAccess().getFullStopKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamespaceDeclaration__Group__3__Impl"


    // $ANTLR start "rule__NamespaceDeclaration__Group_1__0"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1067:1: rule__NamespaceDeclaration__Group_1__0 : rule__NamespaceDeclaration__Group_1__0__Impl rule__NamespaceDeclaration__Group_1__1 ;
    public final void rule__NamespaceDeclaration__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1071:1: ( rule__NamespaceDeclaration__Group_1__0__Impl rule__NamespaceDeclaration__Group_1__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1072:2: rule__NamespaceDeclaration__Group_1__0__Impl rule__NamespaceDeclaration__Group_1__1
            {
            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group_1__0__Impl_in_rule__NamespaceDeclaration__Group_1__02113);
            rule__NamespaceDeclaration__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group_1__1_in_rule__NamespaceDeclaration__Group_1__02116);
            rule__NamespaceDeclaration__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamespaceDeclaration__Group_1__0"


    // $ANTLR start "rule__NamespaceDeclaration__Group_1__0__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1079:1: rule__NamespaceDeclaration__Group_1__0__Impl : ( ( rule__NamespaceDeclaration__NameAssignment_1_0 ) ) ;
    public final void rule__NamespaceDeclaration__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1083:1: ( ( ( rule__NamespaceDeclaration__NameAssignment_1_0 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1084:1: ( ( rule__NamespaceDeclaration__NameAssignment_1_0 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1084:1: ( ( rule__NamespaceDeclaration__NameAssignment_1_0 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1085:1: ( rule__NamespaceDeclaration__NameAssignment_1_0 )
            {
             before(grammarAccess.getNamespaceDeclarationAccess().getNameAssignment_1_0()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1086:1: ( rule__NamespaceDeclaration__NameAssignment_1_0 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1086:2: rule__NamespaceDeclaration__NameAssignment_1_0
            {
            pushFollow(FOLLOW_rule__NamespaceDeclaration__NameAssignment_1_0_in_rule__NamespaceDeclaration__Group_1__0__Impl2143);
            rule__NamespaceDeclaration__NameAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getNamespaceDeclarationAccess().getNameAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamespaceDeclaration__Group_1__0__Impl"


    // $ANTLR start "rule__NamespaceDeclaration__Group_1__1"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1096:1: rule__NamespaceDeclaration__Group_1__1 : rule__NamespaceDeclaration__Group_1__1__Impl ;
    public final void rule__NamespaceDeclaration__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1100:1: ( rule__NamespaceDeclaration__Group_1__1__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1101:2: rule__NamespaceDeclaration__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group_1__1__Impl_in_rule__NamespaceDeclaration__Group_1__12173);
            rule__NamespaceDeclaration__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamespaceDeclaration__Group_1__1"


    // $ANTLR start "rule__NamespaceDeclaration__Group_1__1__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1107:1: rule__NamespaceDeclaration__Group_1__1__Impl : ( '=' ) ;
    public final void rule__NamespaceDeclaration__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1111:1: ( ( '=' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1112:1: ( '=' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1112:1: ( '=' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1113:1: '='
            {
             before(grammarAccess.getNamespaceDeclarationAccess().getEqualsSignKeyword_1_1()); 
            match(input,19,FOLLOW_19_in_rule__NamespaceDeclaration__Group_1__1__Impl2201); 
             after(grammarAccess.getNamespaceDeclarationAccess().getEqualsSignKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamespaceDeclaration__Group_1__1__Impl"


    // $ANTLR start "rule__SignatureDeclaration__Group__0"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1130:1: rule__SignatureDeclaration__Group__0 : rule__SignatureDeclaration__Group__0__Impl rule__SignatureDeclaration__Group__1 ;
    public final void rule__SignatureDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1134:1: ( rule__SignatureDeclaration__Group__0__Impl rule__SignatureDeclaration__Group__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1135:2: rule__SignatureDeclaration__Group__0__Impl rule__SignatureDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__SignatureDeclaration__Group__0__Impl_in_rule__SignatureDeclaration__Group__02236);
            rule__SignatureDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SignatureDeclaration__Group__1_in_rule__SignatureDeclaration__Group__02239);
            rule__SignatureDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignatureDeclaration__Group__0"


    // $ANTLR start "rule__SignatureDeclaration__Group__0__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1142:1: rule__SignatureDeclaration__Group__0__Impl : ( '%sig' ) ;
    public final void rule__SignatureDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1146:1: ( ( '%sig' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1147:1: ( '%sig' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1147:1: ( '%sig' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1148:1: '%sig'
            {
             before(grammarAccess.getSignatureDeclarationAccess().getSigKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__SignatureDeclaration__Group__0__Impl2267); 
             after(grammarAccess.getSignatureDeclarationAccess().getSigKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignatureDeclaration__Group__0__Impl"


    // $ANTLR start "rule__SignatureDeclaration__Group__1"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1161:1: rule__SignatureDeclaration__Group__1 : rule__SignatureDeclaration__Group__1__Impl rule__SignatureDeclaration__Group__2 ;
    public final void rule__SignatureDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1165:1: ( rule__SignatureDeclaration__Group__1__Impl rule__SignatureDeclaration__Group__2 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1166:2: rule__SignatureDeclaration__Group__1__Impl rule__SignatureDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__SignatureDeclaration__Group__1__Impl_in_rule__SignatureDeclaration__Group__12298);
            rule__SignatureDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SignatureDeclaration__Group__2_in_rule__SignatureDeclaration__Group__12301);
            rule__SignatureDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignatureDeclaration__Group__1"


    // $ANTLR start "rule__SignatureDeclaration__Group__1__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1173:1: rule__SignatureDeclaration__Group__1__Impl : ( ( rule__SignatureDeclaration__SigNameAssignment_1 ) ) ;
    public final void rule__SignatureDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1177:1: ( ( ( rule__SignatureDeclaration__SigNameAssignment_1 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1178:1: ( ( rule__SignatureDeclaration__SigNameAssignment_1 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1178:1: ( ( rule__SignatureDeclaration__SigNameAssignment_1 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1179:1: ( rule__SignatureDeclaration__SigNameAssignment_1 )
            {
             before(grammarAccess.getSignatureDeclarationAccess().getSigNameAssignment_1()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1180:1: ( rule__SignatureDeclaration__SigNameAssignment_1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1180:2: rule__SignatureDeclaration__SigNameAssignment_1
            {
            pushFollow(FOLLOW_rule__SignatureDeclaration__SigNameAssignment_1_in_rule__SignatureDeclaration__Group__1__Impl2328);
            rule__SignatureDeclaration__SigNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSignatureDeclarationAccess().getSigNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignatureDeclaration__Group__1__Impl"


    // $ANTLR start "rule__SignatureDeclaration__Group__2"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1190:1: rule__SignatureDeclaration__Group__2 : rule__SignatureDeclaration__Group__2__Impl rule__SignatureDeclaration__Group__3 ;
    public final void rule__SignatureDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1194:1: ( rule__SignatureDeclaration__Group__2__Impl rule__SignatureDeclaration__Group__3 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1195:2: rule__SignatureDeclaration__Group__2__Impl rule__SignatureDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__SignatureDeclaration__Group__2__Impl_in_rule__SignatureDeclaration__Group__22358);
            rule__SignatureDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SignatureDeclaration__Group__3_in_rule__SignatureDeclaration__Group__22361);
            rule__SignatureDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignatureDeclaration__Group__2"


    // $ANTLR start "rule__SignatureDeclaration__Group__2__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1202:1: rule__SignatureDeclaration__Group__2__Impl : ( '=' ) ;
    public final void rule__SignatureDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1206:1: ( ( '=' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1207:1: ( '=' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1207:1: ( '=' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1208:1: '='
            {
             before(grammarAccess.getSignatureDeclarationAccess().getEqualsSignKeyword_2()); 
            match(input,19,FOLLOW_19_in_rule__SignatureDeclaration__Group__2__Impl2389); 
             after(grammarAccess.getSignatureDeclarationAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignatureDeclaration__Group__2__Impl"


    // $ANTLR start "rule__SignatureDeclaration__Group__3"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1221:1: rule__SignatureDeclaration__Group__3 : rule__SignatureDeclaration__Group__3__Impl rule__SignatureDeclaration__Group__4 ;
    public final void rule__SignatureDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1225:1: ( rule__SignatureDeclaration__Group__3__Impl rule__SignatureDeclaration__Group__4 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1226:2: rule__SignatureDeclaration__Group__3__Impl rule__SignatureDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__SignatureDeclaration__Group__3__Impl_in_rule__SignatureDeclaration__Group__32420);
            rule__SignatureDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SignatureDeclaration__Group__4_in_rule__SignatureDeclaration__Group__32423);
            rule__SignatureDeclaration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignatureDeclaration__Group__3"


    // $ANTLR start "rule__SignatureDeclaration__Group__3__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1233:1: rule__SignatureDeclaration__Group__3__Impl : ( '{' ) ;
    public final void rule__SignatureDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1237:1: ( ( '{' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1238:1: ( '{' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1238:1: ( '{' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1239:1: '{'
            {
             before(grammarAccess.getSignatureDeclarationAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,21,FOLLOW_21_in_rule__SignatureDeclaration__Group__3__Impl2451); 
             after(grammarAccess.getSignatureDeclarationAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignatureDeclaration__Group__3__Impl"


    // $ANTLR start "rule__SignatureDeclaration__Group__4"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1252:1: rule__SignatureDeclaration__Group__4 : rule__SignatureDeclaration__Group__4__Impl rule__SignatureDeclaration__Group__5 ;
    public final void rule__SignatureDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1256:1: ( rule__SignatureDeclaration__Group__4__Impl rule__SignatureDeclaration__Group__5 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1257:2: rule__SignatureDeclaration__Group__4__Impl rule__SignatureDeclaration__Group__5
            {
            pushFollow(FOLLOW_rule__SignatureDeclaration__Group__4__Impl_in_rule__SignatureDeclaration__Group__42482);
            rule__SignatureDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SignatureDeclaration__Group__5_in_rule__SignatureDeclaration__Group__42485);
            rule__SignatureDeclaration__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignatureDeclaration__Group__4"


    // $ANTLR start "rule__SignatureDeclaration__Group__4__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1264:1: rule__SignatureDeclaration__Group__4__Impl : ( ( rule__SignatureDeclaration__SigDefinitionsAssignment_4 )* ) ;
    public final void rule__SignatureDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1268:1: ( ( ( rule__SignatureDeclaration__SigDefinitionsAssignment_4 )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1269:1: ( ( rule__SignatureDeclaration__SigDefinitionsAssignment_4 )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1269:1: ( ( rule__SignatureDeclaration__SigDefinitionsAssignment_4 )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1270:1: ( rule__SignatureDeclaration__SigDefinitionsAssignment_4 )*
            {
             before(grammarAccess.getSignatureDeclarationAccess().getSigDefinitionsAssignment_4()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1271:1: ( rule__SignatureDeclaration__SigDefinitionsAssignment_4 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||(LA9_0>=23 && LA9_0<=24)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1271:2: rule__SignatureDeclaration__SigDefinitionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__SignatureDeclaration__SigDefinitionsAssignment_4_in_rule__SignatureDeclaration__Group__4__Impl2512);
            	    rule__SignatureDeclaration__SigDefinitionsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getSignatureDeclarationAccess().getSigDefinitionsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignatureDeclaration__Group__4__Impl"


    // $ANTLR start "rule__SignatureDeclaration__Group__5"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1281:1: rule__SignatureDeclaration__Group__5 : rule__SignatureDeclaration__Group__5__Impl rule__SignatureDeclaration__Group__6 ;
    public final void rule__SignatureDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1285:1: ( rule__SignatureDeclaration__Group__5__Impl rule__SignatureDeclaration__Group__6 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1286:2: rule__SignatureDeclaration__Group__5__Impl rule__SignatureDeclaration__Group__6
            {
            pushFollow(FOLLOW_rule__SignatureDeclaration__Group__5__Impl_in_rule__SignatureDeclaration__Group__52543);
            rule__SignatureDeclaration__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SignatureDeclaration__Group__6_in_rule__SignatureDeclaration__Group__52546);
            rule__SignatureDeclaration__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignatureDeclaration__Group__5"


    // $ANTLR start "rule__SignatureDeclaration__Group__5__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1293:1: rule__SignatureDeclaration__Group__5__Impl : ( '}' ) ;
    public final void rule__SignatureDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1297:1: ( ( '}' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1298:1: ( '}' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1298:1: ( '}' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1299:1: '}'
            {
             before(grammarAccess.getSignatureDeclarationAccess().getRightCurlyBracketKeyword_5()); 
            match(input,22,FOLLOW_22_in_rule__SignatureDeclaration__Group__5__Impl2574); 
             after(grammarAccess.getSignatureDeclarationAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignatureDeclaration__Group__5__Impl"


    // $ANTLR start "rule__SignatureDeclaration__Group__6"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1312:1: rule__SignatureDeclaration__Group__6 : rule__SignatureDeclaration__Group__6__Impl ;
    public final void rule__SignatureDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1316:1: ( rule__SignatureDeclaration__Group__6__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1317:2: rule__SignatureDeclaration__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__SignatureDeclaration__Group__6__Impl_in_rule__SignatureDeclaration__Group__62605);
            rule__SignatureDeclaration__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignatureDeclaration__Group__6"


    // $ANTLR start "rule__SignatureDeclaration__Group__6__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1323:1: rule__SignatureDeclaration__Group__6__Impl : ( '.' ) ;
    public final void rule__SignatureDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1327:1: ( ( '.' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1328:1: ( '.' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1328:1: ( '.' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1329:1: '.'
            {
             before(grammarAccess.getSignatureDeclarationAccess().getFullStopKeyword_6()); 
            match(input,13,FOLLOW_13_in_rule__SignatureDeclaration__Group__6__Impl2633); 
             after(grammarAccess.getSignatureDeclarationAccess().getFullStopKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignatureDeclaration__Group__6__Impl"


    // $ANTLR start "rule__SigDefinitions__Group_0__0"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1356:1: rule__SigDefinitions__Group_0__0 : rule__SigDefinitions__Group_0__0__Impl rule__SigDefinitions__Group_0__1 ;
    public final void rule__SigDefinitions__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1360:1: ( rule__SigDefinitions__Group_0__0__Impl rule__SigDefinitions__Group_0__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1361:2: rule__SigDefinitions__Group_0__0__Impl rule__SigDefinitions__Group_0__1
            {
            pushFollow(FOLLOW_rule__SigDefinitions__Group_0__0__Impl_in_rule__SigDefinitions__Group_0__02678);
            rule__SigDefinitions__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SigDefinitions__Group_0__1_in_rule__SigDefinitions__Group_0__02681);
            rule__SigDefinitions__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SigDefinitions__Group_0__0"


    // $ANTLR start "rule__SigDefinitions__Group_0__0__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1368:1: rule__SigDefinitions__Group_0__0__Impl : ( ( rule__SigDefinitions__SymbNameAssignment_0_0 ) ) ;
    public final void rule__SigDefinitions__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1372:1: ( ( ( rule__SigDefinitions__SymbNameAssignment_0_0 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1373:1: ( ( rule__SigDefinitions__SymbNameAssignment_0_0 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1373:1: ( ( rule__SigDefinitions__SymbNameAssignment_0_0 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1374:1: ( rule__SigDefinitions__SymbNameAssignment_0_0 )
            {
             before(grammarAccess.getSigDefinitionsAccess().getSymbNameAssignment_0_0()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1375:1: ( rule__SigDefinitions__SymbNameAssignment_0_0 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1375:2: rule__SigDefinitions__SymbNameAssignment_0_0
            {
            pushFollow(FOLLOW_rule__SigDefinitions__SymbNameAssignment_0_0_in_rule__SigDefinitions__Group_0__0__Impl2708);
            rule__SigDefinitions__SymbNameAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getSigDefinitionsAccess().getSymbNameAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SigDefinitions__Group_0__0__Impl"


    // $ANTLR start "rule__SigDefinitions__Group_0__1"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1385:1: rule__SigDefinitions__Group_0__1 : rule__SigDefinitions__Group_0__1__Impl rule__SigDefinitions__Group_0__2 ;
    public final void rule__SigDefinitions__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1389:1: ( rule__SigDefinitions__Group_0__1__Impl rule__SigDefinitions__Group_0__2 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1390:2: rule__SigDefinitions__Group_0__1__Impl rule__SigDefinitions__Group_0__2
            {
            pushFollow(FOLLOW_rule__SigDefinitions__Group_0__1__Impl_in_rule__SigDefinitions__Group_0__12738);
            rule__SigDefinitions__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SigDefinitions__Group_0__2_in_rule__SigDefinitions__Group_0__12741);
            rule__SigDefinitions__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SigDefinitions__Group_0__1"


    // $ANTLR start "rule__SigDefinitions__Group_0__1__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1397:1: rule__SigDefinitions__Group_0__1__Impl : ( ( rule__SigDefinitions__Alternatives_0_1 ) ) ;
    public final void rule__SigDefinitions__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1401:1: ( ( ( rule__SigDefinitions__Alternatives_0_1 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1402:1: ( ( rule__SigDefinitions__Alternatives_0_1 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1402:1: ( ( rule__SigDefinitions__Alternatives_0_1 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1403:1: ( rule__SigDefinitions__Alternatives_0_1 )
            {
             before(grammarAccess.getSigDefinitionsAccess().getAlternatives_0_1()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1404:1: ( rule__SigDefinitions__Alternatives_0_1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1404:2: rule__SigDefinitions__Alternatives_0_1
            {
            pushFollow(FOLLOW_rule__SigDefinitions__Alternatives_0_1_in_rule__SigDefinitions__Group_0__1__Impl2768);
            rule__SigDefinitions__Alternatives_0_1();

            state._fsp--;


            }

             after(grammarAccess.getSigDefinitionsAccess().getAlternatives_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SigDefinitions__Group_0__1__Impl"


    // $ANTLR start "rule__SigDefinitions__Group_0__2"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1414:1: rule__SigDefinitions__Group_0__2 : rule__SigDefinitions__Group_0__2__Impl rule__SigDefinitions__Group_0__3 ;
    public final void rule__SigDefinitions__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1418:1: ( rule__SigDefinitions__Group_0__2__Impl rule__SigDefinitions__Group_0__3 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1419:2: rule__SigDefinitions__Group_0__2__Impl rule__SigDefinitions__Group_0__3
            {
            pushFollow(FOLLOW_rule__SigDefinitions__Group_0__2__Impl_in_rule__SigDefinitions__Group_0__22798);
            rule__SigDefinitions__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SigDefinitions__Group_0__3_in_rule__SigDefinitions__Group_0__22801);
            rule__SigDefinitions__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SigDefinitions__Group_0__2"


    // $ANTLR start "rule__SigDefinitions__Group_0__2__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1426:1: rule__SigDefinitions__Group_0__2__Impl : ( ( rule__SigDefinitions__Group_0_2__0 )? ) ;
    public final void rule__SigDefinitions__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1430:1: ( ( ( rule__SigDefinitions__Group_0_2__0 )? ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1431:1: ( ( rule__SigDefinitions__Group_0_2__0 )? )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1431:1: ( ( rule__SigDefinitions__Group_0_2__0 )? )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1432:1: ( rule__SigDefinitions__Group_0_2__0 )?
            {
             before(grammarAccess.getSigDefinitionsAccess().getGroup_0_2()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1433:1: ( rule__SigDefinitions__Group_0_2__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==19) ) {
                    alt10=1;
                }
            }
            switch (alt10) {
                case 1 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1433:2: rule__SigDefinitions__Group_0_2__0
                    {
                    pushFollow(FOLLOW_rule__SigDefinitions__Group_0_2__0_in_rule__SigDefinitions__Group_0__2__Impl2828);
                    rule__SigDefinitions__Group_0_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSigDefinitionsAccess().getGroup_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SigDefinitions__Group_0__2__Impl"


    // $ANTLR start "rule__SigDefinitions__Group_0__3"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1443:1: rule__SigDefinitions__Group_0__3 : rule__SigDefinitions__Group_0__3__Impl rule__SigDefinitions__Group_0__4 ;
    public final void rule__SigDefinitions__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1447:1: ( rule__SigDefinitions__Group_0__3__Impl rule__SigDefinitions__Group_0__4 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1448:2: rule__SigDefinitions__Group_0__3__Impl rule__SigDefinitions__Group_0__4
            {
            pushFollow(FOLLOW_rule__SigDefinitions__Group_0__3__Impl_in_rule__SigDefinitions__Group_0__32859);
            rule__SigDefinitions__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SigDefinitions__Group_0__4_in_rule__SigDefinitions__Group_0__32862);
            rule__SigDefinitions__Group_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SigDefinitions__Group_0__3"


    // $ANTLR start "rule__SigDefinitions__Group_0__3__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1455:1: rule__SigDefinitions__Group_0__3__Impl : ( ruleNAMESPACE ) ;
    public final void rule__SigDefinitions__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1459:1: ( ( ruleNAMESPACE ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1460:1: ( ruleNAMESPACE )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1460:1: ( ruleNAMESPACE )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1461:1: ruleNAMESPACE
            {
             before(grammarAccess.getSigDefinitionsAccess().getNAMESPACEParserRuleCall_0_3()); 
            pushFollow(FOLLOW_ruleNAMESPACE_in_rule__SigDefinitions__Group_0__3__Impl2889);
            ruleNAMESPACE();

            state._fsp--;

             after(grammarAccess.getSigDefinitionsAccess().getNAMESPACEParserRuleCall_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SigDefinitions__Group_0__3__Impl"


    // $ANTLR start "rule__SigDefinitions__Group_0__4"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1472:1: rule__SigDefinitions__Group_0__4 : rule__SigDefinitions__Group_0__4__Impl ;
    public final void rule__SigDefinitions__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1476:1: ( rule__SigDefinitions__Group_0__4__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1477:2: rule__SigDefinitions__Group_0__4__Impl
            {
            pushFollow(FOLLOW_rule__SigDefinitions__Group_0__4__Impl_in_rule__SigDefinitions__Group_0__42918);
            rule__SigDefinitions__Group_0__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SigDefinitions__Group_0__4"


    // $ANTLR start "rule__SigDefinitions__Group_0__4__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1483:1: rule__SigDefinitions__Group_0__4__Impl : ( '.' ) ;
    public final void rule__SigDefinitions__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1487:1: ( ( '.' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1488:1: ( '.' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1488:1: ( '.' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1489:1: '.'
            {
             before(grammarAccess.getSigDefinitionsAccess().getFullStopKeyword_0_4()); 
            match(input,13,FOLLOW_13_in_rule__SigDefinitions__Group_0__4__Impl2946); 
             after(grammarAccess.getSigDefinitionsAccess().getFullStopKeyword_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SigDefinitions__Group_0__4__Impl"


    // $ANTLR start "rule__SigDefinitions__Group_0_2__0"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1512:1: rule__SigDefinitions__Group_0_2__0 : rule__SigDefinitions__Group_0_2__0__Impl rule__SigDefinitions__Group_0_2__1 ;
    public final void rule__SigDefinitions__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1516:1: ( rule__SigDefinitions__Group_0_2__0__Impl rule__SigDefinitions__Group_0_2__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1517:2: rule__SigDefinitions__Group_0_2__0__Impl rule__SigDefinitions__Group_0_2__1
            {
            pushFollow(FOLLOW_rule__SigDefinitions__Group_0_2__0__Impl_in_rule__SigDefinitions__Group_0_2__02987);
            rule__SigDefinitions__Group_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SigDefinitions__Group_0_2__1_in_rule__SigDefinitions__Group_0_2__02990);
            rule__SigDefinitions__Group_0_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SigDefinitions__Group_0_2__0"


    // $ANTLR start "rule__SigDefinitions__Group_0_2__0__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1524:1: rule__SigDefinitions__Group_0_2__0__Impl : ( ( rule__SigDefinitions__TypeAssignment_0_2_0 ) ) ;
    public final void rule__SigDefinitions__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1528:1: ( ( ( rule__SigDefinitions__TypeAssignment_0_2_0 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1529:1: ( ( rule__SigDefinitions__TypeAssignment_0_2_0 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1529:1: ( ( rule__SigDefinitions__TypeAssignment_0_2_0 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1530:1: ( rule__SigDefinitions__TypeAssignment_0_2_0 )
            {
             before(grammarAccess.getSigDefinitionsAccess().getTypeAssignment_0_2_0()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1531:1: ( rule__SigDefinitions__TypeAssignment_0_2_0 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1531:2: rule__SigDefinitions__TypeAssignment_0_2_0
            {
            pushFollow(FOLLOW_rule__SigDefinitions__TypeAssignment_0_2_0_in_rule__SigDefinitions__Group_0_2__0__Impl3017);
            rule__SigDefinitions__TypeAssignment_0_2_0();

            state._fsp--;


            }

             after(grammarAccess.getSigDefinitionsAccess().getTypeAssignment_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SigDefinitions__Group_0_2__0__Impl"


    // $ANTLR start "rule__SigDefinitions__Group_0_2__1"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1541:1: rule__SigDefinitions__Group_0_2__1 : rule__SigDefinitions__Group_0_2__1__Impl ;
    public final void rule__SigDefinitions__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1545:1: ( rule__SigDefinitions__Group_0_2__1__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1546:2: rule__SigDefinitions__Group_0_2__1__Impl
            {
            pushFollow(FOLLOW_rule__SigDefinitions__Group_0_2__1__Impl_in_rule__SigDefinitions__Group_0_2__13047);
            rule__SigDefinitions__Group_0_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SigDefinitions__Group_0_2__1"


    // $ANTLR start "rule__SigDefinitions__Group_0_2__1__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1552:1: rule__SigDefinitions__Group_0_2__1__Impl : ( '=' ) ;
    public final void rule__SigDefinitions__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1556:1: ( ( '=' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1557:1: ( '=' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1557:1: ( '=' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1558:1: '='
            {
             before(grammarAccess.getSigDefinitionsAccess().getEqualsSignKeyword_0_2_1()); 
            match(input,19,FOLLOW_19_in_rule__SigDefinitions__Group_0_2__1__Impl3075); 
             after(grammarAccess.getSigDefinitionsAccess().getEqualsSignKeyword_0_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SigDefinitions__Group_0_2__1__Impl"


    // $ANTLR start "rule__SigDefinitions__Group_1__0"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1575:1: rule__SigDefinitions__Group_1__0 : rule__SigDefinitions__Group_1__0__Impl rule__SigDefinitions__Group_1__1 ;
    public final void rule__SigDefinitions__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1579:1: ( rule__SigDefinitions__Group_1__0__Impl rule__SigDefinitions__Group_1__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1580:2: rule__SigDefinitions__Group_1__0__Impl rule__SigDefinitions__Group_1__1
            {
            pushFollow(FOLLOW_rule__SigDefinitions__Group_1__0__Impl_in_rule__SigDefinitions__Group_1__03110);
            rule__SigDefinitions__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SigDefinitions__Group_1__1_in_rule__SigDefinitions__Group_1__03113);
            rule__SigDefinitions__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SigDefinitions__Group_1__0"


    // $ANTLR start "rule__SigDefinitions__Group_1__0__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1587:1: rule__SigDefinitions__Group_1__0__Impl : ( '%include' ) ;
    public final void rule__SigDefinitions__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1591:1: ( ( '%include' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1592:1: ( '%include' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1592:1: ( '%include' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1593:1: '%include'
            {
             before(grammarAccess.getSigDefinitionsAccess().getIncludeKeyword_1_0()); 
            match(input,23,FOLLOW_23_in_rule__SigDefinitions__Group_1__0__Impl3141); 
             after(grammarAccess.getSigDefinitionsAccess().getIncludeKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SigDefinitions__Group_1__0__Impl"


    // $ANTLR start "rule__SigDefinitions__Group_1__1"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1606:1: rule__SigDefinitions__Group_1__1 : rule__SigDefinitions__Group_1__1__Impl rule__SigDefinitions__Group_1__2 ;
    public final void rule__SigDefinitions__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1610:1: ( rule__SigDefinitions__Group_1__1__Impl rule__SigDefinitions__Group_1__2 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1611:2: rule__SigDefinitions__Group_1__1__Impl rule__SigDefinitions__Group_1__2
            {
            pushFollow(FOLLOW_rule__SigDefinitions__Group_1__1__Impl_in_rule__SigDefinitions__Group_1__13172);
            rule__SigDefinitions__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SigDefinitions__Group_1__2_in_rule__SigDefinitions__Group_1__13175);
            rule__SigDefinitions__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SigDefinitions__Group_1__1"


    // $ANTLR start "rule__SigDefinitions__Group_1__1__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1618:1: rule__SigDefinitions__Group_1__1__Impl : ( ( rule__SigDefinitions__NamespaceAssignment_1_1 ) ) ;
    public final void rule__SigDefinitions__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1622:1: ( ( ( rule__SigDefinitions__NamespaceAssignment_1_1 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1623:1: ( ( rule__SigDefinitions__NamespaceAssignment_1_1 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1623:1: ( ( rule__SigDefinitions__NamespaceAssignment_1_1 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1624:1: ( rule__SigDefinitions__NamespaceAssignment_1_1 )
            {
             before(grammarAccess.getSigDefinitionsAccess().getNamespaceAssignment_1_1()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1625:1: ( rule__SigDefinitions__NamespaceAssignment_1_1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1625:2: rule__SigDefinitions__NamespaceAssignment_1_1
            {
            pushFollow(FOLLOW_rule__SigDefinitions__NamespaceAssignment_1_1_in_rule__SigDefinitions__Group_1__1__Impl3202);
            rule__SigDefinitions__NamespaceAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSigDefinitionsAccess().getNamespaceAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SigDefinitions__Group_1__1__Impl"


    // $ANTLR start "rule__SigDefinitions__Group_1__2"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1635:1: rule__SigDefinitions__Group_1__2 : rule__SigDefinitions__Group_1__2__Impl ;
    public final void rule__SigDefinitions__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1639:1: ( rule__SigDefinitions__Group_1__2__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1640:2: rule__SigDefinitions__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__SigDefinitions__Group_1__2__Impl_in_rule__SigDefinitions__Group_1__23232);
            rule__SigDefinitions__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SigDefinitions__Group_1__2"


    // $ANTLR start "rule__SigDefinitions__Group_1__2__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1646:1: rule__SigDefinitions__Group_1__2__Impl : ( '.' ) ;
    public final void rule__SigDefinitions__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1650:1: ( ( '.' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1651:1: ( '.' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1651:1: ( '.' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1652:1: '.'
            {
             before(grammarAccess.getSigDefinitionsAccess().getFullStopKeyword_1_2()); 
            match(input,13,FOLLOW_13_in_rule__SigDefinitions__Group_1__2__Impl3260); 
             after(grammarAccess.getSigDefinitionsAccess().getFullStopKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SigDefinitions__Group_1__2__Impl"


    // $ANTLR start "rule__SigDefinitions__Group_2__0"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1671:1: rule__SigDefinitions__Group_2__0 : rule__SigDefinitions__Group_2__0__Impl rule__SigDefinitions__Group_2__1 ;
    public final void rule__SigDefinitions__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1675:1: ( rule__SigDefinitions__Group_2__0__Impl rule__SigDefinitions__Group_2__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1676:2: rule__SigDefinitions__Group_2__0__Impl rule__SigDefinitions__Group_2__1
            {
            pushFollow(FOLLOW_rule__SigDefinitions__Group_2__0__Impl_in_rule__SigDefinitions__Group_2__03297);
            rule__SigDefinitions__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SigDefinitions__Group_2__1_in_rule__SigDefinitions__Group_2__03300);
            rule__SigDefinitions__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SigDefinitions__Group_2__0"


    // $ANTLR start "rule__SigDefinitions__Group_2__0__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1683:1: rule__SigDefinitions__Group_2__0__Impl : ( '%struct' ) ;
    public final void rule__SigDefinitions__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1687:1: ( ( '%struct' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1688:1: ( '%struct' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1688:1: ( '%struct' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1689:1: '%struct'
            {
             before(grammarAccess.getSigDefinitionsAccess().getStructKeyword_2_0()); 
            match(input,24,FOLLOW_24_in_rule__SigDefinitions__Group_2__0__Impl3328); 
             after(grammarAccess.getSigDefinitionsAccess().getStructKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SigDefinitions__Group_2__0__Impl"


    // $ANTLR start "rule__SigDefinitions__Group_2__1"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1702:1: rule__SigDefinitions__Group_2__1 : rule__SigDefinitions__Group_2__1__Impl rule__SigDefinitions__Group_2__2 ;
    public final void rule__SigDefinitions__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1706:1: ( rule__SigDefinitions__Group_2__1__Impl rule__SigDefinitions__Group_2__2 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1707:2: rule__SigDefinitions__Group_2__1__Impl rule__SigDefinitions__Group_2__2
            {
            pushFollow(FOLLOW_rule__SigDefinitions__Group_2__1__Impl_in_rule__SigDefinitions__Group_2__13359);
            rule__SigDefinitions__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SigDefinitions__Group_2__2_in_rule__SigDefinitions__Group_2__13362);
            rule__SigDefinitions__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SigDefinitions__Group_2__1"


    // $ANTLR start "rule__SigDefinitions__Group_2__1__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1714:1: rule__SigDefinitions__Group_2__1__Impl : ( ( rule__SigDefinitions__StructNameAssignment_2_1 ) ) ;
    public final void rule__SigDefinitions__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1718:1: ( ( ( rule__SigDefinitions__StructNameAssignment_2_1 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1719:1: ( ( rule__SigDefinitions__StructNameAssignment_2_1 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1719:1: ( ( rule__SigDefinitions__StructNameAssignment_2_1 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1720:1: ( rule__SigDefinitions__StructNameAssignment_2_1 )
            {
             before(grammarAccess.getSigDefinitionsAccess().getStructNameAssignment_2_1()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1721:1: ( rule__SigDefinitions__StructNameAssignment_2_1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1721:2: rule__SigDefinitions__StructNameAssignment_2_1
            {
            pushFollow(FOLLOW_rule__SigDefinitions__StructNameAssignment_2_1_in_rule__SigDefinitions__Group_2__1__Impl3389);
            rule__SigDefinitions__StructNameAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSigDefinitionsAccess().getStructNameAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SigDefinitions__Group_2__1__Impl"


    // $ANTLR start "rule__SigDefinitions__Group_2__2"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1731:1: rule__SigDefinitions__Group_2__2 : rule__SigDefinitions__Group_2__2__Impl rule__SigDefinitions__Group_2__3 ;
    public final void rule__SigDefinitions__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1735:1: ( rule__SigDefinitions__Group_2__2__Impl rule__SigDefinitions__Group_2__3 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1736:2: rule__SigDefinitions__Group_2__2__Impl rule__SigDefinitions__Group_2__3
            {
            pushFollow(FOLLOW_rule__SigDefinitions__Group_2__2__Impl_in_rule__SigDefinitions__Group_2__23419);
            rule__SigDefinitions__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SigDefinitions__Group_2__3_in_rule__SigDefinitions__Group_2__23422);
            rule__SigDefinitions__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SigDefinitions__Group_2__2"


    // $ANTLR start "rule__SigDefinitions__Group_2__2__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1743:1: rule__SigDefinitions__Group_2__2__Impl : ( ':' ) ;
    public final void rule__SigDefinitions__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1747:1: ( ( ':' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1748:1: ( ':' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1748:1: ( ':' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1749:1: ':'
            {
             before(grammarAccess.getSigDefinitionsAccess().getColonKeyword_2_2()); 
            match(input,11,FOLLOW_11_in_rule__SigDefinitions__Group_2__2__Impl3450); 
             after(grammarAccess.getSigDefinitionsAccess().getColonKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SigDefinitions__Group_2__2__Impl"


    // $ANTLR start "rule__SigDefinitions__Group_2__3"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1762:1: rule__SigDefinitions__Group_2__3 : rule__SigDefinitions__Group_2__3__Impl rule__SigDefinitions__Group_2__4 ;
    public final void rule__SigDefinitions__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1766:1: ( rule__SigDefinitions__Group_2__3__Impl rule__SigDefinitions__Group_2__4 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1767:2: rule__SigDefinitions__Group_2__3__Impl rule__SigDefinitions__Group_2__4
            {
            pushFollow(FOLLOW_rule__SigDefinitions__Group_2__3__Impl_in_rule__SigDefinitions__Group_2__33481);
            rule__SigDefinitions__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SigDefinitions__Group_2__4_in_rule__SigDefinitions__Group_2__33484);
            rule__SigDefinitions__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SigDefinitions__Group_2__3"


    // $ANTLR start "rule__SigDefinitions__Group_2__3__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1774:1: rule__SigDefinitions__Group_2__3__Impl : ( ( rule__SigDefinitions__NamespaceAssignment_2_3 ) ) ;
    public final void rule__SigDefinitions__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1778:1: ( ( ( rule__SigDefinitions__NamespaceAssignment_2_3 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1779:1: ( ( rule__SigDefinitions__NamespaceAssignment_2_3 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1779:1: ( ( rule__SigDefinitions__NamespaceAssignment_2_3 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1780:1: ( rule__SigDefinitions__NamespaceAssignment_2_3 )
            {
             before(grammarAccess.getSigDefinitionsAccess().getNamespaceAssignment_2_3()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1781:1: ( rule__SigDefinitions__NamespaceAssignment_2_3 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1781:2: rule__SigDefinitions__NamespaceAssignment_2_3
            {
            pushFollow(FOLLOW_rule__SigDefinitions__NamespaceAssignment_2_3_in_rule__SigDefinitions__Group_2__3__Impl3511);
            rule__SigDefinitions__NamespaceAssignment_2_3();

            state._fsp--;


            }

             after(grammarAccess.getSigDefinitionsAccess().getNamespaceAssignment_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SigDefinitions__Group_2__3__Impl"


    // $ANTLR start "rule__SigDefinitions__Group_2__4"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1791:1: rule__SigDefinitions__Group_2__4 : rule__SigDefinitions__Group_2__4__Impl ;
    public final void rule__SigDefinitions__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1795:1: ( rule__SigDefinitions__Group_2__4__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1796:2: rule__SigDefinitions__Group_2__4__Impl
            {
            pushFollow(FOLLOW_rule__SigDefinitions__Group_2__4__Impl_in_rule__SigDefinitions__Group_2__43541);
            rule__SigDefinitions__Group_2__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SigDefinitions__Group_2__4"


    // $ANTLR start "rule__SigDefinitions__Group_2__4__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1802:1: rule__SigDefinitions__Group_2__4__Impl : ( '.' ) ;
    public final void rule__SigDefinitions__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1806:1: ( ( '.' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1807:1: ( '.' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1807:1: ( '.' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1808:1: '.'
            {
             before(grammarAccess.getSigDefinitionsAccess().getFullStopKeyword_2_4()); 
            match(input,13,FOLLOW_13_in_rule__SigDefinitions__Group_2__4__Impl3569); 
             after(grammarAccess.getSigDefinitionsAccess().getFullStopKeyword_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SigDefinitions__Group_2__4__Impl"


    // $ANTLR start "rule__ViewDeclaration__Group__0"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1831:1: rule__ViewDeclaration__Group__0 : rule__ViewDeclaration__Group__0__Impl rule__ViewDeclaration__Group__1 ;
    public final void rule__ViewDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1835:1: ( rule__ViewDeclaration__Group__0__Impl rule__ViewDeclaration__Group__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1836:2: rule__ViewDeclaration__Group__0__Impl rule__ViewDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__Group__0__Impl_in_rule__ViewDeclaration__Group__03610);
            rule__ViewDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ViewDeclaration__Group__1_in_rule__ViewDeclaration__Group__03613);
            rule__ViewDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewDeclaration__Group__0"


    // $ANTLR start "rule__ViewDeclaration__Group__0__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1843:1: rule__ViewDeclaration__Group__0__Impl : ( '%view' ) ;
    public final void rule__ViewDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1847:1: ( ( '%view' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1848:1: ( '%view' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1848:1: ( '%view' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1849:1: '%view'
            {
             before(grammarAccess.getViewDeclarationAccess().getViewKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__ViewDeclaration__Group__0__Impl3641); 
             after(grammarAccess.getViewDeclarationAccess().getViewKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewDeclaration__Group__0__Impl"


    // $ANTLR start "rule__ViewDeclaration__Group__1"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1862:1: rule__ViewDeclaration__Group__1 : rule__ViewDeclaration__Group__1__Impl rule__ViewDeclaration__Group__2 ;
    public final void rule__ViewDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1866:1: ( rule__ViewDeclaration__Group__1__Impl rule__ViewDeclaration__Group__2 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1867:2: rule__ViewDeclaration__Group__1__Impl rule__ViewDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__Group__1__Impl_in_rule__ViewDeclaration__Group__13672);
            rule__ViewDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ViewDeclaration__Group__2_in_rule__ViewDeclaration__Group__13675);
            rule__ViewDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewDeclaration__Group__1"


    // $ANTLR start "rule__ViewDeclaration__Group__1__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1874:1: rule__ViewDeclaration__Group__1__Impl : ( ( rule__ViewDeclaration__ViewIDAssignment_1 ) ) ;
    public final void rule__ViewDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1878:1: ( ( ( rule__ViewDeclaration__ViewIDAssignment_1 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1879:1: ( ( rule__ViewDeclaration__ViewIDAssignment_1 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1879:1: ( ( rule__ViewDeclaration__ViewIDAssignment_1 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1880:1: ( rule__ViewDeclaration__ViewIDAssignment_1 )
            {
             before(grammarAccess.getViewDeclarationAccess().getViewIDAssignment_1()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1881:1: ( rule__ViewDeclaration__ViewIDAssignment_1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1881:2: rule__ViewDeclaration__ViewIDAssignment_1
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__ViewIDAssignment_1_in_rule__ViewDeclaration__Group__1__Impl3702);
            rule__ViewDeclaration__ViewIDAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getViewDeclarationAccess().getViewIDAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewDeclaration__Group__1__Impl"


    // $ANTLR start "rule__ViewDeclaration__Group__2"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1891:1: rule__ViewDeclaration__Group__2 : rule__ViewDeclaration__Group__2__Impl rule__ViewDeclaration__Group__3 ;
    public final void rule__ViewDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1895:1: ( rule__ViewDeclaration__Group__2__Impl rule__ViewDeclaration__Group__3 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1896:2: rule__ViewDeclaration__Group__2__Impl rule__ViewDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__Group__2__Impl_in_rule__ViewDeclaration__Group__23732);
            rule__ViewDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ViewDeclaration__Group__3_in_rule__ViewDeclaration__Group__23735);
            rule__ViewDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewDeclaration__Group__2"


    // $ANTLR start "rule__ViewDeclaration__Group__2__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1903:1: rule__ViewDeclaration__Group__2__Impl : ( ':' ) ;
    public final void rule__ViewDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1907:1: ( ( ':' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1908:1: ( ':' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1908:1: ( ':' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1909:1: ':'
            {
             before(grammarAccess.getViewDeclarationAccess().getColonKeyword_2()); 
            match(input,11,FOLLOW_11_in_rule__ViewDeclaration__Group__2__Impl3763); 
             after(grammarAccess.getViewDeclarationAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewDeclaration__Group__2__Impl"


    // $ANTLR start "rule__ViewDeclaration__Group__3"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1922:1: rule__ViewDeclaration__Group__3 : rule__ViewDeclaration__Group__3__Impl rule__ViewDeclaration__Group__4 ;
    public final void rule__ViewDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1926:1: ( rule__ViewDeclaration__Group__3__Impl rule__ViewDeclaration__Group__4 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1927:2: rule__ViewDeclaration__Group__3__Impl rule__ViewDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__Group__3__Impl_in_rule__ViewDeclaration__Group__33794);
            rule__ViewDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ViewDeclaration__Group__4_in_rule__ViewDeclaration__Group__33797);
            rule__ViewDeclaration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewDeclaration__Group__3"


    // $ANTLR start "rule__ViewDeclaration__Group__3__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1934:1: rule__ViewDeclaration__Group__3__Impl : ( ( rule__ViewDeclaration__FromAssignment_3 ) ) ;
    public final void rule__ViewDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1938:1: ( ( ( rule__ViewDeclaration__FromAssignment_3 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1939:1: ( ( rule__ViewDeclaration__FromAssignment_3 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1939:1: ( ( rule__ViewDeclaration__FromAssignment_3 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1940:1: ( rule__ViewDeclaration__FromAssignment_3 )
            {
             before(grammarAccess.getViewDeclarationAccess().getFromAssignment_3()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1941:1: ( rule__ViewDeclaration__FromAssignment_3 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1941:2: rule__ViewDeclaration__FromAssignment_3
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__FromAssignment_3_in_rule__ViewDeclaration__Group__3__Impl3824);
            rule__ViewDeclaration__FromAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getViewDeclarationAccess().getFromAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewDeclaration__Group__3__Impl"


    // $ANTLR start "rule__ViewDeclaration__Group__4"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1951:1: rule__ViewDeclaration__Group__4 : rule__ViewDeclaration__Group__4__Impl rule__ViewDeclaration__Group__5 ;
    public final void rule__ViewDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1955:1: ( rule__ViewDeclaration__Group__4__Impl rule__ViewDeclaration__Group__5 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1956:2: rule__ViewDeclaration__Group__4__Impl rule__ViewDeclaration__Group__5
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__Group__4__Impl_in_rule__ViewDeclaration__Group__43854);
            rule__ViewDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ViewDeclaration__Group__5_in_rule__ViewDeclaration__Group__43857);
            rule__ViewDeclaration__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewDeclaration__Group__4"


    // $ANTLR start "rule__ViewDeclaration__Group__4__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1963:1: rule__ViewDeclaration__Group__4__Impl : ( '->' ) ;
    public final void rule__ViewDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1967:1: ( ( '->' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1968:1: ( '->' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1968:1: ( '->' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1969:1: '->'
            {
             before(grammarAccess.getViewDeclarationAccess().getHyphenMinusGreaterThanSignKeyword_4()); 
            match(input,26,FOLLOW_26_in_rule__ViewDeclaration__Group__4__Impl3885); 
             after(grammarAccess.getViewDeclarationAccess().getHyphenMinusGreaterThanSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewDeclaration__Group__4__Impl"


    // $ANTLR start "rule__ViewDeclaration__Group__5"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1982:1: rule__ViewDeclaration__Group__5 : rule__ViewDeclaration__Group__5__Impl rule__ViewDeclaration__Group__6 ;
    public final void rule__ViewDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1986:1: ( rule__ViewDeclaration__Group__5__Impl rule__ViewDeclaration__Group__6 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1987:2: rule__ViewDeclaration__Group__5__Impl rule__ViewDeclaration__Group__6
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__Group__5__Impl_in_rule__ViewDeclaration__Group__53916);
            rule__ViewDeclaration__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ViewDeclaration__Group__6_in_rule__ViewDeclaration__Group__53919);
            rule__ViewDeclaration__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewDeclaration__Group__5"


    // $ANTLR start "rule__ViewDeclaration__Group__5__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1994:1: rule__ViewDeclaration__Group__5__Impl : ( ( rule__ViewDeclaration__ToAssignment_5 ) ) ;
    public final void rule__ViewDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1998:1: ( ( ( rule__ViewDeclaration__ToAssignment_5 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1999:1: ( ( rule__ViewDeclaration__ToAssignment_5 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1999:1: ( ( rule__ViewDeclaration__ToAssignment_5 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2000:1: ( rule__ViewDeclaration__ToAssignment_5 )
            {
             before(grammarAccess.getViewDeclarationAccess().getToAssignment_5()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2001:1: ( rule__ViewDeclaration__ToAssignment_5 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2001:2: rule__ViewDeclaration__ToAssignment_5
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__ToAssignment_5_in_rule__ViewDeclaration__Group__5__Impl3946);
            rule__ViewDeclaration__ToAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getViewDeclarationAccess().getToAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewDeclaration__Group__5__Impl"


    // $ANTLR start "rule__ViewDeclaration__Group__6"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2011:1: rule__ViewDeclaration__Group__6 : rule__ViewDeclaration__Group__6__Impl rule__ViewDeclaration__Group__7 ;
    public final void rule__ViewDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2015:1: ( rule__ViewDeclaration__Group__6__Impl rule__ViewDeclaration__Group__7 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2016:2: rule__ViewDeclaration__Group__6__Impl rule__ViewDeclaration__Group__7
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__Group__6__Impl_in_rule__ViewDeclaration__Group__63976);
            rule__ViewDeclaration__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ViewDeclaration__Group__7_in_rule__ViewDeclaration__Group__63979);
            rule__ViewDeclaration__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewDeclaration__Group__6"


    // $ANTLR start "rule__ViewDeclaration__Group__6__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2023:1: rule__ViewDeclaration__Group__6__Impl : ( '=' ) ;
    public final void rule__ViewDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2027:1: ( ( '=' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2028:1: ( '=' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2028:1: ( '=' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2029:1: '='
            {
             before(grammarAccess.getViewDeclarationAccess().getEqualsSignKeyword_6()); 
            match(input,19,FOLLOW_19_in_rule__ViewDeclaration__Group__6__Impl4007); 
             after(grammarAccess.getViewDeclarationAccess().getEqualsSignKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewDeclaration__Group__6__Impl"


    // $ANTLR start "rule__ViewDeclaration__Group__7"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2042:1: rule__ViewDeclaration__Group__7 : rule__ViewDeclaration__Group__7__Impl rule__ViewDeclaration__Group__8 ;
    public final void rule__ViewDeclaration__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2046:1: ( rule__ViewDeclaration__Group__7__Impl rule__ViewDeclaration__Group__8 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2047:2: rule__ViewDeclaration__Group__7__Impl rule__ViewDeclaration__Group__8
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__Group__7__Impl_in_rule__ViewDeclaration__Group__74038);
            rule__ViewDeclaration__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ViewDeclaration__Group__8_in_rule__ViewDeclaration__Group__74041);
            rule__ViewDeclaration__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewDeclaration__Group__7"


    // $ANTLR start "rule__ViewDeclaration__Group__7__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2054:1: rule__ViewDeclaration__Group__7__Impl : ( '{' ) ;
    public final void rule__ViewDeclaration__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2058:1: ( ( '{' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2059:1: ( '{' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2059:1: ( '{' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2060:1: '{'
            {
             before(grammarAccess.getViewDeclarationAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,21,FOLLOW_21_in_rule__ViewDeclaration__Group__7__Impl4069); 
             after(grammarAccess.getViewDeclarationAccess().getLeftCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewDeclaration__Group__7__Impl"


    // $ANTLR start "rule__ViewDeclaration__Group__8"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2073:1: rule__ViewDeclaration__Group__8 : rule__ViewDeclaration__Group__8__Impl rule__ViewDeclaration__Group__9 ;
    public final void rule__ViewDeclaration__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2077:1: ( rule__ViewDeclaration__Group__8__Impl rule__ViewDeclaration__Group__9 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2078:2: rule__ViewDeclaration__Group__8__Impl rule__ViewDeclaration__Group__9
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__Group__8__Impl_in_rule__ViewDeclaration__Group__84100);
            rule__ViewDeclaration__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ViewDeclaration__Group__9_in_rule__ViewDeclaration__Group__84103);
            rule__ViewDeclaration__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewDeclaration__Group__8"


    // $ANTLR start "rule__ViewDeclaration__Group__8__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2085:1: rule__ViewDeclaration__Group__8__Impl : ( ( rule__ViewDeclaration__ViewDefinitionsAssignment_8 ) ) ;
    public final void rule__ViewDeclaration__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2089:1: ( ( ( rule__ViewDeclaration__ViewDefinitionsAssignment_8 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2090:1: ( ( rule__ViewDeclaration__ViewDefinitionsAssignment_8 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2090:1: ( ( rule__ViewDeclaration__ViewDefinitionsAssignment_8 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2091:1: ( rule__ViewDeclaration__ViewDefinitionsAssignment_8 )
            {
             before(grammarAccess.getViewDeclarationAccess().getViewDefinitionsAssignment_8()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2092:1: ( rule__ViewDeclaration__ViewDefinitionsAssignment_8 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2092:2: rule__ViewDeclaration__ViewDefinitionsAssignment_8
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__ViewDefinitionsAssignment_8_in_rule__ViewDeclaration__Group__8__Impl4130);
            rule__ViewDeclaration__ViewDefinitionsAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getViewDeclarationAccess().getViewDefinitionsAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewDeclaration__Group__8__Impl"


    // $ANTLR start "rule__ViewDeclaration__Group__9"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2102:1: rule__ViewDeclaration__Group__9 : rule__ViewDeclaration__Group__9__Impl rule__ViewDeclaration__Group__10 ;
    public final void rule__ViewDeclaration__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2106:1: ( rule__ViewDeclaration__Group__9__Impl rule__ViewDeclaration__Group__10 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2107:2: rule__ViewDeclaration__Group__9__Impl rule__ViewDeclaration__Group__10
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__Group__9__Impl_in_rule__ViewDeclaration__Group__94160);
            rule__ViewDeclaration__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ViewDeclaration__Group__10_in_rule__ViewDeclaration__Group__94163);
            rule__ViewDeclaration__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewDeclaration__Group__9"


    // $ANTLR start "rule__ViewDeclaration__Group__9__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2114:1: rule__ViewDeclaration__Group__9__Impl : ( '}' ) ;
    public final void rule__ViewDeclaration__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2118:1: ( ( '}' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2119:1: ( '}' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2119:1: ( '}' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2120:1: '}'
            {
             before(grammarAccess.getViewDeclarationAccess().getRightCurlyBracketKeyword_9()); 
            match(input,22,FOLLOW_22_in_rule__ViewDeclaration__Group__9__Impl4191); 
             after(grammarAccess.getViewDeclarationAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewDeclaration__Group__9__Impl"


    // $ANTLR start "rule__ViewDeclaration__Group__10"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2133:1: rule__ViewDeclaration__Group__10 : rule__ViewDeclaration__Group__10__Impl ;
    public final void rule__ViewDeclaration__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2137:1: ( rule__ViewDeclaration__Group__10__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2138:2: rule__ViewDeclaration__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__Group__10__Impl_in_rule__ViewDeclaration__Group__104222);
            rule__ViewDeclaration__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewDeclaration__Group__10"


    // $ANTLR start "rule__ViewDeclaration__Group__10__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2144:1: rule__ViewDeclaration__Group__10__Impl : ( '.' ) ;
    public final void rule__ViewDeclaration__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2148:1: ( ( '.' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2149:1: ( '.' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2149:1: ( '.' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2150:1: '.'
            {
             before(grammarAccess.getViewDeclarationAccess().getFullStopKeyword_10()); 
            match(input,13,FOLLOW_13_in_rule__ViewDeclaration__Group__10__Impl4250); 
             after(grammarAccess.getViewDeclarationAccess().getFullStopKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewDeclaration__Group__10__Impl"


    // $ANTLR start "rule__Model__DeclarationsAssignment"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2186:1: rule__Model__DeclarationsAssignment : ( ( rule__Model__DeclarationsAlternatives_0 ) ) ;
    public final void rule__Model__DeclarationsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2190:1: ( ( ( rule__Model__DeclarationsAlternatives_0 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2191:1: ( ( rule__Model__DeclarationsAlternatives_0 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2191:1: ( ( rule__Model__DeclarationsAlternatives_0 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2192:1: ( rule__Model__DeclarationsAlternatives_0 )
            {
             before(grammarAccess.getModelAccess().getDeclarationsAlternatives_0()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2193:1: ( rule__Model__DeclarationsAlternatives_0 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2193:2: rule__Model__DeclarationsAlternatives_0
            {
            pushFollow(FOLLOW_rule__Model__DeclarationsAlternatives_0_in_rule__Model__DeclarationsAssignment4308);
            rule__Model__DeclarationsAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getDeclarationsAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__DeclarationsAssignment"


    // $ANTLR start "rule__ReadDeclaration__FileAssignment_1"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2202:1: rule__ReadDeclaration__FileAssignment_1 : ( ruleURISTRING ) ;
    public final void rule__ReadDeclaration__FileAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2206:1: ( ( ruleURISTRING ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2207:1: ( ruleURISTRING )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2207:1: ( ruleURISTRING )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2208:1: ruleURISTRING
            {
             before(grammarAccess.getReadDeclarationAccess().getFileURISTRINGParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleURISTRING_in_rule__ReadDeclaration__FileAssignment_14341);
            ruleURISTRING();

            state._fsp--;

             after(grammarAccess.getReadDeclarationAccess().getFileURISTRINGParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadDeclaration__FileAssignment_1"


    // $ANTLR start "rule__NamespaceDeclaration__NameAssignment_1_0"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2217:1: rule__NamespaceDeclaration__NameAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__NamespaceDeclaration__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2221:1: ( ( RULE_ID ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2222:1: ( RULE_ID )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2222:1: ( RULE_ID )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2223:1: RULE_ID
            {
             before(grammarAccess.getNamespaceDeclarationAccess().getNameIDTerminalRuleCall_1_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NamespaceDeclaration__NameAssignment_1_04372); 
             after(grammarAccess.getNamespaceDeclarationAccess().getNameIDTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamespaceDeclaration__NameAssignment_1_0"


    // $ANTLR start "rule__NamespaceDeclaration__UriAssignment_2"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2232:1: rule__NamespaceDeclaration__UriAssignment_2 : ( ruleURISTRING ) ;
    public final void rule__NamespaceDeclaration__UriAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2236:1: ( ( ruleURISTRING ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2237:1: ( ruleURISTRING )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2237:1: ( ruleURISTRING )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2238:1: ruleURISTRING
            {
             before(grammarAccess.getNamespaceDeclarationAccess().getUriURISTRINGParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleURISTRING_in_rule__NamespaceDeclaration__UriAssignment_24403);
            ruleURISTRING();

            state._fsp--;

             after(grammarAccess.getNamespaceDeclarationAccess().getUriURISTRINGParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamespaceDeclaration__UriAssignment_2"


    // $ANTLR start "rule__SignatureDeclaration__SigNameAssignment_1"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2247:1: rule__SignatureDeclaration__SigNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SignatureDeclaration__SigNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2251:1: ( ( RULE_ID ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2252:1: ( RULE_ID )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2252:1: ( RULE_ID )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2253:1: RULE_ID
            {
             before(grammarAccess.getSignatureDeclarationAccess().getSigNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SignatureDeclaration__SigNameAssignment_14434); 
             after(grammarAccess.getSignatureDeclarationAccess().getSigNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignatureDeclaration__SigNameAssignment_1"


    // $ANTLR start "rule__SignatureDeclaration__SigDefinitionsAssignment_4"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2262:1: rule__SignatureDeclaration__SigDefinitionsAssignment_4 : ( rulesigDefinitions ) ;
    public final void rule__SignatureDeclaration__SigDefinitionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2266:1: ( ( rulesigDefinitions ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2267:1: ( rulesigDefinitions )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2267:1: ( rulesigDefinitions )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2268:1: rulesigDefinitions
            {
             before(grammarAccess.getSignatureDeclarationAccess().getSigDefinitionsSigDefinitionsParserRuleCall_4_0()); 
            pushFollow(FOLLOW_rulesigDefinitions_in_rule__SignatureDeclaration__SigDefinitionsAssignment_44465);
            rulesigDefinitions();

            state._fsp--;

             after(grammarAccess.getSignatureDeclarationAccess().getSigDefinitionsSigDefinitionsParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignatureDeclaration__SigDefinitionsAssignment_4"


    // $ANTLR start "rule__SigDefinitions__SymbNameAssignment_0_0"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2277:1: rule__SigDefinitions__SymbNameAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__SigDefinitions__SymbNameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2281:1: ( ( RULE_ID ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2282:1: ( RULE_ID )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2282:1: ( RULE_ID )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2283:1: RULE_ID
            {
             before(grammarAccess.getSigDefinitionsAccess().getSymbNameIDTerminalRuleCall_0_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SigDefinitions__SymbNameAssignment_0_04496); 
             after(grammarAccess.getSigDefinitionsAccess().getSymbNameIDTerminalRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SigDefinitions__SymbNameAssignment_0_0"


    // $ANTLR start "rule__SigDefinitions__TypeAssignment_0_2_0"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2292:1: rule__SigDefinitions__TypeAssignment_0_2_0 : ( RULE_ID ) ;
    public final void rule__SigDefinitions__TypeAssignment_0_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2296:1: ( ( RULE_ID ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2297:1: ( RULE_ID )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2297:1: ( RULE_ID )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2298:1: RULE_ID
            {
             before(grammarAccess.getSigDefinitionsAccess().getTypeIDTerminalRuleCall_0_2_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SigDefinitions__TypeAssignment_0_2_04527); 
             after(grammarAccess.getSigDefinitionsAccess().getTypeIDTerminalRuleCall_0_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SigDefinitions__TypeAssignment_0_2_0"


    // $ANTLR start "rule__SigDefinitions__NamespaceAssignment_1_1"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2307:1: rule__SigDefinitions__NamespaceAssignment_1_1 : ( ruleNAMESPACE ) ;
    public final void rule__SigDefinitions__NamespaceAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2311:1: ( ( ruleNAMESPACE ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2312:1: ( ruleNAMESPACE )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2312:1: ( ruleNAMESPACE )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2313:1: ruleNAMESPACE
            {
             before(grammarAccess.getSigDefinitionsAccess().getNamespaceNAMESPACEParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleNAMESPACE_in_rule__SigDefinitions__NamespaceAssignment_1_14558);
            ruleNAMESPACE();

            state._fsp--;

             after(grammarAccess.getSigDefinitionsAccess().getNamespaceNAMESPACEParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SigDefinitions__NamespaceAssignment_1_1"


    // $ANTLR start "rule__SigDefinitions__StructNameAssignment_2_1"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2322:1: rule__SigDefinitions__StructNameAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__SigDefinitions__StructNameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2326:1: ( ( RULE_ID ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2327:1: ( RULE_ID )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2327:1: ( RULE_ID )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2328:1: RULE_ID
            {
             before(grammarAccess.getSigDefinitionsAccess().getStructNameIDTerminalRuleCall_2_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SigDefinitions__StructNameAssignment_2_14589); 
             after(grammarAccess.getSigDefinitionsAccess().getStructNameIDTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SigDefinitions__StructNameAssignment_2_1"


    // $ANTLR start "rule__SigDefinitions__NamespaceAssignment_2_3"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2337:1: rule__SigDefinitions__NamespaceAssignment_2_3 : ( ruleNAMESPACE ) ;
    public final void rule__SigDefinitions__NamespaceAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2341:1: ( ( ruleNAMESPACE ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2342:1: ( ruleNAMESPACE )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2342:1: ( ruleNAMESPACE )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2343:1: ruleNAMESPACE
            {
             before(grammarAccess.getSigDefinitionsAccess().getNamespaceNAMESPACEParserRuleCall_2_3_0()); 
            pushFollow(FOLLOW_ruleNAMESPACE_in_rule__SigDefinitions__NamespaceAssignment_2_34620);
            ruleNAMESPACE();

            state._fsp--;

             after(grammarAccess.getSigDefinitionsAccess().getNamespaceNAMESPACEParserRuleCall_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SigDefinitions__NamespaceAssignment_2_3"


    // $ANTLR start "rule__ViewDeclaration__ViewIDAssignment_1"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2353:1: rule__ViewDeclaration__ViewIDAssignment_1 : ( RULE_ID ) ;
    public final void rule__ViewDeclaration__ViewIDAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2357:1: ( ( RULE_ID ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2358:1: ( RULE_ID )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2358:1: ( RULE_ID )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2359:1: RULE_ID
            {
             before(grammarAccess.getViewDeclarationAccess().getViewIDIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ViewDeclaration__ViewIDAssignment_14652); 
             after(grammarAccess.getViewDeclarationAccess().getViewIDIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewDeclaration__ViewIDAssignment_1"


    // $ANTLR start "rule__ViewDeclaration__FromAssignment_3"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2368:1: rule__ViewDeclaration__FromAssignment_3 : ( ruleNAMESPACE ) ;
    public final void rule__ViewDeclaration__FromAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2372:1: ( ( ruleNAMESPACE ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2373:1: ( ruleNAMESPACE )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2373:1: ( ruleNAMESPACE )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2374:1: ruleNAMESPACE
            {
             before(grammarAccess.getViewDeclarationAccess().getFromNAMESPACEParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleNAMESPACE_in_rule__ViewDeclaration__FromAssignment_34683);
            ruleNAMESPACE();

            state._fsp--;

             after(grammarAccess.getViewDeclarationAccess().getFromNAMESPACEParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewDeclaration__FromAssignment_3"


    // $ANTLR start "rule__ViewDeclaration__ToAssignment_5"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2383:1: rule__ViewDeclaration__ToAssignment_5 : ( ruleNAMESPACE ) ;
    public final void rule__ViewDeclaration__ToAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2387:1: ( ( ruleNAMESPACE ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2388:1: ( ruleNAMESPACE )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2388:1: ( ruleNAMESPACE )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2389:1: ruleNAMESPACE
            {
             before(grammarAccess.getViewDeclarationAccess().getToNAMESPACEParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleNAMESPACE_in_rule__ViewDeclaration__ToAssignment_54714);
            ruleNAMESPACE();

            state._fsp--;

             after(grammarAccess.getViewDeclarationAccess().getToNAMESPACEParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewDeclaration__ToAssignment_5"


    // $ANTLR start "rule__ViewDeclaration__ViewDefinitionsAssignment_8"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2398:1: rule__ViewDeclaration__ViewDefinitionsAssignment_8 : ( rulesigDefinitions ) ;
    public final void rule__ViewDeclaration__ViewDefinitionsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2402:1: ( ( rulesigDefinitions ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2403:1: ( rulesigDefinitions )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2403:1: ( rulesigDefinitions )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2404:1: rulesigDefinitions
            {
             before(grammarAccess.getViewDeclarationAccess().getViewDefinitionsSigDefinitionsParserRuleCall_8_0()); 
            pushFollow(FOLLOW_rulesigDefinitions_in_rule__ViewDeclaration__ViewDefinitionsAssignment_84745);
            rulesigDefinitions();

            state._fsp--;

             after(grammarAccess.getViewDeclarationAccess().getViewDefinitionsSigDefinitionsParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewDeclaration__ViewDefinitionsAssignment_8"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__DeclarationsAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000002160002L});
    public static final BitSet FOLLOW_ruleNAMESPACE_in_entryRuleNAMESPACE122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNAMESPACE129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NAMESPACE__Group__0_in_ruleNAMESPACE155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURI_in_entryRuleURI182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleURI189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group__0_in_ruleURI215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURISTRING_in_entryRuleURISTRING242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleURISTRING249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URISTRING__Group__0_in_ruleURISTRING275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulereadDeclaration_in_entryRulereadDeclaration302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulereadDeclaration309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReadDeclaration__Group__0_in_rulereadDeclaration335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenamespaceDeclaration_in_entryRulenamespaceDeclaration362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenamespaceDeclaration369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group__0_in_rulenamespaceDeclaration395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesignatureDeclaration_in_entryRulesignatureDeclaration422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesignatureDeclaration429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group__0_in_rulesignatureDeclaration455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesigDefinitions_in_entryRulesigDefinitions482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesigDefinitions489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Alternatives_in_rulesigDefinitions515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleviewDeclaration_in_entryRuleviewDeclaration544 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleviewDeclaration551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__0_in_ruleviewDeclaration577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenamespaceDeclaration_in_rule__Model__DeclarationsAlternatives_0613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesignatureDeclaration_in_rule__Model__DeclarationsAlternatives_0630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulereadDeclaration_in_rule__Model__DeclarationsAlternatives_0647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleviewDeclaration_in_rule__Model__DeclarationsAlternatives_0664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_0__0_in_rule__SigDefinitions__Alternatives696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_1__0_in_rule__SigDefinitions__Alternatives714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_2__0_in_rule__SigDefinitions__Alternatives732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__SigDefinitions__Alternatives_0_1766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__SigDefinitions__Alternatives_0_1786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NAMESPACE__Group__0__Impl_in_rule__NAMESPACE__Group__0819 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__NAMESPACE__Group__1_in_rule__NAMESPACE__Group__0822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NAMESPACE__Group__0__Impl849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NAMESPACE__Group__1__Impl_in_rule__NAMESPACE__Group__1878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NAMESPACE__Group_1__0_in_rule__NAMESPACE__Group__1__Impl905 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__NAMESPACE__Group_1__0__Impl_in_rule__NAMESPACE__Group_1__0940 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NAMESPACE__Group_1__1_in_rule__NAMESPACE__Group_1__0943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__NAMESPACE__Group_1__0__Impl971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NAMESPACE__Group_1__1__Impl_in_rule__NAMESPACE__Group_1__11002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NAMESPACE__Group_1__1__Impl1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group__0__Impl_in_rule__URI__Group__01062 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__URI__Group__1_in_rule__URI__Group__01065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group_0__0_in_rule__URI__Group__0__Impl1092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group__1__Impl_in_rule__URI__Group__11123 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__URI__Group__2_in_rule__URI__Group__11126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNAMESPACE_in_rule__URI__Group__1__Impl1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group__2__Impl_in_rule__URI__Group__21182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group_2__0_in_rule__URI__Group__2__Impl1209 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__URI__Group_0__0__Impl_in_rule__URI__Group_0__01246 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__URI__Group_0__1_in_rule__URI__Group_0__01249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__URI__Group_0__0__Impl1276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group_0__1__Impl_in_rule__URI__Group_0__11305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__URI__Group_0__1__Impl1333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group_2__0__Impl_in_rule__URI__Group_2__01368 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__URI__Group_2__1_in_rule__URI__Group_2__01371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__URI__Group_2__0__Impl1399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group_2__1__Impl_in_rule__URI__Group_2__11430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__URI__Group_2__1__Impl1457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URISTRING__Group__0__Impl_in_rule__URISTRING__Group__01490 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__URISTRING__Group__1_in_rule__URISTRING__Group__01493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__URISTRING__Group__0__Impl1521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URISTRING__Group__1__Impl_in_rule__URISTRING__Group__11552 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__URISTRING__Group__2_in_rule__URISTRING__Group__11555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURI_in_rule__URISTRING__Group__1__Impl1582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URISTRING__Group__2__Impl_in_rule__URISTRING__Group__21611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__URISTRING__Group__2__Impl1639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReadDeclaration__Group__0__Impl_in_rule__ReadDeclaration__Group__01676 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__ReadDeclaration__Group__1_in_rule__ReadDeclaration__Group__01679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ReadDeclaration__Group__0__Impl1707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReadDeclaration__Group__1__Impl_in_rule__ReadDeclaration__Group__11738 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__ReadDeclaration__Group__2_in_rule__ReadDeclaration__Group__11741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReadDeclaration__FileAssignment_1_in_rule__ReadDeclaration__Group__1__Impl1768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReadDeclaration__Group__2__Impl_in_rule__ReadDeclaration__Group__21798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ReadDeclaration__Group__2__Impl1826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group__0__Impl_in_rule__NamespaceDeclaration__Group__01863 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group__1_in_rule__NamespaceDeclaration__Group__01866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__NamespaceDeclaration__Group__0__Impl1894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group__1__Impl_in_rule__NamespaceDeclaration__Group__11925 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group__2_in_rule__NamespaceDeclaration__Group__11928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group_1__0_in_rule__NamespaceDeclaration__Group__1__Impl1955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group__2__Impl_in_rule__NamespaceDeclaration__Group__21986 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group__3_in_rule__NamespaceDeclaration__Group__21989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__UriAssignment_2_in_rule__NamespaceDeclaration__Group__2__Impl2016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group__3__Impl_in_rule__NamespaceDeclaration__Group__32046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__NamespaceDeclaration__Group__3__Impl2074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group_1__0__Impl_in_rule__NamespaceDeclaration__Group_1__02113 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group_1__1_in_rule__NamespaceDeclaration__Group_1__02116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__NameAssignment_1_0_in_rule__NamespaceDeclaration__Group_1__0__Impl2143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group_1__1__Impl_in_rule__NamespaceDeclaration__Group_1__12173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__NamespaceDeclaration__Group_1__1__Impl2201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group__0__Impl_in_rule__SignatureDeclaration__Group__02236 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group__1_in_rule__SignatureDeclaration__Group__02239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__SignatureDeclaration__Group__0__Impl2267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group__1__Impl_in_rule__SignatureDeclaration__Group__12298 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group__2_in_rule__SignatureDeclaration__Group__12301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__SigNameAssignment_1_in_rule__SignatureDeclaration__Group__1__Impl2328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group__2__Impl_in_rule__SignatureDeclaration__Group__22358 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group__3_in_rule__SignatureDeclaration__Group__22361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__SignatureDeclaration__Group__2__Impl2389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group__3__Impl_in_rule__SignatureDeclaration__Group__32420 = new BitSet(new long[]{0x0000000001C00010L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group__4_in_rule__SignatureDeclaration__Group__32423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__SignatureDeclaration__Group__3__Impl2451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group__4__Impl_in_rule__SignatureDeclaration__Group__42482 = new BitSet(new long[]{0x0000000001C00010L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group__5_in_rule__SignatureDeclaration__Group__42485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__SigDefinitionsAssignment_4_in_rule__SignatureDeclaration__Group__4__Impl2512 = new BitSet(new long[]{0x0000000001800012L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group__5__Impl_in_rule__SignatureDeclaration__Group__52543 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group__6_in_rule__SignatureDeclaration__Group__52546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__SignatureDeclaration__Group__5__Impl2574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group__6__Impl_in_rule__SignatureDeclaration__Group__62605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__SignatureDeclaration__Group__6__Impl2633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_0__0__Impl_in_rule__SigDefinitions__Group_0__02678 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_0__1_in_rule__SigDefinitions__Group_0__02681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__SymbNameAssignment_0_0_in_rule__SigDefinitions__Group_0__0__Impl2708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_0__1__Impl_in_rule__SigDefinitions__Group_0__12738 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_0__2_in_rule__SigDefinitions__Group_0__12741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Alternatives_0_1_in_rule__SigDefinitions__Group_0__1__Impl2768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_0__2__Impl_in_rule__SigDefinitions__Group_0__22798 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_0__3_in_rule__SigDefinitions__Group_0__22801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_0_2__0_in_rule__SigDefinitions__Group_0__2__Impl2828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_0__3__Impl_in_rule__SigDefinitions__Group_0__32859 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_0__4_in_rule__SigDefinitions__Group_0__32862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNAMESPACE_in_rule__SigDefinitions__Group_0__3__Impl2889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_0__4__Impl_in_rule__SigDefinitions__Group_0__42918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__SigDefinitions__Group_0__4__Impl2946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_0_2__0__Impl_in_rule__SigDefinitions__Group_0_2__02987 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_0_2__1_in_rule__SigDefinitions__Group_0_2__02990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__TypeAssignment_0_2_0_in_rule__SigDefinitions__Group_0_2__0__Impl3017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_0_2__1__Impl_in_rule__SigDefinitions__Group_0_2__13047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__SigDefinitions__Group_0_2__1__Impl3075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_1__0__Impl_in_rule__SigDefinitions__Group_1__03110 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_1__1_in_rule__SigDefinitions__Group_1__03113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__SigDefinitions__Group_1__0__Impl3141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_1__1__Impl_in_rule__SigDefinitions__Group_1__13172 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_1__2_in_rule__SigDefinitions__Group_1__13175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__NamespaceAssignment_1_1_in_rule__SigDefinitions__Group_1__1__Impl3202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_1__2__Impl_in_rule__SigDefinitions__Group_1__23232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__SigDefinitions__Group_1__2__Impl3260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_2__0__Impl_in_rule__SigDefinitions__Group_2__03297 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_2__1_in_rule__SigDefinitions__Group_2__03300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__SigDefinitions__Group_2__0__Impl3328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_2__1__Impl_in_rule__SigDefinitions__Group_2__13359 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_2__2_in_rule__SigDefinitions__Group_2__13362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__StructNameAssignment_2_1_in_rule__SigDefinitions__Group_2__1__Impl3389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_2__2__Impl_in_rule__SigDefinitions__Group_2__23419 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_2__3_in_rule__SigDefinitions__Group_2__23422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__SigDefinitions__Group_2__2__Impl3450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_2__3__Impl_in_rule__SigDefinitions__Group_2__33481 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_2__4_in_rule__SigDefinitions__Group_2__33484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__NamespaceAssignment_2_3_in_rule__SigDefinitions__Group_2__3__Impl3511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_2__4__Impl_in_rule__SigDefinitions__Group_2__43541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__SigDefinitions__Group_2__4__Impl3569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__0__Impl_in_rule__ViewDeclaration__Group__03610 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__1_in_rule__ViewDeclaration__Group__03613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ViewDeclaration__Group__0__Impl3641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__1__Impl_in_rule__ViewDeclaration__Group__13672 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__2_in_rule__ViewDeclaration__Group__13675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__ViewIDAssignment_1_in_rule__ViewDeclaration__Group__1__Impl3702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__2__Impl_in_rule__ViewDeclaration__Group__23732 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__3_in_rule__ViewDeclaration__Group__23735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__ViewDeclaration__Group__2__Impl3763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__3__Impl_in_rule__ViewDeclaration__Group__33794 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__4_in_rule__ViewDeclaration__Group__33797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__FromAssignment_3_in_rule__ViewDeclaration__Group__3__Impl3824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__4__Impl_in_rule__ViewDeclaration__Group__43854 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__5_in_rule__ViewDeclaration__Group__43857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ViewDeclaration__Group__4__Impl3885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__5__Impl_in_rule__ViewDeclaration__Group__53916 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__6_in_rule__ViewDeclaration__Group__53919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__ToAssignment_5_in_rule__ViewDeclaration__Group__5__Impl3946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__6__Impl_in_rule__ViewDeclaration__Group__63976 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__7_in_rule__ViewDeclaration__Group__63979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ViewDeclaration__Group__6__Impl4007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__7__Impl_in_rule__ViewDeclaration__Group__74038 = new BitSet(new long[]{0x0000000001800010L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__8_in_rule__ViewDeclaration__Group__74041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ViewDeclaration__Group__7__Impl4069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__8__Impl_in_rule__ViewDeclaration__Group__84100 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__9_in_rule__ViewDeclaration__Group__84103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__ViewDefinitionsAssignment_8_in_rule__ViewDeclaration__Group__8__Impl4130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__9__Impl_in_rule__ViewDeclaration__Group__94160 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__10_in_rule__ViewDeclaration__Group__94163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ViewDeclaration__Group__9__Impl4191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__10__Impl_in_rule__ViewDeclaration__Group__104222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ViewDeclaration__Group__10__Impl4250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__DeclarationsAlternatives_0_in_rule__Model__DeclarationsAssignment4308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURISTRING_in_rule__ReadDeclaration__FileAssignment_14341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NamespaceDeclaration__NameAssignment_1_04372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURISTRING_in_rule__NamespaceDeclaration__UriAssignment_24403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SignatureDeclaration__SigNameAssignment_14434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesigDefinitions_in_rule__SignatureDeclaration__SigDefinitionsAssignment_44465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SigDefinitions__SymbNameAssignment_0_04496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SigDefinitions__TypeAssignment_0_2_04527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNAMESPACE_in_rule__SigDefinitions__NamespaceAssignment_1_14558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SigDefinitions__StructNameAssignment_2_14589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNAMESPACE_in_rule__SigDefinitions__NamespaceAssignment_2_34620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ViewDeclaration__ViewIDAssignment_14652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNAMESPACE_in_rule__ViewDeclaration__FromAssignment_34683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNAMESPACE_in_rule__ViewDeclaration__ToAssignment_54714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesigDefinitions_in_rule__ViewDeclaration__ViewDefinitionsAssignment_84745 = new BitSet(new long[]{0x0000000000000002L});

}