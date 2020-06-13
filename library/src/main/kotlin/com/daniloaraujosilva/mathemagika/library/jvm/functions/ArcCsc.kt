package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ArcCsc
 *
 * Full name:        System`ArcCsc
 *
 *                                                       -1
 * Usage:            ArcCsc[z] gives the arc cosecant csc  (z) of the complex number z.
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ArcCsc
 * Documentation:    web: http://reference.wolfram.com/language/ref/ArcCsc.html
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
fun arcCsc(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ArcCsc", arguments.toMutableList(), options)
}
