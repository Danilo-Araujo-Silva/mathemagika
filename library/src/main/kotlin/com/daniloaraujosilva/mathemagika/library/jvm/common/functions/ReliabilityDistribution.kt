package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ReliabilityDistribution
 *
 * Full name:        System`ReliabilityDistribution
 *
 *                   ReliabilityDistribution[bexpr, {{x , dist }, {x , dist }, …}] represents the reliability distribution for a system with components x  having reliability distribution dist , where the whole system is working when the Boolean expression bexpr is True, and component x  is working when x  is True.
 * Usage:                                              1      1     2      2                                                                             i                                     i                                                                                              i                  i
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ReliabilityDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/ReliabilityDistribution.html
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
fun reliabilityDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ReliabilityDistribution", arguments.toMutableList(), options)
}
