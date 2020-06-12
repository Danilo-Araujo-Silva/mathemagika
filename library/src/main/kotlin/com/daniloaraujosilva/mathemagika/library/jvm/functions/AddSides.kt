package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             AddSides
 *
 * Full name:        System`AddSides
 *
 *                   AddSides[rel, x] adds x to each side of the equation or inequality rel.
 *                   AddSides[rel , rel ] adds the corresponding sides of two equations or inequalities.
 * Usage:                        1     2
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/AddSides
 * Documentation:    web: http://reference.wolfram.com/language/ref/AddSides.html
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
fun addSides(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AddSides", arguments.toMutableList(), options)
}
