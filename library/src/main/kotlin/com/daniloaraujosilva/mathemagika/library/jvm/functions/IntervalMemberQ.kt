package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             IntervalMemberQ
 *
 * Full name:        System`IntervalMemberQ
 *
 *                   IntervalMemberQ[interval, x] gives True if the number x lies within the specified interval, and False otherwise.
 *                   IntervalMemberQ[interval , interval ] gives True if interval  is completely contained within interval .
 * Usage:                                    1          2                        2                                        1
 *
 * Options:          None
 *
 *                   Listable
 * Attributes:       Protected
 *
 *                   local: paclet:ref/IntervalMemberQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/IntervalMemberQ.html
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
fun intervalMemberQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("IntervalMemberQ", arguments.toMutableList(), options)
}
