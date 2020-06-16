package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ImageType
 *
 * Full name:        System`ImageType
 *
 * Usage:            ImageType[image] gives the underlying type of values used for each pixel element in the Image or Image3D object image.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ImageType
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImageType.html
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
fun imageType(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImageType", arguments.toMutableList(), options)
}
