package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             QuantityVariablePhysicalQuantity
 *
 * Full name:        System`QuantityVariablePhysicalQuantity
 *
 * Usage:            QuantityVariablePhysicalQuantity[var] returns the physical quantity associated with the quantity variable var.
 *
 * Options:          None
 *
 *                   Listable
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/QuantityVariablePhysicalQuantity
 * Documentation:    web: http://reference.wolfram.com/language/ref/QuantityVariablePhysicalQuantity.html
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
fun quantityVariablePhysicalQuantity(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("QuantityVariablePhysicalQuantity", arguments.toMutableList(), options)
}
