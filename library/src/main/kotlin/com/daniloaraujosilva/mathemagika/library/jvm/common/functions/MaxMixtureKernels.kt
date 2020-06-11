package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             MaxMixtureKernels
 *
 * Full name:        System`MaxMixtureKernels
 *
 * Usage:            MaxMixtureKernels is an option for SmoothKernelDistribution and related functions that specifies the maximum number and location of kernel functions to use in the estimation.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MaxMixtureKernels
 * Documentation:    web: http://reference.wolfram.com/language/ref/MaxMixtureKernels.html
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
fun maxMixtureKernels(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MaxMixtureKernels", arguments.toMutableList(), options)
}
