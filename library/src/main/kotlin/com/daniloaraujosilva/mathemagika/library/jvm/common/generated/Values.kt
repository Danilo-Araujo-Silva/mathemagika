package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Values
 * 
 * Full name:        System`Values
 * 
 *                   Values[ key   val , key   val , … ] gives a list of the values val  in an association.
 *                               1      1     2      2                                     i
 *                   Values[{key   val , key   val , …}] gives a list of the val  in a list of rules.
 *                              1      1     2      2                             i
 * Usage:            Values[expr, h] gives a list of values in expr, wrapping each of them with head h before evaluation. 
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/Values
 * Documentation:    web: http://reference.wolfram.com/language/ref/Values.html
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
fun values(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Values", arguments.toMutableList(), options)
}
