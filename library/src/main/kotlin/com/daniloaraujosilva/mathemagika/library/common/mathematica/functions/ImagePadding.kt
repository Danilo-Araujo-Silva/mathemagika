package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ImagePadding
 *
 * Full name:        System`ImagePadding
 *
 * Usage:            ImagePadding is an option for graphics functions that specifies what absolute extra padding should be left for extended objects such as thick lines and annotations such as tick and axis labels.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ImagePadding
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImagePadding.html
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
fun imagePadding(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImagePadding", arguments.toMutableList(), options)
}
