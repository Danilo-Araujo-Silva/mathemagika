package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             DelimitedSequence
 *
 * Full name:        System`DelimitedSequence
 *
 *                   DelimitedSequence[form] represents a delimited sequence of elements of the specified form in Interpreter and related functions.
 *                   DelimitedSequence[form, sep] assumes a separator that matches sep.
 * Usage:            DelimitedSequence[form, {left, sep, right}] assumes left and right delimiters matching left and right, respectively.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DelimitedSequence
 * Documentation:    web: http://reference.wolfram.com/language/ref/DelimitedSequence.html
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
fun delimitedSequence(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DelimitedSequence", arguments.toMutableList(), options)
}
