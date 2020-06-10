package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             AntihermitianMatrixQ
 * 
 * Full name:        System`AntihermitianMatrixQ
 * 
 * Usage:            AntihermitianMatrixQ[m] gives True if m is explicitly antihermitian, and False otherwise.
 * 
 *                   SameTest -> Automatic
 * Options:          Tolerance -> Automatic
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/AntihermitianMatrixQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/AntihermitianMatrixQ.html
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
fun antihermitianMatrixQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AntihermitianMatrixQ", arguments.toMutableList(), options)
}
