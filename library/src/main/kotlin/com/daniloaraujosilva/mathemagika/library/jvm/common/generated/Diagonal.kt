package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Diagonal
 * 
 * Full name:        System`Diagonal
 * 
 *                   Diagonal[m] gives the list of elements on the leading diagonal of the matrix m.
 *                                                              th
 * Usage:            Diagonal[m, k] gives the elements on the k   diagonal of m.
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/Diagonal
 * Documentation:    web: http://reference.wolfram.com/language/ref/Diagonal.html
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
fun diagonal(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Diagonal", arguments.toMutableList(), options)
}
