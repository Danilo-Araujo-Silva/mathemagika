package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             MaxExtraBandwidths
 *
 * Full name:        System`MaxExtraBandwidths
 *
 * Usage:            MaxExtraBandwidths is an option to SmoothKernelDistribution that controls the behavior outside that data range.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MaxExtraBandwidths
 * Documentation:    web: http://reference.wolfram.com/language/ref/MaxExtraBandwidths.html
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
fun maxExtraBandwidths(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MaxExtraBandwidths", arguments.toMutableList(), options)
}
