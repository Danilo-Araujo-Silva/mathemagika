package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             AlternateImage
 *
 * Full name:        System`AlternateImage
 *
 * Usage:            AlternateImage is an option to CDFInformation that specifies an image that should be used if the plugin is not available.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/AlternateImage
 * Documentation:    web: http://reference.wolfram.com/language/ref/AlternateImage.html
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
fun alternateImage(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AlternateImage", arguments.toMutableList(), options)
}
