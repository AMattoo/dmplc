/*
 * generated by Xtext
 */
package edu.cmu.sei.annex.dmpl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import edu.cmu.sei.annex.dmpl.dmpl.Constant;
import edu.cmu.sei.annex.dmpl.dmpl.DmplPackage;
import edu.cmu.sei.annex.dmpl.dmpl.DmplSubclause;
import edu.cmu.sei.annex.dmpl.dmpl.DoubleConst;
import edu.cmu.sei.annex.dmpl.dmpl.FnPrototypeDeclaration;
import edu.cmu.sei.annex.dmpl.dmpl.IdDimension;
import edu.cmu.sei.annex.dmpl.dmpl.IntConst;
import edu.cmu.sei.annex.dmpl.dmpl.IntDimension;
import edu.cmu.sei.annex.dmpl.dmpl.NodeNumDimension;
import edu.cmu.sei.annex.dmpl.dmpl.Param;
import edu.cmu.sei.annex.dmpl.dmpl.ProcNoAttr;
import edu.cmu.sei.annex.dmpl.dmpl.Procedure;
import edu.cmu.sei.annex.dmpl.dmpl.Program;
import edu.cmu.sei.annex.dmpl.dmpl.ThreadDeclaration;
import edu.cmu.sei.annex.dmpl.dmpl.Type;
import edu.cmu.sei.annex.dmpl.dmpl.Var;
import edu.cmu.sei.annex.dmpl.services.DmplGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class DmplSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DmplGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == DmplPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case DmplPackage.CONSTANT:
				sequence_Constant(context, (Constant) semanticObject); 
				return; 
			case DmplPackage.DMPL_SUBCLAUSE:
				sequence_DmplSubclause(context, (DmplSubclause) semanticObject); 
				return; 
			case DmplPackage.DOUBLE_CONST:
				sequence_DoubleConst(context, (DoubleConst) semanticObject); 
				return; 
			case DmplPackage.FN_PROTOTYPE_DECLARATION:
				sequence_FnPrototype(context, (FnPrototypeDeclaration) semanticObject); 
				return; 
			case DmplPackage.ID_DIMENSION:
				sequence_Dimension(context, (IdDimension) semanticObject); 
				return; 
			case DmplPackage.INT_CONST:
				sequence_IntConst(context, (IntConst) semanticObject); 
				return; 
			case DmplPackage.INT_DIMENSION:
				sequence_Dimension(context, (IntDimension) semanticObject); 
				return; 
			case DmplPackage.NODE_NUM_DIMENSION:
				sequence_Dimension(context, (NodeNumDimension) semanticObject); 
				return; 
			case DmplPackage.PARAM:
				sequence_Param(context, (Param) semanticObject); 
				return; 
			case DmplPackage.PROC_NO_ATTR:
				sequence_ProcNoAttr(context, (ProcNoAttr) semanticObject); 
				return; 
			case DmplPackage.PROCEDURE:
				sequence_Procedure(context, (Procedure) semanticObject); 
				return; 
			case DmplPackage.PROGRAM:
				sequence_Program(context, (Program) semanticObject); 
				return; 
			case DmplPackage.THREAD_DECLARATION:
				sequence_FnPrototype(context, (ThreadDeclaration) semanticObject); 
				return; 
			case DmplPackage.TYPE:
				sequence_Type(context, (Type) semanticObject); 
				return; 
			case DmplPackage.VAR:
				sequence_Var(context, (Var) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=TIDENTIFIER value=NumberConst)
	 */
	protected void sequence_Constant(EObject context, Constant semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DmplPackage.Literals.CONSTANT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DmplPackage.Literals.CONSTANT__NAME));
			if(transientValues.isValueTransient(semanticObject, DmplPackage.Literals.CONSTANT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DmplPackage.Literals.CONSTANT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConstantAccess().getNameTIDENTIFIERTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getConstantAccess().getValueNumberConstParserRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     index=TIDENTIFIER
	 */
	protected void sequence_Dimension(EObject context, IdDimension semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DmplPackage.Literals.ID_DIMENSION__INDEX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DmplPackage.Literals.ID_DIMENSION__INDEX));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDimensionAccess().getIndexTIDENTIFIERTerminalRuleCall_2_1_0(), semanticObject.getIndex());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     index=INT
	 */
	protected void sequence_Dimension(EObject context, IntDimension semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DmplPackage.Literals.INT_DIMENSION__INDEX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DmplPackage.Literals.INT_DIMENSION__INDEX));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDimensionAccess().getIndexINTTerminalRuleCall_0_1_0(), semanticObject.getIndex());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {NodeNumDimension}
	 */
	protected void sequence_Dimension(EObject context, NodeNumDimension semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     program=Program
	 */
	protected void sequence_DmplSubclause(EObject context, DmplSubclause semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (sign=Sign? value=Double)
	 */
	protected void sequence_DoubleConst(EObject context, DoubleConst semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((extern?='extern' | extern?='EXTERN')? (pure?='pure' | pure?='PURE')? type=Type name=TIDENTIFIER (params+=Param params+=Param*)?)
	 */
	protected void sequence_FnPrototype(EObject context, FnPrototypeDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((extern?='extern' | extern?='EXTERN')? (pure?='pure' | pure?='PURE')? name=TIDENTIFIER)
	 */
	protected void sequence_FnPrototype(EObject context, ThreadDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (sign=Sign? value=INT)
	 */
	protected void sequence_IntConst(EObject context, IntConst semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=Type var=Var)
	 */
	protected void sequence_Param(EObject context, Param semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DmplPackage.Literals.PARAM__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DmplPackage.Literals.PARAM__TYPE));
			if(transientValues.isValueTransient(semanticObject, DmplPackage.Literals.PARAM__VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DmplPackage.Literals.PARAM__VAR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getParamAccess().getTypeTypeParserRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getParamAccess().getVarVarParserRuleCall_1_0(), semanticObject.getVar());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     prototype=FnPrototype
	 */
	protected void sequence_ProcNoAttr(EObject context, ProcNoAttr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DmplPackage.Literals.PROC_NO_ATTR__PROTOTYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DmplPackage.Literals.PROC_NO_ATTR__PROTOTYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getProcNoAttrAccess().getPrototypeFnPrototypeParserRuleCall_0_0(), semanticObject.getPrototype());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     procedure=ProcNoAttr
	 */
	protected void sequence_Procedure(EObject context, Procedure semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DmplPackage.Literals.PROCEDURE__PROCEDURE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DmplPackage.Literals.PROCEDURE__PROCEDURE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getProcedureAccess().getProcedureProcNoAttrParserRuleCall_0(), semanticObject.getProcedure());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (programElements+=ProgramElement*)
	 */
	protected void sequence_Program(EObject context, Program semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (signed=Signed? simpType=SimpType)
	 */
	protected void sequence_Type(EObject context, Type semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=TIDENTIFIER dimensions+=Dimension*)
	 */
	protected void sequence_Var(EObject context, Var semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
