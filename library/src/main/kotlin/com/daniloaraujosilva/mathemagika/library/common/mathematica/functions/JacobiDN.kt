package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             JacobiDN
 *
 * Full name:        System`JacobiDN
 *
 * Usage:            JacobiDN[u, m] gives the Jacobi elliptic function dn(u | m).
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/JacobiDN
 * Documentation:    web: http://reference.wolfram.com/language/ref/JacobiDN.html
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
fun jacobiDN(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("JacobiDN", arguments.toMutableList(), options)
}
