package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ImageKeypoints
 *
 * Full name:        System`ImageKeypoints
 *
 *                   ImageKeypoints[image] finds key features in image and returns their coordinates.
 * Usage:            ImageKeypoints[image, prop] gives the specified property prop for each keypoint.
 *
 *                   KeypointStrength -> 0.
 *                   Masking -> All
 *                   MaxFeatures -> All
 * Options:          Method -> SURF
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ImageKeypoints
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImageKeypoints.html
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
fun imageKeypoints(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImageKeypoints", arguments.toMutableList(), options)
}
