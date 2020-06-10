package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Therefore
 * 
 * Full name:        System`Therefore
 * 
 * Usage:            Therefore[x, y] displays as x ∴ y.
 * 
 * Options:          None
 * 
 * Attributes:
 * 
 *                   local: paclet:ref/Therefore
 * Documentation:    web: http://reference.wolfram.com/language/ref/Therefore.html
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
fun therefore(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Therefore", arguments.toMutableList(), options)
}
