package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             NDEigenvalues
 * 
 * Full name:        System`NDEigenvalues
 * 
 *                   NDEigenvalues[ℒ[u[x, y, …]], u, {x, y, …} ∈ Ω, n] gives the n smallest magnitude eigenvalues for the linear differential operator ℒ over the region Ω.
 *                   NDEigenvalues[{ℒ [u[x, y, …], v[x, y, …], …], ℒ [u[x, y, …], v[x, y, …], …], …}, {u, v, …}, {x, y, …} ∈ Ω, n]  gives eigenvalues for the coupled differential operators {op , op , …} over the region Ω.
 *                                   1                              2                                                                                                                           1    2
 * Usage:            NDEigenvalues[eqns, {u, …}, t, {x, y, …} ∈ Ω, n] gives the eigenvalues in the spatial variables {x, y, …} for solutions u, … of the coupled time-dependent differential equations eqns.
 * 
 * Options:          Method -> Automatic
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/NDEigenvalues
 * Documentation:    web: http://reference.wolfram.com/language/ref/NDEigenvalues.html
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
fun nDEigenvalues(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NDEigenvalues", arguments.toMutableList(), options)
}
