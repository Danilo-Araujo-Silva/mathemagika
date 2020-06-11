package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             BlankNullSequence
 *
 * Full name:        System`BlankNullSequence
 *
 *                   ___ (three _ characters) or BlankNullSequence[] is a pattern object that can stand for any sequence of zero or more Wolfram Language expressions.
 * Usage:            ___h or BlankNullSequence[h] can stand for any sequence of expressions, all of which have head h.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/BlankNullSequence
 * Documentation:    web: http://reference.wolfram.com/language/ref/BlankNullSequence.html
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
fun blankNullSequence(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BlankNullSequence", arguments.toMutableList(), options)
}
