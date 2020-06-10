package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             PrependTo
 * 
 * Full name:        System`PrependTo
 * 
 * Usage:            PrependTo[s, elem] prepends elem to the value of s, and resets s to the result. 
 * 
 * Options:          None
 * 
 *                   HoldFirst
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/PrependTo
 * Documentation:    web: http://reference.wolfram.com/language/ref/PrependTo.html
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
fun prependTo(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PrependTo", arguments.toMutableList(), options)
}
