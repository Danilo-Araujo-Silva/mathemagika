package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             IntervalUnion
 *
 * Full name:        System`IntervalUnion
 *
 *                   IntervalUnion[interval , interval , …] gives the interval representing the set of all points in any of the interval .
 * Usage:                                  1          2                                                                                 i
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/IntervalUnion
 * Documentation:    web: http://reference.wolfram.com/language/ref/IntervalUnion.html
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
fun intervalUnion(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("IntervalUnion", arguments.toMutableList(), options)
}
