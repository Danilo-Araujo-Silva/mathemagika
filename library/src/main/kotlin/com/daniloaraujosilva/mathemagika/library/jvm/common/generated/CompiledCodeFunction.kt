package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             CompiledCodeFunction
 * 
 * Full name:        System`CompiledCodeFunction
 * 
 * Usage:            CompiledCodeFunction[…] is a function created by FunctionCompile that contains compiled code that is run when the CompiledCodeFunction is applied to suitable arguments. 
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/CompiledCodeFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/CompiledCodeFunction.html
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
fun compiledCodeFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CompiledCodeFunction", arguments.toMutableList(), options)
}
