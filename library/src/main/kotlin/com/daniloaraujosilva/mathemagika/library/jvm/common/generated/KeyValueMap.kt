package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             KeyValueMap
 * 
 * Full name:        System`KeyValueMap
 * 
 *                   KeyValueMap[f,  key   val , key   val , … ] gives the list {f[key , val ], f[key , val ], …}.
 *                                       1      1     2      2                            1     1        2     2
 * Usage:            KeyValueMap[f] represents an operator form of KeyValueMap that can be applied to an expression.
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/KeyValueMap
 * Documentation:    web: http://reference.wolfram.com/language/ref/KeyValueMap.html
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
fun keyValueMap(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("KeyValueMap", arguments.toMutableList(), options)
}
