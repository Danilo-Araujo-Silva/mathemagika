package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ItemAspectRatio
 *
 * Full name:        System`ItemAspectRatio
 *
 * Usage:            ItemAspectRatio is an option for GraphicsGrid which specifies the ratio of height to width for the regions in which items are placed in the graphics grid.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ItemAspectRatio
 * Documentation:    web: http://reference.wolfram.com/language/ref/ItemAspectRatio.html
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
fun itemAspectRatio(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ItemAspectRatio", arguments.toMutableList(), options)
}
