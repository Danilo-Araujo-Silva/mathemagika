package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             TakeSmallestBy
 * 
 * Full name:        System`TakeSmallestBy
 * 
 *                   TakeSmallestBy[list, f, n] gives the n elements e  in list for which f[e ] is smallest, sorted in ascending order.
 *                                                                    i                      i
 *                   TakeSmallestBy[list  prop, f, n] gives the property prop for the n elements in list for which f[e ] is smallest.
 *                                                                                                                     i
 * Usage:            TakeSmallestBy[f, n] represents an operator form of TakeSmallestBy that can be applied to an expression. 
 * 
 * Options:          ExcludedForms -> Automatic
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/TakeSmallestBy
 * Documentation:    web: http://reference.wolfram.com/language/ref/TakeSmallestBy.html
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
fun takeSmallestBy(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TakeSmallestBy", arguments.toMutableList(), options)
}
