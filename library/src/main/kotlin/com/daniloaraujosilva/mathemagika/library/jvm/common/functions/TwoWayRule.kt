package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             TwoWayRule
 *
 * Full name:        System`TwoWayRule
 *
 * Usage:            x<->y or x  y represents a two-way rule expressing exchange or correspondence of x and y.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/TwoWayRule
 * Documentation:    web: http://reference.wolfram.com/language/ref/TwoWayRule.html
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
fun twoWayRule(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TwoWayRule", arguments.toMutableList(), options)
}
