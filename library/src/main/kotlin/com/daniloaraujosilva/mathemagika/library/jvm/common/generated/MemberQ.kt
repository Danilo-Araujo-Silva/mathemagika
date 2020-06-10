package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             MemberQ
 * 
 * Full name:        System`MemberQ
 * 
 *                   MemberQ[list, form] returns True if an element of list matches form, and False otherwise. 
 *                   MemberQ[list, form, levelspec] tests all parts of list specified by levelspec. 
 * Usage:            MemberQ[form] represents an operator form of MemberQ that can be applied to an expression.
 * 
 * Options:          Heads -> False
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/MemberQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/MemberQ.html
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
fun memberQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MemberQ", arguments.toMutableList(), options)
}
