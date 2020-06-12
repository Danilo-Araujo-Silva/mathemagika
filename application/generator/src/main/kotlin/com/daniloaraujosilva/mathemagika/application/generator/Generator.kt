package com.daniloaraujosilva.mathemagika.application.generator

import com.daniloaraujosilva.mathemagika.library.jvm.common.Mathematica
import com.daniloaraujosilva.mathemagika.library.common.kotlinKeywordsAndSymbols
import com.daniloaraujosilva.mathemagika.library.jvm.common.convertFromMathematicaTo
import java.nio.file.Path
import java.nio.file.Paths
import java.time.LocalDateTime

@ExperimentalUnsignedTypes
fun main() {
//	generateAndExportMathematicaFunctionsIndividually()

//	playground()
}

lateinit var mathematica: Mathematica

lateinit var basePath: Path

@ExperimentalUnsignedTypes
fun generateAndExportMathematicaFunctionsIndividually() {
	try {
		println("Start time: ${LocalDateTime.now()}")

		basePath = Paths.get("library/src/main/kotlin/com/daniloaraujosilva/mathemagika/library/jvm.common.functions")

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

		basePath = Paths.get("library/src/main/kotlin/com/daniloaraujosilva/mathemagika/library/jvm.common.functions/MathematicaFunctions.kt")

		basePath.toFile().writeText(generateFunctionsFileContent())
	} finally {
		mathematica.closeKernelLink()
	}
}

@ExperimentalUnsignedTypes
fun generateFunctionsFileContent(): String {
	var content =
		"""
			|package com.daniloaraujosilva.mathemagika.library.jvm.functions
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
			|package com.daniloaraujosilva.mathemagika.library.jvm.functions
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
