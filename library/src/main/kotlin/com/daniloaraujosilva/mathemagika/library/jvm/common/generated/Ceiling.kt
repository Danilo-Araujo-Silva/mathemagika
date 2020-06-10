package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Ceiling
 * 
 * Full name:        System`Ceiling
 * 
 *                   Ceiling[x] gives the smallest integer greater than or equal to x. 
 * Usage:            Ceiling[x, a] gives the smallest multiple of a greater than or equal to x. 
 * 
 * Options:          None
 * 
 *                   Listable
 *                   NumericFunction
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/Ceiling
 * Documentation:    web: http://reference.wolfram.com/language/ref/Ceiling.html
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
fun ceiling(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Ceiling", arguments.toMutableList(), options)
}
