package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Dimensions
 * 
 * Full name:        System`Dimensions
 * 
 *                   Dimensions[expr] gives a list of the dimensions of expr. 
 * Usage:            Dimensions[expr, n] gives a list of the dimensions of expr down to level n. 
 * 
 * Options:          AllowedHeads -> Automatic
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/Dimensions
 * Documentation:    web: http://reference.wolfram.com/language/ref/Dimensions.html
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
fun dimensions(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Dimensions", arguments.toMutableList(), options)
}
