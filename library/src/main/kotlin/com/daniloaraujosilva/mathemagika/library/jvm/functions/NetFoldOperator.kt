package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             NetFoldOperator
 *
 * Full name:        System`NetFoldOperator
 *
 *                   NetFoldOperator[net] represents a net in which net is folded over a sequence of inputs, maintaining a recurrent state.
 *                   NetFoldOperator[net, {out   in , …}] represents a net in which net is folded over its inputs, maintaining a recurrent state by feeding the out  of each step back to the in  of the next step.
 *                                            i     1                                                                                                               i                            i
 *                   NetFoldOperator[net, feedback, {const , const , …}] treats the inputs const  to net as being constant instead of mapped over.
 *                                                        1       2                             i
 *                   NetFoldOperator[net, feedback, constants, {out , …}] returns the sequence of values for the specific outputs out .
 * Usage:                                                          1                                                                 i
 *
 * Options:          LearningRateMultipliers -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/NetFoldOperator
 * Documentation:    web: http://reference.wolfram.com/language/ref/NetFoldOperator.html
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
fun netFoldOperator(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NetFoldOperator", arguments.toMutableList(), options)
}
