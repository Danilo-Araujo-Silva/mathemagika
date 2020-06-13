package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             SequenceCases
 *
 * Full name:        System`SequenceCases
 *
 *                   SequenceCases[list, patt] gives a list of the sublists in list that match the sequence pattern patt.
 *                   SequenceCases[list, patt  rhs] gives a list of the values of rhs corresponding to sublists that match patt.
 * Usage:            SequenceCases[list, patt, n] includes only the first n matches.
 *
 * Options:          Overlaps -> False
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SequenceCases
 * Documentation:    web: http://reference.wolfram.com/language/ref/SequenceCases.html
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
fun sequenceCases(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SequenceCases", arguments.toMutableList(), options)
}
