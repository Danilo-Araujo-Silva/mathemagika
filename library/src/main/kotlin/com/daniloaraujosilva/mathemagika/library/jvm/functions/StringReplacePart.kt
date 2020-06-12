package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             StringReplacePart
 *
 * Full name:        System`StringReplacePart
 *
 *                   StringReplacePart["string", "snew", {m, n}] replaces the characters at positions m through n in "string" by "snew".
 *                   StringReplacePart["string", "snew", {{m , n }, {m , n }, …}] inserts copies of "snew" at several positions.
 *                                                          1   1     2   2
 *                   StringReplacePart["string", {"snew ", "snew ", …}, {{m , n }, {m , n }, …}] replaces characters at positions m  through n  in "string" by "snew ".
 *                                                     1        2          1   1     2   2                                         i          i                     i
 * Usage:            StringReplacePart["snew", {m, n}] represents an operator form of StringReplacePart that can be applied to an expression.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/StringReplacePart
 * Documentation:    web: http://reference.wolfram.com/language/ref/StringReplacePart.html
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
fun stringReplacePart(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StringReplacePart", arguments.toMutableList(), options)
}
