package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             FailureQ
 *
 * Full name:        System`FailureQ
 *
 * Usage:            FailureQ[expr] gives True if expr has head Failure or is equal to $Failed or $Aborted.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/FailureQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/FailureQ.html
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
fun failureQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FailureQ", arguments.toMutableList(), options)
}
