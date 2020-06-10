package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             NotTildeEqual
 * 
 * Full name:        System`NotTildeEqual
 * 
 * Usage:            NotTildeEqual[x, y, …] displays as x ≄ y ≄ ….
 * 
 * Options:          None
 * 
 * Attributes:
 * 
 *                   local: paclet:ref/NotTildeEqual
 * Documentation:    web: http://reference.wolfram.com/language/ref/NotTildeEqual.html
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
fun notTildeEqual(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NotTildeEqual", arguments.toMutableList(), options)
}
