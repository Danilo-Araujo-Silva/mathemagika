package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             LUDecomposition
 *
 * Full name:        System`LUDecomposition
 *
 * Usage:            LUDecomposition[m] generates a representation of the LU decomposition of a square matrix m.
 *
 * Options:          Modulus -> 0
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/LUDecomposition
 * Documentation:    web: http://reference.wolfram.com/language/ref/LUDecomposition.html
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
fun lUDecomposition(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LUDecomposition", arguments.toMutableList(), options)
}
