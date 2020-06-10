package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Sign
 * 
 * Full name:        System`Sign
 * 
 * Usage:            Sign[x] gives -1, 0, or 1 depending on whether x is negative, zero, or positive. 
 * 
 * Options:          None
 * 
 *                   Listable
 *                   NumericFunction
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/Sign
 * Documentation:    web: http://reference.wolfram.com/language/ref/Sign.html
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
fun sign(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Sign", arguments.toMutableList(), options)
}
