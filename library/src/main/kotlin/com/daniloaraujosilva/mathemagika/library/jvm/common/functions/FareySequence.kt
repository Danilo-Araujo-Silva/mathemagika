package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FareySequence
 *
 * Full name:        System`FareySequence
 *
 *                   FareySequence[n] generates the Farey sequence of order n.
 *                                                   th
 * Usage:            FareySequence[n, k] gives the k   element of the Farey sequence of order n.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FareySequence
 * Documentation:    web: http://reference.wolfram.com/language/ref/FareySequence.html
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
fun fareySequence(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FareySequence", arguments.toMutableList(), options)
}
