package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SignificanceLevel
 *
 * Full name:        System`SignificanceLevel
 *
 * Usage:            SignificanceLevel is an option to VarianceTest and similar functions that controls cutoffs for diagnostic tests as well as test conclusions.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SignificanceLevel
 * Documentation:    web: http://reference.wolfram.com/language/ref/SignificanceLevel.html
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
fun significanceLevel(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SignificanceLevel", arguments.toMutableList(), options)
}
