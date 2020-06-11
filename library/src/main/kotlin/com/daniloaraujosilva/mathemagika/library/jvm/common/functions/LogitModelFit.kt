package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             LogitModelFit
 *
 * Full name:        System`LogitModelFit
 *
 *                                                                                                                                  -(β  + β  f  + β  f  + …)
 *                                                                                                                                     0    1  1    2  2
 *                   LogitModelFit[{y , y , …}, {f , f , …}, x] constructs a binomial logistic regression model of the form 1/(1 +                          ) that fits the y  for successive x values 1, 2, ….
 *                                   1   2        1   2                                                                                                                       i
 *                                                                                                                                                                      -(β  + β  f  + β  f  + …)
 *                                                                                                                                                                         0    1  1    2  2
 *                   LogitModelFit[{{x  , x  , …, y }, {x  , x  , …, y }, …}, {f , …}, {x , x , …}] constructs a binomial logistic regression model of the form 1/(1 +                          ) where the f  depend on the variables x .
 *                                    11   12      1     21   22      2         1        1   2                                                                                                                i                          k
 * Usage:            LogitModelFit[{m, v}] constructs a binomial logistic regression model from the design matrix m and response vector v.
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
 *                   local: paclet:ref/LogitModelFit
 * Documentation:    web: http://reference.wolfram.com/language/ref/LogitModelFit.html
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
fun logitModelFit(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LogitModelFit", arguments.toMutableList(), options)
}
