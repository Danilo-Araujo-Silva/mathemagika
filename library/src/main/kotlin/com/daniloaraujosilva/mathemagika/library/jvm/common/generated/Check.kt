package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Check
 * 
 * Full name:        System`Check
 * 
 *                   Check[expr, failexpr] evaluates expr, and returns the result, unless messages were generated, in which case it evaluates and returns failexpr. 
 *                   Check[expr, failexpr, {s  :: t , s  :: t , …}] checks only for the specified messages. 
 *                                           1     1   2     2
 * Usage:            Check[expr, failexpr, "name"] checks only for messages in the named message group.
 * 
 * Options:          None
 * 
 *                   HoldAll
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/Check
 * Documentation:    web: http://reference.wolfram.com/language/ref/Check.html
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
fun check(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Check", arguments.toMutableList(), options)
}
