package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             IndependentUnit
 *
 * Full name:        System`IndependentUnit
 *
 * Usage:            IndependentUnit[string] represents a unit string with no relationship to other units within a Quantity.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/IndependentUnit
 * Documentation:    web: http://reference.wolfram.com/language/ref/IndependentUnit.html
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
fun independentUnit(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("IndependentUnit", arguments.toMutableList(), options)
}
