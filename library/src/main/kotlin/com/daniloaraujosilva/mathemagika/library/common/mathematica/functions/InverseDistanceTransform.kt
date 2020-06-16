package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             InverseDistanceTransform
 *
 * Full name:        System`InverseDistanceTransform
 *
 * Usage:            InverseDistanceTransform[image] gives the inverse distance transform of image, returning the result as a binary image.
 *
 * Options:          DistanceFunction -> EuclideanDistance
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/InverseDistanceTransform
 * Documentation:    web: http://reference.wolfram.com/language/ref/InverseDistanceTransform.html
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
fun inverseDistanceTransform(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("InverseDistanceTransform", arguments.toMutableList(), options)
}
