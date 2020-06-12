package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             UnitDimensions
 *
 * Full name:        System`UnitDimensions
 *
 *                   UnitDimensions[unit] returns a list of base dimensions associated with the specified unit.
 * Usage:            UnitDimensions[quantity] returns a list of base dimensions associated with the unit of the specified quantity.
 *
 * Options:          None
 *
 *                   Listable
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/UnitDimensions
 * Documentation:    web: http://reference.wolfram.com/language/ref/UnitDimensions.html
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
fun unitDimensions(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("UnitDimensions", arguments.toMutableList(), options)
}
