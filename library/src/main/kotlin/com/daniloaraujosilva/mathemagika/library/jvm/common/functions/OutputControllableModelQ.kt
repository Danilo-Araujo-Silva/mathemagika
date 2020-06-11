package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             OutputControllableModelQ
 *
 * Full name:        System`OutputControllableModelQ
 *
 * Usage:            OutputControllableModelQ[ssm] gives True if the state-space model ssm is output controllable, and False otherwise.
 *
 * Options:          Tolerance -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/OutputControllableModelQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/OutputControllableModelQ.html
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
fun outputControllableModelQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("OutputControllableModelQ", arguments.toMutableList(), options)
}
