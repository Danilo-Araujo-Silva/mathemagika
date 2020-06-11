package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             PixelValue
 *
 * Full name:        System`PixelValue
 *
 *                   PixelValue[image, ppos] gives the pixel value of image at position pos.
 * Usage:            PixelValue[image, ppos, "type"] gives the pixel value converted to the specified type.
 *
 * Options:          Padding -> 0
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PixelValue
 * Documentation:    web: http://reference.wolfram.com/language/ref/PixelValue.html
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
fun pixelValue(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PixelValue", arguments.toMutableList(), options)
}
