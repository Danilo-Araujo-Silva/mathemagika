package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             HessenbergDecomposition
 *
 * Full name:        System`HessenbergDecomposition
 *
 * Usage:            HessenbergDecomposition[m] gives the Hessenberg decomposition of a numerical matrix m.
 *
 * Options:          Pivoting -> False
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/HessenbergDecomposition
 * Documentation:    web: http://reference.wolfram.com/language/ref/HessenbergDecomposition.html
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
fun hessenbergDecomposition(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HessenbergDecomposition", arguments.toMutableList(), options)
}
