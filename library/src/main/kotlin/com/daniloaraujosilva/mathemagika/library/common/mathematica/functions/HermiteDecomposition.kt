package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             HermiteDecomposition
 *
 * Full name:        System`HermiteDecomposition
 *
 * Usage:            HermiteDecomposition[m] gives the Hermite normal form decomposition of an integer matrix m.
 *
 * Options:          Method -> Automatic
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/HermiteDecomposition
 * Documentation:    web: http://reference.wolfram.com/language/ref/HermiteDecomposition.html
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
fun hermiteDecomposition(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HermiteDecomposition", arguments.toMutableList(), options)
}
