package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             MultiplySides
 *
 * Full name:        System`MultiplySides
 *
 *                   MultiplySides[rel, x] multiplies each side of the equation or inequality rel by x.
 *                   MultiplySides[rel , rel ] multiplies the corresponding sides of two equations or inequalities.
 * Usage:                             1     2
 *
 *                   Assumptions :> $Assumptions
 *                   GenerateConditions -> All
 * Options:          TimeConstraint -> 30
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/MultiplySides
 * Documentation:    web: http://reference.wolfram.com/language/ref/MultiplySides.html
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
fun multiplySides(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MultiplySides", arguments.toMutableList(), options)
}
