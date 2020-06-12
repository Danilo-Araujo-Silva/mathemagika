package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             MinDetect
 *
 * Full name:        System`MinDetect
 *
 *                   MinDetect[image] gives a binary image in which white pixels correspond to constant extended minima in image.
 *                   MinDetect[image, h] finds extended minima where the range of values is not greater than h.
 * Usage:            MinDetect[data, …] applies minima detection to an array of data.
 *
 *                   CornerNeighbors -> True
 * Options:          Padding -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MinDetect
 * Documentation:    web: http://reference.wolfram.com/language/ref/MinDetect.html
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
fun minDetect(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MinDetect", arguments.toMutableList(), options)
}
