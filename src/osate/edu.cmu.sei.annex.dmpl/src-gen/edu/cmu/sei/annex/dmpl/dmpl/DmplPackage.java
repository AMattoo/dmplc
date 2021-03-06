/**
 */
package edu.cmu.sei.annex.dmpl.dmpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.osate.aadl2.Aadl2Package;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see edu.cmu.sei.annex.dmpl.dmpl.DmplFactory
 * @model kind="package"
 * @generated
 */
public interface DmplPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "dmpl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.cmu.edu/sei/annex/dmpl/Dmpl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "dmpl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DmplPackage eINSTANCE = edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl.init();

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.ProgramImpl <em>Program</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.ProgramImpl
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getProgram()
   * @generated
   */
  int PROGRAM = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Program</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.DmplSubclauseImpl <em>Subclause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplSubclauseImpl
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getDmplSubclause()
   * @generated
   */
  int DMPL_SUBCLAUSE = 1;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DMPL_SUBCLAUSE__OWNED_ELEMENT = Aadl2Package.ANNEX_SUBCLAUSE__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DMPL_SUBCLAUSE__OWNED_COMMENT = Aadl2Package.ANNEX_SUBCLAUSE__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DMPL_SUBCLAUSE__NAME = Aadl2Package.ANNEX_SUBCLAUSE__NAME;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DMPL_SUBCLAUSE__QUALIFIED_NAME = Aadl2Package.ANNEX_SUBCLAUSE__QUALIFIED_NAME;

  /**
   * The feature id for the '<em><b>Owned Property Association</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DMPL_SUBCLAUSE__OWNED_PROPERTY_ASSOCIATION = Aadl2Package.ANNEX_SUBCLAUSE__OWNED_PROPERTY_ASSOCIATION;

  /**
   * The feature id for the '<em><b>In Mode</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DMPL_SUBCLAUSE__IN_MODE = Aadl2Package.ANNEX_SUBCLAUSE__IN_MODE;

  /**
   * The feature id for the '<em><b>Program</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DMPL_SUBCLAUSE__PROGRAM = Aadl2Package.ANNEX_SUBCLAUSE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Subclause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DMPL_SUBCLAUSE_FEATURE_COUNT = Aadl2Package.ANNEX_SUBCLAUSE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.ProgramElementImpl <em>Program Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.ProgramElementImpl
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getProgramElement()
   * @generated
   */
  int PROGRAM_ELEMENT = 2;

  /**
   * The number of structural features of the '<em>Program Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM_ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.ProgramElementNoTargetImpl <em>Program Element No Target</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.ProgramElementNoTargetImpl
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getProgramElementNoTarget()
   * @generated
   */
  int PROGRAM_ELEMENT_NO_TARGET = 3;

  /**
   * The number of structural features of the '<em>Program Element No Target</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM_ELEMENT_NO_TARGET_FEATURE_COUNT = PROGRAM_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.AttributableNodeOrProcedureImpl <em>Attributable Node Or Procedure</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.AttributableNodeOrProcedureImpl
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getAttributableNodeOrProcedure()
   * @generated
   */
  int ATTRIBUTABLE_NODE_OR_PROCEDURE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTABLE_NODE_OR_PROCEDURE__NAME = 0;

  /**
   * The number of structural features of the '<em>Attributable Node Or Procedure</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTABLE_NODE_OR_PROCEDURE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.NumberConstImpl <em>Number Const</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.NumberConstImpl
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getNumberConst()
   * @generated
   */
  int NUMBER_CONST = 5;

  /**
   * The feature id for the '<em><b>Sign</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_CONST__SIGN = 0;

  /**
   * The number of structural features of the '<em>Number Const</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_CONST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.DoubleConstImpl <em>Double Const</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DoubleConstImpl
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getDoubleConst()
   * @generated
   */
  int DOUBLE_CONST = 6;

  /**
   * The feature id for the '<em><b>Sign</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE_CONST__SIGN = NUMBER_CONST__SIGN;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE_CONST__VALUE = NUMBER_CONST_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Double Const</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE_CONST_FEATURE_COUNT = NUMBER_CONST_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.AttributableElementImpl <em>Attributable Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.AttributableElementImpl
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getAttributableElement()
   * @generated
   */
  int ATTRIBUTABLE_ELEMENT = 9;

  /**
   * The number of structural features of the '<em>Attributable Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTABLE_ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.SpecificationImpl <em>Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.SpecificationImpl
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getSpecification()
   * @generated
   */
  int SPECIFICATION = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIFICATION__NAME = ATTRIBUTABLE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Function</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIFICATION__FUNCTION = ATTRIBUTABLE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIFICATION_FEATURE_COUNT = ATTRIBUTABLE_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.NodeBodyElementImpl <em>Node Body Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.NodeBodyElementImpl
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getNodeBodyElement()
   * @generated
   */
  int NODE_BODY_ELEMENT = 8;

  /**
   * The number of structural features of the '<em>Node Body Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_BODY_ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.RoleBodyElementImpl <em>Role Body Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.RoleBodyElementImpl
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getRoleBodyElement()
   * @generated
   */
  int ROLE_BODY_ELEMENT = 10;

  /**
   * The number of structural features of the '<em>Role Body Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_BODY_ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.AttributableNoRoleElementImpl <em>Attributable No Role Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.AttributableNoRoleElementImpl
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getAttributableNoRoleElement()
   * @generated
   */
  int ATTRIBUTABLE_NO_ROLE_ELEMENT = 11;

  /**
   * The number of structural features of the '<em>Attributable No Role Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTABLE_NO_ROLE_ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.VarBlockImpl <em>Var Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.VarBlockImpl
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getVarBlock()
   * @generated
   */
  int VAR_BLOCK = 12;

  /**
   * The feature id for the '<em><b>Override</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_BLOCK__OVERRIDE = NODE_BODY_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_BLOCK__VAR = NODE_BODY_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Var Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_BLOCK_FEATURE_COUNT = NODE_BODY_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.RecordBlockImpl <em>Record Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.RecordBlockImpl
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getRecordBlock()
   * @generated
   */
  int RECORD_BLOCK = 13;

  /**
   * The feature id for the '<em><b>Override</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_BLOCK__OVERRIDE = NODE_BODY_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_BLOCK__NAME = NODE_BODY_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Vars</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_BLOCK__VARS = NODE_BODY_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Equals Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_BLOCK__EQUALS_BODY = NODE_BODY_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Complement Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_BLOCK__COMPLEMENT_BODY = NODE_BODY_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Record Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_BLOCK_FEATURE_COUNT = NODE_BODY_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.NodeVarInitImpl <em>Node Var Init</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.NodeVarInitImpl
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getNodeVarInit()
   * @generated
   */
  int NODE_VAR_INIT = 14;

  /**
   * The feature id for the '<em><b>Scope</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_VAR_INIT__SCOPE = 0;

  /**
   * The feature id for the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_VAR_INIT__VAR = 1;

  /**
   * The number of structural features of the '<em>Node Var Init</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_VAR_INIT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.VarInitImpl <em>Var Init</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.VarInitImpl
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getVarInit()
   * @generated
   */
  int VAR_INIT = 15;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_INIT__TYPE = 0;

  /**
   * The feature id for the '<em><b>Var Asgns</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_INIT__VAR_ASGNS = 1;

  /**
   * The number of structural features of the '<em>Var Init</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_INIT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.VarAsgnImpl <em>Var Asgn</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.VarAsgnImpl
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getVarAsgn()
   * @generated
   */
  int VAR_ASGN = 16;

  /**
   * The feature id for the '<em><b>Input</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_ASGN__INPUT = 0;

  /**
   * The feature id for the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_ASGN__VAR = 1;

  /**
   * The number of structural features of the '<em>Var Asgn</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_ASGN_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.VarImpl <em>Var</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.VarImpl
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getVar()
   * @generated
   */
  int VAR = 17;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR__NAME = 0;

  /**
   * The feature id for the '<em><b>Dimensions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR__DIMENSIONS = 1;

  /**
   * The number of structural features of the '<em>Var</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.DimensionImpl <em>Dimension</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DimensionImpl
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getDimension()
   * @generated
   */
  int DIMENSION = 18;

  /**
   * The number of structural features of the '<em>Dimension</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIMENSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.TypeImpl
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getType()
   * @generated
   */
  int TYPE = 19;

  /**
   * The feature id for the '<em><b>Signed</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__SIGNED = 0;

  /**
   * The feature id for the '<em><b>Simp Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__SIMP_TYPE = 1;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.ProcedureImpl <em>Procedure</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.ProcedureImpl
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getProcedure()
   * @generated
   */
  int PROCEDURE = 20;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE__NAME = ATTRIBUTABLE_NODE_OR_PROCEDURE__NAME;

  /**
   * The feature id for the '<em><b>Override</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE__OVERRIDE = ATTRIBUTABLE_NODE_OR_PROCEDURE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Extern</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE__EXTERN = ATTRIBUTABLE_NODE_OR_PROCEDURE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Pure</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE__PURE = ATTRIBUTABLE_NODE_OR_PROCEDURE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Fn Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE__FN_BODY = ATTRIBUTABLE_NODE_OR_PROCEDURE_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Procedure</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_FEATURE_COUNT = ATTRIBUTABLE_NODE_OR_PROCEDURE_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.FnBodyImpl <em>Fn Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.FnBodyImpl
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getFnBody()
   * @generated
   */
  int FN_BODY = 21;

  /**
   * The feature id for the '<em><b>Var Inits</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FN_BODY__VAR_INITS = 0;

  /**
   * The feature id for the '<em><b>Stmts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FN_BODY__STMTS = 1;

  /**
   * The number of structural features of the '<em>Fn Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FN_BODY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.AttrImpl <em>Attr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.AttrImpl
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getAttr()
   * @generated
   */
  int ATTR = 22;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTR__NAME = 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTR__PARAMS = 1;

  /**
   * The number of structural features of the '<em>Attr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.ParamImpl <em>Param</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.ParamImpl
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getParam()
   * @generated
   */
  int PARAM = 23;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM__TYPE = 0;

  /**
   * The feature id for the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM__VAR = 1;

  /**
   * The number of structural features of the '<em>Param</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.StmtImpl <em>Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.StmtImpl
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getStmt()
   * @generated
   */
  int STMT = 24;

  /**
   * The number of structural features of the '<em>Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STMT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.AssignmentOrIncrementStmtImpl <em>Assignment Or Increment Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.AssignmentOrIncrementStmtImpl
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getAssignmentOrIncrementStmt()
   * @generated
   */
  int ASSIGNMENT_OR_INCREMENT_STMT = 25;

  /**
   * The number of structural features of the '<em>Assignment Or Increment Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_OR_INCREMENT_STMT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.IncrementStmtImpl <em>Increment Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.IncrementStmtImpl
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getIncrementStmt()
   * @generated
   */
  int INCREMENT_STMT = 26;

  /**
   * The feature id for the '<em><b>Var</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCREMENT_STMT__VAR = ASSIGNMENT_OR_INCREMENT_STMT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Increment Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCREMENT_STMT_FEATURE_COUNT = ASSIGNMENT_OR_INCREMENT_STMT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.InitAssignmentStmtImpl <em>Init Assignment Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.InitAssignmentStmtImpl
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getInitAssignmentStmt()
   * @generated
   */
  int INIT_ASSIGNMENT_STMT = 27;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INIT_ASSIGNMENT_STMT__TYPE = 0;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INIT_ASSIGNMENT_STMT__VARIABLE = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INIT_ASSIGNMENT_STMT__VALUE = 2;

  /**
   * The number of structural features of the '<em>Init Assignment Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INIT_ASSIGNMENT_STMT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.AssignmentStmtImpl <em>Assignment Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.AssignmentStmtImpl
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getAssignmentStmt()
   * @generated
   */
  int ASSIGNMENT_STMT = 28;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_STMT__VARIABLE = STMT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_STMT__VALUE = STMT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Assignment Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_STMT_FEATURE_COUNT = STMT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.ExprImpl <em>Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.ExprImpl
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getExpr()
   * @generated
   */
  int EXPR = 30;

  /**
   * The number of structural features of the '<em>Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.LValImpl <em>LVal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.LValImpl
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getLVal()
   * @generated
   */
  int LVAL = 29;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LVAL__NAME = EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Indices</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LVAL__INDICES = EXPR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>At</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LVAL__AT = EXPR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>LVal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LVAL_FEATURE_COUNT = EXPR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.CallExprImpl <em>Call Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.CallExprImpl
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getCallExpr()
   * @generated
   */
  int CALL_EXPR = 31;

  /**
   * The feature id for the '<em><b>Namespaces</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL_EXPR__NAMESPACES = STMT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL_EXPR__NAME = STMT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL_EXPR__ARGS = STMT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>At</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL_EXPR__AT = STMT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Call Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL_EXPR_FEATURE_COUNT = STMT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.TargetImpl <em>Target</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.TargetImpl
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getTarget()
   * @generated
   */
  int TARGET = 32;

  /**
   * The feature id for the '<em><b>Names</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TARGET__NAMES = PROGRAM_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Thunk</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TARGET__THUNK = PROGRAM_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Target</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TARGET_FEATURE_COUNT = PROGRAM_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.IncludelineImpl <em>Includeline</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.IncludelineImpl
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getIncludeline()
   * @generated
   */
  int INCLUDELINE = 33;

  /**
   * The feature id for the '<em><b>Line</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDELINE__LINE = PROGRAM_ELEMENT_NO_TARGET_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Includeline</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDELINE_FEATURE_COUNT = PROGRAM_ELEMENT_NO_TARGET_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.DefinelineImpl <em>Defineline</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DefinelineImpl
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getDefineline()
   * @generated
   */
  int DEFINELINE = 34;

  /**
   * The feature id for the '<em><b>Line</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINELINE__LINE = PROGRAM_ELEMENT_NO_TARGET_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Defineline</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINELINE_FEATURE_COUNT = PROGRAM_ELEMENT_NO_TARGET_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.ConstantImpl <em>Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.ConstantImpl
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getConstant()
   * @generated
   */
  int CONSTANT = 35;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__NAME = PROGRAM_ELEMENT_NO_TARGET_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__VALUE = PROGRAM_ELEMENT_NO_TARGET_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_FEATURE_COUNT = PROGRAM_ELEMENT_NO_TARGET_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.AttributableProgramElementImpl <em>Attributable Program Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.AttributableProgramElementImpl
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getAttributableProgramElement()
   * @generated
   */
  int ATTRIBUTABLE_PROGRAM_ELEMENT = 36;

  /**
   * The feature id for the '<em><b>Attrs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTABLE_PROGRAM_ELEMENT__ATTRS = PROGRAM_ELEMENT_NO_TARGET_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTABLE_PROGRAM_ELEMENT__ELEMENT = PROGRAM_ELEMENT_NO_TARGET_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Attributable Program Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTABLE_PROGRAM_ELEMENT_FEATURE_COUNT = PROGRAM_ELEMENT_NO_TARGET_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.NodeImpl <em>Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.NodeImpl
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getNode()
   * @generated
   */
  int NODE = 37;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__NAME = ATTRIBUTABLE_NODE_OR_PROCEDURE__NAME;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__ELEMENTS = ATTRIBUTABLE_NODE_OR_PROCEDURE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_FEATURE_COUNT = ATTRIBUTABLE_NODE_OR_PROCEDURE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.IntConstImpl <em>Int Const</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.IntConstImpl
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getIntConst()
   * @generated
   */
  int INT_CONST = 38;

  /**
   * The feature id for the '<em><b>Sign</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_CONST__SIGN = NUMBER_CONST__SIGN;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_CONST__VALUE = NUMBER_CONST_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Int Const</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_CONST_FEATURE_COUNT = NUMBER_CONST_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.AtEndSpecImpl <em>At End Spec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.AtEndSpecImpl
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getAtEndSpec()
   * @generated
   */
  int AT_END_SPEC = 39;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT_END_SPEC__NAME = SPECIFICATION__NAME;

  /**
   * The feature id for the '<em><b>Function</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT_END_SPEC__FUNCTION = SPECIFICATION__FUNCTION;

  /**
   * The number of structural features of the '<em>At End Spec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT_END_SPEC_FEATURE_COUNT = SPECIFICATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.AtLeastSpecImpl <em>At Least Spec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.AtLeastSpecImpl
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getAtLeastSpec()
   * @generated
   */
  int AT_LEAST_SPEC = 40;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT_LEAST_SPEC__NAME = SPECIFICATION__NAME;

  /**
   * The feature id for the '<em><b>Function</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT_LEAST_SPEC__FUNCTION = SPECIFICATION__FUNCTION;

  /**
   * The feature id for the '<em><b>Threshold</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT_LEAST_SPEC__THRESHOLD = SPECIFICATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>At Least Spec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT_LEAST_SPEC_FEATURE_COUNT = SPECIFICATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.RequireSpecImpl <em>Require Spec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.RequireSpecImpl
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getRequireSpec()
   * @generated
   */
  int REQUIRE_SPEC = 41;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRE_SPEC__NAME = SPECIFICATION__NAME;

  /**
   * The feature id for the '<em><b>Function</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRE_SPEC__FUNCTION = SPECIFICATION__FUNCTION;

  /**
   * The number of structural features of the '<em>Require Spec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRE_SPEC_FEATURE_COUNT = SPECIFICATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.AttributableImpl <em>Attributable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.AttributableImpl
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getAttributable()
   * @generated
   */
  int ATTRIBUTABLE = 42;

  /**
   * The feature id for the '<em><b>Attrs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTABLE__ATTRS = NODE_BODY_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTABLE__ELEMENT = NODE_BODY_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Attributable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTABLE_FEATURE_COUNT = NODE_BODY_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.SimpleRoleImpl <em>Simple Role</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.SimpleRoleImpl
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getSimpleRole()
   * @generated
   */
  int SIMPLE_ROLE = 43;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_ROLE__NAME = ATTRIBUTABLE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_ROLE__ELEMENTS = ATTRIBUTABLE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Simple Role</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_ROLE_FEATURE_COUNT = ATTRIBUTABLE_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.IdRoleImpl <em>Id Role</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.IdRoleImpl
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getIdRole()
   * @generated
   */
  int ID_ROLE = 44;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID_ROLE__NAME = ATTRIBUTABLE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID_ROLE__ID = ATTRIBUTABLE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID_ROLE__ELEMENTS = ATTRIBUTABLE_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Id Role</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID_ROLE_FEATURE_COUNT = ATTRIBUTABLE_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.AttributableNoRoleImpl <em>Attributable No Role</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.AttributableNoRoleImpl
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getAttributableNoRole()
   * @generated
   */
  int ATTRIBUTABLE_NO_ROLE = 45;

  /**
   * The feature id for the '<em><b>Attrs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTABLE_NO_ROLE__ATTRS = ROLE_BODY_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTABLE_NO_ROLE__ELEMENT = ROLE_BODY_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Attributable No Role</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTABLE_NO_ROLE_FEATURE_COUNT = ROLE_BODY_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.ExprVarAsgnImpl <em>Expr Var Asgn</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.ExprVarAsgnImpl
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getExprVarAsgn()
   * @generated
   */
  int EXPR_VAR_ASGN = 46;

  /**
   * The feature id for the '<em><b>Input</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_VAR_ASGN__INPUT = VAR_ASGN__INPUT;

  /**
   * The feature id for the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_VAR_ASGN__VAR = VAR_ASGN__VAR;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_VAR_ASGN__EXPR = VAR_ASGN_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Expr Var Asgn</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_VAR_ASGN_FEATURE_COUNT = VAR_ASGN_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.FnVarAsgnImpl <em>Fn Var Asgn</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.FnVarAsgnImpl
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getFnVarAsgn()
   * @generated
   */
  int FN_VAR_ASGN = 47;

  /**
   * The feature id for the '<em><b>Input</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FN_VAR_ASGN__INPUT = VAR_ASGN__INPUT;

  /**
   * The feature id for the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FN_VAR_ASGN__VAR = VAR_ASGN__VAR;

  /**
   * The feature id for the '<em><b>Fn Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FN_VAR_ASGN__FN_BODY = VAR_ASGN_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Fn Var Asgn</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FN_VAR_ASGN_FEATURE_COUNT = VAR_ASGN_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.IntDimensionImpl <em>Int Dimension</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.IntDimensionImpl
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getIntDimension()
   * @generated
   */
  int INT_DIMENSION = 48;

  /**
   * The feature id for the '<em><b>Index</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_DIMENSION__INDEX = DIMENSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Int Dimension</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_DIMENSION_FEATURE_COUNT = DIMENSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.NodeNumDimensionImpl <em>Node Num Dimension</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.NodeNumDimensionImpl
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getNodeNumDimension()
   * @generated
   */
  int NODE_NUM_DIMENSION = 49;

  /**
   * The number of structural features of the '<em>Node Num Dimension</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_NUM_DIMENSION_FEATURE_COUNT = DIMENSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.IdDimensionImpl <em>Id Dimension</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.IdDimensionImpl
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getIdDimension()
   * @generated
   */
  int ID_DIMENSION = 50;

  /**
   * The feature id for the '<em><b>Index</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID_DIMENSION__INDEX = DIMENSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Id Dimension</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID_DIMENSION_FEATURE_COUNT = DIMENSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.ThreadDeclarationImpl <em>Thread Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.ThreadDeclarationImpl
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getThreadDeclaration()
   * @generated
   */
  int THREAD_DECLARATION = 51;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THREAD_DECLARATION__NAME = PROCEDURE__NAME;

  /**
   * The feature id for the '<em><b>Override</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THREAD_DECLARATION__OVERRIDE = PROCEDURE__OVERRIDE;

  /**
   * The feature id for the '<em><b>Extern</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THREAD_DECLARATION__EXTERN = PROCEDURE__EXTERN;

  /**
   * The feature id for the '<em><b>Pure</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THREAD_DECLARATION__PURE = PROCEDURE__PURE;

  /**
   * The feature id for the '<em><b>Fn Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THREAD_DECLARATION__FN_BODY = PROCEDURE__FN_BODY;

  /**
   * The number of structural features of the '<em>Thread Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THREAD_DECLARATION_FEATURE_COUNT = PROCEDURE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.FunctionDeclarationImpl <em>Function Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.FunctionDeclarationImpl
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getFunctionDeclaration()
   * @generated
   */
  int FUNCTION_DECLARATION = 52;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECLARATION__NAME = PROCEDURE__NAME;

  /**
   * The feature id for the '<em><b>Override</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECLARATION__OVERRIDE = PROCEDURE__OVERRIDE;

  /**
   * The feature id for the '<em><b>Extern</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECLARATION__EXTERN = PROCEDURE__EXTERN;

  /**
   * The feature id for the '<em><b>Pure</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECLARATION__PURE = PROCEDURE__PURE;

  /**
   * The feature id for the '<em><b>Fn Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECLARATION__FN_BODY = PROCEDURE__FN_BODY;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECLARATION__TYPE = PROCEDURE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECLARATION__PARAMS = PROCEDURE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Function Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECLARATION_FEATURE_COUNT = PROCEDURE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.NestedStmtImpl <em>Nested Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.NestedStmtImpl
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getNestedStmt()
   * @generated
   */
  int NESTED_STMT = 53;

  /**
   * The feature id for the '<em><b>Stmts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_STMT__STMTS = STMT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Nested Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_STMT_FEATURE_COUNT = STMT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.WhileStmtImpl <em>While Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.WhileStmtImpl
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getWhileStmt()
   * @generated
   */
  int WHILE_STMT = 54;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_STMT__CONDITION = STMT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Stmt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_STMT__STMT = STMT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>While Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_STMT_FEATURE_COUNT = STMT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.ForStmtImpl <em>For Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.ForStmtImpl
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getForStmt()
   * @generated
   */
  int FOR_STMT = 55;

  /**
   * The feature id for the '<em><b>Inits</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STMT__INITS = STMT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STMT__CONDITION = STMT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Update</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STMT__UPDATE = STMT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Stmt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STMT__STMT = STMT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>For Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STMT_FEATURE_COUNT = STMT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.CondStmtImpl <em>Cond Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.CondStmtImpl
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getCondStmt()
   * @generated
   */
  int COND_STMT = 56;

  /**
   * The feature id for the '<em><b>Attrs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COND_STMT__ATTRS = STMT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COND_STMT__CONDITION = STMT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COND_STMT__THEN = STMT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COND_STMT__ELSE = STMT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Cond Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COND_STMT_FEATURE_COUNT = STMT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.SimpleStmtImpl <em>Simple Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.SimpleStmtImpl
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getSimpleStmt()
   * @generated
   */
  int SIMPLE_STMT = 57;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_STMT__NAME = STMT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Simple Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_STMT_FEATURE_COUNT = STMT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.ReturnValueStmtImpl <em>Return Value Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.ReturnValueStmtImpl
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getReturnValueStmt()
   * @generated
   */
  int RETURN_VALUE_STMT = 58;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_VALUE_STMT__VALUE = STMT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Return Value Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_VALUE_STMT_FEATURE_COUNT = STMT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.ForAllStmtImpl <em>For All Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.ForAllStmtImpl
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getForAllStmt()
   * @generated
   */
  int FOR_ALL_STMT = 59;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_ALL_STMT__NAME = STMT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Node</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_ALL_STMT__NODE = STMT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Stmt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_ALL_STMT__STMT = STMT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>For All Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_ALL_STMT_FEATURE_COUNT = STMT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.FadnpStmtImpl <em>Fadnp Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.FadnpStmtImpl
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getFadnpStmt()
   * @generated
   */
  int FADNP_STMT = 60;

  /**
   * The feature id for the '<em><b>Node1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FADNP_STMT__NODE1 = STMT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Node2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FADNP_STMT__NODE2 = STMT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Stmt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FADNP_STMT__STMT = STMT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Fadnp Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FADNP_STMT_FEATURE_COUNT = STMT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.TernaryExprImpl <em>Ternary Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.TernaryExprImpl
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getTernaryExpr()
   * @generated
   */
  int TERNARY_EXPR = 61;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERNARY_EXPR__CONDITION = EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERNARY_EXPR__THEN = EXPR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERNARY_EXPR__ELSE = EXPR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Ternary Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERNARY_EXPR_FEATURE_COUNT = EXPR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.OrExprImpl <em>Or Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.OrExprImpl
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getOrExpr()
   * @generated
   */
  int OR_EXPR = 62;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPR__LEFT = EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPR__RIGHT = EXPR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Or Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPR_FEATURE_COUNT = EXPR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.AndExprImpl <em>And Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.AndExprImpl
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getAndExpr()
   * @generated
   */
  int AND_EXPR = 63;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPR__LEFT = EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPR__RIGHT = EXPR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>And Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPR_FEATURE_COUNT = EXPR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.BitwiseOrExprImpl <em>Bitwise Or Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.BitwiseOrExprImpl
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getBitwiseOrExpr()
   * @generated
   */
  int BITWISE_OR_EXPR = 64;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BITWISE_OR_EXPR__LEFT = EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BITWISE_OR_EXPR__RIGHT = EXPR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Bitwise Or Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BITWISE_OR_EXPR_FEATURE_COUNT = EXPR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.XorExprImpl <em>Xor Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.XorExprImpl
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getXorExpr()
   * @generated
   */
  int XOR_EXPR = 65;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XOR_EXPR__LEFT = EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XOR_EXPR__RIGHT = EXPR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Xor Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XOR_EXPR_FEATURE_COUNT = EXPR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.BitwiseAndExprImpl <em>Bitwise And Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.BitwiseAndExprImpl
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getBitwiseAndExpr()
   * @generated
   */
  int BITWISE_AND_EXPR = 66;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BITWISE_AND_EXPR__LEFT = EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BITWISE_AND_EXPR__RIGHT = EXPR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Bitwise And Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BITWISE_AND_EXPR_FEATURE_COUNT = EXPR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.EqualityExprImpl <em>Equality Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.EqualityExprImpl
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getEqualityExpr()
   * @generated
   */
  int EQUALITY_EXPR = 67;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY_EXPR__LEFT = EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY_EXPR__OPERATOR = EXPR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY_EXPR__RIGHT = EXPR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Equality Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY_EXPR_FEATURE_COUNT = EXPR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.CompareExprImpl <em>Compare Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.CompareExprImpl
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getCompareExpr()
   * @generated
   */
  int COMPARE_EXPR = 68;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARE_EXPR__LEFT = EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARE_EXPR__OPERATOR = EXPR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARE_EXPR__RIGHT = EXPR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Compare Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARE_EXPR_FEATURE_COUNT = EXPR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.ShiftExprImpl <em>Shift Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.ShiftExprImpl
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getShiftExpr()
   * @generated
   */
  int SHIFT_EXPR = 69;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHIFT_EXPR__LEFT = EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHIFT_EXPR__OPERATOR = EXPR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHIFT_EXPR__RIGHT = EXPR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Shift Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHIFT_EXPR_FEATURE_COUNT = EXPR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.AdditiveExprImpl <em>Additive Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.AdditiveExprImpl
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getAdditiveExpr()
   * @generated
   */
  int ADDITIVE_EXPR = 70;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIVE_EXPR__LEFT = EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIVE_EXPR__OPERATOR = EXPR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIVE_EXPR__RIGHT = EXPR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Additive Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIVE_EXPR_FEATURE_COUNT = EXPR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.MultiplicativeExprImpl <em>Multiplicative Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.MultiplicativeExprImpl
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getMultiplicativeExpr()
   * @generated
   */
  int MULTIPLICATIVE_EXPR = 71;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATIVE_EXPR__LEFT = EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATIVE_EXPR__OPERATOR = EXPR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATIVE_EXPR__RIGHT = EXPR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Multiplicative Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATIVE_EXPR_FEATURE_COUNT = EXPR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.IdExprImpl <em>Id Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.IdExprImpl
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getIdExpr()
   * @generated
   */
  int ID_EXPR = 72;

  /**
   * The number of structural features of the '<em>Id Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID_EXPR_FEATURE_COUNT = EXPR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.IntExprImpl <em>Int Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.IntExprImpl
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getIntExpr()
   * @generated
   */
  int INT_EXPR = 73;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_EXPR__VALUE = EXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Int Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_EXPR_FEATURE_COUNT = EXPR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.DoubleExprImpl <em>Double Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DoubleExprImpl
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getDoubleExpr()
   * @generated
   */
  int DOUBLE_EXPR = 74;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE_EXPR__VALUE = EXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Double Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE_EXPR_FEATURE_COUNT = EXPR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.StringExprImpl <em>String Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.StringExprImpl
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getStringExpr()
   * @generated
   */
  int STRING_EXPR = 75;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_EXPR__VALUE = EXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_EXPR_FEATURE_COUNT = EXPR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.NodeNumExprImpl <em>Node Num Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.NodeNumExprImpl
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getNodeNumExpr()
   * @generated
   */
  int NODE_NUM_EXPR = 76;

  /**
   * The number of structural features of the '<em>Node Num Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_NUM_EXPR_FEATURE_COUNT = EXPR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.UnaryExprImpl <em>Unary Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.UnaryExprImpl
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getUnaryExpr()
   * @generated
   */
  int UNARY_EXPR = 77;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPR__OPERATOR = EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPR__OPERAND = EXPR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Unary Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPR_FEATURE_COUNT = EXPR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.BuiltInExprImpl <em>Built In Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.BuiltInExprImpl
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getBuiltInExpr()
   * @generated
   */
  int BUILT_IN_EXPR = 78;

  /**
   * The feature id for the '<em><b>Function</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILT_IN_EXPR__FUNCTION = EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>First Arg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILT_IN_EXPR__FIRST_ARG = EXPR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Second Arg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILT_IN_EXPR__SECOND_ARG = EXPR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Built In Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILT_IN_EXPR_FEATURE_COUNT = EXPR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.ParenthesizedExprImpl <em>Parenthesized Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.ParenthesizedExprImpl
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getParenthesizedExpr()
   * @generated
   */
  int PARENTHESIZED_EXPR = 79;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENTHESIZED_EXPR__EXPR = EXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Parenthesized Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENTHESIZED_EXPR_FEATURE_COUNT = EXPR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.SignEnum <em>Sign Enum</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.SignEnum
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getSignEnum()
   * @generated
   */
  int SIGN_ENUM = 80;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.SimpTypeEnum <em>Simp Type Enum</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.SimpTypeEnum
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getSimpTypeEnum()
   * @generated
   */
  int SIMP_TYPE_ENUM = 81;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.SignedEnum <em>Signed Enum</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.SignedEnum
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getSignedEnum()
   * @generated
   */
  int SIGNED_ENUM = 82;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.SimpleStmtKeywordEnum <em>Simple Stmt Keyword Enum</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.SimpleStmtKeywordEnum
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getSimpleStmtKeywordEnum()
   * @generated
   */
  int SIMPLE_STMT_KEYWORD_ENUM = 83;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.ForAllFunctionEnum <em>For All Function Enum</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.ForAllFunctionEnum
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getForAllFunctionEnum()
   * @generated
   */
  int FOR_ALL_FUNCTION_ENUM = 84;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.NodeVarScopeEnum <em>Node Var Scope Enum</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.NodeVarScopeEnum
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getNodeVarScopeEnum()
   * @generated
   */
  int NODE_VAR_SCOPE_ENUM = 85;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.EqualityOperator <em>Equality Operator</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.EqualityOperator
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getEqualityOperator()
   * @generated
   */
  int EQUALITY_OPERATOR = 86;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.CompareOperator <em>Compare Operator</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.CompareOperator
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getCompareOperator()
   * @generated
   */
  int COMPARE_OPERATOR = 87;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.ShiftOperator <em>Shift Operator</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.ShiftOperator
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getShiftOperator()
   * @generated
   */
  int SHIFT_OPERATOR = 88;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.AdditiveOperator <em>Additive Operator</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.AdditiveOperator
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getAdditiveOperator()
   * @generated
   */
  int ADDITIVE_OPERATOR = 89;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.MultiplicativeOperator <em>Multiplicative Operator</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.MultiplicativeOperator
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getMultiplicativeOperator()
   * @generated
   */
  int MULTIPLICATIVE_OPERATOR = 90;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.UnaryOperator <em>Unary Operator</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.UnaryOperator
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getUnaryOperator()
   * @generated
   */
  int UNARY_OPERATOR = 91;

  /**
   * The meta object id for the '{@link edu.cmu.sei.annex.dmpl.dmpl.BuiltInFunctionEnum <em>Built In Function Enum</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.annex.dmpl.dmpl.BuiltInFunctionEnum
   * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getBuiltInFunctionEnum()
   * @generated
   */
  int BUILT_IN_FUNCTION_ENUM = 92;


  /**
   * Returns the meta object for class '{@link edu.cmu.sei.annex.dmpl.dmpl.Program <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Program</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.Program
   * @generated
   */
  EClass getProgram();

  /**
   * Returns the meta object for the containment reference list '{@link edu.cmu.sei.annex.dmpl.dmpl.Program#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.Program#getElements()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Elements();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.annex.dmpl.dmpl.DmplSubclause <em>Subclause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Subclause</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.DmplSubclause
   * @generated
   */
  EClass getDmplSubclause();

  /**
   * Returns the meta object for the containment reference '{@link edu.cmu.sei.annex.dmpl.dmpl.DmplSubclause#getProgram <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Program</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.DmplSubclause#getProgram()
   * @see #getDmplSubclause()
   * @generated
   */
  EReference getDmplSubclause_Program();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.annex.dmpl.dmpl.ProgramElement <em>Program Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Program Element</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.ProgramElement
   * @generated
   */
  EClass getProgramElement();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.annex.dmpl.dmpl.ProgramElementNoTarget <em>Program Element No Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Program Element No Target</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.ProgramElementNoTarget
   * @generated
   */
  EClass getProgramElementNoTarget();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.annex.dmpl.dmpl.AttributableNodeOrProcedure <em>Attributable Node Or Procedure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attributable Node Or Procedure</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.AttributableNodeOrProcedure
   * @generated
   */
  EClass getAttributableNodeOrProcedure();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.annex.dmpl.dmpl.AttributableNodeOrProcedure#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.AttributableNodeOrProcedure#getName()
   * @see #getAttributableNodeOrProcedure()
   * @generated
   */
  EAttribute getAttributableNodeOrProcedure_Name();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.annex.dmpl.dmpl.NumberConst <em>Number Const</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number Const</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.NumberConst
   * @generated
   */
  EClass getNumberConst();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.annex.dmpl.dmpl.NumberConst#getSign <em>Sign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sign</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.NumberConst#getSign()
   * @see #getNumberConst()
   * @generated
   */
  EAttribute getNumberConst_Sign();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.annex.dmpl.dmpl.DoubleConst <em>Double Const</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Double Const</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.DoubleConst
   * @generated
   */
  EClass getDoubleConst();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.annex.dmpl.dmpl.DoubleConst#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.DoubleConst#getValue()
   * @see #getDoubleConst()
   * @generated
   */
  EAttribute getDoubleConst_Value();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.annex.dmpl.dmpl.Specification <em>Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Specification</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.Specification
   * @generated
   */
  EClass getSpecification();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.annex.dmpl.dmpl.Specification#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.Specification#getName()
   * @see #getSpecification()
   * @generated
   */
  EAttribute getSpecification_Name();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.annex.dmpl.dmpl.Specification#getFunction <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Function</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.Specification#getFunction()
   * @see #getSpecification()
   * @generated
   */
  EAttribute getSpecification_Function();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.annex.dmpl.dmpl.NodeBodyElement <em>Node Body Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node Body Element</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.NodeBodyElement
   * @generated
   */
  EClass getNodeBodyElement();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.annex.dmpl.dmpl.AttributableElement <em>Attributable Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attributable Element</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.AttributableElement
   * @generated
   */
  EClass getAttributableElement();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.annex.dmpl.dmpl.RoleBodyElement <em>Role Body Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Role Body Element</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.RoleBodyElement
   * @generated
   */
  EClass getRoleBodyElement();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.annex.dmpl.dmpl.AttributableNoRoleElement <em>Attributable No Role Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attributable No Role Element</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.AttributableNoRoleElement
   * @generated
   */
  EClass getAttributableNoRoleElement();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.annex.dmpl.dmpl.VarBlock <em>Var Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Var Block</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.VarBlock
   * @generated
   */
  EClass getVarBlock();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.annex.dmpl.dmpl.VarBlock#isOverride <em>Override</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Override</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.VarBlock#isOverride()
   * @see #getVarBlock()
   * @generated
   */
  EAttribute getVarBlock_Override();

  /**
   * Returns the meta object for the containment reference '{@link edu.cmu.sei.annex.dmpl.dmpl.VarBlock#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.VarBlock#getVar()
   * @see #getVarBlock()
   * @generated
   */
  EReference getVarBlock_Var();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.annex.dmpl.dmpl.RecordBlock <em>Record Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Record Block</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.RecordBlock
   * @generated
   */
  EClass getRecordBlock();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.annex.dmpl.dmpl.RecordBlock#isOverride <em>Override</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Override</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.RecordBlock#isOverride()
   * @see #getRecordBlock()
   * @generated
   */
  EAttribute getRecordBlock_Override();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.annex.dmpl.dmpl.RecordBlock#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.RecordBlock#getName()
   * @see #getRecordBlock()
   * @generated
   */
  EAttribute getRecordBlock_Name();

  /**
   * Returns the meta object for the containment reference list '{@link edu.cmu.sei.annex.dmpl.dmpl.RecordBlock#getVars <em>Vars</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Vars</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.RecordBlock#getVars()
   * @see #getRecordBlock()
   * @generated
   */
  EReference getRecordBlock_Vars();

  /**
   * Returns the meta object for the containment reference '{@link edu.cmu.sei.annex.dmpl.dmpl.RecordBlock#getEqualsBody <em>Equals Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Equals Body</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.RecordBlock#getEqualsBody()
   * @see #getRecordBlock()
   * @generated
   */
  EReference getRecordBlock_EqualsBody();

  /**
   * Returns the meta object for the containment reference '{@link edu.cmu.sei.annex.dmpl.dmpl.RecordBlock#getComplementBody <em>Complement Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Complement Body</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.RecordBlock#getComplementBody()
   * @see #getRecordBlock()
   * @generated
   */
  EReference getRecordBlock_ComplementBody();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.annex.dmpl.dmpl.NodeVarInit <em>Node Var Init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node Var Init</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.NodeVarInit
   * @generated
   */
  EClass getNodeVarInit();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.annex.dmpl.dmpl.NodeVarInit#getScope <em>Scope</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Scope</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.NodeVarInit#getScope()
   * @see #getNodeVarInit()
   * @generated
   */
  EAttribute getNodeVarInit_Scope();

  /**
   * Returns the meta object for the containment reference '{@link edu.cmu.sei.annex.dmpl.dmpl.NodeVarInit#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.NodeVarInit#getVar()
   * @see #getNodeVarInit()
   * @generated
   */
  EReference getNodeVarInit_Var();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.annex.dmpl.dmpl.VarInit <em>Var Init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Var Init</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.VarInit
   * @generated
   */
  EClass getVarInit();

  /**
   * Returns the meta object for the containment reference '{@link edu.cmu.sei.annex.dmpl.dmpl.VarInit#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.VarInit#getType()
   * @see #getVarInit()
   * @generated
   */
  EReference getVarInit_Type();

  /**
   * Returns the meta object for the containment reference list '{@link edu.cmu.sei.annex.dmpl.dmpl.VarInit#getVarAsgns <em>Var Asgns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Var Asgns</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.VarInit#getVarAsgns()
   * @see #getVarInit()
   * @generated
   */
  EReference getVarInit_VarAsgns();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.annex.dmpl.dmpl.VarAsgn <em>Var Asgn</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Var Asgn</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.VarAsgn
   * @generated
   */
  EClass getVarAsgn();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.annex.dmpl.dmpl.VarAsgn#isInput <em>Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Input</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.VarAsgn#isInput()
   * @see #getVarAsgn()
   * @generated
   */
  EAttribute getVarAsgn_Input();

  /**
   * Returns the meta object for the containment reference '{@link edu.cmu.sei.annex.dmpl.dmpl.VarAsgn#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.VarAsgn#getVar()
   * @see #getVarAsgn()
   * @generated
   */
  EReference getVarAsgn_Var();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.annex.dmpl.dmpl.Var <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Var</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.Var
   * @generated
   */
  EClass getVar();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.annex.dmpl.dmpl.Var#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.Var#getName()
   * @see #getVar()
   * @generated
   */
  EAttribute getVar_Name();

  /**
   * Returns the meta object for the containment reference list '{@link edu.cmu.sei.annex.dmpl.dmpl.Var#getDimensions <em>Dimensions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dimensions</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.Var#getDimensions()
   * @see #getVar()
   * @generated
   */
  EReference getVar_Dimensions();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.annex.dmpl.dmpl.Dimension <em>Dimension</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dimension</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.Dimension
   * @generated
   */
  EClass getDimension();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.annex.dmpl.dmpl.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.annex.dmpl.dmpl.Type#getSigned <em>Signed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Signed</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.Type#getSigned()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Signed();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.annex.dmpl.dmpl.Type#getSimpType <em>Simp Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Simp Type</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.Type#getSimpType()
   * @see #getType()
   * @generated
   */
  EAttribute getType_SimpType();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.annex.dmpl.dmpl.Procedure <em>Procedure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Procedure</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.Procedure
   * @generated
   */
  EClass getProcedure();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.annex.dmpl.dmpl.Procedure#isOverride <em>Override</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Override</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.Procedure#isOverride()
   * @see #getProcedure()
   * @generated
   */
  EAttribute getProcedure_Override();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.annex.dmpl.dmpl.Procedure#isExtern <em>Extern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Extern</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.Procedure#isExtern()
   * @see #getProcedure()
   * @generated
   */
  EAttribute getProcedure_Extern();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.annex.dmpl.dmpl.Procedure#isPure <em>Pure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pure</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.Procedure#isPure()
   * @see #getProcedure()
   * @generated
   */
  EAttribute getProcedure_Pure();

  /**
   * Returns the meta object for the containment reference '{@link edu.cmu.sei.annex.dmpl.dmpl.Procedure#getFnBody <em>Fn Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fn Body</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.Procedure#getFnBody()
   * @see #getProcedure()
   * @generated
   */
  EReference getProcedure_FnBody();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.annex.dmpl.dmpl.FnBody <em>Fn Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fn Body</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.FnBody
   * @generated
   */
  EClass getFnBody();

  /**
   * Returns the meta object for the containment reference list '{@link edu.cmu.sei.annex.dmpl.dmpl.FnBody#getVarInits <em>Var Inits</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Var Inits</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.FnBody#getVarInits()
   * @see #getFnBody()
   * @generated
   */
  EReference getFnBody_VarInits();

  /**
   * Returns the meta object for the containment reference list '{@link edu.cmu.sei.annex.dmpl.dmpl.FnBody#getStmts <em>Stmts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Stmts</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.FnBody#getStmts()
   * @see #getFnBody()
   * @generated
   */
  EReference getFnBody_Stmts();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.annex.dmpl.dmpl.Attr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attr</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.Attr
   * @generated
   */
  EClass getAttr();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.annex.dmpl.dmpl.Attr#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.Attr#getName()
   * @see #getAttr()
   * @generated
   */
  EAttribute getAttr_Name();

  /**
   * Returns the meta object for the containment reference list '{@link edu.cmu.sei.annex.dmpl.dmpl.Attr#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.Attr#getParams()
   * @see #getAttr()
   * @generated
   */
  EReference getAttr_Params();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.annex.dmpl.dmpl.Param <em>Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Param</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.Param
   * @generated
   */
  EClass getParam();

  /**
   * Returns the meta object for the containment reference '{@link edu.cmu.sei.annex.dmpl.dmpl.Param#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.Param#getType()
   * @see #getParam()
   * @generated
   */
  EReference getParam_Type();

  /**
   * Returns the meta object for the containment reference '{@link edu.cmu.sei.annex.dmpl.dmpl.Param#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.Param#getVar()
   * @see #getParam()
   * @generated
   */
  EReference getParam_Var();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.annex.dmpl.dmpl.Stmt <em>Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Stmt</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.Stmt
   * @generated
   */
  EClass getStmt();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.annex.dmpl.dmpl.AssignmentOrIncrementStmt <em>Assignment Or Increment Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignment Or Increment Stmt</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.AssignmentOrIncrementStmt
   * @generated
   */
  EClass getAssignmentOrIncrementStmt();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.annex.dmpl.dmpl.IncrementStmt <em>Increment Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Increment Stmt</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.IncrementStmt
   * @generated
   */
  EClass getIncrementStmt();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.annex.dmpl.dmpl.IncrementStmt#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Var</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.IncrementStmt#getVar()
   * @see #getIncrementStmt()
   * @generated
   */
  EAttribute getIncrementStmt_Var();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.annex.dmpl.dmpl.InitAssignmentStmt <em>Init Assignment Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Init Assignment Stmt</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.InitAssignmentStmt
   * @generated
   */
  EClass getInitAssignmentStmt();

  /**
   * Returns the meta object for the containment reference '{@link edu.cmu.sei.annex.dmpl.dmpl.InitAssignmentStmt#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.InitAssignmentStmt#getType()
   * @see #getInitAssignmentStmt()
   * @generated
   */
  EReference getInitAssignmentStmt_Type();

  /**
   * Returns the meta object for the containment reference '{@link edu.cmu.sei.annex.dmpl.dmpl.InitAssignmentStmt#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.InitAssignmentStmt#getVariable()
   * @see #getInitAssignmentStmt()
   * @generated
   */
  EReference getInitAssignmentStmt_Variable();

  /**
   * Returns the meta object for the containment reference '{@link edu.cmu.sei.annex.dmpl.dmpl.InitAssignmentStmt#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.InitAssignmentStmt#getValue()
   * @see #getInitAssignmentStmt()
   * @generated
   */
  EReference getInitAssignmentStmt_Value();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.annex.dmpl.dmpl.AssignmentStmt <em>Assignment Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignment Stmt</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.AssignmentStmt
   * @generated
   */
  EClass getAssignmentStmt();

  /**
   * Returns the meta object for the containment reference '{@link edu.cmu.sei.annex.dmpl.dmpl.AssignmentStmt#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.AssignmentStmt#getVariable()
   * @see #getAssignmentStmt()
   * @generated
   */
  EReference getAssignmentStmt_Variable();

  /**
   * Returns the meta object for the containment reference '{@link edu.cmu.sei.annex.dmpl.dmpl.AssignmentStmt#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.AssignmentStmt#getValue()
   * @see #getAssignmentStmt()
   * @generated
   */
  EReference getAssignmentStmt_Value();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.annex.dmpl.dmpl.LVal <em>LVal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>LVal</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.LVal
   * @generated
   */
  EClass getLVal();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.annex.dmpl.dmpl.LVal#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.LVal#getName()
   * @see #getLVal()
   * @generated
   */
  EAttribute getLVal_Name();

  /**
   * Returns the meta object for the containment reference list '{@link edu.cmu.sei.annex.dmpl.dmpl.LVal#getIndices <em>Indices</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Indices</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.LVal#getIndices()
   * @see #getLVal()
   * @generated
   */
  EReference getLVal_Indices();

  /**
   * Returns the meta object for the containment reference '{@link edu.cmu.sei.annex.dmpl.dmpl.LVal#getAt <em>At</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>At</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.LVal#getAt()
   * @see #getLVal()
   * @generated
   */
  EReference getLVal_At();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.annex.dmpl.dmpl.Expr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.Expr
   * @generated
   */
  EClass getExpr();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.annex.dmpl.dmpl.CallExpr <em>Call Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Call Expr</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.CallExpr
   * @generated
   */
  EClass getCallExpr();

  /**
   * Returns the meta object for the attribute list '{@link edu.cmu.sei.annex.dmpl.dmpl.CallExpr#getNamespaces <em>Namespaces</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Namespaces</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.CallExpr#getNamespaces()
   * @see #getCallExpr()
   * @generated
   */
  EAttribute getCallExpr_Namespaces();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.annex.dmpl.dmpl.CallExpr#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.CallExpr#getName()
   * @see #getCallExpr()
   * @generated
   */
  EAttribute getCallExpr_Name();

  /**
   * Returns the meta object for the containment reference list '{@link edu.cmu.sei.annex.dmpl.dmpl.CallExpr#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Args</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.CallExpr#getArgs()
   * @see #getCallExpr()
   * @generated
   */
  EReference getCallExpr_Args();

  /**
   * Returns the meta object for the containment reference '{@link edu.cmu.sei.annex.dmpl.dmpl.CallExpr#getAt <em>At</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>At</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.CallExpr#getAt()
   * @see #getCallExpr()
   * @generated
   */
  EReference getCallExpr_At();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.annex.dmpl.dmpl.Target <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Target</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.Target
   * @generated
   */
  EClass getTarget();

  /**
   * Returns the meta object for the attribute list '{@link edu.cmu.sei.annex.dmpl.dmpl.Target#getNames <em>Names</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Names</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.Target#getNames()
   * @see #getTarget()
   * @generated
   */
  EAttribute getTarget_Names();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.annex.dmpl.dmpl.Target#getThunk <em>Thunk</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Thunk</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.Target#getThunk()
   * @see #getTarget()
   * @generated
   */
  EAttribute getTarget_Thunk();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.annex.dmpl.dmpl.Includeline <em>Includeline</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Includeline</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.Includeline
   * @generated
   */
  EClass getIncludeline();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.annex.dmpl.dmpl.Includeline#getLine <em>Line</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Line</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.Includeline#getLine()
   * @see #getIncludeline()
   * @generated
   */
  EAttribute getIncludeline_Line();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.annex.dmpl.dmpl.Defineline <em>Defineline</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Defineline</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.Defineline
   * @generated
   */
  EClass getDefineline();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.annex.dmpl.dmpl.Defineline#getLine <em>Line</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Line</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.Defineline#getLine()
   * @see #getDefineline()
   * @generated
   */
  EAttribute getDefineline_Line();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.annex.dmpl.dmpl.Constant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constant</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.Constant
   * @generated
   */
  EClass getConstant();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.annex.dmpl.dmpl.Constant#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.Constant#getName()
   * @see #getConstant()
   * @generated
   */
  EAttribute getConstant_Name();

  /**
   * Returns the meta object for the containment reference '{@link edu.cmu.sei.annex.dmpl.dmpl.Constant#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.Constant#getValue()
   * @see #getConstant()
   * @generated
   */
  EReference getConstant_Value();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.annex.dmpl.dmpl.AttributableProgramElement <em>Attributable Program Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attributable Program Element</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.AttributableProgramElement
   * @generated
   */
  EClass getAttributableProgramElement();

  /**
   * Returns the meta object for the containment reference list '{@link edu.cmu.sei.annex.dmpl.dmpl.AttributableProgramElement#getAttrs <em>Attrs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attrs</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.AttributableProgramElement#getAttrs()
   * @see #getAttributableProgramElement()
   * @generated
   */
  EReference getAttributableProgramElement_Attrs();

  /**
   * Returns the meta object for the containment reference '{@link edu.cmu.sei.annex.dmpl.dmpl.AttributableProgramElement#getElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Element</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.AttributableProgramElement#getElement()
   * @see #getAttributableProgramElement()
   * @generated
   */
  EReference getAttributableProgramElement_Element();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.annex.dmpl.dmpl.Node <em>Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.Node
   * @generated
   */
  EClass getNode();

  /**
   * Returns the meta object for the containment reference list '{@link edu.cmu.sei.annex.dmpl.dmpl.Node#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.Node#getElements()
   * @see #getNode()
   * @generated
   */
  EReference getNode_Elements();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.annex.dmpl.dmpl.IntConst <em>Int Const</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int Const</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.IntConst
   * @generated
   */
  EClass getIntConst();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.annex.dmpl.dmpl.IntConst#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.IntConst#getValue()
   * @see #getIntConst()
   * @generated
   */
  EAttribute getIntConst_Value();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.annex.dmpl.dmpl.AtEndSpec <em>At End Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>At End Spec</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.AtEndSpec
   * @generated
   */
  EClass getAtEndSpec();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.annex.dmpl.dmpl.AtLeastSpec <em>At Least Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>At Least Spec</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.AtLeastSpec
   * @generated
   */
  EClass getAtLeastSpec();

  /**
   * Returns the meta object for the containment reference '{@link edu.cmu.sei.annex.dmpl.dmpl.AtLeastSpec#getThreshold <em>Threshold</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Threshold</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.AtLeastSpec#getThreshold()
   * @see #getAtLeastSpec()
   * @generated
   */
  EReference getAtLeastSpec_Threshold();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.annex.dmpl.dmpl.RequireSpec <em>Require Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Require Spec</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.RequireSpec
   * @generated
   */
  EClass getRequireSpec();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.annex.dmpl.dmpl.Attributable <em>Attributable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attributable</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.Attributable
   * @generated
   */
  EClass getAttributable();

  /**
   * Returns the meta object for the containment reference list '{@link edu.cmu.sei.annex.dmpl.dmpl.Attributable#getAttrs <em>Attrs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attrs</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.Attributable#getAttrs()
   * @see #getAttributable()
   * @generated
   */
  EReference getAttributable_Attrs();

  /**
   * Returns the meta object for the containment reference '{@link edu.cmu.sei.annex.dmpl.dmpl.Attributable#getElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Element</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.Attributable#getElement()
   * @see #getAttributable()
   * @generated
   */
  EReference getAttributable_Element();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.annex.dmpl.dmpl.SimpleRole <em>Simple Role</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Role</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.SimpleRole
   * @generated
   */
  EClass getSimpleRole();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.annex.dmpl.dmpl.SimpleRole#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.SimpleRole#getName()
   * @see #getSimpleRole()
   * @generated
   */
  EAttribute getSimpleRole_Name();

  /**
   * Returns the meta object for the containment reference list '{@link edu.cmu.sei.annex.dmpl.dmpl.SimpleRole#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.SimpleRole#getElements()
   * @see #getSimpleRole()
   * @generated
   */
  EReference getSimpleRole_Elements();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.annex.dmpl.dmpl.IdRole <em>Id Role</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Id Role</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.IdRole
   * @generated
   */
  EClass getIdRole();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.annex.dmpl.dmpl.IdRole#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.IdRole#getName()
   * @see #getIdRole()
   * @generated
   */
  EAttribute getIdRole_Name();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.annex.dmpl.dmpl.IdRole#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.IdRole#getId()
   * @see #getIdRole()
   * @generated
   */
  EAttribute getIdRole_Id();

  /**
   * Returns the meta object for the containment reference list '{@link edu.cmu.sei.annex.dmpl.dmpl.IdRole#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.IdRole#getElements()
   * @see #getIdRole()
   * @generated
   */
  EReference getIdRole_Elements();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.annex.dmpl.dmpl.AttributableNoRole <em>Attributable No Role</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attributable No Role</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.AttributableNoRole
   * @generated
   */
  EClass getAttributableNoRole();

  /**
   * Returns the meta object for the containment reference list '{@link edu.cmu.sei.annex.dmpl.dmpl.AttributableNoRole#getAttrs <em>Attrs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attrs</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.AttributableNoRole#getAttrs()
   * @see #getAttributableNoRole()
   * @generated
   */
  EReference getAttributableNoRole_Attrs();

  /**
   * Returns the meta object for the containment reference '{@link edu.cmu.sei.annex.dmpl.dmpl.AttributableNoRole#getElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Element</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.AttributableNoRole#getElement()
   * @see #getAttributableNoRole()
   * @generated
   */
  EReference getAttributableNoRole_Element();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.annex.dmpl.dmpl.ExprVarAsgn <em>Expr Var Asgn</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr Var Asgn</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.ExprVarAsgn
   * @generated
   */
  EClass getExprVarAsgn();

  /**
   * Returns the meta object for the containment reference '{@link edu.cmu.sei.annex.dmpl.dmpl.ExprVarAsgn#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.ExprVarAsgn#getExpr()
   * @see #getExprVarAsgn()
   * @generated
   */
  EReference getExprVarAsgn_Expr();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.annex.dmpl.dmpl.FnVarAsgn <em>Fn Var Asgn</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fn Var Asgn</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.FnVarAsgn
   * @generated
   */
  EClass getFnVarAsgn();

  /**
   * Returns the meta object for the containment reference '{@link edu.cmu.sei.annex.dmpl.dmpl.FnVarAsgn#getFnBody <em>Fn Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fn Body</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.FnVarAsgn#getFnBody()
   * @see #getFnVarAsgn()
   * @generated
   */
  EReference getFnVarAsgn_FnBody();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.annex.dmpl.dmpl.IntDimension <em>Int Dimension</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int Dimension</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.IntDimension
   * @generated
   */
  EClass getIntDimension();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.annex.dmpl.dmpl.IntDimension#getIndex <em>Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Index</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.IntDimension#getIndex()
   * @see #getIntDimension()
   * @generated
   */
  EAttribute getIntDimension_Index();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.annex.dmpl.dmpl.NodeNumDimension <em>Node Num Dimension</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node Num Dimension</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.NodeNumDimension
   * @generated
   */
  EClass getNodeNumDimension();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.annex.dmpl.dmpl.IdDimension <em>Id Dimension</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Id Dimension</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.IdDimension
   * @generated
   */
  EClass getIdDimension();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.annex.dmpl.dmpl.IdDimension#getIndex <em>Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Index</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.IdDimension#getIndex()
   * @see #getIdDimension()
   * @generated
   */
  EAttribute getIdDimension_Index();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.annex.dmpl.dmpl.ThreadDeclaration <em>Thread Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Thread Declaration</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.ThreadDeclaration
   * @generated
   */
  EClass getThreadDeclaration();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.annex.dmpl.dmpl.FunctionDeclaration <em>Function Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Declaration</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.FunctionDeclaration
   * @generated
   */
  EClass getFunctionDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link edu.cmu.sei.annex.dmpl.dmpl.FunctionDeclaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.FunctionDeclaration#getType()
   * @see #getFunctionDeclaration()
   * @generated
   */
  EReference getFunctionDeclaration_Type();

  /**
   * Returns the meta object for the containment reference list '{@link edu.cmu.sei.annex.dmpl.dmpl.FunctionDeclaration#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.FunctionDeclaration#getParams()
   * @see #getFunctionDeclaration()
   * @generated
   */
  EReference getFunctionDeclaration_Params();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.annex.dmpl.dmpl.NestedStmt <em>Nested Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Nested Stmt</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.NestedStmt
   * @generated
   */
  EClass getNestedStmt();

  /**
   * Returns the meta object for the containment reference list '{@link edu.cmu.sei.annex.dmpl.dmpl.NestedStmt#getStmts <em>Stmts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Stmts</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.NestedStmt#getStmts()
   * @see #getNestedStmt()
   * @generated
   */
  EReference getNestedStmt_Stmts();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.annex.dmpl.dmpl.WhileStmt <em>While Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>While Stmt</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.WhileStmt
   * @generated
   */
  EClass getWhileStmt();

  /**
   * Returns the meta object for the containment reference '{@link edu.cmu.sei.annex.dmpl.dmpl.WhileStmt#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.WhileStmt#getCondition()
   * @see #getWhileStmt()
   * @generated
   */
  EReference getWhileStmt_Condition();

  /**
   * Returns the meta object for the containment reference '{@link edu.cmu.sei.annex.dmpl.dmpl.WhileStmt#getStmt <em>Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Stmt</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.WhileStmt#getStmt()
   * @see #getWhileStmt()
   * @generated
   */
  EReference getWhileStmt_Stmt();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.annex.dmpl.dmpl.ForStmt <em>For Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>For Stmt</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.ForStmt
   * @generated
   */
  EClass getForStmt();

  /**
   * Returns the meta object for the containment reference list '{@link edu.cmu.sei.annex.dmpl.dmpl.ForStmt#getInits <em>Inits</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Inits</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.ForStmt#getInits()
   * @see #getForStmt()
   * @generated
   */
  EReference getForStmt_Inits();

  /**
   * Returns the meta object for the containment reference '{@link edu.cmu.sei.annex.dmpl.dmpl.ForStmt#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.ForStmt#getCondition()
   * @see #getForStmt()
   * @generated
   */
  EReference getForStmt_Condition();

  /**
   * Returns the meta object for the containment reference '{@link edu.cmu.sei.annex.dmpl.dmpl.ForStmt#getUpdate <em>Update</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Update</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.ForStmt#getUpdate()
   * @see #getForStmt()
   * @generated
   */
  EReference getForStmt_Update();

  /**
   * Returns the meta object for the containment reference '{@link edu.cmu.sei.annex.dmpl.dmpl.ForStmt#getStmt <em>Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Stmt</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.ForStmt#getStmt()
   * @see #getForStmt()
   * @generated
   */
  EReference getForStmt_Stmt();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.annex.dmpl.dmpl.CondStmt <em>Cond Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cond Stmt</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.CondStmt
   * @generated
   */
  EClass getCondStmt();

  /**
   * Returns the meta object for the containment reference list '{@link edu.cmu.sei.annex.dmpl.dmpl.CondStmt#getAttrs <em>Attrs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attrs</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.CondStmt#getAttrs()
   * @see #getCondStmt()
   * @generated
   */
  EReference getCondStmt_Attrs();

  /**
   * Returns the meta object for the containment reference '{@link edu.cmu.sei.annex.dmpl.dmpl.CondStmt#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.CondStmt#getCondition()
   * @see #getCondStmt()
   * @generated
   */
  EReference getCondStmt_Condition();

  /**
   * Returns the meta object for the containment reference '{@link edu.cmu.sei.annex.dmpl.dmpl.CondStmt#getThen <em>Then</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Then</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.CondStmt#getThen()
   * @see #getCondStmt()
   * @generated
   */
  EReference getCondStmt_Then();

  /**
   * Returns the meta object for the containment reference '{@link edu.cmu.sei.annex.dmpl.dmpl.CondStmt#getElse <em>Else</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Else</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.CondStmt#getElse()
   * @see #getCondStmt()
   * @generated
   */
  EReference getCondStmt_Else();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.annex.dmpl.dmpl.SimpleStmt <em>Simple Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Stmt</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.SimpleStmt
   * @generated
   */
  EClass getSimpleStmt();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.annex.dmpl.dmpl.SimpleStmt#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.SimpleStmt#getName()
   * @see #getSimpleStmt()
   * @generated
   */
  EAttribute getSimpleStmt_Name();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.annex.dmpl.dmpl.ReturnValueStmt <em>Return Value Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Return Value Stmt</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.ReturnValueStmt
   * @generated
   */
  EClass getReturnValueStmt();

  /**
   * Returns the meta object for the containment reference '{@link edu.cmu.sei.annex.dmpl.dmpl.ReturnValueStmt#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.ReturnValueStmt#getValue()
   * @see #getReturnValueStmt()
   * @generated
   */
  EReference getReturnValueStmt_Value();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.annex.dmpl.dmpl.ForAllStmt <em>For All Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>For All Stmt</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.ForAllStmt
   * @generated
   */
  EClass getForAllStmt();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.annex.dmpl.dmpl.ForAllStmt#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.ForAllStmt#getName()
   * @see #getForAllStmt()
   * @generated
   */
  EAttribute getForAllStmt_Name();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.annex.dmpl.dmpl.ForAllStmt#getNode <em>Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Node</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.ForAllStmt#getNode()
   * @see #getForAllStmt()
   * @generated
   */
  EAttribute getForAllStmt_Node();

  /**
   * Returns the meta object for the containment reference '{@link edu.cmu.sei.annex.dmpl.dmpl.ForAllStmt#getStmt <em>Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Stmt</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.ForAllStmt#getStmt()
   * @see #getForAllStmt()
   * @generated
   */
  EReference getForAllStmt_Stmt();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.annex.dmpl.dmpl.FadnpStmt <em>Fadnp Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fadnp Stmt</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.FadnpStmt
   * @generated
   */
  EClass getFadnpStmt();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.annex.dmpl.dmpl.FadnpStmt#getNode1 <em>Node1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Node1</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.FadnpStmt#getNode1()
   * @see #getFadnpStmt()
   * @generated
   */
  EAttribute getFadnpStmt_Node1();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.annex.dmpl.dmpl.FadnpStmt#getNode2 <em>Node2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Node2</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.FadnpStmt#getNode2()
   * @see #getFadnpStmt()
   * @generated
   */
  EAttribute getFadnpStmt_Node2();

  /**
   * Returns the meta object for the containment reference '{@link edu.cmu.sei.annex.dmpl.dmpl.FadnpStmt#getStmt <em>Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Stmt</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.FadnpStmt#getStmt()
   * @see #getFadnpStmt()
   * @generated
   */
  EReference getFadnpStmt_Stmt();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.annex.dmpl.dmpl.TernaryExpr <em>Ternary Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ternary Expr</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.TernaryExpr
   * @generated
   */
  EClass getTernaryExpr();

  /**
   * Returns the meta object for the containment reference '{@link edu.cmu.sei.annex.dmpl.dmpl.TernaryExpr#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.TernaryExpr#getCondition()
   * @see #getTernaryExpr()
   * @generated
   */
  EReference getTernaryExpr_Condition();

  /**
   * Returns the meta object for the containment reference '{@link edu.cmu.sei.annex.dmpl.dmpl.TernaryExpr#getThen <em>Then</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Then</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.TernaryExpr#getThen()
   * @see #getTernaryExpr()
   * @generated
   */
  EReference getTernaryExpr_Then();

  /**
   * Returns the meta object for the containment reference '{@link edu.cmu.sei.annex.dmpl.dmpl.TernaryExpr#getElse <em>Else</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Else</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.TernaryExpr#getElse()
   * @see #getTernaryExpr()
   * @generated
   */
  EReference getTernaryExpr_Else();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.annex.dmpl.dmpl.OrExpr <em>Or Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Or Expr</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.OrExpr
   * @generated
   */
  EClass getOrExpr();

  /**
   * Returns the meta object for the containment reference '{@link edu.cmu.sei.annex.dmpl.dmpl.OrExpr#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.OrExpr#getLeft()
   * @see #getOrExpr()
   * @generated
   */
  EReference getOrExpr_Left();

  /**
   * Returns the meta object for the containment reference '{@link edu.cmu.sei.annex.dmpl.dmpl.OrExpr#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.OrExpr#getRight()
   * @see #getOrExpr()
   * @generated
   */
  EReference getOrExpr_Right();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.annex.dmpl.dmpl.AndExpr <em>And Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>And Expr</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.AndExpr
   * @generated
   */
  EClass getAndExpr();

  /**
   * Returns the meta object for the containment reference '{@link edu.cmu.sei.annex.dmpl.dmpl.AndExpr#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.AndExpr#getLeft()
   * @see #getAndExpr()
   * @generated
   */
  EReference getAndExpr_Left();

  /**
   * Returns the meta object for the containment reference '{@link edu.cmu.sei.annex.dmpl.dmpl.AndExpr#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.AndExpr#getRight()
   * @see #getAndExpr()
   * @generated
   */
  EReference getAndExpr_Right();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.annex.dmpl.dmpl.BitwiseOrExpr <em>Bitwise Or Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bitwise Or Expr</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.BitwiseOrExpr
   * @generated
   */
  EClass getBitwiseOrExpr();

  /**
   * Returns the meta object for the containment reference '{@link edu.cmu.sei.annex.dmpl.dmpl.BitwiseOrExpr#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.BitwiseOrExpr#getLeft()
   * @see #getBitwiseOrExpr()
   * @generated
   */
  EReference getBitwiseOrExpr_Left();

  /**
   * Returns the meta object for the containment reference '{@link edu.cmu.sei.annex.dmpl.dmpl.BitwiseOrExpr#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.BitwiseOrExpr#getRight()
   * @see #getBitwiseOrExpr()
   * @generated
   */
  EReference getBitwiseOrExpr_Right();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.annex.dmpl.dmpl.XorExpr <em>Xor Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Xor Expr</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.XorExpr
   * @generated
   */
  EClass getXorExpr();

  /**
   * Returns the meta object for the containment reference '{@link edu.cmu.sei.annex.dmpl.dmpl.XorExpr#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.XorExpr#getLeft()
   * @see #getXorExpr()
   * @generated
   */
  EReference getXorExpr_Left();

  /**
   * Returns the meta object for the containment reference '{@link edu.cmu.sei.annex.dmpl.dmpl.XorExpr#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.XorExpr#getRight()
   * @see #getXorExpr()
   * @generated
   */
  EReference getXorExpr_Right();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.annex.dmpl.dmpl.BitwiseAndExpr <em>Bitwise And Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bitwise And Expr</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.BitwiseAndExpr
   * @generated
   */
  EClass getBitwiseAndExpr();

  /**
   * Returns the meta object for the containment reference '{@link edu.cmu.sei.annex.dmpl.dmpl.BitwiseAndExpr#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.BitwiseAndExpr#getLeft()
   * @see #getBitwiseAndExpr()
   * @generated
   */
  EReference getBitwiseAndExpr_Left();

  /**
   * Returns the meta object for the containment reference '{@link edu.cmu.sei.annex.dmpl.dmpl.BitwiseAndExpr#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.BitwiseAndExpr#getRight()
   * @see #getBitwiseAndExpr()
   * @generated
   */
  EReference getBitwiseAndExpr_Right();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.annex.dmpl.dmpl.EqualityExpr <em>Equality Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Equality Expr</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.EqualityExpr
   * @generated
   */
  EClass getEqualityExpr();

  /**
   * Returns the meta object for the containment reference '{@link edu.cmu.sei.annex.dmpl.dmpl.EqualityExpr#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.EqualityExpr#getLeft()
   * @see #getEqualityExpr()
   * @generated
   */
  EReference getEqualityExpr_Left();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.annex.dmpl.dmpl.EqualityExpr#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.EqualityExpr#getOperator()
   * @see #getEqualityExpr()
   * @generated
   */
  EAttribute getEqualityExpr_Operator();

  /**
   * Returns the meta object for the containment reference '{@link edu.cmu.sei.annex.dmpl.dmpl.EqualityExpr#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.EqualityExpr#getRight()
   * @see #getEqualityExpr()
   * @generated
   */
  EReference getEqualityExpr_Right();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.annex.dmpl.dmpl.CompareExpr <em>Compare Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Compare Expr</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.CompareExpr
   * @generated
   */
  EClass getCompareExpr();

  /**
   * Returns the meta object for the containment reference '{@link edu.cmu.sei.annex.dmpl.dmpl.CompareExpr#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.CompareExpr#getLeft()
   * @see #getCompareExpr()
   * @generated
   */
  EReference getCompareExpr_Left();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.annex.dmpl.dmpl.CompareExpr#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.CompareExpr#getOperator()
   * @see #getCompareExpr()
   * @generated
   */
  EAttribute getCompareExpr_Operator();

  /**
   * Returns the meta object for the containment reference '{@link edu.cmu.sei.annex.dmpl.dmpl.CompareExpr#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.CompareExpr#getRight()
   * @see #getCompareExpr()
   * @generated
   */
  EReference getCompareExpr_Right();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.annex.dmpl.dmpl.ShiftExpr <em>Shift Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Shift Expr</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.ShiftExpr
   * @generated
   */
  EClass getShiftExpr();

  /**
   * Returns the meta object for the containment reference '{@link edu.cmu.sei.annex.dmpl.dmpl.ShiftExpr#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.ShiftExpr#getLeft()
   * @see #getShiftExpr()
   * @generated
   */
  EReference getShiftExpr_Left();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.annex.dmpl.dmpl.ShiftExpr#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.ShiftExpr#getOperator()
   * @see #getShiftExpr()
   * @generated
   */
  EAttribute getShiftExpr_Operator();

  /**
   * Returns the meta object for the containment reference '{@link edu.cmu.sei.annex.dmpl.dmpl.ShiftExpr#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.ShiftExpr#getRight()
   * @see #getShiftExpr()
   * @generated
   */
  EReference getShiftExpr_Right();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.annex.dmpl.dmpl.AdditiveExpr <em>Additive Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Additive Expr</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.AdditiveExpr
   * @generated
   */
  EClass getAdditiveExpr();

  /**
   * Returns the meta object for the containment reference '{@link edu.cmu.sei.annex.dmpl.dmpl.AdditiveExpr#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.AdditiveExpr#getLeft()
   * @see #getAdditiveExpr()
   * @generated
   */
  EReference getAdditiveExpr_Left();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.annex.dmpl.dmpl.AdditiveExpr#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.AdditiveExpr#getOperator()
   * @see #getAdditiveExpr()
   * @generated
   */
  EAttribute getAdditiveExpr_Operator();

  /**
   * Returns the meta object for the containment reference '{@link edu.cmu.sei.annex.dmpl.dmpl.AdditiveExpr#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.AdditiveExpr#getRight()
   * @see #getAdditiveExpr()
   * @generated
   */
  EReference getAdditiveExpr_Right();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.annex.dmpl.dmpl.MultiplicativeExpr <em>Multiplicative Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multiplicative Expr</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.MultiplicativeExpr
   * @generated
   */
  EClass getMultiplicativeExpr();

  /**
   * Returns the meta object for the containment reference '{@link edu.cmu.sei.annex.dmpl.dmpl.MultiplicativeExpr#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.MultiplicativeExpr#getLeft()
   * @see #getMultiplicativeExpr()
   * @generated
   */
  EReference getMultiplicativeExpr_Left();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.annex.dmpl.dmpl.MultiplicativeExpr#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.MultiplicativeExpr#getOperator()
   * @see #getMultiplicativeExpr()
   * @generated
   */
  EAttribute getMultiplicativeExpr_Operator();

  /**
   * Returns the meta object for the containment reference '{@link edu.cmu.sei.annex.dmpl.dmpl.MultiplicativeExpr#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.MultiplicativeExpr#getRight()
   * @see #getMultiplicativeExpr()
   * @generated
   */
  EReference getMultiplicativeExpr_Right();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.annex.dmpl.dmpl.IdExpr <em>Id Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Id Expr</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.IdExpr
   * @generated
   */
  EClass getIdExpr();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.annex.dmpl.dmpl.IntExpr <em>Int Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int Expr</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.IntExpr
   * @generated
   */
  EClass getIntExpr();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.annex.dmpl.dmpl.IntExpr#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.IntExpr#getValue()
   * @see #getIntExpr()
   * @generated
   */
  EAttribute getIntExpr_Value();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.annex.dmpl.dmpl.DoubleExpr <em>Double Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Double Expr</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.DoubleExpr
   * @generated
   */
  EClass getDoubleExpr();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.annex.dmpl.dmpl.DoubleExpr#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.DoubleExpr#getValue()
   * @see #getDoubleExpr()
   * @generated
   */
  EAttribute getDoubleExpr_Value();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.annex.dmpl.dmpl.StringExpr <em>String Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Expr</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.StringExpr
   * @generated
   */
  EClass getStringExpr();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.annex.dmpl.dmpl.StringExpr#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.StringExpr#getValue()
   * @see #getStringExpr()
   * @generated
   */
  EAttribute getStringExpr_Value();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.annex.dmpl.dmpl.NodeNumExpr <em>Node Num Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node Num Expr</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.NodeNumExpr
   * @generated
   */
  EClass getNodeNumExpr();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.annex.dmpl.dmpl.UnaryExpr <em>Unary Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unary Expr</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.UnaryExpr
   * @generated
   */
  EClass getUnaryExpr();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.annex.dmpl.dmpl.UnaryExpr#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.UnaryExpr#getOperator()
   * @see #getUnaryExpr()
   * @generated
   */
  EAttribute getUnaryExpr_Operator();

  /**
   * Returns the meta object for the containment reference '{@link edu.cmu.sei.annex.dmpl.dmpl.UnaryExpr#getOperand <em>Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operand</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.UnaryExpr#getOperand()
   * @see #getUnaryExpr()
   * @generated
   */
  EReference getUnaryExpr_Operand();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.annex.dmpl.dmpl.BuiltInExpr <em>Built In Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Built In Expr</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.BuiltInExpr
   * @generated
   */
  EClass getBuiltInExpr();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.annex.dmpl.dmpl.BuiltInExpr#getFunction <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Function</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.BuiltInExpr#getFunction()
   * @see #getBuiltInExpr()
   * @generated
   */
  EAttribute getBuiltInExpr_Function();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.annex.dmpl.dmpl.BuiltInExpr#getFirstArg <em>First Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>First Arg</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.BuiltInExpr#getFirstArg()
   * @see #getBuiltInExpr()
   * @generated
   */
  EAttribute getBuiltInExpr_FirstArg();

  /**
   * Returns the meta object for the containment reference '{@link edu.cmu.sei.annex.dmpl.dmpl.BuiltInExpr#getSecondArg <em>Second Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Second Arg</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.BuiltInExpr#getSecondArg()
   * @see #getBuiltInExpr()
   * @generated
   */
  EReference getBuiltInExpr_SecondArg();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.annex.dmpl.dmpl.ParenthesizedExpr <em>Parenthesized Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parenthesized Expr</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.ParenthesizedExpr
   * @generated
   */
  EClass getParenthesizedExpr();

  /**
   * Returns the meta object for the containment reference '{@link edu.cmu.sei.annex.dmpl.dmpl.ParenthesizedExpr#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.ParenthesizedExpr#getExpr()
   * @see #getParenthesizedExpr()
   * @generated
   */
  EReference getParenthesizedExpr_Expr();

  /**
   * Returns the meta object for enum '{@link edu.cmu.sei.annex.dmpl.dmpl.SignEnum <em>Sign Enum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Sign Enum</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.SignEnum
   * @generated
   */
  EEnum getSignEnum();

  /**
   * Returns the meta object for enum '{@link edu.cmu.sei.annex.dmpl.dmpl.SimpTypeEnum <em>Simp Type Enum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Simp Type Enum</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.SimpTypeEnum
   * @generated
   */
  EEnum getSimpTypeEnum();

  /**
   * Returns the meta object for enum '{@link edu.cmu.sei.annex.dmpl.dmpl.SignedEnum <em>Signed Enum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Signed Enum</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.SignedEnum
   * @generated
   */
  EEnum getSignedEnum();

  /**
   * Returns the meta object for enum '{@link edu.cmu.sei.annex.dmpl.dmpl.SimpleStmtKeywordEnum <em>Simple Stmt Keyword Enum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Simple Stmt Keyword Enum</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.SimpleStmtKeywordEnum
   * @generated
   */
  EEnum getSimpleStmtKeywordEnum();

  /**
   * Returns the meta object for enum '{@link edu.cmu.sei.annex.dmpl.dmpl.ForAllFunctionEnum <em>For All Function Enum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>For All Function Enum</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.ForAllFunctionEnum
   * @generated
   */
  EEnum getForAllFunctionEnum();

  /**
   * Returns the meta object for enum '{@link edu.cmu.sei.annex.dmpl.dmpl.NodeVarScopeEnum <em>Node Var Scope Enum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Node Var Scope Enum</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.NodeVarScopeEnum
   * @generated
   */
  EEnum getNodeVarScopeEnum();

  /**
   * Returns the meta object for enum '{@link edu.cmu.sei.annex.dmpl.dmpl.EqualityOperator <em>Equality Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Equality Operator</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.EqualityOperator
   * @generated
   */
  EEnum getEqualityOperator();

  /**
   * Returns the meta object for enum '{@link edu.cmu.sei.annex.dmpl.dmpl.CompareOperator <em>Compare Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Compare Operator</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.CompareOperator
   * @generated
   */
  EEnum getCompareOperator();

  /**
   * Returns the meta object for enum '{@link edu.cmu.sei.annex.dmpl.dmpl.ShiftOperator <em>Shift Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Shift Operator</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.ShiftOperator
   * @generated
   */
  EEnum getShiftOperator();

  /**
   * Returns the meta object for enum '{@link edu.cmu.sei.annex.dmpl.dmpl.AdditiveOperator <em>Additive Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Additive Operator</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.AdditiveOperator
   * @generated
   */
  EEnum getAdditiveOperator();

  /**
   * Returns the meta object for enum '{@link edu.cmu.sei.annex.dmpl.dmpl.MultiplicativeOperator <em>Multiplicative Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Multiplicative Operator</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.MultiplicativeOperator
   * @generated
   */
  EEnum getMultiplicativeOperator();

  /**
   * Returns the meta object for enum '{@link edu.cmu.sei.annex.dmpl.dmpl.UnaryOperator <em>Unary Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Unary Operator</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.UnaryOperator
   * @generated
   */
  EEnum getUnaryOperator();

  /**
   * Returns the meta object for enum '{@link edu.cmu.sei.annex.dmpl.dmpl.BuiltInFunctionEnum <em>Built In Function Enum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Built In Function Enum</em>'.
   * @see edu.cmu.sei.annex.dmpl.dmpl.BuiltInFunctionEnum
   * @generated
   */
  EEnum getBuiltInFunctionEnum();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DmplFactory getDmplFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.ProgramImpl <em>Program</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.ProgramImpl
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getProgram()
     * @generated
     */
    EClass PROGRAM = eINSTANCE.getProgram();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__ELEMENTS = eINSTANCE.getProgram_Elements();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.DmplSubclauseImpl <em>Subclause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplSubclauseImpl
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getDmplSubclause()
     * @generated
     */
    EClass DMPL_SUBCLAUSE = eINSTANCE.getDmplSubclause();

    /**
     * The meta object literal for the '<em><b>Program</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DMPL_SUBCLAUSE__PROGRAM = eINSTANCE.getDmplSubclause_Program();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.ProgramElementImpl <em>Program Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.ProgramElementImpl
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getProgramElement()
     * @generated
     */
    EClass PROGRAM_ELEMENT = eINSTANCE.getProgramElement();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.ProgramElementNoTargetImpl <em>Program Element No Target</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.ProgramElementNoTargetImpl
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getProgramElementNoTarget()
     * @generated
     */
    EClass PROGRAM_ELEMENT_NO_TARGET = eINSTANCE.getProgramElementNoTarget();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.AttributableNodeOrProcedureImpl <em>Attributable Node Or Procedure</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.AttributableNodeOrProcedureImpl
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getAttributableNodeOrProcedure()
     * @generated
     */
    EClass ATTRIBUTABLE_NODE_OR_PROCEDURE = eINSTANCE.getAttributableNodeOrProcedure();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTABLE_NODE_OR_PROCEDURE__NAME = eINSTANCE.getAttributableNodeOrProcedure_Name();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.NumberConstImpl <em>Number Const</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.NumberConstImpl
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getNumberConst()
     * @generated
     */
    EClass NUMBER_CONST = eINSTANCE.getNumberConst();

    /**
     * The meta object literal for the '<em><b>Sign</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUMBER_CONST__SIGN = eINSTANCE.getNumberConst_Sign();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.DoubleConstImpl <em>Double Const</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DoubleConstImpl
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getDoubleConst()
     * @generated
     */
    EClass DOUBLE_CONST = eINSTANCE.getDoubleConst();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOUBLE_CONST__VALUE = eINSTANCE.getDoubleConst_Value();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.SpecificationImpl <em>Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.SpecificationImpl
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getSpecification()
     * @generated
     */
    EClass SPECIFICATION = eINSTANCE.getSpecification();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPECIFICATION__NAME = eINSTANCE.getSpecification_Name();

    /**
     * The meta object literal for the '<em><b>Function</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPECIFICATION__FUNCTION = eINSTANCE.getSpecification_Function();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.NodeBodyElementImpl <em>Node Body Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.NodeBodyElementImpl
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getNodeBodyElement()
     * @generated
     */
    EClass NODE_BODY_ELEMENT = eINSTANCE.getNodeBodyElement();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.AttributableElementImpl <em>Attributable Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.AttributableElementImpl
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getAttributableElement()
     * @generated
     */
    EClass ATTRIBUTABLE_ELEMENT = eINSTANCE.getAttributableElement();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.RoleBodyElementImpl <em>Role Body Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.RoleBodyElementImpl
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getRoleBodyElement()
     * @generated
     */
    EClass ROLE_BODY_ELEMENT = eINSTANCE.getRoleBodyElement();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.AttributableNoRoleElementImpl <em>Attributable No Role Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.AttributableNoRoleElementImpl
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getAttributableNoRoleElement()
     * @generated
     */
    EClass ATTRIBUTABLE_NO_ROLE_ELEMENT = eINSTANCE.getAttributableNoRoleElement();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.VarBlockImpl <em>Var Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.VarBlockImpl
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getVarBlock()
     * @generated
     */
    EClass VAR_BLOCK = eINSTANCE.getVarBlock();

    /**
     * The meta object literal for the '<em><b>Override</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VAR_BLOCK__OVERRIDE = eINSTANCE.getVarBlock_Override();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VAR_BLOCK__VAR = eINSTANCE.getVarBlock_Var();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.RecordBlockImpl <em>Record Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.RecordBlockImpl
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getRecordBlock()
     * @generated
     */
    EClass RECORD_BLOCK = eINSTANCE.getRecordBlock();

    /**
     * The meta object literal for the '<em><b>Override</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RECORD_BLOCK__OVERRIDE = eINSTANCE.getRecordBlock_Override();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RECORD_BLOCK__NAME = eINSTANCE.getRecordBlock_Name();

    /**
     * The meta object literal for the '<em><b>Vars</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RECORD_BLOCK__VARS = eINSTANCE.getRecordBlock_Vars();

    /**
     * The meta object literal for the '<em><b>Equals Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RECORD_BLOCK__EQUALS_BODY = eINSTANCE.getRecordBlock_EqualsBody();

    /**
     * The meta object literal for the '<em><b>Complement Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RECORD_BLOCK__COMPLEMENT_BODY = eINSTANCE.getRecordBlock_ComplementBody();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.NodeVarInitImpl <em>Node Var Init</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.NodeVarInitImpl
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getNodeVarInit()
     * @generated
     */
    EClass NODE_VAR_INIT = eINSTANCE.getNodeVarInit();

    /**
     * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE_VAR_INIT__SCOPE = eINSTANCE.getNodeVarInit_Scope();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_VAR_INIT__VAR = eINSTANCE.getNodeVarInit_Var();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.VarInitImpl <em>Var Init</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.VarInitImpl
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getVarInit()
     * @generated
     */
    EClass VAR_INIT = eINSTANCE.getVarInit();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VAR_INIT__TYPE = eINSTANCE.getVarInit_Type();

    /**
     * The meta object literal for the '<em><b>Var Asgns</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VAR_INIT__VAR_ASGNS = eINSTANCE.getVarInit_VarAsgns();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.VarAsgnImpl <em>Var Asgn</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.VarAsgnImpl
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getVarAsgn()
     * @generated
     */
    EClass VAR_ASGN = eINSTANCE.getVarAsgn();

    /**
     * The meta object literal for the '<em><b>Input</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VAR_ASGN__INPUT = eINSTANCE.getVarAsgn_Input();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VAR_ASGN__VAR = eINSTANCE.getVarAsgn_Var();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.VarImpl <em>Var</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.VarImpl
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getVar()
     * @generated
     */
    EClass VAR = eINSTANCE.getVar();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VAR__NAME = eINSTANCE.getVar_Name();

    /**
     * The meta object literal for the '<em><b>Dimensions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VAR__DIMENSIONS = eINSTANCE.getVar_Dimensions();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.DimensionImpl <em>Dimension</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DimensionImpl
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getDimension()
     * @generated
     */
    EClass DIMENSION = eINSTANCE.getDimension();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.TypeImpl
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '<em><b>Signed</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__SIGNED = eINSTANCE.getType_Signed();

    /**
     * The meta object literal for the '<em><b>Simp Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__SIMP_TYPE = eINSTANCE.getType_SimpType();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.ProcedureImpl <em>Procedure</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.ProcedureImpl
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getProcedure()
     * @generated
     */
    EClass PROCEDURE = eINSTANCE.getProcedure();

    /**
     * The meta object literal for the '<em><b>Override</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROCEDURE__OVERRIDE = eINSTANCE.getProcedure_Override();

    /**
     * The meta object literal for the '<em><b>Extern</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROCEDURE__EXTERN = eINSTANCE.getProcedure_Extern();

    /**
     * The meta object literal for the '<em><b>Pure</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROCEDURE__PURE = eINSTANCE.getProcedure_Pure();

    /**
     * The meta object literal for the '<em><b>Fn Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCEDURE__FN_BODY = eINSTANCE.getProcedure_FnBody();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.FnBodyImpl <em>Fn Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.FnBodyImpl
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getFnBody()
     * @generated
     */
    EClass FN_BODY = eINSTANCE.getFnBody();

    /**
     * The meta object literal for the '<em><b>Var Inits</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FN_BODY__VAR_INITS = eINSTANCE.getFnBody_VarInits();

    /**
     * The meta object literal for the '<em><b>Stmts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FN_BODY__STMTS = eINSTANCE.getFnBody_Stmts();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.AttrImpl <em>Attr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.AttrImpl
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getAttr()
     * @generated
     */
    EClass ATTR = eINSTANCE.getAttr();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTR__NAME = eINSTANCE.getAttr_Name();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTR__PARAMS = eINSTANCE.getAttr_Params();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.ParamImpl <em>Param</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.ParamImpl
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getParam()
     * @generated
     */
    EClass PARAM = eINSTANCE.getParam();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAM__TYPE = eINSTANCE.getParam_Type();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAM__VAR = eINSTANCE.getParam_Var();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.StmtImpl <em>Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.StmtImpl
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getStmt()
     * @generated
     */
    EClass STMT = eINSTANCE.getStmt();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.AssignmentOrIncrementStmtImpl <em>Assignment Or Increment Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.AssignmentOrIncrementStmtImpl
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getAssignmentOrIncrementStmt()
     * @generated
     */
    EClass ASSIGNMENT_OR_INCREMENT_STMT = eINSTANCE.getAssignmentOrIncrementStmt();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.IncrementStmtImpl <em>Increment Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.IncrementStmtImpl
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getIncrementStmt()
     * @generated
     */
    EClass INCREMENT_STMT = eINSTANCE.getIncrementStmt();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INCREMENT_STMT__VAR = eINSTANCE.getIncrementStmt_Var();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.InitAssignmentStmtImpl <em>Init Assignment Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.InitAssignmentStmtImpl
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getInitAssignmentStmt()
     * @generated
     */
    EClass INIT_ASSIGNMENT_STMT = eINSTANCE.getInitAssignmentStmt();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INIT_ASSIGNMENT_STMT__TYPE = eINSTANCE.getInitAssignmentStmt_Type();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INIT_ASSIGNMENT_STMT__VARIABLE = eINSTANCE.getInitAssignmentStmt_Variable();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INIT_ASSIGNMENT_STMT__VALUE = eINSTANCE.getInitAssignmentStmt_Value();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.AssignmentStmtImpl <em>Assignment Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.AssignmentStmtImpl
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getAssignmentStmt()
     * @generated
     */
    EClass ASSIGNMENT_STMT = eINSTANCE.getAssignmentStmt();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNMENT_STMT__VARIABLE = eINSTANCE.getAssignmentStmt_Variable();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNMENT_STMT__VALUE = eINSTANCE.getAssignmentStmt_Value();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.LValImpl <em>LVal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.LValImpl
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getLVal()
     * @generated
     */
    EClass LVAL = eINSTANCE.getLVal();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LVAL__NAME = eINSTANCE.getLVal_Name();

    /**
     * The meta object literal for the '<em><b>Indices</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LVAL__INDICES = eINSTANCE.getLVal_Indices();

    /**
     * The meta object literal for the '<em><b>At</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LVAL__AT = eINSTANCE.getLVal_At();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.ExprImpl <em>Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.ExprImpl
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getExpr()
     * @generated
     */
    EClass EXPR = eINSTANCE.getExpr();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.CallExprImpl <em>Call Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.CallExprImpl
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getCallExpr()
     * @generated
     */
    EClass CALL_EXPR = eINSTANCE.getCallExpr();

    /**
     * The meta object literal for the '<em><b>Namespaces</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CALL_EXPR__NAMESPACES = eINSTANCE.getCallExpr_Namespaces();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CALL_EXPR__NAME = eINSTANCE.getCallExpr_Name();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CALL_EXPR__ARGS = eINSTANCE.getCallExpr_Args();

    /**
     * The meta object literal for the '<em><b>At</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CALL_EXPR__AT = eINSTANCE.getCallExpr_At();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.TargetImpl <em>Target</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.TargetImpl
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getTarget()
     * @generated
     */
    EClass TARGET = eINSTANCE.getTarget();

    /**
     * The meta object literal for the '<em><b>Names</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TARGET__NAMES = eINSTANCE.getTarget_Names();

    /**
     * The meta object literal for the '<em><b>Thunk</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TARGET__THUNK = eINSTANCE.getTarget_Thunk();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.IncludelineImpl <em>Includeline</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.IncludelineImpl
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getIncludeline()
     * @generated
     */
    EClass INCLUDELINE = eINSTANCE.getIncludeline();

    /**
     * The meta object literal for the '<em><b>Line</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INCLUDELINE__LINE = eINSTANCE.getIncludeline_Line();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.DefinelineImpl <em>Defineline</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DefinelineImpl
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getDefineline()
     * @generated
     */
    EClass DEFINELINE = eINSTANCE.getDefineline();

    /**
     * The meta object literal for the '<em><b>Line</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEFINELINE__LINE = eINSTANCE.getDefineline_Line();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.ConstantImpl <em>Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.ConstantImpl
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getConstant()
     * @generated
     */
    EClass CONSTANT = eINSTANCE.getConstant();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTANT__NAME = eINSTANCE.getConstant_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTANT__VALUE = eINSTANCE.getConstant_Value();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.AttributableProgramElementImpl <em>Attributable Program Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.AttributableProgramElementImpl
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getAttributableProgramElement()
     * @generated
     */
    EClass ATTRIBUTABLE_PROGRAM_ELEMENT = eINSTANCE.getAttributableProgramElement();

    /**
     * The meta object literal for the '<em><b>Attrs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTABLE_PROGRAM_ELEMENT__ATTRS = eINSTANCE.getAttributableProgramElement_Attrs();

    /**
     * The meta object literal for the '<em><b>Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTABLE_PROGRAM_ELEMENT__ELEMENT = eINSTANCE.getAttributableProgramElement_Element();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.NodeImpl <em>Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.NodeImpl
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getNode()
     * @generated
     */
    EClass NODE = eINSTANCE.getNode();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE__ELEMENTS = eINSTANCE.getNode_Elements();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.IntConstImpl <em>Int Const</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.IntConstImpl
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getIntConst()
     * @generated
     */
    EClass INT_CONST = eINSTANCE.getIntConst();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INT_CONST__VALUE = eINSTANCE.getIntConst_Value();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.AtEndSpecImpl <em>At End Spec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.AtEndSpecImpl
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getAtEndSpec()
     * @generated
     */
    EClass AT_END_SPEC = eINSTANCE.getAtEndSpec();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.AtLeastSpecImpl <em>At Least Spec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.AtLeastSpecImpl
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getAtLeastSpec()
     * @generated
     */
    EClass AT_LEAST_SPEC = eINSTANCE.getAtLeastSpec();

    /**
     * The meta object literal for the '<em><b>Threshold</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AT_LEAST_SPEC__THRESHOLD = eINSTANCE.getAtLeastSpec_Threshold();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.RequireSpecImpl <em>Require Spec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.RequireSpecImpl
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getRequireSpec()
     * @generated
     */
    EClass REQUIRE_SPEC = eINSTANCE.getRequireSpec();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.AttributableImpl <em>Attributable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.AttributableImpl
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getAttributable()
     * @generated
     */
    EClass ATTRIBUTABLE = eINSTANCE.getAttributable();

    /**
     * The meta object literal for the '<em><b>Attrs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTABLE__ATTRS = eINSTANCE.getAttributable_Attrs();

    /**
     * The meta object literal for the '<em><b>Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTABLE__ELEMENT = eINSTANCE.getAttributable_Element();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.SimpleRoleImpl <em>Simple Role</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.SimpleRoleImpl
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getSimpleRole()
     * @generated
     */
    EClass SIMPLE_ROLE = eINSTANCE.getSimpleRole();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_ROLE__NAME = eINSTANCE.getSimpleRole_Name();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_ROLE__ELEMENTS = eINSTANCE.getSimpleRole_Elements();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.IdRoleImpl <em>Id Role</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.IdRoleImpl
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getIdRole()
     * @generated
     */
    EClass ID_ROLE = eINSTANCE.getIdRole();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ID_ROLE__NAME = eINSTANCE.getIdRole_Name();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ID_ROLE__ID = eINSTANCE.getIdRole_Id();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ID_ROLE__ELEMENTS = eINSTANCE.getIdRole_Elements();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.AttributableNoRoleImpl <em>Attributable No Role</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.AttributableNoRoleImpl
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getAttributableNoRole()
     * @generated
     */
    EClass ATTRIBUTABLE_NO_ROLE = eINSTANCE.getAttributableNoRole();

    /**
     * The meta object literal for the '<em><b>Attrs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTABLE_NO_ROLE__ATTRS = eINSTANCE.getAttributableNoRole_Attrs();

    /**
     * The meta object literal for the '<em><b>Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTABLE_NO_ROLE__ELEMENT = eINSTANCE.getAttributableNoRole_Element();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.ExprVarAsgnImpl <em>Expr Var Asgn</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.ExprVarAsgnImpl
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getExprVarAsgn()
     * @generated
     */
    EClass EXPR_VAR_ASGN = eINSTANCE.getExprVarAsgn();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_VAR_ASGN__EXPR = eINSTANCE.getExprVarAsgn_Expr();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.FnVarAsgnImpl <em>Fn Var Asgn</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.FnVarAsgnImpl
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getFnVarAsgn()
     * @generated
     */
    EClass FN_VAR_ASGN = eINSTANCE.getFnVarAsgn();

    /**
     * The meta object literal for the '<em><b>Fn Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FN_VAR_ASGN__FN_BODY = eINSTANCE.getFnVarAsgn_FnBody();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.IntDimensionImpl <em>Int Dimension</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.IntDimensionImpl
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getIntDimension()
     * @generated
     */
    EClass INT_DIMENSION = eINSTANCE.getIntDimension();

    /**
     * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INT_DIMENSION__INDEX = eINSTANCE.getIntDimension_Index();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.NodeNumDimensionImpl <em>Node Num Dimension</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.NodeNumDimensionImpl
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getNodeNumDimension()
     * @generated
     */
    EClass NODE_NUM_DIMENSION = eINSTANCE.getNodeNumDimension();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.IdDimensionImpl <em>Id Dimension</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.IdDimensionImpl
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getIdDimension()
     * @generated
     */
    EClass ID_DIMENSION = eINSTANCE.getIdDimension();

    /**
     * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ID_DIMENSION__INDEX = eINSTANCE.getIdDimension_Index();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.ThreadDeclarationImpl <em>Thread Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.ThreadDeclarationImpl
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getThreadDeclaration()
     * @generated
     */
    EClass THREAD_DECLARATION = eINSTANCE.getThreadDeclaration();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.FunctionDeclarationImpl <em>Function Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.FunctionDeclarationImpl
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getFunctionDeclaration()
     * @generated
     */
    EClass FUNCTION_DECLARATION = eINSTANCE.getFunctionDeclaration();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_DECLARATION__TYPE = eINSTANCE.getFunctionDeclaration_Type();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_DECLARATION__PARAMS = eINSTANCE.getFunctionDeclaration_Params();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.NestedStmtImpl <em>Nested Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.NestedStmtImpl
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getNestedStmt()
     * @generated
     */
    EClass NESTED_STMT = eINSTANCE.getNestedStmt();

    /**
     * The meta object literal for the '<em><b>Stmts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NESTED_STMT__STMTS = eINSTANCE.getNestedStmt_Stmts();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.WhileStmtImpl <em>While Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.WhileStmtImpl
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getWhileStmt()
     * @generated
     */
    EClass WHILE_STMT = eINSTANCE.getWhileStmt();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILE_STMT__CONDITION = eINSTANCE.getWhileStmt_Condition();

    /**
     * The meta object literal for the '<em><b>Stmt</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILE_STMT__STMT = eINSTANCE.getWhileStmt_Stmt();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.ForStmtImpl <em>For Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.ForStmtImpl
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getForStmt()
     * @generated
     */
    EClass FOR_STMT = eINSTANCE.getForStmt();

    /**
     * The meta object literal for the '<em><b>Inits</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_STMT__INITS = eINSTANCE.getForStmt_Inits();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_STMT__CONDITION = eINSTANCE.getForStmt_Condition();

    /**
     * The meta object literal for the '<em><b>Update</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_STMT__UPDATE = eINSTANCE.getForStmt_Update();

    /**
     * The meta object literal for the '<em><b>Stmt</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_STMT__STMT = eINSTANCE.getForStmt_Stmt();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.CondStmtImpl <em>Cond Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.CondStmtImpl
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getCondStmt()
     * @generated
     */
    EClass COND_STMT = eINSTANCE.getCondStmt();

    /**
     * The meta object literal for the '<em><b>Attrs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COND_STMT__ATTRS = eINSTANCE.getCondStmt_Attrs();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COND_STMT__CONDITION = eINSTANCE.getCondStmt_Condition();

    /**
     * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COND_STMT__THEN = eINSTANCE.getCondStmt_Then();

    /**
     * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COND_STMT__ELSE = eINSTANCE.getCondStmt_Else();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.SimpleStmtImpl <em>Simple Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.SimpleStmtImpl
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getSimpleStmt()
     * @generated
     */
    EClass SIMPLE_STMT = eINSTANCE.getSimpleStmt();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_STMT__NAME = eINSTANCE.getSimpleStmt_Name();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.ReturnValueStmtImpl <em>Return Value Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.ReturnValueStmtImpl
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getReturnValueStmt()
     * @generated
     */
    EClass RETURN_VALUE_STMT = eINSTANCE.getReturnValueStmt();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RETURN_VALUE_STMT__VALUE = eINSTANCE.getReturnValueStmt_Value();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.ForAllStmtImpl <em>For All Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.ForAllStmtImpl
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getForAllStmt()
     * @generated
     */
    EClass FOR_ALL_STMT = eINSTANCE.getForAllStmt();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FOR_ALL_STMT__NAME = eINSTANCE.getForAllStmt_Name();

    /**
     * The meta object literal for the '<em><b>Node</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FOR_ALL_STMT__NODE = eINSTANCE.getForAllStmt_Node();

    /**
     * The meta object literal for the '<em><b>Stmt</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_ALL_STMT__STMT = eINSTANCE.getForAllStmt_Stmt();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.FadnpStmtImpl <em>Fadnp Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.FadnpStmtImpl
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getFadnpStmt()
     * @generated
     */
    EClass FADNP_STMT = eINSTANCE.getFadnpStmt();

    /**
     * The meta object literal for the '<em><b>Node1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FADNP_STMT__NODE1 = eINSTANCE.getFadnpStmt_Node1();

    /**
     * The meta object literal for the '<em><b>Node2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FADNP_STMT__NODE2 = eINSTANCE.getFadnpStmt_Node2();

    /**
     * The meta object literal for the '<em><b>Stmt</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FADNP_STMT__STMT = eINSTANCE.getFadnpStmt_Stmt();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.TernaryExprImpl <em>Ternary Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.TernaryExprImpl
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getTernaryExpr()
     * @generated
     */
    EClass TERNARY_EXPR = eINSTANCE.getTernaryExpr();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TERNARY_EXPR__CONDITION = eINSTANCE.getTernaryExpr_Condition();

    /**
     * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TERNARY_EXPR__THEN = eINSTANCE.getTernaryExpr_Then();

    /**
     * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TERNARY_EXPR__ELSE = eINSTANCE.getTernaryExpr_Else();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.OrExprImpl <em>Or Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.OrExprImpl
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getOrExpr()
     * @generated
     */
    EClass OR_EXPR = eINSTANCE.getOrExpr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR_EXPR__LEFT = eINSTANCE.getOrExpr_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR_EXPR__RIGHT = eINSTANCE.getOrExpr_Right();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.AndExprImpl <em>And Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.AndExprImpl
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getAndExpr()
     * @generated
     */
    EClass AND_EXPR = eINSTANCE.getAndExpr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND_EXPR__LEFT = eINSTANCE.getAndExpr_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND_EXPR__RIGHT = eINSTANCE.getAndExpr_Right();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.BitwiseOrExprImpl <em>Bitwise Or Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.BitwiseOrExprImpl
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getBitwiseOrExpr()
     * @generated
     */
    EClass BITWISE_OR_EXPR = eINSTANCE.getBitwiseOrExpr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BITWISE_OR_EXPR__LEFT = eINSTANCE.getBitwiseOrExpr_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BITWISE_OR_EXPR__RIGHT = eINSTANCE.getBitwiseOrExpr_Right();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.XorExprImpl <em>Xor Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.XorExprImpl
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getXorExpr()
     * @generated
     */
    EClass XOR_EXPR = eINSTANCE.getXorExpr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XOR_EXPR__LEFT = eINSTANCE.getXorExpr_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XOR_EXPR__RIGHT = eINSTANCE.getXorExpr_Right();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.BitwiseAndExprImpl <em>Bitwise And Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.BitwiseAndExprImpl
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getBitwiseAndExpr()
     * @generated
     */
    EClass BITWISE_AND_EXPR = eINSTANCE.getBitwiseAndExpr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BITWISE_AND_EXPR__LEFT = eINSTANCE.getBitwiseAndExpr_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BITWISE_AND_EXPR__RIGHT = eINSTANCE.getBitwiseAndExpr_Right();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.EqualityExprImpl <em>Equality Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.EqualityExprImpl
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getEqualityExpr()
     * @generated
     */
    EClass EQUALITY_EXPR = eINSTANCE.getEqualityExpr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EQUALITY_EXPR__LEFT = eINSTANCE.getEqualityExpr_Left();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EQUALITY_EXPR__OPERATOR = eINSTANCE.getEqualityExpr_Operator();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EQUALITY_EXPR__RIGHT = eINSTANCE.getEqualityExpr_Right();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.CompareExprImpl <em>Compare Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.CompareExprImpl
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getCompareExpr()
     * @generated
     */
    EClass COMPARE_EXPR = eINSTANCE.getCompareExpr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPARE_EXPR__LEFT = eINSTANCE.getCompareExpr_Left();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPARE_EXPR__OPERATOR = eINSTANCE.getCompareExpr_Operator();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPARE_EXPR__RIGHT = eINSTANCE.getCompareExpr_Right();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.ShiftExprImpl <em>Shift Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.ShiftExprImpl
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getShiftExpr()
     * @generated
     */
    EClass SHIFT_EXPR = eINSTANCE.getShiftExpr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SHIFT_EXPR__LEFT = eINSTANCE.getShiftExpr_Left();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SHIFT_EXPR__OPERATOR = eINSTANCE.getShiftExpr_Operator();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SHIFT_EXPR__RIGHT = eINSTANCE.getShiftExpr_Right();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.AdditiveExprImpl <em>Additive Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.AdditiveExprImpl
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getAdditiveExpr()
     * @generated
     */
    EClass ADDITIVE_EXPR = eINSTANCE.getAdditiveExpr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADDITIVE_EXPR__LEFT = eINSTANCE.getAdditiveExpr_Left();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADDITIVE_EXPR__OPERATOR = eINSTANCE.getAdditiveExpr_Operator();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADDITIVE_EXPR__RIGHT = eINSTANCE.getAdditiveExpr_Right();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.MultiplicativeExprImpl <em>Multiplicative Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.MultiplicativeExprImpl
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getMultiplicativeExpr()
     * @generated
     */
    EClass MULTIPLICATIVE_EXPR = eINSTANCE.getMultiplicativeExpr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTIPLICATIVE_EXPR__LEFT = eINSTANCE.getMultiplicativeExpr_Left();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MULTIPLICATIVE_EXPR__OPERATOR = eINSTANCE.getMultiplicativeExpr_Operator();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTIPLICATIVE_EXPR__RIGHT = eINSTANCE.getMultiplicativeExpr_Right();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.IdExprImpl <em>Id Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.IdExprImpl
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getIdExpr()
     * @generated
     */
    EClass ID_EXPR = eINSTANCE.getIdExpr();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.IntExprImpl <em>Int Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.IntExprImpl
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getIntExpr()
     * @generated
     */
    EClass INT_EXPR = eINSTANCE.getIntExpr();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INT_EXPR__VALUE = eINSTANCE.getIntExpr_Value();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.DoubleExprImpl <em>Double Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DoubleExprImpl
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getDoubleExpr()
     * @generated
     */
    EClass DOUBLE_EXPR = eINSTANCE.getDoubleExpr();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOUBLE_EXPR__VALUE = eINSTANCE.getDoubleExpr_Value();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.StringExprImpl <em>String Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.StringExprImpl
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getStringExpr()
     * @generated
     */
    EClass STRING_EXPR = eINSTANCE.getStringExpr();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_EXPR__VALUE = eINSTANCE.getStringExpr_Value();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.NodeNumExprImpl <em>Node Num Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.NodeNumExprImpl
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getNodeNumExpr()
     * @generated
     */
    EClass NODE_NUM_EXPR = eINSTANCE.getNodeNumExpr();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.UnaryExprImpl <em>Unary Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.UnaryExprImpl
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getUnaryExpr()
     * @generated
     */
    EClass UNARY_EXPR = eINSTANCE.getUnaryExpr();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNARY_EXPR__OPERATOR = eINSTANCE.getUnaryExpr_Operator();

    /**
     * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNARY_EXPR__OPERAND = eINSTANCE.getUnaryExpr_Operand();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.BuiltInExprImpl <em>Built In Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.BuiltInExprImpl
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getBuiltInExpr()
     * @generated
     */
    EClass BUILT_IN_EXPR = eINSTANCE.getBuiltInExpr();

    /**
     * The meta object literal for the '<em><b>Function</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUILT_IN_EXPR__FUNCTION = eINSTANCE.getBuiltInExpr_Function();

    /**
     * The meta object literal for the '<em><b>First Arg</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUILT_IN_EXPR__FIRST_ARG = eINSTANCE.getBuiltInExpr_FirstArg();

    /**
     * The meta object literal for the '<em><b>Second Arg</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUILT_IN_EXPR__SECOND_ARG = eINSTANCE.getBuiltInExpr_SecondArg();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.impl.ParenthesizedExprImpl <em>Parenthesized Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.ParenthesizedExprImpl
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getParenthesizedExpr()
     * @generated
     */
    EClass PARENTHESIZED_EXPR = eINSTANCE.getParenthesizedExpr();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARENTHESIZED_EXPR__EXPR = eINSTANCE.getParenthesizedExpr_Expr();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.SignEnum <em>Sign Enum</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.SignEnum
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getSignEnum()
     * @generated
     */
    EEnum SIGN_ENUM = eINSTANCE.getSignEnum();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.SimpTypeEnum <em>Simp Type Enum</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.SimpTypeEnum
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getSimpTypeEnum()
     * @generated
     */
    EEnum SIMP_TYPE_ENUM = eINSTANCE.getSimpTypeEnum();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.SignedEnum <em>Signed Enum</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.SignedEnum
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getSignedEnum()
     * @generated
     */
    EEnum SIGNED_ENUM = eINSTANCE.getSignedEnum();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.SimpleStmtKeywordEnum <em>Simple Stmt Keyword Enum</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.SimpleStmtKeywordEnum
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getSimpleStmtKeywordEnum()
     * @generated
     */
    EEnum SIMPLE_STMT_KEYWORD_ENUM = eINSTANCE.getSimpleStmtKeywordEnum();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.ForAllFunctionEnum <em>For All Function Enum</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.ForAllFunctionEnum
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getForAllFunctionEnum()
     * @generated
     */
    EEnum FOR_ALL_FUNCTION_ENUM = eINSTANCE.getForAllFunctionEnum();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.NodeVarScopeEnum <em>Node Var Scope Enum</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.NodeVarScopeEnum
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getNodeVarScopeEnum()
     * @generated
     */
    EEnum NODE_VAR_SCOPE_ENUM = eINSTANCE.getNodeVarScopeEnum();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.EqualityOperator <em>Equality Operator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.EqualityOperator
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getEqualityOperator()
     * @generated
     */
    EEnum EQUALITY_OPERATOR = eINSTANCE.getEqualityOperator();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.CompareOperator <em>Compare Operator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.CompareOperator
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getCompareOperator()
     * @generated
     */
    EEnum COMPARE_OPERATOR = eINSTANCE.getCompareOperator();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.ShiftOperator <em>Shift Operator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.ShiftOperator
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getShiftOperator()
     * @generated
     */
    EEnum SHIFT_OPERATOR = eINSTANCE.getShiftOperator();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.AdditiveOperator <em>Additive Operator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.AdditiveOperator
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getAdditiveOperator()
     * @generated
     */
    EEnum ADDITIVE_OPERATOR = eINSTANCE.getAdditiveOperator();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.MultiplicativeOperator <em>Multiplicative Operator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.MultiplicativeOperator
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getMultiplicativeOperator()
     * @generated
     */
    EEnum MULTIPLICATIVE_OPERATOR = eINSTANCE.getMultiplicativeOperator();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.UnaryOperator <em>Unary Operator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.UnaryOperator
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getUnaryOperator()
     * @generated
     */
    EEnum UNARY_OPERATOR = eINSTANCE.getUnaryOperator();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.annex.dmpl.dmpl.BuiltInFunctionEnum <em>Built In Function Enum</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.annex.dmpl.dmpl.BuiltInFunctionEnum
     * @see edu.cmu.sei.annex.dmpl.dmpl.impl.DmplPackageImpl#getBuiltInFunctionEnum()
     * @generated
     */
    EEnum BUILT_IN_FUNCTION_ENUM = eINSTANCE.getBuiltInFunctionEnum();

  }

} //DmplPackage
