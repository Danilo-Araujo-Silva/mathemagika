package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Decrement
 *
 * Full name:        System`Decrement
 *
 * Usage:            x -- decreases the value of x by 1, returning the old value of x.
 *
 * Options:          None
 *
 *                   HoldFirst
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Decrement
 * Documentation:    web: http://reference.wolfram.com/language/ref/Decrement.html
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
fun decrement(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Decrement", arguments.toMutableList(), options)
}
