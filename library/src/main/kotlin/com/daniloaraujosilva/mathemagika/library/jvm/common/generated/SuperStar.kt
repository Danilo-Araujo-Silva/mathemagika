package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             SuperStar
 * 
 * Full name:        System`SuperStar
 * 
 *                                                   *
 * Usage:            SuperStar[expr] displays as expr .
 * 
 * Options:          None
 * 
 * Attributes:
 * 
 *                   local: paclet:ref/SuperStar
 * Documentation:    web: http://reference.wolfram.com/language/ref/SuperStar.html
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
fun superStar(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SuperStar", arguments.toMutableList(), options)
}
