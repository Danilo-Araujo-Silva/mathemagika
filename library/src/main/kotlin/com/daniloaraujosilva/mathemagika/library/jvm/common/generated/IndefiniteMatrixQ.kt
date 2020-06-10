package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             IndefiniteMatrixQ
 * 
 * Full name:        System`IndefiniteMatrixQ
 * 
 * Usage:            IndefiniteMatrixQ[m] gives True if m is explicitly indefinite, and False otherwise. 
 * 
 * Options:          Tolerance -> Automatic
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/IndefiniteMatrixQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/IndefiniteMatrixQ.html
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
fun indefiniteMatrixQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("IndefiniteMatrixQ", arguments.toMutableList(), options)
}
