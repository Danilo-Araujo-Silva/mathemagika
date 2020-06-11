package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ImagePad
 *
 * Full name:        System`ImagePad
 *
 *                   ImagePad[image, m] pads image on all sides with m background pixels.
 *                   ImagePad[image, m, padding] pads image on all sides using the value or method specified by padding.
 *                   ImagePad[image, {{left, right}, {bottom, top}}, …] pads image with the specified numbers of pixels on each side.
 * Usage:            ImagePad[image, {{left, right}, {front, back}, {bottom, top}}, …] pads a 3D image with the specified numbers of pixels.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ImagePad
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImagePad.html
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
fun imagePad(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImagePad", arguments.toMutableList(), options)
}
