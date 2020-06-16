package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             SubstitutionSystem
 *
 * Full name:        System`SubstitutionSystem
 *
 *                   SubstitutionSystem[rule, init, t] generates a list representing the evolution of the substitution system with the specified rule from initial condition init for t steps.
 *                   SubstitutionSystem[rule, init] gives the result of evolving init for one step.
 * Usage:            SubstitutionSystem[rule] is an operator form of SubstitutionSystem that corresponds to one step of evolution.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SubstitutionSystem
 * Documentation:    web: http://reference.wolfram.com/language/ref/SubstitutionSystem.html
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
fun substitutionSystem(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SubstitutionSystem", arguments.toMutableList(), options)
}
