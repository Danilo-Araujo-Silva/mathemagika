package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             SingularValueDecomposition
 * 
 * Full name:        System`SingularValueDecomposition
 * 
 *                   SingularValueDecomposition[m] gives the singular value decomposition for a numerical matrix m as a list of matrices {u, w, v}, where w is a diagonal matrix and m can be written as u . w . Conjugate[Transpose[v]]. 
 *                   SingularValueDecomposition[{m, a}] gives the generalized singular value decomposition of m with respect to a. 
 *                   SingularValueDecomposition[m, k] gives the singular value decomposition associated with the k largest singular values of m. 
 *                   SingularValueDecomposition[m, UpTo[k]] gives the decomposition for the k largest singular values, or as many as are available. 
 * Usage:            SingularValueDecomposition[{m, a}, k] gives the generalized singular value decomposition associated with the k largest singular values.
 * 
 *                   Cubics -> False
 *                   Method -> Automatic
 *                   Quartics -> False
 * Options:          Tolerance -> Automatic
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/SingularValueDecomposition
 * Documentation:    web: http://reference.wolfram.com/language/ref/SingularValueDecomposition.html
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
fun singularValueDecomposition(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SingularValueDecomposition", arguments.toMutableList(), options)
}
