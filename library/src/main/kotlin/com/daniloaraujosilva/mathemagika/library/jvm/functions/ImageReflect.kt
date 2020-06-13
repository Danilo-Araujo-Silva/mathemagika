package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ImageReflect
 *
 * Full name:        System`ImageReflect
 *
 *                   ImageReflect[image] reverses image by top-bottom mirror reflection.
 *                   ImageReflect[image, side] reverses image by reflecting it so that the specified side goes to the opposite side.
 *                   ImageReflect[image, side   side ] reflects image so that side  is interchanged with side .
 * Usage:                                    1       2                             1                          2
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ImageReflect
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImageReflect.html
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
fun imageReflect(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImageReflect", arguments.toMutableList(), options)
}
