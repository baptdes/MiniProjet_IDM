package miniProjet.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import miniProjet.services.PDLXTextGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPDLXTextParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'s2s'", "'f2s'", "'s2f'", "'f2f'", "'process'", "'{'", "'}'", "'wd'", "'ws'", "'from'", "'to'", "'note'", "'res'", "'quantity'", "'need'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalPDLXTextParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPDLXTextParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPDLXTextParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPDLXText.g"; }


    	private PDLXTextGrammarAccess grammarAccess;

    	public void setGrammarAccess(PDLXTextGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleProcess"
    // InternalPDLXText.g:53:1: entryRuleProcess : ruleProcess EOF ;
    public final void entryRuleProcess() throws RecognitionException {
        try {
            // InternalPDLXText.g:54:1: ( ruleProcess EOF )
            // InternalPDLXText.g:55:1: ruleProcess EOF
            {
             before(grammarAccess.getProcessRule()); 
            pushFollow(FOLLOW_1);
            ruleProcess();

            state._fsp--;

             after(grammarAccess.getProcessRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProcess"


    // $ANTLR start "ruleProcess"
    // InternalPDLXText.g:62:1: ruleProcess : ( ( rule__Process__Group__0 ) ) ;
    public final void ruleProcess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDLXText.g:66:2: ( ( ( rule__Process__Group__0 ) ) )
            // InternalPDLXText.g:67:2: ( ( rule__Process__Group__0 ) )
            {
            // InternalPDLXText.g:67:2: ( ( rule__Process__Group__0 ) )
            // InternalPDLXText.g:68:3: ( rule__Process__Group__0 )
            {
             before(grammarAccess.getProcessAccess().getGroup()); 
            // InternalPDLXText.g:69:3: ( rule__Process__Group__0 )
            // InternalPDLXText.g:69:4: rule__Process__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProcess"


    // $ANTLR start "entryRuleProcessElement"
    // InternalPDLXText.g:78:1: entryRuleProcessElement : ruleProcessElement EOF ;
    public final void entryRuleProcessElement() throws RecognitionException {
        try {
            // InternalPDLXText.g:79:1: ( ruleProcessElement EOF )
            // InternalPDLXText.g:80:1: ruleProcessElement EOF
            {
             before(grammarAccess.getProcessElementRule()); 
            pushFollow(FOLLOW_1);
            ruleProcessElement();

            state._fsp--;

             after(grammarAccess.getProcessElementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProcessElement"


    // $ANTLR start "ruleProcessElement"
    // InternalPDLXText.g:87:1: ruleProcessElement : ( ( rule__ProcessElement__Alternatives ) ) ;
    public final void ruleProcessElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDLXText.g:91:2: ( ( ( rule__ProcessElement__Alternatives ) ) )
            // InternalPDLXText.g:92:2: ( ( rule__ProcessElement__Alternatives ) )
            {
            // InternalPDLXText.g:92:2: ( ( rule__ProcessElement__Alternatives ) )
            // InternalPDLXText.g:93:3: ( rule__ProcessElement__Alternatives )
            {
             before(grammarAccess.getProcessElementAccess().getAlternatives()); 
            // InternalPDLXText.g:94:3: ( rule__ProcessElement__Alternatives )
            // InternalPDLXText.g:94:4: rule__ProcessElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ProcessElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getProcessElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProcessElement"


    // $ANTLR start "entryRuleWorkDefinition"
    // InternalPDLXText.g:103:1: entryRuleWorkDefinition : ruleWorkDefinition EOF ;
    public final void entryRuleWorkDefinition() throws RecognitionException {
        try {
            // InternalPDLXText.g:104:1: ( ruleWorkDefinition EOF )
            // InternalPDLXText.g:105:1: ruleWorkDefinition EOF
            {
             before(grammarAccess.getWorkDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleWorkDefinition();

            state._fsp--;

             after(grammarAccess.getWorkDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleWorkDefinition"


    // $ANTLR start "ruleWorkDefinition"
    // InternalPDLXText.g:112:1: ruleWorkDefinition : ( ( rule__WorkDefinition__Group__0 ) ) ;
    public final void ruleWorkDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDLXText.g:116:2: ( ( ( rule__WorkDefinition__Group__0 ) ) )
            // InternalPDLXText.g:117:2: ( ( rule__WorkDefinition__Group__0 ) )
            {
            // InternalPDLXText.g:117:2: ( ( rule__WorkDefinition__Group__0 ) )
            // InternalPDLXText.g:118:3: ( rule__WorkDefinition__Group__0 )
            {
             before(grammarAccess.getWorkDefinitionAccess().getGroup()); 
            // InternalPDLXText.g:119:3: ( rule__WorkDefinition__Group__0 )
            // InternalPDLXText.g:119:4: rule__WorkDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWorkDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWorkDefinition"


    // $ANTLR start "entryRuleWorkSequence"
    // InternalPDLXText.g:128:1: entryRuleWorkSequence : ruleWorkSequence EOF ;
    public final void entryRuleWorkSequence() throws RecognitionException {
        try {
            // InternalPDLXText.g:129:1: ( ruleWorkSequence EOF )
            // InternalPDLXText.g:130:1: ruleWorkSequence EOF
            {
             before(grammarAccess.getWorkSequenceRule()); 
            pushFollow(FOLLOW_1);
            ruleWorkSequence();

            state._fsp--;

             after(grammarAccess.getWorkSequenceRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleWorkSequence"


    // $ANTLR start "ruleWorkSequence"
    // InternalPDLXText.g:137:1: ruleWorkSequence : ( ( rule__WorkSequence__Group__0 ) ) ;
    public final void ruleWorkSequence() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDLXText.g:141:2: ( ( ( rule__WorkSequence__Group__0 ) ) )
            // InternalPDLXText.g:142:2: ( ( rule__WorkSequence__Group__0 ) )
            {
            // InternalPDLXText.g:142:2: ( ( rule__WorkSequence__Group__0 ) )
            // InternalPDLXText.g:143:3: ( rule__WorkSequence__Group__0 )
            {
             before(grammarAccess.getWorkSequenceAccess().getGroup()); 
            // InternalPDLXText.g:144:3: ( rule__WorkSequence__Group__0 )
            // InternalPDLXText.g:144:4: rule__WorkSequence__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWorkSequence"


    // $ANTLR start "entryRuleGuidance"
    // InternalPDLXText.g:153:1: entryRuleGuidance : ruleGuidance EOF ;
    public final void entryRuleGuidance() throws RecognitionException {
        try {
            // InternalPDLXText.g:154:1: ( ruleGuidance EOF )
            // InternalPDLXText.g:155:1: ruleGuidance EOF
            {
             before(grammarAccess.getGuidanceRule()); 
            pushFollow(FOLLOW_1);
            ruleGuidance();

            state._fsp--;

             after(grammarAccess.getGuidanceRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGuidance"


    // $ANTLR start "ruleGuidance"
    // InternalPDLXText.g:162:1: ruleGuidance : ( ( rule__Guidance__Group__0 ) ) ;
    public final void ruleGuidance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDLXText.g:166:2: ( ( ( rule__Guidance__Group__0 ) ) )
            // InternalPDLXText.g:167:2: ( ( rule__Guidance__Group__0 ) )
            {
            // InternalPDLXText.g:167:2: ( ( rule__Guidance__Group__0 ) )
            // InternalPDLXText.g:168:3: ( rule__Guidance__Group__0 )
            {
             before(grammarAccess.getGuidanceAccess().getGroup()); 
            // InternalPDLXText.g:169:3: ( rule__Guidance__Group__0 )
            // InternalPDLXText.g:169:4: rule__Guidance__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Guidance__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGuidanceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGuidance"


    // $ANTLR start "entryRuleRessource"
    // InternalPDLXText.g:178:1: entryRuleRessource : ruleRessource EOF ;
    public final void entryRuleRessource() throws RecognitionException {
        try {
            // InternalPDLXText.g:179:1: ( ruleRessource EOF )
            // InternalPDLXText.g:180:1: ruleRessource EOF
            {
             before(grammarAccess.getRessourceRule()); 
            pushFollow(FOLLOW_1);
            ruleRessource();

            state._fsp--;

             after(grammarAccess.getRessourceRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRessource"


    // $ANTLR start "ruleRessource"
    // InternalPDLXText.g:187:1: ruleRessource : ( ( rule__Ressource__Group__0 ) ) ;
    public final void ruleRessource() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDLXText.g:191:2: ( ( ( rule__Ressource__Group__0 ) ) )
            // InternalPDLXText.g:192:2: ( ( rule__Ressource__Group__0 ) )
            {
            // InternalPDLXText.g:192:2: ( ( rule__Ressource__Group__0 ) )
            // InternalPDLXText.g:193:3: ( rule__Ressource__Group__0 )
            {
             before(grammarAccess.getRessourceAccess().getGroup()); 
            // InternalPDLXText.g:194:3: ( rule__Ressource__Group__0 )
            // InternalPDLXText.g:194:4: rule__Ressource__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Ressource__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRessourceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRessource"


    // $ANTLR start "entryRuleNeed"
    // InternalPDLXText.g:203:1: entryRuleNeed : ruleNeed EOF ;
    public final void entryRuleNeed() throws RecognitionException {
        try {
            // InternalPDLXText.g:204:1: ( ruleNeed EOF )
            // InternalPDLXText.g:205:1: ruleNeed EOF
            {
             before(grammarAccess.getNeedRule()); 
            pushFollow(FOLLOW_1);
            ruleNeed();

            state._fsp--;

             after(grammarAccess.getNeedRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNeed"


    // $ANTLR start "ruleNeed"
    // InternalPDLXText.g:212:1: ruleNeed : ( ( rule__Need__Group__0 ) ) ;
    public final void ruleNeed() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDLXText.g:216:2: ( ( ( rule__Need__Group__0 ) ) )
            // InternalPDLXText.g:217:2: ( ( rule__Need__Group__0 ) )
            {
            // InternalPDLXText.g:217:2: ( ( rule__Need__Group__0 ) )
            // InternalPDLXText.g:218:3: ( rule__Need__Group__0 )
            {
             before(grammarAccess.getNeedAccess().getGroup()); 
            // InternalPDLXText.g:219:3: ( rule__Need__Group__0 )
            // InternalPDLXText.g:219:4: rule__Need__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Need__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNeedAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNeed"


    // $ANTLR start "ruleWorkSequenceType"
    // InternalPDLXText.g:228:1: ruleWorkSequenceType : ( ( rule__WorkSequenceType__Alternatives ) ) ;
    public final void ruleWorkSequenceType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDLXText.g:232:1: ( ( ( rule__WorkSequenceType__Alternatives ) ) )
            // InternalPDLXText.g:233:2: ( ( rule__WorkSequenceType__Alternatives ) )
            {
            // InternalPDLXText.g:233:2: ( ( rule__WorkSequenceType__Alternatives ) )
            // InternalPDLXText.g:234:3: ( rule__WorkSequenceType__Alternatives )
            {
             before(grammarAccess.getWorkSequenceTypeAccess().getAlternatives()); 
            // InternalPDLXText.g:235:3: ( rule__WorkSequenceType__Alternatives )
            // InternalPDLXText.g:235:4: rule__WorkSequenceType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequenceType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWorkSequenceType"


    // $ANTLR start "rule__ProcessElement__Alternatives"
    // InternalPDLXText.g:243:1: rule__ProcessElement__Alternatives : ( ( ruleWorkDefinition ) | ( ruleWorkSequence ) | ( ruleGuidance ) | ( ruleRessource ) | ( ruleNeed ) );
    public final void rule__ProcessElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDLXText.g:247:1: ( ( ruleWorkDefinition ) | ( ruleWorkSequence ) | ( ruleGuidance ) | ( ruleRessource ) | ( ruleNeed ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt1=1;
                }
                break;
            case 19:
                {
                alt1=2;
                }
                break;
            case 22:
                {
                alt1=3;
                }
                break;
            case 23:
                {
                alt1=4;
                }
                break;
            case 25:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalPDLXText.g:248:2: ( ruleWorkDefinition )
                    {
                    // InternalPDLXText.g:248:2: ( ruleWorkDefinition )
                    // InternalPDLXText.g:249:3: ruleWorkDefinition
                    {
                     before(grammarAccess.getProcessElementAccess().getWorkDefinitionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleWorkDefinition();

                    state._fsp--;

                     after(grammarAccess.getProcessElementAccess().getWorkDefinitionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPDLXText.g:254:2: ( ruleWorkSequence )
                    {
                    // InternalPDLXText.g:254:2: ( ruleWorkSequence )
                    // InternalPDLXText.g:255:3: ruleWorkSequence
                    {
                     before(grammarAccess.getProcessElementAccess().getWorkSequenceParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleWorkSequence();

                    state._fsp--;

                     after(grammarAccess.getProcessElementAccess().getWorkSequenceParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPDLXText.g:260:2: ( ruleGuidance )
                    {
                    // InternalPDLXText.g:260:2: ( ruleGuidance )
                    // InternalPDLXText.g:261:3: ruleGuidance
                    {
                     before(grammarAccess.getProcessElementAccess().getGuidanceParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleGuidance();

                    state._fsp--;

                     after(grammarAccess.getProcessElementAccess().getGuidanceParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPDLXText.g:266:2: ( ruleRessource )
                    {
                    // InternalPDLXText.g:266:2: ( ruleRessource )
                    // InternalPDLXText.g:267:3: ruleRessource
                    {
                     before(grammarAccess.getProcessElementAccess().getRessourceParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleRessource();

                    state._fsp--;

                     after(grammarAccess.getProcessElementAccess().getRessourceParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalPDLXText.g:272:2: ( ruleNeed )
                    {
                    // InternalPDLXText.g:272:2: ( ruleNeed )
                    // InternalPDLXText.g:273:3: ruleNeed
                    {
                     before(grammarAccess.getProcessElementAccess().getNeedParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleNeed();

                    state._fsp--;

                     after(grammarAccess.getProcessElementAccess().getNeedParserRuleCall_4()); 

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
    // $ANTLR end "rule__ProcessElement__Alternatives"


    // $ANTLR start "rule__WorkSequenceType__Alternatives"
    // InternalPDLXText.g:282:1: rule__WorkSequenceType__Alternatives : ( ( ( 's2s' ) ) | ( ( 'f2s' ) ) | ( ( 's2f' ) ) | ( ( 'f2f' ) ) );
    public final void rule__WorkSequenceType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDLXText.g:286:1: ( ( ( 's2s' ) ) | ( ( 'f2s' ) ) | ( ( 's2f' ) ) | ( ( 'f2f' ) ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
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
                    // InternalPDLXText.g:287:2: ( ( 's2s' ) )
                    {
                    // InternalPDLXText.g:287:2: ( ( 's2s' ) )
                    // InternalPDLXText.g:288:3: ( 's2s' )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getStart2startEnumLiteralDeclaration_0()); 
                    // InternalPDLXText.g:289:3: ( 's2s' )
                    // InternalPDLXText.g:289:4: 's2s'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getWorkSequenceTypeAccess().getStart2startEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPDLXText.g:293:2: ( ( 'f2s' ) )
                    {
                    // InternalPDLXText.g:293:2: ( ( 'f2s' ) )
                    // InternalPDLXText.g:294:3: ( 'f2s' )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getFinish2startEnumLiteralDeclaration_1()); 
                    // InternalPDLXText.g:295:3: ( 'f2s' )
                    // InternalPDLXText.g:295:4: 'f2s'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getWorkSequenceTypeAccess().getFinish2startEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPDLXText.g:299:2: ( ( 's2f' ) )
                    {
                    // InternalPDLXText.g:299:2: ( ( 's2f' ) )
                    // InternalPDLXText.g:300:3: ( 's2f' )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getStart2finishEnumLiteralDeclaration_2()); 
                    // InternalPDLXText.g:301:3: ( 's2f' )
                    // InternalPDLXText.g:301:4: 's2f'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getWorkSequenceTypeAccess().getStart2finishEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPDLXText.g:305:2: ( ( 'f2f' ) )
                    {
                    // InternalPDLXText.g:305:2: ( ( 'f2f' ) )
                    // InternalPDLXText.g:306:3: ( 'f2f' )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getFinish2finishEnumLiteralDeclaration_3()); 
                    // InternalPDLXText.g:307:3: ( 'f2f' )
                    // InternalPDLXText.g:307:4: 'f2f'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getWorkSequenceTypeAccess().getFinish2finishEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__WorkSequenceType__Alternatives"


    // $ANTLR start "rule__Process__Group__0"
    // InternalPDLXText.g:315:1: rule__Process__Group__0 : rule__Process__Group__0__Impl rule__Process__Group__1 ;
    public final void rule__Process__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDLXText.g:319:1: ( rule__Process__Group__0__Impl rule__Process__Group__1 )
            // InternalPDLXText.g:320:2: rule__Process__Group__0__Impl rule__Process__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Process__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__0"


    // $ANTLR start "rule__Process__Group__0__Impl"
    // InternalPDLXText.g:327:1: rule__Process__Group__0__Impl : ( 'process' ) ;
    public final void rule__Process__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDLXText.g:331:1: ( ( 'process' ) )
            // InternalPDLXText.g:332:1: ( 'process' )
            {
            // InternalPDLXText.g:332:1: ( 'process' )
            // InternalPDLXText.g:333:2: 'process'
            {
             before(grammarAccess.getProcessAccess().getProcessKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getProcessKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__0__Impl"


    // $ANTLR start "rule__Process__Group__1"
    // InternalPDLXText.g:342:1: rule__Process__Group__1 : rule__Process__Group__1__Impl rule__Process__Group__2 ;
    public final void rule__Process__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDLXText.g:346:1: ( rule__Process__Group__1__Impl rule__Process__Group__2 )
            // InternalPDLXText.g:347:2: rule__Process__Group__1__Impl rule__Process__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Process__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__1"


    // $ANTLR start "rule__Process__Group__1__Impl"
    // InternalPDLXText.g:354:1: rule__Process__Group__1__Impl : ( ( rule__Process__NameAssignment_1 ) ) ;
    public final void rule__Process__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDLXText.g:358:1: ( ( ( rule__Process__NameAssignment_1 ) ) )
            // InternalPDLXText.g:359:1: ( ( rule__Process__NameAssignment_1 ) )
            {
            // InternalPDLXText.g:359:1: ( ( rule__Process__NameAssignment_1 ) )
            // InternalPDLXText.g:360:2: ( rule__Process__NameAssignment_1 )
            {
             before(grammarAccess.getProcessAccess().getNameAssignment_1()); 
            // InternalPDLXText.g:361:2: ( rule__Process__NameAssignment_1 )
            // InternalPDLXText.g:361:3: rule__Process__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Process__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__1__Impl"


    // $ANTLR start "rule__Process__Group__2"
    // InternalPDLXText.g:369:1: rule__Process__Group__2 : rule__Process__Group__2__Impl rule__Process__Group__3 ;
    public final void rule__Process__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDLXText.g:373:1: ( rule__Process__Group__2__Impl rule__Process__Group__3 )
            // InternalPDLXText.g:374:2: rule__Process__Group__2__Impl rule__Process__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Process__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__2"


    // $ANTLR start "rule__Process__Group__2__Impl"
    // InternalPDLXText.g:381:1: rule__Process__Group__2__Impl : ( '{' ) ;
    public final void rule__Process__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDLXText.g:385:1: ( ( '{' ) )
            // InternalPDLXText.g:386:1: ( '{' )
            {
            // InternalPDLXText.g:386:1: ( '{' )
            // InternalPDLXText.g:387:2: '{'
            {
             before(grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__2__Impl"


    // $ANTLR start "rule__Process__Group__3"
    // InternalPDLXText.g:396:1: rule__Process__Group__3 : rule__Process__Group__3__Impl rule__Process__Group__4 ;
    public final void rule__Process__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDLXText.g:400:1: ( rule__Process__Group__3__Impl rule__Process__Group__4 )
            // InternalPDLXText.g:401:2: rule__Process__Group__3__Impl rule__Process__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Process__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__3"


    // $ANTLR start "rule__Process__Group__3__Impl"
    // InternalPDLXText.g:408:1: rule__Process__Group__3__Impl : ( ( rule__Process__ProcessElementsAssignment_3 )* ) ;
    public final void rule__Process__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDLXText.g:412:1: ( ( ( rule__Process__ProcessElementsAssignment_3 )* ) )
            // InternalPDLXText.g:413:1: ( ( rule__Process__ProcessElementsAssignment_3 )* )
            {
            // InternalPDLXText.g:413:1: ( ( rule__Process__ProcessElementsAssignment_3 )* )
            // InternalPDLXText.g:414:2: ( rule__Process__ProcessElementsAssignment_3 )*
            {
             before(grammarAccess.getProcessAccess().getProcessElementsAssignment_3()); 
            // InternalPDLXText.g:415:2: ( rule__Process__ProcessElementsAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=18 && LA3_0<=19)||(LA3_0>=22 && LA3_0<=23)||LA3_0==25) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPDLXText.g:415:3: rule__Process__ProcessElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Process__ProcessElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getProcessAccess().getProcessElementsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__3__Impl"


    // $ANTLR start "rule__Process__Group__4"
    // InternalPDLXText.g:423:1: rule__Process__Group__4 : rule__Process__Group__4__Impl ;
    public final void rule__Process__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDLXText.g:427:1: ( rule__Process__Group__4__Impl )
            // InternalPDLXText.g:428:2: rule__Process__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__4"


    // $ANTLR start "rule__Process__Group__4__Impl"
    // InternalPDLXText.g:434:1: rule__Process__Group__4__Impl : ( '}' ) ;
    public final void rule__Process__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDLXText.g:438:1: ( ( '}' ) )
            // InternalPDLXText.g:439:1: ( '}' )
            {
            // InternalPDLXText.g:439:1: ( '}' )
            // InternalPDLXText.g:440:2: '}'
            {
             before(grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__4__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__0"
    // InternalPDLXText.g:450:1: rule__WorkDefinition__Group__0 : rule__WorkDefinition__Group__0__Impl rule__WorkDefinition__Group__1 ;
    public final void rule__WorkDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDLXText.g:454:1: ( rule__WorkDefinition__Group__0__Impl rule__WorkDefinition__Group__1 )
            // InternalPDLXText.g:455:2: rule__WorkDefinition__Group__0__Impl rule__WorkDefinition__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__WorkDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__0"


    // $ANTLR start "rule__WorkDefinition__Group__0__Impl"
    // InternalPDLXText.g:462:1: rule__WorkDefinition__Group__0__Impl : ( 'wd' ) ;
    public final void rule__WorkDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDLXText.g:466:1: ( ( 'wd' ) )
            // InternalPDLXText.g:467:1: ( 'wd' )
            {
            // InternalPDLXText.g:467:1: ( 'wd' )
            // InternalPDLXText.g:468:2: 'wd'
            {
             before(grammarAccess.getWorkDefinitionAccess().getWdKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getWdKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__0__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__1"
    // InternalPDLXText.g:477:1: rule__WorkDefinition__Group__1 : rule__WorkDefinition__Group__1__Impl rule__WorkDefinition__Group__2 ;
    public final void rule__WorkDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDLXText.g:481:1: ( rule__WorkDefinition__Group__1__Impl rule__WorkDefinition__Group__2 )
            // InternalPDLXText.g:482:2: rule__WorkDefinition__Group__1__Impl rule__WorkDefinition__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__WorkDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__1"


    // $ANTLR start "rule__WorkDefinition__Group__1__Impl"
    // InternalPDLXText.g:489:1: rule__WorkDefinition__Group__1__Impl : ( ( rule__WorkDefinition__NameAssignment_1 ) ) ;
    public final void rule__WorkDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDLXText.g:493:1: ( ( ( rule__WorkDefinition__NameAssignment_1 ) ) )
            // InternalPDLXText.g:494:1: ( ( rule__WorkDefinition__NameAssignment_1 ) )
            {
            // InternalPDLXText.g:494:1: ( ( rule__WorkDefinition__NameAssignment_1 ) )
            // InternalPDLXText.g:495:2: ( rule__WorkDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getWorkDefinitionAccess().getNameAssignment_1()); 
            // InternalPDLXText.g:496:2: ( rule__WorkDefinition__NameAssignment_1 )
            // InternalPDLXText.g:496:3: rule__WorkDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWorkDefinitionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__1__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__2"
    // InternalPDLXText.g:504:1: rule__WorkDefinition__Group__2 : rule__WorkDefinition__Group__2__Impl rule__WorkDefinition__Group__3 ;
    public final void rule__WorkDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDLXText.g:508:1: ( rule__WorkDefinition__Group__2__Impl rule__WorkDefinition__Group__3 )
            // InternalPDLXText.g:509:2: rule__WorkDefinition__Group__2__Impl rule__WorkDefinition__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__WorkDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__2"


    // $ANTLR start "rule__WorkDefinition__Group__2__Impl"
    // InternalPDLXText.g:516:1: rule__WorkDefinition__Group__2__Impl : ( '{' ) ;
    public final void rule__WorkDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDLXText.g:520:1: ( ( '{' ) )
            // InternalPDLXText.g:521:1: ( '{' )
            {
            // InternalPDLXText.g:521:1: ( '{' )
            // InternalPDLXText.g:522:2: '{'
            {
             before(grammarAccess.getWorkDefinitionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__2__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__3"
    // InternalPDLXText.g:531:1: rule__WorkDefinition__Group__3 : rule__WorkDefinition__Group__3__Impl rule__WorkDefinition__Group__4 ;
    public final void rule__WorkDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDLXText.g:535:1: ( rule__WorkDefinition__Group__3__Impl rule__WorkDefinition__Group__4 )
            // InternalPDLXText.g:536:2: rule__WorkDefinition__Group__3__Impl rule__WorkDefinition__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__WorkDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__3"


    // $ANTLR start "rule__WorkDefinition__Group__3__Impl"
    // InternalPDLXText.g:543:1: rule__WorkDefinition__Group__3__Impl : ( ( rule__WorkDefinition__NeedAssignment_3 )* ) ;
    public final void rule__WorkDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDLXText.g:547:1: ( ( ( rule__WorkDefinition__NeedAssignment_3 )* ) )
            // InternalPDLXText.g:548:1: ( ( rule__WorkDefinition__NeedAssignment_3 )* )
            {
            // InternalPDLXText.g:548:1: ( ( rule__WorkDefinition__NeedAssignment_3 )* )
            // InternalPDLXText.g:549:2: ( rule__WorkDefinition__NeedAssignment_3 )*
            {
             before(grammarAccess.getWorkDefinitionAccess().getNeedAssignment_3()); 
            // InternalPDLXText.g:550:2: ( rule__WorkDefinition__NeedAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==25) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalPDLXText.g:550:3: rule__WorkDefinition__NeedAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__WorkDefinition__NeedAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getWorkDefinitionAccess().getNeedAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__3__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__4"
    // InternalPDLXText.g:558:1: rule__WorkDefinition__Group__4 : rule__WorkDefinition__Group__4__Impl ;
    public final void rule__WorkDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDLXText.g:562:1: ( rule__WorkDefinition__Group__4__Impl )
            // InternalPDLXText.g:563:2: rule__WorkDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__4"


    // $ANTLR start "rule__WorkDefinition__Group__4__Impl"
    // InternalPDLXText.g:569:1: rule__WorkDefinition__Group__4__Impl : ( '}' ) ;
    public final void rule__WorkDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDLXText.g:573:1: ( ( '}' ) )
            // InternalPDLXText.g:574:1: ( '}' )
            {
            // InternalPDLXText.g:574:1: ( '}' )
            // InternalPDLXText.g:575:2: '}'
            {
             before(grammarAccess.getWorkDefinitionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__4__Impl"


    // $ANTLR start "rule__WorkSequence__Group__0"
    // InternalPDLXText.g:585:1: rule__WorkSequence__Group__0 : rule__WorkSequence__Group__0__Impl rule__WorkSequence__Group__1 ;
    public final void rule__WorkSequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDLXText.g:589:1: ( rule__WorkSequence__Group__0__Impl rule__WorkSequence__Group__1 )
            // InternalPDLXText.g:590:2: rule__WorkSequence__Group__0__Impl rule__WorkSequence__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__WorkSequence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__0"


    // $ANTLR start "rule__WorkSequence__Group__0__Impl"
    // InternalPDLXText.g:597:1: rule__WorkSequence__Group__0__Impl : ( 'ws' ) ;
    public final void rule__WorkSequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDLXText.g:601:1: ( ( 'ws' ) )
            // InternalPDLXText.g:602:1: ( 'ws' )
            {
            // InternalPDLXText.g:602:1: ( 'ws' )
            // InternalPDLXText.g:603:2: 'ws'
            {
             before(grammarAccess.getWorkSequenceAccess().getWsKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getWsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__0__Impl"


    // $ANTLR start "rule__WorkSequence__Group__1"
    // InternalPDLXText.g:612:1: rule__WorkSequence__Group__1 : rule__WorkSequence__Group__1__Impl rule__WorkSequence__Group__2 ;
    public final void rule__WorkSequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDLXText.g:616:1: ( rule__WorkSequence__Group__1__Impl rule__WorkSequence__Group__2 )
            // InternalPDLXText.g:617:2: rule__WorkSequence__Group__1__Impl rule__WorkSequence__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__WorkSequence__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__1"


    // $ANTLR start "rule__WorkSequence__Group__1__Impl"
    // InternalPDLXText.g:624:1: rule__WorkSequence__Group__1__Impl : ( ( rule__WorkSequence__LinkTypeAssignment_1 ) ) ;
    public final void rule__WorkSequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDLXText.g:628:1: ( ( ( rule__WorkSequence__LinkTypeAssignment_1 ) ) )
            // InternalPDLXText.g:629:1: ( ( rule__WorkSequence__LinkTypeAssignment_1 ) )
            {
            // InternalPDLXText.g:629:1: ( ( rule__WorkSequence__LinkTypeAssignment_1 ) )
            // InternalPDLXText.g:630:2: ( rule__WorkSequence__LinkTypeAssignment_1 )
            {
             before(grammarAccess.getWorkSequenceAccess().getLinkTypeAssignment_1()); 
            // InternalPDLXText.g:631:2: ( rule__WorkSequence__LinkTypeAssignment_1 )
            // InternalPDLXText.g:631:3: rule__WorkSequence__LinkTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__LinkTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getLinkTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__1__Impl"


    // $ANTLR start "rule__WorkSequence__Group__2"
    // InternalPDLXText.g:639:1: rule__WorkSequence__Group__2 : rule__WorkSequence__Group__2__Impl rule__WorkSequence__Group__3 ;
    public final void rule__WorkSequence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDLXText.g:643:1: ( rule__WorkSequence__Group__2__Impl rule__WorkSequence__Group__3 )
            // InternalPDLXText.g:644:2: rule__WorkSequence__Group__2__Impl rule__WorkSequence__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__WorkSequence__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__2"


    // $ANTLR start "rule__WorkSequence__Group__2__Impl"
    // InternalPDLXText.g:651:1: rule__WorkSequence__Group__2__Impl : ( 'from' ) ;
    public final void rule__WorkSequence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDLXText.g:655:1: ( ( 'from' ) )
            // InternalPDLXText.g:656:1: ( 'from' )
            {
            // InternalPDLXText.g:656:1: ( 'from' )
            // InternalPDLXText.g:657:2: 'from'
            {
             before(grammarAccess.getWorkSequenceAccess().getFromKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getFromKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__2__Impl"


    // $ANTLR start "rule__WorkSequence__Group__3"
    // InternalPDLXText.g:666:1: rule__WorkSequence__Group__3 : rule__WorkSequence__Group__3__Impl rule__WorkSequence__Group__4 ;
    public final void rule__WorkSequence__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDLXText.g:670:1: ( rule__WorkSequence__Group__3__Impl rule__WorkSequence__Group__4 )
            // InternalPDLXText.g:671:2: rule__WorkSequence__Group__3__Impl rule__WorkSequence__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__WorkSequence__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__3"


    // $ANTLR start "rule__WorkSequence__Group__3__Impl"
    // InternalPDLXText.g:678:1: rule__WorkSequence__Group__3__Impl : ( ( rule__WorkSequence__PredecessorAssignment_3 ) ) ;
    public final void rule__WorkSequence__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDLXText.g:682:1: ( ( ( rule__WorkSequence__PredecessorAssignment_3 ) ) )
            // InternalPDLXText.g:683:1: ( ( rule__WorkSequence__PredecessorAssignment_3 ) )
            {
            // InternalPDLXText.g:683:1: ( ( rule__WorkSequence__PredecessorAssignment_3 ) )
            // InternalPDLXText.g:684:2: ( rule__WorkSequence__PredecessorAssignment_3 )
            {
             before(grammarAccess.getWorkSequenceAccess().getPredecessorAssignment_3()); 
            // InternalPDLXText.g:685:2: ( rule__WorkSequence__PredecessorAssignment_3 )
            // InternalPDLXText.g:685:3: rule__WorkSequence__PredecessorAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__PredecessorAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getPredecessorAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__3__Impl"


    // $ANTLR start "rule__WorkSequence__Group__4"
    // InternalPDLXText.g:693:1: rule__WorkSequence__Group__4 : rule__WorkSequence__Group__4__Impl rule__WorkSequence__Group__5 ;
    public final void rule__WorkSequence__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDLXText.g:697:1: ( rule__WorkSequence__Group__4__Impl rule__WorkSequence__Group__5 )
            // InternalPDLXText.g:698:2: rule__WorkSequence__Group__4__Impl rule__WorkSequence__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__WorkSequence__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__4"


    // $ANTLR start "rule__WorkSequence__Group__4__Impl"
    // InternalPDLXText.g:705:1: rule__WorkSequence__Group__4__Impl : ( 'to' ) ;
    public final void rule__WorkSequence__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDLXText.g:709:1: ( ( 'to' ) )
            // InternalPDLXText.g:710:1: ( 'to' )
            {
            // InternalPDLXText.g:710:1: ( 'to' )
            // InternalPDLXText.g:711:2: 'to'
            {
             before(grammarAccess.getWorkSequenceAccess().getToKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getToKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__4__Impl"


    // $ANTLR start "rule__WorkSequence__Group__5"
    // InternalPDLXText.g:720:1: rule__WorkSequence__Group__5 : rule__WorkSequence__Group__5__Impl ;
    public final void rule__WorkSequence__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDLXText.g:724:1: ( rule__WorkSequence__Group__5__Impl )
            // InternalPDLXText.g:725:2: rule__WorkSequence__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__5"


    // $ANTLR start "rule__WorkSequence__Group__5__Impl"
    // InternalPDLXText.g:731:1: rule__WorkSequence__Group__5__Impl : ( ( rule__WorkSequence__SuccessorAssignment_5 ) ) ;
    public final void rule__WorkSequence__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDLXText.g:735:1: ( ( ( rule__WorkSequence__SuccessorAssignment_5 ) ) )
            // InternalPDLXText.g:736:1: ( ( rule__WorkSequence__SuccessorAssignment_5 ) )
            {
            // InternalPDLXText.g:736:1: ( ( rule__WorkSequence__SuccessorAssignment_5 ) )
            // InternalPDLXText.g:737:2: ( rule__WorkSequence__SuccessorAssignment_5 )
            {
             before(grammarAccess.getWorkSequenceAccess().getSuccessorAssignment_5()); 
            // InternalPDLXText.g:738:2: ( rule__WorkSequence__SuccessorAssignment_5 )
            // InternalPDLXText.g:738:3: rule__WorkSequence__SuccessorAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__SuccessorAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getSuccessorAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__5__Impl"


    // $ANTLR start "rule__Guidance__Group__0"
    // InternalPDLXText.g:747:1: rule__Guidance__Group__0 : rule__Guidance__Group__0__Impl rule__Guidance__Group__1 ;
    public final void rule__Guidance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDLXText.g:751:1: ( rule__Guidance__Group__0__Impl rule__Guidance__Group__1 )
            // InternalPDLXText.g:752:2: rule__Guidance__Group__0__Impl rule__Guidance__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Guidance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guidance__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__0"


    // $ANTLR start "rule__Guidance__Group__0__Impl"
    // InternalPDLXText.g:759:1: rule__Guidance__Group__0__Impl : ( 'note' ) ;
    public final void rule__Guidance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDLXText.g:763:1: ( ( 'note' ) )
            // InternalPDLXText.g:764:1: ( 'note' )
            {
            // InternalPDLXText.g:764:1: ( 'note' )
            // InternalPDLXText.g:765:2: 'note'
            {
             before(grammarAccess.getGuidanceAccess().getNoteKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getGuidanceAccess().getNoteKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__0__Impl"


    // $ANTLR start "rule__Guidance__Group__1"
    // InternalPDLXText.g:774:1: rule__Guidance__Group__1 : rule__Guidance__Group__1__Impl rule__Guidance__Group__2 ;
    public final void rule__Guidance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDLXText.g:778:1: ( rule__Guidance__Group__1__Impl rule__Guidance__Group__2 )
            // InternalPDLXText.g:779:2: rule__Guidance__Group__1__Impl rule__Guidance__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Guidance__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guidance__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__1"


    // $ANTLR start "rule__Guidance__Group__1__Impl"
    // InternalPDLXText.g:786:1: rule__Guidance__Group__1__Impl : ( ( rule__Guidance__TexteAssignment_1 ) ) ;
    public final void rule__Guidance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDLXText.g:790:1: ( ( ( rule__Guidance__TexteAssignment_1 ) ) )
            // InternalPDLXText.g:791:1: ( ( rule__Guidance__TexteAssignment_1 ) )
            {
            // InternalPDLXText.g:791:1: ( ( rule__Guidance__TexteAssignment_1 ) )
            // InternalPDLXText.g:792:2: ( rule__Guidance__TexteAssignment_1 )
            {
             before(grammarAccess.getGuidanceAccess().getTexteAssignment_1()); 
            // InternalPDLXText.g:793:2: ( rule__Guidance__TexteAssignment_1 )
            // InternalPDLXText.g:793:3: rule__Guidance__TexteAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Guidance__TexteAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGuidanceAccess().getTexteAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__1__Impl"


    // $ANTLR start "rule__Guidance__Group__2"
    // InternalPDLXText.g:801:1: rule__Guidance__Group__2 : rule__Guidance__Group__2__Impl rule__Guidance__Group__3 ;
    public final void rule__Guidance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDLXText.g:805:1: ( rule__Guidance__Group__2__Impl rule__Guidance__Group__3 )
            // InternalPDLXText.g:806:2: rule__Guidance__Group__2__Impl rule__Guidance__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Guidance__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guidance__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__2"


    // $ANTLR start "rule__Guidance__Group__2__Impl"
    // InternalPDLXText.g:813:1: rule__Guidance__Group__2__Impl : ( '{' ) ;
    public final void rule__Guidance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDLXText.g:817:1: ( ( '{' ) )
            // InternalPDLXText.g:818:1: ( '{' )
            {
            // InternalPDLXText.g:818:1: ( '{' )
            // InternalPDLXText.g:819:2: '{'
            {
             before(grammarAccess.getGuidanceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getGuidanceAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__2__Impl"


    // $ANTLR start "rule__Guidance__Group__3"
    // InternalPDLXText.g:828:1: rule__Guidance__Group__3 : rule__Guidance__Group__3__Impl rule__Guidance__Group__4 ;
    public final void rule__Guidance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDLXText.g:832:1: ( rule__Guidance__Group__3__Impl rule__Guidance__Group__4 )
            // InternalPDLXText.g:833:2: rule__Guidance__Group__3__Impl rule__Guidance__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Guidance__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guidance__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__3"


    // $ANTLR start "rule__Guidance__Group__3__Impl"
    // InternalPDLXText.g:840:1: rule__Guidance__Group__3__Impl : ( ( rule__Guidance__ElementsAssignment_3 )* ) ;
    public final void rule__Guidance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDLXText.g:844:1: ( ( ( rule__Guidance__ElementsAssignment_3 )* ) )
            // InternalPDLXText.g:845:1: ( ( rule__Guidance__ElementsAssignment_3 )* )
            {
            // InternalPDLXText.g:845:1: ( ( rule__Guidance__ElementsAssignment_3 )* )
            // InternalPDLXText.g:846:2: ( rule__Guidance__ElementsAssignment_3 )*
            {
             before(grammarAccess.getGuidanceAccess().getElementsAssignment_3()); 
            // InternalPDLXText.g:847:2: ( rule__Guidance__ElementsAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalPDLXText.g:847:3: rule__Guidance__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Guidance__ElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getGuidanceAccess().getElementsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__3__Impl"


    // $ANTLR start "rule__Guidance__Group__4"
    // InternalPDLXText.g:855:1: rule__Guidance__Group__4 : rule__Guidance__Group__4__Impl ;
    public final void rule__Guidance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDLXText.g:859:1: ( rule__Guidance__Group__4__Impl )
            // InternalPDLXText.g:860:2: rule__Guidance__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Guidance__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__4"


    // $ANTLR start "rule__Guidance__Group__4__Impl"
    // InternalPDLXText.g:866:1: rule__Guidance__Group__4__Impl : ( '}' ) ;
    public final void rule__Guidance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDLXText.g:870:1: ( ( '}' ) )
            // InternalPDLXText.g:871:1: ( '}' )
            {
            // InternalPDLXText.g:871:1: ( '}' )
            // InternalPDLXText.g:872:2: '}'
            {
             before(grammarAccess.getGuidanceAccess().getRightCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getGuidanceAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__4__Impl"


    // $ANTLR start "rule__Ressource__Group__0"
    // InternalPDLXText.g:882:1: rule__Ressource__Group__0 : rule__Ressource__Group__0__Impl rule__Ressource__Group__1 ;
    public final void rule__Ressource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDLXText.g:886:1: ( rule__Ressource__Group__0__Impl rule__Ressource__Group__1 )
            // InternalPDLXText.g:887:2: rule__Ressource__Group__0__Impl rule__Ressource__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Ressource__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ressource__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressource__Group__0"


    // $ANTLR start "rule__Ressource__Group__0__Impl"
    // InternalPDLXText.g:894:1: rule__Ressource__Group__0__Impl : ( 'res' ) ;
    public final void rule__Ressource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDLXText.g:898:1: ( ( 'res' ) )
            // InternalPDLXText.g:899:1: ( 'res' )
            {
            // InternalPDLXText.g:899:1: ( 'res' )
            // InternalPDLXText.g:900:2: 'res'
            {
             before(grammarAccess.getRessourceAccess().getResKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRessourceAccess().getResKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressource__Group__0__Impl"


    // $ANTLR start "rule__Ressource__Group__1"
    // InternalPDLXText.g:909:1: rule__Ressource__Group__1 : rule__Ressource__Group__1__Impl rule__Ressource__Group__2 ;
    public final void rule__Ressource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDLXText.g:913:1: ( rule__Ressource__Group__1__Impl rule__Ressource__Group__2 )
            // InternalPDLXText.g:914:2: rule__Ressource__Group__1__Impl rule__Ressource__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Ressource__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ressource__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressource__Group__1"


    // $ANTLR start "rule__Ressource__Group__1__Impl"
    // InternalPDLXText.g:921:1: rule__Ressource__Group__1__Impl : ( ( rule__Ressource__NameAssignment_1 ) ) ;
    public final void rule__Ressource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDLXText.g:925:1: ( ( ( rule__Ressource__NameAssignment_1 ) ) )
            // InternalPDLXText.g:926:1: ( ( rule__Ressource__NameAssignment_1 ) )
            {
            // InternalPDLXText.g:926:1: ( ( rule__Ressource__NameAssignment_1 ) )
            // InternalPDLXText.g:927:2: ( rule__Ressource__NameAssignment_1 )
            {
             before(grammarAccess.getRessourceAccess().getNameAssignment_1()); 
            // InternalPDLXText.g:928:2: ( rule__Ressource__NameAssignment_1 )
            // InternalPDLXText.g:928:3: rule__Ressource__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Ressource__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRessourceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressource__Group__1__Impl"


    // $ANTLR start "rule__Ressource__Group__2"
    // InternalPDLXText.g:936:1: rule__Ressource__Group__2 : rule__Ressource__Group__2__Impl rule__Ressource__Group__3 ;
    public final void rule__Ressource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDLXText.g:940:1: ( rule__Ressource__Group__2__Impl rule__Ressource__Group__3 )
            // InternalPDLXText.g:941:2: rule__Ressource__Group__2__Impl rule__Ressource__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Ressource__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ressource__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressource__Group__2"


    // $ANTLR start "rule__Ressource__Group__2__Impl"
    // InternalPDLXText.g:948:1: rule__Ressource__Group__2__Impl : ( 'quantity' ) ;
    public final void rule__Ressource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDLXText.g:952:1: ( ( 'quantity' ) )
            // InternalPDLXText.g:953:1: ( 'quantity' )
            {
            // InternalPDLXText.g:953:1: ( 'quantity' )
            // InternalPDLXText.g:954:2: 'quantity'
            {
             before(grammarAccess.getRessourceAccess().getQuantityKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getRessourceAccess().getQuantityKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressource__Group__2__Impl"


    // $ANTLR start "rule__Ressource__Group__3"
    // InternalPDLXText.g:963:1: rule__Ressource__Group__3 : rule__Ressource__Group__3__Impl ;
    public final void rule__Ressource__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDLXText.g:967:1: ( rule__Ressource__Group__3__Impl )
            // InternalPDLXText.g:968:2: rule__Ressource__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ressource__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressource__Group__3"


    // $ANTLR start "rule__Ressource__Group__3__Impl"
    // InternalPDLXText.g:974:1: rule__Ressource__Group__3__Impl : ( ( rule__Ressource__QuantityAssignment_3 ) ) ;
    public final void rule__Ressource__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDLXText.g:978:1: ( ( ( rule__Ressource__QuantityAssignment_3 ) ) )
            // InternalPDLXText.g:979:1: ( ( rule__Ressource__QuantityAssignment_3 ) )
            {
            // InternalPDLXText.g:979:1: ( ( rule__Ressource__QuantityAssignment_3 ) )
            // InternalPDLXText.g:980:2: ( rule__Ressource__QuantityAssignment_3 )
            {
             before(grammarAccess.getRessourceAccess().getQuantityAssignment_3()); 
            // InternalPDLXText.g:981:2: ( rule__Ressource__QuantityAssignment_3 )
            // InternalPDLXText.g:981:3: rule__Ressource__QuantityAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Ressource__QuantityAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRessourceAccess().getQuantityAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressource__Group__3__Impl"


    // $ANTLR start "rule__Need__Group__0"
    // InternalPDLXText.g:990:1: rule__Need__Group__0 : rule__Need__Group__0__Impl rule__Need__Group__1 ;
    public final void rule__Need__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDLXText.g:994:1: ( rule__Need__Group__0__Impl rule__Need__Group__1 )
            // InternalPDLXText.g:995:2: rule__Need__Group__0__Impl rule__Need__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Need__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Need__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Need__Group__0"


    // $ANTLR start "rule__Need__Group__0__Impl"
    // InternalPDLXText.g:1002:1: rule__Need__Group__0__Impl : ( 'need' ) ;
    public final void rule__Need__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDLXText.g:1006:1: ( ( 'need' ) )
            // InternalPDLXText.g:1007:1: ( 'need' )
            {
            // InternalPDLXText.g:1007:1: ( 'need' )
            // InternalPDLXText.g:1008:2: 'need'
            {
             before(grammarAccess.getNeedAccess().getNeedKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getNeedAccess().getNeedKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Need__Group__0__Impl"


    // $ANTLR start "rule__Need__Group__1"
    // InternalPDLXText.g:1017:1: rule__Need__Group__1 : rule__Need__Group__1__Impl rule__Need__Group__2 ;
    public final void rule__Need__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDLXText.g:1021:1: ( rule__Need__Group__1__Impl rule__Need__Group__2 )
            // InternalPDLXText.g:1022:2: rule__Need__Group__1__Impl rule__Need__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Need__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Need__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Need__Group__1"


    // $ANTLR start "rule__Need__Group__1__Impl"
    // InternalPDLXText.g:1029:1: rule__Need__Group__1__Impl : ( ( rule__Need__QuantityNeededAssignment_1 ) ) ;
    public final void rule__Need__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDLXText.g:1033:1: ( ( ( rule__Need__QuantityNeededAssignment_1 ) ) )
            // InternalPDLXText.g:1034:1: ( ( rule__Need__QuantityNeededAssignment_1 ) )
            {
            // InternalPDLXText.g:1034:1: ( ( rule__Need__QuantityNeededAssignment_1 ) )
            // InternalPDLXText.g:1035:2: ( rule__Need__QuantityNeededAssignment_1 )
            {
             before(grammarAccess.getNeedAccess().getQuantityNeededAssignment_1()); 
            // InternalPDLXText.g:1036:2: ( rule__Need__QuantityNeededAssignment_1 )
            // InternalPDLXText.g:1036:3: rule__Need__QuantityNeededAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Need__QuantityNeededAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNeedAccess().getQuantityNeededAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Need__Group__1__Impl"


    // $ANTLR start "rule__Need__Group__2"
    // InternalPDLXText.g:1044:1: rule__Need__Group__2 : rule__Need__Group__2__Impl rule__Need__Group__3 ;
    public final void rule__Need__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDLXText.g:1048:1: ( rule__Need__Group__2__Impl rule__Need__Group__3 )
            // InternalPDLXText.g:1049:2: rule__Need__Group__2__Impl rule__Need__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Need__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Need__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Need__Group__2"


    // $ANTLR start "rule__Need__Group__2__Impl"
    // InternalPDLXText.g:1056:1: rule__Need__Group__2__Impl : ( 'from' ) ;
    public final void rule__Need__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDLXText.g:1060:1: ( ( 'from' ) )
            // InternalPDLXText.g:1061:1: ( 'from' )
            {
            // InternalPDLXText.g:1061:1: ( 'from' )
            // InternalPDLXText.g:1062:2: 'from'
            {
             before(grammarAccess.getNeedAccess().getFromKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getNeedAccess().getFromKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Need__Group__2__Impl"


    // $ANTLR start "rule__Need__Group__3"
    // InternalPDLXText.g:1071:1: rule__Need__Group__3 : rule__Need__Group__3__Impl ;
    public final void rule__Need__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDLXText.g:1075:1: ( rule__Need__Group__3__Impl )
            // InternalPDLXText.g:1076:2: rule__Need__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Need__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Need__Group__3"


    // $ANTLR start "rule__Need__Group__3__Impl"
    // InternalPDLXText.g:1082:1: rule__Need__Group__3__Impl : ( ( rule__Need__RessourceAssignment_3 ) ) ;
    public final void rule__Need__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDLXText.g:1086:1: ( ( ( rule__Need__RessourceAssignment_3 ) ) )
            // InternalPDLXText.g:1087:1: ( ( rule__Need__RessourceAssignment_3 ) )
            {
            // InternalPDLXText.g:1087:1: ( ( rule__Need__RessourceAssignment_3 ) )
            // InternalPDLXText.g:1088:2: ( rule__Need__RessourceAssignment_3 )
            {
             before(grammarAccess.getNeedAccess().getRessourceAssignment_3()); 
            // InternalPDLXText.g:1089:2: ( rule__Need__RessourceAssignment_3 )
            // InternalPDLXText.g:1089:3: rule__Need__RessourceAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Need__RessourceAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getNeedAccess().getRessourceAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Need__Group__3__Impl"


    // $ANTLR start "rule__Process__NameAssignment_1"
    // InternalPDLXText.g:1098:1: rule__Process__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Process__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDLXText.g:1102:1: ( ( RULE_ID ) )
            // InternalPDLXText.g:1103:2: ( RULE_ID )
            {
            // InternalPDLXText.g:1103:2: ( RULE_ID )
            // InternalPDLXText.g:1104:3: RULE_ID
            {
             before(grammarAccess.getProcessAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__NameAssignment_1"


    // $ANTLR start "rule__Process__ProcessElementsAssignment_3"
    // InternalPDLXText.g:1113:1: rule__Process__ProcessElementsAssignment_3 : ( ruleProcessElement ) ;
    public final void rule__Process__ProcessElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDLXText.g:1117:1: ( ( ruleProcessElement ) )
            // InternalPDLXText.g:1118:2: ( ruleProcessElement )
            {
            // InternalPDLXText.g:1118:2: ( ruleProcessElement )
            // InternalPDLXText.g:1119:3: ruleProcessElement
            {
             before(grammarAccess.getProcessAccess().getProcessElementsProcessElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleProcessElement();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getProcessElementsProcessElementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__ProcessElementsAssignment_3"


    // $ANTLR start "rule__WorkDefinition__NameAssignment_1"
    // InternalPDLXText.g:1128:1: rule__WorkDefinition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__WorkDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDLXText.g:1132:1: ( ( RULE_ID ) )
            // InternalPDLXText.g:1133:2: ( RULE_ID )
            {
            // InternalPDLXText.g:1133:2: ( RULE_ID )
            // InternalPDLXText.g:1134:3: RULE_ID
            {
             before(grammarAccess.getWorkDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__NameAssignment_1"


    // $ANTLR start "rule__WorkDefinition__NeedAssignment_3"
    // InternalPDLXText.g:1143:1: rule__WorkDefinition__NeedAssignment_3 : ( ruleNeed ) ;
    public final void rule__WorkDefinition__NeedAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDLXText.g:1147:1: ( ( ruleNeed ) )
            // InternalPDLXText.g:1148:2: ( ruleNeed )
            {
            // InternalPDLXText.g:1148:2: ( ruleNeed )
            // InternalPDLXText.g:1149:3: ruleNeed
            {
             before(grammarAccess.getWorkDefinitionAccess().getNeedNeedParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleNeed();

            state._fsp--;

             after(grammarAccess.getWorkDefinitionAccess().getNeedNeedParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__NeedAssignment_3"


    // $ANTLR start "rule__WorkSequence__LinkTypeAssignment_1"
    // InternalPDLXText.g:1158:1: rule__WorkSequence__LinkTypeAssignment_1 : ( ruleWorkSequenceType ) ;
    public final void rule__WorkSequence__LinkTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDLXText.g:1162:1: ( ( ruleWorkSequenceType ) )
            // InternalPDLXText.g:1163:2: ( ruleWorkSequenceType )
            {
            // InternalPDLXText.g:1163:2: ( ruleWorkSequenceType )
            // InternalPDLXText.g:1164:3: ruleWorkSequenceType
            {
             before(grammarAccess.getWorkSequenceAccess().getLinkTypeWorkSequenceTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWorkSequenceType();

            state._fsp--;

             after(grammarAccess.getWorkSequenceAccess().getLinkTypeWorkSequenceTypeEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__LinkTypeAssignment_1"


    // $ANTLR start "rule__WorkSequence__PredecessorAssignment_3"
    // InternalPDLXText.g:1173:1: rule__WorkSequence__PredecessorAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__WorkSequence__PredecessorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDLXText.g:1177:1: ( ( ( RULE_ID ) ) )
            // InternalPDLXText.g:1178:2: ( ( RULE_ID ) )
            {
            // InternalPDLXText.g:1178:2: ( ( RULE_ID ) )
            // InternalPDLXText.g:1179:3: ( RULE_ID )
            {
             before(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionCrossReference_3_0()); 
            // InternalPDLXText.g:1180:3: ( RULE_ID )
            // InternalPDLXText.g:1181:4: RULE_ID
            {
             before(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__PredecessorAssignment_3"


    // $ANTLR start "rule__WorkSequence__SuccessorAssignment_5"
    // InternalPDLXText.g:1192:1: rule__WorkSequence__SuccessorAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__WorkSequence__SuccessorAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDLXText.g:1196:1: ( ( ( RULE_ID ) ) )
            // InternalPDLXText.g:1197:2: ( ( RULE_ID ) )
            {
            // InternalPDLXText.g:1197:2: ( ( RULE_ID ) )
            // InternalPDLXText.g:1198:3: ( RULE_ID )
            {
             before(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionCrossReference_5_0()); 
            // InternalPDLXText.g:1199:3: ( RULE_ID )
            // InternalPDLXText.g:1200:4: RULE_ID
            {
             before(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__SuccessorAssignment_5"


    // $ANTLR start "rule__Guidance__TexteAssignment_1"
    // InternalPDLXText.g:1211:1: rule__Guidance__TexteAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Guidance__TexteAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDLXText.g:1215:1: ( ( RULE_STRING ) )
            // InternalPDLXText.g:1216:2: ( RULE_STRING )
            {
            // InternalPDLXText.g:1216:2: ( RULE_STRING )
            // InternalPDLXText.g:1217:3: RULE_STRING
            {
             before(grammarAccess.getGuidanceAccess().getTexteSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getGuidanceAccess().getTexteSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__TexteAssignment_1"


    // $ANTLR start "rule__Guidance__ElementsAssignment_3"
    // InternalPDLXText.g:1226:1: rule__Guidance__ElementsAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Guidance__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDLXText.g:1230:1: ( ( ( RULE_ID ) ) )
            // InternalPDLXText.g:1231:2: ( ( RULE_ID ) )
            {
            // InternalPDLXText.g:1231:2: ( ( RULE_ID ) )
            // InternalPDLXText.g:1232:3: ( RULE_ID )
            {
             before(grammarAccess.getGuidanceAccess().getElementsProcessElementCrossReference_3_0()); 
            // InternalPDLXText.g:1233:3: ( RULE_ID )
            // InternalPDLXText.g:1234:4: RULE_ID
            {
             before(grammarAccess.getGuidanceAccess().getElementsProcessElementIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGuidanceAccess().getElementsProcessElementIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getGuidanceAccess().getElementsProcessElementCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__ElementsAssignment_3"


    // $ANTLR start "rule__Ressource__NameAssignment_1"
    // InternalPDLXText.g:1245:1: rule__Ressource__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Ressource__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDLXText.g:1249:1: ( ( RULE_ID ) )
            // InternalPDLXText.g:1250:2: ( RULE_ID )
            {
            // InternalPDLXText.g:1250:2: ( RULE_ID )
            // InternalPDLXText.g:1251:3: RULE_ID
            {
             before(grammarAccess.getRessourceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRessourceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressource__NameAssignment_1"


    // $ANTLR start "rule__Ressource__QuantityAssignment_3"
    // InternalPDLXText.g:1260:1: rule__Ressource__QuantityAssignment_3 : ( RULE_INT ) ;
    public final void rule__Ressource__QuantityAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDLXText.g:1264:1: ( ( RULE_INT ) )
            // InternalPDLXText.g:1265:2: ( RULE_INT )
            {
            // InternalPDLXText.g:1265:2: ( RULE_INT )
            // InternalPDLXText.g:1266:3: RULE_INT
            {
             before(grammarAccess.getRessourceAccess().getQuantityINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRessourceAccess().getQuantityINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressource__QuantityAssignment_3"


    // $ANTLR start "rule__Need__QuantityNeededAssignment_1"
    // InternalPDLXText.g:1275:1: rule__Need__QuantityNeededAssignment_1 : ( RULE_INT ) ;
    public final void rule__Need__QuantityNeededAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDLXText.g:1279:1: ( ( RULE_INT ) )
            // InternalPDLXText.g:1280:2: ( RULE_INT )
            {
            // InternalPDLXText.g:1280:2: ( RULE_INT )
            // InternalPDLXText.g:1281:3: RULE_INT
            {
             before(grammarAccess.getNeedAccess().getQuantityNeededINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNeedAccess().getQuantityNeededINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Need__QuantityNeededAssignment_1"


    // $ANTLR start "rule__Need__RessourceAssignment_3"
    // InternalPDLXText.g:1290:1: rule__Need__RessourceAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Need__RessourceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDLXText.g:1294:1: ( ( ( RULE_ID ) ) )
            // InternalPDLXText.g:1295:2: ( ( RULE_ID ) )
            {
            // InternalPDLXText.g:1295:2: ( ( RULE_ID ) )
            // InternalPDLXText.g:1296:3: ( RULE_ID )
            {
             before(grammarAccess.getNeedAccess().getRessourceRessourceCrossReference_3_0()); 
            // InternalPDLXText.g:1297:3: ( RULE_ID )
            // InternalPDLXText.g:1298:4: RULE_ID
            {
             before(grammarAccess.getNeedAccess().getRessourceRessourceIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNeedAccess().getRessourceRessourceIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getNeedAccess().getRessourceRessourceCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Need__RessourceAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000002CE0000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000002CC0002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000040L});

}