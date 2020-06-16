package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             TimeSeriesModelFit
 *
 * Full name:        System`TimeSeriesModelFit
 *
 *                   TimeSeriesModelFit[data] constructs a time series model for data from an automatically selected model family.
 * Usage:            TimeSeriesModelFit[data, mspec] constructs a time series model for data from a model family specified by mspec.
 *
 *                   AccuracyGoal -> Automatic
 *                                      19
 *                   ConfidenceLevel -> --
 *                                      20
 *                   IncludeConstantBasis -> Automatic
 *                   Method -> Automatic
 *                   PrecisionGoal -> Automatic
 *                   ProcessEstimator -> Automatic
 * Options:          WorkingPrecision -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/TimeSeriesModelFit
 * Documentation:    web: http://reference.wolfram.com/language/ref/TimeSeriesModelFit.html
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
fun timeSeriesModelFit(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TimeSeriesModelFit", arguments.toMutableList(), options)
}
