package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SubtractSides
 *
 * Full name:        System`SubtractSides
 *
 *                   SubtractSides[rel, x] subtracts x from each side of the equation or inequality rel.
 *                   SubtractSides[rel , rel ] subtracts the corresponding sides of two equations or inequalities.
 *                                    1     2
 * Usage:            SubtractSides[rel] subtracts the right-hand side of rel from each side, producing a zero right-hand side.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/SubtractSides
 * Documentation:    web: http://reference.wolfram.com/language/ref/SubtractSides.html
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
fun subtractSides(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SubtractSides", arguments.toMutableList(), options)
}
