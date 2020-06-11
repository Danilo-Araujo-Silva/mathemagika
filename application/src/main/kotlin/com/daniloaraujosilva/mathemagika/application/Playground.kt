package com.daniloaraujosilva.mathemagika.application

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction
import com.daniloaraujosilva.mathemagika.library.jvm.common.generated.*

class Expression {
	val children = mutableListOf<Any>()

	operator fun String.unaryPlus() {
		children.add(this)
	}

	operator fun MathematicaFunction.unaryPlus() {
		children.add(this)
	}
}

fun expression(init: Expression.() -> Unit): Expression {
	val expression = Expression()
	expression.init()

	return expression
}

@ExperimentalUnsignedTypes
fun test() {
	val x = "x"

	n(
		d(
			normal(
				series(
					integrate(
						zeta(x),
						x
					),
					listOf(x, 0, 6)
				)
			),
			listOf(x, 2)
		),
		10
	)

	val e = expression {
		+n(
			d(
				normal(
					series(
						integrate(
							zeta(x),
							x
						),
						listOf(x, 0, 6)
					)
				),
				listOf(x, 2)
			),
			10
		)
		+"/.$x -> 10"
		+"// FullSimplify // Timing // TableForm // ToString"
	}

	e.children.map {println(it)}

//	n(
//		d(
//			normal(
//				series(
//					integrate(
//						zeta(x),
//						x
//					),
//					listOf(x, 0, 6)
//				)
//			),
//			listOf(x, 2)
//		),
//		10
//	)

//		"""
//		${
//			n(
//				d(
//					normal(
//						series(
//							integrate(
//								zeta("x"),
//								"x"
//							),
//							"{x, 0, 6}"
//						)
//					),
//					"{x, 2}"
//				),
//				100
//			)
//		}/.x -> 10 // FullSimplify // Timing // TableForm // ToString
//		""".trimIndent()

//	println(prime(10000).run<String>())
//
//	println("Integrate[x Sin[x], x]".run<String>())
//
//	println(
//		integrate(
//			"x ${sin("x")}",
//			"x"
//		).run<String>()
//	)
//
//	println(sin(0.5).run<String>())
//
//	println(sin("Pi/2").run<String>())
//
//	println(
//		integrate(
//			"x ${sin("x")}",
//			"{x, 2, 7}"
//		).run<String>()
//	)

//	println(
//		n(
//			integrate(
//				"x ${sin("x")}",
//				"{x, 2, 7}"
//			),
//			20
//		).run<String>()
//	)

//	println(
//		normal(
//			series(
//				sin("x"),
//				"{x, 0, 10}"
//			)
//		).run<String>()
//	)

//	println(zeta(6).run<String>())

//	println(
//		table(
//			prime("i"),
//			"{i, 1, 100}"
//		).run<String>()
//	)

//	println(
//		"""
//			${
//				table(
//					prime("i"),
//					"{i, 1, 100}"
//				)
//			}//TableForm
//		"""
//		.run<String>(options = mapOf(type to EvaluationTypeEnum.OUTPUT_FORM))
//	)

//	println(prime(10000).run<String>())
//
//	println(n(zeta("1+2I"), 100).run<String>())
//
//	println(integrate("x^11", "x").run<String>())
//
//	println(normal(series(sin("x"), "{x, 1, 10}")).run<String>())
//
//	println(n("${normal(series(sin("x"), "{x, 0, 10}"))}/.x-> 10", 100).run<String>())


//	println(
//		n(
//			normal(
//				series(
//					d(
//						log(
//							2,
//							"1/(x+1)"
//						),
//						"x"
//					),
//					"{x, 0, 10}"
//				)
//			).toString() + "/.x -> " + GoldenRatio + " // FullSimplify",
//			15
//		).run<String>()
//	)


//	println(`$VoiceStyles`().run<String>())

//	println(Mathematica().kernelLink.evaluateToInputForm("Zeta[2]", 0))
//	println(integrate("x^3", "x").run<String>())
//	println(
//		d(
//			normal(
//				series(
//					integrate(
//						zeta("x"),
//						"x"
//					),
//					"{x, 0, 6}"
//				)
//			),
//			"{x, 2}"
//		).run<String>()
//	)

//	println(
//		"""
//			${
//				n(
//					d(
//						normal(
//							series(
//								integrate(
//									zeta("x"),
//									"x"
//								),
//								"{x, 0, 6}"
//							)
//						),
//						"{x, 2}"
//					),
//					100
//				)
//			}/.x -> 10 // FullSimplify // Timing // TableForm // ToString
//		""".trimIndent().run<String>()
//	)

//	println(n(zetaZero(1), 100).run<String>())

//	println(
//		"""
//			${
//		n(
//			d(
//				normal(
//					series(
//						integrate(
//							zeta("x"),
//							"x"
//						),
//						"{x, 0, 6}"
//					)
//				),
//				"{x, 2}"
//			),
//			100
//		)
//		}/.x -> 10 // FullSimplify // Timing // TableForm // ToString
//		""".trimIndent().run<String>(options = mutableMapOf(type to OUTPUT_FORM))
//	)
}
