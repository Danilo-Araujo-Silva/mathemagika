package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             QuantityMagnitude
 *
 * Full name:        System`QuantityMagnitude
 *
 *                   QuantityMagnitude[quantity] gives the amount of the specified quantity.
 * Usage:            QuantityMagnitude[quantity, unit] gives the value corresponding to quantity when converted to unit.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/QuantityMagnitude
 * Documentation:    web: http://reference.wolfram.com/language/ref/QuantityMagnitude.html
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
fun quantityMagnitude(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("QuantityMagnitude", arguments.toMutableList(), options)
}
