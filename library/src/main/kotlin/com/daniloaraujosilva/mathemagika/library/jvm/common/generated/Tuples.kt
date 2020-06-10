package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Tuples
 * 
 * Full name:        System`Tuples
 * 
 *                   Tuples[list, n] generates a list of all possible n‐tuples of elements from list. 
 *                                                                                               th
 *                   Tuples[{list , list , …}] generates a list of all possible tuples whose i    element is from list . 
 * Usage:                        1      2                                                                               i
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/Tuples
 * Documentation:    web: http://reference.wolfram.com/language/ref/Tuples.html
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
fun tuples(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Tuples", arguments.toMutableList(), options)
}
