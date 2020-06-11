package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CombinerFunction
 *
 * Full name:        System`CombinerFunction
 *
 * Usage:            CombinerFunction is an option for template functions that specifies how fragments should be assembled to give the result of applying a template.
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/CombinerFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/CombinerFunction.html
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
fun combinerFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CombinerFunction", arguments.toMutableList(), options)
}
