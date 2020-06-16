package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Scale
 *
 * Full name:        System`Scale
 *
 *                   Scale[g, s] represents graphics primitives g scaled by a factor s.
 *                   Scale[g, s, {x, y, …}] scales with the point {x, y, …} kept fixed.
 *                   Scale[g, {s , s , …}, …] scales by different factors along different axes.
 * Usage:                       x   y
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Scale
 * Documentation:    web: http://reference.wolfram.com/language/ref/Scale.html
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
fun scale(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Scale", arguments.toMutableList(), options)
}
