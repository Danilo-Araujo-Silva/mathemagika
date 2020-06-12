package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ImageContainsQ
 *
 * Full name:        System`ImageContainsQ
 *
 *                   ImageContainsQ[image, category] returns True if an instance of the specified category is detected in image.
 *                   ImageContainsQ[image, {category , category , …}] returns True if at least one instance of each of the category  is detected in image.
 *                                                  1          2                                                                   i
 *                   ImageContainsQ[image, category  | category  | …] returns True if image contains an instance of at least one of category .
 * Usage:                                          1           2                                                                            i
 *
 *                   AcceptanceThreshold -> Automatic
 *                   MaxFeatures -> Infinity
 *                   MaxOverlapFraction -> Automatic
 * Options:          TargetDevice -> CPU
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ImageContainsQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImageContainsQ.html
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
fun imageContainsQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImageContainsQ", arguments.toMutableList(), options)
}
