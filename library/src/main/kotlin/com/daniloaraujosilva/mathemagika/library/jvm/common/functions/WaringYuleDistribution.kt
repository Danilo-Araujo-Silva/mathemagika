package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             WaringYuleDistribution
 *
 * Full name:        System`WaringYuleDistribution
 *
 *                   WaringYuleDistribution[α] represents the Yule distribution with shape parameter α.
 * Usage:            WaringYuleDistribution[α, β] represents the Waring distribution with shape parameters α and β.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/WaringYuleDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/WaringYuleDistribution.html
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
fun waringYuleDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WaringYuleDistribution", arguments.toMutableList(), options)
}
