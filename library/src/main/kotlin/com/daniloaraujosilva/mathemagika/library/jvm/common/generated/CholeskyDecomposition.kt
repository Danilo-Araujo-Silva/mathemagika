package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             CholeskyDecomposition
 * 
 * Full name:        System`CholeskyDecomposition
 * 
 * Usage:            CholeskyDecomposition[m] gives the Cholesky decomposition of a matrix m. 
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/CholeskyDecomposition
 * Documentation:    web: http://reference.wolfram.com/language/ref/CholeskyDecomposition.html
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
fun choleskyDecomposition(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CholeskyDecomposition", arguments.toMutableList(), options)
}
