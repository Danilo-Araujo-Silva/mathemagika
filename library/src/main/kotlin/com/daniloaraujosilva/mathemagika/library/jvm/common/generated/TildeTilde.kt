package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             TildeTilde
 * 
 * Full name:        System`TildeTilde
 * 
 * Usage:            TildeTilde[x, y, …] displays as x ≈ y ≈ ….
 * 
 * Options:          None
 * 
 * Attributes:
 * 
 *                   local: paclet:ref/TildeTilde
 * Documentation:    web: http://reference.wolfram.com/language/ref/TildeTilde.html
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
fun tildeTilde(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TildeTilde", arguments.toMutableList(), options)
}
