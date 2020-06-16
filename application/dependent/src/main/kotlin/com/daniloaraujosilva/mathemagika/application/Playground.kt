package com.daniloaraujosilva.mathemagika.application.generator

import com.daniloaraujosilva.mathemagika.library.common.mathematica.functions.*
import com.daniloaraujosilva.mathemagika.library.common.mathematica.*

@ExperimentalStdlibApi
@ExperimentalUnsignedTypes
fun playground() {
//	val wolframScriptPath = System.getenv("WOLFRAM_SCRIPT_PATH")
//	println(wolframScriptPath)
//	println(executeSystemCommand(listOf(wolframScriptPath, "-code", "f[n_] := f[n] = f[n - 1] + f[n - 2]; f[1] = f[2] = 1; Table[f[n],{n,5}]")))

//	println(run("Prime[10]"))
//	println(run<Double>(zeta(2) + "//N") + 2)
//	println(zeta(2).run<Int?>())
//	println(
//		com.daniloaraujosilva.mathemagika.library.jvm.functions.zeta(2).runUsingJLink<String>(
//			mapOf(
//				type to EvaluationTypeEnum.OUTPUT_FORM,
//				"pageWidth" to 100
//			)
//		)
//	)

//	println(convertFromMathematica<MutableList<Any>>("""{"Continue", "D", "Integral", "Integrate", "N", "Normal", "Series", "TravelDirectionsData", "Zeta", "ZetaZero"}"""))

	println(
		run(
			"""
			|Names[RegularExpression["Integra.*|Zeta.*|Series|D|Normal|Continue|TravelDirectionsData|N"]]//InputForm//ToString
			""".trimMargin()
		)
	)

	println(
		run<MutableList<String>>(
			"""
			|Names[RegularExpression["Integra.*|Zeta.*|Series|D|Normal|Continue|TravelDirectionsData|N"]]//InputForm//ToString
			""".trimMargin()
		)
	)
}
