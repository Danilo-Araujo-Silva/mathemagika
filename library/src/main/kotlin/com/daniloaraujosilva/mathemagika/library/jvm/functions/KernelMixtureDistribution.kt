package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             KernelMixtureDistribution
 *
 * Full name:        System`KernelMixtureDistribution
 *
 *                   KernelMixtureDistribution[{x , x , …}] represents a kernel mixture distribution based on the data values x .
 *                                               1   2                                                                         i
 *                   KernelMixtureDistribution[{{x , y , …}, {x , y , …}, …}] represents a multivariate kernel mixture distribution based on data values {x , y , …}.
 *                                                1   1        2   2                                                                                       i   i
 *                   KernelMixtureDistribution[…, bw] represents a kernel mixture distribution with bandwidth bw.
 * Usage:            KernelMixtureDistribution[…, bw, ker] represents a kernel mixture distribution with bandwidth bw and smoothing kernel ker.
 *
 * Options:          MaxMixtureKernels -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/KernelMixtureDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/KernelMixtureDistribution.html
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
fun kernelMixtureDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("KernelMixtureDistribution", arguments.toMutableList(), options)
}
