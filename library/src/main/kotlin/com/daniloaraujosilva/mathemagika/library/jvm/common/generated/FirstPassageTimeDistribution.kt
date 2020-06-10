package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             FirstPassageTimeDistribution
 * 
 * Full name:        System`FirstPassageTimeDistribution
 * 
 * Usage:            FirstPassageTimeDistribution[mproc, f] represents the distribution of times for the Markov process mproc to pass from the initial state to final states f for the first time. 
 * 
 * Options:          None
 * 
 *                   NHoldRest
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/FirstPassageTimeDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/FirstPassageTimeDistribution.html
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
fun firstPassageTimeDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FirstPassageTimeDistribution", arguments.toMutableList(), options)
}
