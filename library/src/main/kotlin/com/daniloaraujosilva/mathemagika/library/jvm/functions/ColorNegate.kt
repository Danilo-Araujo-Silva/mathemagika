package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ColorNegate
 *
 * Full name:        System`ColorNegate
 *
 *                   ColorNegate[image] gives the negative of image, in which all colors have been negated.
 *                   ColorNegate[color] gives the negative of a color.
 *                   ColorNegate[{expr , …}] gives a list of negative images or colors.
 * Usage:                             1
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ColorNegate
 * Documentation:    web: http://reference.wolfram.com/language/ref/ColorNegate.html
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
fun colorNegate(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ColorNegate", arguments.toMutableList(), options)
}
