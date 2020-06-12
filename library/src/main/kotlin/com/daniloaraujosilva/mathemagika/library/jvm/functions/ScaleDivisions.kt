package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ScaleDivisions
 *
 * Full name:        System`ScaleDivisions
 *
 * Usage:            ScaleDivisions is an option for gauge functions that specifies how many tick marks should be drawn on the scale.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ScaleDivisions
 * Documentation:    web: http://reference.wolfram.com/language/ref/ScaleDivisions.html
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
fun scaleDivisions(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ScaleDivisions", arguments.toMutableList(), options)
}
