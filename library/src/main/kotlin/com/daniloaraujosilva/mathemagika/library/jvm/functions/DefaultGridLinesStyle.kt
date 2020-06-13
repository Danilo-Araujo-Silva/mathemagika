package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             DefaultGridLinesStyle
 *
 * Full name:        System`DefaultGridLinesStyle
 *
 * Usage:            DefaultGridLinesStyle is a low-level option for 2D graphics functions that specifies the default style to use in rendering grid lines.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/DefaultGridLinesStyle
 * Documentation:    web: http://reference.wolfram.com/language/ref/DefaultGridLinesStyle.html
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
fun defaultGridLinesStyle(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DefaultGridLinesStyle", arguments.toMutableList(), options)
}
