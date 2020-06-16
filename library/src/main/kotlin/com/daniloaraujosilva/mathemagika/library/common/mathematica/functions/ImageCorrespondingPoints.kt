package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ImageCorrespondingPoints
 *
 * Full name:        System`ImageCorrespondingPoints
 *
 *                   ImageCorrespondingPoints[image , image ] finds a set of matching interest points in image  and image  and returns their pixel coordinates.
 * Usage:                                          1       2                                                  1          2
 *
 *                   KeypointStrength -> Automatic
 *                   Masking -> All
 *                   MaxFeatures -> Automatic
 *                   Method -> SURF
 * Options:          TransformationClass -> None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ImageCorrespondingPoints
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImageCorrespondingPoints.html
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
fun imageCorrespondingPoints(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImageCorrespondingPoints", arguments.toMutableList(), options)
}
