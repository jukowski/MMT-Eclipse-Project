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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SP", "RULE_ML_COMMENT", "RULE_ML2_COMMENT", "RULE_SL_COMMENT", "RULE_MULTIPLEDOT", "RULE_DOUBLEDOT", "RULE_CID", "RULE_ANY_OTHER", "RULE_INT", "'/'", "'.'", "':'", "'='", "'->'", "'%'", "':='", "'meta'", "'abbrev'", "'name'", "'pattern'", "'infix'", "'prefix'", "'postfix'", "'\"'", "'namespace'", "'read'", "'{'", "'}'", "'sig'", "'include'", "'struct'", "'open'", "'view'"
    };
    public static final int RULE_SP=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_CID=10;
    public static final int RULE_SL_COMMENT=7;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=5;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int RULE_MULTIPLEDOT=8;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ML2_COMMENT=6;
    public static final int RULE_INT=12;
    public static final int RULE_DOUBLEDOT=9;

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

                if ( ((LA1_0>=RULE_SP && LA1_0<=RULE_SL_COMMENT)||LA1_0==18) ) {
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


    // $ANTLR start "entryRuleWS"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:89:1: entryRuleWS : ruleWS EOF ;
    public final void entryRuleWS() throws RecognitionException {
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:90:1: ( ruleWS EOF )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:91:1: ruleWS EOF
            {
             before(grammarAccess.getWSRule()); 
            pushFollow(FOLLOW_ruleWS_in_entryRuleWS122);
            ruleWS();

            state._fsp--;

             after(grammarAccess.getWSRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWS129); 

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
    // $ANTLR end "entryRuleWS"


    // $ANTLR start "ruleWS"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:98:1: ruleWS : ( ( rule__WS__Alternatives ) ) ;
    public final void ruleWS() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:102:2: ( ( ( rule__WS__Alternatives ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:103:1: ( ( rule__WS__Alternatives ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:103:1: ( ( rule__WS__Alternatives ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:104:1: ( rule__WS__Alternatives )
            {
             before(grammarAccess.getWSAccess().getAlternatives()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:105:1: ( rule__WS__Alternatives )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:105:2: rule__WS__Alternatives
            {
            pushFollow(FOLLOW_rule__WS__Alternatives_in_ruleWS155);
            rule__WS__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getWSAccess().getAlternatives()); 

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
    // $ANTLR end "ruleWS"


    // $ANTLR start "entryRuleNAMESPACE"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:117:1: entryRuleNAMESPACE : ruleNAMESPACE EOF ;
    public final void entryRuleNAMESPACE() throws RecognitionException {
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:118:1: ( ruleNAMESPACE EOF )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:119:1: ruleNAMESPACE EOF
            {
             before(grammarAccess.getNAMESPACERule()); 
            pushFollow(FOLLOW_ruleNAMESPACE_in_entryRuleNAMESPACE182);
            ruleNAMESPACE();

            state._fsp--;

             after(grammarAccess.getNAMESPACERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNAMESPACE189); 

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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:126:1: ruleNAMESPACE : ( ( rule__NAMESPACE__Group__0 ) ) ;
    public final void ruleNAMESPACE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:130:2: ( ( ( rule__NAMESPACE__Group__0 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:131:1: ( ( rule__NAMESPACE__Group__0 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:131:1: ( ( rule__NAMESPACE__Group__0 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:132:1: ( rule__NAMESPACE__Group__0 )
            {
             before(grammarAccess.getNAMESPACEAccess().getGroup()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:133:1: ( rule__NAMESPACE__Group__0 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:133:2: rule__NAMESPACE__Group__0
            {
            pushFollow(FOLLOW_rule__NAMESPACE__Group__0_in_ruleNAMESPACE215);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:145:1: entryRuleURI : ruleURI EOF ;
    public final void entryRuleURI() throws RecognitionException {
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:146:1: ( ruleURI EOF )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:147:1: ruleURI EOF
            {
             before(grammarAccess.getURIRule()); 
            pushFollow(FOLLOW_ruleURI_in_entryRuleURI242);
            ruleURI();

            state._fsp--;

             after(grammarAccess.getURIRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleURI249); 

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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:154:1: ruleURI : ( ( rule__URI__Group__0 ) ) ;
    public final void ruleURI() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:158:2: ( ( ( rule__URI__Group__0 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:159:1: ( ( rule__URI__Group__0 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:159:1: ( ( rule__URI__Group__0 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:160:1: ( rule__URI__Group__0 )
            {
             before(grammarAccess.getURIAccess().getGroup()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:161:1: ( rule__URI__Group__0 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:161:2: rule__URI__Group__0
            {
            pushFollow(FOLLOW_rule__URI__Group__0_in_ruleURI275);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:173:1: entryRuleURISTRING : ruleURISTRING EOF ;
    public final void entryRuleURISTRING() throws RecognitionException {
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:174:1: ( ruleURISTRING EOF )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:175:1: ruleURISTRING EOF
            {
             before(grammarAccess.getURISTRINGRule()); 
            pushFollow(FOLLOW_ruleURISTRING_in_entryRuleURISTRING302);
            ruleURISTRING();

            state._fsp--;

             after(grammarAccess.getURISTRINGRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleURISTRING309); 

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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:182:1: ruleURISTRING : ( ( rule__URISTRING__Group__0 ) ) ;
    public final void ruleURISTRING() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:186:2: ( ( ( rule__URISTRING__Group__0 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:187:1: ( ( rule__URISTRING__Group__0 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:187:1: ( ( rule__URISTRING__Group__0 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:188:1: ( rule__URISTRING__Group__0 )
            {
             before(grammarAccess.getURISTRINGAccess().getGroup()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:189:1: ( rule__URISTRING__Group__0 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:189:2: rule__URISTRING__Group__0
            {
            pushFollow(FOLLOW_rule__URISTRING__Group__0_in_ruleURISTRING335);
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


    // $ANTLR start "entryRuleJUSTSPACE"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:201:1: entryRuleJUSTSPACE : ruleJUSTSPACE EOF ;
    public final void entryRuleJUSTSPACE() throws RecognitionException {
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:202:1: ( ruleJUSTSPACE EOF )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:203:1: ruleJUSTSPACE EOF
            {
             before(grammarAccess.getJUSTSPACERule()); 
            pushFollow(FOLLOW_ruleJUSTSPACE_in_entryRuleJUSTSPACE362);
            ruleJUSTSPACE();

            state._fsp--;

             after(grammarAccess.getJUSTSPACERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJUSTSPACE369); 

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
    // $ANTLR end "entryRuleJUSTSPACE"


    // $ANTLR start "ruleJUSTSPACE"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:210:1: ruleJUSTSPACE : ( ( rule__JUSTSPACE__JAssignment ) ) ;
    public final void ruleJUSTSPACE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:214:2: ( ( ( rule__JUSTSPACE__JAssignment ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:215:1: ( ( rule__JUSTSPACE__JAssignment ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:215:1: ( ( rule__JUSTSPACE__JAssignment ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:216:1: ( rule__JUSTSPACE__JAssignment )
            {
             before(grammarAccess.getJUSTSPACEAccess().getJAssignment()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:217:1: ( rule__JUSTSPACE__JAssignment )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:217:2: rule__JUSTSPACE__JAssignment
            {
            pushFollow(FOLLOW_rule__JUSTSPACE__JAssignment_in_ruleJUSTSPACE395);
            rule__JUSTSPACE__JAssignment();

            state._fsp--;


            }

             after(grammarAccess.getJUSTSPACEAccess().getJAssignment()); 

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
    // $ANTLR end "ruleJUSTSPACE"


    // $ANTLR start "entryRulenamespaceDeclaration"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:229:1: entryRulenamespaceDeclaration : rulenamespaceDeclaration EOF ;
    public final void entryRulenamespaceDeclaration() throws RecognitionException {
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:230:1: ( rulenamespaceDeclaration EOF )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:231:1: rulenamespaceDeclaration EOF
            {
             before(grammarAccess.getNamespaceDeclarationRule()); 
            pushFollow(FOLLOW_rulenamespaceDeclaration_in_entryRulenamespaceDeclaration422);
            rulenamespaceDeclaration();

            state._fsp--;

             after(grammarAccess.getNamespaceDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulenamespaceDeclaration429); 

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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:238:1: rulenamespaceDeclaration : ( ( rule__NamespaceDeclaration__Group__0 ) ) ;
    public final void rulenamespaceDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:242:2: ( ( ( rule__NamespaceDeclaration__Group__0 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:243:1: ( ( rule__NamespaceDeclaration__Group__0 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:243:1: ( ( rule__NamespaceDeclaration__Group__0 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:244:1: ( rule__NamespaceDeclaration__Group__0 )
            {
             before(grammarAccess.getNamespaceDeclarationAccess().getGroup()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:245:1: ( rule__NamespaceDeclaration__Group__0 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:245:2: rule__NamespaceDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group__0_in_rulenamespaceDeclaration455);
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


    // $ANTLR start "entryRulereadDeclaration"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:257:1: entryRulereadDeclaration : rulereadDeclaration EOF ;
    public final void entryRulereadDeclaration() throws RecognitionException {
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:258:1: ( rulereadDeclaration EOF )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:259:1: rulereadDeclaration EOF
            {
             before(grammarAccess.getReadDeclarationRule()); 
            pushFollow(FOLLOW_rulereadDeclaration_in_entryRulereadDeclaration482);
            rulereadDeclaration();

            state._fsp--;

             after(grammarAccess.getReadDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulereadDeclaration489); 

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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:266:1: rulereadDeclaration : ( ( rule__ReadDeclaration__Group__0 ) ) ;
    public final void rulereadDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:270:2: ( ( ( rule__ReadDeclaration__Group__0 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:271:1: ( ( rule__ReadDeclaration__Group__0 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:271:1: ( ( rule__ReadDeclaration__Group__0 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:272:1: ( rule__ReadDeclaration__Group__0 )
            {
             before(grammarAccess.getReadDeclarationAccess().getGroup()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:273:1: ( rule__ReadDeclaration__Group__0 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:273:2: rule__ReadDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__ReadDeclaration__Group__0_in_rulereadDeclaration515);
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


    // $ANTLR start "entryRuleGID"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:285:1: entryRuleGID : ruleGID EOF ;
    public final void entryRuleGID() throws RecognitionException {
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:286:1: ( ruleGID EOF )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:287:1: ruleGID EOF
            {
             before(grammarAccess.getGIDRule()); 
            pushFollow(FOLLOW_ruleGID_in_entryRuleGID542);
            ruleGID();

            state._fsp--;

             after(grammarAccess.getGIDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGID549); 

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
    // $ANTLR end "entryRuleGID"


    // $ANTLR start "ruleGID"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:294:1: ruleGID : ( ( rule__GID__Alternatives ) ) ;
    public final void ruleGID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:298:2: ( ( ( rule__GID__Alternatives ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:299:1: ( ( rule__GID__Alternatives ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:299:1: ( ( rule__GID__Alternatives ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:300:1: ( rule__GID__Alternatives )
            {
             before(grammarAccess.getGIDAccess().getAlternatives()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:301:1: ( rule__GID__Alternatives )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:301:2: rule__GID__Alternatives
            {
            pushFollow(FOLLOW_rule__GID__Alternatives_in_ruleGID575);
            rule__GID__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGIDAccess().getAlternatives()); 

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
    // $ANTLR end "ruleGID"


    // $ANTLR start "entryRuleSOMETHING"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:313:1: entryRuleSOMETHING : ruleSOMETHING EOF ;
    public final void entryRuleSOMETHING() throws RecognitionException {
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:314:1: ( ruleSOMETHING EOF )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:315:1: ruleSOMETHING EOF
            {
             before(grammarAccess.getSOMETHINGRule()); 
            pushFollow(FOLLOW_ruleSOMETHING_in_entryRuleSOMETHING602);
            ruleSOMETHING();

            state._fsp--;

             after(grammarAccess.getSOMETHINGRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSOMETHING609); 

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
    // $ANTLR end "entryRuleSOMETHING"


    // $ANTLR start "ruleSOMETHING"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:322:1: ruleSOMETHING : ( ( rule__SOMETHING__Alternatives ) ) ;
    public final void ruleSOMETHING() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:326:2: ( ( ( rule__SOMETHING__Alternatives ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:327:1: ( ( rule__SOMETHING__Alternatives ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:327:1: ( ( rule__SOMETHING__Alternatives ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:328:1: ( rule__SOMETHING__Alternatives )
            {
             before(grammarAccess.getSOMETHINGAccess().getAlternatives()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:329:1: ( rule__SOMETHING__Alternatives )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:329:2: rule__SOMETHING__Alternatives
            {
            pushFollow(FOLLOW_rule__SOMETHING__Alternatives_in_ruleSOMETHING635);
            rule__SOMETHING__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSOMETHINGAccess().getAlternatives()); 

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
    // $ANTLR end "ruleSOMETHING"


    // $ANTLR start "entryRuleSOMETHING2"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:341:1: entryRuleSOMETHING2 : ruleSOMETHING2 EOF ;
    public final void entryRuleSOMETHING2() throws RecognitionException {
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:342:1: ( ruleSOMETHING2 EOF )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:343:1: ruleSOMETHING2 EOF
            {
             before(grammarAccess.getSOMETHING2Rule()); 
            pushFollow(FOLLOW_ruleSOMETHING2_in_entryRuleSOMETHING2662);
            ruleSOMETHING2();

            state._fsp--;

             after(grammarAccess.getSOMETHING2Rule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSOMETHING2669); 

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
    // $ANTLR end "entryRuleSOMETHING2"


    // $ANTLR start "ruleSOMETHING2"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:350:1: ruleSOMETHING2 : ( ( rule__SOMETHING2__Alternatives ) ) ;
    public final void ruleSOMETHING2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:354:2: ( ( ( rule__SOMETHING2__Alternatives ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:355:1: ( ( rule__SOMETHING2__Alternatives ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:355:1: ( ( rule__SOMETHING2__Alternatives ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:356:1: ( rule__SOMETHING2__Alternatives )
            {
             before(grammarAccess.getSOMETHING2Access().getAlternatives()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:357:1: ( rule__SOMETHING2__Alternatives )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:357:2: rule__SOMETHING2__Alternatives
            {
            pushFollow(FOLLOW_rule__SOMETHING2__Alternatives_in_ruleSOMETHING2695);
            rule__SOMETHING2__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSOMETHING2Access().getAlternatives()); 

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
    // $ANTLR end "ruleSOMETHING2"


    // $ANTLR start "entryRulesignatureDeclaration"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:371:1: entryRulesignatureDeclaration : rulesignatureDeclaration EOF ;
    public final void entryRulesignatureDeclaration() throws RecognitionException {
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:372:1: ( rulesignatureDeclaration EOF )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:373:1: rulesignatureDeclaration EOF
            {
             before(grammarAccess.getSignatureDeclarationRule()); 
            pushFollow(FOLLOW_rulesignatureDeclaration_in_entryRulesignatureDeclaration724);
            rulesignatureDeclaration();

            state._fsp--;

             after(grammarAccess.getSignatureDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulesignatureDeclaration731); 

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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:380:1: rulesignatureDeclaration : ( ( rule__SignatureDeclaration__Group__0 ) ) ;
    public final void rulesignatureDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:384:2: ( ( ( rule__SignatureDeclaration__Group__0 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:385:1: ( ( rule__SignatureDeclaration__Group__0 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:385:1: ( ( rule__SignatureDeclaration__Group__0 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:386:1: ( rule__SignatureDeclaration__Group__0 )
            {
             before(grammarAccess.getSignatureDeclarationAccess().getGroup()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:387:1: ( rule__SignatureDeclaration__Group__0 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:387:2: rule__SignatureDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__SignatureDeclaration__Group__0_in_rulesignatureDeclaration757);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:399:1: entryRulesigDefinitions : rulesigDefinitions EOF ;
    public final void entryRulesigDefinitions() throws RecognitionException {
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:400:1: ( rulesigDefinitions EOF )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:401:1: rulesigDefinitions EOF
            {
             before(grammarAccess.getSigDefinitionsRule()); 
            pushFollow(FOLLOW_rulesigDefinitions_in_entryRulesigDefinitions784);
            rulesigDefinitions();

            state._fsp--;

             after(grammarAccess.getSigDefinitionsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulesigDefinitions791); 

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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:408:1: rulesigDefinitions : ( ( rule__SigDefinitions__Group__0 ) ) ;
    public final void rulesigDefinitions() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:412:2: ( ( ( rule__SigDefinitions__Group__0 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:413:1: ( ( rule__SigDefinitions__Group__0 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:413:1: ( ( rule__SigDefinitions__Group__0 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:414:1: ( rule__SigDefinitions__Group__0 )
            {
             before(grammarAccess.getSigDefinitionsAccess().getGroup()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:415:1: ( rule__SigDefinitions__Group__0 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:415:2: rule__SigDefinitions__Group__0
            {
            pushFollow(FOLLOW_rule__SigDefinitions__Group__0_in_rulesigDefinitions817);
            rule__SigDefinitions__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSigDefinitionsAccess().getGroup()); 

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


    // $ANTLR start "entryRulesigConstruct"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:427:1: entryRulesigConstruct : rulesigConstruct EOF ;
    public final void entryRulesigConstruct() throws RecognitionException {
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:428:1: ( rulesigConstruct EOF )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:429:1: rulesigConstruct EOF
            {
             before(grammarAccess.getSigConstructRule()); 
            pushFollow(FOLLOW_rulesigConstruct_in_entryRulesigConstruct844);
            rulesigConstruct();

            state._fsp--;

             after(grammarAccess.getSigConstructRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulesigConstruct851); 

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
    // $ANTLR end "entryRulesigConstruct"


    // $ANTLR start "rulesigConstruct"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:436:1: rulesigConstruct : ( ( rule__SigConstruct__Alternatives ) ) ;
    public final void rulesigConstruct() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:440:2: ( ( ( rule__SigConstruct__Alternatives ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:441:1: ( ( rule__SigConstruct__Alternatives ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:441:1: ( ( rule__SigConstruct__Alternatives ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:442:1: ( rule__SigConstruct__Alternatives )
            {
             before(grammarAccess.getSigConstructAccess().getAlternatives()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:443:1: ( rule__SigConstruct__Alternatives )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:443:2: rule__SigConstruct__Alternatives
            {
            pushFollow(FOLLOW_rule__SigConstruct__Alternatives_in_rulesigConstruct877);
            rule__SigConstruct__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSigConstructAccess().getAlternatives()); 

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
    // $ANTLR end "rulesigConstruct"


    // $ANTLR start "entryRuleincludeOps"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:455:1: entryRuleincludeOps : ruleincludeOps EOF ;
    public final void entryRuleincludeOps() throws RecognitionException {
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:456:1: ( ruleincludeOps EOF )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:457:1: ruleincludeOps EOF
            {
             before(grammarAccess.getIncludeOpsRule()); 
            pushFollow(FOLLOW_ruleincludeOps_in_entryRuleincludeOps904);
            ruleincludeOps();

            state._fsp--;

             after(grammarAccess.getIncludeOpsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleincludeOps911); 

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
    // $ANTLR end "entryRuleincludeOps"


    // $ANTLR start "ruleincludeOps"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:464:1: ruleincludeOps : ( ( rule__IncludeOps__Group__0 ) ) ;
    public final void ruleincludeOps() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:468:2: ( ( ( rule__IncludeOps__Group__0 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:469:1: ( ( rule__IncludeOps__Group__0 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:469:1: ( ( rule__IncludeOps__Group__0 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:470:1: ( rule__IncludeOps__Group__0 )
            {
             before(grammarAccess.getIncludeOpsAccess().getGroup()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:471:1: ( rule__IncludeOps__Group__0 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:471:2: rule__IncludeOps__Group__0
            {
            pushFollow(FOLLOW_rule__IncludeOps__Group__0_in_ruleincludeOps937);
            rule__IncludeOps__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIncludeOpsAccess().getGroup()); 

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
    // $ANTLR end "ruleincludeOps"


    // $ANTLR start "entryRuleviewDeclaration"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:485:1: entryRuleviewDeclaration : ruleviewDeclaration EOF ;
    public final void entryRuleviewDeclaration() throws RecognitionException {
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:486:1: ( ruleviewDeclaration EOF )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:487:1: ruleviewDeclaration EOF
            {
             before(grammarAccess.getViewDeclarationRule()); 
            pushFollow(FOLLOW_ruleviewDeclaration_in_entryRuleviewDeclaration966);
            ruleviewDeclaration();

            state._fsp--;

             after(grammarAccess.getViewDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleviewDeclaration973); 

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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:494:1: ruleviewDeclaration : ( ( rule__ViewDeclaration__Group__0 ) ) ;
    public final void ruleviewDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:498:2: ( ( ( rule__ViewDeclaration__Group__0 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:499:1: ( ( rule__ViewDeclaration__Group__0 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:499:1: ( ( rule__ViewDeclaration__Group__0 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:500:1: ( rule__ViewDeclaration__Group__0 )
            {
             before(grammarAccess.getViewDeclarationAccess().getGroup()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:501:1: ( rule__ViewDeclaration__Group__0 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:501:2: rule__ViewDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__Group__0_in_ruleviewDeclaration999);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:513:1: rule__Model__DeclarationsAlternatives_0 : ( ( rulenamespaceDeclaration ) | ( rulesignatureDeclaration ) | ( ruleviewDeclaration ) | ( rulereadDeclaration ) | ( ruleJUSTSPACE ) );
    public final void rule__Model__DeclarationsAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:517:1: ( ( rulenamespaceDeclaration ) | ( rulesignatureDeclaration ) | ( ruleviewDeclaration ) | ( rulereadDeclaration ) | ( ruleJUSTSPACE ) )
            int alt2=5;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==18) ) {
                switch ( input.LA(2) ) {
                case 29:
                    {
                    alt2=4;
                    }
                    break;
                case 32:
                    {
                    alt2=2;
                    }
                    break;
                case 28:
                    {
                    alt2=1;
                    }
                    break;
                case 36:
                    {
                    alt2=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }

            }
            else if ( ((LA2_0>=RULE_SP && LA2_0<=RULE_SL_COMMENT)) ) {
                alt2=5;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:518:1: ( rulenamespaceDeclaration )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:518:1: ( rulenamespaceDeclaration )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:519:1: rulenamespaceDeclaration
                    {
                     before(grammarAccess.getModelAccess().getDeclarationsNamespaceDeclarationParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_rulenamespaceDeclaration_in_rule__Model__DeclarationsAlternatives_01035);
                    rulenamespaceDeclaration();

                    state._fsp--;

                     after(grammarAccess.getModelAccess().getDeclarationsNamespaceDeclarationParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:524:6: ( rulesignatureDeclaration )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:524:6: ( rulesignatureDeclaration )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:525:1: rulesignatureDeclaration
                    {
                     before(grammarAccess.getModelAccess().getDeclarationsSignatureDeclarationParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_rulesignatureDeclaration_in_rule__Model__DeclarationsAlternatives_01052);
                    rulesignatureDeclaration();

                    state._fsp--;

                     after(grammarAccess.getModelAccess().getDeclarationsSignatureDeclarationParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:530:6: ( ruleviewDeclaration )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:530:6: ( ruleviewDeclaration )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:531:1: ruleviewDeclaration
                    {
                     before(grammarAccess.getModelAccess().getDeclarationsViewDeclarationParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_ruleviewDeclaration_in_rule__Model__DeclarationsAlternatives_01069);
                    ruleviewDeclaration();

                    state._fsp--;

                     after(grammarAccess.getModelAccess().getDeclarationsViewDeclarationParserRuleCall_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:536:6: ( rulereadDeclaration )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:536:6: ( rulereadDeclaration )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:537:1: rulereadDeclaration
                    {
                     before(grammarAccess.getModelAccess().getDeclarationsReadDeclarationParserRuleCall_0_3()); 
                    pushFollow(FOLLOW_rulereadDeclaration_in_rule__Model__DeclarationsAlternatives_01086);
                    rulereadDeclaration();

                    state._fsp--;

                     after(grammarAccess.getModelAccess().getDeclarationsReadDeclarationParserRuleCall_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:542:6: ( ruleJUSTSPACE )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:542:6: ( ruleJUSTSPACE )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:543:1: ruleJUSTSPACE
                    {
                     before(grammarAccess.getModelAccess().getDeclarationsJUSTSPACEParserRuleCall_0_4()); 
                    pushFollow(FOLLOW_ruleJUSTSPACE_in_rule__Model__DeclarationsAlternatives_01103);
                    ruleJUSTSPACE();

                    state._fsp--;

                     after(grammarAccess.getModelAccess().getDeclarationsJUSTSPACEParserRuleCall_0_4()); 

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


    // $ANTLR start "rule__WS__Alternatives"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:553:1: rule__WS__Alternatives : ( ( RULE_SP ) | ( RULE_ML_COMMENT ) | ( RULE_ML2_COMMENT ) | ( RULE_SL_COMMENT ) );
    public final void rule__WS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:557:1: ( ( RULE_SP ) | ( RULE_ML_COMMENT ) | ( RULE_ML2_COMMENT ) | ( RULE_SL_COMMENT ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case RULE_SP:
                {
                alt3=1;
                }
                break;
            case RULE_ML_COMMENT:
                {
                alt3=2;
                }
                break;
            case RULE_ML2_COMMENT:
                {
                alt3=3;
                }
                break;
            case RULE_SL_COMMENT:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:558:1: ( RULE_SP )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:558:1: ( RULE_SP )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:559:1: RULE_SP
                    {
                     before(grammarAccess.getWSAccess().getSPTerminalRuleCall_0()); 
                    match(input,RULE_SP,FOLLOW_RULE_SP_in_rule__WS__Alternatives1135); 
                     after(grammarAccess.getWSAccess().getSPTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:564:6: ( RULE_ML_COMMENT )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:564:6: ( RULE_ML_COMMENT )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:565:1: RULE_ML_COMMENT
                    {
                     before(grammarAccess.getWSAccess().getML_COMMENTTerminalRuleCall_1()); 
                    match(input,RULE_ML_COMMENT,FOLLOW_RULE_ML_COMMENT_in_rule__WS__Alternatives1152); 
                     after(grammarAccess.getWSAccess().getML_COMMENTTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:570:6: ( RULE_ML2_COMMENT )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:570:6: ( RULE_ML2_COMMENT )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:571:1: RULE_ML2_COMMENT
                    {
                     before(grammarAccess.getWSAccess().getML2_COMMENTTerminalRuleCall_2()); 
                    match(input,RULE_ML2_COMMENT,FOLLOW_RULE_ML2_COMMENT_in_rule__WS__Alternatives1169); 
                     after(grammarAccess.getWSAccess().getML2_COMMENTTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:576:6: ( RULE_SL_COMMENT )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:576:6: ( RULE_SL_COMMENT )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:577:1: RULE_SL_COMMENT
                    {
                     before(grammarAccess.getWSAccess().getSL_COMMENTTerminalRuleCall_3()); 
                    match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_rule__WS__Alternatives1186); 
                     after(grammarAccess.getWSAccess().getSL_COMMENTTerminalRuleCall_3()); 

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
    // $ANTLR end "rule__WS__Alternatives"


    // $ANTLR start "rule__NAMESPACE__Alternatives_2_0"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:587:1: rule__NAMESPACE__Alternatives_2_0 : ( ( '/' ) | ( '.' ) );
    public final void rule__NAMESPACE__Alternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:591:1: ( ( '/' ) | ( '.' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            else if ( (LA4_0==14) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:592:1: ( '/' )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:592:1: ( '/' )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:593:1: '/'
                    {
                     before(grammarAccess.getNAMESPACEAccess().getSolidusKeyword_2_0_0()); 
                    match(input,13,FOLLOW_13_in_rule__NAMESPACE__Alternatives_2_01219); 
                     after(grammarAccess.getNAMESPACEAccess().getSolidusKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:600:6: ( '.' )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:600:6: ( '.' )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:601:1: '.'
                    {
                     before(grammarAccess.getNAMESPACEAccess().getFullStopKeyword_2_0_1()); 
                    match(input,14,FOLLOW_14_in_rule__NAMESPACE__Alternatives_2_01239); 
                     after(grammarAccess.getNAMESPACEAccess().getFullStopKeyword_2_0_1()); 

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
    // $ANTLR end "rule__NAMESPACE__Alternatives_2_0"


    // $ANTLR start "rule__GID__Alternatives"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:613:1: rule__GID__Alternatives : ( ( ( rule__GID__Group_0__0 ) ) | ( ( rule__GID__Group_1__0 ) ) | ( RULE_MULTIPLEDOT ) | ( RULE_DOUBLEDOT ) );
    public final void rule__GID__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:617:1: ( ( ( rule__GID__Group_0__0 ) ) | ( ( rule__GID__Group_1__0 ) ) | ( RULE_MULTIPLEDOT ) | ( RULE_DOUBLEDOT ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case RULE_CID:
            case RULE_ANY_OTHER:
            case RULE_INT:
                {
                alt5=1;
                }
                break;
            case 16:
                {
                alt5=2;
                }
                break;
            case RULE_MULTIPLEDOT:
                {
                alt5=3;
                }
                break;
            case RULE_DOUBLEDOT:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:618:1: ( ( rule__GID__Group_0__0 ) )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:618:1: ( ( rule__GID__Group_0__0 ) )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:619:1: ( rule__GID__Group_0__0 )
                    {
                     before(grammarAccess.getGIDAccess().getGroup_0()); 
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:620:1: ( rule__GID__Group_0__0 )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:620:2: rule__GID__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__GID__Group_0__0_in_rule__GID__Alternatives1273);
                    rule__GID__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGIDAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:624:6: ( ( rule__GID__Group_1__0 ) )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:624:6: ( ( rule__GID__Group_1__0 ) )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:625:1: ( rule__GID__Group_1__0 )
                    {
                     before(grammarAccess.getGIDAccess().getGroup_1()); 
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:626:1: ( rule__GID__Group_1__0 )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:626:2: rule__GID__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__GID__Group_1__0_in_rule__GID__Alternatives1291);
                    rule__GID__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGIDAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:630:6: ( RULE_MULTIPLEDOT )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:630:6: ( RULE_MULTIPLEDOT )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:631:1: RULE_MULTIPLEDOT
                    {
                     before(grammarAccess.getGIDAccess().getMultipleDotTerminalRuleCall_2()); 
                    match(input,RULE_MULTIPLEDOT,FOLLOW_RULE_MULTIPLEDOT_in_rule__GID__Alternatives1309); 
                     after(grammarAccess.getGIDAccess().getMultipleDotTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:636:6: ( RULE_DOUBLEDOT )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:636:6: ( RULE_DOUBLEDOT )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:637:1: RULE_DOUBLEDOT
                    {
                     before(grammarAccess.getGIDAccess().getDoubleDotTerminalRuleCall_3()); 
                    match(input,RULE_DOUBLEDOT,FOLLOW_RULE_DOUBLEDOT_in_rule__GID__Alternatives1326); 
                     after(grammarAccess.getGIDAccess().getDoubleDotTerminalRuleCall_3()); 

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
    // $ANTLR end "rule__GID__Alternatives"


    // $ANTLR start "rule__GID__Alternatives_0_0"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:647:1: rule__GID__Alternatives_0_0 : ( ( RULE_CID ) | ( RULE_ANY_OTHER ) | ( RULE_INT ) );
    public final void rule__GID__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:651:1: ( ( RULE_CID ) | ( RULE_ANY_OTHER ) | ( RULE_INT ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_CID:
                {
                alt6=1;
                }
                break;
            case RULE_ANY_OTHER:
                {
                alt6=2;
                }
                break;
            case RULE_INT:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:652:1: ( RULE_CID )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:652:1: ( RULE_CID )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:653:1: RULE_CID
                    {
                     before(grammarAccess.getGIDAccess().getCIDTerminalRuleCall_0_0_0()); 
                    match(input,RULE_CID,FOLLOW_RULE_CID_in_rule__GID__Alternatives_0_01358); 
                     after(grammarAccess.getGIDAccess().getCIDTerminalRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:658:6: ( RULE_ANY_OTHER )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:658:6: ( RULE_ANY_OTHER )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:659:1: RULE_ANY_OTHER
                    {
                     before(grammarAccess.getGIDAccess().getANY_OTHERTerminalRuleCall_0_0_1()); 
                    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_rule__GID__Alternatives_0_01375); 
                     after(grammarAccess.getGIDAccess().getANY_OTHERTerminalRuleCall_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:664:6: ( RULE_INT )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:664:6: ( RULE_INT )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:665:1: RULE_INT
                    {
                     before(grammarAccess.getGIDAccess().getINTTerminalRuleCall_0_0_2()); 
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__GID__Alternatives_0_01392); 
                     after(grammarAccess.getGIDAccess().getINTTerminalRuleCall_0_0_2()); 

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
    // $ANTLR end "rule__GID__Alternatives_0_0"


    // $ANTLR start "rule__SOMETHING__Alternatives"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:675:1: rule__SOMETHING__Alternatives : ( ( RULE_ANY_OTHER ) | ( RULE_CID ) | ( RULE_INT ) | ( ( rule__SOMETHING__Group_3__0 ) ) | ( ':' ) | ( '=' ) | ( '->' ) | ( '%' ) | ( ( rule__SOMETHING__Group_8__0 ) ) | ( RULE_MULTIPLEDOT ) | ( RULE_DOUBLEDOT ) | ( ruleWS ) );
    public final void rule__SOMETHING__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:679:1: ( ( RULE_ANY_OTHER ) | ( RULE_CID ) | ( RULE_INT ) | ( ( rule__SOMETHING__Group_3__0 ) ) | ( ':' ) | ( '=' ) | ( '->' ) | ( '%' ) | ( ( rule__SOMETHING__Group_8__0 ) ) | ( RULE_MULTIPLEDOT ) | ( RULE_DOUBLEDOT ) | ( ruleWS ) )
            int alt7=12;
            switch ( input.LA(1) ) {
            case RULE_ANY_OTHER:
                {
                alt7=1;
                }
                break;
            case RULE_CID:
                {
                alt7=2;
                }
                break;
            case RULE_INT:
                {
                alt7=3;
                }
                break;
            case 14:
                {
                alt7=4;
                }
                break;
            case 15:
                {
                alt7=5;
                }
                break;
            case 16:
                {
                alt7=6;
                }
                break;
            case 17:
                {
                alt7=7;
                }
                break;
            case 18:
                {
                alt7=8;
                }
                break;
            case 30:
                {
                alt7=9;
                }
                break;
            case RULE_MULTIPLEDOT:
                {
                alt7=10;
                }
                break;
            case RULE_DOUBLEDOT:
                {
                alt7=11;
                }
                break;
            case RULE_SP:
            case RULE_ML_COMMENT:
            case RULE_ML2_COMMENT:
            case RULE_SL_COMMENT:
                {
                alt7=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:680:1: ( RULE_ANY_OTHER )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:680:1: ( RULE_ANY_OTHER )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:681:1: RULE_ANY_OTHER
                    {
                     before(grammarAccess.getSOMETHINGAccess().getANY_OTHERTerminalRuleCall_0()); 
                    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_rule__SOMETHING__Alternatives1424); 
                     after(grammarAccess.getSOMETHINGAccess().getANY_OTHERTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:686:6: ( RULE_CID )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:686:6: ( RULE_CID )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:687:1: RULE_CID
                    {
                     before(grammarAccess.getSOMETHINGAccess().getCIDTerminalRuleCall_1()); 
                    match(input,RULE_CID,FOLLOW_RULE_CID_in_rule__SOMETHING__Alternatives1441); 
                     after(grammarAccess.getSOMETHINGAccess().getCIDTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:692:6: ( RULE_INT )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:692:6: ( RULE_INT )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:693:1: RULE_INT
                    {
                     before(grammarAccess.getSOMETHINGAccess().getINTTerminalRuleCall_2()); 
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__SOMETHING__Alternatives1458); 
                     after(grammarAccess.getSOMETHINGAccess().getINTTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:698:6: ( ( rule__SOMETHING__Group_3__0 ) )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:698:6: ( ( rule__SOMETHING__Group_3__0 ) )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:699:1: ( rule__SOMETHING__Group_3__0 )
                    {
                     before(grammarAccess.getSOMETHINGAccess().getGroup_3()); 
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:700:1: ( rule__SOMETHING__Group_3__0 )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:700:2: rule__SOMETHING__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__SOMETHING__Group_3__0_in_rule__SOMETHING__Alternatives1475);
                    rule__SOMETHING__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSOMETHINGAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:704:6: ( ':' )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:704:6: ( ':' )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:705:1: ':'
                    {
                     before(grammarAccess.getSOMETHINGAccess().getColonKeyword_4()); 
                    match(input,15,FOLLOW_15_in_rule__SOMETHING__Alternatives1494); 
                     after(grammarAccess.getSOMETHINGAccess().getColonKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:712:6: ( '=' )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:712:6: ( '=' )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:713:1: '='
                    {
                     before(grammarAccess.getSOMETHINGAccess().getEqualsSignKeyword_5()); 
                    match(input,16,FOLLOW_16_in_rule__SOMETHING__Alternatives1514); 
                     after(grammarAccess.getSOMETHINGAccess().getEqualsSignKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:720:6: ( '->' )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:720:6: ( '->' )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:721:1: '->'
                    {
                     before(grammarAccess.getSOMETHINGAccess().getHyphenMinusGreaterThanSignKeyword_6()); 
                    match(input,17,FOLLOW_17_in_rule__SOMETHING__Alternatives1534); 
                     after(grammarAccess.getSOMETHINGAccess().getHyphenMinusGreaterThanSignKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:728:6: ( '%' )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:728:6: ( '%' )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:729:1: '%'
                    {
                     before(grammarAccess.getSOMETHINGAccess().getPercentSignKeyword_7()); 
                    match(input,18,FOLLOW_18_in_rule__SOMETHING__Alternatives1554); 
                     after(grammarAccess.getSOMETHINGAccess().getPercentSignKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:736:6: ( ( rule__SOMETHING__Group_8__0 ) )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:736:6: ( ( rule__SOMETHING__Group_8__0 ) )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:737:1: ( rule__SOMETHING__Group_8__0 )
                    {
                     before(grammarAccess.getSOMETHINGAccess().getGroup_8()); 
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:738:1: ( rule__SOMETHING__Group_8__0 )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:738:2: rule__SOMETHING__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__SOMETHING__Group_8__0_in_rule__SOMETHING__Alternatives1573);
                    rule__SOMETHING__Group_8__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSOMETHINGAccess().getGroup_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:742:6: ( RULE_MULTIPLEDOT )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:742:6: ( RULE_MULTIPLEDOT )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:743:1: RULE_MULTIPLEDOT
                    {
                     before(grammarAccess.getSOMETHINGAccess().getMultipleDotTerminalRuleCall_9()); 
                    match(input,RULE_MULTIPLEDOT,FOLLOW_RULE_MULTIPLEDOT_in_rule__SOMETHING__Alternatives1591); 
                     after(grammarAccess.getSOMETHINGAccess().getMultipleDotTerminalRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:748:6: ( RULE_DOUBLEDOT )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:748:6: ( RULE_DOUBLEDOT )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:749:1: RULE_DOUBLEDOT
                    {
                     before(grammarAccess.getSOMETHINGAccess().getDoubleDotTerminalRuleCall_10()); 
                    match(input,RULE_DOUBLEDOT,FOLLOW_RULE_DOUBLEDOT_in_rule__SOMETHING__Alternatives1608); 
                     after(grammarAccess.getSOMETHINGAccess().getDoubleDotTerminalRuleCall_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:754:6: ( ruleWS )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:754:6: ( ruleWS )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:755:1: ruleWS
                    {
                     before(grammarAccess.getSOMETHINGAccess().getWSParserRuleCall_11()); 
                    pushFollow(FOLLOW_ruleWS_in_rule__SOMETHING__Alternatives1625);
                    ruleWS();

                    state._fsp--;

                     after(grammarAccess.getSOMETHINGAccess().getWSParserRuleCall_11()); 

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
    // $ANTLR end "rule__SOMETHING__Alternatives"


    // $ANTLR start "rule__SOMETHING__Alternatives_3_1"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:765:1: rule__SOMETHING__Alternatives_3_1 : ( ( RULE_CID ) | ( RULE_ANY_OTHER ) );
    public final void rule__SOMETHING__Alternatives_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:769:1: ( ( RULE_CID ) | ( RULE_ANY_OTHER ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_CID) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ANY_OTHER) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:770:1: ( RULE_CID )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:770:1: ( RULE_CID )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:771:1: RULE_CID
                    {
                     before(grammarAccess.getSOMETHINGAccess().getCIDTerminalRuleCall_3_1_0()); 
                    match(input,RULE_CID,FOLLOW_RULE_CID_in_rule__SOMETHING__Alternatives_3_11657); 
                     after(grammarAccess.getSOMETHINGAccess().getCIDTerminalRuleCall_3_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:776:6: ( RULE_ANY_OTHER )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:776:6: ( RULE_ANY_OTHER )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:777:1: RULE_ANY_OTHER
                    {
                     before(grammarAccess.getSOMETHINGAccess().getANY_OTHERTerminalRuleCall_3_1_1()); 
                    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_rule__SOMETHING__Alternatives_3_11674); 
                     after(grammarAccess.getSOMETHINGAccess().getANY_OTHERTerminalRuleCall_3_1_1()); 

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
    // $ANTLR end "rule__SOMETHING__Alternatives_3_1"


    // $ANTLR start "rule__SOMETHING2__Alternatives"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:787:1: rule__SOMETHING2__Alternatives : ( ( RULE_ANY_OTHER ) | ( RULE_CID ) | ( RULE_INT ) | ( '.' ) | ( ':' ) | ( '=' ) | ( '->' ) | ( '%' ) | ( ( rule__SOMETHING2__Group_8__0 ) ) | ( RULE_MULTIPLEDOT ) | ( RULE_DOUBLEDOT ) | ( ruleWS ) );
    public final void rule__SOMETHING2__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:791:1: ( ( RULE_ANY_OTHER ) | ( RULE_CID ) | ( RULE_INT ) | ( '.' ) | ( ':' ) | ( '=' ) | ( '->' ) | ( '%' ) | ( ( rule__SOMETHING2__Group_8__0 ) ) | ( RULE_MULTIPLEDOT ) | ( RULE_DOUBLEDOT ) | ( ruleWS ) )
            int alt9=12;
            switch ( input.LA(1) ) {
            case RULE_ANY_OTHER:
                {
                alt9=1;
                }
                break;
            case RULE_CID:
                {
                alt9=2;
                }
                break;
            case RULE_INT:
                {
                alt9=3;
                }
                break;
            case 14:
                {
                alt9=4;
                }
                break;
            case 15:
                {
                alt9=5;
                }
                break;
            case 16:
                {
                alt9=6;
                }
                break;
            case 17:
                {
                alt9=7;
                }
                break;
            case 18:
                {
                alt9=8;
                }
                break;
            case 30:
                {
                alt9=9;
                }
                break;
            case RULE_MULTIPLEDOT:
                {
                alt9=10;
                }
                break;
            case RULE_DOUBLEDOT:
                {
                alt9=11;
                }
                break;
            case RULE_SP:
            case RULE_ML_COMMENT:
            case RULE_ML2_COMMENT:
            case RULE_SL_COMMENT:
                {
                alt9=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:792:1: ( RULE_ANY_OTHER )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:792:1: ( RULE_ANY_OTHER )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:793:1: RULE_ANY_OTHER
                    {
                     before(grammarAccess.getSOMETHING2Access().getANY_OTHERTerminalRuleCall_0()); 
                    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_rule__SOMETHING2__Alternatives1706); 
                     after(grammarAccess.getSOMETHING2Access().getANY_OTHERTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:798:6: ( RULE_CID )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:798:6: ( RULE_CID )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:799:1: RULE_CID
                    {
                     before(grammarAccess.getSOMETHING2Access().getCIDTerminalRuleCall_1()); 
                    match(input,RULE_CID,FOLLOW_RULE_CID_in_rule__SOMETHING2__Alternatives1723); 
                     after(grammarAccess.getSOMETHING2Access().getCIDTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:804:6: ( RULE_INT )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:804:6: ( RULE_INT )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:805:1: RULE_INT
                    {
                     before(grammarAccess.getSOMETHING2Access().getINTTerminalRuleCall_2()); 
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__SOMETHING2__Alternatives1740); 
                     after(grammarAccess.getSOMETHING2Access().getINTTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:810:6: ( '.' )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:810:6: ( '.' )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:811:1: '.'
                    {
                     before(grammarAccess.getSOMETHING2Access().getFullStopKeyword_3()); 
                    match(input,14,FOLLOW_14_in_rule__SOMETHING2__Alternatives1758); 
                     after(grammarAccess.getSOMETHING2Access().getFullStopKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:818:6: ( ':' )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:818:6: ( ':' )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:819:1: ':'
                    {
                     before(grammarAccess.getSOMETHING2Access().getColonKeyword_4()); 
                    match(input,15,FOLLOW_15_in_rule__SOMETHING2__Alternatives1778); 
                     after(grammarAccess.getSOMETHING2Access().getColonKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:826:6: ( '=' )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:826:6: ( '=' )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:827:1: '='
                    {
                     before(grammarAccess.getSOMETHING2Access().getEqualsSignKeyword_5()); 
                    match(input,16,FOLLOW_16_in_rule__SOMETHING2__Alternatives1798); 
                     after(grammarAccess.getSOMETHING2Access().getEqualsSignKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:834:6: ( '->' )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:834:6: ( '->' )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:835:1: '->'
                    {
                     before(grammarAccess.getSOMETHING2Access().getHyphenMinusGreaterThanSignKeyword_6()); 
                    match(input,17,FOLLOW_17_in_rule__SOMETHING2__Alternatives1818); 
                     after(grammarAccess.getSOMETHING2Access().getHyphenMinusGreaterThanSignKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:842:6: ( '%' )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:842:6: ( '%' )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:843:1: '%'
                    {
                     before(grammarAccess.getSOMETHING2Access().getPercentSignKeyword_7()); 
                    match(input,18,FOLLOW_18_in_rule__SOMETHING2__Alternatives1838); 
                     after(grammarAccess.getSOMETHING2Access().getPercentSignKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:850:6: ( ( rule__SOMETHING2__Group_8__0 ) )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:850:6: ( ( rule__SOMETHING2__Group_8__0 ) )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:851:1: ( rule__SOMETHING2__Group_8__0 )
                    {
                     before(grammarAccess.getSOMETHING2Access().getGroup_8()); 
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:852:1: ( rule__SOMETHING2__Group_8__0 )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:852:2: rule__SOMETHING2__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__SOMETHING2__Group_8__0_in_rule__SOMETHING2__Alternatives1857);
                    rule__SOMETHING2__Group_8__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSOMETHING2Access().getGroup_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:856:6: ( RULE_MULTIPLEDOT )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:856:6: ( RULE_MULTIPLEDOT )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:857:1: RULE_MULTIPLEDOT
                    {
                     before(grammarAccess.getSOMETHING2Access().getMultipleDotTerminalRuleCall_9()); 
                    match(input,RULE_MULTIPLEDOT,FOLLOW_RULE_MULTIPLEDOT_in_rule__SOMETHING2__Alternatives1875); 
                     after(grammarAccess.getSOMETHING2Access().getMultipleDotTerminalRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:862:6: ( RULE_DOUBLEDOT )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:862:6: ( RULE_DOUBLEDOT )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:863:1: RULE_DOUBLEDOT
                    {
                     before(grammarAccess.getSOMETHING2Access().getDoubleDotTerminalRuleCall_10()); 
                    match(input,RULE_DOUBLEDOT,FOLLOW_RULE_DOUBLEDOT_in_rule__SOMETHING2__Alternatives1892); 
                     after(grammarAccess.getSOMETHING2Access().getDoubleDotTerminalRuleCall_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:868:6: ( ruleWS )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:868:6: ( ruleWS )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:869:1: ruleWS
                    {
                     before(grammarAccess.getSOMETHING2Access().getWSParserRuleCall_11()); 
                    pushFollow(FOLLOW_ruleWS_in_rule__SOMETHING2__Alternatives1909);
                    ruleWS();

                    state._fsp--;

                     after(grammarAccess.getSOMETHING2Access().getWSParserRuleCall_11()); 

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
    // $ANTLR end "rule__SOMETHING2__Alternatives"


    // $ANTLR start "rule__SigConstruct__Alternatives"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:880:1: rule__SigConstruct__Alternatives : ( ( ( rule__SigConstruct__Group_0__0 ) ) | ( ( rule__SigConstruct__Group_1__0 ) ) | ( ( rule__SigConstruct__Group_2__0 ) ) | ( ( rule__SigConstruct__Group_3__0 ) ) );
    public final void rule__SigConstruct__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:884:1: ( ( ( rule__SigConstruct__Group_0__0 ) ) | ( ( rule__SigConstruct__Group_1__0 ) ) | ( ( rule__SigConstruct__Group_2__0 ) ) | ( ( rule__SigConstruct__Group_3__0 ) ) )
            int alt10=4;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_MULTIPLEDOT && LA10_0<=RULE_INT)||LA10_0==16) ) {
                alt10=1;
            }
            else if ( (LA10_0==18) ) {
                switch ( input.LA(2) ) {
                case 33:
                    {
                    alt10=2;
                    }
                    break;
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    {
                    alt10=4;
                    }
                    break;
                case 34:
                    {
                    alt10=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 2, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:885:1: ( ( rule__SigConstruct__Group_0__0 ) )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:885:1: ( ( rule__SigConstruct__Group_0__0 ) )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:886:1: ( rule__SigConstruct__Group_0__0 )
                    {
                     before(grammarAccess.getSigConstructAccess().getGroup_0()); 
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:887:1: ( rule__SigConstruct__Group_0__0 )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:887:2: rule__SigConstruct__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__SigConstruct__Group_0__0_in_rule__SigConstruct__Alternatives1942);
                    rule__SigConstruct__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSigConstructAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:891:6: ( ( rule__SigConstruct__Group_1__0 ) )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:891:6: ( ( rule__SigConstruct__Group_1__0 ) )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:892:1: ( rule__SigConstruct__Group_1__0 )
                    {
                     before(grammarAccess.getSigConstructAccess().getGroup_1()); 
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:893:1: ( rule__SigConstruct__Group_1__0 )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:893:2: rule__SigConstruct__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__SigConstruct__Group_1__0_in_rule__SigConstruct__Alternatives1960);
                    rule__SigConstruct__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSigConstructAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:897:6: ( ( rule__SigConstruct__Group_2__0 ) )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:897:6: ( ( rule__SigConstruct__Group_2__0 ) )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:898:1: ( rule__SigConstruct__Group_2__0 )
                    {
                     before(grammarAccess.getSigConstructAccess().getGroup_2()); 
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:899:1: ( rule__SigConstruct__Group_2__0 )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:899:2: rule__SigConstruct__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__SigConstruct__Group_2__0_in_rule__SigConstruct__Alternatives1978);
                    rule__SigConstruct__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSigConstructAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:903:6: ( ( rule__SigConstruct__Group_3__0 ) )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:903:6: ( ( rule__SigConstruct__Group_3__0 ) )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:904:1: ( rule__SigConstruct__Group_3__0 )
                    {
                     before(grammarAccess.getSigConstructAccess().getGroup_3()); 
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:905:1: ( rule__SigConstruct__Group_3__0 )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:905:2: rule__SigConstruct__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__SigConstruct__Group_3__0_in_rule__SigConstruct__Alternatives1996);
                    rule__SigConstruct__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSigConstructAccess().getGroup_3()); 

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
    // $ANTLR end "rule__SigConstruct__Alternatives"


    // $ANTLR start "rule__SigConstruct__Alternatives_0_2"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:914:1: rule__SigConstruct__Alternatives_0_2 : ( ( ':' ) | ( ':=' ) | ( '=' ) );
    public final void rule__SigConstruct__Alternatives_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:918:1: ( ( ':' ) | ( ':=' ) | ( '=' ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt11=1;
                }
                break;
            case 19:
                {
                alt11=2;
                }
                break;
            case 16:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:919:1: ( ':' )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:919:1: ( ':' )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:920:1: ':'
                    {
                     before(grammarAccess.getSigConstructAccess().getColonKeyword_0_2_0()); 
                    match(input,15,FOLLOW_15_in_rule__SigConstruct__Alternatives_0_22030); 
                     after(grammarAccess.getSigConstructAccess().getColonKeyword_0_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:927:6: ( ':=' )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:927:6: ( ':=' )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:928:1: ':='
                    {
                     before(grammarAccess.getSigConstructAccess().getColonEqualsSignKeyword_0_2_1()); 
                    match(input,19,FOLLOW_19_in_rule__SigConstruct__Alternatives_0_22050); 
                     after(grammarAccess.getSigConstructAccess().getColonEqualsSignKeyword_0_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:935:6: ( '=' )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:935:6: ( '=' )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:936:1: '='
                    {
                     before(grammarAccess.getSigConstructAccess().getEqualsSignKeyword_0_2_2()); 
                    match(input,16,FOLLOW_16_in_rule__SigConstruct__Alternatives_0_22070); 
                     after(grammarAccess.getSigConstructAccess().getEqualsSignKeyword_0_2_2()); 

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
    // $ANTLR end "rule__SigConstruct__Alternatives_0_2"


    // $ANTLR start "rule__SigConstruct__Alternatives_2_5"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:948:1: rule__SigConstruct__Alternatives_2_5 : ( ( ':' ) | ( ':=' ) );
    public final void rule__SigConstruct__Alternatives_2_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:952:1: ( ( ':' ) | ( ':=' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==15) ) {
                alt12=1;
            }
            else if ( (LA12_0==19) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:953:1: ( ':' )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:953:1: ( ':' )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:954:1: ':'
                    {
                     before(grammarAccess.getSigConstructAccess().getColonKeyword_2_5_0()); 
                    match(input,15,FOLLOW_15_in_rule__SigConstruct__Alternatives_2_52105); 
                     after(grammarAccess.getSigConstructAccess().getColonKeyword_2_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:961:6: ( ':=' )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:961:6: ( ':=' )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:962:1: ':='
                    {
                     before(grammarAccess.getSigConstructAccess().getColonEqualsSignKeyword_2_5_1()); 
                    match(input,19,FOLLOW_19_in_rule__SigConstruct__Alternatives_2_52125); 
                     after(grammarAccess.getSigConstructAccess().getColonEqualsSignKeyword_2_5_1()); 

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
    // $ANTLR end "rule__SigConstruct__Alternatives_2_5"


    // $ANTLR start "rule__SigConstruct__TmpAlternatives_3_1_0"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:974:1: rule__SigConstruct__TmpAlternatives_3_1_0 : ( ( 'meta' ) | ( 'abbrev' ) | ( 'name' ) | ( 'pattern' ) | ( 'infix' ) | ( 'prefix' ) | ( 'postfix' ) );
    public final void rule__SigConstruct__TmpAlternatives_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:978:1: ( ( 'meta' ) | ( 'abbrev' ) | ( 'name' ) | ( 'pattern' ) | ( 'infix' ) | ( 'prefix' ) | ( 'postfix' ) )
            int alt13=7;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt13=1;
                }
                break;
            case 21:
                {
                alt13=2;
                }
                break;
            case 22:
                {
                alt13=3;
                }
                break;
            case 23:
                {
                alt13=4;
                }
                break;
            case 24:
                {
                alt13=5;
                }
                break;
            case 25:
                {
                alt13=6;
                }
                break;
            case 26:
                {
                alt13=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:979:1: ( 'meta' )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:979:1: ( 'meta' )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:980:1: 'meta'
                    {
                     before(grammarAccess.getSigConstructAccess().getTmpMetaKeyword_3_1_0_0()); 
                    match(input,20,FOLLOW_20_in_rule__SigConstruct__TmpAlternatives_3_1_02160); 
                     after(grammarAccess.getSigConstructAccess().getTmpMetaKeyword_3_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:987:6: ( 'abbrev' )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:987:6: ( 'abbrev' )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:988:1: 'abbrev'
                    {
                     before(grammarAccess.getSigConstructAccess().getTmpAbbrevKeyword_3_1_0_1()); 
                    match(input,21,FOLLOW_21_in_rule__SigConstruct__TmpAlternatives_3_1_02180); 
                     after(grammarAccess.getSigConstructAccess().getTmpAbbrevKeyword_3_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:995:6: ( 'name' )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:995:6: ( 'name' )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:996:1: 'name'
                    {
                     before(grammarAccess.getSigConstructAccess().getTmpNameKeyword_3_1_0_2()); 
                    match(input,22,FOLLOW_22_in_rule__SigConstruct__TmpAlternatives_3_1_02200); 
                     after(grammarAccess.getSigConstructAccess().getTmpNameKeyword_3_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1003:6: ( 'pattern' )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1003:6: ( 'pattern' )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1004:1: 'pattern'
                    {
                     before(grammarAccess.getSigConstructAccess().getTmpPatternKeyword_3_1_0_3()); 
                    match(input,23,FOLLOW_23_in_rule__SigConstruct__TmpAlternatives_3_1_02220); 
                     after(grammarAccess.getSigConstructAccess().getTmpPatternKeyword_3_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1011:6: ( 'infix' )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1011:6: ( 'infix' )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1012:1: 'infix'
                    {
                     before(grammarAccess.getSigConstructAccess().getTmpInfixKeyword_3_1_0_4()); 
                    match(input,24,FOLLOW_24_in_rule__SigConstruct__TmpAlternatives_3_1_02240); 
                     after(grammarAccess.getSigConstructAccess().getTmpInfixKeyword_3_1_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1019:6: ( 'prefix' )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1019:6: ( 'prefix' )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1020:1: 'prefix'
                    {
                     before(grammarAccess.getSigConstructAccess().getTmpPrefixKeyword_3_1_0_5()); 
                    match(input,25,FOLLOW_25_in_rule__SigConstruct__TmpAlternatives_3_1_02260); 
                     after(grammarAccess.getSigConstructAccess().getTmpPrefixKeyword_3_1_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1027:6: ( 'postfix' )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1027:6: ( 'postfix' )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1028:1: 'postfix'
                    {
                     before(grammarAccess.getSigConstructAccess().getTmpPostfixKeyword_3_1_0_6()); 
                    match(input,26,FOLLOW_26_in_rule__SigConstruct__TmpAlternatives_3_1_02280); 
                     after(grammarAccess.getSigConstructAccess().getTmpPostfixKeyword_3_1_0_6()); 

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
    // $ANTLR end "rule__SigConstruct__TmpAlternatives_3_1_0"


    // $ANTLR start "rule__NAMESPACE__Group__0"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1043:1: rule__NAMESPACE__Group__0 : rule__NAMESPACE__Group__0__Impl rule__NAMESPACE__Group__1 ;
    public final void rule__NAMESPACE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1047:1: ( rule__NAMESPACE__Group__0__Impl rule__NAMESPACE__Group__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1048:2: rule__NAMESPACE__Group__0__Impl rule__NAMESPACE__Group__1
            {
            pushFollow(FOLLOW_rule__NAMESPACE__Group__0__Impl_in_rule__NAMESPACE__Group__02313);
            rule__NAMESPACE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NAMESPACE__Group__1_in_rule__NAMESPACE__Group__02316);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1055:1: rule__NAMESPACE__Group__0__Impl : ( ( rule__NAMESPACE__Group_0__0 )* ) ;
    public final void rule__NAMESPACE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1059:1: ( ( ( rule__NAMESPACE__Group_0__0 )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1060:1: ( ( rule__NAMESPACE__Group_0__0 )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1060:1: ( ( rule__NAMESPACE__Group_0__0 )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1061:1: ( rule__NAMESPACE__Group_0__0 )*
            {
             before(grammarAccess.getNAMESPACEAccess().getGroup_0()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1062:1: ( rule__NAMESPACE__Group_0__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_DOUBLEDOT) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1062:2: rule__NAMESPACE__Group_0__0
            	    {
            	    pushFollow(FOLLOW_rule__NAMESPACE__Group_0__0_in_rule__NAMESPACE__Group__0__Impl2343);
            	    rule__NAMESPACE__Group_0__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getNAMESPACEAccess().getGroup_0()); 

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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1072:1: rule__NAMESPACE__Group__1 : rule__NAMESPACE__Group__1__Impl rule__NAMESPACE__Group__2 ;
    public final void rule__NAMESPACE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1076:1: ( rule__NAMESPACE__Group__1__Impl rule__NAMESPACE__Group__2 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1077:2: rule__NAMESPACE__Group__1__Impl rule__NAMESPACE__Group__2
            {
            pushFollow(FOLLOW_rule__NAMESPACE__Group__1__Impl_in_rule__NAMESPACE__Group__12374);
            rule__NAMESPACE__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NAMESPACE__Group__2_in_rule__NAMESPACE__Group__12377);
            rule__NAMESPACE__Group__2();

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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1084:1: rule__NAMESPACE__Group__1__Impl : ( RULE_CID ) ;
    public final void rule__NAMESPACE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1088:1: ( ( RULE_CID ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1089:1: ( RULE_CID )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1089:1: ( RULE_CID )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1090:1: RULE_CID
            {
             before(grammarAccess.getNAMESPACEAccess().getCIDTerminalRuleCall_1()); 
            match(input,RULE_CID,FOLLOW_RULE_CID_in_rule__NAMESPACE__Group__1__Impl2404); 
             after(grammarAccess.getNAMESPACEAccess().getCIDTerminalRuleCall_1()); 

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


    // $ANTLR start "rule__NAMESPACE__Group__2"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1101:1: rule__NAMESPACE__Group__2 : rule__NAMESPACE__Group__2__Impl ;
    public final void rule__NAMESPACE__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1105:1: ( rule__NAMESPACE__Group__2__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1106:2: rule__NAMESPACE__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__NAMESPACE__Group__2__Impl_in_rule__NAMESPACE__Group__22433);
            rule__NAMESPACE__Group__2__Impl();

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
    // $ANTLR end "rule__NAMESPACE__Group__2"


    // $ANTLR start "rule__NAMESPACE__Group__2__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1112:1: rule__NAMESPACE__Group__2__Impl : ( ( rule__NAMESPACE__Group_2__0 )* ) ;
    public final void rule__NAMESPACE__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1116:1: ( ( ( rule__NAMESPACE__Group_2__0 )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1117:1: ( ( rule__NAMESPACE__Group_2__0 )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1117:1: ( ( rule__NAMESPACE__Group_2__0 )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1118:1: ( rule__NAMESPACE__Group_2__0 )*
            {
             before(grammarAccess.getNAMESPACEAccess().getGroup_2()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1119:1: ( rule__NAMESPACE__Group_2__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==14) ) {
                    int LA15_2 = input.LA(2);

                    if ( (LA15_2==RULE_CID) ) {
                        alt15=1;
                    }


                }
                else if ( (LA15_0==13) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1119:2: rule__NAMESPACE__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__NAMESPACE__Group_2__0_in_rule__NAMESPACE__Group__2__Impl2460);
            	    rule__NAMESPACE__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getNAMESPACEAccess().getGroup_2()); 

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
    // $ANTLR end "rule__NAMESPACE__Group__2__Impl"


    // $ANTLR start "rule__NAMESPACE__Group_0__0"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1135:1: rule__NAMESPACE__Group_0__0 : rule__NAMESPACE__Group_0__0__Impl rule__NAMESPACE__Group_0__1 ;
    public final void rule__NAMESPACE__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1139:1: ( rule__NAMESPACE__Group_0__0__Impl rule__NAMESPACE__Group_0__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1140:2: rule__NAMESPACE__Group_0__0__Impl rule__NAMESPACE__Group_0__1
            {
            pushFollow(FOLLOW_rule__NAMESPACE__Group_0__0__Impl_in_rule__NAMESPACE__Group_0__02497);
            rule__NAMESPACE__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NAMESPACE__Group_0__1_in_rule__NAMESPACE__Group_0__02500);
            rule__NAMESPACE__Group_0__1();

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
    // $ANTLR end "rule__NAMESPACE__Group_0__0"


    // $ANTLR start "rule__NAMESPACE__Group_0__0__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1147:1: rule__NAMESPACE__Group_0__0__Impl : ( RULE_DOUBLEDOT ) ;
    public final void rule__NAMESPACE__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1151:1: ( ( RULE_DOUBLEDOT ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1152:1: ( RULE_DOUBLEDOT )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1152:1: ( RULE_DOUBLEDOT )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1153:1: RULE_DOUBLEDOT
            {
             before(grammarAccess.getNAMESPACEAccess().getDoubleDotTerminalRuleCall_0_0()); 
            match(input,RULE_DOUBLEDOT,FOLLOW_RULE_DOUBLEDOT_in_rule__NAMESPACE__Group_0__0__Impl2527); 
             after(grammarAccess.getNAMESPACEAccess().getDoubleDotTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__NAMESPACE__Group_0__0__Impl"


    // $ANTLR start "rule__NAMESPACE__Group_0__1"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1164:1: rule__NAMESPACE__Group_0__1 : rule__NAMESPACE__Group_0__1__Impl ;
    public final void rule__NAMESPACE__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1168:1: ( rule__NAMESPACE__Group_0__1__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1169:2: rule__NAMESPACE__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__NAMESPACE__Group_0__1__Impl_in_rule__NAMESPACE__Group_0__12556);
            rule__NAMESPACE__Group_0__1__Impl();

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
    // $ANTLR end "rule__NAMESPACE__Group_0__1"


    // $ANTLR start "rule__NAMESPACE__Group_0__1__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1175:1: rule__NAMESPACE__Group_0__1__Impl : ( '/' ) ;
    public final void rule__NAMESPACE__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1179:1: ( ( '/' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1180:1: ( '/' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1180:1: ( '/' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1181:1: '/'
            {
             before(grammarAccess.getNAMESPACEAccess().getSolidusKeyword_0_1()); 
            match(input,13,FOLLOW_13_in_rule__NAMESPACE__Group_0__1__Impl2584); 
             after(grammarAccess.getNAMESPACEAccess().getSolidusKeyword_0_1()); 

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
    // $ANTLR end "rule__NAMESPACE__Group_0__1__Impl"


    // $ANTLR start "rule__NAMESPACE__Group_2__0"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1198:1: rule__NAMESPACE__Group_2__0 : rule__NAMESPACE__Group_2__0__Impl rule__NAMESPACE__Group_2__1 ;
    public final void rule__NAMESPACE__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1202:1: ( rule__NAMESPACE__Group_2__0__Impl rule__NAMESPACE__Group_2__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1203:2: rule__NAMESPACE__Group_2__0__Impl rule__NAMESPACE__Group_2__1
            {
            pushFollow(FOLLOW_rule__NAMESPACE__Group_2__0__Impl_in_rule__NAMESPACE__Group_2__02619);
            rule__NAMESPACE__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NAMESPACE__Group_2__1_in_rule__NAMESPACE__Group_2__02622);
            rule__NAMESPACE__Group_2__1();

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
    // $ANTLR end "rule__NAMESPACE__Group_2__0"


    // $ANTLR start "rule__NAMESPACE__Group_2__0__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1210:1: rule__NAMESPACE__Group_2__0__Impl : ( ( rule__NAMESPACE__Alternatives_2_0 ) ) ;
    public final void rule__NAMESPACE__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1214:1: ( ( ( rule__NAMESPACE__Alternatives_2_0 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1215:1: ( ( rule__NAMESPACE__Alternatives_2_0 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1215:1: ( ( rule__NAMESPACE__Alternatives_2_0 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1216:1: ( rule__NAMESPACE__Alternatives_2_0 )
            {
             before(grammarAccess.getNAMESPACEAccess().getAlternatives_2_0()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1217:1: ( rule__NAMESPACE__Alternatives_2_0 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1217:2: rule__NAMESPACE__Alternatives_2_0
            {
            pushFollow(FOLLOW_rule__NAMESPACE__Alternatives_2_0_in_rule__NAMESPACE__Group_2__0__Impl2649);
            rule__NAMESPACE__Alternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getNAMESPACEAccess().getAlternatives_2_0()); 

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
    // $ANTLR end "rule__NAMESPACE__Group_2__0__Impl"


    // $ANTLR start "rule__NAMESPACE__Group_2__1"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1227:1: rule__NAMESPACE__Group_2__1 : rule__NAMESPACE__Group_2__1__Impl ;
    public final void rule__NAMESPACE__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1231:1: ( rule__NAMESPACE__Group_2__1__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1232:2: rule__NAMESPACE__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__NAMESPACE__Group_2__1__Impl_in_rule__NAMESPACE__Group_2__12679);
            rule__NAMESPACE__Group_2__1__Impl();

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
    // $ANTLR end "rule__NAMESPACE__Group_2__1"


    // $ANTLR start "rule__NAMESPACE__Group_2__1__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1238:1: rule__NAMESPACE__Group_2__1__Impl : ( RULE_CID ) ;
    public final void rule__NAMESPACE__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1242:1: ( ( RULE_CID ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1243:1: ( RULE_CID )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1243:1: ( RULE_CID )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1244:1: RULE_CID
            {
             before(grammarAccess.getNAMESPACEAccess().getCIDTerminalRuleCall_2_1()); 
            match(input,RULE_CID,FOLLOW_RULE_CID_in_rule__NAMESPACE__Group_2__1__Impl2706); 
             after(grammarAccess.getNAMESPACEAccess().getCIDTerminalRuleCall_2_1()); 

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
    // $ANTLR end "rule__NAMESPACE__Group_2__1__Impl"


    // $ANTLR start "rule__URI__Group__0"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1259:1: rule__URI__Group__0 : rule__URI__Group__0__Impl rule__URI__Group__1 ;
    public final void rule__URI__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1263:1: ( rule__URI__Group__0__Impl rule__URI__Group__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1264:2: rule__URI__Group__0__Impl rule__URI__Group__1
            {
            pushFollow(FOLLOW_rule__URI__Group__0__Impl_in_rule__URI__Group__02739);
            rule__URI__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URI__Group__1_in_rule__URI__Group__02742);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1271:1: rule__URI__Group__0__Impl : ( ( rule__URI__Group_0__0 )? ) ;
    public final void rule__URI__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1275:1: ( ( ( rule__URI__Group_0__0 )? ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1276:1: ( ( rule__URI__Group_0__0 )? )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1276:1: ( ( rule__URI__Group_0__0 )? )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1277:1: ( rule__URI__Group_0__0 )?
            {
             before(grammarAccess.getURIAccess().getGroup_0()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1278:1: ( rule__URI__Group_0__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_CID) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==15) ) {
                    alt16=1;
                }
            }
            switch (alt16) {
                case 1 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1278:2: rule__URI__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__URI__Group_0__0_in_rule__URI__Group__0__Impl2769);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1288:1: rule__URI__Group__1 : rule__URI__Group__1__Impl ;
    public final void rule__URI__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1292:1: ( rule__URI__Group__1__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1293:2: rule__URI__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__URI__Group__1__Impl_in_rule__URI__Group__12800);
            rule__URI__Group__1__Impl();

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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1299:1: rule__URI__Group__1__Impl : ( ruleNAMESPACE ) ;
    public final void rule__URI__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1303:1: ( ( ruleNAMESPACE ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1304:1: ( ruleNAMESPACE )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1304:1: ( ruleNAMESPACE )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1305:1: ruleNAMESPACE
            {
             before(grammarAccess.getURIAccess().getNAMESPACEParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleNAMESPACE_in_rule__URI__Group__1__Impl2827);
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


    // $ANTLR start "rule__URI__Group_0__0"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1320:1: rule__URI__Group_0__0 : rule__URI__Group_0__0__Impl rule__URI__Group_0__1 ;
    public final void rule__URI__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1324:1: ( rule__URI__Group_0__0__Impl rule__URI__Group_0__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1325:2: rule__URI__Group_0__0__Impl rule__URI__Group_0__1
            {
            pushFollow(FOLLOW_rule__URI__Group_0__0__Impl_in_rule__URI__Group_0__02860);
            rule__URI__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URI__Group_0__1_in_rule__URI__Group_0__02863);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1332:1: rule__URI__Group_0__0__Impl : ( RULE_CID ) ;
    public final void rule__URI__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1336:1: ( ( RULE_CID ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1337:1: ( RULE_CID )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1337:1: ( RULE_CID )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1338:1: RULE_CID
            {
             before(grammarAccess.getURIAccess().getCIDTerminalRuleCall_0_0()); 
            match(input,RULE_CID,FOLLOW_RULE_CID_in_rule__URI__Group_0__0__Impl2890); 
             after(grammarAccess.getURIAccess().getCIDTerminalRuleCall_0_0()); 

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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1349:1: rule__URI__Group_0__1 : rule__URI__Group_0__1__Impl rule__URI__Group_0__2 ;
    public final void rule__URI__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1353:1: ( rule__URI__Group_0__1__Impl rule__URI__Group_0__2 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1354:2: rule__URI__Group_0__1__Impl rule__URI__Group_0__2
            {
            pushFollow(FOLLOW_rule__URI__Group_0__1__Impl_in_rule__URI__Group_0__12919);
            rule__URI__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URI__Group_0__2_in_rule__URI__Group_0__12922);
            rule__URI__Group_0__2();

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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1361:1: rule__URI__Group_0__1__Impl : ( ':' ) ;
    public final void rule__URI__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1365:1: ( ( ':' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1366:1: ( ':' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1366:1: ( ':' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1367:1: ':'
            {
             before(grammarAccess.getURIAccess().getColonKeyword_0_1()); 
            match(input,15,FOLLOW_15_in_rule__URI__Group_0__1__Impl2950); 
             after(grammarAccess.getURIAccess().getColonKeyword_0_1()); 

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


    // $ANTLR start "rule__URI__Group_0__2"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1380:1: rule__URI__Group_0__2 : rule__URI__Group_0__2__Impl rule__URI__Group_0__3 ;
    public final void rule__URI__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1384:1: ( rule__URI__Group_0__2__Impl rule__URI__Group_0__3 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1385:2: rule__URI__Group_0__2__Impl rule__URI__Group_0__3
            {
            pushFollow(FOLLOW_rule__URI__Group_0__2__Impl_in_rule__URI__Group_0__22981);
            rule__URI__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URI__Group_0__3_in_rule__URI__Group_0__22984);
            rule__URI__Group_0__3();

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
    // $ANTLR end "rule__URI__Group_0__2"


    // $ANTLR start "rule__URI__Group_0__2__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1392:1: rule__URI__Group_0__2__Impl : ( '/' ) ;
    public final void rule__URI__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1396:1: ( ( '/' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1397:1: ( '/' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1397:1: ( '/' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1398:1: '/'
            {
             before(grammarAccess.getURIAccess().getSolidusKeyword_0_2()); 
            match(input,13,FOLLOW_13_in_rule__URI__Group_0__2__Impl3012); 
             after(grammarAccess.getURIAccess().getSolidusKeyword_0_2()); 

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
    // $ANTLR end "rule__URI__Group_0__2__Impl"


    // $ANTLR start "rule__URI__Group_0__3"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1411:1: rule__URI__Group_0__3 : rule__URI__Group_0__3__Impl ;
    public final void rule__URI__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1415:1: ( rule__URI__Group_0__3__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1416:2: rule__URI__Group_0__3__Impl
            {
            pushFollow(FOLLOW_rule__URI__Group_0__3__Impl_in_rule__URI__Group_0__33043);
            rule__URI__Group_0__3__Impl();

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
    // $ANTLR end "rule__URI__Group_0__3"


    // $ANTLR start "rule__URI__Group_0__3__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1422:1: rule__URI__Group_0__3__Impl : ( '/' ) ;
    public final void rule__URI__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1426:1: ( ( '/' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1427:1: ( '/' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1427:1: ( '/' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1428:1: '/'
            {
             before(grammarAccess.getURIAccess().getSolidusKeyword_0_3()); 
            match(input,13,FOLLOW_13_in_rule__URI__Group_0__3__Impl3071); 
             after(grammarAccess.getURIAccess().getSolidusKeyword_0_3()); 

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
    // $ANTLR end "rule__URI__Group_0__3__Impl"


    // $ANTLR start "rule__URISTRING__Group__0"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1449:1: rule__URISTRING__Group__0 : rule__URISTRING__Group__0__Impl rule__URISTRING__Group__1 ;
    public final void rule__URISTRING__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1453:1: ( rule__URISTRING__Group__0__Impl rule__URISTRING__Group__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1454:2: rule__URISTRING__Group__0__Impl rule__URISTRING__Group__1
            {
            pushFollow(FOLLOW_rule__URISTRING__Group__0__Impl_in_rule__URISTRING__Group__03110);
            rule__URISTRING__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URISTRING__Group__1_in_rule__URISTRING__Group__03113);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1461:1: rule__URISTRING__Group__0__Impl : ( '\"' ) ;
    public final void rule__URISTRING__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1465:1: ( ( '\"' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1466:1: ( '\"' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1466:1: ( '\"' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1467:1: '\"'
            {
             before(grammarAccess.getURISTRINGAccess().getQuotationMarkKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__URISTRING__Group__0__Impl3141); 
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1480:1: rule__URISTRING__Group__1 : rule__URISTRING__Group__1__Impl rule__URISTRING__Group__2 ;
    public final void rule__URISTRING__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1484:1: ( rule__URISTRING__Group__1__Impl rule__URISTRING__Group__2 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1485:2: rule__URISTRING__Group__1__Impl rule__URISTRING__Group__2
            {
            pushFollow(FOLLOW_rule__URISTRING__Group__1__Impl_in_rule__URISTRING__Group__13172);
            rule__URISTRING__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URISTRING__Group__2_in_rule__URISTRING__Group__13175);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1492:1: rule__URISTRING__Group__1__Impl : ( ruleURI ) ;
    public final void rule__URISTRING__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1496:1: ( ( ruleURI ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1497:1: ( ruleURI )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1497:1: ( ruleURI )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1498:1: ruleURI
            {
             before(grammarAccess.getURISTRINGAccess().getURIParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleURI_in_rule__URISTRING__Group__1__Impl3202);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1509:1: rule__URISTRING__Group__2 : rule__URISTRING__Group__2__Impl ;
    public final void rule__URISTRING__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1513:1: ( rule__URISTRING__Group__2__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1514:2: rule__URISTRING__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__URISTRING__Group__2__Impl_in_rule__URISTRING__Group__23231);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1520:1: rule__URISTRING__Group__2__Impl : ( '\"' ) ;
    public final void rule__URISTRING__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1524:1: ( ( '\"' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1525:1: ( '\"' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1525:1: ( '\"' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1526:1: '\"'
            {
             before(grammarAccess.getURISTRINGAccess().getQuotationMarkKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__URISTRING__Group__2__Impl3259); 
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


    // $ANTLR start "rule__NamespaceDeclaration__Group__0"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1545:1: rule__NamespaceDeclaration__Group__0 : rule__NamespaceDeclaration__Group__0__Impl rule__NamespaceDeclaration__Group__1 ;
    public final void rule__NamespaceDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1549:1: ( rule__NamespaceDeclaration__Group__0__Impl rule__NamespaceDeclaration__Group__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1550:2: rule__NamespaceDeclaration__Group__0__Impl rule__NamespaceDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group__0__Impl_in_rule__NamespaceDeclaration__Group__03296);
            rule__NamespaceDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group__1_in_rule__NamespaceDeclaration__Group__03299);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1557:1: rule__NamespaceDeclaration__Group__0__Impl : ( '%' ) ;
    public final void rule__NamespaceDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1561:1: ( ( '%' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1562:1: ( '%' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1562:1: ( '%' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1563:1: '%'
            {
             before(grammarAccess.getNamespaceDeclarationAccess().getPercentSignKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__NamespaceDeclaration__Group__0__Impl3327); 
             after(grammarAccess.getNamespaceDeclarationAccess().getPercentSignKeyword_0()); 

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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1576:1: rule__NamespaceDeclaration__Group__1 : rule__NamespaceDeclaration__Group__1__Impl rule__NamespaceDeclaration__Group__2 ;
    public final void rule__NamespaceDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1580:1: ( rule__NamespaceDeclaration__Group__1__Impl rule__NamespaceDeclaration__Group__2 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1581:2: rule__NamespaceDeclaration__Group__1__Impl rule__NamespaceDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group__1__Impl_in_rule__NamespaceDeclaration__Group__13358);
            rule__NamespaceDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group__2_in_rule__NamespaceDeclaration__Group__13361);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1588:1: rule__NamespaceDeclaration__Group__1__Impl : ( 'namespace' ) ;
    public final void rule__NamespaceDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1592:1: ( ( 'namespace' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1593:1: ( 'namespace' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1593:1: ( 'namespace' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1594:1: 'namespace'
            {
             before(grammarAccess.getNamespaceDeclarationAccess().getNamespaceKeyword_1()); 
            match(input,28,FOLLOW_28_in_rule__NamespaceDeclaration__Group__1__Impl3389); 
             after(grammarAccess.getNamespaceDeclarationAccess().getNamespaceKeyword_1()); 

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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1607:1: rule__NamespaceDeclaration__Group__2 : rule__NamespaceDeclaration__Group__2__Impl rule__NamespaceDeclaration__Group__3 ;
    public final void rule__NamespaceDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1611:1: ( rule__NamespaceDeclaration__Group__2__Impl rule__NamespaceDeclaration__Group__3 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1612:2: rule__NamespaceDeclaration__Group__2__Impl rule__NamespaceDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group__2__Impl_in_rule__NamespaceDeclaration__Group__23420);
            rule__NamespaceDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group__3_in_rule__NamespaceDeclaration__Group__23423);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1619:1: rule__NamespaceDeclaration__Group__2__Impl : ( ( ( ruleWS ) ) ( ( ruleWS )* ) ) ;
    public final void rule__NamespaceDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1623:1: ( ( ( ( ruleWS ) ) ( ( ruleWS )* ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1624:1: ( ( ( ruleWS ) ) ( ( ruleWS )* ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1624:1: ( ( ( ruleWS ) ) ( ( ruleWS )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1625:1: ( ( ruleWS ) ) ( ( ruleWS )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1625:1: ( ( ruleWS ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1626:1: ( ruleWS )
            {
             before(grammarAccess.getNamespaceDeclarationAccess().getWSParserRuleCall_2()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1627:1: ( ruleWS )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1627:3: ruleWS
            {
            pushFollow(FOLLOW_ruleWS_in_rule__NamespaceDeclaration__Group__2__Impl3453);
            ruleWS();

            state._fsp--;


            }

             after(grammarAccess.getNamespaceDeclarationAccess().getWSParserRuleCall_2()); 

            }

            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1630:1: ( ( ruleWS )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1631:1: ( ruleWS )*
            {
             before(grammarAccess.getNamespaceDeclarationAccess().getWSParserRuleCall_2()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1632:1: ( ruleWS )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_SP && LA17_0<=RULE_SL_COMMENT)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1632:3: ruleWS
            	    {
            	    pushFollow(FOLLOW_ruleWS_in_rule__NamespaceDeclaration__Group__2__Impl3466);
            	    ruleWS();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getNamespaceDeclarationAccess().getWSParserRuleCall_2()); 

            }


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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1643:1: rule__NamespaceDeclaration__Group__3 : rule__NamespaceDeclaration__Group__3__Impl rule__NamespaceDeclaration__Group__4 ;
    public final void rule__NamespaceDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1647:1: ( rule__NamespaceDeclaration__Group__3__Impl rule__NamespaceDeclaration__Group__4 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1648:2: rule__NamespaceDeclaration__Group__3__Impl rule__NamespaceDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group__3__Impl_in_rule__NamespaceDeclaration__Group__33499);
            rule__NamespaceDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group__4_in_rule__NamespaceDeclaration__Group__33502);
            rule__NamespaceDeclaration__Group__4();

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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1655:1: rule__NamespaceDeclaration__Group__3__Impl : ( ( rule__NamespaceDeclaration__Group_3__0 )? ) ;
    public final void rule__NamespaceDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1659:1: ( ( ( rule__NamespaceDeclaration__Group_3__0 )? ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1660:1: ( ( rule__NamespaceDeclaration__Group_3__0 )? )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1660:1: ( ( rule__NamespaceDeclaration__Group_3__0 )? )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1661:1: ( rule__NamespaceDeclaration__Group_3__0 )?
            {
             before(grammarAccess.getNamespaceDeclarationAccess().getGroup_3()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1662:1: ( rule__NamespaceDeclaration__Group_3__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_CID) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1662:2: rule__NamespaceDeclaration__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__NamespaceDeclaration__Group_3__0_in_rule__NamespaceDeclaration__Group__3__Impl3529);
                    rule__NamespaceDeclaration__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNamespaceDeclarationAccess().getGroup_3()); 

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


    // $ANTLR start "rule__NamespaceDeclaration__Group__4"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1672:1: rule__NamespaceDeclaration__Group__4 : rule__NamespaceDeclaration__Group__4__Impl rule__NamespaceDeclaration__Group__5 ;
    public final void rule__NamespaceDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1676:1: ( rule__NamespaceDeclaration__Group__4__Impl rule__NamespaceDeclaration__Group__5 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1677:2: rule__NamespaceDeclaration__Group__4__Impl rule__NamespaceDeclaration__Group__5
            {
            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group__4__Impl_in_rule__NamespaceDeclaration__Group__43560);
            rule__NamespaceDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group__5_in_rule__NamespaceDeclaration__Group__43563);
            rule__NamespaceDeclaration__Group__5();

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
    // $ANTLR end "rule__NamespaceDeclaration__Group__4"


    // $ANTLR start "rule__NamespaceDeclaration__Group__4__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1684:1: rule__NamespaceDeclaration__Group__4__Impl : ( ( rule__NamespaceDeclaration__UriAssignment_4 ) ) ;
    public final void rule__NamespaceDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1688:1: ( ( ( rule__NamespaceDeclaration__UriAssignment_4 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1689:1: ( ( rule__NamespaceDeclaration__UriAssignment_4 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1689:1: ( ( rule__NamespaceDeclaration__UriAssignment_4 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1690:1: ( rule__NamespaceDeclaration__UriAssignment_4 )
            {
             before(grammarAccess.getNamespaceDeclarationAccess().getUriAssignment_4()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1691:1: ( rule__NamespaceDeclaration__UriAssignment_4 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1691:2: rule__NamespaceDeclaration__UriAssignment_4
            {
            pushFollow(FOLLOW_rule__NamespaceDeclaration__UriAssignment_4_in_rule__NamespaceDeclaration__Group__4__Impl3590);
            rule__NamespaceDeclaration__UriAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getNamespaceDeclarationAccess().getUriAssignment_4()); 

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
    // $ANTLR end "rule__NamespaceDeclaration__Group__4__Impl"


    // $ANTLR start "rule__NamespaceDeclaration__Group__5"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1701:1: rule__NamespaceDeclaration__Group__5 : rule__NamespaceDeclaration__Group__5__Impl rule__NamespaceDeclaration__Group__6 ;
    public final void rule__NamespaceDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1705:1: ( rule__NamespaceDeclaration__Group__5__Impl rule__NamespaceDeclaration__Group__6 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1706:2: rule__NamespaceDeclaration__Group__5__Impl rule__NamespaceDeclaration__Group__6
            {
            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group__5__Impl_in_rule__NamespaceDeclaration__Group__53620);
            rule__NamespaceDeclaration__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group__6_in_rule__NamespaceDeclaration__Group__53623);
            rule__NamespaceDeclaration__Group__6();

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
    // $ANTLR end "rule__NamespaceDeclaration__Group__5"


    // $ANTLR start "rule__NamespaceDeclaration__Group__5__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1713:1: rule__NamespaceDeclaration__Group__5__Impl : ( ( ruleWS )* ) ;
    public final void rule__NamespaceDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1717:1: ( ( ( ruleWS )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1718:1: ( ( ruleWS )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1718:1: ( ( ruleWS )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1719:1: ( ruleWS )*
            {
             before(grammarAccess.getNamespaceDeclarationAccess().getWSParserRuleCall_5()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1720:1: ( ruleWS )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=RULE_SP && LA19_0<=RULE_SL_COMMENT)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1720:3: ruleWS
            	    {
            	    pushFollow(FOLLOW_ruleWS_in_rule__NamespaceDeclaration__Group__5__Impl3651);
            	    ruleWS();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getNamespaceDeclarationAccess().getWSParserRuleCall_5()); 

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
    // $ANTLR end "rule__NamespaceDeclaration__Group__5__Impl"


    // $ANTLR start "rule__NamespaceDeclaration__Group__6"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1730:1: rule__NamespaceDeclaration__Group__6 : rule__NamespaceDeclaration__Group__6__Impl rule__NamespaceDeclaration__Group__7 ;
    public final void rule__NamespaceDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1734:1: ( rule__NamespaceDeclaration__Group__6__Impl rule__NamespaceDeclaration__Group__7 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1735:2: rule__NamespaceDeclaration__Group__6__Impl rule__NamespaceDeclaration__Group__7
            {
            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group__6__Impl_in_rule__NamespaceDeclaration__Group__63682);
            rule__NamespaceDeclaration__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group__7_in_rule__NamespaceDeclaration__Group__63685);
            rule__NamespaceDeclaration__Group__7();

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
    // $ANTLR end "rule__NamespaceDeclaration__Group__6"


    // $ANTLR start "rule__NamespaceDeclaration__Group__6__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1742:1: rule__NamespaceDeclaration__Group__6__Impl : ( '.' ) ;
    public final void rule__NamespaceDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1746:1: ( ( '.' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1747:1: ( '.' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1747:1: ( '.' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1748:1: '.'
            {
             before(grammarAccess.getNamespaceDeclarationAccess().getFullStopKeyword_6()); 
            match(input,14,FOLLOW_14_in_rule__NamespaceDeclaration__Group__6__Impl3713); 
             after(grammarAccess.getNamespaceDeclarationAccess().getFullStopKeyword_6()); 

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
    // $ANTLR end "rule__NamespaceDeclaration__Group__6__Impl"


    // $ANTLR start "rule__NamespaceDeclaration__Group__7"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1761:1: rule__NamespaceDeclaration__Group__7 : rule__NamespaceDeclaration__Group__7__Impl ;
    public final void rule__NamespaceDeclaration__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1765:1: ( rule__NamespaceDeclaration__Group__7__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1766:2: rule__NamespaceDeclaration__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group__7__Impl_in_rule__NamespaceDeclaration__Group__73744);
            rule__NamespaceDeclaration__Group__7__Impl();

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
    // $ANTLR end "rule__NamespaceDeclaration__Group__7"


    // $ANTLR start "rule__NamespaceDeclaration__Group__7__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1772:1: rule__NamespaceDeclaration__Group__7__Impl : ( ruleWS ) ;
    public final void rule__NamespaceDeclaration__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1776:1: ( ( ruleWS ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1777:1: ( ruleWS )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1777:1: ( ruleWS )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1778:1: ruleWS
            {
             before(grammarAccess.getNamespaceDeclarationAccess().getWSParserRuleCall_7()); 
            pushFollow(FOLLOW_ruleWS_in_rule__NamespaceDeclaration__Group__7__Impl3771);
            ruleWS();

            state._fsp--;

             after(grammarAccess.getNamespaceDeclarationAccess().getWSParserRuleCall_7()); 

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
    // $ANTLR end "rule__NamespaceDeclaration__Group__7__Impl"


    // $ANTLR start "rule__NamespaceDeclaration__Group_3__0"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1805:1: rule__NamespaceDeclaration__Group_3__0 : rule__NamespaceDeclaration__Group_3__0__Impl rule__NamespaceDeclaration__Group_3__1 ;
    public final void rule__NamespaceDeclaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1809:1: ( rule__NamespaceDeclaration__Group_3__0__Impl rule__NamespaceDeclaration__Group_3__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1810:2: rule__NamespaceDeclaration__Group_3__0__Impl rule__NamespaceDeclaration__Group_3__1
            {
            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group_3__0__Impl_in_rule__NamespaceDeclaration__Group_3__03816);
            rule__NamespaceDeclaration__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group_3__1_in_rule__NamespaceDeclaration__Group_3__03819);
            rule__NamespaceDeclaration__Group_3__1();

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
    // $ANTLR end "rule__NamespaceDeclaration__Group_3__0"


    // $ANTLR start "rule__NamespaceDeclaration__Group_3__0__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1817:1: rule__NamespaceDeclaration__Group_3__0__Impl : ( ( rule__NamespaceDeclaration__NameAssignment_3_0 ) ) ;
    public final void rule__NamespaceDeclaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1821:1: ( ( ( rule__NamespaceDeclaration__NameAssignment_3_0 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1822:1: ( ( rule__NamespaceDeclaration__NameAssignment_3_0 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1822:1: ( ( rule__NamespaceDeclaration__NameAssignment_3_0 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1823:1: ( rule__NamespaceDeclaration__NameAssignment_3_0 )
            {
             before(grammarAccess.getNamespaceDeclarationAccess().getNameAssignment_3_0()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1824:1: ( rule__NamespaceDeclaration__NameAssignment_3_0 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1824:2: rule__NamespaceDeclaration__NameAssignment_3_0
            {
            pushFollow(FOLLOW_rule__NamespaceDeclaration__NameAssignment_3_0_in_rule__NamespaceDeclaration__Group_3__0__Impl3846);
            rule__NamespaceDeclaration__NameAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getNamespaceDeclarationAccess().getNameAssignment_3_0()); 

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
    // $ANTLR end "rule__NamespaceDeclaration__Group_3__0__Impl"


    // $ANTLR start "rule__NamespaceDeclaration__Group_3__1"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1834:1: rule__NamespaceDeclaration__Group_3__1 : rule__NamespaceDeclaration__Group_3__1__Impl rule__NamespaceDeclaration__Group_3__2 ;
    public final void rule__NamespaceDeclaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1838:1: ( rule__NamespaceDeclaration__Group_3__1__Impl rule__NamespaceDeclaration__Group_3__2 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1839:2: rule__NamespaceDeclaration__Group_3__1__Impl rule__NamespaceDeclaration__Group_3__2
            {
            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group_3__1__Impl_in_rule__NamespaceDeclaration__Group_3__13876);
            rule__NamespaceDeclaration__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group_3__2_in_rule__NamespaceDeclaration__Group_3__13879);
            rule__NamespaceDeclaration__Group_3__2();

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
    // $ANTLR end "rule__NamespaceDeclaration__Group_3__1"


    // $ANTLR start "rule__NamespaceDeclaration__Group_3__1__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1846:1: rule__NamespaceDeclaration__Group_3__1__Impl : ( ( ruleWS )* ) ;
    public final void rule__NamespaceDeclaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1850:1: ( ( ( ruleWS )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1851:1: ( ( ruleWS )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1851:1: ( ( ruleWS )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1852:1: ( ruleWS )*
            {
             before(grammarAccess.getNamespaceDeclarationAccess().getWSParserRuleCall_3_1()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1853:1: ( ruleWS )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=RULE_SP && LA20_0<=RULE_SL_COMMENT)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1853:3: ruleWS
            	    {
            	    pushFollow(FOLLOW_ruleWS_in_rule__NamespaceDeclaration__Group_3__1__Impl3907);
            	    ruleWS();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getNamespaceDeclarationAccess().getWSParserRuleCall_3_1()); 

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
    // $ANTLR end "rule__NamespaceDeclaration__Group_3__1__Impl"


    // $ANTLR start "rule__NamespaceDeclaration__Group_3__2"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1863:1: rule__NamespaceDeclaration__Group_3__2 : rule__NamespaceDeclaration__Group_3__2__Impl rule__NamespaceDeclaration__Group_3__3 ;
    public final void rule__NamespaceDeclaration__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1867:1: ( rule__NamespaceDeclaration__Group_3__2__Impl rule__NamespaceDeclaration__Group_3__3 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1868:2: rule__NamespaceDeclaration__Group_3__2__Impl rule__NamespaceDeclaration__Group_3__3
            {
            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group_3__2__Impl_in_rule__NamespaceDeclaration__Group_3__23938);
            rule__NamespaceDeclaration__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group_3__3_in_rule__NamespaceDeclaration__Group_3__23941);
            rule__NamespaceDeclaration__Group_3__3();

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
    // $ANTLR end "rule__NamespaceDeclaration__Group_3__2"


    // $ANTLR start "rule__NamespaceDeclaration__Group_3__2__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1875:1: rule__NamespaceDeclaration__Group_3__2__Impl : ( '=' ) ;
    public final void rule__NamespaceDeclaration__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1879:1: ( ( '=' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1880:1: ( '=' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1880:1: ( '=' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1881:1: '='
            {
             before(grammarAccess.getNamespaceDeclarationAccess().getEqualsSignKeyword_3_2()); 
            match(input,16,FOLLOW_16_in_rule__NamespaceDeclaration__Group_3__2__Impl3969); 
             after(grammarAccess.getNamespaceDeclarationAccess().getEqualsSignKeyword_3_2()); 

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
    // $ANTLR end "rule__NamespaceDeclaration__Group_3__2__Impl"


    // $ANTLR start "rule__NamespaceDeclaration__Group_3__3"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1894:1: rule__NamespaceDeclaration__Group_3__3 : rule__NamespaceDeclaration__Group_3__3__Impl ;
    public final void rule__NamespaceDeclaration__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1898:1: ( rule__NamespaceDeclaration__Group_3__3__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1899:2: rule__NamespaceDeclaration__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group_3__3__Impl_in_rule__NamespaceDeclaration__Group_3__34000);
            rule__NamespaceDeclaration__Group_3__3__Impl();

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
    // $ANTLR end "rule__NamespaceDeclaration__Group_3__3"


    // $ANTLR start "rule__NamespaceDeclaration__Group_3__3__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1905:1: rule__NamespaceDeclaration__Group_3__3__Impl : ( ( ruleWS )* ) ;
    public final void rule__NamespaceDeclaration__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1909:1: ( ( ( ruleWS )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1910:1: ( ( ruleWS )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1910:1: ( ( ruleWS )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1911:1: ( ruleWS )*
            {
             before(grammarAccess.getNamespaceDeclarationAccess().getWSParserRuleCall_3_3()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1912:1: ( ruleWS )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=RULE_SP && LA21_0<=RULE_SL_COMMENT)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1912:3: ruleWS
            	    {
            	    pushFollow(FOLLOW_ruleWS_in_rule__NamespaceDeclaration__Group_3__3__Impl4028);
            	    ruleWS();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getNamespaceDeclarationAccess().getWSParserRuleCall_3_3()); 

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
    // $ANTLR end "rule__NamespaceDeclaration__Group_3__3__Impl"


    // $ANTLR start "rule__ReadDeclaration__Group__0"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1930:1: rule__ReadDeclaration__Group__0 : rule__ReadDeclaration__Group__0__Impl rule__ReadDeclaration__Group__1 ;
    public final void rule__ReadDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1934:1: ( rule__ReadDeclaration__Group__0__Impl rule__ReadDeclaration__Group__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1935:2: rule__ReadDeclaration__Group__0__Impl rule__ReadDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__ReadDeclaration__Group__0__Impl_in_rule__ReadDeclaration__Group__04067);
            rule__ReadDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ReadDeclaration__Group__1_in_rule__ReadDeclaration__Group__04070);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1942:1: rule__ReadDeclaration__Group__0__Impl : ( '%' ) ;
    public final void rule__ReadDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1946:1: ( ( '%' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1947:1: ( '%' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1947:1: ( '%' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1948:1: '%'
            {
             before(grammarAccess.getReadDeclarationAccess().getPercentSignKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__ReadDeclaration__Group__0__Impl4098); 
             after(grammarAccess.getReadDeclarationAccess().getPercentSignKeyword_0()); 

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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1961:1: rule__ReadDeclaration__Group__1 : rule__ReadDeclaration__Group__1__Impl rule__ReadDeclaration__Group__2 ;
    public final void rule__ReadDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1965:1: ( rule__ReadDeclaration__Group__1__Impl rule__ReadDeclaration__Group__2 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1966:2: rule__ReadDeclaration__Group__1__Impl rule__ReadDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__ReadDeclaration__Group__1__Impl_in_rule__ReadDeclaration__Group__14129);
            rule__ReadDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ReadDeclaration__Group__2_in_rule__ReadDeclaration__Group__14132);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1973:1: rule__ReadDeclaration__Group__1__Impl : ( 'read' ) ;
    public final void rule__ReadDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1977:1: ( ( 'read' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1978:1: ( 'read' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1978:1: ( 'read' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1979:1: 'read'
            {
             before(grammarAccess.getReadDeclarationAccess().getReadKeyword_1()); 
            match(input,29,FOLLOW_29_in_rule__ReadDeclaration__Group__1__Impl4160); 
             after(grammarAccess.getReadDeclarationAccess().getReadKeyword_1()); 

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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1992:1: rule__ReadDeclaration__Group__2 : rule__ReadDeclaration__Group__2__Impl rule__ReadDeclaration__Group__3 ;
    public final void rule__ReadDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1996:1: ( rule__ReadDeclaration__Group__2__Impl rule__ReadDeclaration__Group__3 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1997:2: rule__ReadDeclaration__Group__2__Impl rule__ReadDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__ReadDeclaration__Group__2__Impl_in_rule__ReadDeclaration__Group__24191);
            rule__ReadDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ReadDeclaration__Group__3_in_rule__ReadDeclaration__Group__24194);
            rule__ReadDeclaration__Group__3();

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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2004:1: rule__ReadDeclaration__Group__2__Impl : ( ( ( ruleWS ) ) ( ( ruleWS )* ) ) ;
    public final void rule__ReadDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2008:1: ( ( ( ( ruleWS ) ) ( ( ruleWS )* ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2009:1: ( ( ( ruleWS ) ) ( ( ruleWS )* ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2009:1: ( ( ( ruleWS ) ) ( ( ruleWS )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2010:1: ( ( ruleWS ) ) ( ( ruleWS )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2010:1: ( ( ruleWS ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2011:1: ( ruleWS )
            {
             before(grammarAccess.getReadDeclarationAccess().getWSParserRuleCall_2()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2012:1: ( ruleWS )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2012:3: ruleWS
            {
            pushFollow(FOLLOW_ruleWS_in_rule__ReadDeclaration__Group__2__Impl4224);
            ruleWS();

            state._fsp--;


            }

             after(grammarAccess.getReadDeclarationAccess().getWSParserRuleCall_2()); 

            }

            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2015:1: ( ( ruleWS )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2016:1: ( ruleWS )*
            {
             before(grammarAccess.getReadDeclarationAccess().getWSParserRuleCall_2()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2017:1: ( ruleWS )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=RULE_SP && LA22_0<=RULE_SL_COMMENT)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2017:3: ruleWS
            	    {
            	    pushFollow(FOLLOW_ruleWS_in_rule__ReadDeclaration__Group__2__Impl4237);
            	    ruleWS();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getReadDeclarationAccess().getWSParserRuleCall_2()); 

            }


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


    // $ANTLR start "rule__ReadDeclaration__Group__3"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2028:1: rule__ReadDeclaration__Group__3 : rule__ReadDeclaration__Group__3__Impl rule__ReadDeclaration__Group__4 ;
    public final void rule__ReadDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2032:1: ( rule__ReadDeclaration__Group__3__Impl rule__ReadDeclaration__Group__4 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2033:2: rule__ReadDeclaration__Group__3__Impl rule__ReadDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__ReadDeclaration__Group__3__Impl_in_rule__ReadDeclaration__Group__34270);
            rule__ReadDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ReadDeclaration__Group__4_in_rule__ReadDeclaration__Group__34273);
            rule__ReadDeclaration__Group__4();

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
    // $ANTLR end "rule__ReadDeclaration__Group__3"


    // $ANTLR start "rule__ReadDeclaration__Group__3__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2040:1: rule__ReadDeclaration__Group__3__Impl : ( ( rule__ReadDeclaration__FileAssignment_3 ) ) ;
    public final void rule__ReadDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2044:1: ( ( ( rule__ReadDeclaration__FileAssignment_3 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2045:1: ( ( rule__ReadDeclaration__FileAssignment_3 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2045:1: ( ( rule__ReadDeclaration__FileAssignment_3 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2046:1: ( rule__ReadDeclaration__FileAssignment_3 )
            {
             before(grammarAccess.getReadDeclarationAccess().getFileAssignment_3()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2047:1: ( rule__ReadDeclaration__FileAssignment_3 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2047:2: rule__ReadDeclaration__FileAssignment_3
            {
            pushFollow(FOLLOW_rule__ReadDeclaration__FileAssignment_3_in_rule__ReadDeclaration__Group__3__Impl4300);
            rule__ReadDeclaration__FileAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getReadDeclarationAccess().getFileAssignment_3()); 

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
    // $ANTLR end "rule__ReadDeclaration__Group__3__Impl"


    // $ANTLR start "rule__ReadDeclaration__Group__4"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2057:1: rule__ReadDeclaration__Group__4 : rule__ReadDeclaration__Group__4__Impl rule__ReadDeclaration__Group__5 ;
    public final void rule__ReadDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2061:1: ( rule__ReadDeclaration__Group__4__Impl rule__ReadDeclaration__Group__5 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2062:2: rule__ReadDeclaration__Group__4__Impl rule__ReadDeclaration__Group__5
            {
            pushFollow(FOLLOW_rule__ReadDeclaration__Group__4__Impl_in_rule__ReadDeclaration__Group__44330);
            rule__ReadDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ReadDeclaration__Group__5_in_rule__ReadDeclaration__Group__44333);
            rule__ReadDeclaration__Group__5();

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
    // $ANTLR end "rule__ReadDeclaration__Group__4"


    // $ANTLR start "rule__ReadDeclaration__Group__4__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2069:1: rule__ReadDeclaration__Group__4__Impl : ( ( ruleWS )* ) ;
    public final void rule__ReadDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2073:1: ( ( ( ruleWS )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2074:1: ( ( ruleWS )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2074:1: ( ( ruleWS )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2075:1: ( ruleWS )*
            {
             before(grammarAccess.getReadDeclarationAccess().getWSParserRuleCall_4()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2076:1: ( ruleWS )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=RULE_SP && LA23_0<=RULE_SL_COMMENT)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2076:3: ruleWS
            	    {
            	    pushFollow(FOLLOW_ruleWS_in_rule__ReadDeclaration__Group__4__Impl4361);
            	    ruleWS();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getReadDeclarationAccess().getWSParserRuleCall_4()); 

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
    // $ANTLR end "rule__ReadDeclaration__Group__4__Impl"


    // $ANTLR start "rule__ReadDeclaration__Group__5"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2086:1: rule__ReadDeclaration__Group__5 : rule__ReadDeclaration__Group__5__Impl rule__ReadDeclaration__Group__6 ;
    public final void rule__ReadDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2090:1: ( rule__ReadDeclaration__Group__5__Impl rule__ReadDeclaration__Group__6 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2091:2: rule__ReadDeclaration__Group__5__Impl rule__ReadDeclaration__Group__6
            {
            pushFollow(FOLLOW_rule__ReadDeclaration__Group__5__Impl_in_rule__ReadDeclaration__Group__54392);
            rule__ReadDeclaration__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ReadDeclaration__Group__6_in_rule__ReadDeclaration__Group__54395);
            rule__ReadDeclaration__Group__6();

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
    // $ANTLR end "rule__ReadDeclaration__Group__5"


    // $ANTLR start "rule__ReadDeclaration__Group__5__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2098:1: rule__ReadDeclaration__Group__5__Impl : ( '.' ) ;
    public final void rule__ReadDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2102:1: ( ( '.' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2103:1: ( '.' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2103:1: ( '.' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2104:1: '.'
            {
             before(grammarAccess.getReadDeclarationAccess().getFullStopKeyword_5()); 
            match(input,14,FOLLOW_14_in_rule__ReadDeclaration__Group__5__Impl4423); 
             after(grammarAccess.getReadDeclarationAccess().getFullStopKeyword_5()); 

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
    // $ANTLR end "rule__ReadDeclaration__Group__5__Impl"


    // $ANTLR start "rule__ReadDeclaration__Group__6"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2117:1: rule__ReadDeclaration__Group__6 : rule__ReadDeclaration__Group__6__Impl ;
    public final void rule__ReadDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2121:1: ( rule__ReadDeclaration__Group__6__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2122:2: rule__ReadDeclaration__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__ReadDeclaration__Group__6__Impl_in_rule__ReadDeclaration__Group__64454);
            rule__ReadDeclaration__Group__6__Impl();

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
    // $ANTLR end "rule__ReadDeclaration__Group__6"


    // $ANTLR start "rule__ReadDeclaration__Group__6__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2128:1: rule__ReadDeclaration__Group__6__Impl : ( ruleWS ) ;
    public final void rule__ReadDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2132:1: ( ( ruleWS ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2133:1: ( ruleWS )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2133:1: ( ruleWS )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2134:1: ruleWS
            {
             before(grammarAccess.getReadDeclarationAccess().getWSParserRuleCall_6()); 
            pushFollow(FOLLOW_ruleWS_in_rule__ReadDeclaration__Group__6__Impl4481);
            ruleWS();

            state._fsp--;

             after(grammarAccess.getReadDeclarationAccess().getWSParserRuleCall_6()); 

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
    // $ANTLR end "rule__ReadDeclaration__Group__6__Impl"


    // $ANTLR start "rule__GID__Group_0__0"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2159:1: rule__GID__Group_0__0 : rule__GID__Group_0__0__Impl rule__GID__Group_0__1 ;
    public final void rule__GID__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2163:1: ( rule__GID__Group_0__0__Impl rule__GID__Group_0__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2164:2: rule__GID__Group_0__0__Impl rule__GID__Group_0__1
            {
            pushFollow(FOLLOW_rule__GID__Group_0__0__Impl_in_rule__GID__Group_0__04524);
            rule__GID__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GID__Group_0__1_in_rule__GID__Group_0__04527);
            rule__GID__Group_0__1();

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
    // $ANTLR end "rule__GID__Group_0__0"


    // $ANTLR start "rule__GID__Group_0__0__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2171:1: rule__GID__Group_0__0__Impl : ( ( ( rule__GID__Alternatives_0_0 ) ) ( ( rule__GID__Alternatives_0_0 )* ) ) ;
    public final void rule__GID__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2175:1: ( ( ( ( rule__GID__Alternatives_0_0 ) ) ( ( rule__GID__Alternatives_0_0 )* ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2176:1: ( ( ( rule__GID__Alternatives_0_0 ) ) ( ( rule__GID__Alternatives_0_0 )* ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2176:1: ( ( ( rule__GID__Alternatives_0_0 ) ) ( ( rule__GID__Alternatives_0_0 )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2177:1: ( ( rule__GID__Alternatives_0_0 ) ) ( ( rule__GID__Alternatives_0_0 )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2177:1: ( ( rule__GID__Alternatives_0_0 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2178:1: ( rule__GID__Alternatives_0_0 )
            {
             before(grammarAccess.getGIDAccess().getAlternatives_0_0()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2179:1: ( rule__GID__Alternatives_0_0 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2179:2: rule__GID__Alternatives_0_0
            {
            pushFollow(FOLLOW_rule__GID__Alternatives_0_0_in_rule__GID__Group_0__0__Impl4556);
            rule__GID__Alternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getGIDAccess().getAlternatives_0_0()); 

            }

            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2182:1: ( ( rule__GID__Alternatives_0_0 )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2183:1: ( rule__GID__Alternatives_0_0 )*
            {
             before(grammarAccess.getGIDAccess().getAlternatives_0_0()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2184:1: ( rule__GID__Alternatives_0_0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=RULE_CID && LA24_0<=RULE_INT)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2184:2: rule__GID__Alternatives_0_0
            	    {
            	    pushFollow(FOLLOW_rule__GID__Alternatives_0_0_in_rule__GID__Group_0__0__Impl4568);
            	    rule__GID__Alternatives_0_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getGIDAccess().getAlternatives_0_0()); 

            }


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
    // $ANTLR end "rule__GID__Group_0__0__Impl"


    // $ANTLR start "rule__GID__Group_0__1"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2195:1: rule__GID__Group_0__1 : rule__GID__Group_0__1__Impl ;
    public final void rule__GID__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2199:1: ( rule__GID__Group_0__1__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2200:2: rule__GID__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__GID__Group_0__1__Impl_in_rule__GID__Group_0__14601);
            rule__GID__Group_0__1__Impl();

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
    // $ANTLR end "rule__GID__Group_0__1"


    // $ANTLR start "rule__GID__Group_0__1__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2206:1: rule__GID__Group_0__1__Impl : ( ( rule__GID__Group_0_1__0 )? ) ;
    public final void rule__GID__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2210:1: ( ( ( rule__GID__Group_0_1__0 )? ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2211:1: ( ( rule__GID__Group_0_1__0 )? )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2211:1: ( ( rule__GID__Group_0_1__0 )? )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2212:1: ( rule__GID__Group_0_1__0 )?
            {
             before(grammarAccess.getGIDAccess().getGroup_0_1()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2213:1: ( rule__GID__Group_0_1__0 )?
            int alt25=2;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2213:2: rule__GID__Group_0_1__0
                    {
                    pushFollow(FOLLOW_rule__GID__Group_0_1__0_in_rule__GID__Group_0__1__Impl4628);
                    rule__GID__Group_0_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGIDAccess().getGroup_0_1()); 

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
    // $ANTLR end "rule__GID__Group_0__1__Impl"


    // $ANTLR start "rule__GID__Group_0_1__0"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2227:1: rule__GID__Group_0_1__0 : rule__GID__Group_0_1__0__Impl rule__GID__Group_0_1__1 ;
    public final void rule__GID__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2231:1: ( rule__GID__Group_0_1__0__Impl rule__GID__Group_0_1__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2232:2: rule__GID__Group_0_1__0__Impl rule__GID__Group_0_1__1
            {
            pushFollow(FOLLOW_rule__GID__Group_0_1__0__Impl_in_rule__GID__Group_0_1__04663);
            rule__GID__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GID__Group_0_1__1_in_rule__GID__Group_0_1__04666);
            rule__GID__Group_0_1__1();

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
    // $ANTLR end "rule__GID__Group_0_1__0"


    // $ANTLR start "rule__GID__Group_0_1__0__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2239:1: rule__GID__Group_0_1__0__Impl : ( ( ( '=' ) ) ( ( '=' )* ) ) ;
    public final void rule__GID__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2243:1: ( ( ( ( '=' ) ) ( ( '=' )* ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2244:1: ( ( ( '=' ) ) ( ( '=' )* ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2244:1: ( ( ( '=' ) ) ( ( '=' )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2245:1: ( ( '=' ) ) ( ( '=' )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2245:1: ( ( '=' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2246:1: ( '=' )
            {
             before(grammarAccess.getGIDAccess().getEqualsSignKeyword_0_1_0()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2247:1: ( '=' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2248:2: '='
            {
            match(input,16,FOLLOW_16_in_rule__GID__Group_0_1__0__Impl4697); 

            }

             after(grammarAccess.getGIDAccess().getEqualsSignKeyword_0_1_0()); 

            }

            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2252:1: ( ( '=' )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2253:1: ( '=' )*
            {
             before(grammarAccess.getGIDAccess().getEqualsSignKeyword_0_1_0()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2254:1: ( '=' )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==16) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2255:2: '='
            	    {
            	    match(input,16,FOLLOW_16_in_rule__GID__Group_0_1__0__Impl4713); 

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getGIDAccess().getEqualsSignKeyword_0_1_0()); 

            }


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
    // $ANTLR end "rule__GID__Group_0_1__0__Impl"


    // $ANTLR start "rule__GID__Group_0_1__1"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2267:1: rule__GID__Group_0_1__1 : rule__GID__Group_0_1__1__Impl ;
    public final void rule__GID__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2271:1: ( rule__GID__Group_0_1__1__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2272:2: rule__GID__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__GID__Group_0_1__1__Impl_in_rule__GID__Group_0_1__14748);
            rule__GID__Group_0_1__1__Impl();

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
    // $ANTLR end "rule__GID__Group_0_1__1"


    // $ANTLR start "rule__GID__Group_0_1__1__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2278:1: rule__GID__Group_0_1__1__Impl : ( ruleWS ) ;
    public final void rule__GID__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2282:1: ( ( ruleWS ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2283:1: ( ruleWS )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2283:1: ( ruleWS )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2284:1: ruleWS
            {
             before(grammarAccess.getGIDAccess().getWSParserRuleCall_0_1_1()); 
            pushFollow(FOLLOW_ruleWS_in_rule__GID__Group_0_1__1__Impl4775);
            ruleWS();

            state._fsp--;

             after(grammarAccess.getGIDAccess().getWSParserRuleCall_0_1_1()); 

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
    // $ANTLR end "rule__GID__Group_0_1__1__Impl"


    // $ANTLR start "rule__GID__Group_1__0"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2299:1: rule__GID__Group_1__0 : rule__GID__Group_1__0__Impl rule__GID__Group_1__1 ;
    public final void rule__GID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2303:1: ( rule__GID__Group_1__0__Impl rule__GID__Group_1__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2304:2: rule__GID__Group_1__0__Impl rule__GID__Group_1__1
            {
            pushFollow(FOLLOW_rule__GID__Group_1__0__Impl_in_rule__GID__Group_1__04808);
            rule__GID__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GID__Group_1__1_in_rule__GID__Group_1__04811);
            rule__GID__Group_1__1();

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
    // $ANTLR end "rule__GID__Group_1__0"


    // $ANTLR start "rule__GID__Group_1__0__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2311:1: rule__GID__Group_1__0__Impl : ( '=' ) ;
    public final void rule__GID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2315:1: ( ( '=' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2316:1: ( '=' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2316:1: ( '=' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2317:1: '='
            {
             before(grammarAccess.getGIDAccess().getEqualsSignKeyword_1_0()); 
            match(input,16,FOLLOW_16_in_rule__GID__Group_1__0__Impl4839); 
             after(grammarAccess.getGIDAccess().getEqualsSignKeyword_1_0()); 

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
    // $ANTLR end "rule__GID__Group_1__0__Impl"


    // $ANTLR start "rule__GID__Group_1__1"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2330:1: rule__GID__Group_1__1 : rule__GID__Group_1__1__Impl rule__GID__Group_1__2 ;
    public final void rule__GID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2334:1: ( rule__GID__Group_1__1__Impl rule__GID__Group_1__2 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2335:2: rule__GID__Group_1__1__Impl rule__GID__Group_1__2
            {
            pushFollow(FOLLOW_rule__GID__Group_1__1__Impl_in_rule__GID__Group_1__14870);
            rule__GID__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GID__Group_1__2_in_rule__GID__Group_1__14873);
            rule__GID__Group_1__2();

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
    // $ANTLR end "rule__GID__Group_1__1"


    // $ANTLR start "rule__GID__Group_1__1__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2342:1: rule__GID__Group_1__1__Impl : ( ( ( '=' ) ) ( ( '=' )* ) ) ;
    public final void rule__GID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2346:1: ( ( ( ( '=' ) ) ( ( '=' )* ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2347:1: ( ( ( '=' ) ) ( ( '=' )* ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2347:1: ( ( ( '=' ) ) ( ( '=' )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2348:1: ( ( '=' ) ) ( ( '=' )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2348:1: ( ( '=' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2349:1: ( '=' )
            {
             before(grammarAccess.getGIDAccess().getEqualsSignKeyword_1_1()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2350:1: ( '=' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2351:2: '='
            {
            match(input,16,FOLLOW_16_in_rule__GID__Group_1__1__Impl4904); 

            }

             after(grammarAccess.getGIDAccess().getEqualsSignKeyword_1_1()); 

            }

            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2355:1: ( ( '=' )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2356:1: ( '=' )*
            {
             before(grammarAccess.getGIDAccess().getEqualsSignKeyword_1_1()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2357:1: ( '=' )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==16) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2358:2: '='
            	    {
            	    match(input,16,FOLLOW_16_in_rule__GID__Group_1__1__Impl4920); 

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getGIDAccess().getEqualsSignKeyword_1_1()); 

            }


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
    // $ANTLR end "rule__GID__Group_1__1__Impl"


    // $ANTLR start "rule__GID__Group_1__2"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2370:1: rule__GID__Group_1__2 : rule__GID__Group_1__2__Impl ;
    public final void rule__GID__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2374:1: ( rule__GID__Group_1__2__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2375:2: rule__GID__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__GID__Group_1__2__Impl_in_rule__GID__Group_1__24955);
            rule__GID__Group_1__2__Impl();

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
    // $ANTLR end "rule__GID__Group_1__2"


    // $ANTLR start "rule__GID__Group_1__2__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2381:1: rule__GID__Group_1__2__Impl : ( ruleWS ) ;
    public final void rule__GID__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2385:1: ( ( ruleWS ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2386:1: ( ruleWS )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2386:1: ( ruleWS )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2387:1: ruleWS
            {
             before(grammarAccess.getGIDAccess().getWSParserRuleCall_1_2()); 
            pushFollow(FOLLOW_ruleWS_in_rule__GID__Group_1__2__Impl4982);
            ruleWS();

            state._fsp--;

             after(grammarAccess.getGIDAccess().getWSParserRuleCall_1_2()); 

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
    // $ANTLR end "rule__GID__Group_1__2__Impl"


    // $ANTLR start "rule__SOMETHING__Group_3__0"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2404:1: rule__SOMETHING__Group_3__0 : rule__SOMETHING__Group_3__0__Impl rule__SOMETHING__Group_3__1 ;
    public final void rule__SOMETHING__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2408:1: ( rule__SOMETHING__Group_3__0__Impl rule__SOMETHING__Group_3__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2409:2: rule__SOMETHING__Group_3__0__Impl rule__SOMETHING__Group_3__1
            {
            pushFollow(FOLLOW_rule__SOMETHING__Group_3__0__Impl_in_rule__SOMETHING__Group_3__05017);
            rule__SOMETHING__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SOMETHING__Group_3__1_in_rule__SOMETHING__Group_3__05020);
            rule__SOMETHING__Group_3__1();

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
    // $ANTLR end "rule__SOMETHING__Group_3__0"


    // $ANTLR start "rule__SOMETHING__Group_3__0__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2416:1: rule__SOMETHING__Group_3__0__Impl : ( '.' ) ;
    public final void rule__SOMETHING__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2420:1: ( ( '.' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2421:1: ( '.' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2421:1: ( '.' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2422:1: '.'
            {
             before(grammarAccess.getSOMETHINGAccess().getFullStopKeyword_3_0()); 
            match(input,14,FOLLOW_14_in_rule__SOMETHING__Group_3__0__Impl5048); 
             after(grammarAccess.getSOMETHINGAccess().getFullStopKeyword_3_0()); 

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
    // $ANTLR end "rule__SOMETHING__Group_3__0__Impl"


    // $ANTLR start "rule__SOMETHING__Group_3__1"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2435:1: rule__SOMETHING__Group_3__1 : rule__SOMETHING__Group_3__1__Impl ;
    public final void rule__SOMETHING__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2439:1: ( rule__SOMETHING__Group_3__1__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2440:2: rule__SOMETHING__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__SOMETHING__Group_3__1__Impl_in_rule__SOMETHING__Group_3__15079);
            rule__SOMETHING__Group_3__1__Impl();

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
    // $ANTLR end "rule__SOMETHING__Group_3__1"


    // $ANTLR start "rule__SOMETHING__Group_3__1__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2446:1: rule__SOMETHING__Group_3__1__Impl : ( ( rule__SOMETHING__Alternatives_3_1 ) ) ;
    public final void rule__SOMETHING__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2450:1: ( ( ( rule__SOMETHING__Alternatives_3_1 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2451:1: ( ( rule__SOMETHING__Alternatives_3_1 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2451:1: ( ( rule__SOMETHING__Alternatives_3_1 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2452:1: ( rule__SOMETHING__Alternatives_3_1 )
            {
             before(grammarAccess.getSOMETHINGAccess().getAlternatives_3_1()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2453:1: ( rule__SOMETHING__Alternatives_3_1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2453:2: rule__SOMETHING__Alternatives_3_1
            {
            pushFollow(FOLLOW_rule__SOMETHING__Alternatives_3_1_in_rule__SOMETHING__Group_3__1__Impl5106);
            rule__SOMETHING__Alternatives_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSOMETHINGAccess().getAlternatives_3_1()); 

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
    // $ANTLR end "rule__SOMETHING__Group_3__1__Impl"


    // $ANTLR start "rule__SOMETHING__Group_8__0"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2467:1: rule__SOMETHING__Group_8__0 : rule__SOMETHING__Group_8__0__Impl rule__SOMETHING__Group_8__1 ;
    public final void rule__SOMETHING__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2471:1: ( rule__SOMETHING__Group_8__0__Impl rule__SOMETHING__Group_8__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2472:2: rule__SOMETHING__Group_8__0__Impl rule__SOMETHING__Group_8__1
            {
            pushFollow(FOLLOW_rule__SOMETHING__Group_8__0__Impl_in_rule__SOMETHING__Group_8__05140);
            rule__SOMETHING__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SOMETHING__Group_8__1_in_rule__SOMETHING__Group_8__05143);
            rule__SOMETHING__Group_8__1();

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
    // $ANTLR end "rule__SOMETHING__Group_8__0"


    // $ANTLR start "rule__SOMETHING__Group_8__0__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2479:1: rule__SOMETHING__Group_8__0__Impl : ( '{' ) ;
    public final void rule__SOMETHING__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2483:1: ( ( '{' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2484:1: ( '{' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2484:1: ( '{' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2485:1: '{'
            {
             before(grammarAccess.getSOMETHINGAccess().getLeftCurlyBracketKeyword_8_0()); 
            match(input,30,FOLLOW_30_in_rule__SOMETHING__Group_8__0__Impl5171); 
             after(grammarAccess.getSOMETHINGAccess().getLeftCurlyBracketKeyword_8_0()); 

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
    // $ANTLR end "rule__SOMETHING__Group_8__0__Impl"


    // $ANTLR start "rule__SOMETHING__Group_8__1"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2498:1: rule__SOMETHING__Group_8__1 : rule__SOMETHING__Group_8__1__Impl rule__SOMETHING__Group_8__2 ;
    public final void rule__SOMETHING__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2502:1: ( rule__SOMETHING__Group_8__1__Impl rule__SOMETHING__Group_8__2 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2503:2: rule__SOMETHING__Group_8__1__Impl rule__SOMETHING__Group_8__2
            {
            pushFollow(FOLLOW_rule__SOMETHING__Group_8__1__Impl_in_rule__SOMETHING__Group_8__15202);
            rule__SOMETHING__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SOMETHING__Group_8__2_in_rule__SOMETHING__Group_8__15205);
            rule__SOMETHING__Group_8__2();

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
    // $ANTLR end "rule__SOMETHING__Group_8__1"


    // $ANTLR start "rule__SOMETHING__Group_8__1__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2510:1: rule__SOMETHING__Group_8__1__Impl : ( ( ruleSOMETHING2 )* ) ;
    public final void rule__SOMETHING__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2514:1: ( ( ( ruleSOMETHING2 )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2515:1: ( ( ruleSOMETHING2 )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2515:1: ( ( ruleSOMETHING2 )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2516:1: ( ruleSOMETHING2 )*
            {
             before(grammarAccess.getSOMETHINGAccess().getSOMETHING2ParserRuleCall_8_1()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2517:1: ( ruleSOMETHING2 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=RULE_SP && LA28_0<=RULE_INT)||(LA28_0>=14 && LA28_0<=18)||LA28_0==30) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2517:3: ruleSOMETHING2
            	    {
            	    pushFollow(FOLLOW_ruleSOMETHING2_in_rule__SOMETHING__Group_8__1__Impl5233);
            	    ruleSOMETHING2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getSOMETHINGAccess().getSOMETHING2ParserRuleCall_8_1()); 

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
    // $ANTLR end "rule__SOMETHING__Group_8__1__Impl"


    // $ANTLR start "rule__SOMETHING__Group_8__2"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2527:1: rule__SOMETHING__Group_8__2 : rule__SOMETHING__Group_8__2__Impl ;
    public final void rule__SOMETHING__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2531:1: ( rule__SOMETHING__Group_8__2__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2532:2: rule__SOMETHING__Group_8__2__Impl
            {
            pushFollow(FOLLOW_rule__SOMETHING__Group_8__2__Impl_in_rule__SOMETHING__Group_8__25264);
            rule__SOMETHING__Group_8__2__Impl();

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
    // $ANTLR end "rule__SOMETHING__Group_8__2"


    // $ANTLR start "rule__SOMETHING__Group_8__2__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2538:1: rule__SOMETHING__Group_8__2__Impl : ( '}' ) ;
    public final void rule__SOMETHING__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2542:1: ( ( '}' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2543:1: ( '}' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2543:1: ( '}' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2544:1: '}'
            {
             before(grammarAccess.getSOMETHINGAccess().getRightCurlyBracketKeyword_8_2()); 
            match(input,31,FOLLOW_31_in_rule__SOMETHING__Group_8__2__Impl5292); 
             after(grammarAccess.getSOMETHINGAccess().getRightCurlyBracketKeyword_8_2()); 

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
    // $ANTLR end "rule__SOMETHING__Group_8__2__Impl"


    // $ANTLR start "rule__SOMETHING2__Group_8__0"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2563:1: rule__SOMETHING2__Group_8__0 : rule__SOMETHING2__Group_8__0__Impl rule__SOMETHING2__Group_8__1 ;
    public final void rule__SOMETHING2__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2567:1: ( rule__SOMETHING2__Group_8__0__Impl rule__SOMETHING2__Group_8__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2568:2: rule__SOMETHING2__Group_8__0__Impl rule__SOMETHING2__Group_8__1
            {
            pushFollow(FOLLOW_rule__SOMETHING2__Group_8__0__Impl_in_rule__SOMETHING2__Group_8__05329);
            rule__SOMETHING2__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SOMETHING2__Group_8__1_in_rule__SOMETHING2__Group_8__05332);
            rule__SOMETHING2__Group_8__1();

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
    // $ANTLR end "rule__SOMETHING2__Group_8__0"


    // $ANTLR start "rule__SOMETHING2__Group_8__0__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2575:1: rule__SOMETHING2__Group_8__0__Impl : ( '{' ) ;
    public final void rule__SOMETHING2__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2579:1: ( ( '{' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2580:1: ( '{' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2580:1: ( '{' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2581:1: '{'
            {
             before(grammarAccess.getSOMETHING2Access().getLeftCurlyBracketKeyword_8_0()); 
            match(input,30,FOLLOW_30_in_rule__SOMETHING2__Group_8__0__Impl5360); 
             after(grammarAccess.getSOMETHING2Access().getLeftCurlyBracketKeyword_8_0()); 

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
    // $ANTLR end "rule__SOMETHING2__Group_8__0__Impl"


    // $ANTLR start "rule__SOMETHING2__Group_8__1"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2594:1: rule__SOMETHING2__Group_8__1 : rule__SOMETHING2__Group_8__1__Impl rule__SOMETHING2__Group_8__2 ;
    public final void rule__SOMETHING2__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2598:1: ( rule__SOMETHING2__Group_8__1__Impl rule__SOMETHING2__Group_8__2 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2599:2: rule__SOMETHING2__Group_8__1__Impl rule__SOMETHING2__Group_8__2
            {
            pushFollow(FOLLOW_rule__SOMETHING2__Group_8__1__Impl_in_rule__SOMETHING2__Group_8__15391);
            rule__SOMETHING2__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SOMETHING2__Group_8__2_in_rule__SOMETHING2__Group_8__15394);
            rule__SOMETHING2__Group_8__2();

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
    // $ANTLR end "rule__SOMETHING2__Group_8__1"


    // $ANTLR start "rule__SOMETHING2__Group_8__1__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2606:1: rule__SOMETHING2__Group_8__1__Impl : ( ( ruleSOMETHING2 )* ) ;
    public final void rule__SOMETHING2__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2610:1: ( ( ( ruleSOMETHING2 )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2611:1: ( ( ruleSOMETHING2 )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2611:1: ( ( ruleSOMETHING2 )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2612:1: ( ruleSOMETHING2 )*
            {
             before(grammarAccess.getSOMETHING2Access().getSOMETHING2ParserRuleCall_8_1()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2613:1: ( ruleSOMETHING2 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=RULE_SP && LA29_0<=RULE_INT)||(LA29_0>=14 && LA29_0<=18)||LA29_0==30) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2613:3: ruleSOMETHING2
            	    {
            	    pushFollow(FOLLOW_ruleSOMETHING2_in_rule__SOMETHING2__Group_8__1__Impl5422);
            	    ruleSOMETHING2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getSOMETHING2Access().getSOMETHING2ParserRuleCall_8_1()); 

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
    // $ANTLR end "rule__SOMETHING2__Group_8__1__Impl"


    // $ANTLR start "rule__SOMETHING2__Group_8__2"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2623:1: rule__SOMETHING2__Group_8__2 : rule__SOMETHING2__Group_8__2__Impl ;
    public final void rule__SOMETHING2__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2627:1: ( rule__SOMETHING2__Group_8__2__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2628:2: rule__SOMETHING2__Group_8__2__Impl
            {
            pushFollow(FOLLOW_rule__SOMETHING2__Group_8__2__Impl_in_rule__SOMETHING2__Group_8__25453);
            rule__SOMETHING2__Group_8__2__Impl();

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
    // $ANTLR end "rule__SOMETHING2__Group_8__2"


    // $ANTLR start "rule__SOMETHING2__Group_8__2__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2634:1: rule__SOMETHING2__Group_8__2__Impl : ( '}' ) ;
    public final void rule__SOMETHING2__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2638:1: ( ( '}' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2639:1: ( '}' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2639:1: ( '}' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2640:1: '}'
            {
             before(grammarAccess.getSOMETHING2Access().getRightCurlyBracketKeyword_8_2()); 
            match(input,31,FOLLOW_31_in_rule__SOMETHING2__Group_8__2__Impl5481); 
             after(grammarAccess.getSOMETHING2Access().getRightCurlyBracketKeyword_8_2()); 

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
    // $ANTLR end "rule__SOMETHING2__Group_8__2__Impl"


    // $ANTLR start "rule__SignatureDeclaration__Group__0"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2662:1: rule__SignatureDeclaration__Group__0 : rule__SignatureDeclaration__Group__0__Impl rule__SignatureDeclaration__Group__1 ;
    public final void rule__SignatureDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2666:1: ( rule__SignatureDeclaration__Group__0__Impl rule__SignatureDeclaration__Group__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2667:2: rule__SignatureDeclaration__Group__0__Impl rule__SignatureDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__SignatureDeclaration__Group__0__Impl_in_rule__SignatureDeclaration__Group__05521);
            rule__SignatureDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SignatureDeclaration__Group__1_in_rule__SignatureDeclaration__Group__05524);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2674:1: rule__SignatureDeclaration__Group__0__Impl : ( '%' ) ;
    public final void rule__SignatureDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2678:1: ( ( '%' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2679:1: ( '%' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2679:1: ( '%' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2680:1: '%'
            {
             before(grammarAccess.getSignatureDeclarationAccess().getPercentSignKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__SignatureDeclaration__Group__0__Impl5552); 
             after(grammarAccess.getSignatureDeclarationAccess().getPercentSignKeyword_0()); 

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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2693:1: rule__SignatureDeclaration__Group__1 : rule__SignatureDeclaration__Group__1__Impl rule__SignatureDeclaration__Group__2 ;
    public final void rule__SignatureDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2697:1: ( rule__SignatureDeclaration__Group__1__Impl rule__SignatureDeclaration__Group__2 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2698:2: rule__SignatureDeclaration__Group__1__Impl rule__SignatureDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__SignatureDeclaration__Group__1__Impl_in_rule__SignatureDeclaration__Group__15583);
            rule__SignatureDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SignatureDeclaration__Group__2_in_rule__SignatureDeclaration__Group__15586);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2705:1: rule__SignatureDeclaration__Group__1__Impl : ( 'sig' ) ;
    public final void rule__SignatureDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2709:1: ( ( 'sig' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2710:1: ( 'sig' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2710:1: ( 'sig' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2711:1: 'sig'
            {
             before(grammarAccess.getSignatureDeclarationAccess().getSigKeyword_1()); 
            match(input,32,FOLLOW_32_in_rule__SignatureDeclaration__Group__1__Impl5614); 
             after(grammarAccess.getSignatureDeclarationAccess().getSigKeyword_1()); 

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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2724:1: rule__SignatureDeclaration__Group__2 : rule__SignatureDeclaration__Group__2__Impl rule__SignatureDeclaration__Group__3 ;
    public final void rule__SignatureDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2728:1: ( rule__SignatureDeclaration__Group__2__Impl rule__SignatureDeclaration__Group__3 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2729:2: rule__SignatureDeclaration__Group__2__Impl rule__SignatureDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__SignatureDeclaration__Group__2__Impl_in_rule__SignatureDeclaration__Group__25645);
            rule__SignatureDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SignatureDeclaration__Group__3_in_rule__SignatureDeclaration__Group__25648);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2736:1: rule__SignatureDeclaration__Group__2__Impl : ( ( ( ruleWS ) ) ( ( ruleWS )* ) ) ;
    public final void rule__SignatureDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2740:1: ( ( ( ( ruleWS ) ) ( ( ruleWS )* ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2741:1: ( ( ( ruleWS ) ) ( ( ruleWS )* ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2741:1: ( ( ( ruleWS ) ) ( ( ruleWS )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2742:1: ( ( ruleWS ) ) ( ( ruleWS )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2742:1: ( ( ruleWS ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2743:1: ( ruleWS )
            {
             before(grammarAccess.getSignatureDeclarationAccess().getWSParserRuleCall_2()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2744:1: ( ruleWS )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2744:3: ruleWS
            {
            pushFollow(FOLLOW_ruleWS_in_rule__SignatureDeclaration__Group__2__Impl5678);
            ruleWS();

            state._fsp--;


            }

             after(grammarAccess.getSignatureDeclarationAccess().getWSParserRuleCall_2()); 

            }

            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2747:1: ( ( ruleWS )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2748:1: ( ruleWS )*
            {
             before(grammarAccess.getSignatureDeclarationAccess().getWSParserRuleCall_2()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2749:1: ( ruleWS )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=RULE_SP && LA30_0<=RULE_SL_COMMENT)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2749:3: ruleWS
            	    {
            	    pushFollow(FOLLOW_ruleWS_in_rule__SignatureDeclaration__Group__2__Impl5691);
            	    ruleWS();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getSignatureDeclarationAccess().getWSParserRuleCall_2()); 

            }


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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2760:1: rule__SignatureDeclaration__Group__3 : rule__SignatureDeclaration__Group__3__Impl rule__SignatureDeclaration__Group__4 ;
    public final void rule__SignatureDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2764:1: ( rule__SignatureDeclaration__Group__3__Impl rule__SignatureDeclaration__Group__4 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2765:2: rule__SignatureDeclaration__Group__3__Impl rule__SignatureDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__SignatureDeclaration__Group__3__Impl_in_rule__SignatureDeclaration__Group__35724);
            rule__SignatureDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SignatureDeclaration__Group__4_in_rule__SignatureDeclaration__Group__35727);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2772:1: rule__SignatureDeclaration__Group__3__Impl : ( ( rule__SignatureDeclaration__SigNameAssignment_3 ) ) ;
    public final void rule__SignatureDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2776:1: ( ( ( rule__SignatureDeclaration__SigNameAssignment_3 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2777:1: ( ( rule__SignatureDeclaration__SigNameAssignment_3 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2777:1: ( ( rule__SignatureDeclaration__SigNameAssignment_3 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2778:1: ( rule__SignatureDeclaration__SigNameAssignment_3 )
            {
             before(grammarAccess.getSignatureDeclarationAccess().getSigNameAssignment_3()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2779:1: ( rule__SignatureDeclaration__SigNameAssignment_3 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2779:2: rule__SignatureDeclaration__SigNameAssignment_3
            {
            pushFollow(FOLLOW_rule__SignatureDeclaration__SigNameAssignment_3_in_rule__SignatureDeclaration__Group__3__Impl5754);
            rule__SignatureDeclaration__SigNameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSignatureDeclarationAccess().getSigNameAssignment_3()); 

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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2789:1: rule__SignatureDeclaration__Group__4 : rule__SignatureDeclaration__Group__4__Impl rule__SignatureDeclaration__Group__5 ;
    public final void rule__SignatureDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2793:1: ( rule__SignatureDeclaration__Group__4__Impl rule__SignatureDeclaration__Group__5 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2794:2: rule__SignatureDeclaration__Group__4__Impl rule__SignatureDeclaration__Group__5
            {
            pushFollow(FOLLOW_rule__SignatureDeclaration__Group__4__Impl_in_rule__SignatureDeclaration__Group__45784);
            rule__SignatureDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SignatureDeclaration__Group__5_in_rule__SignatureDeclaration__Group__45787);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2801:1: rule__SignatureDeclaration__Group__4__Impl : ( ( ruleWS )* ) ;
    public final void rule__SignatureDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2805:1: ( ( ( ruleWS )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2806:1: ( ( ruleWS )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2806:1: ( ( ruleWS )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2807:1: ( ruleWS )*
            {
             before(grammarAccess.getSignatureDeclarationAccess().getWSParserRuleCall_4()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2808:1: ( ruleWS )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=RULE_SP && LA31_0<=RULE_SL_COMMENT)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2808:3: ruleWS
            	    {
            	    pushFollow(FOLLOW_ruleWS_in_rule__SignatureDeclaration__Group__4__Impl5815);
            	    ruleWS();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getSignatureDeclarationAccess().getWSParserRuleCall_4()); 

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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2818:1: rule__SignatureDeclaration__Group__5 : rule__SignatureDeclaration__Group__5__Impl rule__SignatureDeclaration__Group__6 ;
    public final void rule__SignatureDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2822:1: ( rule__SignatureDeclaration__Group__5__Impl rule__SignatureDeclaration__Group__6 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2823:2: rule__SignatureDeclaration__Group__5__Impl rule__SignatureDeclaration__Group__6
            {
            pushFollow(FOLLOW_rule__SignatureDeclaration__Group__5__Impl_in_rule__SignatureDeclaration__Group__55846);
            rule__SignatureDeclaration__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SignatureDeclaration__Group__6_in_rule__SignatureDeclaration__Group__55849);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2830:1: rule__SignatureDeclaration__Group__5__Impl : ( '=' ) ;
    public final void rule__SignatureDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2834:1: ( ( '=' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2835:1: ( '=' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2835:1: ( '=' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2836:1: '='
            {
             before(grammarAccess.getSignatureDeclarationAccess().getEqualsSignKeyword_5()); 
            match(input,16,FOLLOW_16_in_rule__SignatureDeclaration__Group__5__Impl5877); 
             after(grammarAccess.getSignatureDeclarationAccess().getEqualsSignKeyword_5()); 

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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2849:1: rule__SignatureDeclaration__Group__6 : rule__SignatureDeclaration__Group__6__Impl rule__SignatureDeclaration__Group__7 ;
    public final void rule__SignatureDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2853:1: ( rule__SignatureDeclaration__Group__6__Impl rule__SignatureDeclaration__Group__7 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2854:2: rule__SignatureDeclaration__Group__6__Impl rule__SignatureDeclaration__Group__7
            {
            pushFollow(FOLLOW_rule__SignatureDeclaration__Group__6__Impl_in_rule__SignatureDeclaration__Group__65908);
            rule__SignatureDeclaration__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SignatureDeclaration__Group__7_in_rule__SignatureDeclaration__Group__65911);
            rule__SignatureDeclaration__Group__7();

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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2861:1: rule__SignatureDeclaration__Group__6__Impl : ( ( ruleWS )* ) ;
    public final void rule__SignatureDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2865:1: ( ( ( ruleWS )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2866:1: ( ( ruleWS )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2866:1: ( ( ruleWS )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2867:1: ( ruleWS )*
            {
             before(grammarAccess.getSignatureDeclarationAccess().getWSParserRuleCall_6()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2868:1: ( ruleWS )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=RULE_SP && LA32_0<=RULE_SL_COMMENT)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2868:3: ruleWS
            	    {
            	    pushFollow(FOLLOW_ruleWS_in_rule__SignatureDeclaration__Group__6__Impl5939);
            	    ruleWS();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getSignatureDeclarationAccess().getWSParserRuleCall_6()); 

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


    // $ANTLR start "rule__SignatureDeclaration__Group__7"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2878:1: rule__SignatureDeclaration__Group__7 : rule__SignatureDeclaration__Group__7__Impl rule__SignatureDeclaration__Group__8 ;
    public final void rule__SignatureDeclaration__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2882:1: ( rule__SignatureDeclaration__Group__7__Impl rule__SignatureDeclaration__Group__8 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2883:2: rule__SignatureDeclaration__Group__7__Impl rule__SignatureDeclaration__Group__8
            {
            pushFollow(FOLLOW_rule__SignatureDeclaration__Group__7__Impl_in_rule__SignatureDeclaration__Group__75970);
            rule__SignatureDeclaration__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SignatureDeclaration__Group__8_in_rule__SignatureDeclaration__Group__75973);
            rule__SignatureDeclaration__Group__8();

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
    // $ANTLR end "rule__SignatureDeclaration__Group__7"


    // $ANTLR start "rule__SignatureDeclaration__Group__7__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2890:1: rule__SignatureDeclaration__Group__7__Impl : ( ( rule__SignatureDeclaration__DefsAssignment_7 ) ) ;
    public final void rule__SignatureDeclaration__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2894:1: ( ( ( rule__SignatureDeclaration__DefsAssignment_7 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2895:1: ( ( rule__SignatureDeclaration__DefsAssignment_7 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2895:1: ( ( rule__SignatureDeclaration__DefsAssignment_7 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2896:1: ( rule__SignatureDeclaration__DefsAssignment_7 )
            {
             before(grammarAccess.getSignatureDeclarationAccess().getDefsAssignment_7()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2897:1: ( rule__SignatureDeclaration__DefsAssignment_7 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2897:2: rule__SignatureDeclaration__DefsAssignment_7
            {
            pushFollow(FOLLOW_rule__SignatureDeclaration__DefsAssignment_7_in_rule__SignatureDeclaration__Group__7__Impl6000);
            rule__SignatureDeclaration__DefsAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getSignatureDeclarationAccess().getDefsAssignment_7()); 

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
    // $ANTLR end "rule__SignatureDeclaration__Group__7__Impl"


    // $ANTLR start "rule__SignatureDeclaration__Group__8"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2907:1: rule__SignatureDeclaration__Group__8 : rule__SignatureDeclaration__Group__8__Impl rule__SignatureDeclaration__Group__9 ;
    public final void rule__SignatureDeclaration__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2911:1: ( rule__SignatureDeclaration__Group__8__Impl rule__SignatureDeclaration__Group__9 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2912:2: rule__SignatureDeclaration__Group__8__Impl rule__SignatureDeclaration__Group__9
            {
            pushFollow(FOLLOW_rule__SignatureDeclaration__Group__8__Impl_in_rule__SignatureDeclaration__Group__86030);
            rule__SignatureDeclaration__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SignatureDeclaration__Group__9_in_rule__SignatureDeclaration__Group__86033);
            rule__SignatureDeclaration__Group__9();

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
    // $ANTLR end "rule__SignatureDeclaration__Group__8"


    // $ANTLR start "rule__SignatureDeclaration__Group__8__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2919:1: rule__SignatureDeclaration__Group__8__Impl : ( ( ruleWS )* ) ;
    public final void rule__SignatureDeclaration__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2923:1: ( ( ( ruleWS )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2924:1: ( ( ruleWS )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2924:1: ( ( ruleWS )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2925:1: ( ruleWS )*
            {
             before(grammarAccess.getSignatureDeclarationAccess().getWSParserRuleCall_8()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2926:1: ( ruleWS )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=RULE_SP && LA33_0<=RULE_SL_COMMENT)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2926:3: ruleWS
            	    {
            	    pushFollow(FOLLOW_ruleWS_in_rule__SignatureDeclaration__Group__8__Impl6061);
            	    ruleWS();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getSignatureDeclarationAccess().getWSParserRuleCall_8()); 

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
    // $ANTLR end "rule__SignatureDeclaration__Group__8__Impl"


    // $ANTLR start "rule__SignatureDeclaration__Group__9"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2936:1: rule__SignatureDeclaration__Group__9 : rule__SignatureDeclaration__Group__9__Impl ;
    public final void rule__SignatureDeclaration__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2940:1: ( rule__SignatureDeclaration__Group__9__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2941:2: rule__SignatureDeclaration__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__SignatureDeclaration__Group__9__Impl_in_rule__SignatureDeclaration__Group__96092);
            rule__SignatureDeclaration__Group__9__Impl();

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
    // $ANTLR end "rule__SignatureDeclaration__Group__9"


    // $ANTLR start "rule__SignatureDeclaration__Group__9__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2947:1: rule__SignatureDeclaration__Group__9__Impl : ( '.' ) ;
    public final void rule__SignatureDeclaration__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2951:1: ( ( '.' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2952:1: ( '.' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2952:1: ( '.' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2953:1: '.'
            {
             before(grammarAccess.getSignatureDeclarationAccess().getFullStopKeyword_9()); 
            match(input,14,FOLLOW_14_in_rule__SignatureDeclaration__Group__9__Impl6120); 
             after(grammarAccess.getSignatureDeclarationAccess().getFullStopKeyword_9()); 

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
    // $ANTLR end "rule__SignatureDeclaration__Group__9__Impl"


    // $ANTLR start "rule__SigDefinitions__Group__0"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2986:1: rule__SigDefinitions__Group__0 : rule__SigDefinitions__Group__0__Impl rule__SigDefinitions__Group__1 ;
    public final void rule__SigDefinitions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2990:1: ( rule__SigDefinitions__Group__0__Impl rule__SigDefinitions__Group__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2991:2: rule__SigDefinitions__Group__0__Impl rule__SigDefinitions__Group__1
            {
            pushFollow(FOLLOW_rule__SigDefinitions__Group__0__Impl_in_rule__SigDefinitions__Group__06171);
            rule__SigDefinitions__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SigDefinitions__Group__1_in_rule__SigDefinitions__Group__06174);
            rule__SigDefinitions__Group__1();

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
    // $ANTLR end "rule__SigDefinitions__Group__0"


    // $ANTLR start "rule__SigDefinitions__Group__0__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2998:1: rule__SigDefinitions__Group__0__Impl : ( '{' ) ;
    public final void rule__SigDefinitions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3002:1: ( ( '{' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3003:1: ( '{' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3003:1: ( '{' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3004:1: '{'
            {
             before(grammarAccess.getSigDefinitionsAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__SigDefinitions__Group__0__Impl6202); 
             after(grammarAccess.getSigDefinitionsAccess().getLeftCurlyBracketKeyword_0()); 

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
    // $ANTLR end "rule__SigDefinitions__Group__0__Impl"


    // $ANTLR start "rule__SigDefinitions__Group__1"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3017:1: rule__SigDefinitions__Group__1 : rule__SigDefinitions__Group__1__Impl rule__SigDefinitions__Group__2 ;
    public final void rule__SigDefinitions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3021:1: ( rule__SigDefinitions__Group__1__Impl rule__SigDefinitions__Group__2 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3022:2: rule__SigDefinitions__Group__1__Impl rule__SigDefinitions__Group__2
            {
            pushFollow(FOLLOW_rule__SigDefinitions__Group__1__Impl_in_rule__SigDefinitions__Group__16233);
            rule__SigDefinitions__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SigDefinitions__Group__2_in_rule__SigDefinitions__Group__16236);
            rule__SigDefinitions__Group__2();

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
    // $ANTLR end "rule__SigDefinitions__Group__1"


    // $ANTLR start "rule__SigDefinitions__Group__1__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3029:1: rule__SigDefinitions__Group__1__Impl : ( ( ruleWS )* ) ;
    public final void rule__SigDefinitions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3033:1: ( ( ( ruleWS )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3034:1: ( ( ruleWS )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3034:1: ( ( ruleWS )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3035:1: ( ruleWS )*
            {
             before(grammarAccess.getSigDefinitionsAccess().getWSParserRuleCall_1()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3036:1: ( ruleWS )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=RULE_SP && LA34_0<=RULE_SL_COMMENT)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3036:3: ruleWS
            	    {
            	    pushFollow(FOLLOW_ruleWS_in_rule__SigDefinitions__Group__1__Impl6264);
            	    ruleWS();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getSigDefinitionsAccess().getWSParserRuleCall_1()); 

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
    // $ANTLR end "rule__SigDefinitions__Group__1__Impl"


    // $ANTLR start "rule__SigDefinitions__Group__2"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3046:1: rule__SigDefinitions__Group__2 : rule__SigDefinitions__Group__2__Impl rule__SigDefinitions__Group__3 ;
    public final void rule__SigDefinitions__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3050:1: ( rule__SigDefinitions__Group__2__Impl rule__SigDefinitions__Group__3 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3051:2: rule__SigDefinitions__Group__2__Impl rule__SigDefinitions__Group__3
            {
            pushFollow(FOLLOW_rule__SigDefinitions__Group__2__Impl_in_rule__SigDefinitions__Group__26295);
            rule__SigDefinitions__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SigDefinitions__Group__3_in_rule__SigDefinitions__Group__26298);
            rule__SigDefinitions__Group__3();

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
    // $ANTLR end "rule__SigDefinitions__Group__2"


    // $ANTLR start "rule__SigDefinitions__Group__2__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3058:1: rule__SigDefinitions__Group__2__Impl : ( ( rule__SigDefinitions__ConsAssignment_2 ) ) ;
    public final void rule__SigDefinitions__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3062:1: ( ( ( rule__SigDefinitions__ConsAssignment_2 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3063:1: ( ( rule__SigDefinitions__ConsAssignment_2 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3063:1: ( ( rule__SigDefinitions__ConsAssignment_2 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3064:1: ( rule__SigDefinitions__ConsAssignment_2 )
            {
             before(grammarAccess.getSigDefinitionsAccess().getConsAssignment_2()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3065:1: ( rule__SigDefinitions__ConsAssignment_2 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3065:2: rule__SigDefinitions__ConsAssignment_2
            {
            pushFollow(FOLLOW_rule__SigDefinitions__ConsAssignment_2_in_rule__SigDefinitions__Group__2__Impl6325);
            rule__SigDefinitions__ConsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSigDefinitionsAccess().getConsAssignment_2()); 

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
    // $ANTLR end "rule__SigDefinitions__Group__2__Impl"


    // $ANTLR start "rule__SigDefinitions__Group__3"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3075:1: rule__SigDefinitions__Group__3 : rule__SigDefinitions__Group__3__Impl rule__SigDefinitions__Group__4 ;
    public final void rule__SigDefinitions__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3079:1: ( rule__SigDefinitions__Group__3__Impl rule__SigDefinitions__Group__4 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3080:2: rule__SigDefinitions__Group__3__Impl rule__SigDefinitions__Group__4
            {
            pushFollow(FOLLOW_rule__SigDefinitions__Group__3__Impl_in_rule__SigDefinitions__Group__36355);
            rule__SigDefinitions__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SigDefinitions__Group__4_in_rule__SigDefinitions__Group__36358);
            rule__SigDefinitions__Group__4();

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
    // $ANTLR end "rule__SigDefinitions__Group__3"


    // $ANTLR start "rule__SigDefinitions__Group__3__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3087:1: rule__SigDefinitions__Group__3__Impl : ( ( rule__SigDefinitions__Group_3__0 )* ) ;
    public final void rule__SigDefinitions__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3091:1: ( ( ( rule__SigDefinitions__Group_3__0 )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3092:1: ( ( rule__SigDefinitions__Group_3__0 )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3092:1: ( ( rule__SigDefinitions__Group_3__0 )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3093:1: ( rule__SigDefinitions__Group_3__0 )*
            {
             before(grammarAccess.getSigDefinitionsAccess().getGroup_3()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3094:1: ( rule__SigDefinitions__Group_3__0 )*
            loop35:
            do {
                int alt35=2;
                alt35 = dfa35.predict(input);
                switch (alt35) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3094:2: rule__SigDefinitions__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__SigDefinitions__Group_3__0_in_rule__SigDefinitions__Group__3__Impl6385);
            	    rule__SigDefinitions__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getSigDefinitionsAccess().getGroup_3()); 

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
    // $ANTLR end "rule__SigDefinitions__Group__3__Impl"


    // $ANTLR start "rule__SigDefinitions__Group__4"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3104:1: rule__SigDefinitions__Group__4 : rule__SigDefinitions__Group__4__Impl rule__SigDefinitions__Group__5 ;
    public final void rule__SigDefinitions__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3108:1: ( rule__SigDefinitions__Group__4__Impl rule__SigDefinitions__Group__5 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3109:2: rule__SigDefinitions__Group__4__Impl rule__SigDefinitions__Group__5
            {
            pushFollow(FOLLOW_rule__SigDefinitions__Group__4__Impl_in_rule__SigDefinitions__Group__46416);
            rule__SigDefinitions__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SigDefinitions__Group__5_in_rule__SigDefinitions__Group__46419);
            rule__SigDefinitions__Group__5();

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
    // $ANTLR end "rule__SigDefinitions__Group__4"


    // $ANTLR start "rule__SigDefinitions__Group__4__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3116:1: rule__SigDefinitions__Group__4__Impl : ( ( rule__SigDefinitions__Group_4__0 )? ) ;
    public final void rule__SigDefinitions__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3120:1: ( ( ( rule__SigDefinitions__Group_4__0 )? ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3121:1: ( ( rule__SigDefinitions__Group_4__0 )? )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3121:1: ( ( rule__SigDefinitions__Group_4__0 )? )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3122:1: ( rule__SigDefinitions__Group_4__0 )?
            {
             before(grammarAccess.getSigDefinitionsAccess().getGroup_4()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3123:1: ( rule__SigDefinitions__Group_4__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==14) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3123:2: rule__SigDefinitions__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__SigDefinitions__Group_4__0_in_rule__SigDefinitions__Group__4__Impl6446);
                    rule__SigDefinitions__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSigDefinitionsAccess().getGroup_4()); 

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
    // $ANTLR end "rule__SigDefinitions__Group__4__Impl"


    // $ANTLR start "rule__SigDefinitions__Group__5"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3133:1: rule__SigDefinitions__Group__5 : rule__SigDefinitions__Group__5__Impl ;
    public final void rule__SigDefinitions__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3137:1: ( rule__SigDefinitions__Group__5__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3138:2: rule__SigDefinitions__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__SigDefinitions__Group__5__Impl_in_rule__SigDefinitions__Group__56477);
            rule__SigDefinitions__Group__5__Impl();

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
    // $ANTLR end "rule__SigDefinitions__Group__5"


    // $ANTLR start "rule__SigDefinitions__Group__5__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3144:1: rule__SigDefinitions__Group__5__Impl : ( '}' ) ;
    public final void rule__SigDefinitions__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3148:1: ( ( '}' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3149:1: ( '}' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3149:1: ( '}' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3150:1: '}'
            {
             before(grammarAccess.getSigDefinitionsAccess().getRightCurlyBracketKeyword_5()); 
            match(input,31,FOLLOW_31_in_rule__SigDefinitions__Group__5__Impl6505); 
             after(grammarAccess.getSigDefinitionsAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__SigDefinitions__Group__5__Impl"


    // $ANTLR start "rule__SigDefinitions__Group_3__0"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3175:1: rule__SigDefinitions__Group_3__0 : rule__SigDefinitions__Group_3__0__Impl rule__SigDefinitions__Group_3__1 ;
    public final void rule__SigDefinitions__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3179:1: ( rule__SigDefinitions__Group_3__0__Impl rule__SigDefinitions__Group_3__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3180:2: rule__SigDefinitions__Group_3__0__Impl rule__SigDefinitions__Group_3__1
            {
            pushFollow(FOLLOW_rule__SigDefinitions__Group_3__0__Impl_in_rule__SigDefinitions__Group_3__06548);
            rule__SigDefinitions__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SigDefinitions__Group_3__1_in_rule__SigDefinitions__Group_3__06551);
            rule__SigDefinitions__Group_3__1();

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
    // $ANTLR end "rule__SigDefinitions__Group_3__0"


    // $ANTLR start "rule__SigDefinitions__Group_3__0__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3187:1: rule__SigDefinitions__Group_3__0__Impl : ( '.' ) ;
    public final void rule__SigDefinitions__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3191:1: ( ( '.' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3192:1: ( '.' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3192:1: ( '.' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3193:1: '.'
            {
             before(grammarAccess.getSigDefinitionsAccess().getFullStopKeyword_3_0()); 
            match(input,14,FOLLOW_14_in_rule__SigDefinitions__Group_3__0__Impl6579); 
             after(grammarAccess.getSigDefinitionsAccess().getFullStopKeyword_3_0()); 

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
    // $ANTLR end "rule__SigDefinitions__Group_3__0__Impl"


    // $ANTLR start "rule__SigDefinitions__Group_3__1"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3206:1: rule__SigDefinitions__Group_3__1 : rule__SigDefinitions__Group_3__1__Impl rule__SigDefinitions__Group_3__2 ;
    public final void rule__SigDefinitions__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3210:1: ( rule__SigDefinitions__Group_3__1__Impl rule__SigDefinitions__Group_3__2 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3211:2: rule__SigDefinitions__Group_3__1__Impl rule__SigDefinitions__Group_3__2
            {
            pushFollow(FOLLOW_rule__SigDefinitions__Group_3__1__Impl_in_rule__SigDefinitions__Group_3__16610);
            rule__SigDefinitions__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SigDefinitions__Group_3__2_in_rule__SigDefinitions__Group_3__16613);
            rule__SigDefinitions__Group_3__2();

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
    // $ANTLR end "rule__SigDefinitions__Group_3__1"


    // $ANTLR start "rule__SigDefinitions__Group_3__1__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3218:1: rule__SigDefinitions__Group_3__1__Impl : ( ( ( ruleWS ) ) ( ( ruleWS )* ) ) ;
    public final void rule__SigDefinitions__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3222:1: ( ( ( ( ruleWS ) ) ( ( ruleWS )* ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3223:1: ( ( ( ruleWS ) ) ( ( ruleWS )* ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3223:1: ( ( ( ruleWS ) ) ( ( ruleWS )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3224:1: ( ( ruleWS ) ) ( ( ruleWS )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3224:1: ( ( ruleWS ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3225:1: ( ruleWS )
            {
             before(grammarAccess.getSigDefinitionsAccess().getWSParserRuleCall_3_1()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3226:1: ( ruleWS )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3226:3: ruleWS
            {
            pushFollow(FOLLOW_ruleWS_in_rule__SigDefinitions__Group_3__1__Impl6643);
            ruleWS();

            state._fsp--;


            }

             after(grammarAccess.getSigDefinitionsAccess().getWSParserRuleCall_3_1()); 

            }

            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3229:1: ( ( ruleWS )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3230:1: ( ruleWS )*
            {
             before(grammarAccess.getSigDefinitionsAccess().getWSParserRuleCall_3_1()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3231:1: ( ruleWS )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0>=RULE_SP && LA37_0<=RULE_SL_COMMENT)) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3231:3: ruleWS
            	    {
            	    pushFollow(FOLLOW_ruleWS_in_rule__SigDefinitions__Group_3__1__Impl6656);
            	    ruleWS();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

             after(grammarAccess.getSigDefinitionsAccess().getWSParserRuleCall_3_1()); 

            }


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
    // $ANTLR end "rule__SigDefinitions__Group_3__1__Impl"


    // $ANTLR start "rule__SigDefinitions__Group_3__2"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3242:1: rule__SigDefinitions__Group_3__2 : rule__SigDefinitions__Group_3__2__Impl ;
    public final void rule__SigDefinitions__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3246:1: ( rule__SigDefinitions__Group_3__2__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3247:2: rule__SigDefinitions__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__SigDefinitions__Group_3__2__Impl_in_rule__SigDefinitions__Group_3__26689);
            rule__SigDefinitions__Group_3__2__Impl();

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
    // $ANTLR end "rule__SigDefinitions__Group_3__2"


    // $ANTLR start "rule__SigDefinitions__Group_3__2__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3253:1: rule__SigDefinitions__Group_3__2__Impl : ( ( rule__SigDefinitions__FconsAssignment_3_2 ) ) ;
    public final void rule__SigDefinitions__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3257:1: ( ( ( rule__SigDefinitions__FconsAssignment_3_2 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3258:1: ( ( rule__SigDefinitions__FconsAssignment_3_2 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3258:1: ( ( rule__SigDefinitions__FconsAssignment_3_2 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3259:1: ( rule__SigDefinitions__FconsAssignment_3_2 )
            {
             before(grammarAccess.getSigDefinitionsAccess().getFconsAssignment_3_2()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3260:1: ( rule__SigDefinitions__FconsAssignment_3_2 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3260:2: rule__SigDefinitions__FconsAssignment_3_2
            {
            pushFollow(FOLLOW_rule__SigDefinitions__FconsAssignment_3_2_in_rule__SigDefinitions__Group_3__2__Impl6716);
            rule__SigDefinitions__FconsAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getSigDefinitionsAccess().getFconsAssignment_3_2()); 

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
    // $ANTLR end "rule__SigDefinitions__Group_3__2__Impl"


    // $ANTLR start "rule__SigDefinitions__Group_4__0"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3276:1: rule__SigDefinitions__Group_4__0 : rule__SigDefinitions__Group_4__0__Impl rule__SigDefinitions__Group_4__1 ;
    public final void rule__SigDefinitions__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3280:1: ( rule__SigDefinitions__Group_4__0__Impl rule__SigDefinitions__Group_4__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3281:2: rule__SigDefinitions__Group_4__0__Impl rule__SigDefinitions__Group_4__1
            {
            pushFollow(FOLLOW_rule__SigDefinitions__Group_4__0__Impl_in_rule__SigDefinitions__Group_4__06752);
            rule__SigDefinitions__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SigDefinitions__Group_4__1_in_rule__SigDefinitions__Group_4__06755);
            rule__SigDefinitions__Group_4__1();

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
    // $ANTLR end "rule__SigDefinitions__Group_4__0"


    // $ANTLR start "rule__SigDefinitions__Group_4__0__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3288:1: rule__SigDefinitions__Group_4__0__Impl : ( '.' ) ;
    public final void rule__SigDefinitions__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3292:1: ( ( '.' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3293:1: ( '.' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3293:1: ( '.' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3294:1: '.'
            {
             before(grammarAccess.getSigDefinitionsAccess().getFullStopKeyword_4_0()); 
            match(input,14,FOLLOW_14_in_rule__SigDefinitions__Group_4__0__Impl6783); 
             after(grammarAccess.getSigDefinitionsAccess().getFullStopKeyword_4_0()); 

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
    // $ANTLR end "rule__SigDefinitions__Group_4__0__Impl"


    // $ANTLR start "rule__SigDefinitions__Group_4__1"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3307:1: rule__SigDefinitions__Group_4__1 : rule__SigDefinitions__Group_4__1__Impl ;
    public final void rule__SigDefinitions__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3311:1: ( rule__SigDefinitions__Group_4__1__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3312:2: rule__SigDefinitions__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__SigDefinitions__Group_4__1__Impl_in_rule__SigDefinitions__Group_4__16814);
            rule__SigDefinitions__Group_4__1__Impl();

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
    // $ANTLR end "rule__SigDefinitions__Group_4__1"


    // $ANTLR start "rule__SigDefinitions__Group_4__1__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3318:1: rule__SigDefinitions__Group_4__1__Impl : ( ( ruleWS )* ) ;
    public final void rule__SigDefinitions__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3322:1: ( ( ( ruleWS )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3323:1: ( ( ruleWS )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3323:1: ( ( ruleWS )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3324:1: ( ruleWS )*
            {
             before(grammarAccess.getSigDefinitionsAccess().getWSParserRuleCall_4_1()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3325:1: ( ruleWS )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( ((LA38_0>=RULE_SP && LA38_0<=RULE_SL_COMMENT)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3325:3: ruleWS
            	    {
            	    pushFollow(FOLLOW_ruleWS_in_rule__SigDefinitions__Group_4__1__Impl6842);
            	    ruleWS();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getSigDefinitionsAccess().getWSParserRuleCall_4_1()); 

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
    // $ANTLR end "rule__SigDefinitions__Group_4__1__Impl"


    // $ANTLR start "rule__SigConstruct__Group_0__0"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3339:1: rule__SigConstruct__Group_0__0 : rule__SigConstruct__Group_0__0__Impl rule__SigConstruct__Group_0__1 ;
    public final void rule__SigConstruct__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3343:1: ( rule__SigConstruct__Group_0__0__Impl rule__SigConstruct__Group_0__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3344:2: rule__SigConstruct__Group_0__0__Impl rule__SigConstruct__Group_0__1
            {
            pushFollow(FOLLOW_rule__SigConstruct__Group_0__0__Impl_in_rule__SigConstruct__Group_0__06877);
            rule__SigConstruct__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SigConstruct__Group_0__1_in_rule__SigConstruct__Group_0__06880);
            rule__SigConstruct__Group_0__1();

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
    // $ANTLR end "rule__SigConstruct__Group_0__0"


    // $ANTLR start "rule__SigConstruct__Group_0__0__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3351:1: rule__SigConstruct__Group_0__0__Impl : ( ( rule__SigConstruct__SymbNameAssignment_0_0 ) ) ;
    public final void rule__SigConstruct__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3355:1: ( ( ( rule__SigConstruct__SymbNameAssignment_0_0 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3356:1: ( ( rule__SigConstruct__SymbNameAssignment_0_0 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3356:1: ( ( rule__SigConstruct__SymbNameAssignment_0_0 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3357:1: ( rule__SigConstruct__SymbNameAssignment_0_0 )
            {
             before(grammarAccess.getSigConstructAccess().getSymbNameAssignment_0_0()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3358:1: ( rule__SigConstruct__SymbNameAssignment_0_0 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3358:2: rule__SigConstruct__SymbNameAssignment_0_0
            {
            pushFollow(FOLLOW_rule__SigConstruct__SymbNameAssignment_0_0_in_rule__SigConstruct__Group_0__0__Impl6907);
            rule__SigConstruct__SymbNameAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getSigConstructAccess().getSymbNameAssignment_0_0()); 

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
    // $ANTLR end "rule__SigConstruct__Group_0__0__Impl"


    // $ANTLR start "rule__SigConstruct__Group_0__1"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3368:1: rule__SigConstruct__Group_0__1 : rule__SigConstruct__Group_0__1__Impl rule__SigConstruct__Group_0__2 ;
    public final void rule__SigConstruct__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3372:1: ( rule__SigConstruct__Group_0__1__Impl rule__SigConstruct__Group_0__2 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3373:2: rule__SigConstruct__Group_0__1__Impl rule__SigConstruct__Group_0__2
            {
            pushFollow(FOLLOW_rule__SigConstruct__Group_0__1__Impl_in_rule__SigConstruct__Group_0__16937);
            rule__SigConstruct__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SigConstruct__Group_0__2_in_rule__SigConstruct__Group_0__16940);
            rule__SigConstruct__Group_0__2();

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
    // $ANTLR end "rule__SigConstruct__Group_0__1"


    // $ANTLR start "rule__SigConstruct__Group_0__1__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3380:1: rule__SigConstruct__Group_0__1__Impl : ( ( ruleWS )* ) ;
    public final void rule__SigConstruct__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3384:1: ( ( ( ruleWS )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3385:1: ( ( ruleWS )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3385:1: ( ( ruleWS )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3386:1: ( ruleWS )*
            {
             before(grammarAccess.getSigConstructAccess().getWSParserRuleCall_0_1()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3387:1: ( ruleWS )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0>=RULE_SP && LA39_0<=RULE_SL_COMMENT)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3387:3: ruleWS
            	    {
            	    pushFollow(FOLLOW_ruleWS_in_rule__SigConstruct__Group_0__1__Impl6968);
            	    ruleWS();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getSigConstructAccess().getWSParserRuleCall_0_1()); 

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
    // $ANTLR end "rule__SigConstruct__Group_0__1__Impl"


    // $ANTLR start "rule__SigConstruct__Group_0__2"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3397:1: rule__SigConstruct__Group_0__2 : rule__SigConstruct__Group_0__2__Impl rule__SigConstruct__Group_0__3 ;
    public final void rule__SigConstruct__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3401:1: ( rule__SigConstruct__Group_0__2__Impl rule__SigConstruct__Group_0__3 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3402:2: rule__SigConstruct__Group_0__2__Impl rule__SigConstruct__Group_0__3
            {
            pushFollow(FOLLOW_rule__SigConstruct__Group_0__2__Impl_in_rule__SigConstruct__Group_0__26999);
            rule__SigConstruct__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SigConstruct__Group_0__3_in_rule__SigConstruct__Group_0__27002);
            rule__SigConstruct__Group_0__3();

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
    // $ANTLR end "rule__SigConstruct__Group_0__2"


    // $ANTLR start "rule__SigConstruct__Group_0__2__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3409:1: rule__SigConstruct__Group_0__2__Impl : ( ( rule__SigConstruct__Alternatives_0_2 ) ) ;
    public final void rule__SigConstruct__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3413:1: ( ( ( rule__SigConstruct__Alternatives_0_2 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3414:1: ( ( rule__SigConstruct__Alternatives_0_2 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3414:1: ( ( rule__SigConstruct__Alternatives_0_2 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3415:1: ( rule__SigConstruct__Alternatives_0_2 )
            {
             before(grammarAccess.getSigConstructAccess().getAlternatives_0_2()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3416:1: ( rule__SigConstruct__Alternatives_0_2 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3416:2: rule__SigConstruct__Alternatives_0_2
            {
            pushFollow(FOLLOW_rule__SigConstruct__Alternatives_0_2_in_rule__SigConstruct__Group_0__2__Impl7029);
            rule__SigConstruct__Alternatives_0_2();

            state._fsp--;


            }

             after(grammarAccess.getSigConstructAccess().getAlternatives_0_2()); 

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
    // $ANTLR end "rule__SigConstruct__Group_0__2__Impl"


    // $ANTLR start "rule__SigConstruct__Group_0__3"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3426:1: rule__SigConstruct__Group_0__3 : rule__SigConstruct__Group_0__3__Impl ;
    public final void rule__SigConstruct__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3430:1: ( rule__SigConstruct__Group_0__3__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3431:2: rule__SigConstruct__Group_0__3__Impl
            {
            pushFollow(FOLLOW_rule__SigConstruct__Group_0__3__Impl_in_rule__SigConstruct__Group_0__37059);
            rule__SigConstruct__Group_0__3__Impl();

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
    // $ANTLR end "rule__SigConstruct__Group_0__3"


    // $ANTLR start "rule__SigConstruct__Group_0__3__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3437:1: rule__SigConstruct__Group_0__3__Impl : ( ( ruleSOMETHING )* ) ;
    public final void rule__SigConstruct__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3441:1: ( ( ( ruleSOMETHING )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3442:1: ( ( ruleSOMETHING )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3442:1: ( ( ruleSOMETHING )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3443:1: ( ruleSOMETHING )*
            {
             before(grammarAccess.getSigConstructAccess().getSOMETHINGParserRuleCall_0_3()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3444:1: ( ruleSOMETHING )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==14) ) {
                    int LA40_2 = input.LA(2);

                    if ( ((LA40_2>=RULE_CID && LA40_2<=RULE_ANY_OTHER)) ) {
                        alt40=1;
                    }


                }
                else if ( ((LA40_0>=RULE_SP && LA40_0<=RULE_INT)||(LA40_0>=15 && LA40_0<=18)||LA40_0==30) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3444:3: ruleSOMETHING
            	    {
            	    pushFollow(FOLLOW_ruleSOMETHING_in_rule__SigConstruct__Group_0__3__Impl7087);
            	    ruleSOMETHING();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

             after(grammarAccess.getSigConstructAccess().getSOMETHINGParserRuleCall_0_3()); 

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
    // $ANTLR end "rule__SigConstruct__Group_0__3__Impl"


    // $ANTLR start "rule__SigConstruct__Group_1__0"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3462:1: rule__SigConstruct__Group_1__0 : rule__SigConstruct__Group_1__0__Impl rule__SigConstruct__Group_1__1 ;
    public final void rule__SigConstruct__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3466:1: ( rule__SigConstruct__Group_1__0__Impl rule__SigConstruct__Group_1__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3467:2: rule__SigConstruct__Group_1__0__Impl rule__SigConstruct__Group_1__1
            {
            pushFollow(FOLLOW_rule__SigConstruct__Group_1__0__Impl_in_rule__SigConstruct__Group_1__07126);
            rule__SigConstruct__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SigConstruct__Group_1__1_in_rule__SigConstruct__Group_1__07129);
            rule__SigConstruct__Group_1__1();

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
    // $ANTLR end "rule__SigConstruct__Group_1__0"


    // $ANTLR start "rule__SigConstruct__Group_1__0__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3474:1: rule__SigConstruct__Group_1__0__Impl : ( '%' ) ;
    public final void rule__SigConstruct__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3478:1: ( ( '%' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3479:1: ( '%' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3479:1: ( '%' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3480:1: '%'
            {
             before(grammarAccess.getSigConstructAccess().getPercentSignKeyword_1_0()); 
            match(input,18,FOLLOW_18_in_rule__SigConstruct__Group_1__0__Impl7157); 
             after(grammarAccess.getSigConstructAccess().getPercentSignKeyword_1_0()); 

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
    // $ANTLR end "rule__SigConstruct__Group_1__0__Impl"


    // $ANTLR start "rule__SigConstruct__Group_1__1"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3493:1: rule__SigConstruct__Group_1__1 : rule__SigConstruct__Group_1__1__Impl rule__SigConstruct__Group_1__2 ;
    public final void rule__SigConstruct__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3497:1: ( rule__SigConstruct__Group_1__1__Impl rule__SigConstruct__Group_1__2 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3498:2: rule__SigConstruct__Group_1__1__Impl rule__SigConstruct__Group_1__2
            {
            pushFollow(FOLLOW_rule__SigConstruct__Group_1__1__Impl_in_rule__SigConstruct__Group_1__17188);
            rule__SigConstruct__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SigConstruct__Group_1__2_in_rule__SigConstruct__Group_1__17191);
            rule__SigConstruct__Group_1__2();

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
    // $ANTLR end "rule__SigConstruct__Group_1__1"


    // $ANTLR start "rule__SigConstruct__Group_1__1__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3505:1: rule__SigConstruct__Group_1__1__Impl : ( 'include' ) ;
    public final void rule__SigConstruct__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3509:1: ( ( 'include' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3510:1: ( 'include' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3510:1: ( 'include' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3511:1: 'include'
            {
             before(grammarAccess.getSigConstructAccess().getIncludeKeyword_1_1()); 
            match(input,33,FOLLOW_33_in_rule__SigConstruct__Group_1__1__Impl7219); 
             after(grammarAccess.getSigConstructAccess().getIncludeKeyword_1_1()); 

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
    // $ANTLR end "rule__SigConstruct__Group_1__1__Impl"


    // $ANTLR start "rule__SigConstruct__Group_1__2"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3524:1: rule__SigConstruct__Group_1__2 : rule__SigConstruct__Group_1__2__Impl rule__SigConstruct__Group_1__3 ;
    public final void rule__SigConstruct__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3528:1: ( rule__SigConstruct__Group_1__2__Impl rule__SigConstruct__Group_1__3 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3529:2: rule__SigConstruct__Group_1__2__Impl rule__SigConstruct__Group_1__3
            {
            pushFollow(FOLLOW_rule__SigConstruct__Group_1__2__Impl_in_rule__SigConstruct__Group_1__27250);
            rule__SigConstruct__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SigConstruct__Group_1__3_in_rule__SigConstruct__Group_1__27253);
            rule__SigConstruct__Group_1__3();

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
    // $ANTLR end "rule__SigConstruct__Group_1__2"


    // $ANTLR start "rule__SigConstruct__Group_1__2__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3536:1: rule__SigConstruct__Group_1__2__Impl : ( ( ( ruleWS ) ) ( ( ruleWS )* ) ) ;
    public final void rule__SigConstruct__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3540:1: ( ( ( ( ruleWS ) ) ( ( ruleWS )* ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3541:1: ( ( ( ruleWS ) ) ( ( ruleWS )* ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3541:1: ( ( ( ruleWS ) ) ( ( ruleWS )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3542:1: ( ( ruleWS ) ) ( ( ruleWS )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3542:1: ( ( ruleWS ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3543:1: ( ruleWS )
            {
             before(grammarAccess.getSigConstructAccess().getWSParserRuleCall_1_2()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3544:1: ( ruleWS )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3544:3: ruleWS
            {
            pushFollow(FOLLOW_ruleWS_in_rule__SigConstruct__Group_1__2__Impl7283);
            ruleWS();

            state._fsp--;


            }

             after(grammarAccess.getSigConstructAccess().getWSParserRuleCall_1_2()); 

            }

            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3547:1: ( ( ruleWS )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3548:1: ( ruleWS )*
            {
             before(grammarAccess.getSigConstructAccess().getWSParserRuleCall_1_2()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3549:1: ( ruleWS )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( ((LA41_0>=RULE_SP && LA41_0<=RULE_SL_COMMENT)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3549:3: ruleWS
            	    {
            	    pushFollow(FOLLOW_ruleWS_in_rule__SigConstruct__Group_1__2__Impl7296);
            	    ruleWS();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

             after(grammarAccess.getSigConstructAccess().getWSParserRuleCall_1_2()); 

            }


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
    // $ANTLR end "rule__SigConstruct__Group_1__2__Impl"


    // $ANTLR start "rule__SigConstruct__Group_1__3"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3560:1: rule__SigConstruct__Group_1__3 : rule__SigConstruct__Group_1__3__Impl rule__SigConstruct__Group_1__4 ;
    public final void rule__SigConstruct__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3564:1: ( rule__SigConstruct__Group_1__3__Impl rule__SigConstruct__Group_1__4 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3565:2: rule__SigConstruct__Group_1__3__Impl rule__SigConstruct__Group_1__4
            {
            pushFollow(FOLLOW_rule__SigConstruct__Group_1__3__Impl_in_rule__SigConstruct__Group_1__37329);
            rule__SigConstruct__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SigConstruct__Group_1__4_in_rule__SigConstruct__Group_1__37332);
            rule__SigConstruct__Group_1__4();

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
    // $ANTLR end "rule__SigConstruct__Group_1__3"


    // $ANTLR start "rule__SigConstruct__Group_1__3__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3572:1: rule__SigConstruct__Group_1__3__Impl : ( ( rule__SigConstruct__NamespaceAssignment_1_3 ) ) ;
    public final void rule__SigConstruct__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3576:1: ( ( ( rule__SigConstruct__NamespaceAssignment_1_3 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3577:1: ( ( rule__SigConstruct__NamespaceAssignment_1_3 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3577:1: ( ( rule__SigConstruct__NamespaceAssignment_1_3 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3578:1: ( rule__SigConstruct__NamespaceAssignment_1_3 )
            {
             before(grammarAccess.getSigConstructAccess().getNamespaceAssignment_1_3()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3579:1: ( rule__SigConstruct__NamespaceAssignment_1_3 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3579:2: rule__SigConstruct__NamespaceAssignment_1_3
            {
            pushFollow(FOLLOW_rule__SigConstruct__NamespaceAssignment_1_3_in_rule__SigConstruct__Group_1__3__Impl7359);
            rule__SigConstruct__NamespaceAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getSigConstructAccess().getNamespaceAssignment_1_3()); 

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
    // $ANTLR end "rule__SigConstruct__Group_1__3__Impl"


    // $ANTLR start "rule__SigConstruct__Group_1__4"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3589:1: rule__SigConstruct__Group_1__4 : rule__SigConstruct__Group_1__4__Impl ;
    public final void rule__SigConstruct__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3593:1: ( rule__SigConstruct__Group_1__4__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3594:2: rule__SigConstruct__Group_1__4__Impl
            {
            pushFollow(FOLLOW_rule__SigConstruct__Group_1__4__Impl_in_rule__SigConstruct__Group_1__47389);
            rule__SigConstruct__Group_1__4__Impl();

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
    // $ANTLR end "rule__SigConstruct__Group_1__4"


    // $ANTLR start "rule__SigConstruct__Group_1__4__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3600:1: rule__SigConstruct__Group_1__4__Impl : ( ( rule__SigConstruct__Group_1_4__0 )? ) ;
    public final void rule__SigConstruct__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3604:1: ( ( ( rule__SigConstruct__Group_1_4__0 )? ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3605:1: ( ( rule__SigConstruct__Group_1_4__0 )? )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3605:1: ( ( rule__SigConstruct__Group_1_4__0 )? )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3606:1: ( rule__SigConstruct__Group_1_4__0 )?
            {
             before(grammarAccess.getSigConstructAccess().getGroup_1_4()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3607:1: ( rule__SigConstruct__Group_1_4__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=RULE_SP && LA42_0<=RULE_SL_COMMENT)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3607:2: rule__SigConstruct__Group_1_4__0
                    {
                    pushFollow(FOLLOW_rule__SigConstruct__Group_1_4__0_in_rule__SigConstruct__Group_1__4__Impl7416);
                    rule__SigConstruct__Group_1_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSigConstructAccess().getGroup_1_4()); 

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
    // $ANTLR end "rule__SigConstruct__Group_1__4__Impl"


    // $ANTLR start "rule__SigConstruct__Group_1_4__0"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3627:1: rule__SigConstruct__Group_1_4__0 : rule__SigConstruct__Group_1_4__0__Impl rule__SigConstruct__Group_1_4__1 ;
    public final void rule__SigConstruct__Group_1_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3631:1: ( rule__SigConstruct__Group_1_4__0__Impl rule__SigConstruct__Group_1_4__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3632:2: rule__SigConstruct__Group_1_4__0__Impl rule__SigConstruct__Group_1_4__1
            {
            pushFollow(FOLLOW_rule__SigConstruct__Group_1_4__0__Impl_in_rule__SigConstruct__Group_1_4__07457);
            rule__SigConstruct__Group_1_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SigConstruct__Group_1_4__1_in_rule__SigConstruct__Group_1_4__07460);
            rule__SigConstruct__Group_1_4__1();

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
    // $ANTLR end "rule__SigConstruct__Group_1_4__0"


    // $ANTLR start "rule__SigConstruct__Group_1_4__0__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3639:1: rule__SigConstruct__Group_1_4__0__Impl : ( ( ( ruleWS ) ) ( ( ruleWS )* ) ) ;
    public final void rule__SigConstruct__Group_1_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3643:1: ( ( ( ( ruleWS ) ) ( ( ruleWS )* ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3644:1: ( ( ( ruleWS ) ) ( ( ruleWS )* ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3644:1: ( ( ( ruleWS ) ) ( ( ruleWS )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3645:1: ( ( ruleWS ) ) ( ( ruleWS )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3645:1: ( ( ruleWS ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3646:1: ( ruleWS )
            {
             before(grammarAccess.getSigConstructAccess().getWSParserRuleCall_1_4_0()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3647:1: ( ruleWS )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3647:3: ruleWS
            {
            pushFollow(FOLLOW_ruleWS_in_rule__SigConstruct__Group_1_4__0__Impl7490);
            ruleWS();

            state._fsp--;


            }

             after(grammarAccess.getSigConstructAccess().getWSParserRuleCall_1_4_0()); 

            }

            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3650:1: ( ( ruleWS )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3651:1: ( ruleWS )*
            {
             before(grammarAccess.getSigConstructAccess().getWSParserRuleCall_1_4_0()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3652:1: ( ruleWS )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>=RULE_SP && LA43_0<=RULE_SL_COMMENT)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3652:3: ruleWS
            	    {
            	    pushFollow(FOLLOW_ruleWS_in_rule__SigConstruct__Group_1_4__0__Impl7503);
            	    ruleWS();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

             after(grammarAccess.getSigConstructAccess().getWSParserRuleCall_1_4_0()); 

            }


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
    // $ANTLR end "rule__SigConstruct__Group_1_4__0__Impl"


    // $ANTLR start "rule__SigConstruct__Group_1_4__1"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3663:1: rule__SigConstruct__Group_1_4__1 : rule__SigConstruct__Group_1_4__1__Impl ;
    public final void rule__SigConstruct__Group_1_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3667:1: ( rule__SigConstruct__Group_1_4__1__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3668:2: rule__SigConstruct__Group_1_4__1__Impl
            {
            pushFollow(FOLLOW_rule__SigConstruct__Group_1_4__1__Impl_in_rule__SigConstruct__Group_1_4__17536);
            rule__SigConstruct__Group_1_4__1__Impl();

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
    // $ANTLR end "rule__SigConstruct__Group_1_4__1"


    // $ANTLR start "rule__SigConstruct__Group_1_4__1__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3674:1: rule__SigConstruct__Group_1_4__1__Impl : ( ruleincludeOps ) ;
    public final void rule__SigConstruct__Group_1_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3678:1: ( ( ruleincludeOps ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3679:1: ( ruleincludeOps )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3679:1: ( ruleincludeOps )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3680:1: ruleincludeOps
            {
             before(grammarAccess.getSigConstructAccess().getIncludeOpsParserRuleCall_1_4_1()); 
            pushFollow(FOLLOW_ruleincludeOps_in_rule__SigConstruct__Group_1_4__1__Impl7563);
            ruleincludeOps();

            state._fsp--;

             after(grammarAccess.getSigConstructAccess().getIncludeOpsParserRuleCall_1_4_1()); 

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
    // $ANTLR end "rule__SigConstruct__Group_1_4__1__Impl"


    // $ANTLR start "rule__SigConstruct__Group_2__0"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3695:1: rule__SigConstruct__Group_2__0 : rule__SigConstruct__Group_2__0__Impl rule__SigConstruct__Group_2__1 ;
    public final void rule__SigConstruct__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3699:1: ( rule__SigConstruct__Group_2__0__Impl rule__SigConstruct__Group_2__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3700:2: rule__SigConstruct__Group_2__0__Impl rule__SigConstruct__Group_2__1
            {
            pushFollow(FOLLOW_rule__SigConstruct__Group_2__0__Impl_in_rule__SigConstruct__Group_2__07596);
            rule__SigConstruct__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SigConstruct__Group_2__1_in_rule__SigConstruct__Group_2__07599);
            rule__SigConstruct__Group_2__1();

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
    // $ANTLR end "rule__SigConstruct__Group_2__0"


    // $ANTLR start "rule__SigConstruct__Group_2__0__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3707:1: rule__SigConstruct__Group_2__0__Impl : ( '%' ) ;
    public final void rule__SigConstruct__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3711:1: ( ( '%' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3712:1: ( '%' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3712:1: ( '%' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3713:1: '%'
            {
             before(grammarAccess.getSigConstructAccess().getPercentSignKeyword_2_0()); 
            match(input,18,FOLLOW_18_in_rule__SigConstruct__Group_2__0__Impl7627); 
             after(grammarAccess.getSigConstructAccess().getPercentSignKeyword_2_0()); 

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
    // $ANTLR end "rule__SigConstruct__Group_2__0__Impl"


    // $ANTLR start "rule__SigConstruct__Group_2__1"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3726:1: rule__SigConstruct__Group_2__1 : rule__SigConstruct__Group_2__1__Impl rule__SigConstruct__Group_2__2 ;
    public final void rule__SigConstruct__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3730:1: ( rule__SigConstruct__Group_2__1__Impl rule__SigConstruct__Group_2__2 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3731:2: rule__SigConstruct__Group_2__1__Impl rule__SigConstruct__Group_2__2
            {
            pushFollow(FOLLOW_rule__SigConstruct__Group_2__1__Impl_in_rule__SigConstruct__Group_2__17658);
            rule__SigConstruct__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SigConstruct__Group_2__2_in_rule__SigConstruct__Group_2__17661);
            rule__SigConstruct__Group_2__2();

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
    // $ANTLR end "rule__SigConstruct__Group_2__1"


    // $ANTLR start "rule__SigConstruct__Group_2__1__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3738:1: rule__SigConstruct__Group_2__1__Impl : ( 'struct' ) ;
    public final void rule__SigConstruct__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3742:1: ( ( 'struct' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3743:1: ( 'struct' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3743:1: ( 'struct' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3744:1: 'struct'
            {
             before(grammarAccess.getSigConstructAccess().getStructKeyword_2_1()); 
            match(input,34,FOLLOW_34_in_rule__SigConstruct__Group_2__1__Impl7689); 
             after(grammarAccess.getSigConstructAccess().getStructKeyword_2_1()); 

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
    // $ANTLR end "rule__SigConstruct__Group_2__1__Impl"


    // $ANTLR start "rule__SigConstruct__Group_2__2"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3757:1: rule__SigConstruct__Group_2__2 : rule__SigConstruct__Group_2__2__Impl rule__SigConstruct__Group_2__3 ;
    public final void rule__SigConstruct__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3761:1: ( rule__SigConstruct__Group_2__2__Impl rule__SigConstruct__Group_2__3 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3762:2: rule__SigConstruct__Group_2__2__Impl rule__SigConstruct__Group_2__3
            {
            pushFollow(FOLLOW_rule__SigConstruct__Group_2__2__Impl_in_rule__SigConstruct__Group_2__27720);
            rule__SigConstruct__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SigConstruct__Group_2__3_in_rule__SigConstruct__Group_2__27723);
            rule__SigConstruct__Group_2__3();

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
    // $ANTLR end "rule__SigConstruct__Group_2__2"


    // $ANTLR start "rule__SigConstruct__Group_2__2__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3769:1: rule__SigConstruct__Group_2__2__Impl : ( ( ( ruleWS ) ) ( ( ruleWS )* ) ) ;
    public final void rule__SigConstruct__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3773:1: ( ( ( ( ruleWS ) ) ( ( ruleWS )* ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3774:1: ( ( ( ruleWS ) ) ( ( ruleWS )* ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3774:1: ( ( ( ruleWS ) ) ( ( ruleWS )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3775:1: ( ( ruleWS ) ) ( ( ruleWS )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3775:1: ( ( ruleWS ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3776:1: ( ruleWS )
            {
             before(grammarAccess.getSigConstructAccess().getWSParserRuleCall_2_2()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3777:1: ( ruleWS )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3777:3: ruleWS
            {
            pushFollow(FOLLOW_ruleWS_in_rule__SigConstruct__Group_2__2__Impl7753);
            ruleWS();

            state._fsp--;


            }

             after(grammarAccess.getSigConstructAccess().getWSParserRuleCall_2_2()); 

            }

            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3780:1: ( ( ruleWS )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3781:1: ( ruleWS )*
            {
             before(grammarAccess.getSigConstructAccess().getWSParserRuleCall_2_2()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3782:1: ( ruleWS )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0>=RULE_SP && LA44_0<=RULE_SL_COMMENT)) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3782:3: ruleWS
            	    {
            	    pushFollow(FOLLOW_ruleWS_in_rule__SigConstruct__Group_2__2__Impl7766);
            	    ruleWS();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

             after(grammarAccess.getSigConstructAccess().getWSParserRuleCall_2_2()); 

            }


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
    // $ANTLR end "rule__SigConstruct__Group_2__2__Impl"


    // $ANTLR start "rule__SigConstruct__Group_2__3"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3793:1: rule__SigConstruct__Group_2__3 : rule__SigConstruct__Group_2__3__Impl rule__SigConstruct__Group_2__4 ;
    public final void rule__SigConstruct__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3797:1: ( rule__SigConstruct__Group_2__3__Impl rule__SigConstruct__Group_2__4 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3798:2: rule__SigConstruct__Group_2__3__Impl rule__SigConstruct__Group_2__4
            {
            pushFollow(FOLLOW_rule__SigConstruct__Group_2__3__Impl_in_rule__SigConstruct__Group_2__37799);
            rule__SigConstruct__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SigConstruct__Group_2__4_in_rule__SigConstruct__Group_2__37802);
            rule__SigConstruct__Group_2__4();

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
    // $ANTLR end "rule__SigConstruct__Group_2__3"


    // $ANTLR start "rule__SigConstruct__Group_2__3__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3805:1: rule__SigConstruct__Group_2__3__Impl : ( ( rule__SigConstruct__StructNameAssignment_2_3 ) ) ;
    public final void rule__SigConstruct__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3809:1: ( ( ( rule__SigConstruct__StructNameAssignment_2_3 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3810:1: ( ( rule__SigConstruct__StructNameAssignment_2_3 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3810:1: ( ( rule__SigConstruct__StructNameAssignment_2_3 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3811:1: ( rule__SigConstruct__StructNameAssignment_2_3 )
            {
             before(grammarAccess.getSigConstructAccess().getStructNameAssignment_2_3()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3812:1: ( rule__SigConstruct__StructNameAssignment_2_3 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3812:2: rule__SigConstruct__StructNameAssignment_2_3
            {
            pushFollow(FOLLOW_rule__SigConstruct__StructNameAssignment_2_3_in_rule__SigConstruct__Group_2__3__Impl7829);
            rule__SigConstruct__StructNameAssignment_2_3();

            state._fsp--;


            }

             after(grammarAccess.getSigConstructAccess().getStructNameAssignment_2_3()); 

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
    // $ANTLR end "rule__SigConstruct__Group_2__3__Impl"


    // $ANTLR start "rule__SigConstruct__Group_2__4"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3822:1: rule__SigConstruct__Group_2__4 : rule__SigConstruct__Group_2__4__Impl rule__SigConstruct__Group_2__5 ;
    public final void rule__SigConstruct__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3826:1: ( rule__SigConstruct__Group_2__4__Impl rule__SigConstruct__Group_2__5 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3827:2: rule__SigConstruct__Group_2__4__Impl rule__SigConstruct__Group_2__5
            {
            pushFollow(FOLLOW_rule__SigConstruct__Group_2__4__Impl_in_rule__SigConstruct__Group_2__47859);
            rule__SigConstruct__Group_2__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SigConstruct__Group_2__5_in_rule__SigConstruct__Group_2__47862);
            rule__SigConstruct__Group_2__5();

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
    // $ANTLR end "rule__SigConstruct__Group_2__4"


    // $ANTLR start "rule__SigConstruct__Group_2__4__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3834:1: rule__SigConstruct__Group_2__4__Impl : ( ( ruleWS )* ) ;
    public final void rule__SigConstruct__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3838:1: ( ( ( ruleWS )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3839:1: ( ( ruleWS )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3839:1: ( ( ruleWS )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3840:1: ( ruleWS )*
            {
             before(grammarAccess.getSigConstructAccess().getWSParserRuleCall_2_4()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3841:1: ( ruleWS )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( ((LA45_0>=RULE_SP && LA45_0<=RULE_SL_COMMENT)) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3841:3: ruleWS
            	    {
            	    pushFollow(FOLLOW_ruleWS_in_rule__SigConstruct__Group_2__4__Impl7890);
            	    ruleWS();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

             after(grammarAccess.getSigConstructAccess().getWSParserRuleCall_2_4()); 

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
    // $ANTLR end "rule__SigConstruct__Group_2__4__Impl"


    // $ANTLR start "rule__SigConstruct__Group_2__5"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3851:1: rule__SigConstruct__Group_2__5 : rule__SigConstruct__Group_2__5__Impl rule__SigConstruct__Group_2__6 ;
    public final void rule__SigConstruct__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3855:1: ( rule__SigConstruct__Group_2__5__Impl rule__SigConstruct__Group_2__6 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3856:2: rule__SigConstruct__Group_2__5__Impl rule__SigConstruct__Group_2__6
            {
            pushFollow(FOLLOW_rule__SigConstruct__Group_2__5__Impl_in_rule__SigConstruct__Group_2__57921);
            rule__SigConstruct__Group_2__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SigConstruct__Group_2__6_in_rule__SigConstruct__Group_2__57924);
            rule__SigConstruct__Group_2__6();

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
    // $ANTLR end "rule__SigConstruct__Group_2__5"


    // $ANTLR start "rule__SigConstruct__Group_2__5__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3863:1: rule__SigConstruct__Group_2__5__Impl : ( ( rule__SigConstruct__Alternatives_2_5 ) ) ;
    public final void rule__SigConstruct__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3867:1: ( ( ( rule__SigConstruct__Alternatives_2_5 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3868:1: ( ( rule__SigConstruct__Alternatives_2_5 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3868:1: ( ( rule__SigConstruct__Alternatives_2_5 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3869:1: ( rule__SigConstruct__Alternatives_2_5 )
            {
             before(grammarAccess.getSigConstructAccess().getAlternatives_2_5()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3870:1: ( rule__SigConstruct__Alternatives_2_5 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3870:2: rule__SigConstruct__Alternatives_2_5
            {
            pushFollow(FOLLOW_rule__SigConstruct__Alternatives_2_5_in_rule__SigConstruct__Group_2__5__Impl7951);
            rule__SigConstruct__Alternatives_2_5();

            state._fsp--;


            }

             after(grammarAccess.getSigConstructAccess().getAlternatives_2_5()); 

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
    // $ANTLR end "rule__SigConstruct__Group_2__5__Impl"


    // $ANTLR start "rule__SigConstruct__Group_2__6"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3880:1: rule__SigConstruct__Group_2__6 : rule__SigConstruct__Group_2__6__Impl rule__SigConstruct__Group_2__7 ;
    public final void rule__SigConstruct__Group_2__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3884:1: ( rule__SigConstruct__Group_2__6__Impl rule__SigConstruct__Group_2__7 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3885:2: rule__SigConstruct__Group_2__6__Impl rule__SigConstruct__Group_2__7
            {
            pushFollow(FOLLOW_rule__SigConstruct__Group_2__6__Impl_in_rule__SigConstruct__Group_2__67981);
            rule__SigConstruct__Group_2__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SigConstruct__Group_2__7_in_rule__SigConstruct__Group_2__67984);
            rule__SigConstruct__Group_2__7();

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
    // $ANTLR end "rule__SigConstruct__Group_2__6"


    // $ANTLR start "rule__SigConstruct__Group_2__6__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3892:1: rule__SigConstruct__Group_2__6__Impl : ( ( ruleSOMETHING )* ) ;
    public final void rule__SigConstruct__Group_2__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3896:1: ( ( ( ruleSOMETHING )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3897:1: ( ( ruleSOMETHING )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3897:1: ( ( ruleSOMETHING )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3898:1: ( ruleSOMETHING )*
            {
             before(grammarAccess.getSigConstructAccess().getSOMETHINGParserRuleCall_2_6()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3899:1: ( ruleSOMETHING )*
            loop46:
            do {
                int alt46=2;
                switch ( input.LA(1) ) {
                case 18:
                    {
                    int LA46_1 = input.LA(2);

                    if ( (LA46_1==EOF||(LA46_1>=RULE_SP && LA46_1<=RULE_INT)||(LA46_1>=14 && LA46_1<=18)||(LA46_1>=30 && LA46_1<=31)) ) {
                        alt46=1;
                    }


                    }
                    break;
                case 14:
                    {
                    int LA46_3 = input.LA(2);

                    if ( ((LA46_3>=RULE_CID && LA46_3<=RULE_ANY_OTHER)) ) {
                        alt46=1;
                    }


                    }
                    break;
                case RULE_SP:
                case RULE_ML_COMMENT:
                case RULE_ML2_COMMENT:
                case RULE_SL_COMMENT:
                case RULE_MULTIPLEDOT:
                case RULE_DOUBLEDOT:
                case RULE_CID:
                case RULE_ANY_OTHER:
                case RULE_INT:
                case 15:
                case 16:
                case 17:
                case 30:
                    {
                    alt46=1;
                    }
                    break;

                }

                switch (alt46) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3899:3: ruleSOMETHING
            	    {
            	    pushFollow(FOLLOW_ruleSOMETHING_in_rule__SigConstruct__Group_2__6__Impl8012);
            	    ruleSOMETHING();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

             after(grammarAccess.getSigConstructAccess().getSOMETHINGParserRuleCall_2_6()); 

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
    // $ANTLR end "rule__SigConstruct__Group_2__6__Impl"


    // $ANTLR start "rule__SigConstruct__Group_2__7"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3909:1: rule__SigConstruct__Group_2__7 : rule__SigConstruct__Group_2__7__Impl ;
    public final void rule__SigConstruct__Group_2__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3913:1: ( rule__SigConstruct__Group_2__7__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3914:2: rule__SigConstruct__Group_2__7__Impl
            {
            pushFollow(FOLLOW_rule__SigConstruct__Group_2__7__Impl_in_rule__SigConstruct__Group_2__78043);
            rule__SigConstruct__Group_2__7__Impl();

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
    // $ANTLR end "rule__SigConstruct__Group_2__7"


    // $ANTLR start "rule__SigConstruct__Group_2__7__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3920:1: rule__SigConstruct__Group_2__7__Impl : ( ( rule__SigConstruct__IncOptAssignment_2_7 )? ) ;
    public final void rule__SigConstruct__Group_2__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3924:1: ( ( ( rule__SigConstruct__IncOptAssignment_2_7 )? ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3925:1: ( ( rule__SigConstruct__IncOptAssignment_2_7 )? )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3925:1: ( ( rule__SigConstruct__IncOptAssignment_2_7 )? )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3926:1: ( rule__SigConstruct__IncOptAssignment_2_7 )?
            {
             before(grammarAccess.getSigConstructAccess().getIncOptAssignment_2_7()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3927:1: ( rule__SigConstruct__IncOptAssignment_2_7 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==18) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3927:2: rule__SigConstruct__IncOptAssignment_2_7
                    {
                    pushFollow(FOLLOW_rule__SigConstruct__IncOptAssignment_2_7_in_rule__SigConstruct__Group_2__7__Impl8070);
                    rule__SigConstruct__IncOptAssignment_2_7();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSigConstructAccess().getIncOptAssignment_2_7()); 

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
    // $ANTLR end "rule__SigConstruct__Group_2__7__Impl"


    // $ANTLR start "rule__SigConstruct__Group_3__0"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3953:1: rule__SigConstruct__Group_3__0 : rule__SigConstruct__Group_3__0__Impl rule__SigConstruct__Group_3__1 ;
    public final void rule__SigConstruct__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3957:1: ( rule__SigConstruct__Group_3__0__Impl rule__SigConstruct__Group_3__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3958:2: rule__SigConstruct__Group_3__0__Impl rule__SigConstruct__Group_3__1
            {
            pushFollow(FOLLOW_rule__SigConstruct__Group_3__0__Impl_in_rule__SigConstruct__Group_3__08117);
            rule__SigConstruct__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SigConstruct__Group_3__1_in_rule__SigConstruct__Group_3__08120);
            rule__SigConstruct__Group_3__1();

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
    // $ANTLR end "rule__SigConstruct__Group_3__0"


    // $ANTLR start "rule__SigConstruct__Group_3__0__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3965:1: rule__SigConstruct__Group_3__0__Impl : ( '%' ) ;
    public final void rule__SigConstruct__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3969:1: ( ( '%' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3970:1: ( '%' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3970:1: ( '%' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3971:1: '%'
            {
             before(grammarAccess.getSigConstructAccess().getPercentSignKeyword_3_0()); 
            match(input,18,FOLLOW_18_in_rule__SigConstruct__Group_3__0__Impl8148); 
             after(grammarAccess.getSigConstructAccess().getPercentSignKeyword_3_0()); 

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
    // $ANTLR end "rule__SigConstruct__Group_3__0__Impl"


    // $ANTLR start "rule__SigConstruct__Group_3__1"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3984:1: rule__SigConstruct__Group_3__1 : rule__SigConstruct__Group_3__1__Impl rule__SigConstruct__Group_3__2 ;
    public final void rule__SigConstruct__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3988:1: ( rule__SigConstruct__Group_3__1__Impl rule__SigConstruct__Group_3__2 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3989:2: rule__SigConstruct__Group_3__1__Impl rule__SigConstruct__Group_3__2
            {
            pushFollow(FOLLOW_rule__SigConstruct__Group_3__1__Impl_in_rule__SigConstruct__Group_3__18179);
            rule__SigConstruct__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SigConstruct__Group_3__2_in_rule__SigConstruct__Group_3__18182);
            rule__SigConstruct__Group_3__2();

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
    // $ANTLR end "rule__SigConstruct__Group_3__1"


    // $ANTLR start "rule__SigConstruct__Group_3__1__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3996:1: rule__SigConstruct__Group_3__1__Impl : ( ( rule__SigConstruct__TmpAssignment_3_1 ) ) ;
    public final void rule__SigConstruct__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4000:1: ( ( ( rule__SigConstruct__TmpAssignment_3_1 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4001:1: ( ( rule__SigConstruct__TmpAssignment_3_1 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4001:1: ( ( rule__SigConstruct__TmpAssignment_3_1 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4002:1: ( rule__SigConstruct__TmpAssignment_3_1 )
            {
             before(grammarAccess.getSigConstructAccess().getTmpAssignment_3_1()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4003:1: ( rule__SigConstruct__TmpAssignment_3_1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4003:2: rule__SigConstruct__TmpAssignment_3_1
            {
            pushFollow(FOLLOW_rule__SigConstruct__TmpAssignment_3_1_in_rule__SigConstruct__Group_3__1__Impl8209);
            rule__SigConstruct__TmpAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSigConstructAccess().getTmpAssignment_3_1()); 

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
    // $ANTLR end "rule__SigConstruct__Group_3__1__Impl"


    // $ANTLR start "rule__SigConstruct__Group_3__2"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4013:1: rule__SigConstruct__Group_3__2 : rule__SigConstruct__Group_3__2__Impl ;
    public final void rule__SigConstruct__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4017:1: ( rule__SigConstruct__Group_3__2__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4018:2: rule__SigConstruct__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__SigConstruct__Group_3__2__Impl_in_rule__SigConstruct__Group_3__28239);
            rule__SigConstruct__Group_3__2__Impl();

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
    // $ANTLR end "rule__SigConstruct__Group_3__2"


    // $ANTLR start "rule__SigConstruct__Group_3__2__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4024:1: rule__SigConstruct__Group_3__2__Impl : ( ( ruleSOMETHING )* ) ;
    public final void rule__SigConstruct__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4028:1: ( ( ( ruleSOMETHING )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4029:1: ( ( ruleSOMETHING )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4029:1: ( ( ruleSOMETHING )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4030:1: ( ruleSOMETHING )*
            {
             before(grammarAccess.getSigConstructAccess().getSOMETHINGParserRuleCall_3_2()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4031:1: ( ruleSOMETHING )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==14) ) {
                    int LA48_2 = input.LA(2);

                    if ( ((LA48_2>=RULE_CID && LA48_2<=RULE_ANY_OTHER)) ) {
                        alt48=1;
                    }


                }
                else if ( ((LA48_0>=RULE_SP && LA48_0<=RULE_INT)||(LA48_0>=15 && LA48_0<=18)||LA48_0==30) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4031:3: ruleSOMETHING
            	    {
            	    pushFollow(FOLLOW_ruleSOMETHING_in_rule__SigConstruct__Group_3__2__Impl8267);
            	    ruleSOMETHING();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

             after(grammarAccess.getSigConstructAccess().getSOMETHINGParserRuleCall_3_2()); 

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
    // $ANTLR end "rule__SigConstruct__Group_3__2__Impl"


    // $ANTLR start "rule__IncludeOps__Group__0"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4047:1: rule__IncludeOps__Group__0 : rule__IncludeOps__Group__0__Impl rule__IncludeOps__Group__1 ;
    public final void rule__IncludeOps__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4051:1: ( rule__IncludeOps__Group__0__Impl rule__IncludeOps__Group__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4052:2: rule__IncludeOps__Group__0__Impl rule__IncludeOps__Group__1
            {
            pushFollow(FOLLOW_rule__IncludeOps__Group__0__Impl_in_rule__IncludeOps__Group__08304);
            rule__IncludeOps__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IncludeOps__Group__1_in_rule__IncludeOps__Group__08307);
            rule__IncludeOps__Group__1();

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
    // $ANTLR end "rule__IncludeOps__Group__0"


    // $ANTLR start "rule__IncludeOps__Group__0__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4059:1: rule__IncludeOps__Group__0__Impl : ( '%' ) ;
    public final void rule__IncludeOps__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4063:1: ( ( '%' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4064:1: ( '%' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4064:1: ( '%' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4065:1: '%'
            {
             before(grammarAccess.getIncludeOpsAccess().getPercentSignKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__IncludeOps__Group__0__Impl8335); 
             after(grammarAccess.getIncludeOpsAccess().getPercentSignKeyword_0()); 

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
    // $ANTLR end "rule__IncludeOps__Group__0__Impl"


    // $ANTLR start "rule__IncludeOps__Group__1"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4078:1: rule__IncludeOps__Group__1 : rule__IncludeOps__Group__1__Impl rule__IncludeOps__Group__2 ;
    public final void rule__IncludeOps__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4082:1: ( rule__IncludeOps__Group__1__Impl rule__IncludeOps__Group__2 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4083:2: rule__IncludeOps__Group__1__Impl rule__IncludeOps__Group__2
            {
            pushFollow(FOLLOW_rule__IncludeOps__Group__1__Impl_in_rule__IncludeOps__Group__18366);
            rule__IncludeOps__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IncludeOps__Group__2_in_rule__IncludeOps__Group__18369);
            rule__IncludeOps__Group__2();

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
    // $ANTLR end "rule__IncludeOps__Group__1"


    // $ANTLR start "rule__IncludeOps__Group__1__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4090:1: rule__IncludeOps__Group__1__Impl : ( 'open' ) ;
    public final void rule__IncludeOps__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4094:1: ( ( 'open' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4095:1: ( 'open' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4095:1: ( 'open' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4096:1: 'open'
            {
             before(grammarAccess.getIncludeOpsAccess().getOpenKeyword_1()); 
            match(input,35,FOLLOW_35_in_rule__IncludeOps__Group__1__Impl8397); 
             after(grammarAccess.getIncludeOpsAccess().getOpenKeyword_1()); 

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
    // $ANTLR end "rule__IncludeOps__Group__1__Impl"


    // $ANTLR start "rule__IncludeOps__Group__2"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4109:1: rule__IncludeOps__Group__2 : rule__IncludeOps__Group__2__Impl ;
    public final void rule__IncludeOps__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4113:1: ( rule__IncludeOps__Group__2__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4114:2: rule__IncludeOps__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__IncludeOps__Group__2__Impl_in_rule__IncludeOps__Group__28428);
            rule__IncludeOps__Group__2__Impl();

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
    // $ANTLR end "rule__IncludeOps__Group__2"


    // $ANTLR start "rule__IncludeOps__Group__2__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4120:1: rule__IncludeOps__Group__2__Impl : ( ( ruleSOMETHING )* ) ;
    public final void rule__IncludeOps__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4124:1: ( ( ( ruleSOMETHING )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4125:1: ( ( ruleSOMETHING )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4125:1: ( ( ruleSOMETHING )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4126:1: ( ruleSOMETHING )*
            {
             before(grammarAccess.getIncludeOpsAccess().getSOMETHINGParserRuleCall_2()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4127:1: ( ruleSOMETHING )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==14) ) {
                    int LA49_2 = input.LA(2);

                    if ( ((LA49_2>=RULE_CID && LA49_2<=RULE_ANY_OTHER)) ) {
                        alt49=1;
                    }


                }
                else if ( ((LA49_0>=RULE_SP && LA49_0<=RULE_INT)||(LA49_0>=15 && LA49_0<=18)||LA49_0==30) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4127:3: ruleSOMETHING
            	    {
            	    pushFollow(FOLLOW_ruleSOMETHING_in_rule__IncludeOps__Group__2__Impl8456);
            	    ruleSOMETHING();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

             after(grammarAccess.getIncludeOpsAccess().getSOMETHINGParserRuleCall_2()); 

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
    // $ANTLR end "rule__IncludeOps__Group__2__Impl"


    // $ANTLR start "rule__ViewDeclaration__Group__0"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4143:1: rule__ViewDeclaration__Group__0 : rule__ViewDeclaration__Group__0__Impl rule__ViewDeclaration__Group__1 ;
    public final void rule__ViewDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4147:1: ( rule__ViewDeclaration__Group__0__Impl rule__ViewDeclaration__Group__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4148:2: rule__ViewDeclaration__Group__0__Impl rule__ViewDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__Group__0__Impl_in_rule__ViewDeclaration__Group__08493);
            rule__ViewDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ViewDeclaration__Group__1_in_rule__ViewDeclaration__Group__08496);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4155:1: rule__ViewDeclaration__Group__0__Impl : ( '%' ) ;
    public final void rule__ViewDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4159:1: ( ( '%' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4160:1: ( '%' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4160:1: ( '%' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4161:1: '%'
            {
             before(grammarAccess.getViewDeclarationAccess().getPercentSignKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__ViewDeclaration__Group__0__Impl8524); 
             after(grammarAccess.getViewDeclarationAccess().getPercentSignKeyword_0()); 

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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4174:1: rule__ViewDeclaration__Group__1 : rule__ViewDeclaration__Group__1__Impl rule__ViewDeclaration__Group__2 ;
    public final void rule__ViewDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4178:1: ( rule__ViewDeclaration__Group__1__Impl rule__ViewDeclaration__Group__2 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4179:2: rule__ViewDeclaration__Group__1__Impl rule__ViewDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__Group__1__Impl_in_rule__ViewDeclaration__Group__18555);
            rule__ViewDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ViewDeclaration__Group__2_in_rule__ViewDeclaration__Group__18558);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4186:1: rule__ViewDeclaration__Group__1__Impl : ( 'view' ) ;
    public final void rule__ViewDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4190:1: ( ( 'view' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4191:1: ( 'view' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4191:1: ( 'view' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4192:1: 'view'
            {
             before(grammarAccess.getViewDeclarationAccess().getViewKeyword_1()); 
            match(input,36,FOLLOW_36_in_rule__ViewDeclaration__Group__1__Impl8586); 
             after(grammarAccess.getViewDeclarationAccess().getViewKeyword_1()); 

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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4205:1: rule__ViewDeclaration__Group__2 : rule__ViewDeclaration__Group__2__Impl rule__ViewDeclaration__Group__3 ;
    public final void rule__ViewDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4209:1: ( rule__ViewDeclaration__Group__2__Impl rule__ViewDeclaration__Group__3 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4210:2: rule__ViewDeclaration__Group__2__Impl rule__ViewDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__Group__2__Impl_in_rule__ViewDeclaration__Group__28617);
            rule__ViewDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ViewDeclaration__Group__3_in_rule__ViewDeclaration__Group__28620);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4217:1: rule__ViewDeclaration__Group__2__Impl : ( ( ( ruleWS ) ) ( ( ruleWS )* ) ) ;
    public final void rule__ViewDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4221:1: ( ( ( ( ruleWS ) ) ( ( ruleWS )* ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4222:1: ( ( ( ruleWS ) ) ( ( ruleWS )* ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4222:1: ( ( ( ruleWS ) ) ( ( ruleWS )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4223:1: ( ( ruleWS ) ) ( ( ruleWS )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4223:1: ( ( ruleWS ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4224:1: ( ruleWS )
            {
             before(grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_2()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4225:1: ( ruleWS )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4225:3: ruleWS
            {
            pushFollow(FOLLOW_ruleWS_in_rule__ViewDeclaration__Group__2__Impl8650);
            ruleWS();

            state._fsp--;


            }

             after(grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_2()); 

            }

            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4228:1: ( ( ruleWS )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4229:1: ( ruleWS )*
            {
             before(grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_2()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4230:1: ( ruleWS )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( ((LA50_0>=RULE_SP && LA50_0<=RULE_SL_COMMENT)) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4230:3: ruleWS
            	    {
            	    pushFollow(FOLLOW_ruleWS_in_rule__ViewDeclaration__Group__2__Impl8663);
            	    ruleWS();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

             after(grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_2()); 

            }


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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4241:1: rule__ViewDeclaration__Group__3 : rule__ViewDeclaration__Group__3__Impl rule__ViewDeclaration__Group__4 ;
    public final void rule__ViewDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4245:1: ( rule__ViewDeclaration__Group__3__Impl rule__ViewDeclaration__Group__4 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4246:2: rule__ViewDeclaration__Group__3__Impl rule__ViewDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__Group__3__Impl_in_rule__ViewDeclaration__Group__38696);
            rule__ViewDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ViewDeclaration__Group__4_in_rule__ViewDeclaration__Group__38699);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4253:1: rule__ViewDeclaration__Group__3__Impl : ( ( rule__ViewDeclaration__ViewIDAssignment_3 ) ) ;
    public final void rule__ViewDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4257:1: ( ( ( rule__ViewDeclaration__ViewIDAssignment_3 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4258:1: ( ( rule__ViewDeclaration__ViewIDAssignment_3 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4258:1: ( ( rule__ViewDeclaration__ViewIDAssignment_3 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4259:1: ( rule__ViewDeclaration__ViewIDAssignment_3 )
            {
             before(grammarAccess.getViewDeclarationAccess().getViewIDAssignment_3()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4260:1: ( rule__ViewDeclaration__ViewIDAssignment_3 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4260:2: rule__ViewDeclaration__ViewIDAssignment_3
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__ViewIDAssignment_3_in_rule__ViewDeclaration__Group__3__Impl8726);
            rule__ViewDeclaration__ViewIDAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getViewDeclarationAccess().getViewIDAssignment_3()); 

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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4270:1: rule__ViewDeclaration__Group__4 : rule__ViewDeclaration__Group__4__Impl rule__ViewDeclaration__Group__5 ;
    public final void rule__ViewDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4274:1: ( rule__ViewDeclaration__Group__4__Impl rule__ViewDeclaration__Group__5 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4275:2: rule__ViewDeclaration__Group__4__Impl rule__ViewDeclaration__Group__5
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__Group__4__Impl_in_rule__ViewDeclaration__Group__48756);
            rule__ViewDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ViewDeclaration__Group__5_in_rule__ViewDeclaration__Group__48759);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4282:1: rule__ViewDeclaration__Group__4__Impl : ( ( ruleWS )* ) ;
    public final void rule__ViewDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4286:1: ( ( ( ruleWS )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4287:1: ( ( ruleWS )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4287:1: ( ( ruleWS )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4288:1: ( ruleWS )*
            {
             before(grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_4()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4289:1: ( ruleWS )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( ((LA51_0>=RULE_SP && LA51_0<=RULE_SL_COMMENT)) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4289:3: ruleWS
            	    {
            	    pushFollow(FOLLOW_ruleWS_in_rule__ViewDeclaration__Group__4__Impl8787);
            	    ruleWS();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

             after(grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_4()); 

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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4299:1: rule__ViewDeclaration__Group__5 : rule__ViewDeclaration__Group__5__Impl rule__ViewDeclaration__Group__6 ;
    public final void rule__ViewDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4303:1: ( rule__ViewDeclaration__Group__5__Impl rule__ViewDeclaration__Group__6 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4304:2: rule__ViewDeclaration__Group__5__Impl rule__ViewDeclaration__Group__6
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__Group__5__Impl_in_rule__ViewDeclaration__Group__58818);
            rule__ViewDeclaration__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ViewDeclaration__Group__6_in_rule__ViewDeclaration__Group__58821);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4311:1: rule__ViewDeclaration__Group__5__Impl : ( ':' ) ;
    public final void rule__ViewDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4315:1: ( ( ':' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4316:1: ( ':' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4316:1: ( ':' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4317:1: ':'
            {
             before(grammarAccess.getViewDeclarationAccess().getColonKeyword_5()); 
            match(input,15,FOLLOW_15_in_rule__ViewDeclaration__Group__5__Impl8849); 
             after(grammarAccess.getViewDeclarationAccess().getColonKeyword_5()); 

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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4330:1: rule__ViewDeclaration__Group__6 : rule__ViewDeclaration__Group__6__Impl rule__ViewDeclaration__Group__7 ;
    public final void rule__ViewDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4334:1: ( rule__ViewDeclaration__Group__6__Impl rule__ViewDeclaration__Group__7 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4335:2: rule__ViewDeclaration__Group__6__Impl rule__ViewDeclaration__Group__7
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__Group__6__Impl_in_rule__ViewDeclaration__Group__68880);
            rule__ViewDeclaration__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ViewDeclaration__Group__7_in_rule__ViewDeclaration__Group__68883);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4342:1: rule__ViewDeclaration__Group__6__Impl : ( ( ruleWS )* ) ;
    public final void rule__ViewDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4346:1: ( ( ( ruleWS )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4347:1: ( ( ruleWS )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4347:1: ( ( ruleWS )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4348:1: ( ruleWS )*
            {
             before(grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_6()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4349:1: ( ruleWS )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( ((LA52_0>=RULE_SP && LA52_0<=RULE_SL_COMMENT)) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4349:3: ruleWS
            	    {
            	    pushFollow(FOLLOW_ruleWS_in_rule__ViewDeclaration__Group__6__Impl8911);
            	    ruleWS();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

             after(grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_6()); 

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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4359:1: rule__ViewDeclaration__Group__7 : rule__ViewDeclaration__Group__7__Impl rule__ViewDeclaration__Group__8 ;
    public final void rule__ViewDeclaration__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4363:1: ( rule__ViewDeclaration__Group__7__Impl rule__ViewDeclaration__Group__8 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4364:2: rule__ViewDeclaration__Group__7__Impl rule__ViewDeclaration__Group__8
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__Group__7__Impl_in_rule__ViewDeclaration__Group__78942);
            rule__ViewDeclaration__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ViewDeclaration__Group__8_in_rule__ViewDeclaration__Group__78945);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4371:1: rule__ViewDeclaration__Group__7__Impl : ( ( rule__ViewDeclaration__FromAssignment_7 ) ) ;
    public final void rule__ViewDeclaration__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4375:1: ( ( ( rule__ViewDeclaration__FromAssignment_7 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4376:1: ( ( rule__ViewDeclaration__FromAssignment_7 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4376:1: ( ( rule__ViewDeclaration__FromAssignment_7 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4377:1: ( rule__ViewDeclaration__FromAssignment_7 )
            {
             before(grammarAccess.getViewDeclarationAccess().getFromAssignment_7()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4378:1: ( rule__ViewDeclaration__FromAssignment_7 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4378:2: rule__ViewDeclaration__FromAssignment_7
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__FromAssignment_7_in_rule__ViewDeclaration__Group__7__Impl8972);
            rule__ViewDeclaration__FromAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getViewDeclarationAccess().getFromAssignment_7()); 

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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4388:1: rule__ViewDeclaration__Group__8 : rule__ViewDeclaration__Group__8__Impl rule__ViewDeclaration__Group__9 ;
    public final void rule__ViewDeclaration__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4392:1: ( rule__ViewDeclaration__Group__8__Impl rule__ViewDeclaration__Group__9 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4393:2: rule__ViewDeclaration__Group__8__Impl rule__ViewDeclaration__Group__9
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__Group__8__Impl_in_rule__ViewDeclaration__Group__89002);
            rule__ViewDeclaration__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ViewDeclaration__Group__9_in_rule__ViewDeclaration__Group__89005);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4400:1: rule__ViewDeclaration__Group__8__Impl : ( ( ruleWS )* ) ;
    public final void rule__ViewDeclaration__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4404:1: ( ( ( ruleWS )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4405:1: ( ( ruleWS )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4405:1: ( ( ruleWS )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4406:1: ( ruleWS )*
            {
             before(grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_8()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4407:1: ( ruleWS )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( ((LA53_0>=RULE_SP && LA53_0<=RULE_SL_COMMENT)) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4407:3: ruleWS
            	    {
            	    pushFollow(FOLLOW_ruleWS_in_rule__ViewDeclaration__Group__8__Impl9033);
            	    ruleWS();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

             after(grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_8()); 

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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4417:1: rule__ViewDeclaration__Group__9 : rule__ViewDeclaration__Group__9__Impl rule__ViewDeclaration__Group__10 ;
    public final void rule__ViewDeclaration__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4421:1: ( rule__ViewDeclaration__Group__9__Impl rule__ViewDeclaration__Group__10 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4422:2: rule__ViewDeclaration__Group__9__Impl rule__ViewDeclaration__Group__10
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__Group__9__Impl_in_rule__ViewDeclaration__Group__99064);
            rule__ViewDeclaration__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ViewDeclaration__Group__10_in_rule__ViewDeclaration__Group__99067);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4429:1: rule__ViewDeclaration__Group__9__Impl : ( '->' ) ;
    public final void rule__ViewDeclaration__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4433:1: ( ( '->' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4434:1: ( '->' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4434:1: ( '->' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4435:1: '->'
            {
             before(grammarAccess.getViewDeclarationAccess().getHyphenMinusGreaterThanSignKeyword_9()); 
            match(input,17,FOLLOW_17_in_rule__ViewDeclaration__Group__9__Impl9095); 
             after(grammarAccess.getViewDeclarationAccess().getHyphenMinusGreaterThanSignKeyword_9()); 

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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4448:1: rule__ViewDeclaration__Group__10 : rule__ViewDeclaration__Group__10__Impl rule__ViewDeclaration__Group__11 ;
    public final void rule__ViewDeclaration__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4452:1: ( rule__ViewDeclaration__Group__10__Impl rule__ViewDeclaration__Group__11 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4453:2: rule__ViewDeclaration__Group__10__Impl rule__ViewDeclaration__Group__11
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__Group__10__Impl_in_rule__ViewDeclaration__Group__109126);
            rule__ViewDeclaration__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ViewDeclaration__Group__11_in_rule__ViewDeclaration__Group__109129);
            rule__ViewDeclaration__Group__11();

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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4460:1: rule__ViewDeclaration__Group__10__Impl : ( ( ruleWS )* ) ;
    public final void rule__ViewDeclaration__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4464:1: ( ( ( ruleWS )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4465:1: ( ( ruleWS )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4465:1: ( ( ruleWS )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4466:1: ( ruleWS )*
            {
             before(grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_10()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4467:1: ( ruleWS )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( ((LA54_0>=RULE_SP && LA54_0<=RULE_SL_COMMENT)) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4467:3: ruleWS
            	    {
            	    pushFollow(FOLLOW_ruleWS_in_rule__ViewDeclaration__Group__10__Impl9157);
            	    ruleWS();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

             after(grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_10()); 

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


    // $ANTLR start "rule__ViewDeclaration__Group__11"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4477:1: rule__ViewDeclaration__Group__11 : rule__ViewDeclaration__Group__11__Impl rule__ViewDeclaration__Group__12 ;
    public final void rule__ViewDeclaration__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4481:1: ( rule__ViewDeclaration__Group__11__Impl rule__ViewDeclaration__Group__12 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4482:2: rule__ViewDeclaration__Group__11__Impl rule__ViewDeclaration__Group__12
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__Group__11__Impl_in_rule__ViewDeclaration__Group__119188);
            rule__ViewDeclaration__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ViewDeclaration__Group__12_in_rule__ViewDeclaration__Group__119191);
            rule__ViewDeclaration__Group__12();

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
    // $ANTLR end "rule__ViewDeclaration__Group__11"


    // $ANTLR start "rule__ViewDeclaration__Group__11__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4489:1: rule__ViewDeclaration__Group__11__Impl : ( ( rule__ViewDeclaration__ToAssignment_11 ) ) ;
    public final void rule__ViewDeclaration__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4493:1: ( ( ( rule__ViewDeclaration__ToAssignment_11 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4494:1: ( ( rule__ViewDeclaration__ToAssignment_11 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4494:1: ( ( rule__ViewDeclaration__ToAssignment_11 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4495:1: ( rule__ViewDeclaration__ToAssignment_11 )
            {
             before(grammarAccess.getViewDeclarationAccess().getToAssignment_11()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4496:1: ( rule__ViewDeclaration__ToAssignment_11 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4496:2: rule__ViewDeclaration__ToAssignment_11
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__ToAssignment_11_in_rule__ViewDeclaration__Group__11__Impl9218);
            rule__ViewDeclaration__ToAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getViewDeclarationAccess().getToAssignment_11()); 

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
    // $ANTLR end "rule__ViewDeclaration__Group__11__Impl"


    // $ANTLR start "rule__ViewDeclaration__Group__12"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4506:1: rule__ViewDeclaration__Group__12 : rule__ViewDeclaration__Group__12__Impl rule__ViewDeclaration__Group__13 ;
    public final void rule__ViewDeclaration__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4510:1: ( rule__ViewDeclaration__Group__12__Impl rule__ViewDeclaration__Group__13 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4511:2: rule__ViewDeclaration__Group__12__Impl rule__ViewDeclaration__Group__13
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__Group__12__Impl_in_rule__ViewDeclaration__Group__129248);
            rule__ViewDeclaration__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ViewDeclaration__Group__13_in_rule__ViewDeclaration__Group__129251);
            rule__ViewDeclaration__Group__13();

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
    // $ANTLR end "rule__ViewDeclaration__Group__12"


    // $ANTLR start "rule__ViewDeclaration__Group__12__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4518:1: rule__ViewDeclaration__Group__12__Impl : ( ( ruleWS )* ) ;
    public final void rule__ViewDeclaration__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4522:1: ( ( ( ruleWS )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4523:1: ( ( ruleWS )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4523:1: ( ( ruleWS )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4524:1: ( ruleWS )*
            {
             before(grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_12()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4525:1: ( ruleWS )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( ((LA55_0>=RULE_SP && LA55_0<=RULE_SL_COMMENT)) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4525:3: ruleWS
            	    {
            	    pushFollow(FOLLOW_ruleWS_in_rule__ViewDeclaration__Group__12__Impl9279);
            	    ruleWS();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

             after(grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_12()); 

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
    // $ANTLR end "rule__ViewDeclaration__Group__12__Impl"


    // $ANTLR start "rule__ViewDeclaration__Group__13"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4535:1: rule__ViewDeclaration__Group__13 : rule__ViewDeclaration__Group__13__Impl rule__ViewDeclaration__Group__14 ;
    public final void rule__ViewDeclaration__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4539:1: ( rule__ViewDeclaration__Group__13__Impl rule__ViewDeclaration__Group__14 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4540:2: rule__ViewDeclaration__Group__13__Impl rule__ViewDeclaration__Group__14
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__Group__13__Impl_in_rule__ViewDeclaration__Group__139310);
            rule__ViewDeclaration__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ViewDeclaration__Group__14_in_rule__ViewDeclaration__Group__139313);
            rule__ViewDeclaration__Group__14();

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
    // $ANTLR end "rule__ViewDeclaration__Group__13"


    // $ANTLR start "rule__ViewDeclaration__Group__13__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4547:1: rule__ViewDeclaration__Group__13__Impl : ( '=' ) ;
    public final void rule__ViewDeclaration__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4551:1: ( ( '=' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4552:1: ( '=' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4552:1: ( '=' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4553:1: '='
            {
             before(grammarAccess.getViewDeclarationAccess().getEqualsSignKeyword_13()); 
            match(input,16,FOLLOW_16_in_rule__ViewDeclaration__Group__13__Impl9341); 
             after(grammarAccess.getViewDeclarationAccess().getEqualsSignKeyword_13()); 

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
    // $ANTLR end "rule__ViewDeclaration__Group__13__Impl"


    // $ANTLR start "rule__ViewDeclaration__Group__14"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4566:1: rule__ViewDeclaration__Group__14 : rule__ViewDeclaration__Group__14__Impl rule__ViewDeclaration__Group__15 ;
    public final void rule__ViewDeclaration__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4570:1: ( rule__ViewDeclaration__Group__14__Impl rule__ViewDeclaration__Group__15 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4571:2: rule__ViewDeclaration__Group__14__Impl rule__ViewDeclaration__Group__15
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__Group__14__Impl_in_rule__ViewDeclaration__Group__149372);
            rule__ViewDeclaration__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ViewDeclaration__Group__15_in_rule__ViewDeclaration__Group__149375);
            rule__ViewDeclaration__Group__15();

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
    // $ANTLR end "rule__ViewDeclaration__Group__14"


    // $ANTLR start "rule__ViewDeclaration__Group__14__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4578:1: rule__ViewDeclaration__Group__14__Impl : ( ( ruleWS )* ) ;
    public final void rule__ViewDeclaration__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4582:1: ( ( ( ruleWS )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4583:1: ( ( ruleWS )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4583:1: ( ( ruleWS )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4584:1: ( ruleWS )*
            {
             before(grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_14()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4585:1: ( ruleWS )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( ((LA56_0>=RULE_SP && LA56_0<=RULE_SL_COMMENT)) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4585:3: ruleWS
            	    {
            	    pushFollow(FOLLOW_ruleWS_in_rule__ViewDeclaration__Group__14__Impl9403);
            	    ruleWS();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

             after(grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_14()); 

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
    // $ANTLR end "rule__ViewDeclaration__Group__14__Impl"


    // $ANTLR start "rule__ViewDeclaration__Group__15"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4595:1: rule__ViewDeclaration__Group__15 : rule__ViewDeclaration__Group__15__Impl rule__ViewDeclaration__Group__16 ;
    public final void rule__ViewDeclaration__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4599:1: ( rule__ViewDeclaration__Group__15__Impl rule__ViewDeclaration__Group__16 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4600:2: rule__ViewDeclaration__Group__15__Impl rule__ViewDeclaration__Group__16
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__Group__15__Impl_in_rule__ViewDeclaration__Group__159434);
            rule__ViewDeclaration__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ViewDeclaration__Group__16_in_rule__ViewDeclaration__Group__159437);
            rule__ViewDeclaration__Group__16();

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
    // $ANTLR end "rule__ViewDeclaration__Group__15"


    // $ANTLR start "rule__ViewDeclaration__Group__15__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4607:1: rule__ViewDeclaration__Group__15__Impl : ( ( rule__ViewDeclaration__ViewDefsAssignment_15 ) ) ;
    public final void rule__ViewDeclaration__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4611:1: ( ( ( rule__ViewDeclaration__ViewDefsAssignment_15 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4612:1: ( ( rule__ViewDeclaration__ViewDefsAssignment_15 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4612:1: ( ( rule__ViewDeclaration__ViewDefsAssignment_15 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4613:1: ( rule__ViewDeclaration__ViewDefsAssignment_15 )
            {
             before(grammarAccess.getViewDeclarationAccess().getViewDefsAssignment_15()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4614:1: ( rule__ViewDeclaration__ViewDefsAssignment_15 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4614:2: rule__ViewDeclaration__ViewDefsAssignment_15
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__ViewDefsAssignment_15_in_rule__ViewDeclaration__Group__15__Impl9464);
            rule__ViewDeclaration__ViewDefsAssignment_15();

            state._fsp--;


            }

             after(grammarAccess.getViewDeclarationAccess().getViewDefsAssignment_15()); 

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
    // $ANTLR end "rule__ViewDeclaration__Group__15__Impl"


    // $ANTLR start "rule__ViewDeclaration__Group__16"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4624:1: rule__ViewDeclaration__Group__16 : rule__ViewDeclaration__Group__16__Impl rule__ViewDeclaration__Group__17 ;
    public final void rule__ViewDeclaration__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4628:1: ( rule__ViewDeclaration__Group__16__Impl rule__ViewDeclaration__Group__17 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4629:2: rule__ViewDeclaration__Group__16__Impl rule__ViewDeclaration__Group__17
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__Group__16__Impl_in_rule__ViewDeclaration__Group__169494);
            rule__ViewDeclaration__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ViewDeclaration__Group__17_in_rule__ViewDeclaration__Group__169497);
            rule__ViewDeclaration__Group__17();

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
    // $ANTLR end "rule__ViewDeclaration__Group__16"


    // $ANTLR start "rule__ViewDeclaration__Group__16__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4636:1: rule__ViewDeclaration__Group__16__Impl : ( ( ruleWS )* ) ;
    public final void rule__ViewDeclaration__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4640:1: ( ( ( ruleWS )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4641:1: ( ( ruleWS )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4641:1: ( ( ruleWS )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4642:1: ( ruleWS )*
            {
             before(grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_16()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4643:1: ( ruleWS )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( ((LA57_0>=RULE_SP && LA57_0<=RULE_SL_COMMENT)) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4643:3: ruleWS
            	    {
            	    pushFollow(FOLLOW_ruleWS_in_rule__ViewDeclaration__Group__16__Impl9525);
            	    ruleWS();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

             after(grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_16()); 

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
    // $ANTLR end "rule__ViewDeclaration__Group__16__Impl"


    // $ANTLR start "rule__ViewDeclaration__Group__17"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4653:1: rule__ViewDeclaration__Group__17 : rule__ViewDeclaration__Group__17__Impl rule__ViewDeclaration__Group__18 ;
    public final void rule__ViewDeclaration__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4657:1: ( rule__ViewDeclaration__Group__17__Impl rule__ViewDeclaration__Group__18 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4658:2: rule__ViewDeclaration__Group__17__Impl rule__ViewDeclaration__Group__18
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__Group__17__Impl_in_rule__ViewDeclaration__Group__179556);
            rule__ViewDeclaration__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ViewDeclaration__Group__18_in_rule__ViewDeclaration__Group__179559);
            rule__ViewDeclaration__Group__18();

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
    // $ANTLR end "rule__ViewDeclaration__Group__17"


    // $ANTLR start "rule__ViewDeclaration__Group__17__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4665:1: rule__ViewDeclaration__Group__17__Impl : ( '.' ) ;
    public final void rule__ViewDeclaration__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4669:1: ( ( '.' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4670:1: ( '.' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4670:1: ( '.' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4671:1: '.'
            {
             before(grammarAccess.getViewDeclarationAccess().getFullStopKeyword_17()); 
            match(input,14,FOLLOW_14_in_rule__ViewDeclaration__Group__17__Impl9587); 
             after(grammarAccess.getViewDeclarationAccess().getFullStopKeyword_17()); 

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
    // $ANTLR end "rule__ViewDeclaration__Group__17__Impl"


    // $ANTLR start "rule__ViewDeclaration__Group__18"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4684:1: rule__ViewDeclaration__Group__18 : rule__ViewDeclaration__Group__18__Impl ;
    public final void rule__ViewDeclaration__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4688:1: ( rule__ViewDeclaration__Group__18__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4689:2: rule__ViewDeclaration__Group__18__Impl
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__Group__18__Impl_in_rule__ViewDeclaration__Group__189618);
            rule__ViewDeclaration__Group__18__Impl();

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
    // $ANTLR end "rule__ViewDeclaration__Group__18"


    // $ANTLR start "rule__ViewDeclaration__Group__18__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4695:1: rule__ViewDeclaration__Group__18__Impl : ( ruleWS ) ;
    public final void rule__ViewDeclaration__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4699:1: ( ( ruleWS ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4700:1: ( ruleWS )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4700:1: ( ruleWS )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4701:1: ruleWS
            {
             before(grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_18()); 
            pushFollow(FOLLOW_ruleWS_in_rule__ViewDeclaration__Group__18__Impl9645);
            ruleWS();

            state._fsp--;

             after(grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_18()); 

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
    // $ANTLR end "rule__ViewDeclaration__Group__18__Impl"


    // $ANTLR start "rule__Model__DeclarationsAssignment"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4751:1: rule__Model__DeclarationsAssignment : ( ( rule__Model__DeclarationsAlternatives_0 ) ) ;
    public final void rule__Model__DeclarationsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4755:1: ( ( ( rule__Model__DeclarationsAlternatives_0 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4756:1: ( ( rule__Model__DeclarationsAlternatives_0 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4756:1: ( ( rule__Model__DeclarationsAlternatives_0 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4757:1: ( rule__Model__DeclarationsAlternatives_0 )
            {
             before(grammarAccess.getModelAccess().getDeclarationsAlternatives_0()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4758:1: ( rule__Model__DeclarationsAlternatives_0 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4758:2: rule__Model__DeclarationsAlternatives_0
            {
            pushFollow(FOLLOW_rule__Model__DeclarationsAlternatives_0_in_rule__Model__DeclarationsAssignment9717);
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


    // $ANTLR start "rule__JUSTSPACE__JAssignment"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4767:1: rule__JUSTSPACE__JAssignment : ( ruleWS ) ;
    public final void rule__JUSTSPACE__JAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4771:1: ( ( ruleWS ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4772:1: ( ruleWS )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4772:1: ( ruleWS )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4773:1: ruleWS
            {
             before(grammarAccess.getJUSTSPACEAccess().getJWSParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleWS_in_rule__JUSTSPACE__JAssignment9750);
            ruleWS();

            state._fsp--;

             after(grammarAccess.getJUSTSPACEAccess().getJWSParserRuleCall_0()); 

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
    // $ANTLR end "rule__JUSTSPACE__JAssignment"


    // $ANTLR start "rule__NamespaceDeclaration__NameAssignment_3_0"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4782:1: rule__NamespaceDeclaration__NameAssignment_3_0 : ( RULE_CID ) ;
    public final void rule__NamespaceDeclaration__NameAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4786:1: ( ( RULE_CID ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4787:1: ( RULE_CID )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4787:1: ( RULE_CID )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4788:1: RULE_CID
            {
             before(grammarAccess.getNamespaceDeclarationAccess().getNameCIDTerminalRuleCall_3_0_0()); 
            match(input,RULE_CID,FOLLOW_RULE_CID_in_rule__NamespaceDeclaration__NameAssignment_3_09781); 
             after(grammarAccess.getNamespaceDeclarationAccess().getNameCIDTerminalRuleCall_3_0_0()); 

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
    // $ANTLR end "rule__NamespaceDeclaration__NameAssignment_3_0"


    // $ANTLR start "rule__NamespaceDeclaration__UriAssignment_4"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4797:1: rule__NamespaceDeclaration__UriAssignment_4 : ( ruleURISTRING ) ;
    public final void rule__NamespaceDeclaration__UriAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4801:1: ( ( ruleURISTRING ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4802:1: ( ruleURISTRING )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4802:1: ( ruleURISTRING )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4803:1: ruleURISTRING
            {
             before(grammarAccess.getNamespaceDeclarationAccess().getUriURISTRINGParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleURISTRING_in_rule__NamespaceDeclaration__UriAssignment_49812);
            ruleURISTRING();

            state._fsp--;

             after(grammarAccess.getNamespaceDeclarationAccess().getUriURISTRINGParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__NamespaceDeclaration__UriAssignment_4"


    // $ANTLR start "rule__ReadDeclaration__FileAssignment_3"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4812:1: rule__ReadDeclaration__FileAssignment_3 : ( ruleURISTRING ) ;
    public final void rule__ReadDeclaration__FileAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4816:1: ( ( ruleURISTRING ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4817:1: ( ruleURISTRING )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4817:1: ( ruleURISTRING )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4818:1: ruleURISTRING
            {
             before(grammarAccess.getReadDeclarationAccess().getFileURISTRINGParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleURISTRING_in_rule__ReadDeclaration__FileAssignment_39843);
            ruleURISTRING();

            state._fsp--;

             after(grammarAccess.getReadDeclarationAccess().getFileURISTRINGParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__ReadDeclaration__FileAssignment_3"


    // $ANTLR start "rule__SignatureDeclaration__SigNameAssignment_3"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4827:1: rule__SignatureDeclaration__SigNameAssignment_3 : ( ruleGID ) ;
    public final void rule__SignatureDeclaration__SigNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4831:1: ( ( ruleGID ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4832:1: ( ruleGID )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4832:1: ( ruleGID )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4833:1: ruleGID
            {
             before(grammarAccess.getSignatureDeclarationAccess().getSigNameGIDParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleGID_in_rule__SignatureDeclaration__SigNameAssignment_39874);
            ruleGID();

            state._fsp--;

             after(grammarAccess.getSignatureDeclarationAccess().getSigNameGIDParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__SignatureDeclaration__SigNameAssignment_3"


    // $ANTLR start "rule__SignatureDeclaration__DefsAssignment_7"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4842:1: rule__SignatureDeclaration__DefsAssignment_7 : ( rulesigDefinitions ) ;
    public final void rule__SignatureDeclaration__DefsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4846:1: ( ( rulesigDefinitions ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4847:1: ( rulesigDefinitions )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4847:1: ( rulesigDefinitions )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4848:1: rulesigDefinitions
            {
             before(grammarAccess.getSignatureDeclarationAccess().getDefsSigDefinitionsParserRuleCall_7_0()); 
            pushFollow(FOLLOW_rulesigDefinitions_in_rule__SignatureDeclaration__DefsAssignment_79905);
            rulesigDefinitions();

            state._fsp--;

             after(grammarAccess.getSignatureDeclarationAccess().getDefsSigDefinitionsParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__SignatureDeclaration__DefsAssignment_7"


    // $ANTLR start "rule__SigDefinitions__ConsAssignment_2"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4857:1: rule__SigDefinitions__ConsAssignment_2 : ( rulesigConstruct ) ;
    public final void rule__SigDefinitions__ConsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4861:1: ( ( rulesigConstruct ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4862:1: ( rulesigConstruct )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4862:1: ( rulesigConstruct )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4863:1: rulesigConstruct
            {
             before(grammarAccess.getSigDefinitionsAccess().getConsSigConstructParserRuleCall_2_0()); 
            pushFollow(FOLLOW_rulesigConstruct_in_rule__SigDefinitions__ConsAssignment_29936);
            rulesigConstruct();

            state._fsp--;

             after(grammarAccess.getSigDefinitionsAccess().getConsSigConstructParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__SigDefinitions__ConsAssignment_2"


    // $ANTLR start "rule__SigDefinitions__FconsAssignment_3_2"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4872:1: rule__SigDefinitions__FconsAssignment_3_2 : ( rulesigConstruct ) ;
    public final void rule__SigDefinitions__FconsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4876:1: ( ( rulesigConstruct ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4877:1: ( rulesigConstruct )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4877:1: ( rulesigConstruct )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4878:1: rulesigConstruct
            {
             before(grammarAccess.getSigDefinitionsAccess().getFconsSigConstructParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_rulesigConstruct_in_rule__SigDefinitions__FconsAssignment_3_29967);
            rulesigConstruct();

            state._fsp--;

             after(grammarAccess.getSigDefinitionsAccess().getFconsSigConstructParserRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__SigDefinitions__FconsAssignment_3_2"


    // $ANTLR start "rule__SigConstruct__SymbNameAssignment_0_0"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4887:1: rule__SigConstruct__SymbNameAssignment_0_0 : ( ruleGID ) ;
    public final void rule__SigConstruct__SymbNameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4891:1: ( ( ruleGID ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4892:1: ( ruleGID )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4892:1: ( ruleGID )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4893:1: ruleGID
            {
             before(grammarAccess.getSigConstructAccess().getSymbNameGIDParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleGID_in_rule__SigConstruct__SymbNameAssignment_0_09998);
            ruleGID();

            state._fsp--;

             after(grammarAccess.getSigConstructAccess().getSymbNameGIDParserRuleCall_0_0_0()); 

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
    // $ANTLR end "rule__SigConstruct__SymbNameAssignment_0_0"


    // $ANTLR start "rule__SigConstruct__NamespaceAssignment_1_3"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4902:1: rule__SigConstruct__NamespaceAssignment_1_3 : ( ruleNAMESPACE ) ;
    public final void rule__SigConstruct__NamespaceAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4906:1: ( ( ruleNAMESPACE ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4907:1: ( ruleNAMESPACE )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4907:1: ( ruleNAMESPACE )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4908:1: ruleNAMESPACE
            {
             before(grammarAccess.getSigConstructAccess().getNamespaceNAMESPACEParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_ruleNAMESPACE_in_rule__SigConstruct__NamespaceAssignment_1_310029);
            ruleNAMESPACE();

            state._fsp--;

             after(grammarAccess.getSigConstructAccess().getNamespaceNAMESPACEParserRuleCall_1_3_0()); 

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
    // $ANTLR end "rule__SigConstruct__NamespaceAssignment_1_3"


    // $ANTLR start "rule__SigConstruct__StructNameAssignment_2_3"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4917:1: rule__SigConstruct__StructNameAssignment_2_3 : ( ruleGID ) ;
    public final void rule__SigConstruct__StructNameAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4921:1: ( ( ruleGID ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4922:1: ( ruleGID )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4922:1: ( ruleGID )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4923:1: ruleGID
            {
             before(grammarAccess.getSigConstructAccess().getStructNameGIDParserRuleCall_2_3_0()); 
            pushFollow(FOLLOW_ruleGID_in_rule__SigConstruct__StructNameAssignment_2_310060);
            ruleGID();

            state._fsp--;

             after(grammarAccess.getSigConstructAccess().getStructNameGIDParserRuleCall_2_3_0()); 

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
    // $ANTLR end "rule__SigConstruct__StructNameAssignment_2_3"


    // $ANTLR start "rule__SigConstruct__IncOptAssignment_2_7"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4932:1: rule__SigConstruct__IncOptAssignment_2_7 : ( ruleincludeOps ) ;
    public final void rule__SigConstruct__IncOptAssignment_2_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4936:1: ( ( ruleincludeOps ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4937:1: ( ruleincludeOps )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4937:1: ( ruleincludeOps )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4938:1: ruleincludeOps
            {
             before(grammarAccess.getSigConstructAccess().getIncOptIncludeOpsParserRuleCall_2_7_0()); 
            pushFollow(FOLLOW_ruleincludeOps_in_rule__SigConstruct__IncOptAssignment_2_710091);
            ruleincludeOps();

            state._fsp--;

             after(grammarAccess.getSigConstructAccess().getIncOptIncludeOpsParserRuleCall_2_7_0()); 

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
    // $ANTLR end "rule__SigConstruct__IncOptAssignment_2_7"


    // $ANTLR start "rule__SigConstruct__TmpAssignment_3_1"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4947:1: rule__SigConstruct__TmpAssignment_3_1 : ( ( rule__SigConstruct__TmpAlternatives_3_1_0 ) ) ;
    public final void rule__SigConstruct__TmpAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4951:1: ( ( ( rule__SigConstruct__TmpAlternatives_3_1_0 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4952:1: ( ( rule__SigConstruct__TmpAlternatives_3_1_0 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4952:1: ( ( rule__SigConstruct__TmpAlternatives_3_1_0 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4953:1: ( rule__SigConstruct__TmpAlternatives_3_1_0 )
            {
             before(grammarAccess.getSigConstructAccess().getTmpAlternatives_3_1_0()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4954:1: ( rule__SigConstruct__TmpAlternatives_3_1_0 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4954:2: rule__SigConstruct__TmpAlternatives_3_1_0
            {
            pushFollow(FOLLOW_rule__SigConstruct__TmpAlternatives_3_1_0_in_rule__SigConstruct__TmpAssignment_3_110122);
            rule__SigConstruct__TmpAlternatives_3_1_0();

            state._fsp--;


            }

             after(grammarAccess.getSigConstructAccess().getTmpAlternatives_3_1_0()); 

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
    // $ANTLR end "rule__SigConstruct__TmpAssignment_3_1"


    // $ANTLR start "rule__ViewDeclaration__ViewIDAssignment_3"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4964:1: rule__ViewDeclaration__ViewIDAssignment_3 : ( ruleGID ) ;
    public final void rule__ViewDeclaration__ViewIDAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4968:1: ( ( ruleGID ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4969:1: ( ruleGID )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4969:1: ( ruleGID )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4970:1: ruleGID
            {
             before(grammarAccess.getViewDeclarationAccess().getViewIDGIDParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleGID_in_rule__ViewDeclaration__ViewIDAssignment_310156);
            ruleGID();

            state._fsp--;

             after(grammarAccess.getViewDeclarationAccess().getViewIDGIDParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__ViewDeclaration__ViewIDAssignment_3"


    // $ANTLR start "rule__ViewDeclaration__FromAssignment_7"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4979:1: rule__ViewDeclaration__FromAssignment_7 : ( ruleNAMESPACE ) ;
    public final void rule__ViewDeclaration__FromAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4983:1: ( ( ruleNAMESPACE ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4984:1: ( ruleNAMESPACE )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4984:1: ( ruleNAMESPACE )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4985:1: ruleNAMESPACE
            {
             before(grammarAccess.getViewDeclarationAccess().getFromNAMESPACEParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleNAMESPACE_in_rule__ViewDeclaration__FromAssignment_710187);
            ruleNAMESPACE();

            state._fsp--;

             after(grammarAccess.getViewDeclarationAccess().getFromNAMESPACEParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__ViewDeclaration__FromAssignment_7"


    // $ANTLR start "rule__ViewDeclaration__ToAssignment_11"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4994:1: rule__ViewDeclaration__ToAssignment_11 : ( ruleNAMESPACE ) ;
    public final void rule__ViewDeclaration__ToAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4998:1: ( ( ruleNAMESPACE ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4999:1: ( ruleNAMESPACE )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4999:1: ( ruleNAMESPACE )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:5000:1: ruleNAMESPACE
            {
             before(grammarAccess.getViewDeclarationAccess().getToNAMESPACEParserRuleCall_11_0()); 
            pushFollow(FOLLOW_ruleNAMESPACE_in_rule__ViewDeclaration__ToAssignment_1110218);
            ruleNAMESPACE();

            state._fsp--;

             after(grammarAccess.getViewDeclarationAccess().getToNAMESPACEParserRuleCall_11_0()); 

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
    // $ANTLR end "rule__ViewDeclaration__ToAssignment_11"


    // $ANTLR start "rule__ViewDeclaration__ViewDefsAssignment_15"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:5009:1: rule__ViewDeclaration__ViewDefsAssignment_15 : ( rulesigDefinitions ) ;
    public final void rule__ViewDeclaration__ViewDefsAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:5013:1: ( ( rulesigDefinitions ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:5014:1: ( rulesigDefinitions )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:5014:1: ( rulesigDefinitions )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:5015:1: rulesigDefinitions
            {
             before(grammarAccess.getViewDeclarationAccess().getViewDefsSigDefinitionsParserRuleCall_15_0()); 
            pushFollow(FOLLOW_rulesigDefinitions_in_rule__ViewDeclaration__ViewDefsAssignment_1510249);
            rulesigDefinitions();

            state._fsp--;

             after(grammarAccess.getViewDeclarationAccess().getViewDefsSigDefinitionsParserRuleCall_15_0()); 

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
    // $ANTLR end "rule__ViewDeclaration__ViewDefsAssignment_15"

    // Delegated rules


    protected DFA25 dfa25 = new DFA25(this);
    protected DFA35 dfa35 = new DFA35(this);
    static final String DFA25_eotS =
        "\30\uffff";
    static final String DFA25_eofS =
        "\2\2\1\uffff\1\2\10\20\4\2\1\27\2\uffff\4\2\1\uffff";
    static final String DFA25_minS =
        "\2\4\1\uffff\15\4\1\0\2\uffff\4\4\1\uffff";
    static final String DFA25_maxS =
        "\1\23\1\37\1\uffff\15\37\1\0\2\uffff\4\37\1\uffff";
    static final String DFA25_acceptS =
        "\2\uffff\1\2\16\uffff\2\1\4\uffff\1\1";
    static final String DFA25_specialS =
        "\30\uffff}>";
    static final String[] DFA25_transitionS = {
            "\4\2\7\uffff\1\2\1\1\2\uffff\1\2",
            "\1\4\1\5\1\6\1\7\5\2\1\uffff\2\2\1\3\2\2\13\uffff\2\2",
            "",
            "\1\10\1\11\1\12\1\13\5\2\1\uffff\2\2\1\3\2\2\13\uffff\2\2",
            "\1\14\1\15\1\16\1\17\5\2\1\uffff\1\2\1\22\1\21\2\2\1\22\12"+
            "\uffff\2\2",
            "\1\14\1\15\1\16\1\17\5\2\1\uffff\1\2\1\22\1\21\2\2\1\22\12"+
            "\uffff\2\2",
            "\1\14\1\15\1\16\1\17\5\2\1\uffff\1\2\1\22\1\21\2\2\1\22\12"+
            "\uffff\2\2",
            "\1\14\1\15\1\16\1\17\5\2\1\uffff\1\2\1\22\1\21\2\2\1\22\12"+
            "\uffff\2\2",
            "\1\23\1\24\1\25\1\26\5\2\1\uffff\1\2\1\22\1\21\2\2\1\22\12"+
            "\uffff\2\2",
            "\1\23\1\24\1\25\1\26\5\2\1\uffff\1\2\1\22\1\21\2\2\1\22\12"+
            "\uffff\2\2",
            "\1\23\1\24\1\25\1\26\5\2\1\uffff\1\2\1\22\1\21\2\2\1\22\12"+
            "\uffff\2\2",
            "\1\23\1\24\1\25\1\26\5\2\1\uffff\1\2\1\22\1\21\2\2\1\22\12"+
            "\uffff\2\2",
            "\1\14\1\15\1\16\1\17\5\2\1\uffff\1\2\1\22\1\21\2\2\1\22\12"+
            "\uffff\2\2",
            "\1\14\1\15\1\16\1\17\5\2\1\uffff\1\2\1\22\1\21\2\2\1\22\12"+
            "\uffff\2\2",
            "\1\14\1\15\1\16\1\17\5\2\1\uffff\1\2\1\22\1\21\2\2\1\22\12"+
            "\uffff\2\2",
            "\1\14\1\15\1\16\1\17\5\2\1\uffff\1\2\1\22\1\21\2\2\1\22\12"+
            "\uffff\2\2",
            "\1\uffff",
            "",
            "",
            "\1\23\1\24\1\25\1\26\5\2\1\uffff\1\2\1\22\1\21\2\2\1\22\12"+
            "\uffff\2\2",
            "\1\23\1\24\1\25\1\26\5\2\1\uffff\1\2\1\22\1\21\2\2\1\22\12"+
            "\uffff\2\2",
            "\1\23\1\24\1\25\1\26\5\2\1\uffff\1\2\1\22\1\21\2\2\1\22\12"+
            "\uffff\2\2",
            "\1\23\1\24\1\25\1\26\5\2\1\uffff\1\2\1\22\1\21\2\2\1\22\12"+
            "\uffff\2\2",
            ""
    };

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "2213:1: ( rule__GID__Group_0_1__0 )?";
        }
    }
    static final String DFA35_eotS =
        "\14\uffff";
    static final String DFA35_eofS =
        "\14\uffff";
    static final String DFA35_minS =
        "\1\16\1\4\1\uffff\10\4\1\uffff";
    static final String DFA35_maxS =
        "\2\37\1\uffff\10\37\1\uffff";
    static final String DFA35_acceptS =
        "\2\uffff\1\2\10\uffff\1\1";
    static final String DFA35_specialS =
        "\14\uffff}>";
    static final String[] DFA35_transitionS = {
            "\1\1\20\uffff\1\2",
            "\1\3\1\4\1\5\1\6\27\uffff\1\2",
            "",
            "\1\7\1\10\1\11\1\12\5\13\3\uffff\1\13\1\uffff\1\13\14\uffff"+
            "\1\2",
            "\1\7\1\10\1\11\1\12\5\13\3\uffff\1\13\1\uffff\1\13\14\uffff"+
            "\1\2",
            "\1\7\1\10\1\11\1\12\5\13\3\uffff\1\13\1\uffff\1\13\14\uffff"+
            "\1\2",
            "\1\7\1\10\1\11\1\12\5\13\3\uffff\1\13\1\uffff\1\13\14\uffff"+
            "\1\2",
            "\1\7\1\10\1\11\1\12\5\13\3\uffff\1\13\1\uffff\1\13\14\uffff"+
            "\1\2",
            "\1\7\1\10\1\11\1\12\5\13\3\uffff\1\13\1\uffff\1\13\14\uffff"+
            "\1\2",
            "\1\7\1\10\1\11\1\12\5\13\3\uffff\1\13\1\uffff\1\13\14\uffff"+
            "\1\2",
            "\1\7\1\10\1\11\1\12\5\13\3\uffff\1\13\1\uffff\1\13\14\uffff"+
            "\1\2",
            ""
    };

    static final short[] DFA35_eot = DFA.unpackEncodedString(DFA35_eotS);
    static final short[] DFA35_eof = DFA.unpackEncodedString(DFA35_eofS);
    static final char[] DFA35_min = DFA.unpackEncodedStringToUnsignedChars(DFA35_minS);
    static final char[] DFA35_max = DFA.unpackEncodedStringToUnsignedChars(DFA35_maxS);
    static final short[] DFA35_accept = DFA.unpackEncodedString(DFA35_acceptS);
    static final short[] DFA35_special = DFA.unpackEncodedString(DFA35_specialS);
    static final short[][] DFA35_transition;

    static {
        int numStates = DFA35_transitionS.length;
        DFA35_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA35_transition[i] = DFA.unpackEncodedString(DFA35_transitionS[i]);
        }
    }

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = DFA35_eot;
            this.eof = DFA35_eof;
            this.min = DFA35_min;
            this.max = DFA35_max;
            this.accept = DFA35_accept;
            this.special = DFA35_special;
            this.transition = DFA35_transition;
        }
        public String getDescription() {
            return "()* loopback of 3094:1: ( rule__SigDefinitions__Group_3__0 )*";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__DeclarationsAssignment_in_ruleModel94 = new BitSet(new long[]{0x00000000000400F2L});
    public static final BitSet FOLLOW_ruleWS_in_entryRuleWS122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWS129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WS__Alternatives_in_ruleWS155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNAMESPACE_in_entryRuleNAMESPACE182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNAMESPACE189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NAMESPACE__Group__0_in_ruleNAMESPACE215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURI_in_entryRuleURI242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleURI249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group__0_in_ruleURI275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURISTRING_in_entryRuleURISTRING302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleURISTRING309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URISTRING__Group__0_in_ruleURISTRING335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJUSTSPACE_in_entryRuleJUSTSPACE362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJUSTSPACE369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JUSTSPACE__JAssignment_in_ruleJUSTSPACE395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenamespaceDeclaration_in_entryRulenamespaceDeclaration422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenamespaceDeclaration429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group__0_in_rulenamespaceDeclaration455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulereadDeclaration_in_entryRulereadDeclaration482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulereadDeclaration489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReadDeclaration__Group__0_in_rulereadDeclaration515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGID_in_entryRuleGID542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGID549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GID__Alternatives_in_ruleGID575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSOMETHING_in_entryRuleSOMETHING602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSOMETHING609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SOMETHING__Alternatives_in_ruleSOMETHING635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSOMETHING2_in_entryRuleSOMETHING2662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSOMETHING2669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SOMETHING2__Alternatives_in_ruleSOMETHING2695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesignatureDeclaration_in_entryRulesignatureDeclaration724 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesignatureDeclaration731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group__0_in_rulesignatureDeclaration757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesigDefinitions_in_entryRulesigDefinitions784 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesigDefinitions791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group__0_in_rulesigDefinitions817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesigConstruct_in_entryRulesigConstruct844 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesigConstruct851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigConstruct__Alternatives_in_rulesigConstruct877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleincludeOps_in_entryRuleincludeOps904 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleincludeOps911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IncludeOps__Group__0_in_ruleincludeOps937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleviewDeclaration_in_entryRuleviewDeclaration966 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleviewDeclaration973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__0_in_ruleviewDeclaration999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenamespaceDeclaration_in_rule__Model__DeclarationsAlternatives_01035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesignatureDeclaration_in_rule__Model__DeclarationsAlternatives_01052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleviewDeclaration_in_rule__Model__DeclarationsAlternatives_01069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulereadDeclaration_in_rule__Model__DeclarationsAlternatives_01086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJUSTSPACE_in_rule__Model__DeclarationsAlternatives_01103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SP_in_rule__WS__Alternatives1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_rule__WS__Alternatives1152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML2_COMMENT_in_rule__WS__Alternatives1169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_rule__WS__Alternatives1186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__NAMESPACE__Alternatives_2_01219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__NAMESPACE__Alternatives_2_01239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GID__Group_0__0_in_rule__GID__Alternatives1273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GID__Group_1__0_in_rule__GID__Alternatives1291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTIPLEDOT_in_rule__GID__Alternatives1309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLEDOT_in_rule__GID__Alternatives1326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CID_in_rule__GID__Alternatives_0_01358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rule__GID__Alternatives_0_01375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__GID__Alternatives_0_01392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rule__SOMETHING__Alternatives1424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CID_in_rule__SOMETHING__Alternatives1441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__SOMETHING__Alternatives1458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SOMETHING__Group_3__0_in_rule__SOMETHING__Alternatives1475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__SOMETHING__Alternatives1494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__SOMETHING__Alternatives1514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__SOMETHING__Alternatives1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__SOMETHING__Alternatives1554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SOMETHING__Group_8__0_in_rule__SOMETHING__Alternatives1573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTIPLEDOT_in_rule__SOMETHING__Alternatives1591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLEDOT_in_rule__SOMETHING__Alternatives1608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__SOMETHING__Alternatives1625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CID_in_rule__SOMETHING__Alternatives_3_11657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rule__SOMETHING__Alternatives_3_11674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rule__SOMETHING2__Alternatives1706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CID_in_rule__SOMETHING2__Alternatives1723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__SOMETHING2__Alternatives1740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__SOMETHING2__Alternatives1758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__SOMETHING2__Alternatives1778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__SOMETHING2__Alternatives1798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__SOMETHING2__Alternatives1818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__SOMETHING2__Alternatives1838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SOMETHING2__Group_8__0_in_rule__SOMETHING2__Alternatives1857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTIPLEDOT_in_rule__SOMETHING2__Alternatives1875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLEDOT_in_rule__SOMETHING2__Alternatives1892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__SOMETHING2__Alternatives1909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigConstruct__Group_0__0_in_rule__SigConstruct__Alternatives1942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigConstruct__Group_1__0_in_rule__SigConstruct__Alternatives1960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigConstruct__Group_2__0_in_rule__SigConstruct__Alternatives1978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigConstruct__Group_3__0_in_rule__SigConstruct__Alternatives1996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__SigConstruct__Alternatives_0_22030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__SigConstruct__Alternatives_0_22050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__SigConstruct__Alternatives_0_22070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__SigConstruct__Alternatives_2_52105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__SigConstruct__Alternatives_2_52125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__SigConstruct__TmpAlternatives_3_1_02160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__SigConstruct__TmpAlternatives_3_1_02180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__SigConstruct__TmpAlternatives_3_1_02200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__SigConstruct__TmpAlternatives_3_1_02220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__SigConstruct__TmpAlternatives_3_1_02240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__SigConstruct__TmpAlternatives_3_1_02260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__SigConstruct__TmpAlternatives_3_1_02280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NAMESPACE__Group__0__Impl_in_rule__NAMESPACE__Group__02313 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__NAMESPACE__Group__1_in_rule__NAMESPACE__Group__02316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NAMESPACE__Group_0__0_in_rule__NAMESPACE__Group__0__Impl2343 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_rule__NAMESPACE__Group__1__Impl_in_rule__NAMESPACE__Group__12374 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__NAMESPACE__Group__2_in_rule__NAMESPACE__Group__12377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CID_in_rule__NAMESPACE__Group__1__Impl2404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NAMESPACE__Group__2__Impl_in_rule__NAMESPACE__Group__22433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NAMESPACE__Group_2__0_in_rule__NAMESPACE__Group__2__Impl2460 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_rule__NAMESPACE__Group_0__0__Impl_in_rule__NAMESPACE__Group_0__02497 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__NAMESPACE__Group_0__1_in_rule__NAMESPACE__Group_0__02500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLEDOT_in_rule__NAMESPACE__Group_0__0__Impl2527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NAMESPACE__Group_0__1__Impl_in_rule__NAMESPACE__Group_0__12556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__NAMESPACE__Group_0__1__Impl2584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NAMESPACE__Group_2__0__Impl_in_rule__NAMESPACE__Group_2__02619 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__NAMESPACE__Group_2__1_in_rule__NAMESPACE__Group_2__02622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NAMESPACE__Alternatives_2_0_in_rule__NAMESPACE__Group_2__0__Impl2649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NAMESPACE__Group_2__1__Impl_in_rule__NAMESPACE__Group_2__12679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CID_in_rule__NAMESPACE__Group_2__1__Impl2706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group__0__Impl_in_rule__URI__Group__02739 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__URI__Group__1_in_rule__URI__Group__02742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group_0__0_in_rule__URI__Group__0__Impl2769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group__1__Impl_in_rule__URI__Group__12800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNAMESPACE_in_rule__URI__Group__1__Impl2827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group_0__0__Impl_in_rule__URI__Group_0__02860 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__URI__Group_0__1_in_rule__URI__Group_0__02863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CID_in_rule__URI__Group_0__0__Impl2890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group_0__1__Impl_in_rule__URI__Group_0__12919 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__URI__Group_0__2_in_rule__URI__Group_0__12922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__URI__Group_0__1__Impl2950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group_0__2__Impl_in_rule__URI__Group_0__22981 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__URI__Group_0__3_in_rule__URI__Group_0__22984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__URI__Group_0__2__Impl3012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group_0__3__Impl_in_rule__URI__Group_0__33043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__URI__Group_0__3__Impl3071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URISTRING__Group__0__Impl_in_rule__URISTRING__Group__03110 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_rule__URISTRING__Group__1_in_rule__URISTRING__Group__03113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__URISTRING__Group__0__Impl3141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URISTRING__Group__1__Impl_in_rule__URISTRING__Group__13172 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__URISTRING__Group__2_in_rule__URISTRING__Group__13175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURI_in_rule__URISTRING__Group__1__Impl3202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URISTRING__Group__2__Impl_in_rule__URISTRING__Group__23231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__URISTRING__Group__2__Impl3259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group__0__Impl_in_rule__NamespaceDeclaration__Group__03296 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group__1_in_rule__NamespaceDeclaration__Group__03299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__NamespaceDeclaration__Group__0__Impl3327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group__1__Impl_in_rule__NamespaceDeclaration__Group__13358 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group__2_in_rule__NamespaceDeclaration__Group__13361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__NamespaceDeclaration__Group__1__Impl3389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group__2__Impl_in_rule__NamespaceDeclaration__Group__23420 = new BitSet(new long[]{0x0000000008000400L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group__3_in_rule__NamespaceDeclaration__Group__23423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__NamespaceDeclaration__Group__2__Impl3453 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_ruleWS_in_rule__NamespaceDeclaration__Group__2__Impl3466 = new BitSet(new long[]{0x00000000000400F2L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group__3__Impl_in_rule__NamespaceDeclaration__Group__33499 = new BitSet(new long[]{0x0000000008000400L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group__4_in_rule__NamespaceDeclaration__Group__33502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group_3__0_in_rule__NamespaceDeclaration__Group__3__Impl3529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group__4__Impl_in_rule__NamespaceDeclaration__Group__43560 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group__5_in_rule__NamespaceDeclaration__Group__43563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__UriAssignment_4_in_rule__NamespaceDeclaration__Group__4__Impl3590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group__5__Impl_in_rule__NamespaceDeclaration__Group__53620 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group__6_in_rule__NamespaceDeclaration__Group__53623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__NamespaceDeclaration__Group__5__Impl3651 = new BitSet(new long[]{0x00000000000400F2L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group__6__Impl_in_rule__NamespaceDeclaration__Group__63682 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group__7_in_rule__NamespaceDeclaration__Group__63685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__NamespaceDeclaration__Group__6__Impl3713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group__7__Impl_in_rule__NamespaceDeclaration__Group__73744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__NamespaceDeclaration__Group__7__Impl3771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group_3__0__Impl_in_rule__NamespaceDeclaration__Group_3__03816 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group_3__1_in_rule__NamespaceDeclaration__Group_3__03819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__NameAssignment_3_0_in_rule__NamespaceDeclaration__Group_3__0__Impl3846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group_3__1__Impl_in_rule__NamespaceDeclaration__Group_3__13876 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group_3__2_in_rule__NamespaceDeclaration__Group_3__13879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__NamespaceDeclaration__Group_3__1__Impl3907 = new BitSet(new long[]{0x00000000000400F2L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group_3__2__Impl_in_rule__NamespaceDeclaration__Group_3__23938 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group_3__3_in_rule__NamespaceDeclaration__Group_3__23941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__NamespaceDeclaration__Group_3__2__Impl3969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group_3__3__Impl_in_rule__NamespaceDeclaration__Group_3__34000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__NamespaceDeclaration__Group_3__3__Impl4028 = new BitSet(new long[]{0x00000000000400F2L});
    public static final BitSet FOLLOW_rule__ReadDeclaration__Group__0__Impl_in_rule__ReadDeclaration__Group__04067 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__ReadDeclaration__Group__1_in_rule__ReadDeclaration__Group__04070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ReadDeclaration__Group__0__Impl4098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReadDeclaration__Group__1__Impl_in_rule__ReadDeclaration__Group__14129 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_rule__ReadDeclaration__Group__2_in_rule__ReadDeclaration__Group__14132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ReadDeclaration__Group__1__Impl4160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReadDeclaration__Group__2__Impl_in_rule__ReadDeclaration__Group__24191 = new BitSet(new long[]{0x0000000008000400L});
    public static final BitSet FOLLOW_rule__ReadDeclaration__Group__3_in_rule__ReadDeclaration__Group__24194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__ReadDeclaration__Group__2__Impl4224 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_ruleWS_in_rule__ReadDeclaration__Group__2__Impl4237 = new BitSet(new long[]{0x00000000000400F2L});
    public static final BitSet FOLLOW_rule__ReadDeclaration__Group__3__Impl_in_rule__ReadDeclaration__Group__34270 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_rule__ReadDeclaration__Group__4_in_rule__ReadDeclaration__Group__34273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReadDeclaration__FileAssignment_3_in_rule__ReadDeclaration__Group__3__Impl4300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReadDeclaration__Group__4__Impl_in_rule__ReadDeclaration__Group__44330 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__ReadDeclaration__Group__5_in_rule__ReadDeclaration__Group__44333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__ReadDeclaration__Group__4__Impl4361 = new BitSet(new long[]{0x00000000000400F2L});
    public static final BitSet FOLLOW_rule__ReadDeclaration__Group__5__Impl_in_rule__ReadDeclaration__Group__54392 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_rule__ReadDeclaration__Group__6_in_rule__ReadDeclaration__Group__54395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ReadDeclaration__Group__5__Impl4423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReadDeclaration__Group__6__Impl_in_rule__ReadDeclaration__Group__64454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__ReadDeclaration__Group__6__Impl4481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GID__Group_0__0__Impl_in_rule__GID__Group_0__04524 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__GID__Group_0__1_in_rule__GID__Group_0__04527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GID__Alternatives_0_0_in_rule__GID__Group_0__0__Impl4556 = new BitSet(new long[]{0x0000000000001C02L});
    public static final BitSet FOLLOW_rule__GID__Alternatives_0_0_in_rule__GID__Group_0__0__Impl4568 = new BitSet(new long[]{0x0000000000001C02L});
    public static final BitSet FOLLOW_rule__GID__Group_0__1__Impl_in_rule__GID__Group_0__14601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GID__Group_0_1__0_in_rule__GID__Group_0__1__Impl4628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GID__Group_0_1__0__Impl_in_rule__GID__Group_0_1__04663 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_rule__GID__Group_0_1__1_in_rule__GID__Group_0_1__04666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__GID__Group_0_1__0__Impl4697 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_rule__GID__Group_0_1__0__Impl4713 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__GID__Group_0_1__1__Impl_in_rule__GID__Group_0_1__14748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__GID__Group_0_1__1__Impl4775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GID__Group_1__0__Impl_in_rule__GID__Group_1__04808 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__GID__Group_1__1_in_rule__GID__Group_1__04811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__GID__Group_1__0__Impl4839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GID__Group_1__1__Impl_in_rule__GID__Group_1__14870 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_rule__GID__Group_1__2_in_rule__GID__Group_1__14873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__GID__Group_1__1__Impl4904 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_rule__GID__Group_1__1__Impl4920 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__GID__Group_1__2__Impl_in_rule__GID__Group_1__24955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__GID__Group_1__2__Impl4982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SOMETHING__Group_3__0__Impl_in_rule__SOMETHING__Group_3__05017 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_rule__SOMETHING__Group_3__1_in_rule__SOMETHING__Group_3__05020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__SOMETHING__Group_3__0__Impl5048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SOMETHING__Group_3__1__Impl_in_rule__SOMETHING__Group_3__15079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SOMETHING__Alternatives_3_1_in_rule__SOMETHING__Group_3__1__Impl5106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SOMETHING__Group_8__0__Impl_in_rule__SOMETHING__Group_8__05140 = new BitSet(new long[]{0x00000000C007DFF0L});
    public static final BitSet FOLLOW_rule__SOMETHING__Group_8__1_in_rule__SOMETHING__Group_8__05143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__SOMETHING__Group_8__0__Impl5171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SOMETHING__Group_8__1__Impl_in_rule__SOMETHING__Group_8__15202 = new BitSet(new long[]{0x00000000C007DFF0L});
    public static final BitSet FOLLOW_rule__SOMETHING__Group_8__2_in_rule__SOMETHING__Group_8__15205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSOMETHING2_in_rule__SOMETHING__Group_8__1__Impl5233 = new BitSet(new long[]{0x000000004007DFF2L});
    public static final BitSet FOLLOW_rule__SOMETHING__Group_8__2__Impl_in_rule__SOMETHING__Group_8__25264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__SOMETHING__Group_8__2__Impl5292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SOMETHING2__Group_8__0__Impl_in_rule__SOMETHING2__Group_8__05329 = new BitSet(new long[]{0x00000000C007DFF0L});
    public static final BitSet FOLLOW_rule__SOMETHING2__Group_8__1_in_rule__SOMETHING2__Group_8__05332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__SOMETHING2__Group_8__0__Impl5360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SOMETHING2__Group_8__1__Impl_in_rule__SOMETHING2__Group_8__15391 = new BitSet(new long[]{0x00000000C007DFF0L});
    public static final BitSet FOLLOW_rule__SOMETHING2__Group_8__2_in_rule__SOMETHING2__Group_8__15394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSOMETHING2_in_rule__SOMETHING2__Group_8__1__Impl5422 = new BitSet(new long[]{0x000000004007DFF2L});
    public static final BitSet FOLLOW_rule__SOMETHING2__Group_8__2__Impl_in_rule__SOMETHING2__Group_8__25453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__SOMETHING2__Group_8__2__Impl5481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group__0__Impl_in_rule__SignatureDeclaration__Group__05521 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group__1_in_rule__SignatureDeclaration__Group__05524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__SignatureDeclaration__Group__0__Impl5552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group__1__Impl_in_rule__SignatureDeclaration__Group__15583 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group__2_in_rule__SignatureDeclaration__Group__15586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__SignatureDeclaration__Group__1__Impl5614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group__2__Impl_in_rule__SignatureDeclaration__Group__25645 = new BitSet(new long[]{0x0000000000011F00L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group__3_in_rule__SignatureDeclaration__Group__25648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__SignatureDeclaration__Group__2__Impl5678 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_ruleWS_in_rule__SignatureDeclaration__Group__2__Impl5691 = new BitSet(new long[]{0x00000000000400F2L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group__3__Impl_in_rule__SignatureDeclaration__Group__35724 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group__4_in_rule__SignatureDeclaration__Group__35727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__SigNameAssignment_3_in_rule__SignatureDeclaration__Group__3__Impl5754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group__4__Impl_in_rule__SignatureDeclaration__Group__45784 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group__5_in_rule__SignatureDeclaration__Group__45787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__SignatureDeclaration__Group__4__Impl5815 = new BitSet(new long[]{0x00000000000400F2L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group__5__Impl_in_rule__SignatureDeclaration__Group__55846 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group__6_in_rule__SignatureDeclaration__Group__55849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__SignatureDeclaration__Group__5__Impl5877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group__6__Impl_in_rule__SignatureDeclaration__Group__65908 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group__7_in_rule__SignatureDeclaration__Group__65911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__SignatureDeclaration__Group__6__Impl5939 = new BitSet(new long[]{0x00000000000400F2L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group__7__Impl_in_rule__SignatureDeclaration__Group__75970 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group__8_in_rule__SignatureDeclaration__Group__75973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__DefsAssignment_7_in_rule__SignatureDeclaration__Group__7__Impl6000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group__8__Impl_in_rule__SignatureDeclaration__Group__86030 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group__9_in_rule__SignatureDeclaration__Group__86033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__SignatureDeclaration__Group__8__Impl6061 = new BitSet(new long[]{0x00000000000400F2L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group__9__Impl_in_rule__SignatureDeclaration__Group__96092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__SignatureDeclaration__Group__9__Impl6120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group__0__Impl_in_rule__SigDefinitions__Group__06171 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group__1_in_rule__SigDefinitions__Group__06174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__SigDefinitions__Group__0__Impl6202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group__1__Impl_in_rule__SigDefinitions__Group__16233 = new BitSet(new long[]{0x0000000000051F00L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group__2_in_rule__SigDefinitions__Group__16236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__SigDefinitions__Group__1__Impl6264 = new BitSet(new long[]{0x00000000000400F2L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group__2__Impl_in_rule__SigDefinitions__Group__26295 = new BitSet(new long[]{0x0000000080004000L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group__3_in_rule__SigDefinitions__Group__26298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__ConsAssignment_2_in_rule__SigDefinitions__Group__2__Impl6325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group__3__Impl_in_rule__SigDefinitions__Group__36355 = new BitSet(new long[]{0x0000000080004000L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group__4_in_rule__SigDefinitions__Group__36358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_3__0_in_rule__SigDefinitions__Group__3__Impl6385 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group__4__Impl_in_rule__SigDefinitions__Group__46416 = new BitSet(new long[]{0x0000000080004000L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group__5_in_rule__SigDefinitions__Group__46419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_4__0_in_rule__SigDefinitions__Group__4__Impl6446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group__5__Impl_in_rule__SigDefinitions__Group__56477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__SigDefinitions__Group__5__Impl6505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_3__0__Impl_in_rule__SigDefinitions__Group_3__06548 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_3__1_in_rule__SigDefinitions__Group_3__06551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__SigDefinitions__Group_3__0__Impl6579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_3__1__Impl_in_rule__SigDefinitions__Group_3__16610 = new BitSet(new long[]{0x0000000000051F00L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_3__2_in_rule__SigDefinitions__Group_3__16613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__SigDefinitions__Group_3__1__Impl6643 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_ruleWS_in_rule__SigDefinitions__Group_3__1__Impl6656 = new BitSet(new long[]{0x00000000000400F2L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_3__2__Impl_in_rule__SigDefinitions__Group_3__26689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__FconsAssignment_3_2_in_rule__SigDefinitions__Group_3__2__Impl6716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_4__0__Impl_in_rule__SigDefinitions__Group_4__06752 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_4__1_in_rule__SigDefinitions__Group_4__06755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__SigDefinitions__Group_4__0__Impl6783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_4__1__Impl_in_rule__SigDefinitions__Group_4__16814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__SigDefinitions__Group_4__1__Impl6842 = new BitSet(new long[]{0x00000000000400F2L});
    public static final BitSet FOLLOW_rule__SigConstruct__Group_0__0__Impl_in_rule__SigConstruct__Group_0__06877 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_rule__SigConstruct__Group_0__1_in_rule__SigConstruct__Group_0__06880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigConstruct__SymbNameAssignment_0_0_in_rule__SigConstruct__Group_0__0__Impl6907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigConstruct__Group_0__1__Impl_in_rule__SigConstruct__Group_0__16937 = new BitSet(new long[]{0x0000000000098000L});
    public static final BitSet FOLLOW_rule__SigConstruct__Group_0__2_in_rule__SigConstruct__Group_0__16940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__SigConstruct__Group_0__1__Impl6968 = new BitSet(new long[]{0x00000000000400F2L});
    public static final BitSet FOLLOW_rule__SigConstruct__Group_0__2__Impl_in_rule__SigConstruct__Group_0__26999 = new BitSet(new long[]{0x000000004007DFF0L});
    public static final BitSet FOLLOW_rule__SigConstruct__Group_0__3_in_rule__SigConstruct__Group_0__27002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigConstruct__Alternatives_0_2_in_rule__SigConstruct__Group_0__2__Impl7029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigConstruct__Group_0__3__Impl_in_rule__SigConstruct__Group_0__37059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSOMETHING_in_rule__SigConstruct__Group_0__3__Impl7087 = new BitSet(new long[]{0x000000004007DFF2L});
    public static final BitSet FOLLOW_rule__SigConstruct__Group_1__0__Impl_in_rule__SigConstruct__Group_1__07126 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__SigConstruct__Group_1__1_in_rule__SigConstruct__Group_1__07129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__SigConstruct__Group_1__0__Impl7157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigConstruct__Group_1__1__Impl_in_rule__SigConstruct__Group_1__17188 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_rule__SigConstruct__Group_1__2_in_rule__SigConstruct__Group_1__17191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__SigConstruct__Group_1__1__Impl7219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigConstruct__Group_1__2__Impl_in_rule__SigConstruct__Group_1__27250 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__SigConstruct__Group_1__3_in_rule__SigConstruct__Group_1__27253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__SigConstruct__Group_1__2__Impl7283 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_ruleWS_in_rule__SigConstruct__Group_1__2__Impl7296 = new BitSet(new long[]{0x00000000000400F2L});
    public static final BitSet FOLLOW_rule__SigConstruct__Group_1__3__Impl_in_rule__SigConstruct__Group_1__37329 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_rule__SigConstruct__Group_1__4_in_rule__SigConstruct__Group_1__37332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigConstruct__NamespaceAssignment_1_3_in_rule__SigConstruct__Group_1__3__Impl7359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigConstruct__Group_1__4__Impl_in_rule__SigConstruct__Group_1__47389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigConstruct__Group_1_4__0_in_rule__SigConstruct__Group_1__4__Impl7416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigConstruct__Group_1_4__0__Impl_in_rule__SigConstruct__Group_1_4__07457 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__SigConstruct__Group_1_4__1_in_rule__SigConstruct__Group_1_4__07460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__SigConstruct__Group_1_4__0__Impl7490 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_ruleWS_in_rule__SigConstruct__Group_1_4__0__Impl7503 = new BitSet(new long[]{0x00000000000400F2L});
    public static final BitSet FOLLOW_rule__SigConstruct__Group_1_4__1__Impl_in_rule__SigConstruct__Group_1_4__17536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleincludeOps_in_rule__SigConstruct__Group_1_4__1__Impl7563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigConstruct__Group_2__0__Impl_in_rule__SigConstruct__Group_2__07596 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__SigConstruct__Group_2__1_in_rule__SigConstruct__Group_2__07599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__SigConstruct__Group_2__0__Impl7627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigConstruct__Group_2__1__Impl_in_rule__SigConstruct__Group_2__17658 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_rule__SigConstruct__Group_2__2_in_rule__SigConstruct__Group_2__17661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__SigConstruct__Group_2__1__Impl7689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigConstruct__Group_2__2__Impl_in_rule__SigConstruct__Group_2__27720 = new BitSet(new long[]{0x0000000000011F00L});
    public static final BitSet FOLLOW_rule__SigConstruct__Group_2__3_in_rule__SigConstruct__Group_2__27723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__SigConstruct__Group_2__2__Impl7753 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_ruleWS_in_rule__SigConstruct__Group_2__2__Impl7766 = new BitSet(new long[]{0x00000000000400F2L});
    public static final BitSet FOLLOW_rule__SigConstruct__Group_2__3__Impl_in_rule__SigConstruct__Group_2__37799 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_rule__SigConstruct__Group_2__4_in_rule__SigConstruct__Group_2__37802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigConstruct__StructNameAssignment_2_3_in_rule__SigConstruct__Group_2__3__Impl7829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigConstruct__Group_2__4__Impl_in_rule__SigConstruct__Group_2__47859 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_rule__SigConstruct__Group_2__5_in_rule__SigConstruct__Group_2__47862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__SigConstruct__Group_2__4__Impl7890 = new BitSet(new long[]{0x00000000000400F2L});
    public static final BitSet FOLLOW_rule__SigConstruct__Group_2__5__Impl_in_rule__SigConstruct__Group_2__57921 = new BitSet(new long[]{0x000000004007DFF0L});
    public static final BitSet FOLLOW_rule__SigConstruct__Group_2__6_in_rule__SigConstruct__Group_2__57924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigConstruct__Alternatives_2_5_in_rule__SigConstruct__Group_2__5__Impl7951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigConstruct__Group_2__6__Impl_in_rule__SigConstruct__Group_2__67981 = new BitSet(new long[]{0x000000004007DFF0L});
    public static final BitSet FOLLOW_rule__SigConstruct__Group_2__7_in_rule__SigConstruct__Group_2__67984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSOMETHING_in_rule__SigConstruct__Group_2__6__Impl8012 = new BitSet(new long[]{0x000000004007DFF2L});
    public static final BitSet FOLLOW_rule__SigConstruct__Group_2__7__Impl_in_rule__SigConstruct__Group_2__78043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigConstruct__IncOptAssignment_2_7_in_rule__SigConstruct__Group_2__7__Impl8070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigConstruct__Group_3__0__Impl_in_rule__SigConstruct__Group_3__08117 = new BitSet(new long[]{0x0000000007F00000L});
    public static final BitSet FOLLOW_rule__SigConstruct__Group_3__1_in_rule__SigConstruct__Group_3__08120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__SigConstruct__Group_3__0__Impl8148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigConstruct__Group_3__1__Impl_in_rule__SigConstruct__Group_3__18179 = new BitSet(new long[]{0x000000004007DFF0L});
    public static final BitSet FOLLOW_rule__SigConstruct__Group_3__2_in_rule__SigConstruct__Group_3__18182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigConstruct__TmpAssignment_3_1_in_rule__SigConstruct__Group_3__1__Impl8209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigConstruct__Group_3__2__Impl_in_rule__SigConstruct__Group_3__28239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSOMETHING_in_rule__SigConstruct__Group_3__2__Impl8267 = new BitSet(new long[]{0x000000004007DFF2L});
    public static final BitSet FOLLOW_rule__IncludeOps__Group__0__Impl_in_rule__IncludeOps__Group__08304 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__IncludeOps__Group__1_in_rule__IncludeOps__Group__08307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__IncludeOps__Group__0__Impl8335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IncludeOps__Group__1__Impl_in_rule__IncludeOps__Group__18366 = new BitSet(new long[]{0x000000004007DFF0L});
    public static final BitSet FOLLOW_rule__IncludeOps__Group__2_in_rule__IncludeOps__Group__18369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__IncludeOps__Group__1__Impl8397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IncludeOps__Group__2__Impl_in_rule__IncludeOps__Group__28428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSOMETHING_in_rule__IncludeOps__Group__2__Impl8456 = new BitSet(new long[]{0x000000004007DFF2L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__0__Impl_in_rule__ViewDeclaration__Group__08493 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__1_in_rule__ViewDeclaration__Group__08496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ViewDeclaration__Group__0__Impl8524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__1__Impl_in_rule__ViewDeclaration__Group__18555 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__2_in_rule__ViewDeclaration__Group__18558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__ViewDeclaration__Group__1__Impl8586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__2__Impl_in_rule__ViewDeclaration__Group__28617 = new BitSet(new long[]{0x0000000000011F00L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__3_in_rule__ViewDeclaration__Group__28620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__ViewDeclaration__Group__2__Impl8650 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_ruleWS_in_rule__ViewDeclaration__Group__2__Impl8663 = new BitSet(new long[]{0x00000000000400F2L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__3__Impl_in_rule__ViewDeclaration__Group__38696 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__4_in_rule__ViewDeclaration__Group__38699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__ViewIDAssignment_3_in_rule__ViewDeclaration__Group__3__Impl8726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__4__Impl_in_rule__ViewDeclaration__Group__48756 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__5_in_rule__ViewDeclaration__Group__48759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__ViewDeclaration__Group__4__Impl8787 = new BitSet(new long[]{0x00000000000400F2L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__5__Impl_in_rule__ViewDeclaration__Group__58818 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__6_in_rule__ViewDeclaration__Group__58821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ViewDeclaration__Group__5__Impl8849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__6__Impl_in_rule__ViewDeclaration__Group__68880 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__7_in_rule__ViewDeclaration__Group__68883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__ViewDeclaration__Group__6__Impl8911 = new BitSet(new long[]{0x00000000000400F2L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__7__Impl_in_rule__ViewDeclaration__Group__78942 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__8_in_rule__ViewDeclaration__Group__78945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__FromAssignment_7_in_rule__ViewDeclaration__Group__7__Impl8972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__8__Impl_in_rule__ViewDeclaration__Group__89002 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__9_in_rule__ViewDeclaration__Group__89005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__ViewDeclaration__Group__8__Impl9033 = new BitSet(new long[]{0x00000000000400F2L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__9__Impl_in_rule__ViewDeclaration__Group__99064 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__10_in_rule__ViewDeclaration__Group__99067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ViewDeclaration__Group__9__Impl9095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__10__Impl_in_rule__ViewDeclaration__Group__109126 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__11_in_rule__ViewDeclaration__Group__109129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__ViewDeclaration__Group__10__Impl9157 = new BitSet(new long[]{0x00000000000400F2L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__11__Impl_in_rule__ViewDeclaration__Group__119188 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__12_in_rule__ViewDeclaration__Group__119191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__ToAssignment_11_in_rule__ViewDeclaration__Group__11__Impl9218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__12__Impl_in_rule__ViewDeclaration__Group__129248 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__13_in_rule__ViewDeclaration__Group__129251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__ViewDeclaration__Group__12__Impl9279 = new BitSet(new long[]{0x00000000000400F2L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__13__Impl_in_rule__ViewDeclaration__Group__139310 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__14_in_rule__ViewDeclaration__Group__139313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ViewDeclaration__Group__13__Impl9341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__14__Impl_in_rule__ViewDeclaration__Group__149372 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__15_in_rule__ViewDeclaration__Group__149375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__ViewDeclaration__Group__14__Impl9403 = new BitSet(new long[]{0x00000000000400F2L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__15__Impl_in_rule__ViewDeclaration__Group__159434 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__16_in_rule__ViewDeclaration__Group__159437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__ViewDefsAssignment_15_in_rule__ViewDeclaration__Group__15__Impl9464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__16__Impl_in_rule__ViewDeclaration__Group__169494 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__17_in_rule__ViewDeclaration__Group__169497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__ViewDeclaration__Group__16__Impl9525 = new BitSet(new long[]{0x00000000000400F2L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__17__Impl_in_rule__ViewDeclaration__Group__179556 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__18_in_rule__ViewDeclaration__Group__179559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ViewDeclaration__Group__17__Impl9587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__18__Impl_in_rule__ViewDeclaration__Group__189618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__ViewDeclaration__Group__18__Impl9645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__DeclarationsAlternatives_0_in_rule__Model__DeclarationsAssignment9717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__JUSTSPACE__JAssignment9750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CID_in_rule__NamespaceDeclaration__NameAssignment_3_09781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURISTRING_in_rule__NamespaceDeclaration__UriAssignment_49812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURISTRING_in_rule__ReadDeclaration__FileAssignment_39843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGID_in_rule__SignatureDeclaration__SigNameAssignment_39874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesigDefinitions_in_rule__SignatureDeclaration__DefsAssignment_79905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesigConstruct_in_rule__SigDefinitions__ConsAssignment_29936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesigConstruct_in_rule__SigDefinitions__FconsAssignment_3_29967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGID_in_rule__SigConstruct__SymbNameAssignment_0_09998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNAMESPACE_in_rule__SigConstruct__NamespaceAssignment_1_310029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGID_in_rule__SigConstruct__StructNameAssignment_2_310060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleincludeOps_in_rule__SigConstruct__IncOptAssignment_2_710091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigConstruct__TmpAlternatives_3_1_0_in_rule__SigConstruct__TmpAssignment_3_110122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGID_in_rule__ViewDeclaration__ViewIDAssignment_310156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNAMESPACE_in_rule__ViewDeclaration__FromAssignment_710187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNAMESPACE_in_rule__ViewDeclaration__ToAssignment_1110218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesigDefinitions_in_rule__ViewDeclaration__ViewDefsAssignment_1510249 = new BitSet(new long[]{0x0000000000000002L});

}