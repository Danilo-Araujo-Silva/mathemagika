package com.daniloaraujosilva.mathemagika.application.generator

import com.daniloaraujosilva.mathemagika.library.common.jvm.Mathematica
import com.daniloaraujosilva.mathemagika.library.jvm.common.convertFromMathematicaTo
import com.daniloaraujosilva.mathemagika.common.common.kotlinKeywordsAndSymbols
import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction
import com.daniloaraujosilva.mathemagika.library.jvm.common.generated.*
import java.nio.file.Path
import java.nio.file.Paths
import java.time.LocalDateTime

@ExperimentalUnsignedTypes
fun main() {
//	generateAndExportMathematicaFunctionsTogether()

//	generateAndExportMathematicaFunctionsIndividually()

	test()
}

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

lateinit var mathematica: Mathematica

lateinit var basePath: Path

@ExperimentalUnsignedTypes
fun generateAndExportMathematicaFunctionsIndividually() {
	try {
		println("Start time: ${LocalDateTime.now()}")

		basePath = Paths.get("library/src/main/kotlin/com/daniloaraujosilva/mathemagika/library/jvm/common/generated")

		mathematica = Mathematica()

		val functionNames = getAllFunctionsNames()

		println(
			"""
			Functions to be generated:

			${functionNames}
		""".trimIndent()
		)

		for (functionName in functionNames) {
			generateAndExportFunction(functionName)
		}
	} finally {
		mathematica.closeKernelLink()

		println("End time: ${LocalDateTime.now()}")
	}
}

@ExperimentalUnsignedTypes
fun generateAndExportMathematicaFunctionsTogether() {
	try {
		mathematica = Mathematica()

		basePath = Paths.get("library/src/main/kotlin/com/daniloaraujosilva/mathemagika/library/jvm/common/generated/MathematicaFunctions.kt")

		basePath.toFile().writeText(generateFunctionsFileContent())
	} finally {
		mathematica.closeKernelLink()
	}
}

@ExperimentalUnsignedTypes
fun generateFunctionsFileContent(): String {
	var content =
		"""
			|package com.daniloaraujosilva.mathemagika.library.jvm.common.generated
			|
			|import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction
			|${generateAllFunctions()}
			|
		""".trimMargin()

	return content
}

@ExperimentalUnsignedTypes
fun generateAllFunctions(): String {
	var output = ""
	val functionNames = getAllFunctionsNames()

	println(functionNames.toString())

	for (functionName in functionNames) {
		output +=
			"""
			|
			|
			|${generateFunctionDocumentation(functionName)}
			|${generateFunction(functionName)}
			""".trimMargin()
	}

	return output
}

fun generateAndExportFunction(functionName: String) {
	println("Exporting function $functionName:")

	val content =
		"""
			|package com.daniloaraujosilva.mathemagika.library.jvm.common.generated
			|
			|import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction
			|
			|${generateFunctionDocumentation(functionName)}
			|${generateFunction(functionName)}
			|
		""".trimMargin()

	Paths.get(basePath.toFile().absolutePath, "${functionName.capitalize()}.kt").toFile().writeText(content)

	println("Function $functionName exported.")
}

fun generateFunction(functionName: String): String {
		lateinit var rawFunctionName: String
		lateinit var methodName: String

		if (functionName.startsWith("\$")) {
			rawFunctionName = "\\$functionName"
			methodName = "`$functionName`"
		} else {
			rawFunctionName = functionName
			methodName = rawFunctionName
		}

	// errors TravelDirectionsData
	methodName = methodName.decapitalize()

	if (methodName in kotlinKeywordsAndSymbols) methodName = "`$methodName`"

	var result =
		"""
		|fun $methodName(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
		|	return MathematicaFunction("$rawFunctionName", arguments.toMutableList(), options)
		|}
		""".trimMargin()

	return result
}

@ExperimentalUnsignedTypes
fun getAllFunctionsNames(): MutableList<String> {
	val result = mathematica.evaluateToOutputForm(
//		"""
//		|Names[RegularExpression["\\${'$'}VoiceStyles|Integra.*|Zeta.*|Series|D|Normal|Continue|TravelDirectionsData|N"]]
//		""".trimMargin()
//		"""
//		|Names[RegularExpression["\${'$'}?[A-Za-z0-9].*"]]
//		""".trimMargin()
		"""
		|Names[RegularExpression[".*"]]
		""".trimMargin()
	)

	return convertFromMathematicaTo(result)
}

@ExperimentalUnsignedTypes
fun generateFunctionDocumentation(functionName: String): String {
	val result = mathematica.evaluateToOutputForm(
		"""
		|With[
		|	{expression = $functionName},
		|	"/**\n *````"
		|	<>
		|	StringReplace[
		|		ToString[
		|			TableForm[
		|				{
		|					{""},
		|					{"Name:", expression},
		|					{"Full name:", Information[expression, "FullName"]},
		|					{
		|						"Usage:",
		|						Map[
		|							ToString,
		|							StringSplit[
		|								Information[expression, "Usage"],
		|								RegularExpression["\n"]
		|							]
		|						]
		|					},
		|					{"Options:", Information[expression, "Options"]},
		|					{"Attributes:", Information[expression, "Attributes"]},
		|					{"Documentation:",
		|						{
		|							"local: " <> Information[expression, "Documentation"]["Local"],
		|							"web: " <> Information[expression, "Documentation"]["Web"]
		|						}
		|					},
		|					{"Definitions:", Information[expression, "Definitions"]},
		|					{"Own values:", Information[expression, "OwnValues"]},
		|					{"Down values:", Information[expression, "DownValues"]},
		|					{"Up values:", Information[expression, "UpValues"]},
		|					{"Sub values:", Information[expression, "SubValues"]},
		|					{"Default value:", Information[expression, "DefaultValues"]},
		|					{"Numeric values:", Information[expression, "NValues"]}
		|
		|				}
		|			]
		|		],
		|		"\n" -> "\n * "
		|	]
		|	<>
		|	"\n */"
		|]//TableForm
		""".trimMargin()
	)

	return convertFromMathematicaTo(result)
}
