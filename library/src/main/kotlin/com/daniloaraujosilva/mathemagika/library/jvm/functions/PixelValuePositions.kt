package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             PixelValuePositions
 *
 * Full name:        System`PixelValuePositions
 *
 *                   PixelValuePositions[image, val] returns a list of pixel positions in image that exactly match the value val.
 * Usage:            PixelValuePositions[image, val, d] returns all pixel positions that have values within a distance d from val.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PixelValuePositions
 * Documentation:    web: http://reference.wolfram.com/language/ref/PixelValuePositions.html
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
fun pixelValuePositions(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PixelValuePositions", arguments.toMutableList(), options)
}
