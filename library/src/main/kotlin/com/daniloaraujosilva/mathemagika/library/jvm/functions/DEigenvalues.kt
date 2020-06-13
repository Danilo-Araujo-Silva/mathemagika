package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             DEigenvalues
 *
 * Full name:        System`DEigenvalues
 *
 *                   DEigenvalues[ℒ[u[x, y, …], u, {x, y, …} ∈ Ω, n] gives the n smallest magnitude eigenvalues for the linear differential operator ℒ over the region Ω.
 * Usage:            DEigenvalues[eqns, u, t, {x, y, …} ∈ Ω, n] gives the eigenvalues for solutions u of the time-dependent differential equations eqns.
 *
 * Options:          Assumptions :> $Assumptions
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DEigenvalues
 * Documentation:    web: http://reference.wolfram.com/language/ref/DEigenvalues.html
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
fun dEigenvalues(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DEigenvalues", arguments.toMutableList(), options)
}
