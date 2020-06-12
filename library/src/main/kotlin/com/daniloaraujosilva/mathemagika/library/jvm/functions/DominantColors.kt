package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DominantColors
 *
 * Full name:        System`DominantColors
 *
 *                   DominantColors[image] returns dominant colors in image.
 *                   DominantColors[image, n] returns at most n dominant colors in image.
 *                   DominantColors[image, n, prop] returns the specified property prop for the regions that belong to the same dominant color.
 *                   DominantColors[image, n, prop, format] returns the output in the specified format.
 *                   DominantColors[{image , image , …}, …] returns dominant colors in each image .
 * Usage:                                 1       2                                              i
 *
 *                   ColorCoverage -> Automatic
 *                   DistanceFunction -> Automatic
 *                   Masking -> All
 *                   Method -> Automatic
 * Options:          MinColorDistance -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DominantColors
 * Documentation:    web: http://reference.wolfram.com/language/ref/DominantColors.html
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
fun dominantColors(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DominantColors", arguments.toMutableList(), options)
}
