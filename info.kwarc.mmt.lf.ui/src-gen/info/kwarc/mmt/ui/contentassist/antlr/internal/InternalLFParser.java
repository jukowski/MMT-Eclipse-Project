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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SP", "RULE_ML_COMMENT", "RULE_ML2_COMMENT", "RULE_SL_COMMENT", "RULE_CID", "RULE_ANY_OTHER", "RULE_INT", "'/'", "'.'", "':'", "'='", "'<'", "'->'", "'%'", "'-'", "':='", "'%meta'", "'%abbrev'", "'%name'", "'%pattern'", "'%infix'", "'prefix'", "'../'", "'://'", "'\"'", "'%namespace'", "'%read'", "'..'", "'%sig'", "'{'", "'}'", "'%include'", "'%struct'", "'%open'", "'%view'"
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
    public static final int RULE_ANY_OTHER=9;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_CID=8;
    public static final int RULE_SL_COMMENT=7;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=5;
    public static final int T__30=30;
    public static final int T__19=19;
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
    public static final int T__37=37;
    public static final int T__12=12;
    public static final int T__38=38;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ML2_COMMENT=6;
    public static final int RULE_INT=10;

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

                if ( ((LA1_0>=RULE_SP && LA1_0<=RULE_SL_COMMENT)||(LA1_0>=29 && LA1_0<=30)||LA1_0==32||LA1_0==38) ) {
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


    // $ANTLR start "entryRulesignatureDeclaration"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:343:1: entryRulesignatureDeclaration : rulesignatureDeclaration EOF ;
    public final void entryRulesignatureDeclaration() throws RecognitionException {
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:344:1: ( rulesignatureDeclaration EOF )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:345:1: rulesignatureDeclaration EOF
            {
             before(grammarAccess.getSignatureDeclarationRule()); 
            pushFollow(FOLLOW_rulesignatureDeclaration_in_entryRulesignatureDeclaration664);
            rulesignatureDeclaration();

            state._fsp--;

             after(grammarAccess.getSignatureDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulesignatureDeclaration671); 

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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:352:1: rulesignatureDeclaration : ( ( rule__SignatureDeclaration__Group__0 ) ) ;
    public final void rulesignatureDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:356:2: ( ( ( rule__SignatureDeclaration__Group__0 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:357:1: ( ( rule__SignatureDeclaration__Group__0 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:357:1: ( ( rule__SignatureDeclaration__Group__0 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:358:1: ( rule__SignatureDeclaration__Group__0 )
            {
             before(grammarAccess.getSignatureDeclarationAccess().getGroup()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:359:1: ( rule__SignatureDeclaration__Group__0 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:359:2: rule__SignatureDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__SignatureDeclaration__Group__0_in_rulesignatureDeclaration697);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:371:1: entryRulesigDefinitions : rulesigDefinitions EOF ;
    public final void entryRulesigDefinitions() throws RecognitionException {
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:372:1: ( rulesigDefinitions EOF )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:373:1: rulesigDefinitions EOF
            {
             before(grammarAccess.getSigDefinitionsRule()); 
            pushFollow(FOLLOW_rulesigDefinitions_in_entryRulesigDefinitions724);
            rulesigDefinitions();

            state._fsp--;

             after(grammarAccess.getSigDefinitionsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulesigDefinitions731); 

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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:380:1: rulesigDefinitions : ( ( rule__SigDefinitions__Alternatives ) ) ;
    public final void rulesigDefinitions() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:384:2: ( ( ( rule__SigDefinitions__Alternatives ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:385:1: ( ( rule__SigDefinitions__Alternatives ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:385:1: ( ( rule__SigDefinitions__Alternatives ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:386:1: ( rule__SigDefinitions__Alternatives )
            {
             before(grammarAccess.getSigDefinitionsAccess().getAlternatives()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:387:1: ( rule__SigDefinitions__Alternatives )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:387:2: rule__SigDefinitions__Alternatives
            {
            pushFollow(FOLLOW_rule__SigDefinitions__Alternatives_in_rulesigDefinitions757);
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


    // $ANTLR start "entryRuleincludeOps"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:399:1: entryRuleincludeOps : ruleincludeOps EOF ;
    public final void entryRuleincludeOps() throws RecognitionException {
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:400:1: ( ruleincludeOps EOF )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:401:1: ruleincludeOps EOF
            {
             before(grammarAccess.getIncludeOpsRule()); 
            pushFollow(FOLLOW_ruleincludeOps_in_entryRuleincludeOps784);
            ruleincludeOps();

            state._fsp--;

             after(grammarAccess.getIncludeOpsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleincludeOps791); 

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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:408:1: ruleincludeOps : ( ( rule__IncludeOps__Group__0 ) ) ;
    public final void ruleincludeOps() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:412:2: ( ( ( rule__IncludeOps__Group__0 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:413:1: ( ( rule__IncludeOps__Group__0 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:413:1: ( ( rule__IncludeOps__Group__0 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:414:1: ( rule__IncludeOps__Group__0 )
            {
             before(grammarAccess.getIncludeOpsAccess().getGroup()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:415:1: ( rule__IncludeOps__Group__0 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:415:2: rule__IncludeOps__Group__0
            {
            pushFollow(FOLLOW_rule__IncludeOps__Group__0_in_ruleincludeOps817);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:429:1: entryRuleviewDeclaration : ruleviewDeclaration EOF ;
    public final void entryRuleviewDeclaration() throws RecognitionException {
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:430:1: ( ruleviewDeclaration EOF )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:431:1: ruleviewDeclaration EOF
            {
             before(grammarAccess.getViewDeclarationRule()); 
            pushFollow(FOLLOW_ruleviewDeclaration_in_entryRuleviewDeclaration846);
            ruleviewDeclaration();

            state._fsp--;

             after(grammarAccess.getViewDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleviewDeclaration853); 

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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:438:1: ruleviewDeclaration : ( ( rule__ViewDeclaration__Group__0 ) ) ;
    public final void ruleviewDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:442:2: ( ( ( rule__ViewDeclaration__Group__0 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:443:1: ( ( rule__ViewDeclaration__Group__0 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:443:1: ( ( rule__ViewDeclaration__Group__0 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:444:1: ( rule__ViewDeclaration__Group__0 )
            {
             before(grammarAccess.getViewDeclarationAccess().getGroup()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:445:1: ( rule__ViewDeclaration__Group__0 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:445:2: rule__ViewDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__Group__0_in_ruleviewDeclaration879);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:457:1: rule__Model__DeclarationsAlternatives_0 : ( ( rulenamespaceDeclaration ) | ( rulesignatureDeclaration ) | ( ruleviewDeclaration ) | ( rulereadDeclaration ) | ( ruleJUSTSPACE ) );
    public final void rule__Model__DeclarationsAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:461:1: ( ( rulenamespaceDeclaration ) | ( rulesignatureDeclaration ) | ( ruleviewDeclaration ) | ( rulereadDeclaration ) | ( ruleJUSTSPACE ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt2=1;
                }
                break;
            case 32:
                {
                alt2=2;
                }
                break;
            case 38:
                {
                alt2=3;
                }
                break;
            case 30:
                {
                alt2=4;
                }
                break;
            case RULE_SP:
            case RULE_ML_COMMENT:
            case RULE_ML2_COMMENT:
            case RULE_SL_COMMENT:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:462:1: ( rulenamespaceDeclaration )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:462:1: ( rulenamespaceDeclaration )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:463:1: rulenamespaceDeclaration
                    {
                     before(grammarAccess.getModelAccess().getDeclarationsNamespaceDeclarationParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_rulenamespaceDeclaration_in_rule__Model__DeclarationsAlternatives_0915);
                    rulenamespaceDeclaration();

                    state._fsp--;

                     after(grammarAccess.getModelAccess().getDeclarationsNamespaceDeclarationParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:468:6: ( rulesignatureDeclaration )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:468:6: ( rulesignatureDeclaration )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:469:1: rulesignatureDeclaration
                    {
                     before(grammarAccess.getModelAccess().getDeclarationsSignatureDeclarationParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_rulesignatureDeclaration_in_rule__Model__DeclarationsAlternatives_0932);
                    rulesignatureDeclaration();

                    state._fsp--;

                     after(grammarAccess.getModelAccess().getDeclarationsSignatureDeclarationParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:474:6: ( ruleviewDeclaration )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:474:6: ( ruleviewDeclaration )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:475:1: ruleviewDeclaration
                    {
                     before(grammarAccess.getModelAccess().getDeclarationsViewDeclarationParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_ruleviewDeclaration_in_rule__Model__DeclarationsAlternatives_0949);
                    ruleviewDeclaration();

                    state._fsp--;

                     after(grammarAccess.getModelAccess().getDeclarationsViewDeclarationParserRuleCall_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:480:6: ( rulereadDeclaration )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:480:6: ( rulereadDeclaration )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:481:1: rulereadDeclaration
                    {
                     before(grammarAccess.getModelAccess().getDeclarationsReadDeclarationParserRuleCall_0_3()); 
                    pushFollow(FOLLOW_rulereadDeclaration_in_rule__Model__DeclarationsAlternatives_0966);
                    rulereadDeclaration();

                    state._fsp--;

                     after(grammarAccess.getModelAccess().getDeclarationsReadDeclarationParserRuleCall_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:486:6: ( ruleJUSTSPACE )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:486:6: ( ruleJUSTSPACE )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:487:1: ruleJUSTSPACE
                    {
                     before(grammarAccess.getModelAccess().getDeclarationsJUSTSPACEParserRuleCall_0_4()); 
                    pushFollow(FOLLOW_ruleJUSTSPACE_in_rule__Model__DeclarationsAlternatives_0983);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:497:1: rule__WS__Alternatives : ( ( RULE_SP ) | ( RULE_ML_COMMENT ) | ( RULE_ML2_COMMENT ) | ( RULE_SL_COMMENT ) );
    public final void rule__WS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:501:1: ( ( RULE_SP ) | ( RULE_ML_COMMENT ) | ( RULE_ML2_COMMENT ) | ( RULE_SL_COMMENT ) )
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
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:502:1: ( RULE_SP )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:502:1: ( RULE_SP )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:503:1: RULE_SP
                    {
                     before(grammarAccess.getWSAccess().getSPTerminalRuleCall_0()); 
                    match(input,RULE_SP,FOLLOW_RULE_SP_in_rule__WS__Alternatives1015); 
                     after(grammarAccess.getWSAccess().getSPTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:508:6: ( RULE_ML_COMMENT )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:508:6: ( RULE_ML_COMMENT )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:509:1: RULE_ML_COMMENT
                    {
                     before(grammarAccess.getWSAccess().getML_COMMENTTerminalRuleCall_1()); 
                    match(input,RULE_ML_COMMENT,FOLLOW_RULE_ML_COMMENT_in_rule__WS__Alternatives1032); 
                     after(grammarAccess.getWSAccess().getML_COMMENTTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:514:6: ( RULE_ML2_COMMENT )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:514:6: ( RULE_ML2_COMMENT )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:515:1: RULE_ML2_COMMENT
                    {
                     before(grammarAccess.getWSAccess().getML2_COMMENTTerminalRuleCall_2()); 
                    match(input,RULE_ML2_COMMENT,FOLLOW_RULE_ML2_COMMENT_in_rule__WS__Alternatives1049); 
                     after(grammarAccess.getWSAccess().getML2_COMMENTTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:520:6: ( RULE_SL_COMMENT )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:520:6: ( RULE_SL_COMMENT )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:521:1: RULE_SL_COMMENT
                    {
                     before(grammarAccess.getWSAccess().getSL_COMMENTTerminalRuleCall_3()); 
                    match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_rule__WS__Alternatives1066); 
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:531:1: rule__NAMESPACE__Alternatives_2_0 : ( ( '/' ) | ( '.' ) );
    public final void rule__NAMESPACE__Alternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:535:1: ( ( '/' ) | ( '.' ) )
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
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:536:1: ( '/' )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:536:1: ( '/' )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:537:1: '/'
                    {
                     before(grammarAccess.getNAMESPACEAccess().getSolidusKeyword_2_0_0()); 
                    match(input,11,FOLLOW_11_in_rule__NAMESPACE__Alternatives_2_01099); 
                     after(grammarAccess.getNAMESPACEAccess().getSolidusKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:544:6: ( '.' )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:544:6: ( '.' )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:545:1: '.'
                    {
                     before(grammarAccess.getNAMESPACEAccess().getFullStopKeyword_2_0_1()); 
                    match(input,12,FOLLOW_12_in_rule__NAMESPACE__Alternatives_2_01119); 
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:557:1: rule__GID__Alternatives : ( ( ( ( rule__GID__Alternatives_0 ) ) ( ( rule__GID__Alternatives_0 )* ) ) | ( ( rule__GID__Group_1__0 ) ) );
    public final void rule__GID__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:561:1: ( ( ( ( rule__GID__Alternatives_0 ) ) ( ( rule__GID__Alternatives_0 )* ) ) | ( ( rule__GID__Group_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_CID && LA6_0<=RULE_INT)) ) {
                alt6=1;
            }
            else if ( (LA6_0==31) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:562:1: ( ( ( rule__GID__Alternatives_0 ) ) ( ( rule__GID__Alternatives_0 )* ) )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:562:1: ( ( ( rule__GID__Alternatives_0 ) ) ( ( rule__GID__Alternatives_0 )* ) )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:563:1: ( ( rule__GID__Alternatives_0 ) ) ( ( rule__GID__Alternatives_0 )* )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:563:1: ( ( rule__GID__Alternatives_0 ) )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:564:1: ( rule__GID__Alternatives_0 )
                    {
                     before(grammarAccess.getGIDAccess().getAlternatives_0()); 
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:565:1: ( rule__GID__Alternatives_0 )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:565:2: rule__GID__Alternatives_0
                    {
                    pushFollow(FOLLOW_rule__GID__Alternatives_0_in_rule__GID__Alternatives1155);
                    rule__GID__Alternatives_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGIDAccess().getAlternatives_0()); 

                    }

                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:568:1: ( ( rule__GID__Alternatives_0 )* )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:569:1: ( rule__GID__Alternatives_0 )*
                    {
                     before(grammarAccess.getGIDAccess().getAlternatives_0()); 
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:570:1: ( rule__GID__Alternatives_0 )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>=RULE_CID && LA5_0<=RULE_INT)) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:570:2: rule__GID__Alternatives_0
                    	    {
                    	    pushFollow(FOLLOW_rule__GID__Alternatives_0_in_rule__GID__Alternatives1167);
                    	    rule__GID__Alternatives_0();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                     after(grammarAccess.getGIDAccess().getAlternatives_0()); 

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:575:6: ( ( rule__GID__Group_1__0 ) )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:575:6: ( ( rule__GID__Group_1__0 ) )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:576:1: ( rule__GID__Group_1__0 )
                    {
                     before(grammarAccess.getGIDAccess().getGroup_1()); 
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:577:1: ( rule__GID__Group_1__0 )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:577:2: rule__GID__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__GID__Group_1__0_in_rule__GID__Alternatives1188);
                    rule__GID__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGIDAccess().getGroup_1()); 

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


    // $ANTLR start "rule__GID__Alternatives_0"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:586:1: rule__GID__Alternatives_0 : ( ( RULE_CID ) | ( RULE_ANY_OTHER ) | ( RULE_INT ) );
    public final void rule__GID__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:590:1: ( ( RULE_CID ) | ( RULE_ANY_OTHER ) | ( RULE_INT ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case RULE_CID:
                {
                alt7=1;
                }
                break;
            case RULE_ANY_OTHER:
                {
                alt7=2;
                }
                break;
            case RULE_INT:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:591:1: ( RULE_CID )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:591:1: ( RULE_CID )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:592:1: RULE_CID
                    {
                     before(grammarAccess.getGIDAccess().getCIDTerminalRuleCall_0_0()); 
                    match(input,RULE_CID,FOLLOW_RULE_CID_in_rule__GID__Alternatives_01221); 
                     after(grammarAccess.getGIDAccess().getCIDTerminalRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:597:6: ( RULE_ANY_OTHER )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:597:6: ( RULE_ANY_OTHER )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:598:1: RULE_ANY_OTHER
                    {
                     before(grammarAccess.getGIDAccess().getANY_OTHERTerminalRuleCall_0_1()); 
                    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_rule__GID__Alternatives_01238); 
                     after(grammarAccess.getGIDAccess().getANY_OTHERTerminalRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:603:6: ( RULE_INT )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:603:6: ( RULE_INT )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:604:1: RULE_INT
                    {
                     before(grammarAccess.getGIDAccess().getINTTerminalRuleCall_0_2()); 
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__GID__Alternatives_01255); 
                     after(grammarAccess.getGIDAccess().getINTTerminalRuleCall_0_2()); 

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
    // $ANTLR end "rule__GID__Alternatives_0"


    // $ANTLR start "rule__SOMETHING__Alternatives"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:614:1: rule__SOMETHING__Alternatives : ( ( RULE_ANY_OTHER ) | ( RULE_CID ) | ( RULE_INT ) | ( ( rule__SOMETHING__Group_3__0 ) ) | ( ':' ) | ( '=' ) | ( '<' ) | ( '->' ) | ( '%' ) | ( '-' ) | ( ( rule__SOMETHING__Group_10__0 ) ) | ( ruleWS ) );
    public final void rule__SOMETHING__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:618:1: ( ( RULE_ANY_OTHER ) | ( RULE_CID ) | ( RULE_INT ) | ( ( rule__SOMETHING__Group_3__0 ) ) | ( ':' ) | ( '=' ) | ( '<' ) | ( '->' ) | ( '%' ) | ( '-' ) | ( ( rule__SOMETHING__Group_10__0 ) ) | ( ruleWS ) )
            int alt8=12;
            switch ( input.LA(1) ) {
            case RULE_ANY_OTHER:
                {
                alt8=1;
                }
                break;
            case RULE_CID:
                {
                alt8=2;
                }
                break;
            case RULE_INT:
                {
                alt8=3;
                }
                break;
            case 12:
                {
                alt8=4;
                }
                break;
            case 13:
                {
                alt8=5;
                }
                break;
            case 14:
                {
                alt8=6;
                }
                break;
            case 15:
                {
                alt8=7;
                }
                break;
            case 16:
                {
                alt8=8;
                }
                break;
            case 17:
                {
                alt8=9;
                }
                break;
            case 18:
                {
                alt8=10;
                }
                break;
            case 31:
                {
                alt8=11;
                }
                break;
            case RULE_SP:
            case RULE_ML_COMMENT:
            case RULE_ML2_COMMENT:
            case RULE_SL_COMMENT:
                {
                alt8=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:619:1: ( RULE_ANY_OTHER )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:619:1: ( RULE_ANY_OTHER )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:620:1: RULE_ANY_OTHER
                    {
                     before(grammarAccess.getSOMETHINGAccess().getANY_OTHERTerminalRuleCall_0()); 
                    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_rule__SOMETHING__Alternatives1287); 
                     after(grammarAccess.getSOMETHINGAccess().getANY_OTHERTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:625:6: ( RULE_CID )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:625:6: ( RULE_CID )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:626:1: RULE_CID
                    {
                     before(grammarAccess.getSOMETHINGAccess().getCIDTerminalRuleCall_1()); 
                    match(input,RULE_CID,FOLLOW_RULE_CID_in_rule__SOMETHING__Alternatives1304); 
                     after(grammarAccess.getSOMETHINGAccess().getCIDTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:631:6: ( RULE_INT )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:631:6: ( RULE_INT )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:632:1: RULE_INT
                    {
                     before(grammarAccess.getSOMETHINGAccess().getINTTerminalRuleCall_2()); 
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__SOMETHING__Alternatives1321); 
                     after(grammarAccess.getSOMETHINGAccess().getINTTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:637:6: ( ( rule__SOMETHING__Group_3__0 ) )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:637:6: ( ( rule__SOMETHING__Group_3__0 ) )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:638:1: ( rule__SOMETHING__Group_3__0 )
                    {
                     before(grammarAccess.getSOMETHINGAccess().getGroup_3()); 
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:639:1: ( rule__SOMETHING__Group_3__0 )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:639:2: rule__SOMETHING__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__SOMETHING__Group_3__0_in_rule__SOMETHING__Alternatives1338);
                    rule__SOMETHING__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSOMETHINGAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:643:6: ( ':' )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:643:6: ( ':' )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:644:1: ':'
                    {
                     before(grammarAccess.getSOMETHINGAccess().getColonKeyword_4()); 
                    match(input,13,FOLLOW_13_in_rule__SOMETHING__Alternatives1357); 
                     after(grammarAccess.getSOMETHINGAccess().getColonKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:651:6: ( '=' )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:651:6: ( '=' )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:652:1: '='
                    {
                     before(grammarAccess.getSOMETHINGAccess().getEqualsSignKeyword_5()); 
                    match(input,14,FOLLOW_14_in_rule__SOMETHING__Alternatives1377); 
                     after(grammarAccess.getSOMETHINGAccess().getEqualsSignKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:659:6: ( '<' )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:659:6: ( '<' )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:660:1: '<'
                    {
                     before(grammarAccess.getSOMETHINGAccess().getLessThanSignKeyword_6()); 
                    match(input,15,FOLLOW_15_in_rule__SOMETHING__Alternatives1397); 
                     after(grammarAccess.getSOMETHINGAccess().getLessThanSignKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:667:6: ( '->' )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:667:6: ( '->' )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:668:1: '->'
                    {
                     before(grammarAccess.getSOMETHINGAccess().getHyphenMinusGreaterThanSignKeyword_7()); 
                    match(input,16,FOLLOW_16_in_rule__SOMETHING__Alternatives1417); 
                     after(grammarAccess.getSOMETHINGAccess().getHyphenMinusGreaterThanSignKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:675:6: ( '%' )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:675:6: ( '%' )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:676:1: '%'
                    {
                     before(grammarAccess.getSOMETHINGAccess().getPercentSignKeyword_8()); 
                    match(input,17,FOLLOW_17_in_rule__SOMETHING__Alternatives1437); 
                     after(grammarAccess.getSOMETHINGAccess().getPercentSignKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:683:6: ( '-' )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:683:6: ( '-' )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:684:1: '-'
                    {
                     before(grammarAccess.getSOMETHINGAccess().getHyphenMinusKeyword_9()); 
                    match(input,18,FOLLOW_18_in_rule__SOMETHING__Alternatives1457); 
                     after(grammarAccess.getSOMETHINGAccess().getHyphenMinusKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:691:6: ( ( rule__SOMETHING__Group_10__0 ) )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:691:6: ( ( rule__SOMETHING__Group_10__0 ) )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:692:1: ( rule__SOMETHING__Group_10__0 )
                    {
                     before(grammarAccess.getSOMETHINGAccess().getGroup_10()); 
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:693:1: ( rule__SOMETHING__Group_10__0 )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:693:2: rule__SOMETHING__Group_10__0
                    {
                    pushFollow(FOLLOW_rule__SOMETHING__Group_10__0_in_rule__SOMETHING__Alternatives1476);
                    rule__SOMETHING__Group_10__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSOMETHINGAccess().getGroup_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:697:6: ( ruleWS )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:697:6: ( ruleWS )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:698:1: ruleWS
                    {
                     before(grammarAccess.getSOMETHINGAccess().getWSParserRuleCall_11()); 
                    pushFollow(FOLLOW_ruleWS_in_rule__SOMETHING__Alternatives1494);
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


    // $ANTLR start "rule__SigDefinitions__Alternatives"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:709:1: rule__SigDefinitions__Alternatives : ( ( ( rule__SigDefinitions__Group_0__0 ) ) | ( ( rule__SigDefinitions__Group_1__0 ) ) | ( ( rule__SigDefinitions__Group_2__0 ) ) | ( ( rule__SigDefinitions__Group_3__0 ) ) | ( ruleJUSTSPACE ) );
    public final void rule__SigDefinitions__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:713:1: ( ( ( rule__SigDefinitions__Group_0__0 ) ) | ( ( rule__SigDefinitions__Group_1__0 ) ) | ( ( rule__SigDefinitions__Group_2__0 ) ) | ( ( rule__SigDefinitions__Group_3__0 ) ) | ( ruleJUSTSPACE ) )
            int alt9=5;
            switch ( input.LA(1) ) {
            case RULE_CID:
            case RULE_ANY_OTHER:
            case RULE_INT:
            case 31:
                {
                alt9=1;
                }
                break;
            case 35:
                {
                alt9=2;
                }
                break;
            case 36:
                {
                alt9=3;
                }
                break;
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                {
                alt9=4;
                }
                break;
            case RULE_SP:
            case RULE_ML_COMMENT:
            case RULE_ML2_COMMENT:
            case RULE_SL_COMMENT:
                {
                alt9=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:714:1: ( ( rule__SigDefinitions__Group_0__0 ) )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:714:1: ( ( rule__SigDefinitions__Group_0__0 ) )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:715:1: ( rule__SigDefinitions__Group_0__0 )
                    {
                     before(grammarAccess.getSigDefinitionsAccess().getGroup_0()); 
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:716:1: ( rule__SigDefinitions__Group_0__0 )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:716:2: rule__SigDefinitions__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__SigDefinitions__Group_0__0_in_rule__SigDefinitions__Alternatives1527);
                    rule__SigDefinitions__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSigDefinitionsAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:720:6: ( ( rule__SigDefinitions__Group_1__0 ) )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:720:6: ( ( rule__SigDefinitions__Group_1__0 ) )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:721:1: ( rule__SigDefinitions__Group_1__0 )
                    {
                     before(grammarAccess.getSigDefinitionsAccess().getGroup_1()); 
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:722:1: ( rule__SigDefinitions__Group_1__0 )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:722:2: rule__SigDefinitions__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__SigDefinitions__Group_1__0_in_rule__SigDefinitions__Alternatives1545);
                    rule__SigDefinitions__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSigDefinitionsAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:726:6: ( ( rule__SigDefinitions__Group_2__0 ) )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:726:6: ( ( rule__SigDefinitions__Group_2__0 ) )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:727:1: ( rule__SigDefinitions__Group_2__0 )
                    {
                     before(grammarAccess.getSigDefinitionsAccess().getGroup_2()); 
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:728:1: ( rule__SigDefinitions__Group_2__0 )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:728:2: rule__SigDefinitions__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__SigDefinitions__Group_2__0_in_rule__SigDefinitions__Alternatives1563);
                    rule__SigDefinitions__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSigDefinitionsAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:732:6: ( ( rule__SigDefinitions__Group_3__0 ) )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:732:6: ( ( rule__SigDefinitions__Group_3__0 ) )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:733:1: ( rule__SigDefinitions__Group_3__0 )
                    {
                     before(grammarAccess.getSigDefinitionsAccess().getGroup_3()); 
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:734:1: ( rule__SigDefinitions__Group_3__0 )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:734:2: rule__SigDefinitions__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__SigDefinitions__Group_3__0_in_rule__SigDefinitions__Alternatives1581);
                    rule__SigDefinitions__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSigDefinitionsAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:738:6: ( ruleJUSTSPACE )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:738:6: ( ruleJUSTSPACE )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:739:1: ruleJUSTSPACE
                    {
                     before(grammarAccess.getSigDefinitionsAccess().getJUSTSPACEParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleJUSTSPACE_in_rule__SigDefinitions__Alternatives1599);
                    ruleJUSTSPACE();

                    state._fsp--;

                     after(grammarAccess.getSigDefinitionsAccess().getJUSTSPACEParserRuleCall_4()); 

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


    // $ANTLR start "rule__SigDefinitions__Alternatives_0_2"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:749:1: rule__SigDefinitions__Alternatives_0_2 : ( ( ':' ) | ( ':=' ) | ( '=' ) );
    public final void rule__SigDefinitions__Alternatives_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:753:1: ( ( ':' ) | ( ':=' ) | ( '=' ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt10=1;
                }
                break;
            case 19:
                {
                alt10=2;
                }
                break;
            case 14:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:754:1: ( ':' )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:754:1: ( ':' )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:755:1: ':'
                    {
                     before(grammarAccess.getSigDefinitionsAccess().getColonKeyword_0_2_0()); 
                    match(input,13,FOLLOW_13_in_rule__SigDefinitions__Alternatives_0_21632); 
                     after(grammarAccess.getSigDefinitionsAccess().getColonKeyword_0_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:762:6: ( ':=' )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:762:6: ( ':=' )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:763:1: ':='
                    {
                     before(grammarAccess.getSigDefinitionsAccess().getColonEqualsSignKeyword_0_2_1()); 
                    match(input,19,FOLLOW_19_in_rule__SigDefinitions__Alternatives_0_21652); 
                     after(grammarAccess.getSigDefinitionsAccess().getColonEqualsSignKeyword_0_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:770:6: ( '=' )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:770:6: ( '=' )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:771:1: '='
                    {
                     before(grammarAccess.getSigDefinitionsAccess().getEqualsSignKeyword_0_2_2()); 
                    match(input,14,FOLLOW_14_in_rule__SigDefinitions__Alternatives_0_21672); 
                     after(grammarAccess.getSigDefinitionsAccess().getEqualsSignKeyword_0_2_2()); 

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
    // $ANTLR end "rule__SigDefinitions__Alternatives_0_2"


    // $ANTLR start "rule__SigDefinitions__TmpAlternatives_3_0_0"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:783:1: rule__SigDefinitions__TmpAlternatives_3_0_0 : ( ( '%meta' ) | ( '%abbrev' ) | ( '%name' ) | ( '%pattern' ) | ( '%infix' ) | ( 'prefix' ) );
    public final void rule__SigDefinitions__TmpAlternatives_3_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:787:1: ( ( '%meta' ) | ( '%abbrev' ) | ( '%name' ) | ( '%pattern' ) | ( '%infix' ) | ( 'prefix' ) )
            int alt11=6;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt11=1;
                }
                break;
            case 21:
                {
                alt11=2;
                }
                break;
            case 22:
                {
                alt11=3;
                }
                break;
            case 23:
                {
                alt11=4;
                }
                break;
            case 24:
                {
                alt11=5;
                }
                break;
            case 25:
                {
                alt11=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:788:1: ( '%meta' )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:788:1: ( '%meta' )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:789:1: '%meta'
                    {
                     before(grammarAccess.getSigDefinitionsAccess().getTmpMetaKeyword_3_0_0_0()); 
                    match(input,20,FOLLOW_20_in_rule__SigDefinitions__TmpAlternatives_3_0_01707); 
                     after(grammarAccess.getSigDefinitionsAccess().getTmpMetaKeyword_3_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:796:6: ( '%abbrev' )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:796:6: ( '%abbrev' )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:797:1: '%abbrev'
                    {
                     before(grammarAccess.getSigDefinitionsAccess().getTmpAbbrevKeyword_3_0_0_1()); 
                    match(input,21,FOLLOW_21_in_rule__SigDefinitions__TmpAlternatives_3_0_01727); 
                     after(grammarAccess.getSigDefinitionsAccess().getTmpAbbrevKeyword_3_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:804:6: ( '%name' )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:804:6: ( '%name' )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:805:1: '%name'
                    {
                     before(grammarAccess.getSigDefinitionsAccess().getTmpNameKeyword_3_0_0_2()); 
                    match(input,22,FOLLOW_22_in_rule__SigDefinitions__TmpAlternatives_3_0_01747); 
                     after(grammarAccess.getSigDefinitionsAccess().getTmpNameKeyword_3_0_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:812:6: ( '%pattern' )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:812:6: ( '%pattern' )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:813:1: '%pattern'
                    {
                     before(grammarAccess.getSigDefinitionsAccess().getTmpPatternKeyword_3_0_0_3()); 
                    match(input,23,FOLLOW_23_in_rule__SigDefinitions__TmpAlternatives_3_0_01767); 
                     after(grammarAccess.getSigDefinitionsAccess().getTmpPatternKeyword_3_0_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:820:6: ( '%infix' )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:820:6: ( '%infix' )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:821:1: '%infix'
                    {
                     before(grammarAccess.getSigDefinitionsAccess().getTmpInfixKeyword_3_0_0_4()); 
                    match(input,24,FOLLOW_24_in_rule__SigDefinitions__TmpAlternatives_3_0_01787); 
                     after(grammarAccess.getSigDefinitionsAccess().getTmpInfixKeyword_3_0_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:828:6: ( 'prefix' )
                    {
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:828:6: ( 'prefix' )
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:829:1: 'prefix'
                    {
                     before(grammarAccess.getSigDefinitionsAccess().getTmpPrefixKeyword_3_0_0_5()); 
                    match(input,25,FOLLOW_25_in_rule__SigDefinitions__TmpAlternatives_3_0_01807); 
                     after(grammarAccess.getSigDefinitionsAccess().getTmpPrefixKeyword_3_0_0_5()); 

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
    // $ANTLR end "rule__SigDefinitions__TmpAlternatives_3_0_0"


    // $ANTLR start "rule__NAMESPACE__Group__0"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:844:1: rule__NAMESPACE__Group__0 : rule__NAMESPACE__Group__0__Impl rule__NAMESPACE__Group__1 ;
    public final void rule__NAMESPACE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:848:1: ( rule__NAMESPACE__Group__0__Impl rule__NAMESPACE__Group__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:849:2: rule__NAMESPACE__Group__0__Impl rule__NAMESPACE__Group__1
            {
            pushFollow(FOLLOW_rule__NAMESPACE__Group__0__Impl_in_rule__NAMESPACE__Group__01840);
            rule__NAMESPACE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NAMESPACE__Group__1_in_rule__NAMESPACE__Group__01843);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:856:1: rule__NAMESPACE__Group__0__Impl : ( ( '../' )* ) ;
    public final void rule__NAMESPACE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:860:1: ( ( ( '../' )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:861:1: ( ( '../' )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:861:1: ( ( '../' )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:862:1: ( '../' )*
            {
             before(grammarAccess.getNAMESPACEAccess().getFullStopFullStopSolidusKeyword_0()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:863:1: ( '../' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==26) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:864:2: '../'
            	    {
            	    match(input,26,FOLLOW_26_in_rule__NAMESPACE__Group__0__Impl1872); 

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getNAMESPACEAccess().getFullStopFullStopSolidusKeyword_0()); 

            }


            }

        }
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:875:1: rule__NAMESPACE__Group__1 : rule__NAMESPACE__Group__1__Impl rule__NAMESPACE__Group__2 ;
    public final void rule__NAMESPACE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:879:1: ( rule__NAMESPACE__Group__1__Impl rule__NAMESPACE__Group__2 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:880:2: rule__NAMESPACE__Group__1__Impl rule__NAMESPACE__Group__2
            {
            pushFollow(FOLLOW_rule__NAMESPACE__Group__1__Impl_in_rule__NAMESPACE__Group__11905);
            rule__NAMESPACE__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NAMESPACE__Group__2_in_rule__NAMESPACE__Group__11908);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:887:1: rule__NAMESPACE__Group__1__Impl : ( RULE_CID ) ;
    public final void rule__NAMESPACE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:891:1: ( ( RULE_CID ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:892:1: ( RULE_CID )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:892:1: ( RULE_CID )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:893:1: RULE_CID
            {
             before(grammarAccess.getNAMESPACEAccess().getCIDTerminalRuleCall_1()); 
            match(input,RULE_CID,FOLLOW_RULE_CID_in_rule__NAMESPACE__Group__1__Impl1935); 
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:904:1: rule__NAMESPACE__Group__2 : rule__NAMESPACE__Group__2__Impl ;
    public final void rule__NAMESPACE__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:908:1: ( rule__NAMESPACE__Group__2__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:909:2: rule__NAMESPACE__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__NAMESPACE__Group__2__Impl_in_rule__NAMESPACE__Group__21964);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:915:1: rule__NAMESPACE__Group__2__Impl : ( ( rule__NAMESPACE__Group_2__0 )* ) ;
    public final void rule__NAMESPACE__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:919:1: ( ( ( rule__NAMESPACE__Group_2__0 )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:920:1: ( ( rule__NAMESPACE__Group_2__0 )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:920:1: ( ( rule__NAMESPACE__Group_2__0 )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:921:1: ( rule__NAMESPACE__Group_2__0 )*
            {
             before(grammarAccess.getNAMESPACEAccess().getGroup_2()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:922:1: ( rule__NAMESPACE__Group_2__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==12) ) {
                    int LA13_2 = input.LA(2);

                    if ( (LA13_2==RULE_CID) ) {
                        alt13=1;
                    }


                }
                else if ( (LA13_0==11) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:922:2: rule__NAMESPACE__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__NAMESPACE__Group_2__0_in_rule__NAMESPACE__Group__2__Impl1991);
            	    rule__NAMESPACE__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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


    // $ANTLR start "rule__NAMESPACE__Group_2__0"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:938:1: rule__NAMESPACE__Group_2__0 : rule__NAMESPACE__Group_2__0__Impl rule__NAMESPACE__Group_2__1 ;
    public final void rule__NAMESPACE__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:942:1: ( rule__NAMESPACE__Group_2__0__Impl rule__NAMESPACE__Group_2__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:943:2: rule__NAMESPACE__Group_2__0__Impl rule__NAMESPACE__Group_2__1
            {
            pushFollow(FOLLOW_rule__NAMESPACE__Group_2__0__Impl_in_rule__NAMESPACE__Group_2__02028);
            rule__NAMESPACE__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NAMESPACE__Group_2__1_in_rule__NAMESPACE__Group_2__02031);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:950:1: rule__NAMESPACE__Group_2__0__Impl : ( ( rule__NAMESPACE__Alternatives_2_0 ) ) ;
    public final void rule__NAMESPACE__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:954:1: ( ( ( rule__NAMESPACE__Alternatives_2_0 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:955:1: ( ( rule__NAMESPACE__Alternatives_2_0 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:955:1: ( ( rule__NAMESPACE__Alternatives_2_0 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:956:1: ( rule__NAMESPACE__Alternatives_2_0 )
            {
             before(grammarAccess.getNAMESPACEAccess().getAlternatives_2_0()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:957:1: ( rule__NAMESPACE__Alternatives_2_0 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:957:2: rule__NAMESPACE__Alternatives_2_0
            {
            pushFollow(FOLLOW_rule__NAMESPACE__Alternatives_2_0_in_rule__NAMESPACE__Group_2__0__Impl2058);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:967:1: rule__NAMESPACE__Group_2__1 : rule__NAMESPACE__Group_2__1__Impl ;
    public final void rule__NAMESPACE__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:971:1: ( rule__NAMESPACE__Group_2__1__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:972:2: rule__NAMESPACE__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__NAMESPACE__Group_2__1__Impl_in_rule__NAMESPACE__Group_2__12088);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:978:1: rule__NAMESPACE__Group_2__1__Impl : ( RULE_CID ) ;
    public final void rule__NAMESPACE__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:982:1: ( ( RULE_CID ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:983:1: ( RULE_CID )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:983:1: ( RULE_CID )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:984:1: RULE_CID
            {
             before(grammarAccess.getNAMESPACEAccess().getCIDTerminalRuleCall_2_1()); 
            match(input,RULE_CID,FOLLOW_RULE_CID_in_rule__NAMESPACE__Group_2__1__Impl2115); 
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:999:1: rule__URI__Group__0 : rule__URI__Group__0__Impl rule__URI__Group__1 ;
    public final void rule__URI__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1003:1: ( rule__URI__Group__0__Impl rule__URI__Group__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1004:2: rule__URI__Group__0__Impl rule__URI__Group__1
            {
            pushFollow(FOLLOW_rule__URI__Group__0__Impl_in_rule__URI__Group__02148);
            rule__URI__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URI__Group__1_in_rule__URI__Group__02151);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1011:1: rule__URI__Group__0__Impl : ( ( rule__URI__Group_0__0 )? ) ;
    public final void rule__URI__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1015:1: ( ( ( rule__URI__Group_0__0 )? ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1016:1: ( ( rule__URI__Group_0__0 )? )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1016:1: ( ( rule__URI__Group_0__0 )? )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1017:1: ( rule__URI__Group_0__0 )?
            {
             before(grammarAccess.getURIAccess().getGroup_0()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1018:1: ( rule__URI__Group_0__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_CID) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==27) ) {
                    alt14=1;
                }
            }
            switch (alt14) {
                case 1 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1018:2: rule__URI__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__URI__Group_0__0_in_rule__URI__Group__0__Impl2178);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1028:1: rule__URI__Group__1 : rule__URI__Group__1__Impl ;
    public final void rule__URI__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1032:1: ( rule__URI__Group__1__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1033:2: rule__URI__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__URI__Group__1__Impl_in_rule__URI__Group__12209);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1039:1: rule__URI__Group__1__Impl : ( ruleNAMESPACE ) ;
    public final void rule__URI__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1043:1: ( ( ruleNAMESPACE ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1044:1: ( ruleNAMESPACE )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1044:1: ( ruleNAMESPACE )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1045:1: ruleNAMESPACE
            {
             before(grammarAccess.getURIAccess().getNAMESPACEParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleNAMESPACE_in_rule__URI__Group__1__Impl2236);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1060:1: rule__URI__Group_0__0 : rule__URI__Group_0__0__Impl rule__URI__Group_0__1 ;
    public final void rule__URI__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1064:1: ( rule__URI__Group_0__0__Impl rule__URI__Group_0__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1065:2: rule__URI__Group_0__0__Impl rule__URI__Group_0__1
            {
            pushFollow(FOLLOW_rule__URI__Group_0__0__Impl_in_rule__URI__Group_0__02269);
            rule__URI__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URI__Group_0__1_in_rule__URI__Group_0__02272);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1072:1: rule__URI__Group_0__0__Impl : ( RULE_CID ) ;
    public final void rule__URI__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1076:1: ( ( RULE_CID ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1077:1: ( RULE_CID )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1077:1: ( RULE_CID )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1078:1: RULE_CID
            {
             before(grammarAccess.getURIAccess().getCIDTerminalRuleCall_0_0()); 
            match(input,RULE_CID,FOLLOW_RULE_CID_in_rule__URI__Group_0__0__Impl2299); 
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1089:1: rule__URI__Group_0__1 : rule__URI__Group_0__1__Impl ;
    public final void rule__URI__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1093:1: ( rule__URI__Group_0__1__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1094:2: rule__URI__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__URI__Group_0__1__Impl_in_rule__URI__Group_0__12328);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1100:1: rule__URI__Group_0__1__Impl : ( '://' ) ;
    public final void rule__URI__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1104:1: ( ( '://' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1105:1: ( '://' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1105:1: ( '://' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1106:1: '://'
            {
             before(grammarAccess.getURIAccess().getColonSolidusSolidusKeyword_0_1()); 
            match(input,27,FOLLOW_27_in_rule__URI__Group_0__1__Impl2356); 
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


    // $ANTLR start "rule__URISTRING__Group__0"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1123:1: rule__URISTRING__Group__0 : rule__URISTRING__Group__0__Impl rule__URISTRING__Group__1 ;
    public final void rule__URISTRING__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1127:1: ( rule__URISTRING__Group__0__Impl rule__URISTRING__Group__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1128:2: rule__URISTRING__Group__0__Impl rule__URISTRING__Group__1
            {
            pushFollow(FOLLOW_rule__URISTRING__Group__0__Impl_in_rule__URISTRING__Group__02391);
            rule__URISTRING__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URISTRING__Group__1_in_rule__URISTRING__Group__02394);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1135:1: rule__URISTRING__Group__0__Impl : ( '\"' ) ;
    public final void rule__URISTRING__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1139:1: ( ( '\"' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1140:1: ( '\"' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1140:1: ( '\"' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1141:1: '\"'
            {
             before(grammarAccess.getURISTRINGAccess().getQuotationMarkKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__URISTRING__Group__0__Impl2422); 
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1154:1: rule__URISTRING__Group__1 : rule__URISTRING__Group__1__Impl rule__URISTRING__Group__2 ;
    public final void rule__URISTRING__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1158:1: ( rule__URISTRING__Group__1__Impl rule__URISTRING__Group__2 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1159:2: rule__URISTRING__Group__1__Impl rule__URISTRING__Group__2
            {
            pushFollow(FOLLOW_rule__URISTRING__Group__1__Impl_in_rule__URISTRING__Group__12453);
            rule__URISTRING__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__URISTRING__Group__2_in_rule__URISTRING__Group__12456);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1166:1: rule__URISTRING__Group__1__Impl : ( ruleURI ) ;
    public final void rule__URISTRING__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1170:1: ( ( ruleURI ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1171:1: ( ruleURI )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1171:1: ( ruleURI )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1172:1: ruleURI
            {
             before(grammarAccess.getURISTRINGAccess().getURIParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleURI_in_rule__URISTRING__Group__1__Impl2483);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1183:1: rule__URISTRING__Group__2 : rule__URISTRING__Group__2__Impl ;
    public final void rule__URISTRING__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1187:1: ( rule__URISTRING__Group__2__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1188:2: rule__URISTRING__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__URISTRING__Group__2__Impl_in_rule__URISTRING__Group__22512);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1194:1: rule__URISTRING__Group__2__Impl : ( '\"' ) ;
    public final void rule__URISTRING__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1198:1: ( ( '\"' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1199:1: ( '\"' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1199:1: ( '\"' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1200:1: '\"'
            {
             before(grammarAccess.getURISTRINGAccess().getQuotationMarkKeyword_2()); 
            match(input,28,FOLLOW_28_in_rule__URISTRING__Group__2__Impl2540); 
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1219:1: rule__NamespaceDeclaration__Group__0 : rule__NamespaceDeclaration__Group__0__Impl rule__NamespaceDeclaration__Group__1 ;
    public final void rule__NamespaceDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1223:1: ( rule__NamespaceDeclaration__Group__0__Impl rule__NamespaceDeclaration__Group__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1224:2: rule__NamespaceDeclaration__Group__0__Impl rule__NamespaceDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group__0__Impl_in_rule__NamespaceDeclaration__Group__02577);
            rule__NamespaceDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group__1_in_rule__NamespaceDeclaration__Group__02580);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1231:1: rule__NamespaceDeclaration__Group__0__Impl : ( '%namespace' ) ;
    public final void rule__NamespaceDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1235:1: ( ( '%namespace' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1236:1: ( '%namespace' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1236:1: ( '%namespace' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1237:1: '%namespace'
            {
             before(grammarAccess.getNamespaceDeclarationAccess().getNamespaceKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__NamespaceDeclaration__Group__0__Impl2608); 
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1250:1: rule__NamespaceDeclaration__Group__1 : rule__NamespaceDeclaration__Group__1__Impl rule__NamespaceDeclaration__Group__2 ;
    public final void rule__NamespaceDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1254:1: ( rule__NamespaceDeclaration__Group__1__Impl rule__NamespaceDeclaration__Group__2 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1255:2: rule__NamespaceDeclaration__Group__1__Impl rule__NamespaceDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group__1__Impl_in_rule__NamespaceDeclaration__Group__12639);
            rule__NamespaceDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group__2_in_rule__NamespaceDeclaration__Group__12642);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1262:1: rule__NamespaceDeclaration__Group__1__Impl : ( ( ( ruleWS ) ) ( ( ruleWS )* ) ) ;
    public final void rule__NamespaceDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1266:1: ( ( ( ( ruleWS ) ) ( ( ruleWS )* ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1267:1: ( ( ( ruleWS ) ) ( ( ruleWS )* ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1267:1: ( ( ( ruleWS ) ) ( ( ruleWS )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1268:1: ( ( ruleWS ) ) ( ( ruleWS )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1268:1: ( ( ruleWS ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1269:1: ( ruleWS )
            {
             before(grammarAccess.getNamespaceDeclarationAccess().getWSParserRuleCall_1()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1270:1: ( ruleWS )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1270:3: ruleWS
            {
            pushFollow(FOLLOW_ruleWS_in_rule__NamespaceDeclaration__Group__1__Impl2672);
            ruleWS();

            state._fsp--;


            }

             after(grammarAccess.getNamespaceDeclarationAccess().getWSParserRuleCall_1()); 

            }

            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1273:1: ( ( ruleWS )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1274:1: ( ruleWS )*
            {
             before(grammarAccess.getNamespaceDeclarationAccess().getWSParserRuleCall_1()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1275:1: ( ruleWS )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=RULE_SP && LA15_0<=RULE_SL_COMMENT)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1275:3: ruleWS
            	    {
            	    pushFollow(FOLLOW_ruleWS_in_rule__NamespaceDeclaration__Group__1__Impl2685);
            	    ruleWS();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getNamespaceDeclarationAccess().getWSParserRuleCall_1()); 

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
    // $ANTLR end "rule__NamespaceDeclaration__Group__1__Impl"


    // $ANTLR start "rule__NamespaceDeclaration__Group__2"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1286:1: rule__NamespaceDeclaration__Group__2 : rule__NamespaceDeclaration__Group__2__Impl rule__NamespaceDeclaration__Group__3 ;
    public final void rule__NamespaceDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1290:1: ( rule__NamespaceDeclaration__Group__2__Impl rule__NamespaceDeclaration__Group__3 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1291:2: rule__NamespaceDeclaration__Group__2__Impl rule__NamespaceDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group__2__Impl_in_rule__NamespaceDeclaration__Group__22718);
            rule__NamespaceDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group__3_in_rule__NamespaceDeclaration__Group__22721);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1298:1: rule__NamespaceDeclaration__Group__2__Impl : ( ( rule__NamespaceDeclaration__Group_2__0 )? ) ;
    public final void rule__NamespaceDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1302:1: ( ( ( rule__NamespaceDeclaration__Group_2__0 )? ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1303:1: ( ( rule__NamespaceDeclaration__Group_2__0 )? )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1303:1: ( ( rule__NamespaceDeclaration__Group_2__0 )? )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1304:1: ( rule__NamespaceDeclaration__Group_2__0 )?
            {
             before(grammarAccess.getNamespaceDeclarationAccess().getGroup_2()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1305:1: ( rule__NamespaceDeclaration__Group_2__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_CID) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1305:2: rule__NamespaceDeclaration__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__NamespaceDeclaration__Group_2__0_in_rule__NamespaceDeclaration__Group__2__Impl2748);
                    rule__NamespaceDeclaration__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNamespaceDeclarationAccess().getGroup_2()); 

            }


            }

        }
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1315:1: rule__NamespaceDeclaration__Group__3 : rule__NamespaceDeclaration__Group__3__Impl rule__NamespaceDeclaration__Group__4 ;
    public final void rule__NamespaceDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1319:1: ( rule__NamespaceDeclaration__Group__3__Impl rule__NamespaceDeclaration__Group__4 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1320:2: rule__NamespaceDeclaration__Group__3__Impl rule__NamespaceDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group__3__Impl_in_rule__NamespaceDeclaration__Group__32779);
            rule__NamespaceDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group__4_in_rule__NamespaceDeclaration__Group__32782);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1327:1: rule__NamespaceDeclaration__Group__3__Impl : ( ( rule__NamespaceDeclaration__UriAssignment_3 ) ) ;
    public final void rule__NamespaceDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1331:1: ( ( ( rule__NamespaceDeclaration__UriAssignment_3 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1332:1: ( ( rule__NamespaceDeclaration__UriAssignment_3 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1332:1: ( ( rule__NamespaceDeclaration__UriAssignment_3 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1333:1: ( rule__NamespaceDeclaration__UriAssignment_3 )
            {
             before(grammarAccess.getNamespaceDeclarationAccess().getUriAssignment_3()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1334:1: ( rule__NamespaceDeclaration__UriAssignment_3 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1334:2: rule__NamespaceDeclaration__UriAssignment_3
            {
            pushFollow(FOLLOW_rule__NamespaceDeclaration__UriAssignment_3_in_rule__NamespaceDeclaration__Group__3__Impl2809);
            rule__NamespaceDeclaration__UriAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getNamespaceDeclarationAccess().getUriAssignment_3()); 

            }


            }

        }
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1344:1: rule__NamespaceDeclaration__Group__4 : rule__NamespaceDeclaration__Group__4__Impl rule__NamespaceDeclaration__Group__5 ;
    public final void rule__NamespaceDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1348:1: ( rule__NamespaceDeclaration__Group__4__Impl rule__NamespaceDeclaration__Group__5 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1349:2: rule__NamespaceDeclaration__Group__4__Impl rule__NamespaceDeclaration__Group__5
            {
            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group__4__Impl_in_rule__NamespaceDeclaration__Group__42839);
            rule__NamespaceDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group__5_in_rule__NamespaceDeclaration__Group__42842);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1356:1: rule__NamespaceDeclaration__Group__4__Impl : ( ( ruleWS )* ) ;
    public final void rule__NamespaceDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1360:1: ( ( ( ruleWS )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1361:1: ( ( ruleWS )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1361:1: ( ( ruleWS )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1362:1: ( ruleWS )*
            {
             before(grammarAccess.getNamespaceDeclarationAccess().getWSParserRuleCall_4()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1363:1: ( ruleWS )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_SP && LA17_0<=RULE_SL_COMMENT)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1363:3: ruleWS
            	    {
            	    pushFollow(FOLLOW_ruleWS_in_rule__NamespaceDeclaration__Group__4__Impl2870);
            	    ruleWS();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getNamespaceDeclarationAccess().getWSParserRuleCall_4()); 

            }


            }

        }
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1373:1: rule__NamespaceDeclaration__Group__5 : rule__NamespaceDeclaration__Group__5__Impl rule__NamespaceDeclaration__Group__6 ;
    public final void rule__NamespaceDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1377:1: ( rule__NamespaceDeclaration__Group__5__Impl rule__NamespaceDeclaration__Group__6 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1378:2: rule__NamespaceDeclaration__Group__5__Impl rule__NamespaceDeclaration__Group__6
            {
            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group__5__Impl_in_rule__NamespaceDeclaration__Group__52901);
            rule__NamespaceDeclaration__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group__6_in_rule__NamespaceDeclaration__Group__52904);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1385:1: rule__NamespaceDeclaration__Group__5__Impl : ( '.' ) ;
    public final void rule__NamespaceDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1389:1: ( ( '.' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1390:1: ( '.' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1390:1: ( '.' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1391:1: '.'
            {
             before(grammarAccess.getNamespaceDeclarationAccess().getFullStopKeyword_5()); 
            match(input,12,FOLLOW_12_in_rule__NamespaceDeclaration__Group__5__Impl2932); 
             after(grammarAccess.getNamespaceDeclarationAccess().getFullStopKeyword_5()); 

            }


            }

        }
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1404:1: rule__NamespaceDeclaration__Group__6 : rule__NamespaceDeclaration__Group__6__Impl ;
    public final void rule__NamespaceDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1408:1: ( rule__NamespaceDeclaration__Group__6__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1409:2: rule__NamespaceDeclaration__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group__6__Impl_in_rule__NamespaceDeclaration__Group__62963);
            rule__NamespaceDeclaration__Group__6__Impl();

            state._fsp--;


            }

        }
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1415:1: rule__NamespaceDeclaration__Group__6__Impl : ( ruleWS ) ;
    public final void rule__NamespaceDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1419:1: ( ( ruleWS ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1420:1: ( ruleWS )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1420:1: ( ruleWS )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1421:1: ruleWS
            {
             before(grammarAccess.getNamespaceDeclarationAccess().getWSParserRuleCall_6()); 
            pushFollow(FOLLOW_ruleWS_in_rule__NamespaceDeclaration__Group__6__Impl2990);
            ruleWS();

            state._fsp--;

             after(grammarAccess.getNamespaceDeclarationAccess().getWSParserRuleCall_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__NamespaceDeclaration__Group_2__0"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1446:1: rule__NamespaceDeclaration__Group_2__0 : rule__NamespaceDeclaration__Group_2__0__Impl rule__NamespaceDeclaration__Group_2__1 ;
    public final void rule__NamespaceDeclaration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1450:1: ( rule__NamespaceDeclaration__Group_2__0__Impl rule__NamespaceDeclaration__Group_2__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1451:2: rule__NamespaceDeclaration__Group_2__0__Impl rule__NamespaceDeclaration__Group_2__1
            {
            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group_2__0__Impl_in_rule__NamespaceDeclaration__Group_2__03033);
            rule__NamespaceDeclaration__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group_2__1_in_rule__NamespaceDeclaration__Group_2__03036);
            rule__NamespaceDeclaration__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamespaceDeclaration__Group_2__0"


    // $ANTLR start "rule__NamespaceDeclaration__Group_2__0__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1458:1: rule__NamespaceDeclaration__Group_2__0__Impl : ( ( rule__NamespaceDeclaration__NameAssignment_2_0 ) ) ;
    public final void rule__NamespaceDeclaration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1462:1: ( ( ( rule__NamespaceDeclaration__NameAssignment_2_0 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1463:1: ( ( rule__NamespaceDeclaration__NameAssignment_2_0 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1463:1: ( ( rule__NamespaceDeclaration__NameAssignment_2_0 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1464:1: ( rule__NamespaceDeclaration__NameAssignment_2_0 )
            {
             before(grammarAccess.getNamespaceDeclarationAccess().getNameAssignment_2_0()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1465:1: ( rule__NamespaceDeclaration__NameAssignment_2_0 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1465:2: rule__NamespaceDeclaration__NameAssignment_2_0
            {
            pushFollow(FOLLOW_rule__NamespaceDeclaration__NameAssignment_2_0_in_rule__NamespaceDeclaration__Group_2__0__Impl3063);
            rule__NamespaceDeclaration__NameAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getNamespaceDeclarationAccess().getNameAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamespaceDeclaration__Group_2__0__Impl"


    // $ANTLR start "rule__NamespaceDeclaration__Group_2__1"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1475:1: rule__NamespaceDeclaration__Group_2__1 : rule__NamespaceDeclaration__Group_2__1__Impl rule__NamespaceDeclaration__Group_2__2 ;
    public final void rule__NamespaceDeclaration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1479:1: ( rule__NamespaceDeclaration__Group_2__1__Impl rule__NamespaceDeclaration__Group_2__2 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1480:2: rule__NamespaceDeclaration__Group_2__1__Impl rule__NamespaceDeclaration__Group_2__2
            {
            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group_2__1__Impl_in_rule__NamespaceDeclaration__Group_2__13093);
            rule__NamespaceDeclaration__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group_2__2_in_rule__NamespaceDeclaration__Group_2__13096);
            rule__NamespaceDeclaration__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamespaceDeclaration__Group_2__1"


    // $ANTLR start "rule__NamespaceDeclaration__Group_2__1__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1487:1: rule__NamespaceDeclaration__Group_2__1__Impl : ( ( ruleWS )* ) ;
    public final void rule__NamespaceDeclaration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1491:1: ( ( ( ruleWS )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1492:1: ( ( ruleWS )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1492:1: ( ( ruleWS )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1493:1: ( ruleWS )*
            {
             before(grammarAccess.getNamespaceDeclarationAccess().getWSParserRuleCall_2_1()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1494:1: ( ruleWS )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=RULE_SP && LA18_0<=RULE_SL_COMMENT)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1494:3: ruleWS
            	    {
            	    pushFollow(FOLLOW_ruleWS_in_rule__NamespaceDeclaration__Group_2__1__Impl3124);
            	    ruleWS();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getNamespaceDeclarationAccess().getWSParserRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamespaceDeclaration__Group_2__1__Impl"


    // $ANTLR start "rule__NamespaceDeclaration__Group_2__2"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1504:1: rule__NamespaceDeclaration__Group_2__2 : rule__NamespaceDeclaration__Group_2__2__Impl rule__NamespaceDeclaration__Group_2__3 ;
    public final void rule__NamespaceDeclaration__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1508:1: ( rule__NamespaceDeclaration__Group_2__2__Impl rule__NamespaceDeclaration__Group_2__3 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1509:2: rule__NamespaceDeclaration__Group_2__2__Impl rule__NamespaceDeclaration__Group_2__3
            {
            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group_2__2__Impl_in_rule__NamespaceDeclaration__Group_2__23155);
            rule__NamespaceDeclaration__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group_2__3_in_rule__NamespaceDeclaration__Group_2__23158);
            rule__NamespaceDeclaration__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamespaceDeclaration__Group_2__2"


    // $ANTLR start "rule__NamespaceDeclaration__Group_2__2__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1516:1: rule__NamespaceDeclaration__Group_2__2__Impl : ( '=' ) ;
    public final void rule__NamespaceDeclaration__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1520:1: ( ( '=' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1521:1: ( '=' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1521:1: ( '=' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1522:1: '='
            {
             before(grammarAccess.getNamespaceDeclarationAccess().getEqualsSignKeyword_2_2()); 
            match(input,14,FOLLOW_14_in_rule__NamespaceDeclaration__Group_2__2__Impl3186); 
             after(grammarAccess.getNamespaceDeclarationAccess().getEqualsSignKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamespaceDeclaration__Group_2__2__Impl"


    // $ANTLR start "rule__NamespaceDeclaration__Group_2__3"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1535:1: rule__NamespaceDeclaration__Group_2__3 : rule__NamespaceDeclaration__Group_2__3__Impl ;
    public final void rule__NamespaceDeclaration__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1539:1: ( rule__NamespaceDeclaration__Group_2__3__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1540:2: rule__NamespaceDeclaration__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group_2__3__Impl_in_rule__NamespaceDeclaration__Group_2__33217);
            rule__NamespaceDeclaration__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamespaceDeclaration__Group_2__3"


    // $ANTLR start "rule__NamespaceDeclaration__Group_2__3__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1546:1: rule__NamespaceDeclaration__Group_2__3__Impl : ( ( ruleWS )* ) ;
    public final void rule__NamespaceDeclaration__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1550:1: ( ( ( ruleWS )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1551:1: ( ( ruleWS )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1551:1: ( ( ruleWS )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1552:1: ( ruleWS )*
            {
             before(grammarAccess.getNamespaceDeclarationAccess().getWSParserRuleCall_2_3()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1553:1: ( ruleWS )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=RULE_SP && LA19_0<=RULE_SL_COMMENT)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1553:3: ruleWS
            	    {
            	    pushFollow(FOLLOW_ruleWS_in_rule__NamespaceDeclaration__Group_2__3__Impl3245);
            	    ruleWS();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getNamespaceDeclarationAccess().getWSParserRuleCall_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamespaceDeclaration__Group_2__3__Impl"


    // $ANTLR start "rule__ReadDeclaration__Group__0"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1571:1: rule__ReadDeclaration__Group__0 : rule__ReadDeclaration__Group__0__Impl rule__ReadDeclaration__Group__1 ;
    public final void rule__ReadDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1575:1: ( rule__ReadDeclaration__Group__0__Impl rule__ReadDeclaration__Group__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1576:2: rule__ReadDeclaration__Group__0__Impl rule__ReadDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__ReadDeclaration__Group__0__Impl_in_rule__ReadDeclaration__Group__03284);
            rule__ReadDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ReadDeclaration__Group__1_in_rule__ReadDeclaration__Group__03287);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1583:1: rule__ReadDeclaration__Group__0__Impl : ( '%read' ) ;
    public final void rule__ReadDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1587:1: ( ( '%read' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1588:1: ( '%read' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1588:1: ( '%read' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1589:1: '%read'
            {
             before(grammarAccess.getReadDeclarationAccess().getReadKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__ReadDeclaration__Group__0__Impl3315); 
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1602:1: rule__ReadDeclaration__Group__1 : rule__ReadDeclaration__Group__1__Impl rule__ReadDeclaration__Group__2 ;
    public final void rule__ReadDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1606:1: ( rule__ReadDeclaration__Group__1__Impl rule__ReadDeclaration__Group__2 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1607:2: rule__ReadDeclaration__Group__1__Impl rule__ReadDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__ReadDeclaration__Group__1__Impl_in_rule__ReadDeclaration__Group__13346);
            rule__ReadDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ReadDeclaration__Group__2_in_rule__ReadDeclaration__Group__13349);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1614:1: rule__ReadDeclaration__Group__1__Impl : ( ( ( ruleWS ) ) ( ( ruleWS )* ) ) ;
    public final void rule__ReadDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1618:1: ( ( ( ( ruleWS ) ) ( ( ruleWS )* ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1619:1: ( ( ( ruleWS ) ) ( ( ruleWS )* ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1619:1: ( ( ( ruleWS ) ) ( ( ruleWS )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1620:1: ( ( ruleWS ) ) ( ( ruleWS )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1620:1: ( ( ruleWS ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1621:1: ( ruleWS )
            {
             before(grammarAccess.getReadDeclarationAccess().getWSParserRuleCall_1()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1622:1: ( ruleWS )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1622:3: ruleWS
            {
            pushFollow(FOLLOW_ruleWS_in_rule__ReadDeclaration__Group__1__Impl3379);
            ruleWS();

            state._fsp--;


            }

             after(grammarAccess.getReadDeclarationAccess().getWSParserRuleCall_1()); 

            }

            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1625:1: ( ( ruleWS )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1626:1: ( ruleWS )*
            {
             before(grammarAccess.getReadDeclarationAccess().getWSParserRuleCall_1()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1627:1: ( ruleWS )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=RULE_SP && LA20_0<=RULE_SL_COMMENT)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1627:3: ruleWS
            	    {
            	    pushFollow(FOLLOW_ruleWS_in_rule__ReadDeclaration__Group__1__Impl3392);
            	    ruleWS();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getReadDeclarationAccess().getWSParserRuleCall_1()); 

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
    // $ANTLR end "rule__ReadDeclaration__Group__1__Impl"


    // $ANTLR start "rule__ReadDeclaration__Group__2"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1638:1: rule__ReadDeclaration__Group__2 : rule__ReadDeclaration__Group__2__Impl rule__ReadDeclaration__Group__3 ;
    public final void rule__ReadDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1642:1: ( rule__ReadDeclaration__Group__2__Impl rule__ReadDeclaration__Group__3 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1643:2: rule__ReadDeclaration__Group__2__Impl rule__ReadDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__ReadDeclaration__Group__2__Impl_in_rule__ReadDeclaration__Group__23425);
            rule__ReadDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ReadDeclaration__Group__3_in_rule__ReadDeclaration__Group__23428);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1650:1: rule__ReadDeclaration__Group__2__Impl : ( ( rule__ReadDeclaration__FileAssignment_2 ) ) ;
    public final void rule__ReadDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1654:1: ( ( ( rule__ReadDeclaration__FileAssignment_2 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1655:1: ( ( rule__ReadDeclaration__FileAssignment_2 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1655:1: ( ( rule__ReadDeclaration__FileAssignment_2 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1656:1: ( rule__ReadDeclaration__FileAssignment_2 )
            {
             before(grammarAccess.getReadDeclarationAccess().getFileAssignment_2()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1657:1: ( rule__ReadDeclaration__FileAssignment_2 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1657:2: rule__ReadDeclaration__FileAssignment_2
            {
            pushFollow(FOLLOW_rule__ReadDeclaration__FileAssignment_2_in_rule__ReadDeclaration__Group__2__Impl3455);
            rule__ReadDeclaration__FileAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getReadDeclarationAccess().getFileAssignment_2()); 

            }


            }

        }
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1667:1: rule__ReadDeclaration__Group__3 : rule__ReadDeclaration__Group__3__Impl rule__ReadDeclaration__Group__4 ;
    public final void rule__ReadDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1671:1: ( rule__ReadDeclaration__Group__3__Impl rule__ReadDeclaration__Group__4 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1672:2: rule__ReadDeclaration__Group__3__Impl rule__ReadDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__ReadDeclaration__Group__3__Impl_in_rule__ReadDeclaration__Group__33485);
            rule__ReadDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ReadDeclaration__Group__4_in_rule__ReadDeclaration__Group__33488);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1679:1: rule__ReadDeclaration__Group__3__Impl : ( ( ruleWS )* ) ;
    public final void rule__ReadDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1683:1: ( ( ( ruleWS )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1684:1: ( ( ruleWS )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1684:1: ( ( ruleWS )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1685:1: ( ruleWS )*
            {
             before(grammarAccess.getReadDeclarationAccess().getWSParserRuleCall_3()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1686:1: ( ruleWS )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=RULE_SP && LA21_0<=RULE_SL_COMMENT)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1686:3: ruleWS
            	    {
            	    pushFollow(FOLLOW_ruleWS_in_rule__ReadDeclaration__Group__3__Impl3516);
            	    ruleWS();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getReadDeclarationAccess().getWSParserRuleCall_3()); 

            }


            }

        }
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1696:1: rule__ReadDeclaration__Group__4 : rule__ReadDeclaration__Group__4__Impl rule__ReadDeclaration__Group__5 ;
    public final void rule__ReadDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1700:1: ( rule__ReadDeclaration__Group__4__Impl rule__ReadDeclaration__Group__5 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1701:2: rule__ReadDeclaration__Group__4__Impl rule__ReadDeclaration__Group__5
            {
            pushFollow(FOLLOW_rule__ReadDeclaration__Group__4__Impl_in_rule__ReadDeclaration__Group__43547);
            rule__ReadDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ReadDeclaration__Group__5_in_rule__ReadDeclaration__Group__43550);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1708:1: rule__ReadDeclaration__Group__4__Impl : ( '.' ) ;
    public final void rule__ReadDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1712:1: ( ( '.' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1713:1: ( '.' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1713:1: ( '.' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1714:1: '.'
            {
             before(grammarAccess.getReadDeclarationAccess().getFullStopKeyword_4()); 
            match(input,12,FOLLOW_12_in_rule__ReadDeclaration__Group__4__Impl3578); 
             after(grammarAccess.getReadDeclarationAccess().getFullStopKeyword_4()); 

            }


            }

        }
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1727:1: rule__ReadDeclaration__Group__5 : rule__ReadDeclaration__Group__5__Impl ;
    public final void rule__ReadDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1731:1: ( rule__ReadDeclaration__Group__5__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1732:2: rule__ReadDeclaration__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__ReadDeclaration__Group__5__Impl_in_rule__ReadDeclaration__Group__53609);
            rule__ReadDeclaration__Group__5__Impl();

            state._fsp--;


            }

        }
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1738:1: rule__ReadDeclaration__Group__5__Impl : ( ruleWS ) ;
    public final void rule__ReadDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1742:1: ( ( ruleWS ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1743:1: ( ruleWS )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1743:1: ( ruleWS )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1744:1: ruleWS
            {
             before(grammarAccess.getReadDeclarationAccess().getWSParserRuleCall_5()); 
            pushFollow(FOLLOW_ruleWS_in_rule__ReadDeclaration__Group__5__Impl3636);
            ruleWS();

            state._fsp--;

             after(grammarAccess.getReadDeclarationAccess().getWSParserRuleCall_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__GID__Group_1__0"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1767:1: rule__GID__Group_1__0 : rule__GID__Group_1__0__Impl rule__GID__Group_1__1 ;
    public final void rule__GID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1771:1: ( rule__GID__Group_1__0__Impl rule__GID__Group_1__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1772:2: rule__GID__Group_1__0__Impl rule__GID__Group_1__1
            {
            pushFollow(FOLLOW_rule__GID__Group_1__0__Impl_in_rule__GID__Group_1__03677);
            rule__GID__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GID__Group_1__1_in_rule__GID__Group_1__03680);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1779:1: rule__GID__Group_1__0__Impl : ( '..' ) ;
    public final void rule__GID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1783:1: ( ( '..' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1784:1: ( '..' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1784:1: ( '..' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1785:1: '..'
            {
             before(grammarAccess.getGIDAccess().getFullStopFullStopKeyword_1_0()); 
            match(input,31,FOLLOW_31_in_rule__GID__Group_1__0__Impl3708); 
             after(grammarAccess.getGIDAccess().getFullStopFullStopKeyword_1_0()); 

            }


            }

        }
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1798:1: rule__GID__Group_1__1 : rule__GID__Group_1__1__Impl ;
    public final void rule__GID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1802:1: ( rule__GID__Group_1__1__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1803:2: rule__GID__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__GID__Group_1__1__Impl_in_rule__GID__Group_1__13739);
            rule__GID__Group_1__1__Impl();

            state._fsp--;


            }

        }
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1809:1: rule__GID__Group_1__1__Impl : ( ( '.' )* ) ;
    public final void rule__GID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1813:1: ( ( ( '.' )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1814:1: ( ( '.' )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1814:1: ( ( '.' )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1815:1: ( '.' )*
            {
             before(grammarAccess.getGIDAccess().getFullStopKeyword_1_1()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1816:1: ( '.' )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==12) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1817:2: '.'
            	    {
            	    match(input,12,FOLLOW_12_in_rule__GID__Group_1__1__Impl3768); 

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getGIDAccess().getFullStopKeyword_1_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__SOMETHING__Group_3__0"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1832:1: rule__SOMETHING__Group_3__0 : rule__SOMETHING__Group_3__0__Impl rule__SOMETHING__Group_3__1 ;
    public final void rule__SOMETHING__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1836:1: ( rule__SOMETHING__Group_3__0__Impl rule__SOMETHING__Group_3__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1837:2: rule__SOMETHING__Group_3__0__Impl rule__SOMETHING__Group_3__1
            {
            pushFollow(FOLLOW_rule__SOMETHING__Group_3__0__Impl_in_rule__SOMETHING__Group_3__03805);
            rule__SOMETHING__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SOMETHING__Group_3__1_in_rule__SOMETHING__Group_3__03808);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1844:1: rule__SOMETHING__Group_3__0__Impl : ( '.' ) ;
    public final void rule__SOMETHING__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1848:1: ( ( '.' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1849:1: ( '.' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1849:1: ( '.' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1850:1: '.'
            {
             before(grammarAccess.getSOMETHINGAccess().getFullStopKeyword_3_0()); 
            match(input,12,FOLLOW_12_in_rule__SOMETHING__Group_3__0__Impl3836); 
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1863:1: rule__SOMETHING__Group_3__1 : rule__SOMETHING__Group_3__1__Impl ;
    public final void rule__SOMETHING__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1867:1: ( rule__SOMETHING__Group_3__1__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1868:2: rule__SOMETHING__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__SOMETHING__Group_3__1__Impl_in_rule__SOMETHING__Group_3__13867);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1874:1: rule__SOMETHING__Group_3__1__Impl : ( RULE_CID ) ;
    public final void rule__SOMETHING__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1878:1: ( ( RULE_CID ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1879:1: ( RULE_CID )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1879:1: ( RULE_CID )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1880:1: RULE_CID
            {
             before(grammarAccess.getSOMETHINGAccess().getCIDTerminalRuleCall_3_1()); 
            match(input,RULE_CID,FOLLOW_RULE_CID_in_rule__SOMETHING__Group_3__1__Impl3894); 
             after(grammarAccess.getSOMETHINGAccess().getCIDTerminalRuleCall_3_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__SOMETHING__Group_10__0"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1895:1: rule__SOMETHING__Group_10__0 : rule__SOMETHING__Group_10__0__Impl rule__SOMETHING__Group_10__1 ;
    public final void rule__SOMETHING__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1899:1: ( rule__SOMETHING__Group_10__0__Impl rule__SOMETHING__Group_10__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1900:2: rule__SOMETHING__Group_10__0__Impl rule__SOMETHING__Group_10__1
            {
            pushFollow(FOLLOW_rule__SOMETHING__Group_10__0__Impl_in_rule__SOMETHING__Group_10__03927);
            rule__SOMETHING__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SOMETHING__Group_10__1_in_rule__SOMETHING__Group_10__03930);
            rule__SOMETHING__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SOMETHING__Group_10__0"


    // $ANTLR start "rule__SOMETHING__Group_10__0__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1907:1: rule__SOMETHING__Group_10__0__Impl : ( '..' ) ;
    public final void rule__SOMETHING__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1911:1: ( ( '..' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1912:1: ( '..' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1912:1: ( '..' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1913:1: '..'
            {
             before(grammarAccess.getSOMETHINGAccess().getFullStopFullStopKeyword_10_0()); 
            match(input,31,FOLLOW_31_in_rule__SOMETHING__Group_10__0__Impl3958); 
             after(grammarAccess.getSOMETHINGAccess().getFullStopFullStopKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SOMETHING__Group_10__0__Impl"


    // $ANTLR start "rule__SOMETHING__Group_10__1"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1926:1: rule__SOMETHING__Group_10__1 : rule__SOMETHING__Group_10__1__Impl rule__SOMETHING__Group_10__2 ;
    public final void rule__SOMETHING__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1930:1: ( rule__SOMETHING__Group_10__1__Impl rule__SOMETHING__Group_10__2 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1931:2: rule__SOMETHING__Group_10__1__Impl rule__SOMETHING__Group_10__2
            {
            pushFollow(FOLLOW_rule__SOMETHING__Group_10__1__Impl_in_rule__SOMETHING__Group_10__13989);
            rule__SOMETHING__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SOMETHING__Group_10__2_in_rule__SOMETHING__Group_10__13992);
            rule__SOMETHING__Group_10__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SOMETHING__Group_10__1"


    // $ANTLR start "rule__SOMETHING__Group_10__1__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1938:1: rule__SOMETHING__Group_10__1__Impl : ( ( '.' )* ) ;
    public final void rule__SOMETHING__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1942:1: ( ( ( '.' )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1943:1: ( ( '.' )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1943:1: ( ( '.' )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1944:1: ( '.' )*
            {
             before(grammarAccess.getSOMETHINGAccess().getFullStopKeyword_10_1()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1945:1: ( '.' )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==12) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1946:2: '.'
            	    {
            	    match(input,12,FOLLOW_12_in_rule__SOMETHING__Group_10__1__Impl4021); 

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getSOMETHINGAccess().getFullStopKeyword_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SOMETHING__Group_10__1__Impl"


    // $ANTLR start "rule__SOMETHING__Group_10__2"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1957:1: rule__SOMETHING__Group_10__2 : rule__SOMETHING__Group_10__2__Impl ;
    public final void rule__SOMETHING__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1961:1: ( rule__SOMETHING__Group_10__2__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1962:2: rule__SOMETHING__Group_10__2__Impl
            {
            pushFollow(FOLLOW_rule__SOMETHING__Group_10__2__Impl_in_rule__SOMETHING__Group_10__24054);
            rule__SOMETHING__Group_10__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SOMETHING__Group_10__2"


    // $ANTLR start "rule__SOMETHING__Group_10__2__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1968:1: rule__SOMETHING__Group_10__2__Impl : ( ruleWS ) ;
    public final void rule__SOMETHING__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1972:1: ( ( ruleWS ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1973:1: ( ruleWS )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1973:1: ( ruleWS )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1974:1: ruleWS
            {
             before(grammarAccess.getSOMETHINGAccess().getWSParserRuleCall_10_2()); 
            pushFollow(FOLLOW_ruleWS_in_rule__SOMETHING__Group_10__2__Impl4081);
            ruleWS();

            state._fsp--;

             after(grammarAccess.getSOMETHINGAccess().getWSParserRuleCall_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SOMETHING__Group_10__2__Impl"


    // $ANTLR start "rule__SignatureDeclaration__Group__0"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1992:1: rule__SignatureDeclaration__Group__0 : rule__SignatureDeclaration__Group__0__Impl rule__SignatureDeclaration__Group__1 ;
    public final void rule__SignatureDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1996:1: ( rule__SignatureDeclaration__Group__0__Impl rule__SignatureDeclaration__Group__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:1997:2: rule__SignatureDeclaration__Group__0__Impl rule__SignatureDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__SignatureDeclaration__Group__0__Impl_in_rule__SignatureDeclaration__Group__04117);
            rule__SignatureDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SignatureDeclaration__Group__1_in_rule__SignatureDeclaration__Group__04120);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2004:1: rule__SignatureDeclaration__Group__0__Impl : ( '%sig' ) ;
    public final void rule__SignatureDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2008:1: ( ( '%sig' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2009:1: ( '%sig' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2009:1: ( '%sig' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2010:1: '%sig'
            {
             before(grammarAccess.getSignatureDeclarationAccess().getSigKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__SignatureDeclaration__Group__0__Impl4148); 
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2023:1: rule__SignatureDeclaration__Group__1 : rule__SignatureDeclaration__Group__1__Impl rule__SignatureDeclaration__Group__2 ;
    public final void rule__SignatureDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2027:1: ( rule__SignatureDeclaration__Group__1__Impl rule__SignatureDeclaration__Group__2 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2028:2: rule__SignatureDeclaration__Group__1__Impl rule__SignatureDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__SignatureDeclaration__Group__1__Impl_in_rule__SignatureDeclaration__Group__14179);
            rule__SignatureDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SignatureDeclaration__Group__2_in_rule__SignatureDeclaration__Group__14182);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2035:1: rule__SignatureDeclaration__Group__1__Impl : ( ( ( ruleWS ) ) ( ( ruleWS )* ) ) ;
    public final void rule__SignatureDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2039:1: ( ( ( ( ruleWS ) ) ( ( ruleWS )* ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2040:1: ( ( ( ruleWS ) ) ( ( ruleWS )* ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2040:1: ( ( ( ruleWS ) ) ( ( ruleWS )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2041:1: ( ( ruleWS ) ) ( ( ruleWS )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2041:1: ( ( ruleWS ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2042:1: ( ruleWS )
            {
             before(grammarAccess.getSignatureDeclarationAccess().getWSParserRuleCall_1()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2043:1: ( ruleWS )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2043:3: ruleWS
            {
            pushFollow(FOLLOW_ruleWS_in_rule__SignatureDeclaration__Group__1__Impl4212);
            ruleWS();

            state._fsp--;


            }

             after(grammarAccess.getSignatureDeclarationAccess().getWSParserRuleCall_1()); 

            }

            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2046:1: ( ( ruleWS )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2047:1: ( ruleWS )*
            {
             before(grammarAccess.getSignatureDeclarationAccess().getWSParserRuleCall_1()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2048:1: ( ruleWS )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=RULE_SP && LA24_0<=RULE_SL_COMMENT)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2048:3: ruleWS
            	    {
            	    pushFollow(FOLLOW_ruleWS_in_rule__SignatureDeclaration__Group__1__Impl4225);
            	    ruleWS();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getSignatureDeclarationAccess().getWSParserRuleCall_1()); 

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
    // $ANTLR end "rule__SignatureDeclaration__Group__1__Impl"


    // $ANTLR start "rule__SignatureDeclaration__Group__2"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2059:1: rule__SignatureDeclaration__Group__2 : rule__SignatureDeclaration__Group__2__Impl rule__SignatureDeclaration__Group__3 ;
    public final void rule__SignatureDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2063:1: ( rule__SignatureDeclaration__Group__2__Impl rule__SignatureDeclaration__Group__3 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2064:2: rule__SignatureDeclaration__Group__2__Impl rule__SignatureDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__SignatureDeclaration__Group__2__Impl_in_rule__SignatureDeclaration__Group__24258);
            rule__SignatureDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SignatureDeclaration__Group__3_in_rule__SignatureDeclaration__Group__24261);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2071:1: rule__SignatureDeclaration__Group__2__Impl : ( ( rule__SignatureDeclaration__SigNameAssignment_2 ) ) ;
    public final void rule__SignatureDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2075:1: ( ( ( rule__SignatureDeclaration__SigNameAssignment_2 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2076:1: ( ( rule__SignatureDeclaration__SigNameAssignment_2 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2076:1: ( ( rule__SignatureDeclaration__SigNameAssignment_2 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2077:1: ( rule__SignatureDeclaration__SigNameAssignment_2 )
            {
             before(grammarAccess.getSignatureDeclarationAccess().getSigNameAssignment_2()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2078:1: ( rule__SignatureDeclaration__SigNameAssignment_2 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2078:2: rule__SignatureDeclaration__SigNameAssignment_2
            {
            pushFollow(FOLLOW_rule__SignatureDeclaration__SigNameAssignment_2_in_rule__SignatureDeclaration__Group__2__Impl4288);
            rule__SignatureDeclaration__SigNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSignatureDeclarationAccess().getSigNameAssignment_2()); 

            }


            }

        }
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2088:1: rule__SignatureDeclaration__Group__3 : rule__SignatureDeclaration__Group__3__Impl rule__SignatureDeclaration__Group__4 ;
    public final void rule__SignatureDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2092:1: ( rule__SignatureDeclaration__Group__3__Impl rule__SignatureDeclaration__Group__4 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2093:2: rule__SignatureDeclaration__Group__3__Impl rule__SignatureDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__SignatureDeclaration__Group__3__Impl_in_rule__SignatureDeclaration__Group__34318);
            rule__SignatureDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SignatureDeclaration__Group__4_in_rule__SignatureDeclaration__Group__34321);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2100:1: rule__SignatureDeclaration__Group__3__Impl : ( ( ruleWS )* ) ;
    public final void rule__SignatureDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2104:1: ( ( ( ruleWS )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2105:1: ( ( ruleWS )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2105:1: ( ( ruleWS )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2106:1: ( ruleWS )*
            {
             before(grammarAccess.getSignatureDeclarationAccess().getWSParserRuleCall_3()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2107:1: ( ruleWS )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=RULE_SP && LA25_0<=RULE_SL_COMMENT)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2107:3: ruleWS
            	    {
            	    pushFollow(FOLLOW_ruleWS_in_rule__SignatureDeclaration__Group__3__Impl4349);
            	    ruleWS();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2117:1: rule__SignatureDeclaration__Group__4 : rule__SignatureDeclaration__Group__4__Impl rule__SignatureDeclaration__Group__5 ;
    public final void rule__SignatureDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2121:1: ( rule__SignatureDeclaration__Group__4__Impl rule__SignatureDeclaration__Group__5 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2122:2: rule__SignatureDeclaration__Group__4__Impl rule__SignatureDeclaration__Group__5
            {
            pushFollow(FOLLOW_rule__SignatureDeclaration__Group__4__Impl_in_rule__SignatureDeclaration__Group__44380);
            rule__SignatureDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SignatureDeclaration__Group__5_in_rule__SignatureDeclaration__Group__44383);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2129:1: rule__SignatureDeclaration__Group__4__Impl : ( '=' ) ;
    public final void rule__SignatureDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2133:1: ( ( '=' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2134:1: ( '=' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2134:1: ( '=' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2135:1: '='
            {
             before(grammarAccess.getSignatureDeclarationAccess().getEqualsSignKeyword_4()); 
            match(input,14,FOLLOW_14_in_rule__SignatureDeclaration__Group__4__Impl4411); 
             after(grammarAccess.getSignatureDeclarationAccess().getEqualsSignKeyword_4()); 

            }


            }

        }
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2148:1: rule__SignatureDeclaration__Group__5 : rule__SignatureDeclaration__Group__5__Impl rule__SignatureDeclaration__Group__6 ;
    public final void rule__SignatureDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2152:1: ( rule__SignatureDeclaration__Group__5__Impl rule__SignatureDeclaration__Group__6 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2153:2: rule__SignatureDeclaration__Group__5__Impl rule__SignatureDeclaration__Group__6
            {
            pushFollow(FOLLOW_rule__SignatureDeclaration__Group__5__Impl_in_rule__SignatureDeclaration__Group__54442);
            rule__SignatureDeclaration__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SignatureDeclaration__Group__6_in_rule__SignatureDeclaration__Group__54445);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2160:1: rule__SignatureDeclaration__Group__5__Impl : ( ( ruleWS )* ) ;
    public final void rule__SignatureDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2164:1: ( ( ( ruleWS )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2165:1: ( ( ruleWS )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2165:1: ( ( ruleWS )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2166:1: ( ruleWS )*
            {
             before(grammarAccess.getSignatureDeclarationAccess().getWSParserRuleCall_5()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2167:1: ( ruleWS )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=RULE_SP && LA26_0<=RULE_SL_COMMENT)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2167:3: ruleWS
            	    {
            	    pushFollow(FOLLOW_ruleWS_in_rule__SignatureDeclaration__Group__5__Impl4473);
            	    ruleWS();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2177:1: rule__SignatureDeclaration__Group__6 : rule__SignatureDeclaration__Group__6__Impl rule__SignatureDeclaration__Group__7 ;
    public final void rule__SignatureDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2181:1: ( rule__SignatureDeclaration__Group__6__Impl rule__SignatureDeclaration__Group__7 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2182:2: rule__SignatureDeclaration__Group__6__Impl rule__SignatureDeclaration__Group__7
            {
            pushFollow(FOLLOW_rule__SignatureDeclaration__Group__6__Impl_in_rule__SignatureDeclaration__Group__64504);
            rule__SignatureDeclaration__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SignatureDeclaration__Group__7_in_rule__SignatureDeclaration__Group__64507);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2189:1: rule__SignatureDeclaration__Group__6__Impl : ( '{' ) ;
    public final void rule__SignatureDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2193:1: ( ( '{' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2194:1: ( '{' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2194:1: ( '{' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2195:1: '{'
            {
             before(grammarAccess.getSignatureDeclarationAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,33,FOLLOW_33_in_rule__SignatureDeclaration__Group__6__Impl4535); 
             after(grammarAccess.getSignatureDeclarationAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2208:1: rule__SignatureDeclaration__Group__7 : rule__SignatureDeclaration__Group__7__Impl rule__SignatureDeclaration__Group__8 ;
    public final void rule__SignatureDeclaration__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2212:1: ( rule__SignatureDeclaration__Group__7__Impl rule__SignatureDeclaration__Group__8 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2213:2: rule__SignatureDeclaration__Group__7__Impl rule__SignatureDeclaration__Group__8
            {
            pushFollow(FOLLOW_rule__SignatureDeclaration__Group__7__Impl_in_rule__SignatureDeclaration__Group__74566);
            rule__SignatureDeclaration__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SignatureDeclaration__Group__8_in_rule__SignatureDeclaration__Group__74569);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2220:1: rule__SignatureDeclaration__Group__7__Impl : ( ( rule__SignatureDeclaration__SigDefinitionsAssignment_7 )* ) ;
    public final void rule__SignatureDeclaration__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2224:1: ( ( ( rule__SignatureDeclaration__SigDefinitionsAssignment_7 )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2225:1: ( ( rule__SignatureDeclaration__SigDefinitionsAssignment_7 )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2225:1: ( ( rule__SignatureDeclaration__SigDefinitionsAssignment_7 )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2226:1: ( rule__SignatureDeclaration__SigDefinitionsAssignment_7 )*
            {
             before(grammarAccess.getSignatureDeclarationAccess().getSigDefinitionsAssignment_7()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2227:1: ( rule__SignatureDeclaration__SigDefinitionsAssignment_7 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=RULE_SP && LA27_0<=RULE_INT)||(LA27_0>=20 && LA27_0<=25)||LA27_0==31||(LA27_0>=35 && LA27_0<=36)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2227:2: rule__SignatureDeclaration__SigDefinitionsAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__SignatureDeclaration__SigDefinitionsAssignment_7_in_rule__SignatureDeclaration__Group__7__Impl4596);
            	    rule__SignatureDeclaration__SigDefinitionsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getSignatureDeclarationAccess().getSigDefinitionsAssignment_7()); 

            }


            }

        }
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2237:1: rule__SignatureDeclaration__Group__8 : rule__SignatureDeclaration__Group__8__Impl rule__SignatureDeclaration__Group__9 ;
    public final void rule__SignatureDeclaration__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2241:1: ( rule__SignatureDeclaration__Group__8__Impl rule__SignatureDeclaration__Group__9 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2242:2: rule__SignatureDeclaration__Group__8__Impl rule__SignatureDeclaration__Group__9
            {
            pushFollow(FOLLOW_rule__SignatureDeclaration__Group__8__Impl_in_rule__SignatureDeclaration__Group__84627);
            rule__SignatureDeclaration__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SignatureDeclaration__Group__9_in_rule__SignatureDeclaration__Group__84630);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2249:1: rule__SignatureDeclaration__Group__8__Impl : ( '}' ) ;
    public final void rule__SignatureDeclaration__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2253:1: ( ( '}' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2254:1: ( '}' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2254:1: ( '}' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2255:1: '}'
            {
             before(grammarAccess.getSignatureDeclarationAccess().getRightCurlyBracketKeyword_8()); 
            match(input,34,FOLLOW_34_in_rule__SignatureDeclaration__Group__8__Impl4658); 
             after(grammarAccess.getSignatureDeclarationAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2268:1: rule__SignatureDeclaration__Group__9 : rule__SignatureDeclaration__Group__9__Impl rule__SignatureDeclaration__Group__10 ;
    public final void rule__SignatureDeclaration__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2272:1: ( rule__SignatureDeclaration__Group__9__Impl rule__SignatureDeclaration__Group__10 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2273:2: rule__SignatureDeclaration__Group__9__Impl rule__SignatureDeclaration__Group__10
            {
            pushFollow(FOLLOW_rule__SignatureDeclaration__Group__9__Impl_in_rule__SignatureDeclaration__Group__94689);
            rule__SignatureDeclaration__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SignatureDeclaration__Group__10_in_rule__SignatureDeclaration__Group__94692);
            rule__SignatureDeclaration__Group__10();

            state._fsp--;


            }

        }
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2280:1: rule__SignatureDeclaration__Group__9__Impl : ( ( ruleWS )* ) ;
    public final void rule__SignatureDeclaration__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2284:1: ( ( ( ruleWS )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2285:1: ( ( ruleWS )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2285:1: ( ( ruleWS )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2286:1: ( ruleWS )*
            {
             before(grammarAccess.getSignatureDeclarationAccess().getWSParserRuleCall_9()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2287:1: ( ruleWS )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=RULE_SP && LA28_0<=RULE_SL_COMMENT)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2287:3: ruleWS
            	    {
            	    pushFollow(FOLLOW_ruleWS_in_rule__SignatureDeclaration__Group__9__Impl4720);
            	    ruleWS();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getSignatureDeclarationAccess().getWSParserRuleCall_9()); 

            }


            }

        }
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


    // $ANTLR start "rule__SignatureDeclaration__Group__10"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2297:1: rule__SignatureDeclaration__Group__10 : rule__SignatureDeclaration__Group__10__Impl rule__SignatureDeclaration__Group__11 ;
    public final void rule__SignatureDeclaration__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2301:1: ( rule__SignatureDeclaration__Group__10__Impl rule__SignatureDeclaration__Group__11 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2302:2: rule__SignatureDeclaration__Group__10__Impl rule__SignatureDeclaration__Group__11
            {
            pushFollow(FOLLOW_rule__SignatureDeclaration__Group__10__Impl_in_rule__SignatureDeclaration__Group__104751);
            rule__SignatureDeclaration__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SignatureDeclaration__Group__11_in_rule__SignatureDeclaration__Group__104754);
            rule__SignatureDeclaration__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignatureDeclaration__Group__10"


    // $ANTLR start "rule__SignatureDeclaration__Group__10__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2309:1: rule__SignatureDeclaration__Group__10__Impl : ( '.' ) ;
    public final void rule__SignatureDeclaration__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2313:1: ( ( '.' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2314:1: ( '.' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2314:1: ( '.' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2315:1: '.'
            {
             before(grammarAccess.getSignatureDeclarationAccess().getFullStopKeyword_10()); 
            match(input,12,FOLLOW_12_in_rule__SignatureDeclaration__Group__10__Impl4782); 
             after(grammarAccess.getSignatureDeclarationAccess().getFullStopKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignatureDeclaration__Group__10__Impl"


    // $ANTLR start "rule__SignatureDeclaration__Group__11"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2328:1: rule__SignatureDeclaration__Group__11 : rule__SignatureDeclaration__Group__11__Impl ;
    public final void rule__SignatureDeclaration__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2332:1: ( rule__SignatureDeclaration__Group__11__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2333:2: rule__SignatureDeclaration__Group__11__Impl
            {
            pushFollow(FOLLOW_rule__SignatureDeclaration__Group__11__Impl_in_rule__SignatureDeclaration__Group__114813);
            rule__SignatureDeclaration__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignatureDeclaration__Group__11"


    // $ANTLR start "rule__SignatureDeclaration__Group__11__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2339:1: rule__SignatureDeclaration__Group__11__Impl : ( ruleWS ) ;
    public final void rule__SignatureDeclaration__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2343:1: ( ( ruleWS ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2344:1: ( ruleWS )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2344:1: ( ruleWS )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2345:1: ruleWS
            {
             before(grammarAccess.getSignatureDeclarationAccess().getWSParserRuleCall_11()); 
            pushFollow(FOLLOW_ruleWS_in_rule__SignatureDeclaration__Group__11__Impl4840);
            ruleWS();

            state._fsp--;

             after(grammarAccess.getSignatureDeclarationAccess().getWSParserRuleCall_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignatureDeclaration__Group__11__Impl"


    // $ANTLR start "rule__SigDefinitions__Group_0__0"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2380:1: rule__SigDefinitions__Group_0__0 : rule__SigDefinitions__Group_0__0__Impl rule__SigDefinitions__Group_0__1 ;
    public final void rule__SigDefinitions__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2384:1: ( rule__SigDefinitions__Group_0__0__Impl rule__SigDefinitions__Group_0__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2385:2: rule__SigDefinitions__Group_0__0__Impl rule__SigDefinitions__Group_0__1
            {
            pushFollow(FOLLOW_rule__SigDefinitions__Group_0__0__Impl_in_rule__SigDefinitions__Group_0__04893);
            rule__SigDefinitions__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SigDefinitions__Group_0__1_in_rule__SigDefinitions__Group_0__04896);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2392:1: rule__SigDefinitions__Group_0__0__Impl : ( ( rule__SigDefinitions__SymbNameAssignment_0_0 ) ) ;
    public final void rule__SigDefinitions__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2396:1: ( ( ( rule__SigDefinitions__SymbNameAssignment_0_0 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2397:1: ( ( rule__SigDefinitions__SymbNameAssignment_0_0 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2397:1: ( ( rule__SigDefinitions__SymbNameAssignment_0_0 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2398:1: ( rule__SigDefinitions__SymbNameAssignment_0_0 )
            {
             before(grammarAccess.getSigDefinitionsAccess().getSymbNameAssignment_0_0()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2399:1: ( rule__SigDefinitions__SymbNameAssignment_0_0 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2399:2: rule__SigDefinitions__SymbNameAssignment_0_0
            {
            pushFollow(FOLLOW_rule__SigDefinitions__SymbNameAssignment_0_0_in_rule__SigDefinitions__Group_0__0__Impl4923);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2409:1: rule__SigDefinitions__Group_0__1 : rule__SigDefinitions__Group_0__1__Impl rule__SigDefinitions__Group_0__2 ;
    public final void rule__SigDefinitions__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2413:1: ( rule__SigDefinitions__Group_0__1__Impl rule__SigDefinitions__Group_0__2 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2414:2: rule__SigDefinitions__Group_0__1__Impl rule__SigDefinitions__Group_0__2
            {
            pushFollow(FOLLOW_rule__SigDefinitions__Group_0__1__Impl_in_rule__SigDefinitions__Group_0__14953);
            rule__SigDefinitions__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SigDefinitions__Group_0__2_in_rule__SigDefinitions__Group_0__14956);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2421:1: rule__SigDefinitions__Group_0__1__Impl : ( ( ruleWS )* ) ;
    public final void rule__SigDefinitions__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2425:1: ( ( ( ruleWS )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2426:1: ( ( ruleWS )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2426:1: ( ( ruleWS )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2427:1: ( ruleWS )*
            {
             before(grammarAccess.getSigDefinitionsAccess().getWSParserRuleCall_0_1()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2428:1: ( ruleWS )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=RULE_SP && LA29_0<=RULE_SL_COMMENT)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2428:3: ruleWS
            	    {
            	    pushFollow(FOLLOW_ruleWS_in_rule__SigDefinitions__Group_0__1__Impl4984);
            	    ruleWS();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getSigDefinitionsAccess().getWSParserRuleCall_0_1()); 

            }


            }

        }
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2438:1: rule__SigDefinitions__Group_0__2 : rule__SigDefinitions__Group_0__2__Impl rule__SigDefinitions__Group_0__3 ;
    public final void rule__SigDefinitions__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2442:1: ( rule__SigDefinitions__Group_0__2__Impl rule__SigDefinitions__Group_0__3 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2443:2: rule__SigDefinitions__Group_0__2__Impl rule__SigDefinitions__Group_0__3
            {
            pushFollow(FOLLOW_rule__SigDefinitions__Group_0__2__Impl_in_rule__SigDefinitions__Group_0__25015);
            rule__SigDefinitions__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SigDefinitions__Group_0__3_in_rule__SigDefinitions__Group_0__25018);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2450:1: rule__SigDefinitions__Group_0__2__Impl : ( ( rule__SigDefinitions__Alternatives_0_2 ) ) ;
    public final void rule__SigDefinitions__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2454:1: ( ( ( rule__SigDefinitions__Alternatives_0_2 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2455:1: ( ( rule__SigDefinitions__Alternatives_0_2 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2455:1: ( ( rule__SigDefinitions__Alternatives_0_2 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2456:1: ( rule__SigDefinitions__Alternatives_0_2 )
            {
             before(grammarAccess.getSigDefinitionsAccess().getAlternatives_0_2()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2457:1: ( rule__SigDefinitions__Alternatives_0_2 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2457:2: rule__SigDefinitions__Alternatives_0_2
            {
            pushFollow(FOLLOW_rule__SigDefinitions__Alternatives_0_2_in_rule__SigDefinitions__Group_0__2__Impl5045);
            rule__SigDefinitions__Alternatives_0_2();

            state._fsp--;


            }

             after(grammarAccess.getSigDefinitionsAccess().getAlternatives_0_2()); 

            }


            }

        }
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2467:1: rule__SigDefinitions__Group_0__3 : rule__SigDefinitions__Group_0__3__Impl rule__SigDefinitions__Group_0__4 ;
    public final void rule__SigDefinitions__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2471:1: ( rule__SigDefinitions__Group_0__3__Impl rule__SigDefinitions__Group_0__4 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2472:2: rule__SigDefinitions__Group_0__3__Impl rule__SigDefinitions__Group_0__4
            {
            pushFollow(FOLLOW_rule__SigDefinitions__Group_0__3__Impl_in_rule__SigDefinitions__Group_0__35075);
            rule__SigDefinitions__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SigDefinitions__Group_0__4_in_rule__SigDefinitions__Group_0__35078);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2479:1: rule__SigDefinitions__Group_0__3__Impl : ( ( ruleSOMETHING )* ) ;
    public final void rule__SigDefinitions__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2483:1: ( ( ( ruleSOMETHING )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2484:1: ( ( ruleSOMETHING )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2484:1: ( ( ruleSOMETHING )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2485:1: ( ruleSOMETHING )*
            {
             before(grammarAccess.getSigDefinitionsAccess().getSOMETHINGParserRuleCall_0_3()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2486:1: ( ruleSOMETHING )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==12) ) {
                    int LA30_1 = input.LA(2);

                    if ( (LA30_1==RULE_CID) ) {
                        alt30=1;
                    }


                }
                else if ( ((LA30_0>=RULE_SP && LA30_0<=RULE_INT)||(LA30_0>=13 && LA30_0<=18)||LA30_0==31) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2486:3: ruleSOMETHING
            	    {
            	    pushFollow(FOLLOW_ruleSOMETHING_in_rule__SigDefinitions__Group_0__3__Impl5106);
            	    ruleSOMETHING();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getSigDefinitionsAccess().getSOMETHINGParserRuleCall_0_3()); 

            }


            }

        }
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2496:1: rule__SigDefinitions__Group_0__4 : rule__SigDefinitions__Group_0__4__Impl rule__SigDefinitions__Group_0__5 ;
    public final void rule__SigDefinitions__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2500:1: ( rule__SigDefinitions__Group_0__4__Impl rule__SigDefinitions__Group_0__5 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2501:2: rule__SigDefinitions__Group_0__4__Impl rule__SigDefinitions__Group_0__5
            {
            pushFollow(FOLLOW_rule__SigDefinitions__Group_0__4__Impl_in_rule__SigDefinitions__Group_0__45137);
            rule__SigDefinitions__Group_0__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SigDefinitions__Group_0__5_in_rule__SigDefinitions__Group_0__45140);
            rule__SigDefinitions__Group_0__5();

            state._fsp--;


            }

        }
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2508:1: rule__SigDefinitions__Group_0__4__Impl : ( '.' ) ;
    public final void rule__SigDefinitions__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2512:1: ( ( '.' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2513:1: ( '.' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2513:1: ( '.' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2514:1: '.'
            {
             before(grammarAccess.getSigDefinitionsAccess().getFullStopKeyword_0_4()); 
            match(input,12,FOLLOW_12_in_rule__SigDefinitions__Group_0__4__Impl5168); 
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


    // $ANTLR start "rule__SigDefinitions__Group_0__5"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2527:1: rule__SigDefinitions__Group_0__5 : rule__SigDefinitions__Group_0__5__Impl ;
    public final void rule__SigDefinitions__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2531:1: ( rule__SigDefinitions__Group_0__5__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2532:2: rule__SigDefinitions__Group_0__5__Impl
            {
            pushFollow(FOLLOW_rule__SigDefinitions__Group_0__5__Impl_in_rule__SigDefinitions__Group_0__55199);
            rule__SigDefinitions__Group_0__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SigDefinitions__Group_0__5"


    // $ANTLR start "rule__SigDefinitions__Group_0__5__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2538:1: rule__SigDefinitions__Group_0__5__Impl : ( ruleWS ) ;
    public final void rule__SigDefinitions__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2542:1: ( ( ruleWS ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2543:1: ( ruleWS )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2543:1: ( ruleWS )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2544:1: ruleWS
            {
             before(grammarAccess.getSigDefinitionsAccess().getWSParserRuleCall_0_5()); 
            pushFollow(FOLLOW_ruleWS_in_rule__SigDefinitions__Group_0__5__Impl5226);
            ruleWS();

            state._fsp--;

             after(grammarAccess.getSigDefinitionsAccess().getWSParserRuleCall_0_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SigDefinitions__Group_0__5__Impl"


    // $ANTLR start "rule__SigDefinitions__Group_1__0"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2567:1: rule__SigDefinitions__Group_1__0 : rule__SigDefinitions__Group_1__0__Impl rule__SigDefinitions__Group_1__1 ;
    public final void rule__SigDefinitions__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2571:1: ( rule__SigDefinitions__Group_1__0__Impl rule__SigDefinitions__Group_1__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2572:2: rule__SigDefinitions__Group_1__0__Impl rule__SigDefinitions__Group_1__1
            {
            pushFollow(FOLLOW_rule__SigDefinitions__Group_1__0__Impl_in_rule__SigDefinitions__Group_1__05267);
            rule__SigDefinitions__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SigDefinitions__Group_1__1_in_rule__SigDefinitions__Group_1__05270);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2579:1: rule__SigDefinitions__Group_1__0__Impl : ( '%include' ) ;
    public final void rule__SigDefinitions__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2583:1: ( ( '%include' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2584:1: ( '%include' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2584:1: ( '%include' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2585:1: '%include'
            {
             before(grammarAccess.getSigDefinitionsAccess().getIncludeKeyword_1_0()); 
            match(input,35,FOLLOW_35_in_rule__SigDefinitions__Group_1__0__Impl5298); 
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2598:1: rule__SigDefinitions__Group_1__1 : rule__SigDefinitions__Group_1__1__Impl rule__SigDefinitions__Group_1__2 ;
    public final void rule__SigDefinitions__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2602:1: ( rule__SigDefinitions__Group_1__1__Impl rule__SigDefinitions__Group_1__2 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2603:2: rule__SigDefinitions__Group_1__1__Impl rule__SigDefinitions__Group_1__2
            {
            pushFollow(FOLLOW_rule__SigDefinitions__Group_1__1__Impl_in_rule__SigDefinitions__Group_1__15329);
            rule__SigDefinitions__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SigDefinitions__Group_1__2_in_rule__SigDefinitions__Group_1__15332);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2610:1: rule__SigDefinitions__Group_1__1__Impl : ( ( ( ruleWS ) ) ( ( ruleWS )* ) ) ;
    public final void rule__SigDefinitions__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2614:1: ( ( ( ( ruleWS ) ) ( ( ruleWS )* ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2615:1: ( ( ( ruleWS ) ) ( ( ruleWS )* ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2615:1: ( ( ( ruleWS ) ) ( ( ruleWS )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2616:1: ( ( ruleWS ) ) ( ( ruleWS )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2616:1: ( ( ruleWS ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2617:1: ( ruleWS )
            {
             before(grammarAccess.getSigDefinitionsAccess().getWSParserRuleCall_1_1()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2618:1: ( ruleWS )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2618:3: ruleWS
            {
            pushFollow(FOLLOW_ruleWS_in_rule__SigDefinitions__Group_1__1__Impl5362);
            ruleWS();

            state._fsp--;


            }

             after(grammarAccess.getSigDefinitionsAccess().getWSParserRuleCall_1_1()); 

            }

            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2621:1: ( ( ruleWS )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2622:1: ( ruleWS )*
            {
             before(grammarAccess.getSigDefinitionsAccess().getWSParserRuleCall_1_1()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2623:1: ( ruleWS )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=RULE_SP && LA31_0<=RULE_SL_COMMENT)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2623:3: ruleWS
            	    {
            	    pushFollow(FOLLOW_ruleWS_in_rule__SigDefinitions__Group_1__1__Impl5375);
            	    ruleWS();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getSigDefinitionsAccess().getWSParserRuleCall_1_1()); 

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
    // $ANTLR end "rule__SigDefinitions__Group_1__1__Impl"


    // $ANTLR start "rule__SigDefinitions__Group_1__2"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2634:1: rule__SigDefinitions__Group_1__2 : rule__SigDefinitions__Group_1__2__Impl rule__SigDefinitions__Group_1__3 ;
    public final void rule__SigDefinitions__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2638:1: ( rule__SigDefinitions__Group_1__2__Impl rule__SigDefinitions__Group_1__3 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2639:2: rule__SigDefinitions__Group_1__2__Impl rule__SigDefinitions__Group_1__3
            {
            pushFollow(FOLLOW_rule__SigDefinitions__Group_1__2__Impl_in_rule__SigDefinitions__Group_1__25408);
            rule__SigDefinitions__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SigDefinitions__Group_1__3_in_rule__SigDefinitions__Group_1__25411);
            rule__SigDefinitions__Group_1__3();

            state._fsp--;


            }

        }
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2646:1: rule__SigDefinitions__Group_1__2__Impl : ( ( rule__SigDefinitions__NamespaceAssignment_1_2 ) ) ;
    public final void rule__SigDefinitions__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2650:1: ( ( ( rule__SigDefinitions__NamespaceAssignment_1_2 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2651:1: ( ( rule__SigDefinitions__NamespaceAssignment_1_2 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2651:1: ( ( rule__SigDefinitions__NamespaceAssignment_1_2 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2652:1: ( rule__SigDefinitions__NamespaceAssignment_1_2 )
            {
             before(grammarAccess.getSigDefinitionsAccess().getNamespaceAssignment_1_2()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2653:1: ( rule__SigDefinitions__NamespaceAssignment_1_2 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2653:2: rule__SigDefinitions__NamespaceAssignment_1_2
            {
            pushFollow(FOLLOW_rule__SigDefinitions__NamespaceAssignment_1_2_in_rule__SigDefinitions__Group_1__2__Impl5438);
            rule__SigDefinitions__NamespaceAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getSigDefinitionsAccess().getNamespaceAssignment_1_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__SigDefinitions__Group_1__3"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2663:1: rule__SigDefinitions__Group_1__3 : rule__SigDefinitions__Group_1__3__Impl rule__SigDefinitions__Group_1__4 ;
    public final void rule__SigDefinitions__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2667:1: ( rule__SigDefinitions__Group_1__3__Impl rule__SigDefinitions__Group_1__4 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2668:2: rule__SigDefinitions__Group_1__3__Impl rule__SigDefinitions__Group_1__4
            {
            pushFollow(FOLLOW_rule__SigDefinitions__Group_1__3__Impl_in_rule__SigDefinitions__Group_1__35468);
            rule__SigDefinitions__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SigDefinitions__Group_1__4_in_rule__SigDefinitions__Group_1__35471);
            rule__SigDefinitions__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SigDefinitions__Group_1__3"


    // $ANTLR start "rule__SigDefinitions__Group_1__3__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2675:1: rule__SigDefinitions__Group_1__3__Impl : ( ( rule__SigDefinitions__Group_1_3__0 )? ) ;
    public final void rule__SigDefinitions__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2679:1: ( ( ( rule__SigDefinitions__Group_1_3__0 )? ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2680:1: ( ( rule__SigDefinitions__Group_1_3__0 )? )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2680:1: ( ( rule__SigDefinitions__Group_1_3__0 )? )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2681:1: ( rule__SigDefinitions__Group_1_3__0 )?
            {
             before(grammarAccess.getSigDefinitionsAccess().getGroup_1_3()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2682:1: ( rule__SigDefinitions__Group_1_3__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=RULE_SP && LA32_0<=RULE_SL_COMMENT)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2682:2: rule__SigDefinitions__Group_1_3__0
                    {
                    pushFollow(FOLLOW_rule__SigDefinitions__Group_1_3__0_in_rule__SigDefinitions__Group_1__3__Impl5498);
                    rule__SigDefinitions__Group_1_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSigDefinitionsAccess().getGroup_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SigDefinitions__Group_1__3__Impl"


    // $ANTLR start "rule__SigDefinitions__Group_1__4"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2692:1: rule__SigDefinitions__Group_1__4 : rule__SigDefinitions__Group_1__4__Impl rule__SigDefinitions__Group_1__5 ;
    public final void rule__SigDefinitions__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2696:1: ( rule__SigDefinitions__Group_1__4__Impl rule__SigDefinitions__Group_1__5 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2697:2: rule__SigDefinitions__Group_1__4__Impl rule__SigDefinitions__Group_1__5
            {
            pushFollow(FOLLOW_rule__SigDefinitions__Group_1__4__Impl_in_rule__SigDefinitions__Group_1__45529);
            rule__SigDefinitions__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SigDefinitions__Group_1__5_in_rule__SigDefinitions__Group_1__45532);
            rule__SigDefinitions__Group_1__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SigDefinitions__Group_1__4"


    // $ANTLR start "rule__SigDefinitions__Group_1__4__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2704:1: rule__SigDefinitions__Group_1__4__Impl : ( '.' ) ;
    public final void rule__SigDefinitions__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2708:1: ( ( '.' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2709:1: ( '.' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2709:1: ( '.' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2710:1: '.'
            {
             before(grammarAccess.getSigDefinitionsAccess().getFullStopKeyword_1_4()); 
            match(input,12,FOLLOW_12_in_rule__SigDefinitions__Group_1__4__Impl5560); 
             after(grammarAccess.getSigDefinitionsAccess().getFullStopKeyword_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SigDefinitions__Group_1__4__Impl"


    // $ANTLR start "rule__SigDefinitions__Group_1__5"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2723:1: rule__SigDefinitions__Group_1__5 : rule__SigDefinitions__Group_1__5__Impl ;
    public final void rule__SigDefinitions__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2727:1: ( rule__SigDefinitions__Group_1__5__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2728:2: rule__SigDefinitions__Group_1__5__Impl
            {
            pushFollow(FOLLOW_rule__SigDefinitions__Group_1__5__Impl_in_rule__SigDefinitions__Group_1__55591);
            rule__SigDefinitions__Group_1__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SigDefinitions__Group_1__5"


    // $ANTLR start "rule__SigDefinitions__Group_1__5__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2734:1: rule__SigDefinitions__Group_1__5__Impl : ( ruleWS ) ;
    public final void rule__SigDefinitions__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2738:1: ( ( ruleWS ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2739:1: ( ruleWS )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2739:1: ( ruleWS )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2740:1: ruleWS
            {
             before(grammarAccess.getSigDefinitionsAccess().getWSParserRuleCall_1_5()); 
            pushFollow(FOLLOW_ruleWS_in_rule__SigDefinitions__Group_1__5__Impl5618);
            ruleWS();

            state._fsp--;

             after(grammarAccess.getSigDefinitionsAccess().getWSParserRuleCall_1_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SigDefinitions__Group_1__5__Impl"


    // $ANTLR start "rule__SigDefinitions__Group_1_3__0"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2763:1: rule__SigDefinitions__Group_1_3__0 : rule__SigDefinitions__Group_1_3__0__Impl rule__SigDefinitions__Group_1_3__1 ;
    public final void rule__SigDefinitions__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2767:1: ( rule__SigDefinitions__Group_1_3__0__Impl rule__SigDefinitions__Group_1_3__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2768:2: rule__SigDefinitions__Group_1_3__0__Impl rule__SigDefinitions__Group_1_3__1
            {
            pushFollow(FOLLOW_rule__SigDefinitions__Group_1_3__0__Impl_in_rule__SigDefinitions__Group_1_3__05659);
            rule__SigDefinitions__Group_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SigDefinitions__Group_1_3__1_in_rule__SigDefinitions__Group_1_3__05662);
            rule__SigDefinitions__Group_1_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SigDefinitions__Group_1_3__0"


    // $ANTLR start "rule__SigDefinitions__Group_1_3__0__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2775:1: rule__SigDefinitions__Group_1_3__0__Impl : ( ( ( ruleWS ) ) ( ( ruleWS )* ) ) ;
    public final void rule__SigDefinitions__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2779:1: ( ( ( ( ruleWS ) ) ( ( ruleWS )* ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2780:1: ( ( ( ruleWS ) ) ( ( ruleWS )* ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2780:1: ( ( ( ruleWS ) ) ( ( ruleWS )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2781:1: ( ( ruleWS ) ) ( ( ruleWS )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2781:1: ( ( ruleWS ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2782:1: ( ruleWS )
            {
             before(grammarAccess.getSigDefinitionsAccess().getWSParserRuleCall_1_3_0()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2783:1: ( ruleWS )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2783:3: ruleWS
            {
            pushFollow(FOLLOW_ruleWS_in_rule__SigDefinitions__Group_1_3__0__Impl5692);
            ruleWS();

            state._fsp--;


            }

             after(grammarAccess.getSigDefinitionsAccess().getWSParserRuleCall_1_3_0()); 

            }

            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2786:1: ( ( ruleWS )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2787:1: ( ruleWS )*
            {
             before(grammarAccess.getSigDefinitionsAccess().getWSParserRuleCall_1_3_0()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2788:1: ( ruleWS )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=RULE_SP && LA33_0<=RULE_SL_COMMENT)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2788:3: ruleWS
            	    {
            	    pushFollow(FOLLOW_ruleWS_in_rule__SigDefinitions__Group_1_3__0__Impl5705);
            	    ruleWS();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getSigDefinitionsAccess().getWSParserRuleCall_1_3_0()); 

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
    // $ANTLR end "rule__SigDefinitions__Group_1_3__0__Impl"


    // $ANTLR start "rule__SigDefinitions__Group_1_3__1"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2799:1: rule__SigDefinitions__Group_1_3__1 : rule__SigDefinitions__Group_1_3__1__Impl ;
    public final void rule__SigDefinitions__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2803:1: ( rule__SigDefinitions__Group_1_3__1__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2804:2: rule__SigDefinitions__Group_1_3__1__Impl
            {
            pushFollow(FOLLOW_rule__SigDefinitions__Group_1_3__1__Impl_in_rule__SigDefinitions__Group_1_3__15738);
            rule__SigDefinitions__Group_1_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SigDefinitions__Group_1_3__1"


    // $ANTLR start "rule__SigDefinitions__Group_1_3__1__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2810:1: rule__SigDefinitions__Group_1_3__1__Impl : ( ruleincludeOps ) ;
    public final void rule__SigDefinitions__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2814:1: ( ( ruleincludeOps ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2815:1: ( ruleincludeOps )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2815:1: ( ruleincludeOps )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2816:1: ruleincludeOps
            {
             before(grammarAccess.getSigDefinitionsAccess().getIncludeOpsParserRuleCall_1_3_1()); 
            pushFollow(FOLLOW_ruleincludeOps_in_rule__SigDefinitions__Group_1_3__1__Impl5765);
            ruleincludeOps();

            state._fsp--;

             after(grammarAccess.getSigDefinitionsAccess().getIncludeOpsParserRuleCall_1_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SigDefinitions__Group_1_3__1__Impl"


    // $ANTLR start "rule__SigDefinitions__Group_2__0"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2831:1: rule__SigDefinitions__Group_2__0 : rule__SigDefinitions__Group_2__0__Impl rule__SigDefinitions__Group_2__1 ;
    public final void rule__SigDefinitions__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2835:1: ( rule__SigDefinitions__Group_2__0__Impl rule__SigDefinitions__Group_2__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2836:2: rule__SigDefinitions__Group_2__0__Impl rule__SigDefinitions__Group_2__1
            {
            pushFollow(FOLLOW_rule__SigDefinitions__Group_2__0__Impl_in_rule__SigDefinitions__Group_2__05798);
            rule__SigDefinitions__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SigDefinitions__Group_2__1_in_rule__SigDefinitions__Group_2__05801);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2843:1: rule__SigDefinitions__Group_2__0__Impl : ( '%struct' ) ;
    public final void rule__SigDefinitions__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2847:1: ( ( '%struct' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2848:1: ( '%struct' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2848:1: ( '%struct' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2849:1: '%struct'
            {
             before(grammarAccess.getSigDefinitionsAccess().getStructKeyword_2_0()); 
            match(input,36,FOLLOW_36_in_rule__SigDefinitions__Group_2__0__Impl5829); 
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2862:1: rule__SigDefinitions__Group_2__1 : rule__SigDefinitions__Group_2__1__Impl rule__SigDefinitions__Group_2__2 ;
    public final void rule__SigDefinitions__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2866:1: ( rule__SigDefinitions__Group_2__1__Impl rule__SigDefinitions__Group_2__2 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2867:2: rule__SigDefinitions__Group_2__1__Impl rule__SigDefinitions__Group_2__2
            {
            pushFollow(FOLLOW_rule__SigDefinitions__Group_2__1__Impl_in_rule__SigDefinitions__Group_2__15860);
            rule__SigDefinitions__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SigDefinitions__Group_2__2_in_rule__SigDefinitions__Group_2__15863);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2874:1: rule__SigDefinitions__Group_2__1__Impl : ( ( ( ruleWS ) ) ( ( ruleWS )* ) ) ;
    public final void rule__SigDefinitions__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2878:1: ( ( ( ( ruleWS ) ) ( ( ruleWS )* ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2879:1: ( ( ( ruleWS ) ) ( ( ruleWS )* ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2879:1: ( ( ( ruleWS ) ) ( ( ruleWS )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2880:1: ( ( ruleWS ) ) ( ( ruleWS )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2880:1: ( ( ruleWS ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2881:1: ( ruleWS )
            {
             before(grammarAccess.getSigDefinitionsAccess().getWSParserRuleCall_2_1()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2882:1: ( ruleWS )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2882:3: ruleWS
            {
            pushFollow(FOLLOW_ruleWS_in_rule__SigDefinitions__Group_2__1__Impl5893);
            ruleWS();

            state._fsp--;


            }

             after(grammarAccess.getSigDefinitionsAccess().getWSParserRuleCall_2_1()); 

            }

            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2885:1: ( ( ruleWS )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2886:1: ( ruleWS )*
            {
             before(grammarAccess.getSigDefinitionsAccess().getWSParserRuleCall_2_1()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2887:1: ( ruleWS )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=RULE_SP && LA34_0<=RULE_SL_COMMENT)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2887:3: ruleWS
            	    {
            	    pushFollow(FOLLOW_ruleWS_in_rule__SigDefinitions__Group_2__1__Impl5906);
            	    ruleWS();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getSigDefinitionsAccess().getWSParserRuleCall_2_1()); 

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
    // $ANTLR end "rule__SigDefinitions__Group_2__1__Impl"


    // $ANTLR start "rule__SigDefinitions__Group_2__2"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2898:1: rule__SigDefinitions__Group_2__2 : rule__SigDefinitions__Group_2__2__Impl rule__SigDefinitions__Group_2__3 ;
    public final void rule__SigDefinitions__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2902:1: ( rule__SigDefinitions__Group_2__2__Impl rule__SigDefinitions__Group_2__3 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2903:2: rule__SigDefinitions__Group_2__2__Impl rule__SigDefinitions__Group_2__3
            {
            pushFollow(FOLLOW_rule__SigDefinitions__Group_2__2__Impl_in_rule__SigDefinitions__Group_2__25939);
            rule__SigDefinitions__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SigDefinitions__Group_2__3_in_rule__SigDefinitions__Group_2__25942);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2910:1: rule__SigDefinitions__Group_2__2__Impl : ( ( rule__SigDefinitions__StructNameAssignment_2_2 ) ) ;
    public final void rule__SigDefinitions__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2914:1: ( ( ( rule__SigDefinitions__StructNameAssignment_2_2 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2915:1: ( ( rule__SigDefinitions__StructNameAssignment_2_2 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2915:1: ( ( rule__SigDefinitions__StructNameAssignment_2_2 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2916:1: ( rule__SigDefinitions__StructNameAssignment_2_2 )
            {
             before(grammarAccess.getSigDefinitionsAccess().getStructNameAssignment_2_2()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2917:1: ( rule__SigDefinitions__StructNameAssignment_2_2 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2917:2: rule__SigDefinitions__StructNameAssignment_2_2
            {
            pushFollow(FOLLOW_rule__SigDefinitions__StructNameAssignment_2_2_in_rule__SigDefinitions__Group_2__2__Impl5969);
            rule__SigDefinitions__StructNameAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getSigDefinitionsAccess().getStructNameAssignment_2_2()); 

            }


            }

        }
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2927:1: rule__SigDefinitions__Group_2__3 : rule__SigDefinitions__Group_2__3__Impl rule__SigDefinitions__Group_2__4 ;
    public final void rule__SigDefinitions__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2931:1: ( rule__SigDefinitions__Group_2__3__Impl rule__SigDefinitions__Group_2__4 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2932:2: rule__SigDefinitions__Group_2__3__Impl rule__SigDefinitions__Group_2__4
            {
            pushFollow(FOLLOW_rule__SigDefinitions__Group_2__3__Impl_in_rule__SigDefinitions__Group_2__35999);
            rule__SigDefinitions__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SigDefinitions__Group_2__4_in_rule__SigDefinitions__Group_2__36002);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2939:1: rule__SigDefinitions__Group_2__3__Impl : ( ( ruleWS )* ) ;
    public final void rule__SigDefinitions__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2943:1: ( ( ( ruleWS )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2944:1: ( ( ruleWS )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2944:1: ( ( ruleWS )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2945:1: ( ruleWS )*
            {
             before(grammarAccess.getSigDefinitionsAccess().getWSParserRuleCall_2_3()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2946:1: ( ruleWS )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=RULE_SP && LA35_0<=RULE_SL_COMMENT)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2946:3: ruleWS
            	    {
            	    pushFollow(FOLLOW_ruleWS_in_rule__SigDefinitions__Group_2__3__Impl6030);
            	    ruleWS();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getSigDefinitionsAccess().getWSParserRuleCall_2_3()); 

            }


            }

        }
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2956:1: rule__SigDefinitions__Group_2__4 : rule__SigDefinitions__Group_2__4__Impl rule__SigDefinitions__Group_2__5 ;
    public final void rule__SigDefinitions__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2960:1: ( rule__SigDefinitions__Group_2__4__Impl rule__SigDefinitions__Group_2__5 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2961:2: rule__SigDefinitions__Group_2__4__Impl rule__SigDefinitions__Group_2__5
            {
            pushFollow(FOLLOW_rule__SigDefinitions__Group_2__4__Impl_in_rule__SigDefinitions__Group_2__46061);
            rule__SigDefinitions__Group_2__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SigDefinitions__Group_2__5_in_rule__SigDefinitions__Group_2__46064);
            rule__SigDefinitions__Group_2__5();

            state._fsp--;


            }

        }
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2968:1: rule__SigDefinitions__Group_2__4__Impl : ( ':' ) ;
    public final void rule__SigDefinitions__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2972:1: ( ( ':' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2973:1: ( ':' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2973:1: ( ':' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2974:1: ':'
            {
             before(grammarAccess.getSigDefinitionsAccess().getColonKeyword_2_4()); 
            match(input,13,FOLLOW_13_in_rule__SigDefinitions__Group_2__4__Impl6092); 
             after(grammarAccess.getSigDefinitionsAccess().getColonKeyword_2_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__SigDefinitions__Group_2__5"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2987:1: rule__SigDefinitions__Group_2__5 : rule__SigDefinitions__Group_2__5__Impl rule__SigDefinitions__Group_2__6 ;
    public final void rule__SigDefinitions__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2991:1: ( rule__SigDefinitions__Group_2__5__Impl rule__SigDefinitions__Group_2__6 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2992:2: rule__SigDefinitions__Group_2__5__Impl rule__SigDefinitions__Group_2__6
            {
            pushFollow(FOLLOW_rule__SigDefinitions__Group_2__5__Impl_in_rule__SigDefinitions__Group_2__56123);
            rule__SigDefinitions__Group_2__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SigDefinitions__Group_2__6_in_rule__SigDefinitions__Group_2__56126);
            rule__SigDefinitions__Group_2__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SigDefinitions__Group_2__5"


    // $ANTLR start "rule__SigDefinitions__Group_2__5__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:2999:1: rule__SigDefinitions__Group_2__5__Impl : ( ( ruleSOMETHING )* ) ;
    public final void rule__SigDefinitions__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3003:1: ( ( ( ruleSOMETHING )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3004:1: ( ( ruleSOMETHING )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3004:1: ( ( ruleSOMETHING )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3005:1: ( ruleSOMETHING )*
            {
             before(grammarAccess.getSigDefinitionsAccess().getSOMETHINGParserRuleCall_2_5()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3006:1: ( ruleSOMETHING )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==12) ) {
                    int LA36_2 = input.LA(2);

                    if ( (LA36_2==RULE_CID) ) {
                        alt36=1;
                    }


                }
                else if ( ((LA36_0>=RULE_SP && LA36_0<=RULE_INT)||(LA36_0>=13 && LA36_0<=18)||LA36_0==31) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3006:3: ruleSOMETHING
            	    {
            	    pushFollow(FOLLOW_ruleSOMETHING_in_rule__SigDefinitions__Group_2__5__Impl6154);
            	    ruleSOMETHING();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

             after(grammarAccess.getSigDefinitionsAccess().getSOMETHINGParserRuleCall_2_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SigDefinitions__Group_2__5__Impl"


    // $ANTLR start "rule__SigDefinitions__Group_2__6"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3016:1: rule__SigDefinitions__Group_2__6 : rule__SigDefinitions__Group_2__6__Impl rule__SigDefinitions__Group_2__7 ;
    public final void rule__SigDefinitions__Group_2__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3020:1: ( rule__SigDefinitions__Group_2__6__Impl rule__SigDefinitions__Group_2__7 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3021:2: rule__SigDefinitions__Group_2__6__Impl rule__SigDefinitions__Group_2__7
            {
            pushFollow(FOLLOW_rule__SigDefinitions__Group_2__6__Impl_in_rule__SigDefinitions__Group_2__66185);
            rule__SigDefinitions__Group_2__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SigDefinitions__Group_2__7_in_rule__SigDefinitions__Group_2__66188);
            rule__SigDefinitions__Group_2__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SigDefinitions__Group_2__6"


    // $ANTLR start "rule__SigDefinitions__Group_2__6__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3028:1: rule__SigDefinitions__Group_2__6__Impl : ( ( ruleincludeOps )? ) ;
    public final void rule__SigDefinitions__Group_2__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3032:1: ( ( ( ruleincludeOps )? ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3033:1: ( ( ruleincludeOps )? )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3033:1: ( ( ruleincludeOps )? )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3034:1: ( ruleincludeOps )?
            {
             before(grammarAccess.getSigDefinitionsAccess().getIncludeOpsParserRuleCall_2_6()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3035:1: ( ruleincludeOps )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==37) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3035:3: ruleincludeOps
                    {
                    pushFollow(FOLLOW_ruleincludeOps_in_rule__SigDefinitions__Group_2__6__Impl6216);
                    ruleincludeOps();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSigDefinitionsAccess().getIncludeOpsParserRuleCall_2_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SigDefinitions__Group_2__6__Impl"


    // $ANTLR start "rule__SigDefinitions__Group_2__7"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3045:1: rule__SigDefinitions__Group_2__7 : rule__SigDefinitions__Group_2__7__Impl rule__SigDefinitions__Group_2__8 ;
    public final void rule__SigDefinitions__Group_2__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3049:1: ( rule__SigDefinitions__Group_2__7__Impl rule__SigDefinitions__Group_2__8 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3050:2: rule__SigDefinitions__Group_2__7__Impl rule__SigDefinitions__Group_2__8
            {
            pushFollow(FOLLOW_rule__SigDefinitions__Group_2__7__Impl_in_rule__SigDefinitions__Group_2__76247);
            rule__SigDefinitions__Group_2__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SigDefinitions__Group_2__8_in_rule__SigDefinitions__Group_2__76250);
            rule__SigDefinitions__Group_2__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SigDefinitions__Group_2__7"


    // $ANTLR start "rule__SigDefinitions__Group_2__7__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3057:1: rule__SigDefinitions__Group_2__7__Impl : ( '.' ) ;
    public final void rule__SigDefinitions__Group_2__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3061:1: ( ( '.' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3062:1: ( '.' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3062:1: ( '.' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3063:1: '.'
            {
             before(grammarAccess.getSigDefinitionsAccess().getFullStopKeyword_2_7()); 
            match(input,12,FOLLOW_12_in_rule__SigDefinitions__Group_2__7__Impl6278); 
             after(grammarAccess.getSigDefinitionsAccess().getFullStopKeyword_2_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SigDefinitions__Group_2__7__Impl"


    // $ANTLR start "rule__SigDefinitions__Group_2__8"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3076:1: rule__SigDefinitions__Group_2__8 : rule__SigDefinitions__Group_2__8__Impl ;
    public final void rule__SigDefinitions__Group_2__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3080:1: ( rule__SigDefinitions__Group_2__8__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3081:2: rule__SigDefinitions__Group_2__8__Impl
            {
            pushFollow(FOLLOW_rule__SigDefinitions__Group_2__8__Impl_in_rule__SigDefinitions__Group_2__86309);
            rule__SigDefinitions__Group_2__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SigDefinitions__Group_2__8"


    // $ANTLR start "rule__SigDefinitions__Group_2__8__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3087:1: rule__SigDefinitions__Group_2__8__Impl : ( ruleWS ) ;
    public final void rule__SigDefinitions__Group_2__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3091:1: ( ( ruleWS ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3092:1: ( ruleWS )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3092:1: ( ruleWS )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3093:1: ruleWS
            {
             before(grammarAccess.getSigDefinitionsAccess().getWSParserRuleCall_2_8()); 
            pushFollow(FOLLOW_ruleWS_in_rule__SigDefinitions__Group_2__8__Impl6336);
            ruleWS();

            state._fsp--;

             after(grammarAccess.getSigDefinitionsAccess().getWSParserRuleCall_2_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SigDefinitions__Group_2__8__Impl"


    // $ANTLR start "rule__SigDefinitions__Group_3__0"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3122:1: rule__SigDefinitions__Group_3__0 : rule__SigDefinitions__Group_3__0__Impl rule__SigDefinitions__Group_3__1 ;
    public final void rule__SigDefinitions__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3126:1: ( rule__SigDefinitions__Group_3__0__Impl rule__SigDefinitions__Group_3__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3127:2: rule__SigDefinitions__Group_3__0__Impl rule__SigDefinitions__Group_3__1
            {
            pushFollow(FOLLOW_rule__SigDefinitions__Group_3__0__Impl_in_rule__SigDefinitions__Group_3__06383);
            rule__SigDefinitions__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SigDefinitions__Group_3__1_in_rule__SigDefinitions__Group_3__06386);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3134:1: rule__SigDefinitions__Group_3__0__Impl : ( ( rule__SigDefinitions__TmpAssignment_3_0 ) ) ;
    public final void rule__SigDefinitions__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3138:1: ( ( ( rule__SigDefinitions__TmpAssignment_3_0 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3139:1: ( ( rule__SigDefinitions__TmpAssignment_3_0 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3139:1: ( ( rule__SigDefinitions__TmpAssignment_3_0 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3140:1: ( rule__SigDefinitions__TmpAssignment_3_0 )
            {
             before(grammarAccess.getSigDefinitionsAccess().getTmpAssignment_3_0()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3141:1: ( rule__SigDefinitions__TmpAssignment_3_0 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3141:2: rule__SigDefinitions__TmpAssignment_3_0
            {
            pushFollow(FOLLOW_rule__SigDefinitions__TmpAssignment_3_0_in_rule__SigDefinitions__Group_3__0__Impl6413);
            rule__SigDefinitions__TmpAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getSigDefinitionsAccess().getTmpAssignment_3_0()); 

            }


            }

        }
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3151:1: rule__SigDefinitions__Group_3__1 : rule__SigDefinitions__Group_3__1__Impl rule__SigDefinitions__Group_3__2 ;
    public final void rule__SigDefinitions__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3155:1: ( rule__SigDefinitions__Group_3__1__Impl rule__SigDefinitions__Group_3__2 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3156:2: rule__SigDefinitions__Group_3__1__Impl rule__SigDefinitions__Group_3__2
            {
            pushFollow(FOLLOW_rule__SigDefinitions__Group_3__1__Impl_in_rule__SigDefinitions__Group_3__16443);
            rule__SigDefinitions__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SigDefinitions__Group_3__2_in_rule__SigDefinitions__Group_3__16446);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3163:1: rule__SigDefinitions__Group_3__1__Impl : ( ( ruleSOMETHING )* ) ;
    public final void rule__SigDefinitions__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3167:1: ( ( ( ruleSOMETHING )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3168:1: ( ( ruleSOMETHING )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3168:1: ( ( ruleSOMETHING )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3169:1: ( ruleSOMETHING )*
            {
             before(grammarAccess.getSigDefinitionsAccess().getSOMETHINGParserRuleCall_3_1()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3170:1: ( ruleSOMETHING )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==12) ) {
                    int LA38_1 = input.LA(2);

                    if ( (LA38_1==RULE_CID) ) {
                        alt38=1;
                    }


                }
                else if ( ((LA38_0>=RULE_SP && LA38_0<=RULE_INT)||(LA38_0>=13 && LA38_0<=18)||LA38_0==31) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3170:3: ruleSOMETHING
            	    {
            	    pushFollow(FOLLOW_ruleSOMETHING_in_rule__SigDefinitions__Group_3__1__Impl6474);
            	    ruleSOMETHING();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getSigDefinitionsAccess().getSOMETHINGParserRuleCall_3_1()); 

            }


            }

        }
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3180:1: rule__SigDefinitions__Group_3__2 : rule__SigDefinitions__Group_3__2__Impl rule__SigDefinitions__Group_3__3 ;
    public final void rule__SigDefinitions__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3184:1: ( rule__SigDefinitions__Group_3__2__Impl rule__SigDefinitions__Group_3__3 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3185:2: rule__SigDefinitions__Group_3__2__Impl rule__SigDefinitions__Group_3__3
            {
            pushFollow(FOLLOW_rule__SigDefinitions__Group_3__2__Impl_in_rule__SigDefinitions__Group_3__26505);
            rule__SigDefinitions__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SigDefinitions__Group_3__3_in_rule__SigDefinitions__Group_3__26508);
            rule__SigDefinitions__Group_3__3();

            state._fsp--;


            }

        }
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3192:1: rule__SigDefinitions__Group_3__2__Impl : ( '.' ) ;
    public final void rule__SigDefinitions__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3196:1: ( ( '.' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3197:1: ( '.' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3197:1: ( '.' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3198:1: '.'
            {
             before(grammarAccess.getSigDefinitionsAccess().getFullStopKeyword_3_2()); 
            match(input,12,FOLLOW_12_in_rule__SigDefinitions__Group_3__2__Impl6536); 
             after(grammarAccess.getSigDefinitionsAccess().getFullStopKeyword_3_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__SigDefinitions__Group_3__3"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3211:1: rule__SigDefinitions__Group_3__3 : rule__SigDefinitions__Group_3__3__Impl ;
    public final void rule__SigDefinitions__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3215:1: ( rule__SigDefinitions__Group_3__3__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3216:2: rule__SigDefinitions__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__SigDefinitions__Group_3__3__Impl_in_rule__SigDefinitions__Group_3__36567);
            rule__SigDefinitions__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SigDefinitions__Group_3__3"


    // $ANTLR start "rule__SigDefinitions__Group_3__3__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3222:1: rule__SigDefinitions__Group_3__3__Impl : ( ruleWS ) ;
    public final void rule__SigDefinitions__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3226:1: ( ( ruleWS ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3227:1: ( ruleWS )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3227:1: ( ruleWS )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3228:1: ruleWS
            {
             before(grammarAccess.getSigDefinitionsAccess().getWSParserRuleCall_3_3()); 
            pushFollow(FOLLOW_ruleWS_in_rule__SigDefinitions__Group_3__3__Impl6594);
            ruleWS();

            state._fsp--;

             after(grammarAccess.getSigDefinitionsAccess().getWSParserRuleCall_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SigDefinitions__Group_3__3__Impl"


    // $ANTLR start "rule__IncludeOps__Group__0"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3247:1: rule__IncludeOps__Group__0 : rule__IncludeOps__Group__0__Impl rule__IncludeOps__Group__1 ;
    public final void rule__IncludeOps__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3251:1: ( rule__IncludeOps__Group__0__Impl rule__IncludeOps__Group__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3252:2: rule__IncludeOps__Group__0__Impl rule__IncludeOps__Group__1
            {
            pushFollow(FOLLOW_rule__IncludeOps__Group__0__Impl_in_rule__IncludeOps__Group__06631);
            rule__IncludeOps__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IncludeOps__Group__1_in_rule__IncludeOps__Group__06634);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3259:1: rule__IncludeOps__Group__0__Impl : ( '%open' ) ;
    public final void rule__IncludeOps__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3263:1: ( ( '%open' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3264:1: ( '%open' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3264:1: ( '%open' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3265:1: '%open'
            {
             before(grammarAccess.getIncludeOpsAccess().getOpenKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__IncludeOps__Group__0__Impl6662); 
             after(grammarAccess.getIncludeOpsAccess().getOpenKeyword_0()); 

            }


            }

        }
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3278:1: rule__IncludeOps__Group__1 : rule__IncludeOps__Group__1__Impl ;
    public final void rule__IncludeOps__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3282:1: ( rule__IncludeOps__Group__1__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3283:2: rule__IncludeOps__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__IncludeOps__Group__1__Impl_in_rule__IncludeOps__Group__16693);
            rule__IncludeOps__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3289:1: rule__IncludeOps__Group__1__Impl : ( ( ruleSOMETHING )* ) ;
    public final void rule__IncludeOps__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3293:1: ( ( ( ruleSOMETHING )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3294:1: ( ( ruleSOMETHING )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3294:1: ( ( ruleSOMETHING )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3295:1: ( ruleSOMETHING )*
            {
             before(grammarAccess.getIncludeOpsAccess().getSOMETHINGParserRuleCall_1()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3296:1: ( ruleSOMETHING )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==12) ) {
                    int LA39_2 = input.LA(2);

                    if ( (LA39_2==RULE_CID) ) {
                        alt39=1;
                    }


                }
                else if ( ((LA39_0>=RULE_SP && LA39_0<=RULE_INT)||(LA39_0>=13 && LA39_0<=18)||LA39_0==31) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3296:3: ruleSOMETHING
            	    {
            	    pushFollow(FOLLOW_ruleSOMETHING_in_rule__IncludeOps__Group__1__Impl6721);
            	    ruleSOMETHING();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getIncludeOpsAccess().getSOMETHINGParserRuleCall_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__ViewDeclaration__Group__0"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3310:1: rule__ViewDeclaration__Group__0 : rule__ViewDeclaration__Group__0__Impl rule__ViewDeclaration__Group__1 ;
    public final void rule__ViewDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3314:1: ( rule__ViewDeclaration__Group__0__Impl rule__ViewDeclaration__Group__1 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3315:2: rule__ViewDeclaration__Group__0__Impl rule__ViewDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__Group__0__Impl_in_rule__ViewDeclaration__Group__06756);
            rule__ViewDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ViewDeclaration__Group__1_in_rule__ViewDeclaration__Group__06759);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3322:1: rule__ViewDeclaration__Group__0__Impl : ( '%view' ) ;
    public final void rule__ViewDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3326:1: ( ( '%view' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3327:1: ( '%view' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3327:1: ( '%view' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3328:1: '%view'
            {
             before(grammarAccess.getViewDeclarationAccess().getViewKeyword_0()); 
            match(input,38,FOLLOW_38_in_rule__ViewDeclaration__Group__0__Impl6787); 
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3341:1: rule__ViewDeclaration__Group__1 : rule__ViewDeclaration__Group__1__Impl rule__ViewDeclaration__Group__2 ;
    public final void rule__ViewDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3345:1: ( rule__ViewDeclaration__Group__1__Impl rule__ViewDeclaration__Group__2 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3346:2: rule__ViewDeclaration__Group__1__Impl rule__ViewDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__Group__1__Impl_in_rule__ViewDeclaration__Group__16818);
            rule__ViewDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ViewDeclaration__Group__2_in_rule__ViewDeclaration__Group__16821);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3353:1: rule__ViewDeclaration__Group__1__Impl : ( ( ( ruleWS ) ) ( ( ruleWS )* ) ) ;
    public final void rule__ViewDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3357:1: ( ( ( ( ruleWS ) ) ( ( ruleWS )* ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3358:1: ( ( ( ruleWS ) ) ( ( ruleWS )* ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3358:1: ( ( ( ruleWS ) ) ( ( ruleWS )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3359:1: ( ( ruleWS ) ) ( ( ruleWS )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3359:1: ( ( ruleWS ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3360:1: ( ruleWS )
            {
             before(grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_1()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3361:1: ( ruleWS )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3361:3: ruleWS
            {
            pushFollow(FOLLOW_ruleWS_in_rule__ViewDeclaration__Group__1__Impl6851);
            ruleWS();

            state._fsp--;


            }

             after(grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_1()); 

            }

            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3364:1: ( ( ruleWS )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3365:1: ( ruleWS )*
            {
             before(grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_1()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3366:1: ( ruleWS )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( ((LA40_0>=RULE_SP && LA40_0<=RULE_SL_COMMENT)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3366:3: ruleWS
            	    {
            	    pushFollow(FOLLOW_ruleWS_in_rule__ViewDeclaration__Group__1__Impl6864);
            	    ruleWS();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

             after(grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_1()); 

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
    // $ANTLR end "rule__ViewDeclaration__Group__1__Impl"


    // $ANTLR start "rule__ViewDeclaration__Group__2"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3377:1: rule__ViewDeclaration__Group__2 : rule__ViewDeclaration__Group__2__Impl rule__ViewDeclaration__Group__3 ;
    public final void rule__ViewDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3381:1: ( rule__ViewDeclaration__Group__2__Impl rule__ViewDeclaration__Group__3 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3382:2: rule__ViewDeclaration__Group__2__Impl rule__ViewDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__Group__2__Impl_in_rule__ViewDeclaration__Group__26897);
            rule__ViewDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ViewDeclaration__Group__3_in_rule__ViewDeclaration__Group__26900);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3389:1: rule__ViewDeclaration__Group__2__Impl : ( ( rule__ViewDeclaration__ViewIDAssignment_2 ) ) ;
    public final void rule__ViewDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3393:1: ( ( ( rule__ViewDeclaration__ViewIDAssignment_2 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3394:1: ( ( rule__ViewDeclaration__ViewIDAssignment_2 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3394:1: ( ( rule__ViewDeclaration__ViewIDAssignment_2 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3395:1: ( rule__ViewDeclaration__ViewIDAssignment_2 )
            {
             before(grammarAccess.getViewDeclarationAccess().getViewIDAssignment_2()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3396:1: ( rule__ViewDeclaration__ViewIDAssignment_2 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3396:2: rule__ViewDeclaration__ViewIDAssignment_2
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__ViewIDAssignment_2_in_rule__ViewDeclaration__Group__2__Impl6927);
            rule__ViewDeclaration__ViewIDAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getViewDeclarationAccess().getViewIDAssignment_2()); 

            }


            }

        }
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3406:1: rule__ViewDeclaration__Group__3 : rule__ViewDeclaration__Group__3__Impl rule__ViewDeclaration__Group__4 ;
    public final void rule__ViewDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3410:1: ( rule__ViewDeclaration__Group__3__Impl rule__ViewDeclaration__Group__4 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3411:2: rule__ViewDeclaration__Group__3__Impl rule__ViewDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__Group__3__Impl_in_rule__ViewDeclaration__Group__36957);
            rule__ViewDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ViewDeclaration__Group__4_in_rule__ViewDeclaration__Group__36960);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3418:1: rule__ViewDeclaration__Group__3__Impl : ( ( ruleWS )* ) ;
    public final void rule__ViewDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3422:1: ( ( ( ruleWS )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3423:1: ( ( ruleWS )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3423:1: ( ( ruleWS )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3424:1: ( ruleWS )*
            {
             before(grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_3()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3425:1: ( ruleWS )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( ((LA41_0>=RULE_SP && LA41_0<=RULE_SL_COMMENT)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3425:3: ruleWS
            	    {
            	    pushFollow(FOLLOW_ruleWS_in_rule__ViewDeclaration__Group__3__Impl6988);
            	    ruleWS();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

             after(grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_3()); 

            }


            }

        }
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3435:1: rule__ViewDeclaration__Group__4 : rule__ViewDeclaration__Group__4__Impl rule__ViewDeclaration__Group__5 ;
    public final void rule__ViewDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3439:1: ( rule__ViewDeclaration__Group__4__Impl rule__ViewDeclaration__Group__5 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3440:2: rule__ViewDeclaration__Group__4__Impl rule__ViewDeclaration__Group__5
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__Group__4__Impl_in_rule__ViewDeclaration__Group__47019);
            rule__ViewDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ViewDeclaration__Group__5_in_rule__ViewDeclaration__Group__47022);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3447:1: rule__ViewDeclaration__Group__4__Impl : ( ':' ) ;
    public final void rule__ViewDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3451:1: ( ( ':' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3452:1: ( ':' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3452:1: ( ':' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3453:1: ':'
            {
             before(grammarAccess.getViewDeclarationAccess().getColonKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__ViewDeclaration__Group__4__Impl7050); 
             after(grammarAccess.getViewDeclarationAccess().getColonKeyword_4()); 

            }


            }

        }
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3466:1: rule__ViewDeclaration__Group__5 : rule__ViewDeclaration__Group__5__Impl rule__ViewDeclaration__Group__6 ;
    public final void rule__ViewDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3470:1: ( rule__ViewDeclaration__Group__5__Impl rule__ViewDeclaration__Group__6 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3471:2: rule__ViewDeclaration__Group__5__Impl rule__ViewDeclaration__Group__6
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__Group__5__Impl_in_rule__ViewDeclaration__Group__57081);
            rule__ViewDeclaration__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ViewDeclaration__Group__6_in_rule__ViewDeclaration__Group__57084);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3478:1: rule__ViewDeclaration__Group__5__Impl : ( ( ruleWS )* ) ;
    public final void rule__ViewDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3482:1: ( ( ( ruleWS )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3483:1: ( ( ruleWS )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3483:1: ( ( ruleWS )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3484:1: ( ruleWS )*
            {
             before(grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_5()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3485:1: ( ruleWS )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>=RULE_SP && LA42_0<=RULE_SL_COMMENT)) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3485:3: ruleWS
            	    {
            	    pushFollow(FOLLOW_ruleWS_in_rule__ViewDeclaration__Group__5__Impl7112);
            	    ruleWS();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

             after(grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_5()); 

            }


            }

        }
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3495:1: rule__ViewDeclaration__Group__6 : rule__ViewDeclaration__Group__6__Impl rule__ViewDeclaration__Group__7 ;
    public final void rule__ViewDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3499:1: ( rule__ViewDeclaration__Group__6__Impl rule__ViewDeclaration__Group__7 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3500:2: rule__ViewDeclaration__Group__6__Impl rule__ViewDeclaration__Group__7
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__Group__6__Impl_in_rule__ViewDeclaration__Group__67143);
            rule__ViewDeclaration__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ViewDeclaration__Group__7_in_rule__ViewDeclaration__Group__67146);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3507:1: rule__ViewDeclaration__Group__6__Impl : ( ( rule__ViewDeclaration__FromAssignment_6 ) ) ;
    public final void rule__ViewDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3511:1: ( ( ( rule__ViewDeclaration__FromAssignment_6 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3512:1: ( ( rule__ViewDeclaration__FromAssignment_6 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3512:1: ( ( rule__ViewDeclaration__FromAssignment_6 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3513:1: ( rule__ViewDeclaration__FromAssignment_6 )
            {
             before(grammarAccess.getViewDeclarationAccess().getFromAssignment_6()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3514:1: ( rule__ViewDeclaration__FromAssignment_6 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3514:2: rule__ViewDeclaration__FromAssignment_6
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__FromAssignment_6_in_rule__ViewDeclaration__Group__6__Impl7173);
            rule__ViewDeclaration__FromAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getViewDeclarationAccess().getFromAssignment_6()); 

            }


            }

        }
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3524:1: rule__ViewDeclaration__Group__7 : rule__ViewDeclaration__Group__7__Impl rule__ViewDeclaration__Group__8 ;
    public final void rule__ViewDeclaration__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3528:1: ( rule__ViewDeclaration__Group__7__Impl rule__ViewDeclaration__Group__8 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3529:2: rule__ViewDeclaration__Group__7__Impl rule__ViewDeclaration__Group__8
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__Group__7__Impl_in_rule__ViewDeclaration__Group__77203);
            rule__ViewDeclaration__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ViewDeclaration__Group__8_in_rule__ViewDeclaration__Group__77206);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3536:1: rule__ViewDeclaration__Group__7__Impl : ( ( ruleWS )* ) ;
    public final void rule__ViewDeclaration__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3540:1: ( ( ( ruleWS )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3541:1: ( ( ruleWS )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3541:1: ( ( ruleWS )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3542:1: ( ruleWS )*
            {
             before(grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_7()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3543:1: ( ruleWS )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>=RULE_SP && LA43_0<=RULE_SL_COMMENT)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3543:3: ruleWS
            	    {
            	    pushFollow(FOLLOW_ruleWS_in_rule__ViewDeclaration__Group__7__Impl7234);
            	    ruleWS();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

             after(grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_7()); 

            }


            }

        }
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3553:1: rule__ViewDeclaration__Group__8 : rule__ViewDeclaration__Group__8__Impl rule__ViewDeclaration__Group__9 ;
    public final void rule__ViewDeclaration__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3557:1: ( rule__ViewDeclaration__Group__8__Impl rule__ViewDeclaration__Group__9 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3558:2: rule__ViewDeclaration__Group__8__Impl rule__ViewDeclaration__Group__9
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__Group__8__Impl_in_rule__ViewDeclaration__Group__87265);
            rule__ViewDeclaration__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ViewDeclaration__Group__9_in_rule__ViewDeclaration__Group__87268);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3565:1: rule__ViewDeclaration__Group__8__Impl : ( '->' ) ;
    public final void rule__ViewDeclaration__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3569:1: ( ( '->' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3570:1: ( '->' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3570:1: ( '->' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3571:1: '->'
            {
             before(grammarAccess.getViewDeclarationAccess().getHyphenMinusGreaterThanSignKeyword_8()); 
            match(input,16,FOLLOW_16_in_rule__ViewDeclaration__Group__8__Impl7296); 
             after(grammarAccess.getViewDeclarationAccess().getHyphenMinusGreaterThanSignKeyword_8()); 

            }


            }

        }
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3584:1: rule__ViewDeclaration__Group__9 : rule__ViewDeclaration__Group__9__Impl rule__ViewDeclaration__Group__10 ;
    public final void rule__ViewDeclaration__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3588:1: ( rule__ViewDeclaration__Group__9__Impl rule__ViewDeclaration__Group__10 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3589:2: rule__ViewDeclaration__Group__9__Impl rule__ViewDeclaration__Group__10
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__Group__9__Impl_in_rule__ViewDeclaration__Group__97327);
            rule__ViewDeclaration__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ViewDeclaration__Group__10_in_rule__ViewDeclaration__Group__97330);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3596:1: rule__ViewDeclaration__Group__9__Impl : ( ( ruleWS )* ) ;
    public final void rule__ViewDeclaration__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3600:1: ( ( ( ruleWS )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3601:1: ( ( ruleWS )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3601:1: ( ( ruleWS )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3602:1: ( ruleWS )*
            {
             before(grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_9()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3603:1: ( ruleWS )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0>=RULE_SP && LA44_0<=RULE_SL_COMMENT)) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3603:3: ruleWS
            	    {
            	    pushFollow(FOLLOW_ruleWS_in_rule__ViewDeclaration__Group__9__Impl7358);
            	    ruleWS();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

             after(grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_9()); 

            }


            }

        }
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3613:1: rule__ViewDeclaration__Group__10 : rule__ViewDeclaration__Group__10__Impl rule__ViewDeclaration__Group__11 ;
    public final void rule__ViewDeclaration__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3617:1: ( rule__ViewDeclaration__Group__10__Impl rule__ViewDeclaration__Group__11 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3618:2: rule__ViewDeclaration__Group__10__Impl rule__ViewDeclaration__Group__11
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__Group__10__Impl_in_rule__ViewDeclaration__Group__107389);
            rule__ViewDeclaration__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ViewDeclaration__Group__11_in_rule__ViewDeclaration__Group__107392);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3625:1: rule__ViewDeclaration__Group__10__Impl : ( ( rule__ViewDeclaration__ToAssignment_10 ) ) ;
    public final void rule__ViewDeclaration__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3629:1: ( ( ( rule__ViewDeclaration__ToAssignment_10 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3630:1: ( ( rule__ViewDeclaration__ToAssignment_10 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3630:1: ( ( rule__ViewDeclaration__ToAssignment_10 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3631:1: ( rule__ViewDeclaration__ToAssignment_10 )
            {
             before(grammarAccess.getViewDeclarationAccess().getToAssignment_10()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3632:1: ( rule__ViewDeclaration__ToAssignment_10 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3632:2: rule__ViewDeclaration__ToAssignment_10
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__ToAssignment_10_in_rule__ViewDeclaration__Group__10__Impl7419);
            rule__ViewDeclaration__ToAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getViewDeclarationAccess().getToAssignment_10()); 

            }


            }

        }
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3642:1: rule__ViewDeclaration__Group__11 : rule__ViewDeclaration__Group__11__Impl rule__ViewDeclaration__Group__12 ;
    public final void rule__ViewDeclaration__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3646:1: ( rule__ViewDeclaration__Group__11__Impl rule__ViewDeclaration__Group__12 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3647:2: rule__ViewDeclaration__Group__11__Impl rule__ViewDeclaration__Group__12
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__Group__11__Impl_in_rule__ViewDeclaration__Group__117449);
            rule__ViewDeclaration__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ViewDeclaration__Group__12_in_rule__ViewDeclaration__Group__117452);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3654:1: rule__ViewDeclaration__Group__11__Impl : ( ( ruleWS )* ) ;
    public final void rule__ViewDeclaration__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3658:1: ( ( ( ruleWS )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3659:1: ( ( ruleWS )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3659:1: ( ( ruleWS )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3660:1: ( ruleWS )*
            {
             before(grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_11()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3661:1: ( ruleWS )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( ((LA45_0>=RULE_SP && LA45_0<=RULE_SL_COMMENT)) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3661:3: ruleWS
            	    {
            	    pushFollow(FOLLOW_ruleWS_in_rule__ViewDeclaration__Group__11__Impl7480);
            	    ruleWS();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

             after(grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_11()); 

            }


            }

        }
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3671:1: rule__ViewDeclaration__Group__12 : rule__ViewDeclaration__Group__12__Impl rule__ViewDeclaration__Group__13 ;
    public final void rule__ViewDeclaration__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3675:1: ( rule__ViewDeclaration__Group__12__Impl rule__ViewDeclaration__Group__13 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3676:2: rule__ViewDeclaration__Group__12__Impl rule__ViewDeclaration__Group__13
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__Group__12__Impl_in_rule__ViewDeclaration__Group__127511);
            rule__ViewDeclaration__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ViewDeclaration__Group__13_in_rule__ViewDeclaration__Group__127514);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3683:1: rule__ViewDeclaration__Group__12__Impl : ( '=' ) ;
    public final void rule__ViewDeclaration__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3687:1: ( ( '=' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3688:1: ( '=' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3688:1: ( '=' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3689:1: '='
            {
             before(grammarAccess.getViewDeclarationAccess().getEqualsSignKeyword_12()); 
            match(input,14,FOLLOW_14_in_rule__ViewDeclaration__Group__12__Impl7542); 
             after(grammarAccess.getViewDeclarationAccess().getEqualsSignKeyword_12()); 

            }


            }

        }
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3702:1: rule__ViewDeclaration__Group__13 : rule__ViewDeclaration__Group__13__Impl rule__ViewDeclaration__Group__14 ;
    public final void rule__ViewDeclaration__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3706:1: ( rule__ViewDeclaration__Group__13__Impl rule__ViewDeclaration__Group__14 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3707:2: rule__ViewDeclaration__Group__13__Impl rule__ViewDeclaration__Group__14
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__Group__13__Impl_in_rule__ViewDeclaration__Group__137573);
            rule__ViewDeclaration__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ViewDeclaration__Group__14_in_rule__ViewDeclaration__Group__137576);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3714:1: rule__ViewDeclaration__Group__13__Impl : ( ( ruleWS )* ) ;
    public final void rule__ViewDeclaration__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3718:1: ( ( ( ruleWS )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3719:1: ( ( ruleWS )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3719:1: ( ( ruleWS )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3720:1: ( ruleWS )*
            {
             before(grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_13()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3721:1: ( ruleWS )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( ((LA46_0>=RULE_SP && LA46_0<=RULE_SL_COMMENT)) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3721:3: ruleWS
            	    {
            	    pushFollow(FOLLOW_ruleWS_in_rule__ViewDeclaration__Group__13__Impl7604);
            	    ruleWS();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

             after(grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_13()); 

            }


            }

        }
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3731:1: rule__ViewDeclaration__Group__14 : rule__ViewDeclaration__Group__14__Impl rule__ViewDeclaration__Group__15 ;
    public final void rule__ViewDeclaration__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3735:1: ( rule__ViewDeclaration__Group__14__Impl rule__ViewDeclaration__Group__15 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3736:2: rule__ViewDeclaration__Group__14__Impl rule__ViewDeclaration__Group__15
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__Group__14__Impl_in_rule__ViewDeclaration__Group__147635);
            rule__ViewDeclaration__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ViewDeclaration__Group__15_in_rule__ViewDeclaration__Group__147638);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3743:1: rule__ViewDeclaration__Group__14__Impl : ( '{' ) ;
    public final void rule__ViewDeclaration__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3747:1: ( ( '{' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3748:1: ( '{' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3748:1: ( '{' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3749:1: '{'
            {
             before(grammarAccess.getViewDeclarationAccess().getLeftCurlyBracketKeyword_14()); 
            match(input,33,FOLLOW_33_in_rule__ViewDeclaration__Group__14__Impl7666); 
             after(grammarAccess.getViewDeclarationAccess().getLeftCurlyBracketKeyword_14()); 

            }


            }

        }
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3762:1: rule__ViewDeclaration__Group__15 : rule__ViewDeclaration__Group__15__Impl rule__ViewDeclaration__Group__16 ;
    public final void rule__ViewDeclaration__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3766:1: ( rule__ViewDeclaration__Group__15__Impl rule__ViewDeclaration__Group__16 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3767:2: rule__ViewDeclaration__Group__15__Impl rule__ViewDeclaration__Group__16
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__Group__15__Impl_in_rule__ViewDeclaration__Group__157697);
            rule__ViewDeclaration__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ViewDeclaration__Group__16_in_rule__ViewDeclaration__Group__157700);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3774:1: rule__ViewDeclaration__Group__15__Impl : ( ( rule__ViewDeclaration__ViewDefinitionsAssignment_15 )* ) ;
    public final void rule__ViewDeclaration__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3778:1: ( ( ( rule__ViewDeclaration__ViewDefinitionsAssignment_15 )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3779:1: ( ( rule__ViewDeclaration__ViewDefinitionsAssignment_15 )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3779:1: ( ( rule__ViewDeclaration__ViewDefinitionsAssignment_15 )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3780:1: ( rule__ViewDeclaration__ViewDefinitionsAssignment_15 )*
            {
             before(grammarAccess.getViewDeclarationAccess().getViewDefinitionsAssignment_15()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3781:1: ( rule__ViewDeclaration__ViewDefinitionsAssignment_15 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( ((LA47_0>=RULE_SP && LA47_0<=RULE_INT)||(LA47_0>=20 && LA47_0<=25)||LA47_0==31||(LA47_0>=35 && LA47_0<=36)) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3781:2: rule__ViewDeclaration__ViewDefinitionsAssignment_15
            	    {
            	    pushFollow(FOLLOW_rule__ViewDeclaration__ViewDefinitionsAssignment_15_in_rule__ViewDeclaration__Group__15__Impl7727);
            	    rule__ViewDeclaration__ViewDefinitionsAssignment_15();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

             after(grammarAccess.getViewDeclarationAccess().getViewDefinitionsAssignment_15()); 

            }


            }

        }
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3791:1: rule__ViewDeclaration__Group__16 : rule__ViewDeclaration__Group__16__Impl rule__ViewDeclaration__Group__17 ;
    public final void rule__ViewDeclaration__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3795:1: ( rule__ViewDeclaration__Group__16__Impl rule__ViewDeclaration__Group__17 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3796:2: rule__ViewDeclaration__Group__16__Impl rule__ViewDeclaration__Group__17
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__Group__16__Impl_in_rule__ViewDeclaration__Group__167758);
            rule__ViewDeclaration__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ViewDeclaration__Group__17_in_rule__ViewDeclaration__Group__167761);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3803:1: rule__ViewDeclaration__Group__16__Impl : ( '}' ) ;
    public final void rule__ViewDeclaration__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3807:1: ( ( '}' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3808:1: ( '}' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3808:1: ( '}' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3809:1: '}'
            {
             before(grammarAccess.getViewDeclarationAccess().getRightCurlyBracketKeyword_16()); 
            match(input,34,FOLLOW_34_in_rule__ViewDeclaration__Group__16__Impl7789); 
             after(grammarAccess.getViewDeclarationAccess().getRightCurlyBracketKeyword_16()); 

            }


            }

        }
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3822:1: rule__ViewDeclaration__Group__17 : rule__ViewDeclaration__Group__17__Impl rule__ViewDeclaration__Group__18 ;
    public final void rule__ViewDeclaration__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3826:1: ( rule__ViewDeclaration__Group__17__Impl rule__ViewDeclaration__Group__18 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3827:2: rule__ViewDeclaration__Group__17__Impl rule__ViewDeclaration__Group__18
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__Group__17__Impl_in_rule__ViewDeclaration__Group__177820);
            rule__ViewDeclaration__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ViewDeclaration__Group__18_in_rule__ViewDeclaration__Group__177823);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3834:1: rule__ViewDeclaration__Group__17__Impl : ( ( ruleWS )* ) ;
    public final void rule__ViewDeclaration__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3838:1: ( ( ( ruleWS )* ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3839:1: ( ( ruleWS )* )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3839:1: ( ( ruleWS )* )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3840:1: ( ruleWS )*
            {
             before(grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_17()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3841:1: ( ruleWS )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( ((LA48_0>=RULE_SP && LA48_0<=RULE_SL_COMMENT)) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3841:3: ruleWS
            	    {
            	    pushFollow(FOLLOW_ruleWS_in_rule__ViewDeclaration__Group__17__Impl7851);
            	    ruleWS();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

             after(grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_17()); 

            }


            }

        }
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3851:1: rule__ViewDeclaration__Group__18 : rule__ViewDeclaration__Group__18__Impl rule__ViewDeclaration__Group__19 ;
    public final void rule__ViewDeclaration__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3855:1: ( rule__ViewDeclaration__Group__18__Impl rule__ViewDeclaration__Group__19 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3856:2: rule__ViewDeclaration__Group__18__Impl rule__ViewDeclaration__Group__19
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__Group__18__Impl_in_rule__ViewDeclaration__Group__187882);
            rule__ViewDeclaration__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ViewDeclaration__Group__19_in_rule__ViewDeclaration__Group__187885);
            rule__ViewDeclaration__Group__19();

            state._fsp--;


            }

        }
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3863:1: rule__ViewDeclaration__Group__18__Impl : ( '.' ) ;
    public final void rule__ViewDeclaration__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3867:1: ( ( '.' ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3868:1: ( '.' )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3868:1: ( '.' )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3869:1: '.'
            {
             before(grammarAccess.getViewDeclarationAccess().getFullStopKeyword_18()); 
            match(input,12,FOLLOW_12_in_rule__ViewDeclaration__Group__18__Impl7913); 
             after(grammarAccess.getViewDeclarationAccess().getFullStopKeyword_18()); 

            }


            }

        }
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


    // $ANTLR start "rule__ViewDeclaration__Group__19"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3882:1: rule__ViewDeclaration__Group__19 : rule__ViewDeclaration__Group__19__Impl ;
    public final void rule__ViewDeclaration__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3886:1: ( rule__ViewDeclaration__Group__19__Impl )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3887:2: rule__ViewDeclaration__Group__19__Impl
            {
            pushFollow(FOLLOW_rule__ViewDeclaration__Group__19__Impl_in_rule__ViewDeclaration__Group__197944);
            rule__ViewDeclaration__Group__19__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewDeclaration__Group__19"


    // $ANTLR start "rule__ViewDeclaration__Group__19__Impl"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3893:1: rule__ViewDeclaration__Group__19__Impl : ( ruleWS ) ;
    public final void rule__ViewDeclaration__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3897:1: ( ( ruleWS ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3898:1: ( ruleWS )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3898:1: ( ruleWS )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3899:1: ruleWS
            {
             before(grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_19()); 
            pushFollow(FOLLOW_ruleWS_in_rule__ViewDeclaration__Group__19__Impl7971);
            ruleWS();

            state._fsp--;

             after(grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewDeclaration__Group__19__Impl"


    // $ANTLR start "rule__Model__DeclarationsAssignment"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3951:1: rule__Model__DeclarationsAssignment : ( ( rule__Model__DeclarationsAlternatives_0 ) ) ;
    public final void rule__Model__DeclarationsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3955:1: ( ( ( rule__Model__DeclarationsAlternatives_0 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3956:1: ( ( rule__Model__DeclarationsAlternatives_0 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3956:1: ( ( rule__Model__DeclarationsAlternatives_0 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3957:1: ( rule__Model__DeclarationsAlternatives_0 )
            {
             before(grammarAccess.getModelAccess().getDeclarationsAlternatives_0()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3958:1: ( rule__Model__DeclarationsAlternatives_0 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3958:2: rule__Model__DeclarationsAlternatives_0
            {
            pushFollow(FOLLOW_rule__Model__DeclarationsAlternatives_0_in_rule__Model__DeclarationsAssignment8045);
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
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3967:1: rule__JUSTSPACE__JAssignment : ( ruleWS ) ;
    public final void rule__JUSTSPACE__JAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3971:1: ( ( ruleWS ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3972:1: ( ruleWS )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3972:1: ( ruleWS )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3973:1: ruleWS
            {
             before(grammarAccess.getJUSTSPACEAccess().getJWSParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleWS_in_rule__JUSTSPACE__JAssignment8078);
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


    // $ANTLR start "rule__NamespaceDeclaration__NameAssignment_2_0"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3982:1: rule__NamespaceDeclaration__NameAssignment_2_0 : ( RULE_CID ) ;
    public final void rule__NamespaceDeclaration__NameAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3986:1: ( ( RULE_CID ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3987:1: ( RULE_CID )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3987:1: ( RULE_CID )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3988:1: RULE_CID
            {
             before(grammarAccess.getNamespaceDeclarationAccess().getNameCIDTerminalRuleCall_2_0_0()); 
            match(input,RULE_CID,FOLLOW_RULE_CID_in_rule__NamespaceDeclaration__NameAssignment_2_08109); 
             after(grammarAccess.getNamespaceDeclarationAccess().getNameCIDTerminalRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamespaceDeclaration__NameAssignment_2_0"


    // $ANTLR start "rule__NamespaceDeclaration__UriAssignment_3"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:3997:1: rule__NamespaceDeclaration__UriAssignment_3 : ( ruleURISTRING ) ;
    public final void rule__NamespaceDeclaration__UriAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4001:1: ( ( ruleURISTRING ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4002:1: ( ruleURISTRING )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4002:1: ( ruleURISTRING )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4003:1: ruleURISTRING
            {
             before(grammarAccess.getNamespaceDeclarationAccess().getUriURISTRINGParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleURISTRING_in_rule__NamespaceDeclaration__UriAssignment_38140);
            ruleURISTRING();

            state._fsp--;

             after(grammarAccess.getNamespaceDeclarationAccess().getUriURISTRINGParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamespaceDeclaration__UriAssignment_3"


    // $ANTLR start "rule__ReadDeclaration__FileAssignment_2"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4012:1: rule__ReadDeclaration__FileAssignment_2 : ( ruleURISTRING ) ;
    public final void rule__ReadDeclaration__FileAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4016:1: ( ( ruleURISTRING ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4017:1: ( ruleURISTRING )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4017:1: ( ruleURISTRING )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4018:1: ruleURISTRING
            {
             before(grammarAccess.getReadDeclarationAccess().getFileURISTRINGParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleURISTRING_in_rule__ReadDeclaration__FileAssignment_28171);
            ruleURISTRING();

            state._fsp--;

             after(grammarAccess.getReadDeclarationAccess().getFileURISTRINGParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadDeclaration__FileAssignment_2"


    // $ANTLR start "rule__SignatureDeclaration__SigNameAssignment_2"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4027:1: rule__SignatureDeclaration__SigNameAssignment_2 : ( ruleGID ) ;
    public final void rule__SignatureDeclaration__SigNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4031:1: ( ( ruleGID ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4032:1: ( ruleGID )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4032:1: ( ruleGID )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4033:1: ruleGID
            {
             before(grammarAccess.getSignatureDeclarationAccess().getSigNameGIDParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleGID_in_rule__SignatureDeclaration__SigNameAssignment_28202);
            ruleGID();

            state._fsp--;

             after(grammarAccess.getSignatureDeclarationAccess().getSigNameGIDParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignatureDeclaration__SigNameAssignment_2"


    // $ANTLR start "rule__SignatureDeclaration__SigDefinitionsAssignment_7"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4042:1: rule__SignatureDeclaration__SigDefinitionsAssignment_7 : ( rulesigDefinitions ) ;
    public final void rule__SignatureDeclaration__SigDefinitionsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4046:1: ( ( rulesigDefinitions ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4047:1: ( rulesigDefinitions )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4047:1: ( rulesigDefinitions )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4048:1: rulesigDefinitions
            {
             before(grammarAccess.getSignatureDeclarationAccess().getSigDefinitionsSigDefinitionsParserRuleCall_7_0()); 
            pushFollow(FOLLOW_rulesigDefinitions_in_rule__SignatureDeclaration__SigDefinitionsAssignment_78233);
            rulesigDefinitions();

            state._fsp--;

             after(grammarAccess.getSignatureDeclarationAccess().getSigDefinitionsSigDefinitionsParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignatureDeclaration__SigDefinitionsAssignment_7"


    // $ANTLR start "rule__SigDefinitions__SymbNameAssignment_0_0"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4057:1: rule__SigDefinitions__SymbNameAssignment_0_0 : ( ruleGID ) ;
    public final void rule__SigDefinitions__SymbNameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4061:1: ( ( ruleGID ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4062:1: ( ruleGID )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4062:1: ( ruleGID )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4063:1: ruleGID
            {
             before(grammarAccess.getSigDefinitionsAccess().getSymbNameGIDParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleGID_in_rule__SigDefinitions__SymbNameAssignment_0_08264);
            ruleGID();

            state._fsp--;

             after(grammarAccess.getSigDefinitionsAccess().getSymbNameGIDParserRuleCall_0_0_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__SigDefinitions__NamespaceAssignment_1_2"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4072:1: rule__SigDefinitions__NamespaceAssignment_1_2 : ( ruleNAMESPACE ) ;
    public final void rule__SigDefinitions__NamespaceAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4076:1: ( ( ruleNAMESPACE ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4077:1: ( ruleNAMESPACE )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4077:1: ( ruleNAMESPACE )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4078:1: ruleNAMESPACE
            {
             before(grammarAccess.getSigDefinitionsAccess().getNamespaceNAMESPACEParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleNAMESPACE_in_rule__SigDefinitions__NamespaceAssignment_1_28295);
            ruleNAMESPACE();

            state._fsp--;

             after(grammarAccess.getSigDefinitionsAccess().getNamespaceNAMESPACEParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SigDefinitions__NamespaceAssignment_1_2"


    // $ANTLR start "rule__SigDefinitions__StructNameAssignment_2_2"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4087:1: rule__SigDefinitions__StructNameAssignment_2_2 : ( ruleGID ) ;
    public final void rule__SigDefinitions__StructNameAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4091:1: ( ( ruleGID ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4092:1: ( ruleGID )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4092:1: ( ruleGID )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4093:1: ruleGID
            {
             before(grammarAccess.getSigDefinitionsAccess().getStructNameGIDParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_ruleGID_in_rule__SigDefinitions__StructNameAssignment_2_28326);
            ruleGID();

            state._fsp--;

             after(grammarAccess.getSigDefinitionsAccess().getStructNameGIDParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SigDefinitions__StructNameAssignment_2_2"


    // $ANTLR start "rule__SigDefinitions__TmpAssignment_3_0"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4102:1: rule__SigDefinitions__TmpAssignment_3_0 : ( ( rule__SigDefinitions__TmpAlternatives_3_0_0 ) ) ;
    public final void rule__SigDefinitions__TmpAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4106:1: ( ( ( rule__SigDefinitions__TmpAlternatives_3_0_0 ) ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4107:1: ( ( rule__SigDefinitions__TmpAlternatives_3_0_0 ) )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4107:1: ( ( rule__SigDefinitions__TmpAlternatives_3_0_0 ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4108:1: ( rule__SigDefinitions__TmpAlternatives_3_0_0 )
            {
             before(grammarAccess.getSigDefinitionsAccess().getTmpAlternatives_3_0_0()); 
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4109:1: ( rule__SigDefinitions__TmpAlternatives_3_0_0 )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4109:2: rule__SigDefinitions__TmpAlternatives_3_0_0
            {
            pushFollow(FOLLOW_rule__SigDefinitions__TmpAlternatives_3_0_0_in_rule__SigDefinitions__TmpAssignment_3_08357);
            rule__SigDefinitions__TmpAlternatives_3_0_0();

            state._fsp--;


            }

             after(grammarAccess.getSigDefinitionsAccess().getTmpAlternatives_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SigDefinitions__TmpAssignment_3_0"


    // $ANTLR start "rule__ViewDeclaration__ViewIDAssignment_2"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4119:1: rule__ViewDeclaration__ViewIDAssignment_2 : ( ruleGID ) ;
    public final void rule__ViewDeclaration__ViewIDAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4123:1: ( ( ruleGID ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4124:1: ( ruleGID )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4124:1: ( ruleGID )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4125:1: ruleGID
            {
             before(grammarAccess.getViewDeclarationAccess().getViewIDGIDParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleGID_in_rule__ViewDeclaration__ViewIDAssignment_28391);
            ruleGID();

            state._fsp--;

             after(grammarAccess.getViewDeclarationAccess().getViewIDGIDParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewDeclaration__ViewIDAssignment_2"


    // $ANTLR start "rule__ViewDeclaration__FromAssignment_6"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4134:1: rule__ViewDeclaration__FromAssignment_6 : ( ruleNAMESPACE ) ;
    public final void rule__ViewDeclaration__FromAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4138:1: ( ( ruleNAMESPACE ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4139:1: ( ruleNAMESPACE )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4139:1: ( ruleNAMESPACE )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4140:1: ruleNAMESPACE
            {
             before(grammarAccess.getViewDeclarationAccess().getFromNAMESPACEParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleNAMESPACE_in_rule__ViewDeclaration__FromAssignment_68422);
            ruleNAMESPACE();

            state._fsp--;

             after(grammarAccess.getViewDeclarationAccess().getFromNAMESPACEParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewDeclaration__FromAssignment_6"


    // $ANTLR start "rule__ViewDeclaration__ToAssignment_10"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4149:1: rule__ViewDeclaration__ToAssignment_10 : ( ruleNAMESPACE ) ;
    public final void rule__ViewDeclaration__ToAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4153:1: ( ( ruleNAMESPACE ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4154:1: ( ruleNAMESPACE )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4154:1: ( ruleNAMESPACE )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4155:1: ruleNAMESPACE
            {
             before(grammarAccess.getViewDeclarationAccess().getToNAMESPACEParserRuleCall_10_0()); 
            pushFollow(FOLLOW_ruleNAMESPACE_in_rule__ViewDeclaration__ToAssignment_108453);
            ruleNAMESPACE();

            state._fsp--;

             after(grammarAccess.getViewDeclarationAccess().getToNAMESPACEParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewDeclaration__ToAssignment_10"


    // $ANTLR start "rule__ViewDeclaration__ViewDefinitionsAssignment_15"
    // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4164:1: rule__ViewDeclaration__ViewDefinitionsAssignment_15 : ( rulesigDefinitions ) ;
    public final void rule__ViewDeclaration__ViewDefinitionsAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4168:1: ( ( rulesigDefinitions ) )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4169:1: ( rulesigDefinitions )
            {
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4169:1: ( rulesigDefinitions )
            // ../info.kwarc.mmt.lf.ui/src-gen/info/kwarc/mmt/ui/contentassist/antlr/internal/InternalLF.g:4170:1: rulesigDefinitions
            {
             before(grammarAccess.getViewDeclarationAccess().getViewDefinitionsSigDefinitionsParserRuleCall_15_0()); 
            pushFollow(FOLLOW_rulesigDefinitions_in_rule__ViewDeclaration__ViewDefinitionsAssignment_158484);
            rulesigDefinitions();

            state._fsp--;

             after(grammarAccess.getViewDeclarationAccess().getViewDefinitionsSigDefinitionsParserRuleCall_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewDeclaration__ViewDefinitionsAssignment_15"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__DeclarationsAssignment_in_ruleModel94 = new BitSet(new long[]{0x00000041600000F2L});
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
    public static final BitSet FOLLOW_rulesignatureDeclaration_in_entryRulesignatureDeclaration664 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesignatureDeclaration671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group__0_in_rulesignatureDeclaration697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesigDefinitions_in_entryRulesigDefinitions724 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesigDefinitions731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Alternatives_in_rulesigDefinitions757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleincludeOps_in_entryRuleincludeOps784 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleincludeOps791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IncludeOps__Group__0_in_ruleincludeOps817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleviewDeclaration_in_entryRuleviewDeclaration846 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleviewDeclaration853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__0_in_ruleviewDeclaration879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenamespaceDeclaration_in_rule__Model__DeclarationsAlternatives_0915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesignatureDeclaration_in_rule__Model__DeclarationsAlternatives_0932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleviewDeclaration_in_rule__Model__DeclarationsAlternatives_0949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulereadDeclaration_in_rule__Model__DeclarationsAlternatives_0966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJUSTSPACE_in_rule__Model__DeclarationsAlternatives_0983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SP_in_rule__WS__Alternatives1015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_rule__WS__Alternatives1032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML2_COMMENT_in_rule__WS__Alternatives1049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_rule__WS__Alternatives1066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__NAMESPACE__Alternatives_2_01099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__NAMESPACE__Alternatives_2_01119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GID__Alternatives_0_in_rule__GID__Alternatives1155 = new BitSet(new long[]{0x0000000000000702L});
    public static final BitSet FOLLOW_rule__GID__Alternatives_0_in_rule__GID__Alternatives1167 = new BitSet(new long[]{0x0000000000000702L});
    public static final BitSet FOLLOW_rule__GID__Group_1__0_in_rule__GID__Alternatives1188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CID_in_rule__GID__Alternatives_01221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rule__GID__Alternatives_01238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__GID__Alternatives_01255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rule__SOMETHING__Alternatives1287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CID_in_rule__SOMETHING__Alternatives1304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__SOMETHING__Alternatives1321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SOMETHING__Group_3__0_in_rule__SOMETHING__Alternatives1338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__SOMETHING__Alternatives1357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__SOMETHING__Alternatives1377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__SOMETHING__Alternatives1397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__SOMETHING__Alternatives1417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__SOMETHING__Alternatives1437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__SOMETHING__Alternatives1457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SOMETHING__Group_10__0_in_rule__SOMETHING__Alternatives1476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__SOMETHING__Alternatives1494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_0__0_in_rule__SigDefinitions__Alternatives1527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_1__0_in_rule__SigDefinitions__Alternatives1545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_2__0_in_rule__SigDefinitions__Alternatives1563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_3__0_in_rule__SigDefinitions__Alternatives1581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJUSTSPACE_in_rule__SigDefinitions__Alternatives1599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__SigDefinitions__Alternatives_0_21632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__SigDefinitions__Alternatives_0_21652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__SigDefinitions__Alternatives_0_21672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__SigDefinitions__TmpAlternatives_3_0_01707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__SigDefinitions__TmpAlternatives_3_0_01727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__SigDefinitions__TmpAlternatives_3_0_01747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__SigDefinitions__TmpAlternatives_3_0_01767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__SigDefinitions__TmpAlternatives_3_0_01787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__SigDefinitions__TmpAlternatives_3_0_01807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NAMESPACE__Group__0__Impl_in_rule__NAMESPACE__Group__01840 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__NAMESPACE__Group__1_in_rule__NAMESPACE__Group__01843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__NAMESPACE__Group__0__Impl1872 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__NAMESPACE__Group__1__Impl_in_rule__NAMESPACE__Group__11905 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__NAMESPACE__Group__2_in_rule__NAMESPACE__Group__11908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CID_in_rule__NAMESPACE__Group__1__Impl1935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NAMESPACE__Group__2__Impl_in_rule__NAMESPACE__Group__21964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NAMESPACE__Group_2__0_in_rule__NAMESPACE__Group__2__Impl1991 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_rule__NAMESPACE__Group_2__0__Impl_in_rule__NAMESPACE__Group_2__02028 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__NAMESPACE__Group_2__1_in_rule__NAMESPACE__Group_2__02031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NAMESPACE__Alternatives_2_0_in_rule__NAMESPACE__Group_2__0__Impl2058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NAMESPACE__Group_2__1__Impl_in_rule__NAMESPACE__Group_2__12088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CID_in_rule__NAMESPACE__Group_2__1__Impl2115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group__0__Impl_in_rule__URI__Group__02148 = new BitSet(new long[]{0x0000000004000100L});
    public static final BitSet FOLLOW_rule__URI__Group__1_in_rule__URI__Group__02151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group_0__0_in_rule__URI__Group__0__Impl2178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group__1__Impl_in_rule__URI__Group__12209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNAMESPACE_in_rule__URI__Group__1__Impl2236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group_0__0__Impl_in_rule__URI__Group_0__02269 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__URI__Group_0__1_in_rule__URI__Group_0__02272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CID_in_rule__URI__Group_0__0__Impl2299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group_0__1__Impl_in_rule__URI__Group_0__12328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__URI__Group_0__1__Impl2356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URISTRING__Group__0__Impl_in_rule__URISTRING__Group__02391 = new BitSet(new long[]{0x0000000004000100L});
    public static final BitSet FOLLOW_rule__URISTRING__Group__1_in_rule__URISTRING__Group__02394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__URISTRING__Group__0__Impl2422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URISTRING__Group__1__Impl_in_rule__URISTRING__Group__12453 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__URISTRING__Group__2_in_rule__URISTRING__Group__12456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURI_in_rule__URISTRING__Group__1__Impl2483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URISTRING__Group__2__Impl_in_rule__URISTRING__Group__22512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__URISTRING__Group__2__Impl2540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group__0__Impl_in_rule__NamespaceDeclaration__Group__02577 = new BitSet(new long[]{0x00000041600000F0L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group__1_in_rule__NamespaceDeclaration__Group__02580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__NamespaceDeclaration__Group__0__Impl2608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group__1__Impl_in_rule__NamespaceDeclaration__Group__12639 = new BitSet(new long[]{0x0000000010000100L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group__2_in_rule__NamespaceDeclaration__Group__12642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__NamespaceDeclaration__Group__1__Impl2672 = new BitSet(new long[]{0x00000041600000F0L});
    public static final BitSet FOLLOW_ruleWS_in_rule__NamespaceDeclaration__Group__1__Impl2685 = new BitSet(new long[]{0x00000041600000F2L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group__2__Impl_in_rule__NamespaceDeclaration__Group__22718 = new BitSet(new long[]{0x0000000010000100L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group__3_in_rule__NamespaceDeclaration__Group__22721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group_2__0_in_rule__NamespaceDeclaration__Group__2__Impl2748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group__3__Impl_in_rule__NamespaceDeclaration__Group__32779 = new BitSet(new long[]{0x00000041600000F0L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group__4_in_rule__NamespaceDeclaration__Group__32782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__UriAssignment_3_in_rule__NamespaceDeclaration__Group__3__Impl2809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group__4__Impl_in_rule__NamespaceDeclaration__Group__42839 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group__5_in_rule__NamespaceDeclaration__Group__42842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__NamespaceDeclaration__Group__4__Impl2870 = new BitSet(new long[]{0x00000041600000F2L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group__5__Impl_in_rule__NamespaceDeclaration__Group__52901 = new BitSet(new long[]{0x00000041600000F0L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group__6_in_rule__NamespaceDeclaration__Group__52904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__NamespaceDeclaration__Group__5__Impl2932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group__6__Impl_in_rule__NamespaceDeclaration__Group__62963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__NamespaceDeclaration__Group__6__Impl2990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group_2__0__Impl_in_rule__NamespaceDeclaration__Group_2__03033 = new BitSet(new long[]{0x00000041600000F0L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group_2__1_in_rule__NamespaceDeclaration__Group_2__03036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__NameAssignment_2_0_in_rule__NamespaceDeclaration__Group_2__0__Impl3063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group_2__1__Impl_in_rule__NamespaceDeclaration__Group_2__13093 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group_2__2_in_rule__NamespaceDeclaration__Group_2__13096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__NamespaceDeclaration__Group_2__1__Impl3124 = new BitSet(new long[]{0x00000041600000F2L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group_2__2__Impl_in_rule__NamespaceDeclaration__Group_2__23155 = new BitSet(new long[]{0x00000041600000F0L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group_2__3_in_rule__NamespaceDeclaration__Group_2__23158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__NamespaceDeclaration__Group_2__2__Impl3186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group_2__3__Impl_in_rule__NamespaceDeclaration__Group_2__33217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__NamespaceDeclaration__Group_2__3__Impl3245 = new BitSet(new long[]{0x00000041600000F2L});
    public static final BitSet FOLLOW_rule__ReadDeclaration__Group__0__Impl_in_rule__ReadDeclaration__Group__03284 = new BitSet(new long[]{0x00000041600000F0L});
    public static final BitSet FOLLOW_rule__ReadDeclaration__Group__1_in_rule__ReadDeclaration__Group__03287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ReadDeclaration__Group__0__Impl3315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReadDeclaration__Group__1__Impl_in_rule__ReadDeclaration__Group__13346 = new BitSet(new long[]{0x0000000010000100L});
    public static final BitSet FOLLOW_rule__ReadDeclaration__Group__2_in_rule__ReadDeclaration__Group__13349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__ReadDeclaration__Group__1__Impl3379 = new BitSet(new long[]{0x00000041600000F0L});
    public static final BitSet FOLLOW_ruleWS_in_rule__ReadDeclaration__Group__1__Impl3392 = new BitSet(new long[]{0x00000041600000F2L});
    public static final BitSet FOLLOW_rule__ReadDeclaration__Group__2__Impl_in_rule__ReadDeclaration__Group__23425 = new BitSet(new long[]{0x00000041600000F0L});
    public static final BitSet FOLLOW_rule__ReadDeclaration__Group__3_in_rule__ReadDeclaration__Group__23428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReadDeclaration__FileAssignment_2_in_rule__ReadDeclaration__Group__2__Impl3455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReadDeclaration__Group__3__Impl_in_rule__ReadDeclaration__Group__33485 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__ReadDeclaration__Group__4_in_rule__ReadDeclaration__Group__33488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__ReadDeclaration__Group__3__Impl3516 = new BitSet(new long[]{0x00000041600000F2L});
    public static final BitSet FOLLOW_rule__ReadDeclaration__Group__4__Impl_in_rule__ReadDeclaration__Group__43547 = new BitSet(new long[]{0x00000041600000F0L});
    public static final BitSet FOLLOW_rule__ReadDeclaration__Group__5_in_rule__ReadDeclaration__Group__43550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ReadDeclaration__Group__4__Impl3578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReadDeclaration__Group__5__Impl_in_rule__ReadDeclaration__Group__53609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__ReadDeclaration__Group__5__Impl3636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GID__Group_1__0__Impl_in_rule__GID__Group_1__03677 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__GID__Group_1__1_in_rule__GID__Group_1__03680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__GID__Group_1__0__Impl3708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GID__Group_1__1__Impl_in_rule__GID__Group_1__13739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__GID__Group_1__1__Impl3768 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__SOMETHING__Group_3__0__Impl_in_rule__SOMETHING__Group_3__03805 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__SOMETHING__Group_3__1_in_rule__SOMETHING__Group_3__03808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__SOMETHING__Group_3__0__Impl3836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SOMETHING__Group_3__1__Impl_in_rule__SOMETHING__Group_3__13867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CID_in_rule__SOMETHING__Group_3__1__Impl3894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SOMETHING__Group_10__0__Impl_in_rule__SOMETHING__Group_10__03927 = new BitSet(new long[]{0x00000041600010F0L});
    public static final BitSet FOLLOW_rule__SOMETHING__Group_10__1_in_rule__SOMETHING__Group_10__03930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__SOMETHING__Group_10__0__Impl3958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SOMETHING__Group_10__1__Impl_in_rule__SOMETHING__Group_10__13989 = new BitSet(new long[]{0x00000041600010F0L});
    public static final BitSet FOLLOW_rule__SOMETHING__Group_10__2_in_rule__SOMETHING__Group_10__13992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__SOMETHING__Group_10__1__Impl4021 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__SOMETHING__Group_10__2__Impl_in_rule__SOMETHING__Group_10__24054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__SOMETHING__Group_10__2__Impl4081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group__0__Impl_in_rule__SignatureDeclaration__Group__04117 = new BitSet(new long[]{0x00000041600000F0L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group__1_in_rule__SignatureDeclaration__Group__04120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__SignatureDeclaration__Group__0__Impl4148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group__1__Impl_in_rule__SignatureDeclaration__Group__14179 = new BitSet(new long[]{0x0000000080000700L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group__2_in_rule__SignatureDeclaration__Group__14182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__SignatureDeclaration__Group__1__Impl4212 = new BitSet(new long[]{0x00000041600000F0L});
    public static final BitSet FOLLOW_ruleWS_in_rule__SignatureDeclaration__Group__1__Impl4225 = new BitSet(new long[]{0x00000041600000F2L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group__2__Impl_in_rule__SignatureDeclaration__Group__24258 = new BitSet(new long[]{0x00000041600000F0L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group__3_in_rule__SignatureDeclaration__Group__24261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__SigNameAssignment_2_in_rule__SignatureDeclaration__Group__2__Impl4288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group__3__Impl_in_rule__SignatureDeclaration__Group__34318 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group__4_in_rule__SignatureDeclaration__Group__34321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__SignatureDeclaration__Group__3__Impl4349 = new BitSet(new long[]{0x00000041600000F2L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group__4__Impl_in_rule__SignatureDeclaration__Group__44380 = new BitSet(new long[]{0x00000041600000F0L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group__5_in_rule__SignatureDeclaration__Group__44383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__SignatureDeclaration__Group__4__Impl4411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group__5__Impl_in_rule__SignatureDeclaration__Group__54442 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group__6_in_rule__SignatureDeclaration__Group__54445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__SignatureDeclaration__Group__5__Impl4473 = new BitSet(new long[]{0x00000041600000F2L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group__6__Impl_in_rule__SignatureDeclaration__Group__64504 = new BitSet(new long[]{0x0000005DE3F007F0L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group__7_in_rule__SignatureDeclaration__Group__64507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__SignatureDeclaration__Group__6__Impl4535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group__7__Impl_in_rule__SignatureDeclaration__Group__74566 = new BitSet(new long[]{0x0000005DE3F007F0L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group__8_in_rule__SignatureDeclaration__Group__74569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__SigDefinitionsAssignment_7_in_rule__SignatureDeclaration__Group__7__Impl4596 = new BitSet(new long[]{0x00000059E3F007F2L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group__8__Impl_in_rule__SignatureDeclaration__Group__84627 = new BitSet(new long[]{0x00000041600000F0L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group__9_in_rule__SignatureDeclaration__Group__84630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__SignatureDeclaration__Group__8__Impl4658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group__9__Impl_in_rule__SignatureDeclaration__Group__94689 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group__10_in_rule__SignatureDeclaration__Group__94692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__SignatureDeclaration__Group__9__Impl4720 = new BitSet(new long[]{0x00000041600000F2L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group__10__Impl_in_rule__SignatureDeclaration__Group__104751 = new BitSet(new long[]{0x00000041600000F0L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group__11_in_rule__SignatureDeclaration__Group__104754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__SignatureDeclaration__Group__10__Impl4782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group__11__Impl_in_rule__SignatureDeclaration__Group__114813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__SignatureDeclaration__Group__11__Impl4840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_0__0__Impl_in_rule__SigDefinitions__Group_0__04893 = new BitSet(new long[]{0x00000041600000F0L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_0__1_in_rule__SigDefinitions__Group_0__04896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__SymbNameAssignment_0_0_in_rule__SigDefinitions__Group_0__0__Impl4923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_0__1__Impl_in_rule__SigDefinitions__Group_0__14953 = new BitSet(new long[]{0x0000000000086000L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_0__2_in_rule__SigDefinitions__Group_0__14956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__SigDefinitions__Group_0__1__Impl4984 = new BitSet(new long[]{0x00000041600000F2L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_0__2__Impl_in_rule__SigDefinitions__Group_0__25015 = new BitSet(new long[]{0x00000041E007F7F0L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_0__3_in_rule__SigDefinitions__Group_0__25018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Alternatives_0_2_in_rule__SigDefinitions__Group_0__2__Impl5045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_0__3__Impl_in_rule__SigDefinitions__Group_0__35075 = new BitSet(new long[]{0x00000041E007F7F0L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_0__4_in_rule__SigDefinitions__Group_0__35078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSOMETHING_in_rule__SigDefinitions__Group_0__3__Impl5106 = new BitSet(new long[]{0x00000041E007F7F2L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_0__4__Impl_in_rule__SigDefinitions__Group_0__45137 = new BitSet(new long[]{0x00000041600000F0L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_0__5_in_rule__SigDefinitions__Group_0__45140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__SigDefinitions__Group_0__4__Impl5168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_0__5__Impl_in_rule__SigDefinitions__Group_0__55199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__SigDefinitions__Group_0__5__Impl5226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_1__0__Impl_in_rule__SigDefinitions__Group_1__05267 = new BitSet(new long[]{0x00000041600000F0L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_1__1_in_rule__SigDefinitions__Group_1__05270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__SigDefinitions__Group_1__0__Impl5298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_1__1__Impl_in_rule__SigDefinitions__Group_1__15329 = new BitSet(new long[]{0x0000000004000100L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_1__2_in_rule__SigDefinitions__Group_1__15332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__SigDefinitions__Group_1__1__Impl5362 = new BitSet(new long[]{0x00000041600000F0L});
    public static final BitSet FOLLOW_ruleWS_in_rule__SigDefinitions__Group_1__1__Impl5375 = new BitSet(new long[]{0x00000041600000F2L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_1__2__Impl_in_rule__SigDefinitions__Group_1__25408 = new BitSet(new long[]{0x00000041600010F0L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_1__3_in_rule__SigDefinitions__Group_1__25411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__NamespaceAssignment_1_2_in_rule__SigDefinitions__Group_1__2__Impl5438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_1__3__Impl_in_rule__SigDefinitions__Group_1__35468 = new BitSet(new long[]{0x00000041600010F0L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_1__4_in_rule__SigDefinitions__Group_1__35471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_1_3__0_in_rule__SigDefinitions__Group_1__3__Impl5498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_1__4__Impl_in_rule__SigDefinitions__Group_1__45529 = new BitSet(new long[]{0x00000041600000F0L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_1__5_in_rule__SigDefinitions__Group_1__45532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__SigDefinitions__Group_1__4__Impl5560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_1__5__Impl_in_rule__SigDefinitions__Group_1__55591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__SigDefinitions__Group_1__5__Impl5618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_1_3__0__Impl_in_rule__SigDefinitions__Group_1_3__05659 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_1_3__1_in_rule__SigDefinitions__Group_1_3__05662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__SigDefinitions__Group_1_3__0__Impl5692 = new BitSet(new long[]{0x00000041600000F0L});
    public static final BitSet FOLLOW_ruleWS_in_rule__SigDefinitions__Group_1_3__0__Impl5705 = new BitSet(new long[]{0x00000041600000F2L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_1_3__1__Impl_in_rule__SigDefinitions__Group_1_3__15738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleincludeOps_in_rule__SigDefinitions__Group_1_3__1__Impl5765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_2__0__Impl_in_rule__SigDefinitions__Group_2__05798 = new BitSet(new long[]{0x00000041600000F0L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_2__1_in_rule__SigDefinitions__Group_2__05801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__SigDefinitions__Group_2__0__Impl5829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_2__1__Impl_in_rule__SigDefinitions__Group_2__15860 = new BitSet(new long[]{0x0000000080000700L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_2__2_in_rule__SigDefinitions__Group_2__15863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__SigDefinitions__Group_2__1__Impl5893 = new BitSet(new long[]{0x00000041600000F0L});
    public static final BitSet FOLLOW_ruleWS_in_rule__SigDefinitions__Group_2__1__Impl5906 = new BitSet(new long[]{0x00000041600000F2L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_2__2__Impl_in_rule__SigDefinitions__Group_2__25939 = new BitSet(new long[]{0x00000041600000F0L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_2__3_in_rule__SigDefinitions__Group_2__25942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__StructNameAssignment_2_2_in_rule__SigDefinitions__Group_2__2__Impl5969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_2__3__Impl_in_rule__SigDefinitions__Group_2__35999 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_2__4_in_rule__SigDefinitions__Group_2__36002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__SigDefinitions__Group_2__3__Impl6030 = new BitSet(new long[]{0x00000041600000F2L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_2__4__Impl_in_rule__SigDefinitions__Group_2__46061 = new BitSet(new long[]{0x00000061E007F7F0L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_2__5_in_rule__SigDefinitions__Group_2__46064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__SigDefinitions__Group_2__4__Impl6092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_2__5__Impl_in_rule__SigDefinitions__Group_2__56123 = new BitSet(new long[]{0x00000061E007F7F0L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_2__6_in_rule__SigDefinitions__Group_2__56126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSOMETHING_in_rule__SigDefinitions__Group_2__5__Impl6154 = new BitSet(new long[]{0x00000041E007F7F2L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_2__6__Impl_in_rule__SigDefinitions__Group_2__66185 = new BitSet(new long[]{0x00000061E007F7F0L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_2__7_in_rule__SigDefinitions__Group_2__66188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleincludeOps_in_rule__SigDefinitions__Group_2__6__Impl6216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_2__7__Impl_in_rule__SigDefinitions__Group_2__76247 = new BitSet(new long[]{0x00000041600000F0L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_2__8_in_rule__SigDefinitions__Group_2__76250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__SigDefinitions__Group_2__7__Impl6278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_2__8__Impl_in_rule__SigDefinitions__Group_2__86309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__SigDefinitions__Group_2__8__Impl6336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_3__0__Impl_in_rule__SigDefinitions__Group_3__06383 = new BitSet(new long[]{0x00000041E007F7F0L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_3__1_in_rule__SigDefinitions__Group_3__06386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__TmpAssignment_3_0_in_rule__SigDefinitions__Group_3__0__Impl6413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_3__1__Impl_in_rule__SigDefinitions__Group_3__16443 = new BitSet(new long[]{0x00000041E007F7F0L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_3__2_in_rule__SigDefinitions__Group_3__16446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSOMETHING_in_rule__SigDefinitions__Group_3__1__Impl6474 = new BitSet(new long[]{0x00000041E007F7F2L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_3__2__Impl_in_rule__SigDefinitions__Group_3__26505 = new BitSet(new long[]{0x00000041600000F0L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_3__3_in_rule__SigDefinitions__Group_3__26508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__SigDefinitions__Group_3__2__Impl6536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_3__3__Impl_in_rule__SigDefinitions__Group_3__36567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__SigDefinitions__Group_3__3__Impl6594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IncludeOps__Group__0__Impl_in_rule__IncludeOps__Group__06631 = new BitSet(new long[]{0x00000041E007F7F0L});
    public static final BitSet FOLLOW_rule__IncludeOps__Group__1_in_rule__IncludeOps__Group__06634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__IncludeOps__Group__0__Impl6662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IncludeOps__Group__1__Impl_in_rule__IncludeOps__Group__16693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSOMETHING_in_rule__IncludeOps__Group__1__Impl6721 = new BitSet(new long[]{0x00000041E007F7F2L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__0__Impl_in_rule__ViewDeclaration__Group__06756 = new BitSet(new long[]{0x00000041600000F0L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__1_in_rule__ViewDeclaration__Group__06759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__ViewDeclaration__Group__0__Impl6787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__1__Impl_in_rule__ViewDeclaration__Group__16818 = new BitSet(new long[]{0x0000000080000700L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__2_in_rule__ViewDeclaration__Group__16821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__ViewDeclaration__Group__1__Impl6851 = new BitSet(new long[]{0x00000041600000F0L});
    public static final BitSet FOLLOW_ruleWS_in_rule__ViewDeclaration__Group__1__Impl6864 = new BitSet(new long[]{0x00000041600000F2L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__2__Impl_in_rule__ViewDeclaration__Group__26897 = new BitSet(new long[]{0x00000041600000F0L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__3_in_rule__ViewDeclaration__Group__26900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__ViewIDAssignment_2_in_rule__ViewDeclaration__Group__2__Impl6927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__3__Impl_in_rule__ViewDeclaration__Group__36957 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__4_in_rule__ViewDeclaration__Group__36960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__ViewDeclaration__Group__3__Impl6988 = new BitSet(new long[]{0x00000041600000F2L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__4__Impl_in_rule__ViewDeclaration__Group__47019 = new BitSet(new long[]{0x00000041600000F0L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__5_in_rule__ViewDeclaration__Group__47022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ViewDeclaration__Group__4__Impl7050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__5__Impl_in_rule__ViewDeclaration__Group__57081 = new BitSet(new long[]{0x0000000004000100L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__6_in_rule__ViewDeclaration__Group__57084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__ViewDeclaration__Group__5__Impl7112 = new BitSet(new long[]{0x00000041600000F2L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__6__Impl_in_rule__ViewDeclaration__Group__67143 = new BitSet(new long[]{0x00000041600000F0L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__7_in_rule__ViewDeclaration__Group__67146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__FromAssignment_6_in_rule__ViewDeclaration__Group__6__Impl7173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__7__Impl_in_rule__ViewDeclaration__Group__77203 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__8_in_rule__ViewDeclaration__Group__77206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__ViewDeclaration__Group__7__Impl7234 = new BitSet(new long[]{0x00000041600000F2L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__8__Impl_in_rule__ViewDeclaration__Group__87265 = new BitSet(new long[]{0x00000041600000F0L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__9_in_rule__ViewDeclaration__Group__87268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ViewDeclaration__Group__8__Impl7296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__9__Impl_in_rule__ViewDeclaration__Group__97327 = new BitSet(new long[]{0x0000000004000100L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__10_in_rule__ViewDeclaration__Group__97330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__ViewDeclaration__Group__9__Impl7358 = new BitSet(new long[]{0x00000041600000F2L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__10__Impl_in_rule__ViewDeclaration__Group__107389 = new BitSet(new long[]{0x00000041600000F0L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__11_in_rule__ViewDeclaration__Group__107392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__ToAssignment_10_in_rule__ViewDeclaration__Group__10__Impl7419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__11__Impl_in_rule__ViewDeclaration__Group__117449 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__12_in_rule__ViewDeclaration__Group__117452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__ViewDeclaration__Group__11__Impl7480 = new BitSet(new long[]{0x00000041600000F2L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__12__Impl_in_rule__ViewDeclaration__Group__127511 = new BitSet(new long[]{0x00000041600000F0L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__13_in_rule__ViewDeclaration__Group__127514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ViewDeclaration__Group__12__Impl7542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__13__Impl_in_rule__ViewDeclaration__Group__137573 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__14_in_rule__ViewDeclaration__Group__137576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__ViewDeclaration__Group__13__Impl7604 = new BitSet(new long[]{0x00000041600000F2L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__14__Impl_in_rule__ViewDeclaration__Group__147635 = new BitSet(new long[]{0x0000005DE3F007F0L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__15_in_rule__ViewDeclaration__Group__147638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ViewDeclaration__Group__14__Impl7666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__15__Impl_in_rule__ViewDeclaration__Group__157697 = new BitSet(new long[]{0x0000005DE3F007F0L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__16_in_rule__ViewDeclaration__Group__157700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__ViewDefinitionsAssignment_15_in_rule__ViewDeclaration__Group__15__Impl7727 = new BitSet(new long[]{0x00000059E3F007F2L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__16__Impl_in_rule__ViewDeclaration__Group__167758 = new BitSet(new long[]{0x00000041600000F0L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__17_in_rule__ViewDeclaration__Group__167761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__ViewDeclaration__Group__16__Impl7789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__17__Impl_in_rule__ViewDeclaration__Group__177820 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__18_in_rule__ViewDeclaration__Group__177823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__ViewDeclaration__Group__17__Impl7851 = new BitSet(new long[]{0x00000041600000F2L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__18__Impl_in_rule__ViewDeclaration__Group__187882 = new BitSet(new long[]{0x00000041600000F0L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__19_in_rule__ViewDeclaration__Group__187885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ViewDeclaration__Group__18__Impl7913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewDeclaration__Group__19__Impl_in_rule__ViewDeclaration__Group__197944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__ViewDeclaration__Group__19__Impl7971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__DeclarationsAlternatives_0_in_rule__Model__DeclarationsAssignment8045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_rule__JUSTSPACE__JAssignment8078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CID_in_rule__NamespaceDeclaration__NameAssignment_2_08109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURISTRING_in_rule__NamespaceDeclaration__UriAssignment_38140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURISTRING_in_rule__ReadDeclaration__FileAssignment_28171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGID_in_rule__SignatureDeclaration__SigNameAssignment_28202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesigDefinitions_in_rule__SignatureDeclaration__SigDefinitionsAssignment_78233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGID_in_rule__SigDefinitions__SymbNameAssignment_0_08264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNAMESPACE_in_rule__SigDefinitions__NamespaceAssignment_1_28295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGID_in_rule__SigDefinitions__StructNameAssignment_2_28326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__TmpAlternatives_3_0_0_in_rule__SigDefinitions__TmpAssignment_3_08357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGID_in_rule__ViewDeclaration__ViewIDAssignment_28391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNAMESPACE_in_rule__ViewDeclaration__FromAssignment_68422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNAMESPACE_in_rule__ViewDeclaration__ToAssignment_108453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesigDefinitions_in_rule__ViewDeclaration__ViewDefinitionsAssignment_158484 = new BitSet(new long[]{0x0000000000000002L});

}