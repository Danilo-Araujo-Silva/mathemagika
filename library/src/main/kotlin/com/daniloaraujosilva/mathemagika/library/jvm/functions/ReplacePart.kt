package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ReplacePart
 *
 * Full name:        System`ReplacePart
 *
 *                                                                                   th
 *                   ReplacePart[expr, i  new] yields an expression in which the i   part of expr is replaced by new.
 *                   ReplacePart[expr, {i   new , i   new , …}] replaces parts at positions i  by new .
 *                                       1      1   2      2                                   n       n
 *                   ReplacePart[expr, {i, j, …}  new] replaces the part at position {i, j, …}.
 *                   ReplacePart[expr, {{i , j , …}  new , …}] replaces parts at positions {i , j , …} by new .
 *                                        1   1          1                                    n   n           n
 *                   ReplacePart[expr, {{i , j , …}, …}  new] replaces all parts at positions {i , j , …} by new.
 *                                        1   1                                                  n   n
 * Usage:            ReplacePart[i  new] represents an operator form of ReplacePart that can be applied to an expression.
 *
 * Options:          Heads -> Automatic
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ReplacePart
 * Documentation:    web: http://reference.wolfram.com/language/ref/ReplacePart.html
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
fun replacePart(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ReplacePart", arguments.toMutableList(), options)
}
