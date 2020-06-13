package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             SmithDelayCompensator
 *
 * Full name:        System`SmithDelayCompensator
 *
 * Usage:            SmithDelayCompensator[sys, con] gives the Smith compensator for the time-delay system sys and the delay-free controller con.
 *
 * Options:          Method -> Smith
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SmithDelayCompensator
 * Documentation:    web: http://reference.wolfram.com/language/ref/SmithDelayCompensator.html
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
fun smithDelayCompensator(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SmithDelayCompensator", arguments.toMutableList(), options)
}
