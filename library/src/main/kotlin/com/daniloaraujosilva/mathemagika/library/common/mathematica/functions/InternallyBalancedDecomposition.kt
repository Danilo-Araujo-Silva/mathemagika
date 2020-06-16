package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             InternallyBalancedDecomposition
 *
 * Full name:        System`InternallyBalancedDecomposition
 *
 * Usage:            InternallyBalancedDecomposition[ssm] yields the internally balanced decomposition of the state-space model ssm.
 *
 * Options:          Method -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/InternallyBalancedDecomposition
 * Documentation:    web: http://reference.wolfram.com/language/ref/InternallyBalancedDecomposition.html
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
fun internallyBalancedDecomposition(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("InternallyBalancedDecomposition", arguments.toMutableList(), options)
}
