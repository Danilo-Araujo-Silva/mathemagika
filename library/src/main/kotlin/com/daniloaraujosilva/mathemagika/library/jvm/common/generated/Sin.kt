package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Sin
 * 
 * Full name:        System`Sin
 * 
 * Usage:            Sin[z] gives the sine of z. 
 * 
 * Options:          None
 * 
 *                   Listable
 *                   NumericFunction
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/Sin
 * Documentation:    web: http://reference.wolfram.com/language/ref/Sin.html
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
fun sin(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Sin", arguments.toMutableList(), options)
}
