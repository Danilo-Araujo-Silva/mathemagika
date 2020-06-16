package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Quantity
 *
 * Full name:        System`Quantity
 *
 *                   Quantity[magnitude, unit] represents a quantity with size magnitude and unit specified by unit.
 * Usage:            Quantity[unit] assumes the magnitude of the specified unit to be 1.
 *
 * Options:          None
 *
 *                   HoldRest
 *                   NHoldRest
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Quantity
 * Documentation:    web: http://reference.wolfram.com/language/ref/Quantity.html
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
fun quantity(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Quantity", arguments.toMutableList(), options)
}
