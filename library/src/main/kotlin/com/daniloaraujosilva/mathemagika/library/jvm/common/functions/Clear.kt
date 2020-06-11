package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Clear
 *
 * Full name:        System`Clear
 *
 *                   Clear[symbol , symbol , …] clears values and definitions for the symbol .
 *                               1        2                                                 i
 *                   Clear["form ", "form ", …] clears values and definitions for all symbols whose names match any of the string patterns form .
 * Usage:                       1        2                                                                                                     i
 *
 * Options:          None
 *
 *                   HoldAll
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Clear
 * Documentation:    web: http://reference.wolfram.com/language/ref/Clear.html
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
fun clear(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Clear", arguments.toMutableList(), options)
}
