package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ImageContents
 *
 * Full name:        System`ImageContents
 *
 *                   ImageContents[image] gives a dataset of identified entities in image.
 *                   ImageContents[image, category] gives a dataset that only contains entities in the specified category.
 * Usage:            ImageContents[image, category, prop] includes the properties prop for each identified object.
 *
 *                   AcceptanceThreshold -> Automatic
 *                   MaxFeatures -> Infinity
 *                   MaxOverlapFraction -> Automatic
 * Options:          TargetDevice -> CPU
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ImageContents
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImageContents.html
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
fun imageContents(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImageContents", arguments.toMutableList(), options)
}
