package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             GapPenalty
 *
 * Full name:        System`GapPenalty
 *
 * Usage:            GapPenalty is an option for SequenceAlignment and related functions that gives the additional cost associated with each gap corresponding to a run of insertions or deletions.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/GapPenalty
 * Documentation:    web: http://reference.wolfram.com/language/ref/GapPenalty.html
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
fun gapPenalty(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GapPenalty", arguments.toMutableList(), options)
}
