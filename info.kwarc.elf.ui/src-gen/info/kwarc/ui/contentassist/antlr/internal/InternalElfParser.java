package info.kwarc.ui.contentassist.antlr.internal; 

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
import info.kwarc.services.ElfGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalElfParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_URI", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_ML2_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'%namespace'", "'.'", "'='", "'%sig'", "'{'", "'}'", "':'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=7;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_ML2_COMMENT=9;
    public static final int RULE_INT=6;
    public static final int RULE_WS=11;
    public static final int RULE_URI=5;
    public static final int RULE_SL_COMMENT=10;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;

        public InternalElfParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g"; }


     
     	private ElfGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ElfGrammarAccess grammarAccess) {
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




    // $ANTLR start entryRuleModel
    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:61:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:62:1: ( ruleModel EOF )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:63:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();
            _fsp--;

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
    // $ANTLR end entryRuleModel


    // $ANTLR start ruleModel
    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:70:1: ruleModel : ( ( rule__Model__DeclarationsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:74:2: ( ( ( rule__Model__DeclarationsAssignment )* ) )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:75:1: ( ( rule__Model__DeclarationsAssignment )* )
            {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:75:1: ( ( rule__Model__DeclarationsAssignment )* )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:76:1: ( rule__Model__DeclarationsAssignment )*
            {
             before(grammarAccess.getModelAccess().getDeclarationsAssignment()); 
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:77:1: ( rule__Model__DeclarationsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13||LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:77:2: rule__Model__DeclarationsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Model__DeclarationsAssignment_in_ruleModel94);
            	    rule__Model__DeclarationsAssignment();
            	    _fsp--;


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
    // $ANTLR end ruleModel


    // $ANTLR start entryRulenamespaceDeclaration
    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:89:1: entryRulenamespaceDeclaration : rulenamespaceDeclaration EOF ;
    public final void entryRulenamespaceDeclaration() throws RecognitionException {
        try {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:90:1: ( rulenamespaceDeclaration EOF )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:91:1: rulenamespaceDeclaration EOF
            {
             before(grammarAccess.getNamespaceDeclarationRule()); 
            pushFollow(FOLLOW_rulenamespaceDeclaration_in_entryRulenamespaceDeclaration122);
            rulenamespaceDeclaration();
            _fsp--;

             after(grammarAccess.getNamespaceDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulenamespaceDeclaration129); 

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
    // $ANTLR end entryRulenamespaceDeclaration


    // $ANTLR start rulenamespaceDeclaration
    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:98:1: rulenamespaceDeclaration : ( ( rule__NamespaceDeclaration__Group__0 ) ) ;
    public final void rulenamespaceDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:102:2: ( ( ( rule__NamespaceDeclaration__Group__0 ) ) )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:103:1: ( ( rule__NamespaceDeclaration__Group__0 ) )
            {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:103:1: ( ( rule__NamespaceDeclaration__Group__0 ) )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:104:1: ( rule__NamespaceDeclaration__Group__0 )
            {
             before(grammarAccess.getNamespaceDeclarationAccess().getGroup()); 
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:105:1: ( rule__NamespaceDeclaration__Group__0 )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:105:2: rule__NamespaceDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group__0_in_rulenamespaceDeclaration155);
            rule__NamespaceDeclaration__Group__0();
            _fsp--;


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
    // $ANTLR end rulenamespaceDeclaration


    // $ANTLR start entryRulesignatureDeclaration
    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:117:1: entryRulesignatureDeclaration : rulesignatureDeclaration EOF ;
    public final void entryRulesignatureDeclaration() throws RecognitionException {
        try {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:118:1: ( rulesignatureDeclaration EOF )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:119:1: rulesignatureDeclaration EOF
            {
             before(grammarAccess.getSignatureDeclarationRule()); 
            pushFollow(FOLLOW_rulesignatureDeclaration_in_entryRulesignatureDeclaration182);
            rulesignatureDeclaration();
            _fsp--;

             after(grammarAccess.getSignatureDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulesignatureDeclaration189); 

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
    // $ANTLR end entryRulesignatureDeclaration


    // $ANTLR start rulesignatureDeclaration
    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:126:1: rulesignatureDeclaration : ( ( rule__SignatureDeclaration__Group__0 ) ) ;
    public final void rulesignatureDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:130:2: ( ( ( rule__SignatureDeclaration__Group__0 ) ) )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:131:1: ( ( rule__SignatureDeclaration__Group__0 ) )
            {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:131:1: ( ( rule__SignatureDeclaration__Group__0 ) )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:132:1: ( rule__SignatureDeclaration__Group__0 )
            {
             before(grammarAccess.getSignatureDeclarationAccess().getGroup()); 
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:133:1: ( rule__SignatureDeclaration__Group__0 )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:133:2: rule__SignatureDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__SignatureDeclaration__Group__0_in_rulesignatureDeclaration215);
            rule__SignatureDeclaration__Group__0();
            _fsp--;


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
    // $ANTLR end rulesignatureDeclaration


    // $ANTLR start entryRulesigDefinitions
    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:145:1: entryRulesigDefinitions : rulesigDefinitions EOF ;
    public final void entryRulesigDefinitions() throws RecognitionException {
        try {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:146:1: ( rulesigDefinitions EOF )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:147:1: rulesigDefinitions EOF
            {
             before(grammarAccess.getSigDefinitionsRule()); 
            pushFollow(FOLLOW_rulesigDefinitions_in_entryRulesigDefinitions242);
            rulesigDefinitions();
            _fsp--;

             after(grammarAccess.getSigDefinitionsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulesigDefinitions249); 

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
    // $ANTLR end entryRulesigDefinitions


    // $ANTLR start rulesigDefinitions
    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:154:1: rulesigDefinitions : ( ( rule__SigDefinitions__Group__0 ) ) ;
    public final void rulesigDefinitions() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:158:2: ( ( ( rule__SigDefinitions__Group__0 ) ) )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:159:1: ( ( rule__SigDefinitions__Group__0 ) )
            {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:159:1: ( ( rule__SigDefinitions__Group__0 ) )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:160:1: ( rule__SigDefinitions__Group__0 )
            {
             before(grammarAccess.getSigDefinitionsAccess().getGroup()); 
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:161:1: ( rule__SigDefinitions__Group__0 )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:161:2: rule__SigDefinitions__Group__0
            {
            pushFollow(FOLLOW_rule__SigDefinitions__Group__0_in_rulesigDefinitions275);
            rule__SigDefinitions__Group__0();
            _fsp--;


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
    // $ANTLR end rulesigDefinitions


    // $ANTLR start rule__Model__DeclarationsAlternatives_0
    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:175:1: rule__Model__DeclarationsAlternatives_0 : ( ( rulenamespaceDeclaration ) | ( rulesignatureDeclaration ) );
    public final void rule__Model__DeclarationsAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:179:1: ( ( rulenamespaceDeclaration ) | ( rulesignatureDeclaration ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            else if ( (LA2_0==16) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("175:1: rule__Model__DeclarationsAlternatives_0 : ( ( rulenamespaceDeclaration ) | ( rulesignatureDeclaration ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:180:1: ( rulenamespaceDeclaration )
                    {
                    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:180:1: ( rulenamespaceDeclaration )
                    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:181:1: rulenamespaceDeclaration
                    {
                     before(grammarAccess.getModelAccess().getDeclarationsNamespaceDeclarationParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_rulenamespaceDeclaration_in_rule__Model__DeclarationsAlternatives_0313);
                    rulenamespaceDeclaration();
                    _fsp--;

                     after(grammarAccess.getModelAccess().getDeclarationsNamespaceDeclarationParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:186:6: ( rulesignatureDeclaration )
                    {
                    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:186:6: ( rulesignatureDeclaration )
                    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:187:1: rulesignatureDeclaration
                    {
                     before(grammarAccess.getModelAccess().getDeclarationsSignatureDeclarationParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_rulesignatureDeclaration_in_rule__Model__DeclarationsAlternatives_0330);
                    rulesignatureDeclaration();
                    _fsp--;

                     after(grammarAccess.getModelAccess().getDeclarationsSignatureDeclarationParserRuleCall_0_1()); 

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
    // $ANTLR end rule__Model__DeclarationsAlternatives_0


    // $ANTLR start rule__NamespaceDeclaration__Alternatives_1
    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:197:1: rule__NamespaceDeclaration__Alternatives_1 : ( ( ( rule__NamespaceDeclaration__Group_1_0__0 ) ) | ( ( rule__NamespaceDeclaration__UriAssignment_1_1 ) ) );
    public final void rule__NamespaceDeclaration__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:201:1: ( ( ( rule__NamespaceDeclaration__Group_1_0__0 ) ) | ( ( rule__NamespaceDeclaration__UriAssignment_1_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_URI) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("197:1: rule__NamespaceDeclaration__Alternatives_1 : ( ( ( rule__NamespaceDeclaration__Group_1_0__0 ) ) | ( ( rule__NamespaceDeclaration__UriAssignment_1_1 ) ) );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:202:1: ( ( rule__NamespaceDeclaration__Group_1_0__0 ) )
                    {
                    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:202:1: ( ( rule__NamespaceDeclaration__Group_1_0__0 ) )
                    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:203:1: ( rule__NamespaceDeclaration__Group_1_0__0 )
                    {
                     before(grammarAccess.getNamespaceDeclarationAccess().getGroup_1_0()); 
                    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:204:1: ( rule__NamespaceDeclaration__Group_1_0__0 )
                    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:204:2: rule__NamespaceDeclaration__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__NamespaceDeclaration__Group_1_0__0_in_rule__NamespaceDeclaration__Alternatives_1362);
                    rule__NamespaceDeclaration__Group_1_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getNamespaceDeclarationAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:208:6: ( ( rule__NamespaceDeclaration__UriAssignment_1_1 ) )
                    {
                    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:208:6: ( ( rule__NamespaceDeclaration__UriAssignment_1_1 ) )
                    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:209:1: ( rule__NamespaceDeclaration__UriAssignment_1_1 )
                    {
                     before(grammarAccess.getNamespaceDeclarationAccess().getUriAssignment_1_1()); 
                    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:210:1: ( rule__NamespaceDeclaration__UriAssignment_1_1 )
                    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:210:2: rule__NamespaceDeclaration__UriAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__NamespaceDeclaration__UriAssignment_1_1_in_rule__NamespaceDeclaration__Alternatives_1380);
                    rule__NamespaceDeclaration__UriAssignment_1_1();
                    _fsp--;


                    }

                     after(grammarAccess.getNamespaceDeclarationAccess().getUriAssignment_1_1()); 

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
    // $ANTLR end rule__NamespaceDeclaration__Alternatives_1


    // $ANTLR start rule__NamespaceDeclaration__Group__0
    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:222:1: rule__NamespaceDeclaration__Group__0 : rule__NamespaceDeclaration__Group__0__Impl rule__NamespaceDeclaration__Group__1 ;
    public final void rule__NamespaceDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:226:1: ( rule__NamespaceDeclaration__Group__0__Impl rule__NamespaceDeclaration__Group__1 )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:227:2: rule__NamespaceDeclaration__Group__0__Impl rule__NamespaceDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group__0__Impl_in_rule__NamespaceDeclaration__Group__0412);
            rule__NamespaceDeclaration__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group__1_in_rule__NamespaceDeclaration__Group__0415);
            rule__NamespaceDeclaration__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NamespaceDeclaration__Group__0


    // $ANTLR start rule__NamespaceDeclaration__Group__0__Impl
    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:234:1: rule__NamespaceDeclaration__Group__0__Impl : ( '%namespace' ) ;
    public final void rule__NamespaceDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:238:1: ( ( '%namespace' ) )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:239:1: ( '%namespace' )
            {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:239:1: ( '%namespace' )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:240:1: '%namespace'
            {
             before(grammarAccess.getNamespaceDeclarationAccess().getNamespaceKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__NamespaceDeclaration__Group__0__Impl443); 
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
    // $ANTLR end rule__NamespaceDeclaration__Group__0__Impl


    // $ANTLR start rule__NamespaceDeclaration__Group__1
    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:253:1: rule__NamespaceDeclaration__Group__1 : rule__NamespaceDeclaration__Group__1__Impl rule__NamespaceDeclaration__Group__2 ;
    public final void rule__NamespaceDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:257:1: ( rule__NamespaceDeclaration__Group__1__Impl rule__NamespaceDeclaration__Group__2 )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:258:2: rule__NamespaceDeclaration__Group__1__Impl rule__NamespaceDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group__1__Impl_in_rule__NamespaceDeclaration__Group__1474);
            rule__NamespaceDeclaration__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group__2_in_rule__NamespaceDeclaration__Group__1477);
            rule__NamespaceDeclaration__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NamespaceDeclaration__Group__1


    // $ANTLR start rule__NamespaceDeclaration__Group__1__Impl
    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:265:1: rule__NamespaceDeclaration__Group__1__Impl : ( ( rule__NamespaceDeclaration__Alternatives_1 ) ) ;
    public final void rule__NamespaceDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:269:1: ( ( ( rule__NamespaceDeclaration__Alternatives_1 ) ) )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:270:1: ( ( rule__NamespaceDeclaration__Alternatives_1 ) )
            {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:270:1: ( ( rule__NamespaceDeclaration__Alternatives_1 ) )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:271:1: ( rule__NamespaceDeclaration__Alternatives_1 )
            {
             before(grammarAccess.getNamespaceDeclarationAccess().getAlternatives_1()); 
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:272:1: ( rule__NamespaceDeclaration__Alternatives_1 )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:272:2: rule__NamespaceDeclaration__Alternatives_1
            {
            pushFollow(FOLLOW_rule__NamespaceDeclaration__Alternatives_1_in_rule__NamespaceDeclaration__Group__1__Impl504);
            rule__NamespaceDeclaration__Alternatives_1();
            _fsp--;


            }

             after(grammarAccess.getNamespaceDeclarationAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NamespaceDeclaration__Group__1__Impl


    // $ANTLR start rule__NamespaceDeclaration__Group__2
    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:282:1: rule__NamespaceDeclaration__Group__2 : rule__NamespaceDeclaration__Group__2__Impl ;
    public final void rule__NamespaceDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:286:1: ( rule__NamespaceDeclaration__Group__2__Impl )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:287:2: rule__NamespaceDeclaration__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group__2__Impl_in_rule__NamespaceDeclaration__Group__2534);
            rule__NamespaceDeclaration__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NamespaceDeclaration__Group__2


    // $ANTLR start rule__NamespaceDeclaration__Group__2__Impl
    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:293:1: rule__NamespaceDeclaration__Group__2__Impl : ( '.' ) ;
    public final void rule__NamespaceDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:297:1: ( ( '.' ) )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:298:1: ( '.' )
            {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:298:1: ( '.' )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:299:1: '.'
            {
             before(grammarAccess.getNamespaceDeclarationAccess().getFullStopKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__NamespaceDeclaration__Group__2__Impl562); 
             after(grammarAccess.getNamespaceDeclarationAccess().getFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NamespaceDeclaration__Group__2__Impl


    // $ANTLR start rule__NamespaceDeclaration__Group_1_0__0
    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:318:1: rule__NamespaceDeclaration__Group_1_0__0 : rule__NamespaceDeclaration__Group_1_0__0__Impl rule__NamespaceDeclaration__Group_1_0__1 ;
    public final void rule__NamespaceDeclaration__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:322:1: ( rule__NamespaceDeclaration__Group_1_0__0__Impl rule__NamespaceDeclaration__Group_1_0__1 )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:323:2: rule__NamespaceDeclaration__Group_1_0__0__Impl rule__NamespaceDeclaration__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group_1_0__0__Impl_in_rule__NamespaceDeclaration__Group_1_0__0599);
            rule__NamespaceDeclaration__Group_1_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group_1_0__1_in_rule__NamespaceDeclaration__Group_1_0__0602);
            rule__NamespaceDeclaration__Group_1_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NamespaceDeclaration__Group_1_0__0


    // $ANTLR start rule__NamespaceDeclaration__Group_1_0__0__Impl
    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:330:1: rule__NamespaceDeclaration__Group_1_0__0__Impl : ( ( rule__NamespaceDeclaration__NameAssignment_1_0_0 ) ) ;
    public final void rule__NamespaceDeclaration__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:334:1: ( ( ( rule__NamespaceDeclaration__NameAssignment_1_0_0 ) ) )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:335:1: ( ( rule__NamespaceDeclaration__NameAssignment_1_0_0 ) )
            {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:335:1: ( ( rule__NamespaceDeclaration__NameAssignment_1_0_0 ) )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:336:1: ( rule__NamespaceDeclaration__NameAssignment_1_0_0 )
            {
             before(grammarAccess.getNamespaceDeclarationAccess().getNameAssignment_1_0_0()); 
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:337:1: ( rule__NamespaceDeclaration__NameAssignment_1_0_0 )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:337:2: rule__NamespaceDeclaration__NameAssignment_1_0_0
            {
            pushFollow(FOLLOW_rule__NamespaceDeclaration__NameAssignment_1_0_0_in_rule__NamespaceDeclaration__Group_1_0__0__Impl629);
            rule__NamespaceDeclaration__NameAssignment_1_0_0();
            _fsp--;


            }

             after(grammarAccess.getNamespaceDeclarationAccess().getNameAssignment_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NamespaceDeclaration__Group_1_0__0__Impl


    // $ANTLR start rule__NamespaceDeclaration__Group_1_0__1
    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:347:1: rule__NamespaceDeclaration__Group_1_0__1 : rule__NamespaceDeclaration__Group_1_0__1__Impl rule__NamespaceDeclaration__Group_1_0__2 ;
    public final void rule__NamespaceDeclaration__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:351:1: ( rule__NamespaceDeclaration__Group_1_0__1__Impl rule__NamespaceDeclaration__Group_1_0__2 )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:352:2: rule__NamespaceDeclaration__Group_1_0__1__Impl rule__NamespaceDeclaration__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group_1_0__1__Impl_in_rule__NamespaceDeclaration__Group_1_0__1659);
            rule__NamespaceDeclaration__Group_1_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group_1_0__2_in_rule__NamespaceDeclaration__Group_1_0__1662);
            rule__NamespaceDeclaration__Group_1_0__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NamespaceDeclaration__Group_1_0__1


    // $ANTLR start rule__NamespaceDeclaration__Group_1_0__1__Impl
    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:359:1: rule__NamespaceDeclaration__Group_1_0__1__Impl : ( '=' ) ;
    public final void rule__NamespaceDeclaration__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:363:1: ( ( '=' ) )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:364:1: ( '=' )
            {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:364:1: ( '=' )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:365:1: '='
            {
             before(grammarAccess.getNamespaceDeclarationAccess().getEqualsSignKeyword_1_0_1()); 
            match(input,15,FOLLOW_15_in_rule__NamespaceDeclaration__Group_1_0__1__Impl690); 
             after(grammarAccess.getNamespaceDeclarationAccess().getEqualsSignKeyword_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NamespaceDeclaration__Group_1_0__1__Impl


    // $ANTLR start rule__NamespaceDeclaration__Group_1_0__2
    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:378:1: rule__NamespaceDeclaration__Group_1_0__2 : rule__NamespaceDeclaration__Group_1_0__2__Impl ;
    public final void rule__NamespaceDeclaration__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:382:1: ( rule__NamespaceDeclaration__Group_1_0__2__Impl )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:383:2: rule__NamespaceDeclaration__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_rule__NamespaceDeclaration__Group_1_0__2__Impl_in_rule__NamespaceDeclaration__Group_1_0__2721);
            rule__NamespaceDeclaration__Group_1_0__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NamespaceDeclaration__Group_1_0__2


    // $ANTLR start rule__NamespaceDeclaration__Group_1_0__2__Impl
    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:389:1: rule__NamespaceDeclaration__Group_1_0__2__Impl : ( ( rule__NamespaceDeclaration__UriAssignment_1_0_2 ) ) ;
    public final void rule__NamespaceDeclaration__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:393:1: ( ( ( rule__NamespaceDeclaration__UriAssignment_1_0_2 ) ) )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:394:1: ( ( rule__NamespaceDeclaration__UriAssignment_1_0_2 ) )
            {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:394:1: ( ( rule__NamespaceDeclaration__UriAssignment_1_0_2 ) )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:395:1: ( rule__NamespaceDeclaration__UriAssignment_1_0_2 )
            {
             before(grammarAccess.getNamespaceDeclarationAccess().getUriAssignment_1_0_2()); 
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:396:1: ( rule__NamespaceDeclaration__UriAssignment_1_0_2 )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:396:2: rule__NamespaceDeclaration__UriAssignment_1_0_2
            {
            pushFollow(FOLLOW_rule__NamespaceDeclaration__UriAssignment_1_0_2_in_rule__NamespaceDeclaration__Group_1_0__2__Impl748);
            rule__NamespaceDeclaration__UriAssignment_1_0_2();
            _fsp--;


            }

             after(grammarAccess.getNamespaceDeclarationAccess().getUriAssignment_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NamespaceDeclaration__Group_1_0__2__Impl


    // $ANTLR start rule__SignatureDeclaration__Group__0
    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:412:1: rule__SignatureDeclaration__Group__0 : rule__SignatureDeclaration__Group__0__Impl rule__SignatureDeclaration__Group__1 ;
    public final void rule__SignatureDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:416:1: ( rule__SignatureDeclaration__Group__0__Impl rule__SignatureDeclaration__Group__1 )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:417:2: rule__SignatureDeclaration__Group__0__Impl rule__SignatureDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__SignatureDeclaration__Group__0__Impl_in_rule__SignatureDeclaration__Group__0784);
            rule__SignatureDeclaration__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SignatureDeclaration__Group__1_in_rule__SignatureDeclaration__Group__0787);
            rule__SignatureDeclaration__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SignatureDeclaration__Group__0


    // $ANTLR start rule__SignatureDeclaration__Group__0__Impl
    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:424:1: rule__SignatureDeclaration__Group__0__Impl : ( '%sig' ) ;
    public final void rule__SignatureDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:428:1: ( ( '%sig' ) )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:429:1: ( '%sig' )
            {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:429:1: ( '%sig' )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:430:1: '%sig'
            {
             before(grammarAccess.getSignatureDeclarationAccess().getSigKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__SignatureDeclaration__Group__0__Impl815); 
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
    // $ANTLR end rule__SignatureDeclaration__Group__0__Impl


    // $ANTLR start rule__SignatureDeclaration__Group__1
    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:443:1: rule__SignatureDeclaration__Group__1 : rule__SignatureDeclaration__Group__1__Impl rule__SignatureDeclaration__Group__2 ;
    public final void rule__SignatureDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:447:1: ( rule__SignatureDeclaration__Group__1__Impl rule__SignatureDeclaration__Group__2 )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:448:2: rule__SignatureDeclaration__Group__1__Impl rule__SignatureDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__SignatureDeclaration__Group__1__Impl_in_rule__SignatureDeclaration__Group__1846);
            rule__SignatureDeclaration__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SignatureDeclaration__Group__2_in_rule__SignatureDeclaration__Group__1849);
            rule__SignatureDeclaration__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SignatureDeclaration__Group__1


    // $ANTLR start rule__SignatureDeclaration__Group__1__Impl
    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:455:1: rule__SignatureDeclaration__Group__1__Impl : ( ( rule__SignatureDeclaration__SigNameAssignment_1 ) ) ;
    public final void rule__SignatureDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:459:1: ( ( ( rule__SignatureDeclaration__SigNameAssignment_1 ) ) )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:460:1: ( ( rule__SignatureDeclaration__SigNameAssignment_1 ) )
            {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:460:1: ( ( rule__SignatureDeclaration__SigNameAssignment_1 ) )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:461:1: ( rule__SignatureDeclaration__SigNameAssignment_1 )
            {
             before(grammarAccess.getSignatureDeclarationAccess().getSigNameAssignment_1()); 
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:462:1: ( rule__SignatureDeclaration__SigNameAssignment_1 )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:462:2: rule__SignatureDeclaration__SigNameAssignment_1
            {
            pushFollow(FOLLOW_rule__SignatureDeclaration__SigNameAssignment_1_in_rule__SignatureDeclaration__Group__1__Impl876);
            rule__SignatureDeclaration__SigNameAssignment_1();
            _fsp--;


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
    // $ANTLR end rule__SignatureDeclaration__Group__1__Impl


    // $ANTLR start rule__SignatureDeclaration__Group__2
    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:472:1: rule__SignatureDeclaration__Group__2 : rule__SignatureDeclaration__Group__2__Impl rule__SignatureDeclaration__Group__3 ;
    public final void rule__SignatureDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:476:1: ( rule__SignatureDeclaration__Group__2__Impl rule__SignatureDeclaration__Group__3 )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:477:2: rule__SignatureDeclaration__Group__2__Impl rule__SignatureDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__SignatureDeclaration__Group__2__Impl_in_rule__SignatureDeclaration__Group__2906);
            rule__SignatureDeclaration__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SignatureDeclaration__Group__3_in_rule__SignatureDeclaration__Group__2909);
            rule__SignatureDeclaration__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SignatureDeclaration__Group__2


    // $ANTLR start rule__SignatureDeclaration__Group__2__Impl
    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:484:1: rule__SignatureDeclaration__Group__2__Impl : ( '=' ) ;
    public final void rule__SignatureDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:488:1: ( ( '=' ) )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:489:1: ( '=' )
            {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:489:1: ( '=' )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:490:1: '='
            {
             before(grammarAccess.getSignatureDeclarationAccess().getEqualsSignKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__SignatureDeclaration__Group__2__Impl937); 
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
    // $ANTLR end rule__SignatureDeclaration__Group__2__Impl


    // $ANTLR start rule__SignatureDeclaration__Group__3
    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:503:1: rule__SignatureDeclaration__Group__3 : rule__SignatureDeclaration__Group__3__Impl rule__SignatureDeclaration__Group__4 ;
    public final void rule__SignatureDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:507:1: ( rule__SignatureDeclaration__Group__3__Impl rule__SignatureDeclaration__Group__4 )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:508:2: rule__SignatureDeclaration__Group__3__Impl rule__SignatureDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__SignatureDeclaration__Group__3__Impl_in_rule__SignatureDeclaration__Group__3968);
            rule__SignatureDeclaration__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SignatureDeclaration__Group__4_in_rule__SignatureDeclaration__Group__3971);
            rule__SignatureDeclaration__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SignatureDeclaration__Group__3


    // $ANTLR start rule__SignatureDeclaration__Group__3__Impl
    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:515:1: rule__SignatureDeclaration__Group__3__Impl : ( '{' ) ;
    public final void rule__SignatureDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:519:1: ( ( '{' ) )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:520:1: ( '{' )
            {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:520:1: ( '{' )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:521:1: '{'
            {
             before(grammarAccess.getSignatureDeclarationAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,17,FOLLOW_17_in_rule__SignatureDeclaration__Group__3__Impl999); 
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
    // $ANTLR end rule__SignatureDeclaration__Group__3__Impl


    // $ANTLR start rule__SignatureDeclaration__Group__4
    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:534:1: rule__SignatureDeclaration__Group__4 : rule__SignatureDeclaration__Group__4__Impl rule__SignatureDeclaration__Group__5 ;
    public final void rule__SignatureDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:538:1: ( rule__SignatureDeclaration__Group__4__Impl rule__SignatureDeclaration__Group__5 )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:539:2: rule__SignatureDeclaration__Group__4__Impl rule__SignatureDeclaration__Group__5
            {
            pushFollow(FOLLOW_rule__SignatureDeclaration__Group__4__Impl_in_rule__SignatureDeclaration__Group__41030);
            rule__SignatureDeclaration__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SignatureDeclaration__Group__5_in_rule__SignatureDeclaration__Group__41033);
            rule__SignatureDeclaration__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SignatureDeclaration__Group__4


    // $ANTLR start rule__SignatureDeclaration__Group__4__Impl
    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:546:1: rule__SignatureDeclaration__Group__4__Impl : ( ( rule__SignatureDeclaration__SigDefinitionsAssignment_4 )* ) ;
    public final void rule__SignatureDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:550:1: ( ( ( rule__SignatureDeclaration__SigDefinitionsAssignment_4 )* ) )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:551:1: ( ( rule__SignatureDeclaration__SigDefinitionsAssignment_4 )* )
            {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:551:1: ( ( rule__SignatureDeclaration__SigDefinitionsAssignment_4 )* )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:552:1: ( rule__SignatureDeclaration__SigDefinitionsAssignment_4 )*
            {
             before(grammarAccess.getSignatureDeclarationAccess().getSigDefinitionsAssignment_4()); 
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:553:1: ( rule__SignatureDeclaration__SigDefinitionsAssignment_4 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:553:2: rule__SignatureDeclaration__SigDefinitionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__SignatureDeclaration__SigDefinitionsAssignment_4_in_rule__SignatureDeclaration__Group__4__Impl1060);
            	    rule__SignatureDeclaration__SigDefinitionsAssignment_4();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // $ANTLR end rule__SignatureDeclaration__Group__4__Impl


    // $ANTLR start rule__SignatureDeclaration__Group__5
    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:563:1: rule__SignatureDeclaration__Group__5 : rule__SignatureDeclaration__Group__5__Impl rule__SignatureDeclaration__Group__6 ;
    public final void rule__SignatureDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:567:1: ( rule__SignatureDeclaration__Group__5__Impl rule__SignatureDeclaration__Group__6 )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:568:2: rule__SignatureDeclaration__Group__5__Impl rule__SignatureDeclaration__Group__6
            {
            pushFollow(FOLLOW_rule__SignatureDeclaration__Group__5__Impl_in_rule__SignatureDeclaration__Group__51091);
            rule__SignatureDeclaration__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SignatureDeclaration__Group__6_in_rule__SignatureDeclaration__Group__51094);
            rule__SignatureDeclaration__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SignatureDeclaration__Group__5


    // $ANTLR start rule__SignatureDeclaration__Group__5__Impl
    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:575:1: rule__SignatureDeclaration__Group__5__Impl : ( '}' ) ;
    public final void rule__SignatureDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:579:1: ( ( '}' ) )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:580:1: ( '}' )
            {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:580:1: ( '}' )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:581:1: '}'
            {
             before(grammarAccess.getSignatureDeclarationAccess().getRightCurlyBracketKeyword_5()); 
            match(input,18,FOLLOW_18_in_rule__SignatureDeclaration__Group__5__Impl1122); 
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
    // $ANTLR end rule__SignatureDeclaration__Group__5__Impl


    // $ANTLR start rule__SignatureDeclaration__Group__6
    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:594:1: rule__SignatureDeclaration__Group__6 : rule__SignatureDeclaration__Group__6__Impl ;
    public final void rule__SignatureDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:598:1: ( rule__SignatureDeclaration__Group__6__Impl )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:599:2: rule__SignatureDeclaration__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__SignatureDeclaration__Group__6__Impl_in_rule__SignatureDeclaration__Group__61153);
            rule__SignatureDeclaration__Group__6__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SignatureDeclaration__Group__6


    // $ANTLR start rule__SignatureDeclaration__Group__6__Impl
    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:605:1: rule__SignatureDeclaration__Group__6__Impl : ( '.' ) ;
    public final void rule__SignatureDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:609:1: ( ( '.' ) )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:610:1: ( '.' )
            {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:610:1: ( '.' )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:611:1: '.'
            {
             before(grammarAccess.getSignatureDeclarationAccess().getFullStopKeyword_6()); 
            match(input,14,FOLLOW_14_in_rule__SignatureDeclaration__Group__6__Impl1181); 
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
    // $ANTLR end rule__SignatureDeclaration__Group__6__Impl


    // $ANTLR start rule__SigDefinitions__Group__0
    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:638:1: rule__SigDefinitions__Group__0 : rule__SigDefinitions__Group__0__Impl rule__SigDefinitions__Group__1 ;
    public final void rule__SigDefinitions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:642:1: ( rule__SigDefinitions__Group__0__Impl rule__SigDefinitions__Group__1 )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:643:2: rule__SigDefinitions__Group__0__Impl rule__SigDefinitions__Group__1
            {
            pushFollow(FOLLOW_rule__SigDefinitions__Group__0__Impl_in_rule__SigDefinitions__Group__01226);
            rule__SigDefinitions__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SigDefinitions__Group__1_in_rule__SigDefinitions__Group__01229);
            rule__SigDefinitions__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SigDefinitions__Group__0


    // $ANTLR start rule__SigDefinitions__Group__0__Impl
    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:650:1: rule__SigDefinitions__Group__0__Impl : ( ( rule__SigDefinitions__SymbNameAssignment_0 ) ) ;
    public final void rule__SigDefinitions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:654:1: ( ( ( rule__SigDefinitions__SymbNameAssignment_0 ) ) )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:655:1: ( ( rule__SigDefinitions__SymbNameAssignment_0 ) )
            {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:655:1: ( ( rule__SigDefinitions__SymbNameAssignment_0 ) )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:656:1: ( rule__SigDefinitions__SymbNameAssignment_0 )
            {
             before(grammarAccess.getSigDefinitionsAccess().getSymbNameAssignment_0()); 
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:657:1: ( rule__SigDefinitions__SymbNameAssignment_0 )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:657:2: rule__SigDefinitions__SymbNameAssignment_0
            {
            pushFollow(FOLLOW_rule__SigDefinitions__SymbNameAssignment_0_in_rule__SigDefinitions__Group__0__Impl1256);
            rule__SigDefinitions__SymbNameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getSigDefinitionsAccess().getSymbNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SigDefinitions__Group__0__Impl


    // $ANTLR start rule__SigDefinitions__Group__1
    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:667:1: rule__SigDefinitions__Group__1 : rule__SigDefinitions__Group__1__Impl rule__SigDefinitions__Group__2 ;
    public final void rule__SigDefinitions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:671:1: ( rule__SigDefinitions__Group__1__Impl rule__SigDefinitions__Group__2 )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:672:2: rule__SigDefinitions__Group__1__Impl rule__SigDefinitions__Group__2
            {
            pushFollow(FOLLOW_rule__SigDefinitions__Group__1__Impl_in_rule__SigDefinitions__Group__11286);
            rule__SigDefinitions__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SigDefinitions__Group__2_in_rule__SigDefinitions__Group__11289);
            rule__SigDefinitions__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SigDefinitions__Group__1


    // $ANTLR start rule__SigDefinitions__Group__1__Impl
    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:679:1: rule__SigDefinitions__Group__1__Impl : ( ':' ) ;
    public final void rule__SigDefinitions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:683:1: ( ( ':' ) )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:684:1: ( ':' )
            {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:684:1: ( ':' )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:685:1: ':'
            {
             before(grammarAccess.getSigDefinitionsAccess().getColonKeyword_1()); 
            match(input,19,FOLLOW_19_in_rule__SigDefinitions__Group__1__Impl1317); 
             after(grammarAccess.getSigDefinitionsAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SigDefinitions__Group__1__Impl


    // $ANTLR start rule__SigDefinitions__Group__2
    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:698:1: rule__SigDefinitions__Group__2 : rule__SigDefinitions__Group__2__Impl rule__SigDefinitions__Group__3 ;
    public final void rule__SigDefinitions__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:702:1: ( rule__SigDefinitions__Group__2__Impl rule__SigDefinitions__Group__3 )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:703:2: rule__SigDefinitions__Group__2__Impl rule__SigDefinitions__Group__3
            {
            pushFollow(FOLLOW_rule__SigDefinitions__Group__2__Impl_in_rule__SigDefinitions__Group__21348);
            rule__SigDefinitions__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SigDefinitions__Group__3_in_rule__SigDefinitions__Group__21351);
            rule__SigDefinitions__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SigDefinitions__Group__2


    // $ANTLR start rule__SigDefinitions__Group__2__Impl
    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:710:1: rule__SigDefinitions__Group__2__Impl : ( ( rule__SigDefinitions__TypeAssignment_2 ) ) ;
    public final void rule__SigDefinitions__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:714:1: ( ( ( rule__SigDefinitions__TypeAssignment_2 ) ) )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:715:1: ( ( rule__SigDefinitions__TypeAssignment_2 ) )
            {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:715:1: ( ( rule__SigDefinitions__TypeAssignment_2 ) )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:716:1: ( rule__SigDefinitions__TypeAssignment_2 )
            {
             before(grammarAccess.getSigDefinitionsAccess().getTypeAssignment_2()); 
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:717:1: ( rule__SigDefinitions__TypeAssignment_2 )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:717:2: rule__SigDefinitions__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__SigDefinitions__TypeAssignment_2_in_rule__SigDefinitions__Group__2__Impl1378);
            rule__SigDefinitions__TypeAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getSigDefinitionsAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SigDefinitions__Group__2__Impl


    // $ANTLR start rule__SigDefinitions__Group__3
    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:727:1: rule__SigDefinitions__Group__3 : rule__SigDefinitions__Group__3__Impl rule__SigDefinitions__Group__4 ;
    public final void rule__SigDefinitions__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:731:1: ( rule__SigDefinitions__Group__3__Impl rule__SigDefinitions__Group__4 )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:732:2: rule__SigDefinitions__Group__3__Impl rule__SigDefinitions__Group__4
            {
            pushFollow(FOLLOW_rule__SigDefinitions__Group__3__Impl_in_rule__SigDefinitions__Group__31408);
            rule__SigDefinitions__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SigDefinitions__Group__4_in_rule__SigDefinitions__Group__31411);
            rule__SigDefinitions__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SigDefinitions__Group__3


    // $ANTLR start rule__SigDefinitions__Group__3__Impl
    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:739:1: rule__SigDefinitions__Group__3__Impl : ( ( rule__SigDefinitions__Group_3__0 )? ) ;
    public final void rule__SigDefinitions__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:743:1: ( ( ( rule__SigDefinitions__Group_3__0 )? ) )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:744:1: ( ( rule__SigDefinitions__Group_3__0 )? )
            {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:744:1: ( ( rule__SigDefinitions__Group_3__0 )? )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:745:1: ( rule__SigDefinitions__Group_3__0 )?
            {
             before(grammarAccess.getSigDefinitionsAccess().getGroup_3()); 
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:746:1: ( rule__SigDefinitions__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:746:2: rule__SigDefinitions__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__SigDefinitions__Group_3__0_in_rule__SigDefinitions__Group__3__Impl1438);
                    rule__SigDefinitions__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

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
    // $ANTLR end rule__SigDefinitions__Group__3__Impl


    // $ANTLR start rule__SigDefinitions__Group__4
    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:756:1: rule__SigDefinitions__Group__4 : rule__SigDefinitions__Group__4__Impl ;
    public final void rule__SigDefinitions__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:760:1: ( rule__SigDefinitions__Group__4__Impl )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:761:2: rule__SigDefinitions__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__SigDefinitions__Group__4__Impl_in_rule__SigDefinitions__Group__41469);
            rule__SigDefinitions__Group__4__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SigDefinitions__Group__4


    // $ANTLR start rule__SigDefinitions__Group__4__Impl
    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:767:1: rule__SigDefinitions__Group__4__Impl : ( '.' ) ;
    public final void rule__SigDefinitions__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:771:1: ( ( '.' ) )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:772:1: ( '.' )
            {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:772:1: ( '.' )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:773:1: '.'
            {
             before(grammarAccess.getSigDefinitionsAccess().getFullStopKeyword_4()); 
            match(input,14,FOLLOW_14_in_rule__SigDefinitions__Group__4__Impl1497); 
             after(grammarAccess.getSigDefinitionsAccess().getFullStopKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SigDefinitions__Group__4__Impl


    // $ANTLR start rule__SigDefinitions__Group_3__0
    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:796:1: rule__SigDefinitions__Group_3__0 : rule__SigDefinitions__Group_3__0__Impl rule__SigDefinitions__Group_3__1 ;
    public final void rule__SigDefinitions__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:800:1: ( rule__SigDefinitions__Group_3__0__Impl rule__SigDefinitions__Group_3__1 )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:801:2: rule__SigDefinitions__Group_3__0__Impl rule__SigDefinitions__Group_3__1
            {
            pushFollow(FOLLOW_rule__SigDefinitions__Group_3__0__Impl_in_rule__SigDefinitions__Group_3__01538);
            rule__SigDefinitions__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SigDefinitions__Group_3__1_in_rule__SigDefinitions__Group_3__01541);
            rule__SigDefinitions__Group_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SigDefinitions__Group_3__0


    // $ANTLR start rule__SigDefinitions__Group_3__0__Impl
    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:808:1: rule__SigDefinitions__Group_3__0__Impl : ( '=' ) ;
    public final void rule__SigDefinitions__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:812:1: ( ( '=' ) )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:813:1: ( '=' )
            {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:813:1: ( '=' )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:814:1: '='
            {
             before(grammarAccess.getSigDefinitionsAccess().getEqualsSignKeyword_3_0()); 
            match(input,15,FOLLOW_15_in_rule__SigDefinitions__Group_3__0__Impl1569); 
             after(grammarAccess.getSigDefinitionsAccess().getEqualsSignKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SigDefinitions__Group_3__0__Impl


    // $ANTLR start rule__SigDefinitions__Group_3__1
    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:827:1: rule__SigDefinitions__Group_3__1 : rule__SigDefinitions__Group_3__1__Impl ;
    public final void rule__SigDefinitions__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:831:1: ( rule__SigDefinitions__Group_3__1__Impl )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:832:2: rule__SigDefinitions__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__SigDefinitions__Group_3__1__Impl_in_rule__SigDefinitions__Group_3__11600);
            rule__SigDefinitions__Group_3__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SigDefinitions__Group_3__1


    // $ANTLR start rule__SigDefinitions__Group_3__1__Impl
    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:838:1: rule__SigDefinitions__Group_3__1__Impl : ( ( ( RULE_ID ) ) ( ( RULE_ID )* ) ) ;
    public final void rule__SigDefinitions__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:842:1: ( ( ( ( RULE_ID ) ) ( ( RULE_ID )* ) ) )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:843:1: ( ( ( RULE_ID ) ) ( ( RULE_ID )* ) )
            {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:843:1: ( ( ( RULE_ID ) ) ( ( RULE_ID )* ) )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:844:1: ( ( RULE_ID ) ) ( ( RULE_ID )* )
            {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:844:1: ( ( RULE_ID ) )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:845:1: ( RULE_ID )
            {
             before(grammarAccess.getSigDefinitionsAccess().getIDTerminalRuleCall_3_1()); 
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:846:1: ( RULE_ID )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:846:3: RULE_ID
            {
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SigDefinitions__Group_3__1__Impl1630); 

            }

             after(grammarAccess.getSigDefinitionsAccess().getIDTerminalRuleCall_3_1()); 

            }

            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:849:1: ( ( RULE_ID )* )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:850:1: ( RULE_ID )*
            {
             before(grammarAccess.getSigDefinitionsAccess().getIDTerminalRuleCall_3_1()); 
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:851:1: ( RULE_ID )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:851:3: RULE_ID
            	    {
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SigDefinitions__Group_3__1__Impl1643); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getSigDefinitionsAccess().getIDTerminalRuleCall_3_1()); 

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
    // $ANTLR end rule__SigDefinitions__Group_3__1__Impl


    // $ANTLR start rule__Model__DeclarationsAssignment
    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:867:1: rule__Model__DeclarationsAssignment : ( ( rule__Model__DeclarationsAlternatives_0 ) ) ;
    public final void rule__Model__DeclarationsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:871:1: ( ( ( rule__Model__DeclarationsAlternatives_0 ) ) )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:872:1: ( ( rule__Model__DeclarationsAlternatives_0 ) )
            {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:872:1: ( ( rule__Model__DeclarationsAlternatives_0 ) )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:873:1: ( rule__Model__DeclarationsAlternatives_0 )
            {
             before(grammarAccess.getModelAccess().getDeclarationsAlternatives_0()); 
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:874:1: ( rule__Model__DeclarationsAlternatives_0 )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:874:2: rule__Model__DeclarationsAlternatives_0
            {
            pushFollow(FOLLOW_rule__Model__DeclarationsAlternatives_0_in_rule__Model__DeclarationsAssignment1685);
            rule__Model__DeclarationsAlternatives_0();
            _fsp--;


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
    // $ANTLR end rule__Model__DeclarationsAssignment


    // $ANTLR start rule__NamespaceDeclaration__NameAssignment_1_0_0
    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:883:1: rule__NamespaceDeclaration__NameAssignment_1_0_0 : ( RULE_ID ) ;
    public final void rule__NamespaceDeclaration__NameAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:887:1: ( ( RULE_ID ) )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:888:1: ( RULE_ID )
            {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:888:1: ( RULE_ID )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:889:1: RULE_ID
            {
             before(grammarAccess.getNamespaceDeclarationAccess().getNameIDTerminalRuleCall_1_0_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NamespaceDeclaration__NameAssignment_1_0_01718); 
             after(grammarAccess.getNamespaceDeclarationAccess().getNameIDTerminalRuleCall_1_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NamespaceDeclaration__NameAssignment_1_0_0


    // $ANTLR start rule__NamespaceDeclaration__UriAssignment_1_0_2
    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:898:1: rule__NamespaceDeclaration__UriAssignment_1_0_2 : ( RULE_URI ) ;
    public final void rule__NamespaceDeclaration__UriAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:902:1: ( ( RULE_URI ) )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:903:1: ( RULE_URI )
            {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:903:1: ( RULE_URI )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:904:1: RULE_URI
            {
             before(grammarAccess.getNamespaceDeclarationAccess().getUriURITerminalRuleCall_1_0_2_0()); 
            match(input,RULE_URI,FOLLOW_RULE_URI_in_rule__NamespaceDeclaration__UriAssignment_1_0_21749); 
             after(grammarAccess.getNamespaceDeclarationAccess().getUriURITerminalRuleCall_1_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NamespaceDeclaration__UriAssignment_1_0_2


    // $ANTLR start rule__NamespaceDeclaration__UriAssignment_1_1
    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:913:1: rule__NamespaceDeclaration__UriAssignment_1_1 : ( RULE_URI ) ;
    public final void rule__NamespaceDeclaration__UriAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:917:1: ( ( RULE_URI ) )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:918:1: ( RULE_URI )
            {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:918:1: ( RULE_URI )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:919:1: RULE_URI
            {
             before(grammarAccess.getNamespaceDeclarationAccess().getUriURITerminalRuleCall_1_1_0()); 
            match(input,RULE_URI,FOLLOW_RULE_URI_in_rule__NamespaceDeclaration__UriAssignment_1_11780); 
             after(grammarAccess.getNamespaceDeclarationAccess().getUriURITerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NamespaceDeclaration__UriAssignment_1_1


    // $ANTLR start rule__SignatureDeclaration__SigNameAssignment_1
    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:928:1: rule__SignatureDeclaration__SigNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SignatureDeclaration__SigNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:932:1: ( ( RULE_ID ) )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:933:1: ( RULE_ID )
            {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:933:1: ( RULE_ID )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:934:1: RULE_ID
            {
             before(grammarAccess.getSignatureDeclarationAccess().getSigNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SignatureDeclaration__SigNameAssignment_11811); 
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
    // $ANTLR end rule__SignatureDeclaration__SigNameAssignment_1


    // $ANTLR start rule__SignatureDeclaration__SigDefinitionsAssignment_4
    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:943:1: rule__SignatureDeclaration__SigDefinitionsAssignment_4 : ( rulesigDefinitions ) ;
    public final void rule__SignatureDeclaration__SigDefinitionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:947:1: ( ( rulesigDefinitions ) )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:948:1: ( rulesigDefinitions )
            {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:948:1: ( rulesigDefinitions )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:949:1: rulesigDefinitions
            {
             before(grammarAccess.getSignatureDeclarationAccess().getSigDefinitionsSigDefinitionsParserRuleCall_4_0()); 
            pushFollow(FOLLOW_rulesigDefinitions_in_rule__SignatureDeclaration__SigDefinitionsAssignment_41842);
            rulesigDefinitions();
            _fsp--;

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
    // $ANTLR end rule__SignatureDeclaration__SigDefinitionsAssignment_4


    // $ANTLR start rule__SigDefinitions__SymbNameAssignment_0
    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:958:1: rule__SigDefinitions__SymbNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__SigDefinitions__SymbNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:962:1: ( ( RULE_ID ) )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:963:1: ( RULE_ID )
            {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:963:1: ( RULE_ID )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:964:1: RULE_ID
            {
             before(grammarAccess.getSigDefinitionsAccess().getSymbNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SigDefinitions__SymbNameAssignment_01873); 
             after(grammarAccess.getSigDefinitionsAccess().getSymbNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SigDefinitions__SymbNameAssignment_0


    // $ANTLR start rule__SigDefinitions__TypeAssignment_2
    // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:973:1: rule__SigDefinitions__TypeAssignment_2 : ( RULE_ID ) ;
    public final void rule__SigDefinitions__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:977:1: ( ( RULE_ID ) )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:978:1: ( RULE_ID )
            {
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:978:1: ( RULE_ID )
            // ../info.kwarc.elf.ui/src-gen/info/kwarc/ui/contentassist/antlr/internal/InternalElf.g:979:1: RULE_ID
            {
             before(grammarAccess.getSigDefinitionsAccess().getTypeIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SigDefinitions__TypeAssignment_21904); 
             after(grammarAccess.getSigDefinitionsAccess().getTypeIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SigDefinitions__TypeAssignment_2


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__DeclarationsAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000000012002L});
    public static final BitSet FOLLOW_rulenamespaceDeclaration_in_entryRulenamespaceDeclaration122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenamespaceDeclaration129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group__0_in_rulenamespaceDeclaration155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesignatureDeclaration_in_entryRulesignatureDeclaration182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesignatureDeclaration189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group__0_in_rulesignatureDeclaration215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesigDefinitions_in_entryRulesigDefinitions242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesigDefinitions249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group__0_in_rulesigDefinitions275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenamespaceDeclaration_in_rule__Model__DeclarationsAlternatives_0313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesignatureDeclaration_in_rule__Model__DeclarationsAlternatives_0330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group_1_0__0_in_rule__NamespaceDeclaration__Alternatives_1362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__UriAssignment_1_1_in_rule__NamespaceDeclaration__Alternatives_1380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group__0__Impl_in_rule__NamespaceDeclaration__Group__0412 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group__1_in_rule__NamespaceDeclaration__Group__0415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__NamespaceDeclaration__Group__0__Impl443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group__1__Impl_in_rule__NamespaceDeclaration__Group__1474 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group__2_in_rule__NamespaceDeclaration__Group__1477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Alternatives_1_in_rule__NamespaceDeclaration__Group__1__Impl504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group__2__Impl_in_rule__NamespaceDeclaration__Group__2534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__NamespaceDeclaration__Group__2__Impl562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group_1_0__0__Impl_in_rule__NamespaceDeclaration__Group_1_0__0599 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group_1_0__1_in_rule__NamespaceDeclaration__Group_1_0__0602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__NameAssignment_1_0_0_in_rule__NamespaceDeclaration__Group_1_0__0__Impl629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group_1_0__1__Impl_in_rule__NamespaceDeclaration__Group_1_0__1659 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group_1_0__2_in_rule__NamespaceDeclaration__Group_1_0__1662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__NamespaceDeclaration__Group_1_0__1__Impl690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__Group_1_0__2__Impl_in_rule__NamespaceDeclaration__Group_1_0__2721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamespaceDeclaration__UriAssignment_1_0_2_in_rule__NamespaceDeclaration__Group_1_0__2__Impl748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group__0__Impl_in_rule__SignatureDeclaration__Group__0784 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group__1_in_rule__SignatureDeclaration__Group__0787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__SignatureDeclaration__Group__0__Impl815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group__1__Impl_in_rule__SignatureDeclaration__Group__1846 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group__2_in_rule__SignatureDeclaration__Group__1849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__SigNameAssignment_1_in_rule__SignatureDeclaration__Group__1__Impl876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group__2__Impl_in_rule__SignatureDeclaration__Group__2906 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group__3_in_rule__SignatureDeclaration__Group__2909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__SignatureDeclaration__Group__2__Impl937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group__3__Impl_in_rule__SignatureDeclaration__Group__3968 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group__4_in_rule__SignatureDeclaration__Group__3971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__SignatureDeclaration__Group__3__Impl999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group__4__Impl_in_rule__SignatureDeclaration__Group__41030 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group__5_in_rule__SignatureDeclaration__Group__41033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__SigDefinitionsAssignment_4_in_rule__SignatureDeclaration__Group__4__Impl1060 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group__5__Impl_in_rule__SignatureDeclaration__Group__51091 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group__6_in_rule__SignatureDeclaration__Group__51094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__SignatureDeclaration__Group__5__Impl1122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignatureDeclaration__Group__6__Impl_in_rule__SignatureDeclaration__Group__61153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__SignatureDeclaration__Group__6__Impl1181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group__0__Impl_in_rule__SigDefinitions__Group__01226 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group__1_in_rule__SigDefinitions__Group__01229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__SymbNameAssignment_0_in_rule__SigDefinitions__Group__0__Impl1256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group__1__Impl_in_rule__SigDefinitions__Group__11286 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group__2_in_rule__SigDefinitions__Group__11289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__SigDefinitions__Group__1__Impl1317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group__2__Impl_in_rule__SigDefinitions__Group__21348 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group__3_in_rule__SigDefinitions__Group__21351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__TypeAssignment_2_in_rule__SigDefinitions__Group__2__Impl1378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group__3__Impl_in_rule__SigDefinitions__Group__31408 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group__4_in_rule__SigDefinitions__Group__31411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_3__0_in_rule__SigDefinitions__Group__3__Impl1438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group__4__Impl_in_rule__SigDefinitions__Group__41469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__SigDefinitions__Group__4__Impl1497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_3__0__Impl_in_rule__SigDefinitions__Group_3__01538 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_3__1_in_rule__SigDefinitions__Group_3__01541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__SigDefinitions__Group_3__0__Impl1569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SigDefinitions__Group_3__1__Impl_in_rule__SigDefinitions__Group_3__11600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SigDefinitions__Group_3__1__Impl1630 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SigDefinitions__Group_3__1__Impl1643 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Model__DeclarationsAlternatives_0_in_rule__Model__DeclarationsAssignment1685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NamespaceDeclaration__NameAssignment_1_0_01718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_URI_in_rule__NamespaceDeclaration__UriAssignment_1_0_21749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_URI_in_rule__NamespaceDeclaration__UriAssignment_1_11780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SignatureDeclaration__SigNameAssignment_11811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesigDefinitions_in_rule__SignatureDeclaration__SigDefinitionsAssignment_41842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SigDefinitions__SymbNameAssignment_01873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SigDefinitions__TypeAssignment_21904 = new BitSet(new long[]{0x0000000000000002L});

}