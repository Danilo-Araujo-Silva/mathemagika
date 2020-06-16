package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             DivideSides
 *
 * Full name:        System`DivideSides
 *
 *                   DivideSides[rel, x] divides each side of the equation or inequality rel by x.
 *                   DivideSides[rel , rel ] divides the corresponding sides of two equations or inequalities.
 *                                  1     2
 * Usage:            DivideSides[rel] divides each side of rel by the right-hand side, producing a 1 right-hand side.
 *
 *                   Assumptions :> $Assumptions
 *                   GenerateConditions -> All
 * Options:          TimeConstraint -> 30
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/DivideSides
 * Documentation:    web: http://reference.wolfram.com/language/ref/DivideSides.html
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
fun divideSides(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DivideSides", arguments.toMutableList(), options)
}
