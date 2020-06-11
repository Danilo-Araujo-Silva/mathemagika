package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             RegionMoment
 *
 * Full name:        System`RegionMoment
 *
 *                                                                                               i   i     i
 *                   RegionMoment[reg, {i , i , …, i }] computes the polynomial moment ∫        x 1 x 2 ⋯ x n for the region reg.
 *                                       1   2      n                                   x ∈ reg
 * Usage:                                                                                        1   2     n
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
 *                   local: paclet:ref/RegionMoment
 * Documentation:    web: http://reference.wolfram.com/language/ref/RegionMoment.html
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
fun regionMoment(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RegionMoment", arguments.toMutableList(), options)
}
