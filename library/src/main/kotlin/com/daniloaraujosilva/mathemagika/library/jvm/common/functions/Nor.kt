package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Nor
 *
 * Full name:        System`Nor
 *
 *                   Nor[e , e , …] is the logical NOR function. It evaluates its arguments in order, giving False immediately if any of them are True, and True if they are all False.
 * Usage:                 1   2
 *
 * Options:          None
 *
 *                   HoldAll
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Nor
 * Documentation:    web: http://reference.wolfram.com/language/ref/Nor.html
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
fun nor(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Nor", arguments.toMutableList(), options)
}
