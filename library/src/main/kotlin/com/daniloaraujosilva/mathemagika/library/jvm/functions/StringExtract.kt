package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             StringExtract
 *
 * Full name:        System`StringExtract
 *
 *                                                             th
 *                   StringExtract["string", n] extracts the n   block of characters in string, where blocks of characters are defined as delimited by whitespace.
 *                   StringExtract["string", {pos , pos , …}] extracts blocks at several positions in string.
 *                                               1     2
 *                   StringExtract["string", sep  pos] takes blocks to be delimited by separators that match sep.
 *                   StringExtract["string", pos , pos , …] extracts blocks at positions pos , delimiting with whitespace for the lowest level, newlines for the next level, and a successively increasing number of newlines thereafter.
 *                                              1     2                                     i
 *                   StringExtract["string", sep   pos , sep   pos , …] gives a nested list of blocks, with the sep  used as separators for successive levels.
 * Usage:                                       1      1     2      2                                                i
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/StringExtract
 * Documentation:    web: http://reference.wolfram.com/language/ref/StringExtract.html
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
fun stringExtract(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StringExtract", arguments.toMutableList(), options)
}
