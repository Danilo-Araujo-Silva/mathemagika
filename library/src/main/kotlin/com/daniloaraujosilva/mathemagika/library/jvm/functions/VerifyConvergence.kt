package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             VerifyConvergence
 *
 * Full name:        System`VerifyConvergence
 *
 * Usage:            VerifyConvergence is an option to Sum, NSum, and similar functions that specifies whether convergence checking should be done.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/VerifyConvergence
 * Documentation:    web: http://reference.wolfram.com/language/ref/VerifyConvergence.html
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
fun verifyConvergence(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("VerifyConvergence", arguments.toMutableList(), options)
}
