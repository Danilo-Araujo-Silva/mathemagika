package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             IndependentPhysicalQuantity
 *
 * Full name:        System`IndependentPhysicalQuantity
 *
 * Usage:            IndependentPhysicalQuantity[string] represents a physical quantity string with no relationship to other physical quantities used in QuantityVariable.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/IndependentPhysicalQuantity
 * Documentation:    web: http://reference.wolfram.com/language/ref/IndependentPhysicalQuantity.html
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
fun independentPhysicalQuantity(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("IndependentPhysicalQuantity", arguments.toMutableList(), options)
}
