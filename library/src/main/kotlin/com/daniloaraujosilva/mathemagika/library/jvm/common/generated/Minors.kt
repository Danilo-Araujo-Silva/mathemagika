package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Minors
 * 
 * Full name:        System`Minors
 * 
 *                   Minors[m] gives the minors of a matrix m. 
 *                                             th
 * Usage:            Minors[m, k] gives the k   minors. 
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/Minors
 * Documentation:    web: http://reference.wolfram.com/language/ref/Minors.html
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
fun minors(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Minors", arguments.toMutableList(), options)
}
