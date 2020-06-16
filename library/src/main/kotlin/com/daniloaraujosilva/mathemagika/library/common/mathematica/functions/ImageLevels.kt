package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ImageLevels
 *
 * Full name:        System`ImageLevels
 *
 *                   ImageLevels[image] gives a list of pixel values and counts for each channel in image.
 *                   ImageLevels[image, bspec] bins pixel values using bin specification bspec.
 * Usage:            ImageLevels[image, bspec, range] gives counts for bins in the given range.
 *
 * Options:          Method -> IncludeOutOfRange
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ImageLevels
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImageLevels.html
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
fun imageLevels(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImageLevels", arguments.toMutableList(), options)
}
