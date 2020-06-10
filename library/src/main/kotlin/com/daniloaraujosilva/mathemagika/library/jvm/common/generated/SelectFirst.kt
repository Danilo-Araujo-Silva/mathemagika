package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             SelectFirst
 * 
 * Full name:        System`SelectFirst
 * 
 *                   SelectFirst[{e , e , …}, crit] gives the first e  for which crit[e ] is True, or Missing["NotFound"] if none is found.
 *                                 1   2                             i                 i
 *                   SelectFirst[{e , e , …}, crit, default] gives default if there is no e  such that crit[e ] is True.
 *                                 1   2                                                   i                 i
 * Usage:            SelectFirst[crit] represents an operator form of SelectFirst that can be applied to an expression.
 * 
 * Options:          None
 * 
 *                   HoldRest
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/SelectFirst
 * Documentation:    web: http://reference.wolfram.com/language/ref/SelectFirst.html
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
fun selectFirst(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SelectFirst", arguments.toMutableList(), options)
}
