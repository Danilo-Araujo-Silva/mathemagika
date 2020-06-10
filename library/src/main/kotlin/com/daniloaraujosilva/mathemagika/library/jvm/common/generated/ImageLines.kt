package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ImageLines
 * 
 * Full name:        System`ImageLines
 * 
 *                   ImageLines[image] finds line segments in image and returns the coordinates of their endpoints.
 *                   ImageLines[image, t] uses the threshold t for selecting image lines.
 * Usage:            ImageLines[image, t, d] uses the parameter d to control the distinctness of the detected lines.
 * 
 *                   MaxFeatures -> All
 * Options:          Method -> Hough
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/ImageLines
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImageLines.html
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
fun imageLines(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImageLines", arguments.toMutableList(), options)
}
