package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             IdentityMatrix
 *
 * Full name:        System`IdentityMatrix
 *
 * Usage:            IdentityMatrix[n] gives the nn identity matrix.
 *
 * Options:          WorkingPrecision -> Infinity
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/IdentityMatrix
 * Documentation:    web: http://reference.wolfram.com/language/ref/IdentityMatrix.html
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
fun identityMatrix(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("IdentityMatrix", arguments.toMutableList(), options)
}
