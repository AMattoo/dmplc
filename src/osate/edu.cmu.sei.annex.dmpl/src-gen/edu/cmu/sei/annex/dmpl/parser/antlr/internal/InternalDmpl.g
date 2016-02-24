/*
 * generated by Xtext
 */
grammar InternalDmpl;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package edu.cmu.sei.annex.dmpl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package edu.cmu.sei.annex.dmpl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import edu.cmu.sei.annex.dmpl.services.DmplGrammarAccess;

}

@parser::members {

 	private DmplGrammarAccess grammarAccess;
 	
    public InternalDmplParser(TokenStream input, DmplGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Program";	
   	}
   	
   	@Override
   	protected DmplGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleProgram
entryRuleProgram returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getProgramRule()); }
	 iv_ruleProgram=ruleProgram 
	 { $current=$iv_ruleProgram.current; } 
	 EOF 
;

// Rule Program
ruleProgram returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getProgramAccess().getProgramAction_0(),
            $current);
    }
)(
(
		{ 
	        newCompositeNode(grammarAccess.getProgramAccess().getProgramElementsProgramElementParserRuleCall_1_0()); 
	    }
		lv_programElements_1_0=ruleProgramElement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getProgramRule());
	        }
       		add(
       			$current, 
       			"programElements",
        		lv_programElements_1_0, 
        		"ProgramElement");
	        afterParserOrEnumRuleCall();
	    }

)
)*)
;







// Entry rule entryRuleDmplSubclause
entryRuleDmplSubclause returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDmplSubclauseRule()); }
	 iv_ruleDmplSubclause=ruleDmplSubclause 
	 { $current=$iv_ruleDmplSubclause.current; } 
	 EOF 
;

// Rule DmplSubclause
ruleDmplSubclause returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getDmplSubclauseAccess().getDmplSubclauseAction_0(),
            $current);
    }
)(
(
		{ 
	        newCompositeNode(grammarAccess.getDmplSubclauseAccess().getProgramProgramParserRuleCall_1_0()); 
	    }
		lv_program_1_0=ruleProgram		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDmplSubclauseRule());
	        }
       		set(
       			$current, 
       			"program",
        		lv_program_1_0, 
        		"Program");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleProgramElement
entryRuleProgramElement returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getProgramElementRule()); }
	 iv_ruleProgramElement=ruleProgramElement 
	 { $current=$iv_ruleProgramElement.current; } 
	 EOF 
;

// Rule ProgramElement
ruleProgramElement returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getProgramElementAccess().getConstantParserRuleCall_0()); 
    }
    this_Constant_0=ruleConstant
    { 
        $current = $this_Constant_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getProgramElementAccess().getProcedureParserRuleCall_1()); 
    }
    this_Procedure_1=ruleProcedure
    { 
        $current = $this_Procedure_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleConstant
entryRuleConstant returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getConstantRule()); }
	 iv_ruleConstant=ruleConstant 
	 { $current=$iv_ruleConstant.current; } 
	 EOF 
;

// Rule Constant
ruleConstant returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((	otherlv_0='const' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getConstantAccess().getConstKeyword_0_0());
    }

    |	otherlv_1='CONST' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getConstantAccess().getCONSTKeyword_0_1());
    }
)(
(
		lv_name_2_0=RULE_TIDENTIFIER
		{
			newLeafNode(lv_name_2_0, grammarAccess.getConstantAccess().getNameTIDENTIFIERTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getConstantRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"TIDENTIFIER");
	    }

)
)	otherlv_3='=' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getConstantAccess().getEqualsSignKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getConstantAccess().getValueNumberConstParserRuleCall_3_0()); 
	    }
		lv_value_4_0=ruleNumberConst		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getConstantRule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_4_0, 
        		"NumberConst");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_5=';' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getConstantAccess().getSemicolonKeyword_4());
    }
)
;





// Entry rule entryRuleNumberConst
entryRuleNumberConst returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getNumberConstRule()); }
	 iv_ruleNumberConst=ruleNumberConst 
	 { $current=$iv_ruleNumberConst.current; } 
	 EOF 
;

// Rule NumberConst
ruleNumberConst returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getNumberConstAccess().getIntConstParserRuleCall_0()); 
    }
    this_IntConst_0=ruleIntConst
    { 
        $current = $this_IntConst_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getNumberConstAccess().getDoubleConstParserRuleCall_1()); 
    }
    this_DoubleConst_1=ruleDoubleConst
    { 
        $current = $this_DoubleConst_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleIntConst
entryRuleIntConst returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getIntConstRule()); }
	 iv_ruleIntConst=ruleIntConst 
	 { $current=$iv_ruleIntConst.current; } 
	 EOF 
;

// Rule IntConst
ruleIntConst returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getIntConstAccess().getSignSignParserRuleCall_0_0()); 
	    }
		lv_sign_0_0=ruleSign		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getIntConstRule());
	        }
       		set(
       			$current, 
       			"sign",
        		lv_sign_0_0, 
        		"Sign");
	        afterParserOrEnumRuleCall();
	    }

)
)?(
(
		lv_value_1_0=RULE_INT
		{
			newLeafNode(lv_value_1_0, grammarAccess.getIntConstAccess().getValueINTTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getIntConstRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"value",
        		lv_value_1_0, 
        		"INT");
	    }

)
))
;





// Entry rule entryRuleDoubleConst
entryRuleDoubleConst returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDoubleConstRule()); }
	 iv_ruleDoubleConst=ruleDoubleConst 
	 { $current=$iv_ruleDoubleConst.current; } 
	 EOF 
;

// Rule DoubleConst
ruleDoubleConst returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getDoubleConstAccess().getSignSignParserRuleCall_0_0()); 
	    }
		lv_sign_0_0=ruleSign		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDoubleConstRule());
	        }
       		set(
       			$current, 
       			"sign",
        		lv_sign_0_0, 
        		"Sign");
	        afterParserOrEnumRuleCall();
	    }

)
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getDoubleConstAccess().getValueDoubleParserRuleCall_1_0()); 
	    }
		lv_value_1_0=ruleDouble		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDoubleConstRule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_1_0, 
        		"Double");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleType
entryRuleType returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTypeRule()); }
	 iv_ruleType=ruleType 
	 { $current=$iv_ruleType.current; } 
	 EOF 
;

// Rule Type
ruleType returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getTypeAccess().getSignedSignedParserRuleCall_0_0()); 
	    }
		lv_signed_0_0=ruleSigned		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getTypeRule());
	        }
       		set(
       			$current, 
       			"signed",
        		lv_signed_0_0, 
        		"Signed");
	        afterParserOrEnumRuleCall();
	    }

)
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getTypeAccess().getSimpTypeSimpTypeParserRuleCall_1_0()); 
	    }
		lv_simpType_1_0=ruleSimpType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getTypeRule());
	        }
       		set(
       			$current, 
       			"simpType",
        		lv_simpType_1_0, 
        		"SimpType");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleFnType
entryRuleFnType returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFnTypeRule()); }
	 iv_ruleFnType=ruleFnType 
	 { $current=$iv_ruleFnType.current; } 
	 EOF 
;

// Rule FnType
ruleFnType returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getFnTypeAccess().getTypeTypeParserRuleCall_0()); 
	    }
		lv_type_0_0=ruleType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFnTypeRule());
	        }
       		set(
       			$current, 
       			"type",
        		lv_type_0_0, 
        		"Type");
	        afterParserOrEnumRuleCall();
	    }

)
)
;





// Entry rule entryRuleProcedure
entryRuleProcedure returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getProcedureRule()); }
	 iv_ruleProcedure=ruleProcedure 
	 { $current=$iv_ruleProcedure.current; } 
	 EOF 
;

// Rule Procedure
ruleProcedure returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getProcedureAccess().getProcedureProcNoAttrParserRuleCall_0()); 
	    }
		lv_procedure_0_0=ruleProcNoAttr		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getProcedureRule());
	        }
       		set(
       			$current, 
       			"procedure",
        		lv_procedure_0_0, 
        		"ProcNoAttr");
	        afterParserOrEnumRuleCall();
	    }

)
)
;





// Entry rule entryRuleProcNoAttr
entryRuleProcNoAttr returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getProcNoAttrRule()); }
	 iv_ruleProcNoAttr=ruleProcNoAttr 
	 { $current=$iv_ruleProcNoAttr.current; } 
	 EOF 
;

// Rule ProcNoAttr
ruleProcNoAttr returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getProcNoAttrAccess().getPrototypeFnPrototypeParserRuleCall_0_0()); 
	    }
		lv_prototype_0_0=ruleFnPrototype		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getProcNoAttrRule());
	        }
       		set(
       			$current, 
       			"prototype",
        		lv_prototype_0_0, 
        		"FnPrototype");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_1=';' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getProcNoAttrAccess().getSemicolonKeyword_1());
    }
)
;





// Entry rule entryRuleFnPrototype
entryRuleFnPrototype returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFnPrototypeRule()); }
	 iv_ruleFnPrototype=ruleFnPrototype 
	 { $current=$iv_ruleFnPrototype.current; } 
	 EOF 
;

// Rule FnPrototype
ruleFnPrototype returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
(
		lv_extern_0_1=	'extern' 
    {
        newLeafNode(lv_extern_0_1, grammarAccess.getFnPrototypeAccess().getExternExternKeyword_0_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFnPrototypeRule());
	        }
       		setWithLastConsumed($current, "extern", true, null);
	    }

    |		lv_extern_0_2=	'EXTERN' 
    {
        newLeafNode(lv_extern_0_2, grammarAccess.getFnPrototypeAccess().getExternEXTERNKeyword_0_0_1());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFnPrototypeRule());
	        }
       		setWithLastConsumed($current, "extern", true, null);
	    }

)

)
)?(
(
(
		lv_pure_1_1=	'pure' 
    {
        newLeafNode(lv_pure_1_1, grammarAccess.getFnPrototypeAccess().getPurePureKeyword_1_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFnPrototypeRule());
	        }
       		setWithLastConsumed($current, "pure", true, null);
	    }

    |		lv_pure_1_2=	'PURE' 
    {
        newLeafNode(lv_pure_1_2, grammarAccess.getFnPrototypeAccess().getPurePUREKeyword_1_0_1());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFnPrototypeRule());
	        }
       		setWithLastConsumed($current, "pure", true, null);
	    }

)

)
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getFnPrototypeAccess().getPrototypeFnPrototypeNoDecorsParserRuleCall_2_0()); 
	    }
		lv_prototype_2_0=ruleFnPrototypeNoDecors		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFnPrototypeRule());
	        }
       		set(
       			$current, 
       			"prototype",
        		lv_prototype_2_0, 
        		"FnPrototypeNoDecors");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleFnPrototypeNoDecors
entryRuleFnPrototypeNoDecors returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFnPrototypeNoDecorsRule()); }
	 iv_ruleFnPrototypeNoDecors=ruleFnPrototypeNoDecors 
	 { $current=$iv_ruleFnPrototypeNoDecors.current; } 
	 EOF 
;

// Rule FnPrototypeNoDecors
ruleFnPrototypeNoDecors returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(((
    {
        $current = forceCreateModelElement(
            grammarAccess.getFnPrototypeNoDecorsAccess().getThreadDeclarationAction_0_0(),
            $current);
    }
)	otherlv_1='thread' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getFnPrototypeNoDecorsAccess().getThreadKeyword_0_1());
    }
(
(
		lv_name_2_0=RULE_TIDENTIFIER
		{
			newLeafNode(lv_name_2_0, grammarAccess.getFnPrototypeNoDecorsAccess().getNameTIDENTIFIERTerminalRuleCall_0_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFnPrototypeNoDecorsRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"TIDENTIFIER");
	    }

)
))
    |((
    {
        $current = forceCreateModelElement(
            grammarAccess.getFnPrototypeNoDecorsAccess().getFnPrototypeDeclarationAction_1_0(),
            $current);
    }
)(
(
		{ 
	        newCompositeNode(grammarAccess.getFnPrototypeNoDecorsAccess().getTypeFnTypeParserRuleCall_1_1_0()); 
	    }
		lv_type_4_0=ruleFnType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFnPrototypeNoDecorsRule());
	        }
       		set(
       			$current, 
       			"type",
        		lv_type_4_0, 
        		"FnType");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		lv_name_5_0=RULE_TIDENTIFIER
		{
			newLeafNode(lv_name_5_0, grammarAccess.getFnPrototypeNoDecorsAccess().getNameTIDENTIFIERTerminalRuleCall_1_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFnPrototypeNoDecorsRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_5_0, 
        		"TIDENTIFIER");
	    }

)
)	otherlv_6='(' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getFnPrototypeNoDecorsAccess().getLeftParenthesisKeyword_1_3());
    }
	otherlv_7=')' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getFnPrototypeNoDecorsAccess().getRightParenthesisKeyword_1_4());
    }
))
;





// Entry rule entryRuleSign
entryRuleSign returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getSignRule()); } 
	 iv_ruleSign=ruleSign 
	 { $current=$iv_ruleSign.current.getText(); }  
	 EOF 
;

// Rule Sign
ruleSign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	kw='+' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getSignAccess().getPlusSignKeyword_0()); 
    }

    |
	kw='-' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getSignAccess().getHyphenMinusKeyword_1()); 
    }
)
    ;





// Entry rule entryRuleSimpType
entryRuleSimpType returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getSimpTypeRule()); } 
	 iv_ruleSimpType=ruleSimpType 
	 { $current=$iv_ruleSimpType.current.getText(); }  
	 EOF 
;

// Rule SimpType
ruleSimpType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	kw='bool' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getSimpTypeAccess().getBoolKeyword_0()); 
    }

    |
	kw='_Bool' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getSimpTypeAccess().get_BoolKeyword_1()); 
    }

    |
	kw='int' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getSimpTypeAccess().getIntKeyword_2()); 
    }

    |
	kw='double' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getSimpTypeAccess().getDoubleKeyword_3()); 
    }

    |
	kw='void' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getSimpTypeAccess().getVoidKeyword_4()); 
    }

    |
	kw='char' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getSimpTypeAccess().getCharKeyword_5()); 
    }
)
    ;





// Entry rule entryRuleSigned
entryRuleSigned returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getSignedRule()); } 
	 iv_ruleSigned=ruleSigned 
	 { $current=$iv_ruleSigned.current.getText(); }  
	 EOF 
;

// Rule Signed
ruleSigned returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	kw='signed' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getSignedAccess().getSignedKeyword_0()); 
    }

    |
	kw='unsigned' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getSignedAccess().getUnsignedKeyword_1()); 
    }
)
    ;





// Entry rule entryRuleDouble
entryRuleDouble returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getDoubleRule()); } 
	 iv_ruleDouble=ruleDouble 
	 { $current=$iv_ruleDouble.current.getText(); }  
	 EOF 
;

// Rule Double
ruleDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	kw='NAN' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getDoubleAccess().getNANKeyword_0()); 
    }

    |(    this_INT_1=RULE_INT    {
		$current.merge(this_INT_1);
    }

    { 
    newLeafNode(this_INT_1, grammarAccess.getDoubleAccess().getINTTerminalRuleCall_1_0()); 
    }

	kw='.' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getDoubleAccess().getFullStopKeyword_1_1()); 
    }
(    this_INT_3=RULE_INT    {
		$current.merge(this_INT_3);
    }

    { 
    newLeafNode(this_INT_3, grammarAccess.getDoubleAccess().getINTTerminalRuleCall_1_2()); 
    }
)?))
    ;











RULE_TIDENTIFIER : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


