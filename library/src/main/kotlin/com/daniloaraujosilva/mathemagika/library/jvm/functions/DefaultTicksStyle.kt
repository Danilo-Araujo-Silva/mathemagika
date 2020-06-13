package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             DefaultTicksStyle
 *
 * Full name:        System`DefaultTicksStyle
 *
 * Usage:            DefaultTicksStyle is a low-level option for graphics functions that specifies the default style to use in rendering ticks.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/DefaultTicksStyle
 * Documentation:    web: http://reference.wolfram.com/language/ref/DefaultTicksStyle.html
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
fun defaultTicksStyle(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DefaultTicksStyle", arguments.toMutableList(), options)
}
