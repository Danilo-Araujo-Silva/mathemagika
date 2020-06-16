package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             SkeletonTransform
 *
 * Full name:        System`SkeletonTransform
 *
 *                   SkeletonTransform[image] gives the skeleton transform of image, in which the value of each skeleton pixel is its distance to the nearest background pixel.
 * Usage:            SkeletonTransform[image, t] treats values above t as foreground.
 *
 *                   Padding -> 0
 * Options:          Method -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SkeletonTransform
 * Documentation:    web: http://reference.wolfram.com/language/ref/SkeletonTransform.html
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
fun skeletonTransform(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SkeletonTransform", arguments.toMutableList(), options)
}
