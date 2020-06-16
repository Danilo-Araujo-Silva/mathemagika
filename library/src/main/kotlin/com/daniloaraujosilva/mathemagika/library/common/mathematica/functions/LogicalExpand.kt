package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             LogicalExpand
 *
 * Full name:        System`LogicalExpand
 *
 * Usage:            LogicalExpand[expr] expands out logical combinations of equations, inequalities, and other functions.
 *
 * Options:          Sort -> True
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/LogicalExpand
 * Documentation:    web: http://reference.wolfram.com/language/ref/LogicalExpand.html
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
fun logicalExpand(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LogicalExpand", arguments.toMutableList(), options)
}
