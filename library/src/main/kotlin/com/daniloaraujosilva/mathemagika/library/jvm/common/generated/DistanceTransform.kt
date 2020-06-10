package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             DistanceTransform
 * 
 * Full name:        System`DistanceTransform
 * 
 *                   DistanceTransform[image] gives the distance transform of image, in which the value of each pixel is replaced by its distance to the nearest background pixel.
 * Usage:            DistanceTransform[image, t] treats values above t as foreground.
 * 
 *                   DistanceFunction -> EuclideanDistance
 * Options:          Padding -> 1
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/DistanceTransform
 * Documentation:    web: http://reference.wolfram.com/language/ref/DistanceTransform.html
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
fun distanceTransform(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DistanceTransform", arguments.toMutableList(), options)
}
