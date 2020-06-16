package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Or
 *
 * Full name:        System`Or
 *
 *                   e  || e  || … is the logical OR function. It evaluates its arguments in order, giving True immediately if any of them are True, and False if they are all False.
 * Usage:             1     2
 *
 * Options:          None
 *
 *                   Flat
 *                   HoldAll
 *                   OneIdentity
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Or
 * Documentation:    web: http://reference.wolfram.com/language/ref/Or.html
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
fun or(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Or", arguments.toMutableList(), options)
}
