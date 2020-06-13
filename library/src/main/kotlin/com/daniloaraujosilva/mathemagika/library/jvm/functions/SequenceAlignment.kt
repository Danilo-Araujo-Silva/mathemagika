package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             SequenceAlignment
 *
 * Full name:        System`SequenceAlignment
 *
 *                   SequenceAlignment[s , s ] finds an optimal alignment of sequences of elements in the strings or lists s  and s , and yields a list of successive matching and differing sequences.
 * Usage:                               1   2                                                                               1      2
 *
 *                   GapPenalty -> 0
 *                   IgnoreCase -> False
 *                   MergeDifferences -> True
 *                   Method -> Global
 * Options:          SimilarityRules -> Automatic
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/SequenceAlignment
 * Documentation:    web: http://reference.wolfram.com/language/ref/SequenceAlignment.html
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
fun sequenceAlignment(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SequenceAlignment", arguments.toMutableList(), options)
}
