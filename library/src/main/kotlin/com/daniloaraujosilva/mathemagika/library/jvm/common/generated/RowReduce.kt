package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             RowReduce
 * 
 * Full name:        System`RowReduce
 * 
 * Usage:            RowReduce[m] gives the row‐reduced form of the matrix m. 
 * 
 *                   Method -> Automatic
 *                   Modulus -> 0
 *                   Tolerance -> Automatic
 * Options:          ZeroTest -> Automatic
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/RowReduce
 * Documentation:    web: http://reference.wolfram.com/language/ref/RowReduce.html
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
fun rowReduce(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RowReduce", arguments.toMutableList(), options)
}
