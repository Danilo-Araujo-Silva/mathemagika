package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ImageValue
 *
 * Full name:        System`ImageValue
 *
 *                   ImageValue[image, pos] gives the interpolated value of image at position pos.
 * Usage:            ImageValue[image, pos, "type"] gives the value converted to the specified type.
 *
 *                   DataRange -> Full
 *                   Padding -> 0
 * Options:          Resampling -> Linear
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ImageValue
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImageValue.html
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
fun imageValue(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImageValue", arguments.toMutableList(), options)
}
