package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ComputeUncertainty
 *
 * Full name:        System`ComputeUncertainty
 *
 * Usage:            ComputeUncertainty is an option for ClassifierMeasurements, LearnedDistribution and other functions to specify if numeric results should be returned along with their uncertainty.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ComputeUncertainty
 * Documentation:    web: http://reference.wolfram.com/language/ref/ComputeUncertainty.html
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
fun computeUncertainty(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ComputeUncertainty", arguments.toMutableList(), options)
}
