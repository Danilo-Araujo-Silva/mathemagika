package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SmoothKernelDistribution
 *
 * Full name:        System`SmoothKernelDistribution
 *
 *                   SmoothKernelDistribution[{x , x , …}] represents a smooth kernel distribution based on the data values x .
 *                                              1   2                                                                        i
 *                   SmoothKernelDistribution[{{x , y , …}, {x , y , …}, …}] represents a multivariate smooth kernel distribution based on the data values {x , y , …}.
 *                                               1   1        2   2                                                                                          i   i
 *                   SmoothKernelDistribution[…, bw] represents a smooth kernel distribution with bandwidth bw.
 * Usage:            SmoothKernelDistribution[…, bw, ker] represents a smooth kernel distribution with bandwidth bw and smoothing kernel ker.
 *
 *                   InterpolationPoints -> Automatic
 *                   MaxExtraBandwidths -> Automatic
 *                   MaxMixtureKernels -> Automatic
 *                   MaxRecursion -> Automatic
 * Options:          PerformanceGoal -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SmoothKernelDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/SmoothKernelDistribution.html
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
fun smoothKernelDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SmoothKernelDistribution", arguments.toMutableList(), options)
}
