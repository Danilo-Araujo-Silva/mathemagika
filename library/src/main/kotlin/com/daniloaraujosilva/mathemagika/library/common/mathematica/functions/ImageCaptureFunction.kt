package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ImageCaptureFunction
 *
 * Full name:        System`ImageCaptureFunction
 *
 * Usage:            ImageCaptureFunction is an option for ImageCapture that specifies the function to apply to images acquired by the imaging device.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ImageCaptureFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImageCaptureFunction.html
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
fun imageCaptureFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImageCaptureFunction", arguments.toMutableList(), options)
}
