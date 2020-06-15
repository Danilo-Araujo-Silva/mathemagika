package com.daniloaraujosilva.mathemagika.application.generator

import com.daniloaraujosilva.mathemagika.library.common.kotlinKeywordsAndSymbols
import com.daniloaraujosilva.mathemagika.library.common.mathematica.run
import java.nio.file.Path
import java.nio.file.Paths
import java.time.LocalDateTime

@ExperimentalStdlibApi
@ExperimentalUnsignedTypes
fun main() {
	generateAndExportMathematicaFunctionsIndividually()

//	playground()
}

lateinit var basePath: Path

/**
 *
 */
@ExperimentalStdlibApi
@ExperimentalUnsignedTypes
fun generateAndExportMathematicaFunctionsIndividually() {
		println("Start time: ${LocalDateTime.now()}")

		basePath = Paths.get("library/src/main/kotlin/com/daniloaraujosilva/mathemagika/library/common/mathematica/functions")

		val functionNames = getAllFunctionsNames()

		println(
			"""
			Functions to be generated:

			$functionNames
		""".trimIndent()
		)

		for (functionName in functionNames) {
			generateAndExportFunction(functionName)
		}

		println("End time: ${LocalDateTime.now()}")
}

/**
 *
 */
@ExperimentalStdlibApi
@ExperimentalUnsignedTypes
fun generateAndExportMathematicaFunctionsTogether() {
	basePath = Paths.get("library/src/main/kotlin/com/daniloaraujosilva/mathemagika/library/common/mathematica/functions/MathematicaFunctions.kt")

	basePath.toFile().writeText(generateFunctionsFileContent())
}

/**
 *
 */
@ExperimentalStdlibApi
@ExperimentalUnsignedTypes
fun generateFunctionsFileContent(): String {
	return """
		|package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions
		|
		|import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction
		|${generateAllFunctions()}
		|
	""".trimMargin()
}

/**
 *
 */
@ExperimentalStdlibApi
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

/**
 *
 */
@ExperimentalStdlibApi
@ExperimentalUnsignedTypes
fun generateAndExportFunction(functionName: String) {
	println("Exporting function $functionName:")

	val content =
		"""
			|package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions
			|
			|import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction
			|
			|${generateFunctionDocumentation(functionName)}${generateFunction(functionName)}
			|
		""".trimMargin()

	Paths.get(basePath.toFile().absolutePath, "${functionName.capitalize()}.kt").toFile().writeText(content)

	println("Function $functionName exported.")
}

/**
 *
 */
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

@ExperimentalStdlibApi
@ExperimentalUnsignedTypes
fun getAllFunctionsNames(): MutableList<String> {
	return run<MutableList<String>>(
		"""
		|Names[RegularExpression["Integra.*|Zeta.*|Series|D|Normal|Continue|TravelDirectionsData|N"]]//InputForm//ToString
		""".trimMargin()
//		"""
//		|Names[RegularExpression["\${'$'}?[A-Za-z0-9].*"]]// InputForm
//		""".trimMargin()
//		"""
//		|Names[RegularExpression[".*"]]// InputForm
//		""".trimMargin()
	)
}

@ExperimentalStdlibApi
@ExperimentalUnsignedTypes
fun generateFunctionDocumentation(functionName: String): String {
	return run(
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
		|]
		""".trimMargin()
	)
}
