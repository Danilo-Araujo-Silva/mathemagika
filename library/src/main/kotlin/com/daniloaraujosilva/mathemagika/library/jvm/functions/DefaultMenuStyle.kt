package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DefaultMenuStyle
 *
 * Full name:        System`DefaultMenuStyle
 *
 * Usage:            DefaultMenuStyle is a low-level option for menu-generating constructs that specifies the default style to use for displaying menu items.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/DefaultMenuStyle
 * Documentation:    web: http://reference.wolfram.com/language/ref/DefaultMenuStyle.html
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
fun defaultMenuStyle(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DefaultMenuStyle", arguments.toMutableList(), options)
}
