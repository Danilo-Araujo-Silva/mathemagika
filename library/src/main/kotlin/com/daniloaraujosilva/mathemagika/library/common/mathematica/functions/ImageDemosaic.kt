package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ImageDemosaic
 *
 * Full name:        System`ImageDemosaic
 *
 * Usage:            ImageDemosaic[image, {"cfa", {row, col}}] reconstructs a color image using the specified color filter array "cfa", aligning the top-left pixel of the pattern with the {row, col} pixel of image.
 *
 * Options:          Method -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ImageDemosaic
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImageDemosaic.html
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
fun imageDemosaic(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImageDemosaic", arguments.toMutableList(), options)
}
