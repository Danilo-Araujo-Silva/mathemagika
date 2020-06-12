package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             NetBidirectionalOperator
 *
 * Full name:        System`NetBidirectionalOperator
 *
 *                   NetBidirectionalOperator[net] represents a net that applies net to a sequence and to its reverse, concatenating both results into one output sequence.
 *                   NetBidirectionalOperator[{fnet, bnet}] uses fnet on the normal input and bnet on the reversed input.
 * Usage:            NetBidirectionalOperator[nets, agg] aggregates the two output sequences using the specified aggregation function.
 *
 *                   Input -> Automatic
 *                   LearningRateMultipliers -> Automatic
 * Options:          Output -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/NetBidirectionalOperator
 * Documentation:    web: http://reference.wolfram.com/language/ref/NetBidirectionalOperator.html
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
fun netBidirectionalOperator(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NetBidirectionalOperator", arguments.toMutableList(), options)
}
