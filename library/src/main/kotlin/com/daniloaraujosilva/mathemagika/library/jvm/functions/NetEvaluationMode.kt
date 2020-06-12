package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             NetEvaluationMode
 *
 * Full name:        System`NetEvaluationMode
 *
 * Usage:            NetEvaluationMode is an option that can be given when applying neural net functions to input data, specifying whether the net should use training-specific behavior.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/NetEvaluationMode
 * Documentation:    web: http://reference.wolfram.com/language/ref/NetEvaluationMode.html
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
fun netEvaluationMode(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NetEvaluationMode", arguments.toMutableList(), options)
}
