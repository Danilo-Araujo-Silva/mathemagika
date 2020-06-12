package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             QuantityVariable
 *
 * Full name:        System`QuantityVariable
 *
 *                   QuantityVariable[var, "pq"] represents a variable with the label var and the corresponding physical quantity "pq".
 * Usage:            QuantityVariable["pq"] represents the unlabeled physical quantity "pq".
 *
 * Options:          None
 *
 *                   HoldRest
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/QuantityVariable
 * Documentation:    web: http://reference.wolfram.com/language/ref/QuantityVariable.html
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
fun quantityVariable(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("QuantityVariable", arguments.toMutableList(), options)
}
