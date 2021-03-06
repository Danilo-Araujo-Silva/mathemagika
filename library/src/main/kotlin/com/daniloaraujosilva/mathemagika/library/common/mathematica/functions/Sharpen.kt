package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Sharpen
 *
 * Full name:        System`Sharpen
 *
 *                   Sharpen[image] gives a sharpened version of image.
 * Usage:            Sharpen[image, r] gives a version of image sharpened over pixel radius r.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Sharpen
 * Documentation:    web: http://reference.wolfram.com/language/ref/Sharpen.html
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
fun sharpen(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Sharpen", arguments.toMutableList(), options)
}
