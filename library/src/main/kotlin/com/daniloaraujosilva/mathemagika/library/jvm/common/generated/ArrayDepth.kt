package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ArrayDepth
 * 
 * Full name:        System`ArrayDepth
 * 
 * Usage:            ArrayDepth[expr] gives the depth to which expr is a full array, with all the parts at a particular level having the same length.
 * 
 * Options:          AllowedHeads -> Automatic
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/ArrayDepth
 * Documentation:    web: http://reference.wolfram.com/language/ref/ArrayDepth.html
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
fun arrayDepth(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ArrayDepth", arguments.toMutableList(), options)
}
