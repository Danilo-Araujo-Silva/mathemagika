package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FindHamiltonianPath
 *
 * Full name:        System`FindHamiltonianPath
 *
 *                   FindHamiltonianPath[g] finds a Hamiltonian path in the graph g with the smallest total length.
 * Usage:            FindHamiltonianPath[g, s, t] finds a Hamiltonian path with the smallest total length from s to t.
 *
 *                   DistanceFunction -> Automatic
 *                   Method -> Automatic
 *                   PerformanceGoal :> $PerformanceGoal
 * Options:          WorkingPrecision -> MachinePrecision
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/FindHamiltonianPath
 * Documentation:    web: http://reference.wolfram.com/language/ref/FindHamiltonianPath.html
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
fun findHamiltonianPath(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FindHamiltonianPath", arguments.toMutableList(), options)
}
