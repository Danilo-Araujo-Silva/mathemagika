package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Apply
 * 
 * Full name:        System`Apply
 * 
 *                   f @@ expr or Apply[f, expr] replaces the head of expr by f. 
 *                   f@@@expr or Apply[f, expr, {1}] replaces heads at level 1 of expr by f.
 *                   Apply[f, expr, levelspec] replaces heads in parts of expr specified by levelspec. 
 * Usage:            Apply[f] represents an operator form of Apply that can be applied to an expression.
 * 
 * Options:          Heads -> False
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/Apply
 * Documentation:    web: http://reference.wolfram.com/language/ref/Apply.html
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
fun apply(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Apply", arguments.toMutableList(), options)
}
