package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             TuringMachine
 *
 * Full name:        System`TuringMachine
 *
 *                   TuringMachine[rule, init, t] generates a list representing the evolution of the Turing machine with the specified rule from initial condition init for t steps.
 *                   TuringMachine[rule, init] gives the result of evolving init for one step.
 * Usage:            TuringMachine[rule] is an operator form of TuringMachine that corresponds to one step of evolution.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/TuringMachine
 * Documentation:    web: http://reference.wolfram.com/language/ref/TuringMachine.html
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
fun turingMachine(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TuringMachine", arguments.toMutableList(), options)
}
