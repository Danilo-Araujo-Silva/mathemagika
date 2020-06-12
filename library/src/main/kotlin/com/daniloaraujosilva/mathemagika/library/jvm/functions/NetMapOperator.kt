package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             NetMapOperator
 *
 * Full name:        System`NetMapOperator
 *
 * Usage:            NetMapOperator[net] represents a net in which net is mapped over a sequence of inputs to give a sequence of outputs.
 *
 *                   Input -> Automatic
 *                   LearningRateMultipliers -> Automatic
 * Options:          Output -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/NetMapOperator
 * Documentation:    web: http://reference.wolfram.com/language/ref/NetMapOperator.html
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
fun netMapOperator(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NetMapOperator", arguments.toMutableList(), options)
}
