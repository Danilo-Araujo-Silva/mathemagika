package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SeriesTermGoal
 *
 * Full name:        System`SeriesTermGoal
 *
 * Usage:            SeriesTermGoal is an option for Asymptotic, DiscreteAsymptotic and similar functions that specifies the number of desired terms in an asymptotic approximation.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SeriesTermGoal
 * Documentation:    web: http://reference.wolfram.com/language/ref/SeriesTermGoal.html
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
fun seriesTermGoal(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SeriesTermGoal", arguments.toMutableList(), options)
}
