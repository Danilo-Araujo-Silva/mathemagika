package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             GeneralizedLinearModelFit
 *
 * Full name:        System`GeneralizedLinearModelFit
 *
 *                                                                                                                             -1
 *                   GeneralizedLinearModelFit[{y , y , …}, {f , f , …}, x] constructs a generalized linear model of the form g   (β  + β  f  + β  f  + …) that fits the y  for successive x values 1, 2, ….
 *                                               1   2        1   2                                                                 0    1  1    2  2                     i
 *                                                                                                                                                                     -1
 *                   GeneralizedLinearModelFit[{{x  , x  , …, y }, {x  , x  , …, y }, …}, {f , f , …}, {x , x , …}] constructs a generalized linear model of the form g   (β  + β  f  + β  f  + …) where the f  depend on the variables x .
 *                                                11   12      1     21   22      2         1   2        1   2                                                              0    1  1    2  2                 i                          k
 * Usage:            GeneralizedLinearModelFit[{m, v}] constructs a generalized linear model from the design matrix m and response vector v.
 *
 *                   AccuracyGoal -> Automatic
 *                                      19
 *                   ConfidenceLevel -> --
 *                                      20
 *                   CovarianceEstimatorFunction -> ExpectedInformation
 *                   DispersionEstimatorFunction -> Automatic
 *                   ExponentialFamily -> Automatic
 *                   IncludeConstantBasis -> True
 *                   LinearOffsetFunction -> None
 *                   LinkFunction -> Automatic
 *                   MaxIterations -> Automatic
 *                   NominalVariables -> None
 *                   PrecisionGoal -> Automatic
 *                   Weights -> Automatic
 * Options:          WorkingPrecision -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GeneralizedLinearModelFit
 * Documentation:    web: http://reference.wolfram.com/language/ref/GeneralizedLinearModelFit.html
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
fun generalizedLinearModelFit(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GeneralizedLinearModelFit", arguments.toMutableList(), options)
}
