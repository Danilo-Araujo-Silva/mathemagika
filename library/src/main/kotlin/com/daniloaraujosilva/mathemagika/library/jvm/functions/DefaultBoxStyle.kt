package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DefaultBoxStyle
 *
 * Full name:        System`DefaultBoxStyle
 *
 * Usage:            DefaultBoxStyle is a low-level option for three-dimensional graphics functions that specifies the default style to use in rendering the bounding box.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/DefaultBoxStyle
 * Documentation:    web: http://reference.wolfram.com/language/ref/DefaultBoxStyle.html
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
fun defaultBoxStyle(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DefaultBoxStyle", arguments.toMutableList(), options)
}
