package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             GraphicsSpacing
 *
 * Full name:        System`GraphicsSpacing
 *
 * Usage:            GraphicsSpacing is an option for GraphicsArray that specifies the spacing between elements in the array.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/GraphicsSpacing
 * Documentation:    web: http://reference.wolfram.com/language/ref/GraphicsSpacing.html
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
fun graphicsSpacing(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GraphicsSpacing", arguments.toMutableList(), options)
}
