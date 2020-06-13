package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ArcCosh
 *
 * Full name:        System`ArcCosh
 *
 *                                                                      -1
 * Usage:            ArcCosh[z] gives the inverse hyperbolic cosine cosh  (z) of the complex number z.
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ArcCosh
 * Documentation:    web: http://reference.wolfram.com/language/ref/ArcCosh.html
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
fun arcCosh(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ArcCosh", arguments.toMutableList(), options)
}
