package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             RegionDimension
 *
 * Full name:        System`RegionDimension
 *
 * Usage:            RegionDimension[reg] gives the geometric dimension of the region reg.
 *
 *                   Assumptions :> $Assumptions
 *                   GenerateConditions -> Automatic
 * Options:          PerformanceGoal :> $PerformanceGoal
 *
 *                   Listable
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/RegionDimension
 * Documentation:    web: http://reference.wolfram.com/language/ref/RegionDimension.html
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
fun regionDimension(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RegionDimension", arguments.toMutableList(), options)
}
