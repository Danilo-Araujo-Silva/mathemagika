package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             StringEndsQ
 *
 * Full name:        System`StringEndsQ
 *
 *                   StringEndsQ["string", patt] yields True if the end of string matches the string pattern patt, and yields False otherwise.
 *                   StringEndsQ[{string , string , …}, patt] gives a list of the results for each of the string .
 *                                      1        2                                                              i
 * Usage:            StringEndsQ[patt] represents an operator form of StringEndsQ that can be applied to an expression.
 *
 *                   IgnoreCase -> False
 * Options:          MetaCharacters -> None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/StringEndsQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/StringEndsQ.html
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
fun stringEndsQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StringEndsQ", arguments.toMutableList(), options)
}
