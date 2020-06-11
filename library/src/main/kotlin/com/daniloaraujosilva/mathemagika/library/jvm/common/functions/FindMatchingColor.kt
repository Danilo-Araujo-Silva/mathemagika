package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FindMatchingColor
 *
 * Full name:        System`FindMatchingColor
 *
 *                   FindMatchingColor[image, color] returns a color similar to the color that is present in image.
 *                   FindMatchingColor[image, {color , color , …}] returns a list of colors matching each color .
 *                                                  1       2                                                  i
 *                   FindMatchingColor[{image , image , …}, {color , color , …}] returns lists of matching colors for all image .
 * Usage:                                    1       2            1       2                                                    i
 *
 *                   ColorCoverage -> Automatic
 *                   DistanceFunction -> Automatic
 *                   MaxColorDistance -> Automatic
 * Options:          MinColorDistance -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FindMatchingColor
 * Documentation:    web: http://reference.wolfram.com/language/ref/FindMatchingColor.html
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
fun findMatchingColor(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FindMatchingColor", arguments.toMutableList(), options)
}
