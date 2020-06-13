package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             AdjustmentBox
 *
 * Full name:        System`AdjustmentBox
 *
 * Usage:            AdjustmentBox[box, opts] is a low-level box construct which displays with the placement of box adjusted using the options given.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AdjustmentBox
 * Documentation:    web: http://reference.wolfram.com/language/ref/AdjustmentBox.html
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
fun adjustmentBox(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AdjustmentBox", arguments.toMutableList(), options)
}
