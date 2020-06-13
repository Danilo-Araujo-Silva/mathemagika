package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             OutputSizeLimit
 *
 * Full name:        System`OutputSizeLimit
 *
 * Usage:            OutputSizeLimit is an option for notebooks that specifies the maximum size in bytes of expressions that will automatically be output in their entirety.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/OutputSizeLimit
 * Documentation:    web: http://reference.wolfram.com/language/ref/OutputSizeLimit.html
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
fun outputSizeLimit(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("OutputSizeLimit", arguments.toMutableList(), options)
}
