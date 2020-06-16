package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             DefaultFrameStyle
 *
 * Full name:        System`DefaultFrameStyle
 *
 * Usage:            DefaultFrameStyle is a low-level option for graphics and related constructs that specifies the default style to use in displaying their frames.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/DefaultFrameStyle
 * Documentation:    web: http://reference.wolfram.com/language/ref/DefaultFrameStyle.html
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
fun defaultFrameStyle(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DefaultFrameStyle", arguments.toMutableList(), options)
}
