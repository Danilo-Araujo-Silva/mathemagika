package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             LinearModelFit
 *
 * Full name:        System`LinearModelFit
 *
 *                   LinearModelFit[{y , y , …}, {f , f , …}, x] constructs a linear model of the form β  + β  f  + β  f  + … that fits the y  for successive x values 1, 2, ….
 *                                    1   2        1   2                                                0    1  1    2  2                    i
 *                   LinearModelFit[{{x  , x  , …, y }, {x  , x  , …, y }, …}, {f , f , …}, {x , x , …}] constructs a linear model of the form β  + β  f  + β  f  + … where the f  depend on the variables x .
 *                                     11   12      1     21   22      2         1   2        1   2                                             0    1  1    2  2                i                          k
 * Usage:            LinearModelFit[{m, v}] constructs a linear model from the design matrix m and response vector v.
 *
 *                                      19
 *                   ConfidenceLevel -> --
 *                                      20
 *                   IncludeConstantBasis -> True
 *                   LinearOffsetFunction -> None
 *                   NominalVariables -> None
 *                   Tolerance -> Automatic
 *                   VarianceEstimatorFunction -> Automatic
 *                   Weights -> Automatic
 * Options:          WorkingPrecision -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/LinearModelFit
 * Documentation:    web: http://reference.wolfram.com/language/ref/LinearModelFit.html
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
fun linearModelFit(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LinearModelFit", arguments.toMutableList(), options)
}
