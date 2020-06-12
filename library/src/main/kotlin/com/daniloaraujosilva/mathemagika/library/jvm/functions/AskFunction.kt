package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             AskFunction
 *
 * Full name:        System`AskFunction
 *
 *                   AskFunction[body] evaluates body, interactively asking for values specified by Ask[…] and related constructs.
 *                   AskFunction[{key   spec , key   spec , …}, body] specifies how values associated with the key  should be asked for.
 * Usage:                            1       1     2       2                                                        i
 *
 * Options:          Forms`CumulativeDisplay -> False
 *
 *                   HoldAll
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AskFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/AskFunction.html
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
fun askFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AskFunction", arguments.toMutableList(), options)
}
