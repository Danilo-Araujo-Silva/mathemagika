package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Default
 *
 * Full name:        System`Default
 *
 *                   Default[f] gives the default value for arguments of the function f obtained with a _. pattern object.
 *                                                                                         th
 *                   Default[f, i] gives the default value to use when _. appears as the i   argument of f.
 *                                                                      th
 *                   Default[f, i, n] gives the default value for the i   argument out of a total of n arguments.
 * Usage:            Default[f, …] = val defines default values for arguments of f.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Default
 * Documentation:    web: http://reference.wolfram.com/language/ref/Default.html
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
fun default(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Default", arguments.toMutableList(), options)
}
