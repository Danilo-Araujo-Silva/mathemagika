package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             IntegerPartitions
 *
 * Full name:        System`IntegerPartitions
 *
 *                   IntegerPartitions[n] gives a list of all possible ways to partition the integer n into smaller integers.
 *                   IntegerPartitions[n, k] gives partitions into at most k integers.
 *                   IntegerPartitions[n, {k}] gives partitions into exactly k integers.
 *                   IntegerPartitions[n, {k   , k   }] gives partitions into between k    and k    integers.
 *                                          min   max                                  min      max
 *                   IntegerPartitions[n, kspec, {s , s , …}] gives partitions involving only the s .
 *                                                 1   2                                           i
 * Usage:            IntegerPartitions[n, kspec, sspec, m] limits the result to the first m partitions.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/IntegerPartitions
 * Documentation:    web: http://reference.wolfram.com/language/ref/IntegerPartitions.html
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
fun integerPartitions(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("IntegerPartitions", arguments.toMutableList(), options)
}
