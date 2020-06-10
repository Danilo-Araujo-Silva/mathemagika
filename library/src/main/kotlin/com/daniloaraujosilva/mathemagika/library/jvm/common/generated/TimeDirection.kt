package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             TimeDirection
 * 
 * Full name:        System`TimeDirection
 * 
 * Usage:            TimeDirection is an option for Sunrise, Sunset, and related functions that specifies whether the next or last event should be returned.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/TimeDirection
 * Documentation:    web: http://reference.wolfram.com/language/ref/TimeDirection.html
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
fun timeDirection(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TimeDirection", arguments.toMutableList(), options)
}
