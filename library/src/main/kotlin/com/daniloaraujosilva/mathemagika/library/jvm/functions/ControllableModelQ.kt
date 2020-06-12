package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ControllableModelQ
 *
 * Full name:        System`ControllableModelQ
 *
 *                   ControllableModelQ[sys] yields True if the state-space model sys is controllable, and False otherwise.
 * Usage:            ControllableModelQ[{sys, sub}] yields True if the subsystem sub is controllable.
 *
 * Options:          Method -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ControllableModelQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/ControllableModelQ.html
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
fun controllableModelQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ControllableModelQ", arguments.toMutableList(), options)
}
