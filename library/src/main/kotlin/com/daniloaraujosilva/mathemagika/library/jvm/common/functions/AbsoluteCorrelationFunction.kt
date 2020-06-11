package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             AbsoluteCorrelationFunction
 *
 * Full name:        System`AbsoluteCorrelationFunction
 *
 *                   AbsoluteCorrelationFunction[data, hspec] estimates the absolute correlation function at lags hspec from data.
 *                   AbsoluteCorrelationFunction[proc, hspec] represents the absolute correlation function at lags hspec for the random process proc.
 * Usage:            AbsoluteCorrelationFunction[proc, s, t] represents the absolute correlation function at times s and t for the random process proc.
 *
 * Options:          None
 *
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AbsoluteCorrelationFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/AbsoluteCorrelationFunction.html
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
fun absoluteCorrelationFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AbsoluteCorrelationFunction", arguments.toMutableList(), options)
}
