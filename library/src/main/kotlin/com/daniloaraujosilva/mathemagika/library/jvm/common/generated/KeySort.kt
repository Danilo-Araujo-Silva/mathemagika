package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             KeySort
 * 
 * Full name:        System`KeySort
 * 
 *                   KeySort[assoc] orders the elements of an association by sorting its keys.
 * Usage:            KeySort[assoc, p] orders the elements of an association using the ordering function p.
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/KeySort
 * Documentation:    web: http://reference.wolfram.com/language/ref/KeySort.html
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
fun keySort(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("KeySort", arguments.toMutableList(), options)
}
