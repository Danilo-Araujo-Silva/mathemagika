package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             StepMonitor
 * 
 * Full name:        System`StepMonitor
 * 
 * Usage:            StepMonitor is an option for iterative numerical computation functions that gives an expression to evaluate whenever a step is taken by the numerical method used. 
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/StepMonitor
 * Documentation:    web: http://reference.wolfram.com/language/ref/StepMonitor.html
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
fun stepMonitor(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StepMonitor", arguments.toMutableList(), options)
}
