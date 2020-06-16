package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Echo
 *
 * Full name:        System`Echo
 *
 *                   Echo[expr] prints expr and returns expr.
 *                   Echo[expr, label] prints expr prepending label and returns expr.
 * Usage:            Echo[expr, label, f] prints f[expr] prepending label and returns expr.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Echo
 * Documentation:    web: http://reference.wolfram.com/language/ref/Echo.html
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
fun echo(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Echo", arguments.toMutableList(), options)
}
