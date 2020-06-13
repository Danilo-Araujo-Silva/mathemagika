package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ProbitModelFit
 *
 * Full name:        System`ProbitModelFit
 *
 *                                                                                                                         1
 *                   ProbitModelFit[{y , y , …}, {f , f , …}, x] constructs a binomial probit regression model of the form - (1 + erf((β  + β  f  + β  f  + ⋯)/Sqrt[2])) that fits the y  for successive x values 1, 2, ….
 *                                    1   2        1   2                                                                   2            0    1  1    2  2                               i
 *                                                                                                                                                                 1
 *                   ProbitModelFit[{{x  , x  , …, y }, {x  , x  , …, y }, …}, {f , f , …}, {x , x , …}] constructs a binomial probit regression model of the form - (1 + erf((β  + β  f  + β  f  + ⋯)/Sqrt[2])) where the f  depend on the variables x .
 *                                     11   12      1     21   22      2         1   2        1   2                                                                2            0    1  1    2  2                           i                          k
 * Usage:            ProbitModelFit[{m, v}] constructs a binomial probit regression model from the design matrix m and response vector v.
 *
 *                   AccuracyGoal -> Automatic
 *                                      19
 *                   ConfidenceLevel -> --
 *                                      20
 *                   CovarianceEstimatorFunction -> ExpectedInformation
 *                   DispersionEstimatorFunction -> Automatic
 *                   IncludeConstantBasis -> True
 *                   LinearOffsetFunction -> None
 *                   MaxIterations -> Automatic
 *                   NominalVariables -> None
 *                   PrecisionGoal -> Automatic
 *                   Weights -> Automatic
 * Options:          WorkingPrecision -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ProbitModelFit
 * Documentation:    web: http://reference.wolfram.com/language/ref/ProbitModelFit.html
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
fun probitModelFit(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ProbitModelFit", arguments.toMutableList(), options)
}
