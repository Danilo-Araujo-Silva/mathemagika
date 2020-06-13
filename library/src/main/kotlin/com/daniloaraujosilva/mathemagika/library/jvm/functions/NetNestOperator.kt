package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             NetNestOperator
 *
 * Full name:        System`NetNestOperator
 *
 * Usage:            NetNestOperator[net, n] represents a net in which net is applied n times to the input.
 *
 *                   Input -> Automatic
 *                   LearningRateMultipliers -> Automatic
 * Options:          Output -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/NetNestOperator
 * Documentation:    web: http://reference.wolfram.com/language/ref/NetNestOperator.html
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
fun netNestOperator(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NetNestOperator", arguments.toMutableList(), options)
}
