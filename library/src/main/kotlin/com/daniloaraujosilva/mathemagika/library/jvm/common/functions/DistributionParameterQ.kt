package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DistributionParameterQ
 *
 * Full name:        System`DistributionParameterQ
 *
 * Usage:            DistributionParameterQ[dist] yields True if dist is a valid distribution, and yields False otherwise.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DistributionParameterQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/DistributionParameterQ.html
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
fun distributionParameterQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DistributionParameterQ", arguments.toMutableList(), options)
}
