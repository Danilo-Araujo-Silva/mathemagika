package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             PartialCorrelationFunction
 *
 * Full name:        System`PartialCorrelationFunction
 *
 *                   PartialCorrelationFunction[data, hspec] estimates the partial correlation function at lags hspec from data.
 * Usage:            PartialCorrelationFunction[tproc, hspec] represents the partial correlation function at lags hspec for the time series process tproc.
 *
 * Options:          None
 *
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PartialCorrelationFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/PartialCorrelationFunction.html
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
fun partialCorrelationFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PartialCorrelationFunction", arguments.toMutableList(), options)
}
