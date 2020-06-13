package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ImageFeatureTrack
 *
 * Full name:        System`ImageFeatureTrack
 *
 *                   ImageFeatureTrack[{image , image , …, image }] tracks features from image  through image .
 *                                           1       2          n                             1              n
 *                   ImageFeatureTrack[{image , image , …, image }, pts] tracks features starting from the initial set of points pts in image .
 * Usage:                                    1       2          n                                                                            1
 *
 *                   Masking -> All
 *                   MaxFeatureDisplacement -> 15
 *                   MaxFeatures -> Automatic
 *                   MaxIterations -> 20
 * Options:          Tolerance -> 0.03
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ImageFeatureTrack
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImageFeatureTrack.html
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
fun imageFeatureTrack(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImageFeatureTrack", arguments.toMutableList(), options)
}
