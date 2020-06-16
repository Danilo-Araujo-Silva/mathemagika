package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             SequenceSplit
 *
 * Full name:        System`SequenceSplit
 *
 *                   SequenceSplit[list, patt] splits list into sublists separated by sequences that match the sequence pattern patt.
 *                   SequenceSplit[list, patt  rhs] inserts rhs at the position of each matched sequence.
 *                   SequenceSplit[list, {patt   rhs , …}] inserts rhs  at the position of each patt .
 *                                            1      1                 i                             i
 * Usage:            SequenceSplit[list, patt, n] splits into at most n sublists.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SequenceSplit
 * Documentation:    web: http://reference.wolfram.com/language/ref/SequenceSplit.html
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
fun sequenceSplit(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SequenceSplit", arguments.toMutableList(), options)
}
