package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Quotient
 *
 * Full name:        System`Quotient
 *
 *                   Quotient[m, n] gives the integer quotient of m and n.
 * Usage:            Quotient[m, n, d] uses an offset d.
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Quotient
 * Documentation:    web: http://reference.wolfram.com/language/ref/Quotient.html
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
fun quotient(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Quotient", arguments.toMutableList(), options)
}
