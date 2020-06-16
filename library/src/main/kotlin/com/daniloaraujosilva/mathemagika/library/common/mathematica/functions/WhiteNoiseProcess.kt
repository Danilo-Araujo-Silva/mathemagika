package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             WhiteNoiseProcess
 *
 * Full name:        System`WhiteNoiseProcess
 *
 *                   WhiteNoiseProcess[] represents a Gaussian white noise process with mean 0 and standard deviation 1.
 *                   WhiteNoiseProcess[σ] represents a Gaussian white noise process with mean 0 and standard deviation σ.
 * Usage:            WhiteNoiseProcess[dist] represents a white noise process based on the distribution dist.
 *
 * Options:
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/WhiteNoiseProcess
 * Documentation:    web: http://reference.wolfram.com/language/ref/WhiteNoiseProcess.html
 *
 * Definitions:      None
 *
 * Own values:       None
 *
 * Down values:      None
 *
 * Up values:        None
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun whiteNoiseProcess(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WhiteNoiseProcess", arguments.toMutableList(), options)
}
