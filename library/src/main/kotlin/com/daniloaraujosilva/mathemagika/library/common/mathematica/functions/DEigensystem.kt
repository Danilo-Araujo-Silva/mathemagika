package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             DEigensystem
 *
 * Full name:        System`DEigensystem
 *
 *                   DEigensystem[ℒ[u[x, y, …]], u, {x, y, …} ∈ Ω, n] gives the n smallest magnitude eigenvalues and eigenfunctions for the linear differential operator ℒ over the region Ω.
 * Usage:            DEigensystem[eqns, u, t, {x, y, …} ∈ Ω, n] gives the eigenvalues and eigenfunctions for solutions u of the time-dependent differential equations eqns.
 *
 *                   Assumptions :> $Assumptions
 * Options:          Method -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DEigensystem
 * Documentation:    web: http://reference.wolfram.com/language/ref/DEigensystem.html
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
fun dEigensystem(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DEigensystem", arguments.toMutableList(), options)
}
