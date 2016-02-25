package edu.cmu.sei.annex.dmpl.tests

import com.google.inject.Inject
import edu.cmu.sei.annex.dmpl.DmplInjectorProvider
import edu.cmu.sei.annex.dmpl.dmpl.BuiltInExpr
import edu.cmu.sei.annex.dmpl.dmpl.BuiltInFunctionEnum
import edu.cmu.sei.annex.dmpl.dmpl.CallExpr
import edu.cmu.sei.annex.dmpl.dmpl.Constant
import edu.cmu.sei.annex.dmpl.dmpl.DoubleConst
import edu.cmu.sei.annex.dmpl.dmpl.DoubleExpr
import edu.cmu.sei.annex.dmpl.dmpl.FnPrototypeDeclaration
import edu.cmu.sei.annex.dmpl.dmpl.IdDimension
import edu.cmu.sei.annex.dmpl.dmpl.IdExpr
import edu.cmu.sei.annex.dmpl.dmpl.IntConst
import edu.cmu.sei.annex.dmpl.dmpl.IntDimension
import edu.cmu.sei.annex.dmpl.dmpl.IntExpr
import edu.cmu.sei.annex.dmpl.dmpl.LVal
import edu.cmu.sei.annex.dmpl.dmpl.NodeNumDimension
import edu.cmu.sei.annex.dmpl.dmpl.NodeNumExpr
import edu.cmu.sei.annex.dmpl.dmpl.Procedure
import edu.cmu.sei.annex.dmpl.dmpl.Program
import edu.cmu.sei.annex.dmpl.dmpl.SignEnum
import edu.cmu.sei.annex.dmpl.dmpl.SignedEnum
import edu.cmu.sei.annex.dmpl.dmpl.SimpTypeEnum
import edu.cmu.sei.annex.dmpl.dmpl.ThreadDeclaration
import edu.cmu.sei.annex.dmpl.dmpl.UnaryExpr
import edu.cmu.sei.annex.dmpl.dmpl.UnaryOperator
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

import static extension org.junit.Assert.assertEquals
import static extension org.junit.Assert.assertFalse
import static extension org.junit.Assert.assertNull
import static extension org.junit.Assert.assertTrue

@RunWith(XtextRunner)
@InjectWith(DmplInjectorProvider)
class ParserTest {
	@Inject
	extension ParseHelper<Program>
	@Inject
	extension ValidationTestHelper
	
	@Test
	def void testEmptyProgram() {
		"".parse.programElements.empty.assertTrue
	}
	
	@Test
	def void testConst() {
		'''
			const c1 = 1;
			CONST c2 = +2;
			CONST c3 = -3;
			const c4 = 4.5;
			const c5 = +6.7;
			const c6 = -8.9;
			const c7 = NAN;
			const c8 = +NAN;
			const c9 = -NAN;
		'''.parse => [
			assertNoIssues
			9.assertEquals(programElements.size)
			programElements.get(0) as Constant => [
				"c1".assertEquals(name)
				value as IntConst => [
					SignEnum.UNSET.assertEquals(sign)
					1.assertEquals(value)
				]
			]
			programElements.get(1) as Constant => [
				"c2".assertEquals(name)
				value as IntConst => [
					SignEnum.PLUS.assertEquals(sign)
					2.assertEquals(value)
				]
			]
			programElements.get(2) as Constant => [
				"c3".assertEquals(name)
				value as IntConst => [
					SignEnum.MINUS.assertEquals(sign)
					3.assertEquals(value)
				]
			]
			programElements.get(3) as Constant => [
				"c4".assertEquals(name)
				value as DoubleConst => [
					SignEnum.UNSET.assertEquals(sign)
					4.5.assertEquals(value, 0)
				]
			]
			programElements.get(4) as Constant => [
				"c5".assertEquals(name)
				value as DoubleConst => [
					SignEnum.PLUS.assertEquals(sign)
					6.7.assertEquals(value, 0)
				]
			]
			programElements.get(5) as Constant => [
				"c6".assertEquals(name)
				value as DoubleConst => [
					SignEnum.MINUS.assertEquals(sign)
					8.9.assertEquals(value, 0)
				]
			]
			programElements.get(6) as Constant => [
				"c7".assertEquals(name)
				value as DoubleConst => [
					SignEnum.UNSET.assertEquals(sign)
					Double.NaN.assertEquals(value, 0)
				]
			]
			programElements.get(7) as Constant => [
				"c8".assertEquals(name)
				value as DoubleConst => [
					SignEnum.PLUS.assertEquals(sign)
					Double.NaN.assertEquals(value, 0)
				]
			]
			programElements.get(8) as Constant => [
				"c9".assertEquals(name)
				value as DoubleConst => [
					SignEnum.MINUS.assertEquals(sign)
					Double.NaN.assertEquals(value, 0)
				]
			]
		]
	}
	
	@Test
	def void testFnPrototype() {
		'''
			thread t1;
			pure thread t2;
			extern thread t3;
			extern pure thread t4;
			PURE int f1();
			EXTERN int f2();
			EXTERN PURE int f3();
		'''.parse => [
			assertNoIssues
			7.assertEquals(programElements.size)
			(programElements.get(0) as Procedure).procedure.prototype as ThreadDeclaration => [
				"t1".assertEquals(name)
				pure.assertFalse
				extern.assertFalse
			]
			(programElements.get(1) as Procedure).procedure.prototype as ThreadDeclaration => [
				"t2".assertEquals(name)
				pure.assertTrue
				extern.assertFalse
			]
			(programElements.get(2) as Procedure).procedure.prototype as ThreadDeclaration => [
				"t3".assertEquals(name)
				pure.assertFalse
				extern.assertTrue
			]
			(programElements.get(3) as Procedure).procedure.prototype as ThreadDeclaration => [
				"t4".assertEquals(name)
				pure.assertTrue
				extern.assertTrue
			]
			(programElements.get(4) as Procedure).procedure.prototype as FnPrototypeDeclaration => [
				"f1".assertEquals(name)
				pure.assertTrue
				extern.assertFalse
				type => [
					SignedEnum.UNSET.assertEquals(signed)
					SimpTypeEnum.INT.assertEquals(simpType)
				]
			]
			(programElements.get(5) as Procedure).procedure.prototype as FnPrototypeDeclaration => [
				"f2".assertEquals(name)
				pure.assertFalse
				extern.assertTrue
				type => [
					SignedEnum.UNSET.assertEquals(signed)
					SimpTypeEnum.INT.assertEquals(simpType)
				]
			]
			(programElements.get(6) as Procedure).procedure.prototype as FnPrototypeDeclaration => [
				"f3".assertEquals(name)
				pure.assertTrue
				extern.assertTrue
				type => [
					SignedEnum.UNSET.assertEquals(signed)
					SimpTypeEnum.INT.assertEquals(simpType)
				]
			]
		]
	}
	
	@Test
	def void testType() {
		'''
			bool f1();
			_Bool f2();
			int f3();
			double f4();
			void f5();
			char f6();
			signed int f7();
			unsigned int f8();
		'''.parse => [
			assertNoIssues
			8.assertEquals(programElements.size)
			(programElements.get(0) as Procedure).procedure.prototype as FnPrototypeDeclaration => [
				"f1".assertEquals(name)
				type => [
					SignedEnum.UNSET.assertEquals(signed)
					SimpTypeEnum.BOOL.assertEquals(simpType)
				]
			]
			(programElements.get(1) as Procedure).procedure.prototype as FnPrototypeDeclaration => [
				"f2".assertEquals(name)
				type => [
					SignedEnum.UNSET.assertEquals(signed)
					SimpTypeEnum.BOOL.assertEquals(simpType)
				]
			]
			(programElements.get(2) as Procedure).procedure.prototype as FnPrototypeDeclaration => [
				"f3".assertEquals(name)
				type => [
					SignedEnum.UNSET.assertEquals(signed)
					SimpTypeEnum.INT.assertEquals(simpType)
				]
			]
			(programElements.get(3) as Procedure).procedure.prototype as FnPrototypeDeclaration => [
				"f4".assertEquals(name)
				type => [
					SignedEnum.UNSET.assertEquals(signed)
					SimpTypeEnum.DOUBLE.assertEquals(simpType)
				]
			]
			(programElements.get(4) as Procedure).procedure.prototype as FnPrototypeDeclaration => [
				"f5".assertEquals(name)
				type => [
					SignedEnum.UNSET.assertEquals(signed)
					SimpTypeEnum.VOID.assertEquals(simpType)
				]
			]
			(programElements.get(5) as Procedure).procedure.prototype as FnPrototypeDeclaration => [
				"f6".assertEquals(name)
				type => [
					SignedEnum.UNSET.assertEquals(signed)
					SimpTypeEnum.CHAR.assertEquals(simpType)
				]
			]
			(programElements.get(6) as Procedure).procedure.prototype as FnPrototypeDeclaration => [
				"f7".assertEquals(name)
				type => [
					SignedEnum.SIGNED.assertEquals(signed)
					SimpTypeEnum.INT.assertEquals(simpType)
				]
			]
			(programElements.get(7) as Procedure).procedure.prototype as FnPrototypeDeclaration => [
				"f8".assertEquals(name)
				type => [
					SignedEnum.UNSIGNED.assertEquals(signed)
					SimpTypeEnum.INT.assertEquals(simpType)
				]
			]
		]
	}
	
	@Test
	def void testParams() {
		'''
			int f1();
			int f2(int p1);
			int f3(int p1, int p2);
			int f4(int p1, int p2, int p3);
		'''.parse => [
			assertNoIssues
			4.assertEquals(programElements.size)
			(programElements.get(0) as Procedure).procedure.prototype as FnPrototypeDeclaration => [
				"f1".assertEquals(name)
				params.empty.assertTrue
			]
			(programElements.get(1) as Procedure).procedure.prototype as FnPrototypeDeclaration => [
				"f2".assertEquals(name)
				1.assertEquals(params.size)
				params.head => [
					type => [
						SignedEnum.UNSET.assertEquals(signed)
						SimpTypeEnum.INT.assertEquals(simpType)
					]
					"p1".assertEquals(^var.name)
				]
			]
			(programElements.get(2) as Procedure).procedure.prototype as FnPrototypeDeclaration => [
				"f3".assertEquals(name)
				2.assertEquals(params.size)
				params.get(0) => [
					type => [
						SignedEnum.UNSET.assertEquals(signed)
						SimpTypeEnum.INT.assertEquals(simpType)
					]
					"p1".assertEquals(^var.name)
				]
				params.get(1) => [
					type => [
						SignedEnum.UNSET.assertEquals(signed)
						SimpTypeEnum.INT.assertEquals(simpType)
					]
					"p2".assertEquals(^var.name)
				]
			]
			(programElements.get(3) as Procedure).procedure.prototype as FnPrototypeDeclaration => [
				"f4".assertEquals(name)
				3.assertEquals(params.size)
				params.get(0) => [
					type => [
						SignedEnum.UNSET.assertEquals(signed)
						SimpTypeEnum.INT.assertEquals(simpType)
					]
					"p1".assertEquals(^var.name)
				]
				params.get(1) => [
					type => [
						SignedEnum.UNSET.assertEquals(signed)
						SimpTypeEnum.INT.assertEquals(simpType)
					]
					"p2".assertEquals(^var.name)
				]
				params.get(2) => [
					type => [
						SignedEnum.UNSET.assertEquals(signed)
						SimpTypeEnum.INT.assertEquals(simpType)
					]
					"p3".assertEquals(^var.name)
				]
			]
		]
	}
	
	@Test
	def void testVar() {
		'''
			int f1(int p1, int p2[0], int p3[1][2], int p4[3][4][5]);
			int f2(int p1[0], int p2[#N], int p3[a]);
		'''.parse => [
			assertNoIssues
			2.assertEquals(programElements.size)
			(programElements.get(0) as Procedure).procedure.prototype as FnPrototypeDeclaration => [
				"f1".assertEquals(name)
				4.assertEquals(params.size)
				params.get(0).^var => [
					"p1".assertEquals(name)
					dimensions.empty.assertTrue
				]
				params.get(1).^var => [
					"p2".assertEquals(name)
					1.assertEquals(dimensions.size)
					0.assertEquals((dimensions.head as IntDimension).index)
				]
				params.get(2).^var => [
					"p3".assertEquals(name)
					2.assertEquals(dimensions.size)
					1.assertEquals((dimensions.get(0) as IntDimension).index)
					2.assertEquals((dimensions.get(1) as IntDimension).index)
				]
				params.get(3).^var => [
					"p4".assertEquals(name)
					3.assertEquals(dimensions.size)
					3.assertEquals((dimensions.get(0) as IntDimension).index)
					4.assertEquals((dimensions.get(1) as IntDimension).index)
					5.assertEquals((dimensions.get(2) as IntDimension).index)
				]
			]
			(programElements.get(1) as Procedure).procedure.prototype as FnPrototypeDeclaration => [
				"f2".assertEquals(name)
				3.assertEquals(params.size)
				params.get(0).^var => [
					"p1".assertEquals(name)
					1.assertEquals(dimensions.size)
					0.assertEquals((dimensions.head as IntDimension).index)
				]
				params.get(1).^var => [
					"p2".assertEquals(name)
					1.assertEquals(dimensions.size)
					Assert.assertTrue(dimensions.head instanceof NodeNumDimension)
				]
				params.get(2).^var => [
					"p3".assertEquals(name)
					1.assertEquals(dimensions.size)
					"a".assertEquals((dimensions.head as IdDimension).index)
				]
			]
		]
	}
	
	@Test
	def void testLVal() {
		'''
			void f1() {
				int v1 = v7;
				int v2 = v8[1];
				int v3 = v9[2][3];
				int v4 = v10@42;
				int v5 = v11[4]@65;
				int v6 = v12[5][6]@32;
			}
		'''.parse => [
			assertNoIssues;
			(programElements.head as Procedure).procedure.fnBody.varInitList => [
				6.assertEquals(varInits.size)
				varInits.get(0).varAsgnList.varAsgn.expr as LVal => [
					"v7".assertEquals(name)
					indices.empty.assertTrue
					at.assertNull
				]
				varInits.get(1).varAsgnList.varAsgn.expr as LVal => [
					"v8".assertEquals(name)
					1.assertEquals(indices.size)
					1.assertEquals((indices.head as IntExpr).value)
					at.assertNull
				]
				varInits.get(2).varAsgnList.varAsgn.expr as LVal => [
					"v9".assertEquals(name)
					2.assertEquals(indices.size)
					2.assertEquals((indices.get(0) as IntExpr).value)
					3.assertEquals((indices.get(1) as IntExpr).value)
					at.assertNull
				]
				varInits.get(3).varAsgnList.varAsgn.expr as LVal => [
					"v10".assertEquals(name)
					indices.empty.assertTrue
					42.assertEquals((at as IntExpr).value)
				]
				varInits.get(4).varAsgnList.varAsgn.expr as LVal => [
					"v11".assertEquals(name)
					1.assertEquals(indices.size)
					4.assertEquals((indices.head as IntExpr).value)
					65.assertEquals((at as IntExpr).value)
				]
				varInits.get(5).varAsgnList.varAsgn.expr as LVal => [
					"v12".assertEquals(name)
					2.assertEquals(indices.size)
					5.assertEquals((indices.get(0) as IntExpr).value)
					6.assertEquals((indices.get(1) as IntExpr).value)
					32.assertEquals((at as IntExpr).value)
				]
			]
		]
	}
	
	@Test
	def void testArgList() {
		'''
			void f1() {
				int v1 = f2();
				int v2 = f3(1);
				int v3 = f4(2, 3);
			}
		'''.parse => [
			assertNoIssues;
			(programElements.head as Procedure).procedure.fnBody.varInitList => [
				3.assertEquals(varInits.size)
				(varInits.get(0).varAsgnList.varAsgn.expr as CallExpr) => [
					"f2".assertEquals(name)
					argList.args.empty.assertTrue
				]
				(varInits.get(1).varAsgnList.varAsgn.expr as CallExpr) => [
					"f3".assertEquals(name)
					argList => [
						1.assertEquals(args.size)
						1.assertEquals((args.head as IntExpr).value)
					]
				]
				(varInits.get(2).varAsgnList.varAsgn.expr as CallExpr) => [
					"f4".assertEquals(name)
					argList => [
						2.assertEquals(args.size)
						2.assertEquals((args.get(0) as IntExpr).value)
						3.assertEquals((args.get(1) as IntExpr).value)
					]
				]
			]
		]
	}
	
	@Test
	def void testCallExpr() {
		'''
			void f1() {
				int v1 = f2();
				int v2 = ns1::f3();
				int v3 = f4()@52;
				int v4 = ns2::f5()@95;
			}
		'''.parse => [
			assertNoIssues;
			(programElements.head as Procedure).procedure.fnBody.varInitList => [
				4.assertEquals(varInits.size)
				(varInits.get(0).varAsgnList.varAsgn.expr as CallExpr) => [
					namespace.assertNull
					"f2".assertEquals(name)
					argList.args.empty.assertTrue
					at.assertNull
				]
				(varInits.get(1).varAsgnList.varAsgn.expr as CallExpr) => [
					"ns1".assertEquals(namespace)
					"f3".assertEquals(name)
					argList.args.empty.assertTrue
					at.assertNull
				]
				(varInits.get(2).varAsgnList.varAsgn.expr as CallExpr) => [
					namespace.assertNull
					"f4".assertEquals(name)
					argList.args.empty.assertTrue
					52.assertEquals((at as IntExpr).value)
				]
				(varInits.get(3).varAsgnList.varAsgn.expr as CallExpr) => [
					"ns2".assertEquals(namespace)
					"f5".assertEquals(name)
					argList.args.empty.assertTrue
					95.assertEquals((at as IntExpr).value)
				]
			]
		]
	}
	
	@Test
	def void testTerminalExpr() {
		'''
			void f1() {
				int v1 = name1;
				int v2 = id;
				int v3 = 57;
				int v4 = 89.034;
				int v5 = #N;
				int v6 = -name2;
				int v7 = +name3;
				int v8 = !name4;
				int v9 = ~name5;
				int v10 = f2();
				int v11 = exists_other(name6, 2);
				int v12 = EXISTS_OTHER(name7, 4);
				int v13 = exists_higher(name8, 8);
				int v14 = EXISTS_HIGHER(name9, 16);
				int v15 = exists_lower(name10, 32);
				int v16 = EXISTS_LOWER(name11, 64);
				int v17 = (name9);
			}
		'''.parse => [
			assertNoIssues;
			(programElements.head as Procedure).procedure.fnBody.varInitList => [
				17.assertEquals(varInits.size)
				varInits.get(0).varAsgnList.varAsgn => [
					"v1".assertEquals(^var.name)
					"name1".assertEquals((expr as LVal).name)
				]
				varInits.get(1).varAsgnList.varAsgn => [
					"v2".assertEquals(^var.name)
					Assert.assertTrue(expr instanceof IdExpr)
				]
				varInits.get(2).varAsgnList.varAsgn => [
					"v3".assertEquals(^var.name)
					57.assertEquals((expr as IntExpr).value)
				]
				varInits.get(3).varAsgnList.varAsgn => [
					"v4".assertEquals(^var.name)
					89.034.assertEquals((expr as DoubleExpr).value, 0)
				]
				varInits.get(4).varAsgnList.varAsgn => [
					"v5".assertEquals(^var.name)
					Assert.assertTrue(expr instanceof NodeNumExpr)
				]
				varInits.get(5).varAsgnList.varAsgn => [
					"v6".assertEquals(^var.name)
					expr as UnaryExpr => [
						UnaryOperator.MINUS.assertEquals(operator)
						"name2".assertEquals((operand as LVal).name)
					]
				]
				varInits.get(6).varAsgnList.varAsgn => [
					"v7".assertEquals(^var.name)
					expr as UnaryExpr => [
						UnaryOperator.PLUS.assertEquals(operator)
						"name3".assertEquals((operand as LVal).name)
					]
				]
				varInits.get(7).varAsgnList.varAsgn => [
					"v8".assertEquals(^var.name)
					expr as UnaryExpr => [
						UnaryOperator.LOGICAL_NOT.assertEquals(operator)
						"name4".assertEquals((operand as LVal).name)
					]
				]
				varInits.get(8).varAsgnList.varAsgn => [
					"v9".assertEquals(^var.name)
					expr as UnaryExpr => [
						UnaryOperator.BITWISE_NOT.assertEquals(operator)
						"name5".assertEquals((operand as LVal).name)
					]
				]
				varInits.get(9).varAsgnList.varAsgn => [
					"v10".assertEquals(^var.name)
					"f2".assertEquals((expr as CallExpr).name)
				]
				varInits.get(10).varAsgnList.varAsgn => [
					"v11".assertEquals(^var.name)
					expr as BuiltInExpr => [
						BuiltInFunctionEnum.EXISTS_OTHER.assertEquals(function)
						"name6".assertEquals(firstArg)
						2.assertEquals((secondArg as IntExpr).value)
					]
				]
				varInits.get(11).varAsgnList.varAsgn => [
					"v12".assertEquals(^var.name)
					expr as BuiltInExpr => [
						BuiltInFunctionEnum.EXISTS_OTHER.assertEquals(function)
						"name7".assertEquals(firstArg)
						4.assertEquals((secondArg as IntExpr).value)
					]
				]
				varInits.get(12).varAsgnList.varAsgn => [
					"v13".assertEquals(^var.name)
					expr as BuiltInExpr => [
						BuiltInFunctionEnum.EXISTS_HIGHER.assertEquals(function)
						"name8".assertEquals(firstArg)
						8.assertEquals((secondArg as IntExpr).value)
					]
				]
				varInits.get(13).varAsgnList.varAsgn => [
					"v14".assertEquals(^var.name)
					expr as BuiltInExpr => [
						BuiltInFunctionEnum.EXISTS_HIGHER.assertEquals(function)
						"name9".assertEquals(firstArg)
						16.assertEquals((secondArg as IntExpr).value)
					]
				]
				varInits.get(14).varAsgnList.varAsgn => [
					"v15".assertEquals(^var.name)
					expr as BuiltInExpr => [
						BuiltInFunctionEnum.EXISTS_LOWER.assertEquals(function)
						"name10".assertEquals(firstArg)
						32.assertEquals((secondArg as IntExpr).value)
					]
				]
				varInits.get(15).varAsgnList.varAsgn => [
					"v16".assertEquals(^var.name)
					expr as BuiltInExpr => [
						BuiltInFunctionEnum.EXISTS_LOWER.assertEquals(function)
						"name11".assertEquals(firstArg)
						64.assertEquals((secondArg as IntExpr).value)
					]
				]
				varInits.get(16).varAsgnList.varAsgn => [
					"v17".assertEquals(^var.name)
					"name9".assertEquals((expr as LVal).name)
				]
			]
		]
	}
}