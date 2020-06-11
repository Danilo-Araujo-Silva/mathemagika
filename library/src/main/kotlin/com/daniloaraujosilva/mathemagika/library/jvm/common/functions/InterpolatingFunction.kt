package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             InterpolatingFunction
 *
 * Full name:        System`InterpolatingFunction
 *
 * Usage:            InterpolatingFunction[domain, table] represents an approximate function whose values are found by interpolation.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/InterpolatingFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/InterpolatingFunction.html
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
fun interpolatingFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("InterpolatingFunction", arguments.toMutableList(), options)
}
