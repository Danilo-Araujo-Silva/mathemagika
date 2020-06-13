package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             KroneckerModelDecomposition
 *
 * Full name:        System`KroneckerModelDecomposition
 *
 * Usage:            KroneckerModelDecomposition[ssm] yields the Kronecker decomposition of a descriptor state-space model ssm.
 *
 * Options:          Method -> Jordan
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/KroneckerModelDecomposition
 * Documentation:    web: http://reference.wolfram.com/language/ref/KroneckerModelDecomposition.html
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
fun kroneckerModelDecomposition(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("KroneckerModelDecomposition", arguments.toMutableList(), options)
}
