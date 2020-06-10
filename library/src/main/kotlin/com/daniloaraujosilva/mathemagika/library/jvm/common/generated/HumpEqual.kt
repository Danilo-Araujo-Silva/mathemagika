package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             HumpEqual
 * 
 * Full name:        System`HumpEqual
 * 
 * Usage:            HumpEqual[x, y, …] displays as x ≏ y ≏ ….
 * 
 * Options:          None
 * 
 * Attributes:
 * 
 *                   local: paclet:ref/HumpEqual
 * Documentation:    web: http://reference.wolfram.com/language/ref/HumpEqual.html
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
fun humpEqual(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HumpEqual", arguments.toMutableList(), options)
}
