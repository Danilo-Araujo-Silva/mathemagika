package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             DispersionEstimatorFunction
 *
 * Full name:        System`DispersionEstimatorFunction
 *
 * Usage:            DispersionEstimatorFunction is an option for generalized linear model fitting functions that specifies the estimator for the dispersion parameter.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DispersionEstimatorFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/DispersionEstimatorFunction.html
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
fun dispersionEstimatorFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DispersionEstimatorFunction", arguments.toMutableList(), options)
}
