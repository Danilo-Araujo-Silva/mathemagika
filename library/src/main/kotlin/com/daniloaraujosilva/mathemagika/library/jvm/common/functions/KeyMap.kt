package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             KeyMap
 *
 * Full name:        System`KeyMap
 *
 *                   KeyMap[f,  key   val , key   val , … ] maps f over the keys in an association, giving  f[key ]  val , f[key ]  val , … .
 *                                  1      1     2      2                                                             1       1       2       2
 * Usage:            KeyMap[f] represents an operator form of KeyMap that can be applied to an expression.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/KeyMap
 * Documentation:    web: http://reference.wolfram.com/language/ref/KeyMap.html
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
fun keyMap(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("KeyMap", arguments.toMutableList(), options)
}
