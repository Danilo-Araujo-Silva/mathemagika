package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             QuotientRemainder
 *
 * Full name:        System`QuotientRemainder
 *
 * Usage:            QuotientRemainder[m, n] gives a list of the quotient and remainder from division of m by n.
 *
 * Options:          None
 *
 *                   Listable
 * Attributes:       Protected
 *
 *                   local: paclet:ref/QuotientRemainder
 * Documentation:    web: http://reference.wolfram.com/language/ref/QuotientRemainder.html
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
fun quotientRemainder(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("QuotientRemainder", arguments.toMutableList(), options)
}
