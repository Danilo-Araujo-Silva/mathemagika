package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ImageBoundingBoxes
 *
 * Full name:        System`ImageBoundingBoxes
 *
 *                   ImageBoundingBoxes[image] gives an association of lists of bounding boxes for each identified category of objects in image.
 * Usage:            ImageBoundingBoxes[image, category] gives a list of bounding boxes for subimages identified as an instance of the specified category.
 *
 *                   AcceptanceThreshold -> Automatic
 *                   MaxFeatures -> Infinity
 *                   MaxOverlapFraction -> Automatic
 * Options:          TargetDevice -> CPU
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ImageBoundingBoxes
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImageBoundingBoxes.html
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
fun imageBoundingBoxes(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImageBoundingBoxes", arguments.toMutableList(), options)
}
