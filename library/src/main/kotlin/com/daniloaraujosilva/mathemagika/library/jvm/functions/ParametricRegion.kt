package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ParametricRegion
 *
 * Full name:        System`ParametricRegion
 *
 *                                                                                      n
 *                   ParametricRegion[{f , …, f }, {u , …, u }] represents a region in   given by the points {f , …, f } for parameters u  ∈ .
 *                                      1      n     1      m                                                   1      n                  i
 *                   ParametricRegion[{f , …, f }, {{u , a , b }, …}] constrains parameters to an interval a  ≤ u  ≤ b  etc.
 *                                      1      n      1   1   1                                             1    1    1
 *                   ParametricRegion[{{f , …, f }, cond}, …] constrains parameters to satisfy the condition cond.
 * Usage:                                1      n
 *
 * Options:          None
 *
 *                   HoldAll
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ParametricRegion
 * Documentation:    web: http://reference.wolfram.com/language/ref/ParametricRegion.html
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
fun parametricRegion(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ParametricRegion", arguments.toMutableList(), options)
}
