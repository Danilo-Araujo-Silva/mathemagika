package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             BoxBaselineShift
 *
 * Full name:        System`BoxBaselineShift
 *
 * Usage:            BoxBaselineShift is an option for AdjustmentBox that specifies how much the baseline of the box should be shifted relative to those of neighboring characters.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/BoxBaselineShift
 * Documentation:    web: http://reference.wolfram.com/language/ref/BoxBaselineShift.html
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
fun boxBaselineShift(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BoxBaselineShift", arguments.toMutableList(), options)
}
