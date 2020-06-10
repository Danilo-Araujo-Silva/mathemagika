package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Det
 * 
 * Full name:        System`Det
 * 
 * Usage:            Det[m] gives the determinant of the square matrix m. 
 * 
 * Options:          Modulus -> 0
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/Det
 * Documentation:    web: http://reference.wolfram.com/language/ref/Det.html
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
fun det(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Det", arguments.toMutableList(), options)
}
