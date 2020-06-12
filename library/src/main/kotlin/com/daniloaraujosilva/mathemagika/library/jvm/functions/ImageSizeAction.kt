package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ImageSizeAction
 *
 * Full name:        System`ImageSizeAction
 *
 * Usage:            ImageSizeAction is an option for Pane and related constructs that specifies what to do if the specified ImageSize setting does not match the size of the contents.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ImageSizeAction
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImageSizeAction.html
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
fun imageSizeAction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImageSizeAction", arguments.toMutableList(), options)
}
