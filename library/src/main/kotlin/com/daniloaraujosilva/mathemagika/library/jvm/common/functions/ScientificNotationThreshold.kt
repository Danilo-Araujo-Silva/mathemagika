package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ScientificNotationThreshold
 *
 * Full name:        System`ScientificNotationThreshold
 *
 * Usage:            ScientificNotationThreshold is an option for NumberForm and related functions that specifies the threshold between the use of decimal notation and scientific notation to represent real numbers.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ScientificNotationThreshold
 * Documentation:    web: http://reference.wolfram.com/language/ref/ScientificNotationThreshold.html
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
fun scientificNotationThreshold(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ScientificNotationThreshold", arguments.toMutableList(), options)
}
