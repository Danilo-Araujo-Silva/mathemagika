package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ClearAll
 *
 * Full name:        System`ClearAll
 *
 *                   ClearAll[symb , symb , …] clears all values, definitions, attributes, messages, and defaults associated with symbols.
 *                                1      2
 *                   ClearAll["form ", "form ", …] clears all symbols whose names textually match any of the form .
 * Usage:                          1        2                                                                    i
 *
 * Options:          None
 *
 *                   HoldAll
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ClearAll
 * Documentation:    web: http://reference.wolfram.com/language/ref/ClearAll.html
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
fun clearAll(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ClearAll", arguments.toMutableList(), options)
}
