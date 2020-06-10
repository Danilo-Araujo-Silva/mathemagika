package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             MinkowskiQuestionMark
 * 
 * Full name:        System`MinkowskiQuestionMark
 * 
 * Usage:            MinkowskiQuestionMark[x] gives Minkowski's question mark function ? (x).
 * 
 * Options:          None
 * 
 *                   Listable
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/MinkowskiQuestionMark
 * Documentation:    web: http://reference.wolfram.com/language/ref/MinkowskiQuestionMark.html
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
fun minkowskiQuestionMark(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MinkowskiQuestionMark", arguments.toMutableList(), options)
}
