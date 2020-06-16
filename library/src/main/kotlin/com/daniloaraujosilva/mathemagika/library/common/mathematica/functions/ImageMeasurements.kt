package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ImageMeasurements
 *
 * Full name:        System`ImageMeasurements
 *
 *                   ImageMeasurements[image, "prop"] returns the value of property "prop" for the entire image.
 *                   ImageMeasurements[image, "prop", format] returns the values in the specified output format.
 *                   ImageMeasurements[{image , image , …}, …] returns measurements for all image .
 * Usage:                                    1       2                                           i
 *
 *                   Masking -> All
 * Options:          CornerNeighbors -> True
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ImageMeasurements
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImageMeasurements.html
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
fun imageMeasurements(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImageMeasurements", arguments.toMutableList(), options)
}
