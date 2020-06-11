package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Censoring
 *
 * Full name:        System`Censoring
 *
 *                   Censoring[t, c] represents a censored event time t with censoring c.
 *                   Censoring[{t , t , …}, c] represents a vector of censored event times t  with censoring c.
 *                               1   2                                                      i
 *                   Censoring[{t , t , …}, {c , c , …}] represents a vector of event times t  with corresponding censoring c .
 * Usage:                        1   2        1   2                                          i                               i
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Censoring
 * Documentation:    web: http://reference.wolfram.com/language/ref/Censoring.html
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
fun censoring(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Censoring", arguments.toMutableList(), options)
}
