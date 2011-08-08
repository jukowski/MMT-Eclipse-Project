package info.kwarc.mmt.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import info.kwarc.mmt.services.LFGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalLFParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_PERCENT", "RULE_DOT", "RULE_COLON", "RULE_QUOTE", "RULE_LCBRACKET", "RULE_RCBRACKET", "RULE_LSBRACKET", "RULE_RSBRACKET", "RULE_LBRACKET", "RULE_RBRACKET", "RULE_ARROW", "RULE_LARROW", "RULE_EQUALS", "RULE_ASSIGN", "RULE_TYPE", "RULE_UNDERSCORE", "RULE_CID", "RULE_URISTRING", "RULE_ILLEGAL_TOKEN", "RULE_LINESP", "RULE_LINEDELIM", "RULE_ML_COMMENT", "RULE_ML2_COMMENT", "RULE_INFIXNONE", "RULE_INFIXLEFT", "RULE_INFIXRIGHT", "RULE_UNKNOWNDIRECTIVE", "RULE_LINE_COMMENT", "'%abbrev'", "'%name'", "'%prefix'", "'%postfix'", "'%meta'", "'%include'", "'%struct'", "'%implicit'", "'%open'", "'%as'", "'%namespace'", "'%read'", "'%sig'", "'%view'"
    };
    public static final int RULE_QUOTE=7;
    public static final int RULE_PERCENT=4;
    public static final int RULE_LBRACKET=12;
    public static final int RULE_LSBRACKET=10;
    public static final int EOF=-1;
    public static final int RULE_INFIXRIGHT=29;
    public static final int RULE_ASSIGN=17;
    public static final int RULE_ILLEGAL_TOKEN=22;
    public static final int RULE_LARROW=15;
    public static final int RULE_UNKNOWNDIRECTIVE=30;
    public static final int RULE_DOT=5;
    public static final int RULE_ML2_COMMENT=26;
    public static final int RULE_INFIXNONE=27;
    public static final int RULE_RBRACKET=13;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__44=44;
    public static final int RULE_RCBRACKET=9;
    public static final int T__45=45;
    public static final int RULE_LCBRACKET=8;
    public static final int RULE_RSBRACKET=11;
    public static final int RULE_UNDERSCORE=19;
    public static final int RULE_URISTRING=21;
    public static final int RULE_CID=20;
    public static final int RULE_LINESP=23;
    public static final int RULE_ML_COMMENT=25;
    public static final int RULE_COLON=6;
    public static final int T__32=32;
    public static final int RULE_TYPE=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_ARROW=14;
    public static final int RULE_INFIXLEFT=28;
    public static final int RULE_LINE_COMMENT=31;
    public static final int RULE_LINEDELIM=24;
    public static final int RULE_EQUALS=16;

    // delegates
    // delegators


        public InternalLFParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLFParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLFParser.tokenNames; }
    public String getGrammarFileName() { return "../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g"; }



     	private LFGrammarAccess grammarAccess;
     	
        public InternalLFParser(TokenStream input, LFGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected LFGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:69:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:76:1: ruleModel returns [EObject current=null] : ( () ( ruleWS )* ( ( ( (lv_constructs_2_1= rulemodelConstructNOSP | lv_constructs_2_2= ruletermDeclaration ) ) ) ( ( ruleWS )* ( ( (lv_constructs_4_0= rulemodelConstructNOSP ) ) | ( ruleWS ( (lv_constructs_6_0= ruletermDeclaration ) ) ) ) )* ( ruleWS )* )? (this_PERCENT_8= RULE_PERCENT this_DOT_9= RULE_DOT ( (lv_notInDocument_10_0= ruleanyTerminal ) )* )? ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token this_PERCENT_8=null;
        Token this_DOT_9=null;
        EObject lv_constructs_2_1 = null;

        EObject lv_constructs_2_2 = null;

        EObject lv_constructs_4_0 = null;

        EObject lv_constructs_6_0 = null;

        AntlrDatatypeRuleToken lv_notInDocument_10_0 = null;


         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:79:28: ( ( () ( ruleWS )* ( ( ( (lv_constructs_2_1= rulemodelConstructNOSP | lv_constructs_2_2= ruletermDeclaration ) ) ) ( ( ruleWS )* ( ( (lv_constructs_4_0= rulemodelConstructNOSP ) ) | ( ruleWS ( (lv_constructs_6_0= ruletermDeclaration ) ) ) ) )* ( ruleWS )* )? (this_PERCENT_8= RULE_PERCENT this_DOT_9= RULE_DOT ( (lv_notInDocument_10_0= ruleanyTerminal ) )* )? ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:80:1: ( () ( ruleWS )* ( ( ( (lv_constructs_2_1= rulemodelConstructNOSP | lv_constructs_2_2= ruletermDeclaration ) ) ) ( ( ruleWS )* ( ( (lv_constructs_4_0= rulemodelConstructNOSP ) ) | ( ruleWS ( (lv_constructs_6_0= ruletermDeclaration ) ) ) ) )* ( ruleWS )* )? (this_PERCENT_8= RULE_PERCENT this_DOT_9= RULE_DOT ( (lv_notInDocument_10_0= ruleanyTerminal ) )* )? )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:80:1: ( () ( ruleWS )* ( ( ( (lv_constructs_2_1= rulemodelConstructNOSP | lv_constructs_2_2= ruletermDeclaration ) ) ) ( ( ruleWS )* ( ( (lv_constructs_4_0= rulemodelConstructNOSP ) ) | ( ruleWS ( (lv_constructs_6_0= ruletermDeclaration ) ) ) ) )* ( ruleWS )* )? (this_PERCENT_8= RULE_PERCENT this_DOT_9= RULE_DOT ( (lv_notInDocument_10_0= ruleanyTerminal ) )* )? )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:80:2: () ( ruleWS )* ( ( ( (lv_constructs_2_1= rulemodelConstructNOSP | lv_constructs_2_2= ruletermDeclaration ) ) ) ( ( ruleWS )* ( ( (lv_constructs_4_0= rulemodelConstructNOSP ) ) | ( ruleWS ( (lv_constructs_6_0= ruletermDeclaration ) ) ) ) )* ( ruleWS )* )? (this_PERCENT_8= RULE_PERCENT this_DOT_9= RULE_DOT ( (lv_notInDocument_10_0= ruleanyTerminal ) )* )?
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:80:2: ()
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:81:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getModelAccess().getModelAction_0(),
                          current);
                  
            }

            }

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:86:2: ( ruleWS )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_LINESP && LA1_0<=RULE_ML2_COMMENT)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:87:5: ruleWS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getModelAccess().getWSParserRuleCall_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleWS_in_ruleModel136);
            	    ruleWS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:94:3: ( ( ( (lv_constructs_2_1= rulemodelConstructNOSP | lv_constructs_2_2= ruletermDeclaration ) ) ) ( ( ruleWS )* ( ( (lv_constructs_4_0= rulemodelConstructNOSP ) ) | ( ruleWS ( (lv_constructs_6_0= ruletermDeclaration ) ) ) ) )* ( ruleWS )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_CID||(LA7_0>=RULE_INFIXNONE && LA7_0<=RULE_UNKNOWNDIRECTIVE)||(LA7_0>=32 && LA7_0<=35)||(LA7_0>=42 && LA7_0<=45)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:94:4: ( ( (lv_constructs_2_1= rulemodelConstructNOSP | lv_constructs_2_2= ruletermDeclaration ) ) ) ( ( ruleWS )* ( ( (lv_constructs_4_0= rulemodelConstructNOSP ) ) | ( ruleWS ( (lv_constructs_6_0= ruletermDeclaration ) ) ) ) )* ( ruleWS )*
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:94:4: ( ( (lv_constructs_2_1= rulemodelConstructNOSP | lv_constructs_2_2= ruletermDeclaration ) ) )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:95:1: ( (lv_constructs_2_1= rulemodelConstructNOSP | lv_constructs_2_2= ruletermDeclaration ) )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:95:1: ( (lv_constructs_2_1= rulemodelConstructNOSP | lv_constructs_2_2= ruletermDeclaration ) )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:96:1: (lv_constructs_2_1= rulemodelConstructNOSP | lv_constructs_2_2= ruletermDeclaration )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:96:1: (lv_constructs_2_1= rulemodelConstructNOSP | lv_constructs_2_2= ruletermDeclaration )
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( ((LA2_0>=RULE_INFIXNONE && LA2_0<=RULE_UNKNOWNDIRECTIVE)||(LA2_0>=32 && LA2_0<=35)||(LA2_0>=42 && LA2_0<=45)) ) {
                        alt2=1;
                    }
                    else if ( (LA2_0==RULE_CID) ) {
                        alt2=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 0, input);

                        throw nvae;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:97:3: lv_constructs_2_1= rulemodelConstructNOSP
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getModelAccess().getConstructsModelConstructNOSPParserRuleCall_2_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_rulemodelConstructNOSP_in_ruleModel161);
                            lv_constructs_2_1=rulemodelConstructNOSP();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getModelRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"constructs",
                                      		lv_constructs_2_1, 
                                      		"modelConstructNOSP");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:112:8: lv_constructs_2_2= ruletermDeclaration
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getModelAccess().getConstructsTermDeclarationParserRuleCall_2_0_0_1()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruletermDeclaration_in_ruleModel180);
                            lv_constructs_2_2=ruletermDeclaration();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getModelRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"constructs",
                                      		lv_constructs_2_2, 
                                      		"termDeclaration");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:130:2: ( ( ruleWS )* ( ( (lv_constructs_4_0= rulemodelConstructNOSP ) ) | ( ruleWS ( (lv_constructs_6_0= ruletermDeclaration ) ) ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        alt5 = dfa5.predict(input);
                        switch (alt5) {
                    	case 1 :
                    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:130:3: ( ruleWS )* ( ( (lv_constructs_4_0= rulemodelConstructNOSP ) ) | ( ruleWS ( (lv_constructs_6_0= ruletermDeclaration ) ) ) )
                    	    {
                    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:130:3: ( ruleWS )*
                    	    loop3:
                    	    do {
                    	        int alt3=2;
                    	        switch ( input.LA(1) ) {
                    	        case RULE_LINESP:
                    	            {
                    	            int LA3_2 = input.LA(2);

                    	            if ( ((LA3_2>=RULE_LINESP && LA3_2<=RULE_UNKNOWNDIRECTIVE)||(LA3_2>=32 && LA3_2<=35)||(LA3_2>=42 && LA3_2<=45)) ) {
                    	                alt3=1;
                    	            }


                    	            }
                    	            break;
                    	        case RULE_LINEDELIM:
                    	            {
                    	            int LA3_3 = input.LA(2);

                    	            if ( ((LA3_3>=RULE_LINESP && LA3_3<=RULE_UNKNOWNDIRECTIVE)||(LA3_3>=32 && LA3_3<=35)||(LA3_3>=42 && LA3_3<=45)) ) {
                    	                alt3=1;
                    	            }


                    	            }
                    	            break;
                    	        case RULE_ML_COMMENT:
                    	            {
                    	            int LA3_4 = input.LA(2);

                    	            if ( ((LA3_4>=RULE_LINESP && LA3_4<=RULE_UNKNOWNDIRECTIVE)||(LA3_4>=32 && LA3_4<=35)||(LA3_4>=42 && LA3_4<=45)) ) {
                    	                alt3=1;
                    	            }


                    	            }
                    	            break;
                    	        case RULE_ML2_COMMENT:
                    	            {
                    	            int LA3_5 = input.LA(2);

                    	            if ( ((LA3_5>=RULE_LINESP && LA3_5<=RULE_UNKNOWNDIRECTIVE)||(LA3_5>=32 && LA3_5<=35)||(LA3_5>=42 && LA3_5<=45)) ) {
                    	                alt3=1;
                    	            }


                    	            }
                    	            break;

                    	        }

                    	        switch (alt3) {
                    	    	case 1 :
                    	    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:131:5: ruleWS
                    	    	    {
                    	    	    if ( state.backtracking==0 ) {
                    	    	       
                    	    	              newCompositeNode(grammarAccess.getModelAccess().getWSParserRuleCall_2_1_0()); 
                    	    	          
                    	    	    }
                    	    	    pushFollow(FOLLOW_ruleWS_in_ruleModel201);
                    	    	    ruleWS();

                    	    	    state._fsp--;
                    	    	    if (state.failed) return current;
                    	    	    if ( state.backtracking==0 ) {
                    	    	       
                    	    	              afterParserOrEnumRuleCall();
                    	    	          
                    	    	    }

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop3;
                    	        }
                    	    } while (true);

                    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:138:3: ( ( (lv_constructs_4_0= rulemodelConstructNOSP ) ) | ( ruleWS ( (lv_constructs_6_0= ruletermDeclaration ) ) ) )
                    	    int alt4=2;
                    	    int LA4_0 = input.LA(1);

                    	    if ( ((LA4_0>=RULE_INFIXNONE && LA4_0<=RULE_UNKNOWNDIRECTIVE)||(LA4_0>=32 && LA4_0<=35)||(LA4_0>=42 && LA4_0<=45)) ) {
                    	        alt4=1;
                    	    }
                    	    else if ( ((LA4_0>=RULE_LINESP && LA4_0<=RULE_ML2_COMMENT)) ) {
                    	        alt4=2;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 4, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt4) {
                    	        case 1 :
                    	            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:138:4: ( (lv_constructs_4_0= rulemodelConstructNOSP ) )
                    	            {
                    	            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:138:4: ( (lv_constructs_4_0= rulemodelConstructNOSP ) )
                    	            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:139:1: (lv_constructs_4_0= rulemodelConstructNOSP )
                    	            {
                    	            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:139:1: (lv_constructs_4_0= rulemodelConstructNOSP )
                    	            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:140:3: lv_constructs_4_0= rulemodelConstructNOSP
                    	            {
                    	            if ( state.backtracking==0 ) {
                    	               
                    	              	        newCompositeNode(grammarAccess.getModelAccess().getConstructsModelConstructNOSPParserRuleCall_2_1_1_0_0()); 
                    	              	    
                    	            }
                    	            pushFollow(FOLLOW_rulemodelConstructNOSP_in_ruleModel224);
                    	            lv_constructs_4_0=rulemodelConstructNOSP();

                    	            state._fsp--;
                    	            if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	              	        }
                    	                     		add(
                    	                     			current, 
                    	                     			"constructs",
                    	                      		lv_constructs_4_0, 
                    	                      		"modelConstructNOSP");
                    	              	        afterParserOrEnumRuleCall();
                    	              	    
                    	            }

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:157:6: ( ruleWS ( (lv_constructs_6_0= ruletermDeclaration ) ) )
                    	            {
                    	            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:157:6: ( ruleWS ( (lv_constructs_6_0= ruletermDeclaration ) ) )
                    	            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:158:5: ruleWS ( (lv_constructs_6_0= ruletermDeclaration ) )
                    	            {
                    	            if ( state.backtracking==0 ) {
                    	               
                    	                      newCompositeNode(grammarAccess.getModelAccess().getWSParserRuleCall_2_1_1_1_0()); 
                    	                  
                    	            }
                    	            pushFollow(FOLLOW_ruleWS_in_ruleModel247);
                    	            ruleWS();

                    	            state._fsp--;
                    	            if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {
                    	               
                    	                      afterParserOrEnumRuleCall();
                    	                  
                    	            }
                    	            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:165:1: ( (lv_constructs_6_0= ruletermDeclaration ) )
                    	            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:166:1: (lv_constructs_6_0= ruletermDeclaration )
                    	            {
                    	            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:166:1: (lv_constructs_6_0= ruletermDeclaration )
                    	            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:167:3: lv_constructs_6_0= ruletermDeclaration
                    	            {
                    	            if ( state.backtracking==0 ) {
                    	               
                    	              	        newCompositeNode(grammarAccess.getModelAccess().getConstructsTermDeclarationParserRuleCall_2_1_1_1_1_0()); 
                    	              	    
                    	            }
                    	            pushFollow(FOLLOW_ruletermDeclaration_in_ruleModel267);
                    	            lv_constructs_6_0=ruletermDeclaration();

                    	            state._fsp--;
                    	            if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	              	        }
                    	                     		add(
                    	                     			current, 
                    	                     			"constructs",
                    	                      		lv_constructs_6_0, 
                    	                      		"termDeclaration");
                    	              	        afterParserOrEnumRuleCall();
                    	              	    
                    	            }

                    	            }


                    	            }


                    	            }


                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:183:6: ( ruleWS )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>=RULE_LINESP && LA6_0<=RULE_ML2_COMMENT)) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:184:5: ruleWS
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getModelAccess().getWSParserRuleCall_2_2()); 
                    	          
                    	    }
                    	    pushFollow(FOLLOW_ruleWS_in_ruleModel288);
                    	    ruleWS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              afterParserOrEnumRuleCall();
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:191:5: (this_PERCENT_8= RULE_PERCENT this_DOT_9= RULE_DOT ( (lv_notInDocument_10_0= ruleanyTerminal ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_PERCENT) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:191:6: this_PERCENT_8= RULE_PERCENT this_DOT_9= RULE_DOT ( (lv_notInDocument_10_0= ruleanyTerminal ) )*
                    {
                    this_PERCENT_8=(Token)match(input,RULE_PERCENT,FOLLOW_RULE_PERCENT_in_ruleModel303); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PERCENT_8, grammarAccess.getModelAccess().getPERCENTTerminalRuleCall_3_0()); 
                          
                    }
                    this_DOT_9=(Token)match(input,RULE_DOT,FOLLOW_RULE_DOT_in_ruleModel313); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_DOT_9, grammarAccess.getModelAccess().getDOTTerminalRuleCall_3_1()); 
                          
                    }
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:199:1: ( (lv_notInDocument_10_0= ruleanyTerminal ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>=RULE_PERCENT && LA8_0<=RULE_UNKNOWNDIRECTIVE)||(LA8_0>=32 && LA8_0<=45)) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:200:1: (lv_notInDocument_10_0= ruleanyTerminal )
                    	    {
                    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:200:1: (lv_notInDocument_10_0= ruleanyTerminal )
                    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:201:3: lv_notInDocument_10_0= ruleanyTerminal
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getModelAccess().getNotInDocumentAnyTerminalParserRuleCall_3_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleanyTerminal_in_ruleModel333);
                    	    lv_notInDocument_10_0=ruleanyTerminal();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"notInDocument",
                    	              		lv_notInDocument_10_0, 
                    	              		"anyTerminal");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRulemodelConstructNOSP"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:225:1: entryRulemodelConstructNOSP returns [EObject current=null] : iv_rulemodelConstructNOSP= rulemodelConstructNOSP EOF ;
    public final EObject entryRulemodelConstructNOSP() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemodelConstructNOSP = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:226:2: (iv_rulemodelConstructNOSP= rulemodelConstructNOSP EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:227:2: iv_rulemodelConstructNOSP= rulemodelConstructNOSP EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelConstructNOSPRule()); 
            }
            pushFollow(FOLLOW_rulemodelConstructNOSP_in_entryRulemodelConstructNOSP372);
            iv_rulemodelConstructNOSP=rulemodelConstructNOSP();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulemodelConstructNOSP; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulemodelConstructNOSP382); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulemodelConstructNOSP"


    // $ANTLR start "rulemodelConstructNOSP"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:234:1: rulemodelConstructNOSP returns [EObject current=null] : ( ( (lv_namespaceDeclarations_0_0= rulenamespaceDeclaration ) ) | ( (lv_readDeclarations_1_0= rulereadDeclaration ) ) | ( (lv_sigDeclarations_2_0= rulesigDeclaration ) ) | ( (lv_viewDeclarations_3_0= ruleviewDeclaration ) ) | ( ( (lv_rawDeclarations_4_1= ruleabbrevTermDeclaration | lv_rawDeclarations_4_2= rulenameDeclaration | lv_rawDeclarations_4_3= rulefixityDeclaration | lv_rawDeclarations_4_4= ruleunknownConstruct ) ) ) ) ;
    public final EObject rulemodelConstructNOSP() throws RecognitionException {
        EObject current = null;

        EObject lv_namespaceDeclarations_0_0 = null;

        EObject lv_readDeclarations_1_0 = null;

        EObject lv_sigDeclarations_2_0 = null;

        EObject lv_viewDeclarations_3_0 = null;

        EObject lv_rawDeclarations_4_1 = null;

        EObject lv_rawDeclarations_4_2 = null;

        EObject lv_rawDeclarations_4_3 = null;

        EObject lv_rawDeclarations_4_4 = null;


         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:237:28: ( ( ( (lv_namespaceDeclarations_0_0= rulenamespaceDeclaration ) ) | ( (lv_readDeclarations_1_0= rulereadDeclaration ) ) | ( (lv_sigDeclarations_2_0= rulesigDeclaration ) ) | ( (lv_viewDeclarations_3_0= ruleviewDeclaration ) ) | ( ( (lv_rawDeclarations_4_1= ruleabbrevTermDeclaration | lv_rawDeclarations_4_2= rulenameDeclaration | lv_rawDeclarations_4_3= rulefixityDeclaration | lv_rawDeclarations_4_4= ruleunknownConstruct ) ) ) ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:238:1: ( ( (lv_namespaceDeclarations_0_0= rulenamespaceDeclaration ) ) | ( (lv_readDeclarations_1_0= rulereadDeclaration ) ) | ( (lv_sigDeclarations_2_0= rulesigDeclaration ) ) | ( (lv_viewDeclarations_3_0= ruleviewDeclaration ) ) | ( ( (lv_rawDeclarations_4_1= ruleabbrevTermDeclaration | lv_rawDeclarations_4_2= rulenameDeclaration | lv_rawDeclarations_4_3= rulefixityDeclaration | lv_rawDeclarations_4_4= ruleunknownConstruct ) ) ) )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:238:1: ( ( (lv_namespaceDeclarations_0_0= rulenamespaceDeclaration ) ) | ( (lv_readDeclarations_1_0= rulereadDeclaration ) ) | ( (lv_sigDeclarations_2_0= rulesigDeclaration ) ) | ( (lv_viewDeclarations_3_0= ruleviewDeclaration ) ) | ( ( (lv_rawDeclarations_4_1= ruleabbrevTermDeclaration | lv_rawDeclarations_4_2= rulenameDeclaration | lv_rawDeclarations_4_3= rulefixityDeclaration | lv_rawDeclarations_4_4= ruleunknownConstruct ) ) ) )
            int alt11=5;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt11=1;
                }
                break;
            case 43:
                {
                alt11=2;
                }
                break;
            case 44:
                {
                alt11=3;
                }
                break;
            case 45:
                {
                alt11=4;
                }
                break;
            case RULE_INFIXNONE:
            case RULE_INFIXLEFT:
            case RULE_INFIXRIGHT:
            case RULE_UNKNOWNDIRECTIVE:
            case 32:
            case 33:
            case 34:
            case 35:
                {
                alt11=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:238:2: ( (lv_namespaceDeclarations_0_0= rulenamespaceDeclaration ) )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:238:2: ( (lv_namespaceDeclarations_0_0= rulenamespaceDeclaration ) )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:239:1: (lv_namespaceDeclarations_0_0= rulenamespaceDeclaration )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:239:1: (lv_namespaceDeclarations_0_0= rulenamespaceDeclaration )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:240:3: lv_namespaceDeclarations_0_0= rulenamespaceDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getModelConstructNOSPAccess().getNamespaceDeclarationsNamespaceDeclarationParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulenamespaceDeclaration_in_rulemodelConstructNOSP428);
                    lv_namespaceDeclarations_0_0=rulenamespaceDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getModelConstructNOSPRule());
                      	        }
                             		add(
                             			current, 
                             			"namespaceDeclarations",
                              		lv_namespaceDeclarations_0_0, 
                              		"namespaceDeclaration");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:257:6: ( (lv_readDeclarations_1_0= rulereadDeclaration ) )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:257:6: ( (lv_readDeclarations_1_0= rulereadDeclaration ) )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:258:1: (lv_readDeclarations_1_0= rulereadDeclaration )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:258:1: (lv_readDeclarations_1_0= rulereadDeclaration )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:259:3: lv_readDeclarations_1_0= rulereadDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getModelConstructNOSPAccess().getReadDeclarationsReadDeclarationParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulereadDeclaration_in_rulemodelConstructNOSP455);
                    lv_readDeclarations_1_0=rulereadDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getModelConstructNOSPRule());
                      	        }
                             		add(
                             			current, 
                             			"readDeclarations",
                              		lv_readDeclarations_1_0, 
                              		"readDeclaration");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:276:6: ( (lv_sigDeclarations_2_0= rulesigDeclaration ) )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:276:6: ( (lv_sigDeclarations_2_0= rulesigDeclaration ) )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:277:1: (lv_sigDeclarations_2_0= rulesigDeclaration )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:277:1: (lv_sigDeclarations_2_0= rulesigDeclaration )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:278:3: lv_sigDeclarations_2_0= rulesigDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getModelConstructNOSPAccess().getSigDeclarationsSigDeclarationParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulesigDeclaration_in_rulemodelConstructNOSP482);
                    lv_sigDeclarations_2_0=rulesigDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getModelConstructNOSPRule());
                      	        }
                             		add(
                             			current, 
                             			"sigDeclarations",
                              		lv_sigDeclarations_2_0, 
                              		"sigDeclaration");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:295:6: ( (lv_viewDeclarations_3_0= ruleviewDeclaration ) )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:295:6: ( (lv_viewDeclarations_3_0= ruleviewDeclaration ) )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:296:1: (lv_viewDeclarations_3_0= ruleviewDeclaration )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:296:1: (lv_viewDeclarations_3_0= ruleviewDeclaration )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:297:3: lv_viewDeclarations_3_0= ruleviewDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getModelConstructNOSPAccess().getViewDeclarationsViewDeclarationParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleviewDeclaration_in_rulemodelConstructNOSP509);
                    lv_viewDeclarations_3_0=ruleviewDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getModelConstructNOSPRule());
                      	        }
                             		add(
                             			current, 
                             			"viewDeclarations",
                              		lv_viewDeclarations_3_0, 
                              		"viewDeclaration");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:314:6: ( ( (lv_rawDeclarations_4_1= ruleabbrevTermDeclaration | lv_rawDeclarations_4_2= rulenameDeclaration | lv_rawDeclarations_4_3= rulefixityDeclaration | lv_rawDeclarations_4_4= ruleunknownConstruct ) ) )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:314:6: ( ( (lv_rawDeclarations_4_1= ruleabbrevTermDeclaration | lv_rawDeclarations_4_2= rulenameDeclaration | lv_rawDeclarations_4_3= rulefixityDeclaration | lv_rawDeclarations_4_4= ruleunknownConstruct ) ) )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:315:1: ( (lv_rawDeclarations_4_1= ruleabbrevTermDeclaration | lv_rawDeclarations_4_2= rulenameDeclaration | lv_rawDeclarations_4_3= rulefixityDeclaration | lv_rawDeclarations_4_4= ruleunknownConstruct ) )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:315:1: ( (lv_rawDeclarations_4_1= ruleabbrevTermDeclaration | lv_rawDeclarations_4_2= rulenameDeclaration | lv_rawDeclarations_4_3= rulefixityDeclaration | lv_rawDeclarations_4_4= ruleunknownConstruct ) )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:316:1: (lv_rawDeclarations_4_1= ruleabbrevTermDeclaration | lv_rawDeclarations_4_2= rulenameDeclaration | lv_rawDeclarations_4_3= rulefixityDeclaration | lv_rawDeclarations_4_4= ruleunknownConstruct )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:316:1: (lv_rawDeclarations_4_1= ruleabbrevTermDeclaration | lv_rawDeclarations_4_2= rulenameDeclaration | lv_rawDeclarations_4_3= rulefixityDeclaration | lv_rawDeclarations_4_4= ruleunknownConstruct )
                    int alt10=4;
                    switch ( input.LA(1) ) {
                    case 32:
                        {
                        alt10=1;
                        }
                        break;
                    case 33:
                        {
                        alt10=2;
                        }
                        break;
                    case RULE_INFIXNONE:
                    case RULE_INFIXLEFT:
                    case RULE_INFIXRIGHT:
                    case 34:
                    case 35:
                        {
                        alt10=3;
                        }
                        break;
                    case RULE_UNKNOWNDIRECTIVE:
                        {
                        alt10=4;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 0, input);

                        throw nvae;
                    }

                    switch (alt10) {
                        case 1 :
                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:317:3: lv_rawDeclarations_4_1= ruleabbrevTermDeclaration
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getModelConstructNOSPAccess().getRawDeclarationsAbbrevTermDeclarationParserRuleCall_4_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleabbrevTermDeclaration_in_rulemodelConstructNOSP538);
                            lv_rawDeclarations_4_1=ruleabbrevTermDeclaration();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getModelConstructNOSPRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"rawDeclarations",
                                      		lv_rawDeclarations_4_1, 
                                      		"abbrevTermDeclaration");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:332:8: lv_rawDeclarations_4_2= rulenameDeclaration
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getModelConstructNOSPAccess().getRawDeclarationsNameDeclarationParserRuleCall_4_0_1()); 
                              	    
                            }
                            pushFollow(FOLLOW_rulenameDeclaration_in_rulemodelConstructNOSP557);
                            lv_rawDeclarations_4_2=rulenameDeclaration();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getModelConstructNOSPRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"rawDeclarations",
                                      		lv_rawDeclarations_4_2, 
                                      		"nameDeclaration");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;
                        case 3 :
                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:347:8: lv_rawDeclarations_4_3= rulefixityDeclaration
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getModelConstructNOSPAccess().getRawDeclarationsFixityDeclarationParserRuleCall_4_0_2()); 
                              	    
                            }
                            pushFollow(FOLLOW_rulefixityDeclaration_in_rulemodelConstructNOSP576);
                            lv_rawDeclarations_4_3=rulefixityDeclaration();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getModelConstructNOSPRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"rawDeclarations",
                                      		lv_rawDeclarations_4_3, 
                                      		"fixityDeclaration");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;
                        case 4 :
                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:362:8: lv_rawDeclarations_4_4= ruleunknownConstruct
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getModelConstructNOSPAccess().getRawDeclarationsUnknownConstructParserRuleCall_4_0_3()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleunknownConstruct_in_rulemodelConstructNOSP595);
                            lv_rawDeclarations_4_4=ruleunknownConstruct();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getModelConstructNOSPRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"rawDeclarations",
                                      		lv_rawDeclarations_4_4, 
                                      		"unknownConstruct");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulemodelConstructNOSP"


    // $ANTLR start "entryRuleanyTerminal"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:388:1: entryRuleanyTerminal returns [String current=null] : iv_ruleanyTerminal= ruleanyTerminal EOF ;
    public final String entryRuleanyTerminal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleanyTerminal = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:389:2: (iv_ruleanyTerminal= ruleanyTerminal EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:390:2: iv_ruleanyTerminal= ruleanyTerminal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnyTerminalRule()); 
            }
            pushFollow(FOLLOW_ruleanyTerminal_in_entryRuleanyTerminal635);
            iv_ruleanyTerminal=ruleanyTerminal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleanyTerminal.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleanyTerminal646); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleanyTerminal"


    // $ANTLR start "ruleanyTerminal"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:397:1: ruleanyTerminal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_anyDirective_0= ruleanyDirective | this_WS_1= ruleWS | this_PERCENT_2= RULE_PERCENT | this_COLON_3= RULE_COLON | this_QUOTE_4= RULE_QUOTE | this_LCBRACKET_5= RULE_LCBRACKET | this_RCBRACKET_6= RULE_RCBRACKET | this_LSBRACKET_7= RULE_LSBRACKET | this_RSBRACKET_8= RULE_RSBRACKET | this_LBRACKET_9= RULE_LBRACKET | this_RBRACKET_10= RULE_RBRACKET | this_DOT_11= RULE_DOT | this_ARROW_12= RULE_ARROW | this_LARROW_13= RULE_LARROW | this_EQUALS_14= RULE_EQUALS | this_ASSIGN_15= RULE_ASSIGN | this_TYPE_16= RULE_TYPE | this_UNDERSCORE_17= RULE_UNDERSCORE | this_CID_18= RULE_CID | this_URISTRING_19= RULE_URISTRING | this_ILLEGAL_TOKEN_20= RULE_ILLEGAL_TOKEN ) ;
    public final AntlrDatatypeRuleToken ruleanyTerminal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_PERCENT_2=null;
        Token this_COLON_3=null;
        Token this_QUOTE_4=null;
        Token this_LCBRACKET_5=null;
        Token this_RCBRACKET_6=null;
        Token this_LSBRACKET_7=null;
        Token this_RSBRACKET_8=null;
        Token this_LBRACKET_9=null;
        Token this_RBRACKET_10=null;
        Token this_DOT_11=null;
        Token this_ARROW_12=null;
        Token this_LARROW_13=null;
        Token this_EQUALS_14=null;
        Token this_ASSIGN_15=null;
        Token this_TYPE_16=null;
        Token this_UNDERSCORE_17=null;
        Token this_CID_18=null;
        Token this_URISTRING_19=null;
        Token this_ILLEGAL_TOKEN_20=null;
        AntlrDatatypeRuleToken this_anyDirective_0 = null;

        AntlrDatatypeRuleToken this_WS_1 = null;


         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:400:28: ( (this_anyDirective_0= ruleanyDirective | this_WS_1= ruleWS | this_PERCENT_2= RULE_PERCENT | this_COLON_3= RULE_COLON | this_QUOTE_4= RULE_QUOTE | this_LCBRACKET_5= RULE_LCBRACKET | this_RCBRACKET_6= RULE_RCBRACKET | this_LSBRACKET_7= RULE_LSBRACKET | this_RSBRACKET_8= RULE_RSBRACKET | this_LBRACKET_9= RULE_LBRACKET | this_RBRACKET_10= RULE_RBRACKET | this_DOT_11= RULE_DOT | this_ARROW_12= RULE_ARROW | this_LARROW_13= RULE_LARROW | this_EQUALS_14= RULE_EQUALS | this_ASSIGN_15= RULE_ASSIGN | this_TYPE_16= RULE_TYPE | this_UNDERSCORE_17= RULE_UNDERSCORE | this_CID_18= RULE_CID | this_URISTRING_19= RULE_URISTRING | this_ILLEGAL_TOKEN_20= RULE_ILLEGAL_TOKEN ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:401:1: (this_anyDirective_0= ruleanyDirective | this_WS_1= ruleWS | this_PERCENT_2= RULE_PERCENT | this_COLON_3= RULE_COLON | this_QUOTE_4= RULE_QUOTE | this_LCBRACKET_5= RULE_LCBRACKET | this_RCBRACKET_6= RULE_RCBRACKET | this_LSBRACKET_7= RULE_LSBRACKET | this_RSBRACKET_8= RULE_RSBRACKET | this_LBRACKET_9= RULE_LBRACKET | this_RBRACKET_10= RULE_RBRACKET | this_DOT_11= RULE_DOT | this_ARROW_12= RULE_ARROW | this_LARROW_13= RULE_LARROW | this_EQUALS_14= RULE_EQUALS | this_ASSIGN_15= RULE_ASSIGN | this_TYPE_16= RULE_TYPE | this_UNDERSCORE_17= RULE_UNDERSCORE | this_CID_18= RULE_CID | this_URISTRING_19= RULE_URISTRING | this_ILLEGAL_TOKEN_20= RULE_ILLEGAL_TOKEN )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:401:1: (this_anyDirective_0= ruleanyDirective | this_WS_1= ruleWS | this_PERCENT_2= RULE_PERCENT | this_COLON_3= RULE_COLON | this_QUOTE_4= RULE_QUOTE | this_LCBRACKET_5= RULE_LCBRACKET | this_RCBRACKET_6= RULE_RCBRACKET | this_LSBRACKET_7= RULE_LSBRACKET | this_RSBRACKET_8= RULE_RSBRACKET | this_LBRACKET_9= RULE_LBRACKET | this_RBRACKET_10= RULE_RBRACKET | this_DOT_11= RULE_DOT | this_ARROW_12= RULE_ARROW | this_LARROW_13= RULE_LARROW | this_EQUALS_14= RULE_EQUALS | this_ASSIGN_15= RULE_ASSIGN | this_TYPE_16= RULE_TYPE | this_UNDERSCORE_17= RULE_UNDERSCORE | this_CID_18= RULE_CID | this_URISTRING_19= RULE_URISTRING | this_ILLEGAL_TOKEN_20= RULE_ILLEGAL_TOKEN )
            int alt12=21;
            switch ( input.LA(1) ) {
            case RULE_INFIXNONE:
            case RULE_INFIXLEFT:
            case RULE_INFIXRIGHT:
            case RULE_UNKNOWNDIRECTIVE:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
                {
                alt12=1;
                }
                break;
            case RULE_LINESP:
            case RULE_LINEDELIM:
            case RULE_ML_COMMENT:
            case RULE_ML2_COMMENT:
                {
                alt12=2;
                }
                break;
            case RULE_PERCENT:
                {
                alt12=3;
                }
                break;
            case RULE_COLON:
                {
                alt12=4;
                }
                break;
            case RULE_QUOTE:
                {
                alt12=5;
                }
                break;
            case RULE_LCBRACKET:
                {
                alt12=6;
                }
                break;
            case RULE_RCBRACKET:
                {
                alt12=7;
                }
                break;
            case RULE_LSBRACKET:
                {
                alt12=8;
                }
                break;
            case RULE_RSBRACKET:
                {
                alt12=9;
                }
                break;
            case RULE_LBRACKET:
                {
                alt12=10;
                }
                break;
            case RULE_RBRACKET:
                {
                alt12=11;
                }
                break;
            case RULE_DOT:
                {
                alt12=12;
                }
                break;
            case RULE_ARROW:
                {
                alt12=13;
                }
                break;
            case RULE_LARROW:
                {
                alt12=14;
                }
                break;
            case RULE_EQUALS:
                {
                alt12=15;
                }
                break;
            case RULE_ASSIGN:
                {
                alt12=16;
                }
                break;
            case RULE_TYPE:
                {
                alt12=17;
                }
                break;
            case RULE_UNDERSCORE:
                {
                alt12=18;
                }
                break;
            case RULE_CID:
                {
                alt12=19;
                }
                break;
            case RULE_URISTRING:
                {
                alt12=20;
                }
                break;
            case RULE_ILLEGAL_TOKEN:
                {
                alt12=21;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:402:5: this_anyDirective_0= ruleanyDirective
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnyTerminalAccess().getAnyDirectiveParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleanyDirective_in_ruleanyTerminal693);
                    this_anyDirective_0=ruleanyDirective();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_anyDirective_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:414:5: this_WS_1= ruleWS
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnyTerminalAccess().getWSParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleWS_in_ruleanyTerminal726);
                    this_WS_1=ruleWS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_WS_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:425:10: this_PERCENT_2= RULE_PERCENT
                    {
                    this_PERCENT_2=(Token)match(input,RULE_PERCENT,FOLLOW_RULE_PERCENT_in_ruleanyTerminal752); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_PERCENT_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PERCENT_2, grammarAccess.getAnyTerminalAccess().getPERCENTTerminalRuleCall_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:433:10: this_COLON_3= RULE_COLON
                    {
                    this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleanyTerminal778); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_COLON_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COLON_3, grammarAccess.getAnyTerminalAccess().getCOLONTerminalRuleCall_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:441:10: this_QUOTE_4= RULE_QUOTE
                    {
                    this_QUOTE_4=(Token)match(input,RULE_QUOTE,FOLLOW_RULE_QUOTE_in_ruleanyTerminal804); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_QUOTE_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_QUOTE_4, grammarAccess.getAnyTerminalAccess().getQUOTETerminalRuleCall_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:449:10: this_LCBRACKET_5= RULE_LCBRACKET
                    {
                    this_LCBRACKET_5=(Token)match(input,RULE_LCBRACKET,FOLLOW_RULE_LCBRACKET_in_ruleanyTerminal830); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LCBRACKET_5);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LCBRACKET_5, grammarAccess.getAnyTerminalAccess().getLCBRACKETTerminalRuleCall_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:457:10: this_RCBRACKET_6= RULE_RCBRACKET
                    {
                    this_RCBRACKET_6=(Token)match(input,RULE_RCBRACKET,FOLLOW_RULE_RCBRACKET_in_ruleanyTerminal856); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_RCBRACKET_6);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RCBRACKET_6, grammarAccess.getAnyTerminalAccess().getRCBRACKETTerminalRuleCall_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:465:10: this_LSBRACKET_7= RULE_LSBRACKET
                    {
                    this_LSBRACKET_7=(Token)match(input,RULE_LSBRACKET,FOLLOW_RULE_LSBRACKET_in_ruleanyTerminal882); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LSBRACKET_7);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LSBRACKET_7, grammarAccess.getAnyTerminalAccess().getLSBRACKETTerminalRuleCall_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:473:10: this_RSBRACKET_8= RULE_RSBRACKET
                    {
                    this_RSBRACKET_8=(Token)match(input,RULE_RSBRACKET,FOLLOW_RULE_RSBRACKET_in_ruleanyTerminal908); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_RSBRACKET_8);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RSBRACKET_8, grammarAccess.getAnyTerminalAccess().getRSBRACKETTerminalRuleCall_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:481:10: this_LBRACKET_9= RULE_LBRACKET
                    {
                    this_LBRACKET_9=(Token)match(input,RULE_LBRACKET,FOLLOW_RULE_LBRACKET_in_ruleanyTerminal934); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LBRACKET_9);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LBRACKET_9, grammarAccess.getAnyTerminalAccess().getLBRACKETTerminalRuleCall_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:489:10: this_RBRACKET_10= RULE_RBRACKET
                    {
                    this_RBRACKET_10=(Token)match(input,RULE_RBRACKET,FOLLOW_RULE_RBRACKET_in_ruleanyTerminal960); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_RBRACKET_10);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RBRACKET_10, grammarAccess.getAnyTerminalAccess().getRBRACKETTerminalRuleCall_10()); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:497:10: this_DOT_11= RULE_DOT
                    {
                    this_DOT_11=(Token)match(input,RULE_DOT,FOLLOW_RULE_DOT_in_ruleanyTerminal986); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_DOT_11);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_DOT_11, grammarAccess.getAnyTerminalAccess().getDOTTerminalRuleCall_11()); 
                          
                    }

                    }
                    break;
                case 13 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:505:10: this_ARROW_12= RULE_ARROW
                    {
                    this_ARROW_12=(Token)match(input,RULE_ARROW,FOLLOW_RULE_ARROW_in_ruleanyTerminal1012); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ARROW_12);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ARROW_12, grammarAccess.getAnyTerminalAccess().getARROWTerminalRuleCall_12()); 
                          
                    }

                    }
                    break;
                case 14 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:513:10: this_LARROW_13= RULE_LARROW
                    {
                    this_LARROW_13=(Token)match(input,RULE_LARROW,FOLLOW_RULE_LARROW_in_ruleanyTerminal1038); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LARROW_13);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LARROW_13, grammarAccess.getAnyTerminalAccess().getLARROWTerminalRuleCall_13()); 
                          
                    }

                    }
                    break;
                case 15 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:521:10: this_EQUALS_14= RULE_EQUALS
                    {
                    this_EQUALS_14=(Token)match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_ruleanyTerminal1064); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_EQUALS_14);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_EQUALS_14, grammarAccess.getAnyTerminalAccess().getEQUALSTerminalRuleCall_14()); 
                          
                    }

                    }
                    break;
                case 16 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:529:10: this_ASSIGN_15= RULE_ASSIGN
                    {
                    this_ASSIGN_15=(Token)match(input,RULE_ASSIGN,FOLLOW_RULE_ASSIGN_in_ruleanyTerminal1090); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ASSIGN_15);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ASSIGN_15, grammarAccess.getAnyTerminalAccess().getASSIGNTerminalRuleCall_15()); 
                          
                    }

                    }
                    break;
                case 17 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:537:10: this_TYPE_16= RULE_TYPE
                    {
                    this_TYPE_16=(Token)match(input,RULE_TYPE,FOLLOW_RULE_TYPE_in_ruleanyTerminal1116); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_TYPE_16);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_TYPE_16, grammarAccess.getAnyTerminalAccess().getTYPETerminalRuleCall_16()); 
                          
                    }

                    }
                    break;
                case 18 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:545:10: this_UNDERSCORE_17= RULE_UNDERSCORE
                    {
                    this_UNDERSCORE_17=(Token)match(input,RULE_UNDERSCORE,FOLLOW_RULE_UNDERSCORE_in_ruleanyTerminal1142); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_UNDERSCORE_17);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_UNDERSCORE_17, grammarAccess.getAnyTerminalAccess().getUNDERSCORETerminalRuleCall_17()); 
                          
                    }

                    }
                    break;
                case 19 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:553:10: this_CID_18= RULE_CID
                    {
                    this_CID_18=(Token)match(input,RULE_CID,FOLLOW_RULE_CID_in_ruleanyTerminal1168); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_CID_18);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_CID_18, grammarAccess.getAnyTerminalAccess().getCIDTerminalRuleCall_18()); 
                          
                    }

                    }
                    break;
                case 20 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:561:10: this_URISTRING_19= RULE_URISTRING
                    {
                    this_URISTRING_19=(Token)match(input,RULE_URISTRING,FOLLOW_RULE_URISTRING_in_ruleanyTerminal1194); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_URISTRING_19);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_URISTRING_19, grammarAccess.getAnyTerminalAccess().getURISTRINGTerminalRuleCall_19()); 
                          
                    }

                    }
                    break;
                case 21 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:569:10: this_ILLEGAL_TOKEN_20= RULE_ILLEGAL_TOKEN
                    {
                    this_ILLEGAL_TOKEN_20=(Token)match(input,RULE_ILLEGAL_TOKEN,FOLLOW_RULE_ILLEGAL_TOKEN_in_ruleanyTerminal1220); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ILLEGAL_TOKEN_20);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ILLEGAL_TOKEN_20, grammarAccess.getAnyTerminalAccess().getILLEGAL_TOKENTerminalRuleCall_20()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleanyTerminal"


    // $ANTLR start "entryRuleWS"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:584:1: entryRuleWS returns [String current=null] : iv_ruleWS= ruleWS EOF ;
    public final String entryRuleWS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleWS = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:585:2: (iv_ruleWS= ruleWS EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:586:2: iv_ruleWS= ruleWS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWSRule()); 
            }
            pushFollow(FOLLOW_ruleWS_in_entryRuleWS1266);
            iv_ruleWS=ruleWS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWS.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWS1277); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWS"


    // $ANTLR start "ruleWS"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:593:1: ruleWS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_LINESP_0= RULE_LINESP | this_LINEDELIM_1= RULE_LINEDELIM | this_ML_COMMENT_2= RULE_ML_COMMENT | this_ML2_COMMENT_3= RULE_ML2_COMMENT ) ;
    public final AntlrDatatypeRuleToken ruleWS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_LINESP_0=null;
        Token this_LINEDELIM_1=null;
        Token this_ML_COMMENT_2=null;
        Token this_ML2_COMMENT_3=null;

         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:596:28: ( (this_LINESP_0= RULE_LINESP | this_LINEDELIM_1= RULE_LINEDELIM | this_ML_COMMENT_2= RULE_ML_COMMENT | this_ML2_COMMENT_3= RULE_ML2_COMMENT ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:597:1: (this_LINESP_0= RULE_LINESP | this_LINEDELIM_1= RULE_LINEDELIM | this_ML_COMMENT_2= RULE_ML_COMMENT | this_ML2_COMMENT_3= RULE_ML2_COMMENT )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:597:1: (this_LINESP_0= RULE_LINESP | this_LINEDELIM_1= RULE_LINEDELIM | this_ML_COMMENT_2= RULE_ML_COMMENT | this_ML2_COMMENT_3= RULE_ML2_COMMENT )
            int alt13=4;
            switch ( input.LA(1) ) {
            case RULE_LINESP:
                {
                alt13=1;
                }
                break;
            case RULE_LINEDELIM:
                {
                alt13=2;
                }
                break;
            case RULE_ML_COMMENT:
                {
                alt13=3;
                }
                break;
            case RULE_ML2_COMMENT:
                {
                alt13=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:597:6: this_LINESP_0= RULE_LINESP
                    {
                    this_LINESP_0=(Token)match(input,RULE_LINESP,FOLLOW_RULE_LINESP_in_ruleWS1317); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LINESP_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LINESP_0, grammarAccess.getWSAccess().getLINESPTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:605:10: this_LINEDELIM_1= RULE_LINEDELIM
                    {
                    this_LINEDELIM_1=(Token)match(input,RULE_LINEDELIM,FOLLOW_RULE_LINEDELIM_in_ruleWS1343); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LINEDELIM_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LINEDELIM_1, grammarAccess.getWSAccess().getLINEDELIMTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:613:10: this_ML_COMMENT_2= RULE_ML_COMMENT
                    {
                    this_ML_COMMENT_2=(Token)match(input,RULE_ML_COMMENT,FOLLOW_RULE_ML_COMMENT_in_ruleWS1369); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ML_COMMENT_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ML_COMMENT_2, grammarAccess.getWSAccess().getML_COMMENTTerminalRuleCall_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:621:10: this_ML2_COMMENT_3= RULE_ML2_COMMENT
                    {
                    this_ML2_COMMENT_3=(Token)match(input,RULE_ML2_COMMENT,FOLLOW_RULE_ML2_COMMENT_in_ruleWS1395); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ML2_COMMENT_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ML2_COMMENT_3, grammarAccess.getWSAccess().getML2_COMMENTTerminalRuleCall_3()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWS"


    // $ANTLR start "entryRuleID"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:636:1: entryRuleID returns [String current=null] : iv_ruleID= ruleID EOF ;
    public final String entryRuleID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleID = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:637:2: (iv_ruleID= ruleID EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:638:2: iv_ruleID= ruleID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIDRule()); 
            }
            pushFollow(FOLLOW_ruleID_in_entryRuleID1441);
            iv_ruleID=ruleID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleID1452); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleID"


    // $ANTLR start "ruleID"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:645:1: ruleID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_CID_0= RULE_CID (this_DOT_1= RULE_DOT this_CID_2= RULE_CID )* ) ;
    public final AntlrDatatypeRuleToken ruleID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_CID_0=null;
        Token this_DOT_1=null;
        Token this_CID_2=null;

         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:648:28: ( (this_CID_0= RULE_CID (this_DOT_1= RULE_DOT this_CID_2= RULE_CID )* ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:649:1: (this_CID_0= RULE_CID (this_DOT_1= RULE_DOT this_CID_2= RULE_CID )* )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:649:1: (this_CID_0= RULE_CID (this_DOT_1= RULE_DOT this_CID_2= RULE_CID )* )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:649:6: this_CID_0= RULE_CID (this_DOT_1= RULE_DOT this_CID_2= RULE_CID )*
            {
            this_CID_0=(Token)match(input,RULE_CID,FOLLOW_RULE_CID_in_ruleID1492); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_CID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_CID_0, grammarAccess.getIDAccess().getCIDTerminalRuleCall_0()); 
                  
            }
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:656:1: (this_DOT_1= RULE_DOT this_CID_2= RULE_CID )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_DOT) ) {
                    int LA14_2 = input.LA(2);

                    if ( (LA14_2==RULE_CID) ) {
                        alt14=1;
                    }


                }


                switch (alt14) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:656:6: this_DOT_1= RULE_DOT this_CID_2= RULE_CID
            	    {
            	    this_DOT_1=(Token)match(input,RULE_DOT,FOLLOW_RULE_DOT_in_ruleID1513); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_DOT_1);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_DOT_1, grammarAccess.getIDAccess().getDOTTerminalRuleCall_1_0()); 
            	          
            	    }
            	    this_CID_2=(Token)match(input,RULE_CID,FOLLOW_RULE_CID_in_ruleID1533); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_CID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_CID_2, grammarAccess.getIDAccess().getCIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleID"


    // $ANTLR start "entryRuleterm"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:678:1: entryRuleterm returns [EObject current=null] : iv_ruleterm= ruleterm EOF ;
    public final EObject entryRuleterm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleterm = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:679:2: (iv_ruleterm= ruleterm EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:680:2: iv_ruleterm= ruleterm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTermRule()); 
            }
            pushFollow(FOLLOW_ruleterm_in_entryRuleterm1580);
            iv_ruleterm=ruleterm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleterm; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleterm1590); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleterm"


    // $ANTLR start "ruleterm"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:687:1: ruleterm returns [EObject current=null] : this_termArr_0= ruletermArr ;
    public final EObject ruleterm() throws RecognitionException {
        EObject current = null;

        EObject this_termArr_0 = null;


         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:690:28: (this_termArr_0= ruletermArr )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:692:5: this_termArr_0= ruletermArr
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getTermAccess().getTermArrParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruletermArr_in_ruleterm1636);
            this_termArr_0=ruletermArr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_termArr_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleterm"


    // $ANTLR start "entryRuletermPi"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:708:1: entryRuletermPi returns [EObject current=null] : iv_ruletermPi= ruletermPi EOF ;
    public final EObject entryRuletermPi() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletermPi = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:709:2: (iv_ruletermPi= ruletermPi EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:710:2: iv_ruletermPi= ruletermPi EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTermPiRule()); 
            }
            pushFollow(FOLLOW_ruletermPi_in_entryRuletermPi1670);
            iv_ruletermPi=ruletermPi();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletermPi; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuletermPi1680); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletermPi"


    // $ANTLR start "ruletermPi"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:717:1: ruletermPi returns [EObject current=null] : (this_LCBRACKET_0= RULE_LCBRACKET ( ruleWS )* ( ( (lv_name_2_1= RULE_CID | lv_name_2_2= RULE_UNDERSCORE ) ) ) ( ruleWS )* (this_COLON_4= RULE_COLON ( ruleWS )* ( (lv_type_6_0= ruleterm ) ) ( ruleWS )* )? this_RCBRACKET_8= RULE_RCBRACKET ) ;
    public final EObject ruletermPi() throws RecognitionException {
        EObject current = null;

        Token this_LCBRACKET_0=null;
        Token lv_name_2_1=null;
        Token lv_name_2_2=null;
        Token this_COLON_4=null;
        Token this_RCBRACKET_8=null;
        EObject lv_type_6_0 = null;


         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:720:28: ( (this_LCBRACKET_0= RULE_LCBRACKET ( ruleWS )* ( ( (lv_name_2_1= RULE_CID | lv_name_2_2= RULE_UNDERSCORE ) ) ) ( ruleWS )* (this_COLON_4= RULE_COLON ( ruleWS )* ( (lv_type_6_0= ruleterm ) ) ( ruleWS )* )? this_RCBRACKET_8= RULE_RCBRACKET ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:721:1: (this_LCBRACKET_0= RULE_LCBRACKET ( ruleWS )* ( ( (lv_name_2_1= RULE_CID | lv_name_2_2= RULE_UNDERSCORE ) ) ) ( ruleWS )* (this_COLON_4= RULE_COLON ( ruleWS )* ( (lv_type_6_0= ruleterm ) ) ( ruleWS )* )? this_RCBRACKET_8= RULE_RCBRACKET )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:721:1: (this_LCBRACKET_0= RULE_LCBRACKET ( ruleWS )* ( ( (lv_name_2_1= RULE_CID | lv_name_2_2= RULE_UNDERSCORE ) ) ) ( ruleWS )* (this_COLON_4= RULE_COLON ( ruleWS )* ( (lv_type_6_0= ruleterm ) ) ( ruleWS )* )? this_RCBRACKET_8= RULE_RCBRACKET )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:721:2: this_LCBRACKET_0= RULE_LCBRACKET ( ruleWS )* ( ( (lv_name_2_1= RULE_CID | lv_name_2_2= RULE_UNDERSCORE ) ) ) ( ruleWS )* (this_COLON_4= RULE_COLON ( ruleWS )* ( (lv_type_6_0= ruleterm ) ) ( ruleWS )* )? this_RCBRACKET_8= RULE_RCBRACKET
            {
            this_LCBRACKET_0=(Token)match(input,RULE_LCBRACKET,FOLLOW_RULE_LCBRACKET_in_ruletermPi1716); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LCBRACKET_0, grammarAccess.getTermPiAccess().getLCBRACKETTerminalRuleCall_0()); 
                  
            }
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:725:1: ( ruleWS )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=RULE_LINESP && LA15_0<=RULE_ML2_COMMENT)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:726:5: ruleWS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getTermPiAccess().getWSParserRuleCall_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleWS_in_ruletermPi1732);
            	    ruleWS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:733:3: ( ( (lv_name_2_1= RULE_CID | lv_name_2_2= RULE_UNDERSCORE ) ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:734:1: ( (lv_name_2_1= RULE_CID | lv_name_2_2= RULE_UNDERSCORE ) )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:734:1: ( (lv_name_2_1= RULE_CID | lv_name_2_2= RULE_UNDERSCORE ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:735:1: (lv_name_2_1= RULE_CID | lv_name_2_2= RULE_UNDERSCORE )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:735:1: (lv_name_2_1= RULE_CID | lv_name_2_2= RULE_UNDERSCORE )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_CID) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_UNDERSCORE) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:736:3: lv_name_2_1= RULE_CID
                    {
                    lv_name_2_1=(Token)match(input,RULE_CID,FOLLOW_RULE_CID_in_ruletermPi1752); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_2_1, grammarAccess.getTermPiAccess().getNameCIDTerminalRuleCall_2_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTermPiRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_2_1, 
                              		"CID");
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:751:8: lv_name_2_2= RULE_UNDERSCORE
                    {
                    lv_name_2_2=(Token)match(input,RULE_UNDERSCORE,FOLLOW_RULE_UNDERSCORE_in_ruletermPi1772); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_2_2, grammarAccess.getTermPiAccess().getNameUNDERSCORETerminalRuleCall_2_0_1()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTermPiRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_2_2, 
                              		"UNDERSCORE");
                      	    
                    }

                    }
                    break;

            }


            }


            }

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:769:2: ( ruleWS )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_LINESP && LA17_0<=RULE_ML2_COMMENT)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:770:5: ruleWS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getTermPiAccess().getWSParserRuleCall_3()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleWS_in_ruletermPi1797);
            	    ruleWS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:777:3: (this_COLON_4= RULE_COLON ( ruleWS )* ( (lv_type_6_0= ruleterm ) ) ( ruleWS )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_COLON) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:777:4: this_COLON_4= RULE_COLON ( ruleWS )* ( (lv_type_6_0= ruleterm ) ) ( ruleWS )*
                    {
                    this_COLON_4=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruletermPi1810); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COLON_4, grammarAccess.getTermPiAccess().getCOLONTerminalRuleCall_4_0()); 
                          
                    }
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:781:1: ( ruleWS )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( ((LA18_0>=RULE_LINESP && LA18_0<=RULE_ML2_COMMENT)) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:782:5: ruleWS
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getTermPiAccess().getWSParserRuleCall_4_1()); 
                    	          
                    	    }
                    	    pushFollow(FOLLOW_ruleWS_in_ruletermPi1826);
                    	    ruleWS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              afterParserOrEnumRuleCall();
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:789:3: ( (lv_type_6_0= ruleterm ) )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:790:1: (lv_type_6_0= ruleterm )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:790:1: (lv_type_6_0= ruleterm )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:791:3: lv_type_6_0= ruleterm
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTermPiAccess().getTypeTermParserRuleCall_4_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleterm_in_ruletermPi1848);
                    lv_type_6_0=ruleterm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTermPiRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_6_0, 
                              		"term");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:807:2: ( ruleWS )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( ((LA19_0>=RULE_LINESP && LA19_0<=RULE_ML2_COMMENT)) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:808:5: ruleWS
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getTermPiAccess().getWSParserRuleCall_4_3()); 
                    	          
                    	    }
                    	    pushFollow(FOLLOW_ruleWS_in_ruletermPi1865);
                    	    ruleWS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              afterParserOrEnumRuleCall();
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;

            }

            this_RCBRACKET_8=(Token)match(input,RULE_RCBRACKET,FOLLOW_RULE_RCBRACKET_in_ruletermPi1879); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RCBRACKET_8, grammarAccess.getTermPiAccess().getRCBRACKETTerminalRuleCall_5()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletermPi"


    // $ANTLR start "entryRuletermLambda"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:827:1: entryRuletermLambda returns [EObject current=null] : iv_ruletermLambda= ruletermLambda EOF ;
    public final EObject entryRuletermLambda() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletermLambda = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:828:2: (iv_ruletermLambda= ruletermLambda EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:829:2: iv_ruletermLambda= ruletermLambda EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTermLambdaRule()); 
            }
            pushFollow(FOLLOW_ruletermLambda_in_entryRuletermLambda1914);
            iv_ruletermLambda=ruletermLambda();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletermLambda; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuletermLambda1924); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletermLambda"


    // $ANTLR start "ruletermLambda"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:836:1: ruletermLambda returns [EObject current=null] : (this_LSBRACKET_0= RULE_LSBRACKET ( ruleWS )* ( ( (lv_name_2_1= RULE_CID | lv_name_2_2= RULE_UNDERSCORE ) ) ) ( ruleWS )* (this_COLON_4= RULE_COLON ( ruleWS )* ( (lv_type_6_0= ruleterm ) ) ( ruleWS )* )? this_RSBRACKET_8= RULE_RSBRACKET ) ;
    public final EObject ruletermLambda() throws RecognitionException {
        EObject current = null;

        Token this_LSBRACKET_0=null;
        Token lv_name_2_1=null;
        Token lv_name_2_2=null;
        Token this_COLON_4=null;
        Token this_RSBRACKET_8=null;
        EObject lv_type_6_0 = null;


         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:839:28: ( (this_LSBRACKET_0= RULE_LSBRACKET ( ruleWS )* ( ( (lv_name_2_1= RULE_CID | lv_name_2_2= RULE_UNDERSCORE ) ) ) ( ruleWS )* (this_COLON_4= RULE_COLON ( ruleWS )* ( (lv_type_6_0= ruleterm ) ) ( ruleWS )* )? this_RSBRACKET_8= RULE_RSBRACKET ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:840:1: (this_LSBRACKET_0= RULE_LSBRACKET ( ruleWS )* ( ( (lv_name_2_1= RULE_CID | lv_name_2_2= RULE_UNDERSCORE ) ) ) ( ruleWS )* (this_COLON_4= RULE_COLON ( ruleWS )* ( (lv_type_6_0= ruleterm ) ) ( ruleWS )* )? this_RSBRACKET_8= RULE_RSBRACKET )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:840:1: (this_LSBRACKET_0= RULE_LSBRACKET ( ruleWS )* ( ( (lv_name_2_1= RULE_CID | lv_name_2_2= RULE_UNDERSCORE ) ) ) ( ruleWS )* (this_COLON_4= RULE_COLON ( ruleWS )* ( (lv_type_6_0= ruleterm ) ) ( ruleWS )* )? this_RSBRACKET_8= RULE_RSBRACKET )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:840:2: this_LSBRACKET_0= RULE_LSBRACKET ( ruleWS )* ( ( (lv_name_2_1= RULE_CID | lv_name_2_2= RULE_UNDERSCORE ) ) ) ( ruleWS )* (this_COLON_4= RULE_COLON ( ruleWS )* ( (lv_type_6_0= ruleterm ) ) ( ruleWS )* )? this_RSBRACKET_8= RULE_RSBRACKET
            {
            this_LSBRACKET_0=(Token)match(input,RULE_LSBRACKET,FOLLOW_RULE_LSBRACKET_in_ruletermLambda1960); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LSBRACKET_0, grammarAccess.getTermLambdaAccess().getLSBRACKETTerminalRuleCall_0()); 
                  
            }
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:844:1: ( ruleWS )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=RULE_LINESP && LA21_0<=RULE_ML2_COMMENT)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:845:5: ruleWS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getTermLambdaAccess().getWSParserRuleCall_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleWS_in_ruletermLambda1976);
            	    ruleWS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:852:3: ( ( (lv_name_2_1= RULE_CID | lv_name_2_2= RULE_UNDERSCORE ) ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:853:1: ( (lv_name_2_1= RULE_CID | lv_name_2_2= RULE_UNDERSCORE ) )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:853:1: ( (lv_name_2_1= RULE_CID | lv_name_2_2= RULE_UNDERSCORE ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:854:1: (lv_name_2_1= RULE_CID | lv_name_2_2= RULE_UNDERSCORE )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:854:1: (lv_name_2_1= RULE_CID | lv_name_2_2= RULE_UNDERSCORE )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_CID) ) {
                alt22=1;
            }
            else if ( (LA22_0==RULE_UNDERSCORE) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:855:3: lv_name_2_1= RULE_CID
                    {
                    lv_name_2_1=(Token)match(input,RULE_CID,FOLLOW_RULE_CID_in_ruletermLambda1996); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_2_1, grammarAccess.getTermLambdaAccess().getNameCIDTerminalRuleCall_2_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTermLambdaRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_2_1, 
                              		"CID");
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:870:8: lv_name_2_2= RULE_UNDERSCORE
                    {
                    lv_name_2_2=(Token)match(input,RULE_UNDERSCORE,FOLLOW_RULE_UNDERSCORE_in_ruletermLambda2016); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_2_2, grammarAccess.getTermLambdaAccess().getNameUNDERSCORETerminalRuleCall_2_0_1()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTermLambdaRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_2_2, 
                              		"UNDERSCORE");
                      	    
                    }

                    }
                    break;

            }


            }


            }

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:888:2: ( ruleWS )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=RULE_LINESP && LA23_0<=RULE_ML2_COMMENT)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:889:5: ruleWS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getTermLambdaAccess().getWSParserRuleCall_3()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleWS_in_ruletermLambda2041);
            	    ruleWS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:896:3: (this_COLON_4= RULE_COLON ( ruleWS )* ( (lv_type_6_0= ruleterm ) ) ( ruleWS )* )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_COLON) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:896:4: this_COLON_4= RULE_COLON ( ruleWS )* ( (lv_type_6_0= ruleterm ) ) ( ruleWS )*
                    {
                    this_COLON_4=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruletermLambda2054); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COLON_4, grammarAccess.getTermLambdaAccess().getCOLONTerminalRuleCall_4_0()); 
                          
                    }
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:900:1: ( ruleWS )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( ((LA24_0>=RULE_LINESP && LA24_0<=RULE_ML2_COMMENT)) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:901:5: ruleWS
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getTermLambdaAccess().getWSParserRuleCall_4_1()); 
                    	          
                    	    }
                    	    pushFollow(FOLLOW_ruleWS_in_ruletermLambda2070);
                    	    ruleWS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              afterParserOrEnumRuleCall();
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:908:3: ( (lv_type_6_0= ruleterm ) )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:909:1: (lv_type_6_0= ruleterm )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:909:1: (lv_type_6_0= ruleterm )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:910:3: lv_type_6_0= ruleterm
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTermLambdaAccess().getTypeTermParserRuleCall_4_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleterm_in_ruletermLambda2092);
                    lv_type_6_0=ruleterm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTermLambdaRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_6_0, 
                              		"term");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:926:2: ( ruleWS )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( ((LA25_0>=RULE_LINESP && LA25_0<=RULE_ML2_COMMENT)) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:927:5: ruleWS
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getTermLambdaAccess().getWSParserRuleCall_4_3()); 
                    	          
                    	    }
                    	    pushFollow(FOLLOW_ruleWS_in_ruletermLambda2109);
                    	    ruleWS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              afterParserOrEnumRuleCall();
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);


                    }
                    break;

            }

            this_RSBRACKET_8=(Token)match(input,RULE_RSBRACKET,FOLLOW_RULE_RSBRACKET_in_ruletermLambda2123); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RSBRACKET_8, grammarAccess.getTermLambdaAccess().getRSBRACKETTerminalRuleCall_5()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletermLambda"


    // $ANTLR start "entryRuletermArr"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:946:1: entryRuletermArr returns [EObject current=null] : iv_ruletermArr= ruletermArr EOF ;
    public final EObject entryRuletermArr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletermArr = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:947:2: (iv_ruletermArr= ruletermArr EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:948:2: iv_ruletermArr= ruletermArr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTermArrRule()); 
            }
            pushFollow(FOLLOW_ruletermArr_in_entryRuletermArr2158);
            iv_ruletermArr=ruletermArr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletermArr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuletermArr2168); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletermArr"


    // $ANTLR start "ruletermArr"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:955:1: ruletermArr returns [EObject current=null] : (this_termAppOrLambdaOrPi_0= ruletermAppOrLambdaOrPi ( () ( ruleWS )+ (this_ARROW_3= RULE_ARROW | this_LARROW_4= RULE_LARROW ) ( ruleWS )+ ( (lv_right_6_0= ruletermArr ) ) )? ) ;
    public final EObject ruletermArr() throws RecognitionException {
        EObject current = null;

        Token this_ARROW_3=null;
        Token this_LARROW_4=null;
        EObject this_termAppOrLambdaOrPi_0 = null;

        EObject lv_right_6_0 = null;


         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:958:28: ( (this_termAppOrLambdaOrPi_0= ruletermAppOrLambdaOrPi ( () ( ruleWS )+ (this_ARROW_3= RULE_ARROW | this_LARROW_4= RULE_LARROW ) ( ruleWS )+ ( (lv_right_6_0= ruletermArr ) ) )? ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:959:1: (this_termAppOrLambdaOrPi_0= ruletermAppOrLambdaOrPi ( () ( ruleWS )+ (this_ARROW_3= RULE_ARROW | this_LARROW_4= RULE_LARROW ) ( ruleWS )+ ( (lv_right_6_0= ruletermArr ) ) )? )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:959:1: (this_termAppOrLambdaOrPi_0= ruletermAppOrLambdaOrPi ( () ( ruleWS )+ (this_ARROW_3= RULE_ARROW | this_LARROW_4= RULE_LARROW ) ( ruleWS )+ ( (lv_right_6_0= ruletermArr ) ) )? )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:960:5: this_termAppOrLambdaOrPi_0= ruletermAppOrLambdaOrPi ( () ( ruleWS )+ (this_ARROW_3= RULE_ARROW | this_LARROW_4= RULE_LARROW ) ( ruleWS )+ ( (lv_right_6_0= ruletermArr ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getTermArrAccess().getTermAppOrLambdaOrPiParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruletermAppOrLambdaOrPi_in_ruletermArr2215);
            this_termAppOrLambdaOrPi_0=ruletermAppOrLambdaOrPi();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_termAppOrLambdaOrPi_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:968:1: ( () ( ruleWS )+ (this_ARROW_3= RULE_ARROW | this_LARROW_4= RULE_LARROW ) ( ruleWS )+ ( (lv_right_6_0= ruletermArr ) ) )?
            int alt30=2;
            alt30 = dfa30.predict(input);
            switch (alt30) {
                case 1 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:968:2: () ( ruleWS )+ (this_ARROW_3= RULE_ARROW | this_LARROW_4= RULE_LARROW ) ( ruleWS )+ ( (lv_right_6_0= ruletermArr ) )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:968:2: ()
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:969:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getTermArrAccess().getTermLeftAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:974:2: ( ruleWS )+
                    int cnt27=0;
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( ((LA27_0>=RULE_LINESP && LA27_0<=RULE_ML2_COMMENT)) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:975:5: ruleWS
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getTermArrAccess().getWSParserRuleCall_1_1()); 
                    	          
                    	    }
                    	    pushFollow(FOLLOW_ruleWS_in_ruletermArr2241);
                    	    ruleWS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              afterParserOrEnumRuleCall();
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt27 >= 1 ) break loop27;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(27, input);
                                throw eee;
                        }
                        cnt27++;
                    } while (true);

                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:982:3: (this_ARROW_3= RULE_ARROW | this_LARROW_4= RULE_LARROW )
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==RULE_ARROW) ) {
                        alt28=1;
                    }
                    else if ( (LA28_0==RULE_LARROW) ) {
                        alt28=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 0, input);

                        throw nvae;
                    }
                    switch (alt28) {
                        case 1 :
                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:982:4: this_ARROW_3= RULE_ARROW
                            {
                            this_ARROW_3=(Token)match(input,RULE_ARROW,FOLLOW_RULE_ARROW_in_ruletermArr2254); if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_ARROW_3, grammarAccess.getTermArrAccess().getARROWTerminalRuleCall_1_2_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:987:6: this_LARROW_4= RULE_LARROW
                            {
                            this_LARROW_4=(Token)match(input,RULE_LARROW,FOLLOW_RULE_LARROW_in_ruletermArr2270); if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_LARROW_4, grammarAccess.getTermArrAccess().getLARROWTerminalRuleCall_1_2_1()); 
                                  
                            }

                            }
                            break;

                    }

                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:991:2: ( ruleWS )+
                    int cnt29=0;
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( ((LA29_0>=RULE_LINESP && LA29_0<=RULE_ML2_COMMENT)) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:992:5: ruleWS
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getTermArrAccess().getWSParserRuleCall_1_3()); 
                    	          
                    	    }
                    	    pushFollow(FOLLOW_ruleWS_in_ruletermArr2287);
                    	    ruleWS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              afterParserOrEnumRuleCall();
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt29 >= 1 ) break loop29;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(29, input);
                                throw eee;
                        }
                        cnt29++;
                    } while (true);

                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:999:3: ( (lv_right_6_0= ruletermArr ) )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1000:1: (lv_right_6_0= ruletermArr )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1000:1: (lv_right_6_0= ruletermArr )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1001:3: lv_right_6_0= ruletermArr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTermArrAccess().getRightTermArrParserRuleCall_1_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruletermArr_in_ruletermArr2309);
                    lv_right_6_0=ruletermArr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTermArrRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_6_0, 
                              		"termArr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletermArr"


    // $ANTLR start "entryRuletermAppOrLambdaOrPi"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1025:1: entryRuletermAppOrLambdaOrPi returns [EObject current=null] : iv_ruletermAppOrLambdaOrPi= ruletermAppOrLambdaOrPi EOF ;
    public final EObject entryRuletermAppOrLambdaOrPi() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletermAppOrLambdaOrPi = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1026:2: (iv_ruletermAppOrLambdaOrPi= ruletermAppOrLambdaOrPi EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1027:2: iv_ruletermAppOrLambdaOrPi= ruletermAppOrLambdaOrPi EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTermAppOrLambdaOrPiRule()); 
            }
            pushFollow(FOLLOW_ruletermAppOrLambdaOrPi_in_entryRuletermAppOrLambdaOrPi2347);
            iv_ruletermAppOrLambdaOrPi=ruletermAppOrLambdaOrPi();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletermAppOrLambdaOrPi; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuletermAppOrLambdaOrPi2357); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletermAppOrLambdaOrPi"


    // $ANTLR start "ruletermAppOrLambdaOrPi"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1034:1: ruletermAppOrLambdaOrPi returns [EObject current=null] : (this_termLambdaOrPi_0= ruletermLambdaOrPi | ( ( (lv_left_1_0= ruletermAppNoLambdaNoPi ) ) ( ( ruleWS )* ( (lv_right_3_0= ruletermLambdaOrPi ) ) )? ) ) ;
    public final EObject ruletermAppOrLambdaOrPi() throws RecognitionException {
        EObject current = null;

        EObject this_termLambdaOrPi_0 = null;

        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1037:28: ( (this_termLambdaOrPi_0= ruletermLambdaOrPi | ( ( (lv_left_1_0= ruletermAppNoLambdaNoPi ) ) ( ( ruleWS )* ( (lv_right_3_0= ruletermLambdaOrPi ) ) )? ) ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1038:1: (this_termLambdaOrPi_0= ruletermLambdaOrPi | ( ( (lv_left_1_0= ruletermAppNoLambdaNoPi ) ) ( ( ruleWS )* ( (lv_right_3_0= ruletermLambdaOrPi ) ) )? ) )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1038:1: (this_termLambdaOrPi_0= ruletermLambdaOrPi | ( ( (lv_left_1_0= ruletermAppNoLambdaNoPi ) ) ( ( ruleWS )* ( (lv_right_3_0= ruletermLambdaOrPi ) ) )? ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_LCBRACKET||LA33_0==RULE_LSBRACKET) ) {
                alt33=1;
            }
            else if ( (LA33_0==RULE_LBRACKET||(LA33_0>=RULE_TYPE && LA33_0<=RULE_CID)) ) {
                alt33=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1039:5: this_termLambdaOrPi_0= ruletermLambdaOrPi
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTermAppOrLambdaOrPiAccess().getTermLambdaOrPiParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruletermLambdaOrPi_in_ruletermAppOrLambdaOrPi2404);
                    this_termLambdaOrPi_0=ruletermLambdaOrPi();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_termLambdaOrPi_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1048:6: ( ( (lv_left_1_0= ruletermAppNoLambdaNoPi ) ) ( ( ruleWS )* ( (lv_right_3_0= ruletermLambdaOrPi ) ) )? )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1048:6: ( ( (lv_left_1_0= ruletermAppNoLambdaNoPi ) ) ( ( ruleWS )* ( (lv_right_3_0= ruletermLambdaOrPi ) ) )? )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1048:7: ( (lv_left_1_0= ruletermAppNoLambdaNoPi ) ) ( ( ruleWS )* ( (lv_right_3_0= ruletermLambdaOrPi ) ) )?
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1048:7: ( (lv_left_1_0= ruletermAppNoLambdaNoPi ) )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1049:1: (lv_left_1_0= ruletermAppNoLambdaNoPi )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1049:1: (lv_left_1_0= ruletermAppNoLambdaNoPi )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1050:3: lv_left_1_0= ruletermAppNoLambdaNoPi
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTermAppOrLambdaOrPiAccess().getLeftTermAppNoLambdaNoPiParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruletermAppNoLambdaNoPi_in_ruletermAppOrLambdaOrPi2431);
                    lv_left_1_0=ruletermAppNoLambdaNoPi();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTermAppOrLambdaOrPiRule());
                      	        }
                             		set(
                             			current, 
                             			"left",
                              		lv_left_1_0, 
                              		"termAppNoLambdaNoPi");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1066:2: ( ( ruleWS )* ( (lv_right_3_0= ruletermLambdaOrPi ) ) )?
                    int alt32=2;
                    alt32 = dfa32.predict(input);
                    switch (alt32) {
                        case 1 :
                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1066:3: ( ruleWS )* ( (lv_right_3_0= ruletermLambdaOrPi ) )
                            {
                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1066:3: ( ruleWS )*
                            loop31:
                            do {
                                int alt31=2;
                                int LA31_0 = input.LA(1);

                                if ( ((LA31_0>=RULE_LINESP && LA31_0<=RULE_ML2_COMMENT)) ) {
                                    alt31=1;
                                }


                                switch (alt31) {
                            	case 1 :
                            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1067:5: ruleWS
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	              newCompositeNode(grammarAccess.getTermAppOrLambdaOrPiAccess().getWSParserRuleCall_1_1_0()); 
                            	          
                            	    }
                            	    pushFollow(FOLLOW_ruleWS_in_ruletermAppOrLambdaOrPi2449);
                            	    ruleWS();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {
                            	       
                            	              afterParserOrEnumRuleCall();
                            	          
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    break loop31;
                                }
                            } while (true);

                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1074:3: ( (lv_right_3_0= ruletermLambdaOrPi ) )
                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1075:1: (lv_right_3_0= ruletermLambdaOrPi )
                            {
                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1075:1: (lv_right_3_0= ruletermLambdaOrPi )
                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1076:3: lv_right_3_0= ruletermLambdaOrPi
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getTermAppOrLambdaOrPiAccess().getRightTermLambdaOrPiParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruletermLambdaOrPi_in_ruletermAppOrLambdaOrPi2471);
                            lv_right_3_0=ruletermLambdaOrPi();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getTermAppOrLambdaOrPiRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"right",
                                      		lv_right_3_0, 
                                      		"termLambdaOrPi");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletermAppOrLambdaOrPi"


    // $ANTLR start "entryRuletermAppThenLambdaOrPi"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1100:1: entryRuletermAppThenLambdaOrPi returns [EObject current=null] : iv_ruletermAppThenLambdaOrPi= ruletermAppThenLambdaOrPi EOF ;
    public final EObject entryRuletermAppThenLambdaOrPi() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletermAppThenLambdaOrPi = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1101:2: (iv_ruletermAppThenLambdaOrPi= ruletermAppThenLambdaOrPi EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1102:2: iv_ruletermAppThenLambdaOrPi= ruletermAppThenLambdaOrPi EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTermAppThenLambdaOrPiRule()); 
            }
            pushFollow(FOLLOW_ruletermAppThenLambdaOrPi_in_entryRuletermAppThenLambdaOrPi2510);
            iv_ruletermAppThenLambdaOrPi=ruletermAppThenLambdaOrPi();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletermAppThenLambdaOrPi; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuletermAppThenLambdaOrPi2520); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletermAppThenLambdaOrPi"


    // $ANTLR start "ruletermAppThenLambdaOrPi"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1109:1: ruletermAppThenLambdaOrPi returns [EObject current=null] : ( ( (lv_left_0_0= ruletermAppNoLambdaNoPi ) ) ( ( ruleWS )* ( (lv_right_2_0= ruletermLambdaOrPi ) ) )? ) ;
    public final EObject ruletermAppThenLambdaOrPi() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        EObject lv_right_2_0 = null;


         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1112:28: ( ( ( (lv_left_0_0= ruletermAppNoLambdaNoPi ) ) ( ( ruleWS )* ( (lv_right_2_0= ruletermLambdaOrPi ) ) )? ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1113:1: ( ( (lv_left_0_0= ruletermAppNoLambdaNoPi ) ) ( ( ruleWS )* ( (lv_right_2_0= ruletermLambdaOrPi ) ) )? )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1113:1: ( ( (lv_left_0_0= ruletermAppNoLambdaNoPi ) ) ( ( ruleWS )* ( (lv_right_2_0= ruletermLambdaOrPi ) ) )? )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1113:2: ( (lv_left_0_0= ruletermAppNoLambdaNoPi ) ) ( ( ruleWS )* ( (lv_right_2_0= ruletermLambdaOrPi ) ) )?
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1113:2: ( (lv_left_0_0= ruletermAppNoLambdaNoPi ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1114:1: (lv_left_0_0= ruletermAppNoLambdaNoPi )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1114:1: (lv_left_0_0= ruletermAppNoLambdaNoPi )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1115:3: lv_left_0_0= ruletermAppNoLambdaNoPi
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTermAppThenLambdaOrPiAccess().getLeftTermAppNoLambdaNoPiParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruletermAppNoLambdaNoPi_in_ruletermAppThenLambdaOrPi2566);
            lv_left_0_0=ruletermAppNoLambdaNoPi();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTermAppThenLambdaOrPiRule());
              	        }
                     		set(
                     			current, 
                     			"left",
                      		lv_left_0_0, 
                      		"termAppNoLambdaNoPi");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1131:2: ( ( ruleWS )* ( (lv_right_2_0= ruletermLambdaOrPi ) ) )?
            int alt35=2;
            alt35 = dfa35.predict(input);
            switch (alt35) {
                case 1 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1131:3: ( ruleWS )* ( (lv_right_2_0= ruletermLambdaOrPi ) )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1131:3: ( ruleWS )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( ((LA34_0>=RULE_LINESP && LA34_0<=RULE_ML2_COMMENT)) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1132:5: ruleWS
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getTermAppThenLambdaOrPiAccess().getWSParserRuleCall_1_0()); 
                    	          
                    	    }
                    	    pushFollow(FOLLOW_ruleWS_in_ruletermAppThenLambdaOrPi2584);
                    	    ruleWS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              afterParserOrEnumRuleCall();
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);

                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1139:3: ( (lv_right_2_0= ruletermLambdaOrPi ) )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1140:1: (lv_right_2_0= ruletermLambdaOrPi )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1140:1: (lv_right_2_0= ruletermLambdaOrPi )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1141:3: lv_right_2_0= ruletermLambdaOrPi
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTermAppThenLambdaOrPiAccess().getRightTermLambdaOrPiParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruletermLambdaOrPi_in_ruletermAppThenLambdaOrPi2606);
                    lv_right_2_0=ruletermLambdaOrPi();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTermAppThenLambdaOrPiRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_2_0, 
                              		"termLambdaOrPi");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletermAppThenLambdaOrPi"


    // $ANTLR start "entryRuletermAppNoLambdaNoPi"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1165:1: entryRuletermAppNoLambdaNoPi returns [EObject current=null] : iv_ruletermAppNoLambdaNoPi= ruletermAppNoLambdaNoPi EOF ;
    public final EObject entryRuletermAppNoLambdaNoPi() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletermAppNoLambdaNoPi = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1166:2: (iv_ruletermAppNoLambdaNoPi= ruletermAppNoLambdaNoPi EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1167:2: iv_ruletermAppNoLambdaNoPi= ruletermAppNoLambdaNoPi EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTermAppNoLambdaNoPiRule()); 
            }
            pushFollow(FOLLOW_ruletermAppNoLambdaNoPi_in_entryRuletermAppNoLambdaNoPi2644);
            iv_ruletermAppNoLambdaNoPi=ruletermAppNoLambdaNoPi();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletermAppNoLambdaNoPi; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuletermAppNoLambdaNoPi2654); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletermAppNoLambdaNoPi"


    // $ANTLR start "ruletermAppNoLambdaNoPi"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1174:1: ruletermAppNoLambdaNoPi returns [EObject current=null] : (this_termBase_0= ruletermBase ( () ( ruleWS )+ ( (lv_right_3_0= ruletermBase ) ) )* ) ;
    public final EObject ruletermAppNoLambdaNoPi() throws RecognitionException {
        EObject current = null;

        EObject this_termBase_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1177:28: ( (this_termBase_0= ruletermBase ( () ( ruleWS )+ ( (lv_right_3_0= ruletermBase ) ) )* ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1178:1: (this_termBase_0= ruletermBase ( () ( ruleWS )+ ( (lv_right_3_0= ruletermBase ) ) )* )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1178:1: (this_termBase_0= ruletermBase ( () ( ruleWS )+ ( (lv_right_3_0= ruletermBase ) ) )* )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1179:5: this_termBase_0= ruletermBase ( () ( ruleWS )+ ( (lv_right_3_0= ruletermBase ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getTermAppNoLambdaNoPiAccess().getTermBaseParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruletermBase_in_ruletermAppNoLambdaNoPi2701);
            this_termBase_0=ruletermBase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_termBase_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1187:1: ( () ( ruleWS )+ ( (lv_right_3_0= ruletermBase ) ) )*
            loop37:
            do {
                int alt37=2;
                alt37 = dfa37.predict(input);
                switch (alt37) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1187:2: () ( ruleWS )+ ( (lv_right_3_0= ruletermBase ) )
            	    {
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1187:2: ()
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1188:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getTermAppNoLambdaNoPiAccess().getTermLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1193:2: ( ruleWS )+
            	    int cnt36=0;
            	    loop36:
            	    do {
            	        int alt36=2;
            	        int LA36_0 = input.LA(1);

            	        if ( ((LA36_0>=RULE_LINESP && LA36_0<=RULE_ML2_COMMENT)) ) {
            	            alt36=1;
            	        }


            	        switch (alt36) {
            	    	case 1 :
            	    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1194:5: ruleWS
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	              newCompositeNode(grammarAccess.getTermAppNoLambdaNoPiAccess().getWSParserRuleCall_1_1()); 
            	    	          
            	    	    }
            	    	    pushFollow(FOLLOW_ruleWS_in_ruletermAppNoLambdaNoPi2727);
            	    	    ruleWS();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	              afterParserOrEnumRuleCall();
            	    	          
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt36 >= 1 ) break loop36;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(36, input);
            	                throw eee;
            	        }
            	        cnt36++;
            	    } while (true);

            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1201:3: ( (lv_right_3_0= ruletermBase ) )
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1202:1: (lv_right_3_0= ruletermBase )
            	    {
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1202:1: (lv_right_3_0= ruletermBase )
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1203:3: lv_right_3_0= ruletermBase
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTermAppNoLambdaNoPiAccess().getRightTermBaseParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruletermBase_in_ruletermAppNoLambdaNoPi2749);
            	    lv_right_3_0=ruletermBase();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTermAppNoLambdaNoPiRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"termBase");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletermAppNoLambdaNoPi"


    // $ANTLR start "entryRuletermLambdaOrPi"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1227:1: entryRuletermLambdaOrPi returns [EObject current=null] : iv_ruletermLambdaOrPi= ruletermLambdaOrPi EOF ;
    public final EObject entryRuletermLambdaOrPi() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletermLambdaOrPi = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1228:2: (iv_ruletermLambdaOrPi= ruletermLambdaOrPi EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1229:2: iv_ruletermLambdaOrPi= ruletermLambdaOrPi EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTermLambdaOrPiRule()); 
            }
            pushFollow(FOLLOW_ruletermLambdaOrPi_in_entryRuletermLambdaOrPi2787);
            iv_ruletermLambdaOrPi=ruletermLambdaOrPi();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletermLambdaOrPi; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuletermLambdaOrPi2797); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletermLambdaOrPi"


    // $ANTLR start "ruletermLambdaOrPi"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1236:1: ruletermLambdaOrPi returns [EObject current=null] : ( ( ( ( (lv_quantifiers_0_1= ruletermPi | lv_quantifiers_0_2= ruletermLambda ) ) ) ( ruleWS )* )+ ( (lv_right_2_0= ruletermAppThenLambdaOrPi ) ) ) ;
    public final EObject ruletermLambdaOrPi() throws RecognitionException {
        EObject current = null;

        EObject lv_quantifiers_0_1 = null;

        EObject lv_quantifiers_0_2 = null;

        EObject lv_right_2_0 = null;


         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1239:28: ( ( ( ( ( (lv_quantifiers_0_1= ruletermPi | lv_quantifiers_0_2= ruletermLambda ) ) ) ( ruleWS )* )+ ( (lv_right_2_0= ruletermAppThenLambdaOrPi ) ) ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1240:1: ( ( ( ( (lv_quantifiers_0_1= ruletermPi | lv_quantifiers_0_2= ruletermLambda ) ) ) ( ruleWS )* )+ ( (lv_right_2_0= ruletermAppThenLambdaOrPi ) ) )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1240:1: ( ( ( ( (lv_quantifiers_0_1= ruletermPi | lv_quantifiers_0_2= ruletermLambda ) ) ) ( ruleWS )* )+ ( (lv_right_2_0= ruletermAppThenLambdaOrPi ) ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1240:2: ( ( ( (lv_quantifiers_0_1= ruletermPi | lv_quantifiers_0_2= ruletermLambda ) ) ) ( ruleWS )* )+ ( (lv_right_2_0= ruletermAppThenLambdaOrPi ) )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1240:2: ( ( ( (lv_quantifiers_0_1= ruletermPi | lv_quantifiers_0_2= ruletermLambda ) ) ) ( ruleWS )* )+
            int cnt40=0;
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_LCBRACKET||LA40_0==RULE_LSBRACKET) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1240:3: ( ( (lv_quantifiers_0_1= ruletermPi | lv_quantifiers_0_2= ruletermLambda ) ) ) ( ruleWS )*
            	    {
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1240:3: ( ( (lv_quantifiers_0_1= ruletermPi | lv_quantifiers_0_2= ruletermLambda ) ) )
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1241:1: ( (lv_quantifiers_0_1= ruletermPi | lv_quantifiers_0_2= ruletermLambda ) )
            	    {
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1241:1: ( (lv_quantifiers_0_1= ruletermPi | lv_quantifiers_0_2= ruletermLambda ) )
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1242:1: (lv_quantifiers_0_1= ruletermPi | lv_quantifiers_0_2= ruletermLambda )
            	    {
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1242:1: (lv_quantifiers_0_1= ruletermPi | lv_quantifiers_0_2= ruletermLambda )
            	    int alt38=2;
            	    int LA38_0 = input.LA(1);

            	    if ( (LA38_0==RULE_LCBRACKET) ) {
            	        alt38=1;
            	    }
            	    else if ( (LA38_0==RULE_LSBRACKET) ) {
            	        alt38=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 38, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt38) {
            	        case 1 :
            	            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1243:3: lv_quantifiers_0_1= ruletermPi
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getTermLambdaOrPiAccess().getQuantifiersTermPiParserRuleCall_0_0_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruletermPi_in_ruletermLambdaOrPi2846);
            	            lv_quantifiers_0_1=ruletermPi();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getTermLambdaOrPiRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"quantifiers",
            	                      		lv_quantifiers_0_1, 
            	                      		"termPi");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1258:8: lv_quantifiers_0_2= ruletermLambda
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getTermLambdaOrPiAccess().getQuantifiersTermLambdaParserRuleCall_0_0_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruletermLambda_in_ruletermLambdaOrPi2865);
            	            lv_quantifiers_0_2=ruletermLambda();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getTermLambdaOrPiRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"quantifiers",
            	                      		lv_quantifiers_0_2, 
            	                      		"termLambda");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1276:2: ( ruleWS )*
            	    loop39:
            	    do {
            	        int alt39=2;
            	        int LA39_0 = input.LA(1);

            	        if ( ((LA39_0>=RULE_LINESP && LA39_0<=RULE_ML2_COMMENT)) ) {
            	            alt39=1;
            	        }


            	        switch (alt39) {
            	    	case 1 :
            	    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1277:5: ruleWS
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	              newCompositeNode(grammarAccess.getTermLambdaOrPiAccess().getWSParserRuleCall_0_1()); 
            	    	          
            	    	    }
            	    	    pushFollow(FOLLOW_ruleWS_in_ruletermLambdaOrPi2885);
            	    	    ruleWS();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	              afterParserOrEnumRuleCall();
            	    	          
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop39;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    if ( cnt40 >= 1 ) break loop40;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(40, input);
                        throw eee;
                }
                cnt40++;
            } while (true);

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1284:5: ( (lv_right_2_0= ruletermAppThenLambdaOrPi ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1285:1: (lv_right_2_0= ruletermAppThenLambdaOrPi )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1285:1: (lv_right_2_0= ruletermAppThenLambdaOrPi )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1286:3: lv_right_2_0= ruletermAppThenLambdaOrPi
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTermLambdaOrPiAccess().getRightTermAppThenLambdaOrPiParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruletermAppThenLambdaOrPi_in_ruletermLambdaOrPi2909);
            lv_right_2_0=ruletermAppThenLambdaOrPi();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTermLambdaOrPiRule());
              	        }
                     		set(
                     			current, 
                     			"right",
                      		lv_right_2_0, 
                      		"termAppThenLambdaOrPi");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletermLambdaOrPi"


    // $ANTLR start "entryRuletermBase"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1310:1: entryRuletermBase returns [EObject current=null] : iv_ruletermBase= ruletermBase EOF ;
    public final EObject entryRuletermBase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletermBase = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1311:2: (iv_ruletermBase= ruletermBase EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1312:2: iv_ruletermBase= ruletermBase EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTermBaseRule()); 
            }
            pushFollow(FOLLOW_ruletermBase_in_entryRuletermBase2945);
            iv_ruletermBase=ruletermBase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletermBase; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuletermBase2955); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletermBase"


    // $ANTLR start "ruletermBase"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1319:1: ruletermBase returns [EObject current=null] : ( ( (lv_term_0_0= ruletermAtomic ) ) | ( () this_LBRACKET_2= RULE_LBRACKET ( ruleWS )* ( ( (lv_term_4_0= ruleterm ) ) ( ruleWS )* (this_COLON_6= RULE_COLON ( ruleWS )* ( (lv_type_8_0= ruleterm ) ) ( ruleWS )* )? )? this_RBRACKET_10= RULE_RBRACKET ) ) ;
    public final EObject ruletermBase() throws RecognitionException {
        EObject current = null;

        Token this_LBRACKET_2=null;
        Token this_COLON_6=null;
        Token this_RBRACKET_10=null;
        EObject lv_term_0_0 = null;

        EObject lv_term_4_0 = null;

        EObject lv_type_8_0 = null;


         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1322:28: ( ( ( (lv_term_0_0= ruletermAtomic ) ) | ( () this_LBRACKET_2= RULE_LBRACKET ( ruleWS )* ( ( (lv_term_4_0= ruleterm ) ) ( ruleWS )* (this_COLON_6= RULE_COLON ( ruleWS )* ( (lv_type_8_0= ruleterm ) ) ( ruleWS )* )? )? this_RBRACKET_10= RULE_RBRACKET ) ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1323:1: ( ( (lv_term_0_0= ruletermAtomic ) ) | ( () this_LBRACKET_2= RULE_LBRACKET ( ruleWS )* ( ( (lv_term_4_0= ruleterm ) ) ( ruleWS )* (this_COLON_6= RULE_COLON ( ruleWS )* ( (lv_type_8_0= ruleterm ) ) ( ruleWS )* )? )? this_RBRACKET_10= RULE_RBRACKET ) )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1323:1: ( ( (lv_term_0_0= ruletermAtomic ) ) | ( () this_LBRACKET_2= RULE_LBRACKET ( ruleWS )* ( ( (lv_term_4_0= ruleterm ) ) ( ruleWS )* (this_COLON_6= RULE_COLON ( ruleWS )* ( (lv_type_8_0= ruleterm ) ) ( ruleWS )* )? )? this_RBRACKET_10= RULE_RBRACKET ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=RULE_TYPE && LA47_0<=RULE_CID)) ) {
                alt47=1;
            }
            else if ( (LA47_0==RULE_LBRACKET) ) {
                alt47=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1323:2: ( (lv_term_0_0= ruletermAtomic ) )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1323:2: ( (lv_term_0_0= ruletermAtomic ) )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1324:1: (lv_term_0_0= ruletermAtomic )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1324:1: (lv_term_0_0= ruletermAtomic )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1325:3: lv_term_0_0= ruletermAtomic
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTermBaseAccess().getTermTermAtomicParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruletermAtomic_in_ruletermBase3001);
                    lv_term_0_0=ruletermAtomic();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTermBaseRule());
                      	        }
                             		set(
                             			current, 
                             			"term",
                              		lv_term_0_0, 
                              		"termAtomic");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1342:6: ( () this_LBRACKET_2= RULE_LBRACKET ( ruleWS )* ( ( (lv_term_4_0= ruleterm ) ) ( ruleWS )* (this_COLON_6= RULE_COLON ( ruleWS )* ( (lv_type_8_0= ruleterm ) ) ( ruleWS )* )? )? this_RBRACKET_10= RULE_RBRACKET )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1342:6: ( () this_LBRACKET_2= RULE_LBRACKET ( ruleWS )* ( ( (lv_term_4_0= ruleterm ) ) ( ruleWS )* (this_COLON_6= RULE_COLON ( ruleWS )* ( (lv_type_8_0= ruleterm ) ) ( ruleWS )* )? )? this_RBRACKET_10= RULE_RBRACKET )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1342:7: () this_LBRACKET_2= RULE_LBRACKET ( ruleWS )* ( ( (lv_term_4_0= ruleterm ) ) ( ruleWS )* (this_COLON_6= RULE_COLON ( ruleWS )* ( (lv_type_8_0= ruleterm ) ) ( ruleWS )* )? )? this_RBRACKET_10= RULE_RBRACKET
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1342:7: ()
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1343:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getTermBaseAccess().getTermAction_1_0(),
                                  current);
                          
                    }

                    }

                    this_LBRACKET_2=(Token)match(input,RULE_LBRACKET,FOLLOW_RULE_LBRACKET_in_ruletermBase3028); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LBRACKET_2, grammarAccess.getTermBaseAccess().getLBRACKETTerminalRuleCall_1_1()); 
                          
                    }
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1352:1: ( ruleWS )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( ((LA41_0>=RULE_LINESP && LA41_0<=RULE_ML2_COMMENT)) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1353:5: ruleWS
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getTermBaseAccess().getWSParserRuleCall_1_2()); 
                    	          
                    	    }
                    	    pushFollow(FOLLOW_ruleWS_in_ruletermBase3044);
                    	    ruleWS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              afterParserOrEnumRuleCall();
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);

                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1360:3: ( ( (lv_term_4_0= ruleterm ) ) ( ruleWS )* (this_COLON_6= RULE_COLON ( ruleWS )* ( (lv_type_8_0= ruleterm ) ) ( ruleWS )* )? )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==RULE_LCBRACKET||LA46_0==RULE_LSBRACKET||LA46_0==RULE_LBRACKET||(LA46_0>=RULE_TYPE && LA46_0<=RULE_CID)) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1360:4: ( (lv_term_4_0= ruleterm ) ) ( ruleWS )* (this_COLON_6= RULE_COLON ( ruleWS )* ( (lv_type_8_0= ruleterm ) ) ( ruleWS )* )?
                            {
                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1360:4: ( (lv_term_4_0= ruleterm ) )
                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1361:1: (lv_term_4_0= ruleterm )
                            {
                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1361:1: (lv_term_4_0= ruleterm )
                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1362:3: lv_term_4_0= ruleterm
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getTermBaseAccess().getTermTermParserRuleCall_1_3_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleterm_in_ruletermBase3067);
                            lv_term_4_0=ruleterm();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getTermBaseRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"term",
                                      		lv_term_4_0, 
                                      		"term");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1378:2: ( ruleWS )*
                            loop42:
                            do {
                                int alt42=2;
                                int LA42_0 = input.LA(1);

                                if ( ((LA42_0>=RULE_LINESP && LA42_0<=RULE_ML2_COMMENT)) ) {
                                    alt42=1;
                                }


                                switch (alt42) {
                            	case 1 :
                            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1379:5: ruleWS
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	              newCompositeNode(grammarAccess.getTermBaseAccess().getWSParserRuleCall_1_3_1()); 
                            	          
                            	    }
                            	    pushFollow(FOLLOW_ruleWS_in_ruletermBase3084);
                            	    ruleWS();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {
                            	       
                            	              afterParserOrEnumRuleCall();
                            	          
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    break loop42;
                                }
                            } while (true);

                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1386:3: (this_COLON_6= RULE_COLON ( ruleWS )* ( (lv_type_8_0= ruleterm ) ) ( ruleWS )* )?
                            int alt45=2;
                            int LA45_0 = input.LA(1);

                            if ( (LA45_0==RULE_COLON) ) {
                                alt45=1;
                            }
                            switch (alt45) {
                                case 1 :
                                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1386:4: this_COLON_6= RULE_COLON ( ruleWS )* ( (lv_type_8_0= ruleterm ) ) ( ruleWS )*
                                    {
                                    this_COLON_6=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruletermBase3097); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {
                                       
                                          newLeafNode(this_COLON_6, grammarAccess.getTermBaseAccess().getCOLONTerminalRuleCall_1_3_2_0()); 
                                          
                                    }
                                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1390:1: ( ruleWS )*
                                    loop43:
                                    do {
                                        int alt43=2;
                                        int LA43_0 = input.LA(1);

                                        if ( ((LA43_0>=RULE_LINESP && LA43_0<=RULE_ML2_COMMENT)) ) {
                                            alt43=1;
                                        }


                                        switch (alt43) {
                                    	case 1 :
                                    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1391:5: ruleWS
                                    	    {
                                    	    if ( state.backtracking==0 ) {
                                    	       
                                    	              newCompositeNode(grammarAccess.getTermBaseAccess().getWSParserRuleCall_1_3_2_1()); 
                                    	          
                                    	    }
                                    	    pushFollow(FOLLOW_ruleWS_in_ruletermBase3113);
                                    	    ruleWS();

                                    	    state._fsp--;
                                    	    if (state.failed) return current;
                                    	    if ( state.backtracking==0 ) {
                                    	       
                                    	              afterParserOrEnumRuleCall();
                                    	          
                                    	    }

                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop43;
                                        }
                                    } while (true);

                                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1398:3: ( (lv_type_8_0= ruleterm ) )
                                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1399:1: (lv_type_8_0= ruleterm )
                                    {
                                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1399:1: (lv_type_8_0= ruleterm )
                                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1400:3: lv_type_8_0= ruleterm
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	        newCompositeNode(grammarAccess.getTermBaseAccess().getTypeTermParserRuleCall_1_3_2_2_0()); 
                                      	    
                                    }
                                    pushFollow(FOLLOW_ruleterm_in_ruletermBase3135);
                                    lv_type_8_0=ruleterm();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElementForParent(grammarAccess.getTermBaseRule());
                                      	        }
                                             		set(
                                             			current, 
                                             			"type",
                                              		lv_type_8_0, 
                                              		"term");
                                      	        afterParserOrEnumRuleCall();
                                      	    
                                    }

                                    }


                                    }

                                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1416:2: ( ruleWS )*
                                    loop44:
                                    do {
                                        int alt44=2;
                                        int LA44_0 = input.LA(1);

                                        if ( ((LA44_0>=RULE_LINESP && LA44_0<=RULE_ML2_COMMENT)) ) {
                                            alt44=1;
                                        }


                                        switch (alt44) {
                                    	case 1 :
                                    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1417:5: ruleWS
                                    	    {
                                    	    if ( state.backtracking==0 ) {
                                    	       
                                    	              newCompositeNode(grammarAccess.getTermBaseAccess().getWSParserRuleCall_1_3_2_3()); 
                                    	          
                                    	    }
                                    	    pushFollow(FOLLOW_ruleWS_in_ruletermBase3152);
                                    	    ruleWS();

                                    	    state._fsp--;
                                    	    if (state.failed) return current;
                                    	    if ( state.backtracking==0 ) {
                                    	       
                                    	              afterParserOrEnumRuleCall();
                                    	          
                                    	    }

                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop44;
                                        }
                                    } while (true);


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    this_RBRACKET_10=(Token)match(input,RULE_RBRACKET,FOLLOW_RULE_RBRACKET_in_ruletermBase3168); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RBRACKET_10, grammarAccess.getTermBaseAccess().getRBRACKETTerminalRuleCall_1_4()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletermBase"


    // $ANTLR start "entryRuletermAtomic"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1436:1: entryRuletermAtomic returns [EObject current=null] : iv_ruletermAtomic= ruletermAtomic EOF ;
    public final EObject entryRuletermAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletermAtomic = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1437:2: (iv_ruletermAtomic= ruletermAtomic EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1438:2: iv_ruletermAtomic= ruletermAtomic EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTermAtomicRule()); 
            }
            pushFollow(FOLLOW_ruletermAtomic_in_entryRuletermAtomic3204);
            iv_ruletermAtomic=ruletermAtomic();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletermAtomic; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuletermAtomic3214); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletermAtomic"


    // $ANTLR start "ruletermAtomic"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1445:1: ruletermAtomic returns [EObject current=null] : ( ( (lv_atom_0_0= RULE_TYPE ) ) | ( (lv_atom_1_0= RULE_UNDERSCORE ) ) | ( (lv_atom_2_0= ruleID ) ) ) ;
    public final EObject ruletermAtomic() throws RecognitionException {
        EObject current = null;

        Token lv_atom_0_0=null;
        Token lv_atom_1_0=null;
        AntlrDatatypeRuleToken lv_atom_2_0 = null;


         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1448:28: ( ( ( (lv_atom_0_0= RULE_TYPE ) ) | ( (lv_atom_1_0= RULE_UNDERSCORE ) ) | ( (lv_atom_2_0= ruleID ) ) ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1449:1: ( ( (lv_atom_0_0= RULE_TYPE ) ) | ( (lv_atom_1_0= RULE_UNDERSCORE ) ) | ( (lv_atom_2_0= ruleID ) ) )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1449:1: ( ( (lv_atom_0_0= RULE_TYPE ) ) | ( (lv_atom_1_0= RULE_UNDERSCORE ) ) | ( (lv_atom_2_0= ruleID ) ) )
            int alt48=3;
            switch ( input.LA(1) ) {
            case RULE_TYPE:
                {
                alt48=1;
                }
                break;
            case RULE_UNDERSCORE:
                {
                alt48=2;
                }
                break;
            case RULE_CID:
                {
                alt48=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1449:2: ( (lv_atom_0_0= RULE_TYPE ) )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1449:2: ( (lv_atom_0_0= RULE_TYPE ) )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1450:1: (lv_atom_0_0= RULE_TYPE )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1450:1: (lv_atom_0_0= RULE_TYPE )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1451:3: lv_atom_0_0= RULE_TYPE
                    {
                    lv_atom_0_0=(Token)match(input,RULE_TYPE,FOLLOW_RULE_TYPE_in_ruletermAtomic3256); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_atom_0_0, grammarAccess.getTermAtomicAccess().getAtomTYPETerminalRuleCall_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTermAtomicRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"atom",
                              		lv_atom_0_0, 
                              		"TYPE");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1468:6: ( (lv_atom_1_0= RULE_UNDERSCORE ) )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1468:6: ( (lv_atom_1_0= RULE_UNDERSCORE ) )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1469:1: (lv_atom_1_0= RULE_UNDERSCORE )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1469:1: (lv_atom_1_0= RULE_UNDERSCORE )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1470:3: lv_atom_1_0= RULE_UNDERSCORE
                    {
                    lv_atom_1_0=(Token)match(input,RULE_UNDERSCORE,FOLLOW_RULE_UNDERSCORE_in_ruletermAtomic3284); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_atom_1_0, grammarAccess.getTermAtomicAccess().getAtomUNDERSCORETerminalRuleCall_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTermAtomicRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"atom",
                              		lv_atom_1_0, 
                              		"UNDERSCORE");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1487:6: ( (lv_atom_2_0= ruleID ) )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1487:6: ( (lv_atom_2_0= ruleID ) )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1488:1: (lv_atom_2_0= ruleID )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1488:1: (lv_atom_2_0= ruleID )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1489:3: lv_atom_2_0= ruleID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTermAtomicAccess().getAtomIDParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleID_in_ruletermAtomic3316);
                    lv_atom_2_0=ruleID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTermAtomicRule());
                      	        }
                             		set(
                             			current, 
                             			"atom",
                              		lv_atom_2_0, 
                              		"ID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletermAtomic"


    // $ANTLR start "entryRulemorphism"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1513:1: entryRulemorphism returns [EObject current=null] : iv_rulemorphism= rulemorphism EOF ;
    public final EObject entryRulemorphism() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemorphism = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1514:2: (iv_rulemorphism= rulemorphism EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1515:2: iv_rulemorphism= rulemorphism EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMorphismRule()); 
            }
            pushFollow(FOLLOW_rulemorphism_in_entryRulemorphism3352);
            iv_rulemorphism=rulemorphism();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulemorphism; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulemorphism3362); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulemorphism"


    // $ANTLR start "rulemorphism"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1522:1: rulemorphism returns [EObject current=null] : ( ( ( ruleID ) ) ( ( ruleWS )+ ( ( ruleID ) ) )* ) ;
    public final EObject rulemorphism() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1525:28: ( ( ( ( ruleID ) ) ( ( ruleWS )+ ( ( ruleID ) ) )* ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1526:1: ( ( ( ruleID ) ) ( ( ruleWS )+ ( ( ruleID ) ) )* )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1526:1: ( ( ( ruleID ) ) ( ( ruleWS )+ ( ( ruleID ) ) )* )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1526:2: ( ( ruleID ) ) ( ( ruleWS )+ ( ( ruleID ) ) )*
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1526:2: ( ( ruleID ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1527:1: ( ruleID )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1527:1: ( ruleID )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1528:3: ruleID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getMorphismRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMorphismAccess().getLinkRefsLinkDeclarationCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleID_in_rulemorphism3410);
            ruleID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1541:2: ( ( ruleWS )+ ( ( ruleID ) ) )*
            loop50:
            do {
                int alt50=2;
                alt50 = dfa50.predict(input);
                switch (alt50) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1541:3: ( ruleWS )+ ( ( ruleID ) )
            	    {
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1541:3: ( ruleWS )+
            	    int cnt49=0;
            	    loop49:
            	    do {
            	        int alt49=2;
            	        int LA49_0 = input.LA(1);

            	        if ( ((LA49_0>=RULE_LINESP && LA49_0<=RULE_ML2_COMMENT)) ) {
            	            alt49=1;
            	        }


            	        switch (alt49) {
            	    	case 1 :
            	    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1542:5: ruleWS
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	              newCompositeNode(grammarAccess.getMorphismAccess().getWSParserRuleCall_1_0()); 
            	    	          
            	    	    }
            	    	    pushFollow(FOLLOW_ruleWS_in_rulemorphism3428);
            	    	    ruleWS();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	              afterParserOrEnumRuleCall();
            	    	          
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt49 >= 1 ) break loop49;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(49, input);
            	                throw eee;
            	        }
            	        cnt49++;
            	    } while (true);

            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1549:3: ( ( ruleID ) )
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1550:1: ( ruleID )
            	    {
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1550:1: ( ruleID )
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1551:3: ruleID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getMorphismRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMorphismAccess().getLinkRefsLinkDeclarationCrossReference_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleID_in_rulemorphism3452);
            	    ruleID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulemorphism"


    // $ANTLR start "entryRuletermDeclaration"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1572:1: entryRuletermDeclaration returns [EObject current=null] : iv_ruletermDeclaration= ruletermDeclaration EOF ;
    public final EObject entryRuletermDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletermDeclaration = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1573:2: (iv_ruletermDeclaration= ruletermDeclaration EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1574:2: iv_ruletermDeclaration= ruletermDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTermDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruletermDeclaration_in_entryRuletermDeclaration3490);
            iv_ruletermDeclaration=ruletermDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletermDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuletermDeclaration3500); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletermDeclaration"


    // $ANTLR start "ruletermDeclaration"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1581:1: ruletermDeclaration returns [EObject current=null] : ( ( (lv_name_0_0= ruleID ) ) ( ( ( ( ({...}? => ( ({...}? => ( ( ruleWS )* this_COLON_3= RULE_COLON ( ruleWS )* ( (lv_type_5_0= ruleterm ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ruleWS )+ this_EQUALS_7= RULE_EQUALS ( ruleWS )+ ( (lv_def_9_0= ruleterm ) ) ) ) ) ) )* ) ) ) ( ruleWS )* this_DOT_11= RULE_DOT ) ;
    public final EObject ruletermDeclaration() throws RecognitionException {
        EObject current = null;

        Token this_COLON_3=null;
        Token this_EQUALS_7=null;
        Token this_DOT_11=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_type_5_0 = null;

        EObject lv_def_9_0 = null;


         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1584:28: ( ( ( (lv_name_0_0= ruleID ) ) ( ( ( ( ({...}? => ( ({...}? => ( ( ruleWS )* this_COLON_3= RULE_COLON ( ruleWS )* ( (lv_type_5_0= ruleterm ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ruleWS )+ this_EQUALS_7= RULE_EQUALS ( ruleWS )+ ( (lv_def_9_0= ruleterm ) ) ) ) ) ) )* ) ) ) ( ruleWS )* this_DOT_11= RULE_DOT ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1585:1: ( ( (lv_name_0_0= ruleID ) ) ( ( ( ( ({...}? => ( ({...}? => ( ( ruleWS )* this_COLON_3= RULE_COLON ( ruleWS )* ( (lv_type_5_0= ruleterm ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ruleWS )+ this_EQUALS_7= RULE_EQUALS ( ruleWS )+ ( (lv_def_9_0= ruleterm ) ) ) ) ) ) )* ) ) ) ( ruleWS )* this_DOT_11= RULE_DOT )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1585:1: ( ( (lv_name_0_0= ruleID ) ) ( ( ( ( ({...}? => ( ({...}? => ( ( ruleWS )* this_COLON_3= RULE_COLON ( ruleWS )* ( (lv_type_5_0= ruleterm ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ruleWS )+ this_EQUALS_7= RULE_EQUALS ( ruleWS )+ ( (lv_def_9_0= ruleterm ) ) ) ) ) ) )* ) ) ) ( ruleWS )* this_DOT_11= RULE_DOT )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1585:2: ( (lv_name_0_0= ruleID ) ) ( ( ( ( ({...}? => ( ({...}? => ( ( ruleWS )* this_COLON_3= RULE_COLON ( ruleWS )* ( (lv_type_5_0= ruleterm ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ruleWS )+ this_EQUALS_7= RULE_EQUALS ( ruleWS )+ ( (lv_def_9_0= ruleterm ) ) ) ) ) ) )* ) ) ) ( ruleWS )* this_DOT_11= RULE_DOT
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1585:2: ( (lv_name_0_0= ruleID ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1586:1: (lv_name_0_0= ruleID )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1586:1: (lv_name_0_0= ruleID )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1587:3: lv_name_0_0= ruleID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTermDeclarationAccess().getNameIDParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleID_in_ruletermDeclaration3546);
            lv_name_0_0=ruleID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTermDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1603:2: ( ( ( ( ({...}? => ( ({...}? => ( ( ruleWS )* this_COLON_3= RULE_COLON ( ruleWS )* ( (lv_type_5_0= ruleterm ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ruleWS )+ this_EQUALS_7= RULE_EQUALS ( ruleWS )+ ( (lv_def_9_0= ruleterm ) ) ) ) ) ) )* ) ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1605:1: ( ( ( ({...}? => ( ({...}? => ( ( ruleWS )* this_COLON_3= RULE_COLON ( ruleWS )* ( (lv_type_5_0= ruleterm ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ruleWS )+ this_EQUALS_7= RULE_EQUALS ( ruleWS )+ ( (lv_def_9_0= ruleterm ) ) ) ) ) ) )* ) )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1605:1: ( ( ( ({...}? => ( ({...}? => ( ( ruleWS )* this_COLON_3= RULE_COLON ( ruleWS )* ( (lv_type_5_0= ruleterm ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ruleWS )+ this_EQUALS_7= RULE_EQUALS ( ruleWS )+ ( (lv_def_9_0= ruleterm ) ) ) ) ) ) )* ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1606:2: ( ( ({...}? => ( ({...}? => ( ( ruleWS )* this_COLON_3= RULE_COLON ( ruleWS )* ( (lv_type_5_0= ruleterm ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ruleWS )+ this_EQUALS_7= RULE_EQUALS ( ruleWS )+ ( (lv_def_9_0= ruleterm ) ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getTermDeclarationAccess().getUnorderedGroup_1());
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1609:2: ( ( ({...}? => ( ({...}? => ( ( ruleWS )* this_COLON_3= RULE_COLON ( ruleWS )* ( (lv_type_5_0= ruleterm ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ruleWS )+ this_EQUALS_7= RULE_EQUALS ( ruleWS )+ ( (lv_def_9_0= ruleterm ) ) ) ) ) ) )* )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1610:3: ( ({...}? => ( ({...}? => ( ( ruleWS )* this_COLON_3= RULE_COLON ( ruleWS )* ( (lv_type_5_0= ruleterm ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ruleWS )+ this_EQUALS_7= RULE_EQUALS ( ruleWS )+ ( (lv_def_9_0= ruleterm ) ) ) ) ) ) )*
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1610:3: ( ({...}? => ( ({...}? => ( ( ruleWS )* this_COLON_3= RULE_COLON ( ruleWS )* ( (lv_type_5_0= ruleterm ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ruleWS )+ this_EQUALS_7= RULE_EQUALS ( ruleWS )+ ( (lv_def_9_0= ruleterm ) ) ) ) ) ) )*
            loop55:
            do {
                int alt55=3;
                alt55 = dfa55.predict(input);
                switch (alt55) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1612:4: ({...}? => ( ({...}? => ( ( ruleWS )* this_COLON_3= RULE_COLON ( ruleWS )* ( (lv_type_5_0= ruleterm ) ) ) ) ) )
            	    {
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1612:4: ({...}? => ( ({...}? => ( ( ruleWS )* this_COLON_3= RULE_COLON ( ruleWS )* ( (lv_type_5_0= ruleterm ) ) ) ) ) )
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1613:5: {...}? => ( ({...}? => ( ( ruleWS )* this_COLON_3= RULE_COLON ( ruleWS )* ( (lv_type_5_0= ruleterm ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTermDeclarationAccess().getUnorderedGroup_1(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruletermDeclaration", "getUnorderedGroupHelper().canSelect(grammarAccess.getTermDeclarationAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1613:112: ( ({...}? => ( ( ruleWS )* this_COLON_3= RULE_COLON ( ruleWS )* ( (lv_type_5_0= ruleterm ) ) ) ) )
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1614:6: ({...}? => ( ( ruleWS )* this_COLON_3= RULE_COLON ( ruleWS )* ( (lv_type_5_0= ruleterm ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getTermDeclarationAccess().getUnorderedGroup_1(), 0);
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1617:6: ({...}? => ( ( ruleWS )* this_COLON_3= RULE_COLON ( ruleWS )* ( (lv_type_5_0= ruleterm ) ) ) )
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1617:7: {...}? => ( ( ruleWS )* this_COLON_3= RULE_COLON ( ruleWS )* ( (lv_type_5_0= ruleterm ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruletermDeclaration", "true");
            	    }
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1617:16: ( ( ruleWS )* this_COLON_3= RULE_COLON ( ruleWS )* ( (lv_type_5_0= ruleterm ) ) )
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1617:17: ( ruleWS )* this_COLON_3= RULE_COLON ( ruleWS )* ( (lv_type_5_0= ruleterm ) )
            	    {
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1617:17: ( ruleWS )*
            	    loop51:
            	    do {
            	        int alt51=2;
            	        int LA51_0 = input.LA(1);

            	        if ( ((LA51_0>=RULE_LINESP && LA51_0<=RULE_ML2_COMMENT)) ) {
            	            alt51=1;
            	        }


            	        switch (alt51) {
            	    	case 1 :
            	    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1618:5: ruleWS
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	              newCompositeNode(grammarAccess.getTermDeclarationAccess().getWSParserRuleCall_1_0_0()); 
            	    	          
            	    	    }
            	    	    pushFollow(FOLLOW_ruleWS_in_ruletermDeclaration3609);
            	    	    ruleWS();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	              afterParserOrEnumRuleCall();
            	    	          
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop51;
            	        }
            	    } while (true);

            	    this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruletermDeclaration3621); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COLON_3, grammarAccess.getTermDeclarationAccess().getCOLONTerminalRuleCall_1_0_1()); 
            	          
            	    }
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1629:1: ( ruleWS )*
            	    loop52:
            	    do {
            	        int alt52=2;
            	        int LA52_0 = input.LA(1);

            	        if ( ((LA52_0>=RULE_LINESP && LA52_0<=RULE_ML2_COMMENT)) ) {
            	            alt52=1;
            	        }


            	        switch (alt52) {
            	    	case 1 :
            	    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1630:5: ruleWS
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	              newCompositeNode(grammarAccess.getTermDeclarationAccess().getWSParserRuleCall_1_0_2()); 
            	    	          
            	    	    }
            	    	    pushFollow(FOLLOW_ruleWS_in_ruletermDeclaration3637);
            	    	    ruleWS();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	              afterParserOrEnumRuleCall();
            	    	          
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop52;
            	        }
            	    } while (true);

            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1637:3: ( (lv_type_5_0= ruleterm ) )
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1638:1: (lv_type_5_0= ruleterm )
            	    {
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1638:1: (lv_type_5_0= ruleterm )
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1639:3: lv_type_5_0= ruleterm
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTermDeclarationAccess().getTypeTermParserRuleCall_1_0_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleterm_in_ruletermDeclaration3659);
            	    lv_type_5_0=ruleterm();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTermDeclarationRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"type",
            	              		lv_type_5_0, 
            	              		"term");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTermDeclarationAccess().getUnorderedGroup_1());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1662:4: ({...}? => ( ({...}? => ( ( ruleWS )+ this_EQUALS_7= RULE_EQUALS ( ruleWS )+ ( (lv_def_9_0= ruleterm ) ) ) ) ) )
            	    {
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1662:4: ({...}? => ( ({...}? => ( ( ruleWS )+ this_EQUALS_7= RULE_EQUALS ( ruleWS )+ ( (lv_def_9_0= ruleterm ) ) ) ) ) )
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1663:5: {...}? => ( ({...}? => ( ( ruleWS )+ this_EQUALS_7= RULE_EQUALS ( ruleWS )+ ( (lv_def_9_0= ruleterm ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTermDeclarationAccess().getUnorderedGroup_1(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruletermDeclaration", "getUnorderedGroupHelper().canSelect(grammarAccess.getTermDeclarationAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1663:112: ( ({...}? => ( ( ruleWS )+ this_EQUALS_7= RULE_EQUALS ( ruleWS )+ ( (lv_def_9_0= ruleterm ) ) ) ) )
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1664:6: ({...}? => ( ( ruleWS )+ this_EQUALS_7= RULE_EQUALS ( ruleWS )+ ( (lv_def_9_0= ruleterm ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getTermDeclarationAccess().getUnorderedGroup_1(), 1);
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1667:6: ({...}? => ( ( ruleWS )+ this_EQUALS_7= RULE_EQUALS ( ruleWS )+ ( (lv_def_9_0= ruleterm ) ) ) )
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1667:7: {...}? => ( ( ruleWS )+ this_EQUALS_7= RULE_EQUALS ( ruleWS )+ ( (lv_def_9_0= ruleterm ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruletermDeclaration", "true");
            	    }
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1667:16: ( ( ruleWS )+ this_EQUALS_7= RULE_EQUALS ( ruleWS )+ ( (lv_def_9_0= ruleterm ) ) )
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1667:17: ( ruleWS )+ this_EQUALS_7= RULE_EQUALS ( ruleWS )+ ( (lv_def_9_0= ruleterm ) )
            	    {
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1667:17: ( ruleWS )+
            	    int cnt53=0;
            	    loop53:
            	    do {
            	        int alt53=2;
            	        int LA53_0 = input.LA(1);

            	        if ( ((LA53_0>=RULE_LINESP && LA53_0<=RULE_ML2_COMMENT)) ) {
            	            alt53=1;
            	        }


            	        switch (alt53) {
            	    	case 1 :
            	    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1668:5: ruleWS
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	              newCompositeNode(grammarAccess.getTermDeclarationAccess().getWSParserRuleCall_1_1_0()); 
            	    	          
            	    	    }
            	    	    pushFollow(FOLLOW_ruleWS_in_ruletermDeclaration3732);
            	    	    ruleWS();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	              afterParserOrEnumRuleCall();
            	    	          
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt53 >= 1 ) break loop53;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(53, input);
            	                throw eee;
            	        }
            	        cnt53++;
            	    } while (true);

            	    this_EQUALS_7=(Token)match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_ruletermDeclaration3744); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_EQUALS_7, grammarAccess.getTermDeclarationAccess().getEQUALSTerminalRuleCall_1_1_1()); 
            	          
            	    }
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1679:1: ( ruleWS )+
            	    int cnt54=0;
            	    loop54:
            	    do {
            	        int alt54=2;
            	        int LA54_0 = input.LA(1);

            	        if ( ((LA54_0>=RULE_LINESP && LA54_0<=RULE_ML2_COMMENT)) ) {
            	            alt54=1;
            	        }


            	        switch (alt54) {
            	    	case 1 :
            	    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1680:5: ruleWS
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	              newCompositeNode(grammarAccess.getTermDeclarationAccess().getWSParserRuleCall_1_1_2()); 
            	    	          
            	    	    }
            	    	    pushFollow(FOLLOW_ruleWS_in_ruletermDeclaration3760);
            	    	    ruleWS();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	              afterParserOrEnumRuleCall();
            	    	          
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt54 >= 1 ) break loop54;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(54, input);
            	                throw eee;
            	        }
            	        cnt54++;
            	    } while (true);

            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1687:3: ( (lv_def_9_0= ruleterm ) )
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1688:1: (lv_def_9_0= ruleterm )
            	    {
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1688:1: (lv_def_9_0= ruleterm )
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1689:3: lv_def_9_0= ruleterm
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTermDeclarationAccess().getDefTermParserRuleCall_1_1_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleterm_in_ruletermDeclaration3782);
            	    lv_def_9_0=ruleterm();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTermDeclarationRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"def",
            	              		lv_def_9_0, 
            	              		"term");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTermDeclarationAccess().getUnorderedGroup_1());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getTermDeclarationAccess().getUnorderedGroup_1());

            }

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1719:2: ( ruleWS )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( ((LA56_0>=RULE_LINESP && LA56_0<=RULE_ML2_COMMENT)) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1720:5: ruleWS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getTermDeclarationAccess().getWSParserRuleCall_2()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleWS_in_ruletermDeclaration3840);
            	    ruleWS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

            this_DOT_11=(Token)match(input,RULE_DOT,FOLLOW_RULE_DOT_in_ruletermDeclaration3852); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_DOT_11, grammarAccess.getTermDeclarationAccess().getDOTTerminalRuleCall_3()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletermDeclaration"


    // $ANTLR start "entryRuleabbrevTermDeclaration"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1739:1: entryRuleabbrevTermDeclaration returns [EObject current=null] : iv_ruleabbrevTermDeclaration= ruleabbrevTermDeclaration EOF ;
    public final EObject entryRuleabbrevTermDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleabbrevTermDeclaration = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1740:2: (iv_ruleabbrevTermDeclaration= ruleabbrevTermDeclaration EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1741:2: iv_ruleabbrevTermDeclaration= ruleabbrevTermDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbbrevTermDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleabbrevTermDeclaration_in_entryRuleabbrevTermDeclaration3887);
            iv_ruleabbrevTermDeclaration=ruleabbrevTermDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleabbrevTermDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleabbrevTermDeclaration3897); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleabbrevTermDeclaration"


    // $ANTLR start "ruleabbrevTermDeclaration"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1748:1: ruleabbrevTermDeclaration returns [EObject current=null] : (otherlv_0= '%abbrev' ( ruleWS )+ this_termDeclaration_2= ruletermDeclaration ) ;
    public final EObject ruleabbrevTermDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_termDeclaration_2 = null;


         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1751:28: ( (otherlv_0= '%abbrev' ( ruleWS )+ this_termDeclaration_2= ruletermDeclaration ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1752:1: (otherlv_0= '%abbrev' ( ruleWS )+ this_termDeclaration_2= ruletermDeclaration )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1752:1: (otherlv_0= '%abbrev' ( ruleWS )+ this_termDeclaration_2= ruletermDeclaration )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1752:3: otherlv_0= '%abbrev' ( ruleWS )+ this_termDeclaration_2= ruletermDeclaration
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleabbrevTermDeclaration3934); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAbbrevTermDeclarationAccess().getAbbrevKeyword_0());
                  
            }
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1756:1: ( ruleWS )+
            int cnt57=0;
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( ((LA57_0>=RULE_LINESP && LA57_0<=RULE_ML2_COMMENT)) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1757:5: ruleWS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getAbbrevTermDeclarationAccess().getWSParserRuleCall_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleWS_in_ruleabbrevTermDeclaration3951);
            	    ruleWS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt57 >= 1 ) break loop57;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(57, input);
                        throw eee;
                }
                cnt57++;
            } while (true);

            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAbbrevTermDeclarationAccess().getTermDeclarationParserRuleCall_2()); 
                  
            }
            pushFollow(FOLLOW_ruletermDeclaration_in_ruleabbrevTermDeclaration3974);
            this_termDeclaration_2=ruletermDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_termDeclaration_2; 
                      afterParserOrEnumRuleCall();
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleabbrevTermDeclaration"


    // $ANTLR start "entryRulenameDeclaration"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1781:1: entryRulenameDeclaration returns [EObject current=null] : iv_rulenameDeclaration= rulenameDeclaration EOF ;
    public final EObject entryRulenameDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenameDeclaration = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1782:2: (iv_rulenameDeclaration= rulenameDeclaration EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1783:2: iv_rulenameDeclaration= rulenameDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNameDeclarationRule()); 
            }
            pushFollow(FOLLOW_rulenameDeclaration_in_entryRulenameDeclaration4009);
            iv_rulenameDeclaration=rulenameDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulenameDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulenameDeclaration4019); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulenameDeclaration"


    // $ANTLR start "rulenameDeclaration"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1790:1: rulenameDeclaration returns [EObject current=null] : (otherlv_0= '%name' ( ruleWS )+ ( (lv_name_2_0= ruleID ) ) ( ruleWS )+ ( (lv_alias_4_0= RULE_CID ) ) ( ruleWS )* this_DOT_6= RULE_DOT ) ;
    public final EObject rulenameDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_alias_4_0=null;
        Token this_DOT_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1793:28: ( (otherlv_0= '%name' ( ruleWS )+ ( (lv_name_2_0= ruleID ) ) ( ruleWS )+ ( (lv_alias_4_0= RULE_CID ) ) ( ruleWS )* this_DOT_6= RULE_DOT ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1794:1: (otherlv_0= '%name' ( ruleWS )+ ( (lv_name_2_0= ruleID ) ) ( ruleWS )+ ( (lv_alias_4_0= RULE_CID ) ) ( ruleWS )* this_DOT_6= RULE_DOT )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1794:1: (otherlv_0= '%name' ( ruleWS )+ ( (lv_name_2_0= ruleID ) ) ( ruleWS )+ ( (lv_alias_4_0= RULE_CID ) ) ( ruleWS )* this_DOT_6= RULE_DOT )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1794:3: otherlv_0= '%name' ( ruleWS )+ ( (lv_name_2_0= ruleID ) ) ( ruleWS )+ ( (lv_alias_4_0= RULE_CID ) ) ( ruleWS )* this_DOT_6= RULE_DOT
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_rulenameDeclaration4056); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getNameDeclarationAccess().getNameKeyword_0());
                  
            }
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1798:1: ( ruleWS )+
            int cnt58=0;
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( ((LA58_0>=RULE_LINESP && LA58_0<=RULE_ML2_COMMENT)) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1799:5: ruleWS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getNameDeclarationAccess().getWSParserRuleCall_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleWS_in_rulenameDeclaration4073);
            	    ruleWS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt58 >= 1 ) break loop58;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(58, input);
                        throw eee;
                }
                cnt58++;
            } while (true);

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1806:3: ( (lv_name_2_0= ruleID ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1807:1: (lv_name_2_0= ruleID )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1807:1: (lv_name_2_0= ruleID )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1808:3: lv_name_2_0= ruleID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNameDeclarationAccess().getNameIDParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleID_in_rulenameDeclaration4095);
            lv_name_2_0=ruleID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNameDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1824:2: ( ruleWS )+
            int cnt59=0;
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( ((LA59_0>=RULE_LINESP && LA59_0<=RULE_ML2_COMMENT)) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1825:5: ruleWS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getNameDeclarationAccess().getWSParserRuleCall_3()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleWS_in_rulenameDeclaration4112);
            	    ruleWS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt59 >= 1 ) break loop59;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(59, input);
                        throw eee;
                }
                cnt59++;
            } while (true);

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1832:3: ( (lv_alias_4_0= RULE_CID ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1833:1: (lv_alias_4_0= RULE_CID )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1833:1: (lv_alias_4_0= RULE_CID )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1834:3: lv_alias_4_0= RULE_CID
            {
            lv_alias_4_0=(Token)match(input,RULE_CID,FOLLOW_RULE_CID_in_rulenameDeclaration4130); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_alias_4_0, grammarAccess.getNameDeclarationAccess().getAliasCIDTerminalRuleCall_4_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getNameDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"alias",
                      		lv_alias_4_0, 
                      		"CID");
              	    
            }

            }


            }

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1850:2: ( ruleWS )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( ((LA60_0>=RULE_LINESP && LA60_0<=RULE_ML2_COMMENT)) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1851:5: ruleWS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getNameDeclarationAccess().getWSParserRuleCall_5()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleWS_in_rulenameDeclaration4152);
            	    ruleWS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);

            this_DOT_6=(Token)match(input,RULE_DOT,FOLLOW_RULE_DOT_in_rulenameDeclaration4164); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_DOT_6, grammarAccess.getNameDeclarationAccess().getDOTTerminalRuleCall_6()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulenameDeclaration"


    // $ANTLR start "entryRulefixityDeclaration"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1870:1: entryRulefixityDeclaration returns [EObject current=null] : iv_rulefixityDeclaration= rulefixityDeclaration EOF ;
    public final EObject entryRulefixityDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefixityDeclaration = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1871:2: (iv_rulefixityDeclaration= rulefixityDeclaration EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1872:2: iv_rulefixityDeclaration= rulefixityDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFixityDeclarationRule()); 
            }
            pushFollow(FOLLOW_rulefixityDeclaration_in_entryRulefixityDeclaration4199);
            iv_rulefixityDeclaration=rulefixityDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulefixityDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulefixityDeclaration4209); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefixityDeclaration"


    // $ANTLR start "rulefixityDeclaration"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1879:1: rulefixityDeclaration returns [EObject current=null] : ( ( ( (lv_fixity_0_0= RULE_INFIXNONE ) ) | ( (lv_fixity_1_0= RULE_INFIXLEFT ) ) | ( (lv_fixity_2_0= RULE_INFIXRIGHT ) ) | ( (lv_fixity_3_0= '%prefix' ) ) | ( (lv_fixity_4_0= '%postfix' ) ) ) ( ruleWS )+ ( (lv_fixityLevel_6_0= RULE_CID ) ) ( ruleWS )+ ( (lv_name_8_0= ruleID ) ) ( ruleWS )* this_DOT_10= RULE_DOT ) ;
    public final EObject rulefixityDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_fixity_0_0=null;
        Token lv_fixity_1_0=null;
        Token lv_fixity_2_0=null;
        Token lv_fixity_3_0=null;
        Token lv_fixity_4_0=null;
        Token lv_fixityLevel_6_0=null;
        Token this_DOT_10=null;
        AntlrDatatypeRuleToken lv_name_8_0 = null;


         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1882:28: ( ( ( ( (lv_fixity_0_0= RULE_INFIXNONE ) ) | ( (lv_fixity_1_0= RULE_INFIXLEFT ) ) | ( (lv_fixity_2_0= RULE_INFIXRIGHT ) ) | ( (lv_fixity_3_0= '%prefix' ) ) | ( (lv_fixity_4_0= '%postfix' ) ) ) ( ruleWS )+ ( (lv_fixityLevel_6_0= RULE_CID ) ) ( ruleWS )+ ( (lv_name_8_0= ruleID ) ) ( ruleWS )* this_DOT_10= RULE_DOT ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1883:1: ( ( ( (lv_fixity_0_0= RULE_INFIXNONE ) ) | ( (lv_fixity_1_0= RULE_INFIXLEFT ) ) | ( (lv_fixity_2_0= RULE_INFIXRIGHT ) ) | ( (lv_fixity_3_0= '%prefix' ) ) | ( (lv_fixity_4_0= '%postfix' ) ) ) ( ruleWS )+ ( (lv_fixityLevel_6_0= RULE_CID ) ) ( ruleWS )+ ( (lv_name_8_0= ruleID ) ) ( ruleWS )* this_DOT_10= RULE_DOT )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1883:1: ( ( ( (lv_fixity_0_0= RULE_INFIXNONE ) ) | ( (lv_fixity_1_0= RULE_INFIXLEFT ) ) | ( (lv_fixity_2_0= RULE_INFIXRIGHT ) ) | ( (lv_fixity_3_0= '%prefix' ) ) | ( (lv_fixity_4_0= '%postfix' ) ) ) ( ruleWS )+ ( (lv_fixityLevel_6_0= RULE_CID ) ) ( ruleWS )+ ( (lv_name_8_0= ruleID ) ) ( ruleWS )* this_DOT_10= RULE_DOT )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1883:2: ( ( (lv_fixity_0_0= RULE_INFIXNONE ) ) | ( (lv_fixity_1_0= RULE_INFIXLEFT ) ) | ( (lv_fixity_2_0= RULE_INFIXRIGHT ) ) | ( (lv_fixity_3_0= '%prefix' ) ) | ( (lv_fixity_4_0= '%postfix' ) ) ) ( ruleWS )+ ( (lv_fixityLevel_6_0= RULE_CID ) ) ( ruleWS )+ ( (lv_name_8_0= ruleID ) ) ( ruleWS )* this_DOT_10= RULE_DOT
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1883:2: ( ( (lv_fixity_0_0= RULE_INFIXNONE ) ) | ( (lv_fixity_1_0= RULE_INFIXLEFT ) ) | ( (lv_fixity_2_0= RULE_INFIXRIGHT ) ) | ( (lv_fixity_3_0= '%prefix' ) ) | ( (lv_fixity_4_0= '%postfix' ) ) )
            int alt61=5;
            switch ( input.LA(1) ) {
            case RULE_INFIXNONE:
                {
                alt61=1;
                }
                break;
            case RULE_INFIXLEFT:
                {
                alt61=2;
                }
                break;
            case RULE_INFIXRIGHT:
                {
                alt61=3;
                }
                break;
            case 34:
                {
                alt61=4;
                }
                break;
            case 35:
                {
                alt61=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1883:3: ( (lv_fixity_0_0= RULE_INFIXNONE ) )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1883:3: ( (lv_fixity_0_0= RULE_INFIXNONE ) )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1884:1: (lv_fixity_0_0= RULE_INFIXNONE )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1884:1: (lv_fixity_0_0= RULE_INFIXNONE )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1885:3: lv_fixity_0_0= RULE_INFIXNONE
                    {
                    lv_fixity_0_0=(Token)match(input,RULE_INFIXNONE,FOLLOW_RULE_INFIXNONE_in_rulefixityDeclaration4252); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_fixity_0_0, grammarAccess.getFixityDeclarationAccess().getFixityINFIXNONETerminalRuleCall_0_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getFixityDeclarationRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"fixity",
                              		lv_fixity_0_0, 
                              		"INFIXNONE");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1902:6: ( (lv_fixity_1_0= RULE_INFIXLEFT ) )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1902:6: ( (lv_fixity_1_0= RULE_INFIXLEFT ) )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1903:1: (lv_fixity_1_0= RULE_INFIXLEFT )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1903:1: (lv_fixity_1_0= RULE_INFIXLEFT )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1904:3: lv_fixity_1_0= RULE_INFIXLEFT
                    {
                    lv_fixity_1_0=(Token)match(input,RULE_INFIXLEFT,FOLLOW_RULE_INFIXLEFT_in_rulefixityDeclaration4280); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_fixity_1_0, grammarAccess.getFixityDeclarationAccess().getFixityINFIXLEFTTerminalRuleCall_0_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getFixityDeclarationRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"fixity",
                              		lv_fixity_1_0, 
                              		"INFIXLEFT");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1921:6: ( (lv_fixity_2_0= RULE_INFIXRIGHT ) )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1921:6: ( (lv_fixity_2_0= RULE_INFIXRIGHT ) )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1922:1: (lv_fixity_2_0= RULE_INFIXRIGHT )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1922:1: (lv_fixity_2_0= RULE_INFIXRIGHT )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1923:3: lv_fixity_2_0= RULE_INFIXRIGHT
                    {
                    lv_fixity_2_0=(Token)match(input,RULE_INFIXRIGHT,FOLLOW_RULE_INFIXRIGHT_in_rulefixityDeclaration4308); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_fixity_2_0, grammarAccess.getFixityDeclarationAccess().getFixityINFIXRIGHTTerminalRuleCall_0_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getFixityDeclarationRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"fixity",
                              		lv_fixity_2_0, 
                              		"INFIXRIGHT");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1940:6: ( (lv_fixity_3_0= '%prefix' ) )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1940:6: ( (lv_fixity_3_0= '%prefix' ) )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1941:1: (lv_fixity_3_0= '%prefix' )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1941:1: (lv_fixity_3_0= '%prefix' )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1942:3: lv_fixity_3_0= '%prefix'
                    {
                    lv_fixity_3_0=(Token)match(input,34,FOLLOW_34_in_rulefixityDeclaration4337); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_fixity_3_0, grammarAccess.getFixityDeclarationAccess().getFixityPrefixKeyword_0_3_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getFixityDeclarationRule());
                      	        }
                             		setWithLastConsumed(current, "fixity", lv_fixity_3_0, "%prefix");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1956:6: ( (lv_fixity_4_0= '%postfix' ) )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1956:6: ( (lv_fixity_4_0= '%postfix' ) )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1957:1: (lv_fixity_4_0= '%postfix' )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1957:1: (lv_fixity_4_0= '%postfix' )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1958:3: lv_fixity_4_0= '%postfix'
                    {
                    lv_fixity_4_0=(Token)match(input,35,FOLLOW_35_in_rulefixityDeclaration4374); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_fixity_4_0, grammarAccess.getFixityDeclarationAccess().getFixityPostfixKeyword_0_4_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getFixityDeclarationRule());
                      	        }
                             		setWithLastConsumed(current, "fixity", lv_fixity_4_0, "%postfix");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1971:3: ( ruleWS )+
            int cnt62=0;
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( ((LA62_0>=RULE_LINESP && LA62_0<=RULE_ML2_COMMENT)) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1972:5: ruleWS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getFixityDeclarationAccess().getWSParserRuleCall_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleWS_in_rulefixityDeclaration4405);
            	    ruleWS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt62 >= 1 ) break loop62;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(62, input);
                        throw eee;
                }
                cnt62++;
            } while (true);

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1979:3: ( (lv_fixityLevel_6_0= RULE_CID ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1980:1: (lv_fixityLevel_6_0= RULE_CID )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1980:1: (lv_fixityLevel_6_0= RULE_CID )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1981:3: lv_fixityLevel_6_0= RULE_CID
            {
            lv_fixityLevel_6_0=(Token)match(input,RULE_CID,FOLLOW_RULE_CID_in_rulefixityDeclaration4423); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_fixityLevel_6_0, grammarAccess.getFixityDeclarationAccess().getFixityLevelCIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFixityDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"fixityLevel",
                      		lv_fixityLevel_6_0, 
                      		"CID");
              	    
            }

            }


            }

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1997:2: ( ruleWS )+
            int cnt63=0;
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( ((LA63_0>=RULE_LINESP && LA63_0<=RULE_ML2_COMMENT)) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:1998:5: ruleWS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getFixityDeclarationAccess().getWSParserRuleCall_3()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleWS_in_rulefixityDeclaration4445);
            	    ruleWS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt63 >= 1 ) break loop63;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(63, input);
                        throw eee;
                }
                cnt63++;
            } while (true);

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2005:3: ( (lv_name_8_0= ruleID ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2006:1: (lv_name_8_0= ruleID )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2006:1: (lv_name_8_0= ruleID )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2007:3: lv_name_8_0= ruleID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFixityDeclarationAccess().getNameIDParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleID_in_rulefixityDeclaration4467);
            lv_name_8_0=ruleID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFixityDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_8_0, 
                      		"ID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2023:2: ( ruleWS )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( ((LA64_0>=RULE_LINESP && LA64_0<=RULE_ML2_COMMENT)) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2024:5: ruleWS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getFixityDeclarationAccess().getWSParserRuleCall_5()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleWS_in_rulefixityDeclaration4484);
            	    ruleWS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);

            this_DOT_10=(Token)match(input,RULE_DOT,FOLLOW_RULE_DOT_in_rulefixityDeclaration4496); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_DOT_10, grammarAccess.getFixityDeclarationAccess().getDOTTerminalRuleCall_6()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefixityDeclaration"


    // $ANTLR start "entryRulesigMetaDeclaration"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2043:1: entryRulesigMetaDeclaration returns [EObject current=null] : iv_rulesigMetaDeclaration= rulesigMetaDeclaration EOF ;
    public final EObject entryRulesigMetaDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesigMetaDeclaration = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2044:2: (iv_rulesigMetaDeclaration= rulesigMetaDeclaration EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2045:2: iv_rulesigMetaDeclaration= rulesigMetaDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSigMetaDeclarationRule()); 
            }
            pushFollow(FOLLOW_rulesigMetaDeclaration_in_entryRulesigMetaDeclaration4531);
            iv_rulesigMetaDeclaration=rulesigMetaDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulesigMetaDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulesigMetaDeclaration4541); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulesigMetaDeclaration"


    // $ANTLR start "rulesigMetaDeclaration"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2052:1: rulesigMetaDeclaration returns [EObject current=null] : (otherlv_0= '%meta' ( ruleWS )+ ( ( ruleID ) ) ( ruleWS )* this_DOT_4= RULE_DOT ) ;
    public final EObject rulesigMetaDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_DOT_4=null;

         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2055:28: ( (otherlv_0= '%meta' ( ruleWS )+ ( ( ruleID ) ) ( ruleWS )* this_DOT_4= RULE_DOT ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2056:1: (otherlv_0= '%meta' ( ruleWS )+ ( ( ruleID ) ) ( ruleWS )* this_DOT_4= RULE_DOT )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2056:1: (otherlv_0= '%meta' ( ruleWS )+ ( ( ruleID ) ) ( ruleWS )* this_DOT_4= RULE_DOT )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2056:3: otherlv_0= '%meta' ( ruleWS )+ ( ( ruleID ) ) ( ruleWS )* this_DOT_4= RULE_DOT
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_rulesigMetaDeclaration4578); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSigMetaDeclarationAccess().getMetaKeyword_0());
                  
            }
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2060:1: ( ruleWS )+
            int cnt65=0;
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( ((LA65_0>=RULE_LINESP && LA65_0<=RULE_ML2_COMMENT)) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2061:5: ruleWS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getSigMetaDeclarationAccess().getWSParserRuleCall_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleWS_in_rulesigMetaDeclaration4595);
            	    ruleWS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt65 >= 1 ) break loop65;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(65, input);
                        throw eee;
                }
                cnt65++;
            } while (true);

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2068:3: ( ( ruleID ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2069:1: ( ruleID )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2069:1: ( ruleID )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2070:3: ruleID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getSigMetaDeclarationRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSigMetaDeclarationAccess().getRefSigDeclarationCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleID_in_rulesigMetaDeclaration4619);
            ruleID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2083:2: ( ruleWS )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( ((LA66_0>=RULE_LINESP && LA66_0<=RULE_ML2_COMMENT)) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2084:5: ruleWS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getSigMetaDeclarationAccess().getWSParserRuleCall_3()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleWS_in_rulesigMetaDeclaration4636);
            	    ruleWS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);

            this_DOT_4=(Token)match(input,RULE_DOT,FOLLOW_RULE_DOT_in_rulesigMetaDeclaration4648); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_DOT_4, grammarAccess.getSigMetaDeclarationAccess().getDOTTerminalRuleCall_4()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulesigMetaDeclaration"


    // $ANTLR start "entryRulesigIncludeDeclaration"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2103:1: entryRulesigIncludeDeclaration returns [EObject current=null] : iv_rulesigIncludeDeclaration= rulesigIncludeDeclaration EOF ;
    public final EObject entryRulesigIncludeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesigIncludeDeclaration = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2104:2: (iv_rulesigIncludeDeclaration= rulesigIncludeDeclaration EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2105:2: iv_rulesigIncludeDeclaration= rulesigIncludeDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSigIncludeDeclarationRule()); 
            }
            pushFollow(FOLLOW_rulesigIncludeDeclaration_in_entryRulesigIncludeDeclaration4683);
            iv_rulesigIncludeDeclaration=rulesigIncludeDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulesigIncludeDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulesigIncludeDeclaration4693); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulesigIncludeDeclaration"


    // $ANTLR start "rulesigIncludeDeclaration"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2112:1: rulesigIncludeDeclaration returns [EObject current=null] : (otherlv_0= '%include' ( ruleWS )+ ( ( ruleID ) ) ( ( ruleWS )* ( (lv_incOpt_4_0= ruleincludeOps ) ) )? ( ruleWS )* this_DOT_6= RULE_DOT ) ;
    public final EObject rulesigIncludeDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_DOT_6=null;
        EObject lv_incOpt_4_0 = null;


         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2115:28: ( (otherlv_0= '%include' ( ruleWS )+ ( ( ruleID ) ) ( ( ruleWS )* ( (lv_incOpt_4_0= ruleincludeOps ) ) )? ( ruleWS )* this_DOT_6= RULE_DOT ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2116:1: (otherlv_0= '%include' ( ruleWS )+ ( ( ruleID ) ) ( ( ruleWS )* ( (lv_incOpt_4_0= ruleincludeOps ) ) )? ( ruleWS )* this_DOT_6= RULE_DOT )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2116:1: (otherlv_0= '%include' ( ruleWS )+ ( ( ruleID ) ) ( ( ruleWS )* ( (lv_incOpt_4_0= ruleincludeOps ) ) )? ( ruleWS )* this_DOT_6= RULE_DOT )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2116:3: otherlv_0= '%include' ( ruleWS )+ ( ( ruleID ) ) ( ( ruleWS )* ( (lv_incOpt_4_0= ruleincludeOps ) ) )? ( ruleWS )* this_DOT_6= RULE_DOT
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_rulesigIncludeDeclaration4730); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSigIncludeDeclarationAccess().getIncludeKeyword_0());
                  
            }
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2120:1: ( ruleWS )+
            int cnt67=0;
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( ((LA67_0>=RULE_LINESP && LA67_0<=RULE_ML2_COMMENT)) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2121:5: ruleWS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getSigIncludeDeclarationAccess().getWSParserRuleCall_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleWS_in_rulesigIncludeDeclaration4747);
            	    ruleWS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt67 >= 1 ) break loop67;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(67, input);
                        throw eee;
                }
                cnt67++;
            } while (true);

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2128:3: ( ( ruleID ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2129:1: ( ruleID )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2129:1: ( ruleID )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2130:3: ruleID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getSigIncludeDeclarationRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSigIncludeDeclarationAccess().getRefSigDeclarationCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleID_in_rulesigIncludeDeclaration4771);
            ruleID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2143:2: ( ( ruleWS )* ( (lv_incOpt_4_0= ruleincludeOps ) ) )?
            int alt69=2;
            alt69 = dfa69.predict(input);
            switch (alt69) {
                case 1 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2143:3: ( ruleWS )* ( (lv_incOpt_4_0= ruleincludeOps ) )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2143:3: ( ruleWS )*
                    loop68:
                    do {
                        int alt68=2;
                        int LA68_0 = input.LA(1);

                        if ( ((LA68_0>=RULE_LINESP && LA68_0<=RULE_ML2_COMMENT)) ) {
                            alt68=1;
                        }


                        switch (alt68) {
                    	case 1 :
                    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2144:5: ruleWS
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getSigIncludeDeclarationAccess().getWSParserRuleCall_3_0()); 
                    	          
                    	    }
                    	    pushFollow(FOLLOW_ruleWS_in_rulesigIncludeDeclaration4789);
                    	    ruleWS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              afterParserOrEnumRuleCall();
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop68;
                        }
                    } while (true);

                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2151:3: ( (lv_incOpt_4_0= ruleincludeOps ) )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2152:1: (lv_incOpt_4_0= ruleincludeOps )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2152:1: (lv_incOpt_4_0= ruleincludeOps )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2153:3: lv_incOpt_4_0= ruleincludeOps
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSigIncludeDeclarationAccess().getIncOptIncludeOpsParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleincludeOps_in_rulesigIncludeDeclaration4811);
                    lv_incOpt_4_0=ruleincludeOps();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSigIncludeDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"incOpt",
                              		lv_incOpt_4_0, 
                              		"includeOps");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2169:4: ( ruleWS )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( ((LA70_0>=RULE_LINESP && LA70_0<=RULE_ML2_COMMENT)) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2170:5: ruleWS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getSigIncludeDeclarationAccess().getWSParserRuleCall_4()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleWS_in_rulesigIncludeDeclaration4830);
            	    ruleWS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop70;
                }
            } while (true);

            this_DOT_6=(Token)match(input,RULE_DOT,FOLLOW_RULE_DOT_in_rulesigIncludeDeclaration4842); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_DOT_6, grammarAccess.getSigIncludeDeclarationAccess().getDOTTerminalRuleCall_5()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulesigIncludeDeclaration"


    // $ANTLR start "entryRulestructDeclaration"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2189:1: entryRulestructDeclaration returns [EObject current=null] : iv_rulestructDeclaration= rulestructDeclaration EOF ;
    public final EObject entryRulestructDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestructDeclaration = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2190:2: (iv_rulestructDeclaration= rulestructDeclaration EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2191:2: iv_rulestructDeclaration= rulestructDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStructDeclarationRule()); 
            }
            pushFollow(FOLLOW_rulestructDeclaration_in_entryRulestructDeclaration4877);
            iv_rulestructDeclaration=rulestructDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulestructDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulestructDeclaration4887); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulestructDeclaration"


    // $ANTLR start "rulestructDeclaration"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2198:1: rulestructDeclaration returns [EObject current=null] : (otherlv_0= '%struct' ( ruleWS )+ (otherlv_2= '%implicit' ( ruleWS )+ )? ( (lv_name_4_0= ruleID ) ) ( ( ( ruleWS )+ this_EQUALS_6= RULE_EQUALS ( ruleWS )+ ( (lv_def_8_0= rulemorphism ) ) ) | ( ( ruleWS )* this_COLON_10= RULE_COLON ( ruleWS )* ( ( ruleID ) ) ( ( ruleWS )+ this_EQUALS_14= RULE_EQUALS ( ruleWS )* ( ( (lv_def_16_0= rulelinkBody ) ) | ( ruleWS ( (lv_def_18_0= rulemorphism ) ) ) ) )? ) )? ( ( ruleWS )* ( (lv_incOpt_20_0= ruleincludeOps ) ) )? ( ruleWS )* this_DOT_22= RULE_DOT ) ;
    public final EObject rulestructDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token this_EQUALS_6=null;
        Token this_COLON_10=null;
        Token this_EQUALS_14=null;
        Token this_DOT_22=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        EObject lv_def_8_0 = null;

        EObject lv_def_16_0 = null;

        EObject lv_def_18_0 = null;

        EObject lv_incOpt_20_0 = null;


         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2201:28: ( (otherlv_0= '%struct' ( ruleWS )+ (otherlv_2= '%implicit' ( ruleWS )+ )? ( (lv_name_4_0= ruleID ) ) ( ( ( ruleWS )+ this_EQUALS_6= RULE_EQUALS ( ruleWS )+ ( (lv_def_8_0= rulemorphism ) ) ) | ( ( ruleWS )* this_COLON_10= RULE_COLON ( ruleWS )* ( ( ruleID ) ) ( ( ruleWS )+ this_EQUALS_14= RULE_EQUALS ( ruleWS )* ( ( (lv_def_16_0= rulelinkBody ) ) | ( ruleWS ( (lv_def_18_0= rulemorphism ) ) ) ) )? ) )? ( ( ruleWS )* ( (lv_incOpt_20_0= ruleincludeOps ) ) )? ( ruleWS )* this_DOT_22= RULE_DOT ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2202:1: (otherlv_0= '%struct' ( ruleWS )+ (otherlv_2= '%implicit' ( ruleWS )+ )? ( (lv_name_4_0= ruleID ) ) ( ( ( ruleWS )+ this_EQUALS_6= RULE_EQUALS ( ruleWS )+ ( (lv_def_8_0= rulemorphism ) ) ) | ( ( ruleWS )* this_COLON_10= RULE_COLON ( ruleWS )* ( ( ruleID ) ) ( ( ruleWS )+ this_EQUALS_14= RULE_EQUALS ( ruleWS )* ( ( (lv_def_16_0= rulelinkBody ) ) | ( ruleWS ( (lv_def_18_0= rulemorphism ) ) ) ) )? ) )? ( ( ruleWS )* ( (lv_incOpt_20_0= ruleincludeOps ) ) )? ( ruleWS )* this_DOT_22= RULE_DOT )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2202:1: (otherlv_0= '%struct' ( ruleWS )+ (otherlv_2= '%implicit' ( ruleWS )+ )? ( (lv_name_4_0= ruleID ) ) ( ( ( ruleWS )+ this_EQUALS_6= RULE_EQUALS ( ruleWS )+ ( (lv_def_8_0= rulemorphism ) ) ) | ( ( ruleWS )* this_COLON_10= RULE_COLON ( ruleWS )* ( ( ruleID ) ) ( ( ruleWS )+ this_EQUALS_14= RULE_EQUALS ( ruleWS )* ( ( (lv_def_16_0= rulelinkBody ) ) | ( ruleWS ( (lv_def_18_0= rulemorphism ) ) ) ) )? ) )? ( ( ruleWS )* ( (lv_incOpt_20_0= ruleincludeOps ) ) )? ( ruleWS )* this_DOT_22= RULE_DOT )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2202:3: otherlv_0= '%struct' ( ruleWS )+ (otherlv_2= '%implicit' ( ruleWS )+ )? ( (lv_name_4_0= ruleID ) ) ( ( ( ruleWS )+ this_EQUALS_6= RULE_EQUALS ( ruleWS )+ ( (lv_def_8_0= rulemorphism ) ) ) | ( ( ruleWS )* this_COLON_10= RULE_COLON ( ruleWS )* ( ( ruleID ) ) ( ( ruleWS )+ this_EQUALS_14= RULE_EQUALS ( ruleWS )* ( ( (lv_def_16_0= rulelinkBody ) ) | ( ruleWS ( (lv_def_18_0= rulemorphism ) ) ) ) )? ) )? ( ( ruleWS )* ( (lv_incOpt_20_0= ruleincludeOps ) ) )? ( ruleWS )* this_DOT_22= RULE_DOT
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_rulestructDeclaration4924); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStructDeclarationAccess().getStructKeyword_0());
                  
            }
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2206:1: ( ruleWS )+
            int cnt71=0;
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( ((LA71_0>=RULE_LINESP && LA71_0<=RULE_ML2_COMMENT)) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2207:5: ruleWS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getStructDeclarationAccess().getWSParserRuleCall_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleWS_in_rulestructDeclaration4941);
            	    ruleWS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt71 >= 1 ) break loop71;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(71, input);
                        throw eee;
                }
                cnt71++;
            } while (true);

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2214:3: (otherlv_2= '%implicit' ( ruleWS )+ )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==39) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2214:5: otherlv_2= '%implicit' ( ruleWS )+
                    {
                    otherlv_2=(Token)match(input,39,FOLLOW_39_in_rulestructDeclaration4955); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getStructDeclarationAccess().getImplicitKeyword_2_0());
                          
                    }
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2218:1: ( ruleWS )+
                    int cnt72=0;
                    loop72:
                    do {
                        int alt72=2;
                        int LA72_0 = input.LA(1);

                        if ( ((LA72_0>=RULE_LINESP && LA72_0<=RULE_ML2_COMMENT)) ) {
                            alt72=1;
                        }


                        switch (alt72) {
                    	case 1 :
                    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2219:5: ruleWS
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getStructDeclarationAccess().getWSParserRuleCall_2_1()); 
                    	          
                    	    }
                    	    pushFollow(FOLLOW_ruleWS_in_rulestructDeclaration4972);
                    	    ruleWS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              afterParserOrEnumRuleCall();
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt72 >= 1 ) break loop72;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(72, input);
                                throw eee;
                        }
                        cnt72++;
                    } while (true);


                    }
                    break;

            }

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2226:5: ( (lv_name_4_0= ruleID ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2227:1: (lv_name_4_0= ruleID )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2227:1: (lv_name_4_0= ruleID )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2228:3: lv_name_4_0= ruleID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStructDeclarationAccess().getNameIDParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleID_in_rulestructDeclaration4996);
            lv_name_4_0=ruleID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStructDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_4_0, 
                      		"ID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2244:2: ( ( ( ruleWS )+ this_EQUALS_6= RULE_EQUALS ( ruleWS )+ ( (lv_def_8_0= rulemorphism ) ) ) | ( ( ruleWS )* this_COLON_10= RULE_COLON ( ruleWS )* ( ( ruleID ) ) ( ( ruleWS )+ this_EQUALS_14= RULE_EQUALS ( ruleWS )* ( ( (lv_def_16_0= rulelinkBody ) ) | ( ruleWS ( (lv_def_18_0= rulemorphism ) ) ) ) )? ) )?
            int alt82=3;
            alt82 = dfa82.predict(input);
            switch (alt82) {
                case 1 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2244:3: ( ( ruleWS )+ this_EQUALS_6= RULE_EQUALS ( ruleWS )+ ( (lv_def_8_0= rulemorphism ) ) )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2244:3: ( ( ruleWS )+ this_EQUALS_6= RULE_EQUALS ( ruleWS )+ ( (lv_def_8_0= rulemorphism ) ) )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2244:4: ( ruleWS )+ this_EQUALS_6= RULE_EQUALS ( ruleWS )+ ( (lv_def_8_0= rulemorphism ) )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2244:4: ( ruleWS )+
                    int cnt74=0;
                    loop74:
                    do {
                        int alt74=2;
                        int LA74_0 = input.LA(1);

                        if ( ((LA74_0>=RULE_LINESP && LA74_0<=RULE_ML2_COMMENT)) ) {
                            alt74=1;
                        }


                        switch (alt74) {
                    	case 1 :
                    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2245:5: ruleWS
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getStructDeclarationAccess().getWSParserRuleCall_4_0_0()); 
                    	          
                    	    }
                    	    pushFollow(FOLLOW_ruleWS_in_rulestructDeclaration5015);
                    	    ruleWS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              afterParserOrEnumRuleCall();
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt74 >= 1 ) break loop74;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(74, input);
                                throw eee;
                        }
                        cnt74++;
                    } while (true);

                    this_EQUALS_6=(Token)match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_rulestructDeclaration5027); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_EQUALS_6, grammarAccess.getStructDeclarationAccess().getEQUALSTerminalRuleCall_4_0_1()); 
                          
                    }
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2256:1: ( ruleWS )+
                    int cnt75=0;
                    loop75:
                    do {
                        int alt75=2;
                        int LA75_0 = input.LA(1);

                        if ( ((LA75_0>=RULE_LINESP && LA75_0<=RULE_ML2_COMMENT)) ) {
                            alt75=1;
                        }


                        switch (alt75) {
                    	case 1 :
                    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2257:5: ruleWS
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getStructDeclarationAccess().getWSParserRuleCall_4_0_2()); 
                    	          
                    	    }
                    	    pushFollow(FOLLOW_ruleWS_in_rulestructDeclaration5043);
                    	    ruleWS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              afterParserOrEnumRuleCall();
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt75 >= 1 ) break loop75;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(75, input);
                                throw eee;
                        }
                        cnt75++;
                    } while (true);

                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2264:3: ( (lv_def_8_0= rulemorphism ) )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2265:1: (lv_def_8_0= rulemorphism )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2265:1: (lv_def_8_0= rulemorphism )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2266:3: lv_def_8_0= rulemorphism
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStructDeclarationAccess().getDefMorphismParserRuleCall_4_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulemorphism_in_rulestructDeclaration5065);
                    lv_def_8_0=rulemorphism();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStructDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"def",
                              		lv_def_8_0, 
                              		"morphism");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2283:6: ( ( ruleWS )* this_COLON_10= RULE_COLON ( ruleWS )* ( ( ruleID ) ) ( ( ruleWS )+ this_EQUALS_14= RULE_EQUALS ( ruleWS )* ( ( (lv_def_16_0= rulelinkBody ) ) | ( ruleWS ( (lv_def_18_0= rulemorphism ) ) ) ) )? )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2283:6: ( ( ruleWS )* this_COLON_10= RULE_COLON ( ruleWS )* ( ( ruleID ) ) ( ( ruleWS )+ this_EQUALS_14= RULE_EQUALS ( ruleWS )* ( ( (lv_def_16_0= rulelinkBody ) ) | ( ruleWS ( (lv_def_18_0= rulemorphism ) ) ) ) )? )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2283:7: ( ruleWS )* this_COLON_10= RULE_COLON ( ruleWS )* ( ( ruleID ) ) ( ( ruleWS )+ this_EQUALS_14= RULE_EQUALS ( ruleWS )* ( ( (lv_def_16_0= rulelinkBody ) ) | ( ruleWS ( (lv_def_18_0= rulemorphism ) ) ) ) )?
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2283:7: ( ruleWS )*
                    loop76:
                    do {
                        int alt76=2;
                        int LA76_0 = input.LA(1);

                        if ( ((LA76_0>=RULE_LINESP && LA76_0<=RULE_ML2_COMMENT)) ) {
                            alt76=1;
                        }


                        switch (alt76) {
                    	case 1 :
                    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2284:5: ruleWS
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getStructDeclarationAccess().getWSParserRuleCall_4_1_0()); 
                    	          
                    	    }
                    	    pushFollow(FOLLOW_ruleWS_in_rulestructDeclaration5090);
                    	    ruleWS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              afterParserOrEnumRuleCall();
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop76;
                        }
                    } while (true);

                    this_COLON_10=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_rulestructDeclaration5102); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COLON_10, grammarAccess.getStructDeclarationAccess().getCOLONTerminalRuleCall_4_1_1()); 
                          
                    }
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2295:1: ( ruleWS )*
                    loop77:
                    do {
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( ((LA77_0>=RULE_LINESP && LA77_0<=RULE_ML2_COMMENT)) ) {
                            alt77=1;
                        }


                        switch (alt77) {
                    	case 1 :
                    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2296:5: ruleWS
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getStructDeclarationAccess().getWSParserRuleCall_4_1_2()); 
                    	          
                    	    }
                    	    pushFollow(FOLLOW_ruleWS_in_rulestructDeclaration5118);
                    	    ruleWS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              afterParserOrEnumRuleCall();
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop77;
                        }
                    } while (true);

                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2303:3: ( ( ruleID ) )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2304:1: ( ruleID )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2304:1: ( ruleID )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2305:3: ruleID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getStructDeclarationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStructDeclarationAccess().getFromSigDeclarationCrossReference_4_1_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleID_in_rulestructDeclaration5142);
                    ruleID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2318:2: ( ( ruleWS )+ this_EQUALS_14= RULE_EQUALS ( ruleWS )* ( ( (lv_def_16_0= rulelinkBody ) ) | ( ruleWS ( (lv_def_18_0= rulemorphism ) ) ) ) )?
                    int alt81=2;
                    alt81 = dfa81.predict(input);
                    switch (alt81) {
                        case 1 :
                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2318:3: ( ruleWS )+ this_EQUALS_14= RULE_EQUALS ( ruleWS )* ( ( (lv_def_16_0= rulelinkBody ) ) | ( ruleWS ( (lv_def_18_0= rulemorphism ) ) ) )
                            {
                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2318:3: ( ruleWS )+
                            int cnt78=0;
                            loop78:
                            do {
                                int alt78=2;
                                int LA78_0 = input.LA(1);

                                if ( ((LA78_0>=RULE_LINESP && LA78_0<=RULE_ML2_COMMENT)) ) {
                                    alt78=1;
                                }


                                switch (alt78) {
                            	case 1 :
                            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2319:5: ruleWS
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	              newCompositeNode(grammarAccess.getStructDeclarationAccess().getWSParserRuleCall_4_1_4_0()); 
                            	          
                            	    }
                            	    pushFollow(FOLLOW_ruleWS_in_rulestructDeclaration5160);
                            	    ruleWS();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {
                            	       
                            	              afterParserOrEnumRuleCall();
                            	          
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt78 >= 1 ) break loop78;
                            	    if (state.backtracking>0) {state.failed=true; return current;}
                                        EarlyExitException eee =
                                            new EarlyExitException(78, input);
                                        throw eee;
                                }
                                cnt78++;
                            } while (true);

                            this_EQUALS_14=(Token)match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_rulestructDeclaration5172); if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_EQUALS_14, grammarAccess.getStructDeclarationAccess().getEQUALSTerminalRuleCall_4_1_4_1()); 
                                  
                            }
                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2330:1: ( ruleWS )*
                            loop79:
                            do {
                                int alt79=2;
                                switch ( input.LA(1) ) {
                                case RULE_LINESP:
                                    {
                                    int LA79_2 = input.LA(2);

                                    if ( (LA79_2==RULE_LCBRACKET||(LA79_2>=RULE_LINESP && LA79_2<=RULE_ML2_COMMENT)) ) {
                                        alt79=1;
                                    }


                                    }
                                    break;
                                case RULE_LINEDELIM:
                                    {
                                    int LA79_3 = input.LA(2);

                                    if ( (LA79_3==RULE_LCBRACKET||(LA79_3>=RULE_LINESP && LA79_3<=RULE_ML2_COMMENT)) ) {
                                        alt79=1;
                                    }


                                    }
                                    break;
                                case RULE_ML_COMMENT:
                                    {
                                    int LA79_4 = input.LA(2);

                                    if ( (LA79_4==RULE_LCBRACKET||(LA79_4>=RULE_LINESP && LA79_4<=RULE_ML2_COMMENT)) ) {
                                        alt79=1;
                                    }


                                    }
                                    break;
                                case RULE_ML2_COMMENT:
                                    {
                                    int LA79_5 = input.LA(2);

                                    if ( (LA79_5==RULE_LCBRACKET||(LA79_5>=RULE_LINESP && LA79_5<=RULE_ML2_COMMENT)) ) {
                                        alt79=1;
                                    }


                                    }
                                    break;

                                }

                                switch (alt79) {
                            	case 1 :
                            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2331:5: ruleWS
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	              newCompositeNode(grammarAccess.getStructDeclarationAccess().getWSParserRuleCall_4_1_4_2()); 
                            	          
                            	    }
                            	    pushFollow(FOLLOW_ruleWS_in_rulestructDeclaration5188);
                            	    ruleWS();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {
                            	       
                            	              afterParserOrEnumRuleCall();
                            	          
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    break loop79;
                                }
                            } while (true);

                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2338:3: ( ( (lv_def_16_0= rulelinkBody ) ) | ( ruleWS ( (lv_def_18_0= rulemorphism ) ) ) )
                            int alt80=2;
                            int LA80_0 = input.LA(1);

                            if ( (LA80_0==RULE_LCBRACKET) ) {
                                alt80=1;
                            }
                            else if ( ((LA80_0>=RULE_LINESP && LA80_0<=RULE_ML2_COMMENT)) ) {
                                alt80=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 80, 0, input);

                                throw nvae;
                            }
                            switch (alt80) {
                                case 1 :
                                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2338:4: ( (lv_def_16_0= rulelinkBody ) )
                                    {
                                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2338:4: ( (lv_def_16_0= rulelinkBody ) )
                                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2339:1: (lv_def_16_0= rulelinkBody )
                                    {
                                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2339:1: (lv_def_16_0= rulelinkBody )
                                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2340:3: lv_def_16_0= rulelinkBody
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	        newCompositeNode(grammarAccess.getStructDeclarationAccess().getDefLinkBodyParserRuleCall_4_1_4_3_0_0()); 
                                      	    
                                    }
                                    pushFollow(FOLLOW_rulelinkBody_in_rulestructDeclaration5211);
                                    lv_def_16_0=rulelinkBody();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElementForParent(grammarAccess.getStructDeclarationRule());
                                      	        }
                                             		set(
                                             			current, 
                                             			"def",
                                              		lv_def_16_0, 
                                              		"linkBody");
                                      	        afterParserOrEnumRuleCall();
                                      	    
                                    }

                                    }


                                    }


                                    }
                                    break;
                                case 2 :
                                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2357:6: ( ruleWS ( (lv_def_18_0= rulemorphism ) ) )
                                    {
                                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2357:6: ( ruleWS ( (lv_def_18_0= rulemorphism ) ) )
                                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2358:5: ruleWS ( (lv_def_18_0= rulemorphism ) )
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                              newCompositeNode(grammarAccess.getStructDeclarationAccess().getWSParserRuleCall_4_1_4_3_1_0()); 
                                          
                                    }
                                    pushFollow(FOLLOW_ruleWS_in_rulestructDeclaration5234);
                                    ruleWS();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {
                                       
                                              afterParserOrEnumRuleCall();
                                          
                                    }
                                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2365:1: ( (lv_def_18_0= rulemorphism ) )
                                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2366:1: (lv_def_18_0= rulemorphism )
                                    {
                                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2366:1: (lv_def_18_0= rulemorphism )
                                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2367:3: lv_def_18_0= rulemorphism
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	        newCompositeNode(grammarAccess.getStructDeclarationAccess().getDefMorphismParserRuleCall_4_1_4_3_1_1_0()); 
                                      	    
                                    }
                                    pushFollow(FOLLOW_rulemorphism_in_rulestructDeclaration5254);
                                    lv_def_18_0=rulemorphism();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElementForParent(grammarAccess.getStructDeclarationRule());
                                      	        }
                                             		set(
                                             			current, 
                                             			"def",
                                              		lv_def_18_0, 
                                              		"morphism");
                                      	        afterParserOrEnumRuleCall();
                                      	    
                                    }

                                    }


                                    }


                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2383:9: ( ( ruleWS )* ( (lv_incOpt_20_0= ruleincludeOps ) ) )?
            int alt84=2;
            alt84 = dfa84.predict(input);
            switch (alt84) {
                case 1 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2383:10: ( ruleWS )* ( (lv_incOpt_20_0= ruleincludeOps ) )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2383:10: ( ruleWS )*
                    loop83:
                    do {
                        int alt83=2;
                        int LA83_0 = input.LA(1);

                        if ( ((LA83_0>=RULE_LINESP && LA83_0<=RULE_ML2_COMMENT)) ) {
                            alt83=1;
                        }


                        switch (alt83) {
                    	case 1 :
                    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2384:5: ruleWS
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getStructDeclarationAccess().getWSParserRuleCall_5_0()); 
                    	          
                    	    }
                    	    pushFollow(FOLLOW_ruleWS_in_rulestructDeclaration5279);
                    	    ruleWS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              afterParserOrEnumRuleCall();
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop83;
                        }
                    } while (true);

                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2391:3: ( (lv_incOpt_20_0= ruleincludeOps ) )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2392:1: (lv_incOpt_20_0= ruleincludeOps )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2392:1: (lv_incOpt_20_0= ruleincludeOps )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2393:3: lv_incOpt_20_0= ruleincludeOps
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStructDeclarationAccess().getIncOptIncludeOpsParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleincludeOps_in_rulestructDeclaration5301);
                    lv_incOpt_20_0=ruleincludeOps();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStructDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"incOpt",
                              		lv_incOpt_20_0, 
                              		"includeOps");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2409:4: ( ruleWS )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( ((LA85_0>=RULE_LINESP && LA85_0<=RULE_ML2_COMMENT)) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2410:5: ruleWS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getStructDeclarationAccess().getWSParserRuleCall_6()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleWS_in_rulestructDeclaration5320);
            	    ruleWS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop85;
                }
            } while (true);

            this_DOT_22=(Token)match(input,RULE_DOT,FOLLOW_RULE_DOT_in_rulestructDeclaration5332); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_DOT_22, grammarAccess.getStructDeclarationAccess().getDOTTerminalRuleCall_7()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestructDeclaration"


    // $ANTLR start "entryRuleincludeOps"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2429:1: entryRuleincludeOps returns [EObject current=null] : iv_ruleincludeOps= ruleincludeOps EOF ;
    public final EObject entryRuleincludeOps() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleincludeOps = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2430:2: (iv_ruleincludeOps= ruleincludeOps EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2431:2: iv_ruleincludeOps= ruleincludeOps EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIncludeOpsRule()); 
            }
            pushFollow(FOLLOW_ruleincludeOps_in_entryRuleincludeOps5367);
            iv_ruleincludeOps=ruleincludeOps();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleincludeOps; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleincludeOps5377); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleincludeOps"


    // $ANTLR start "ruleincludeOps"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2438:1: ruleincludeOps returns [EObject current=null] : ( () otherlv_1= '%open' ( ( ruleWS )+ ( (lv_aliases_3_0= rulealiasDeclaration ) ) )* ) ;
    public final EObject ruleincludeOps() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_aliases_3_0 = null;


         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2441:28: ( ( () otherlv_1= '%open' ( ( ruleWS )+ ( (lv_aliases_3_0= rulealiasDeclaration ) ) )* ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2442:1: ( () otherlv_1= '%open' ( ( ruleWS )+ ( (lv_aliases_3_0= rulealiasDeclaration ) ) )* )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2442:1: ( () otherlv_1= '%open' ( ( ruleWS )+ ( (lv_aliases_3_0= rulealiasDeclaration ) ) )* )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2442:2: () otherlv_1= '%open' ( ( ruleWS )+ ( (lv_aliases_3_0= rulealiasDeclaration ) ) )*
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2442:2: ()
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2443:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getIncludeOpsAccess().getIncludeOpsAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleincludeOps5423); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getIncludeOpsAccess().getOpenKeyword_1());
                  
            }
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2452:1: ( ( ruleWS )+ ( (lv_aliases_3_0= rulealiasDeclaration ) ) )*
            loop87:
            do {
                int alt87=2;
                alt87 = dfa87.predict(input);
                switch (alt87) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2452:2: ( ruleWS )+ ( (lv_aliases_3_0= rulealiasDeclaration ) )
            	    {
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2452:2: ( ruleWS )+
            	    int cnt86=0;
            	    loop86:
            	    do {
            	        int alt86=2;
            	        int LA86_0 = input.LA(1);

            	        if ( ((LA86_0>=RULE_LINESP && LA86_0<=RULE_ML2_COMMENT)) ) {
            	            alt86=1;
            	        }


            	        switch (alt86) {
            	    	case 1 :
            	    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2453:5: ruleWS
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	              newCompositeNode(grammarAccess.getIncludeOpsAccess().getWSParserRuleCall_2_0()); 
            	    	          
            	    	    }
            	    	    pushFollow(FOLLOW_ruleWS_in_ruleincludeOps5441);
            	    	    ruleWS();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	              afterParserOrEnumRuleCall();
            	    	          
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt86 >= 1 ) break loop86;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(86, input);
            	                throw eee;
            	        }
            	        cnt86++;
            	    } while (true);

            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2460:3: ( (lv_aliases_3_0= rulealiasDeclaration ) )
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2461:1: (lv_aliases_3_0= rulealiasDeclaration )
            	    {
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2461:1: (lv_aliases_3_0= rulealiasDeclaration )
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2462:3: lv_aliases_3_0= rulealiasDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getIncludeOpsAccess().getAliasesAliasDeclarationParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulealiasDeclaration_in_ruleincludeOps5463);
            	    lv_aliases_3_0=rulealiasDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getIncludeOpsRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"aliases",
            	              		lv_aliases_3_0, 
            	              		"aliasDeclaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop87;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleincludeOps"


    // $ANTLR start "entryRulealiasDeclaration"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2486:1: entryRulealiasDeclaration returns [EObject current=null] : iv_rulealiasDeclaration= rulealiasDeclaration EOF ;
    public final EObject entryRulealiasDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulealiasDeclaration = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2487:2: (iv_rulealiasDeclaration= rulealiasDeclaration EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2488:2: iv_rulealiasDeclaration= rulealiasDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAliasDeclarationRule()); 
            }
            pushFollow(FOLLOW_rulealiasDeclaration_in_entryRulealiasDeclaration5501);
            iv_rulealiasDeclaration=rulealiasDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulealiasDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulealiasDeclaration5511); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulealiasDeclaration"


    // $ANTLR start "rulealiasDeclaration"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2495:1: rulealiasDeclaration returns [EObject current=null] : ( ( (lv_old_0_0= ruleID ) ) ( ( ( ruleWS )=> ruleWS )* otherlv_2= '%as' ( ruleWS )+ ( (lv_new_4_0= RULE_CID ) ) )? ) ;
    public final EObject rulealiasDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_new_4_0=null;
        AntlrDatatypeRuleToken lv_old_0_0 = null;


         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2498:28: ( ( ( (lv_old_0_0= ruleID ) ) ( ( ( ruleWS )=> ruleWS )* otherlv_2= '%as' ( ruleWS )+ ( (lv_new_4_0= RULE_CID ) ) )? ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2499:1: ( ( (lv_old_0_0= ruleID ) ) ( ( ( ruleWS )=> ruleWS )* otherlv_2= '%as' ( ruleWS )+ ( (lv_new_4_0= RULE_CID ) ) )? )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2499:1: ( ( (lv_old_0_0= ruleID ) ) ( ( ( ruleWS )=> ruleWS )* otherlv_2= '%as' ( ruleWS )+ ( (lv_new_4_0= RULE_CID ) ) )? )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2499:2: ( (lv_old_0_0= ruleID ) ) ( ( ( ruleWS )=> ruleWS )* otherlv_2= '%as' ( ruleWS )+ ( (lv_new_4_0= RULE_CID ) ) )?
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2499:2: ( (lv_old_0_0= ruleID ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2500:1: (lv_old_0_0= ruleID )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2500:1: (lv_old_0_0= ruleID )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2501:3: lv_old_0_0= ruleID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAliasDeclarationAccess().getOldIDParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleID_in_rulealiasDeclaration5557);
            lv_old_0_0=ruleID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAliasDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"old",
                      		lv_old_0_0, 
                      		"ID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2517:2: ( ( ( ruleWS )=> ruleWS )* otherlv_2= '%as' ( ruleWS )+ ( (lv_new_4_0= RULE_CID ) ) )?
            int alt90=2;
            alt90 = dfa90.predict(input);
            switch (alt90) {
                case 1 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2517:3: ( ( ruleWS )=> ruleWS )* otherlv_2= '%as' ( ruleWS )+ ( (lv_new_4_0= RULE_CID ) )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2517:3: ( ( ruleWS )=> ruleWS )*
                    loop88:
                    do {
                        int alt88=2;
                        int LA88_0 = input.LA(1);

                        if ( (LA88_0==RULE_LINESP) && (synpred1_InternalLF())) {
                            alt88=1;
                        }
                        else if ( (LA88_0==RULE_LINEDELIM) && (synpred1_InternalLF())) {
                            alt88=1;
                        }
                        else if ( (LA88_0==RULE_ML_COMMENT) && (synpred1_InternalLF())) {
                            alt88=1;
                        }
                        else if ( (LA88_0==RULE_ML2_COMMENT) && (synpred1_InternalLF())) {
                            alt88=1;
                        }


                        switch (alt88) {
                    	case 1 :
                    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2517:4: ( ruleWS )=> ruleWS
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getAliasDeclarationAccess().getWSParserRuleCall_1_0()); 
                    	          
                    	    }
                    	    pushFollow(FOLLOW_ruleWS_in_rulealiasDeclaration5580);
                    	    ruleWS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              afterParserOrEnumRuleCall();
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop88;
                        }
                    } while (true);

                    otherlv_2=(Token)match(input,41,FOLLOW_41_in_rulealiasDeclaration5593); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAliasDeclarationAccess().getAsKeyword_1_1());
                          
                    }
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2529:1: ( ruleWS )+
                    int cnt89=0;
                    loop89:
                    do {
                        int alt89=2;
                        int LA89_0 = input.LA(1);

                        if ( ((LA89_0>=RULE_LINESP && LA89_0<=RULE_ML2_COMMENT)) ) {
                            alt89=1;
                        }


                        switch (alt89) {
                    	case 1 :
                    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2530:5: ruleWS
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getAliasDeclarationAccess().getWSParserRuleCall_1_2()); 
                    	          
                    	    }
                    	    pushFollow(FOLLOW_ruleWS_in_rulealiasDeclaration5610);
                    	    ruleWS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              afterParserOrEnumRuleCall();
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt89 >= 1 ) break loop89;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(89, input);
                                throw eee;
                        }
                        cnt89++;
                    } while (true);

                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2537:3: ( (lv_new_4_0= RULE_CID ) )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2538:1: (lv_new_4_0= RULE_CID )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2538:1: (lv_new_4_0= RULE_CID )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2539:3: lv_new_4_0= RULE_CID
                    {
                    lv_new_4_0=(Token)match(input,RULE_CID,FOLLOW_RULE_CID_in_rulealiasDeclaration5628); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_new_4_0, grammarAccess.getAliasDeclarationAccess().getNewCIDTerminalRuleCall_1_3_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAliasDeclarationRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"new",
                              		lv_new_4_0, 
                              		"CID");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulealiasDeclaration"


    // $ANTLR start "entryRuleconstantAssignment"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2563:1: entryRuleconstantAssignment returns [EObject current=null] : iv_ruleconstantAssignment= ruleconstantAssignment EOF ;
    public final EObject entryRuleconstantAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconstantAssignment = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2564:2: (iv_ruleconstantAssignment= ruleconstantAssignment EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2565:2: iv_ruleconstantAssignment= ruleconstantAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleconstantAssignment_in_entryRuleconstantAssignment5671);
            iv_ruleconstantAssignment=ruleconstantAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleconstantAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleconstantAssignment5681); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleconstantAssignment"


    // $ANTLR start "ruleconstantAssignment"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2572:1: ruleconstantAssignment returns [EObject current=null] : ( ( (lv_name_0_0= ruleID ) ) ( ruleWS )* this_ASSIGN_2= RULE_ASSIGN ( ruleWS )+ ( (lv_def_4_0= ruleterm ) ) ( ruleWS )* this_DOT_6= RULE_DOT ) ;
    public final EObject ruleconstantAssignment() throws RecognitionException {
        EObject current = null;

        Token this_ASSIGN_2=null;
        Token this_DOT_6=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_def_4_0 = null;


         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2575:28: ( ( ( (lv_name_0_0= ruleID ) ) ( ruleWS )* this_ASSIGN_2= RULE_ASSIGN ( ruleWS )+ ( (lv_def_4_0= ruleterm ) ) ( ruleWS )* this_DOT_6= RULE_DOT ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2576:1: ( ( (lv_name_0_0= ruleID ) ) ( ruleWS )* this_ASSIGN_2= RULE_ASSIGN ( ruleWS )+ ( (lv_def_4_0= ruleterm ) ) ( ruleWS )* this_DOT_6= RULE_DOT )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2576:1: ( ( (lv_name_0_0= ruleID ) ) ( ruleWS )* this_ASSIGN_2= RULE_ASSIGN ( ruleWS )+ ( (lv_def_4_0= ruleterm ) ) ( ruleWS )* this_DOT_6= RULE_DOT )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2576:2: ( (lv_name_0_0= ruleID ) ) ( ruleWS )* this_ASSIGN_2= RULE_ASSIGN ( ruleWS )+ ( (lv_def_4_0= ruleterm ) ) ( ruleWS )* this_DOT_6= RULE_DOT
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2576:2: ( (lv_name_0_0= ruleID ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2577:1: (lv_name_0_0= ruleID )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2577:1: (lv_name_0_0= ruleID )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2578:3: lv_name_0_0= ruleID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConstantAssignmentAccess().getNameIDParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleID_in_ruleconstantAssignment5727);
            lv_name_0_0=ruleID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getConstantAssignmentRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2594:2: ( ruleWS )*
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( ((LA91_0>=RULE_LINESP && LA91_0<=RULE_ML2_COMMENT)) ) {
                    alt91=1;
                }


                switch (alt91) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2595:5: ruleWS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getConstantAssignmentAccess().getWSParserRuleCall_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleWS_in_ruleconstantAssignment5744);
            	    ruleWS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop91;
                }
            } while (true);

            this_ASSIGN_2=(Token)match(input,RULE_ASSIGN,FOLLOW_RULE_ASSIGN_in_ruleconstantAssignment5756); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ASSIGN_2, grammarAccess.getConstantAssignmentAccess().getASSIGNTerminalRuleCall_2()); 
                  
            }
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2606:1: ( ruleWS )+
            int cnt92=0;
            loop92:
            do {
                int alt92=2;
                int LA92_0 = input.LA(1);

                if ( ((LA92_0>=RULE_LINESP && LA92_0<=RULE_ML2_COMMENT)) ) {
                    alt92=1;
                }


                switch (alt92) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2607:5: ruleWS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getConstantAssignmentAccess().getWSParserRuleCall_3()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleWS_in_ruleconstantAssignment5772);
            	    ruleWS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt92 >= 1 ) break loop92;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(92, input);
                        throw eee;
                }
                cnt92++;
            } while (true);

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2614:3: ( (lv_def_4_0= ruleterm ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2615:1: (lv_def_4_0= ruleterm )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2615:1: (lv_def_4_0= ruleterm )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2616:3: lv_def_4_0= ruleterm
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConstantAssignmentAccess().getDefTermParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleterm_in_ruleconstantAssignment5794);
            lv_def_4_0=ruleterm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getConstantAssignmentRule());
              	        }
                     		set(
                     			current, 
                     			"def",
                      		lv_def_4_0, 
                      		"term");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2632:2: ( ruleWS )*
            loop93:
            do {
                int alt93=2;
                int LA93_0 = input.LA(1);

                if ( ((LA93_0>=RULE_LINESP && LA93_0<=RULE_ML2_COMMENT)) ) {
                    alt93=1;
                }


                switch (alt93) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2633:5: ruleWS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getConstantAssignmentAccess().getWSParserRuleCall_5()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleWS_in_ruleconstantAssignment5811);
            	    ruleWS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop93;
                }
            } while (true);

            this_DOT_6=(Token)match(input,RULE_DOT,FOLLOW_RULE_DOT_in_ruleconstantAssignment5823); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_DOT_6, grammarAccess.getConstantAssignmentAccess().getDOTTerminalRuleCall_6()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleconstantAssignment"


    // $ANTLR start "entryRulestructAssignment"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2652:1: entryRulestructAssignment returns [EObject current=null] : iv_rulestructAssignment= rulestructAssignment EOF ;
    public final EObject entryRulestructAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestructAssignment = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2653:2: (iv_rulestructAssignment= rulestructAssignment EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2654:2: iv_rulestructAssignment= rulestructAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStructAssignmentRule()); 
            }
            pushFollow(FOLLOW_rulestructAssignment_in_entryRulestructAssignment5858);
            iv_rulestructAssignment=rulestructAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulestructAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulestructAssignment5868); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulestructAssignment"


    // $ANTLR start "rulestructAssignment"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2661:1: rulestructAssignment returns [EObject current=null] : (otherlv_0= '%struct' ( ruleWS )+ ( (lv_name_2_0= ruleID ) ) ( ruleWS )* this_ASSIGN_4= RULE_ASSIGN ( ruleWS )+ ( (lv_def_6_0= rulemorphism ) ) ( ruleWS )* this_DOT_8= RULE_DOT ) ;
    public final EObject rulestructAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_ASSIGN_4=null;
        Token this_DOT_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_def_6_0 = null;


         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2664:28: ( (otherlv_0= '%struct' ( ruleWS )+ ( (lv_name_2_0= ruleID ) ) ( ruleWS )* this_ASSIGN_4= RULE_ASSIGN ( ruleWS )+ ( (lv_def_6_0= rulemorphism ) ) ( ruleWS )* this_DOT_8= RULE_DOT ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2665:1: (otherlv_0= '%struct' ( ruleWS )+ ( (lv_name_2_0= ruleID ) ) ( ruleWS )* this_ASSIGN_4= RULE_ASSIGN ( ruleWS )+ ( (lv_def_6_0= rulemorphism ) ) ( ruleWS )* this_DOT_8= RULE_DOT )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2665:1: (otherlv_0= '%struct' ( ruleWS )+ ( (lv_name_2_0= ruleID ) ) ( ruleWS )* this_ASSIGN_4= RULE_ASSIGN ( ruleWS )+ ( (lv_def_6_0= rulemorphism ) ) ( ruleWS )* this_DOT_8= RULE_DOT )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2665:3: otherlv_0= '%struct' ( ruleWS )+ ( (lv_name_2_0= ruleID ) ) ( ruleWS )* this_ASSIGN_4= RULE_ASSIGN ( ruleWS )+ ( (lv_def_6_0= rulemorphism ) ) ( ruleWS )* this_DOT_8= RULE_DOT
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_rulestructAssignment5905); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStructAssignmentAccess().getStructKeyword_0());
                  
            }
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2669:1: ( ruleWS )+
            int cnt94=0;
            loop94:
            do {
                int alt94=2;
                int LA94_0 = input.LA(1);

                if ( ((LA94_0>=RULE_LINESP && LA94_0<=RULE_ML2_COMMENT)) ) {
                    alt94=1;
                }


                switch (alt94) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2670:5: ruleWS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getStructAssignmentAccess().getWSParserRuleCall_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleWS_in_rulestructAssignment5922);
            	    ruleWS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt94 >= 1 ) break loop94;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(94, input);
                        throw eee;
                }
                cnt94++;
            } while (true);

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2677:3: ( (lv_name_2_0= ruleID ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2678:1: (lv_name_2_0= ruleID )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2678:1: (lv_name_2_0= ruleID )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2679:3: lv_name_2_0= ruleID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStructAssignmentAccess().getNameIDParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleID_in_rulestructAssignment5944);
            lv_name_2_0=ruleID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStructAssignmentRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2695:2: ( ruleWS )*
            loop95:
            do {
                int alt95=2;
                int LA95_0 = input.LA(1);

                if ( ((LA95_0>=RULE_LINESP && LA95_0<=RULE_ML2_COMMENT)) ) {
                    alt95=1;
                }


                switch (alt95) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2696:5: ruleWS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getStructAssignmentAccess().getWSParserRuleCall_3()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleWS_in_rulestructAssignment5961);
            	    ruleWS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop95;
                }
            } while (true);

            this_ASSIGN_4=(Token)match(input,RULE_ASSIGN,FOLLOW_RULE_ASSIGN_in_rulestructAssignment5973); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ASSIGN_4, grammarAccess.getStructAssignmentAccess().getASSIGNTerminalRuleCall_4()); 
                  
            }
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2707:1: ( ruleWS )+
            int cnt96=0;
            loop96:
            do {
                int alt96=2;
                int LA96_0 = input.LA(1);

                if ( ((LA96_0>=RULE_LINESP && LA96_0<=RULE_ML2_COMMENT)) ) {
                    alt96=1;
                }


                switch (alt96) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2708:5: ruleWS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getStructAssignmentAccess().getWSParserRuleCall_5()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleWS_in_rulestructAssignment5989);
            	    ruleWS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt96 >= 1 ) break loop96;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(96, input);
                        throw eee;
                }
                cnt96++;
            } while (true);

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2715:3: ( (lv_def_6_0= rulemorphism ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2716:1: (lv_def_6_0= rulemorphism )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2716:1: (lv_def_6_0= rulemorphism )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2717:3: lv_def_6_0= rulemorphism
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStructAssignmentAccess().getDefMorphismParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_rulemorphism_in_rulestructAssignment6011);
            lv_def_6_0=rulemorphism();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStructAssignmentRule());
              	        }
                     		set(
                     			current, 
                     			"def",
                      		lv_def_6_0, 
                      		"morphism");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2733:2: ( ruleWS )*
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( ((LA97_0>=RULE_LINESP && LA97_0<=RULE_ML2_COMMENT)) ) {
                    alt97=1;
                }


                switch (alt97) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2734:5: ruleWS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getStructAssignmentAccess().getWSParserRuleCall_7()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleWS_in_rulestructAssignment6028);
            	    ruleWS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop97;
                }
            } while (true);

            this_DOT_8=(Token)match(input,RULE_DOT,FOLLOW_RULE_DOT_in_rulestructAssignment6040); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_DOT_8, grammarAccess.getStructAssignmentAccess().getDOTTerminalRuleCall_8()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestructAssignment"


    // $ANTLR start "entryRuleviewMetaDeclaration"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2753:1: entryRuleviewMetaDeclaration returns [EObject current=null] : iv_ruleviewMetaDeclaration= ruleviewMetaDeclaration EOF ;
    public final EObject entryRuleviewMetaDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleviewMetaDeclaration = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2754:2: (iv_ruleviewMetaDeclaration= ruleviewMetaDeclaration EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2755:2: iv_ruleviewMetaDeclaration= ruleviewMetaDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getViewMetaDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleviewMetaDeclaration_in_entryRuleviewMetaDeclaration6075);
            iv_ruleviewMetaDeclaration=ruleviewMetaDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleviewMetaDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleviewMetaDeclaration6085); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleviewMetaDeclaration"


    // $ANTLR start "ruleviewMetaDeclaration"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2762:1: ruleviewMetaDeclaration returns [EObject current=null] : (otherlv_0= '%meta' ( ruleWS )+ ( (lv_def_2_0= rulemorphism ) ) ( ruleWS )* this_DOT_4= RULE_DOT ) ;
    public final EObject ruleviewMetaDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_DOT_4=null;
        EObject lv_def_2_0 = null;


         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2765:28: ( (otherlv_0= '%meta' ( ruleWS )+ ( (lv_def_2_0= rulemorphism ) ) ( ruleWS )* this_DOT_4= RULE_DOT ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2766:1: (otherlv_0= '%meta' ( ruleWS )+ ( (lv_def_2_0= rulemorphism ) ) ( ruleWS )* this_DOT_4= RULE_DOT )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2766:1: (otherlv_0= '%meta' ( ruleWS )+ ( (lv_def_2_0= rulemorphism ) ) ( ruleWS )* this_DOT_4= RULE_DOT )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2766:3: otherlv_0= '%meta' ( ruleWS )+ ( (lv_def_2_0= rulemorphism ) ) ( ruleWS )* this_DOT_4= RULE_DOT
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleviewMetaDeclaration6122); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getViewMetaDeclarationAccess().getMetaKeyword_0());
                  
            }
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2770:1: ( ruleWS )+
            int cnt98=0;
            loop98:
            do {
                int alt98=2;
                int LA98_0 = input.LA(1);

                if ( ((LA98_0>=RULE_LINESP && LA98_0<=RULE_ML2_COMMENT)) ) {
                    alt98=1;
                }


                switch (alt98) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2771:5: ruleWS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getViewMetaDeclarationAccess().getWSParserRuleCall_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleWS_in_ruleviewMetaDeclaration6139);
            	    ruleWS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt98 >= 1 ) break loop98;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(98, input);
                        throw eee;
                }
                cnt98++;
            } while (true);

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2778:3: ( (lv_def_2_0= rulemorphism ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2779:1: (lv_def_2_0= rulemorphism )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2779:1: (lv_def_2_0= rulemorphism )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2780:3: lv_def_2_0= rulemorphism
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getViewMetaDeclarationAccess().getDefMorphismParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_rulemorphism_in_ruleviewMetaDeclaration6161);
            lv_def_2_0=rulemorphism();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getViewMetaDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"def",
                      		lv_def_2_0, 
                      		"morphism");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2796:2: ( ruleWS )*
            loop99:
            do {
                int alt99=2;
                int LA99_0 = input.LA(1);

                if ( ((LA99_0>=RULE_LINESP && LA99_0<=RULE_ML2_COMMENT)) ) {
                    alt99=1;
                }


                switch (alt99) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2797:5: ruleWS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getViewMetaDeclarationAccess().getWSParserRuleCall_3()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleWS_in_ruleviewMetaDeclaration6178);
            	    ruleWS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop99;
                }
            } while (true);

            this_DOT_4=(Token)match(input,RULE_DOT,FOLLOW_RULE_DOT_in_ruleviewMetaDeclaration6190); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_DOT_4, grammarAccess.getViewMetaDeclarationAccess().getDOTTerminalRuleCall_4()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleviewMetaDeclaration"


    // $ANTLR start "entryRuleviewIncludeDeclaration"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2816:1: entryRuleviewIncludeDeclaration returns [EObject current=null] : iv_ruleviewIncludeDeclaration= ruleviewIncludeDeclaration EOF ;
    public final EObject entryRuleviewIncludeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleviewIncludeDeclaration = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2817:2: (iv_ruleviewIncludeDeclaration= ruleviewIncludeDeclaration EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2818:2: iv_ruleviewIncludeDeclaration= ruleviewIncludeDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getViewIncludeDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleviewIncludeDeclaration_in_entryRuleviewIncludeDeclaration6225);
            iv_ruleviewIncludeDeclaration=ruleviewIncludeDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleviewIncludeDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleviewIncludeDeclaration6235); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleviewIncludeDeclaration"


    // $ANTLR start "ruleviewIncludeDeclaration"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2825:1: ruleviewIncludeDeclaration returns [EObject current=null] : (otherlv_0= '%include' ( ruleWS )+ ( (lv_def_2_0= rulemorphism ) ) ( ruleWS )* this_DOT_4= RULE_DOT ) ;
    public final EObject ruleviewIncludeDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_DOT_4=null;
        EObject lv_def_2_0 = null;


         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2828:28: ( (otherlv_0= '%include' ( ruleWS )+ ( (lv_def_2_0= rulemorphism ) ) ( ruleWS )* this_DOT_4= RULE_DOT ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2829:1: (otherlv_0= '%include' ( ruleWS )+ ( (lv_def_2_0= rulemorphism ) ) ( ruleWS )* this_DOT_4= RULE_DOT )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2829:1: (otherlv_0= '%include' ( ruleWS )+ ( (lv_def_2_0= rulemorphism ) ) ( ruleWS )* this_DOT_4= RULE_DOT )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2829:3: otherlv_0= '%include' ( ruleWS )+ ( (lv_def_2_0= rulemorphism ) ) ( ruleWS )* this_DOT_4= RULE_DOT
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleviewIncludeDeclaration6272); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getViewIncludeDeclarationAccess().getIncludeKeyword_0());
                  
            }
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2833:1: ( ruleWS )+
            int cnt100=0;
            loop100:
            do {
                int alt100=2;
                int LA100_0 = input.LA(1);

                if ( ((LA100_0>=RULE_LINESP && LA100_0<=RULE_ML2_COMMENT)) ) {
                    alt100=1;
                }


                switch (alt100) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2834:5: ruleWS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getViewIncludeDeclarationAccess().getWSParserRuleCall_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleWS_in_ruleviewIncludeDeclaration6289);
            	    ruleWS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt100 >= 1 ) break loop100;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(100, input);
                        throw eee;
                }
                cnt100++;
            } while (true);

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2841:3: ( (lv_def_2_0= rulemorphism ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2842:1: (lv_def_2_0= rulemorphism )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2842:1: (lv_def_2_0= rulemorphism )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2843:3: lv_def_2_0= rulemorphism
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getViewIncludeDeclarationAccess().getDefMorphismParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_rulemorphism_in_ruleviewIncludeDeclaration6311);
            lv_def_2_0=rulemorphism();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getViewIncludeDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"def",
                      		lv_def_2_0, 
                      		"morphism");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2859:2: ( ruleWS )*
            loop101:
            do {
                int alt101=2;
                int LA101_0 = input.LA(1);

                if ( ((LA101_0>=RULE_LINESP && LA101_0<=RULE_ML2_COMMENT)) ) {
                    alt101=1;
                }


                switch (alt101) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2860:5: ruleWS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getViewIncludeDeclarationAccess().getWSParserRuleCall_3()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleWS_in_ruleviewIncludeDeclaration6328);
            	    ruleWS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop101;
                }
            } while (true);

            this_DOT_4=(Token)match(input,RULE_DOT,FOLLOW_RULE_DOT_in_ruleviewIncludeDeclaration6340); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_DOT_4, grammarAccess.getViewIncludeDeclarationAccess().getDOTTerminalRuleCall_4()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleviewIncludeDeclaration"


    // $ANTLR start "entryRuleanyDirective"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2879:1: entryRuleanyDirective returns [String current=null] : iv_ruleanyDirective= ruleanyDirective EOF ;
    public final String entryRuleanyDirective() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleanyDirective = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2880:2: (iv_ruleanyDirective= ruleanyDirective EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2881:2: iv_ruleanyDirective= ruleanyDirective EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnyDirectiveRule()); 
            }
            pushFollow(FOLLOW_ruleanyDirective_in_entryRuleanyDirective6376);
            iv_ruleanyDirective=ruleanyDirective();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleanyDirective.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleanyDirective6387); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleanyDirective"


    // $ANTLR start "ruleanyDirective"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2888:1: ruleanyDirective returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_UNKNOWNDIRECTIVE_0= RULE_UNKNOWNDIRECTIVE | kw= '%struct' | kw= '%meta' | kw= '%include' | kw= '%namespace' | kw= '%read' | kw= '%sig' | kw= '%view' | kw= '%implicit' | kw= '%open' | kw= '%as' | kw= '%abbrev' | kw= '%name' | this_INFIXNONE_13= RULE_INFIXNONE | this_INFIXLEFT_14= RULE_INFIXLEFT | this_INFIXRIGHT_15= RULE_INFIXRIGHT | kw= '%prefix' | kw= '%postfix' ) ;
    public final AntlrDatatypeRuleToken ruleanyDirective() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_UNKNOWNDIRECTIVE_0=null;
        Token kw=null;
        Token this_INFIXNONE_13=null;
        Token this_INFIXLEFT_14=null;
        Token this_INFIXRIGHT_15=null;

         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2891:28: ( (this_UNKNOWNDIRECTIVE_0= RULE_UNKNOWNDIRECTIVE | kw= '%struct' | kw= '%meta' | kw= '%include' | kw= '%namespace' | kw= '%read' | kw= '%sig' | kw= '%view' | kw= '%implicit' | kw= '%open' | kw= '%as' | kw= '%abbrev' | kw= '%name' | this_INFIXNONE_13= RULE_INFIXNONE | this_INFIXLEFT_14= RULE_INFIXLEFT | this_INFIXRIGHT_15= RULE_INFIXRIGHT | kw= '%prefix' | kw= '%postfix' ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2892:1: (this_UNKNOWNDIRECTIVE_0= RULE_UNKNOWNDIRECTIVE | kw= '%struct' | kw= '%meta' | kw= '%include' | kw= '%namespace' | kw= '%read' | kw= '%sig' | kw= '%view' | kw= '%implicit' | kw= '%open' | kw= '%as' | kw= '%abbrev' | kw= '%name' | this_INFIXNONE_13= RULE_INFIXNONE | this_INFIXLEFT_14= RULE_INFIXLEFT | this_INFIXRIGHT_15= RULE_INFIXRIGHT | kw= '%prefix' | kw= '%postfix' )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2892:1: (this_UNKNOWNDIRECTIVE_0= RULE_UNKNOWNDIRECTIVE | kw= '%struct' | kw= '%meta' | kw= '%include' | kw= '%namespace' | kw= '%read' | kw= '%sig' | kw= '%view' | kw= '%implicit' | kw= '%open' | kw= '%as' | kw= '%abbrev' | kw= '%name' | this_INFIXNONE_13= RULE_INFIXNONE | this_INFIXLEFT_14= RULE_INFIXLEFT | this_INFIXRIGHT_15= RULE_INFIXRIGHT | kw= '%prefix' | kw= '%postfix' )
            int alt102=18;
            switch ( input.LA(1) ) {
            case RULE_UNKNOWNDIRECTIVE:
                {
                alt102=1;
                }
                break;
            case 38:
                {
                alt102=2;
                }
                break;
            case 36:
                {
                alt102=3;
                }
                break;
            case 37:
                {
                alt102=4;
                }
                break;
            case 42:
                {
                alt102=5;
                }
                break;
            case 43:
                {
                alt102=6;
                }
                break;
            case 44:
                {
                alt102=7;
                }
                break;
            case 45:
                {
                alt102=8;
                }
                break;
            case 39:
                {
                alt102=9;
                }
                break;
            case 40:
                {
                alt102=10;
                }
                break;
            case 41:
                {
                alt102=11;
                }
                break;
            case 32:
                {
                alt102=12;
                }
                break;
            case 33:
                {
                alt102=13;
                }
                break;
            case RULE_INFIXNONE:
                {
                alt102=14;
                }
                break;
            case RULE_INFIXLEFT:
                {
                alt102=15;
                }
                break;
            case RULE_INFIXRIGHT:
                {
                alt102=16;
                }
                break;
            case 34:
                {
                alt102=17;
                }
                break;
            case 35:
                {
                alt102=18;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 102, 0, input);

                throw nvae;
            }

            switch (alt102) {
                case 1 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2892:6: this_UNKNOWNDIRECTIVE_0= RULE_UNKNOWNDIRECTIVE
                    {
                    this_UNKNOWNDIRECTIVE_0=(Token)match(input,RULE_UNKNOWNDIRECTIVE,FOLLOW_RULE_UNKNOWNDIRECTIVE_in_ruleanyDirective6427); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_UNKNOWNDIRECTIVE_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_UNKNOWNDIRECTIVE_0, grammarAccess.getAnyDirectiveAccess().getUNKNOWNDIRECTIVETerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2901:2: kw= '%struct'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleanyDirective6451); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAnyDirectiveAccess().getStructKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2908:2: kw= '%meta'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleanyDirective6470); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAnyDirectiveAccess().getMetaKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2915:2: kw= '%include'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleanyDirective6489); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAnyDirectiveAccess().getIncludeKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2922:2: kw= '%namespace'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleanyDirective6508); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAnyDirectiveAccess().getNamespaceKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2929:2: kw= '%read'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleanyDirective6527); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAnyDirectiveAccess().getReadKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2936:2: kw= '%sig'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleanyDirective6546); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAnyDirectiveAccess().getSigKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2943:2: kw= '%view'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleanyDirective6565); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAnyDirectiveAccess().getViewKeyword_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2950:2: kw= '%implicit'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleanyDirective6584); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAnyDirectiveAccess().getImplicitKeyword_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2957:2: kw= '%open'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleanyDirective6603); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAnyDirectiveAccess().getOpenKeyword_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2964:2: kw= '%as'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleanyDirective6622); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAnyDirectiveAccess().getAsKeyword_10()); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2971:2: kw= '%abbrev'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleanyDirective6641); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAnyDirectiveAccess().getAbbrevKeyword_11()); 
                          
                    }

                    }
                    break;
                case 13 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2978:2: kw= '%name'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleanyDirective6660); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAnyDirectiveAccess().getNameKeyword_12()); 
                          
                    }

                    }
                    break;
                case 14 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2984:10: this_INFIXNONE_13= RULE_INFIXNONE
                    {
                    this_INFIXNONE_13=(Token)match(input,RULE_INFIXNONE,FOLLOW_RULE_INFIXNONE_in_ruleanyDirective6681); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INFIXNONE_13);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INFIXNONE_13, grammarAccess.getAnyDirectiveAccess().getINFIXNONETerminalRuleCall_13()); 
                          
                    }

                    }
                    break;
                case 15 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2992:10: this_INFIXLEFT_14= RULE_INFIXLEFT
                    {
                    this_INFIXLEFT_14=(Token)match(input,RULE_INFIXLEFT,FOLLOW_RULE_INFIXLEFT_in_ruleanyDirective6707); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INFIXLEFT_14);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INFIXLEFT_14, grammarAccess.getAnyDirectiveAccess().getINFIXLEFTTerminalRuleCall_14()); 
                          
                    }

                    }
                    break;
                case 16 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3000:10: this_INFIXRIGHT_15= RULE_INFIXRIGHT
                    {
                    this_INFIXRIGHT_15=(Token)match(input,RULE_INFIXRIGHT,FOLLOW_RULE_INFIXRIGHT_in_ruleanyDirective6733); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INFIXRIGHT_15);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INFIXRIGHT_15, grammarAccess.getAnyDirectiveAccess().getINFIXRIGHTTerminalRuleCall_15()); 
                          
                    }

                    }
                    break;
                case 17 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3009:2: kw= '%prefix'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleanyDirective6757); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAnyDirectiveAccess().getPrefixKeyword_16()); 
                          
                    }

                    }
                    break;
                case 18 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3016:2: kw= '%postfix'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleanyDirective6776); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAnyDirectiveAccess().getPostfixKeyword_17()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleanyDirective"


    // $ANTLR start "entryRuleunknownBrackets"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3029:1: entryRuleunknownBrackets returns [EObject current=null] : iv_ruleunknownBrackets= ruleunknownBrackets EOF ;
    public final EObject entryRuleunknownBrackets() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunknownBrackets = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3030:2: (iv_ruleunknownBrackets= ruleunknownBrackets EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3031:2: iv_ruleunknownBrackets= ruleunknownBrackets EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnknownBracketsRule()); 
            }
            pushFollow(FOLLOW_ruleunknownBrackets_in_entryRuleunknownBrackets6816);
            iv_ruleunknownBrackets=ruleunknownBrackets();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleunknownBrackets; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleunknownBrackets6826); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleunknownBrackets"


    // $ANTLR start "ruleunknownBrackets"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3038:1: ruleunknownBrackets returns [EObject current=null] : ( () this_LCBRACKET_1= RULE_LCBRACKET ( ( ruleWS )+ ( (lv_t_3_0= ruleanyConstruct ) ) )* ( ruleWS )* this_RCBRACKET_5= RULE_RCBRACKET ) ;
    public final EObject ruleunknownBrackets() throws RecognitionException {
        EObject current = null;

        Token this_LCBRACKET_1=null;
        Token this_RCBRACKET_5=null;
        EObject lv_t_3_0 = null;


         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3041:28: ( ( () this_LCBRACKET_1= RULE_LCBRACKET ( ( ruleWS )+ ( (lv_t_3_0= ruleanyConstruct ) ) )* ( ruleWS )* this_RCBRACKET_5= RULE_RCBRACKET ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3042:1: ( () this_LCBRACKET_1= RULE_LCBRACKET ( ( ruleWS )+ ( (lv_t_3_0= ruleanyConstruct ) ) )* ( ruleWS )* this_RCBRACKET_5= RULE_RCBRACKET )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3042:1: ( () this_LCBRACKET_1= RULE_LCBRACKET ( ( ruleWS )+ ( (lv_t_3_0= ruleanyConstruct ) ) )* ( ruleWS )* this_RCBRACKET_5= RULE_RCBRACKET )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3042:2: () this_LCBRACKET_1= RULE_LCBRACKET ( ( ruleWS )+ ( (lv_t_3_0= ruleanyConstruct ) ) )* ( ruleWS )* this_RCBRACKET_5= RULE_RCBRACKET
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3042:2: ()
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3043:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getUnknownBracketsAccess().getUnknownBracketsAction_0(),
                          current);
                  
            }

            }

            this_LCBRACKET_1=(Token)match(input,RULE_LCBRACKET,FOLLOW_RULE_LCBRACKET_in_ruleunknownBrackets6871); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LCBRACKET_1, grammarAccess.getUnknownBracketsAccess().getLCBRACKETTerminalRuleCall_1()); 
                  
            }
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3052:1: ( ( ruleWS )+ ( (lv_t_3_0= ruleanyConstruct ) ) )*
            loop104:
            do {
                int alt104=2;
                alt104 = dfa104.predict(input);
                switch (alt104) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3052:2: ( ruleWS )+ ( (lv_t_3_0= ruleanyConstruct ) )
            	    {
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3052:2: ( ruleWS )+
            	    int cnt103=0;
            	    loop103:
            	    do {
            	        int alt103=2;
            	        int LA103_0 = input.LA(1);

            	        if ( ((LA103_0>=RULE_LINESP && LA103_0<=RULE_ML2_COMMENT)) ) {
            	            alt103=1;
            	        }


            	        switch (alt103) {
            	    	case 1 :
            	    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3053:5: ruleWS
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	              newCompositeNode(grammarAccess.getUnknownBracketsAccess().getWSParserRuleCall_2_0()); 
            	    	          
            	    	    }
            	    	    pushFollow(FOLLOW_ruleWS_in_ruleunknownBrackets6888);
            	    	    ruleWS();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	              afterParserOrEnumRuleCall();
            	    	          
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt103 >= 1 ) break loop103;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(103, input);
            	                throw eee;
            	        }
            	        cnt103++;
            	    } while (true);

            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3060:3: ( (lv_t_3_0= ruleanyConstruct ) )
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3061:1: (lv_t_3_0= ruleanyConstruct )
            	    {
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3061:1: (lv_t_3_0= ruleanyConstruct )
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3062:3: lv_t_3_0= ruleanyConstruct
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getUnknownBracketsAccess().getTAnyConstructParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleanyConstruct_in_ruleunknownBrackets6910);
            	    lv_t_3_0=ruleanyConstruct();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getUnknownBracketsRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"t",
            	              		lv_t_3_0, 
            	              		"anyConstruct");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop104;
                }
            } while (true);

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3078:4: ( ruleWS )*
            loop105:
            do {
                int alt105=2;
                int LA105_0 = input.LA(1);

                if ( ((LA105_0>=RULE_LINESP && LA105_0<=RULE_ML2_COMMENT)) ) {
                    alt105=1;
                }


                switch (alt105) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3079:5: ruleWS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getUnknownBracketsAccess().getWSParserRuleCall_3()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleWS_in_ruleunknownBrackets6929);
            	    ruleWS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop105;
                }
            } while (true);

            this_RCBRACKET_5=(Token)match(input,RULE_RCBRACKET,FOLLOW_RULE_RCBRACKET_in_ruleunknownBrackets6941); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RCBRACKET_5, grammarAccess.getUnknownBracketsAccess().getRCBRACKETTerminalRuleCall_4()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleunknownBrackets"


    // $ANTLR start "entryRuleanyConstruct"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3098:1: entryRuleanyConstruct returns [EObject current=null] : iv_ruleanyConstruct= ruleanyConstruct EOF ;
    public final EObject entryRuleanyConstruct() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleanyConstruct = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3099:2: (iv_ruleanyConstruct= ruleanyConstruct EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3100:2: iv_ruleanyConstruct= ruleanyConstruct EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnyConstructRule()); 
            }
            pushFollow(FOLLOW_ruleanyConstruct_in_entryRuleanyConstruct6976);
            iv_ruleanyConstruct=ruleanyConstruct();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleanyConstruct; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleanyConstruct6986); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleanyConstruct"


    // $ANTLR start "ruleanyConstruct"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3107:1: ruleanyConstruct returns [EObject current=null] : ( ( ( (lv_t_0_0= ruleunknownBody ) ) | ( ( (lv_directive_1_0= ruleanyDirective ) ) ( ( ruleWS )+ ( (lv_t_3_0= ruleunknownBody ) ) )? ) ) ( ruleWS )* this_DOT_5= RULE_DOT ) ;
    public final EObject ruleanyConstruct() throws RecognitionException {
        EObject current = null;

        Token this_DOT_5=null;
        EObject lv_t_0_0 = null;

        AntlrDatatypeRuleToken lv_directive_1_0 = null;

        EObject lv_t_3_0 = null;


         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3110:28: ( ( ( ( (lv_t_0_0= ruleunknownBody ) ) | ( ( (lv_directive_1_0= ruleanyDirective ) ) ( ( ruleWS )+ ( (lv_t_3_0= ruleunknownBody ) ) )? ) ) ( ruleWS )* this_DOT_5= RULE_DOT ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3111:1: ( ( ( (lv_t_0_0= ruleunknownBody ) ) | ( ( (lv_directive_1_0= ruleanyDirective ) ) ( ( ruleWS )+ ( (lv_t_3_0= ruleunknownBody ) ) )? ) ) ( ruleWS )* this_DOT_5= RULE_DOT )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3111:1: ( ( ( (lv_t_0_0= ruleunknownBody ) ) | ( ( (lv_directive_1_0= ruleanyDirective ) ) ( ( ruleWS )+ ( (lv_t_3_0= ruleunknownBody ) ) )? ) ) ( ruleWS )* this_DOT_5= RULE_DOT )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3111:2: ( ( (lv_t_0_0= ruleunknownBody ) ) | ( ( (lv_directive_1_0= ruleanyDirective ) ) ( ( ruleWS )+ ( (lv_t_3_0= ruleunknownBody ) ) )? ) ) ( ruleWS )* this_DOT_5= RULE_DOT
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3111:2: ( ( (lv_t_0_0= ruleunknownBody ) ) | ( ( (lv_directive_1_0= ruleanyDirective ) ) ( ( ruleWS )+ ( (lv_t_3_0= ruleunknownBody ) ) )? ) )
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==RULE_LCBRACKET||LA108_0==RULE_LSBRACKET||LA108_0==RULE_LBRACKET||(LA108_0>=RULE_TYPE && LA108_0<=RULE_CID)) ) {
                alt108=1;
            }
            else if ( ((LA108_0>=RULE_INFIXNONE && LA108_0<=RULE_UNKNOWNDIRECTIVE)||(LA108_0>=32 && LA108_0<=45)) ) {
                alt108=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 108, 0, input);

                throw nvae;
            }
            switch (alt108) {
                case 1 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3111:3: ( (lv_t_0_0= ruleunknownBody ) )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3111:3: ( (lv_t_0_0= ruleunknownBody ) )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3112:1: (lv_t_0_0= ruleunknownBody )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3112:1: (lv_t_0_0= ruleunknownBody )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3113:3: lv_t_0_0= ruleunknownBody
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAnyConstructAccess().getTUnknownBodyParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleunknownBody_in_ruleanyConstruct7033);
                    lv_t_0_0=ruleunknownBody();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAnyConstructRule());
                      	        }
                             		set(
                             			current, 
                             			"t",
                              		lv_t_0_0, 
                              		"unknownBody");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3130:6: ( ( (lv_directive_1_0= ruleanyDirective ) ) ( ( ruleWS )+ ( (lv_t_3_0= ruleunknownBody ) ) )? )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3130:6: ( ( (lv_directive_1_0= ruleanyDirective ) ) ( ( ruleWS )+ ( (lv_t_3_0= ruleunknownBody ) ) )? )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3130:7: ( (lv_directive_1_0= ruleanyDirective ) ) ( ( ruleWS )+ ( (lv_t_3_0= ruleunknownBody ) ) )?
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3130:7: ( (lv_directive_1_0= ruleanyDirective ) )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3131:1: (lv_directive_1_0= ruleanyDirective )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3131:1: (lv_directive_1_0= ruleanyDirective )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3132:3: lv_directive_1_0= ruleanyDirective
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAnyConstructAccess().getDirectiveAnyDirectiveParserRuleCall_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleanyDirective_in_ruleanyConstruct7061);
                    lv_directive_1_0=ruleanyDirective();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAnyConstructRule());
                      	        }
                             		set(
                             			current, 
                             			"directive",
                              		lv_directive_1_0, 
                              		"anyDirective");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3148:2: ( ( ruleWS )+ ( (lv_t_3_0= ruleunknownBody ) ) )?
                    int alt107=2;
                    alt107 = dfa107.predict(input);
                    switch (alt107) {
                        case 1 :
                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3148:3: ( ruleWS )+ ( (lv_t_3_0= ruleunknownBody ) )
                            {
                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3148:3: ( ruleWS )+
                            int cnt106=0;
                            loop106:
                            do {
                                int alt106=2;
                                int LA106_0 = input.LA(1);

                                if ( ((LA106_0>=RULE_LINESP && LA106_0<=RULE_ML2_COMMENT)) ) {
                                    alt106=1;
                                }


                                switch (alt106) {
                            	case 1 :
                            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3149:5: ruleWS
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	              newCompositeNode(grammarAccess.getAnyConstructAccess().getWSParserRuleCall_0_1_1_0()); 
                            	          
                            	    }
                            	    pushFollow(FOLLOW_ruleWS_in_ruleanyConstruct7079);
                            	    ruleWS();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {
                            	       
                            	              afterParserOrEnumRuleCall();
                            	          
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt106 >= 1 ) break loop106;
                            	    if (state.backtracking>0) {state.failed=true; return current;}
                                        EarlyExitException eee =
                                            new EarlyExitException(106, input);
                                        throw eee;
                                }
                                cnt106++;
                            } while (true);

                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3156:3: ( (lv_t_3_0= ruleunknownBody ) )
                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3157:1: (lv_t_3_0= ruleunknownBody )
                            {
                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3157:1: (lv_t_3_0= ruleunknownBody )
                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3158:3: lv_t_3_0= ruleunknownBody
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getAnyConstructAccess().getTUnknownBodyParserRuleCall_0_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleunknownBody_in_ruleanyConstruct7101);
                            lv_t_3_0=ruleunknownBody();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getAnyConstructRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"t",
                                      		lv_t_3_0, 
                                      		"unknownBody");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3174:6: ( ruleWS )*
            loop109:
            do {
                int alt109=2;
                int LA109_0 = input.LA(1);

                if ( ((LA109_0>=RULE_LINESP && LA109_0<=RULE_ML2_COMMENT)) ) {
                    alt109=1;
                }


                switch (alt109) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3175:5: ruleWS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getAnyConstructAccess().getWSParserRuleCall_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleWS_in_ruleanyConstruct7122);
            	    ruleWS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop109;
                }
            } while (true);

            this_DOT_5=(Token)match(input,RULE_DOT,FOLLOW_RULE_DOT_in_ruleanyConstruct7134); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_DOT_5, grammarAccess.getAnyConstructAccess().getDOTTerminalRuleCall_2()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleanyConstruct"


    // $ANTLR start "entryRuleunknownBody"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3194:1: entryRuleunknownBody returns [EObject current=null] : iv_ruleunknownBody= ruleunknownBody EOF ;
    public final EObject entryRuleunknownBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunknownBody = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3195:2: (iv_ruleunknownBody= ruleunknownBody EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3196:2: iv_ruleunknownBody= ruleunknownBody EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnknownBodyRule()); 
            }
            pushFollow(FOLLOW_ruleunknownBody_in_entryRuleunknownBody7169);
            iv_ruleunknownBody=ruleunknownBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleunknownBody; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleunknownBody7179); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleunknownBody"


    // $ANTLR start "ruleunknownBody"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3203:1: ruleunknownBody returns [EObject current=null] : ( ( (lv_t_0_0= ruleterm ) ) ( ( ruleWS )* ( ( ruleWS this_EQUALS_3= RULE_EQUALS ( ( (lv_t_4_0= ruleunknownBrackets ) ) | ( ( ruleWS )+ ( ( ( ( ruleterm ) )=> (lv_t_6_0= ruleterm ) ) | ( (lv_t_7_0= ruleunknownBrackets ) ) ) ) ) ) | (this_ASSIGN_8= RULE_ASSIGN ( ( (lv_t_9_0= ruleunknownBrackets ) ) | ( ( ruleWS )+ ( ( ( ( ruleterm ) )=> (lv_t_11_0= ruleterm ) ) | ( (lv_t_12_0= ruleunknownBrackets ) ) ) ) ) ) | (this_COLON_13= RULE_COLON ( ruleWS )* ( ( ( ( ruleterm ) )=> (lv_t_15_0= ruleterm ) ) | ( (lv_t_16_0= ruleunknownBrackets ) ) ) ) | ruleanyDirective ) )* ) ;
    public final EObject ruleunknownBody() throws RecognitionException {
        EObject current = null;

        Token this_EQUALS_3=null;
        Token this_ASSIGN_8=null;
        Token this_COLON_13=null;
        EObject lv_t_0_0 = null;

        EObject lv_t_4_0 = null;

        EObject lv_t_6_0 = null;

        EObject lv_t_7_0 = null;

        EObject lv_t_9_0 = null;

        EObject lv_t_11_0 = null;

        EObject lv_t_12_0 = null;

        EObject lv_t_15_0 = null;

        EObject lv_t_16_0 = null;


         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3206:28: ( ( ( (lv_t_0_0= ruleterm ) ) ( ( ruleWS )* ( ( ruleWS this_EQUALS_3= RULE_EQUALS ( ( (lv_t_4_0= ruleunknownBrackets ) ) | ( ( ruleWS )+ ( ( ( ( ruleterm ) )=> (lv_t_6_0= ruleterm ) ) | ( (lv_t_7_0= ruleunknownBrackets ) ) ) ) ) ) | (this_ASSIGN_8= RULE_ASSIGN ( ( (lv_t_9_0= ruleunknownBrackets ) ) | ( ( ruleWS )+ ( ( ( ( ruleterm ) )=> (lv_t_11_0= ruleterm ) ) | ( (lv_t_12_0= ruleunknownBrackets ) ) ) ) ) ) | (this_COLON_13= RULE_COLON ( ruleWS )* ( ( ( ( ruleterm ) )=> (lv_t_15_0= ruleterm ) ) | ( (lv_t_16_0= ruleunknownBrackets ) ) ) ) | ruleanyDirective ) )* ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3207:1: ( ( (lv_t_0_0= ruleterm ) ) ( ( ruleWS )* ( ( ruleWS this_EQUALS_3= RULE_EQUALS ( ( (lv_t_4_0= ruleunknownBrackets ) ) | ( ( ruleWS )+ ( ( ( ( ruleterm ) )=> (lv_t_6_0= ruleterm ) ) | ( (lv_t_7_0= ruleunknownBrackets ) ) ) ) ) ) | (this_ASSIGN_8= RULE_ASSIGN ( ( (lv_t_9_0= ruleunknownBrackets ) ) | ( ( ruleWS )+ ( ( ( ( ruleterm ) )=> (lv_t_11_0= ruleterm ) ) | ( (lv_t_12_0= ruleunknownBrackets ) ) ) ) ) ) | (this_COLON_13= RULE_COLON ( ruleWS )* ( ( ( ( ruleterm ) )=> (lv_t_15_0= ruleterm ) ) | ( (lv_t_16_0= ruleunknownBrackets ) ) ) ) | ruleanyDirective ) )* )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3207:1: ( ( (lv_t_0_0= ruleterm ) ) ( ( ruleWS )* ( ( ruleWS this_EQUALS_3= RULE_EQUALS ( ( (lv_t_4_0= ruleunknownBrackets ) ) | ( ( ruleWS )+ ( ( ( ( ruleterm ) )=> (lv_t_6_0= ruleterm ) ) | ( (lv_t_7_0= ruleunknownBrackets ) ) ) ) ) ) | (this_ASSIGN_8= RULE_ASSIGN ( ( (lv_t_9_0= ruleunknownBrackets ) ) | ( ( ruleWS )+ ( ( ( ( ruleterm ) )=> (lv_t_11_0= ruleterm ) ) | ( (lv_t_12_0= ruleunknownBrackets ) ) ) ) ) ) | (this_COLON_13= RULE_COLON ( ruleWS )* ( ( ( ( ruleterm ) )=> (lv_t_15_0= ruleterm ) ) | ( (lv_t_16_0= ruleunknownBrackets ) ) ) ) | ruleanyDirective ) )* )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3207:2: ( (lv_t_0_0= ruleterm ) ) ( ( ruleWS )* ( ( ruleWS this_EQUALS_3= RULE_EQUALS ( ( (lv_t_4_0= ruleunknownBrackets ) ) | ( ( ruleWS )+ ( ( ( ( ruleterm ) )=> (lv_t_6_0= ruleterm ) ) | ( (lv_t_7_0= ruleunknownBrackets ) ) ) ) ) ) | (this_ASSIGN_8= RULE_ASSIGN ( ( (lv_t_9_0= ruleunknownBrackets ) ) | ( ( ruleWS )+ ( ( ( ( ruleterm ) )=> (lv_t_11_0= ruleterm ) ) | ( (lv_t_12_0= ruleunknownBrackets ) ) ) ) ) ) | (this_COLON_13= RULE_COLON ( ruleWS )* ( ( ( ( ruleterm ) )=> (lv_t_15_0= ruleterm ) ) | ( (lv_t_16_0= ruleunknownBrackets ) ) ) ) | ruleanyDirective ) )*
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3207:2: ( (lv_t_0_0= ruleterm ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3208:1: (lv_t_0_0= ruleterm )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3208:1: (lv_t_0_0= ruleterm )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3209:3: lv_t_0_0= ruleterm
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUnknownBodyAccess().getTTermParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleterm_in_ruleunknownBody7225);
            lv_t_0_0=ruleterm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getUnknownBodyRule());
              	        }
                     		add(
                     			current, 
                     			"t",
                      		lv_t_0_0, 
                      		"term");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3225:2: ( ( ruleWS )* ( ( ruleWS this_EQUALS_3= RULE_EQUALS ( ( (lv_t_4_0= ruleunknownBrackets ) ) | ( ( ruleWS )+ ( ( ( ( ruleterm ) )=> (lv_t_6_0= ruleterm ) ) | ( (lv_t_7_0= ruleunknownBrackets ) ) ) ) ) ) | (this_ASSIGN_8= RULE_ASSIGN ( ( (lv_t_9_0= ruleunknownBrackets ) ) | ( ( ruleWS )+ ( ( ( ( ruleterm ) )=> (lv_t_11_0= ruleterm ) ) | ( (lv_t_12_0= ruleunknownBrackets ) ) ) ) ) ) | (this_COLON_13= RULE_COLON ( ruleWS )* ( ( ( ( ruleterm ) )=> (lv_t_15_0= ruleterm ) ) | ( (lv_t_16_0= ruleunknownBrackets ) ) ) ) | ruleanyDirective ) )*
            loop120:
            do {
                int alt120=2;
                alt120 = dfa120.predict(input);
                switch (alt120) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3225:3: ( ruleWS )* ( ( ruleWS this_EQUALS_3= RULE_EQUALS ( ( (lv_t_4_0= ruleunknownBrackets ) ) | ( ( ruleWS )+ ( ( ( ( ruleterm ) )=> (lv_t_6_0= ruleterm ) ) | ( (lv_t_7_0= ruleunknownBrackets ) ) ) ) ) ) | (this_ASSIGN_8= RULE_ASSIGN ( ( (lv_t_9_0= ruleunknownBrackets ) ) | ( ( ruleWS )+ ( ( ( ( ruleterm ) )=> (lv_t_11_0= ruleterm ) ) | ( (lv_t_12_0= ruleunknownBrackets ) ) ) ) ) ) | (this_COLON_13= RULE_COLON ( ruleWS )* ( ( ( ( ruleterm ) )=> (lv_t_15_0= ruleterm ) ) | ( (lv_t_16_0= ruleunknownBrackets ) ) ) ) | ruleanyDirective )
            	    {
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3225:3: ( ruleWS )*
            	    loop110:
            	    do {
            	        int alt110=2;
            	        switch ( input.LA(1) ) {
            	        case RULE_LINESP:
            	            {
            	            int LA110_1 = input.LA(2);

            	            if ( (LA110_1==RULE_COLON||LA110_1==RULE_ASSIGN||(LA110_1>=RULE_LINESP && LA110_1<=RULE_UNKNOWNDIRECTIVE)||(LA110_1>=32 && LA110_1<=45)) ) {
            	                alt110=1;
            	            }


            	            }
            	            break;
            	        case RULE_LINEDELIM:
            	            {
            	            int LA110_2 = input.LA(2);

            	            if ( (LA110_2==RULE_COLON||LA110_2==RULE_ASSIGN||(LA110_2>=RULE_LINESP && LA110_2<=RULE_UNKNOWNDIRECTIVE)||(LA110_2>=32 && LA110_2<=45)) ) {
            	                alt110=1;
            	            }


            	            }
            	            break;
            	        case RULE_ML_COMMENT:
            	            {
            	            int LA110_3 = input.LA(2);

            	            if ( (LA110_3==RULE_COLON||LA110_3==RULE_ASSIGN||(LA110_3>=RULE_LINESP && LA110_3<=RULE_UNKNOWNDIRECTIVE)||(LA110_3>=32 && LA110_3<=45)) ) {
            	                alt110=1;
            	            }


            	            }
            	            break;
            	        case RULE_ML2_COMMENT:
            	            {
            	            int LA110_4 = input.LA(2);

            	            if ( (LA110_4==RULE_COLON||LA110_4==RULE_ASSIGN||(LA110_4>=RULE_LINESP && LA110_4<=RULE_UNKNOWNDIRECTIVE)||(LA110_4>=32 && LA110_4<=45)) ) {
            	                alt110=1;
            	            }


            	            }
            	            break;

            	        }

            	        switch (alt110) {
            	    	case 1 :
            	    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3226:5: ruleWS
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	              newCompositeNode(grammarAccess.getUnknownBodyAccess().getWSParserRuleCall_1_0()); 
            	    	          
            	    	    }
            	    	    pushFollow(FOLLOW_ruleWS_in_ruleunknownBody7243);
            	    	    ruleWS();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	              afterParserOrEnumRuleCall();
            	    	          
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop110;
            	        }
            	    } while (true);

            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3233:3: ( ( ruleWS this_EQUALS_3= RULE_EQUALS ( ( (lv_t_4_0= ruleunknownBrackets ) ) | ( ( ruleWS )+ ( ( ( ( ruleterm ) )=> (lv_t_6_0= ruleterm ) ) | ( (lv_t_7_0= ruleunknownBrackets ) ) ) ) ) ) | (this_ASSIGN_8= RULE_ASSIGN ( ( (lv_t_9_0= ruleunknownBrackets ) ) | ( ( ruleWS )+ ( ( ( ( ruleterm ) )=> (lv_t_11_0= ruleterm ) ) | ( (lv_t_12_0= ruleunknownBrackets ) ) ) ) ) ) | (this_COLON_13= RULE_COLON ( ruleWS )* ( ( ( ( ruleterm ) )=> (lv_t_15_0= ruleterm ) ) | ( (lv_t_16_0= ruleunknownBrackets ) ) ) ) | ruleanyDirective )
            	    int alt119=4;
            	    switch ( input.LA(1) ) {
            	    case RULE_LINESP:
            	    case RULE_LINEDELIM:
            	    case RULE_ML_COMMENT:
            	    case RULE_ML2_COMMENT:
            	        {
            	        alt119=1;
            	        }
            	        break;
            	    case RULE_ASSIGN:
            	        {
            	        alt119=2;
            	        }
            	        break;
            	    case RULE_COLON:
            	        {
            	        alt119=3;
            	        }
            	        break;
            	    case RULE_INFIXNONE:
            	    case RULE_INFIXLEFT:
            	    case RULE_INFIXRIGHT:
            	    case RULE_UNKNOWNDIRECTIVE:
            	    case 32:
            	    case 33:
            	    case 34:
            	    case 35:
            	    case 36:
            	    case 37:
            	    case 38:
            	    case 39:
            	    case 40:
            	    case 41:
            	    case 42:
            	    case 43:
            	    case 44:
            	    case 45:
            	        {
            	        alt119=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 119, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt119) {
            	        case 1 :
            	            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3233:4: ( ruleWS this_EQUALS_3= RULE_EQUALS ( ( (lv_t_4_0= ruleunknownBrackets ) ) | ( ( ruleWS )+ ( ( ( ( ruleterm ) )=> (lv_t_6_0= ruleterm ) ) | ( (lv_t_7_0= ruleunknownBrackets ) ) ) ) ) )
            	            {
            	            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3233:4: ( ruleWS this_EQUALS_3= RULE_EQUALS ( ( (lv_t_4_0= ruleunknownBrackets ) ) | ( ( ruleWS )+ ( ( ( ( ruleterm ) )=> (lv_t_6_0= ruleterm ) ) | ( (lv_t_7_0= ruleunknownBrackets ) ) ) ) ) )
            	            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3234:5: ruleWS this_EQUALS_3= RULE_EQUALS ( ( (lv_t_4_0= ruleunknownBrackets ) ) | ( ( ruleWS )+ ( ( ( ( ruleterm ) )=> (lv_t_6_0= ruleterm ) ) | ( (lv_t_7_0= ruleunknownBrackets ) ) ) ) )
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	                      newCompositeNode(grammarAccess.getUnknownBodyAccess().getWSParserRuleCall_1_1_0_0()); 
            	                  
            	            }
            	            pushFollow(FOLLOW_ruleWS_in_ruleunknownBody7262);
            	            ruleWS();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {
            	               
            	                      afterParserOrEnumRuleCall();
            	                  
            	            }
            	            this_EQUALS_3=(Token)match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_ruleunknownBody7272); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_EQUALS_3, grammarAccess.getUnknownBodyAccess().getEQUALSTerminalRuleCall_1_1_0_1()); 
            	                  
            	            }
            	            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3245:1: ( ( (lv_t_4_0= ruleunknownBrackets ) ) | ( ( ruleWS )+ ( ( ( ( ruleterm ) )=> (lv_t_6_0= ruleterm ) ) | ( (lv_t_7_0= ruleunknownBrackets ) ) ) ) )
            	            int alt113=2;
            	            int LA113_0 = input.LA(1);

            	            if ( (LA113_0==RULE_LCBRACKET) ) {
            	                alt113=1;
            	            }
            	            else if ( ((LA113_0>=RULE_LINESP && LA113_0<=RULE_ML2_COMMENT)) ) {
            	                alt113=2;
            	            }
            	            else {
            	                if (state.backtracking>0) {state.failed=true; return current;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 113, 0, input);

            	                throw nvae;
            	            }
            	            switch (alt113) {
            	                case 1 :
            	                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3245:2: ( (lv_t_4_0= ruleunknownBrackets ) )
            	                    {
            	                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3245:2: ( (lv_t_4_0= ruleunknownBrackets ) )
            	                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3246:1: (lv_t_4_0= ruleunknownBrackets )
            	                    {
            	                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3246:1: (lv_t_4_0= ruleunknownBrackets )
            	                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3247:3: lv_t_4_0= ruleunknownBrackets
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getUnknownBodyAccess().getTUnknownBracketsParserRuleCall_1_1_0_2_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleunknownBrackets_in_ruleunknownBody7293);
            	                    lv_t_4_0=ruleunknownBrackets();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      	        if (current==null) {
            	                      	            current = createModelElementForParent(grammarAccess.getUnknownBodyRule());
            	                      	        }
            	                             		add(
            	                             			current, 
            	                             			"t",
            	                              		lv_t_4_0, 
            	                              		"unknownBrackets");
            	                      	        afterParserOrEnumRuleCall();
            	                      	    
            	                    }

            	                    }


            	                    }


            	                    }
            	                    break;
            	                case 2 :
            	                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3264:6: ( ( ruleWS )+ ( ( ( ( ruleterm ) )=> (lv_t_6_0= ruleterm ) ) | ( (lv_t_7_0= ruleunknownBrackets ) ) ) )
            	                    {
            	                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3264:6: ( ( ruleWS )+ ( ( ( ( ruleterm ) )=> (lv_t_6_0= ruleterm ) ) | ( (lv_t_7_0= ruleunknownBrackets ) ) ) )
            	                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3264:7: ( ruleWS )+ ( ( ( ( ruleterm ) )=> (lv_t_6_0= ruleterm ) ) | ( (lv_t_7_0= ruleunknownBrackets ) ) )
            	                    {
            	                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3264:7: ( ruleWS )+
            	                    int cnt111=0;
            	                    loop111:
            	                    do {
            	                        int alt111=2;
            	                        int LA111_0 = input.LA(1);

            	                        if ( ((LA111_0>=RULE_LINESP && LA111_0<=RULE_ML2_COMMENT)) ) {
            	                            alt111=1;
            	                        }


            	                        switch (alt111) {
            	                    	case 1 :
            	                    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3265:5: ruleWS
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	              newCompositeNode(grammarAccess.getUnknownBodyAccess().getWSParserRuleCall_1_1_0_2_1_0()); 
            	                    	          
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleWS_in_ruleunknownBody7317);
            	                    	    ruleWS();

            	                    	    state._fsp--;
            	                    	    if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	              afterParserOrEnumRuleCall();
            	                    	          
            	                    	    }

            	                    	    }
            	                    	    break;

            	                    	default :
            	                    	    if ( cnt111 >= 1 ) break loop111;
            	                    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                                EarlyExitException eee =
            	                                    new EarlyExitException(111, input);
            	                                throw eee;
            	                        }
            	                        cnt111++;
            	                    } while (true);

            	                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3272:3: ( ( ( ( ruleterm ) )=> (lv_t_6_0= ruleterm ) ) | ( (lv_t_7_0= ruleunknownBrackets ) ) )
            	                    int alt112=2;
            	                    int LA112_0 = input.LA(1);

            	                    if ( (LA112_0==RULE_LCBRACKET) ) {
            	                        int LA112_1 = input.LA(2);

            	                        if ( (synpred2_InternalLF()) ) {
            	                            alt112=1;
            	                        }
            	                        else if ( (true) ) {
            	                            alt112=2;
            	                        }
            	                        else {
            	                            if (state.backtracking>0) {state.failed=true; return current;}
            	                            NoViableAltException nvae =
            	                                new NoViableAltException("", 112, 1, input);

            	                            throw nvae;
            	                        }
            	                    }
            	                    else if ( (LA112_0==RULE_LSBRACKET) && (synpred2_InternalLF())) {
            	                        alt112=1;
            	                    }
            	                    else if ( (LA112_0==RULE_TYPE) && (synpred2_InternalLF())) {
            	                        alt112=1;
            	                    }
            	                    else if ( (LA112_0==RULE_UNDERSCORE) && (synpred2_InternalLF())) {
            	                        alt112=1;
            	                    }
            	                    else if ( (LA112_0==RULE_CID) && (synpred2_InternalLF())) {
            	                        alt112=1;
            	                    }
            	                    else if ( (LA112_0==RULE_LBRACKET) && (synpred2_InternalLF())) {
            	                        alt112=1;
            	                    }
            	                    else {
            	                        if (state.backtracking>0) {state.failed=true; return current;}
            	                        NoViableAltException nvae =
            	                            new NoViableAltException("", 112, 0, input);

            	                        throw nvae;
            	                    }
            	                    switch (alt112) {
            	                        case 1 :
            	                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3272:4: ( ( ( ruleterm ) )=> (lv_t_6_0= ruleterm ) )
            	                            {
            	                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3272:4: ( ( ( ruleterm ) )=> (lv_t_6_0= ruleterm ) )
            	                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3272:5: ( ( ruleterm ) )=> (lv_t_6_0= ruleterm )
            	                            {
            	                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3277:1: (lv_t_6_0= ruleterm )
            	                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3278:3: lv_t_6_0= ruleterm
            	                            {
            	                            if ( state.backtracking==0 ) {
            	                               
            	                              	        newCompositeNode(grammarAccess.getUnknownBodyAccess().getTTermParserRuleCall_1_1_0_2_1_1_0_0()); 
            	                              	    
            	                            }
            	                            pushFollow(FOLLOW_ruleterm_in_ruleunknownBody7350);
            	                            lv_t_6_0=ruleterm();

            	                            state._fsp--;
            	                            if (state.failed) return current;
            	                            if ( state.backtracking==0 ) {

            	                              	        if (current==null) {
            	                              	            current = createModelElementForParent(grammarAccess.getUnknownBodyRule());
            	                              	        }
            	                                     		add(
            	                                     			current, 
            	                                     			"t",
            	                                      		lv_t_6_0, 
            	                                      		"term");
            	                              	        afterParserOrEnumRuleCall();
            	                              	    
            	                            }

            	                            }


            	                            }


            	                            }
            	                            break;
            	                        case 2 :
            	                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3295:6: ( (lv_t_7_0= ruleunknownBrackets ) )
            	                            {
            	                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3295:6: ( (lv_t_7_0= ruleunknownBrackets ) )
            	                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3296:1: (lv_t_7_0= ruleunknownBrackets )
            	                            {
            	                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3296:1: (lv_t_7_0= ruleunknownBrackets )
            	                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3297:3: lv_t_7_0= ruleunknownBrackets
            	                            {
            	                            if ( state.backtracking==0 ) {
            	                               
            	                              	        newCompositeNode(grammarAccess.getUnknownBodyAccess().getTUnknownBracketsParserRuleCall_1_1_0_2_1_1_1_0()); 
            	                              	    
            	                            }
            	                            pushFollow(FOLLOW_ruleunknownBrackets_in_ruleunknownBody7377);
            	                            lv_t_7_0=ruleunknownBrackets();

            	                            state._fsp--;
            	                            if (state.failed) return current;
            	                            if ( state.backtracking==0 ) {

            	                              	        if (current==null) {
            	                              	            current = createModelElementForParent(grammarAccess.getUnknownBodyRule());
            	                              	        }
            	                                     		add(
            	                                     			current, 
            	                                     			"t",
            	                                      		lv_t_7_0, 
            	                                      		"unknownBrackets");
            	                              	        afterParserOrEnumRuleCall();
            	                              	    
            	                            }

            	                            }


            	                            }


            	                            }
            	                            break;

            	                    }


            	                    }


            	                    }
            	                    break;

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3314:6: (this_ASSIGN_8= RULE_ASSIGN ( ( (lv_t_9_0= ruleunknownBrackets ) ) | ( ( ruleWS )+ ( ( ( ( ruleterm ) )=> (lv_t_11_0= ruleterm ) ) | ( (lv_t_12_0= ruleunknownBrackets ) ) ) ) ) )
            	            {
            	            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3314:6: (this_ASSIGN_8= RULE_ASSIGN ( ( (lv_t_9_0= ruleunknownBrackets ) ) | ( ( ruleWS )+ ( ( ( ( ruleterm ) )=> (lv_t_11_0= ruleterm ) ) | ( (lv_t_12_0= ruleunknownBrackets ) ) ) ) ) )
            	            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3314:7: this_ASSIGN_8= RULE_ASSIGN ( ( (lv_t_9_0= ruleunknownBrackets ) ) | ( ( ruleWS )+ ( ( ( ( ruleterm ) )=> (lv_t_11_0= ruleterm ) ) | ( (lv_t_12_0= ruleunknownBrackets ) ) ) ) )
            	            {
            	            this_ASSIGN_8=(Token)match(input,RULE_ASSIGN,FOLLOW_RULE_ASSIGN_in_ruleunknownBody7399); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_ASSIGN_8, grammarAccess.getUnknownBodyAccess().getASSIGNTerminalRuleCall_1_1_1_0()); 
            	                  
            	            }
            	            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3318:1: ( ( (lv_t_9_0= ruleunknownBrackets ) ) | ( ( ruleWS )+ ( ( ( ( ruleterm ) )=> (lv_t_11_0= ruleterm ) ) | ( (lv_t_12_0= ruleunknownBrackets ) ) ) ) )
            	            int alt116=2;
            	            int LA116_0 = input.LA(1);

            	            if ( (LA116_0==RULE_LCBRACKET) ) {
            	                alt116=1;
            	            }
            	            else if ( ((LA116_0>=RULE_LINESP && LA116_0<=RULE_ML2_COMMENT)) ) {
            	                alt116=2;
            	            }
            	            else {
            	                if (state.backtracking>0) {state.failed=true; return current;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 116, 0, input);

            	                throw nvae;
            	            }
            	            switch (alt116) {
            	                case 1 :
            	                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3318:2: ( (lv_t_9_0= ruleunknownBrackets ) )
            	                    {
            	                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3318:2: ( (lv_t_9_0= ruleunknownBrackets ) )
            	                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3319:1: (lv_t_9_0= ruleunknownBrackets )
            	                    {
            	                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3319:1: (lv_t_9_0= ruleunknownBrackets )
            	                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3320:3: lv_t_9_0= ruleunknownBrackets
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getUnknownBodyAccess().getTUnknownBracketsParserRuleCall_1_1_1_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleunknownBrackets_in_ruleunknownBody7420);
            	                    lv_t_9_0=ruleunknownBrackets();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      	        if (current==null) {
            	                      	            current = createModelElementForParent(grammarAccess.getUnknownBodyRule());
            	                      	        }
            	                             		add(
            	                             			current, 
            	                             			"t",
            	                              		lv_t_9_0, 
            	                              		"unknownBrackets");
            	                      	        afterParserOrEnumRuleCall();
            	                      	    
            	                    }

            	                    }


            	                    }


            	                    }
            	                    break;
            	                case 2 :
            	                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3337:6: ( ( ruleWS )+ ( ( ( ( ruleterm ) )=> (lv_t_11_0= ruleterm ) ) | ( (lv_t_12_0= ruleunknownBrackets ) ) ) )
            	                    {
            	                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3337:6: ( ( ruleWS )+ ( ( ( ( ruleterm ) )=> (lv_t_11_0= ruleterm ) ) | ( (lv_t_12_0= ruleunknownBrackets ) ) ) )
            	                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3337:7: ( ruleWS )+ ( ( ( ( ruleterm ) )=> (lv_t_11_0= ruleterm ) ) | ( (lv_t_12_0= ruleunknownBrackets ) ) )
            	                    {
            	                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3337:7: ( ruleWS )+
            	                    int cnt114=0;
            	                    loop114:
            	                    do {
            	                        int alt114=2;
            	                        int LA114_0 = input.LA(1);

            	                        if ( ((LA114_0>=RULE_LINESP && LA114_0<=RULE_ML2_COMMENT)) ) {
            	                            alt114=1;
            	                        }


            	                        switch (alt114) {
            	                    	case 1 :
            	                    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3338:5: ruleWS
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	              newCompositeNode(grammarAccess.getUnknownBodyAccess().getWSParserRuleCall_1_1_1_1_1_0()); 
            	                    	          
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleWS_in_ruleunknownBody7444);
            	                    	    ruleWS();

            	                    	    state._fsp--;
            	                    	    if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	              afterParserOrEnumRuleCall();
            	                    	          
            	                    	    }

            	                    	    }
            	                    	    break;

            	                    	default :
            	                    	    if ( cnt114 >= 1 ) break loop114;
            	                    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                                EarlyExitException eee =
            	                                    new EarlyExitException(114, input);
            	                                throw eee;
            	                        }
            	                        cnt114++;
            	                    } while (true);

            	                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3345:3: ( ( ( ( ruleterm ) )=> (lv_t_11_0= ruleterm ) ) | ( (lv_t_12_0= ruleunknownBrackets ) ) )
            	                    int alt115=2;
            	                    int LA115_0 = input.LA(1);

            	                    if ( (LA115_0==RULE_LCBRACKET) ) {
            	                        int LA115_1 = input.LA(2);

            	                        if ( (synpred3_InternalLF()) ) {
            	                            alt115=1;
            	                        }
            	                        else if ( (true) ) {
            	                            alt115=2;
            	                        }
            	                        else {
            	                            if (state.backtracking>0) {state.failed=true; return current;}
            	                            NoViableAltException nvae =
            	                                new NoViableAltException("", 115, 1, input);

            	                            throw nvae;
            	                        }
            	                    }
            	                    else if ( (LA115_0==RULE_LSBRACKET) && (synpred3_InternalLF())) {
            	                        alt115=1;
            	                    }
            	                    else if ( (LA115_0==RULE_TYPE) && (synpred3_InternalLF())) {
            	                        alt115=1;
            	                    }
            	                    else if ( (LA115_0==RULE_UNDERSCORE) && (synpred3_InternalLF())) {
            	                        alt115=1;
            	                    }
            	                    else if ( (LA115_0==RULE_CID) && (synpred3_InternalLF())) {
            	                        alt115=1;
            	                    }
            	                    else if ( (LA115_0==RULE_LBRACKET) && (synpred3_InternalLF())) {
            	                        alt115=1;
            	                    }
            	                    else {
            	                        if (state.backtracking>0) {state.failed=true; return current;}
            	                        NoViableAltException nvae =
            	                            new NoViableAltException("", 115, 0, input);

            	                        throw nvae;
            	                    }
            	                    switch (alt115) {
            	                        case 1 :
            	                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3345:4: ( ( ( ruleterm ) )=> (lv_t_11_0= ruleterm ) )
            	                            {
            	                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3345:4: ( ( ( ruleterm ) )=> (lv_t_11_0= ruleterm ) )
            	                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3345:5: ( ( ruleterm ) )=> (lv_t_11_0= ruleterm )
            	                            {
            	                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3350:1: (lv_t_11_0= ruleterm )
            	                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3351:3: lv_t_11_0= ruleterm
            	                            {
            	                            if ( state.backtracking==0 ) {
            	                               
            	                              	        newCompositeNode(grammarAccess.getUnknownBodyAccess().getTTermParserRuleCall_1_1_1_1_1_1_0_0()); 
            	                              	    
            	                            }
            	                            pushFollow(FOLLOW_ruleterm_in_ruleunknownBody7477);
            	                            lv_t_11_0=ruleterm();

            	                            state._fsp--;
            	                            if (state.failed) return current;
            	                            if ( state.backtracking==0 ) {

            	                              	        if (current==null) {
            	                              	            current = createModelElementForParent(grammarAccess.getUnknownBodyRule());
            	                              	        }
            	                                     		add(
            	                                     			current, 
            	                                     			"t",
            	                                      		lv_t_11_0, 
            	                                      		"term");
            	                              	        afterParserOrEnumRuleCall();
            	                              	    
            	                            }

            	                            }


            	                            }


            	                            }
            	                            break;
            	                        case 2 :
            	                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3368:6: ( (lv_t_12_0= ruleunknownBrackets ) )
            	                            {
            	                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3368:6: ( (lv_t_12_0= ruleunknownBrackets ) )
            	                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3369:1: (lv_t_12_0= ruleunknownBrackets )
            	                            {
            	                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3369:1: (lv_t_12_0= ruleunknownBrackets )
            	                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3370:3: lv_t_12_0= ruleunknownBrackets
            	                            {
            	                            if ( state.backtracking==0 ) {
            	                               
            	                              	        newCompositeNode(grammarAccess.getUnknownBodyAccess().getTUnknownBracketsParserRuleCall_1_1_1_1_1_1_1_0()); 
            	                              	    
            	                            }
            	                            pushFollow(FOLLOW_ruleunknownBrackets_in_ruleunknownBody7504);
            	                            lv_t_12_0=ruleunknownBrackets();

            	                            state._fsp--;
            	                            if (state.failed) return current;
            	                            if ( state.backtracking==0 ) {

            	                              	        if (current==null) {
            	                              	            current = createModelElementForParent(grammarAccess.getUnknownBodyRule());
            	                              	        }
            	                                     		add(
            	                                     			current, 
            	                                     			"t",
            	                                      		lv_t_12_0, 
            	                                      		"unknownBrackets");
            	                              	        afterParserOrEnumRuleCall();
            	                              	    
            	                            }

            	                            }


            	                            }


            	                            }
            	                            break;

            	                    }


            	                    }


            	                    }
            	                    break;

            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3387:6: (this_COLON_13= RULE_COLON ( ruleWS )* ( ( ( ( ruleterm ) )=> (lv_t_15_0= ruleterm ) ) | ( (lv_t_16_0= ruleunknownBrackets ) ) ) )
            	            {
            	            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3387:6: (this_COLON_13= RULE_COLON ( ruleWS )* ( ( ( ( ruleterm ) )=> (lv_t_15_0= ruleterm ) ) | ( (lv_t_16_0= ruleunknownBrackets ) ) ) )
            	            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3387:7: this_COLON_13= RULE_COLON ( ruleWS )* ( ( ( ( ruleterm ) )=> (lv_t_15_0= ruleterm ) ) | ( (lv_t_16_0= ruleunknownBrackets ) ) )
            	            {
            	            this_COLON_13=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleunknownBody7526); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_COLON_13, grammarAccess.getUnknownBodyAccess().getCOLONTerminalRuleCall_1_1_2_0()); 
            	                  
            	            }
            	            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3391:1: ( ruleWS )*
            	            loop117:
            	            do {
            	                int alt117=2;
            	                int LA117_0 = input.LA(1);

            	                if ( ((LA117_0>=RULE_LINESP && LA117_0<=RULE_ML2_COMMENT)) ) {
            	                    alt117=1;
            	                }


            	                switch (alt117) {
            	            	case 1 :
            	            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3392:5: ruleWS
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	              newCompositeNode(grammarAccess.getUnknownBodyAccess().getWSParserRuleCall_1_1_2_1()); 
            	            	          
            	            	    }
            	            	    pushFollow(FOLLOW_ruleWS_in_ruleunknownBody7542);
            	            	    ruleWS();

            	            	    state._fsp--;
            	            	    if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	              afterParserOrEnumRuleCall();
            	            	          
            	            	    }

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop117;
            	                }
            	            } while (true);

            	            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3399:3: ( ( ( ( ruleterm ) )=> (lv_t_15_0= ruleterm ) ) | ( (lv_t_16_0= ruleunknownBrackets ) ) )
            	            int alt118=2;
            	            int LA118_0 = input.LA(1);

            	            if ( (LA118_0==RULE_LCBRACKET) ) {
            	                int LA118_1 = input.LA(2);

            	                if ( (synpred4_InternalLF()) ) {
            	                    alt118=1;
            	                }
            	                else if ( (true) ) {
            	                    alt118=2;
            	                }
            	                else {
            	                    if (state.backtracking>0) {state.failed=true; return current;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("", 118, 1, input);

            	                    throw nvae;
            	                }
            	            }
            	            else if ( (LA118_0==RULE_LSBRACKET) && (synpred4_InternalLF())) {
            	                alt118=1;
            	            }
            	            else if ( (LA118_0==RULE_TYPE) && (synpred4_InternalLF())) {
            	                alt118=1;
            	            }
            	            else if ( (LA118_0==RULE_UNDERSCORE) && (synpred4_InternalLF())) {
            	                alt118=1;
            	            }
            	            else if ( (LA118_0==RULE_CID) && (synpred4_InternalLF())) {
            	                alt118=1;
            	            }
            	            else if ( (LA118_0==RULE_LBRACKET) && (synpred4_InternalLF())) {
            	                alt118=1;
            	            }
            	            else {
            	                if (state.backtracking>0) {state.failed=true; return current;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 118, 0, input);

            	                throw nvae;
            	            }
            	            switch (alt118) {
            	                case 1 :
            	                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3399:4: ( ( ( ruleterm ) )=> (lv_t_15_0= ruleterm ) )
            	                    {
            	                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3399:4: ( ( ( ruleterm ) )=> (lv_t_15_0= ruleterm ) )
            	                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3399:5: ( ( ruleterm ) )=> (lv_t_15_0= ruleterm )
            	                    {
            	                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3404:1: (lv_t_15_0= ruleterm )
            	                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3405:3: lv_t_15_0= ruleterm
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getUnknownBodyAccess().getTTermParserRuleCall_1_1_2_2_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleterm_in_ruleunknownBody7575);
            	                    lv_t_15_0=ruleterm();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      	        if (current==null) {
            	                      	            current = createModelElementForParent(grammarAccess.getUnknownBodyRule());
            	                      	        }
            	                             		add(
            	                             			current, 
            	                             			"t",
            	                              		lv_t_15_0, 
            	                              		"term");
            	                      	        afterParserOrEnumRuleCall();
            	                      	    
            	                    }

            	                    }


            	                    }


            	                    }
            	                    break;
            	                case 2 :
            	                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3422:6: ( (lv_t_16_0= ruleunknownBrackets ) )
            	                    {
            	                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3422:6: ( (lv_t_16_0= ruleunknownBrackets ) )
            	                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3423:1: (lv_t_16_0= ruleunknownBrackets )
            	                    {
            	                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3423:1: (lv_t_16_0= ruleunknownBrackets )
            	                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3424:3: lv_t_16_0= ruleunknownBrackets
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getUnknownBodyAccess().getTUnknownBracketsParserRuleCall_1_1_2_2_1_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleunknownBrackets_in_ruleunknownBody7602);
            	                    lv_t_16_0=ruleunknownBrackets();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      	        if (current==null) {
            	                      	            current = createModelElementForParent(grammarAccess.getUnknownBodyRule());
            	                      	        }
            	                             		add(
            	                             			current, 
            	                             			"t",
            	                              		lv_t_16_0, 
            	                              		"unknownBrackets");
            	                      	        afterParserOrEnumRuleCall();
            	                      	    
            	                    }

            	                    }


            	                    }


            	                    }
            	                    break;

            	            }


            	            }


            	            }
            	            break;
            	        case 4 :
            	            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3442:5: ruleanyDirective
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	                      newCompositeNode(grammarAccess.getUnknownBodyAccess().getAnyDirectiveParserRuleCall_1_1_3()); 
            	                  
            	            }
            	            pushFollow(FOLLOW_ruleanyDirective_in_ruleunknownBody7626);
            	            ruleanyDirective();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {
            	               
            	                      afterParserOrEnumRuleCall();
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop120;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleunknownBody"


    // $ANTLR start "entryRuleunknownConstruct"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3457:1: entryRuleunknownConstruct returns [EObject current=null] : iv_ruleunknownConstruct= ruleunknownConstruct EOF ;
    public final EObject entryRuleunknownConstruct() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunknownConstruct = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3458:2: (iv_ruleunknownConstruct= ruleunknownConstruct EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3459:2: iv_ruleunknownConstruct= ruleunknownConstruct EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnknownConstructRule()); 
            }
            pushFollow(FOLLOW_ruleunknownConstruct_in_entryRuleunknownConstruct7664);
            iv_ruleunknownConstruct=ruleunknownConstruct();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleunknownConstruct; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleunknownConstruct7674); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleunknownConstruct"


    // $ANTLR start "ruleunknownConstruct"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3466:1: ruleunknownConstruct returns [EObject current=null] : ( ( (lv_directive_0_0= RULE_UNKNOWNDIRECTIVE ) ) ( ( ruleWS )+ ( (lv_t_2_0= ruleunknownBody ) ) )? ( ruleWS )* this_DOT_4= RULE_DOT ) ;
    public final EObject ruleunknownConstruct() throws RecognitionException {
        EObject current = null;

        Token lv_directive_0_0=null;
        Token this_DOT_4=null;
        EObject lv_t_2_0 = null;


         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3469:28: ( ( ( (lv_directive_0_0= RULE_UNKNOWNDIRECTIVE ) ) ( ( ruleWS )+ ( (lv_t_2_0= ruleunknownBody ) ) )? ( ruleWS )* this_DOT_4= RULE_DOT ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3470:1: ( ( (lv_directive_0_0= RULE_UNKNOWNDIRECTIVE ) ) ( ( ruleWS )+ ( (lv_t_2_0= ruleunknownBody ) ) )? ( ruleWS )* this_DOT_4= RULE_DOT )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3470:1: ( ( (lv_directive_0_0= RULE_UNKNOWNDIRECTIVE ) ) ( ( ruleWS )+ ( (lv_t_2_0= ruleunknownBody ) ) )? ( ruleWS )* this_DOT_4= RULE_DOT )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3470:2: ( (lv_directive_0_0= RULE_UNKNOWNDIRECTIVE ) ) ( ( ruleWS )+ ( (lv_t_2_0= ruleunknownBody ) ) )? ( ruleWS )* this_DOT_4= RULE_DOT
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3470:2: ( (lv_directive_0_0= RULE_UNKNOWNDIRECTIVE ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3471:1: (lv_directive_0_0= RULE_UNKNOWNDIRECTIVE )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3471:1: (lv_directive_0_0= RULE_UNKNOWNDIRECTIVE )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3472:3: lv_directive_0_0= RULE_UNKNOWNDIRECTIVE
            {
            lv_directive_0_0=(Token)match(input,RULE_UNKNOWNDIRECTIVE,FOLLOW_RULE_UNKNOWNDIRECTIVE_in_ruleunknownConstruct7716); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_directive_0_0, grammarAccess.getUnknownConstructAccess().getDirectiveUNKNOWNDIRECTIVETerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getUnknownConstructRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"directive",
                      		lv_directive_0_0, 
                      		"UNKNOWNDIRECTIVE");
              	    
            }

            }


            }

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3488:2: ( ( ruleWS )+ ( (lv_t_2_0= ruleunknownBody ) ) )?
            int alt122=2;
            alt122 = dfa122.predict(input);
            switch (alt122) {
                case 1 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3488:3: ( ruleWS )+ ( (lv_t_2_0= ruleunknownBody ) )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3488:3: ( ruleWS )+
                    int cnt121=0;
                    loop121:
                    do {
                        int alt121=2;
                        int LA121_0 = input.LA(1);

                        if ( ((LA121_0>=RULE_LINESP && LA121_0<=RULE_ML2_COMMENT)) ) {
                            alt121=1;
                        }


                        switch (alt121) {
                    	case 1 :
                    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3489:5: ruleWS
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getUnknownConstructAccess().getWSParserRuleCall_1_0()); 
                    	          
                    	    }
                    	    pushFollow(FOLLOW_ruleWS_in_ruleunknownConstruct7739);
                    	    ruleWS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              afterParserOrEnumRuleCall();
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt121 >= 1 ) break loop121;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(121, input);
                                throw eee;
                        }
                        cnt121++;
                    } while (true);

                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3496:3: ( (lv_t_2_0= ruleunknownBody ) )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3497:1: (lv_t_2_0= ruleunknownBody )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3497:1: (lv_t_2_0= ruleunknownBody )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3498:3: lv_t_2_0= ruleunknownBody
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUnknownConstructAccess().getTUnknownBodyParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleunknownBody_in_ruleunknownConstruct7761);
                    lv_t_2_0=ruleunknownBody();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUnknownConstructRule());
                      	        }
                             		set(
                             			current, 
                             			"t",
                              		lv_t_2_0, 
                              		"unknownBody");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3514:4: ( ruleWS )*
            loop123:
            do {
                int alt123=2;
                int LA123_0 = input.LA(1);

                if ( ((LA123_0>=RULE_LINESP && LA123_0<=RULE_ML2_COMMENT)) ) {
                    alt123=1;
                }


                switch (alt123) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3515:5: ruleWS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getUnknownConstructAccess().getWSParserRuleCall_2()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleWS_in_ruleunknownConstruct7780);
            	    ruleWS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop123;
                }
            } while (true);

            this_DOT_4=(Token)match(input,RULE_DOT,FOLLOW_RULE_DOT_in_ruleunknownConstruct7792); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_DOT_4, grammarAccess.getUnknownConstructAccess().getDOTTerminalRuleCall_3()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleunknownConstruct"


    // $ANTLR start "entryRulenamespaceDeclaration"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3534:1: entryRulenamespaceDeclaration returns [EObject current=null] : iv_rulenamespaceDeclaration= rulenamespaceDeclaration EOF ;
    public final EObject entryRulenamespaceDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenamespaceDeclaration = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3535:2: (iv_rulenamespaceDeclaration= rulenamespaceDeclaration EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3536:2: iv_rulenamespaceDeclaration= rulenamespaceDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNamespaceDeclarationRule()); 
            }
            pushFollow(FOLLOW_rulenamespaceDeclaration_in_entryRulenamespaceDeclaration7827);
            iv_rulenamespaceDeclaration=rulenamespaceDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulenamespaceDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulenamespaceDeclaration7837); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulenamespaceDeclaration"


    // $ANTLR start "rulenamespaceDeclaration"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3543:1: rulenamespaceDeclaration returns [EObject current=null] : (otherlv_0= '%namespace' ( ruleWS )+ ( ( (lv_name_2_0= RULE_CID ) ) ( ruleWS )+ this_EQUALS_4= RULE_EQUALS ( ruleWS )* )? ( (lv_uri_6_0= RULE_URISTRING ) ) ( ruleWS )* this_DOT_8= RULE_DOT ) ;
    public final EObject rulenamespaceDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token this_EQUALS_4=null;
        Token lv_uri_6_0=null;
        Token this_DOT_8=null;

         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3546:28: ( (otherlv_0= '%namespace' ( ruleWS )+ ( ( (lv_name_2_0= RULE_CID ) ) ( ruleWS )+ this_EQUALS_4= RULE_EQUALS ( ruleWS )* )? ( (lv_uri_6_0= RULE_URISTRING ) ) ( ruleWS )* this_DOT_8= RULE_DOT ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3547:1: (otherlv_0= '%namespace' ( ruleWS )+ ( ( (lv_name_2_0= RULE_CID ) ) ( ruleWS )+ this_EQUALS_4= RULE_EQUALS ( ruleWS )* )? ( (lv_uri_6_0= RULE_URISTRING ) ) ( ruleWS )* this_DOT_8= RULE_DOT )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3547:1: (otherlv_0= '%namespace' ( ruleWS )+ ( ( (lv_name_2_0= RULE_CID ) ) ( ruleWS )+ this_EQUALS_4= RULE_EQUALS ( ruleWS )* )? ( (lv_uri_6_0= RULE_URISTRING ) ) ( ruleWS )* this_DOT_8= RULE_DOT )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3547:3: otherlv_0= '%namespace' ( ruleWS )+ ( ( (lv_name_2_0= RULE_CID ) ) ( ruleWS )+ this_EQUALS_4= RULE_EQUALS ( ruleWS )* )? ( (lv_uri_6_0= RULE_URISTRING ) ) ( ruleWS )* this_DOT_8= RULE_DOT
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_rulenamespaceDeclaration7874); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getNamespaceDeclarationAccess().getNamespaceKeyword_0());
                  
            }
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3551:1: ( ruleWS )+
            int cnt124=0;
            loop124:
            do {
                int alt124=2;
                int LA124_0 = input.LA(1);

                if ( ((LA124_0>=RULE_LINESP && LA124_0<=RULE_ML2_COMMENT)) ) {
                    alt124=1;
                }


                switch (alt124) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3552:5: ruleWS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getNamespaceDeclarationAccess().getWSParserRuleCall_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleWS_in_rulenamespaceDeclaration7891);
            	    ruleWS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt124 >= 1 ) break loop124;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(124, input);
                        throw eee;
                }
                cnt124++;
            } while (true);

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3559:3: ( ( (lv_name_2_0= RULE_CID ) ) ( ruleWS )+ this_EQUALS_4= RULE_EQUALS ( ruleWS )* )?
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==RULE_CID) ) {
                alt127=1;
            }
            switch (alt127) {
                case 1 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3559:4: ( (lv_name_2_0= RULE_CID ) ) ( ruleWS )+ this_EQUALS_4= RULE_EQUALS ( ruleWS )*
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3559:4: ( (lv_name_2_0= RULE_CID ) )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3560:1: (lv_name_2_0= RULE_CID )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3560:1: (lv_name_2_0= RULE_CID )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3561:3: lv_name_2_0= RULE_CID
                    {
                    lv_name_2_0=(Token)match(input,RULE_CID,FOLLOW_RULE_CID_in_rulenamespaceDeclaration7910); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_2_0, grammarAccess.getNamespaceDeclarationAccess().getNameCIDTerminalRuleCall_2_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getNamespaceDeclarationRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_2_0, 
                              		"CID");
                      	    
                    }

                    }


                    }

                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3577:2: ( ruleWS )+
                    int cnt125=0;
                    loop125:
                    do {
                        int alt125=2;
                        int LA125_0 = input.LA(1);

                        if ( ((LA125_0>=RULE_LINESP && LA125_0<=RULE_ML2_COMMENT)) ) {
                            alt125=1;
                        }


                        switch (alt125) {
                    	case 1 :
                    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3578:5: ruleWS
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getNamespaceDeclarationAccess().getWSParserRuleCall_2_1()); 
                    	          
                    	    }
                    	    pushFollow(FOLLOW_ruleWS_in_rulenamespaceDeclaration7932);
                    	    ruleWS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              afterParserOrEnumRuleCall();
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt125 >= 1 ) break loop125;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(125, input);
                                throw eee;
                        }
                        cnt125++;
                    } while (true);

                    this_EQUALS_4=(Token)match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_rulenamespaceDeclaration7944); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_EQUALS_4, grammarAccess.getNamespaceDeclarationAccess().getEQUALSTerminalRuleCall_2_2()); 
                          
                    }
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3589:1: ( ruleWS )*
                    loop126:
                    do {
                        int alt126=2;
                        int LA126_0 = input.LA(1);

                        if ( ((LA126_0>=RULE_LINESP && LA126_0<=RULE_ML2_COMMENT)) ) {
                            alt126=1;
                        }


                        switch (alt126) {
                    	case 1 :
                    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3590:5: ruleWS
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getNamespaceDeclarationAccess().getWSParserRuleCall_2_3()); 
                    	          
                    	    }
                    	    pushFollow(FOLLOW_ruleWS_in_rulenamespaceDeclaration7960);
                    	    ruleWS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              afterParserOrEnumRuleCall();
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop126;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3597:5: ( (lv_uri_6_0= RULE_URISTRING ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3598:1: (lv_uri_6_0= RULE_URISTRING )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3598:1: (lv_uri_6_0= RULE_URISTRING )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3599:3: lv_uri_6_0= RULE_URISTRING
            {
            lv_uri_6_0=(Token)match(input,RULE_URISTRING,FOLLOW_RULE_URISTRING_in_rulenamespaceDeclaration7980); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_uri_6_0, grammarAccess.getNamespaceDeclarationAccess().getUriURISTRINGTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getNamespaceDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"uri",
                      		lv_uri_6_0, 
                      		"URISTRING");
              	    
            }

            }


            }

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3615:2: ( ruleWS )*
            loop128:
            do {
                int alt128=2;
                int LA128_0 = input.LA(1);

                if ( ((LA128_0>=RULE_LINESP && LA128_0<=RULE_ML2_COMMENT)) ) {
                    alt128=1;
                }


                switch (alt128) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3616:5: ruleWS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getNamespaceDeclarationAccess().getWSParserRuleCall_4()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleWS_in_rulenamespaceDeclaration8002);
            	    ruleWS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop128;
                }
            } while (true);

            this_DOT_8=(Token)match(input,RULE_DOT,FOLLOW_RULE_DOT_in_rulenamespaceDeclaration8014); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_DOT_8, grammarAccess.getNamespaceDeclarationAccess().getDOTTerminalRuleCall_5()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulenamespaceDeclaration"


    // $ANTLR start "entryRulereadDeclaration"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3635:1: entryRulereadDeclaration returns [EObject current=null] : iv_rulereadDeclaration= rulereadDeclaration EOF ;
    public final EObject entryRulereadDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulereadDeclaration = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3636:2: (iv_rulereadDeclaration= rulereadDeclaration EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3637:2: iv_rulereadDeclaration= rulereadDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReadDeclarationRule()); 
            }
            pushFollow(FOLLOW_rulereadDeclaration_in_entryRulereadDeclaration8049);
            iv_rulereadDeclaration=rulereadDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulereadDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulereadDeclaration8059); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulereadDeclaration"


    // $ANTLR start "rulereadDeclaration"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3644:1: rulereadDeclaration returns [EObject current=null] : (otherlv_0= '%read' ( ruleWS )* ( (lv_file_2_0= RULE_URISTRING ) ) ( ruleWS )* this_DOT_4= RULE_DOT ) ;
    public final EObject rulereadDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_file_2_0=null;
        Token this_DOT_4=null;

         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3647:28: ( (otherlv_0= '%read' ( ruleWS )* ( (lv_file_2_0= RULE_URISTRING ) ) ( ruleWS )* this_DOT_4= RULE_DOT ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3648:1: (otherlv_0= '%read' ( ruleWS )* ( (lv_file_2_0= RULE_URISTRING ) ) ( ruleWS )* this_DOT_4= RULE_DOT )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3648:1: (otherlv_0= '%read' ( ruleWS )* ( (lv_file_2_0= RULE_URISTRING ) ) ( ruleWS )* this_DOT_4= RULE_DOT )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3648:3: otherlv_0= '%read' ( ruleWS )* ( (lv_file_2_0= RULE_URISTRING ) ) ( ruleWS )* this_DOT_4= RULE_DOT
            {
            otherlv_0=(Token)match(input,43,FOLLOW_43_in_rulereadDeclaration8096); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getReadDeclarationAccess().getReadKeyword_0());
                  
            }
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3652:1: ( ruleWS )*
            loop129:
            do {
                int alt129=2;
                int LA129_0 = input.LA(1);

                if ( ((LA129_0>=RULE_LINESP && LA129_0<=RULE_ML2_COMMENT)) ) {
                    alt129=1;
                }


                switch (alt129) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3653:5: ruleWS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getReadDeclarationAccess().getWSParserRuleCall_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleWS_in_rulereadDeclaration8113);
            	    ruleWS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop129;
                }
            } while (true);

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3660:3: ( (lv_file_2_0= RULE_URISTRING ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3661:1: (lv_file_2_0= RULE_URISTRING )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3661:1: (lv_file_2_0= RULE_URISTRING )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3662:3: lv_file_2_0= RULE_URISTRING
            {
            lv_file_2_0=(Token)match(input,RULE_URISTRING,FOLLOW_RULE_URISTRING_in_rulereadDeclaration8131); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_file_2_0, grammarAccess.getReadDeclarationAccess().getFileURISTRINGTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getReadDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"file",
                      		lv_file_2_0, 
                      		"URISTRING");
              	    
            }

            }


            }

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3678:2: ( ruleWS )*
            loop130:
            do {
                int alt130=2;
                int LA130_0 = input.LA(1);

                if ( ((LA130_0>=RULE_LINESP && LA130_0<=RULE_ML2_COMMENT)) ) {
                    alt130=1;
                }


                switch (alt130) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3679:5: ruleWS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getReadDeclarationAccess().getWSParserRuleCall_3()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleWS_in_rulereadDeclaration8153);
            	    ruleWS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop130;
                }
            } while (true);

            this_DOT_4=(Token)match(input,RULE_DOT,FOLLOW_RULE_DOT_in_rulereadDeclaration8165); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_DOT_4, grammarAccess.getReadDeclarationAccess().getDOTTerminalRuleCall_4()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulereadDeclaration"


    // $ANTLR start "entryRulesigConstructNOSP"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3698:1: entryRulesigConstructNOSP returns [EObject current=null] : iv_rulesigConstructNOSP= rulesigConstructNOSP EOF ;
    public final EObject entryRulesigConstructNOSP() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesigConstructNOSP = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3699:2: (iv_rulesigConstructNOSP= rulesigConstructNOSP EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3700:2: iv_rulesigConstructNOSP= rulesigConstructNOSP EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSigConstructNOSPRule()); 
            }
            pushFollow(FOLLOW_rulesigConstructNOSP_in_entryRulesigConstructNOSP8200);
            iv_rulesigConstructNOSP=rulesigConstructNOSP();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulesigConstructNOSP; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulesigConstructNOSP8210); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulesigConstructNOSP"


    // $ANTLR start "rulesigConstructNOSP"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3707:1: rulesigConstructNOSP returns [EObject current=null] : (this_abbrevTermDeclaration_0= ruleabbrevTermDeclaration | this_nameDeclaration_1= rulenameDeclaration | this_fixityDeclaration_2= rulefixityDeclaration | this_unknownConstruct_3= ruleunknownConstruct | this_sigMetaDeclaration_4= rulesigMetaDeclaration | this_sigIncludeDeclaration_5= rulesigIncludeDeclaration | this_structDeclaration_6= rulestructDeclaration | this_sigDeclaration_7= rulesigDeclaration | this_internalViewDeclaration_8= ruleinternalViewDeclaration ) ;
    public final EObject rulesigConstructNOSP() throws RecognitionException {
        EObject current = null;

        EObject this_abbrevTermDeclaration_0 = null;

        EObject this_nameDeclaration_1 = null;

        EObject this_fixityDeclaration_2 = null;

        EObject this_unknownConstruct_3 = null;

        EObject this_sigMetaDeclaration_4 = null;

        EObject this_sigIncludeDeclaration_5 = null;

        EObject this_structDeclaration_6 = null;

        EObject this_sigDeclaration_7 = null;

        EObject this_internalViewDeclaration_8 = null;


         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3710:28: ( (this_abbrevTermDeclaration_0= ruleabbrevTermDeclaration | this_nameDeclaration_1= rulenameDeclaration | this_fixityDeclaration_2= rulefixityDeclaration | this_unknownConstruct_3= ruleunknownConstruct | this_sigMetaDeclaration_4= rulesigMetaDeclaration | this_sigIncludeDeclaration_5= rulesigIncludeDeclaration | this_structDeclaration_6= rulestructDeclaration | this_sigDeclaration_7= rulesigDeclaration | this_internalViewDeclaration_8= ruleinternalViewDeclaration ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3711:1: (this_abbrevTermDeclaration_0= ruleabbrevTermDeclaration | this_nameDeclaration_1= rulenameDeclaration | this_fixityDeclaration_2= rulefixityDeclaration | this_unknownConstruct_3= ruleunknownConstruct | this_sigMetaDeclaration_4= rulesigMetaDeclaration | this_sigIncludeDeclaration_5= rulesigIncludeDeclaration | this_structDeclaration_6= rulestructDeclaration | this_sigDeclaration_7= rulesigDeclaration | this_internalViewDeclaration_8= ruleinternalViewDeclaration )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3711:1: (this_abbrevTermDeclaration_0= ruleabbrevTermDeclaration | this_nameDeclaration_1= rulenameDeclaration | this_fixityDeclaration_2= rulefixityDeclaration | this_unknownConstruct_3= ruleunknownConstruct | this_sigMetaDeclaration_4= rulesigMetaDeclaration | this_sigIncludeDeclaration_5= rulesigIncludeDeclaration | this_structDeclaration_6= rulestructDeclaration | this_sigDeclaration_7= rulesigDeclaration | this_internalViewDeclaration_8= ruleinternalViewDeclaration )
            int alt131=9;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt131=1;
                }
                break;
            case 33:
                {
                alt131=2;
                }
                break;
            case RULE_INFIXNONE:
            case RULE_INFIXLEFT:
            case RULE_INFIXRIGHT:
            case 34:
            case 35:
                {
                alt131=3;
                }
                break;
            case RULE_UNKNOWNDIRECTIVE:
                {
                alt131=4;
                }
                break;
            case 36:
                {
                alt131=5;
                }
                break;
            case 37:
                {
                alt131=6;
                }
                break;
            case 38:
                {
                alt131=7;
                }
                break;
            case 44:
                {
                alt131=8;
                }
                break;
            case 45:
                {
                alt131=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 131, 0, input);

                throw nvae;
            }

            switch (alt131) {
                case 1 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3712:5: this_abbrevTermDeclaration_0= ruleabbrevTermDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSigConstructNOSPAccess().getAbbrevTermDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleabbrevTermDeclaration_in_rulesigConstructNOSP8257);
                    this_abbrevTermDeclaration_0=ruleabbrevTermDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_abbrevTermDeclaration_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3722:5: this_nameDeclaration_1= rulenameDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSigConstructNOSPAccess().getNameDeclarationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_rulenameDeclaration_in_rulesigConstructNOSP8284);
                    this_nameDeclaration_1=rulenameDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_nameDeclaration_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3732:5: this_fixityDeclaration_2= rulefixityDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSigConstructNOSPAccess().getFixityDeclarationParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_rulefixityDeclaration_in_rulesigConstructNOSP8311);
                    this_fixityDeclaration_2=rulefixityDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_fixityDeclaration_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3742:5: this_unknownConstruct_3= ruleunknownConstruct
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSigConstructNOSPAccess().getUnknownConstructParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleunknownConstruct_in_rulesigConstructNOSP8338);
                    this_unknownConstruct_3=ruleunknownConstruct();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_unknownConstruct_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3752:5: this_sigMetaDeclaration_4= rulesigMetaDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSigConstructNOSPAccess().getSigMetaDeclarationParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_rulesigMetaDeclaration_in_rulesigConstructNOSP8365);
                    this_sigMetaDeclaration_4=rulesigMetaDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_sigMetaDeclaration_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3762:5: this_sigIncludeDeclaration_5= rulesigIncludeDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSigConstructNOSPAccess().getSigIncludeDeclarationParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_rulesigIncludeDeclaration_in_rulesigConstructNOSP8392);
                    this_sigIncludeDeclaration_5=rulesigIncludeDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_sigIncludeDeclaration_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3772:5: this_structDeclaration_6= rulestructDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSigConstructNOSPAccess().getStructDeclarationParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_rulestructDeclaration_in_rulesigConstructNOSP8419);
                    this_structDeclaration_6=rulestructDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_structDeclaration_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3782:5: this_sigDeclaration_7= rulesigDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSigConstructNOSPAccess().getSigDeclarationParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_rulesigDeclaration_in_rulesigConstructNOSP8446);
                    this_sigDeclaration_7=rulesigDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_sigDeclaration_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3792:5: this_internalViewDeclaration_8= ruleinternalViewDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSigConstructNOSPAccess().getInternalViewDeclarationParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleinternalViewDeclaration_in_rulesigConstructNOSP8473);
                    this_internalViewDeclaration_8=ruleinternalViewDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_internalViewDeclaration_8; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulesigConstructNOSP"


    // $ANTLR start "entryRulesigBody"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3810:1: entryRulesigBody returns [EObject current=null] : iv_rulesigBody= rulesigBody EOF ;
    public final EObject entryRulesigBody() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesigBody = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3811:2: (iv_rulesigBody= rulesigBody EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3812:2: iv_rulesigBody= rulesigBody EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSigBodyRule()); 
            }
            pushFollow(FOLLOW_rulesigBody_in_entryRulesigBody8510);
            iv_rulesigBody=rulesigBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulesigBody; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulesigBody8520); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulesigBody"


    // $ANTLR start "rulesigBody"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3819:1: rulesigBody returns [EObject current=null] : ( () this_LCBRACKET_1= RULE_LCBRACKET ( ruleWS )* ( ( ( (lv_constructs_3_1= rulesigConstructNOSP | lv_constructs_3_2= ruletermDeclaration ) ) ) ( ( ruleWS )* ( ( (lv_constructs_5_0= rulesigConstructNOSP ) ) | ( ruleWS ( (lv_constructs_7_0= ruletermDeclaration ) ) ) ) )* ( ruleWS )* )? this_RCBRACKET_9= RULE_RCBRACKET ) ;
    public final EObject rulesigBody() throws RecognitionException {
        EObject current = null;

        Token this_LCBRACKET_1=null;
        Token this_RCBRACKET_9=null;
        EObject lv_constructs_3_1 = null;

        EObject lv_constructs_3_2 = null;

        EObject lv_constructs_5_0 = null;

        EObject lv_constructs_7_0 = null;


         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3822:28: ( ( () this_LCBRACKET_1= RULE_LCBRACKET ( ruleWS )* ( ( ( (lv_constructs_3_1= rulesigConstructNOSP | lv_constructs_3_2= ruletermDeclaration ) ) ) ( ( ruleWS )* ( ( (lv_constructs_5_0= rulesigConstructNOSP ) ) | ( ruleWS ( (lv_constructs_7_0= ruletermDeclaration ) ) ) ) )* ( ruleWS )* )? this_RCBRACKET_9= RULE_RCBRACKET ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3823:1: ( () this_LCBRACKET_1= RULE_LCBRACKET ( ruleWS )* ( ( ( (lv_constructs_3_1= rulesigConstructNOSP | lv_constructs_3_2= ruletermDeclaration ) ) ) ( ( ruleWS )* ( ( (lv_constructs_5_0= rulesigConstructNOSP ) ) | ( ruleWS ( (lv_constructs_7_0= ruletermDeclaration ) ) ) ) )* ( ruleWS )* )? this_RCBRACKET_9= RULE_RCBRACKET )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3823:1: ( () this_LCBRACKET_1= RULE_LCBRACKET ( ruleWS )* ( ( ( (lv_constructs_3_1= rulesigConstructNOSP | lv_constructs_3_2= ruletermDeclaration ) ) ) ( ( ruleWS )* ( ( (lv_constructs_5_0= rulesigConstructNOSP ) ) | ( ruleWS ( (lv_constructs_7_0= ruletermDeclaration ) ) ) ) )* ( ruleWS )* )? this_RCBRACKET_9= RULE_RCBRACKET )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3823:2: () this_LCBRACKET_1= RULE_LCBRACKET ( ruleWS )* ( ( ( (lv_constructs_3_1= rulesigConstructNOSP | lv_constructs_3_2= ruletermDeclaration ) ) ) ( ( ruleWS )* ( ( (lv_constructs_5_0= rulesigConstructNOSP ) ) | ( ruleWS ( (lv_constructs_7_0= ruletermDeclaration ) ) ) ) )* ( ruleWS )* )? this_RCBRACKET_9= RULE_RCBRACKET
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3823:2: ()
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3824:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSigBodyAccess().getSigBodyAction_0(),
                          current);
                  
            }

            }

            this_LCBRACKET_1=(Token)match(input,RULE_LCBRACKET,FOLLOW_RULE_LCBRACKET_in_rulesigBody8565); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LCBRACKET_1, grammarAccess.getSigBodyAccess().getLCBRACKETTerminalRuleCall_1()); 
                  
            }
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3833:1: ( ruleWS )*
            loop132:
            do {
                int alt132=2;
                int LA132_0 = input.LA(1);

                if ( ((LA132_0>=RULE_LINESP && LA132_0<=RULE_ML2_COMMENT)) ) {
                    alt132=1;
                }


                switch (alt132) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3834:5: ruleWS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getSigBodyAccess().getWSParserRuleCall_2()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleWS_in_rulesigBody8581);
            	    ruleWS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop132;
                }
            } while (true);

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3841:3: ( ( ( (lv_constructs_3_1= rulesigConstructNOSP | lv_constructs_3_2= ruletermDeclaration ) ) ) ( ( ruleWS )* ( ( (lv_constructs_5_0= rulesigConstructNOSP ) ) | ( ruleWS ( (lv_constructs_7_0= ruletermDeclaration ) ) ) ) )* ( ruleWS )* )?
            int alt138=2;
            int LA138_0 = input.LA(1);

            if ( (LA138_0==RULE_CID||(LA138_0>=RULE_INFIXNONE && LA138_0<=RULE_UNKNOWNDIRECTIVE)||(LA138_0>=32 && LA138_0<=38)||(LA138_0>=44 && LA138_0<=45)) ) {
                alt138=1;
            }
            switch (alt138) {
                case 1 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3841:4: ( ( (lv_constructs_3_1= rulesigConstructNOSP | lv_constructs_3_2= ruletermDeclaration ) ) ) ( ( ruleWS )* ( ( (lv_constructs_5_0= rulesigConstructNOSP ) ) | ( ruleWS ( (lv_constructs_7_0= ruletermDeclaration ) ) ) ) )* ( ruleWS )*
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3841:4: ( ( (lv_constructs_3_1= rulesigConstructNOSP | lv_constructs_3_2= ruletermDeclaration ) ) )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3842:1: ( (lv_constructs_3_1= rulesigConstructNOSP | lv_constructs_3_2= ruletermDeclaration ) )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3842:1: ( (lv_constructs_3_1= rulesigConstructNOSP | lv_constructs_3_2= ruletermDeclaration ) )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3843:1: (lv_constructs_3_1= rulesigConstructNOSP | lv_constructs_3_2= ruletermDeclaration )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3843:1: (lv_constructs_3_1= rulesigConstructNOSP | lv_constructs_3_2= ruletermDeclaration )
                    int alt133=2;
                    int LA133_0 = input.LA(1);

                    if ( ((LA133_0>=RULE_INFIXNONE && LA133_0<=RULE_UNKNOWNDIRECTIVE)||(LA133_0>=32 && LA133_0<=38)||(LA133_0>=44 && LA133_0<=45)) ) {
                        alt133=1;
                    }
                    else if ( (LA133_0==RULE_CID) ) {
                        alt133=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 133, 0, input);

                        throw nvae;
                    }
                    switch (alt133) {
                        case 1 :
                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3844:3: lv_constructs_3_1= rulesigConstructNOSP
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getSigBodyAccess().getConstructsSigConstructNOSPParserRuleCall_3_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_rulesigConstructNOSP_in_rulesigBody8606);
                            lv_constructs_3_1=rulesigConstructNOSP();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getSigBodyRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"constructs",
                                      		lv_constructs_3_1, 
                                      		"sigConstructNOSP");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3859:8: lv_constructs_3_2= ruletermDeclaration
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getSigBodyAccess().getConstructsTermDeclarationParserRuleCall_3_0_0_1()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruletermDeclaration_in_rulesigBody8625);
                            lv_constructs_3_2=ruletermDeclaration();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getSigBodyRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"constructs",
                                      		lv_constructs_3_2, 
                                      		"termDeclaration");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3877:2: ( ( ruleWS )* ( ( (lv_constructs_5_0= rulesigConstructNOSP ) ) | ( ruleWS ( (lv_constructs_7_0= ruletermDeclaration ) ) ) ) )*
                    loop136:
                    do {
                        int alt136=2;
                        alt136 = dfa136.predict(input);
                        switch (alt136) {
                    	case 1 :
                    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3877:3: ( ruleWS )* ( ( (lv_constructs_5_0= rulesigConstructNOSP ) ) | ( ruleWS ( (lv_constructs_7_0= ruletermDeclaration ) ) ) )
                    	    {
                    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3877:3: ( ruleWS )*
                    	    loop134:
                    	    do {
                    	        int alt134=2;
                    	        switch ( input.LA(1) ) {
                    	        case RULE_LINESP:
                    	            {
                    	            int LA134_2 = input.LA(2);

                    	            if ( ((LA134_2>=RULE_LINESP && LA134_2<=RULE_UNKNOWNDIRECTIVE)||(LA134_2>=32 && LA134_2<=38)||(LA134_2>=44 && LA134_2<=45)) ) {
                    	                alt134=1;
                    	            }


                    	            }
                    	            break;
                    	        case RULE_LINEDELIM:
                    	            {
                    	            int LA134_3 = input.LA(2);

                    	            if ( ((LA134_3>=RULE_LINESP && LA134_3<=RULE_UNKNOWNDIRECTIVE)||(LA134_3>=32 && LA134_3<=38)||(LA134_3>=44 && LA134_3<=45)) ) {
                    	                alt134=1;
                    	            }


                    	            }
                    	            break;
                    	        case RULE_ML_COMMENT:
                    	            {
                    	            int LA134_4 = input.LA(2);

                    	            if ( ((LA134_4>=RULE_LINESP && LA134_4<=RULE_UNKNOWNDIRECTIVE)||(LA134_4>=32 && LA134_4<=38)||(LA134_4>=44 && LA134_4<=45)) ) {
                    	                alt134=1;
                    	            }


                    	            }
                    	            break;
                    	        case RULE_ML2_COMMENT:
                    	            {
                    	            int LA134_5 = input.LA(2);

                    	            if ( ((LA134_5>=RULE_LINESP && LA134_5<=RULE_UNKNOWNDIRECTIVE)||(LA134_5>=32 && LA134_5<=38)||(LA134_5>=44 && LA134_5<=45)) ) {
                    	                alt134=1;
                    	            }


                    	            }
                    	            break;

                    	        }

                    	        switch (alt134) {
                    	    	case 1 :
                    	    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3878:5: ruleWS
                    	    	    {
                    	    	    if ( state.backtracking==0 ) {
                    	    	       
                    	    	              newCompositeNode(grammarAccess.getSigBodyAccess().getWSParserRuleCall_3_1_0()); 
                    	    	          
                    	    	    }
                    	    	    pushFollow(FOLLOW_ruleWS_in_rulesigBody8646);
                    	    	    ruleWS();

                    	    	    state._fsp--;
                    	    	    if (state.failed) return current;
                    	    	    if ( state.backtracking==0 ) {
                    	    	       
                    	    	              afterParserOrEnumRuleCall();
                    	    	          
                    	    	    }

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop134;
                    	        }
                    	    } while (true);

                    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3885:3: ( ( (lv_constructs_5_0= rulesigConstructNOSP ) ) | ( ruleWS ( (lv_constructs_7_0= ruletermDeclaration ) ) ) )
                    	    int alt135=2;
                    	    int LA135_0 = input.LA(1);

                    	    if ( ((LA135_0>=RULE_INFIXNONE && LA135_0<=RULE_UNKNOWNDIRECTIVE)||(LA135_0>=32 && LA135_0<=38)||(LA135_0>=44 && LA135_0<=45)) ) {
                    	        alt135=1;
                    	    }
                    	    else if ( ((LA135_0>=RULE_LINESP && LA135_0<=RULE_ML2_COMMENT)) ) {
                    	        alt135=2;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 135, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt135) {
                    	        case 1 :
                    	            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3885:4: ( (lv_constructs_5_0= rulesigConstructNOSP ) )
                    	            {
                    	            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3885:4: ( (lv_constructs_5_0= rulesigConstructNOSP ) )
                    	            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3886:1: (lv_constructs_5_0= rulesigConstructNOSP )
                    	            {
                    	            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3886:1: (lv_constructs_5_0= rulesigConstructNOSP )
                    	            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3887:3: lv_constructs_5_0= rulesigConstructNOSP
                    	            {
                    	            if ( state.backtracking==0 ) {
                    	               
                    	              	        newCompositeNode(grammarAccess.getSigBodyAccess().getConstructsSigConstructNOSPParserRuleCall_3_1_1_0_0()); 
                    	              	    
                    	            }
                    	            pushFollow(FOLLOW_rulesigConstructNOSP_in_rulesigBody8669);
                    	            lv_constructs_5_0=rulesigConstructNOSP();

                    	            state._fsp--;
                    	            if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = createModelElementForParent(grammarAccess.getSigBodyRule());
                    	              	        }
                    	                     		add(
                    	                     			current, 
                    	                     			"constructs",
                    	                      		lv_constructs_5_0, 
                    	                      		"sigConstructNOSP");
                    	              	        afterParserOrEnumRuleCall();
                    	              	    
                    	            }

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3904:6: ( ruleWS ( (lv_constructs_7_0= ruletermDeclaration ) ) )
                    	            {
                    	            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3904:6: ( ruleWS ( (lv_constructs_7_0= ruletermDeclaration ) ) )
                    	            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3905:5: ruleWS ( (lv_constructs_7_0= ruletermDeclaration ) )
                    	            {
                    	            if ( state.backtracking==0 ) {
                    	               
                    	                      newCompositeNode(grammarAccess.getSigBodyAccess().getWSParserRuleCall_3_1_1_1_0()); 
                    	                  
                    	            }
                    	            pushFollow(FOLLOW_ruleWS_in_rulesigBody8692);
                    	            ruleWS();

                    	            state._fsp--;
                    	            if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {
                    	               
                    	                      afterParserOrEnumRuleCall();
                    	                  
                    	            }
                    	            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3912:1: ( (lv_constructs_7_0= ruletermDeclaration ) )
                    	            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3913:1: (lv_constructs_7_0= ruletermDeclaration )
                    	            {
                    	            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3913:1: (lv_constructs_7_0= ruletermDeclaration )
                    	            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3914:3: lv_constructs_7_0= ruletermDeclaration
                    	            {
                    	            if ( state.backtracking==0 ) {
                    	               
                    	              	        newCompositeNode(grammarAccess.getSigBodyAccess().getConstructsTermDeclarationParserRuleCall_3_1_1_1_1_0()); 
                    	              	    
                    	            }
                    	            pushFollow(FOLLOW_ruletermDeclaration_in_rulesigBody8712);
                    	            lv_constructs_7_0=ruletermDeclaration();

                    	            state._fsp--;
                    	            if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = createModelElementForParent(grammarAccess.getSigBodyRule());
                    	              	        }
                    	                     		add(
                    	                     			current, 
                    	                     			"constructs",
                    	                      		lv_constructs_7_0, 
                    	                      		"termDeclaration");
                    	              	        afterParserOrEnumRuleCall();
                    	              	    
                    	            }

                    	            }


                    	            }


                    	            }


                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop136;
                        }
                    } while (true);

                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3930:6: ( ruleWS )*
                    loop137:
                    do {
                        int alt137=2;
                        int LA137_0 = input.LA(1);

                        if ( ((LA137_0>=RULE_LINESP && LA137_0<=RULE_ML2_COMMENT)) ) {
                            alt137=1;
                        }


                        switch (alt137) {
                    	case 1 :
                    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3931:5: ruleWS
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getSigBodyAccess().getWSParserRuleCall_3_2()); 
                    	          
                    	    }
                    	    pushFollow(FOLLOW_ruleWS_in_rulesigBody8733);
                    	    ruleWS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              afterParserOrEnumRuleCall();
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop137;
                        }
                    } while (true);


                    }
                    break;

            }

            this_RCBRACKET_9=(Token)match(input,RULE_RCBRACKET,FOLLOW_RULE_RCBRACKET_in_rulesigBody8747); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RCBRACKET_9, grammarAccess.getSigBodyAccess().getRCBRACKETTerminalRuleCall_4()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulesigBody"


    // $ANTLR start "entryRulesigDeclaration"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3950:1: entryRulesigDeclaration returns [EObject current=null] : iv_rulesigDeclaration= rulesigDeclaration EOF ;
    public final EObject entryRulesigDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesigDeclaration = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3951:2: (iv_rulesigDeclaration= rulesigDeclaration EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3952:2: iv_rulesigDeclaration= rulesigDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSigDeclarationRule()); 
            }
            pushFollow(FOLLOW_rulesigDeclaration_in_entryRulesigDeclaration8782);
            iv_rulesigDeclaration=rulesigDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulesigDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulesigDeclaration8792); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulesigDeclaration"


    // $ANTLR start "rulesigDeclaration"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3959:1: rulesigDeclaration returns [EObject current=null] : (otherlv_0= '%sig' ( ruleWS )+ ( (lv_name_2_0= RULE_CID ) ) ( ruleWS )+ this_EQUALS_4= RULE_EQUALS ( ruleWS )* ( (lv_def_6_0= rulesigBody ) ) ( ruleWS )* this_DOT_8= RULE_DOT ) ;
    public final EObject rulesigDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token this_EQUALS_4=null;
        Token this_DOT_8=null;
        EObject lv_def_6_0 = null;


         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3962:28: ( (otherlv_0= '%sig' ( ruleWS )+ ( (lv_name_2_0= RULE_CID ) ) ( ruleWS )+ this_EQUALS_4= RULE_EQUALS ( ruleWS )* ( (lv_def_6_0= rulesigBody ) ) ( ruleWS )* this_DOT_8= RULE_DOT ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3963:1: (otherlv_0= '%sig' ( ruleWS )+ ( (lv_name_2_0= RULE_CID ) ) ( ruleWS )+ this_EQUALS_4= RULE_EQUALS ( ruleWS )* ( (lv_def_6_0= rulesigBody ) ) ( ruleWS )* this_DOT_8= RULE_DOT )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3963:1: (otherlv_0= '%sig' ( ruleWS )+ ( (lv_name_2_0= RULE_CID ) ) ( ruleWS )+ this_EQUALS_4= RULE_EQUALS ( ruleWS )* ( (lv_def_6_0= rulesigBody ) ) ( ruleWS )* this_DOT_8= RULE_DOT )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3963:3: otherlv_0= '%sig' ( ruleWS )+ ( (lv_name_2_0= RULE_CID ) ) ( ruleWS )+ this_EQUALS_4= RULE_EQUALS ( ruleWS )* ( (lv_def_6_0= rulesigBody ) ) ( ruleWS )* this_DOT_8= RULE_DOT
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_rulesigDeclaration8829); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSigDeclarationAccess().getSigKeyword_0());
                  
            }
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3967:1: ( ruleWS )+
            int cnt139=0;
            loop139:
            do {
                int alt139=2;
                int LA139_0 = input.LA(1);

                if ( ((LA139_0>=RULE_LINESP && LA139_0<=RULE_ML2_COMMENT)) ) {
                    alt139=1;
                }


                switch (alt139) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3968:5: ruleWS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getSigDeclarationAccess().getWSParserRuleCall_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleWS_in_rulesigDeclaration8846);
            	    ruleWS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt139 >= 1 ) break loop139;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(139, input);
                        throw eee;
                }
                cnt139++;
            } while (true);

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3975:3: ( (lv_name_2_0= RULE_CID ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3976:1: (lv_name_2_0= RULE_CID )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3976:1: (lv_name_2_0= RULE_CID )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3977:3: lv_name_2_0= RULE_CID
            {
            lv_name_2_0=(Token)match(input,RULE_CID,FOLLOW_RULE_CID_in_rulesigDeclaration8864); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getSigDeclarationAccess().getNameCIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSigDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"CID");
              	    
            }

            }


            }

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3993:2: ( ruleWS )+
            int cnt140=0;
            loop140:
            do {
                int alt140=2;
                int LA140_0 = input.LA(1);

                if ( ((LA140_0>=RULE_LINESP && LA140_0<=RULE_ML2_COMMENT)) ) {
                    alt140=1;
                }


                switch (alt140) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3994:5: ruleWS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getSigDeclarationAccess().getWSParserRuleCall_3()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleWS_in_rulesigDeclaration8886);
            	    ruleWS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt140 >= 1 ) break loop140;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(140, input);
                        throw eee;
                }
                cnt140++;
            } while (true);

            this_EQUALS_4=(Token)match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_rulesigDeclaration8898); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_EQUALS_4, grammarAccess.getSigDeclarationAccess().getEQUALSTerminalRuleCall_4()); 
                  
            }
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4005:1: ( ruleWS )*
            loop141:
            do {
                int alt141=2;
                int LA141_0 = input.LA(1);

                if ( ((LA141_0>=RULE_LINESP && LA141_0<=RULE_ML2_COMMENT)) ) {
                    alt141=1;
                }


                switch (alt141) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4006:5: ruleWS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getSigDeclarationAccess().getWSParserRuleCall_5()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleWS_in_rulesigDeclaration8914);
            	    ruleWS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop141;
                }
            } while (true);

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4013:3: ( (lv_def_6_0= rulesigBody ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4014:1: (lv_def_6_0= rulesigBody )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4014:1: (lv_def_6_0= rulesigBody )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4015:3: lv_def_6_0= rulesigBody
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSigDeclarationAccess().getDefSigBodyParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_rulesigBody_in_rulesigDeclaration8936);
            lv_def_6_0=rulesigBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSigDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"def",
                      		lv_def_6_0, 
                      		"sigBody");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4031:2: ( ruleWS )*
            loop142:
            do {
                int alt142=2;
                int LA142_0 = input.LA(1);

                if ( ((LA142_0>=RULE_LINESP && LA142_0<=RULE_ML2_COMMENT)) ) {
                    alt142=1;
                }


                switch (alt142) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4032:5: ruleWS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getSigDeclarationAccess().getWSParserRuleCall_7()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleWS_in_rulesigDeclaration8953);
            	    ruleWS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop142;
                }
            } while (true);

            this_DOT_8=(Token)match(input,RULE_DOT,FOLLOW_RULE_DOT_in_rulesigDeclaration8965); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_DOT_8, grammarAccess.getSigDeclarationAccess().getDOTTerminalRuleCall_8()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulesigDeclaration"


    // $ANTLR start "entryRulelinkConstructNOSP"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4051:1: entryRulelinkConstructNOSP returns [EObject current=null] : iv_rulelinkConstructNOSP= rulelinkConstructNOSP EOF ;
    public final EObject entryRulelinkConstructNOSP() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelinkConstructNOSP = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4052:2: (iv_rulelinkConstructNOSP= rulelinkConstructNOSP EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4053:2: iv_rulelinkConstructNOSP= rulelinkConstructNOSP EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLinkConstructNOSPRule()); 
            }
            pushFollow(FOLLOW_rulelinkConstructNOSP_in_entryRulelinkConstructNOSP9000);
            iv_rulelinkConstructNOSP=rulelinkConstructNOSP();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulelinkConstructNOSP; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulelinkConstructNOSP9010); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulelinkConstructNOSP"


    // $ANTLR start "rulelinkConstructNOSP"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4060:1: rulelinkConstructNOSP returns [EObject current=null] : (this_structAssignment_0= rulestructAssignment | this_viewMetaDeclaration_1= ruleviewMetaDeclaration | this_viewIncludeDeclaration_2= ruleviewIncludeDeclaration | this_unknownConstruct_3= ruleunknownConstruct ) ;
    public final EObject rulelinkConstructNOSP() throws RecognitionException {
        EObject current = null;

        EObject this_structAssignment_0 = null;

        EObject this_viewMetaDeclaration_1 = null;

        EObject this_viewIncludeDeclaration_2 = null;

        EObject this_unknownConstruct_3 = null;


         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4063:28: ( (this_structAssignment_0= rulestructAssignment | this_viewMetaDeclaration_1= ruleviewMetaDeclaration | this_viewIncludeDeclaration_2= ruleviewIncludeDeclaration | this_unknownConstruct_3= ruleunknownConstruct ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4064:1: (this_structAssignment_0= rulestructAssignment | this_viewMetaDeclaration_1= ruleviewMetaDeclaration | this_viewIncludeDeclaration_2= ruleviewIncludeDeclaration | this_unknownConstruct_3= ruleunknownConstruct )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4064:1: (this_structAssignment_0= rulestructAssignment | this_viewMetaDeclaration_1= ruleviewMetaDeclaration | this_viewIncludeDeclaration_2= ruleviewIncludeDeclaration | this_unknownConstruct_3= ruleunknownConstruct )
            int alt143=4;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt143=1;
                }
                break;
            case 36:
                {
                alt143=2;
                }
                break;
            case 37:
                {
                alt143=3;
                }
                break;
            case RULE_UNKNOWNDIRECTIVE:
                {
                alt143=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 143, 0, input);

                throw nvae;
            }

            switch (alt143) {
                case 1 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4065:5: this_structAssignment_0= rulestructAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLinkConstructNOSPAccess().getStructAssignmentParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulestructAssignment_in_rulelinkConstructNOSP9057);
                    this_structAssignment_0=rulestructAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_structAssignment_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4075:5: this_viewMetaDeclaration_1= ruleviewMetaDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLinkConstructNOSPAccess().getViewMetaDeclarationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleviewMetaDeclaration_in_rulelinkConstructNOSP9084);
                    this_viewMetaDeclaration_1=ruleviewMetaDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_viewMetaDeclaration_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4085:5: this_viewIncludeDeclaration_2= ruleviewIncludeDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLinkConstructNOSPAccess().getViewIncludeDeclarationParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleviewIncludeDeclaration_in_rulelinkConstructNOSP9111);
                    this_viewIncludeDeclaration_2=ruleviewIncludeDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_viewIncludeDeclaration_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4095:5: this_unknownConstruct_3= ruleunknownConstruct
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLinkConstructNOSPAccess().getUnknownConstructParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleunknownConstruct_in_rulelinkConstructNOSP9138);
                    this_unknownConstruct_3=ruleunknownConstruct();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_unknownConstruct_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulelinkConstructNOSP"


    // $ANTLR start "entryRulelinkBody"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4113:1: entryRulelinkBody returns [EObject current=null] : iv_rulelinkBody= rulelinkBody EOF ;
    public final EObject entryRulelinkBody() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelinkBody = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4114:2: (iv_rulelinkBody= rulelinkBody EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4115:2: iv_rulelinkBody= rulelinkBody EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLinkBodyRule()); 
            }
            pushFollow(FOLLOW_rulelinkBody_in_entryRulelinkBody9175);
            iv_rulelinkBody=rulelinkBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulelinkBody; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulelinkBody9185); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulelinkBody"


    // $ANTLR start "rulelinkBody"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4122:1: rulelinkBody returns [EObject current=null] : ( () this_LCBRACKET_1= RULE_LCBRACKET ( ruleWS )* ( ( ( (lv_constructs_3_1= rulelinkConstructNOSP | lv_constructs_3_2= ruleconstantAssignment ) ) ) ( ( ruleWS )* ( ( (lv_constructs_5_0= rulelinkConstructNOSP ) ) | ( ruleWS ( (lv_constructs_7_0= ruleconstantAssignment ) ) ) ) )* ( ruleWS )* )? this_RCBRACKET_9= RULE_RCBRACKET ) ;
    public final EObject rulelinkBody() throws RecognitionException {
        EObject current = null;

        Token this_LCBRACKET_1=null;
        Token this_RCBRACKET_9=null;
        EObject lv_constructs_3_1 = null;

        EObject lv_constructs_3_2 = null;

        EObject lv_constructs_5_0 = null;

        EObject lv_constructs_7_0 = null;


         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4125:28: ( ( () this_LCBRACKET_1= RULE_LCBRACKET ( ruleWS )* ( ( ( (lv_constructs_3_1= rulelinkConstructNOSP | lv_constructs_3_2= ruleconstantAssignment ) ) ) ( ( ruleWS )* ( ( (lv_constructs_5_0= rulelinkConstructNOSP ) ) | ( ruleWS ( (lv_constructs_7_0= ruleconstantAssignment ) ) ) ) )* ( ruleWS )* )? this_RCBRACKET_9= RULE_RCBRACKET ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4126:1: ( () this_LCBRACKET_1= RULE_LCBRACKET ( ruleWS )* ( ( ( (lv_constructs_3_1= rulelinkConstructNOSP | lv_constructs_3_2= ruleconstantAssignment ) ) ) ( ( ruleWS )* ( ( (lv_constructs_5_0= rulelinkConstructNOSP ) ) | ( ruleWS ( (lv_constructs_7_0= ruleconstantAssignment ) ) ) ) )* ( ruleWS )* )? this_RCBRACKET_9= RULE_RCBRACKET )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4126:1: ( () this_LCBRACKET_1= RULE_LCBRACKET ( ruleWS )* ( ( ( (lv_constructs_3_1= rulelinkConstructNOSP | lv_constructs_3_2= ruleconstantAssignment ) ) ) ( ( ruleWS )* ( ( (lv_constructs_5_0= rulelinkConstructNOSP ) ) | ( ruleWS ( (lv_constructs_7_0= ruleconstantAssignment ) ) ) ) )* ( ruleWS )* )? this_RCBRACKET_9= RULE_RCBRACKET )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4126:2: () this_LCBRACKET_1= RULE_LCBRACKET ( ruleWS )* ( ( ( (lv_constructs_3_1= rulelinkConstructNOSP | lv_constructs_3_2= ruleconstantAssignment ) ) ) ( ( ruleWS )* ( ( (lv_constructs_5_0= rulelinkConstructNOSP ) ) | ( ruleWS ( (lv_constructs_7_0= ruleconstantAssignment ) ) ) ) )* ( ruleWS )* )? this_RCBRACKET_9= RULE_RCBRACKET
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4126:2: ()
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4127:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLinkBodyAccess().getLinkBodyAction_0(),
                          current);
                  
            }

            }

            this_LCBRACKET_1=(Token)match(input,RULE_LCBRACKET,FOLLOW_RULE_LCBRACKET_in_rulelinkBody9230); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LCBRACKET_1, grammarAccess.getLinkBodyAccess().getLCBRACKETTerminalRuleCall_1()); 
                  
            }
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4136:1: ( ruleWS )*
            loop144:
            do {
                int alt144=2;
                int LA144_0 = input.LA(1);

                if ( ((LA144_0>=RULE_LINESP && LA144_0<=RULE_ML2_COMMENT)) ) {
                    alt144=1;
                }


                switch (alt144) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4137:5: ruleWS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getLinkBodyAccess().getWSParserRuleCall_2()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleWS_in_rulelinkBody9246);
            	    ruleWS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop144;
                }
            } while (true);

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4144:3: ( ( ( (lv_constructs_3_1= rulelinkConstructNOSP | lv_constructs_3_2= ruleconstantAssignment ) ) ) ( ( ruleWS )* ( ( (lv_constructs_5_0= rulelinkConstructNOSP ) ) | ( ruleWS ( (lv_constructs_7_0= ruleconstantAssignment ) ) ) ) )* ( ruleWS )* )?
            int alt150=2;
            int LA150_0 = input.LA(1);

            if ( (LA150_0==RULE_CID||LA150_0==RULE_UNKNOWNDIRECTIVE||(LA150_0>=36 && LA150_0<=38)) ) {
                alt150=1;
            }
            switch (alt150) {
                case 1 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4144:4: ( ( (lv_constructs_3_1= rulelinkConstructNOSP | lv_constructs_3_2= ruleconstantAssignment ) ) ) ( ( ruleWS )* ( ( (lv_constructs_5_0= rulelinkConstructNOSP ) ) | ( ruleWS ( (lv_constructs_7_0= ruleconstantAssignment ) ) ) ) )* ( ruleWS )*
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4144:4: ( ( (lv_constructs_3_1= rulelinkConstructNOSP | lv_constructs_3_2= ruleconstantAssignment ) ) )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4145:1: ( (lv_constructs_3_1= rulelinkConstructNOSP | lv_constructs_3_2= ruleconstantAssignment ) )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4145:1: ( (lv_constructs_3_1= rulelinkConstructNOSP | lv_constructs_3_2= ruleconstantAssignment ) )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4146:1: (lv_constructs_3_1= rulelinkConstructNOSP | lv_constructs_3_2= ruleconstantAssignment )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4146:1: (lv_constructs_3_1= rulelinkConstructNOSP | lv_constructs_3_2= ruleconstantAssignment )
                    int alt145=2;
                    int LA145_0 = input.LA(1);

                    if ( (LA145_0==RULE_UNKNOWNDIRECTIVE||(LA145_0>=36 && LA145_0<=38)) ) {
                        alt145=1;
                    }
                    else if ( (LA145_0==RULE_CID) ) {
                        alt145=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 145, 0, input);

                        throw nvae;
                    }
                    switch (alt145) {
                        case 1 :
                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4147:3: lv_constructs_3_1= rulelinkConstructNOSP
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLinkBodyAccess().getConstructsLinkConstructNOSPParserRuleCall_3_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_rulelinkConstructNOSP_in_rulelinkBody9271);
                            lv_constructs_3_1=rulelinkConstructNOSP();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getLinkBodyRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"constructs",
                                      		lv_constructs_3_1, 
                                      		"linkConstructNOSP");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4162:8: lv_constructs_3_2= ruleconstantAssignment
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLinkBodyAccess().getConstructsConstantAssignmentParserRuleCall_3_0_0_1()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleconstantAssignment_in_rulelinkBody9290);
                            lv_constructs_3_2=ruleconstantAssignment();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getLinkBodyRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"constructs",
                                      		lv_constructs_3_2, 
                                      		"constantAssignment");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4180:2: ( ( ruleWS )* ( ( (lv_constructs_5_0= rulelinkConstructNOSP ) ) | ( ruleWS ( (lv_constructs_7_0= ruleconstantAssignment ) ) ) ) )*
                    loop148:
                    do {
                        int alt148=2;
                        alt148 = dfa148.predict(input);
                        switch (alt148) {
                    	case 1 :
                    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4180:3: ( ruleWS )* ( ( (lv_constructs_5_0= rulelinkConstructNOSP ) ) | ( ruleWS ( (lv_constructs_7_0= ruleconstantAssignment ) ) ) )
                    	    {
                    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4180:3: ( ruleWS )*
                    	    loop146:
                    	    do {
                    	        int alt146=2;
                    	        switch ( input.LA(1) ) {
                    	        case RULE_LINESP:
                    	            {
                    	            int LA146_2 = input.LA(2);

                    	            if ( ((LA146_2>=RULE_LINESP && LA146_2<=RULE_ML2_COMMENT)||LA146_2==RULE_UNKNOWNDIRECTIVE||(LA146_2>=36 && LA146_2<=38)) ) {
                    	                alt146=1;
                    	            }


                    	            }
                    	            break;
                    	        case RULE_LINEDELIM:
                    	            {
                    	            int LA146_3 = input.LA(2);

                    	            if ( ((LA146_3>=RULE_LINESP && LA146_3<=RULE_ML2_COMMENT)||LA146_3==RULE_UNKNOWNDIRECTIVE||(LA146_3>=36 && LA146_3<=38)) ) {
                    	                alt146=1;
                    	            }


                    	            }
                    	            break;
                    	        case RULE_ML_COMMENT:
                    	            {
                    	            int LA146_4 = input.LA(2);

                    	            if ( ((LA146_4>=RULE_LINESP && LA146_4<=RULE_ML2_COMMENT)||LA146_4==RULE_UNKNOWNDIRECTIVE||(LA146_4>=36 && LA146_4<=38)) ) {
                    	                alt146=1;
                    	            }


                    	            }
                    	            break;
                    	        case RULE_ML2_COMMENT:
                    	            {
                    	            int LA146_5 = input.LA(2);

                    	            if ( ((LA146_5>=RULE_LINESP && LA146_5<=RULE_ML2_COMMENT)||LA146_5==RULE_UNKNOWNDIRECTIVE||(LA146_5>=36 && LA146_5<=38)) ) {
                    	                alt146=1;
                    	            }


                    	            }
                    	            break;

                    	        }

                    	        switch (alt146) {
                    	    	case 1 :
                    	    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4181:5: ruleWS
                    	    	    {
                    	    	    if ( state.backtracking==0 ) {
                    	    	       
                    	    	              newCompositeNode(grammarAccess.getLinkBodyAccess().getWSParserRuleCall_3_1_0()); 
                    	    	          
                    	    	    }
                    	    	    pushFollow(FOLLOW_ruleWS_in_rulelinkBody9311);
                    	    	    ruleWS();

                    	    	    state._fsp--;
                    	    	    if (state.failed) return current;
                    	    	    if ( state.backtracking==0 ) {
                    	    	       
                    	    	              afterParserOrEnumRuleCall();
                    	    	          
                    	    	    }

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop146;
                    	        }
                    	    } while (true);

                    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4188:3: ( ( (lv_constructs_5_0= rulelinkConstructNOSP ) ) | ( ruleWS ( (lv_constructs_7_0= ruleconstantAssignment ) ) ) )
                    	    int alt147=2;
                    	    int LA147_0 = input.LA(1);

                    	    if ( (LA147_0==RULE_UNKNOWNDIRECTIVE||(LA147_0>=36 && LA147_0<=38)) ) {
                    	        alt147=1;
                    	    }
                    	    else if ( ((LA147_0>=RULE_LINESP && LA147_0<=RULE_ML2_COMMENT)) ) {
                    	        alt147=2;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 147, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt147) {
                    	        case 1 :
                    	            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4188:4: ( (lv_constructs_5_0= rulelinkConstructNOSP ) )
                    	            {
                    	            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4188:4: ( (lv_constructs_5_0= rulelinkConstructNOSP ) )
                    	            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4189:1: (lv_constructs_5_0= rulelinkConstructNOSP )
                    	            {
                    	            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4189:1: (lv_constructs_5_0= rulelinkConstructNOSP )
                    	            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4190:3: lv_constructs_5_0= rulelinkConstructNOSP
                    	            {
                    	            if ( state.backtracking==0 ) {
                    	               
                    	              	        newCompositeNode(grammarAccess.getLinkBodyAccess().getConstructsLinkConstructNOSPParserRuleCall_3_1_1_0_0()); 
                    	              	    
                    	            }
                    	            pushFollow(FOLLOW_rulelinkConstructNOSP_in_rulelinkBody9334);
                    	            lv_constructs_5_0=rulelinkConstructNOSP();

                    	            state._fsp--;
                    	            if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = createModelElementForParent(grammarAccess.getLinkBodyRule());
                    	              	        }
                    	                     		add(
                    	                     			current, 
                    	                     			"constructs",
                    	                      		lv_constructs_5_0, 
                    	                      		"linkConstructNOSP");
                    	              	        afterParserOrEnumRuleCall();
                    	              	    
                    	            }

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4207:6: ( ruleWS ( (lv_constructs_7_0= ruleconstantAssignment ) ) )
                    	            {
                    	            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4207:6: ( ruleWS ( (lv_constructs_7_0= ruleconstantAssignment ) ) )
                    	            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4208:5: ruleWS ( (lv_constructs_7_0= ruleconstantAssignment ) )
                    	            {
                    	            if ( state.backtracking==0 ) {
                    	               
                    	                      newCompositeNode(grammarAccess.getLinkBodyAccess().getWSParserRuleCall_3_1_1_1_0()); 
                    	                  
                    	            }
                    	            pushFollow(FOLLOW_ruleWS_in_rulelinkBody9357);
                    	            ruleWS();

                    	            state._fsp--;
                    	            if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {
                    	               
                    	                      afterParserOrEnumRuleCall();
                    	                  
                    	            }
                    	            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4215:1: ( (lv_constructs_7_0= ruleconstantAssignment ) )
                    	            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4216:1: (lv_constructs_7_0= ruleconstantAssignment )
                    	            {
                    	            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4216:1: (lv_constructs_7_0= ruleconstantAssignment )
                    	            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4217:3: lv_constructs_7_0= ruleconstantAssignment
                    	            {
                    	            if ( state.backtracking==0 ) {
                    	               
                    	              	        newCompositeNode(grammarAccess.getLinkBodyAccess().getConstructsConstantAssignmentParserRuleCall_3_1_1_1_1_0()); 
                    	              	    
                    	            }
                    	            pushFollow(FOLLOW_ruleconstantAssignment_in_rulelinkBody9377);
                    	            lv_constructs_7_0=ruleconstantAssignment();

                    	            state._fsp--;
                    	            if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = createModelElementForParent(grammarAccess.getLinkBodyRule());
                    	              	        }
                    	                     		add(
                    	                     			current, 
                    	                     			"constructs",
                    	                      		lv_constructs_7_0, 
                    	                      		"constantAssignment");
                    	              	        afterParserOrEnumRuleCall();
                    	              	    
                    	            }

                    	            }


                    	            }


                    	            }


                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop148;
                        }
                    } while (true);

                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4233:6: ( ruleWS )*
                    loop149:
                    do {
                        int alt149=2;
                        int LA149_0 = input.LA(1);

                        if ( ((LA149_0>=RULE_LINESP && LA149_0<=RULE_ML2_COMMENT)) ) {
                            alt149=1;
                        }


                        switch (alt149) {
                    	case 1 :
                    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4234:5: ruleWS
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getLinkBodyAccess().getWSParserRuleCall_3_2()); 
                    	          
                    	    }
                    	    pushFollow(FOLLOW_ruleWS_in_rulelinkBody9398);
                    	    ruleWS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              afterParserOrEnumRuleCall();
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop149;
                        }
                    } while (true);


                    }
                    break;

            }

            this_RCBRACKET_9=(Token)match(input,RULE_RCBRACKET,FOLLOW_RULE_RCBRACKET_in_rulelinkBody9412); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RCBRACKET_9, grammarAccess.getLinkBodyAccess().getRCBRACKETTerminalRuleCall_4()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulelinkBody"


    // $ANTLR start "entryRuleviewDeclaration"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4253:1: entryRuleviewDeclaration returns [EObject current=null] : iv_ruleviewDeclaration= ruleviewDeclaration EOF ;
    public final EObject entryRuleviewDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleviewDeclaration = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4254:2: (iv_ruleviewDeclaration= ruleviewDeclaration EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4255:2: iv_ruleviewDeclaration= ruleviewDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getViewDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleviewDeclaration_in_entryRuleviewDeclaration9447);
            iv_ruleviewDeclaration=ruleviewDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleviewDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleviewDeclaration9457); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleviewDeclaration"


    // $ANTLR start "ruleviewDeclaration"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4262:1: ruleviewDeclaration returns [EObject current=null] : (otherlv_0= '%view' ( ruleWS )+ (otherlv_2= '%implicit' ( ruleWS )+ )? ( (lv_name_4_0= RULE_CID ) ) ( ruleWS )* this_COLON_6= RULE_COLON ( ruleWS )* ( ( ruleID ) ) ( ruleWS )+ this_ARROW_10= RULE_ARROW ( ruleWS )+ ( (lv_to_12_0= rulemorphism ) ) ( ruleWS )+ this_EQUALS_14= RULE_EQUALS ( ruleWS )* ( ( (lv_def_16_0= rulelinkBody ) ) | ( ruleWS ( (lv_def_18_0= rulemorphism ) ) ) ) ( ruleWS )* this_DOT_20= RULE_DOT ) ;
    public final EObject ruleviewDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_name_4_0=null;
        Token this_COLON_6=null;
        Token this_ARROW_10=null;
        Token this_EQUALS_14=null;
        Token this_DOT_20=null;
        EObject lv_to_12_0 = null;

        EObject lv_def_16_0 = null;

        EObject lv_def_18_0 = null;


         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4265:28: ( (otherlv_0= '%view' ( ruleWS )+ (otherlv_2= '%implicit' ( ruleWS )+ )? ( (lv_name_4_0= RULE_CID ) ) ( ruleWS )* this_COLON_6= RULE_COLON ( ruleWS )* ( ( ruleID ) ) ( ruleWS )+ this_ARROW_10= RULE_ARROW ( ruleWS )+ ( (lv_to_12_0= rulemorphism ) ) ( ruleWS )+ this_EQUALS_14= RULE_EQUALS ( ruleWS )* ( ( (lv_def_16_0= rulelinkBody ) ) | ( ruleWS ( (lv_def_18_0= rulemorphism ) ) ) ) ( ruleWS )* this_DOT_20= RULE_DOT ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4266:1: (otherlv_0= '%view' ( ruleWS )+ (otherlv_2= '%implicit' ( ruleWS )+ )? ( (lv_name_4_0= RULE_CID ) ) ( ruleWS )* this_COLON_6= RULE_COLON ( ruleWS )* ( ( ruleID ) ) ( ruleWS )+ this_ARROW_10= RULE_ARROW ( ruleWS )+ ( (lv_to_12_0= rulemorphism ) ) ( ruleWS )+ this_EQUALS_14= RULE_EQUALS ( ruleWS )* ( ( (lv_def_16_0= rulelinkBody ) ) | ( ruleWS ( (lv_def_18_0= rulemorphism ) ) ) ) ( ruleWS )* this_DOT_20= RULE_DOT )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4266:1: (otherlv_0= '%view' ( ruleWS )+ (otherlv_2= '%implicit' ( ruleWS )+ )? ( (lv_name_4_0= RULE_CID ) ) ( ruleWS )* this_COLON_6= RULE_COLON ( ruleWS )* ( ( ruleID ) ) ( ruleWS )+ this_ARROW_10= RULE_ARROW ( ruleWS )+ ( (lv_to_12_0= rulemorphism ) ) ( ruleWS )+ this_EQUALS_14= RULE_EQUALS ( ruleWS )* ( ( (lv_def_16_0= rulelinkBody ) ) | ( ruleWS ( (lv_def_18_0= rulemorphism ) ) ) ) ( ruleWS )* this_DOT_20= RULE_DOT )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4266:3: otherlv_0= '%view' ( ruleWS )+ (otherlv_2= '%implicit' ( ruleWS )+ )? ( (lv_name_4_0= RULE_CID ) ) ( ruleWS )* this_COLON_6= RULE_COLON ( ruleWS )* ( ( ruleID ) ) ( ruleWS )+ this_ARROW_10= RULE_ARROW ( ruleWS )+ ( (lv_to_12_0= rulemorphism ) ) ( ruleWS )+ this_EQUALS_14= RULE_EQUALS ( ruleWS )* ( ( (lv_def_16_0= rulelinkBody ) ) | ( ruleWS ( (lv_def_18_0= rulemorphism ) ) ) ) ( ruleWS )* this_DOT_20= RULE_DOT
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleviewDeclaration9494); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getViewDeclarationAccess().getViewKeyword_0());
                  
            }
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4270:1: ( ruleWS )+
            int cnt151=0;
            loop151:
            do {
                int alt151=2;
                int LA151_0 = input.LA(1);

                if ( ((LA151_0>=RULE_LINESP && LA151_0<=RULE_ML2_COMMENT)) ) {
                    alt151=1;
                }


                switch (alt151) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4271:5: ruleWS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleWS_in_ruleviewDeclaration9511);
            	    ruleWS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt151 >= 1 ) break loop151;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(151, input);
                        throw eee;
                }
                cnt151++;
            } while (true);

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4278:3: (otherlv_2= '%implicit' ( ruleWS )+ )?
            int alt153=2;
            int LA153_0 = input.LA(1);

            if ( (LA153_0==39) ) {
                alt153=1;
            }
            switch (alt153) {
                case 1 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4278:5: otherlv_2= '%implicit' ( ruleWS )+
                    {
                    otherlv_2=(Token)match(input,39,FOLLOW_39_in_ruleviewDeclaration9525); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getViewDeclarationAccess().getImplicitKeyword_2_0());
                          
                    }
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4282:1: ( ruleWS )+
                    int cnt152=0;
                    loop152:
                    do {
                        int alt152=2;
                        int LA152_0 = input.LA(1);

                        if ( ((LA152_0>=RULE_LINESP && LA152_0<=RULE_ML2_COMMENT)) ) {
                            alt152=1;
                        }


                        switch (alt152) {
                    	case 1 :
                    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4283:5: ruleWS
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_2_1()); 
                    	          
                    	    }
                    	    pushFollow(FOLLOW_ruleWS_in_ruleviewDeclaration9542);
                    	    ruleWS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              afterParserOrEnumRuleCall();
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt152 >= 1 ) break loop152;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(152, input);
                                throw eee;
                        }
                        cnt152++;
                    } while (true);


                    }
                    break;

            }

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4290:5: ( (lv_name_4_0= RULE_CID ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4291:1: (lv_name_4_0= RULE_CID )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4291:1: (lv_name_4_0= RULE_CID )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4292:3: lv_name_4_0= RULE_CID
            {
            lv_name_4_0=(Token)match(input,RULE_CID,FOLLOW_RULE_CID_in_ruleviewDeclaration9562); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_4_0, grammarAccess.getViewDeclarationAccess().getNameCIDTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getViewDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_4_0, 
                      		"CID");
              	    
            }

            }


            }

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4308:2: ( ruleWS )*
            loop154:
            do {
                int alt154=2;
                int LA154_0 = input.LA(1);

                if ( ((LA154_0>=RULE_LINESP && LA154_0<=RULE_ML2_COMMENT)) ) {
                    alt154=1;
                }


                switch (alt154) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4309:5: ruleWS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_4()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleWS_in_ruleviewDeclaration9584);
            	    ruleWS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop154;
                }
            } while (true);

            this_COLON_6=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleviewDeclaration9596); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_COLON_6, grammarAccess.getViewDeclarationAccess().getCOLONTerminalRuleCall_5()); 
                  
            }
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4320:1: ( ruleWS )*
            loop155:
            do {
                int alt155=2;
                int LA155_0 = input.LA(1);

                if ( ((LA155_0>=RULE_LINESP && LA155_0<=RULE_ML2_COMMENT)) ) {
                    alt155=1;
                }


                switch (alt155) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4321:5: ruleWS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_6()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleWS_in_ruleviewDeclaration9612);
            	    ruleWS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop155;
                }
            } while (true);

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4328:3: ( ( ruleID ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4329:1: ( ruleID )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4329:1: ( ruleID )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4330:3: ruleID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getViewDeclarationRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getViewDeclarationAccess().getFromSigDeclarationCrossReference_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleID_in_ruleviewDeclaration9636);
            ruleID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4343:2: ( ruleWS )+
            int cnt156=0;
            loop156:
            do {
                int alt156=2;
                int LA156_0 = input.LA(1);

                if ( ((LA156_0>=RULE_LINESP && LA156_0<=RULE_ML2_COMMENT)) ) {
                    alt156=1;
                }


                switch (alt156) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4344:5: ruleWS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_8()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleWS_in_ruleviewDeclaration9653);
            	    ruleWS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt156 >= 1 ) break loop156;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(156, input);
                        throw eee;
                }
                cnt156++;
            } while (true);

            this_ARROW_10=(Token)match(input,RULE_ARROW,FOLLOW_RULE_ARROW_in_ruleviewDeclaration9665); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ARROW_10, grammarAccess.getViewDeclarationAccess().getARROWTerminalRuleCall_9()); 
                  
            }
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4355:1: ( ruleWS )+
            int cnt157=0;
            loop157:
            do {
                int alt157=2;
                int LA157_0 = input.LA(1);

                if ( ((LA157_0>=RULE_LINESP && LA157_0<=RULE_ML2_COMMENT)) ) {
                    alt157=1;
                }


                switch (alt157) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4356:5: ruleWS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_10()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleWS_in_ruleviewDeclaration9681);
            	    ruleWS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt157 >= 1 ) break loop157;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(157, input);
                        throw eee;
                }
                cnt157++;
            } while (true);

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4363:3: ( (lv_to_12_0= rulemorphism ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4364:1: (lv_to_12_0= rulemorphism )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4364:1: (lv_to_12_0= rulemorphism )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4365:3: lv_to_12_0= rulemorphism
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getViewDeclarationAccess().getToMorphismParserRuleCall_11_0()); 
              	    
            }
            pushFollow(FOLLOW_rulemorphism_in_ruleviewDeclaration9703);
            lv_to_12_0=rulemorphism();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getViewDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"to",
                      		lv_to_12_0, 
                      		"morphism");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4381:2: ( ruleWS )+
            int cnt158=0;
            loop158:
            do {
                int alt158=2;
                int LA158_0 = input.LA(1);

                if ( ((LA158_0>=RULE_LINESP && LA158_0<=RULE_ML2_COMMENT)) ) {
                    alt158=1;
                }


                switch (alt158) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4382:5: ruleWS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_12()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleWS_in_ruleviewDeclaration9720);
            	    ruleWS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt158 >= 1 ) break loop158;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(158, input);
                        throw eee;
                }
                cnt158++;
            } while (true);

            this_EQUALS_14=(Token)match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_ruleviewDeclaration9732); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_EQUALS_14, grammarAccess.getViewDeclarationAccess().getEQUALSTerminalRuleCall_13()); 
                  
            }
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4393:1: ( ruleWS )*
            loop159:
            do {
                int alt159=2;
                switch ( input.LA(1) ) {
                case RULE_LINESP:
                    {
                    int LA159_2 = input.LA(2);

                    if ( (LA159_2==RULE_LCBRACKET||(LA159_2>=RULE_LINESP && LA159_2<=RULE_ML2_COMMENT)) ) {
                        alt159=1;
                    }


                    }
                    break;
                case RULE_LINEDELIM:
                    {
                    int LA159_3 = input.LA(2);

                    if ( (LA159_3==RULE_LCBRACKET||(LA159_3>=RULE_LINESP && LA159_3<=RULE_ML2_COMMENT)) ) {
                        alt159=1;
                    }


                    }
                    break;
                case RULE_ML_COMMENT:
                    {
                    int LA159_4 = input.LA(2);

                    if ( (LA159_4==RULE_LCBRACKET||(LA159_4>=RULE_LINESP && LA159_4<=RULE_ML2_COMMENT)) ) {
                        alt159=1;
                    }


                    }
                    break;
                case RULE_ML2_COMMENT:
                    {
                    int LA159_5 = input.LA(2);

                    if ( (LA159_5==RULE_LCBRACKET||(LA159_5>=RULE_LINESP && LA159_5<=RULE_ML2_COMMENT)) ) {
                        alt159=1;
                    }


                    }
                    break;

                }

                switch (alt159) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4394:5: ruleWS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_14()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleWS_in_ruleviewDeclaration9748);
            	    ruleWS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop159;
                }
            } while (true);

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4401:3: ( ( (lv_def_16_0= rulelinkBody ) ) | ( ruleWS ( (lv_def_18_0= rulemorphism ) ) ) )
            int alt160=2;
            int LA160_0 = input.LA(1);

            if ( (LA160_0==RULE_LCBRACKET) ) {
                alt160=1;
            }
            else if ( ((LA160_0>=RULE_LINESP && LA160_0<=RULE_ML2_COMMENT)) ) {
                alt160=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 160, 0, input);

                throw nvae;
            }
            switch (alt160) {
                case 1 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4401:4: ( (lv_def_16_0= rulelinkBody ) )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4401:4: ( (lv_def_16_0= rulelinkBody ) )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4402:1: (lv_def_16_0= rulelinkBody )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4402:1: (lv_def_16_0= rulelinkBody )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4403:3: lv_def_16_0= rulelinkBody
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getViewDeclarationAccess().getDefLinkBodyParserRuleCall_15_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulelinkBody_in_ruleviewDeclaration9771);
                    lv_def_16_0=rulelinkBody();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getViewDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"def",
                              		lv_def_16_0, 
                              		"linkBody");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4420:6: ( ruleWS ( (lv_def_18_0= rulemorphism ) ) )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4420:6: ( ruleWS ( (lv_def_18_0= rulemorphism ) ) )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4421:5: ruleWS ( (lv_def_18_0= rulemorphism ) )
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_15_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleWS_in_ruleviewDeclaration9794);
                    ruleWS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4428:1: ( (lv_def_18_0= rulemorphism ) )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4429:1: (lv_def_18_0= rulemorphism )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4429:1: (lv_def_18_0= rulemorphism )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4430:3: lv_def_18_0= rulemorphism
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getViewDeclarationAccess().getDefMorphismParserRuleCall_15_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulemorphism_in_ruleviewDeclaration9814);
                    lv_def_18_0=rulemorphism();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getViewDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"def",
                              		lv_def_18_0, 
                              		"morphism");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4446:4: ( ruleWS )*
            loop161:
            do {
                int alt161=2;
                int LA161_0 = input.LA(1);

                if ( ((LA161_0>=RULE_LINESP && LA161_0<=RULE_ML2_COMMENT)) ) {
                    alt161=1;
                }


                switch (alt161) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4447:5: ruleWS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getViewDeclarationAccess().getWSParserRuleCall_16()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleWS_in_ruleviewDeclaration9833);
            	    ruleWS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop161;
                }
            } while (true);

            this_DOT_20=(Token)match(input,RULE_DOT,FOLLOW_RULE_DOT_in_ruleviewDeclaration9845); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_DOT_20, grammarAccess.getViewDeclarationAccess().getDOTTerminalRuleCall_17()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleviewDeclaration"


    // $ANTLR start "entryRuleinternalViewDeclaration"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4466:1: entryRuleinternalViewDeclaration returns [EObject current=null] : iv_ruleinternalViewDeclaration= ruleinternalViewDeclaration EOF ;
    public final EObject entryRuleinternalViewDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleinternalViewDeclaration = null;


        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4467:2: (iv_ruleinternalViewDeclaration= ruleinternalViewDeclaration EOF )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4468:2: iv_ruleinternalViewDeclaration= ruleinternalViewDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInternalViewDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleinternalViewDeclaration_in_entryRuleinternalViewDeclaration9880);
            iv_ruleinternalViewDeclaration=ruleinternalViewDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleinternalViewDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleinternalViewDeclaration9890); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleinternalViewDeclaration"


    // $ANTLR start "ruleinternalViewDeclaration"
    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4475:1: ruleinternalViewDeclaration returns [EObject current=null] : (otherlv_0= '%view' ( ruleWS )+ (otherlv_2= '%implicit' ( ruleWS )+ )? ( (lv_name_4_0= RULE_CID ) ) ( ruleWS )* this_COLON_6= RULE_COLON ( ruleWS )* ( ( ruleID ) ) ( ruleWS )+ this_ARROW_10= RULE_ARROW ( ruleWS )+ ( ( (lv_to_12_0= rulemorphism ) ) ( ruleWS )+ )? this_EQUALS_14= RULE_EQUALS ( ruleWS )* ( ( (lv_def_16_0= rulelinkBody ) ) | ( ruleWS ( (lv_def_18_0= rulemorphism ) ) ) ) ( ruleWS )* this_DOT_20= RULE_DOT ) ;
    public final EObject ruleinternalViewDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_name_4_0=null;
        Token this_COLON_6=null;
        Token this_ARROW_10=null;
        Token this_EQUALS_14=null;
        Token this_DOT_20=null;
        EObject lv_to_12_0 = null;

        EObject lv_def_16_0 = null;

        EObject lv_def_18_0 = null;


         enterRule(); 
            
        try {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4478:28: ( (otherlv_0= '%view' ( ruleWS )+ (otherlv_2= '%implicit' ( ruleWS )+ )? ( (lv_name_4_0= RULE_CID ) ) ( ruleWS )* this_COLON_6= RULE_COLON ( ruleWS )* ( ( ruleID ) ) ( ruleWS )+ this_ARROW_10= RULE_ARROW ( ruleWS )+ ( ( (lv_to_12_0= rulemorphism ) ) ( ruleWS )+ )? this_EQUALS_14= RULE_EQUALS ( ruleWS )* ( ( (lv_def_16_0= rulelinkBody ) ) | ( ruleWS ( (lv_def_18_0= rulemorphism ) ) ) ) ( ruleWS )* this_DOT_20= RULE_DOT ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4479:1: (otherlv_0= '%view' ( ruleWS )+ (otherlv_2= '%implicit' ( ruleWS )+ )? ( (lv_name_4_0= RULE_CID ) ) ( ruleWS )* this_COLON_6= RULE_COLON ( ruleWS )* ( ( ruleID ) ) ( ruleWS )+ this_ARROW_10= RULE_ARROW ( ruleWS )+ ( ( (lv_to_12_0= rulemorphism ) ) ( ruleWS )+ )? this_EQUALS_14= RULE_EQUALS ( ruleWS )* ( ( (lv_def_16_0= rulelinkBody ) ) | ( ruleWS ( (lv_def_18_0= rulemorphism ) ) ) ) ( ruleWS )* this_DOT_20= RULE_DOT )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4479:1: (otherlv_0= '%view' ( ruleWS )+ (otherlv_2= '%implicit' ( ruleWS )+ )? ( (lv_name_4_0= RULE_CID ) ) ( ruleWS )* this_COLON_6= RULE_COLON ( ruleWS )* ( ( ruleID ) ) ( ruleWS )+ this_ARROW_10= RULE_ARROW ( ruleWS )+ ( ( (lv_to_12_0= rulemorphism ) ) ( ruleWS )+ )? this_EQUALS_14= RULE_EQUALS ( ruleWS )* ( ( (lv_def_16_0= rulelinkBody ) ) | ( ruleWS ( (lv_def_18_0= rulemorphism ) ) ) ) ( ruleWS )* this_DOT_20= RULE_DOT )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4479:3: otherlv_0= '%view' ( ruleWS )+ (otherlv_2= '%implicit' ( ruleWS )+ )? ( (lv_name_4_0= RULE_CID ) ) ( ruleWS )* this_COLON_6= RULE_COLON ( ruleWS )* ( ( ruleID ) ) ( ruleWS )+ this_ARROW_10= RULE_ARROW ( ruleWS )+ ( ( (lv_to_12_0= rulemorphism ) ) ( ruleWS )+ )? this_EQUALS_14= RULE_EQUALS ( ruleWS )* ( ( (lv_def_16_0= rulelinkBody ) ) | ( ruleWS ( (lv_def_18_0= rulemorphism ) ) ) ) ( ruleWS )* this_DOT_20= RULE_DOT
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleinternalViewDeclaration9927); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getInternalViewDeclarationAccess().getViewKeyword_0());
                  
            }
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4483:1: ( ruleWS )+
            int cnt162=0;
            loop162:
            do {
                int alt162=2;
                int LA162_0 = input.LA(1);

                if ( ((LA162_0>=RULE_LINESP && LA162_0<=RULE_ML2_COMMENT)) ) {
                    alt162=1;
                }


                switch (alt162) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4484:5: ruleWS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getInternalViewDeclarationAccess().getWSParserRuleCall_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleWS_in_ruleinternalViewDeclaration9944);
            	    ruleWS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt162 >= 1 ) break loop162;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(162, input);
                        throw eee;
                }
                cnt162++;
            } while (true);

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4491:3: (otherlv_2= '%implicit' ( ruleWS )+ )?
            int alt164=2;
            int LA164_0 = input.LA(1);

            if ( (LA164_0==39) ) {
                alt164=1;
            }
            switch (alt164) {
                case 1 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4491:5: otherlv_2= '%implicit' ( ruleWS )+
                    {
                    otherlv_2=(Token)match(input,39,FOLLOW_39_in_ruleinternalViewDeclaration9958); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getInternalViewDeclarationAccess().getImplicitKeyword_2_0());
                          
                    }
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4495:1: ( ruleWS )+
                    int cnt163=0;
                    loop163:
                    do {
                        int alt163=2;
                        int LA163_0 = input.LA(1);

                        if ( ((LA163_0>=RULE_LINESP && LA163_0<=RULE_ML2_COMMENT)) ) {
                            alt163=1;
                        }


                        switch (alt163) {
                    	case 1 :
                    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4496:5: ruleWS
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getInternalViewDeclarationAccess().getWSParserRuleCall_2_1()); 
                    	          
                    	    }
                    	    pushFollow(FOLLOW_ruleWS_in_ruleinternalViewDeclaration9975);
                    	    ruleWS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              afterParserOrEnumRuleCall();
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt163 >= 1 ) break loop163;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(163, input);
                                throw eee;
                        }
                        cnt163++;
                    } while (true);


                    }
                    break;

            }

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4503:5: ( (lv_name_4_0= RULE_CID ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4504:1: (lv_name_4_0= RULE_CID )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4504:1: (lv_name_4_0= RULE_CID )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4505:3: lv_name_4_0= RULE_CID
            {
            lv_name_4_0=(Token)match(input,RULE_CID,FOLLOW_RULE_CID_in_ruleinternalViewDeclaration9995); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_4_0, grammarAccess.getInternalViewDeclarationAccess().getNameCIDTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getInternalViewDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_4_0, 
                      		"CID");
              	    
            }

            }


            }

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4521:2: ( ruleWS )*
            loop165:
            do {
                int alt165=2;
                int LA165_0 = input.LA(1);

                if ( ((LA165_0>=RULE_LINESP && LA165_0<=RULE_ML2_COMMENT)) ) {
                    alt165=1;
                }


                switch (alt165) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4522:5: ruleWS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getInternalViewDeclarationAccess().getWSParserRuleCall_4()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleWS_in_ruleinternalViewDeclaration10017);
            	    ruleWS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop165;
                }
            } while (true);

            this_COLON_6=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleinternalViewDeclaration10029); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_COLON_6, grammarAccess.getInternalViewDeclarationAccess().getCOLONTerminalRuleCall_5()); 
                  
            }
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4533:1: ( ruleWS )*
            loop166:
            do {
                int alt166=2;
                int LA166_0 = input.LA(1);

                if ( ((LA166_0>=RULE_LINESP && LA166_0<=RULE_ML2_COMMENT)) ) {
                    alt166=1;
                }


                switch (alt166) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4534:5: ruleWS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getInternalViewDeclarationAccess().getWSParserRuleCall_6()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleWS_in_ruleinternalViewDeclaration10045);
            	    ruleWS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop166;
                }
            } while (true);

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4541:3: ( ( ruleID ) )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4542:1: ( ruleID )
            {
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4542:1: ( ruleID )
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4543:3: ruleID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getInternalViewDeclarationRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInternalViewDeclarationAccess().getFromSigDeclarationCrossReference_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleID_in_ruleinternalViewDeclaration10069);
            ruleID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4556:2: ( ruleWS )+
            int cnt167=0;
            loop167:
            do {
                int alt167=2;
                int LA167_0 = input.LA(1);

                if ( ((LA167_0>=RULE_LINESP && LA167_0<=RULE_ML2_COMMENT)) ) {
                    alt167=1;
                }


                switch (alt167) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4557:5: ruleWS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getInternalViewDeclarationAccess().getWSParserRuleCall_8()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleWS_in_ruleinternalViewDeclaration10086);
            	    ruleWS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt167 >= 1 ) break loop167;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(167, input);
                        throw eee;
                }
                cnt167++;
            } while (true);

            this_ARROW_10=(Token)match(input,RULE_ARROW,FOLLOW_RULE_ARROW_in_ruleinternalViewDeclaration10098); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ARROW_10, grammarAccess.getInternalViewDeclarationAccess().getARROWTerminalRuleCall_9()); 
                  
            }
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4568:1: ( ruleWS )+
            int cnt168=0;
            loop168:
            do {
                int alt168=2;
                int LA168_0 = input.LA(1);

                if ( ((LA168_0>=RULE_LINESP && LA168_0<=RULE_ML2_COMMENT)) ) {
                    alt168=1;
                }


                switch (alt168) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4569:5: ruleWS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getInternalViewDeclarationAccess().getWSParserRuleCall_10()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleWS_in_ruleinternalViewDeclaration10114);
            	    ruleWS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt168 >= 1 ) break loop168;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(168, input);
                        throw eee;
                }
                cnt168++;
            } while (true);

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4576:3: ( ( (lv_to_12_0= rulemorphism ) ) ( ruleWS )+ )?
            int alt170=2;
            int LA170_0 = input.LA(1);

            if ( (LA170_0==RULE_CID) ) {
                alt170=1;
            }
            switch (alt170) {
                case 1 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4576:4: ( (lv_to_12_0= rulemorphism ) ) ( ruleWS )+
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4576:4: ( (lv_to_12_0= rulemorphism ) )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4577:1: (lv_to_12_0= rulemorphism )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4577:1: (lv_to_12_0= rulemorphism )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4578:3: lv_to_12_0= rulemorphism
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInternalViewDeclarationAccess().getToMorphismParserRuleCall_11_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulemorphism_in_ruleinternalViewDeclaration10137);
                    lv_to_12_0=rulemorphism();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInternalViewDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"to",
                              		lv_to_12_0, 
                              		"morphism");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4594:2: ( ruleWS )+
                    int cnt169=0;
                    loop169:
                    do {
                        int alt169=2;
                        int LA169_0 = input.LA(1);

                        if ( ((LA169_0>=RULE_LINESP && LA169_0<=RULE_ML2_COMMENT)) ) {
                            alt169=1;
                        }


                        switch (alt169) {
                    	case 1 :
                    	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4595:5: ruleWS
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getInternalViewDeclarationAccess().getWSParserRuleCall_11_1()); 
                    	          
                    	    }
                    	    pushFollow(FOLLOW_ruleWS_in_ruleinternalViewDeclaration10154);
                    	    ruleWS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              afterParserOrEnumRuleCall();
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt169 >= 1 ) break loop169;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(169, input);
                                throw eee;
                        }
                        cnt169++;
                    } while (true);


                    }
                    break;

            }

            this_EQUALS_14=(Token)match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_ruleinternalViewDeclaration10168); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_EQUALS_14, grammarAccess.getInternalViewDeclarationAccess().getEQUALSTerminalRuleCall_12()); 
                  
            }
            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4606:1: ( ruleWS )*
            loop171:
            do {
                int alt171=2;
                switch ( input.LA(1) ) {
                case RULE_LINESP:
                    {
                    int LA171_2 = input.LA(2);

                    if ( (LA171_2==RULE_LCBRACKET||(LA171_2>=RULE_LINESP && LA171_2<=RULE_ML2_COMMENT)) ) {
                        alt171=1;
                    }


                    }
                    break;
                case RULE_LINEDELIM:
                    {
                    int LA171_3 = input.LA(2);

                    if ( (LA171_3==RULE_LCBRACKET||(LA171_3>=RULE_LINESP && LA171_3<=RULE_ML2_COMMENT)) ) {
                        alt171=1;
                    }


                    }
                    break;
                case RULE_ML_COMMENT:
                    {
                    int LA171_4 = input.LA(2);

                    if ( (LA171_4==RULE_LCBRACKET||(LA171_4>=RULE_LINESP && LA171_4<=RULE_ML2_COMMENT)) ) {
                        alt171=1;
                    }


                    }
                    break;
                case RULE_ML2_COMMENT:
                    {
                    int LA171_5 = input.LA(2);

                    if ( (LA171_5==RULE_LCBRACKET||(LA171_5>=RULE_LINESP && LA171_5<=RULE_ML2_COMMENT)) ) {
                        alt171=1;
                    }


                    }
                    break;

                }

                switch (alt171) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4607:5: ruleWS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getInternalViewDeclarationAccess().getWSParserRuleCall_13()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleWS_in_ruleinternalViewDeclaration10184);
            	    ruleWS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop171;
                }
            } while (true);

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4614:3: ( ( (lv_def_16_0= rulelinkBody ) ) | ( ruleWS ( (lv_def_18_0= rulemorphism ) ) ) )
            int alt172=2;
            int LA172_0 = input.LA(1);

            if ( (LA172_0==RULE_LCBRACKET) ) {
                alt172=1;
            }
            else if ( ((LA172_0>=RULE_LINESP && LA172_0<=RULE_ML2_COMMENT)) ) {
                alt172=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 172, 0, input);

                throw nvae;
            }
            switch (alt172) {
                case 1 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4614:4: ( (lv_def_16_0= rulelinkBody ) )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4614:4: ( (lv_def_16_0= rulelinkBody ) )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4615:1: (lv_def_16_0= rulelinkBody )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4615:1: (lv_def_16_0= rulelinkBody )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4616:3: lv_def_16_0= rulelinkBody
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInternalViewDeclarationAccess().getDefLinkBodyParserRuleCall_14_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulelinkBody_in_ruleinternalViewDeclaration10207);
                    lv_def_16_0=rulelinkBody();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInternalViewDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"def",
                              		lv_def_16_0, 
                              		"linkBody");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4633:6: ( ruleWS ( (lv_def_18_0= rulemorphism ) ) )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4633:6: ( ruleWS ( (lv_def_18_0= rulemorphism ) ) )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4634:5: ruleWS ( (lv_def_18_0= rulemorphism ) )
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInternalViewDeclarationAccess().getWSParserRuleCall_14_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleWS_in_ruleinternalViewDeclaration10230);
                    ruleWS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4641:1: ( (lv_def_18_0= rulemorphism ) )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4642:1: (lv_def_18_0= rulemorphism )
                    {
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4642:1: (lv_def_18_0= rulemorphism )
                    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4643:3: lv_def_18_0= rulemorphism
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInternalViewDeclarationAccess().getDefMorphismParserRuleCall_14_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulemorphism_in_ruleinternalViewDeclaration10250);
                    lv_def_18_0=rulemorphism();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInternalViewDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"def",
                              		lv_def_18_0, 
                              		"morphism");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4659:4: ( ruleWS )*
            loop173:
            do {
                int alt173=2;
                int LA173_0 = input.LA(1);

                if ( ((LA173_0>=RULE_LINESP && LA173_0<=RULE_ML2_COMMENT)) ) {
                    alt173=1;
                }


                switch (alt173) {
            	case 1 :
            	    // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:4660:5: ruleWS
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getInternalViewDeclarationAccess().getWSParserRuleCall_15()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleWS_in_ruleinternalViewDeclaration10269);
            	    ruleWS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop173;
                }
            } while (true);

            this_DOT_20=(Token)match(input,RULE_DOT,FOLLOW_RULE_DOT_in_ruleinternalViewDeclaration10281); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_DOT_20, grammarAccess.getInternalViewDeclarationAccess().getDOTTerminalRuleCall_16()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleinternalViewDeclaration"

    // $ANTLR start synpred1_InternalLF
    public final void synpred1_InternalLF_fragment() throws RecognitionException {   
        // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2517:4: ( ruleWS )
        // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:2517:6: ruleWS
        {
        pushFollow(FOLLOW_ruleWS_in_synpred1_InternalLF5570);
        ruleWS();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalLF

    // $ANTLR start synpred2_InternalLF
    public final void synpred2_InternalLF_fragment() throws RecognitionException {   
        // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3272:5: ( ( ruleterm ) )
        // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3273:1: ( ruleterm )
        {
        // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3273:1: ( ruleterm )
        // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3274:1: ruleterm
        {
        pushFollow(FOLLOW_ruleterm_in_synpred2_InternalLF7333);
        ruleterm();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_InternalLF

    // $ANTLR start synpred3_InternalLF
    public final void synpred3_InternalLF_fragment() throws RecognitionException {   
        // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3345:5: ( ( ruleterm ) )
        // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3346:1: ( ruleterm )
        {
        // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3346:1: ( ruleterm )
        // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3347:1: ruleterm
        {
        pushFollow(FOLLOW_ruleterm_in_synpred3_InternalLF7460);
        ruleterm();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred3_InternalLF

    // $ANTLR start synpred4_InternalLF
    public final void synpred4_InternalLF_fragment() throws RecognitionException {   
        // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3399:5: ( ( ruleterm ) )
        // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3400:1: ( ruleterm )
        {
        // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3400:1: ( ruleterm )
        // ../info.kwarc.mmt.lf/src-gen/info/kwarc/mmt/parser/antlr/internal/InternalLF.g:3401:1: ruleterm
        {
        pushFollow(FOLLOW_ruleterm_in_synpred4_InternalLF7558);
        ruleterm();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred4_InternalLF

    // Delegated rules

    public final boolean synpred1_InternalLF() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalLF_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalLF() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalLF_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalLF() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalLF_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalLF() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalLF_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA30 dfa30 = new DFA30(this);
    protected DFA32 dfa32 = new DFA32(this);
    protected DFA35 dfa35 = new DFA35(this);
    protected DFA37 dfa37 = new DFA37(this);
    protected DFA50 dfa50 = new DFA50(this);
    protected DFA55 dfa55 = new DFA55(this);
    protected DFA69 dfa69 = new DFA69(this);
    protected DFA82 dfa82 = new DFA82(this);
    protected DFA81 dfa81 = new DFA81(this);
    protected DFA84 dfa84 = new DFA84(this);
    protected DFA87 dfa87 = new DFA87(this);
    protected DFA90 dfa90 = new DFA90(this);
    protected DFA104 dfa104 = new DFA104(this);
    protected DFA107 dfa107 = new DFA107(this);
    protected DFA120 dfa120 = new DFA120(this);
    protected DFA122 dfa122 = new DFA122(this);
    protected DFA136 dfa136 = new DFA136(this);
    protected DFA148 dfa148 = new DFA148(this);
    static final String DFA5_eotS =
        "\7\uffff";
    static final String DFA5_eofS =
        "\5\5\2\uffff";
    static final String DFA5_minS =
        "\5\4\2\uffff";
    static final String DFA5_maxS =
        "\5\55\2\uffff";
    static final String DFA5_acceptS =
        "\5\uffff\1\2\1\1";
    static final String DFA5_specialS =
        "\7\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\5\22\uffff\1\1\1\2\1\3\1\4\4\6\1\uffff\4\6\6\uffff\4\6",
            "\1\5\17\uffff\1\6\2\uffff\1\1\1\2\1\3\1\4\4\6\1\uffff\4\6\6"+
            "\uffff\4\6",
            "\1\5\17\uffff\1\6\2\uffff\1\1\1\2\1\3\1\4\4\6\1\uffff\4\6\6"+
            "\uffff\4\6",
            "\1\5\17\uffff\1\6\2\uffff\1\1\1\2\1\3\1\4\4\6\1\uffff\4\6\6"+
            "\uffff\4\6",
            "\1\5\17\uffff\1\6\2\uffff\1\1\1\2\1\3\1\4\4\6\1\uffff\4\6\6"+
            "\uffff\4\6",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "()* loopback of 130:2: ( ( ruleWS )* ( ( (lv_constructs_4_0= rulemodelConstructNOSP ) ) | ( ruleWS ( (lv_constructs_6_0= ruletermDeclaration ) ) ) ) )*";
        }
    }
    static final String DFA30_eotS =
        "\7\uffff";
    static final String DFA30_eofS =
        "\1\5\6\uffff";
    static final String DFA30_minS =
        "\5\5\2\uffff";
    static final String DFA30_maxS =
        "\5\55\2\uffff";
    static final String DFA30_acceptS =
        "\5\uffff\1\2\1\1";
    static final String DFA30_specialS =
        "\7\uffff}>";
    static final String[] DFA30_transitionS = {
            "\2\5\2\uffff\1\5\1\uffff\1\5\1\uffff\1\5\3\uffff\1\5\5\uffff"+
            "\1\1\1\2\1\3\1\4\4\5\1\uffff\16\5",
            "\2\5\2\uffff\1\5\1\uffff\1\5\1\uffff\1\5\2\6\2\5\5\uffff\1"+
            "\1\1\2\1\3\1\4\4\5\1\uffff\16\5",
            "\2\5\2\uffff\1\5\1\uffff\1\5\1\uffff\1\5\2\6\2\5\5\uffff\1"+
            "\1\1\2\1\3\1\4\4\5\1\uffff\16\5",
            "\2\5\2\uffff\1\5\1\uffff\1\5\1\uffff\1\5\2\6\2\5\5\uffff\1"+
            "\1\1\2\1\3\1\4\4\5\1\uffff\16\5",
            "\2\5\2\uffff\1\5\1\uffff\1\5\1\uffff\1\5\2\6\2\5\5\uffff\1"+
            "\1\1\2\1\3\1\4\4\5\1\uffff\16\5",
            "",
            ""
    };

    static final short[] DFA30_eot = DFA.unpackEncodedString(DFA30_eotS);
    static final short[] DFA30_eof = DFA.unpackEncodedString(DFA30_eofS);
    static final char[] DFA30_min = DFA.unpackEncodedStringToUnsignedChars(DFA30_minS);
    static final char[] DFA30_max = DFA.unpackEncodedStringToUnsignedChars(DFA30_maxS);
    static final short[] DFA30_accept = DFA.unpackEncodedString(DFA30_acceptS);
    static final short[] DFA30_special = DFA.unpackEncodedString(DFA30_specialS);
    static final short[][] DFA30_transition;

    static {
        int numStates = DFA30_transitionS.length;
        DFA30_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA30_transition[i] = DFA.unpackEncodedString(DFA30_transitionS[i]);
        }
    }

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = DFA30_eot;
            this.eof = DFA30_eof;
            this.min = DFA30_min;
            this.max = DFA30_max;
            this.accept = DFA30_accept;
            this.special = DFA30_special;
            this.transition = DFA30_transition;
        }
        public String getDescription() {
            return "968:1: ( () ( ruleWS )+ (this_ARROW_3= RULE_ARROW | this_LARROW_4= RULE_LARROW ) ( ruleWS )+ ( (lv_right_6_0= ruletermArr ) ) )?";
        }
    }
    static final String DFA32_eotS =
        "\7\uffff";
    static final String DFA32_eofS =
        "\1\6\6\uffff";
    static final String DFA32_minS =
        "\5\5\2\uffff";
    static final String DFA32_maxS =
        "\5\55\2\uffff";
    static final String DFA32_acceptS =
        "\5\uffff\1\1\1\2";
    static final String DFA32_specialS =
        "\7\uffff}>";
    static final String[] DFA32_transitionS = {
            "\2\6\1\uffff\1\5\1\6\1\5\1\6\1\uffff\1\6\3\uffff\1\6\5\uffff"+
            "\1\1\1\2\1\3\1\4\4\6\1\uffff\16\6",
            "\2\6\1\uffff\1\5\1\6\1\5\1\6\1\uffff\5\6\5\uffff\1\1\1\2\1"+
            "\3\1\4\4\6\1\uffff\16\6",
            "\2\6\1\uffff\1\5\1\6\1\5\1\6\1\uffff\5\6\5\uffff\1\1\1\2\1"+
            "\3\1\4\4\6\1\uffff\16\6",
            "\2\6\1\uffff\1\5\1\6\1\5\1\6\1\uffff\5\6\5\uffff\1\1\1\2\1"+
            "\3\1\4\4\6\1\uffff\16\6",
            "\2\6\1\uffff\1\5\1\6\1\5\1\6\1\uffff\5\6\5\uffff\1\1\1\2\1"+
            "\3\1\4\4\6\1\uffff\16\6",
            "",
            ""
    };

    static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
    static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
    static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
    static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
    static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
    static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
    static final short[][] DFA32_transition;

    static {
        int numStates = DFA32_transitionS.length;
        DFA32_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
        }
    }

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = DFA32_eot;
            this.eof = DFA32_eof;
            this.min = DFA32_min;
            this.max = DFA32_max;
            this.accept = DFA32_accept;
            this.special = DFA32_special;
            this.transition = DFA32_transition;
        }
        public String getDescription() {
            return "1066:2: ( ( ruleWS )* ( (lv_right_3_0= ruletermLambdaOrPi ) ) )?";
        }
    }
    static final String DFA35_eotS =
        "\7\uffff";
    static final String DFA35_eofS =
        "\1\6\6\uffff";
    static final String DFA35_minS =
        "\5\5\2\uffff";
    static final String DFA35_maxS =
        "\5\55\2\uffff";
    static final String DFA35_acceptS =
        "\5\uffff\1\1\1\2";
    static final String DFA35_specialS =
        "\7\uffff}>";
    static final String[] DFA35_transitionS = {
            "\2\6\1\uffff\1\5\1\6\1\5\1\6\1\uffff\1\6\3\uffff\1\6\5\uffff"+
            "\1\1\1\2\1\3\1\4\4\6\1\uffff\16\6",
            "\2\6\1\uffff\1\5\1\6\1\5\1\6\1\uffff\5\6\5\uffff\1\1\1\2\1"+
            "\3\1\4\4\6\1\uffff\16\6",
            "\2\6\1\uffff\1\5\1\6\1\5\1\6\1\uffff\5\6\5\uffff\1\1\1\2\1"+
            "\3\1\4\4\6\1\uffff\16\6",
            "\2\6\1\uffff\1\5\1\6\1\5\1\6\1\uffff\5\6\5\uffff\1\1\1\2\1"+
            "\3\1\4\4\6\1\uffff\16\6",
            "\2\6\1\uffff\1\5\1\6\1\5\1\6\1\uffff\5\6\5\uffff\1\1\1\2\1"+
            "\3\1\4\4\6\1\uffff\16\6",
            "",
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
            return "1131:2: ( ( ruleWS )* ( (lv_right_2_0= ruletermLambdaOrPi ) ) )?";
        }
    }
    static final String DFA37_eotS =
        "\7\uffff";
    static final String DFA37_eofS =
        "\1\5\6\uffff";
    static final String DFA37_minS =
        "\5\5\2\uffff";
    static final String DFA37_maxS =
        "\5\55\2\uffff";
    static final String DFA37_acceptS =
        "\5\uffff\1\2\1\1";
    static final String DFA37_specialS =
        "\7\uffff}>";
    static final String[] DFA37_transitionS = {
            "\2\5\1\uffff\4\5\1\uffff\1\5\3\uffff\1\5\5\uffff\1\1\1\2\1\3"+
            "\1\4\4\5\1\uffff\16\5",
            "\2\5\1\uffff\4\5\1\6\5\5\3\6\2\uffff\1\1\1\2\1\3\1\4\4\5\1"+
            "\uffff\16\5",
            "\2\5\1\uffff\4\5\1\6\5\5\3\6\2\uffff\1\1\1\2\1\3\1\4\4\5\1"+
            "\uffff\16\5",
            "\2\5\1\uffff\4\5\1\6\5\5\3\6\2\uffff\1\1\1\2\1\3\1\4\4\5\1"+
            "\uffff\16\5",
            "\2\5\1\uffff\4\5\1\6\5\5\3\6\2\uffff\1\1\1\2\1\3\1\4\4\5\1"+
            "\uffff\16\5",
            "",
            ""
    };

    static final short[] DFA37_eot = DFA.unpackEncodedString(DFA37_eotS);
    static final short[] DFA37_eof = DFA.unpackEncodedString(DFA37_eofS);
    static final char[] DFA37_min = DFA.unpackEncodedStringToUnsignedChars(DFA37_minS);
    static final char[] DFA37_max = DFA.unpackEncodedStringToUnsignedChars(DFA37_maxS);
    static final short[] DFA37_accept = DFA.unpackEncodedString(DFA37_acceptS);
    static final short[] DFA37_special = DFA.unpackEncodedString(DFA37_specialS);
    static final short[][] DFA37_transition;

    static {
        int numStates = DFA37_transitionS.length;
        DFA37_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA37_transition[i] = DFA.unpackEncodedString(DFA37_transitionS[i]);
        }
    }

    class DFA37 extends DFA {

        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = DFA37_eot;
            this.eof = DFA37_eof;
            this.min = DFA37_min;
            this.max = DFA37_max;
            this.accept = DFA37_accept;
            this.special = DFA37_special;
            this.transition = DFA37_transition;
        }
        public String getDescription() {
            return "()* loopback of 1187:1: ( () ( ruleWS )+ ( (lv_right_3_0= ruletermBase ) ) )*";
        }
    }
    static final String DFA50_eotS =
        "\7\uffff";
    static final String DFA50_eofS =
        "\1\1\6\uffff";
    static final String DFA50_minS =
        "\1\5\1\uffff\4\5\1\uffff";
    static final String DFA50_maxS =
        "\1\50\1\uffff\4\50\1\uffff";
    static final String DFA50_acceptS =
        "\1\uffff\1\2\4\uffff\1\1";
    static final String DFA50_specialS =
        "\7\uffff}>";
    static final String[] DFA50_transitionS = {
            "\1\1\21\uffff\1\2\1\3\1\4\1\5\15\uffff\1\1",
            "",
            "\1\1\12\uffff\1\1\3\uffff\1\6\2\uffff\1\2\1\3\1\4\1\5\15\uffff"+
            "\1\1",
            "\1\1\12\uffff\1\1\3\uffff\1\6\2\uffff\1\2\1\3\1\4\1\5\15\uffff"+
            "\1\1",
            "\1\1\12\uffff\1\1\3\uffff\1\6\2\uffff\1\2\1\3\1\4\1\5\15\uffff"+
            "\1\1",
            "\1\1\12\uffff\1\1\3\uffff\1\6\2\uffff\1\2\1\3\1\4\1\5\15\uffff"+
            "\1\1",
            ""
    };

    static final short[] DFA50_eot = DFA.unpackEncodedString(DFA50_eotS);
    static final short[] DFA50_eof = DFA.unpackEncodedString(DFA50_eofS);
    static final char[] DFA50_min = DFA.unpackEncodedStringToUnsignedChars(DFA50_minS);
    static final char[] DFA50_max = DFA.unpackEncodedStringToUnsignedChars(DFA50_maxS);
    static final short[] DFA50_accept = DFA.unpackEncodedString(DFA50_acceptS);
    static final short[] DFA50_special = DFA.unpackEncodedString(DFA50_specialS);
    static final short[][] DFA50_transition;

    static {
        int numStates = DFA50_transitionS.length;
        DFA50_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA50_transition[i] = DFA.unpackEncodedString(DFA50_transitionS[i]);
        }
    }

    class DFA50 extends DFA {

        public DFA50(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 50;
            this.eot = DFA50_eot;
            this.eof = DFA50_eof;
            this.min = DFA50_min;
            this.max = DFA50_max;
            this.accept = DFA50_accept;
            this.special = DFA50_special;
            this.transition = DFA50_transition;
        }
        public String getDescription() {
            return "()* loopback of 1541:2: ( ( ruleWS )+ ( ( ruleID ) ) )*";
        }
    }
    static final String DFA55_eotS =
        "\10\uffff";
    static final String DFA55_eofS =
        "\10\uffff";
    static final String DFA55_minS =
        "\5\5\3\uffff";
    static final String DFA55_maxS =
        "\5\32\3\uffff";
    static final String DFA55_acceptS =
        "\5\uffff\1\3\1\1\1\2";
    static final String DFA55_specialS =
        "\1\2\1\1\1\3\1\4\1\0\3\uffff}>";
    static final String[] DFA55_transitionS = {
            "\1\5\1\6\20\uffff\1\1\1\2\1\3\1\4",
            "\1\5\1\6\11\uffff\1\7\6\uffff\1\1\1\2\1\3\1\4",
            "\1\5\1\6\11\uffff\1\7\6\uffff\1\1\1\2\1\3\1\4",
            "\1\5\1\6\11\uffff\1\7\6\uffff\1\1\1\2\1\3\1\4",
            "\1\5\1\6\11\uffff\1\7\6\uffff\1\1\1\2\1\3\1\4",
            "",
            "",
            ""
    };

    static final short[] DFA55_eot = DFA.unpackEncodedString(DFA55_eotS);
    static final short[] DFA55_eof = DFA.unpackEncodedString(DFA55_eofS);
    static final char[] DFA55_min = DFA.unpackEncodedStringToUnsignedChars(DFA55_minS);
    static final char[] DFA55_max = DFA.unpackEncodedStringToUnsignedChars(DFA55_maxS);
    static final short[] DFA55_accept = DFA.unpackEncodedString(DFA55_acceptS);
    static final short[] DFA55_special = DFA.unpackEncodedString(DFA55_specialS);
    static final short[][] DFA55_transition;

    static {
        int numStates = DFA55_transitionS.length;
        DFA55_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA55_transition[i] = DFA.unpackEncodedString(DFA55_transitionS[i]);
        }
    }

    class DFA55 extends DFA {

        public DFA55(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 55;
            this.eot = DFA55_eot;
            this.eof = DFA55_eof;
            this.min = DFA55_min;
            this.max = DFA55_max;
            this.accept = DFA55_accept;
            this.special = DFA55_special;
            this.transition = DFA55_transition;
        }
        public String getDescription() {
            return "()* loopback of 1610:3: ( ({...}? => ( ({...}? => ( ( ruleWS )* this_COLON_3= RULE_COLON ( ruleWS )* ( (lv_type_5_0= ruleterm ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ruleWS )+ this_EQUALS_7= RULE_EQUALS ( ruleWS )+ ( (lv_def_9_0= ruleterm ) ) ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA55_4 = input.LA(1);

                         
                        int index55_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA55_4 ==RULE_COLON && getUnorderedGroupHelper().canSelect(grammarAccess.getTermDeclarationAccess().getUnorderedGroup_1(), 0) ) {s = 6;}

                        else if ( (LA55_4==RULE_LINESP) ) {s = 1;}

                        else if ( (LA55_4==RULE_LINEDELIM) ) {s = 2;}

                        else if ( (LA55_4==RULE_ML_COMMENT) ) {s = 3;}

                        else if ( (LA55_4==RULE_ML2_COMMENT) ) {s = 4;}

                        else if ( LA55_4 ==RULE_EQUALS && getUnorderedGroupHelper().canSelect(grammarAccess.getTermDeclarationAccess().getUnorderedGroup_1(), 1) ) {s = 7;}

                        else if ( (LA55_4==RULE_DOT) ) {s = 5;}

                         
                        input.seek(index55_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA55_1 = input.LA(1);

                         
                        int index55_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA55_1 ==RULE_COLON && getUnorderedGroupHelper().canSelect(grammarAccess.getTermDeclarationAccess().getUnorderedGroup_1(), 0) ) {s = 6;}

                        else if ( (LA55_1==RULE_LINESP) ) {s = 1;}

                        else if ( (LA55_1==RULE_LINEDELIM) ) {s = 2;}

                        else if ( (LA55_1==RULE_ML_COMMENT) ) {s = 3;}

                        else if ( (LA55_1==RULE_ML2_COMMENT) ) {s = 4;}

                        else if ( (LA55_1==RULE_DOT) ) {s = 5;}

                        else if ( LA55_1 ==RULE_EQUALS && getUnorderedGroupHelper().canSelect(grammarAccess.getTermDeclarationAccess().getUnorderedGroup_1(), 1) ) {s = 7;}

                         
                        input.seek(index55_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA55_0 = input.LA(1);

                         
                        int index55_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA55_0==RULE_LINESP) ) {s = 1;}

                        else if ( (LA55_0==RULE_LINEDELIM) ) {s = 2;}

                        else if ( (LA55_0==RULE_ML_COMMENT) ) {s = 3;}

                        else if ( (LA55_0==RULE_ML2_COMMENT) ) {s = 4;}

                        else if ( (LA55_0==RULE_DOT) ) {s = 5;}

                        else if ( LA55_0 ==RULE_COLON && getUnorderedGroupHelper().canSelect(grammarAccess.getTermDeclarationAccess().getUnorderedGroup_1(), 0) ) {s = 6;}

                         
                        input.seek(index55_0);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA55_2 = input.LA(1);

                         
                        int index55_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA55_2 ==RULE_EQUALS && getUnorderedGroupHelper().canSelect(grammarAccess.getTermDeclarationAccess().getUnorderedGroup_1(), 1) ) {s = 7;}

                        else if ( (LA55_2==RULE_LINESP) ) {s = 1;}

                        else if ( (LA55_2==RULE_LINEDELIM) ) {s = 2;}

                        else if ( (LA55_2==RULE_ML_COMMENT) ) {s = 3;}

                        else if ( (LA55_2==RULE_ML2_COMMENT) ) {s = 4;}

                        else if ( LA55_2 ==RULE_COLON && getUnorderedGroupHelper().canSelect(grammarAccess.getTermDeclarationAccess().getUnorderedGroup_1(), 0) ) {s = 6;}

                        else if ( (LA55_2==RULE_DOT) ) {s = 5;}

                         
                        input.seek(index55_2);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA55_3 = input.LA(1);

                         
                        int index55_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA55_3==RULE_DOT) ) {s = 5;}

                        else if ( (LA55_3==RULE_LINESP) ) {s = 1;}

                        else if ( (LA55_3==RULE_LINEDELIM) ) {s = 2;}

                        else if ( (LA55_3==RULE_ML_COMMENT) ) {s = 3;}

                        else if ( (LA55_3==RULE_ML2_COMMENT) ) {s = 4;}

                        else if ( LA55_3 ==RULE_EQUALS && getUnorderedGroupHelper().canSelect(grammarAccess.getTermDeclarationAccess().getUnorderedGroup_1(), 1) ) {s = 7;}

                        else if ( LA55_3 ==RULE_COLON && getUnorderedGroupHelper().canSelect(grammarAccess.getTermDeclarationAccess().getUnorderedGroup_1(), 0) ) {s = 6;}

                         
                        input.seek(index55_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 55, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA69_eotS =
        "\7\uffff";
    static final String DFA69_eofS =
        "\7\uffff";
    static final String DFA69_minS =
        "\5\5\2\uffff";
    static final String DFA69_maxS =
        "\5\50\2\uffff";
    static final String DFA69_acceptS =
        "\5\uffff\1\1\1\2";
    static final String DFA69_specialS =
        "\7\uffff}>";
    static final String[] DFA69_transitionS = {
            "\1\6\21\uffff\1\1\1\2\1\3\1\4\15\uffff\1\5",
            "\1\6\21\uffff\1\1\1\2\1\3\1\4\15\uffff\1\5",
            "\1\6\21\uffff\1\1\1\2\1\3\1\4\15\uffff\1\5",
            "\1\6\21\uffff\1\1\1\2\1\3\1\4\15\uffff\1\5",
            "\1\6\21\uffff\1\1\1\2\1\3\1\4\15\uffff\1\5",
            "",
            ""
    };

    static final short[] DFA69_eot = DFA.unpackEncodedString(DFA69_eotS);
    static final short[] DFA69_eof = DFA.unpackEncodedString(DFA69_eofS);
    static final char[] DFA69_min = DFA.unpackEncodedStringToUnsignedChars(DFA69_minS);
    static final char[] DFA69_max = DFA.unpackEncodedStringToUnsignedChars(DFA69_maxS);
    static final short[] DFA69_accept = DFA.unpackEncodedString(DFA69_acceptS);
    static final short[] DFA69_special = DFA.unpackEncodedString(DFA69_specialS);
    static final short[][] DFA69_transition;

    static {
        int numStates = DFA69_transitionS.length;
        DFA69_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA69_transition[i] = DFA.unpackEncodedString(DFA69_transitionS[i]);
        }
    }

    class DFA69 extends DFA {

        public DFA69(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 69;
            this.eot = DFA69_eot;
            this.eof = DFA69_eof;
            this.min = DFA69_min;
            this.max = DFA69_max;
            this.accept = DFA69_accept;
            this.special = DFA69_special;
            this.transition = DFA69_transition;
        }
        public String getDescription() {
            return "2143:2: ( ( ruleWS )* ( (lv_incOpt_4_0= ruleincludeOps ) ) )?";
        }
    }
    static final String DFA82_eotS =
        "\10\uffff";
    static final String DFA82_eofS =
        "\10\uffff";
    static final String DFA82_minS =
        "\5\5\3\uffff";
    static final String DFA82_maxS =
        "\5\50\3\uffff";
    static final String DFA82_acceptS =
        "\5\uffff\1\2\1\3\1\1";
    static final String DFA82_specialS =
        "\10\uffff}>";
    static final String[] DFA82_transitionS = {
            "\1\6\1\5\20\uffff\1\1\1\2\1\3\1\4\15\uffff\1\6",
            "\1\6\1\5\11\uffff\1\7\6\uffff\1\1\1\2\1\3\1\4\15\uffff\1\6",
            "\1\6\1\5\11\uffff\1\7\6\uffff\1\1\1\2\1\3\1\4\15\uffff\1\6",
            "\1\6\1\5\11\uffff\1\7\6\uffff\1\1\1\2\1\3\1\4\15\uffff\1\6",
            "\1\6\1\5\11\uffff\1\7\6\uffff\1\1\1\2\1\3\1\4\15\uffff\1\6",
            "",
            "",
            ""
    };

    static final short[] DFA82_eot = DFA.unpackEncodedString(DFA82_eotS);
    static final short[] DFA82_eof = DFA.unpackEncodedString(DFA82_eofS);
    static final char[] DFA82_min = DFA.unpackEncodedStringToUnsignedChars(DFA82_minS);
    static final char[] DFA82_max = DFA.unpackEncodedStringToUnsignedChars(DFA82_maxS);
    static final short[] DFA82_accept = DFA.unpackEncodedString(DFA82_acceptS);
    static final short[] DFA82_special = DFA.unpackEncodedString(DFA82_specialS);
    static final short[][] DFA82_transition;

    static {
        int numStates = DFA82_transitionS.length;
        DFA82_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA82_transition[i] = DFA.unpackEncodedString(DFA82_transitionS[i]);
        }
    }

    class DFA82 extends DFA {

        public DFA82(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 82;
            this.eot = DFA82_eot;
            this.eof = DFA82_eof;
            this.min = DFA82_min;
            this.max = DFA82_max;
            this.accept = DFA82_accept;
            this.special = DFA82_special;
            this.transition = DFA82_transition;
        }
        public String getDescription() {
            return "2244:2: ( ( ( ruleWS )+ this_EQUALS_6= RULE_EQUALS ( ruleWS )+ ( (lv_def_8_0= rulemorphism ) ) ) | ( ( ruleWS )* this_COLON_10= RULE_COLON ( ruleWS )* ( ( ruleID ) ) ( ( ruleWS )+ this_EQUALS_14= RULE_EQUALS ( ruleWS )* ( ( (lv_def_16_0= rulelinkBody ) ) | ( ruleWS ( (lv_def_18_0= rulemorphism ) ) ) ) )? ) )?";
        }
    }
    static final String DFA81_eotS =
        "\7\uffff";
    static final String DFA81_eofS =
        "\7\uffff";
    static final String DFA81_minS =
        "\5\5\2\uffff";
    static final String DFA81_maxS =
        "\5\50\2\uffff";
    static final String DFA81_acceptS =
        "\5\uffff\1\2\1\1";
    static final String DFA81_specialS =
        "\7\uffff}>";
    static final String[] DFA81_transitionS = {
            "\1\5\21\uffff\1\1\1\2\1\3\1\4\15\uffff\1\5",
            "\1\5\12\uffff\1\6\6\uffff\1\1\1\2\1\3\1\4\15\uffff\1\5",
            "\1\5\12\uffff\1\6\6\uffff\1\1\1\2\1\3\1\4\15\uffff\1\5",
            "\1\5\12\uffff\1\6\6\uffff\1\1\1\2\1\3\1\4\15\uffff\1\5",
            "\1\5\12\uffff\1\6\6\uffff\1\1\1\2\1\3\1\4\15\uffff\1\5",
            "",
            ""
    };

    static final short[] DFA81_eot = DFA.unpackEncodedString(DFA81_eotS);
    static final short[] DFA81_eof = DFA.unpackEncodedString(DFA81_eofS);
    static final char[] DFA81_min = DFA.unpackEncodedStringToUnsignedChars(DFA81_minS);
    static final char[] DFA81_max = DFA.unpackEncodedStringToUnsignedChars(DFA81_maxS);
    static final short[] DFA81_accept = DFA.unpackEncodedString(DFA81_acceptS);
    static final short[] DFA81_special = DFA.unpackEncodedString(DFA81_specialS);
    static final short[][] DFA81_transition;

    static {
        int numStates = DFA81_transitionS.length;
        DFA81_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA81_transition[i] = DFA.unpackEncodedString(DFA81_transitionS[i]);
        }
    }

    class DFA81 extends DFA {

        public DFA81(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 81;
            this.eot = DFA81_eot;
            this.eof = DFA81_eof;
            this.min = DFA81_min;
            this.max = DFA81_max;
            this.accept = DFA81_accept;
            this.special = DFA81_special;
            this.transition = DFA81_transition;
        }
        public String getDescription() {
            return "2318:2: ( ( ruleWS )+ this_EQUALS_14= RULE_EQUALS ( ruleWS )* ( ( (lv_def_16_0= rulelinkBody ) ) | ( ruleWS ( (lv_def_18_0= rulemorphism ) ) ) ) )?";
        }
    }
    static final String DFA84_eotS =
        "\7\uffff";
    static final String DFA84_eofS =
        "\7\uffff";
    static final String DFA84_minS =
        "\5\5\2\uffff";
    static final String DFA84_maxS =
        "\5\50\2\uffff";
    static final String DFA84_acceptS =
        "\5\uffff\1\1\1\2";
    static final String DFA84_specialS =
        "\7\uffff}>";
    static final String[] DFA84_transitionS = {
            "\1\6\21\uffff\1\1\1\2\1\3\1\4\15\uffff\1\5",
            "\1\6\21\uffff\1\1\1\2\1\3\1\4\15\uffff\1\5",
            "\1\6\21\uffff\1\1\1\2\1\3\1\4\15\uffff\1\5",
            "\1\6\21\uffff\1\1\1\2\1\3\1\4\15\uffff\1\5",
            "\1\6\21\uffff\1\1\1\2\1\3\1\4\15\uffff\1\5",
            "",
            ""
    };

    static final short[] DFA84_eot = DFA.unpackEncodedString(DFA84_eotS);
    static final short[] DFA84_eof = DFA.unpackEncodedString(DFA84_eofS);
    static final char[] DFA84_min = DFA.unpackEncodedStringToUnsignedChars(DFA84_minS);
    static final char[] DFA84_max = DFA.unpackEncodedStringToUnsignedChars(DFA84_maxS);
    static final short[] DFA84_accept = DFA.unpackEncodedString(DFA84_acceptS);
    static final short[] DFA84_special = DFA.unpackEncodedString(DFA84_specialS);
    static final short[][] DFA84_transition;

    static {
        int numStates = DFA84_transitionS.length;
        DFA84_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA84_transition[i] = DFA.unpackEncodedString(DFA84_transitionS[i]);
        }
    }

    class DFA84 extends DFA {

        public DFA84(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 84;
            this.eot = DFA84_eot;
            this.eof = DFA84_eof;
            this.min = DFA84_min;
            this.max = DFA84_max;
            this.accept = DFA84_accept;
            this.special = DFA84_special;
            this.transition = DFA84_transition;
        }
        public String getDescription() {
            return "2383:9: ( ( ruleWS )* ( (lv_incOpt_20_0= ruleincludeOps ) ) )?";
        }
    }
    static final String DFA87_eotS =
        "\7\uffff";
    static final String DFA87_eofS =
        "\1\5\6\uffff";
    static final String DFA87_minS =
        "\5\5\2\uffff";
    static final String DFA87_maxS =
        "\5\32\2\uffff";
    static final String DFA87_acceptS =
        "\5\uffff\1\2\1\1";
    static final String DFA87_specialS =
        "\7\uffff}>";
    static final String[] DFA87_transitionS = {
            "\1\5\21\uffff\1\1\1\2\1\3\1\4",
            "\1\5\16\uffff\1\6\2\uffff\1\1\1\2\1\3\1\4",
            "\1\5\16\uffff\1\6\2\uffff\1\1\1\2\1\3\1\4",
            "\1\5\16\uffff\1\6\2\uffff\1\1\1\2\1\3\1\4",
            "\1\5\16\uffff\1\6\2\uffff\1\1\1\2\1\3\1\4",
            "",
            ""
    };

    static final short[] DFA87_eot = DFA.unpackEncodedString(DFA87_eotS);
    static final short[] DFA87_eof = DFA.unpackEncodedString(DFA87_eofS);
    static final char[] DFA87_min = DFA.unpackEncodedStringToUnsignedChars(DFA87_minS);
    static final char[] DFA87_max = DFA.unpackEncodedStringToUnsignedChars(DFA87_maxS);
    static final short[] DFA87_accept = DFA.unpackEncodedString(DFA87_acceptS);
    static final short[] DFA87_special = DFA.unpackEncodedString(DFA87_specialS);
    static final short[][] DFA87_transition;

    static {
        int numStates = DFA87_transitionS.length;
        DFA87_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA87_transition[i] = DFA.unpackEncodedString(DFA87_transitionS[i]);
        }
    }

    class DFA87 extends DFA {

        public DFA87(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 87;
            this.eot = DFA87_eot;
            this.eof = DFA87_eof;
            this.min = DFA87_min;
            this.max = DFA87_max;
            this.accept = DFA87_accept;
            this.special = DFA87_special;
            this.transition = DFA87_transition;
        }
        public String getDescription() {
            return "()* loopback of 2452:1: ( ( ruleWS )+ ( (lv_aliases_3_0= rulealiasDeclaration ) ) )*";
        }
    }
    static final String DFA90_eotS =
        "\7\uffff";
    static final String DFA90_eofS =
        "\1\6\6\uffff";
    static final String DFA90_minS =
        "\5\5\2\uffff";
    static final String DFA90_maxS =
        "\5\51\2\uffff";
    static final String DFA90_acceptS =
        "\5\uffff\1\1\1\2";
    static final String DFA90_specialS =
        "\7\uffff}>";
    static final String[] DFA90_transitionS = {
            "\1\6\21\uffff\1\1\1\2\1\3\1\4\16\uffff\1\5",
            "\1\6\16\uffff\1\6\2\uffff\1\1\1\2\1\3\1\4\16\uffff\1\5",
            "\1\6\16\uffff\1\6\2\uffff\1\1\1\2\1\3\1\4\16\uffff\1\5",
            "\1\6\16\uffff\1\6\2\uffff\1\1\1\2\1\3\1\4\16\uffff\1\5",
            "\1\6\16\uffff\1\6\2\uffff\1\1\1\2\1\3\1\4\16\uffff\1\5",
            "",
            ""
    };

    static final short[] DFA90_eot = DFA.unpackEncodedString(DFA90_eotS);
    static final short[] DFA90_eof = DFA.unpackEncodedString(DFA90_eofS);
    static final char[] DFA90_min = DFA.unpackEncodedStringToUnsignedChars(DFA90_minS);
    static final char[] DFA90_max = DFA.unpackEncodedStringToUnsignedChars(DFA90_maxS);
    static final short[] DFA90_accept = DFA.unpackEncodedString(DFA90_acceptS);
    static final short[] DFA90_special = DFA.unpackEncodedString(DFA90_specialS);
    static final short[][] DFA90_transition;

    static {
        int numStates = DFA90_transitionS.length;
        DFA90_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA90_transition[i] = DFA.unpackEncodedString(DFA90_transitionS[i]);
        }
    }

    class DFA90 extends DFA {

        public DFA90(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 90;
            this.eot = DFA90_eot;
            this.eof = DFA90_eof;
            this.min = DFA90_min;
            this.max = DFA90_max;
            this.accept = DFA90_accept;
            this.special = DFA90_special;
            this.transition = DFA90_transition;
        }
        public String getDescription() {
            return "2517:2: ( ( ( ruleWS )=> ruleWS )* otherlv_2= '%as' ( ruleWS )+ ( (lv_new_4_0= RULE_CID ) ) )?";
        }
    }
    static final String DFA104_eotS =
        "\7\uffff";
    static final String DFA104_eofS =
        "\7\uffff";
    static final String DFA104_minS =
        "\1\11\4\10\2\uffff";
    static final String DFA104_maxS =
        "\1\32\4\55\2\uffff";
    static final String DFA104_acceptS =
        "\5\uffff\1\2\1\1";
    static final String DFA104_specialS =
        "\7\uffff}>";
    static final String[] DFA104_transitionS = {
            "\1\5\15\uffff\1\1\1\2\1\3\1\4",
            "\1\6\1\5\1\6\1\uffff\1\6\5\uffff\3\6\2\uffff\1\1\1\2\1\3\1"+
            "\4\4\6\1\uffff\16\6",
            "\1\6\1\5\1\6\1\uffff\1\6\5\uffff\3\6\2\uffff\1\1\1\2\1\3\1"+
            "\4\4\6\1\uffff\16\6",
            "\1\6\1\5\1\6\1\uffff\1\6\5\uffff\3\6\2\uffff\1\1\1\2\1\3\1"+
            "\4\4\6\1\uffff\16\6",
            "\1\6\1\5\1\6\1\uffff\1\6\5\uffff\3\6\2\uffff\1\1\1\2\1\3\1"+
            "\4\4\6\1\uffff\16\6",
            "",
            ""
    };

    static final short[] DFA104_eot = DFA.unpackEncodedString(DFA104_eotS);
    static final short[] DFA104_eof = DFA.unpackEncodedString(DFA104_eofS);
    static final char[] DFA104_min = DFA.unpackEncodedStringToUnsignedChars(DFA104_minS);
    static final char[] DFA104_max = DFA.unpackEncodedStringToUnsignedChars(DFA104_maxS);
    static final short[] DFA104_accept = DFA.unpackEncodedString(DFA104_acceptS);
    static final short[] DFA104_special = DFA.unpackEncodedString(DFA104_specialS);
    static final short[][] DFA104_transition;

    static {
        int numStates = DFA104_transitionS.length;
        DFA104_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA104_transition[i] = DFA.unpackEncodedString(DFA104_transitionS[i]);
        }
    }

    class DFA104 extends DFA {

        public DFA104(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 104;
            this.eot = DFA104_eot;
            this.eof = DFA104_eof;
            this.min = DFA104_min;
            this.max = DFA104_max;
            this.accept = DFA104_accept;
            this.special = DFA104_special;
            this.transition = DFA104_transition;
        }
        public String getDescription() {
            return "()* loopback of 3052:1: ( ( ruleWS )+ ( (lv_t_3_0= ruleanyConstruct ) ) )*";
        }
    }
    static final String DFA107_eotS =
        "\7\uffff";
    static final String DFA107_eofS =
        "\7\uffff";
    static final String DFA107_minS =
        "\5\5\2\uffff";
    static final String DFA107_maxS =
        "\5\32\2\uffff";
    static final String DFA107_acceptS =
        "\5\uffff\1\2\1\1";
    static final String DFA107_specialS =
        "\7\uffff}>";
    static final String[] DFA107_transitionS = {
            "\1\5\21\uffff\1\1\1\2\1\3\1\4",
            "\1\5\2\uffff\1\6\1\uffff\1\6\1\uffff\1\6\5\uffff\3\6\2\uffff"+
            "\1\1\1\2\1\3\1\4",
            "\1\5\2\uffff\1\6\1\uffff\1\6\1\uffff\1\6\5\uffff\3\6\2\uffff"+
            "\1\1\1\2\1\3\1\4",
            "\1\5\2\uffff\1\6\1\uffff\1\6\1\uffff\1\6\5\uffff\3\6\2\uffff"+
            "\1\1\1\2\1\3\1\4",
            "\1\5\2\uffff\1\6\1\uffff\1\6\1\uffff\1\6\5\uffff\3\6\2\uffff"+
            "\1\1\1\2\1\3\1\4",
            "",
            ""
    };

    static final short[] DFA107_eot = DFA.unpackEncodedString(DFA107_eotS);
    static final short[] DFA107_eof = DFA.unpackEncodedString(DFA107_eofS);
    static final char[] DFA107_min = DFA.unpackEncodedStringToUnsignedChars(DFA107_minS);
    static final char[] DFA107_max = DFA.unpackEncodedStringToUnsignedChars(DFA107_maxS);
    static final short[] DFA107_accept = DFA.unpackEncodedString(DFA107_acceptS);
    static final short[] DFA107_special = DFA.unpackEncodedString(DFA107_specialS);
    static final short[][] DFA107_transition;

    static {
        int numStates = DFA107_transitionS.length;
        DFA107_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA107_transition[i] = DFA.unpackEncodedString(DFA107_transitionS[i]);
        }
    }

    class DFA107 extends DFA {

        public DFA107(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 107;
            this.eot = DFA107_eot;
            this.eof = DFA107_eof;
            this.min = DFA107_min;
            this.max = DFA107_max;
            this.accept = DFA107_accept;
            this.special = DFA107_special;
            this.transition = DFA107_transition;
        }
        public String getDescription() {
            return "3148:2: ( ( ruleWS )+ ( (lv_t_3_0= ruleunknownBody ) ) )?";
        }
    }
    static final String DFA120_eotS =
        "\7\uffff";
    static final String DFA120_eofS =
        "\1\5\6\uffff";
    static final String DFA120_minS =
        "\5\5\2\uffff";
    static final String DFA120_maxS =
        "\5\55\2\uffff";
    static final String DFA120_acceptS =
        "\5\uffff\1\2\1\1";
    static final String DFA120_specialS =
        "\7\uffff}>";
    static final String[] DFA120_transitionS = {
            "\1\5\1\6\12\uffff\1\6\5\uffff\1\1\1\2\1\3\1\4\4\6\1\uffff\16"+
            "\6",
            "\1\5\1\6\11\uffff\2\6\5\uffff\1\1\1\2\1\3\1\4\4\6\1\uffff\16"+
            "\6",
            "\1\5\1\6\11\uffff\2\6\5\uffff\1\1\1\2\1\3\1\4\4\6\1\uffff\16"+
            "\6",
            "\1\5\1\6\11\uffff\2\6\5\uffff\1\1\1\2\1\3\1\4\4\6\1\uffff\16"+
            "\6",
            "\1\5\1\6\11\uffff\2\6\5\uffff\1\1\1\2\1\3\1\4\4\6\1\uffff\16"+
            "\6",
            "",
            ""
    };

    static final short[] DFA120_eot = DFA.unpackEncodedString(DFA120_eotS);
    static final short[] DFA120_eof = DFA.unpackEncodedString(DFA120_eofS);
    static final char[] DFA120_min = DFA.unpackEncodedStringToUnsignedChars(DFA120_minS);
    static final char[] DFA120_max = DFA.unpackEncodedStringToUnsignedChars(DFA120_maxS);
    static final short[] DFA120_accept = DFA.unpackEncodedString(DFA120_acceptS);
    static final short[] DFA120_special = DFA.unpackEncodedString(DFA120_specialS);
    static final short[][] DFA120_transition;

    static {
        int numStates = DFA120_transitionS.length;
        DFA120_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA120_transition[i] = DFA.unpackEncodedString(DFA120_transitionS[i]);
        }
    }

    class DFA120 extends DFA {

        public DFA120(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 120;
            this.eot = DFA120_eot;
            this.eof = DFA120_eof;
            this.min = DFA120_min;
            this.max = DFA120_max;
            this.accept = DFA120_accept;
            this.special = DFA120_special;
            this.transition = DFA120_transition;
        }
        public String getDescription() {
            return "()* loopback of 3225:2: ( ( ruleWS )* ( ( ruleWS this_EQUALS_3= RULE_EQUALS ( ( (lv_t_4_0= ruleunknownBrackets ) ) | ( ( ruleWS )+ ( ( ( ( ruleterm ) )=> (lv_t_6_0= ruleterm ) ) | ( (lv_t_7_0= ruleunknownBrackets ) ) ) ) ) ) | (this_ASSIGN_8= RULE_ASSIGN ( ( (lv_t_9_0= ruleunknownBrackets ) ) | ( ( ruleWS )+ ( ( ( ( ruleterm ) )=> (lv_t_11_0= ruleterm ) ) | ( (lv_t_12_0= ruleunknownBrackets ) ) ) ) ) ) | (this_COLON_13= RULE_COLON ( ruleWS )* ( ( ( ( ruleterm ) )=> (lv_t_15_0= ruleterm ) ) | ( (lv_t_16_0= ruleunknownBrackets ) ) ) ) | ruleanyDirective ) )*";
        }
    }
    static final String DFA122_eotS =
        "\7\uffff";
    static final String DFA122_eofS =
        "\7\uffff";
    static final String DFA122_minS =
        "\5\5\2\uffff";
    static final String DFA122_maxS =
        "\5\32\2\uffff";
    static final String DFA122_acceptS =
        "\5\uffff\1\2\1\1";
    static final String DFA122_specialS =
        "\7\uffff}>";
    static final String[] DFA122_transitionS = {
            "\1\5\21\uffff\1\1\1\2\1\3\1\4",
            "\1\5\2\uffff\1\6\1\uffff\1\6\1\uffff\1\6\5\uffff\3\6\2\uffff"+
            "\1\1\1\2\1\3\1\4",
            "\1\5\2\uffff\1\6\1\uffff\1\6\1\uffff\1\6\5\uffff\3\6\2\uffff"+
            "\1\1\1\2\1\3\1\4",
            "\1\5\2\uffff\1\6\1\uffff\1\6\1\uffff\1\6\5\uffff\3\6\2\uffff"+
            "\1\1\1\2\1\3\1\4",
            "\1\5\2\uffff\1\6\1\uffff\1\6\1\uffff\1\6\5\uffff\3\6\2\uffff"+
            "\1\1\1\2\1\3\1\4",
            "",
            ""
    };

    static final short[] DFA122_eot = DFA.unpackEncodedString(DFA122_eotS);
    static final short[] DFA122_eof = DFA.unpackEncodedString(DFA122_eofS);
    static final char[] DFA122_min = DFA.unpackEncodedStringToUnsignedChars(DFA122_minS);
    static final char[] DFA122_max = DFA.unpackEncodedStringToUnsignedChars(DFA122_maxS);
    static final short[] DFA122_accept = DFA.unpackEncodedString(DFA122_acceptS);
    static final short[] DFA122_special = DFA.unpackEncodedString(DFA122_specialS);
    static final short[][] DFA122_transition;

    static {
        int numStates = DFA122_transitionS.length;
        DFA122_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA122_transition[i] = DFA.unpackEncodedString(DFA122_transitionS[i]);
        }
    }

    class DFA122 extends DFA {

        public DFA122(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 122;
            this.eot = DFA122_eot;
            this.eof = DFA122_eof;
            this.min = DFA122_min;
            this.max = DFA122_max;
            this.accept = DFA122_accept;
            this.special = DFA122_special;
            this.transition = DFA122_transition;
        }
        public String getDescription() {
            return "3488:2: ( ( ruleWS )+ ( (lv_t_2_0= ruleunknownBody ) ) )?";
        }
    }
    static final String DFA136_eotS =
        "\7\uffff";
    static final String DFA136_eofS =
        "\7\uffff";
    static final String DFA136_minS =
        "\5\11\2\uffff";
    static final String DFA136_maxS =
        "\5\55\2\uffff";
    static final String DFA136_acceptS =
        "\5\uffff\1\2\1\1";
    static final String DFA136_specialS =
        "\7\uffff}>";
    static final String[] DFA136_transitionS = {
            "\1\5\15\uffff\1\1\1\2\1\3\1\4\4\6\1\uffff\7\6\5\uffff\2\6",
            "\1\5\12\uffff\1\6\2\uffff\1\1\1\2\1\3\1\4\4\6\1\uffff\7\6\5"+
            "\uffff\2\6",
            "\1\5\12\uffff\1\6\2\uffff\1\1\1\2\1\3\1\4\4\6\1\uffff\7\6\5"+
            "\uffff\2\6",
            "\1\5\12\uffff\1\6\2\uffff\1\1\1\2\1\3\1\4\4\6\1\uffff\7\6\5"+
            "\uffff\2\6",
            "\1\5\12\uffff\1\6\2\uffff\1\1\1\2\1\3\1\4\4\6\1\uffff\7\6\5"+
            "\uffff\2\6",
            "",
            ""
    };

    static final short[] DFA136_eot = DFA.unpackEncodedString(DFA136_eotS);
    static final short[] DFA136_eof = DFA.unpackEncodedString(DFA136_eofS);
    static final char[] DFA136_min = DFA.unpackEncodedStringToUnsignedChars(DFA136_minS);
    static final char[] DFA136_max = DFA.unpackEncodedStringToUnsignedChars(DFA136_maxS);
    static final short[] DFA136_accept = DFA.unpackEncodedString(DFA136_acceptS);
    static final short[] DFA136_special = DFA.unpackEncodedString(DFA136_specialS);
    static final short[][] DFA136_transition;

    static {
        int numStates = DFA136_transitionS.length;
        DFA136_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA136_transition[i] = DFA.unpackEncodedString(DFA136_transitionS[i]);
        }
    }

    class DFA136 extends DFA {

        public DFA136(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 136;
            this.eot = DFA136_eot;
            this.eof = DFA136_eof;
            this.min = DFA136_min;
            this.max = DFA136_max;
            this.accept = DFA136_accept;
            this.special = DFA136_special;
            this.transition = DFA136_transition;
        }
        public String getDescription() {
            return "()* loopback of 3877:2: ( ( ruleWS )* ( ( (lv_constructs_5_0= rulesigConstructNOSP ) ) | ( ruleWS ( (lv_constructs_7_0= ruletermDeclaration ) ) ) ) )*";
        }
    }
    static final String DFA148_eotS =
        "\7\uffff";
    static final String DFA148_eofS =
        "\7\uffff";
    static final String DFA148_minS =
        "\5\11\2\uffff";
    static final String DFA148_maxS =
        "\5\46\2\uffff";
    static final String DFA148_acceptS =
        "\5\uffff\1\2\1\1";
    static final String DFA148_specialS =
        "\7\uffff}>";
    static final String[] DFA148_transitionS = {
            "\1\5\15\uffff\1\1\1\2\1\3\1\4\3\uffff\1\6\5\uffff\3\6",
            "\1\5\12\uffff\1\6\2\uffff\1\1\1\2\1\3\1\4\3\uffff\1\6\5\uffff"+
            "\3\6",
            "\1\5\12\uffff\1\6\2\uffff\1\1\1\2\1\3\1\4\3\uffff\1\6\5\uffff"+
            "\3\6",
            "\1\5\12\uffff\1\6\2\uffff\1\1\1\2\1\3\1\4\3\uffff\1\6\5\uffff"+
            "\3\6",
            "\1\5\12\uffff\1\6\2\uffff\1\1\1\2\1\3\1\4\3\uffff\1\6\5\uffff"+
            "\3\6",
            "",
            ""
    };

    static final short[] DFA148_eot = DFA.unpackEncodedString(DFA148_eotS);
    static final short[] DFA148_eof = DFA.unpackEncodedString(DFA148_eofS);
    static final char[] DFA148_min = DFA.unpackEncodedStringToUnsignedChars(DFA148_minS);
    static final char[] DFA148_max = DFA.unpackEncodedStringToUnsignedChars(DFA148_maxS);
    static final short[] DFA148_accept = DFA.unpackEncodedString(DFA148_acceptS);
    static final short[] DFA148_special = DFA.unpackEncodedString(DFA148_specialS);
    static final short[][] DFA148_transition;

    static {
        int numStates = DFA148_transitionS.length;
        DFA148_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA148_transition[i] = DFA.unpackEncodedString(DFA148_transitionS[i]);
        }
    }

    class DFA148 extends DFA {

        public DFA148(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 148;
            this.eot = DFA148_eot;
            this.eof = DFA148_eof;
            this.min = DFA148_min;
            this.max = DFA148_max;
            this.accept = DFA148_accept;
            this.special = DFA148_special;
            this.transition = DFA148_transition;
        }
        public String getDescription() {
            return "()* loopback of 4180:2: ( ( ruleWS )* ( ( (lv_constructs_5_0= rulelinkConstructNOSP ) ) | ( ruleWS ( (lv_constructs_7_0= ruleconstantAssignment ) ) ) ) )*";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_ruleModel136 = new BitSet(new long[]{0x00003C0F7F900012L});
    public static final BitSet FOLLOW_rulemodelConstructNOSP_in_ruleModel161 = new BitSet(new long[]{0x00003C0F7F900010L});
    public static final BitSet FOLLOW_ruletermDeclaration_in_ruleModel180 = new BitSet(new long[]{0x00003C0F7F900010L});
    public static final BitSet FOLLOW_ruleWS_in_ruleModel201 = new BitSet(new long[]{0x00003C0F7F900010L});
    public static final BitSet FOLLOW_rulemodelConstructNOSP_in_ruleModel224 = new BitSet(new long[]{0x00003C0F7F900010L});
    public static final BitSet FOLLOW_ruleWS_in_ruleModel247 = new BitSet(new long[]{0x00003C0F78100000L});
    public static final BitSet FOLLOW_ruletermDeclaration_in_ruleModel267 = new BitSet(new long[]{0x00003C0F7F900010L});
    public static final BitSet FOLLOW_ruleWS_in_ruleModel288 = new BitSet(new long[]{0x00003C0F7F900012L});
    public static final BitSet FOLLOW_RULE_PERCENT_in_ruleModel303 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_DOT_in_ruleModel313 = new BitSet(new long[]{0x00003FFF7FFFFFF2L});
    public static final BitSet FOLLOW_ruleanyTerminal_in_ruleModel333 = new BitSet(new long[]{0x00003FFF7FFFFFF2L});
    public static final BitSet FOLLOW_rulemodelConstructNOSP_in_entryRulemodelConstructNOSP372 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulemodelConstructNOSP382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenamespaceDeclaration_in_rulemodelConstructNOSP428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulereadDeclaration_in_rulemodelConstructNOSP455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesigDeclaration_in_rulemodelConstructNOSP482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleviewDeclaration_in_rulemodelConstructNOSP509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleabbrevTermDeclaration_in_rulemodelConstructNOSP538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenameDeclaration_in_rulemodelConstructNOSP557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefixityDeclaration_in_rulemodelConstructNOSP576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunknownConstruct_in_rulemodelConstructNOSP595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleanyTerminal_in_entryRuleanyTerminal635 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleanyTerminal646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleanyDirective_in_ruleanyTerminal693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_ruleanyTerminal726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PERCENT_in_ruleanyTerminal752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleanyTerminal778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_QUOTE_in_ruleanyTerminal804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LCBRACKET_in_ruleanyTerminal830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RCBRACKET_in_ruleanyTerminal856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LSBRACKET_in_ruleanyTerminal882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RSBRACKET_in_ruleanyTerminal908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LBRACKET_in_ruleanyTerminal934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RBRACKET_in_ruleanyTerminal960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOT_in_ruleanyTerminal986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ARROW_in_ruleanyTerminal1012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LARROW_in_ruleanyTerminal1038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_ruleanyTerminal1064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ASSIGN_in_ruleanyTerminal1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TYPE_in_ruleanyTerminal1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_UNDERSCORE_in_ruleanyTerminal1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CID_in_ruleanyTerminal1168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_URISTRING_in_ruleanyTerminal1194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ILLEGAL_TOKEN_in_ruleanyTerminal1220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_entryRuleWS1266 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWS1277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LINESP_in_ruleWS1317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LINEDELIM_in_ruleWS1343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_ruleWS1369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML2_COMMENT_in_ruleWS1395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleID_in_entryRuleID1441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleID1452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CID_in_ruleID1492 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_DOT_in_ruleID1513 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RULE_CID_in_ruleID1533 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleterm_in_entryRuleterm1580 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleterm1590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletermArr_in_ruleterm1636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletermPi_in_entryRuletermPi1670 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletermPi1680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LCBRACKET_in_ruletermPi1716 = new BitSet(new long[]{0x00003C0F7F980010L});
    public static final BitSet FOLLOW_ruleWS_in_ruletermPi1732 = new BitSet(new long[]{0x00003C0F7F980010L});
    public static final BitSet FOLLOW_RULE_CID_in_ruletermPi1752 = new BitSet(new long[]{0x00003C0F7F900250L});
    public static final BitSet FOLLOW_RULE_UNDERSCORE_in_ruletermPi1772 = new BitSet(new long[]{0x00003C0F7F900250L});
    public static final BitSet FOLLOW_ruleWS_in_ruletermPi1797 = new BitSet(new long[]{0x00003C0F7F900250L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruletermPi1810 = new BitSet(new long[]{0x00003C0F7F9C1510L});
    public static final BitSet FOLLOW_ruleWS_in_ruletermPi1826 = new BitSet(new long[]{0x00003C0F7F9C1510L});
    public static final BitSet FOLLOW_ruleterm_in_ruletermPi1848 = new BitSet(new long[]{0x00003C0F7F900210L});
    public static final BitSet FOLLOW_ruleWS_in_ruletermPi1865 = new BitSet(new long[]{0x00003C0F7F900210L});
    public static final BitSet FOLLOW_RULE_RCBRACKET_in_ruletermPi1879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletermLambda_in_entryRuletermLambda1914 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletermLambda1924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LSBRACKET_in_ruletermLambda1960 = new BitSet(new long[]{0x00003C0F7F980010L});
    public static final BitSet FOLLOW_ruleWS_in_ruletermLambda1976 = new BitSet(new long[]{0x00003C0F7F980010L});
    public static final BitSet FOLLOW_RULE_CID_in_ruletermLambda1996 = new BitSet(new long[]{0x00003C0F7F900850L});
    public static final BitSet FOLLOW_RULE_UNDERSCORE_in_ruletermLambda2016 = new BitSet(new long[]{0x00003C0F7F900850L});
    public static final BitSet FOLLOW_ruleWS_in_ruletermLambda2041 = new BitSet(new long[]{0x00003C0F7F900850L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruletermLambda2054 = new BitSet(new long[]{0x00003C0F7F9C1510L});
    public static final BitSet FOLLOW_ruleWS_in_ruletermLambda2070 = new BitSet(new long[]{0x00003C0F7F9C1510L});
    public static final BitSet FOLLOW_ruleterm_in_ruletermLambda2092 = new BitSet(new long[]{0x00003C0F7F900810L});
    public static final BitSet FOLLOW_ruleWS_in_ruletermLambda2109 = new BitSet(new long[]{0x00003C0F7F900810L});
    public static final BitSet FOLLOW_RULE_RSBRACKET_in_ruletermLambda2123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletermArr_in_entryRuletermArr2158 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletermArr2168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletermAppOrLambdaOrPi_in_ruletermArr2215 = new BitSet(new long[]{0x00003C0F7F90C012L});
    public static final BitSet FOLLOW_ruleWS_in_ruletermArr2241 = new BitSet(new long[]{0x00003C0F7F90C010L});
    public static final BitSet FOLLOW_RULE_ARROW_in_ruletermArr2254 = new BitSet(new long[]{0x00003C0F7F9C1510L});
    public static final BitSet FOLLOW_RULE_LARROW_in_ruletermArr2270 = new BitSet(new long[]{0x00003C0F7F9C1510L});
    public static final BitSet FOLLOW_ruleWS_in_ruletermArr2287 = new BitSet(new long[]{0x00003C0F7F9C1510L});
    public static final BitSet FOLLOW_ruletermArr_in_ruletermArr2309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletermAppOrLambdaOrPi_in_entryRuletermAppOrLambdaOrPi2347 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletermAppOrLambdaOrPi2357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletermLambdaOrPi_in_ruletermAppOrLambdaOrPi2404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletermAppNoLambdaNoPi_in_ruletermAppOrLambdaOrPi2431 = new BitSet(new long[]{0x00003C0F7F900512L});
    public static final BitSet FOLLOW_ruleWS_in_ruletermAppOrLambdaOrPi2449 = new BitSet(new long[]{0x00003C0F7F900510L});
    public static final BitSet FOLLOW_ruletermLambdaOrPi_in_ruletermAppOrLambdaOrPi2471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletermAppThenLambdaOrPi_in_entryRuletermAppThenLambdaOrPi2510 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletermAppThenLambdaOrPi2520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletermAppNoLambdaNoPi_in_ruletermAppThenLambdaOrPi2566 = new BitSet(new long[]{0x00003C0F7F900512L});
    public static final BitSet FOLLOW_ruleWS_in_ruletermAppThenLambdaOrPi2584 = new BitSet(new long[]{0x00003C0F7F900510L});
    public static final BitSet FOLLOW_ruletermLambdaOrPi_in_ruletermAppThenLambdaOrPi2606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletermAppNoLambdaNoPi_in_entryRuletermAppNoLambdaNoPi2644 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletermAppNoLambdaNoPi2654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletermBase_in_ruletermAppNoLambdaNoPi2701 = new BitSet(new long[]{0x00003C0F7F9C1512L});
    public static final BitSet FOLLOW_ruleWS_in_ruletermAppNoLambdaNoPi2727 = new BitSet(new long[]{0x00003C0F7F9C1510L});
    public static final BitSet FOLLOW_ruletermBase_in_ruletermAppNoLambdaNoPi2749 = new BitSet(new long[]{0x00003C0F7F9C1512L});
    public static final BitSet FOLLOW_ruletermLambdaOrPi_in_entryRuletermLambdaOrPi2787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletermLambdaOrPi2797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletermPi_in_ruletermLambdaOrPi2846 = new BitSet(new long[]{0x00003C0F7F9C1510L});
    public static final BitSet FOLLOW_ruletermLambda_in_ruletermLambdaOrPi2865 = new BitSet(new long[]{0x00003C0F7F9C1510L});
    public static final BitSet FOLLOW_ruleWS_in_ruletermLambdaOrPi2885 = new BitSet(new long[]{0x00003C0F7F9C1510L});
    public static final BitSet FOLLOW_ruletermAppThenLambdaOrPi_in_ruletermLambdaOrPi2909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletermBase_in_entryRuletermBase2945 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletermBase2955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletermAtomic_in_ruletermBase3001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LBRACKET_in_ruletermBase3028 = new BitSet(new long[]{0x00003C0F7F9C3510L});
    public static final BitSet FOLLOW_ruleWS_in_ruletermBase3044 = new BitSet(new long[]{0x00003C0F7F9C3510L});
    public static final BitSet FOLLOW_ruleterm_in_ruletermBase3067 = new BitSet(new long[]{0x00003C0F7F902050L});
    public static final BitSet FOLLOW_ruleWS_in_ruletermBase3084 = new BitSet(new long[]{0x00003C0F7F902050L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruletermBase3097 = new BitSet(new long[]{0x00003C0F7F9C1510L});
    public static final BitSet FOLLOW_ruleWS_in_ruletermBase3113 = new BitSet(new long[]{0x00003C0F7F9C1510L});
    public static final BitSet FOLLOW_ruleterm_in_ruletermBase3135 = new BitSet(new long[]{0x00003C0F7F902010L});
    public static final BitSet FOLLOW_ruleWS_in_ruletermBase3152 = new BitSet(new long[]{0x00003C0F7F902010L});
    public static final BitSet FOLLOW_RULE_RBRACKET_in_ruletermBase3168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletermAtomic_in_entryRuletermAtomic3204 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletermAtomic3214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TYPE_in_ruletermAtomic3256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_UNDERSCORE_in_ruletermAtomic3284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleID_in_ruletermAtomic3316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemorphism_in_entryRulemorphism3352 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulemorphism3362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleID_in_rulemorphism3410 = new BitSet(new long[]{0x00003C0F7F900012L});
    public static final BitSet FOLLOW_ruleWS_in_rulemorphism3428 = new BitSet(new long[]{0x00003C0F7F900010L});
    public static final BitSet FOLLOW_ruleID_in_rulemorphism3452 = new BitSet(new long[]{0x00003C0F7F900012L});
    public static final BitSet FOLLOW_ruletermDeclaration_in_entryRuletermDeclaration3490 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletermDeclaration3500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleID_in_ruletermDeclaration3546 = new BitSet(new long[]{0x00003C0F7F910070L});
    public static final BitSet FOLLOW_ruleWS_in_ruletermDeclaration3609 = new BitSet(new long[]{0x00003C0F7F900050L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruletermDeclaration3621 = new BitSet(new long[]{0x00003C0F7F9C1510L});
    public static final BitSet FOLLOW_ruleWS_in_ruletermDeclaration3637 = new BitSet(new long[]{0x00003C0F7F9C1510L});
    public static final BitSet FOLLOW_ruleterm_in_ruletermDeclaration3659 = new BitSet(new long[]{0x00003C0F7F910070L});
    public static final BitSet FOLLOW_ruleWS_in_ruletermDeclaration3732 = new BitSet(new long[]{0x00003C0F7F910010L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_ruletermDeclaration3744 = new BitSet(new long[]{0x00003C0F7F9C1510L});
    public static final BitSet FOLLOW_ruleWS_in_ruletermDeclaration3760 = new BitSet(new long[]{0x00003C0F7F9C1510L});
    public static final BitSet FOLLOW_ruleterm_in_ruletermDeclaration3782 = new BitSet(new long[]{0x00003C0F7F910070L});
    public static final BitSet FOLLOW_ruleWS_in_ruletermDeclaration3840 = new BitSet(new long[]{0x00003C0F7F900030L});
    public static final BitSet FOLLOW_RULE_DOT_in_ruletermDeclaration3852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleabbrevTermDeclaration_in_entryRuleabbrevTermDeclaration3887 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleabbrevTermDeclaration3897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleabbrevTermDeclaration3934 = new BitSet(new long[]{0x00003C0F7F900010L});
    public static final BitSet FOLLOW_ruleWS_in_ruleabbrevTermDeclaration3951 = new BitSet(new long[]{0x00003C0F7F900010L});
    public static final BitSet FOLLOW_ruletermDeclaration_in_ruleabbrevTermDeclaration3974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenameDeclaration_in_entryRulenameDeclaration4009 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenameDeclaration4019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rulenameDeclaration4056 = new BitSet(new long[]{0x00003C0F7F900010L});
    public static final BitSet FOLLOW_ruleWS_in_rulenameDeclaration4073 = new BitSet(new long[]{0x00003C0F7F900010L});
    public static final BitSet FOLLOW_ruleID_in_rulenameDeclaration4095 = new BitSet(new long[]{0x00003C0F7F900010L});
    public static final BitSet FOLLOW_ruleWS_in_rulenameDeclaration4112 = new BitSet(new long[]{0x00003C0F7F900010L});
    public static final BitSet FOLLOW_RULE_CID_in_rulenameDeclaration4130 = new BitSet(new long[]{0x00003C0F7F900030L});
    public static final BitSet FOLLOW_ruleWS_in_rulenameDeclaration4152 = new BitSet(new long[]{0x00003C0F7F900030L});
    public static final BitSet FOLLOW_RULE_DOT_in_rulenameDeclaration4164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefixityDeclaration_in_entryRulefixityDeclaration4199 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefixityDeclaration4209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INFIXNONE_in_rulefixityDeclaration4252 = new BitSet(new long[]{0x00003C0F7F900010L});
    public static final BitSet FOLLOW_RULE_INFIXLEFT_in_rulefixityDeclaration4280 = new BitSet(new long[]{0x00003C0F7F900010L});
    public static final BitSet FOLLOW_RULE_INFIXRIGHT_in_rulefixityDeclaration4308 = new BitSet(new long[]{0x00003C0F7F900010L});
    public static final BitSet FOLLOW_34_in_rulefixityDeclaration4337 = new BitSet(new long[]{0x00003C0F7F900010L});
    public static final BitSet FOLLOW_35_in_rulefixityDeclaration4374 = new BitSet(new long[]{0x00003C0F7F900010L});
    public static final BitSet FOLLOW_ruleWS_in_rulefixityDeclaration4405 = new BitSet(new long[]{0x00003C0F7F900010L});
    public static final BitSet FOLLOW_RULE_CID_in_rulefixityDeclaration4423 = new BitSet(new long[]{0x00003C0F7F900010L});
    public static final BitSet FOLLOW_ruleWS_in_rulefixityDeclaration4445 = new BitSet(new long[]{0x00003C0F7F900010L});
    public static final BitSet FOLLOW_ruleID_in_rulefixityDeclaration4467 = new BitSet(new long[]{0x00003C0F7F900030L});
    public static final BitSet FOLLOW_ruleWS_in_rulefixityDeclaration4484 = new BitSet(new long[]{0x00003C0F7F900030L});
    public static final BitSet FOLLOW_RULE_DOT_in_rulefixityDeclaration4496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesigMetaDeclaration_in_entryRulesigMetaDeclaration4531 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesigMetaDeclaration4541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rulesigMetaDeclaration4578 = new BitSet(new long[]{0x00003C0F7F900010L});
    public static final BitSet FOLLOW_ruleWS_in_rulesigMetaDeclaration4595 = new BitSet(new long[]{0x00003C0F7F900010L});
    public static final BitSet FOLLOW_ruleID_in_rulesigMetaDeclaration4619 = new BitSet(new long[]{0x00003C0F7F900030L});
    public static final BitSet FOLLOW_ruleWS_in_rulesigMetaDeclaration4636 = new BitSet(new long[]{0x00003C0F7F900030L});
    public static final BitSet FOLLOW_RULE_DOT_in_rulesigMetaDeclaration4648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesigIncludeDeclaration_in_entryRulesigIncludeDeclaration4683 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesigIncludeDeclaration4693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rulesigIncludeDeclaration4730 = new BitSet(new long[]{0x00003C0F7F900010L});
    public static final BitSet FOLLOW_ruleWS_in_rulesigIncludeDeclaration4747 = new BitSet(new long[]{0x00003C0F7F900010L});
    public static final BitSet FOLLOW_ruleID_in_rulesigIncludeDeclaration4771 = new BitSet(new long[]{0x00003D0F7F900030L});
    public static final BitSet FOLLOW_ruleWS_in_rulesigIncludeDeclaration4789 = new BitSet(new long[]{0x00003D0F7F900010L});
    public static final BitSet FOLLOW_ruleincludeOps_in_rulesigIncludeDeclaration4811 = new BitSet(new long[]{0x00003C0F7F900030L});
    public static final BitSet FOLLOW_ruleWS_in_rulesigIncludeDeclaration4830 = new BitSet(new long[]{0x00003C0F7F900030L});
    public static final BitSet FOLLOW_RULE_DOT_in_rulesigIncludeDeclaration4842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestructDeclaration_in_entryRulestructDeclaration4877 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestructDeclaration4887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rulestructDeclaration4924 = new BitSet(new long[]{0x00003C8F7F900010L});
    public static final BitSet FOLLOW_ruleWS_in_rulestructDeclaration4941 = new BitSet(new long[]{0x00003C8F7F900010L});
    public static final BitSet FOLLOW_39_in_rulestructDeclaration4955 = new BitSet(new long[]{0x00003C0F7F900010L});
    public static final BitSet FOLLOW_ruleWS_in_rulestructDeclaration4972 = new BitSet(new long[]{0x00003C0F7F900010L});
    public static final BitSet FOLLOW_ruleID_in_rulestructDeclaration4996 = new BitSet(new long[]{0x00003D0F7F910070L});
    public static final BitSet FOLLOW_ruleWS_in_rulestructDeclaration5015 = new BitSet(new long[]{0x00003C0F7F910010L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_rulestructDeclaration5027 = new BitSet(new long[]{0x00003C0F7F900010L});
    public static final BitSet FOLLOW_ruleWS_in_rulestructDeclaration5043 = new BitSet(new long[]{0x00003C0F7F900010L});
    public static final BitSet FOLLOW_rulemorphism_in_rulestructDeclaration5065 = new BitSet(new long[]{0x00003D0F7F900030L});
    public static final BitSet FOLLOW_ruleWS_in_rulestructDeclaration5090 = new BitSet(new long[]{0x00003C0F7F900050L});
    public static final BitSet FOLLOW_RULE_COLON_in_rulestructDeclaration5102 = new BitSet(new long[]{0x00003C0F7F900010L});
    public static final BitSet FOLLOW_ruleWS_in_rulestructDeclaration5118 = new BitSet(new long[]{0x00003C0F7F900010L});
    public static final BitSet FOLLOW_ruleID_in_rulestructDeclaration5142 = new BitSet(new long[]{0x00003D0F7F910030L});
    public static final BitSet FOLLOW_ruleWS_in_rulestructDeclaration5160 = new BitSet(new long[]{0x00003C0F7F910010L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_rulestructDeclaration5172 = new BitSet(new long[]{0x00003C0F7F900110L});
    public static final BitSet FOLLOW_ruleWS_in_rulestructDeclaration5188 = new BitSet(new long[]{0x00003C0F7F900110L});
    public static final BitSet FOLLOW_rulelinkBody_in_rulestructDeclaration5211 = new BitSet(new long[]{0x00003D0F7F900030L});
    public static final BitSet FOLLOW_ruleWS_in_rulestructDeclaration5234 = new BitSet(new long[]{0x00003C0F78100000L});
    public static final BitSet FOLLOW_rulemorphism_in_rulestructDeclaration5254 = new BitSet(new long[]{0x00003D0F7F900030L});
    public static final BitSet FOLLOW_ruleWS_in_rulestructDeclaration5279 = new BitSet(new long[]{0x00003D0F7F900010L});
    public static final BitSet FOLLOW_ruleincludeOps_in_rulestructDeclaration5301 = new BitSet(new long[]{0x00003C0F7F900030L});
    public static final BitSet FOLLOW_ruleWS_in_rulestructDeclaration5320 = new BitSet(new long[]{0x00003C0F7F900030L});
    public static final BitSet FOLLOW_RULE_DOT_in_rulestructDeclaration5332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleincludeOps_in_entryRuleincludeOps5367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleincludeOps5377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleincludeOps5423 = new BitSet(new long[]{0x00003C0F7F900012L});
    public static final BitSet FOLLOW_ruleWS_in_ruleincludeOps5441 = new BitSet(new long[]{0x00003C0F7F900010L});
    public static final BitSet FOLLOW_rulealiasDeclaration_in_ruleincludeOps5463 = new BitSet(new long[]{0x00003C0F7F900012L});
    public static final BitSet FOLLOW_rulealiasDeclaration_in_entryRulealiasDeclaration5501 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulealiasDeclaration5511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleID_in_rulealiasDeclaration5557 = new BitSet(new long[]{0x00003E0F7F900012L});
    public static final BitSet FOLLOW_ruleWS_in_rulealiasDeclaration5580 = new BitSet(new long[]{0x00003E0F7F900010L});
    public static final BitSet FOLLOW_41_in_rulealiasDeclaration5593 = new BitSet(new long[]{0x00003C0F7F900010L});
    public static final BitSet FOLLOW_ruleWS_in_rulealiasDeclaration5610 = new BitSet(new long[]{0x00003C0F7F900010L});
    public static final BitSet FOLLOW_RULE_CID_in_rulealiasDeclaration5628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconstantAssignment_in_entryRuleconstantAssignment5671 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleconstantAssignment5681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleID_in_ruleconstantAssignment5727 = new BitSet(new long[]{0x00003C0F7F920010L});
    public static final BitSet FOLLOW_ruleWS_in_ruleconstantAssignment5744 = new BitSet(new long[]{0x00003C0F7F920010L});
    public static final BitSet FOLLOW_RULE_ASSIGN_in_ruleconstantAssignment5756 = new BitSet(new long[]{0x00003C0F7F9C1510L});
    public static final BitSet FOLLOW_ruleWS_in_ruleconstantAssignment5772 = new BitSet(new long[]{0x00003C0F7F9C1510L});
    public static final BitSet FOLLOW_ruleterm_in_ruleconstantAssignment5794 = new BitSet(new long[]{0x00003C0F7F900030L});
    public static final BitSet FOLLOW_ruleWS_in_ruleconstantAssignment5811 = new BitSet(new long[]{0x00003C0F7F900030L});
    public static final BitSet FOLLOW_RULE_DOT_in_ruleconstantAssignment5823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestructAssignment_in_entryRulestructAssignment5858 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestructAssignment5868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rulestructAssignment5905 = new BitSet(new long[]{0x00003C0F7F900010L});
    public static final BitSet FOLLOW_ruleWS_in_rulestructAssignment5922 = new BitSet(new long[]{0x00003C0F7F900010L});
    public static final BitSet FOLLOW_ruleID_in_rulestructAssignment5944 = new BitSet(new long[]{0x00003C0F7F920010L});
    public static final BitSet FOLLOW_ruleWS_in_rulestructAssignment5961 = new BitSet(new long[]{0x00003C0F7F920010L});
    public static final BitSet FOLLOW_RULE_ASSIGN_in_rulestructAssignment5973 = new BitSet(new long[]{0x00003C0F7F900010L});
    public static final BitSet FOLLOW_ruleWS_in_rulestructAssignment5989 = new BitSet(new long[]{0x00003C0F7F900010L});
    public static final BitSet FOLLOW_rulemorphism_in_rulestructAssignment6011 = new BitSet(new long[]{0x00003C0F7F900030L});
    public static final BitSet FOLLOW_ruleWS_in_rulestructAssignment6028 = new BitSet(new long[]{0x00003C0F7F900030L});
    public static final BitSet FOLLOW_RULE_DOT_in_rulestructAssignment6040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleviewMetaDeclaration_in_entryRuleviewMetaDeclaration6075 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleviewMetaDeclaration6085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleviewMetaDeclaration6122 = new BitSet(new long[]{0x00003C0F7F900010L});
    public static final BitSet FOLLOW_ruleWS_in_ruleviewMetaDeclaration6139 = new BitSet(new long[]{0x00003C0F7F900010L});
    public static final BitSet FOLLOW_rulemorphism_in_ruleviewMetaDeclaration6161 = new BitSet(new long[]{0x00003C0F7F900030L});
    public static final BitSet FOLLOW_ruleWS_in_ruleviewMetaDeclaration6178 = new BitSet(new long[]{0x00003C0F7F900030L});
    public static final BitSet FOLLOW_RULE_DOT_in_ruleviewMetaDeclaration6190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleviewIncludeDeclaration_in_entryRuleviewIncludeDeclaration6225 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleviewIncludeDeclaration6235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleviewIncludeDeclaration6272 = new BitSet(new long[]{0x00003C0F7F900010L});
    public static final BitSet FOLLOW_ruleWS_in_ruleviewIncludeDeclaration6289 = new BitSet(new long[]{0x00003C0F7F900010L});
    public static final BitSet FOLLOW_rulemorphism_in_ruleviewIncludeDeclaration6311 = new BitSet(new long[]{0x00003C0F7F900030L});
    public static final BitSet FOLLOW_ruleWS_in_ruleviewIncludeDeclaration6328 = new BitSet(new long[]{0x00003C0F7F900030L});
    public static final BitSet FOLLOW_RULE_DOT_in_ruleviewIncludeDeclaration6340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleanyDirective_in_entryRuleanyDirective6376 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleanyDirective6387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_UNKNOWNDIRECTIVE_in_ruleanyDirective6427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleanyDirective6451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleanyDirective6470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleanyDirective6489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleanyDirective6508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleanyDirective6527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleanyDirective6546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleanyDirective6565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleanyDirective6584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleanyDirective6603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleanyDirective6622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleanyDirective6641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleanyDirective6660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INFIXNONE_in_ruleanyDirective6681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INFIXLEFT_in_ruleanyDirective6707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INFIXRIGHT_in_ruleanyDirective6733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleanyDirective6757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleanyDirective6776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunknownBrackets_in_entryRuleunknownBrackets6816 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleunknownBrackets6826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LCBRACKET_in_ruleunknownBrackets6871 = new BitSet(new long[]{0x00003FFF7F9C1710L});
    public static final BitSet FOLLOW_ruleWS_in_ruleunknownBrackets6888 = new BitSet(new long[]{0x00003FFF7F9C1510L});
    public static final BitSet FOLLOW_ruleanyConstruct_in_ruleunknownBrackets6910 = new BitSet(new long[]{0x00003FFF7F9C1710L});
    public static final BitSet FOLLOW_ruleWS_in_ruleunknownBrackets6929 = new BitSet(new long[]{0x00003C0F7F900210L});
    public static final BitSet FOLLOW_RULE_RCBRACKET_in_ruleunknownBrackets6941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleanyConstruct_in_entryRuleanyConstruct6976 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleanyConstruct6986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunknownBody_in_ruleanyConstruct7033 = new BitSet(new long[]{0x00003C0F7F900030L});
    public static final BitSet FOLLOW_ruleanyDirective_in_ruleanyConstruct7061 = new BitSet(new long[]{0x00003C0F7F9C1530L});
    public static final BitSet FOLLOW_ruleWS_in_ruleanyConstruct7079 = new BitSet(new long[]{0x00003C0F7F9C1510L});
    public static final BitSet FOLLOW_ruleunknownBody_in_ruleanyConstruct7101 = new BitSet(new long[]{0x00003C0F7F900030L});
    public static final BitSet FOLLOW_ruleWS_in_ruleanyConstruct7122 = new BitSet(new long[]{0x00003C0F7F900030L});
    public static final BitSet FOLLOW_RULE_DOT_in_ruleanyConstruct7134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunknownBody_in_entryRuleunknownBody7169 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleunknownBody7179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleterm_in_ruleunknownBody7225 = new BitSet(new long[]{0x00003FFF7F930052L});
    public static final BitSet FOLLOW_ruleWS_in_ruleunknownBody7243 = new BitSet(new long[]{0x00003FFF7F930050L});
    public static final BitSet FOLLOW_ruleWS_in_ruleunknownBody7262 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_ruleunknownBody7272 = new BitSet(new long[]{0x00003C0F7F9C1510L});
    public static final BitSet FOLLOW_ruleunknownBrackets_in_ruleunknownBody7293 = new BitSet(new long[]{0x00003FFF7F930052L});
    public static final BitSet FOLLOW_ruleWS_in_ruleunknownBody7317 = new BitSet(new long[]{0x00003C0F7F9C1510L});
    public static final BitSet FOLLOW_ruleterm_in_ruleunknownBody7350 = new BitSet(new long[]{0x00003FFF7F930052L});
    public static final BitSet FOLLOW_ruleunknownBrackets_in_ruleunknownBody7377 = new BitSet(new long[]{0x00003FFF7F930052L});
    public static final BitSet FOLLOW_RULE_ASSIGN_in_ruleunknownBody7399 = new BitSet(new long[]{0x00003C0F7F9C1510L});
    public static final BitSet FOLLOW_ruleunknownBrackets_in_ruleunknownBody7420 = new BitSet(new long[]{0x00003FFF7F930052L});
    public static final BitSet FOLLOW_ruleWS_in_ruleunknownBody7444 = new BitSet(new long[]{0x00003C0F7F9C1510L});
    public static final BitSet FOLLOW_ruleterm_in_ruleunknownBody7477 = new BitSet(new long[]{0x00003FFF7F930052L});
    public static final BitSet FOLLOW_ruleunknownBrackets_in_ruleunknownBody7504 = new BitSet(new long[]{0x00003FFF7F930052L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleunknownBody7526 = new BitSet(new long[]{0x00003C0F7F9C1510L});
    public static final BitSet FOLLOW_ruleWS_in_ruleunknownBody7542 = new BitSet(new long[]{0x00003C0F7F9C1510L});
    public static final BitSet FOLLOW_ruleterm_in_ruleunknownBody7575 = new BitSet(new long[]{0x00003FFF7F930052L});
    public static final BitSet FOLLOW_ruleunknownBrackets_in_ruleunknownBody7602 = new BitSet(new long[]{0x00003FFF7F930052L});
    public static final BitSet FOLLOW_ruleanyDirective_in_ruleunknownBody7626 = new BitSet(new long[]{0x00003FFF7F930052L});
    public static final BitSet FOLLOW_ruleunknownConstruct_in_entryRuleunknownConstruct7664 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleunknownConstruct7674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_UNKNOWNDIRECTIVE_in_ruleunknownConstruct7716 = new BitSet(new long[]{0x00003C0F7F9C1530L});
    public static final BitSet FOLLOW_ruleWS_in_ruleunknownConstruct7739 = new BitSet(new long[]{0x00003C0F7F9C1510L});
    public static final BitSet FOLLOW_ruleunknownBody_in_ruleunknownConstruct7761 = new BitSet(new long[]{0x00003C0F7F900030L});
    public static final BitSet FOLLOW_ruleWS_in_ruleunknownConstruct7780 = new BitSet(new long[]{0x00003C0F7F900030L});
    public static final BitSet FOLLOW_RULE_DOT_in_ruleunknownConstruct7792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenamespaceDeclaration_in_entryRulenamespaceDeclaration7827 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenamespaceDeclaration7837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rulenamespaceDeclaration7874 = new BitSet(new long[]{0x00003C0F7FB00010L});
    public static final BitSet FOLLOW_ruleWS_in_rulenamespaceDeclaration7891 = new BitSet(new long[]{0x00003C0F7FB00010L});
    public static final BitSet FOLLOW_RULE_CID_in_rulenamespaceDeclaration7910 = new BitSet(new long[]{0x00003C0F7F910010L});
    public static final BitSet FOLLOW_ruleWS_in_rulenamespaceDeclaration7932 = new BitSet(new long[]{0x00003C0F7F910010L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_rulenamespaceDeclaration7944 = new BitSet(new long[]{0x00003C0F7FB00010L});
    public static final BitSet FOLLOW_ruleWS_in_rulenamespaceDeclaration7960 = new BitSet(new long[]{0x00003C0F7FB00010L});
    public static final BitSet FOLLOW_RULE_URISTRING_in_rulenamespaceDeclaration7980 = new BitSet(new long[]{0x00003C0F7F900030L});
    public static final BitSet FOLLOW_ruleWS_in_rulenamespaceDeclaration8002 = new BitSet(new long[]{0x00003C0F7F900030L});
    public static final BitSet FOLLOW_RULE_DOT_in_rulenamespaceDeclaration8014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulereadDeclaration_in_entryRulereadDeclaration8049 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulereadDeclaration8059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rulereadDeclaration8096 = new BitSet(new long[]{0x00003C0F7FB00010L});
    public static final BitSet FOLLOW_ruleWS_in_rulereadDeclaration8113 = new BitSet(new long[]{0x00003C0F7FB00010L});
    public static final BitSet FOLLOW_RULE_URISTRING_in_rulereadDeclaration8131 = new BitSet(new long[]{0x00003C0F7F900030L});
    public static final BitSet FOLLOW_ruleWS_in_rulereadDeclaration8153 = new BitSet(new long[]{0x00003C0F7F900030L});
    public static final BitSet FOLLOW_RULE_DOT_in_rulereadDeclaration8165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesigConstructNOSP_in_entryRulesigConstructNOSP8200 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesigConstructNOSP8210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleabbrevTermDeclaration_in_rulesigConstructNOSP8257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenameDeclaration_in_rulesigConstructNOSP8284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefixityDeclaration_in_rulesigConstructNOSP8311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunknownConstruct_in_rulesigConstructNOSP8338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesigMetaDeclaration_in_rulesigConstructNOSP8365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesigIncludeDeclaration_in_rulesigConstructNOSP8392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestructDeclaration_in_rulesigConstructNOSP8419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesigDeclaration_in_rulesigConstructNOSP8446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleinternalViewDeclaration_in_rulesigConstructNOSP8473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesigBody_in_entryRulesigBody8510 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesigBody8520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LCBRACKET_in_rulesigBody8565 = new BitSet(new long[]{0x00003C7F7F900210L});
    public static final BitSet FOLLOW_ruleWS_in_rulesigBody8581 = new BitSet(new long[]{0x00003C7F7F900210L});
    public static final BitSet FOLLOW_rulesigConstructNOSP_in_rulesigBody8606 = new BitSet(new long[]{0x00003C7F7F900210L});
    public static final BitSet FOLLOW_ruletermDeclaration_in_rulesigBody8625 = new BitSet(new long[]{0x00003C7F7F900210L});
    public static final BitSet FOLLOW_ruleWS_in_rulesigBody8646 = new BitSet(new long[]{0x00003C7F7F900010L});
    public static final BitSet FOLLOW_rulesigConstructNOSP_in_rulesigBody8669 = new BitSet(new long[]{0x00003C7F7F900210L});
    public static final BitSet FOLLOW_ruleWS_in_rulesigBody8692 = new BitSet(new long[]{0x00003C0F78100000L});
    public static final BitSet FOLLOW_ruletermDeclaration_in_rulesigBody8712 = new BitSet(new long[]{0x00003C7F7F900210L});
    public static final BitSet FOLLOW_ruleWS_in_rulesigBody8733 = new BitSet(new long[]{0x00003C0F7F900210L});
    public static final BitSet FOLLOW_RULE_RCBRACKET_in_rulesigBody8747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesigDeclaration_in_entryRulesigDeclaration8782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesigDeclaration8792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rulesigDeclaration8829 = new BitSet(new long[]{0x00003C0F7F900010L});
    public static final BitSet FOLLOW_ruleWS_in_rulesigDeclaration8846 = new BitSet(new long[]{0x00003C0F7F900010L});
    public static final BitSet FOLLOW_RULE_CID_in_rulesigDeclaration8864 = new BitSet(new long[]{0x00003C0F7F910010L});
    public static final BitSet FOLLOW_ruleWS_in_rulesigDeclaration8886 = new BitSet(new long[]{0x00003C0F7F910010L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_rulesigDeclaration8898 = new BitSet(new long[]{0x00003C0F7F900110L});
    public static final BitSet FOLLOW_ruleWS_in_rulesigDeclaration8914 = new BitSet(new long[]{0x00003C0F7F900110L});
    public static final BitSet FOLLOW_rulesigBody_in_rulesigDeclaration8936 = new BitSet(new long[]{0x00003C0F7F900030L});
    public static final BitSet FOLLOW_ruleWS_in_rulesigDeclaration8953 = new BitSet(new long[]{0x00003C0F7F900030L});
    public static final BitSet FOLLOW_RULE_DOT_in_rulesigDeclaration8965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelinkConstructNOSP_in_entryRulelinkConstructNOSP9000 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulelinkConstructNOSP9010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestructAssignment_in_rulelinkConstructNOSP9057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleviewMetaDeclaration_in_rulelinkConstructNOSP9084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleviewIncludeDeclaration_in_rulelinkConstructNOSP9111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunknownConstruct_in_rulelinkConstructNOSP9138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelinkBody_in_entryRulelinkBody9175 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulelinkBody9185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LCBRACKET_in_rulelinkBody9230 = new BitSet(new long[]{0x00003C7F7F900210L});
    public static final BitSet FOLLOW_ruleWS_in_rulelinkBody9246 = new BitSet(new long[]{0x00003C7F7F900210L});
    public static final BitSet FOLLOW_rulelinkConstructNOSP_in_rulelinkBody9271 = new BitSet(new long[]{0x00003C7F7F900210L});
    public static final BitSet FOLLOW_ruleconstantAssignment_in_rulelinkBody9290 = new BitSet(new long[]{0x00003C7F7F900210L});
    public static final BitSet FOLLOW_ruleWS_in_rulelinkBody9311 = new BitSet(new long[]{0x00003C7F7F900010L});
    public static final BitSet FOLLOW_rulelinkConstructNOSP_in_rulelinkBody9334 = new BitSet(new long[]{0x00003C7F7F900210L});
    public static final BitSet FOLLOW_ruleWS_in_rulelinkBody9357 = new BitSet(new long[]{0x00003C7F78100000L});
    public static final BitSet FOLLOW_ruleconstantAssignment_in_rulelinkBody9377 = new BitSet(new long[]{0x00003C7F7F900210L});
    public static final BitSet FOLLOW_ruleWS_in_rulelinkBody9398 = new BitSet(new long[]{0x00003C0F7F900210L});
    public static final BitSet FOLLOW_RULE_RCBRACKET_in_rulelinkBody9412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleviewDeclaration_in_entryRuleviewDeclaration9447 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleviewDeclaration9457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleviewDeclaration9494 = new BitSet(new long[]{0x00003C8F7F900010L});
    public static final BitSet FOLLOW_ruleWS_in_ruleviewDeclaration9511 = new BitSet(new long[]{0x00003C8F7F900010L});
    public static final BitSet FOLLOW_39_in_ruleviewDeclaration9525 = new BitSet(new long[]{0x00003C0F7F900010L});
    public static final BitSet FOLLOW_ruleWS_in_ruleviewDeclaration9542 = new BitSet(new long[]{0x00003C0F7F900010L});
    public static final BitSet FOLLOW_RULE_CID_in_ruleviewDeclaration9562 = new BitSet(new long[]{0x00003C0F7F900050L});
    public static final BitSet FOLLOW_ruleWS_in_ruleviewDeclaration9584 = new BitSet(new long[]{0x00003C0F7F900050L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleviewDeclaration9596 = new BitSet(new long[]{0x00003C0F7F900010L});
    public static final BitSet FOLLOW_ruleWS_in_ruleviewDeclaration9612 = new BitSet(new long[]{0x00003C0F7F900010L});
    public static final BitSet FOLLOW_ruleID_in_ruleviewDeclaration9636 = new BitSet(new long[]{0x00003C0F7F904010L});
    public static final BitSet FOLLOW_ruleWS_in_ruleviewDeclaration9653 = new BitSet(new long[]{0x00003C0F7F904010L});
    public static final BitSet FOLLOW_RULE_ARROW_in_ruleviewDeclaration9665 = new BitSet(new long[]{0x00003C0F7F900010L});
    public static final BitSet FOLLOW_ruleWS_in_ruleviewDeclaration9681 = new BitSet(new long[]{0x00003C0F7F900010L});
    public static final BitSet FOLLOW_rulemorphism_in_ruleviewDeclaration9703 = new BitSet(new long[]{0x00003C0F7F910010L});
    public static final BitSet FOLLOW_ruleWS_in_ruleviewDeclaration9720 = new BitSet(new long[]{0x00003C0F7F910010L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_ruleviewDeclaration9732 = new BitSet(new long[]{0x00003C0F7F900110L});
    public static final BitSet FOLLOW_ruleWS_in_ruleviewDeclaration9748 = new BitSet(new long[]{0x00003C0F7F900110L});
    public static final BitSet FOLLOW_rulelinkBody_in_ruleviewDeclaration9771 = new BitSet(new long[]{0x00003C0F7F900030L});
    public static final BitSet FOLLOW_ruleWS_in_ruleviewDeclaration9794 = new BitSet(new long[]{0x00003C0F78100000L});
    public static final BitSet FOLLOW_rulemorphism_in_ruleviewDeclaration9814 = new BitSet(new long[]{0x00003C0F7F900030L});
    public static final BitSet FOLLOW_ruleWS_in_ruleviewDeclaration9833 = new BitSet(new long[]{0x00003C0F7F900030L});
    public static final BitSet FOLLOW_RULE_DOT_in_ruleviewDeclaration9845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleinternalViewDeclaration_in_entryRuleinternalViewDeclaration9880 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleinternalViewDeclaration9890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleinternalViewDeclaration9927 = new BitSet(new long[]{0x00003C8F7F900010L});
    public static final BitSet FOLLOW_ruleWS_in_ruleinternalViewDeclaration9944 = new BitSet(new long[]{0x00003C8F7F900010L});
    public static final BitSet FOLLOW_39_in_ruleinternalViewDeclaration9958 = new BitSet(new long[]{0x00003C0F7F900010L});
    public static final BitSet FOLLOW_ruleWS_in_ruleinternalViewDeclaration9975 = new BitSet(new long[]{0x00003C0F7F900010L});
    public static final BitSet FOLLOW_RULE_CID_in_ruleinternalViewDeclaration9995 = new BitSet(new long[]{0x00003C0F7F900050L});
    public static final BitSet FOLLOW_ruleWS_in_ruleinternalViewDeclaration10017 = new BitSet(new long[]{0x00003C0F7F900050L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleinternalViewDeclaration10029 = new BitSet(new long[]{0x00003C0F7F900010L});
    public static final BitSet FOLLOW_ruleWS_in_ruleinternalViewDeclaration10045 = new BitSet(new long[]{0x00003C0F7F900010L});
    public static final BitSet FOLLOW_ruleID_in_ruleinternalViewDeclaration10069 = new BitSet(new long[]{0x00003C0F7F904010L});
    public static final BitSet FOLLOW_ruleWS_in_ruleinternalViewDeclaration10086 = new BitSet(new long[]{0x00003C0F7F904010L});
    public static final BitSet FOLLOW_RULE_ARROW_in_ruleinternalViewDeclaration10098 = new BitSet(new long[]{0x00003C0F7F910010L});
    public static final BitSet FOLLOW_ruleWS_in_ruleinternalViewDeclaration10114 = new BitSet(new long[]{0x00003C0F7F910010L});
    public static final BitSet FOLLOW_rulemorphism_in_ruleinternalViewDeclaration10137 = new BitSet(new long[]{0x00003C0F7F910010L});
    public static final BitSet FOLLOW_ruleWS_in_ruleinternalViewDeclaration10154 = new BitSet(new long[]{0x00003C0F7F910010L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_ruleinternalViewDeclaration10168 = new BitSet(new long[]{0x00003C0F7F900110L});
    public static final BitSet FOLLOW_ruleWS_in_ruleinternalViewDeclaration10184 = new BitSet(new long[]{0x00003C0F7F900110L});
    public static final BitSet FOLLOW_rulelinkBody_in_ruleinternalViewDeclaration10207 = new BitSet(new long[]{0x00003C0F7F900030L});
    public static final BitSet FOLLOW_ruleWS_in_ruleinternalViewDeclaration10230 = new BitSet(new long[]{0x00003C0F78100000L});
    public static final BitSet FOLLOW_rulemorphism_in_ruleinternalViewDeclaration10250 = new BitSet(new long[]{0x00003C0F7F900030L});
    public static final BitSet FOLLOW_ruleWS_in_ruleinternalViewDeclaration10269 = new BitSet(new long[]{0x00003C0F7F900030L});
    public static final BitSet FOLLOW_RULE_DOT_in_ruleinternalViewDeclaration10281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWS_in_synpred1_InternalLF5570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleterm_in_synpred2_InternalLF7333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleterm_in_synpred3_InternalLF7460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleterm_in_synpred4_InternalLF7558 = new BitSet(new long[]{0x0000000000000002L});

}
