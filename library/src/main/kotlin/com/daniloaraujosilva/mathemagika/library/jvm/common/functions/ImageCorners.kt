package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ImageCorners
 *
 * Full name:        System`ImageCorners
 *
 *                   ImageCorners[image] finds corners in image and returns their coordinates.
 *                   ImageCorners[image, r] finds corners at a pixel range r.
 *                   ImageCorners[image, r, t] uses a threshold t for selecting corners.
 * Usage:            ImageCorners[image, r, t, d] returns corners that are at least d + 1 pixels apart.
 *
 *                   MaxFeatureDisplacement -> 0
 *                   MaxFeatures -> All
 * Options:          Method -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ImageCorners
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImageCorners.html
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
fun imageCorners(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImageCorners", arguments.toMutableList(), options)
}
