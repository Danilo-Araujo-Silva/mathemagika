package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             CornerFilter
 *
 * Full name:        System`CornerFilter
 *
 *                   CornerFilter[image] computes a measure for the presence of a corner for each pixel in image and returns the result as an intensity image.
 * Usage:            CornerFilter[image, r] detects corners at a pixel range r.
 *
 * Options:          Method -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CornerFilter
 * Documentation:    web: http://reference.wolfram.com/language/ref/CornerFilter.html
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
fun cornerFilter(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CornerFilter", arguments.toMutableList(), options)
}
