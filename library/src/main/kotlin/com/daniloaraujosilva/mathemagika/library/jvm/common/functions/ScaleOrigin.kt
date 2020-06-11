package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ScaleOrigin
 *
 * Full name:        System`ScaleOrigin
 *
 * Usage:            ScaleOrigin is an option for gauge functions that describes how to position the scale on the gauge.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ScaleOrigin
 * Documentation:    web: http://reference.wolfram.com/language/ref/ScaleOrigin.html
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
fun scaleOrigin(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ScaleOrigin", arguments.toMutableList(), options)
}
