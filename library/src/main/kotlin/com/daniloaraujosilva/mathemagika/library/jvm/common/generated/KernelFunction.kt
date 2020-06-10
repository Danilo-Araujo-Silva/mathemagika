package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             KernelFunction
 * 
 * Full name:        System`KernelFunction
 * 
 * Usage:            KernelFunction[f] represents a function to be evaluated in the Wolfram Engine kernel, even when it is called inside compiled code.
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/KernelFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/KernelFunction.html
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
fun kernelFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("KernelFunction", arguments.toMutableList(), options)
}
