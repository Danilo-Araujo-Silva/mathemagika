package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             JacobiNC
 *
 * Full name:        System`JacobiNC
 *
 * Usage:            JacobiNC[u, m] gives the Jacobi elliptic function nc(u | m).
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/JacobiNC
 * Documentation:    web: http://reference.wolfram.com/language/ref/JacobiNC.html
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
fun jacobiNC(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("JacobiNC", arguments.toMutableList(), options)
}
