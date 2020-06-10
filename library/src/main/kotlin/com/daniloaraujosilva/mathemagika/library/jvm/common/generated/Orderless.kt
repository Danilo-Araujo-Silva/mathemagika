package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Orderless
 * 
 * Full name:        System`Orderless
 * 
 *                   Orderless is an attribute that can be assigned to a symbol f to indicate that the elements e  in expressions of the form f[e , e , …] should automatically be sorted into canonical order. This property is accounted for in pattern matching. 
 * Usage:                                                                                                        i                               1   2
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/Orderless
 * Documentation:    web: http://reference.wolfram.com/language/ref/Orderless.html
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
fun orderless(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Orderless", arguments.toMutableList(), options)
}
