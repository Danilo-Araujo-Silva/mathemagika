package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Cycles
 *
 * Full name:        System`Cycles
 *
 *                   Cycles[{cyc , cyc , …}] represents a permutation with disjoint cycles cyc .
 * Usage:                       1     2                                                       i
 *
 * Options:          None
 *
 *                   NHoldAll
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Cycles
 * Documentation:    web: http://reference.wolfram.com/language/ref/Cycles.html
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
fun cycles(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Cycles", arguments.toMutableList(), options)
}
