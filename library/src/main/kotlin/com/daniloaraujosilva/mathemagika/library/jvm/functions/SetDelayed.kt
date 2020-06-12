package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SetDelayed
 *
 * Full name:        System`SetDelayed
 *
 * Usage:            lhs := rhs assigns rhs to be the delayed value of lhs. rhs is maintained in an unevaluated form. When lhs appears, it is replaced by rhs, evaluated afresh each time.
 *
 * Options:          None
 *
 *                   HoldAll
 *                   Protected
 * Attributes:       SequenceHold
 *
 *                   local: paclet:ref/SetDelayed
 * Documentation:    web: http://reference.wolfram.com/language/ref/SetDelayed.html
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
fun setDelayed(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SetDelayed", arguments.toMutableList(), options)
}
