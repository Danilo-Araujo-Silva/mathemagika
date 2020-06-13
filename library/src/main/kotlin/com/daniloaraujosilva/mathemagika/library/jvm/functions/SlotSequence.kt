package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             SlotSequence
 *
 * Full name:        System`SlotSequence
 *
 *                   ## represents the sequence of arguments supplied to a pure function.
 *                                                                                                               th
 * Usage:            ##n represents the sequence of arguments supplied to a pure function, starting with the n   argument.
 *
 * Options:          None
 *
 *                   NHoldAll
 * Attributes:       Protected
 *
 *                   local: paclet:ref/SlotSequence
 * Documentation:    web: http://reference.wolfram.com/language/ref/SlotSequence.html
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
fun slotSequence(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SlotSequence", arguments.toMutableList(), options)
}
