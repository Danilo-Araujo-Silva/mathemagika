package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FrobeniusSolve
 *
 * Full name:        System`FrobeniusSolve
 *
 *                   FrobeniusSolve[{a , …, a }, b] gives a list of all solutions of the Frobenius equation a  x  + … + a  x  = b.
 *                                    1      n                                                               1  1        n  n
 *                   FrobeniusSolve[{a , …, a }, b, m] gives at most m solutions.
 * Usage:                             1      n
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/FrobeniusSolve
 * Documentation:    web: http://reference.wolfram.com/language/ref/FrobeniusSolve.html
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
fun frobeniusSolve(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FrobeniusSolve", arguments.toMutableList(), options)
}
