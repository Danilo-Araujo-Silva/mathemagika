package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             MoebiusMu
 * 
 * Full name:        System`MoebiusMu
 * 
 * Usage:            MoebiusMu[n] gives the Möbius function μ(n). 
 * 
 * Options:          None
 * 
 *                   Listable
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/MoebiusMu
 * Documentation:    web: http://reference.wolfram.com/language/ref/MoebiusMu.html
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
fun moebiusMu(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MoebiusMu", arguments.toMutableList(), options)
}
