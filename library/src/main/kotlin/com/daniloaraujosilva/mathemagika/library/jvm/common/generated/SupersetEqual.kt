package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             SupersetEqual
 * 
 * Full name:        System`SupersetEqual
 * 
 * Usage:            SupersetEqual[x, y, …] displays as x ⊇ y ⊇ ….
 * 
 * Options:          None
 * 
 * Attributes:
 * 
 *                   local: paclet:ref/SupersetEqual
 * Documentation:    web: http://reference.wolfram.com/language/ref/SupersetEqual.html
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
fun supersetEqual(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SupersetEqual", arguments.toMutableList(), options)
}
