package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ImagePosition
 *
 * Full name:        System`ImagePosition
 *
 *                   ImagePosition[image] gives an association of image positions for each identified category of objects in image.
 * Usage:            ImagePosition[image, obj] gives a list of image positions for subimages identified as instances of the specified category.
 *
 *                   AcceptanceThreshold -> Automatic
 *                   MaxFeatures -> Infinity
 *                   MaxOverlapFraction -> Automatic
 * Options:          TargetDevice -> CPU
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ImagePosition
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImagePosition.html
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
fun imagePosition(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImagePosition", arguments.toMutableList(), options)
}
