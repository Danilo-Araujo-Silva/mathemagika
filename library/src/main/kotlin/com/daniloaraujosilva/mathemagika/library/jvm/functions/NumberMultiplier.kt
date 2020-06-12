package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             NumberMultiplier
 *
 * Full name:        System`NumberMultiplier
 *
 * Usage:            NumberMultiplier is an option for NumberForm and related functions which gives the string to use as a multiplication sign in scientific notation.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/NumberMultiplier
 * Documentation:    web: http://reference.wolfram.com/language/ref/NumberMultiplier.html
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
fun numberMultiplier(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NumberMultiplier", arguments.toMutableList(), options)
}
