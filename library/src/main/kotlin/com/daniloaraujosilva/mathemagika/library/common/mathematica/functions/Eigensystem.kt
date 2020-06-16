package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Eigensystem
 *
 * Full name:        System`Eigensystem
 *
 *                   Eigensystem[m] gives a list {values, vectors} of the eigenvalues and eigenvectors of the square matrix m.
 *                   Eigensystem[{m, a}] gives the generalized eigenvalues and eigenvectors of m with respect to a.
 *                   Eigensystem[m, k] gives the eigenvalues and eigenvectors for the first k eigenvalues of m.
 * Usage:            Eigensystem[{m, a}, k] gives the first k generalized eigenvalues and eigenvectors.
 *
 *                   Cubics -> False
 *                   Method -> Automatic
 *                   Quartics -> False
 * Options:          ZeroTest -> Automatic
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Eigensystem
 * Documentation:    web: http://reference.wolfram.com/language/ref/Eigensystem.html
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
fun eigensystem(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Eigensystem", arguments.toMutableList(), options)
}
