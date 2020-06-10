package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             CheckAbort
 * 
 * Full name:        System`CheckAbort
 * 
 * Usage:            CheckAbort[expr, failexpr] evaluates expr, returning failexpr if an abort occurs. 
 * 
 * Options:          None
 * 
 *                   HoldAll
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/CheckAbort
 * Documentation:    web: http://reference.wolfram.com/language/ref/CheckAbort.html
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
fun checkAbort(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CheckAbort", arguments.toMutableList(), options)
}
