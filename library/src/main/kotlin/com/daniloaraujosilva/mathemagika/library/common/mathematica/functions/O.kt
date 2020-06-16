package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             O
 *
 * Full name:        System`O
 *
 *                                                      n
 *                   O[x]^n represents a term of order x .
 *                   O[x]^n is generated to represent omitted higher‐order terms in power series.
 *                                                                 n
 *                   O[x, x ]^n represents a term of order (x - x ) .
 * Usage:                  0                                     0
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/O
 * Documentation:    web: http://reference.wolfram.com/language/ref/O.html
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
fun o(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("O", arguments.toMutableList(), options)
}
