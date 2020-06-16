package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             MomentOfInertia
 *
 * Full name:        System`MomentOfInertia
 *
 *                   MomentOfInertia[reg, pt, v] computes the moment of inertia for the region reg rotating around an axis through the point pt in direction v.
 *                   MomentOfInertia[reg] computes the moment of inertia matrix for the region reg relative to the center of mass.
 * Usage:            MomentOfInertia[reg, pt] computes the moment of inertia matrix relative to the point pt.
 *
 *                   AccuracyGoal -> Infinity
 *                   Assumptions :> $Assumptions
 *                   GenerateConditions -> Automatic
 *                   PerformanceGoal :> $PerformanceGoal
 *                   PrecisionGoal -> Automatic
 * Options:          WorkingPrecision -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MomentOfInertia
 * Documentation:    web: http://reference.wolfram.com/language/ref/MomentOfInertia.html
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
fun momentOfInertia(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MomentOfInertia", arguments.toMutableList(), options)
}
