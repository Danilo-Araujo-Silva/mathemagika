package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Congruent
 * 
 * Full name:        System`Congruent
 * 
 * Usage:            Congruent[x, y, …] displays as x ≡ y ≡ ….
 * 
 * Options:          None
 * 
 * Attributes:
 * 
 *                   local: paclet:ref/Congruent
 * Documentation:    web: http://reference.wolfram.com/language/ref/Congruent.html
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
fun congruent(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Congruent", arguments.toMutableList(), options)
}
