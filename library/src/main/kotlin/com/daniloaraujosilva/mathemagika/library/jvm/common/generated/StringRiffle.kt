package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             StringRiffle
 * 
 * Full name:        System`StringRiffle
 * 
 *                   StringRiffle[{s , s , s , …}] creates a string by concatenating all the s , with spaces inserted between them.
 *                                  1   2   3                                                 i
 *                   StringRiffle[{{s  , s  , …}, {s  , s  , …}, …}] creates a string by concatenating the s  , and inserting spaces at the lowest level and newlines at the higher level.
 *                                   11   12        21   22                                                 ij
 *                   StringRiffle[list, sep] inserts the separator sep between all elements in list.
 *                   StringRiffle[list, {"left", "sep", "right"}] use left and right as delimiters after concatenation.
 *                   StringRiffle[list, sep , sep , …] inserts separator sep  between elements of list at level i.
 * Usage:                                  1     2                          i
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/StringRiffle
 * Documentation:    web: http://reference.wolfram.com/language/ref/StringRiffle.html
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
fun stringRiffle(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StringRiffle", arguments.toMutableList(), options)
}
