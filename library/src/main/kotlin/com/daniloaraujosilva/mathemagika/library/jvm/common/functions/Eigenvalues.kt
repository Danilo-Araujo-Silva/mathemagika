package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Eigenvalues
 *
 * Full name:        System`Eigenvalues
 *
 *                   Eigenvalues[m] gives a list of the eigenvalues of the square matrix m.
 *                   Eigenvalues[{m, a}] gives the generalized eigenvalues of m with respect to a.
 *                   Eigenvalues[m, k] gives the first k eigenvalues of m.
 * Usage:            Eigenvalues[{m, a}, k] gives the first k generalized eigenvalues.
 *
 *                   Cubics -> False
 *                   Method -> Automatic
 * Options:          Quartics -> False
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Eigenvalues
 * Documentation:    web: http://reference.wolfram.com/language/ref/Eigenvalues.html
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
fun eigenvalues(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Eigenvalues", arguments.toMutableList(), options)
}
