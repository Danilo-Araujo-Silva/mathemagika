package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ValueQ
 * 
 * Full name:        System`ValueQ
 * 
 * Usage:            ValueQ[expr] gives True if a value has been defined for expr, and gives False otherwise. 
 * 
 * Options:          None
 * 
 *                   HoldAll
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/ValueQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/ValueQ.html
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
fun valueQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ValueQ", arguments.toMutableList(), options)
}
