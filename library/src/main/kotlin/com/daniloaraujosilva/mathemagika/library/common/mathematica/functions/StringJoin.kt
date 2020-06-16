package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             StringJoin
 *
 * Full name:        System`StringJoin
 *
 *                   "s " <> "s " <> …, StringJoin["s ", "s ", …], or StringJoin[{"s ", "s ", …}] yields a string consisting of a concatenation of the s .
 * Usage:              1       2                     1     2                        1     2                                                             i
 *
 * Options:          None
 *
 *                   Flat
 *                   OneIdentity
 * Attributes:       Protected
 *
 *                   local: paclet:ref/StringJoin
 * Documentation:    web: http://reference.wolfram.com/language/ref/StringJoin.html
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
fun stringJoin(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StringJoin", arguments.toMutableList(), options)
}
