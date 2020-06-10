package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             AngleBracket
 * 
 * Full name:        System`AngleBracket
 * 
 * Usage:            AngleBracket[x, y, …] displays as 〈 x, y, … 〉.
 * 
 * Options:          None
 * 
 * Attributes:
 * 
 *                   local: paclet:ref/AngleBracket
 * Documentation:    web: http://reference.wolfram.com/language/ref/AngleBracket.html
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
fun angleBracket(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AngleBracket", arguments.toMutableList(), options)
}
