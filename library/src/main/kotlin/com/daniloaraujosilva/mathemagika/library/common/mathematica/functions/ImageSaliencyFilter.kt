package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ImageSaliencyFilter
 *
 * Full name:        System`ImageSaliencyFilter
 *
 * Usage:            ImageSaliencyFilter[image] returns a saliency map for image.
 *
 * Options:          Method -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ImageSaliencyFilter
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImageSaliencyFilter.html
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
fun imageSaliencyFilter(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImageSaliencyFilter", arguments.toMutableList(), options)
}
