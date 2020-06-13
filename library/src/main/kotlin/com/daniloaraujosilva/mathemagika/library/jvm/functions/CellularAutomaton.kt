package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             CellularAutomaton
 *
 * Full name:        System`CellularAutomaton
 *
 *                   CellularAutomaton[rule, init, t] generates a list representing the evolution of the cellular automaton with the specified rule from initial condition init for t steps.
 *                   CellularAutomaton[rule, init] gives the result of evolving init for one step.
 *                   CellularAutomaton[rule, init, {tspec, xspec, …}] gives only those parts of the evolution specified by tspec, xspec, etc.
 *                   CellularAutomaton[rule, init, {t, All, …}] includes at each step all cells that could be affected over the course of t steps.
 * Usage:            CellularAutomaton[rule] is an operator form of CellularAutomaton that represents one step of evolution.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CellularAutomaton
 * Documentation:    web: http://reference.wolfram.com/language/ref/CellularAutomaton.html
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
fun cellularAutomaton(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CellularAutomaton", arguments.toMutableList(), options)
}
