package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             IntegerReverse
 *
 * Full name:        System`IntegerReverse
 *
 *                   IntegerReverse[n] gives the integer whose digits are reversed with respect to those of the integer n.
 *                   IntegerReverse[n, b] gives the integer whose digits in base b are reversed with respect to those of n.
 * Usage:            IntegerReverse[n, b, len] gives the integer with reversed digits after padding n with zeros on the left to have len digits.
 *
 * Options:          None
 *
 *                   Listable
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/IntegerReverse
 * Documentation:    web: http://reference.wolfram.com/language/ref/IntegerReverse.html
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
fun integerReverse(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("IntegerReverse", arguments.toMutableList(), options)
}
