package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             MaxWordGap
 *
 * Full name:        System`MaxWordGap
 *
 * Usage:            MaxWordGap is an option for SearchAdjustment that specifies the number of words that can occur between the terms of a phrase.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MaxWordGap
 * Documentation:    web: http://reference.wolfram.com/language/ref/MaxWordGap.html
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
fun maxWordGap(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MaxWordGap", arguments.toMutableList(), options)
}
