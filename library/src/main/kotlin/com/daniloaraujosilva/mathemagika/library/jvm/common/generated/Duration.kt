package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Duration
 * 
 * Full name:        System`Duration
 * 
 * Usage:            Duration[expr] returns the duration of expr.
 * 
 * Options:          None
 * 
 *                   Listable
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/Duration
 * Documentation:    web: http://reference.wolfram.com/language/ref/Duration.html
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
fun duration(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Duration", arguments.toMutableList(), options)
}
