package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             CirclePlus
 * 
 * Full name:        System`CirclePlus
 * 
 * Usage:            CirclePlus[x, y, …] displays as x ⊕ y ⊕ ….
 * 
 * Options:          None
 * 
 * Attributes:
 * 
 *                   local: paclet:ref/CirclePlus
 * Documentation:    web: http://reference.wolfram.com/language/ref/CirclePlus.html
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
fun circlePlus(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CirclePlus", arguments.toMutableList(), options)
}
