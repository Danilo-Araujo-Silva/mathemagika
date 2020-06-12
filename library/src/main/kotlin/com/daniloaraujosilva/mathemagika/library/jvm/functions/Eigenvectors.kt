package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Eigenvectors
 *
 * Full name:        System`Eigenvectors
 *
 *                   Eigenvectors[m] gives a list of the eigenvectors of the square matrix m.
 *                   Eigenvectors[{m, a}] gives the generalized eigenvectors of m with respect to a.
 *                   Eigenvectors[m, k] gives the first k eigenvectors of m.
 * Usage:            Eigenvectors[{m, a}, k] gives the first k generalized eigenvectors.
 *
 *                   Cubics -> False
 *                   Method -> Automatic
 *                   Quartics -> False
 * Options:          ZeroTest -> Automatic
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Eigenvectors
 * Documentation:    web: http://reference.wolfram.com/language/ref/Eigenvectors.html
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
fun eigenvectors(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Eigenvectors", arguments.toMutableList(), options)
}
