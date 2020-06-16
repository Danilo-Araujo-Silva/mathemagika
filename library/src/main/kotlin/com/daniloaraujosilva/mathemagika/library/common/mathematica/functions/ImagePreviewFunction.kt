package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ImagePreviewFunction
 *
 * Full name:        System`ImagePreviewFunction
 *
 * Usage:            ImagePreviewFunction is an option for CurrentImage and similar functions that specifies the function to apply to images before being displayed.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ImagePreviewFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImagePreviewFunction.html
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
fun imagePreviewFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImagePreviewFunction", arguments.toMutableList(), options)
}
