package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             SequencePosition
 *
 * Full name:        System`SequencePosition
 *
 *                   SequencePosition[list, sublist] gives a list of the starting and ending positions at which sublist appears in list.
 *                   SequencePosition[list, patt] gives all positions at which sequences matching patt occur in list.
 * Usage:            SequencePosition[list, patt, n] includes only the first n occurrences of patt.
 *
 * Options:          Overlaps -> True
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SequencePosition
 * Documentation:    web: http://reference.wolfram.com/language/ref/SequencePosition.html
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
fun sequencePosition(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SequencePosition", arguments.toMutableList(), options)
}
