package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Blur
 *
 * Full name:        System`Blur
 *
 *                   Blur[image] gives a blurred version of image.
 * Usage:            Blur[image, r] gives a version of image blurred over pixel radius r.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Blur
 * Documentation:    web: http://reference.wolfram.com/language/ref/Blur.html
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
fun blur(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Blur", arguments.toMutableList(), options)
}
