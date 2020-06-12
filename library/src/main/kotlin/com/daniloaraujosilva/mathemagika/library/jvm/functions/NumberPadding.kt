package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             NumberPadding
 *
 * Full name:        System`NumberPadding
 *
 * Usage:            NumberPadding is an option for NumberForm and related functions which gives strings to use as padding on the left‐ and right‐hand sides of numbers.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/NumberPadding
 * Documentation:    web: http://reference.wolfram.com/language/ref/NumberPadding.html
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
fun numberPadding(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NumberPadding", arguments.toMutableList(), options)
}
