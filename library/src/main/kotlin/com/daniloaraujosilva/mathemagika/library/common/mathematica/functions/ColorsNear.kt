package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ColorsNear
 *
 * Full name:        System`ColorsNear
 *
 *                   ColorsNear[color] represents a region around color.
 *                   ColorsNear[color, d] represents a region with maximum distance d around color.
 * Usage:            ColorsNear[color, d, dfun] uses the specified color distance function dfun.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ColorsNear
 * Documentation:    web: http://reference.wolfram.com/language/ref/ColorsNear.html
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
fun colorsNear(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ColorsNear", arguments.toMutableList(), options)
}
