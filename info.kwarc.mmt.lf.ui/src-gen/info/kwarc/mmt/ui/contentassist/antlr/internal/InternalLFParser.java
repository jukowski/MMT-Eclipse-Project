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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SP", "RULE_ML_COMMENT", "RULE_ML2_COMMENT", "RULE_SL_COMMENT", "RULE_MULTIPLEDOT", "RULE_DOUBLEDOT", "RULE_CID", "RULE_ANY_OTHER", "RULE_INT", "'/'", "'.'", "':'", "'='", "'->'", "'%'", "'meta'", "'abbrev'", "'name'", "'pattern'", "'infix'", "'prefix'", "'postfix'", "':='", "'\"'", "'namespace'", "'read'", "'{'", "'}'", "'sig'", "'include'", "'struct'", "'open'", "'view'"
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


    // $ANTLR start "entryRuleclassicSymbolConstruct"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:455:1: entryRuleclassicSymbolConstruct : ruleclassicSymbolConstruct EOF ;
    public final void entryRuleclassicSymbolConstruct() throws RecognitionException {
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:456:1: ( ruleclassicSymbolConstruct EOF )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:457:1: ruleclassicSymbolConstruct EOF
            {
             before(grammarAccess.getClassicSymbolConstructRule()); 
            pushFollow(FOLLOW_ruleclassicSymbolConstruct_in_entryRuleclassicSymbolConstruct904);
            ruleclassicSymbolConstruct();

            state._fsp--;

             after(grammarAccess.getClassicSymbolConstructRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleclassicSymbolConstruct911); 

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
    // $ANTLR end "entryRuleclassicSymbolConstruct"


    // $ANTLR start "ruleclassicSymbolConstruct"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:464:1: ruleclassicSymbolConstruct : ( ( rule__ClassicSymbolConstruct__Group__0 ) ) ;
    public final void ruleclassicSymbolConstruct() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:468:2: ( ( ( rule__ClassicSymbolConstruct__Group__0 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:469:1: ( ( rule__ClassicSymbolConstruct__Group__0 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:469:1: ( ( rule__ClassicSymbolConstruct__Group__0 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:470:1: ( rule__ClassicSymbolConstruct__Group__0 )
            {
             before(grammarAccess.getClassicSymbolConstructAccess().getGroup()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:471:1: ( rule__ClassicSymbolConstruct__Group__0 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:471:2: rule__ClassicSymbolConstruct__Group__0
            {
            pushFollow(FOLLOW_rule__ClassicSymbolConstruct__Group__0_in_ruleclassicSymbolConstruct937);
            rule__ClassicSymbolConstruct__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassicSymbolConstructAccess().getGroup()); 

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
    // $ANTLR end "ruleclassicSymbolConstruct"


    // $ANTLR start "entryRuleincludeConstruct"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:483:1: entryRuleincludeConstruct : ruleincludeConstruct EOF ;
    public final void entryRuleincludeConstruct() throws RecognitionException {
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:484:1: ( ruleincludeConstruct EOF )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:485:1: ruleincludeConstruct EOF
            {
             before(grammarAccess.getIncludeConstructRule()); 
            pushFollow(FOLLOW_ruleincludeConstruct_in_entryRuleincludeConstruct964);
            ruleincludeConstruct();

            state._fsp--;

             after(grammarAccess.getIncludeConstructRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleincludeConstruct971); 

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
    // $ANTLR end "entryRuleincludeConstruct"


    // $ANTLR start "ruleincludeConstruct"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:492:1: ruleincludeConstruct : ( ( rule__IncludeConstruct__Group__0 ) ) ;
    public final void ruleincludeConstruct() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:496:2: ( ( ( rule__IncludeConstruct__Group__0 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:497:1: ( ( rule__IncludeConstruct__Group__0 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:497:1: ( ( rule__IncludeConstruct__Group__0 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:498:1: ( rule__IncludeConstruct__Group__0 )
            {
             before(grammarAccess.getIncludeConstructAccess().getGroup()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:499:1: ( rule__IncludeConstruct__Group__0 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:499:2: rule__IncludeConstruct__Group__0
            {
            pushFollow(FOLLOW_rule__IncludeConstruct__Group__0_in_ruleincludeConstruct997);
            rule__IncludeConstruct__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIncludeConstructAccess().getGroup()); 

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
    // $ANTLR end "ruleincludeConstruct"


    // $ANTLR start "entryRulestructConstruct"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:511:1: entryRulestructConstruct : rulestructConstruct EOF ;
    public final void entryRulestructConstruct() throws RecognitionException {
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:512:1: ( rulestructConstruct EOF )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:513:1: rulestructConstruct EOF
            {
             before(grammarAccess.getStructConstructRule()); 
            pushFollow(FOLLOW_rulestructConstruct_in_entryRulestructConstruct1024);
            rulestructConstruct();

            state._fsp--;

             after(grammarAccess.getStructConstructRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulestructConstruct1031); 

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
    // $ANTLR end "entryRulestructConstruct"


    // $ANTLR start "rulestructConstruct"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:520:1: rulestructConstruct : ( ( rule__StructConstruct__Group__0 ) ) ;
    public final void rulestructConstruct() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:524:2: ( ( ( rule__StructConstruct__Group__0 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:525:1: ( ( rule__StructConstruct__Group__0 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:525:1: ( ( rule__StructConstruct__Group__0 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:526:1: ( rule__StructConstruct__Group__0 )
            {
             before(grammarAccess.getStructConstructAccess().getGroup()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:527:1: ( rule__StructConstruct__Group__0 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:527:2: rule__StructConstruct__Group__0
            {
            pushFollow(FOLLOW_rule__StructConstruct__Group__0_in_rulestructConstruct1057);
            rule__StructConstruct__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStructConstructAccess().getGroup()); 

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
    // $ANTLR end "rulestructConstruct"


    // $ANTLR start "entryRuleincludeOps"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:539:1: entryRuleincludeOps : ruleincludeOps EOF ;
    public final void entryRuleincludeOps() throws RecognitionException {
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:540:1: ( ruleincludeOps EOF )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:541:1: ruleincludeOps EOF
            {
             before(grammarAccess.getIncludeOpsRule()); 
            pushFollow(FOLLOW_ruleincludeOps_in_entryRuleincludeOps1084);
            ruleincludeOps();

            state._fsp--;

             after(grammarAccess.getIncludeOpsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleincludeOps1091); 

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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:548:1: ruleincludeOps : ( ( rule__IncludeOps__Group__0 ) ) ;
    public final void ruleincludeOps() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:552:2: ( ( ( rule__IncludeOps__Group__0 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:553:1: ( ( rule__IncludeOps__Group__0 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:553:1: ( ( rule__IncludeOps__Group__0 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:554:1: ( rule__IncludeOps__Group__0 )
            {
             before(grammarAccess.getIncludeOpsAccess().getGroup()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:555:1: ( rule__IncludeOps__Group__0 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:555:2: rule__IncludeOps__Group__0
            {
            pushFollow(FOLLOW_rule__IncludeOps__Group__0_in_ruleincludeOps1117);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:569:1: entryRuleviewDeclaration : ruleviewDeclaration EOF ;
    public final void entryRuleviewDeclaration() throws RecognitionException {
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:570:1: ( ruleviewDeclaration EOF )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:571:1: ruleviewDeclaration EOF
            {
             before(grammarAccess.getViewDeclarationRule()); 
            pushFollow(FOLLOW_ruleviewDeclaration_in_entryRuleviewDeclaration1146);
            ruleviewDeclaration();

            state._fsp--;

             after(grammarAccess.getViewDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleviewDeclaration1153); 

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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:578:1: ruleviewDeclaration : ( ( rule__ViewDeclaration__Group__0 ) ) ;
    public final void ruleviewDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:582:2: ( ( ( rule__ViewDeclaration__Group__0 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:583:1: ( ( rule__ViewDeclaration__Group__0 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:583:1: ( ( rule__ViewDeclaration__Group__0 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:584:1: ( rule__ViewDeclaration__Group__0 )
            {
             before(grammarAccess.getViewDeclarationAccess().getGroup()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:585:1: ( rule__ViewDeclaration__Group__0 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:585:2: rule__ViewDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__Group__0_in_ruleviewDeclaration1179);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:597:1: rule__Model__DeclarationsAlternatives_0 : ( ( rulenamespaceDeclaration ) | ( rulesignatureDeclaration ) | ( ruleviewDeclaration ) | ( rulereadDeclaration ) | ( ruleJUSTSPACE ) );
    public final void rule__Model__DeclarationsAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:601:1: ( ( rulenamespaceDeclaration ) | ( rulesignatureDeclaration ) | ( ruleviewDeclaration ) | ( rulereadDeclaration ) | ( ruleJUSTSPACE ) )
            int alt2=5;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==18) ) {
                switch ( input.LA(2) ) {
                case 36:
                    {
                    alt2=3;
                    }
                    break;
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
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:602:1: ( rulenamespaceDeclaration )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:602:1: ( rulenamespaceDeclaration )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:603:1: rulenamespaceDeclaration
                    {
                     before(grammarAccess.getModelAccess().getDeclarationsNamespaceDeclarationParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_rulenamespaceDeclaration_in_rule__Model__DeclarationsAlternatives_01215);
                    rulenamespaceDeclaration();

                    state._fsp--;

                     after(grammarAccess.getModelAccess().getDeclarationsNamespaceDeclarationParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:608:6: ( rulesignatureDeclaration )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:608:6: ( rulesignatureDeclaration )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:609:1: rulesignatureDeclaration
                    {
                     before(grammarAccess.getModelAccess().getDeclarationsSignatureDeclarationParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_rulesignatureDeclaration_in_rule__Model__DeclarationsAlternatives_01232);
                    rulesignatureDeclaration();

                    state._fsp--;

                     after(grammarAccess.getModelAccess().getDeclarationsSignatureDeclarationParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:614:6: ( ruleviewDeclaration )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:614:6: ( ruleviewDeclaration )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:615:1: ruleviewDeclaration
                    {
                     before(grammarAccess.getModelAccess().getDeclarationsViewDeclarationParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_ruleviewDeclaration_in_rule__Model__DeclarationsAlternatives_01249);
                    ruleviewDeclaration();

                    state._fsp--;

                     after(grammarAccess.getModelAccess().getDeclarationsViewDeclarationParserRuleCall_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:620:6: ( rulereadDeclaration )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:620:6: ( rulereadDeclaration )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:621:1: rulereadDeclaration
                    {
                     before(grammarAccess.getModelAccess().getDeclarationsReadDeclarationParserRuleCall_0_3()); 
                    pushFollow(FOLLOW_rulereadDeclaration_in_rule__Model__DeclarationsAlternatives_01266);
                    rulereadDeclaration();

                    state._fsp--;

                     after(grammarAccess.getModelAccess().getDeclarationsReadDeclarationParserRuleCall_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:626:6: ( ruleJUSTSPACE )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:626:6: ( ruleJUSTSPACE )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:627:1: ruleJUSTSPACE
                    {
                     before(grammarAccess.getModelAccess().getDeclarationsJUSTSPACEParserRuleCall_0_4()); 
                    pushFollow(FOLLOW_ruleJUSTSPACE_in_rule__Model__DeclarationsAlternatives_01283);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:637:1: rule__WS__Alternatives : ( ( RULE_SP ) | ( RULE_ML_COMMENT ) | ( RULE_ML2_COMMENT ) | ( RULE_SL_COMMENT ) );
    public final void rule__WS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:641:1: ( ( RULE_SP ) | ( RULE_ML_COMMENT ) | ( RULE_ML2_COMMENT ) | ( RULE_SL_COMMENT ) )
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
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:642:1: ( RULE_SP )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:642:1: ( RULE_SP )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:643:1: RULE_SP
                    {
                     before(grammarAccess.getWSAccess().getSPTerminalRuleCall_0()); 
                    match(input,RULE_SP,FOLLOW_RULE_SP_in_rule__WS__Alternatives1315); 
                     after(grammarAccess.getWSAccess().getSPTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:648:6: ( RULE_ML_COMMENT )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:648:6: ( RULE_ML_COMMENT )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:649:1: RULE_ML_COMMENT
                    {
                     before(grammarAccess.getWSAccess().getML_COMMENTTerminalRuleCall_1()); 
                    match(input,RULE_ML_COMMENT,FOLLOW_RULE_ML_COMMENT_in_rule__WS__Alternatives1332); 
                     after(grammarAccess.getWSAccess().getML_COMMENTTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:654:6: ( RULE_ML2_COMMENT )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:654:6: ( RULE_ML2_COMMENT )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:655:1: RULE_ML2_COMMENT
                    {
                     before(grammarAccess.getWSAccess().getML2_COMMENTTerminalRuleCall_2()); 
                    match(input,RULE_ML2_COMMENT,FOLLOW_RULE_ML2_COMMENT_in_rule__WS__Alternatives1349); 
                     after(grammarAccess.getWSAccess().getML2_COMMENTTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:660:6: ( RULE_SL_COMMENT )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:660:6: ( RULE_SL_COMMENT )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:661:1: RULE_SL_COMMENT
                    {
                     before(grammarAccess.getWSAccess().getSL_COMMENTTerminalRuleCall_3()); 
                    match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_rule__WS__Alternatives1366); 
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:671:1: rule__NAMESPACE__Alternatives_2_0 : ( ( '/' ) | ( '.' ) );
    public final void rule__NAMESPACE__Alternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:675:1: ( ( '/' ) | ( '.' ) )
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
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:676:1: ( '/' )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:676:1: ( '/' )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:677:1: '/'
                    {
                     before(grammarAccess.getNAMESPACEAccess().getSolidusKeyword_2_0_0()); 
                    match(input,13,FOLLOW_13_in_rule__NAMESPACE__Alternatives_2_01399); 
                     after(grammarAccess.getNAMESPACEAccess().getSolidusKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:684:6: ( '.' )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:684:6: ( '.' )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:685:1: '.'
                    {
                     before(grammarAccess.getNAMESPACEAccess().getFullStopKeyword_2_0_1()); 
                    match(input,14,FOLLOW_14_in_rule__NAMESPACE__Alternatives_2_01419); 
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:697:1: rule__GID__Alternatives : ( ( ( rule__GID__Group_0__0 ) ) | ( ( rule__GID__Group_1__0 ) ) | ( RULE_MULTIPLEDOT ) | ( RULE_DOUBLEDOT ) );
    public final void rule__GID__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:701:1: ( ( ( rule__GID__Group_0__0 ) ) | ( ( rule__GID__Group_1__0 ) ) | ( RULE_MULTIPLEDOT ) | ( RULE_DOUBLEDOT ) )
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
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:702:1: ( ( rule__GID__Group_0__0 ) )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:702:1: ( ( rule__GID__Group_0__0 ) )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:703:1: ( rule__GID__Group_0__0 )
                    {
                     before(grammarAccess.getGIDAccess().getGroup_0()); 
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:704:1: ( rule__GID__Group_0__0 )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:704:2: rule__GID__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__GID__Group_0__0_in_rule__GID__Alternatives1453);
                    rule__GID__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGIDAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:708:6: ( ( rule__GID__Group_1__0 ) )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:708:6: ( ( rule__GID__Group_1__0 ) )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:709:1: ( rule__GID__Group_1__0 )
                    {
                     before(grammarAccess.getGIDAccess().getGroup_1()); 
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:710:1: ( rule__GID__Group_1__0 )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:710:2: rule__GID__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__GID__Group_1__0_in_rule__GID__Alternatives1471);
                    rule__GID__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGIDAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:714:6: ( RULE_MULTIPLEDOT )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:714:6: ( RULE_MULTIPLEDOT )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:715:1: RULE_MULTIPLEDOT
                    {
                     before(grammarAccess.getGIDAccess().getMultipleDotTerminalRuleCall_2()); 
                    match(input,RULE_MULTIPLEDOT,FOLLOW_RULE_MULTIPLEDOT_in_rule__GID__Alternatives1489); 
                     after(grammarAccess.getGIDAccess().getMultipleDotTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:720:6: ( RULE_DOUBLEDOT )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:720:6: ( RULE_DOUBLEDOT )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:721:1: RULE_DOUBLEDOT
                    {
                     before(grammarAccess.getGIDAccess().getDoubleDotTerminalRuleCall_3()); 
                    match(input,RULE_DOUBLEDOT,FOLLOW_RULE_DOUBLEDOT_in_rule__GID__Alternatives1506); 
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:731:1: rule__GID__Alternatives_0_0 : ( ( RULE_CID ) | ( RULE_ANY_OTHER ) | ( RULE_INT ) );
    public final void rule__GID__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:735:1: ( ( RULE_CID ) | ( RULE_ANY_OTHER ) | ( RULE_INT ) )
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
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:736:1: ( RULE_CID )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:736:1: ( RULE_CID )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:737:1: RULE_CID
                    {
                     before(grammarAccess.getGIDAccess().getCIDTerminalRuleCall_0_0_0()); 
                    match(input,RULE_CID,FOLLOW_RULE_CID_in_rule__GID__Alternatives_0_01538); 
                     after(grammarAccess.getGIDAccess().getCIDTerminalRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:742:6: ( RULE_ANY_OTHER )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:742:6: ( RULE_ANY_OTHER )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:743:1: RULE_ANY_OTHER
                    {
                     before(grammarAccess.getGIDAccess().getANY_OTHERTerminalRuleCall_0_0_1()); 
                    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_rule__GID__Alternatives_0_01555); 
                     after(grammarAccess.getGIDAccess().getANY_OTHERTerminalRuleCall_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:748:6: ( RULE_INT )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:748:6: ( RULE_INT )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:749:1: RULE_INT
                    {
                     before(grammarAccess.getGIDAccess().getINTTerminalRuleCall_0_0_2()); 
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__GID__Alternatives_0_01572); 
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:759:1: rule__SOMETHING__Alternatives : ( ( RULE_ANY_OTHER ) | ( RULE_CID ) | ( RULE_INT ) | ( ( rule__SOMETHING__Group_3__0 ) ) | ( ':' ) | ( '=' ) | ( '->' ) | ( '%' ) | ( ( rule__SOMETHING__Group_8__0 ) ) | ( RULE_MULTIPLEDOT ) | ( RULE_DOUBLEDOT ) | ( ruleWS ) );
    public final void rule__SOMETHING__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:763:1: ( ( RULE_ANY_OTHER ) | ( RULE_CID ) | ( RULE_INT ) | ( ( rule__SOMETHING__Group_3__0 ) ) | ( ':' ) | ( '=' ) | ( '->' ) | ( '%' ) | ( ( rule__SOMETHING__Group_8__0 ) ) | ( RULE_MULTIPLEDOT ) | ( RULE_DOUBLEDOT ) | ( ruleWS ) )
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
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:764:1: ( RULE_ANY_OTHER )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:764:1: ( RULE_ANY_OTHER )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:765:1: RULE_ANY_OTHER
                    {
                     before(grammarAccess.getSOMETHINGAccess().getANY_OTHERTerminalRuleCall_0()); 
                    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_rule__SOMETHING__Alternatives1604); 
                     after(grammarAccess.getSOMETHINGAccess().getANY_OTHERTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:770:6: ( RULE_CID )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:770:6: ( RULE_CID )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:771:1: RULE_CID
                    {
                     before(grammarAccess.getSOMETHINGAccess().getCIDTerminalRuleCall_1()); 
                    match(input,RULE_CID,FOLLOW_RULE_CID_in_rule__SOMETHING__Alternatives1621); 
                     after(grammarAccess.getSOMETHINGAccess().getCIDTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:776:6: ( RULE_INT )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:776:6: ( RULE_INT )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:777:1: RULE_INT
                    {
                     before(grammarAccess.getSOMETHINGAccess().getINTTerminalRuleCall_2()); 
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__SOMETHING__Alternatives1638); 
                     after(grammarAccess.getSOMETHINGAccess().getINTTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:782:6: ( ( rule__SOMETHING__Group_3__0 ) )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:782:6: ( ( rule__SOMETHING__Group_3__0 ) )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:783:1: ( rule__SOMETHING__Group_3__0 )
                    {
                     before(grammarAccess.getSOMETHINGAccess().getGroup_3()); 
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:784:1: ( rule__SOMETHING__Group_3__0 )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:784:2: rule__SOMETHING__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__SOMETHING__Group_3__0_in_rule__SOMETHING__Alternatives1655);
                    rule__SOMETHING__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSOMETHINGAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:788:6: ( ':' )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:788:6: ( ':' )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:789:1: ':'
                    {
                     before(grammarAccess.getSOMETHINGAccess().getColonKeyword_4()); 
                    match(input,15,FOLLOW_15_in_rule__SOMETHING__Alternatives1674); 
                     after(grammarAccess.getSOMETHINGAccess().getColonKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:796:6: ( '=' )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:796:6: ( '=' )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:797:1: '='
                    {
                     before(grammarAccess.getSOMETHINGAccess().getEqualsSignKeyword_5()); 
                    match(input,16,FOLLOW_16_in_rule__SOMETHING__Alternatives1694); 
                     after(grammarAccess.getSOMETHINGAccess().getEqualsSignKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:804:6: ( '->' )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:804:6: ( '->' )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:805:1: '->'
                    {
                     before(grammarAccess.getSOMETHINGAccess().getHyphenMinusGreaterThanSignKeyword_6()); 
                    match(input,17,FOLLOW_17_in_rule__SOMETHING__Alternatives1714); 
                     after(grammarAccess.getSOMETHINGAccess().getHyphenMinusGreaterThanSignKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:812:6: ( '%' )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:812:6: ( '%' )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:813:1: '%'
                    {
                     before(grammarAccess.getSOMETHINGAccess().getPercentSignKeyword_7()); 
                    match(input,18,FOLLOW_18_in_rule__SOMETHING__Alternatives1734); 
                     after(grammarAccess.getSOMETHINGAccess().getPercentSignKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:820:6: ( ( rule__SOMETHING__Group_8__0 ) )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:820:6: ( ( rule__SOMETHING__Group_8__0 ) )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:821:1: ( rule__SOMETHING__Group_8__0 )
                    {
                     before(grammarAccess.getSOMETHINGAccess().getGroup_8()); 
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:822:1: ( rule__SOMETHING__Group_8__0 )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:822:2: rule__SOMETHING__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__SOMETHING__Group_8__0_in_rule__SOMETHING__Alternatives1753);
                    rule__SOMETHING__Group_8__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSOMETHINGAccess().getGroup_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:826:6: ( RULE_MULTIPLEDOT )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:826:6: ( RULE_MULTIPLEDOT )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:827:1: RULE_MULTIPLEDOT
                    {
                     before(grammarAccess.getSOMETHINGAccess().getMultipleDotTerminalRuleCall_9()); 
                    match(input,RULE_MULTIPLEDOT,FOLLOW_RULE_MULTIPLEDOT_in_rule__SOMETHING__Alternatives1771); 
                     after(grammarAccess.getSOMETHINGAccess().getMultipleDotTerminalRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:832:6: ( RULE_DOUBLEDOT )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:832:6: ( RULE_DOUBLEDOT )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:833:1: RULE_DOUBLEDOT
                    {
                     before(grammarAccess.getSOMETHINGAccess().getDoubleDotTerminalRuleCall_10()); 
                    match(input,RULE_DOUBLEDOT,FOLLOW_RULE_DOUBLEDOT_in_rule__SOMETHING__Alternatives1788); 
                     after(grammarAccess.getSOMETHINGAccess().getDoubleDotTerminalRuleCall_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:838:6: ( ruleWS )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:838:6: ( ruleWS )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:839:1: ruleWS
                    {
                     before(grammarAccess.getSOMETHINGAccess().getWSParserRuleCall_11()); 
                    pushFollow(FOLLOW_ruleWS_in_rule__SOMETHING__Alternatives1805);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:849:1: rule__SOMETHING__Alternatives_3_1 : ( ( RULE_CID ) | ( RULE_ANY_OTHER ) );
    public final void rule__SOMETHING__Alternatives_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:853:1: ( ( RULE_CID ) | ( RULE_ANY_OTHER ) )
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
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:854:1: ( RULE_CID )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:854:1: ( RULE_CID )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:855:1: RULE_CID
                    {
                     before(grammarAccess.getSOMETHINGAccess().getCIDTerminalRuleCall_3_1_0()); 
                    match(input,RULE_CID,FOLLOW_RULE_CID_in_rule__SOMETHING__Alternatives_3_11837); 
                     after(grammarAccess.getSOMETHINGAccess().getCIDTerminalRuleCall_3_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:860:6: ( RULE_ANY_OTHER )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:860:6: ( RULE_ANY_OTHER )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:861:1: RULE_ANY_OTHER
                    {
                     before(grammarAccess.getSOMETHINGAccess().getANY_OTHERTerminalRuleCall_3_1_1()); 
                    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_rule__SOMETHING__Alternatives_3_11854); 
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:871:1: rule__SOMETHING2__Alternatives : ( ( RULE_ANY_OTHER ) | ( RULE_CID ) | ( RULE_INT ) | ( '.' ) | ( ':' ) | ( '=' ) | ( '->' ) | ( '%' ) | ( ( rule__SOMETHING2__Group_8__0 ) ) | ( RULE_MULTIPLEDOT ) | ( RULE_DOUBLEDOT ) | ( ruleWS ) );
    public final void rule__SOMETHING2__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:875:1: ( ( RULE_ANY_OTHER ) | ( RULE_CID ) | ( RULE_INT ) | ( '.' ) | ( ':' ) | ( '=' ) | ( '->' ) | ( '%' ) | ( ( rule__SOMETHING2__Group_8__0 ) ) | ( RULE_MULTIPLEDOT ) | ( RULE_DOUBLEDOT ) | ( ruleWS ) )
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
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:876:1: ( RULE_ANY_OTHER )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:876:1: ( RULE_ANY_OTHER )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:877:1: RULE_ANY_OTHER
                    {
                     before(grammarAccess.getSOMETHING2Access().getANY_OTHERTerminalRuleCall_0()); 
                    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_rule__SOMETHING2__Alternatives1886); 
                     after(grammarAccess.getSOMETHING2Access().getANY_OTHERTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:882:6: ( RULE_CID )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:882:6: ( RULE_CID )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:883:1: RULE_CID
                    {
                     before(grammarAccess.getSOMETHING2Access().getCIDTerminalRuleCall_1()); 
                    match(input,RULE_CID,FOLLOW_RULE_CID_in_rule__SOMETHING2__Alternatives1903); 
                     after(grammarAccess.getSOMETHING2Access().getCIDTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:888:6: ( RULE_INT )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:888:6: ( RULE_INT )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:889:1: RULE_INT
                    {
                     before(grammarAccess.getSOMETHING2Access().getINTTerminalRuleCall_2()); 
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__SOMETHING2__Alternatives1920); 
                     after(grammarAccess.getSOMETHING2Access().getINTTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:894:6: ( '.' )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:894:6: ( '.' )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:895:1: '.'
                    {
                     before(grammarAccess.getSOMETHING2Access().getFullStopKeyword_3()); 
                    match(input,14,FOLLOW_14_in_rule__SOMETHING2__Alternatives1938); 
                     after(grammarAccess.getSOMETHING2Access().getFullStopKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:902:6: ( ':' )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:902:6: ( ':' )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:903:1: ':'
                    {
                     before(grammarAccess.getSOMETHING2Access().getColonKeyword_4()); 
                    match(input,15,FOLLOW_15_in_rule__SOMETHING2__Alternatives1958); 
                     after(grammarAccess.getSOMETHING2Access().getColonKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:910:6: ( '=' )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:910:6: ( '=' )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:911:1: '='
                    {
                     before(grammarAccess.getSOMETHING2Access().getEqualsSignKeyword_5()); 
                    match(input,16,FOLLOW_16_in_rule__SOMETHING2__Alternatives1978); 
                     after(grammarAccess.getSOMETHING2Access().getEqualsSignKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:918:6: ( '->' )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:918:6: ( '->' )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:919:1: '->'
                    {
                     before(grammarAccess.getSOMETHING2Access().getHyphenMinusGreaterThanSignKeyword_6()); 
                    match(input,17,FOLLOW_17_in_rule__SOMETHING2__Alternatives1998); 
                     after(grammarAccess.getSOMETHING2Access().getHyphenMinusGreaterThanSignKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:926:6: ( '%' )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:926:6: ( '%' )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:927:1: '%'
                    {
                     before(grammarAccess.getSOMETHING2Access().getPercentSignKeyword_7()); 
                    match(input,18,FOLLOW_18_in_rule__SOMETHING2__Alternatives2018); 
                     after(grammarAccess.getSOMETHING2Access().getPercentSignKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:934:6: ( ( rule__SOMETHING2__Group_8__0 ) )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:934:6: ( ( rule__SOMETHING2__Group_8__0 ) )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:935:1: ( rule__SOMETHING2__Group_8__0 )
                    {
                     before(grammarAccess.getSOMETHING2Access().getGroup_8()); 
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:936:1: ( rule__SOMETHING2__Group_8__0 )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:936:2: rule__SOMETHING2__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__SOMETHING2__Group_8__0_in_rule__SOMETHING2__Alternatives2037);
                    rule__SOMETHING2__Group_8__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSOMETHING2Access().getGroup_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:940:6: ( RULE_MULTIPLEDOT )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:940:6: ( RULE_MULTIPLEDOT )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:941:1: RULE_MULTIPLEDOT
                    {
                     before(grammarAccess.getSOMETHING2Access().getMultipleDotTerminalRuleCall_9()); 
                    match(input,RULE_MULTIPLEDOT,FOLLOW_RULE_MULTIPLEDOT_in_rule__SOMETHING2__Alternatives2055); 
                     after(grammarAccess.getSOMETHING2Access().getMultipleDotTerminalRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:946:6: ( RULE_DOUBLEDOT )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:946:6: ( RULE_DOUBLEDOT )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:947:1: RULE_DOUBLEDOT
                    {
                     before(grammarAccess.getSOMETHING2Access().getDoubleDotTerminalRuleCall_10()); 
                    match(input,RULE_DOUBLEDOT,FOLLOW_RULE_DOUBLEDOT_in_rule__SOMETHING2__Alternatives2072); 
                     after(grammarAccess.getSOMETHING2Access().getDoubleDotTerminalRuleCall_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:952:6: ( ruleWS )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:952:6: ( ruleWS )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:953:1: ruleWS
                    {
                     before(grammarAccess.getSOMETHING2Access().getWSParserRuleCall_11()); 
                    pushFollow(FOLLOW_ruleWS_in_rule__SOMETHING2__Alternatives2089);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:964:1: rule__SigConstruct__Alternatives : ( ( ruleclassicSymbolConstruct ) | ( ruleincludeConstruct ) | ( rulestructConstruct ) | ( ( rule__SigConstruct__Group_3__0 ) ) );
    public final void rule__SigConstruct__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:968:1: ( ( ruleclassicSymbolConstruct ) | ( ruleincludeConstruct ) | ( rulestructConstruct ) | ( ( rule__SigConstruct__Group_3__0 ) ) )
            int alt10=4;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_MULTIPLEDOT && LA10_0<=RULE_INT)||LA10_0==16) ) {
                alt10=1;
            }
            else if ( (LA10_0==18) ) {
                switch ( input.LA(2) ) {
                case 34:
                    {
                    alt10=3;
                    }
                    break;
                case 33:
                    {
                    alt10=2;
                    }
                    break;
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                    {
                    alt10=4;
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
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:969:1: ( ruleclassicSymbolConstruct )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:969:1: ( ruleclassicSymbolConstruct )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:970:1: ruleclassicSymbolConstruct
                    {
                     before(grammarAccess.getSigConstructAccess().getClassicSymbolConstructParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleclassicSymbolConstruct_in_rule__SigConstruct__Alternatives2122);
                    ruleclassicSymbolConstruct();

                    state._fsp--;

                     after(grammarAccess.getSigConstructAccess().getClassicSymbolConstructParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:975:6: ( ruleincludeConstruct )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:975:6: ( ruleincludeConstruct )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:976:1: ruleincludeConstruct
                    {
                     before(grammarAccess.getSigConstructAccess().getIncludeConstructParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleincludeConstruct_in_rule__SigConstruct__Alternatives2139);
                    ruleincludeConstruct();

                    state._fsp--;

                     after(grammarAccess.getSigConstructAccess().getIncludeConstructParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:981:6: ( rulestructConstruct )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:981:6: ( rulestructConstruct )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:982:1: rulestructConstruct
                    {
                     before(grammarAccess.getSigConstructAccess().getStructConstructParserRuleCall_2()); 
                    pushFollow(FOLLOW_rulestructConstruct_in_rule__SigConstruct__Alternatives2156);
                    rulestructConstruct();

                    state._fsp--;

                     after(grammarAccess.getSigConstructAccess().getStructConstructParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:987:6: ( ( rule__SigConstruct__Group_3__0 ) )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:987:6: ( ( rule__SigConstruct__Group_3__0 ) )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:988:1: ( rule__SigConstruct__Group_3__0 )
                    {
                     before(grammarAccess.getSigConstructAccess().getGroup_3()); 
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:989:1: ( rule__SigConstruct__Group_3__0 )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:989:2: rule__SigConstruct__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__SigConstruct__Group_3__0_in_rule__SigConstruct__Alternatives2173);
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


    // $ANTLR start "rule__SigConstruct__TmpAlternatives_3_1_0"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:998:1: rule__SigConstruct__TmpAlternatives_3_1_0 : ( ( 'meta' ) | ( 'abbrev' ) | ( 'name' ) | ( 'pattern' ) | ( 'infix' ) | ( 'prefix' ) | ( 'postfix' ) );
    public final void rule__SigConstruct__TmpAlternatives_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1002:1: ( ( 'meta' ) | ( 'abbrev' ) | ( 'name' ) | ( 'pattern' ) | ( 'infix' ) | ( 'prefix' ) | ( 'postfix' ) )
            int alt11=7;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt11=1;
                }
                break;
            case 20:
                {
                alt11=2;
                }
                break;
            case 21:
                {
                alt11=3;
                }
                break;
            case 22:
                {
                alt11=4;
                }
                break;
            case 23:
                {
                alt11=5;
                }
                break;
            case 24:
                {
                alt11=6;
                }
                break;
            case 25:
                {
                alt11=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1003:1: ( 'meta' )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1003:1: ( 'meta' )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1004:1: 'meta'
                    {
                     before(grammarAccess.getSigConstructAccess().getTmpMetaKeyword_3_1_0_0()); 
                    match(input,19,FOLLOW_19_in_rule__SigConstruct__TmpAlternatives_3_1_02207); 
                     after(grammarAccess.getSigConstructAccess().getTmpMetaKeyword_3_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1011:6: ( 'abbrev' )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1011:6: ( 'abbrev' )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1012:1: 'abbrev'
                    {
                     before(grammarAccess.getSigConstructAccess().getTmpAbbrevKeyword_3_1_0_1()); 
                    match(input,20,FOLLOW_20_in_rule__SigConstruct__TmpAlternatives_3_1_02227); 
                     after(grammarAccess.getSigConstructAccess().getTmpAbbrevKeyword_3_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1019:6: ( 'name' )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1019:6: ( 'name' )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1020:1: 'name'
                    {
                     before(grammarAccess.getSigConstructAccess().getTmpNameKeyword_3_1_0_2()); 
                    match(input,21,FOLLOW_21_in_rule__SigConstruct__TmpAlternatives_3_1_02247); 
                     after(grammarAccess.getSigConstructAccess().getTmpNameKeyword_3_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1027:6: ( 'pattern' )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1027:6: ( 'pattern' )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1028:1: 'pattern'
                    {
                     before(grammarAccess.getSigConstructAccess().getTmpPatternKeyword_3_1_0_3()); 
                    match(input,22,FOLLOW_22_in_rule__SigConstruct__TmpAlternatives_3_1_02267); 
                     after(grammarAccess.getSigConstructAccess().getTmpPatternKeyword_3_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1035:6: ( 'infix' )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1035:6: ( 'infix' )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1036:1: 'infix'
                    {
                     before(grammarAccess.getSigConstructAccess().getTmpInfixKeyword_3_1_0_4()); 
                    match(input,23,FOLLOW_23_in_rule__SigConstruct__TmpAlternatives_3_1_02287); 
                     after(grammarAccess.getSigConstructAccess().getTmpInfixKeyword_3_1_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1043:6: ( 'prefix' )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1043:6: ( 'prefix' )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1044:1: 'prefix'
                    {
                     before(grammarAccess.getSigConstructAccess().getTmpPrefixKeyword_3_1_0_5()); 
                    match(input,24,FOLLOW_24_in_rule__SigConstruct__TmpAlternatives_3_1_02307); 
                     after(grammarAccess.getSigConstructAccess().getTmpPrefixKeyword_3_1_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1051:6: ( 'postfix' )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1051:6: ( 'postfix' )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1052:1: 'postfix'
                    {
                     before(grammarAccess.getSigConstructAccess().getTmpPostfixKeyword_3_1_0_6()); 
                    match(input,25,FOLLOW_25_in_rule__SigConstruct__TmpAlternatives_3_1_02327); 
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


    // $ANTLR start "rule__ClassicSymbolConstruct__Alternatives_2"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1064:1: rule__ClassicSymbolConstruct__Alternatives_2 : ( ( ':' ) | ( ':=' ) | ( '=' ) );
    public final void rule__ClassicSymbolConstruct__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1068:1: ( ( ':' ) | ( ':=' ) | ( '=' ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt12=1;
                }
                break;
            case 26:
                {
                alt12=2;
                }
                break;
            case 16:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1069:1: ( ':' )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1069:1: ( ':' )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1070:1: ':'
                    {
                     before(grammarAccess.getClassicSymbolConstructAccess().getColonKeyword_2_0()); 
                    match(input,15,FOLLOW_15_in_rule__ClassicSymbolConstruct__Alternatives_22362); 
                     after(grammarAccess.getClassicSymbolConstructAccess().getColonKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1077:6: ( ':=' )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1077:6: ( ':=' )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1078:1: ':='
                    {
                     before(grammarAccess.getClassicSymbolConstructAccess().getColonEqualsSignKeyword_2_1()); 
                    match(input,26,FOLLOW_26_in_rule__ClassicSymbolConstruct__Alternatives_22382); 
                     after(grammarAccess.getClassicSymbolConstructAccess().getColonEqualsSignKeyword_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1085:6: ( '=' )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1085:6: ( '=' )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1086:1: '='
                    {
                     before(grammarAccess.getClassicSymbolConstructAccess().getEqualsSignKeyword_2_2()); 
                    match(input,16,FOLLOW_16_in_rule__ClassicSymbolConstruct__Alternatives_22402); 
                     after(grammarAccess.getClassicSymbolConstructAccess().getEqualsSignKeyword_2_2()); 

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
    // $ANTLR end "rule__ClassicSymbolConstruct__Alternatives_2"


    // $ANTLR start "rule__StructConstruct__Alternatives_5"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1098:1: rule__StructConstruct__Alternatives_5 : ( ( ':' ) | ( ':=' ) );
    public final void rule__StructConstruct__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1102:1: ( ( ':' ) | ( ':=' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==15) ) {
                alt13=1;
            }
            else if ( (LA13_0==26) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1103:1: ( ':' )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1103:1: ( ':' )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1104:1: ':'
                    {
                     before(grammarAccess.getStructConstructAccess().getColonKeyword_5_0()); 
                    match(input,15,FOLLOW_15_in_rule__StructConstruct__Alternatives_52437); 
                     after(grammarAccess.getStructConstructAccess().getColonKeyword_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1111:6: ( ':=' )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1111:6: ( ':=' )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1112:1: ':='
                    {
                     before(grammarAccess.getStructConstructAccess().getColonEqualsSignKeyword_5_1()); 
                    match(input,26,FOLLOW_26_in_rule__StructConstruct__Alternatives_52457); 
                     after(grammarAccess.getStructConstructAccess().getColonEqualsSignKeyword_5_1()); 

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
    // $ANTLR end "rule__StructConstruct__Alternatives_5"


    // $ANTLR start "rule__NAMESPACE__Group__0"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1127:1: rule__NAMESPACE__Group__0 : rule__NAMESPACE__Group__0__Impl rule__NAMESPACE__Group__1 ;
    public final void rule__NAMESPACE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1131:1: ( rule__NAMESPACE__Group__0__Impl rule__NAMESPACE__Group__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1132:2: rule__NAMESPACE__Group__0__Impl rule__NAMESPACE__Group__1
            {
            pushFollow(FOLLOW_rule__NAMESPACE__Group__0__Impl_in_rule__NAMESPACE__Group__02490);
            rule__NAMESPACE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NAMESPACE__Group__1_in_rule__NAMESPACE__Group__02493);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1139:1: rule__NAMESPACE__Group__0__Impl : ( ( rule__NAMESPACE__Group_0__0 )* ) ;
    public final void rule__NAMESPACE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1143:1: ( ( ( rule__NAMESPACE__Group_0__0 )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1144:1: ( ( rule__NAMESPACE__Group_0__0 )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1144:1: ( ( rule__NAMESPACE__Group_0__0 )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1145:1: ( rule__NAMESPACE__Group_0__0 )*
            {
             before(grammarAccess.getNAMESPACEAccess().getGroup_0()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1146:1: ( rule__NAMESPACE__Group_0__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_DOUBLEDOT) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1146:2: rule__NAMESPACE__Group_0__0
            	    {
            	    pushFollow(FOLLOW_rule__NAMESPACE__Group_0__0_in_rule__NAMESPACE__Group__0__Impl2520);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1156:1: rule__NAMESPACE__Group__1 : rule__NAMESPACE__Group__1__Impl rule__NAMESPACE__Group__2 ;
    public final void rule__NAMESPACE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1160:1: ( rule__NAMESPACE__Group__1__Impl rule__NAMESPACE__Group__2 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1161:2: rule__NAMESPACE__Group__1__Impl rule__NAMESPACE__Group__2
            {
            pushFollow(FOLLOW_rule__NAMESPACE__Group__1__Impl_in_rule__NAMESPACE__Group__12551);
            rule__NAMESPACE__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NAMESPACE__Group__2_in_rule__NAMESPACE__Group__12554);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1168:1: rule__NAMESPACE__Group__1__Impl : ( RULE_CID ) ;
    public final void rule__NAMESPACE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1172:1: ( ( RULE_CID ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1173:1: ( RULE_CID )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1173:1: ( RULE_CID )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1174:1: RULE_CID
            {
             before(grammarAccess.getNAMESPACEAccess().getCIDTerminalRuleCall_1()); 
            match(input,RULE_CID,FOLLOW_RULE_CID_in_rule__NAMESPACE__Group__1__Impl2581); 
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1185:1: rule__NAMESPACE__Group__2 : rule__NAMESPACE__Group__2__Impl ;
    public final void rule__NAMESPACE__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1189:1: ( rule__NAMESPACE__Group__2__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1190:2: rule__NAMESPACE__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__NAMESPACE__Group__2__Impl_in_rule__NAMESPACE__Group__22610);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1196:1: rule__NAMESPACE__Group__2__Impl : ( ( rule__NAMESPACE__Group_2__0 )* ) ;
    public final void rule__NAMESPACE__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1200:1: ( ( ( rule__NAMESPACE__Group_2__0 )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1201:1: ( ( rule__NAMESPACE__Group_2__0 )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1201:1: ( ( rule__NAMESPACE__Group_2__0 )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1202:1: ( rule__NAMESPACE__Group_2__0 )*
            {
             before(grammarAccess.getNAMESPACEAccess().getGroup_2()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1203:1: ( rule__NAMESPACE__Group_2__0 )*
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
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1203:2: rule__NAMESPACE__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__NAMESPACE__Group_2__0_in_rule__NAMESPACE__Group__2__Impl2637);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1219:1: rule__NAMESPACE__Group_0__0 : rule__NAMESPACE__Group_0__0__Impl rule__NAMESPACE__Group_0__1 ;
    public final void rule__NAMESPACE__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1223:1: ( rule__NAMESPACE__Group_0__0__Impl rule__NAMESPACE__Group_0__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1224:2: rule__NAMESPACE__Group_0__0__Impl rule__NAMESPACE__Group_0__1
            {
            pushFollow(FOLLOW_rule__NAMESPACE__Group_0__0__Impl_in_rule__NAMESPACE__Group_0__02674);
            rule__NAMESPACE__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NAMESPACE__Group_0__1_in_rule__NAMESPACE__Group_0__02677);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1231:1: rule__NAMESPACE__Group_0__0__Impl : ( RULE_DOUBLEDOT ) ;
    public final void rule__NAMESPACE__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1235:1: ( ( RULE_DOUBLEDOT ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1236:1: ( RULE_DOUBLEDOT )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1236:1: ( RULE_DOUBLEDOT )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1237:1: RULE_DOUBLEDOT
            {
             before(grammarAccess.getNAMESPACEAccess().getDoubleDotTerminalRuleCall_0_0()); 
            match(input,RULE_DOUBLEDOT,FOLLOW_RULE_DOUBLEDOT_in_rule__NAMESPACE__Group_0__0__Impl2704); 
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1248:1: rule__NAMESPACE__Group_0__1 : rule__NAMESPACE__Group_0__1__Impl ;
    public final void rule__NAMESPACE__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1252:1: ( rule__NAMESPACE__Group_0__1__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1253:2: rule__NAMESPACE__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__NAMESPACE__Group_0__1__Impl_in_rule__NAMESPACE__Group_0__12733);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1259:1: rule__NAMESPACE__Group_0__1__Impl : ( '/' ) ;
    public final void rule__NAMESPACE__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1263:1: ( ( '/' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1264:1: ( '/' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1264:1: ( '/' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1265:1: '/'
            {
             before(grammarAccess.getNAMESPACEAccess().getSolidusKeyword_0_1()); 
            match(input,13,FOLLOW_13_in_rule__NAMESPACE__Group_0__1__Impl2761); 
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1282:1: rule__NAMESPACE__Group_2__0 : rule__NAMESPACE__Group_2__0__Impl rule__NAMESPACE__Group_2__1 ;
    public final void rule__NAMESPACE__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1286:1: ( rule__NAMESPACE__Group_2__0__Impl rule__NAMESPACE__Group_2__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1287:2: rule__NAMESPACE__Group_2__0__Impl rule__NAMESPACE__Group_2__1
            {
            pushFollow(FOLLOW_rule__NAMESPACE__Group_2__0__Impl_in_rule__NAMESPACE__Group_2__02796);
            rule__NAMESPACE__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NAMESPACE__Group_2__1_in_rule__NAMESPACE__Group_2__02799);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1294:1: rule__NAMESPACE__Group_2__0__Impl : ( ( rule__NAMESPACE__Alternatives_2_0 ) ) ;
    public final void rule__NAMESPACE__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1298:1: ( ( ( rule__NAMESPACE__Alternatives_2_0 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1299:1: ( ( rule__NAMESPACE__Alternatives_2_0 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1299:1: ( ( rule__NAMESPACE__Alternatives_2_0 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1300:1: ( rule__NAMESPACE__Alternatives_2_0 )
            {
             before(grammarAccess.getNAMESPACEAccess().getAlternatives_2_0()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1301:1: ( rule__NAMESPACE__Alternatives_2_0 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1301:2: rule__NAMESPACE__Alternatives_2_0
            {
            pushFollow(FOLLOW_rule__NAMESPACE__Alternatives_2_0_in_rule__NAMESPACE__Group_2__0__Impl2826);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1311:1: rule__NAMESPACE__Group_2__1 : rule__NAMESPACE__Group_2__1__Impl ;
    public final void rule__NAMESPACE__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1315:1: ( rule__NAMESPACE__Group_2__1__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1316:2: rule__NAMESPACE__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__NAMESPACE__Group_2__1__Impl_in_rule__NAMESPACE__Group_2__12856);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1322:1: rule__NAMESPACE__Group_2__1__Impl : ( RULE_CID ) ;
    public final void rule__NAMESPACE__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1326:1: ( ( RULE_CID ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1327:1: ( RULE_CID )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1327:1: ( RULE_CID )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1328:1: RULE_CID
            {
             before(grammarAccess.getNAMESPACEAccess().getCIDTerminalRuleCall_2_1()); 
            match(input,RULE_CID,FOLLOW_RULE_CID_in_rule__NAMESPACE__Group_2__1__Impl2883); 
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1343:1: rule__URI__Group__0 : rule__URI__Group__0__Impl rule__URI__Group__1 ;
    public final void rule__URI__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1347:1: ( rule__URI__Group__0__Impl rule__URI__Group__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1348:2: rule__URI__Group__0__Impl rule__URI__Group__1
            {
            pushFollow(FOLLOW_rule__URI__Group__0__Impl_in_rule__URI__Group__02916);
            rule__URI__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URI__Group__1_in_rule__URI__Group__02919);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1355:1: rule__URI__Group__0__Impl : ( ( rule__URI__Group_0__0 )? ) ;
    public final void rule__URI__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1359:1: ( ( ( rule__URI__Group_0__0 )? ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1360:1: ( ( rule__URI__Group_0__0 )? )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1360:1: ( ( rule__URI__Group_0__0 )? )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1361:1: ( rule__URI__Group_0__0 )?
            {
             before(grammarAccess.getURIAccess().getGroup_0()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1362:1: ( rule__URI__Group_0__0 )?
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
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1362:2: rule__URI__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__URI__Group_0__0_in_rule__URI__Group__0__Impl2946);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1372:1: rule__URI__Group__1 : rule__URI__Group__1__Impl ;
    public final void rule__URI__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1376:1: ( rule__URI__Group__1__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1377:2: rule__URI__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__URI__Group__1__Impl_in_rule__URI__Group__12977);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1383:1: rule__URI__Group__1__Impl : ( ruleNAMESPACE ) ;
    public final void rule__URI__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1387:1: ( ( ruleNAMESPACE ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1388:1: ( ruleNAMESPACE )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1388:1: ( ruleNAMESPACE )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1389:1: ruleNAMESPACE
            {
             before(grammarAccess.getURIAccess().getNAMESPACEParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleNAMESPACE_in_rule__URI__Group__1__Impl3004);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1404:1: rule__URI__Group_0__0 : rule__URI__Group_0__0__Impl rule__URI__Group_0__1 ;
    public final void rule__URI__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1408:1: ( rule__URI__Group_0__0__Impl rule__URI__Group_0__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1409:2: rule__URI__Group_0__0__Impl rule__URI__Group_0__1
            {
            pushFollow(FOLLOW_rule__URI__Group_0__0__Impl_in_rule__URI__Group_0__03037);
            rule__URI__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URI__Group_0__1_in_rule__URI__Group_0__03040);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1416:1: rule__URI__Group_0__0__Impl : ( RULE_CID ) ;
    public final void rule__URI__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1420:1: ( ( RULE_CID ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1421:1: ( RULE_CID )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1421:1: ( RULE_CID )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1422:1: RULE_CID
            {
             before(grammarAccess.getURIAccess().getCIDTerminalRuleCall_0_0()); 
            match(input,RULE_CID,FOLLOW_RULE_CID_in_rule__URI__Group_0__0__Impl3067); 
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1433:1: rule__URI__Group_0__1 : rule__URI__Group_0__1__Impl rule__URI__Group_0__2 ;
    public final void rule__URI__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1437:1: ( rule__URI__Group_0__1__Impl rule__URI__Group_0__2 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1438:2: rule__URI__Group_0__1__Impl rule__URI__Group_0__2
            {
            pushFollow(FOLLOW_rule__URI__Group_0__1__Impl_in_rule__URI__Group_0__13096);
            rule__URI__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URI__Group_0__2_in_rule__URI__Group_0__13099);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1445:1: rule__URI__Group_0__1__Impl : ( ':' ) ;
    public final void rule__URI__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1449:1: ( ( ':' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1450:1: ( ':' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1450:1: ( ':' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1451:1: ':'
            {
             before(grammarAccess.getURIAccess().getColonKeyword_0_1()); 
            match(input,15,FOLLOW_15_in_rule__URI__Group_0__1__Impl3127); 
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1464:1: rule__URI__Group_0__2 : rule__URI__Group_0__2__Impl rule__URI__Group_0__3 ;
    public final void rule__URI__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1468:1: ( rule__URI__Group_0__2__Impl rule__URI__Group_0__3 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1469:2: rule__URI__Group_0__2__Impl rule__URI__Group_0__3
            {
            pushFollow(FOLLOW_rule__URI__Group_0__2__Impl_in_rule__URI__Group_0__23158);
            rule__URI__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URI__Group_0__3_in_rule__URI__Group_0__23161);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1476:1: rule__URI__Group_0__2__Impl : ( '/' ) ;
    public final void rule__URI__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1480:1: ( ( '/' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1481:1: ( '/' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1481:1: ( '/' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1482:1: '/'
            {
             before(grammarAccess.getURIAccess().getSolidusKeyword_0_2()); 
            match(input,13,FOLLOW_13_in_rule__URI__Group_0__2__Impl3189); 
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1495:1: rule__URI__Group_0__3 : rule__URI__Group_0__3__Impl ;
    public final void rule__URI__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1499:1: ( rule__URI__Group_0__3__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1500:2: rule__URI__Group_0__3__Impl
            {
            pushFollow(FOLLOW_rule__URI__Group_0__3__Impl_in_rule__URI__Group_0__33220);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1506:1: rule__URI__Group_0__3__Impl : ( '/' ) ;
    public final void rule__URI__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1510:1: ( ( '/' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1511:1: ( '/' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1511:1: ( '/' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1512:1: '/'
            {
             before(grammarAccess.getURIAccess().getSolidusKeyword_0_3()); 
            match(input,13,FOLLOW_13_in_rule__URI__Group_0__3__Impl3248); 
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1533:1: rule__URISTRING__Group__0 : rule__URISTRING__Group__0__Impl rule__URISTRING__Group__1 ;
    public final void rule__URISTRING__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1537:1: ( rule__URISTRING__Group__0__Impl rule__URISTRING__Group__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1538:2: rule__URISTRING__Group__0__Impl rule__URISTRING__Group__1
            {
            pushFollow(FOLLOW_rule__URISTRING__Group__0__Impl_in_rule__URISTRING__Group__03287);
            rule__URISTRING__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URISTRING__Group__1_in_rule__URISTRING__Group__03290);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1545:1: rule__URISTRING__Group__0__Impl : ( '\"' ) ;
    public final void rule__URISTRING__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1549:1: ( ( '\"' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1550:1: ( '\"' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1550:1: ( '\"' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1551:1: '\"'
            {
             before(grammarAccess.getURISTRINGAccess().getQuotationMarkKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__URISTRING__Group__0__Impl3318); 
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1564:1: rule__URISTRING__Group__1 : rule__URISTRING__Group__1__Impl rule__URISTRING__Group__2 ;
    public final void rule__URISTRING__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1568:1: ( rule__URISTRING__Group__1__Impl rule__URISTRING__Group__2 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1569:2: rule__URISTRING__Group__1__Impl rule__URISTRING__Group__2
            {
            pushFollow(FOLLOW_rule__URISTRING__Group__1__Impl_in_rule__URISTRING__Group__13349);
            rule__URISTRING__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URISTRING__Group__2_in_rule__URISTRING__Group__13352);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1576:1: rule__URISTRING__Group__1__Impl : ( ruleURI ) ;
    public final void rule__URISTRING__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1580:1: ( ( ruleURI ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1581:1: ( ruleURI )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1581:1: ( ruleURI )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1582:1: ruleURI
            {
             before(grammarAccess.getURISTRINGAccess().getURIParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleURI_in_rule__URISTRING__Group__1__Impl3379);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1593:1: rule__URISTRING__Group__2 : rule__URISTRING__Group__2__Impl ;
    public final void rule__URISTRING__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1597:1: ( rule__URISTRING__Group__2__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1598:2: rule__URISTRING__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__URISTRING__Group__2__Impl_in_rule__URISTRING__Group__23408);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1604:1: rule__URISTRING__Group__2__Impl : ( '\"' ) ;
    public final void rule__URISTRING__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1608:1: ( ( '\"' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1609:1: ( '\"' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1609:1: ( '\"' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1610:1: '\"'
            {
             before(grammarAccess.getURISTRINGAccess().getQuotationMarkKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__URISTRING__Group__2__Impl3436); 
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1629:1: rule__NamespaceDeclaration__Group__0 : rule__NamespaceDeclaration__Group__0__Impl rule__NamespaceDeclaration__Group__1 ;
    public final void rule__NamespaceDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1633:1: ( rule__NamespaceDeclaration__Group__0__Impl rule__NamespaceDeclaration__Group__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1634:2: rule__NamespaceDeclaration__Group__0__Impl rule__NamespaceDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group__0__Impl_in_rule__NamespaceDeclaration__Group__03473);
            rule__NamespaceDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group__1_in_rule__NamespaceDeclaration__Group__03476);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1641:1: rule__NamespaceDeclaration__Group__0__Impl : ( '%' ) ;
    public final void rule__NamespaceDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1645:1: ( ( '%' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1646:1: ( '%' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1646:1: ( '%' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1647:1: '%'
            {
             before(grammarAccess.getNamespaceDeclarationAccess().getPercentSignKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__NamespaceDeclaration__Group__0__Impl3504); 
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1660:1: rule__NamespaceDeclaration__Group__1 : rule__NamespaceDeclaration__Group__1__Impl rule__NamespaceDeclaration__Group__2 ;
    public final void rule__NamespaceDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1664:1: ( rule__NamespaceDeclaration__Group__1__Impl rule__NamespaceDeclaration__Group__2 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1665:2: rule__NamespaceDeclaration__Group__1__Impl rule__NamespaceDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group__1__Impl_in_rule__NamespaceDeclaration__Group__13535);
            rule__NamespaceDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group__2_in_rule__NamespaceDeclaration__Group__13538);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1672:1: rule__NamespaceDeclaration__Group__1__Impl : ( 'namespace' ) ;
    public final void rule__NamespaceDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1676:1: ( ( 'namespace' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1677:1: ( 'namespace' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1677:1: ( 'namespace' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1678:1: 'namespace'
            {
             before(grammarAccess.getNamespaceDeclarationAccess().getNamespaceKeyword_1()); 
            match(input,28,FOLLOW_28_in_rule__NamespaceDeclaration__Group__1__Impl3566); 
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1691:1: rule__NamespaceDeclaration__Group__2 : rule__NamespaceDeclaration__Group__2__Impl rule__NamespaceDeclaration__Group__3 ;
    public final void rule__NamespaceDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1695:1: ( rule__NamespaceDeclaration__Group__2__Impl rule__NamespaceDeclaration__Group__3 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1696:2: rule__NamespaceDeclaration__Group__2__Impl rule__NamespaceDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group__2__Impl_in_rule__NamespaceDeclaration__Group__23597);
            rule__NamespaceDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group__3_in_rule__NamespaceDeclaration__Group__23600);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1703:1: rule__NamespaceDeclaration__Group__2__Impl : ( ( ( ruleWS ) ) ( ( ruleWS )* ) ) ;
    public final void rule__NamespaceDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1707:1: ( ( ( ( ruleWS ) ) ( ( ruleWS )* ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1708:1: ( ( ( ruleWS ) ) ( ( ruleWS )* ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1708:1: ( ( ( ruleWS ) ) ( ( ruleWS )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1709:1: ( ( ruleWS ) ) ( ( ruleWS )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1709:1: ( ( ruleWS ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1710:1: ( ruleWS )
            {
             before(grammarAccess.getNamespaceDeclarationAccess().getWSParserRuleCall_2()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1711:1: ( ruleWS )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1711:3: ruleWS
            {
            pushFollow(FOLLOW_ruleWS_in_rule__NamespaceDeclaration__Group__2__Impl3630);
            ruleWS();

            state._fsp--;


            }

             after(grammarAccess.getNamespaceDeclarationAccess().getWSParserRuleCall_2()); 

            }

            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1714:1: ( ( ruleWS )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1715:1: ( ruleWS )*
            {
             before(grammarAccess.getNamespaceDeclarationAccess().getWSParserRuleCall_2()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1716:1: ( ruleWS )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_SP && LA17_0<=RULE_SL_COMMENT)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1716:3: ruleWS
            	    {
            	    pushFollow(FOLLOW_ruleWS_in_rule__NamespaceDeclaration__Group__2__Impl3643);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1727:1: rule__NamespaceDeclaration__Group__3 : rule__NamespaceDeclaration__Group__3__Impl rule__NamespaceDeclaration__Group__4 ;
    public final void rule__NamespaceDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1731:1: ( rule__NamespaceDeclaration__Group__3__Impl rule__NamespaceDeclaration__Group__4 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1732:2: rule__NamespaceDeclaration__Group__3__Impl rule__NamespaceDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group__3__Impl_in_rule__NamespaceDeclaration__Group__33676);
            rule__NamespaceDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group__4_in_rule__NamespaceDeclaration__Group__33679);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1739:1: rule__NamespaceDeclaration__Group__3__Impl : ( ( rule__NamespaceDeclaration__Group_3__0 )? ) ;
    public final void rule__NamespaceDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1743:1: ( ( ( rule__NamespaceDeclaration__Group_3__0 )? ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1744:1: ( ( rule__NamespaceDeclaration__Group_3__0 )? )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1744:1: ( ( rule__NamespaceDeclaration__Group_3__0 )? )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1745:1: ( rule__NamespaceDeclaration__Group_3__0 )?
            {
             before(grammarAccess.getNamespaceDeclarationAccess().getGroup_3()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1746:1: ( rule__NamespaceDeclaration__Group_3__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_CID) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1746:2: rule__NamespaceDeclaration__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__NamespaceDeclaration__Group_3__0_in_rule__NamespaceDeclaration__Group__3__Impl3706);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1756:1: rule__NamespaceDeclaration__Group__4 : rule__NamespaceDeclaration__Group__4__Impl rule__NamespaceDeclaration__Group__5 ;
    public final void rule__NamespaceDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1760:1: ( rule__NamespaceDeclaration__Group__4__Impl rule__NamespaceDeclaration__Group__5 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1761:2: rule__NamespaceDeclaration__Group__4__Impl rule__NamespaceDeclaration__Group__5
            {
            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group__4__Impl_in_rule__NamespaceDeclaration__Group__43737);
            rule__NamespaceDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group__5_in_rule__NamespaceDeclaration__Group__43740);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1768:1: rule__NamespaceDeclaration__Group__4__Impl : ( ( rule__NamespaceDeclaration__UriAssignment_4 ) ) ;
    public final void rule__NamespaceDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1772:1: ( ( ( rule__NamespaceDeclaration__UriAssignment_4 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1773:1: ( ( rule__NamespaceDeclaration__UriAssignment_4 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1773:1: ( ( rule__NamespaceDeclaration__UriAssignment_4 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1774:1: ( rule__NamespaceDeclaration__UriAssignment_4 )
            {
             before(grammarAccess.getNamespaceDeclarationAccess().getUriAssignment_4()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1775:1: ( rule__NamespaceDeclaration__UriAssignment_4 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1775:2: rule__NamespaceDeclaration__UriAssignment_4
            {
            pushFollow(FOLLOW_rule__NamespaceDeclaration__UriAssignment_4_in_rule__NamespaceDeclaration__Group__4__Impl3767);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1785:1: rule__NamespaceDeclaration__Group__5 : rule__NamespaceDeclaration__Group__5__Impl rule__NamespaceDeclaration__Group__6 ;
    public final void rule__NamespaceDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1789:1: ( rule__NamespaceDeclaration__Group__5__Impl rule__NamespaceDeclaration__Group__6 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1790:2: rule__NamespaceDeclaration__Group__5__Impl rule__NamespaceDeclaration__Group__6
            {
            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group__5__Impl_in_rule__NamespaceDeclaration__Group__53797);
            rule__NamespaceDeclaration__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group__6_in_rule__NamespaceDeclaration__Group__53800);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1797:1: rule__NamespaceDeclaration__Group__5__Impl : ( ( ruleWS )* ) ;
    public final void rule__NamespaceDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1801:1: ( ( ( ruleWS )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1802:1: ( ( ruleWS )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1802:1: ( ( ruleWS )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1803:1: ( ruleWS )*
            {
             before(grammarAccess.getNamespaceDeclarationAccess().getWSParserRuleCall_5()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1804:1: ( ruleWS )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=RULE_SP && LA19_0<=RULE_SL_COMMENT)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1804:3: ruleWS
            	    {
            	    pushFollow(FOLLOW_ruleWS_in_rule__NamespaceDeclaration__Group__5__Impl3828);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1814:1: rule__NamespaceDeclaration__Group__6 : rule__NamespaceDeclaration__Group__6__Impl rule__NamespaceDeclaration__Group__7 ;
    public final void rule__NamespaceDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1818:1: ( rule__NamespaceDeclaration__Group__6__Impl rule__NamespaceDeclaration__Group__7 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1819:2: rule__NamespaceDeclaration__Group__6__Impl rule__NamespaceDeclaration__Group__7
            {
            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group__6__Impl_in_rule__NamespaceDeclaration__Group__63859);
            rule__NamespaceDeclaration__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group__7_in_rule__NamespaceDeclaration__Group__63862);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1826:1: rule__NamespaceDeclaration__Group__6__Impl : ( '.' ) ;
    public final void rule__NamespaceDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1830:1: ( ( '.' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1831:1: ( '.' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1831:1: ( '.' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1832:1: '.'
            {
             before(grammarAccess.getNamespaceDeclarationAccess().getFullStopKeyword_6()); 
            match(input,14,FOLLOW_14_in_rule__NamespaceDeclaration__Group__6__Impl3890); 
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1845:1: rule__NamespaceDeclaration__Group__7 : rule__NamespaceDeclaration__Group__7__Impl ;
    public final void rule__NamespaceDeclaration__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1849:1: ( rule__NamespaceDeclaration__Group__7__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1850:2: rule__NamespaceDeclaration__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group__7__Impl_in_rule__NamespaceDeclaration__Group__73921);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1856:1: rule__NamespaceDeclaration__Group__7__Impl : ( ruleWS ) ;
    public final void rule__NamespaceDeclaration__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1860:1: ( ( ruleWS ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1861:1: ( ruleWS )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1861:1: ( ruleWS )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1862:1: ruleWS
            {
             before(grammarAccess.getNamespaceDeclarationAccess().getWSParserRuleCall_7()); 
            pushFollow(FOLLOW_ruleWS_in_rule__NamespaceDeclaration__Group__7__Impl3948);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1889:1: rule__NamespaceDeclaration__Group_3__0 : rule__NamespaceDeclaration__Group_3__0__Impl rule__NamespaceDeclaration__Group_3__1 ;
    public final void rule__NamespaceDeclaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1893:1: ( rule__NamespaceDeclaration__Group_3__0__Impl rule__NamespaceDeclaration__Group_3__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1894:2: rule__NamespaceDeclaration__Group_3__0__Impl rule__NamespaceDeclaration__Group_3__1
            {
            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group_3__0__Impl_in_rule__NamespaceDeclaration__Group_3__03993);
            rule__NamespaceDeclaration__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group_3__1_in_rule__NamespaceDeclaration__Group_3__03996);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1901:1: rule__NamespaceDeclaration__Group_3__0__Impl : ( ( rule__NamespaceDeclaration__NameAssignment_3_0 ) ) ;
    public final void rule__NamespaceDeclaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1905:1: ( ( ( rule__NamespaceDeclaration__NameAssignment_3_0 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1906:1: ( ( rule__NamespaceDeclaration__NameAssignment_3_0 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1906:1: ( ( rule__NamespaceDeclaration__NameAssignment_3_0 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1907:1: ( rule__NamespaceDeclaration__NameAssignment_3_0 )
            {
             before(grammarAccess.getNamespaceDeclarationAccess().getNameAssignment_3_0()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1908:1: ( rule__NamespaceDeclaration__NameAssignment_3_0 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1908:2: rule__NamespaceDeclaration__NameAssignment_3_0
            {
            pushFollow(FOLLOW_rule__NamespaceDeclaration__NameAssignment_3_0_in_rule__NamespaceDeclaration__Group_3__0__Impl4023);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1918:1: rule__NamespaceDeclaration__Group_3__1 : rule__NamespaceDeclaration__Group_3__1__Impl rule__NamespaceDeclaration__Group_3__2 ;
    public final void rule__NamespaceDeclaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1922:1: ( rule__NamespaceDeclaration__Group_3__1__Impl rule__NamespaceDeclaration__Group_3__2 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1923:2: rule__NamespaceDeclaration__Group_3__1__Impl rule__NamespaceDeclaration__Group_3__2
            {
            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group_3__1__Impl_in_rule__NamespaceDeclaration__Group_3__14053);
            rule__NamespaceDeclaration__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group_3__2_in_rule__NamespaceDeclaration__Group_3__14056);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1930:1: rule__NamespaceDeclaration__Group_3__1__Impl : ( ( ruleWS )* ) ;
    public final void rule__NamespaceDeclaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1934:1: ( ( ( ruleWS )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1935:1: ( ( ruleWS )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1935:1: ( ( ruleWS )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1936:1: ( ruleWS )*
            {
             before(grammarAccess.getNamespaceDeclarationAccess().getWSParserRuleCall_3_1()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1937:1: ( ruleWS )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=RULE_SP && LA20_0<=RULE_SL_COMMENT)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1937:3: ruleWS
            	    {
            	    pushFollow(FOLLOW_ruleWS_in_rule__NamespaceDeclaration__Group_3__1__Impl4084);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1947:1: rule__NamespaceDeclaration__Group_3__2 : rule__NamespaceDeclaration__Group_3__2__Impl rule__NamespaceDeclaration__Group_3__3 ;
    public final void rule__NamespaceDeclaration__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1951:1: ( rule__NamespaceDeclaration__Group_3__2__Impl rule__NamespaceDeclaration__Group_3__3 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1952:2: rule__NamespaceDeclaration__Group_3__2__Impl rule__NamespaceDeclaration__Group_3__3
            {
            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group_3__2__Impl_in_rule__NamespaceDeclaration__Group_3__24115);
            rule__NamespaceDeclaration__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group_3__3_in_rule__NamespaceDeclaration__Group_3__24118);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1959:1: rule__NamespaceDeclaration__Group_3__2__Impl : ( '=' ) ;
    public final void rule__NamespaceDeclaration__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1963:1: ( ( '=' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1964:1: ( '=' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1964:1: ( '=' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1965:1: '='
            {
             before(grammarAccess.getNamespaceDeclarationAccess().getEqualsSignKeyword_3_2()); 
            match(input,16,FOLLOW_16_in_rule__NamespaceDeclaration__Group_3__2__Impl4146); 
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1978:1: rule__NamespaceDeclaration__Group_3__3 : rule__NamespaceDeclaration__Group_3__3__Impl ;
    public final void rule__NamespaceDeclaration__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1982:1: ( rule__NamespaceDeclaration__Group_3__3__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1983:2: rule__NamespaceDeclaration__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group_3__3__Impl_in_rule__NamespaceDeclaration__Group_3__34177);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1989:1: rule__NamespaceDeclaration__Group_3__3__Impl : ( ( ruleWS )* ) ;
    public final void rule__NamespaceDeclaration__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1993:1: ( ( ( ruleWS )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1994:1: ( ( ruleWS )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1994:1: ( ( ruleWS )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1995:1: ( ruleWS )*
            {
             before(grammarAccess.getNamespaceDeclarationAccess().getWSParserRuleCall_3_3()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1996:1: ( ruleWS )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=RULE_SP && LA21_0<=RULE_SL_COMMENT)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1996:3: ruleWS
            	    {
            	    pushFollow(FOLLOW_ruleWS_in_rule__NamespaceDeclaration__Group_3__3__Impl4205);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2014:1: rule__ReadDeclaration__Group__0 : rule__ReadDeclaration__Group__0__Impl rule__ReadDeclaration__Group__1 ;
    public final void rule__ReadDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2018:1: ( rule__ReadDeclaration__Group__0__Impl rule__ReadDeclaration__Group__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2019:2: rule__ReadDeclaration__Group__0__Impl rule__ReadDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__ReadDeclaration__Group__0__Impl_in_rule__ReadDeclaration__Group__04244);
            rule__ReadDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ReadDeclaration__Group__1_in_rule__ReadDeclaration__Group__04247);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2026:1: rule__ReadDeclaration__Group__0__Impl : ( '%' ) ;
    public final void rule__ReadDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2030:1: ( ( '%' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2031:1: ( '%' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2031:1: ( '%' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2032:1: '%'
            {
             before(grammarAccess.getReadDeclarationAccess().getPercentSignKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__ReadDeclaration__Group__0__Impl4275); 
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2045:1: rule__ReadDeclaration__Group__1 : rule__ReadDeclaration__Group__1__Impl rule__ReadDeclaration__Group__2 ;
    public final void rule__ReadDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2049:1: ( rule__ReadDeclaration__Group__1__Impl rule__ReadDeclaration__Group__2 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2050:2: rule__ReadDeclaration__Group__1__Impl rule__ReadDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__ReadDeclaration__Group__1__Impl_in_rule__ReadDeclaration__Group__14306);
            rule__ReadDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ReadDeclaration__Group__2_in_rule__ReadDeclaration__Group__14309);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2057:1: rule__ReadDeclaration__Group__1__Impl : ( 'read' ) ;
    public final void rule__ReadDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2061:1: ( ( 'read' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2062:1: ( 'read' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2062:1: ( 'read' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2063:1: 'read'
            {
             before(grammarAccess.getReadDeclarationAccess().getReadKeyword_1()); 
            match(input,29,FOLLOW_29_in_rule__ReadDeclaration__Group__1__Impl4337); 
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2076:1: rule__ReadDeclaration__Group__2 : rule__ReadDeclaration__Group__2__Impl rule__ReadDeclaration__Group__3 ;
    public final void rule__ReadDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2080:1: ( rule__ReadDeclaration__Group__2__Impl rule__ReadDeclaration__Group__3 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2081:2: rule__ReadDeclaration__Group__2__Impl rule__ReadDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__ReadDeclaration__Group__2__Impl_in_rule__ReadDeclaration__Group__24368);
            rule__ReadDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ReadDeclaration__Group__3_in_rule__ReadDeclaration__Group__24371);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2088:1: rule__ReadDeclaration__Group__2__Impl : ( ( ( ruleWS ) ) ( ( ruleWS )* ) ) ;
    public final void rule__ReadDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2092:1: ( ( ( ( ruleWS ) ) ( ( ruleWS )* ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2093:1: ( ( ( ruleWS ) ) ( ( ruleWS )* ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2093:1: ( ( ( ruleWS ) ) ( ( ruleWS )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2094:1: ( ( ruleWS ) ) ( ( ruleWS )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2094:1: ( ( ruleWS ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2095:1: ( ruleWS )
            {
             before(grammarAccess.getReadDeclarationAccess().getWSParserRuleCall_2()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2096:1: ( ruleWS )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2096:3: ruleWS
            {
            pushFollow(FOLLOW_ruleWS_in_rule__ReadDeclaration__Group__2__Impl4401);
            ruleWS();

            state._fsp--;


            }

             after(grammarAccess.getReadDeclarationAccess().getWSParserRuleCall_2()); 

            }

            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2099:1: ( ( ruleWS )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2100:1: ( ruleWS )*
            {
             before(grammarAccess.getReadDeclarationAccess().getWSParserRuleCall_2()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2101:1: ( ruleWS )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=RULE_SP && LA22_0<=RULE_SL_COMMENT)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2101:3: ruleWS
            	    {
            	    pushFollow(FOLLOW_ruleWS_in_rule__ReadDeclaration__Group__2__Impl4414);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2112:1: rule__ReadDeclaration__Group__3 : rule__ReadDeclaration__Group__3__Impl rule__ReadDeclaration__Group__4 ;
    public final void rule__ReadDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2116:1: ( rule__ReadDeclaration__Group__3__Impl rule__ReadDeclaration__Group__4 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2117:2: rule__ReadDeclaration__Group__3__Impl rule__ReadDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__ReadDeclaration__Group__3__Impl_in_rule__ReadDeclaration__Group__34447);
            rule__ReadDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ReadDeclaration__Group__4_in_rule__ReadDeclaration__Group__34450);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2124:1: rule__ReadDeclaration__Group__3__Impl : ( ( rule__ReadDeclaration__FileAssignment_3 ) ) ;
    public final void rule__ReadDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2128:1: ( ( ( rule__ReadDeclaration__FileAssignment_3 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2129:1: ( ( rule__ReadDeclaration__FileAssignment_3 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2129:1: ( ( rule__ReadDeclaration__FileAssignment_3 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2130:1: ( rule__ReadDeclaration__FileAssignment_3 )
            {
             before(grammarAccess.getReadDeclarationAccess().getFileAssignment_3()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2131:1: ( rule__ReadDeclaration__FileAssignment_3 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2131:2: rule__ReadDeclaration__FileAssignment_3
            {
            pushFollow(FOLLOW_rule__ReadDeclaration__FileAssignment_3_in_rule__ReadDeclaration__Group__3__Impl4477);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2141:1: rule__ReadDeclaration__Group__4 : rule__ReadDeclaration__Group__4__Impl rule__ReadDeclaration__Group__5 ;
    public final void rule__ReadDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2145:1: ( rule__ReadDeclaration__Group__4__Impl rule__ReadDeclaration__Group__5 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2146:2: rule__ReadDeclaration__Group__4__Impl rule__ReadDeclaration__Group__5
            {
            pushFollow(FOLLOW_rule__ReadDeclaration__Group__4__Impl_in_rule__ReadDeclaration__Group__44507);
            rule__ReadDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ReadDeclaration__Group__5_in_rule__ReadDeclaration__Group__44510);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2153:1: rule__ReadDeclaration__Group__4__Impl : ( ( ruleWS )* ) ;
    public final void rule__ReadDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2157:1: ( ( ( ruleWS )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2158:1: ( ( ruleWS )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2158:1: ( ( ruleWS )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2159:1: ( ruleWS )*
            {
             before(grammarAccess.getReadDeclarationAccess().getWSParserRuleCall_4()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2160:1: ( ruleWS )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=RULE_SP && LA23_0<=RULE_SL_COMMENT)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2160:3: ruleWS
            	    {
            	    pushFollow(FOLLOW_ruleWS_in_rule__ReadDeclaration__Group__4__Impl4538);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2170:1: rule__ReadDeclaration__Group__5 : rule__ReadDeclaration__Group__5__Impl rule__ReadDeclaration__Group__6 ;
    public final void rule__ReadDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2174:1: ( rule__ReadDeclaration__Group__5__Impl rule__ReadDeclaration__Group__6 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2175:2: rule__ReadDeclaration__Group__5__Impl rule__ReadDeclaration__Group__6
            {
            pushFollow(FOLLOW_rule__ReadDeclaration__Group__5__Impl_in_rule__ReadDeclaration__Group__54569);
            rule__ReadDeclaration__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ReadDeclaration__Group__6_in_rule__ReadDeclaration__Group__54572);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2182:1: rule__ReadDeclaration__Group__5__Impl : ( '.' ) ;
    public final void rule__ReadDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2186:1: ( ( '.' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2187:1: ( '.' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2187:1: ( '.' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2188:1: '.'
            {
             before(grammarAccess.getReadDeclarationAccess().getFullStopKeyword_5()); 
            match(input,14,FOLLOW_14_in_rule__ReadDeclaration__Group__5__Impl4600); 
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2201:1: rule__ReadDeclaration__Group__6 : rule__ReadDeclaration__Group__6__Impl ;
    public final void rule__ReadDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2205:1: ( rule__ReadDeclaration__Group__6__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2206:2: rule__ReadDeclaration__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__ReadDeclaration__Group__6__Impl_in_rule__ReadDeclaration__Group__64631);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2212:1: rule__ReadDeclaration__Group__6__Impl : ( ruleWS ) ;
    public final void rule__ReadDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2216:1: ( ( ruleWS ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2217:1: ( ruleWS )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2217:1: ( ruleWS )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2218:1: ruleWS
            {
             before(grammarAccess.getReadDeclarationAccess().getWSParserRuleCall_6()); 
            pushFollow(FOLLOW_ruleWS_in_rule__ReadDeclaration__Group__6__Impl4658);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2243:1: rule__GID__Group_0__0 : rule__GID__Group_0__0__Impl rule__GID__Group_0__1 ;
    public final void rule__GID__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2247:1: ( rule__GID__Group_0__0__Impl rule__GID__Group_0__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2248:2: rule__GID__Group_0__0__Impl rule__GID__Group_0__1
            {
            pushFollow(FOLLOW_rule__GID__Group_0__0__Impl_in_rule__GID__Group_0__04701);
            rule__GID__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GID__Group_0__1_in_rule__GID__Group_0__04704);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2255:1: rule__GID__Group_0__0__Impl : ( ( ( rule__GID__Alternatives_0_0 ) ) ( ( rule__GID__Alternatives_0_0 )* ) ) ;
    public final void rule__GID__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2259:1: ( ( ( ( rule__GID__Alternatives_0_0 ) ) ( ( rule__GID__Alternatives_0_0 )* ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2260:1: ( ( ( rule__GID__Alternatives_0_0 ) ) ( ( rule__GID__Alternatives_0_0 )* ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2260:1: ( ( ( rule__GID__Alternatives_0_0 ) ) ( ( rule__GID__Alternatives_0_0 )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2261:1: ( ( rule__GID__Alternatives_0_0 ) ) ( ( rule__GID__Alternatives_0_0 )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2261:1: ( ( rule__GID__Alternatives_0_0 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2262:1: ( rule__GID__Alternatives_0_0 )
            {
             before(grammarAccess.getGIDAccess().getAlternatives_0_0()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2263:1: ( rule__GID__Alternatives_0_0 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2263:2: rule__GID__Alternatives_0_0
            {
            pushFollow(FOLLOW_rule__GID__Alternatives_0_0_in_rule__GID__Group_0__0__Impl4733);
            rule__GID__Alternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getGIDAccess().getAlternatives_0_0()); 

            }

            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2266:1: ( ( rule__GID__Alternatives_0_0 )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2267:1: ( rule__GID__Alternatives_0_0 )*
            {
             before(grammarAccess.getGIDAccess().getAlternatives_0_0()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2268:1: ( rule__GID__Alternatives_0_0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=RULE_CID && LA24_0<=RULE_INT)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2268:2: rule__GID__Alternatives_0_0
            	    {
            	    pushFollow(FOLLOW_rule__GID__Alternatives_0_0_in_rule__GID__Group_0__0__Impl4745);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2279:1: rule__GID__Group_0__1 : rule__GID__Group_0__1__Impl ;
    public final void rule__GID__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2283:1: ( rule__GID__Group_0__1__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2284:2: rule__GID__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__GID__Group_0__1__Impl_in_rule__GID__Group_0__14778);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2290:1: rule__GID__Group_0__1__Impl : ( ( rule__GID__Group_0_1__0 )? ) ;
    public final void rule__GID__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2294:1: ( ( ( rule__GID__Group_0_1__0 )? ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2295:1: ( ( rule__GID__Group_0_1__0 )? )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2295:1: ( ( rule__GID__Group_0_1__0 )? )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2296:1: ( rule__GID__Group_0_1__0 )?
            {
             before(grammarAccess.getGIDAccess().getGroup_0_1()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2297:1: ( rule__GID__Group_0_1__0 )?
            int alt25=2;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2297:2: rule__GID__Group_0_1__0
                    {
                    pushFollow(FOLLOW_rule__GID__Group_0_1__0_in_rule__GID__Group_0__1__Impl4805);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2311:1: rule__GID__Group_0_1__0 : rule__GID__Group_0_1__0__Impl rule__GID__Group_0_1__1 ;
    public final void rule__GID__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2315:1: ( rule__GID__Group_0_1__0__Impl rule__GID__Group_0_1__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2316:2: rule__GID__Group_0_1__0__Impl rule__GID__Group_0_1__1
            {
            pushFollow(FOLLOW_rule__GID__Group_0_1__0__Impl_in_rule__GID__Group_0_1__04840);
            rule__GID__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GID__Group_0_1__1_in_rule__GID__Group_0_1__04843);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2323:1: rule__GID__Group_0_1__0__Impl : ( ( ( '=' ) ) ( ( '=' )* ) ) ;
    public final void rule__GID__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2327:1: ( ( ( ( '=' ) ) ( ( '=' )* ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2328:1: ( ( ( '=' ) ) ( ( '=' )* ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2328:1: ( ( ( '=' ) ) ( ( '=' )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2329:1: ( ( '=' ) ) ( ( '=' )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2329:1: ( ( '=' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2330:1: ( '=' )
            {
             before(grammarAccess.getGIDAccess().getEqualsSignKeyword_0_1_0()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2331:1: ( '=' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2332:2: '='
            {
            match(input,16,FOLLOW_16_in_rule__GID__Group_0_1__0__Impl4874); 

            }

             after(grammarAccess.getGIDAccess().getEqualsSignKeyword_0_1_0()); 

            }

            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2336:1: ( ( '=' )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2337:1: ( '=' )*
            {
             before(grammarAccess.getGIDAccess().getEqualsSignKeyword_0_1_0()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2338:1: ( '=' )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==16) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2339:2: '='
            	    {
            	    match(input,16,FOLLOW_16_in_rule__GID__Group_0_1__0__Impl4890); 

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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2351:1: rule__GID__Group_0_1__1 : rule__GID__Group_0_1__1__Impl ;
    public final void rule__GID__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2355:1: ( rule__GID__Group_0_1__1__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2356:2: rule__GID__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__GID__Group_0_1__1__Impl_in_rule__GID__Group_0_1__14925);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2362:1: rule__GID__Group_0_1__1__Impl : ( ruleWS ) ;
    public final void rule__GID__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2366:1: ( ( ruleWS ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2367:1: ( ruleWS )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2367:1: ( ruleWS )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2368:1: ruleWS
            {
             before(grammarAccess.getGIDAccess().getWSParserRuleCall_0_1_1()); 
            pushFollow(FOLLOW_ruleWS_in_rule__GID__Group_0_1__1__Impl4952);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2383:1: rule__GID__Group_1__0 : rule__GID__Group_1__0__Impl rule__GID__Group_1__1 ;
    public final void rule__GID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2387:1: ( rule__GID__Group_1__0__Impl rule__GID__Group_1__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2388:2: rule__GID__Group_1__0__Impl rule__GID__Group_1__1
            {
            pushFollow(FOLLOW_rule__GID__Group_1__0__Impl_in_rule__GID__Group_1__04985);
            rule__GID__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GID__Group_1__1_in_rule__GID__Group_1__04988);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2395:1: rule__GID__Group_1__0__Impl : ( '=' ) ;
    public final void rule__GID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2399:1: ( ( '=' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2400:1: ( '=' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2400:1: ( '=' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2401:1: '='
            {
             before(grammarAccess.getGIDAccess().getEqualsSignKeyword_1_0()); 
            match(input,16,FOLLOW_16_in_rule__GID__Group_1__0__Impl5016); 
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2414:1: rule__GID__Group_1__1 : rule__GID__Group_1__1__Impl rule__GID__Group_1__2 ;
    public final void rule__GID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2418:1: ( rule__GID__Group_1__1__Impl rule__GID__Group_1__2 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2419:2: rule__GID__Group_1__1__Impl rule__GID__Group_1__2
            {
            pushFollow(FOLLOW_rule__GID__Group_1__1__Impl_in_rule__GID__Group_1__15047);
            rule__GID__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GID__Group_1__2_in_rule__GID__Group_1__15050);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2426:1: rule__GID__Group_1__1__Impl : ( ( ( '=' ) ) ( ( '=' )* ) ) ;
    public final void rule__GID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2430:1: ( ( ( ( '=' ) ) ( ( '=' )* ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2431:1: ( ( ( '=' ) ) ( ( '=' )* ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2431:1: ( ( ( '=' ) ) ( ( '=' )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2432:1: ( ( '=' ) ) ( ( '=' )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2432:1: ( ( '=' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2433:1: ( '=' )
            {
             before(grammarAccess.getGIDAccess().getEqualsSignKeyword_1_1()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2434:1: ( '=' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2435:2: '='
            {
            match(input,16,FOLLOW_16_in_rule__GID__Group_1__1__Impl5081); 

            }

             after(grammarAccess.getGIDAccess().getEqualsSignKeyword_1_1()); 

            }

            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2439:1: ( ( '=' )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2440:1: ( '=' )*
            {
             before(grammarAccess.getGIDAccess().getEqualsSignKeyword_1_1()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2441:1: ( '=' )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==16) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2442:2: '='
            	    {
            	    match(input,16,FOLLOW_16_in_rule__GID__Group_1__1__Impl5097); 

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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2454:1: rule__GID__Group_1__2 : rule__GID__Group_1__2__Impl ;
    public final void rule__GID__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2458:1: ( rule__GID__Group_1__2__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2459:2: rule__GID__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__GID__Group_1__2__Impl_in_rule__GID__Group_1__25132);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2465:1: rule__GID__Group_1__2__Impl : ( ruleWS ) ;
    public final void rule__GID__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2469:1: ( ( ruleWS ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2470:1: ( ruleWS )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2470:1: ( ruleWS )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2471:1: ruleWS
            {
             before(grammarAccess.getGIDAccess().getWSParserRuleCall_1_2()); 
            pushFollow(FOLLOW_ruleWS_in_rule__GID__Group_1__2__Impl5159);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2488:1: rule__SOMETHING__Group_3__0 : rule__SOMETHING__Group_3__0__Impl rule__SOMETHING__Group_3__1 ;
    public final void rule__SOMETHING__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2492:1: ( rule__SOMETHING__Group_3__0__Impl rule__SOMETHING__Group_3__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2493:2: rule__SOMETHING__Group_3__0__Impl rule__SOMETHING__Group_3__1
            {
            pushFollow(FOLLOW_rule__SOMETHING__Group_3__0__Impl_in_rule__SOMETHING__Group_3__05194);
            rule__SOMETHING__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SOMETHING__Group_3__1_in_rule__SOMETHING__Group_3__05197);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2500:1: rule__SOMETHING__Group_3__0__Impl : ( '.' ) ;
    public final void rule__SOMETHING__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2504:1: ( ( '.' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2505:1: ( '.' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2505:1: ( '.' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2506:1: '.'
            {
             before(grammarAccess.getSOMETHINGAccess().getFullStopKeyword_3_0()); 
            match(input,14,FOLLOW_14_in_rule__SOMETHING__Group_3__0__Impl5225); 
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2519:1: rule__SOMETHING__Group_3__1 : rule__SOMETHING__Group_3__1__Impl ;
    public final void rule__SOMETHING__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2523:1: ( rule__SOMETHING__Group_3__1__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2524:2: rule__SOMETHING__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__SOMETHING__Group_3__1__Impl_in_rule__SOMETHING__Group_3__15256);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2530:1: rule__SOMETHING__Group_3__1__Impl : ( ( rule__SOMETHING__Alternatives_3_1 ) ) ;
    public final void rule__SOMETHING__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2534:1: ( ( ( rule__SOMETHING__Alternatives_3_1 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2535:1: ( ( rule__SOMETHING__Alternatives_3_1 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2535:1: ( ( rule__SOMETHING__Alternatives_3_1 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2536:1: ( rule__SOMETHING__Alternatives_3_1 )
            {
             before(grammarAccess.getSOMETHINGAccess().getAlternatives_3_1()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2537:1: ( rule__SOMETHING__Alternatives_3_1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2537:2: rule__SOMETHING__Alternatives_3_1
            {
            pushFollow(FOLLOW_rule__SOMETHING__Alternatives_3_1_in_rule__SOMETHING__Group_3__1__Impl5283);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2551:1: rule__SOMETHING__Group_8__0 : rule__SOMETHING__Group_8__0__Impl rule__SOMETHING__Group_8__1 ;
    public final void rule__SOMETHING__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2555:1: ( rule__SOMETHING__Group_8__0__Impl rule__SOMETHING__Group_8__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2556:2: rule__SOMETHING__Group_8__0__Impl rule__SOMETHING__Group_8__1
            {
            pushFollow(FOLLOW_rule__SOMETHING__Group_8__0__Impl_in_rule__SOMETHING__Group_8__05317);
            rule__SOMETHING__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SOMETHING__Group_8__1_in_rule__SOMETHING__Group_8__05320);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2563:1: rule__SOMETHING__Group_8__0__Impl : ( '{' ) ;
    public final void rule__SOMETHING__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2567:1: ( ( '{' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2568:1: ( '{' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2568:1: ( '{' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2569:1: '{'
            {
             before(grammarAccess.getSOMETHINGAccess().getLeftCurlyBracketKeyword_8_0()); 
            match(input,30,FOLLOW_30_in_rule__SOMETHING__Group_8__0__Impl5348); 
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2582:1: rule__SOMETHING__Group_8__1 : rule__SOMETHING__Group_8__1__Impl rule__SOMETHING__Group_8__2 ;
    public final void rule__SOMETHING__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2586:1: ( rule__SOMETHING__Group_8__1__Impl rule__SOMETHING__Group_8__2 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2587:2: rule__SOMETHING__Group_8__1__Impl rule__SOMETHING__Group_8__2
            {
            pushFollow(FOLLOW_rule__SOMETHING__Group_8__1__Impl_in_rule__SOMETHING__Group_8__15379);
            rule__SOMETHING__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SOMETHING__Group_8__2_in_rule__SOMETHING__Group_8__15382);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2594:1: rule__SOMETHING__Group_8__1__Impl : ( ( ruleSOMETHING2 )* ) ;
    public final void rule__SOMETHING__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2598:1: ( ( ( ruleSOMETHING2 )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2599:1: ( ( ruleSOMETHING2 )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2599:1: ( ( ruleSOMETHING2 )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2600:1: ( ruleSOMETHING2 )*
            {
             before(grammarAccess.getSOMETHINGAccess().getSOMETHING2ParserRuleCall_8_1()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2601:1: ( ruleSOMETHING2 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=RULE_SP && LA28_0<=RULE_INT)||(LA28_0>=14 && LA28_0<=18)||LA28_0==30) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2601:3: ruleSOMETHING2
            	    {
            	    pushFollow(FOLLOW_ruleSOMETHING2_in_rule__SOMETHING__Group_8__1__Impl5410);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2611:1: rule__SOMETHING__Group_8__2 : rule__SOMETHING__Group_8__2__Impl ;
    public final void rule__SOMETHING__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2615:1: ( rule__SOMETHING__Group_8__2__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2616:2: rule__SOMETHING__Group_8__2__Impl
            {
            pushFollow(FOLLOW_rule__SOMETHING__Group_8__2__Impl_in_rule__SOMETHING__Group_8__25441);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2622:1: rule__SOMETHING__Group_8__2__Impl : ( '}' ) ;
    public final void rule__SOMETHING__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2626:1: ( ( '}' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2627:1: ( '}' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2627:1: ( '}' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2628:1: '}'
            {
             before(grammarAccess.getSOMETHINGAccess().getRightCurlyBracketKeyword_8_2()); 
            match(input,31,FOLLOW_31_in_rule__SOMETHING__Group_8__2__Impl5469); 
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2647:1: rule__SOMETHING2__Group_8__0 : rule__SOMETHING2__Group_8__0__Impl rule__SOMETHING2__Group_8__1 ;
    public final void rule__SOMETHING2__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2651:1: ( rule__SOMETHING2__Group_8__0__Impl rule__SOMETHING2__Group_8__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2652:2: rule__SOMETHING2__Group_8__0__Impl rule__SOMETHING2__Group_8__1
            {
            pushFollow(FOLLOW_rule__SOMETHING2__Group_8__0__Impl_in_rule__SOMETHING2__Group_8__05506);
            rule__SOMETHING2__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SOMETHING2__Group_8__1_in_rule__SOMETHING2__Group_8__05509);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2659:1: rule__SOMETHING2__Group_8__0__Impl : ( '{' ) ;
    public final void rule__SOMETHING2__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2663:1: ( ( '{' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2664:1: ( '{' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2664:1: ( '{' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2665:1: '{'
            {
             before(grammarAccess.getSOMETHING2Access().getLeftCurlyBracketKeyword_8_0()); 
            match(input,30,FOLLOW_30_in_rule__SOMETHING2__Group_8__0__Impl5537); 
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2678:1: rule__SOMETHING2__Group_8__1 : rule__SOMETHING2__Group_8__1__Impl rule__SOMETHING2__Group_8__2 ;
    public final void rule__SOMETHING2__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2682:1: ( rule__SOMETHING2__Group_8__1__Impl rule__SOMETHING2__Group_8__2 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2683:2: rule__SOMETHING2__Group_8__1__Impl rule__SOMETHING2__Group_8__2
            {
            pushFollow(FOLLOW_rule__SOMETHING2__Group_8__1__Impl_in_rule__SOMETHING2__Group_8__15568);
            rule__SOMETHING2__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SOMETHING2__Group_8__2_in_rule__SOMETHING2__Group_8__15571);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2690:1: rule__SOMETHING2__Group_8__1__Impl : ( ( ruleSOMETHING2 )* ) ;
    public final void rule__SOMETHING2__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2694:1: ( ( ( ruleSOMETHING2 )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2695:1: ( ( ruleSOMETHING2 )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2695:1: ( ( ruleSOMETHING2 )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2696:1: ( ruleSOMETHING2 )*
            {
             before(grammarAccess.getSOMETHING2Access().getSOMETHING2ParserRuleCall_8_1()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2697:1: ( ruleSOMETHING2 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=RULE_SP && LA29_0<=RULE_INT)||(LA29_0>=14 && LA29_0<=18)||LA29_0==30) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2697:3: ruleSOMETHING2
            	    {
            	    pushFollow(FOLLOW_ruleSOMETHING2_in_rule__SOMETHING2__Group_8__1__Impl5599);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2707:1: rule__SOMETHING2__Group_8__2 : rule__SOMETHING2__Group_8__2__Impl ;
    public final void rule__SOMETHING2__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2711:1: ( rule__SOMETHING2__Group_8__2__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2712:2: rule__SOMETHING2__Group_8__2__Impl
            {
            pushFollow(FOLLOW_rule__SOMETHING2__Group_8__2__Impl_in_rule__SOMETHING2__Group_8__25630);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2718:1: rule__SOMETHING2__Group_8__2__Impl : ( '}' ) ;
    public final void rule__SOMETHING2__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2722:1: ( ( '}' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2723:1: ( '}' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2723:1: ( '}' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2724:1: '}'
            {
             before(grammarAccess.getSOMETHING2Access().getRightCurlyBracketKeyword_8_2()); 
            match(input,31,FOLLOW_31_in_rule__SOMETHING2__Group_8__2__Impl5658); 
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2746:1: rule__SignatureDeclaration__Group__0 : rule__SignatureDeclaration__Group__0__Impl rule__SignatureDeclaration__Group__1 ;
    public final void rule__SignatureDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2750:1: ( rule__SignatureDeclaration__Group__0__Impl rule__SignatureDeclaration__Group__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2751:2: rule__SignatureDeclaration__Group__0__Impl rule__SignatureDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__SignatureDeclaration__Group__0__Impl_in_rule__SignatureDeclaration__Group__05698);
            rule__SignatureDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SignatureDeclaration__Group__1_in_rule__SignatureDeclaration__Group__05701);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2758:1: rule__SignatureDeclaration__Group__0__Impl : ( ( rule__SignatureDeclaration__Group_0__0 ) ) ;
    public final void rule__SignatureDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2762:1: ( ( ( rule__SignatureDeclaration__Group_0__0 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2763:1: ( ( rule__SignatureDeclaration__Group_0__0 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2763:1: ( ( rule__SignatureDeclaration__Group_0__0 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2764:1: ( rule__SignatureDeclaration__Group_0__0 )
            {
             before(grammarAccess.getSignatureDeclarationAccess().getGroup_0()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2765:1: ( rule__SignatureDeclaration__Group_0__0 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2765:2: rule__SignatureDeclaration__Group_0__0
            {
            pushFollow(FOLLOW_rule__SignatureDeclaration__Group_0__0_in_rule__SignatureDeclaration__Group__0__Impl5728);
            rule__SignatureDeclaration__Group_0__0();

            state._fsp--;


            }

             after(grammarAccess.getSignatureDeclarationAccess().getGroup_0()); 

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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2775:1: rule__SignatureDeclaration__Group__1 : rule__SignatureDeclaration__Group__1__Impl rule__SignatureDeclaration__Group__2 ;
    public final void rule__SignatureDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2779:1: ( rule__SignatureDeclaration__Group__1__Impl rule__SignatureDeclaration__Group__2 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2780:2: rule__SignatureDeclaration__Group__1__Impl rule__SignatureDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__SignatureDeclaration__Group__1__Impl_in_rule__SignatureDeclaration__Group__15758);
            rule__SignatureDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SignatureDeclaration__Group__2_in_rule__SignatureDeclaration__Group__15761);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2787:1: rule__SignatureDeclaration__Group__1__Impl : ( ( ruleWS )* ) ;
    public final void rule__SignatureDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2791:1: ( ( ( ruleWS )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2792:1: ( ( ruleWS )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2792:1: ( ( ruleWS )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2793:1: ( ruleWS )*
            {
             before(grammarAccess.getSignatureDeclarationAccess().getWSParserRuleCall_1()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2794:1: ( ruleWS )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=RULE_SP && LA30_0<=RULE_SL_COMMENT)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2794:3: ruleWS
            	    {
            	    pushFollow(FOLLOW_ruleWS_in_rule__SignatureDeclaration__Group__1__Impl5789);
            	    ruleWS();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getSignatureDeclarationAccess().getWSParserRuleCall_1()); 

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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2804:1: rule__SignatureDeclaration__Group__2 : rule__SignatureDeclaration__Group__2__Impl rule__SignatureDeclaration__Group__3 ;
    public final void rule__SignatureDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2808:1: ( rule__SignatureDeclaration__Group__2__Impl rule__SignatureDeclaration__Group__3 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2809:2: rule__SignatureDeclaration__Group__2__Impl rule__SignatureDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__SignatureDeclaration__Group__2__Impl_in_rule__SignatureDeclaration__Group__25820);
            rule__SignatureDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SignatureDeclaration__Group__3_in_rule__SignatureDeclaration__Group__25823);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2816:1: rule__SignatureDeclaration__Group__2__Impl : ( '=' ) ;
    public final void rule__SignatureDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2820:1: ( ( '=' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2821:1: ( '=' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2821:1: ( '=' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2822:1: '='
            {
             before(grammarAccess.getSignatureDeclarationAccess().getEqualsSignKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__SignatureDeclaration__Group__2__Impl5851); 
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2835:1: rule__SignatureDeclaration__Group__3 : rule__SignatureDeclaration__Group__3__Impl rule__SignatureDeclaration__Group__4 ;
    public final void rule__SignatureDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2839:1: ( rule__SignatureDeclaration__Group__3__Impl rule__SignatureDeclaration__Group__4 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2840:2: rule__SignatureDeclaration__Group__3__Impl rule__SignatureDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__SignatureDeclaration__Group__3__Impl_in_rule__SignatureDeclaration__Group__35882);
            rule__SignatureDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SignatureDeclaration__Group__4_in_rule__SignatureDeclaration__Group__35885);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2847:1: rule__SignatureDeclaration__Group__3__Impl : ( ( ruleWS )* ) ;
    public final void rule__SignatureDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2851:1: ( ( ( ruleWS )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2852:1: ( ( ruleWS )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2852:1: ( ( ruleWS )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2853:1: ( ruleWS )*
            {
             before(grammarAccess.getSignatureDeclarationAccess().getWSParserRuleCall_3()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2854:1: ( ruleWS )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=RULE_SP && LA31_0<=RULE_SL_COMMENT)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2854:3: ruleWS
            	    {
            	    pushFollow(FOLLOW_ruleWS_in_rule__SignatureDeclaration__Group__3__Impl5913);
            	    ruleWS();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getSignatureDeclarationAccess().getWSParserRuleCall_3()); 

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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2864:1: rule__SignatureDeclaration__Group__4 : rule__SignatureDeclaration__Group__4__Impl rule__SignatureDeclaration__Group__5 ;
    public final void rule__SignatureDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2868:1: ( rule__SignatureDeclaration__Group__4__Impl rule__SignatureDeclaration__Group__5 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2869:2: rule__SignatureDeclaration__Group__4__Impl rule__SignatureDeclaration__Group__5
            {
            pushFollow(FOLLOW_rule__SignatureDeclaration__Group__4__Impl_in_rule__SignatureDeclaration__Group__45944);
            rule__SignatureDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SignatureDeclaration__Group__5_in_rule__SignatureDeclaration__Group__45947);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2876:1: rule__SignatureDeclaration__Group__4__Impl : ( ( rule__SignatureDeclaration__DefsAssignment_4 ) ) ;
    public final void rule__SignatureDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2880:1: ( ( ( rule__SignatureDeclaration__DefsAssignment_4 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2881:1: ( ( rule__SignatureDeclaration__DefsAssignment_4 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2881:1: ( ( rule__SignatureDeclaration__DefsAssignment_4 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2882:1: ( rule__SignatureDeclaration__DefsAssignment_4 )
            {
             before(grammarAccess.getSignatureDeclarationAccess().getDefsAssignment_4()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2883:1: ( rule__SignatureDeclaration__DefsAssignment_4 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2883:2: rule__SignatureDeclaration__DefsAssignment_4
            {
            pushFollow(FOLLOW_rule__SignatureDeclaration__DefsAssignment_4_in_rule__SignatureDeclaration__Group__4__Impl5974);
            rule__SignatureDeclaration__DefsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSignatureDeclarationAccess().getDefsAssignment_4()); 

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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2893:1: rule__SignatureDeclaration__Group__5 : rule__SignatureDeclaration__Group__5__Impl rule__SignatureDeclaration__Group__6 ;
    public final void rule__SignatureDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2897:1: ( rule__SignatureDeclaration__Group__5__Impl rule__SignatureDeclaration__Group__6 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2898:2: rule__SignatureDeclaration__Group__5__Impl rule__SignatureDeclaration__Group__6
            {
            pushFollow(FOLLOW_rule__SignatureDeclaration__Group__5__Impl_in_rule__SignatureDeclaration__Group__56004);
            rule__SignatureDeclaration__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SignatureDeclaration__Group__6_in_rule__SignatureDeclaration__Group__56007);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2905:1: rule__SignatureDeclaration__Group__5__Impl : ( ( ruleWS )* ) ;
    public final void rule__SignatureDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2909:1: ( ( ( ruleWS )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2910:1: ( ( ruleWS )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2910:1: ( ( ruleWS )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2911:1: ( ruleWS )*
            {
             before(grammarAccess.getSignatureDeclarationAccess().getWSParserRuleCall_5()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2912:1: ( ruleWS )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=RULE_SP && LA32_0<=RULE_SL_COMMENT)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2912:3: ruleWS
            	    {
            	    pushFollow(FOLLOW_ruleWS_in_rule__SignatureDeclaration__Group__5__Impl6035);
            	    ruleWS();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getSignatureDeclarationAccess().getWSParserRuleCall_5()); 

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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2922:1: rule__SignatureDeclaration__Group__6 : rule__SignatureDeclaration__Group__6__Impl ;
    public final void rule__SignatureDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2926:1: ( rule__SignatureDeclaration__Group__6__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2927:2: rule__SignatureDeclaration__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__SignatureDeclaration__Group__6__Impl_in_rule__SignatureDeclaration__Group__66066);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2933:1: rule__SignatureDeclaration__Group__6__Impl : ( '.' ) ;
    public final void rule__SignatureDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2937:1: ( ( '.' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2938:1: ( '.' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2938:1: ( '.' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2939:1: '.'
            {
             before(grammarAccess.getSignatureDeclarationAccess().getFullStopKeyword_6()); 
            match(input,14,FOLLOW_14_in_rule__SignatureDeclaration__Group__6__Impl6094); 
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


    // $ANTLR start "rule__SignatureDeclaration__Group_0__0"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2966:1: rule__SignatureDeclaration__Group_0__0 : rule__SignatureDeclaration__Group_0__0__Impl rule__SignatureDeclaration__Group_0__1 ;
    public final void rule__SignatureDeclaration__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2970:1: ( rule__SignatureDeclaration__Group_0__0__Impl rule__SignatureDeclaration__Group_0__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2971:2: rule__SignatureDeclaration__Group_0__0__Impl rule__SignatureDeclaration__Group_0__1
            {
            pushFollow(FOLLOW_rule__SignatureDeclaration__Group_0__0__Impl_in_rule__SignatureDeclaration__Group_0__06139);
            rule__SignatureDeclaration__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SignatureDeclaration__Group_0__1_in_rule__SignatureDeclaration__Group_0__06142);
            rule__SignatureDeclaration__Group_0__1();

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
    // $ANTLR end "rule__SignatureDeclaration__Group_0__0"


    // $ANTLR start "rule__SignatureDeclaration__Group_0__0__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2978:1: rule__SignatureDeclaration__Group_0__0__Impl : ( '%' ) ;
    public final void rule__SignatureDeclaration__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2982:1: ( ( '%' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2983:1: ( '%' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2983:1: ( '%' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2984:1: '%'
            {
             before(grammarAccess.getSignatureDeclarationAccess().getPercentSignKeyword_0_0()); 
            match(input,18,FOLLOW_18_in_rule__SignatureDeclaration__Group_0__0__Impl6170); 
             after(grammarAccess.getSignatureDeclarationAccess().getPercentSignKeyword_0_0()); 

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
    // $ANTLR end "rule__SignatureDeclaration__Group_0__0__Impl"


    // $ANTLR start "rule__SignatureDeclaration__Group_0__1"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2997:1: rule__SignatureDeclaration__Group_0__1 : rule__SignatureDeclaration__Group_0__1__Impl rule__SignatureDeclaration__Group_0__2 ;
    public final void rule__SignatureDeclaration__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3001:1: ( rule__SignatureDeclaration__Group_0__1__Impl rule__SignatureDeclaration__Group_0__2 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3002:2: rule__SignatureDeclaration__Group_0__1__Impl rule__SignatureDeclaration__Group_0__2
            {
            pushFollow(FOLLOW_rule__SignatureDeclaration__Group_0__1__Impl_in_rule__SignatureDeclaration__Group_0__16201);
            rule__SignatureDeclaration__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SignatureDeclaration__Group_0__2_in_rule__SignatureDeclaration__Group_0__16204);
            rule__SignatureDeclaration__Group_0__2();

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
    // $ANTLR end "rule__SignatureDeclaration__Group_0__1"


    // $ANTLR start "rule__SignatureDeclaration__Group_0__1__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3009:1: rule__SignatureDeclaration__Group_0__1__Impl : ( 'sig' ) ;
    public final void rule__SignatureDeclaration__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3013:1: ( ( 'sig' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3014:1: ( 'sig' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3014:1: ( 'sig' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3015:1: 'sig'
            {
             before(grammarAccess.getSignatureDeclarationAccess().getSigKeyword_0_1()); 
            match(input,32,FOLLOW_32_in_rule__SignatureDeclaration__Group_0__1__Impl6232); 
             after(grammarAccess.getSignatureDeclarationAccess().getSigKeyword_0_1()); 

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
    // $ANTLR end "rule__SignatureDeclaration__Group_0__1__Impl"


    // $ANTLR start "rule__SignatureDeclaration__Group_0__2"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3028:1: rule__SignatureDeclaration__Group_0__2 : rule__SignatureDeclaration__Group_0__2__Impl rule__SignatureDeclaration__Group_0__3 ;
    public final void rule__SignatureDeclaration__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3032:1: ( rule__SignatureDeclaration__Group_0__2__Impl rule__SignatureDeclaration__Group_0__3 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3033:2: rule__SignatureDeclaration__Group_0__2__Impl rule__SignatureDeclaration__Group_0__3
            {
            pushFollow(FOLLOW_rule__SignatureDeclaration__Group_0__2__Impl_in_rule__SignatureDeclaration__Group_0__26263);
            rule__SignatureDeclaration__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SignatureDeclaration__Group_0__3_in_rule__SignatureDeclaration__Group_0__26266);
            rule__SignatureDeclaration__Group_0__3();

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
    // $ANTLR end "rule__SignatureDeclaration__Group_0__2"


    // $ANTLR start "rule__SignatureDeclaration__Group_0__2__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3040:1: rule__SignatureDeclaration__Group_0__2__Impl : ( ( ( ruleWS ) ) ( ( ruleWS )* ) ) ;
    public final void rule__SignatureDeclaration__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3044:1: ( ( ( ( ruleWS ) ) ( ( ruleWS )* ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3045:1: ( ( ( ruleWS ) ) ( ( ruleWS )* ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3045:1: ( ( ( ruleWS ) ) ( ( ruleWS )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3046:1: ( ( ruleWS ) ) ( ( ruleWS )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3046:1: ( ( ruleWS ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3047:1: ( ruleWS )
            {
             before(grammarAccess.getSignatureDeclarationAccess().getWSParserRuleCall_0_2()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3048:1: ( ruleWS )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3048:3: ruleWS
            {
            pushFollow(FOLLOW_ruleWS_in_rule__SignatureDeclaration__Group_0__2__Impl6296);
            ruleWS();

            state._fsp--;


            }

             after(grammarAccess.getSignatureDeclarationAccess().getWSParserRuleCall_0_2()); 

            }

            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3051:1: ( ( ruleWS )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3052:1: ( ruleWS )*
            {
             before(grammarAccess.getSignatureDeclarationAccess().getWSParserRuleCall_0_2()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3053:1: ( ruleWS )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=RULE_SP && LA33_0<=RULE_SL_COMMENT)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3053:3: ruleWS
            	    {
            	    pushFollow(FOLLOW_ruleWS_in_rule__SignatureDeclaration__Group_0__2__Impl6309);
            	    ruleWS();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getSignatureDeclarationAccess().getWSParserRuleCall_0_2()); 

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
    // $ANTLR end "rule__SignatureDeclaration__Group_0__2__Impl"


    // $ANTLR start "rule__SignatureDeclaration__Group_0__3"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3064:1: rule__SignatureDeclaration__Group_0__3 : rule__SignatureDeclaration__Group_0__3__Impl ;
    public final void rule__SignatureDeclaration__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3068:1: ( rule__SignatureDeclaration__Group_0__3__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3069:2: rule__SignatureDeclaration__Group_0__3__Impl
            {
            pushFollow(FOLLOW_rule__SignatureDeclaration__Group_0__3__Impl_in_rule__SignatureDeclaration__Group_0__36342);
            rule__SignatureDeclaration__Group_0__3__Impl();

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
    // $ANTLR end "rule__SignatureDeclaration__Group_0__3"


    // $ANTLR start "rule__SignatureDeclaration__Group_0__3__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3075:1: rule__SignatureDeclaration__Group_0__3__Impl : ( ( rule__SignatureDeclaration__SigNameAssignment_0_3 ) ) ;
    public final void rule__SignatureDeclaration__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3079:1: ( ( ( rule__SignatureDeclaration__SigNameAssignment_0_3 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3080:1: ( ( rule__SignatureDeclaration__SigNameAssignment_0_3 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3080:1: ( ( rule__SignatureDeclaration__SigNameAssignment_0_3 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3081:1: ( rule__SignatureDeclaration__SigNameAssignment_0_3 )
            {
             before(grammarAccess.getSignatureDeclarationAccess().getSigNameAssignment_0_3()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3082:1: ( rule__SignatureDeclaration__SigNameAssignment_0_3 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3082:2: rule__SignatureDeclaration__SigNameAssignment_0_3
            {
            pushFollow(FOLLOW_rule__SignatureDeclaration__SigNameAssignment_0_3_in_rule__SignatureDeclaration__Group_0__3__Impl6369);
            rule__SignatureDeclaration__SigNameAssignment_0_3();

            state._fsp--;


            }

             after(grammarAccess.getSignatureDeclarationAccess().getSigNameAssignment_0_3()); 

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
    // $ANTLR end "rule__SignatureDeclaration__Group_0__3__Impl"


    // $ANTLR start "rule__SigDefinitions__Group__0"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3100:1: rule__SigDefinitions__Group__0 : rule__SigDefinitions__Group__0__Impl rule__SigDefinitions__Group__1 ;
    public final void rule__SigDefinitions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3104:1: ( rule__SigDefinitions__Group__0__Impl rule__SigDefinitions__Group__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3105:2: rule__SigDefinitions__Group__0__Impl rule__SigDefinitions__Group__1
            {
            pushFollow(FOLLOW_rule__SigDefinitions__Group__0__Impl_in_rule__SigDefinitions__Group__06407);
            rule__SigDefinitions__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SigDefinitions__Group__1_in_rule__SigDefinitions__Group__06410);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3112:1: rule__SigDefinitions__Group__0__Impl : ( '{' ) ;
    public final void rule__SigDefinitions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3116:1: ( ( '{' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3117:1: ( '{' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3117:1: ( '{' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3118:1: '{'
            {
             before(grammarAccess.getSigDefinitionsAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__SigDefinitions__Group__0__Impl6438); 
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3131:1: rule__SigDefinitions__Group__1 : rule__SigDefinitions__Group__1__Impl rule__SigDefinitions__Group__2 ;
    public final void rule__SigDefinitions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3135:1: ( rule__SigDefinitions__Group__1__Impl rule__SigDefinitions__Group__2 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3136:2: rule__SigDefinitions__Group__1__Impl rule__SigDefinitions__Group__2
            {
            pushFollow(FOLLOW_rule__SigDefinitions__Group__1__Impl_in_rule__SigDefinitions__Group__16469);
            rule__SigDefinitions__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SigDefinitions__Group__2_in_rule__SigDefinitions__Group__16472);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3143:1: rule__SigDefinitions__Group__1__Impl : ( ( ruleWS )* ) ;
    public final void rule__SigDefinitions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3147:1: ( ( ( ruleWS )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3148:1: ( ( ruleWS )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3148:1: ( ( ruleWS )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3149:1: ( ruleWS )*
            {
             before(grammarAccess.getSigDefinitionsAccess().getWSParserRuleCall_1()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3150:1: ( ruleWS )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=RULE_SP && LA34_0<=RULE_SL_COMMENT)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3150:3: ruleWS
            	    {
            	    pushFollow(FOLLOW_ruleWS_in_rule__SigDefinitions__Group__1__Impl6500);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3160:1: rule__SigDefinitions__Group__2 : rule__SigDefinitions__Group__2__Impl rule__SigDefinitions__Group__3 ;
    public final void rule__SigDefinitions__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3164:1: ( rule__SigDefinitions__Group__2__Impl rule__SigDefinitions__Group__3 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3165:2: rule__SigDefinitions__Group__2__Impl rule__SigDefinitions__Group__3
            {
            pushFollow(FOLLOW_rule__SigDefinitions__Group__2__Impl_in_rule__SigDefinitions__Group__26531);
            rule__SigDefinitions__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SigDefinitions__Group__3_in_rule__SigDefinitions__Group__26534);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3172:1: rule__SigDefinitions__Group__2__Impl : ( ( rule__SigDefinitions__ConstuctsAssignment_2 ) ) ;
    public final void rule__SigDefinitions__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3176:1: ( ( ( rule__SigDefinitions__ConstuctsAssignment_2 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3177:1: ( ( rule__SigDefinitions__ConstuctsAssignment_2 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3177:1: ( ( rule__SigDefinitions__ConstuctsAssignment_2 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3178:1: ( rule__SigDefinitions__ConstuctsAssignment_2 )
            {
             before(grammarAccess.getSigDefinitionsAccess().getConstuctsAssignment_2()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3179:1: ( rule__SigDefinitions__ConstuctsAssignment_2 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3179:2: rule__SigDefinitions__ConstuctsAssignment_2
            {
            pushFollow(FOLLOW_rule__SigDefinitions__ConstuctsAssignment_2_in_rule__SigDefinitions__Group__2__Impl6561);
            rule__SigDefinitions__ConstuctsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSigDefinitionsAccess().getConstuctsAssignment_2()); 

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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3189:1: rule__SigDefinitions__Group__3 : rule__SigDefinitions__Group__3__Impl rule__SigDefinitions__Group__4 ;
    public final void rule__SigDefinitions__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3193:1: ( rule__SigDefinitions__Group__3__Impl rule__SigDefinitions__Group__4 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3194:2: rule__SigDefinitions__Group__3__Impl rule__SigDefinitions__Group__4
            {
            pushFollow(FOLLOW_rule__SigDefinitions__Group__3__Impl_in_rule__SigDefinitions__Group__36591);
            rule__SigDefinitions__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SigDefinitions__Group__4_in_rule__SigDefinitions__Group__36594);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3201:1: rule__SigDefinitions__Group__3__Impl : ( ( rule__SigDefinitions__Group_3__0 )* ) ;
    public final void rule__SigDefinitions__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3205:1: ( ( ( rule__SigDefinitions__Group_3__0 )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3206:1: ( ( rule__SigDefinitions__Group_3__0 )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3206:1: ( ( rule__SigDefinitions__Group_3__0 )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3207:1: ( rule__SigDefinitions__Group_3__0 )*
            {
             before(grammarAccess.getSigDefinitionsAccess().getGroup_3()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3208:1: ( rule__SigDefinitions__Group_3__0 )*
            loop35:
            do {
                int alt35=2;
                alt35 = dfa35.predict(input);
                switch (alt35) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3208:2: rule__SigDefinitions__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__SigDefinitions__Group_3__0_in_rule__SigDefinitions__Group__3__Impl6621);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3218:1: rule__SigDefinitions__Group__4 : rule__SigDefinitions__Group__4__Impl rule__SigDefinitions__Group__5 ;
    public final void rule__SigDefinitions__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3222:1: ( rule__SigDefinitions__Group__4__Impl rule__SigDefinitions__Group__5 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3223:2: rule__SigDefinitions__Group__4__Impl rule__SigDefinitions__Group__5
            {
            pushFollow(FOLLOW_rule__SigDefinitions__Group__4__Impl_in_rule__SigDefinitions__Group__46652);
            rule__SigDefinitions__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SigDefinitions__Group__5_in_rule__SigDefinitions__Group__46655);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3230:1: rule__SigDefinitions__Group__4__Impl : ( ( rule__SigDefinitions__Group_4__0 )? ) ;
    public final void rule__SigDefinitions__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3234:1: ( ( ( rule__SigDefinitions__Group_4__0 )? ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3235:1: ( ( rule__SigDefinitions__Group_4__0 )? )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3235:1: ( ( rule__SigDefinitions__Group_4__0 )? )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3236:1: ( rule__SigDefinitions__Group_4__0 )?
            {
             before(grammarAccess.getSigDefinitionsAccess().getGroup_4()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3237:1: ( rule__SigDefinitions__Group_4__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==14) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3237:2: rule__SigDefinitions__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__SigDefinitions__Group_4__0_in_rule__SigDefinitions__Group__4__Impl6682);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3247:1: rule__SigDefinitions__Group__5 : rule__SigDefinitions__Group__5__Impl ;
    public final void rule__SigDefinitions__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3251:1: ( rule__SigDefinitions__Group__5__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3252:2: rule__SigDefinitions__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__SigDefinitions__Group__5__Impl_in_rule__SigDefinitions__Group__56713);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3258:1: rule__SigDefinitions__Group__5__Impl : ( '}' ) ;
    public final void rule__SigDefinitions__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3262:1: ( ( '}' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3263:1: ( '}' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3263:1: ( '}' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3264:1: '}'
            {
             before(grammarAccess.getSigDefinitionsAccess().getRightCurlyBracketKeyword_5()); 
            match(input,31,FOLLOW_31_in_rule__SigDefinitions__Group__5__Impl6741); 
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3289:1: rule__SigDefinitions__Group_3__0 : rule__SigDefinitions__Group_3__0__Impl rule__SigDefinitions__Group_3__1 ;
    public final void rule__SigDefinitions__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3293:1: ( rule__SigDefinitions__Group_3__0__Impl rule__SigDefinitions__Group_3__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3294:2: rule__SigDefinitions__Group_3__0__Impl rule__SigDefinitions__Group_3__1
            {
            pushFollow(FOLLOW_rule__SigDefinitions__Group_3__0__Impl_in_rule__SigDefinitions__Group_3__06784);
            rule__SigDefinitions__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SigDefinitions__Group_3__1_in_rule__SigDefinitions__Group_3__06787);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3301:1: rule__SigDefinitions__Group_3__0__Impl : ( '.' ) ;
    public final void rule__SigDefinitions__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3305:1: ( ( '.' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3306:1: ( '.' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3306:1: ( '.' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3307:1: '.'
            {
             before(grammarAccess.getSigDefinitionsAccess().getFullStopKeyword_3_0()); 
            match(input,14,FOLLOW_14_in_rule__SigDefinitions__Group_3__0__Impl6815); 
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3320:1: rule__SigDefinitions__Group_3__1 : rule__SigDefinitions__Group_3__1__Impl rule__SigDefinitions__Group_3__2 ;
    public final void rule__SigDefinitions__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3324:1: ( rule__SigDefinitions__Group_3__1__Impl rule__SigDefinitions__Group_3__2 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3325:2: rule__SigDefinitions__Group_3__1__Impl rule__SigDefinitions__Group_3__2
            {
            pushFollow(FOLLOW_rule__SigDefinitions__Group_3__1__Impl_in_rule__SigDefinitions__Group_3__16846);
            rule__SigDefinitions__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SigDefinitions__Group_3__2_in_rule__SigDefinitions__Group_3__16849);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3332:1: rule__SigDefinitions__Group_3__1__Impl : ( ( ( ruleWS ) ) ( ( ruleWS )* ) ) ;
    public final void rule__SigDefinitions__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3336:1: ( ( ( ( ruleWS ) ) ( ( ruleWS )* ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3337:1: ( ( ( ruleWS ) ) ( ( ruleWS )* ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3337:1: ( ( ( ruleWS ) ) ( ( ruleWS )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3338:1: ( ( ruleWS ) ) ( ( ruleWS )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3338:1: ( ( ruleWS ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3339:1: ( ruleWS )
            {
             before(grammarAccess.getSigDefinitionsAccess().getWSParserRuleCall_3_1()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3340:1: ( ruleWS )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3340:3: ruleWS
            {
            pushFollow(FOLLOW_ruleWS_in_rule__SigDefinitions__Group_3__1__Impl6879);
            ruleWS();

            state._fsp--;


            }

             after(grammarAccess.getSigDefinitionsAccess().getWSParserRuleCall_3_1()); 

            }

            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3343:1: ( ( ruleWS )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3344:1: ( ruleWS )*
            {
             before(grammarAccess.getSigDefinitionsAccess().getWSParserRuleCall_3_1()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3345:1: ( ruleWS )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0>=RULE_SP && LA37_0<=RULE_SL_COMMENT)) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3345:3: ruleWS
            	    {
            	    pushFollow(FOLLOW_ruleWS_in_rule__SigDefinitions__Group_3__1__Impl6892);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3356:1: rule__SigDefinitions__Group_3__2 : rule__SigDefinitions__Group_3__2__Impl ;
    public final void rule__SigDefinitions__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3360:1: ( rule__SigDefinitions__Group_3__2__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3361:2: rule__SigDefinitions__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__SigDefinitions__Group_3__2__Impl_in_rule__SigDefinitions__Group_3__26925);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3367:1: rule__SigDefinitions__Group_3__2__Impl : ( ( rule__SigDefinitions__ConstuctsAssignment_3_2 ) ) ;
    public final void rule__SigDefinitions__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3371:1: ( ( ( rule__SigDefinitions__ConstuctsAssignment_3_2 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3372:1: ( ( rule__SigDefinitions__ConstuctsAssignment_3_2 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3372:1: ( ( rule__SigDefinitions__ConstuctsAssignment_3_2 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3373:1: ( rule__SigDefinitions__ConstuctsAssignment_3_2 )
            {
             before(grammarAccess.getSigDefinitionsAccess().getConstuctsAssignment_3_2()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3374:1: ( rule__SigDefinitions__ConstuctsAssignment_3_2 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3374:2: rule__SigDefinitions__ConstuctsAssignment_3_2
            {
            pushFollow(FOLLOW_rule__SigDefinitions__ConstuctsAssignment_3_2_in_rule__SigDefinitions__Group_3__2__Impl6952);
            rule__SigDefinitions__ConstuctsAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getSigDefinitionsAccess().getConstuctsAssignment_3_2()); 

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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3390:1: rule__SigDefinitions__Group_4__0 : rule__SigDefinitions__Group_4__0__Impl rule__SigDefinitions__Group_4__1 ;
    public final void rule__SigDefinitions__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3394:1: ( rule__SigDefinitions__Group_4__0__Impl rule__SigDefinitions__Group_4__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3395:2: rule__SigDefinitions__Group_4__0__Impl rule__SigDefinitions__Group_4__1
            {
            pushFollow(FOLLOW_rule__SigDefinitions__Group_4__0__Impl_in_rule__SigDefinitions__Group_4__06988);
            rule__SigDefinitions__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SigDefinitions__Group_4__1_in_rule__SigDefinitions__Group_4__06991);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3402:1: rule__SigDefinitions__Group_4__0__Impl : ( '.' ) ;
    public final void rule__SigDefinitions__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3406:1: ( ( '.' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3407:1: ( '.' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3407:1: ( '.' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3408:1: '.'
            {
             before(grammarAccess.getSigDefinitionsAccess().getFullStopKeyword_4_0()); 
            match(input,14,FOLLOW_14_in_rule__SigDefinitions__Group_4__0__Impl7019); 
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3421:1: rule__SigDefinitions__Group_4__1 : rule__SigDefinitions__Group_4__1__Impl ;
    public final void rule__SigDefinitions__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3425:1: ( rule__SigDefinitions__Group_4__1__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3426:2: rule__SigDefinitions__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__SigDefinitions__Group_4__1__Impl_in_rule__SigDefinitions__Group_4__17050);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3432:1: rule__SigDefinitions__Group_4__1__Impl : ( ( ruleWS )* ) ;
    public final void rule__SigDefinitions__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3436:1: ( ( ( ruleWS )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3437:1: ( ( ruleWS )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3437:1: ( ( ruleWS )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3438:1: ( ruleWS )*
            {
             before(grammarAccess.getSigDefinitionsAccess().getWSParserRuleCall_4_1()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3439:1: ( ruleWS )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( ((LA38_0>=RULE_SP && LA38_0<=RULE_SL_COMMENT)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3439:3: ruleWS
            	    {
            	    pushFollow(FOLLOW_ruleWS_in_rule__SigDefinitions__Group_4__1__Impl7078);
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


    // $ANTLR start "rule__SigConstruct__Group_3__0"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3453:1: rule__SigConstruct__Group_3__0 : rule__SigConstruct__Group_3__0__Impl rule__SigConstruct__Group_3__1 ;
    public final void rule__SigConstruct__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3457:1: ( rule__SigConstruct__Group_3__0__Impl rule__SigConstruct__Group_3__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3458:2: rule__SigConstruct__Group_3__0__Impl rule__SigConstruct__Group_3__1
            {
            pushFollow(FOLLOW_rule__SigConstruct__Group_3__0__Impl_in_rule__SigConstruct__Group_3__07113);
            rule__SigConstruct__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SigConstruct__Group_3__1_in_rule__SigConstruct__Group_3__07116);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3465:1: rule__SigConstruct__Group_3__0__Impl : ( '%' ) ;
    public final void rule__SigConstruct__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3469:1: ( ( '%' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3470:1: ( '%' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3470:1: ( '%' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3471:1: '%'
            {
             before(grammarAccess.getSigConstructAccess().getPercentSignKeyword_3_0()); 
            match(input,18,FOLLOW_18_in_rule__SigConstruct__Group_3__0__Impl7144); 
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3484:1: rule__SigConstruct__Group_3__1 : rule__SigConstruct__Group_3__1__Impl rule__SigConstruct__Group_3__2 ;
    public final void rule__SigConstruct__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3488:1: ( rule__SigConstruct__Group_3__1__Impl rule__SigConstruct__Group_3__2 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3489:2: rule__SigConstruct__Group_3__1__Impl rule__SigConstruct__Group_3__2
            {
            pushFollow(FOLLOW_rule__SigConstruct__Group_3__1__Impl_in_rule__SigConstruct__Group_3__17175);
            rule__SigConstruct__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SigConstruct__Group_3__2_in_rule__SigConstruct__Group_3__17178);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3496:1: rule__SigConstruct__Group_3__1__Impl : ( ( rule__SigConstruct__TmpAssignment_3_1 ) ) ;
    public final void rule__SigConstruct__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3500:1: ( ( ( rule__SigConstruct__TmpAssignment_3_1 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3501:1: ( ( rule__SigConstruct__TmpAssignment_3_1 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3501:1: ( ( rule__SigConstruct__TmpAssignment_3_1 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3502:1: ( rule__SigConstruct__TmpAssignment_3_1 )
            {
             before(grammarAccess.getSigConstructAccess().getTmpAssignment_3_1()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3503:1: ( rule__SigConstruct__TmpAssignment_3_1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3503:2: rule__SigConstruct__TmpAssignment_3_1
            {
            pushFollow(FOLLOW_rule__SigConstruct__TmpAssignment_3_1_in_rule__SigConstruct__Group_3__1__Impl7205);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3513:1: rule__SigConstruct__Group_3__2 : rule__SigConstruct__Group_3__2__Impl ;
    public final void rule__SigConstruct__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3517:1: ( rule__SigConstruct__Group_3__2__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3518:2: rule__SigConstruct__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__SigConstruct__Group_3__2__Impl_in_rule__SigConstruct__Group_3__27235);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3524:1: rule__SigConstruct__Group_3__2__Impl : ( ( ruleSOMETHING )* ) ;
    public final void rule__SigConstruct__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3528:1: ( ( ( ruleSOMETHING )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3529:1: ( ( ruleSOMETHING )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3529:1: ( ( ruleSOMETHING )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3530:1: ( ruleSOMETHING )*
            {
             before(grammarAccess.getSigConstructAccess().getSOMETHINGParserRuleCall_3_2()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3531:1: ( ruleSOMETHING )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==14) ) {
                    int LA39_2 = input.LA(2);

                    if ( ((LA39_2>=RULE_CID && LA39_2<=RULE_ANY_OTHER)) ) {
                        alt39=1;
                    }


                }
                else if ( ((LA39_0>=RULE_SP && LA39_0<=RULE_INT)||(LA39_0>=15 && LA39_0<=18)||LA39_0==30) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3531:3: ruleSOMETHING
            	    {
            	    pushFollow(FOLLOW_ruleSOMETHING_in_rule__SigConstruct__Group_3__2__Impl7263);
            	    ruleSOMETHING();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
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


    // $ANTLR start "rule__ClassicSymbolConstruct__Group__0"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3547:1: rule__ClassicSymbolConstruct__Group__0 : rule__ClassicSymbolConstruct__Group__0__Impl rule__ClassicSymbolConstruct__Group__1 ;
    public final void rule__ClassicSymbolConstruct__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3551:1: ( rule__ClassicSymbolConstruct__Group__0__Impl rule__ClassicSymbolConstruct__Group__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3552:2: rule__ClassicSymbolConstruct__Group__0__Impl rule__ClassicSymbolConstruct__Group__1
            {
            pushFollow(FOLLOW_rule__ClassicSymbolConstruct__Group__0__Impl_in_rule__ClassicSymbolConstruct__Group__07300);
            rule__ClassicSymbolConstruct__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClassicSymbolConstruct__Group__1_in_rule__ClassicSymbolConstruct__Group__07303);
            rule__ClassicSymbolConstruct__Group__1();

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
    // $ANTLR end "rule__ClassicSymbolConstruct__Group__0"


    // $ANTLR start "rule__ClassicSymbolConstruct__Group__0__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3559:1: rule__ClassicSymbolConstruct__Group__0__Impl : ( ( rule__ClassicSymbolConstruct__SymbNameAssignment_0 ) ) ;
    public final void rule__ClassicSymbolConstruct__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3563:1: ( ( ( rule__ClassicSymbolConstruct__SymbNameAssignment_0 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3564:1: ( ( rule__ClassicSymbolConstruct__SymbNameAssignment_0 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3564:1: ( ( rule__ClassicSymbolConstruct__SymbNameAssignment_0 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3565:1: ( rule__ClassicSymbolConstruct__SymbNameAssignment_0 )
            {
             before(grammarAccess.getClassicSymbolConstructAccess().getSymbNameAssignment_0()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3566:1: ( rule__ClassicSymbolConstruct__SymbNameAssignment_0 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3566:2: rule__ClassicSymbolConstruct__SymbNameAssignment_0
            {
            pushFollow(FOLLOW_rule__ClassicSymbolConstruct__SymbNameAssignment_0_in_rule__ClassicSymbolConstruct__Group__0__Impl7330);
            rule__ClassicSymbolConstruct__SymbNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getClassicSymbolConstructAccess().getSymbNameAssignment_0()); 

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
    // $ANTLR end "rule__ClassicSymbolConstruct__Group__0__Impl"


    // $ANTLR start "rule__ClassicSymbolConstruct__Group__1"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3576:1: rule__ClassicSymbolConstruct__Group__1 : rule__ClassicSymbolConstruct__Group__1__Impl rule__ClassicSymbolConstruct__Group__2 ;
    public final void rule__ClassicSymbolConstruct__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3580:1: ( rule__ClassicSymbolConstruct__Group__1__Impl rule__ClassicSymbolConstruct__Group__2 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3581:2: rule__ClassicSymbolConstruct__Group__1__Impl rule__ClassicSymbolConstruct__Group__2
            {
            pushFollow(FOLLOW_rule__ClassicSymbolConstruct__Group__1__Impl_in_rule__ClassicSymbolConstruct__Group__17360);
            rule__ClassicSymbolConstruct__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClassicSymbolConstruct__Group__2_in_rule__ClassicSymbolConstruct__Group__17363);
            rule__ClassicSymbolConstruct__Group__2();

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
    // $ANTLR end "rule__ClassicSymbolConstruct__Group__1"


    // $ANTLR start "rule__ClassicSymbolConstruct__Group__1__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3588:1: rule__ClassicSymbolConstruct__Group__1__Impl : ( ( ruleWS )* ) ;
    public final void rule__ClassicSymbolConstruct__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3592:1: ( ( ( ruleWS )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3593:1: ( ( ruleWS )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3593:1: ( ( ruleWS )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3594:1: ( ruleWS )*
            {
             before(grammarAccess.getClassicSymbolConstructAccess().getWSParserRuleCall_1()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3595:1: ( ruleWS )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( ((LA40_0>=RULE_SP && LA40_0<=RULE_SL_COMMENT)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3595:3: ruleWS
            	    {
            	    pushFollow(FOLLOW_ruleWS_in_rule__ClassicSymbolConstruct__Group__1__Impl7391);
            	    ruleWS();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

             after(grammarAccess.getClassicSymbolConstructAccess().getWSParserRuleCall_1()); 

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
    // $ANTLR end "rule__ClassicSymbolConstruct__Group__1__Impl"


    // $ANTLR start "rule__ClassicSymbolConstruct__Group__2"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3605:1: rule__ClassicSymbolConstruct__Group__2 : rule__ClassicSymbolConstruct__Group__2__Impl rule__ClassicSymbolConstruct__Group__3 ;
    public final void rule__ClassicSymbolConstruct__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3609:1: ( rule__ClassicSymbolConstruct__Group__2__Impl rule__ClassicSymbolConstruct__Group__3 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3610:2: rule__ClassicSymbolConstruct__Group__2__Impl rule__ClassicSymbolConstruct__Group__3
            {
            pushFollow(FOLLOW_rule__ClassicSymbolConstruct__Group__2__Impl_in_rule__ClassicSymbolConstruct__Group__27422);
            rule__ClassicSymbolConstruct__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClassicSymbolConstruct__Group__3_in_rule__ClassicSymbolConstruct__Group__27425);
            rule__ClassicSymbolConstruct__Group__3();

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
    // $ANTLR end "rule__ClassicSymbolConstruct__Group__2"


    // $ANTLR start "rule__ClassicSymbolConstruct__Group__2__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3617:1: rule__ClassicSymbolConstruct__Group__2__Impl : ( ( rule__ClassicSymbolConstruct__Alternatives_2 ) ) ;
    public final void rule__ClassicSymbolConstruct__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3621:1: ( ( ( rule__ClassicSymbolConstruct__Alternatives_2 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3622:1: ( ( rule__ClassicSymbolConstruct__Alternatives_2 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3622:1: ( ( rule__ClassicSymbolConstruct__Alternatives_2 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3623:1: ( rule__ClassicSymbolConstruct__Alternatives_2 )
            {
             before(grammarAccess.getClassicSymbolConstructAccess().getAlternatives_2()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3624:1: ( rule__ClassicSymbolConstruct__Alternatives_2 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3624:2: rule__ClassicSymbolConstruct__Alternatives_2
            {
            pushFollow(FOLLOW_rule__ClassicSymbolConstruct__Alternatives_2_in_rule__ClassicSymbolConstruct__Group__2__Impl7452);
            rule__ClassicSymbolConstruct__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getClassicSymbolConstructAccess().getAlternatives_2()); 

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
    // $ANTLR end "rule__ClassicSymbolConstruct__Group__2__Impl"


    // $ANTLR start "rule__ClassicSymbolConstruct__Group__3"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3634:1: rule__ClassicSymbolConstruct__Group__3 : rule__ClassicSymbolConstruct__Group__3__Impl ;
    public final void rule__ClassicSymbolConstruct__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3638:1: ( rule__ClassicSymbolConstruct__Group__3__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3639:2: rule__ClassicSymbolConstruct__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ClassicSymbolConstruct__Group__3__Impl_in_rule__ClassicSymbolConstruct__Group__37482);
            rule__ClassicSymbolConstruct__Group__3__Impl();

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
    // $ANTLR end "rule__ClassicSymbolConstruct__Group__3"


    // $ANTLR start "rule__ClassicSymbolConstruct__Group__3__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3645:1: rule__ClassicSymbolConstruct__Group__3__Impl : ( ( ruleSOMETHING )* ) ;
    public final void rule__ClassicSymbolConstruct__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3649:1: ( ( ( ruleSOMETHING )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3650:1: ( ( ruleSOMETHING )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3650:1: ( ( ruleSOMETHING )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3651:1: ( ruleSOMETHING )*
            {
             before(grammarAccess.getClassicSymbolConstructAccess().getSOMETHINGParserRuleCall_3()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3652:1: ( ruleSOMETHING )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==14) ) {
                    int LA41_2 = input.LA(2);

                    if ( ((LA41_2>=RULE_CID && LA41_2<=RULE_ANY_OTHER)) ) {
                        alt41=1;
                    }


                }
                else if ( ((LA41_0>=RULE_SP && LA41_0<=RULE_INT)||(LA41_0>=15 && LA41_0<=18)||LA41_0==30) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3652:3: ruleSOMETHING
            	    {
            	    pushFollow(FOLLOW_ruleSOMETHING_in_rule__ClassicSymbolConstruct__Group__3__Impl7510);
            	    ruleSOMETHING();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

             after(grammarAccess.getClassicSymbolConstructAccess().getSOMETHINGParserRuleCall_3()); 

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
    // $ANTLR end "rule__ClassicSymbolConstruct__Group__3__Impl"


    // $ANTLR start "rule__IncludeConstruct__Group__0"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3670:1: rule__IncludeConstruct__Group__0 : rule__IncludeConstruct__Group__0__Impl rule__IncludeConstruct__Group__1 ;
    public final void rule__IncludeConstruct__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3674:1: ( rule__IncludeConstruct__Group__0__Impl rule__IncludeConstruct__Group__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3675:2: rule__IncludeConstruct__Group__0__Impl rule__IncludeConstruct__Group__1
            {
            pushFollow(FOLLOW_rule__IncludeConstruct__Group__0__Impl_in_rule__IncludeConstruct__Group__07549);
            rule__IncludeConstruct__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IncludeConstruct__Group__1_in_rule__IncludeConstruct__Group__07552);
            rule__IncludeConstruct__Group__1();

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
    // $ANTLR end "rule__IncludeConstruct__Group__0"


    // $ANTLR start "rule__IncludeConstruct__Group__0__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3682:1: rule__IncludeConstruct__Group__0__Impl : ( '%' ) ;
    public final void rule__IncludeConstruct__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3686:1: ( ( '%' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3687:1: ( '%' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3687:1: ( '%' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3688:1: '%'
            {
             before(grammarAccess.getIncludeConstructAccess().getPercentSignKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__IncludeConstruct__Group__0__Impl7580); 
             after(grammarAccess.getIncludeConstructAccess().getPercentSignKeyword_0()); 

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
    // $ANTLR end "rule__IncludeConstruct__Group__0__Impl"


    // $ANTLR start "rule__IncludeConstruct__Group__1"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3701:1: rule__IncludeConstruct__Group__1 : rule__IncludeConstruct__Group__1__Impl rule__IncludeConstruct__Group__2 ;
    public final void rule__IncludeConstruct__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3705:1: ( rule__IncludeConstruct__Group__1__Impl rule__IncludeConstruct__Group__2 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3706:2: rule__IncludeConstruct__Group__1__Impl rule__IncludeConstruct__Group__2
            {
            pushFollow(FOLLOW_rule__IncludeConstruct__Group__1__Impl_in_rule__IncludeConstruct__Group__17611);
            rule__IncludeConstruct__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IncludeConstruct__Group__2_in_rule__IncludeConstruct__Group__17614);
            rule__IncludeConstruct__Group__2();

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
    // $ANTLR end "rule__IncludeConstruct__Group__1"


    // $ANTLR start "rule__IncludeConstruct__Group__1__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3713:1: rule__IncludeConstruct__Group__1__Impl : ( 'include' ) ;
    public final void rule__IncludeConstruct__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3717:1: ( ( 'include' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3718:1: ( 'include' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3718:1: ( 'include' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3719:1: 'include'
            {
             before(grammarAccess.getIncludeConstructAccess().getIncludeKeyword_1()); 
            match(input,33,FOLLOW_33_in_rule__IncludeConstruct__Group__1__Impl7642); 
             after(grammarAccess.getIncludeConstructAccess().getIncludeKeyword_1()); 

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
    // $ANTLR end "rule__IncludeConstruct__Group__1__Impl"


    // $ANTLR start "rule__IncludeConstruct__Group__2"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3732:1: rule__IncludeConstruct__Group__2 : rule__IncludeConstruct__Group__2__Impl rule__IncludeConstruct__Group__3 ;
    public final void rule__IncludeConstruct__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3736:1: ( rule__IncludeConstruct__Group__2__Impl rule__IncludeConstruct__Group__3 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3737:2: rule__IncludeConstruct__Group__2__Impl rule__IncludeConstruct__Group__3
            {
            pushFollow(FOLLOW_rule__IncludeConstruct__Group__2__Impl_in_rule__IncludeConstruct__Group__27673);
            rule__IncludeConstruct__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IncludeConstruct__Group__3_in_rule__IncludeConstruct__Group__27676);
            rule__IncludeConstruct__Group__3();

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
    // $ANTLR end "rule__IncludeConstruct__Group__2"


    // $ANTLR start "rule__IncludeConstruct__Group__2__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3744:1: rule__IncludeConstruct__Group__2__Impl : ( ( ( ruleWS ) ) ( ( ruleWS )* ) ) ;
    public final void rule__IncludeConstruct__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3748:1: ( ( ( ( ruleWS ) ) ( ( ruleWS )* ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3749:1: ( ( ( ruleWS ) ) ( ( ruleWS )* ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3749:1: ( ( ( ruleWS ) ) ( ( ruleWS )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3750:1: ( ( ruleWS ) ) ( ( ruleWS )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3750:1: ( ( ruleWS ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3751:1: ( ruleWS )
            {
             before(grammarAccess.getIncludeConstructAccess().getWSParserRuleCall_2()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3752:1: ( ruleWS )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3752:3: ruleWS
            {
            pushFollow(FOLLOW_ruleWS_in_rule__IncludeConstruct__Group__2__Impl7706);
            ruleWS();

            state._fsp--;


            }

             after(grammarAccess.getIncludeConstructAccess().getWSParserRuleCall_2()); 

            }

            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3755:1: ( ( ruleWS )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3756:1: ( ruleWS )*
            {
             before(grammarAccess.getIncludeConstructAccess().getWSParserRuleCall_2()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3757:1: ( ruleWS )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>=RULE_SP && LA42_0<=RULE_SL_COMMENT)) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3757:3: ruleWS
            	    {
            	    pushFollow(FOLLOW_ruleWS_in_rule__IncludeConstruct__Group__2__Impl7719);
            	    ruleWS();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

             after(grammarAccess.getIncludeConstructAccess().getWSParserRuleCall_2()); 

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
    // $ANTLR end "rule__IncludeConstruct__Group__2__Impl"


    // $ANTLR start "rule__IncludeConstruct__Group__3"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3768:1: rule__IncludeConstruct__Group__3 : rule__IncludeConstruct__Group__3__Impl rule__IncludeConstruct__Group__4 ;
    public final void rule__IncludeConstruct__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3772:1: ( rule__IncludeConstruct__Group__3__Impl rule__IncludeConstruct__Group__4 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3773:2: rule__IncludeConstruct__Group__3__Impl rule__IncludeConstruct__Group__4
            {
            pushFollow(FOLLOW_rule__IncludeConstruct__Group__3__Impl_in_rule__IncludeConstruct__Group__37752);
            rule__IncludeConstruct__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IncludeConstruct__Group__4_in_rule__IncludeConstruct__Group__37755);
            rule__IncludeConstruct__Group__4();

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
    // $ANTLR end "rule__IncludeConstruct__Group__3"


    // $ANTLR start "rule__IncludeConstruct__Group__3__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3780:1: rule__IncludeConstruct__Group__3__Impl : ( ( rule__IncludeConstruct__NamespaceAssignment_3 ) ) ;
    public final void rule__IncludeConstruct__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3784:1: ( ( ( rule__IncludeConstruct__NamespaceAssignment_3 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3785:1: ( ( rule__IncludeConstruct__NamespaceAssignment_3 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3785:1: ( ( rule__IncludeConstruct__NamespaceAssignment_3 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3786:1: ( rule__IncludeConstruct__NamespaceAssignment_3 )
            {
             before(grammarAccess.getIncludeConstructAccess().getNamespaceAssignment_3()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3787:1: ( rule__IncludeConstruct__NamespaceAssignment_3 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3787:2: rule__IncludeConstruct__NamespaceAssignment_3
            {
            pushFollow(FOLLOW_rule__IncludeConstruct__NamespaceAssignment_3_in_rule__IncludeConstruct__Group__3__Impl7782);
            rule__IncludeConstruct__NamespaceAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getIncludeConstructAccess().getNamespaceAssignment_3()); 

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
    // $ANTLR end "rule__IncludeConstruct__Group__3__Impl"


    // $ANTLR start "rule__IncludeConstruct__Group__4"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3797:1: rule__IncludeConstruct__Group__4 : rule__IncludeConstruct__Group__4__Impl ;
    public final void rule__IncludeConstruct__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3801:1: ( rule__IncludeConstruct__Group__4__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3802:2: rule__IncludeConstruct__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__IncludeConstruct__Group__4__Impl_in_rule__IncludeConstruct__Group__47812);
            rule__IncludeConstruct__Group__4__Impl();

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
    // $ANTLR end "rule__IncludeConstruct__Group__4"


    // $ANTLR start "rule__IncludeConstruct__Group__4__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3808:1: rule__IncludeConstruct__Group__4__Impl : ( ( rule__IncludeConstruct__Group_4__0 )? ) ;
    public final void rule__IncludeConstruct__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3812:1: ( ( ( rule__IncludeConstruct__Group_4__0 )? ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3813:1: ( ( rule__IncludeConstruct__Group_4__0 )? )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3813:1: ( ( rule__IncludeConstruct__Group_4__0 )? )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3814:1: ( rule__IncludeConstruct__Group_4__0 )?
            {
             before(grammarAccess.getIncludeConstructAccess().getGroup_4()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3815:1: ( rule__IncludeConstruct__Group_4__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=RULE_SP && LA43_0<=RULE_SL_COMMENT)) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3815:2: rule__IncludeConstruct__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__IncludeConstruct__Group_4__0_in_rule__IncludeConstruct__Group__4__Impl7839);
                    rule__IncludeConstruct__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIncludeConstructAccess().getGroup_4()); 

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
    // $ANTLR end "rule__IncludeConstruct__Group__4__Impl"


    // $ANTLR start "rule__IncludeConstruct__Group_4__0"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3835:1: rule__IncludeConstruct__Group_4__0 : rule__IncludeConstruct__Group_4__0__Impl rule__IncludeConstruct__Group_4__1 ;
    public final void rule__IncludeConstruct__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3839:1: ( rule__IncludeConstruct__Group_4__0__Impl rule__IncludeConstruct__Group_4__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3840:2: rule__IncludeConstruct__Group_4__0__Impl rule__IncludeConstruct__Group_4__1
            {
            pushFollow(FOLLOW_rule__IncludeConstruct__Group_4__0__Impl_in_rule__IncludeConstruct__Group_4__07880);
            rule__IncludeConstruct__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IncludeConstruct__Group_4__1_in_rule__IncludeConstruct__Group_4__07883);
            rule__IncludeConstruct__Group_4__1();

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
    // $ANTLR end "rule__IncludeConstruct__Group_4__0"


    // $ANTLR start "rule__IncludeConstruct__Group_4__0__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3847:1: rule__IncludeConstruct__Group_4__0__Impl : ( ( ( ruleWS ) ) ( ( ruleWS )* ) ) ;
    public final void rule__IncludeConstruct__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3851:1: ( ( ( ( ruleWS ) ) ( ( ruleWS )* ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3852:1: ( ( ( ruleWS ) ) ( ( ruleWS )* ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3852:1: ( ( ( ruleWS ) ) ( ( ruleWS )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3853:1: ( ( ruleWS ) ) ( ( ruleWS )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3853:1: ( ( ruleWS ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3854:1: ( ruleWS )
            {
             before(grammarAccess.getIncludeConstructAccess().getWSParserRuleCall_4_0()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3855:1: ( ruleWS )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3855:3: ruleWS
            {
            pushFollow(FOLLOW_ruleWS_in_rule__IncludeConstruct__Group_4__0__Impl7913);
            ruleWS();

            state._fsp--;


            }

             after(grammarAccess.getIncludeConstructAccess().getWSParserRuleCall_4_0()); 

            }

            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3858:1: ( ( ruleWS )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3859:1: ( ruleWS )*
            {
             before(grammarAccess.getIncludeConstructAccess().getWSParserRuleCall_4_0()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3860:1: ( ruleWS )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0>=RULE_SP && LA44_0<=RULE_SL_COMMENT)) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3860:3: ruleWS
            	    {
            	    pushFollow(FOLLOW_ruleWS_in_rule__IncludeConstruct__Group_4__0__Impl7926);
            	    ruleWS();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

             after(grammarAccess.getIncludeConstructAccess().getWSParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__IncludeConstruct__Group_4__0__Impl"


    // $ANTLR start "rule__IncludeConstruct__Group_4__1"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3871:1: rule__IncludeConstruct__Group_4__1 : rule__IncludeConstruct__Group_4__1__Impl ;
    public final void rule__IncludeConstruct__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3875:1: ( rule__IncludeConstruct__Group_4__1__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3876:2: rule__IncludeConstruct__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__IncludeConstruct__Group_4__1__Impl_in_rule__IncludeConstruct__Group_4__17959);
            rule__IncludeConstruct__Group_4__1__Impl();

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
    // $ANTLR end "rule__IncludeConstruct__Group_4__1"


    // $ANTLR start "rule__IncludeConstruct__Group_4__1__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3882:1: rule__IncludeConstruct__Group_4__1__Impl : ( ruleincludeOps ) ;
    public final void rule__IncludeConstruct__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3886:1: ( ( ruleincludeOps ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3887:1: ( ruleincludeOps )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3887:1: ( ruleincludeOps )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3888:1: ruleincludeOps
            {
             before(grammarAccess.getIncludeConstructAccess().getIncludeOpsParserRuleCall_4_1()); 
            pushFollow(FOLLOW_ruleincludeOps_in_rule__IncludeConstruct__Group_4__1__Impl7986);
            ruleincludeOps();

            state._fsp--;

             after(grammarAccess.getIncludeConstructAccess().getIncludeOpsParserRuleCall_4_1()); 

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
    // $ANTLR end "rule__IncludeConstruct__Group_4__1__Impl"


    // $ANTLR start "rule__StructConstruct__Group__0"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3903:1: rule__StructConstruct__Group__0 : rule__StructConstruct__Group__0__Impl rule__StructConstruct__Group__1 ;
    public final void rule__StructConstruct__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3907:1: ( rule__StructConstruct__Group__0__Impl rule__StructConstruct__Group__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3908:2: rule__StructConstruct__Group__0__Impl rule__StructConstruct__Group__1
            {
            pushFollow(FOLLOW_rule__StructConstruct__Group__0__Impl_in_rule__StructConstruct__Group__08019);
            rule__StructConstruct__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructConstruct__Group__1_in_rule__StructConstruct__Group__08022);
            rule__StructConstruct__Group__1();

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
    // $ANTLR end "rule__StructConstruct__Group__0"


    // $ANTLR start "rule__StructConstruct__Group__0__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3915:1: rule__StructConstruct__Group__0__Impl : ( '%' ) ;
    public final void rule__StructConstruct__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3919:1: ( ( '%' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3920:1: ( '%' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3920:1: ( '%' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3921:1: '%'
            {
             before(grammarAccess.getStructConstructAccess().getPercentSignKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__StructConstruct__Group__0__Impl8050); 
             after(grammarAccess.getStructConstructAccess().getPercentSignKeyword_0()); 

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
    // $ANTLR end "rule__StructConstruct__Group__0__Impl"


    // $ANTLR start "rule__StructConstruct__Group__1"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3934:1: rule__StructConstruct__Group__1 : rule__StructConstruct__Group__1__Impl rule__StructConstruct__Group__2 ;
    public final void rule__StructConstruct__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3938:1: ( rule__StructConstruct__Group__1__Impl rule__StructConstruct__Group__2 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3939:2: rule__StructConstruct__Group__1__Impl rule__StructConstruct__Group__2
            {
            pushFollow(FOLLOW_rule__StructConstruct__Group__1__Impl_in_rule__StructConstruct__Group__18081);
            rule__StructConstruct__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructConstruct__Group__2_in_rule__StructConstruct__Group__18084);
            rule__StructConstruct__Group__2();

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
    // $ANTLR end "rule__StructConstruct__Group__1"


    // $ANTLR start "rule__StructConstruct__Group__1__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3946:1: rule__StructConstruct__Group__1__Impl : ( 'struct' ) ;
    public final void rule__StructConstruct__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3950:1: ( ( 'struct' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3951:1: ( 'struct' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3951:1: ( 'struct' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3952:1: 'struct'
            {
             before(grammarAccess.getStructConstructAccess().getStructKeyword_1()); 
            match(input,34,FOLLOW_34_in_rule__StructConstruct__Group__1__Impl8112); 
             after(grammarAccess.getStructConstructAccess().getStructKeyword_1()); 

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
    // $ANTLR end "rule__StructConstruct__Group__1__Impl"


    // $ANTLR start "rule__StructConstruct__Group__2"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3965:1: rule__StructConstruct__Group__2 : rule__StructConstruct__Group__2__Impl rule__StructConstruct__Group__3 ;
    public final void rule__StructConstruct__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3969:1: ( rule__StructConstruct__Group__2__Impl rule__StructConstruct__Group__3 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3970:2: rule__StructConstruct__Group__2__Impl rule__StructConstruct__Group__3
            {
            pushFollow(FOLLOW_rule__StructConstruct__Group__2__Impl_in_rule__StructConstruct__Group__28143);
            rule__StructConstruct__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructConstruct__Group__3_in_rule__StructConstruct__Group__28146);
            rule__StructConstruct__Group__3();

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
    // $ANTLR end "rule__StructConstruct__Group__2"


    // $ANTLR start "rule__StructConstruct__Group__2__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3977:1: rule__StructConstruct__Group__2__Impl : ( ( ( ruleWS ) ) ( ( ruleWS )* ) ) ;
    public final void rule__StructConstruct__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3981:1: ( ( ( ( ruleWS ) ) ( ( ruleWS )* ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3982:1: ( ( ( ruleWS ) ) ( ( ruleWS )* ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3982:1: ( ( ( ruleWS ) ) ( ( ruleWS )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3983:1: ( ( ruleWS ) ) ( ( ruleWS )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3983:1: ( ( ruleWS ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3984:1: ( ruleWS )
            {
             before(grammarAccess.getStructConstructAccess().getWSParserRuleCall_2()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3985:1: ( ruleWS )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3985:3: ruleWS
            {
            pushFollow(FOLLOW_ruleWS_in_rule__StructConstruct__Group__2__Impl8176);
            ruleWS();

            state._fsp--;


            }

             after(grammarAccess.getStructConstructAccess().getWSParserRuleCall_2()); 

            }

            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3988:1: ( ( ruleWS )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3989:1: ( ruleWS )*
            {
             before(grammarAccess.getStructConstructAccess().getWSParserRuleCall_2()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3990:1: ( ruleWS )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( ((LA45_0>=RULE_SP && LA45_0<=RULE_SL_COMMENT)) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3990:3: ruleWS
            	    {
            	    pushFollow(FOLLOW_ruleWS_in_rule__StructConstruct__Group__2__Impl8189);
            	    ruleWS();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

             after(grammarAccess.getStructConstructAccess().getWSParserRuleCall_2()); 

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
    // $ANTLR end "rule__StructConstruct__Group__2__Impl"


    // $ANTLR start "rule__StructConstruct__Group__3"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4001:1: rule__StructConstruct__Group__3 : rule__StructConstruct__Group__3__Impl rule__StructConstruct__Group__4 ;
    public final void rule__StructConstruct__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4005:1: ( rule__StructConstruct__Group__3__Impl rule__StructConstruct__Group__4 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4006:2: rule__StructConstruct__Group__3__Impl rule__StructConstruct__Group__4
            {
            pushFollow(FOLLOW_rule__StructConstruct__Group__3__Impl_in_rule__StructConstruct__Group__38222);
            rule__StructConstruct__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructConstruct__Group__4_in_rule__StructConstruct__Group__38225);
            rule__StructConstruct__Group__4();

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
    // $ANTLR end "rule__StructConstruct__Group__3"


    // $ANTLR start "rule__StructConstruct__Group__3__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4013:1: rule__StructConstruct__Group__3__Impl : ( ( rule__StructConstruct__StructNameAssignment_3 ) ) ;
    public final void rule__StructConstruct__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4017:1: ( ( ( rule__StructConstruct__StructNameAssignment_3 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4018:1: ( ( rule__StructConstruct__StructNameAssignment_3 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4018:1: ( ( rule__StructConstruct__StructNameAssignment_3 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4019:1: ( rule__StructConstruct__StructNameAssignment_3 )
            {
             before(grammarAccess.getStructConstructAccess().getStructNameAssignment_3()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4020:1: ( rule__StructConstruct__StructNameAssignment_3 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4020:2: rule__StructConstruct__StructNameAssignment_3
            {
            pushFollow(FOLLOW_rule__StructConstruct__StructNameAssignment_3_in_rule__StructConstruct__Group__3__Impl8252);
            rule__StructConstruct__StructNameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getStructConstructAccess().getStructNameAssignment_3()); 

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
    // $ANTLR end "rule__StructConstruct__Group__3__Impl"


    // $ANTLR start "rule__StructConstruct__Group__4"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4030:1: rule__StructConstruct__Group__4 : rule__StructConstruct__Group__4__Impl rule__StructConstruct__Group__5 ;
    public final void rule__StructConstruct__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4034:1: ( rule__StructConstruct__Group__4__Impl rule__StructConstruct__Group__5 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4035:2: rule__StructConstruct__Group__4__Impl rule__StructConstruct__Group__5
            {
            pushFollow(FOLLOW_rule__StructConstruct__Group__4__Impl_in_rule__StructConstruct__Group__48282);
            rule__StructConstruct__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructConstruct__Group__5_in_rule__StructConstruct__Group__48285);
            rule__StructConstruct__Group__5();

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
    // $ANTLR end "rule__StructConstruct__Group__4"


    // $ANTLR start "rule__StructConstruct__Group__4__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4042:1: rule__StructConstruct__Group__4__Impl : ( ( ruleWS )* ) ;
    public final void rule__StructConstruct__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4046:1: ( ( ( ruleWS )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4047:1: ( ( ruleWS )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4047:1: ( ( ruleWS )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4048:1: ( ruleWS )*
            {
             before(grammarAccess.getStructConstructAccess().getWSParserRuleCall_4()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4049:1: ( ruleWS )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( ((LA46_0>=RULE_SP && LA46_0<=RULE_SL_COMMENT)) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4049:3: ruleWS
            	    {
            	    pushFollow(FOLLOW_ruleWS_in_rule__StructConstruct__Group__4__Impl8313);
            	    ruleWS();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

             after(grammarAccess.getStructConstructAccess().getWSParserRuleCall_4()); 

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
    // $ANTLR end "rule__StructConstruct__Group__4__Impl"


    // $ANTLR start "rule__StructConstruct__Group__5"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4059:1: rule__StructConstruct__Group__5 : rule__StructConstruct__Group__5__Impl rule__StructConstruct__Group__6 ;
    public final void rule__StructConstruct__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4063:1: ( rule__StructConstruct__Group__5__Impl rule__StructConstruct__Group__6 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4064:2: rule__StructConstruct__Group__5__Impl rule__StructConstruct__Group__6
            {
            pushFollow(FOLLOW_rule__StructConstruct__Group__5__Impl_in_rule__StructConstruct__Group__58344);
            rule__StructConstruct__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructConstruct__Group__6_in_rule__StructConstruct__Group__58347);
            rule__StructConstruct__Group__6();

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
    // $ANTLR end "rule__StructConstruct__Group__5"


    // $ANTLR start "rule__StructConstruct__Group__5__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4071:1: rule__StructConstruct__Group__5__Impl : ( ( rule__StructConstruct__Alternatives_5 ) ) ;
    public final void rule__StructConstruct__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4075:1: ( ( ( rule__StructConstruct__Alternatives_5 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4076:1: ( ( rule__StructConstruct__Alternatives_5 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4076:1: ( ( rule__StructConstruct__Alternatives_5 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4077:1: ( rule__StructConstruct__Alternatives_5 )
            {
             before(grammarAccess.getStructConstructAccess().getAlternatives_5()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4078:1: ( rule__StructConstruct__Alternatives_5 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4078:2: rule__StructConstruct__Alternatives_5
            {
            pushFollow(FOLLOW_rule__StructConstruct__Alternatives_5_in_rule__StructConstruct__Group__5__Impl8374);
            rule__StructConstruct__Alternatives_5();

            state._fsp--;


            }

             after(grammarAccess.getStructConstructAccess().getAlternatives_5()); 

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
    // $ANTLR end "rule__StructConstruct__Group__5__Impl"


    // $ANTLR start "rule__StructConstruct__Group__6"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4088:1: rule__StructConstruct__Group__6 : rule__StructConstruct__Group__6__Impl rule__StructConstruct__Group__7 ;
    public final void rule__StructConstruct__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4092:1: ( rule__StructConstruct__Group__6__Impl rule__StructConstruct__Group__7 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4093:2: rule__StructConstruct__Group__6__Impl rule__StructConstruct__Group__7
            {
            pushFollow(FOLLOW_rule__StructConstruct__Group__6__Impl_in_rule__StructConstruct__Group__68404);
            rule__StructConstruct__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructConstruct__Group__7_in_rule__StructConstruct__Group__68407);
            rule__StructConstruct__Group__7();

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
    // $ANTLR end "rule__StructConstruct__Group__6"


    // $ANTLR start "rule__StructConstruct__Group__6__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4100:1: rule__StructConstruct__Group__6__Impl : ( ( ruleWS )* ) ;
    public final void rule__StructConstruct__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4104:1: ( ( ( ruleWS )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4105:1: ( ( ruleWS )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4105:1: ( ( ruleWS )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4106:1: ( ruleWS )*
            {
             before(grammarAccess.getStructConstructAccess().getWSParserRuleCall_6()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4107:1: ( ruleWS )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( ((LA47_0>=RULE_SP && LA47_0<=RULE_SL_COMMENT)) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4107:3: ruleWS
            	    {
            	    pushFollow(FOLLOW_ruleWS_in_rule__StructConstruct__Group__6__Impl8435);
            	    ruleWS();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

             after(grammarAccess.getStructConstructAccess().getWSParserRuleCall_6()); 

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
    // $ANTLR end "rule__StructConstruct__Group__6__Impl"


    // $ANTLR start "rule__StructConstruct__Group__7"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4117:1: rule__StructConstruct__Group__7 : rule__StructConstruct__Group__7__Impl rule__StructConstruct__Group__8 ;
    public final void rule__StructConstruct__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4121:1: ( rule__StructConstruct__Group__7__Impl rule__StructConstruct__Group__8 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4122:2: rule__StructConstruct__Group__7__Impl rule__StructConstruct__Group__8
            {
            pushFollow(FOLLOW_rule__StructConstruct__Group__7__Impl_in_rule__StructConstruct__Group__78466);
            rule__StructConstruct__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructConstruct__Group__8_in_rule__StructConstruct__Group__78469);
            rule__StructConstruct__Group__8();

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
    // $ANTLR end "rule__StructConstruct__Group__7"


    // $ANTLR start "rule__StructConstruct__Group__7__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4129:1: rule__StructConstruct__Group__7__Impl : ( ( rule__StructConstruct__NamespaceAssignment_7 ) ) ;
    public final void rule__StructConstruct__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4133:1: ( ( ( rule__StructConstruct__NamespaceAssignment_7 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4134:1: ( ( rule__StructConstruct__NamespaceAssignment_7 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4134:1: ( ( rule__StructConstruct__NamespaceAssignment_7 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4135:1: ( rule__StructConstruct__NamespaceAssignment_7 )
            {
             before(grammarAccess.getStructConstructAccess().getNamespaceAssignment_7()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4136:1: ( rule__StructConstruct__NamespaceAssignment_7 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4136:2: rule__StructConstruct__NamespaceAssignment_7
            {
            pushFollow(FOLLOW_rule__StructConstruct__NamespaceAssignment_7_in_rule__StructConstruct__Group__7__Impl8496);
            rule__StructConstruct__NamespaceAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getStructConstructAccess().getNamespaceAssignment_7()); 

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
    // $ANTLR end "rule__StructConstruct__Group__7__Impl"


    // $ANTLR start "rule__StructConstruct__Group__8"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4146:1: rule__StructConstruct__Group__8 : rule__StructConstruct__Group__8__Impl rule__StructConstruct__Group__9 ;
    public final void rule__StructConstruct__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4150:1: ( rule__StructConstruct__Group__8__Impl rule__StructConstruct__Group__9 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4151:2: rule__StructConstruct__Group__8__Impl rule__StructConstruct__Group__9
            {
            pushFollow(FOLLOW_rule__StructConstruct__Group__8__Impl_in_rule__StructConstruct__Group__88526);
            rule__StructConstruct__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructConstruct__Group__9_in_rule__StructConstruct__Group__88529);
            rule__StructConstruct__Group__9();

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
    // $ANTLR end "rule__StructConstruct__Group__8"


    // $ANTLR start "rule__StructConstruct__Group__8__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4158:1: rule__StructConstruct__Group__8__Impl : ( ( ruleSOMETHING )* ) ;
    public final void rule__StructConstruct__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4162:1: ( ( ( ruleSOMETHING )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4163:1: ( ( ruleSOMETHING )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4163:1: ( ( ruleSOMETHING )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4164:1: ( ruleSOMETHING )*
            {
             before(grammarAccess.getStructConstructAccess().getSOMETHINGParserRuleCall_8()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4165:1: ( ruleSOMETHING )*
            loop48:
            do {
                int alt48=2;
                switch ( input.LA(1) ) {
                case 18:
                    {
                    int LA48_1 = input.LA(2);

                    if ( (LA48_1==EOF||(LA48_1>=RULE_SP && LA48_1<=RULE_INT)||(LA48_1>=14 && LA48_1<=18)||(LA48_1>=30 && LA48_1<=31)) ) {
                        alt48=1;
                    }


                    }
                    break;
                case 14:
                    {
                    int LA48_3 = input.LA(2);

                    if ( ((LA48_3>=RULE_CID && LA48_3<=RULE_ANY_OTHER)) ) {
                        alt48=1;
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
                    alt48=1;
                    }
                    break;

                }

                switch (alt48) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4165:3: ruleSOMETHING
            	    {
            	    pushFollow(FOLLOW_ruleSOMETHING_in_rule__StructConstruct__Group__8__Impl8557);
            	    ruleSOMETHING();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

             after(grammarAccess.getStructConstructAccess().getSOMETHINGParserRuleCall_8()); 

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
    // $ANTLR end "rule__StructConstruct__Group__8__Impl"


    // $ANTLR start "rule__StructConstruct__Group__9"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4175:1: rule__StructConstruct__Group__9 : rule__StructConstruct__Group__9__Impl ;
    public final void rule__StructConstruct__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4179:1: ( rule__StructConstruct__Group__9__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4180:2: rule__StructConstruct__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__StructConstruct__Group__9__Impl_in_rule__StructConstruct__Group__98588);
            rule__StructConstruct__Group__9__Impl();

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
    // $ANTLR end "rule__StructConstruct__Group__9"


    // $ANTLR start "rule__StructConstruct__Group__9__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4186:1: rule__StructConstruct__Group__9__Impl : ( ( rule__StructConstruct__IncOptAssignment_9 )? ) ;
    public final void rule__StructConstruct__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4190:1: ( ( ( rule__StructConstruct__IncOptAssignment_9 )? ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4191:1: ( ( rule__StructConstruct__IncOptAssignment_9 )? )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4191:1: ( ( rule__StructConstruct__IncOptAssignment_9 )? )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4192:1: ( rule__StructConstruct__IncOptAssignment_9 )?
            {
             before(grammarAccess.getStructConstructAccess().getIncOptAssignment_9()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4193:1: ( rule__StructConstruct__IncOptAssignment_9 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==18) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4193:2: rule__StructConstruct__IncOptAssignment_9
                    {
                    pushFollow(FOLLOW_rule__StructConstruct__IncOptAssignment_9_in_rule__StructConstruct__Group__9__Impl8615);
                    rule__StructConstruct__IncOptAssignment_9();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStructConstructAccess().getIncOptAssignment_9()); 

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
    // $ANTLR end "rule__StructConstruct__Group__9__Impl"


    // $ANTLR start "rule__IncludeOps__Group__0"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4223:1: rule__IncludeOps__Group__0 : rule__IncludeOps__Group__0__Impl rule__IncludeOps__Group__1 ;
    public final void rule__IncludeOps__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4227:1: ( rule__IncludeOps__Group__0__Impl rule__IncludeOps__Group__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4228:2: rule__IncludeOps__Group__0__Impl rule__IncludeOps__Group__1
            {
            pushFollow(FOLLOW_rule__IncludeOps__Group__0__Impl_in_rule__IncludeOps__Group__08666);
            rule__IncludeOps__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IncludeOps__Group__1_in_rule__IncludeOps__Group__08669);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4235:1: rule__IncludeOps__Group__0__Impl : ( '%' ) ;
    public final void rule__IncludeOps__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4239:1: ( ( '%' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4240:1: ( '%' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4240:1: ( '%' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4241:1: '%'
            {
             before(grammarAccess.getIncludeOpsAccess().getPercentSignKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__IncludeOps__Group__0__Impl8697); 
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4254:1: rule__IncludeOps__Group__1 : rule__IncludeOps__Group__1__Impl rule__IncludeOps__Group__2 ;
    public final void rule__IncludeOps__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4258:1: ( rule__IncludeOps__Group__1__Impl rule__IncludeOps__Group__2 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4259:2: rule__IncludeOps__Group__1__Impl rule__IncludeOps__Group__2
            {
            pushFollow(FOLLOW_rule__IncludeOps__Group__1__Impl_in_rule__IncludeOps__Group__18728);
            rule__IncludeOps__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IncludeOps__Group__2_in_rule__IncludeOps__Group__18731);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4266:1: rule__IncludeOps__Group__1__Impl : ( 'open' ) ;
    public final void rule__IncludeOps__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4270:1: ( ( 'open' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4271:1: ( 'open' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4271:1: ( 'open' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4272:1: 'open'
            {
             before(grammarAccess.getIncludeOpsAccess().getOpenKeyword_1()); 
            match(input,35,FOLLOW_35_in_rule__IncludeOps__Group__1__Impl8759); 
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4285:1: rule__IncludeOps__Group__2 : rule__IncludeOps__Group__2__Impl ;
    public final void rule__IncludeOps__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4289:1: ( rule__IncludeOps__Group__2__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4290:2: rule__IncludeOps__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__IncludeOps__Group__2__Impl_in_rule__IncludeOps__Group__28790);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4296:1: rule__IncludeOps__Group__2__Impl : ( ( ruleSOMETHING )* ) ;
    public final void rule__IncludeOps__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4300:1: ( ( ( ruleSOMETHING )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4301:1: ( ( ruleSOMETHING )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4301:1: ( ( ruleSOMETHING )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4302:1: ( ruleSOMETHING )*
            {
             before(grammarAccess.getIncludeOpsAccess().getSOMETHINGParserRuleCall_2()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4303:1: ( ruleSOMETHING )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==14) ) {
                    int LA50_2 = input.LA(2);

                    if ( ((LA50_2>=RULE_CID && LA50_2<=RULE_ANY_OTHER)) ) {
                        alt50=1;
                    }


                }
                else if ( ((LA50_0>=RULE_SP && LA50_0<=RULE_INT)||(LA50_0>=15 && LA50_0<=18)||LA50_0==30) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4303:3: ruleSOMETHING
            	    {
            	    pushFollow(FOLLOW_ruleSOMETHING_in_rule__IncludeOps__Group__2__Impl8818);
            	    ruleSOMETHING();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop50;
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4319:1: rule__ViewDeclaration__Group__0 : rule__ViewDeclaration__Group__0__Impl rule__ViewDeclaration__Group__1 ;
    public final void rule__ViewDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4323:1: ( rule__ViewDeclaration__Group__0__Impl rule__ViewDeclaration__Group__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4324:2: rule__ViewDeclaration__Group__0__Impl rule__ViewDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__Group__0__Impl_in_rule__ViewDeclaration__Group__08855);
            rule__ViewDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ViewDeclaration__Group__1_in_rule__ViewDeclaration__Group__08858);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4331:1: rule__ViewDeclaration__Group__0__Impl : ( '%' ) ;
    public final void rule__ViewDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4335:1: ( ( '%' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4336:1: ( '%' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4336:1: ( '%' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4337:1: '%'
            {
             before(grammarAccess.getViewDeclarationAccess().getPercentSignKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__ViewDeclaration__Group__0__Impl8886); 
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4350:1: rule__ViewDeclaration__Group__1 : rule__ViewDeclaration__Group__1__Impl rule__ViewDeclaration__Group__2 ;
    public final void rule__ViewDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4354:1: ( rule__ViewDeclaration__Group__1__Impl rule__ViewDeclaration__Group__2 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4355:2: rule__ViewDeclaration__Group__1__Impl rule__ViewDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__Group__1__Impl_in_rule__ViewDeclaration__Group__18917);
            rule__ViewDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ViewDeclaration__Group__2_in_rule__ViewDeclaration__Group__18920);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4362:1: rule__ViewDeclaration__Group__1__Impl : ( 'view' ) ;
    public final void rule__ViewDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4366:1: ( ( 'view' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4367:1: ( 'view' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4367:1: ( 'view' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4368:1: 'view'
            {
             before(grammarAccess.getViewDeclarationAccess().getViewKeyword_1()); 
            match(input,36,FOLLOW_36_in_rule__ViewDeclaration__Group__1__Impl8948); 
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4381:1: rule__ViewDeclaration__Group__2 : rule__ViewDeclaration__Group__2__Impl rule__ViewDeclaration__Group__3 ;
    public final void rule__ViewDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4385:1: ( rule__ViewDeclaration__Group__2__Impl rule__ViewDeclaration__Group__3 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4386:2: rule__ViewDeclaration__Group__2__Impl rule__ViewDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__Group__2__Impl_in_rule__ViewDeclaration__Group__28979);
            rule__ViewDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ViewDeclaration__Group__3_in_rule__ViewDeclaration__Group__28982);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4393:1: rule__ViewDeclaration__Group__2__Impl : ( ( ( ruleWS ) ) ( ( ruleWS )* ) ) ;
    public final void rule__ViewDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4397:1: ( ( ( ( ruleWS ) ) ( ( ruleWS )* ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4398:1: ( ( ( ruleWS ) ) ( ( ruleWS )* ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4398:1: ( ( ( ruleWS ) ) ( ( ruleWS )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4399:1: ( ( ruleWS ) ) ( ( ruleWS )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4399:1: ( ( ruleWS ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4400:1: ( ruleWS )
            {
             before(grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_2()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4401:1: ( ruleWS )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4401:3: ruleWS
            {
            pushFollow(FOLLOW_ruleWS_in_rule__ViewDeclaration__Group__2__Impl9012);
            ruleWS();

            state._fsp--;


            }

             after(grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_2()); 

            }

            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4404:1: ( ( ruleWS )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4405:1: ( ruleWS )*
            {
             before(grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_2()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4406:1: ( ruleWS )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( ((LA51_0>=RULE_SP && LA51_0<=RULE_SL_COMMENT)) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4406:3: ruleWS
            	    {
            	    pushFollow(FOLLOW_ruleWS_in_rule__ViewDeclaration__Group__2__Impl9025);
            	    ruleWS();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop51;
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4417:1: rule__ViewDeclaration__Group__3 : rule__ViewDeclaration__Group__3__Impl rule__ViewDeclaration__Group__4 ;
    public final void rule__ViewDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4421:1: ( rule__ViewDeclaration__Group__3__Impl rule__ViewDeclaration__Group__4 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4422:2: rule__ViewDeclaration__Group__3__Impl rule__ViewDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__Group__3__Impl_in_rule__ViewDeclaration__Group__39058);
            rule__ViewDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ViewDeclaration__Group__4_in_rule__ViewDeclaration__Group__39061);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4429:1: rule__ViewDeclaration__Group__3__Impl : ( ( rule__ViewDeclaration__ViewIDAssignment_3 ) ) ;
    public final void rule__ViewDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4433:1: ( ( ( rule__ViewDeclaration__ViewIDAssignment_3 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4434:1: ( ( rule__ViewDeclaration__ViewIDAssignment_3 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4434:1: ( ( rule__ViewDeclaration__ViewIDAssignment_3 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4435:1: ( rule__ViewDeclaration__ViewIDAssignment_3 )
            {
             before(grammarAccess.getViewDeclarationAccess().getViewIDAssignment_3()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4436:1: ( rule__ViewDeclaration__ViewIDAssignment_3 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4436:2: rule__ViewDeclaration__ViewIDAssignment_3
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__ViewIDAssignment_3_in_rule__ViewDeclaration__Group__3__Impl9088);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4446:1: rule__ViewDeclaration__Group__4 : rule__ViewDeclaration__Group__4__Impl rule__ViewDeclaration__Group__5 ;
    public final void rule__ViewDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4450:1: ( rule__ViewDeclaration__Group__4__Impl rule__ViewDeclaration__Group__5 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4451:2: rule__ViewDeclaration__Group__4__Impl rule__ViewDeclaration__Group__5
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__Group__4__Impl_in_rule__ViewDeclaration__Group__49118);
            rule__ViewDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ViewDeclaration__Group__5_in_rule__ViewDeclaration__Group__49121);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4458:1: rule__ViewDeclaration__Group__4__Impl : ( ( ruleWS )* ) ;
    public final void rule__ViewDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4462:1: ( ( ( ruleWS )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4463:1: ( ( ruleWS )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4463:1: ( ( ruleWS )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4464:1: ( ruleWS )*
            {
             before(grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_4()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4465:1: ( ruleWS )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( ((LA52_0>=RULE_SP && LA52_0<=RULE_SL_COMMENT)) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4465:3: ruleWS
            	    {
            	    pushFollow(FOLLOW_ruleWS_in_rule__ViewDeclaration__Group__4__Impl9149);
            	    ruleWS();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop52;
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4475:1: rule__ViewDeclaration__Group__5 : rule__ViewDeclaration__Group__5__Impl rule__ViewDeclaration__Group__6 ;
    public final void rule__ViewDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4479:1: ( rule__ViewDeclaration__Group__5__Impl rule__ViewDeclaration__Group__6 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4480:2: rule__ViewDeclaration__Group__5__Impl rule__ViewDeclaration__Group__6
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__Group__5__Impl_in_rule__ViewDeclaration__Group__59180);
            rule__ViewDeclaration__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ViewDeclaration__Group__6_in_rule__ViewDeclaration__Group__59183);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4487:1: rule__ViewDeclaration__Group__5__Impl : ( ':' ) ;
    public final void rule__ViewDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4491:1: ( ( ':' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4492:1: ( ':' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4492:1: ( ':' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4493:1: ':'
            {
             before(grammarAccess.getViewDeclarationAccess().getColonKeyword_5()); 
            match(input,15,FOLLOW_15_in_rule__ViewDeclaration__Group__5__Impl9211); 
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4506:1: rule__ViewDeclaration__Group__6 : rule__ViewDeclaration__Group__6__Impl rule__ViewDeclaration__Group__7 ;
    public final void rule__ViewDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4510:1: ( rule__ViewDeclaration__Group__6__Impl rule__ViewDeclaration__Group__7 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4511:2: rule__ViewDeclaration__Group__6__Impl rule__ViewDeclaration__Group__7
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__Group__6__Impl_in_rule__ViewDeclaration__Group__69242);
            rule__ViewDeclaration__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ViewDeclaration__Group__7_in_rule__ViewDeclaration__Group__69245);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4518:1: rule__ViewDeclaration__Group__6__Impl : ( ( ruleWS )* ) ;
    public final void rule__ViewDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4522:1: ( ( ( ruleWS )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4523:1: ( ( ruleWS )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4523:1: ( ( ruleWS )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4524:1: ( ruleWS )*
            {
             before(grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_6()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4525:1: ( ruleWS )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( ((LA53_0>=RULE_SP && LA53_0<=RULE_SL_COMMENT)) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4525:3: ruleWS
            	    {
            	    pushFollow(FOLLOW_ruleWS_in_rule__ViewDeclaration__Group__6__Impl9273);
            	    ruleWS();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop53;
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4535:1: rule__ViewDeclaration__Group__7 : rule__ViewDeclaration__Group__7__Impl rule__ViewDeclaration__Group__8 ;
    public final void rule__ViewDeclaration__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4539:1: ( rule__ViewDeclaration__Group__7__Impl rule__ViewDeclaration__Group__8 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4540:2: rule__ViewDeclaration__Group__7__Impl rule__ViewDeclaration__Group__8
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__Group__7__Impl_in_rule__ViewDeclaration__Group__79304);
            rule__ViewDeclaration__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ViewDeclaration__Group__8_in_rule__ViewDeclaration__Group__79307);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4547:1: rule__ViewDeclaration__Group__7__Impl : ( ( rule__ViewDeclaration__FromAssignment_7 ) ) ;
    public final void rule__ViewDeclaration__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4551:1: ( ( ( rule__ViewDeclaration__FromAssignment_7 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4552:1: ( ( rule__ViewDeclaration__FromAssignment_7 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4552:1: ( ( rule__ViewDeclaration__FromAssignment_7 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4553:1: ( rule__ViewDeclaration__FromAssignment_7 )
            {
             before(grammarAccess.getViewDeclarationAccess().getFromAssignment_7()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4554:1: ( rule__ViewDeclaration__FromAssignment_7 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4554:2: rule__ViewDeclaration__FromAssignment_7
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__FromAssignment_7_in_rule__ViewDeclaration__Group__7__Impl9334);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4564:1: rule__ViewDeclaration__Group__8 : rule__ViewDeclaration__Group__8__Impl rule__ViewDeclaration__Group__9 ;
    public final void rule__ViewDeclaration__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4568:1: ( rule__ViewDeclaration__Group__8__Impl rule__ViewDeclaration__Group__9 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4569:2: rule__ViewDeclaration__Group__8__Impl rule__ViewDeclaration__Group__9
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__Group__8__Impl_in_rule__ViewDeclaration__Group__89364);
            rule__ViewDeclaration__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ViewDeclaration__Group__9_in_rule__ViewDeclaration__Group__89367);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4576:1: rule__ViewDeclaration__Group__8__Impl : ( ( ruleWS )* ) ;
    public final void rule__ViewDeclaration__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4580:1: ( ( ( ruleWS )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4581:1: ( ( ruleWS )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4581:1: ( ( ruleWS )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4582:1: ( ruleWS )*
            {
             before(grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_8()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4583:1: ( ruleWS )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( ((LA54_0>=RULE_SP && LA54_0<=RULE_SL_COMMENT)) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4583:3: ruleWS
            	    {
            	    pushFollow(FOLLOW_ruleWS_in_rule__ViewDeclaration__Group__8__Impl9395);
            	    ruleWS();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop54;
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4593:1: rule__ViewDeclaration__Group__9 : rule__ViewDeclaration__Group__9__Impl rule__ViewDeclaration__Group__10 ;
    public final void rule__ViewDeclaration__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4597:1: ( rule__ViewDeclaration__Group__9__Impl rule__ViewDeclaration__Group__10 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4598:2: rule__ViewDeclaration__Group__9__Impl rule__ViewDeclaration__Group__10
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__Group__9__Impl_in_rule__ViewDeclaration__Group__99426);
            rule__ViewDeclaration__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ViewDeclaration__Group__10_in_rule__ViewDeclaration__Group__99429);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4605:1: rule__ViewDeclaration__Group__9__Impl : ( '->' ) ;
    public final void rule__ViewDeclaration__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4609:1: ( ( '->' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4610:1: ( '->' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4610:1: ( '->' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4611:1: '->'
            {
             before(grammarAccess.getViewDeclarationAccess().getHyphenMinusGreaterThanSignKeyword_9()); 
            match(input,17,FOLLOW_17_in_rule__ViewDeclaration__Group__9__Impl9457); 
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4624:1: rule__ViewDeclaration__Group__10 : rule__ViewDeclaration__Group__10__Impl rule__ViewDeclaration__Group__11 ;
    public final void rule__ViewDeclaration__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4628:1: ( rule__ViewDeclaration__Group__10__Impl rule__ViewDeclaration__Group__11 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4629:2: rule__ViewDeclaration__Group__10__Impl rule__ViewDeclaration__Group__11
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__Group__10__Impl_in_rule__ViewDeclaration__Group__109488);
            rule__ViewDeclaration__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ViewDeclaration__Group__11_in_rule__ViewDeclaration__Group__109491);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4636:1: rule__ViewDeclaration__Group__10__Impl : ( ( ruleWS )* ) ;
    public final void rule__ViewDeclaration__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4640:1: ( ( ( ruleWS )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4641:1: ( ( ruleWS )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4641:1: ( ( ruleWS )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4642:1: ( ruleWS )*
            {
             before(grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_10()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4643:1: ( ruleWS )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( ((LA55_0>=RULE_SP && LA55_0<=RULE_SL_COMMENT)) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4643:3: ruleWS
            	    {
            	    pushFollow(FOLLOW_ruleWS_in_rule__ViewDeclaration__Group__10__Impl9519);
            	    ruleWS();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop55;
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4653:1: rule__ViewDeclaration__Group__11 : rule__ViewDeclaration__Group__11__Impl rule__ViewDeclaration__Group__12 ;
    public final void rule__ViewDeclaration__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4657:1: ( rule__ViewDeclaration__Group__11__Impl rule__ViewDeclaration__Group__12 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4658:2: rule__ViewDeclaration__Group__11__Impl rule__ViewDeclaration__Group__12
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__Group__11__Impl_in_rule__ViewDeclaration__Group__119550);
            rule__ViewDeclaration__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ViewDeclaration__Group__12_in_rule__ViewDeclaration__Group__119553);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4665:1: rule__ViewDeclaration__Group__11__Impl : ( ( rule__ViewDeclaration__ToAssignment_11 ) ) ;
    public final void rule__ViewDeclaration__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4669:1: ( ( ( rule__ViewDeclaration__ToAssignment_11 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4670:1: ( ( rule__ViewDeclaration__ToAssignment_11 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4670:1: ( ( rule__ViewDeclaration__ToAssignment_11 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4671:1: ( rule__ViewDeclaration__ToAssignment_11 )
            {
             before(grammarAccess.getViewDeclarationAccess().getToAssignment_11()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4672:1: ( rule__ViewDeclaration__ToAssignment_11 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4672:2: rule__ViewDeclaration__ToAssignment_11
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__ToAssignment_11_in_rule__ViewDeclaration__Group__11__Impl9580);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4682:1: rule__ViewDeclaration__Group__12 : rule__ViewDeclaration__Group__12__Impl rule__ViewDeclaration__Group__13 ;
    public final void rule__ViewDeclaration__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4686:1: ( rule__ViewDeclaration__Group__12__Impl rule__ViewDeclaration__Group__13 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4687:2: rule__ViewDeclaration__Group__12__Impl rule__ViewDeclaration__Group__13
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__Group__12__Impl_in_rule__ViewDeclaration__Group__129610);
            rule__ViewDeclaration__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ViewDeclaration__Group__13_in_rule__ViewDeclaration__Group__129613);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4694:1: rule__ViewDeclaration__Group__12__Impl : ( ( ruleWS )* ) ;
    public final void rule__ViewDeclaration__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4698:1: ( ( ( ruleWS )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4699:1: ( ( ruleWS )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4699:1: ( ( ruleWS )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4700:1: ( ruleWS )*
            {
             before(grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_12()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4701:1: ( ruleWS )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( ((LA56_0>=RULE_SP && LA56_0<=RULE_SL_COMMENT)) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4701:3: ruleWS
            	    {
            	    pushFollow(FOLLOW_ruleWS_in_rule__ViewDeclaration__Group__12__Impl9641);
            	    ruleWS();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop56;
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4711:1: rule__ViewDeclaration__Group__13 : rule__ViewDeclaration__Group__13__Impl rule__ViewDeclaration__Group__14 ;
    public final void rule__ViewDeclaration__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4715:1: ( rule__ViewDeclaration__Group__13__Impl rule__ViewDeclaration__Group__14 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4716:2: rule__ViewDeclaration__Group__13__Impl rule__ViewDeclaration__Group__14
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__Group__13__Impl_in_rule__ViewDeclaration__Group__139672);
            rule__ViewDeclaration__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ViewDeclaration__Group__14_in_rule__ViewDeclaration__Group__139675);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4723:1: rule__ViewDeclaration__Group__13__Impl : ( '=' ) ;
    public final void rule__ViewDeclaration__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4727:1: ( ( '=' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4728:1: ( '=' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4728:1: ( '=' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4729:1: '='
            {
             before(grammarAccess.getViewDeclarationAccess().getEqualsSignKeyword_13()); 
            match(input,16,FOLLOW_16_in_rule__ViewDeclaration__Group__13__Impl9703); 
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4742:1: rule__ViewDeclaration__Group__14 : rule__ViewDeclaration__Group__14__Impl rule__ViewDeclaration__Group__15 ;
    public final void rule__ViewDeclaration__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4746:1: ( rule__ViewDeclaration__Group__14__Impl rule__ViewDeclaration__Group__15 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4747:2: rule__ViewDeclaration__Group__14__Impl rule__ViewDeclaration__Group__15
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__Group__14__Impl_in_rule__ViewDeclaration__Group__149734);
            rule__ViewDeclaration__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ViewDeclaration__Group__15_in_rule__ViewDeclaration__Group__149737);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4754:1: rule__ViewDeclaration__Group__14__Impl : ( ( ruleWS )* ) ;
    public final void rule__ViewDeclaration__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4758:1: ( ( ( ruleWS )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4759:1: ( ( ruleWS )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4759:1: ( ( ruleWS )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4760:1: ( ruleWS )*
            {
             before(grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_14()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4761:1: ( ruleWS )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( ((LA57_0>=RULE_SP && LA57_0<=RULE_SL_COMMENT)) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4761:3: ruleWS
            	    {
            	    pushFollow(FOLLOW_ruleWS_in_rule__ViewDeclaration__Group__14__Impl9765);
            	    ruleWS();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop57;
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4771:1: rule__ViewDeclaration__Group__15 : rule__ViewDeclaration__Group__15__Impl rule__ViewDeclaration__Group__16 ;
    public final void rule__ViewDeclaration__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4775:1: ( rule__ViewDeclaration__Group__15__Impl rule__ViewDeclaration__Group__16 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4776:2: rule__ViewDeclaration__Group__15__Impl rule__ViewDeclaration__Group__16
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__Group__15__Impl_in_rule__ViewDeclaration__Group__159796);
            rule__ViewDeclaration__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ViewDeclaration__Group__16_in_rule__ViewDeclaration__Group__159799);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4783:1: rule__ViewDeclaration__Group__15__Impl : ( ( rule__ViewDeclaration__ViewDefsAssignment_15 ) ) ;
    public final void rule__ViewDeclaration__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4787:1: ( ( ( rule__ViewDeclaration__ViewDefsAssignment_15 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4788:1: ( ( rule__ViewDeclaration__ViewDefsAssignment_15 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4788:1: ( ( rule__ViewDeclaration__ViewDefsAssignment_15 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4789:1: ( rule__ViewDeclaration__ViewDefsAssignment_15 )
            {
             before(grammarAccess.getViewDeclarationAccess().getViewDefsAssignment_15()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4790:1: ( rule__ViewDeclaration__ViewDefsAssignment_15 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4790:2: rule__ViewDeclaration__ViewDefsAssignment_15
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__ViewDefsAssignment_15_in_rule__ViewDeclaration__Group__15__Impl9826);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4800:1: rule__ViewDeclaration__Group__16 : rule__ViewDeclaration__Group__16__Impl rule__ViewDeclaration__Group__17 ;
    public final void rule__ViewDeclaration__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4804:1: ( rule__ViewDeclaration__Group__16__Impl rule__ViewDeclaration__Group__17 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4805:2: rule__ViewDeclaration__Group__16__Impl rule__ViewDeclaration__Group__17
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__Group__16__Impl_in_rule__ViewDeclaration__Group__169856);
            rule__ViewDeclaration__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ViewDeclaration__Group__17_in_rule__ViewDeclaration__Group__169859);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4812:1: rule__ViewDeclaration__Group__16__Impl : ( ( ruleWS )* ) ;
    public final void rule__ViewDeclaration__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4816:1: ( ( ( ruleWS )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4817:1: ( ( ruleWS )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4817:1: ( ( ruleWS )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4818:1: ( ruleWS )*
            {
             before(grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_16()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4819:1: ( ruleWS )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( ((LA58_0>=RULE_SP && LA58_0<=RULE_SL_COMMENT)) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4819:3: ruleWS
            	    {
            	    pushFollow(FOLLOW_ruleWS_in_rule__ViewDeclaration__Group__16__Impl9887);
            	    ruleWS();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop58;
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4829:1: rule__ViewDeclaration__Group__17 : rule__ViewDeclaration__Group__17__Impl rule__ViewDeclaration__Group__18 ;
    public final void rule__ViewDeclaration__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4833:1: ( rule__ViewDeclaration__Group__17__Impl rule__ViewDeclaration__Group__18 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4834:2: rule__ViewDeclaration__Group__17__Impl rule__ViewDeclaration__Group__18
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__Group__17__Impl_in_rule__ViewDeclaration__Group__179918);
            rule__ViewDeclaration__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ViewDeclaration__Group__18_in_rule__ViewDeclaration__Group__179921);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4841:1: rule__ViewDeclaration__Group__17__Impl : ( '.' ) ;
    public final void rule__ViewDeclaration__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4845:1: ( ( '.' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4846:1: ( '.' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4846:1: ( '.' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4847:1: '.'
            {
             before(grammarAccess.getViewDeclarationAccess().getFullStopKeyword_17()); 
            match(input,14,FOLLOW_14_in_rule__ViewDeclaration__Group__17__Impl9949); 
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4860:1: rule__ViewDeclaration__Group__18 : rule__ViewDeclaration__Group__18__Impl ;
    public final void rule__ViewDeclaration__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4864:1: ( rule__ViewDeclaration__Group__18__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4865:2: rule__ViewDeclaration__Group__18__Impl
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__Group__18__Impl_in_rule__ViewDeclaration__Group__189980);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4871:1: rule__ViewDeclaration__Group__18__Impl : ( ruleWS ) ;
    public final void rule__ViewDeclaration__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4875:1: ( ( ruleWS ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4876:1: ( ruleWS )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4876:1: ( ruleWS )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4877:1: ruleWS
            {
             before(grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_18()); 
            pushFollow(FOLLOW_ruleWS_in_rule__ViewDeclaration__Group__18__Impl10007);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4927:1: rule__Model__DeclarationsAssignment : ( ( rule__Model__DeclarationsAlternatives_0 ) ) ;
    public final void rule__Model__DeclarationsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4931:1: ( ( ( rule__Model__DeclarationsAlternatives_0 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4932:1: ( ( rule__Model__DeclarationsAlternatives_0 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4932:1: ( ( rule__Model__DeclarationsAlternatives_0 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4933:1: ( rule__Model__DeclarationsAlternatives_0 )
            {
             before(grammarAccess.getModelAccess().getDeclarationsAlternatives_0()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4934:1: ( rule__Model__DeclarationsAlternatives_0 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4934:2: rule__Model__DeclarationsAlternatives_0
            {
            pushFollow(FOLLOW_rule__Model__DeclarationsAlternatives_0_in_rule__Model__DeclarationsAssignment10079);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4943:1: rule__JUSTSPACE__JAssignment : ( ruleWS ) ;
    public final void rule__JUSTSPACE__JAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4947:1: ( ( ruleWS ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4948:1: ( ruleWS )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4948:1: ( ruleWS )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4949:1: ruleWS
            {
             before(grammarAccess.getJUSTSPACEAccess().getJWSParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleWS_in_rule__JUSTSPACE__JAssignment10112);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4958:1: rule__NamespaceDeclaration__NameAssignment_3_0 : ( RULE_CID ) ;
    public final void rule__NamespaceDeclaration__NameAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4962:1: ( ( RULE_CID ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4963:1: ( RULE_CID )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4963:1: ( RULE_CID )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4964:1: RULE_CID
            {
             before(grammarAccess.getNamespaceDeclarationAccess().getNameCIDTerminalRuleCall_3_0_0()); 
            match(input,RULE_CID,FOLLOW_RULE_CID_in_rule__NamespaceDeclaration__NameAssignment_3_010143); 
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4973:1: rule__NamespaceDeclaration__UriAssignment_4 : ( ruleURISTRING ) ;
    public final void rule__NamespaceDeclaration__UriAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4977:1: ( ( ruleURISTRING ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4978:1: ( ruleURISTRING )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4978:1: ( ruleURISTRING )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4979:1: ruleURISTRING
            {
             before(grammarAccess.getNamespaceDeclarationAccess().getUriURISTRINGParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleURISTRING_in_rule__NamespaceDeclaration__UriAssignment_410174);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4988:1: rule__ReadDeclaration__FileAssignment_3 : ( ruleURISTRING ) ;
    public final void rule__ReadDeclaration__FileAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4992:1: ( ( ruleURISTRING ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4993:1: ( ruleURISTRING )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4993:1: ( ruleURISTRING )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4994:1: ruleURISTRING
            {
             before(grammarAccess.getReadDeclarationAccess().getFileURISTRINGParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleURISTRING_in_rule__ReadDeclaration__FileAssignment_310205);
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


    // $ANTLR start "rule__SignatureDeclaration__SigNameAssignment_0_3"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:5003:1: rule__SignatureDeclaration__SigNameAssignment_0_3 : ( ruleGID ) ;
    public final void rule__SignatureDeclaration__SigNameAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:5007:1: ( ( ruleGID ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:5008:1: ( ruleGID )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:5008:1: ( ruleGID )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:5009:1: ruleGID
            {
             before(grammarAccess.getSignatureDeclarationAccess().getSigNameGIDParserRuleCall_0_3_0()); 
            pushFollow(FOLLOW_ruleGID_in_rule__SignatureDeclaration__SigNameAssignment_0_310236);
            ruleGID();

            state._fsp--;

             after(grammarAccess.getSignatureDeclarationAccess().getSigNameGIDParserRuleCall_0_3_0()); 

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
    // $ANTLR end "rule__SignatureDeclaration__SigNameAssignment_0_3"


    // $ANTLR start "rule__SignatureDeclaration__DefsAssignment_4"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:5018:1: rule__SignatureDeclaration__DefsAssignment_4 : ( rulesigDefinitions ) ;
    public final void rule__SignatureDeclaration__DefsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:5022:1: ( ( rulesigDefinitions ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:5023:1: ( rulesigDefinitions )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:5023:1: ( rulesigDefinitions )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:5024:1: rulesigDefinitions
            {
             before(grammarAccess.getSignatureDeclarationAccess().getDefsSigDefinitionsParserRuleCall_4_0()); 
            pushFollow(FOLLOW_rulesigDefinitions_in_rule__SignatureDeclaration__DefsAssignment_410267);
            rulesigDefinitions();

            state._fsp--;

             after(grammarAccess.getSignatureDeclarationAccess().getDefsSigDefinitionsParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__SignatureDeclaration__DefsAssignment_4"


    // $ANTLR start "rule__SigDefinitions__ConstuctsAssignment_2"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:5033:1: rule__SigDefinitions__ConstuctsAssignment_2 : ( rulesigConstruct ) ;
    public final void rule__SigDefinitions__ConstuctsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:5037:1: ( ( rulesigConstruct ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:5038:1: ( rulesigConstruct )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:5038:1: ( rulesigConstruct )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:5039:1: rulesigConstruct
            {
             before(grammarAccess.getSigDefinitionsAccess().getConstuctsSigConstructParserRuleCall_2_0()); 
            pushFollow(FOLLOW_rulesigConstruct_in_rule__SigDefinitions__ConstuctsAssignment_210298);
            rulesigConstruct();

            state._fsp--;

             after(grammarAccess.getSigDefinitionsAccess().getConstuctsSigConstructParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__SigDefinitions__ConstuctsAssignment_2"


    // $ANTLR start "rule__SigDefinitions__ConstuctsAssignment_3_2"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:5048:1: rule__SigDefinitions__ConstuctsAssignment_3_2 : ( rulesigConstruct ) ;
    public final void rule__SigDefinitions__ConstuctsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:5052:1: ( ( rulesigConstruct ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:5053:1: ( rulesigConstruct )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:5053:1: ( rulesigConstruct )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:5054:1: rulesigConstruct
            {
             before(grammarAccess.getSigDefinitionsAccess().getConstuctsSigConstructParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_rulesigConstruct_in_rule__SigDefinitions__ConstuctsAssignment_3_210329);
            rulesigConstruct();

            state._fsp--;

             after(grammarAccess.getSigDefinitionsAccess().getConstuctsSigConstructParserRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__SigDefinitions__ConstuctsAssignment_3_2"


    // $ANTLR start "rule__SigConstruct__TmpAssignment_3_1"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:5063:1: rule__SigConstruct__TmpAssignment_3_1 : ( ( rule__SigConstruct__TmpAlternatives_3_1_0 ) ) ;
    public final void rule__SigConstruct__TmpAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:5067:1: ( ( ( rule__SigConstruct__TmpAlternatives_3_1_0 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:5068:1: ( ( rule__SigConstruct__TmpAlternatives_3_1_0 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:5068:1: ( ( rule__SigConstruct__TmpAlternatives_3_1_0 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:5069:1: ( rule__SigConstruct__TmpAlternatives_3_1_0 )
            {
             before(grammarAccess.getSigConstructAccess().getTmpAlternatives_3_1_0()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:5070:1: ( rule__SigConstruct__TmpAlternatives_3_1_0 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:5070:2: rule__SigConstruct__TmpAlternatives_3_1_0
            {
            pushFollow(FOLLOW_rule__SigConstruct__TmpAlternatives_3_1_0_in_rule__SigConstruct__TmpAssignment_3_110360);
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


    // $ANTLR start "rule__ClassicSymbolConstruct__SymbNameAssignment_0"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:5079:1: rule__ClassicSymbolConstruct__SymbNameAssignment_0 : ( ruleGID ) ;
    public final void rule__ClassicSymbolConstruct__SymbNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:5083:1: ( ( ruleGID ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:5084:1: ( ruleGID )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:5084:1: ( ruleGID )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:5085:1: ruleGID
            {
             before(grammarAccess.getClassicSymbolConstructAccess().getSymbNameGIDParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleGID_in_rule__ClassicSymbolConstruct__SymbNameAssignment_010393);
            ruleGID();

            state._fsp--;

             after(grammarAccess.getClassicSymbolConstructAccess().getSymbNameGIDParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__ClassicSymbolConstruct__SymbNameAssignment_0"


    // $ANTLR start "rule__IncludeConstruct__NamespaceAssignment_3"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:5094:1: rule__IncludeConstruct__NamespaceAssignment_3 : ( ( ruleNAMESPACE ) ) ;
    public final void rule__IncludeConstruct__NamespaceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:5098:1: ( ( ( ruleNAMESPACE ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:5099:1: ( ( ruleNAMESPACE ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:5099:1: ( ( ruleNAMESPACE ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:5100:1: ( ruleNAMESPACE )
            {
             before(grammarAccess.getIncludeConstructAccess().getNamespaceSignatureDeclarationCrossReference_3_0()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:5101:1: ( ruleNAMESPACE )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:5102:1: ruleNAMESPACE
            {
             before(grammarAccess.getIncludeConstructAccess().getNamespaceSignatureDeclarationNAMESPACEParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_ruleNAMESPACE_in_rule__IncludeConstruct__NamespaceAssignment_310428);
            ruleNAMESPACE();

            state._fsp--;

             after(grammarAccess.getIncludeConstructAccess().getNamespaceSignatureDeclarationNAMESPACEParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getIncludeConstructAccess().getNamespaceSignatureDeclarationCrossReference_3_0()); 

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
    // $ANTLR end "rule__IncludeConstruct__NamespaceAssignment_3"


    // $ANTLR start "rule__StructConstruct__StructNameAssignment_3"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:5113:1: rule__StructConstruct__StructNameAssignment_3 : ( ruleGID ) ;
    public final void rule__StructConstruct__StructNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:5117:1: ( ( ruleGID ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:5118:1: ( ruleGID )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:5118:1: ( ruleGID )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:5119:1: ruleGID
            {
             before(grammarAccess.getStructConstructAccess().getStructNameGIDParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleGID_in_rule__StructConstruct__StructNameAssignment_310463);
            ruleGID();

            state._fsp--;

             after(grammarAccess.getStructConstructAccess().getStructNameGIDParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__StructConstruct__StructNameAssignment_3"


    // $ANTLR start "rule__StructConstruct__NamespaceAssignment_7"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:5128:1: rule__StructConstruct__NamespaceAssignment_7 : ( ( ruleNAMESPACE ) ) ;
    public final void rule__StructConstruct__NamespaceAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:5132:1: ( ( ( ruleNAMESPACE ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:5133:1: ( ( ruleNAMESPACE ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:5133:1: ( ( ruleNAMESPACE ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:5134:1: ( ruleNAMESPACE )
            {
             before(grammarAccess.getStructConstructAccess().getNamespaceSignatureDeclarationCrossReference_7_0()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:5135:1: ( ruleNAMESPACE )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:5136:1: ruleNAMESPACE
            {
             before(grammarAccess.getStructConstructAccess().getNamespaceSignatureDeclarationNAMESPACEParserRuleCall_7_0_1()); 
            pushFollow(FOLLOW_ruleNAMESPACE_in_rule__StructConstruct__NamespaceAssignment_710498);
            ruleNAMESPACE();

            state._fsp--;

             after(grammarAccess.getStructConstructAccess().getNamespaceSignatureDeclarationNAMESPACEParserRuleCall_7_0_1()); 

            }

             after(grammarAccess.getStructConstructAccess().getNamespaceSignatureDeclarationCrossReference_7_0()); 

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
    // $ANTLR end "rule__StructConstruct__NamespaceAssignment_7"


    // $ANTLR start "rule__StructConstruct__IncOptAssignment_9"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:5147:1: rule__StructConstruct__IncOptAssignment_9 : ( ruleincludeOps ) ;
    public final void rule__StructConstruct__IncOptAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:5151:1: ( ( ruleincludeOps ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:5152:1: ( ruleincludeOps )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:5152:1: ( ruleincludeOps )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:5153:1: ruleincludeOps
            {
             before(grammarAccess.getStructConstructAccess().getIncOptIncludeOpsParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleincludeOps_in_rule__StructConstruct__IncOptAssignment_910533);
            ruleincludeOps();

            state._fsp--;

             after(grammarAccess.getStructConstructAccess().getIncOptIncludeOpsParserRuleCall_9_0()); 

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
    // $ANTLR end "rule__StructConstruct__IncOptAssignment_9"


    // $ANTLR start "rule__ViewDeclaration__ViewIDAssignment_3"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:5163:1: rule__ViewDeclaration__ViewIDAssignment_3 : ( ruleGID ) ;
    public final void rule__ViewDeclaration__ViewIDAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:5167:1: ( ( ruleGID ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:5168:1: ( ruleGID )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:5168:1: ( ruleGID )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:5169:1: ruleGID
            {
             before(grammarAccess.getViewDeclarationAccess().getViewIDGIDParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleGID_in_rule__ViewDeclaration__ViewIDAssignment_310565);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:5178:1: rule__ViewDeclaration__FromAssignment_7 : ( ruleNAMESPACE ) ;
    public final void rule__ViewDeclaration__FromAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:5182:1: ( ( ruleNAMESPACE ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:5183:1: ( ruleNAMESPACE )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:5183:1: ( ruleNAMESPACE )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:5184:1: ruleNAMESPACE
            {
             before(grammarAccess.getViewDeclarationAccess().getFromNAMESPACEParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleNAMESPACE_in_rule__ViewDeclaration__FromAssignment_710596);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:5193:1: rule__ViewDeclaration__ToAssignment_11 : ( ruleNAMESPACE ) ;
    public final void rule__ViewDeclaration__ToAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:5197:1: ( ( ruleNAMESPACE ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:5198:1: ( ruleNAMESPACE )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:5198:1: ( ruleNAMESPACE )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:5199:1: ruleNAMESPACE
            {
             before(grammarAccess.getViewDeclarationAccess().getToNAMESPACEParserRuleCall_11_0()); 
            pushFollow(FOLLOW_ruleNAMESPACE_in_rule__ViewDeclaration__ToAssignment_1110627);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:5208:1: rule__ViewDeclaration__ViewDefsAssignment_15 : ( rulesigDefinitions ) ;
    public final void rule__ViewDeclaration__ViewDefsAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:5212:1: ( ( rulesigDefinitions ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:5213:1: ( rulesigDefinitions )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:5213:1: ( rulesigDefinitions )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:5214:1: rulesigDefinitions
            {
             before(grammarAccess.getViewDeclarationAccess().getViewDefsSigDefinitionsParserRuleCall_15_0()); 
            pushFollow(FOLLOW_rulesigDefinitions_in_rule__ViewDeclaration__ViewDefsAssignment_1510658);
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
        "\2\2\1\uffff\1\2\10\14\1\27\2\uffff\10\2\1\uffff";
    static final String DFA25_minS =
        "\2\4\1\uffff\11\4\1\0\2\uffff\10\4\1\uffff";
    static final String DFA25_maxS =
        "\1\32\1\37\1\uffff\11\37\1\0\2\uffff\10\37\1\uffff";
    static final String DFA25_acceptS =
        "\2\uffff\1\2\12\uffff\2\1\10\uffff\1\1";
    static final String DFA25_specialS =
        "\30\uffff}>";
    static final String[] DFA25_transitionS = {
            "\4\2\7\uffff\1\2\1\1\11\uffff\1\2",
            "\1\4\1\5\1\6\1\7\5\2\1\uffff\2\2\1\3\2\2\13\uffff\2\2",
            "",
            "\1\10\1\11\1\12\1\13\5\2\1\uffff\2\2\1\3\2\2\13\uffff\2\2",
            "\1\17\1\20\1\21\1\22\5\2\1\uffff\1\2\1\15\1\16\2\2\7\uffff"+
            "\1\16\3\uffff\2\2",
            "\1\17\1\20\1\21\1\22\5\2\1\uffff\1\2\1\15\1\16\2\2\7\uffff"+
            "\1\16\3\uffff\2\2",
            "\1\17\1\20\1\21\1\22\5\2\1\uffff\1\2\1\15\1\16\2\2\7\uffff"+
            "\1\16\3\uffff\2\2",
            "\1\17\1\20\1\21\1\22\5\2\1\uffff\1\2\1\15\1\16\2\2\7\uffff"+
            "\1\16\3\uffff\2\2",
            "\1\23\1\24\1\25\1\26\5\2\1\uffff\1\2\1\15\1\16\2\2\7\uffff"+
            "\1\16\3\uffff\2\2",
            "\1\23\1\24\1\25\1\26\5\2\1\uffff\1\2\1\15\1\16\2\2\7\uffff"+
            "\1\16\3\uffff\2\2",
            "\1\23\1\24\1\25\1\26\5\2\1\uffff\1\2\1\15\1\16\2\2\7\uffff"+
            "\1\16\3\uffff\2\2",
            "\1\23\1\24\1\25\1\26\5\2\1\uffff\1\2\1\15\1\16\2\2\7\uffff"+
            "\1\16\3\uffff\2\2",
            "\1\uffff",
            "",
            "",
            "\1\17\1\20\1\21\1\22\5\2\1\uffff\1\2\1\15\1\16\2\2\7\uffff"+
            "\1\16\3\uffff\2\2",
            "\1\17\1\20\1\21\1\22\5\2\1\uffff\1\2\1\15\1\16\2\2\7\uffff"+
            "\1\16\3\uffff\2\2",
            "\1\17\1\20\1\21\1\22\5\2\1\uffff\1\2\1\15\1\16\2\2\7\uffff"+
            "\1\16\3\uffff\2\2",
            "\1\17\1\20\1\21\1\22\5\2\1\uffff\1\2\1\15\1\16\2\2\7\uffff"+
            "\1\16\3\uffff\2\2",
            "\1\23\1\24\1\25\1\26\5\2\1\uffff\1\2\1\15\1\16\2\2\7\uffff"+
            "\1\16\3\uffff\2\2",
            "\1\23\1\24\1\25\1\26\5\2\1\uffff\1\2\1\15\1\16\2\2\7\uffff"+
            "\1\16\3\uffff\2\2",
            "\1\23\1\24\1\25\1\26\5\2\1\uffff\1\2\1\15\1\16\2\2\7\uffff"+
            "\1\16\3\uffff\2\2",
            "\1\23\1\24\1\25\1\26\5\2\1\uffff\1\2\1\15\1\16\2\2\7\uffff"+
            "\1\16\3\uffff\2\2",
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
            return "2297:1: ( rule__GID__Group_0_1__0 )?";
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
            return "()* loopback of 3208:1: ( rule__SigDefinitions__Group_3__0 )*";
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
    public static final BitSet FOLLOW_ruleclassicSymbolConstruct_in_entryRuleclassicSymbolConstruct904 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleclassicSymbolConstruct911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassicSymbolConstruct__Group__0_in_ruleclassicSymbolConstruct937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleincludeConstruct_in_entryRuleincludeConstruct964 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleincludeConstruct971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IncludeConstruct__Group__0_in_ruleincludeConstruct997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestructConstruct_in_entryRulestructConstruct1024 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestructConstruct1031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructConstruct__Group__0_in_rulestructConstruct1057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleincludeOps_in_entryRuleincludeOps1084 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleincludeOps1091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IncludeOps__Group__0_in_ruleincludeOps1117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleviewDeclaration_in_entryRuleviewDeclaration1146 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleviewDeclaration1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__0_in_ruleviewDeclaration1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenamespaceDeclaration_in_rule__Model__DeclarationsAlternatives_01215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesignatureDeclaration_in_rule__Model__DeclarationsAlternatives_01232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleviewDeclaration_in_rule__Model__DeclarationsAlternatives_01249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulereadDeclaration_in_rule__Model__DeclarationsAlternatives_01266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJUSTSPACE_in_rule__Model__DeclarationsAlternatives_01283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SP_in_rule__WS__Alternatives1315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_rule__WS__Alternatives1332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML2_COMMENT_in_rule__WS__Alternatives1349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_rule__WS__Alternatives1366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__NAMESPACE__Alternatives_2_01399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__NAMESPACE__Alternatives_2_01419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GID__Group_0__0_in_rule__GID__Alternatives1453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GID__Group_1__0_in_rule__GID__Alternatives1471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTIPLEDOT_in_rule__GID__Alternatives1489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLEDOT_in_rule__GID__Alternatives1506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CID_in_rule__GID__Alternatives_0_01538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rule__GID__Alternatives_0_01555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__GID__Alternatives_0_01572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rule__SOMETHING__Alternatives1604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CID_in_rule__SOMETHING__Alternatives1621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__SOMETHING__Alternatives1638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SOMETHING__Group_3__0_in_rule__SOMETHING__Alternatives1655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__SOMETHING__Alternatives1674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__SOMETHING__Alternatives1694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__SOMETHING__Alternatives1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__SOMETHING__Alternatives1734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SOMETHING__Group_8__0_in_rule__SOMETHING__Alternatives1753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTIPLEDOT_in_rule__SOMETHING__Alternatives1771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLEDOT_in_rule__SOMETHING__Alternatives1788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__SOMETHING__Alternatives1805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CID_in_rule__SOMETHING__Alternatives_3_11837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rule__SOMETHING__Alternatives_3_11854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rule__SOMETHING2__Alternatives1886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CID_in_rule__SOMETHING2__Alternatives1903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__SOMETHING2__Alternatives1920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__SOMETHING2__Alternatives1938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__SOMETHING2__Alternatives1958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__SOMETHING2__Alternatives1978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__SOMETHING2__Alternatives1998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__SOMETHING2__Alternatives2018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SOMETHING2__Group_8__0_in_rule__SOMETHING2__Alternatives2037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTIPLEDOT_in_rule__SOMETHING2__Alternatives2055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLEDOT_in_rule__SOMETHING2__Alternatives2072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__SOMETHING2__Alternatives2089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleclassicSymbolConstruct_in_rule__SigConstruct__Alternatives2122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleincludeConstruct_in_rule__SigConstruct__Alternatives2139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestructConstruct_in_rule__SigConstruct__Alternatives2156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigConstruct__Group_3__0_in_rule__SigConstruct__Alternatives2173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__SigConstruct__TmpAlternatives_3_1_02207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__SigConstruct__TmpAlternatives_3_1_02227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__SigConstruct__TmpAlternatives_3_1_02247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__SigConstruct__TmpAlternatives_3_1_02267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__SigConstruct__TmpAlternatives_3_1_02287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__SigConstruct__TmpAlternatives_3_1_02307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__SigConstruct__TmpAlternatives_3_1_02327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ClassicSymbolConstruct__Alternatives_22362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ClassicSymbolConstruct__Alternatives_22382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ClassicSymbolConstruct__Alternatives_22402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__StructConstruct__Alternatives_52437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__StructConstruct__Alternatives_52457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NAMESPACE__Group__0__Impl_in_rule__NAMESPACE__Group__02490 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__NAMESPACE__Group__1_in_rule__NAMESPACE__Group__02493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NAMESPACE__Group_0__0_in_rule__NAMESPACE__Group__0__Impl2520 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_rule__NAMESPACE__Group__1__Impl_in_rule__NAMESPACE__Group__12551 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__NAMESPACE__Group__2_in_rule__NAMESPACE__Group__12554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CID_in_rule__NAMESPACE__Group__1__Impl2581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NAMESPACE__Group__2__Impl_in_rule__NAMESPACE__Group__22610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NAMESPACE__Group_2__0_in_rule__NAMESPACE__Group__2__Impl2637 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_rule__NAMESPACE__Group_0__0__Impl_in_rule__NAMESPACE__Group_0__02674 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__NAMESPACE__Group_0__1_in_rule__NAMESPACE__Group_0__02677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLEDOT_in_rule__NAMESPACE__Group_0__0__Impl2704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NAMESPACE__Group_0__1__Impl_in_rule__NAMESPACE__Group_0__12733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__NAMESPACE__Group_0__1__Impl2761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NAMESPACE__Group_2__0__Impl_in_rule__NAMESPACE__Group_2__02796 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__NAMESPACE__Group_2__1_in_rule__NAMESPACE__Group_2__02799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NAMESPACE__Alternatives_2_0_in_rule__NAMESPACE__Group_2__0__Impl2826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NAMESPACE__Group_2__1__Impl_in_rule__NAMESPACE__Group_2__12856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CID_in_rule__NAMESPACE__Group_2__1__Impl2883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group__0__Impl_in_rule__URI__Group__02916 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__URI__Group__1_in_rule__URI__Group__02919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group_0__0_in_rule__URI__Group__0__Impl2946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group__1__Impl_in_rule__URI__Group__12977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNAMESPACE_in_rule__URI__Group__1__Impl3004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group_0__0__Impl_in_rule__URI__Group_0__03037 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__URI__Group_0__1_in_rule__URI__Group_0__03040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CID_in_rule__URI__Group_0__0__Impl3067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group_0__1__Impl_in_rule__URI__Group_0__13096 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__URI__Group_0__2_in_rule__URI__Group_0__13099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__URI__Group_0__1__Impl3127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group_0__2__Impl_in_rule__URI__Group_0__23158 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__URI__Group_0__3_in_rule__URI__Group_0__23161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__URI__Group_0__2__Impl3189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group_0__3__Impl_in_rule__URI__Group_0__33220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__URI__Group_0__3__Impl3248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URISTRING__Group__0__Impl_in_rule__URISTRING__Group__03287 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_rule__URISTRING__Group__1_in_rule__URISTRING__Group__03290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__URISTRING__Group__0__Impl3318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URISTRING__Group__1__Impl_in_rule__URISTRING__Group__13349 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__URISTRING__Group__2_in_rule__URISTRING__Group__13352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURI_in_rule__URISTRING__Group__1__Impl3379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URISTRING__Group__2__Impl_in_rule__URISTRING__Group__23408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__URISTRING__Group__2__Impl3436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group__0__Impl_in_rule__NamespaceDeclaration__Group__03473 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group__1_in_rule__NamespaceDeclaration__Group__03476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__NamespaceDeclaration__Group__0__Impl3504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group__1__Impl_in_rule__NamespaceDeclaration__Group__13535 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group__2_in_rule__NamespaceDeclaration__Group__13538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__NamespaceDeclaration__Group__1__Impl3566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group__2__Impl_in_rule__NamespaceDeclaration__Group__23597 = new BitSet(new long[]{0x0000000008000400L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group__3_in_rule__NamespaceDeclaration__Group__23600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__NamespaceDeclaration__Group__2__Impl3630 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_ruleWS_in_rule__NamespaceDeclaration__Group__2__Impl3643 = new BitSet(new long[]{0x00000000000400F2L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group__3__Impl_in_rule__NamespaceDeclaration__Group__33676 = new BitSet(new long[]{0x0000000008000400L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group__4_in_rule__NamespaceDeclaration__Group__33679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group_3__0_in_rule__NamespaceDeclaration__Group__3__Impl3706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group__4__Impl_in_rule__NamespaceDeclaration__Group__43737 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group__5_in_rule__NamespaceDeclaration__Group__43740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__UriAssignment_4_in_rule__NamespaceDeclaration__Group__4__Impl3767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group__5__Impl_in_rule__NamespaceDeclaration__Group__53797 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group__6_in_rule__NamespaceDeclaration__Group__53800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__NamespaceDeclaration__Group__5__Impl3828 = new BitSet(new long[]{0x00000000000400F2L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group__6__Impl_in_rule__NamespaceDeclaration__Group__63859 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group__7_in_rule__NamespaceDeclaration__Group__63862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__NamespaceDeclaration__Group__6__Impl3890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group__7__Impl_in_rule__NamespaceDeclaration__Group__73921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__NamespaceDeclaration__Group__7__Impl3948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group_3__0__Impl_in_rule__NamespaceDeclaration__Group_3__03993 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group_3__1_in_rule__NamespaceDeclaration__Group_3__03996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__NameAssignment_3_0_in_rule__NamespaceDeclaration__Group_3__0__Impl4023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group_3__1__Impl_in_rule__NamespaceDeclaration__Group_3__14053 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group_3__2_in_rule__NamespaceDeclaration__Group_3__14056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__NamespaceDeclaration__Group_3__1__Impl4084 = new BitSet(new long[]{0x00000000000400F2L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group_3__2__Impl_in_rule__NamespaceDeclaration__Group_3__24115 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group_3__3_in_rule__NamespaceDeclaration__Group_3__24118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__NamespaceDeclaration__Group_3__2__Impl4146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group_3__3__Impl_in_rule__NamespaceDeclaration__Group_3__34177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__NamespaceDeclaration__Group_3__3__Impl4205 = new BitSet(new long[]{0x00000000000400F2L});
    public static final BitSet FOLLOW_rule__ReadDeclaration__Group__0__Impl_in_rule__ReadDeclaration__Group__04244 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__ReadDeclaration__Group__1_in_rule__ReadDeclaration__Group__04247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ReadDeclaration__Group__0__Impl4275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReadDeclaration__Group__1__Impl_in_rule__ReadDeclaration__Group__14306 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_rule__ReadDeclaration__Group__2_in_rule__ReadDeclaration__Group__14309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ReadDeclaration__Group__1__Impl4337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReadDeclaration__Group__2__Impl_in_rule__ReadDeclaration__Group__24368 = new BitSet(new long[]{0x0000000008000400L});
    public static final BitSet FOLLOW_rule__ReadDeclaration__Group__3_in_rule__ReadDeclaration__Group__24371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__ReadDeclaration__Group__2__Impl4401 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_ruleWS_in_rule__ReadDeclaration__Group__2__Impl4414 = new BitSet(new long[]{0x00000000000400F2L});
    public static final BitSet FOLLOW_rule__ReadDeclaration__Group__3__Impl_in_rule__ReadDeclaration__Group__34447 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_rule__ReadDeclaration__Group__4_in_rule__ReadDeclaration__Group__34450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReadDeclaration__FileAssignment_3_in_rule__ReadDeclaration__Group__3__Impl4477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReadDeclaration__Group__4__Impl_in_rule__ReadDeclaration__Group__44507 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__ReadDeclaration__Group__5_in_rule__ReadDeclaration__Group__44510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__ReadDeclaration__Group__4__Impl4538 = new BitSet(new long[]{0x00000000000400F2L});
    public static final BitSet FOLLOW_rule__ReadDeclaration__Group__5__Impl_in_rule__ReadDeclaration__Group__54569 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_rule__ReadDeclaration__Group__6_in_rule__ReadDeclaration__Group__54572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ReadDeclaration__Group__5__Impl4600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReadDeclaration__Group__6__Impl_in_rule__ReadDeclaration__Group__64631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__ReadDeclaration__Group__6__Impl4658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GID__Group_0__0__Impl_in_rule__GID__Group_0__04701 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__GID__Group_0__1_in_rule__GID__Group_0__04704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GID__Alternatives_0_0_in_rule__GID__Group_0__0__Impl4733 = new BitSet(new long[]{0x0000000000001C02L});
    public static final BitSet FOLLOW_rule__GID__Alternatives_0_0_in_rule__GID__Group_0__0__Impl4745 = new BitSet(new long[]{0x0000000000001C02L});
    public static final BitSet FOLLOW_rule__GID__Group_0__1__Impl_in_rule__GID__Group_0__14778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GID__Group_0_1__0_in_rule__GID__Group_0__1__Impl4805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GID__Group_0_1__0__Impl_in_rule__GID__Group_0_1__04840 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_rule__GID__Group_0_1__1_in_rule__GID__Group_0_1__04843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__GID__Group_0_1__0__Impl4874 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_rule__GID__Group_0_1__0__Impl4890 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__GID__Group_0_1__1__Impl_in_rule__GID__Group_0_1__14925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__GID__Group_0_1__1__Impl4952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GID__Group_1__0__Impl_in_rule__GID__Group_1__04985 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__GID__Group_1__1_in_rule__GID__Group_1__04988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__GID__Group_1__0__Impl5016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GID__Group_1__1__Impl_in_rule__GID__Group_1__15047 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_rule__GID__Group_1__2_in_rule__GID__Group_1__15050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__GID__Group_1__1__Impl5081 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_rule__GID__Group_1__1__Impl5097 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__GID__Group_1__2__Impl_in_rule__GID__Group_1__25132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__GID__Group_1__2__Impl5159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SOMETHING__Group_3__0__Impl_in_rule__SOMETHING__Group_3__05194 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_rule__SOMETHING__Group_3__1_in_rule__SOMETHING__Group_3__05197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__SOMETHING__Group_3__0__Impl5225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SOMETHING__Group_3__1__Impl_in_rule__SOMETHING__Group_3__15256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SOMETHING__Alternatives_3_1_in_rule__SOMETHING__Group_3__1__Impl5283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SOMETHING__Group_8__0__Impl_in_rule__SOMETHING__Group_8__05317 = new BitSet(new long[]{0x00000000C007DFF0L});
    public static final BitSet FOLLOW_rule__SOMETHING__Group_8__1_in_rule__SOMETHING__Group_8__05320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__SOMETHING__Group_8__0__Impl5348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SOMETHING__Group_8__1__Impl_in_rule__SOMETHING__Group_8__15379 = new BitSet(new long[]{0x00000000C007DFF0L});
    public static final BitSet FOLLOW_rule__SOMETHING__Group_8__2_in_rule__SOMETHING__Group_8__15382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSOMETHING2_in_rule__SOMETHING__Group_8__1__Impl5410 = new BitSet(new long[]{0x000000004007DFF2L});
    public static final BitSet FOLLOW_rule__SOMETHING__Group_8__2__Impl_in_rule__SOMETHING__Group_8__25441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__SOMETHING__Group_8__2__Impl5469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SOMETHING2__Group_8__0__Impl_in_rule__SOMETHING2__Group_8__05506 = new BitSet(new long[]{0x00000000C007DFF0L});
    public static final BitSet FOLLOW_rule__SOMETHING2__Group_8__1_in_rule__SOMETHING2__Group_8__05509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__SOMETHING2__Group_8__0__Impl5537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SOMETHING2__Group_8__1__Impl_in_rule__SOMETHING2__Group_8__15568 = new BitSet(new long[]{0x00000000C007DFF0L});
    public static final BitSet FOLLOW_rule__SOMETHING2__Group_8__2_in_rule__SOMETHING2__Group_8__15571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSOMETHING2_in_rule__SOMETHING2__Group_8__1__Impl5599 = new BitSet(new long[]{0x000000004007DFF2L});
    public static final BitSet FOLLOW_rule__SOMETHING2__Group_8__2__Impl_in_rule__SOMETHING2__Group_8__25630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__SOMETHING2__Group_8__2__Impl5658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group__0__Impl_in_rule__SignatureDeclaration__Group__05698 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group__1_in_rule__SignatureDeclaration__Group__05701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group_0__0_in_rule__SignatureDeclaration__Group__0__Impl5728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group__1__Impl_in_rule__SignatureDeclaration__Group__15758 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group__2_in_rule__SignatureDeclaration__Group__15761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__SignatureDeclaration__Group__1__Impl5789 = new BitSet(new long[]{0x00000000000400F2L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group__2__Impl_in_rule__SignatureDeclaration__Group__25820 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group__3_in_rule__SignatureDeclaration__Group__25823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__SignatureDeclaration__Group__2__Impl5851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group__3__Impl_in_rule__SignatureDeclaration__Group__35882 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group__4_in_rule__SignatureDeclaration__Group__35885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__SignatureDeclaration__Group__3__Impl5913 = new BitSet(new long[]{0x00000000000400F2L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group__4__Impl_in_rule__SignatureDeclaration__Group__45944 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group__5_in_rule__SignatureDeclaration__Group__45947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__DefsAssignment_4_in_rule__SignatureDeclaration__Group__4__Impl5974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group__5__Impl_in_rule__SignatureDeclaration__Group__56004 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group__6_in_rule__SignatureDeclaration__Group__56007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__SignatureDeclaration__Group__5__Impl6035 = new BitSet(new long[]{0x00000000000400F2L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group__6__Impl_in_rule__SignatureDeclaration__Group__66066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__SignatureDeclaration__Group__6__Impl6094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group_0__0__Impl_in_rule__SignatureDeclaration__Group_0__06139 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group_0__1_in_rule__SignatureDeclaration__Group_0__06142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__SignatureDeclaration__Group_0__0__Impl6170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group_0__1__Impl_in_rule__SignatureDeclaration__Group_0__16201 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group_0__2_in_rule__SignatureDeclaration__Group_0__16204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__SignatureDeclaration__Group_0__1__Impl6232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group_0__2__Impl_in_rule__SignatureDeclaration__Group_0__26263 = new BitSet(new long[]{0x0000000000011F00L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group_0__3_in_rule__SignatureDeclaration__Group_0__26266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__SignatureDeclaration__Group_0__2__Impl6296 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_ruleWS_in_rule__SignatureDeclaration__Group_0__2__Impl6309 = new BitSet(new long[]{0x00000000000400F2L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group_0__3__Impl_in_rule__SignatureDeclaration__Group_0__36342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__SigNameAssignment_0_3_in_rule__SignatureDeclaration__Group_0__3__Impl6369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group__0__Impl_in_rule__SigDefinitions__Group__06407 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group__1_in_rule__SigDefinitions__Group__06410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__SigDefinitions__Group__0__Impl6438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group__1__Impl_in_rule__SigDefinitions__Group__16469 = new BitSet(new long[]{0x0000000000051F00L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group__2_in_rule__SigDefinitions__Group__16472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__SigDefinitions__Group__1__Impl6500 = new BitSet(new long[]{0x00000000000400F2L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group__2__Impl_in_rule__SigDefinitions__Group__26531 = new BitSet(new long[]{0x0000000080004000L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group__3_in_rule__SigDefinitions__Group__26534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__ConstuctsAssignment_2_in_rule__SigDefinitions__Group__2__Impl6561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group__3__Impl_in_rule__SigDefinitions__Group__36591 = new BitSet(new long[]{0x0000000080004000L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group__4_in_rule__SigDefinitions__Group__36594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_3__0_in_rule__SigDefinitions__Group__3__Impl6621 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group__4__Impl_in_rule__SigDefinitions__Group__46652 = new BitSet(new long[]{0x0000000080004000L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group__5_in_rule__SigDefinitions__Group__46655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_4__0_in_rule__SigDefinitions__Group__4__Impl6682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group__5__Impl_in_rule__SigDefinitions__Group__56713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__SigDefinitions__Group__5__Impl6741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_3__0__Impl_in_rule__SigDefinitions__Group_3__06784 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_3__1_in_rule__SigDefinitions__Group_3__06787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__SigDefinitions__Group_3__0__Impl6815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_3__1__Impl_in_rule__SigDefinitions__Group_3__16846 = new BitSet(new long[]{0x0000000000051F00L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_3__2_in_rule__SigDefinitions__Group_3__16849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__SigDefinitions__Group_3__1__Impl6879 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_ruleWS_in_rule__SigDefinitions__Group_3__1__Impl6892 = new BitSet(new long[]{0x00000000000400F2L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_3__2__Impl_in_rule__SigDefinitions__Group_3__26925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__ConstuctsAssignment_3_2_in_rule__SigDefinitions__Group_3__2__Impl6952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_4__0__Impl_in_rule__SigDefinitions__Group_4__06988 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_4__1_in_rule__SigDefinitions__Group_4__06991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__SigDefinitions__Group_4__0__Impl7019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_4__1__Impl_in_rule__SigDefinitions__Group_4__17050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__SigDefinitions__Group_4__1__Impl7078 = new BitSet(new long[]{0x00000000000400F2L});
    public static final BitSet FOLLOW_rule__SigConstruct__Group_3__0__Impl_in_rule__SigConstruct__Group_3__07113 = new BitSet(new long[]{0x0000000003F80000L});
    public static final BitSet FOLLOW_rule__SigConstruct__Group_3__1_in_rule__SigConstruct__Group_3__07116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__SigConstruct__Group_3__0__Impl7144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigConstruct__Group_3__1__Impl_in_rule__SigConstruct__Group_3__17175 = new BitSet(new long[]{0x000000004007DFF0L});
    public static final BitSet FOLLOW_rule__SigConstruct__Group_3__2_in_rule__SigConstruct__Group_3__17178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigConstruct__TmpAssignment_3_1_in_rule__SigConstruct__Group_3__1__Impl7205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigConstruct__Group_3__2__Impl_in_rule__SigConstruct__Group_3__27235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSOMETHING_in_rule__SigConstruct__Group_3__2__Impl7263 = new BitSet(new long[]{0x000000004007DFF2L});
    public static final BitSet FOLLOW_rule__ClassicSymbolConstruct__Group__0__Impl_in_rule__ClassicSymbolConstruct__Group__07300 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_rule__ClassicSymbolConstruct__Group__1_in_rule__ClassicSymbolConstruct__Group__07303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassicSymbolConstruct__SymbNameAssignment_0_in_rule__ClassicSymbolConstruct__Group__0__Impl7330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassicSymbolConstruct__Group__1__Impl_in_rule__ClassicSymbolConstruct__Group__17360 = new BitSet(new long[]{0x0000000004018000L});
    public static final BitSet FOLLOW_rule__ClassicSymbolConstruct__Group__2_in_rule__ClassicSymbolConstruct__Group__17363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__ClassicSymbolConstruct__Group__1__Impl7391 = new BitSet(new long[]{0x00000000000400F2L});
    public static final BitSet FOLLOW_rule__ClassicSymbolConstruct__Group__2__Impl_in_rule__ClassicSymbolConstruct__Group__27422 = new BitSet(new long[]{0x000000004007DFF0L});
    public static final BitSet FOLLOW_rule__ClassicSymbolConstruct__Group__3_in_rule__ClassicSymbolConstruct__Group__27425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassicSymbolConstruct__Alternatives_2_in_rule__ClassicSymbolConstruct__Group__2__Impl7452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassicSymbolConstruct__Group__3__Impl_in_rule__ClassicSymbolConstruct__Group__37482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSOMETHING_in_rule__ClassicSymbolConstruct__Group__3__Impl7510 = new BitSet(new long[]{0x000000004007DFF2L});
    public static final BitSet FOLLOW_rule__IncludeConstruct__Group__0__Impl_in_rule__IncludeConstruct__Group__07549 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__IncludeConstruct__Group__1_in_rule__IncludeConstruct__Group__07552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__IncludeConstruct__Group__0__Impl7580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IncludeConstruct__Group__1__Impl_in_rule__IncludeConstruct__Group__17611 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_rule__IncludeConstruct__Group__2_in_rule__IncludeConstruct__Group__17614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__IncludeConstruct__Group__1__Impl7642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IncludeConstruct__Group__2__Impl_in_rule__IncludeConstruct__Group__27673 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__IncludeConstruct__Group__3_in_rule__IncludeConstruct__Group__27676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__IncludeConstruct__Group__2__Impl7706 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_ruleWS_in_rule__IncludeConstruct__Group__2__Impl7719 = new BitSet(new long[]{0x00000000000400F2L});
    public static final BitSet FOLLOW_rule__IncludeConstruct__Group__3__Impl_in_rule__IncludeConstruct__Group__37752 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_rule__IncludeConstruct__Group__4_in_rule__IncludeConstruct__Group__37755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IncludeConstruct__NamespaceAssignment_3_in_rule__IncludeConstruct__Group__3__Impl7782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IncludeConstruct__Group__4__Impl_in_rule__IncludeConstruct__Group__47812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IncludeConstruct__Group_4__0_in_rule__IncludeConstruct__Group__4__Impl7839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IncludeConstruct__Group_4__0__Impl_in_rule__IncludeConstruct__Group_4__07880 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__IncludeConstruct__Group_4__1_in_rule__IncludeConstruct__Group_4__07883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__IncludeConstruct__Group_4__0__Impl7913 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_ruleWS_in_rule__IncludeConstruct__Group_4__0__Impl7926 = new BitSet(new long[]{0x00000000000400F2L});
    public static final BitSet FOLLOW_rule__IncludeConstruct__Group_4__1__Impl_in_rule__IncludeConstruct__Group_4__17959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleincludeOps_in_rule__IncludeConstruct__Group_4__1__Impl7986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructConstruct__Group__0__Impl_in_rule__StructConstruct__Group__08019 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__StructConstruct__Group__1_in_rule__StructConstruct__Group__08022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__StructConstruct__Group__0__Impl8050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructConstruct__Group__1__Impl_in_rule__StructConstruct__Group__18081 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_rule__StructConstruct__Group__2_in_rule__StructConstruct__Group__18084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__StructConstruct__Group__1__Impl8112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructConstruct__Group__2__Impl_in_rule__StructConstruct__Group__28143 = new BitSet(new long[]{0x0000000000011F00L});
    public static final BitSet FOLLOW_rule__StructConstruct__Group__3_in_rule__StructConstruct__Group__28146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__StructConstruct__Group__2__Impl8176 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_ruleWS_in_rule__StructConstruct__Group__2__Impl8189 = new BitSet(new long[]{0x00000000000400F2L});
    public static final BitSet FOLLOW_rule__StructConstruct__Group__3__Impl_in_rule__StructConstruct__Group__38222 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_rule__StructConstruct__Group__4_in_rule__StructConstruct__Group__38225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructConstruct__StructNameAssignment_3_in_rule__StructConstruct__Group__3__Impl8252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructConstruct__Group__4__Impl_in_rule__StructConstruct__Group__48282 = new BitSet(new long[]{0x0000000004008000L});
    public static final BitSet FOLLOW_rule__StructConstruct__Group__5_in_rule__StructConstruct__Group__48285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__StructConstruct__Group__4__Impl8313 = new BitSet(new long[]{0x00000000000400F2L});
    public static final BitSet FOLLOW_rule__StructConstruct__Group__5__Impl_in_rule__StructConstruct__Group__58344 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_rule__StructConstruct__Group__6_in_rule__StructConstruct__Group__58347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructConstruct__Alternatives_5_in_rule__StructConstruct__Group__5__Impl8374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructConstruct__Group__6__Impl_in_rule__StructConstruct__Group__68404 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__StructConstruct__Group__7_in_rule__StructConstruct__Group__68407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__StructConstruct__Group__6__Impl8435 = new BitSet(new long[]{0x00000000000400F2L});
    public static final BitSet FOLLOW_rule__StructConstruct__Group__7__Impl_in_rule__StructConstruct__Group__78466 = new BitSet(new long[]{0x000000004007DFF0L});
    public static final BitSet FOLLOW_rule__StructConstruct__Group__8_in_rule__StructConstruct__Group__78469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructConstruct__NamespaceAssignment_7_in_rule__StructConstruct__Group__7__Impl8496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructConstruct__Group__8__Impl_in_rule__StructConstruct__Group__88526 = new BitSet(new long[]{0x000000004007DFF0L});
    public static final BitSet FOLLOW_rule__StructConstruct__Group__9_in_rule__StructConstruct__Group__88529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSOMETHING_in_rule__StructConstruct__Group__8__Impl8557 = new BitSet(new long[]{0x000000004007DFF2L});
    public static final BitSet FOLLOW_rule__StructConstruct__Group__9__Impl_in_rule__StructConstruct__Group__98588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructConstruct__IncOptAssignment_9_in_rule__StructConstruct__Group__9__Impl8615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IncludeOps__Group__0__Impl_in_rule__IncludeOps__Group__08666 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__IncludeOps__Group__1_in_rule__IncludeOps__Group__08669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__IncludeOps__Group__0__Impl8697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IncludeOps__Group__1__Impl_in_rule__IncludeOps__Group__18728 = new BitSet(new long[]{0x000000004007DFF0L});
    public static final BitSet FOLLOW_rule__IncludeOps__Group__2_in_rule__IncludeOps__Group__18731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__IncludeOps__Group__1__Impl8759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IncludeOps__Group__2__Impl_in_rule__IncludeOps__Group__28790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSOMETHING_in_rule__IncludeOps__Group__2__Impl8818 = new BitSet(new long[]{0x000000004007DFF2L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__0__Impl_in_rule__ViewDeclaration__Group__08855 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__1_in_rule__ViewDeclaration__Group__08858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ViewDeclaration__Group__0__Impl8886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__1__Impl_in_rule__ViewDeclaration__Group__18917 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__2_in_rule__ViewDeclaration__Group__18920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__ViewDeclaration__Group__1__Impl8948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__2__Impl_in_rule__ViewDeclaration__Group__28979 = new BitSet(new long[]{0x0000000000011F00L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__3_in_rule__ViewDeclaration__Group__28982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__ViewDeclaration__Group__2__Impl9012 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_ruleWS_in_rule__ViewDeclaration__Group__2__Impl9025 = new BitSet(new long[]{0x00000000000400F2L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__3__Impl_in_rule__ViewDeclaration__Group__39058 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__4_in_rule__ViewDeclaration__Group__39061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__ViewIDAssignment_3_in_rule__ViewDeclaration__Group__3__Impl9088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__4__Impl_in_rule__ViewDeclaration__Group__49118 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__5_in_rule__ViewDeclaration__Group__49121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__ViewDeclaration__Group__4__Impl9149 = new BitSet(new long[]{0x00000000000400F2L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__5__Impl_in_rule__ViewDeclaration__Group__59180 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__6_in_rule__ViewDeclaration__Group__59183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ViewDeclaration__Group__5__Impl9211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__6__Impl_in_rule__ViewDeclaration__Group__69242 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__7_in_rule__ViewDeclaration__Group__69245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__ViewDeclaration__Group__6__Impl9273 = new BitSet(new long[]{0x00000000000400F2L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__7__Impl_in_rule__ViewDeclaration__Group__79304 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__8_in_rule__ViewDeclaration__Group__79307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__FromAssignment_7_in_rule__ViewDeclaration__Group__7__Impl9334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__8__Impl_in_rule__ViewDeclaration__Group__89364 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__9_in_rule__ViewDeclaration__Group__89367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__ViewDeclaration__Group__8__Impl9395 = new BitSet(new long[]{0x00000000000400F2L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__9__Impl_in_rule__ViewDeclaration__Group__99426 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__10_in_rule__ViewDeclaration__Group__99429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ViewDeclaration__Group__9__Impl9457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__10__Impl_in_rule__ViewDeclaration__Group__109488 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__11_in_rule__ViewDeclaration__Group__109491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__ViewDeclaration__Group__10__Impl9519 = new BitSet(new long[]{0x00000000000400F2L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__11__Impl_in_rule__ViewDeclaration__Group__119550 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__12_in_rule__ViewDeclaration__Group__119553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__ToAssignment_11_in_rule__ViewDeclaration__Group__11__Impl9580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__12__Impl_in_rule__ViewDeclaration__Group__129610 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__13_in_rule__ViewDeclaration__Group__129613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__ViewDeclaration__Group__12__Impl9641 = new BitSet(new long[]{0x00000000000400F2L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__13__Impl_in_rule__ViewDeclaration__Group__139672 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__14_in_rule__ViewDeclaration__Group__139675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ViewDeclaration__Group__13__Impl9703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__14__Impl_in_rule__ViewDeclaration__Group__149734 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__15_in_rule__ViewDeclaration__Group__149737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__ViewDeclaration__Group__14__Impl9765 = new BitSet(new long[]{0x00000000000400F2L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__15__Impl_in_rule__ViewDeclaration__Group__159796 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__16_in_rule__ViewDeclaration__Group__159799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__ViewDefsAssignment_15_in_rule__ViewDeclaration__Group__15__Impl9826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__16__Impl_in_rule__ViewDeclaration__Group__169856 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__17_in_rule__ViewDeclaration__Group__169859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__ViewDeclaration__Group__16__Impl9887 = new BitSet(new long[]{0x00000000000400F2L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__17__Impl_in_rule__ViewDeclaration__Group__179918 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__18_in_rule__ViewDeclaration__Group__179921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ViewDeclaration__Group__17__Impl9949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__18__Impl_in_rule__ViewDeclaration__Group__189980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__ViewDeclaration__Group__18__Impl10007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__DeclarationsAlternatives_0_in_rule__Model__DeclarationsAssignment10079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__JUSTSPACE__JAssignment10112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CID_in_rule__NamespaceDeclaration__NameAssignment_3_010143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURISTRING_in_rule__NamespaceDeclaration__UriAssignment_410174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURISTRING_in_rule__ReadDeclaration__FileAssignment_310205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGID_in_rule__SignatureDeclaration__SigNameAssignment_0_310236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesigDefinitions_in_rule__SignatureDeclaration__DefsAssignment_410267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesigConstruct_in_rule__SigDefinitions__ConstuctsAssignment_210298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesigConstruct_in_rule__SigDefinitions__ConstuctsAssignment_3_210329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigConstruct__TmpAlternatives_3_1_0_in_rule__SigConstruct__TmpAssignment_3_110360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGID_in_rule__ClassicSymbolConstruct__SymbNameAssignment_010393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNAMESPACE_in_rule__IncludeConstruct__NamespaceAssignment_310428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGID_in_rule__StructConstruct__StructNameAssignment_310463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNAMESPACE_in_rule__StructConstruct__NamespaceAssignment_710498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleincludeOps_in_rule__StructConstruct__IncOptAssignment_910533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGID_in_rule__ViewDeclaration__ViewIDAssignment_310565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNAMESPACE_in_rule__ViewDeclaration__FromAssignment_710596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNAMESPACE_in_rule__ViewDeclaration__ToAssignment_1110627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesigDefinitions_in_rule__ViewDeclaration__ViewDefsAssignment_1510658 = new BitSet(new long[]{0x0000000000000002L});

}