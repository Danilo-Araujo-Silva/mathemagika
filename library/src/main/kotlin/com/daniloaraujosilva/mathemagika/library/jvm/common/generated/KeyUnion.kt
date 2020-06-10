package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             KeyUnion
 * 
 * Full name:        System`KeyUnion
 * 
 *                   KeyUnion[{assoc , assoc , …}] generates a list of associations in which each association has the union of the keys of the assoc , padding by inserting values of Missing[…] if necessary.
 *                                  1       2                                                                                                       i
 *                   KeyUnion[{assoc , assoc , …}, f] uses f[key] as the value associated with a missing key. 
 * Usage:                           1       2
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/KeyUnion
 * Documentation:    web: http://reference.wolfram.com/language/ref/KeyUnion.html
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
fun keyUnion(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("KeyUnion", arguments.toMutableList(), options)
}
