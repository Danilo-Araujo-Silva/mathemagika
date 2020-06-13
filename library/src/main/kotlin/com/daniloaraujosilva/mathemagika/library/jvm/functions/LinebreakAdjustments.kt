package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             LinebreakAdjustments
 *
 * Full name:        System`LinebreakAdjustments
 *
 * Usage:            LinebreakAdjustments is an option for selections that sets parameters used for calculating where automatic line breaks should be inserted.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/LinebreakAdjustments
 * Documentation:    web: http://reference.wolfram.com/language/ref/LinebreakAdjustments.html
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
fun linebreakAdjustments(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LinebreakAdjustments", arguments.toMutableList(), options)
}
