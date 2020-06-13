package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Convolve
 *
 * Full name:        System`Convolve
 *
 *                   Convolve[f, g, x, y] gives the convolution with respect to x of the expressions f and g.
 *                   Convolve[f, g, {x , x , …}, {y , y , …}] gives the multidimensional convolution.
 * Usage:                             1   2        1   2
 *
 *                   Assumptions :> $Assumptions
 *                   GenerateConditions -> False
 *                   Method -> Automatic
 * Options:          PrincipalValue -> False
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Convolve
 * Documentation:    web: http://reference.wolfram.com/language/ref/Convolve.html
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
fun convolve(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Convolve", arguments.toMutableList(), options)
}
