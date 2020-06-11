package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             HadamardMatrix
 *
 * Full name:        System`HadamardMatrix
 *
 * Usage:            HadamardMatrix[n] returns an n×n Hadamard matrix.
 *
 *                   Method -> Automatic
 * Options:          WorkingPrecision -> Infinity
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/HadamardMatrix
 * Documentation:    web: http://reference.wolfram.com/language/ref/HadamardMatrix.html
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
fun hadamardMatrix(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HadamardMatrix", arguments.toMutableList(), options)
}
