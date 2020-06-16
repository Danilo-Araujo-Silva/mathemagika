package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ImageData
 *
 * Full name:        System`ImageData
 *
 *                   ImageData[image] gives the array of pixel values in an Image or Image3D object image.
 * Usage:            ImageData[image, "type"] gives the array of pixel values converted to the specified type.
 *
 *                   DataReversed -> False
 * Options:          Interleaving -> True
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ImageData
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImageData.html
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
fun imageData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImageData", arguments.toMutableList(), options)
}
