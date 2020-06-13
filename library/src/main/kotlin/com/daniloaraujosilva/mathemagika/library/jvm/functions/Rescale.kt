package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Rescale
 *
 * Full name:        System`Rescale
 *
 *                   Rescale[x, {min, max}] gives x rescaled to run from 0 to 1 over the range min to max.
 *                   Rescale[x, {min, max}, {y   , y   }] gives x rescaled to run from y    to y    over the range min to max.
 *                                            min   max                                 min     max
 * Usage:            Rescale[list] rescales each element of list to run from 0 to 1 over the range Min[list] to Max[list].
 *
 * Options:          None
 *
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Rescale
 * Documentation:    web: http://reference.wolfram.com/language/ref/Rescale.html
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
fun rescale(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Rescale", arguments.toMutableList(), options)
}
