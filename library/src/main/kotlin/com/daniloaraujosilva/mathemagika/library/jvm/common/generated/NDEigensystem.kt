package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             NDEigensystem
 * 
 * Full name:        System`NDEigensystem
 * 
 *                   NDEigensystem[ℒ[u[x, y, …]], u, {x, y, …} ∈ Ω, n] gives the n smallest magnitude eigenvalues and eigenfunctions for the linear differential operator ℒ over the region Ω.NDEigensystem[{ℒ [u[x, y, …], v[x, y, …], …], ℒ [u[x, y, …], v[x, y, …], …], …}, {u, v, …}, {x, y, …} ∈ Ω, n]  gives eigenvalues and eigenfunctions for the coupled differential operators {op , op , …} over the region Ω.
 *                                                                                                                                                                                                            1                              2                                                                                                                                              1    2
 * Usage:            NDEigensystem[eqns, {u, …}, t, {x, y, …} ∈ Ω, n] gives the eigenvalues and eigenfunctions in the spatial variables {x, y, …} for solutions u, … of the coupled time-dependent differential equations eqns.
 * 
 * Options:          Method -> Automatic
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/NDEigensystem
 * Documentation:    web: http://reference.wolfram.com/language/ref/NDEigensystem.html
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
fun nDEigensystem(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NDEigensystem", arguments.toMutableList(), options)
}
