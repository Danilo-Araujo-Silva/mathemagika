package com.daniloaraujosilva.mathemagika.application.generator

import com.daniloaraujosilva.mathemagika.library.common.jvm.Mathematica
import com.daniloaraujosilva.mathemagika.library.jvm.common.convertFromMathematicaTo
import com.daniloaraujosilva.mathemagika.library.jvm.common.generated.Integrate
import java.nio.file.Paths

fun main() {
	generateAndSaveMathematicaFunctions()

	test()
}

fun test() {
//	println(Mathematica().kernelLink.evaluateToInputForm("Zeta[2]", 0))
	println(Integrate("x^3", "x").run<String>())
}

lateinit var mathematica: Mathematica

fun generateAndSaveMathematicaFunctions() {
	try {
		mathematica = Mathematica()

		val path = Paths.get("library/src/main/kotlin/com/daniloaraujosilva/mathemagika/library/jvm/common/generated/MathematicaFunctions.kt")

		path.toFile().writeText(generateFunctionsFileContent())
	} finally {
		mathematica.closeKernelLink()
	}
}

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
		"""
		|Names[RegularExpression["\\${'$'}VoiceStyles|Integra.*"]]
		""".trimMargin()
//		"""
//		|Names[RegularExpression["\${'$'}?[A-Za-z0-9].*"]]
//		""".trimMargin()
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
