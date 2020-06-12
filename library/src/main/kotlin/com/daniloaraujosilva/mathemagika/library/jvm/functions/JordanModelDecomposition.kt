package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             JordanModelDecomposition
 *
 * Full name:        System`JordanModelDecomposition
 *
 * Usage:            JordanModelDecomposition[ssm] yields the Jordan decomposition of the state-space model ssm.
 *
 * Options:
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/JordanModelDecomposition
 * Documentation:    web: http://reference.wolfram.com/language/ref/JordanModelDecomposition.html
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
fun jordanModelDecomposition(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("JordanModelDecomposition", arguments.toMutableList(), options)
}
