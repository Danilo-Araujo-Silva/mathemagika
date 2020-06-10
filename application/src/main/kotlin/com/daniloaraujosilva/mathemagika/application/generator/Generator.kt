package com.daniloaraujosilva.mathemagika.application.generator

import com.daniloaraujosilva.mathemagika.library.common.jvm.Mathematica
import com.daniloaraujosilva.mathemagika.library.jvm.common.convertFromMathematicaTo
import com.daniloaraujosilva.mathemagika.library.jvm.common.generated.n
import com.daniloaraujosilva.mathemagika.library.jvm.common.generated.d
import com.daniloaraujosilva.mathemagika.library.jvm.common.generated.integrate
import com.daniloaraujosilva.mathemagika.library.jvm.common.generated.normal
import com.daniloaraujosilva.mathemagika.library.jvm.common.generated.series
import com.daniloaraujosilva.mathemagika.library.jvm.common.generated.zeta
import com.daniloaraujosilva.mathemagika.library.jvm.common.run
import com.daniloaraujosilva.mathemagika.library.common.jvm.EvaluationTypeEnum.OUTPUT_FORM
import type
import java.nio.file.Paths

@ExperimentalUnsignedTypes
fun main() {
//	generateAndSaveMathematicaFunctions()

	test()
}

@ExperimentalUnsignedTypes
fun test() {
//	println(Mathematica().kernelLink.evaluateToInputForm("Zeta[2]", 0))
//	println(Integrate("x^3", "x").run<String>())
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

	println(
		"""
			${
				n(
					d(
						normal(
							series(
								integrate(
									zeta("x"),
									"x"
								),
								"{x, 0, 6}"
							)
						),
						"{x, 2}"
					),
					100
				)
			}/.x -> 10 // FullSimplify // Timing // TableForm // ToString
		""".trimIndent().run<String>()
	)

	println(
		"""
			${
		n(
			d(
				normal(
					series(
						integrate(
							zeta("x"),
							"x"
						),
						"{x, 0, 6}"
					)
				),
				"{x, 2}"
			),
			100
		)
		}/.x -> 10 // FullSimplify // Timing // TableForm // ToString
		""".trimIndent().run<String>(options = mutableMapOf(type to OUTPUT_FORM))
	)
}

lateinit var mathematica: Mathematica

@ExperimentalUnsignedTypes
fun generateAndSaveMathematicaFunctions() {
	try {
		mathematica = Mathematica()

		val path = Paths.get("library/src/main/kotlin/com/daniloaraujosilva/mathemagika/library/jvm/common/generated/MathematicaFunctions.kt")

		path.toFile().writeText(generateFunctionsFileContent())
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

	// break, continue, do, false, for, if, null, return, throw, true, while

	// errors TravelDirectionsData
	methodName = methodName.decapitalize()

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
//		|Names[RegularExpression["\\${'$'}VoiceStyles|Integra.*|Zeta.*|Series|D|Normal"]]
//		""".trimMargin()
		"""
		|Names[RegularExpression["\${'$'}?[A-Za-z0-9].*"]]
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
