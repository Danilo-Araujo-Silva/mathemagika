package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ImageDistance
 *
 * Full name:        System`ImageDistance
 *
 *                   ImageDistance[image , image ] returns a distance measure between image  and image .
 *                                      1       2                                          1          2
 *                   ImageDistance[image , image , pos] places the center of image  at position pos in image .
 *                                      1       2                                 2                         1
 *                   ImageDistance[image , image , pos , pos ] places the point pos  of image  at position pos  in image .
 * Usage:                               1       2     1     2                      2         2                1         1
 *
 *                   DistanceFunction -> EuclideanDistance
 * Options:          Masking -> All
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ImageDistance
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImageDistance.html
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
fun imageDistance(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImageDistance", arguments.toMutableList(), options)
}
