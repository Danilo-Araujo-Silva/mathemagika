package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             SuperMinus
 * 
 * Full name:        System`SuperMinus
 * 
 *                                                    -
 * Usage:            SuperMinus[expr] displays as expr .
 * 
 * Options:          None
 * 
 * Attributes:
 * 
 *                   local: paclet:ref/SuperMinus
 * Documentation:    web: http://reference.wolfram.com/language/ref/SuperMinus.html
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
fun superMinus(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SuperMinus", arguments.toMutableList(), options)
}
