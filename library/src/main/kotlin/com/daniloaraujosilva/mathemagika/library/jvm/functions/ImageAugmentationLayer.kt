package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ImageAugmentationLayer
 *
 * Full name:        System`ImageAugmentationLayer
 *
 * Usage:            ImageAugmentationLayer[{h, w}] represents a net layer that applies random image transformations to produce images of height h and width w.
 *
 *                   Input -> Automatic
 *                   Output -> Automatic
 * Options:          ReflectionProbabilities -> {0, 0}
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ImageAugmentationLayer
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImageAugmentationLayer.html
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
fun imageAugmentationLayer(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImageAugmentationLayer", arguments.toMutableList(), options)
}
