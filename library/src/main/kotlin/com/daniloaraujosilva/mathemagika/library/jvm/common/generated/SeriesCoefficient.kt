package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             SeriesCoefficient
 * 
 * Full name:        System`SeriesCoefficient
 * 
 *                                                                                th
 *                   SeriesCoefficient[series, n] finds the coefficient of the n  -order term in a power series in the form generated by Series. 
 *                                                                                     n
 *                   SeriesCoefficient[f, {x, x , n}] finds the coefficient of (x - x )  in the expansion of f about the point x = x .
 *                                             0                                     0                                              0
 *                   SeriesCoefficient[f, {x, x , n }, {y, y , n }, …] finds a coefficient in a multivariate series. 
 * Usage:                                      0   x        0   y
 * 
 *                   Assumptions :> $Assumptions
 * Options:          Method -> Automatic
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/SeriesCoefficient
 * Documentation:    web: http://reference.wolfram.com/language/ref/SeriesCoefficient.html
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
fun seriesCoefficient(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SeriesCoefficient", arguments.toMutableList(), options)
}
