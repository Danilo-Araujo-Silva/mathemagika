package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             CorrelationFunction
 *
 * Full name:        System`CorrelationFunction
 *
 *                   CorrelationFunction[data, hspec] estimates the correlation function at lags hspec from data.
 *                   CorrelationFunction[proc, hspec] represents the correlation function at lags hspec for the random process proc.
 * Usage:            CorrelationFunction[proc, s, t] represents the correlation function at times s and t for the random process proc.
 *
 * Options:          None
 *
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CorrelationFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/CorrelationFunction.html
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
fun correlationFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CorrelationFunction", arguments.toMutableList(), options)
}
