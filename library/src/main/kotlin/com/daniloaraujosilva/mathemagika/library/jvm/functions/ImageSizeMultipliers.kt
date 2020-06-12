package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ImageSizeMultipliers
 *
 * Full name:        System`ImageSizeMultipliers
 *
 * Usage:            ImageSizeMultipliers is an option that specifies how much smaller to render graphics that appear within other constructs.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ImageSizeMultipliers
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImageSizeMultipliers.html
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
fun imageSizeMultipliers(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImageSizeMultipliers", arguments.toMutableList(), options)
}
