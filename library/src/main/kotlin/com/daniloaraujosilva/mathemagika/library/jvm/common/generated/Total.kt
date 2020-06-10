package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Total
 * 
 * Full name:        System`Total
 * 
 *                   Total[list] gives the total of the elements in list. 
 *                   Total[list, n] totals all elements down to level n. 
 *                   Total[list, {n}] totals elements at level n. 
 *                   Total[list, {n , n }] totals elements at levels n  through n . 
 * Usage:                          1   2                              1          2
 * 
 *                   AllowedHeads -> Automatic
 * Options:          Method -> Automatic
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/Total
 * Documentation:    web: http://reference.wolfram.com/language/ref/Total.html
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
fun total(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Total", arguments.toMutableList(), options)
}
