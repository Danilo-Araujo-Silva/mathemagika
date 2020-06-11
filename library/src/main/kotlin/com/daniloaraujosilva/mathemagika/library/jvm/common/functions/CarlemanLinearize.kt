package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CarlemanLinearize
 *
 * Full name:        System`CarlemanLinearize
 *
 * Usage:            CarlemanLinearize[sys, spec] Carleman linearizes the nonlinear state-space model sys according to spec.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CarlemanLinearize
 * Documentation:    web: http://reference.wolfram.com/language/ref/CarlemanLinearize.html
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
fun carlemanLinearize(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CarlemanLinearize", arguments.toMutableList(), options)
}
