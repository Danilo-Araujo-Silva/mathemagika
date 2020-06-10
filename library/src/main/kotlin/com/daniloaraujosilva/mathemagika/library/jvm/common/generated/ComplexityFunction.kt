package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ComplexityFunction
 * 
 * Full name:        System`ComplexityFunction
 * 
 * Usage:            ComplexityFunction is an option for Simplify and other functions which gives a function to rank the complexity of different forms of an expression. 
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/ComplexityFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/ComplexityFunction.html
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
fun complexityFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ComplexityFunction", arguments.toMutableList(), options)
}
