package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ColorDistance
 *
 * Full name:        System`ColorDistance
 *
 *                   ColorDistance[c , c ] gives the approximate perceptual distance between color directives c  and c .
 *                                  1   2                                                                      1      2
 *                   ColorDistance[list, c] gives color distances between elements of list and c.
 *                   ColorDistance[list , list ] gives color distances between corresponding elements of list  and list .
 *                                     1      2                                                              1         2
 *                   ColorDistance[image, c] gives an image whose pixel values are color distance between pixels in image and the color c.
 *                   ColorDistance[image , image ] yields an image giving the pixelwise color distance between image  and image .
 * Usage:                               1       2                                                                   1          2
 *
 * Options:          DistanceFunction -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ColorDistance
 * Documentation:    web: http://reference.wolfram.com/language/ref/ColorDistance.html
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
fun colorDistance(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ColorDistance", arguments.toMutableList(), options)
}
