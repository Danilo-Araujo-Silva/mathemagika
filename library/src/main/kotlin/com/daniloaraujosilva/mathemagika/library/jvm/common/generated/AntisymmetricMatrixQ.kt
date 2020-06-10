package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             AntisymmetricMatrixQ
 * 
 * Full name:        System`AntisymmetricMatrixQ
 * 
 * Usage:            AntisymmetricMatrixQ[m] gives True if m is explicitly antisymmetric, and False otherwise.
 * 
 *                   SameTest -> Automatic
 * Options:          Tolerance -> Automatic
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/AntisymmetricMatrixQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/AntisymmetricMatrixQ.html
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
fun antisymmetricMatrixQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AntisymmetricMatrixQ", arguments.toMutableList(), options)
}
