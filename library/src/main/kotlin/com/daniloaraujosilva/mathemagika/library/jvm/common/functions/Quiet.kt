package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Quiet
 *
 * Full name:        System`Quiet
 *
 *                   Quiet[expr] evaluates expr "quietly", without actually outputting any messages generated.
 *                   Quiet[expr, {s  :: t , s  :: t , …}] quietens only the specified messages during the evaluation of expr.
 *                                 1     1   2     2
 * Usage:            Quiet[expr, "name"] quietens only the named group of messages.
 *
 * Options:          None
 *
 *                   HoldAll
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Quiet
 * Documentation:    web: http://reference.wolfram.com/language/ref/Quiet.html
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
fun quiet(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Quiet", arguments.toMutableList(), options)
}
