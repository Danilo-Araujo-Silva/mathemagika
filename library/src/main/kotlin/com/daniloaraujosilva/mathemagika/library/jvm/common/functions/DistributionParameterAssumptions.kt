package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DistributionParameterAssumptions
 *
 * Full name:        System`DistributionParameterAssumptions
 *
 * Usage:            DistributionParameterAssumptions[dist] gives a logical expression for assumptions on parameters in the symbolic distribution dist.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DistributionParameterAssumptions
 * Documentation:    web: http://reference.wolfram.com/language/ref/DistributionParameterAssumptions.html
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
fun distributionParameterAssumptions(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DistributionParameterAssumptions", arguments.toMutableList(), options)
}
