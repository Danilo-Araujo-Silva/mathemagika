package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             GreenFunction
 *
 * Full name:        System`GreenFunction
 *
 *                   GreenFunction[{ℒ[u[x]], ℬ[u[x]]}, u, {x, x   , x   }, y] gives a Green's function for the linear differential operator ℒ with boundary conditions ℬ in the range x    to x   .
 *                                                             min   max                                                                                                               min     max
 *                   GreenFunction[{ℒ[u[x , x , …]], ℬ[u[x , x , …]]}, u, {x , x , …} ∈ Ω, {y , y , …}] gives a Green's function for the linear partial differential operator ℒ over the region Ω.
 *                                       1   2            1   2             1   2            1   2
 *                   GreenFunction[{ℒ[u[x, t]], ℬ[u[x, t]]}, u, {x, x   , x   }, t, {y, τ}] gives a Green's function for the linear time-dependent operator ℒ in the range x    to x   .
 *                                                                   min   max                                                                                              min     max
 *                   GreenFunction[{ℒ[u[x , …, t]], ℬ[u[x , …, t]]}, u, {x , …} ∈ Ω, t, {y , …, τ}] gives a Green's function for the linear time-dependent operator ℒ over the region Ω.
 * Usage:                                1               1                1               1
 *
 * Options:          Assumptions :> $Assumptions
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GreenFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/GreenFunction.html
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
fun greenFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GreenFunction", arguments.toMutableList(), options)
}
