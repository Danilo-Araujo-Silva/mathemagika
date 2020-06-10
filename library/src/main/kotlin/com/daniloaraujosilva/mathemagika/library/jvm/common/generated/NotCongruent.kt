package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             NotCongruent
 * 
 * Full name:        System`NotCongruent
 * 
 * Usage:            NotCongruent[x, y, …] displays as x ≢ y ≢ ….
 * 
 * Options:          None
 * 
 * Attributes:
 * 
 *                   local: paclet:ref/NotCongruent
 * Documentation:    web: http://reference.wolfram.com/language/ref/NotCongruent.html
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
fun notCongruent(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NotCongruent", arguments.toMutableList(), options)
}
