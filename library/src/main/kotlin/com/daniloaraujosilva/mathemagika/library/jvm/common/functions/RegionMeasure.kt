package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             RegionMeasure
 *
 * Full name:        System`RegionMeasure
 *
 *                   RegionMeasure[reg] gives the measure of the region reg.
 *                   RegionMeasure[reg, d] gives the d-dimensional measure of the region reg.
 *                   RegionMeasure[{x , …, x }, {{t , a , b }, …, {t , a , b }}] gives the k-measure of the parametric formula whose Cartesian coordinates x  are functions of t .
 *                                   1      n      1   1   1        k   k   k                                                                               i                   j
 *                   RegionMeasure[{x , …, x }, {{t , a , b }, …, {t , a , b }}, chart] interprets the x  as coordinates in the specified coordinate chart.
 * Usage:                            1      n      1   1   1        k   k   k                           i
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
 *                   local: paclet:ref/RegionMeasure
 * Documentation:    web: http://reference.wolfram.com/language/ref/RegionMeasure.html
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
fun regionMeasure(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RegionMeasure", arguments.toMutableList(), options)
}
