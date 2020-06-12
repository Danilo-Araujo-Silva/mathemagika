package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ImageValuePositions
 *
 * Full name:        System`ImageValuePositions
 *
 *                   ImageValuePositions[image, val] returns a list of pixel positions in image that exactly match the value val.
 * Usage:            ImageValuePositions[image, val, d] returns all pixel positions that have values within a distance d from val.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ImageValuePositions
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImageValuePositions.html
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
fun imageValuePositions(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImageValuePositions", arguments.toMutableList(), options)
}
