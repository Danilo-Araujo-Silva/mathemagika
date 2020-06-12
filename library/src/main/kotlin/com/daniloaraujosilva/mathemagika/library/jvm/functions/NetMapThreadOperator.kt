package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             NetMapThreadOperator
 *
 * Full name:        System`NetMapThreadOperator
 *
 *                   NetMapThreadOperator[mapnet] represents a net in which mapnet is mapped over one or more inputs to give one or more outputs.
 *                   NetMapThreadOperator[mapnet, n] represents a net in which mapnet is mapped over its inputs at depth n.
 *                   NetMapThreadOperator[mapnet,  input   n , input   n , … ] represents a net in which mapnet is mapped over the input named input  at depth n , and all other inputs are replicated.
 * Usage:                                                1    1       2    2                                                                            i           i
 *
 * Options:          LearningRateMultipliers -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/NetMapThreadOperator
 * Documentation:    web: http://reference.wolfram.com/language/ref/NetMapThreadOperator.html
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
fun netMapThreadOperator(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NetMapThreadOperator", arguments.toMutableList(), options)
}
