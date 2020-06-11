package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             MaxDetect
 *
 * Full name:        System`MaxDetect
 *
 *                   MaxDetect[image] gives a binary image in which white pixels correspond to constant extended maxima in image.
 *                   MaxDetect[image, h] finds extended maxima where the range of values is not greater than h.
 * Usage:            MaxDetect[data, …] applies maxima detection to an array of data.
 *
 *                   CornerNeighbors -> True
 * Options:          Padding -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MaxDetect
 * Documentation:    web: http://reference.wolfram.com/language/ref/MaxDetect.html
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
fun maxDetect(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MaxDetect", arguments.toMutableList(), options)
}
