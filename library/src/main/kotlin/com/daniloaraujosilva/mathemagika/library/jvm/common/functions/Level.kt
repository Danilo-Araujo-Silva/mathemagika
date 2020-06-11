package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Level
 *
 * Full name:        System`Level
 *
 *                   Level[expr, levelspec] gives a list of all subexpressions of expr on levels specified by levelspec.
 * Usage:            Level[expr, levelspec, f] applies f to the sequence of subexpressions.
 *
 * Options:          Heads -> False
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Level
 * Documentation:    web: http://reference.wolfram.com/language/ref/Level.html
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
fun level(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Level", arguments.toMutableList(), options)
}
