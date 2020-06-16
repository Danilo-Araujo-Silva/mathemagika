package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             WaveletScale
 *
 * Full name:        System`WaveletScale
 *
 * Usage:            WaveletScale is an option for ContinuousWaveletTransform and related constructs used to specify the smallest resolvable scale.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/WaveletScale
 * Documentation:    web: http://reference.wolfram.com/language/ref/WaveletScale.html
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
fun waveletScale(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WaveletScale", arguments.toMutableList(), options)
}
