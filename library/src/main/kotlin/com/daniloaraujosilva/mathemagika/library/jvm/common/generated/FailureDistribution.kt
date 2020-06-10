package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             FailureDistribution
 * 
 * Full name:        System`FailureDistribution
 * 
 *                   FailureDistribution[bexpr, {{x , dist }, {x , dist }, …}] represents the failure distribution for a system with events x  having reliability distribution dist  where the top event occurs when the Boolean expression bexpr is True and event x  has occurred when x  is True.
 * Usage:                                          1      1     2      2                                                                     i                                     i                                                                                 i                    i
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/FailureDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/FailureDistribution.html
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
fun failureDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FailureDistribution", arguments.toMutableList(), options)
}
