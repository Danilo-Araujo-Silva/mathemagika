package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Flatten
 * 
 * Full name:        System`Flatten
 * 
 *                   Flatten[list] flattens out nested lists. 
 *                   Flatten[list, n] flattens to level n. 
 *                   Flatten[list, n, h] flattens subexpressions with head h. 
 *                   Flatten[list, {{s  , s  , …}, {s  , s  , …}, …}] flattens list by combining all levels s   to make each level i in the result. 
 * Usage:                             11   12        21   22                                                 ij
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/Flatten
 * Documentation:    web: http://reference.wolfram.com/language/ref/Flatten.html
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
fun flatten(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Flatten", arguments.toMutableList(), options)
}
