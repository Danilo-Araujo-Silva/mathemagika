package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             IndependentUnitDimension
 *
 * Full name:        System`IndependentUnitDimension
 *
 * Usage:            IndependentUnitDimension[dim] represents the base dimension dim associated with an independent physical quantity or unit.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/IndependentUnitDimension
 * Documentation:    web: http://reference.wolfram.com/language/ref/IndependentUnitDimension.html
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
fun independentUnitDimension(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("IndependentUnitDimension", arguments.toMutableList(), options)
}
