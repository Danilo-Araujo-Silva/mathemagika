package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ImageScaled
 *
 * Full name:        System`ImageScaled
 *
 *                   ImageScaled[{x, y}] gives the position of a graphical object in terms of coordinates scaled to run from 0 to 1 across the whole image region in each direction.
 *                   ImageScaled[{dx, dy}, {x , y }] gives a position obtained by starting at ordinary coordinates {x , y }, then moving by an image‐scaled offset {dx, dy}.
 * Usage:                                    0   0                                                                   0   0
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ImageScaled
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImageScaled.html
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
fun imageScaled(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImageScaled", arguments.toMutableList(), options)
}
