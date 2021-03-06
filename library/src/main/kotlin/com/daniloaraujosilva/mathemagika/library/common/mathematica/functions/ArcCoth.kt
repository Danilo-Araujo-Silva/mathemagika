package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ArcCoth
 *
 * Full name:        System`ArcCoth
 *
 *                                                                         -1
 * Usage:            ArcCoth[z] gives the inverse hyperbolic cotangent coth  (z) of the complex number z.
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ArcCoth
 * Documentation:    web: http://reference.wolfram.com/language/ref/ArcCoth.html
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
fun arcCoth(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ArcCoth", arguments.toMutableList(), options)
}
