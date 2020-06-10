package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             VerticalSeparator
 * 
 * Full name:        System`VerticalSeparator
 * 
 * Usage:            VerticalSeparator[x, y, …] displays as x  y  ….
 * 
 * Options:          None
 * 
 * Attributes:
 * 
 *                   local: paclet:ref/VerticalSeparator
 * Documentation:    web: http://reference.wolfram.com/language/ref/VerticalSeparator.html
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
fun verticalSeparator(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("VerticalSeparator", arguments.toMutableList(), options)
}
