package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             TimeSeriesModel
 *
 * Full name:        System`TimeSeriesModel
 *
 * Usage:            TimeSeriesModel[…] represents the symbolic time series model obtained from TimeSeriesModelFit.
 *
 *                                      19
 *                   ConfidenceLevel -> --
 *                                      20
 * Options:          LagMax -> Automatic
 *
 *                   NHoldAll
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/TimeSeriesModel
 * Documentation:    web: http://reference.wolfram.com/language/ref/TimeSeriesModel.html
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
fun timeSeriesModel(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TimeSeriesModel", arguments.toMutableList(), options)
}
