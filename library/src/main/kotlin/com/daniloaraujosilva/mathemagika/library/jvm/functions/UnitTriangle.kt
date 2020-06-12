package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             UnitTriangle
 *
 * Full name:        System`UnitTriangle
 *
 *                   UnitTriangle[x] represents the unit triangle function on the interval  x  ≤ 1 .
 *                   UnitTriangle[x , x , …] represents the multidimensional unit triangle function on the interval  x   ≤ 1.
 * Usage:                          1   2                                                                               i
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 *                   Orderless
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/UnitTriangle
 * Documentation:    web: http://reference.wolfram.com/language/ref/UnitTriangle.html
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
fun unitTriangle(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("UnitTriangle", arguments.toMutableList(), options)
}
