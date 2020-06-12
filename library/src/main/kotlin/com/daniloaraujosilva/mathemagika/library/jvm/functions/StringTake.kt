package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             StringTake
 *
 * Full name:        System`StringTake
 *
 *                   StringTake["string", n] gives a string containing the first n characters in "string".
 *                   StringTake["string", -n] gives the last n characters in "string".
 *                                                          th
 *                   StringTake["string", {n}] gives the n   character in "string".
 *                   StringTake["string", {m, n}] gives characters m through n in "string".
 *                   StringTake["string", {spec , spec , …}] gives a list of the substrings specified by the spec .
 *                                             1      2                                                          i
 *                   StringTake[{s , s , …}, spec] gives the list of results for each of the s .
 * Usage:                         1   2                                                       i
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/StringTake
 * Documentation:    web: http://reference.wolfram.com/language/ref/StringTake.html
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
fun stringTake(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StringTake", arguments.toMutableList(), options)
}
