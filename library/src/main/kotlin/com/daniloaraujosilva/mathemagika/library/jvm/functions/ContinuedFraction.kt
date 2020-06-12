package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ContinuedFraction
 *
 * Full name:        System`ContinuedFraction
 *
 *                   ContinuedFraction[x, n] generates a list of the first n terms in the continued fraction representation of x.
 * Usage:            ContinuedFraction[x] generates a list of all terms that can be obtained given the precision of x.
 *
 * Options:          None
 *
 *                   Listable
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ContinuedFraction
 * Documentation:    web: http://reference.wolfram.com/language/ref/ContinuedFraction.html
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
fun continuedFraction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ContinuedFraction", arguments.toMutableList(), options)
}
