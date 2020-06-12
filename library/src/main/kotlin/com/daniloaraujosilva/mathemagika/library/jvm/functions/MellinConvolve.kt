package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             MellinConvolve
 *
 * Full name:        System`MellinConvolve
 *
 *                   MellinConvolve[f, g, x, y] gives the Mellin convolution with respect to x of the expressions f and g.
 *                   MellinConvolve[f, g, {x , x , …}, {y , y , …}] gives the multidimensional Mellin convolution.
 * Usage:                                   1   2        1   2
 *
 *                   Assumptions :> $Assumptions
 *                   GenerateConditions -> False
 * Options:          Method -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MellinConvolve
 * Documentation:    web: http://reference.wolfram.com/language/ref/MellinConvolve.html
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
fun mellinConvolve(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MellinConvolve", arguments.toMutableList(), options)
}
