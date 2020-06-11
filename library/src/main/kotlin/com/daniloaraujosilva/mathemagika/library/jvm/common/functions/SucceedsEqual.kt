package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SucceedsEqual
 *
 * Full name:        System`SucceedsEqual
 *
 * Usage:            SucceedsEqual[x, y, …] displays as x ⪰ y ⪰ ….
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/SucceedsEqual
 * Documentation:    web: http://reference.wolfram.com/language/ref/SucceedsEqual.html
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
fun succeedsEqual(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SucceedsEqual", arguments.toMutableList(), options)
}
