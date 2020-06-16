package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             MellinTransform
 *
 * Full name:        System`MellinTransform
 *
 *                   MellinTransform[expr, x, s] gives the Mellin transform of expr.
 *                   MellinTransform[expr, {x , x , …}, {s , s , …}] gives the multidimensional Mellin transform of expr.
 * Usage:                                    1   2        1   2
 *
 *                   Assumptions :> $Assumptions
 *                   GenerateConditions -> False
 * Options:          Method -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MellinTransform
 * Documentation:    web: http://reference.wolfram.com/language/ref/MellinTransform.html
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
fun mellinTransform(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MellinTransform", arguments.toMutableList(), options)
}
