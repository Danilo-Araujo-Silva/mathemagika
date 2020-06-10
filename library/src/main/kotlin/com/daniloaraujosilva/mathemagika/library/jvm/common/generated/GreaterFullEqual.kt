package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             GreaterFullEqual
 * 
 * Full name:        System`GreaterFullEqual
 * 
 * Usage:            GreaterFullEqual[x, y, …] displays as x ≧ y ≧ ….
 * 
 * Options:          None
 * 
 * Attributes:
 * 
 *                   local: paclet:ref/GreaterFullEqual
 * Documentation:    web: http://reference.wolfram.com/language/ref/GreaterFullEqual.html
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
fun greaterFullEqual(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GreaterFullEqual", arguments.toMutableList(), options)
}
