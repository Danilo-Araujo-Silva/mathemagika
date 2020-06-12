package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             KumaraswamyDistribution
 *
 * Full name:        System`KumaraswamyDistribution
 *
 * Usage:            KumaraswamyDistribution[α, β] represents a Kumaraswamy distribution with shape parameters α and β.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/KumaraswamyDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/KumaraswamyDistribution.html
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
fun kumaraswamyDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("KumaraswamyDistribution", arguments.toMutableList(), options)
}
