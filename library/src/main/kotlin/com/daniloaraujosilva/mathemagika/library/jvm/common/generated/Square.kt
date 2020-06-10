package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Square
 * 
 * Full name:        System`Square
 * 
 * Usage:            Square[x] displays as  x.
 * 
 * Options:          None
 * 
 * Attributes:
 * 
 *                   local: paclet:ref/Square
 * Documentation:    web: http://reference.wolfram.com/language/ref/Square.html
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
fun square(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Square", arguments.toMutableList(), options)
}
