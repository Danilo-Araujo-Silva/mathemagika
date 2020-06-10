package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Bond
 * 
 * Full name:        System`Bond
 * 
 *                   Bond[{id , id }] represents a single chemical bond between atoms with indices id  and id .
 *                           i    j                                                                  i       j
 *                   Bond[{id , id }, type] represents a chemical bond of the specified type.
 * Usage:                    i    j
 * 
 * Options:
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/Bond
 * Documentation:    web: http://reference.wolfram.com/language/ref/Bond.html
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
fun bond(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Bond", arguments.toMutableList(), options)
}
