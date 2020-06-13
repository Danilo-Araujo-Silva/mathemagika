package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             SequenceCount
 *
 * Full name:        System`SequenceCount
 *
 *                   SequenceCount[list, sub] gives a count of the number of times sub appears as a sublist of list.
 * Usage:            SequenceCount[list, patt] gives the number of sublists in list that match the general sequence pattern patt.
 *
 * Options:          Overlaps -> False
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SequenceCount
 * Documentation:    web: http://reference.wolfram.com/language/ref/SequenceCount.html
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
fun sequenceCount(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SequenceCount", arguments.toMutableList(), options)
}
