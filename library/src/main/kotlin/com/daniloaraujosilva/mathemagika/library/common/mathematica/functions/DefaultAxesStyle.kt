package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             DefaultAxesStyle
 *
 * Full name:        System`DefaultAxesStyle
 *
 * Usage:            DefaultAxesStyle is a low-level option for graphics functions that specifies the default style to use in displaying axes and axes-like constructs.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/DefaultAxesStyle
 * Documentation:    web: http://reference.wolfram.com/language/ref/DefaultAxesStyle.html
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
fun defaultAxesStyle(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DefaultAxesStyle", arguments.toMutableList(), options)
}
