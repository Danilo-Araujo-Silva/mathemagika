package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             PreserveImageOptions
 *
 * Full name:        System`PreserveImageOptions
 *
 * Usage:            PreserveImageOptions is an option to graphics and related functions that specifies whether image size and certain other options should be preserved from the previous version of a graphic if the graphic is replaced by a new one in output.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/PreserveImageOptions
 * Documentation:    web: http://reference.wolfram.com/language/ref/PreserveImageOptions.html
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
fun preserveImageOptions(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PreserveImageOptions", arguments.toMutableList(), options)
}
