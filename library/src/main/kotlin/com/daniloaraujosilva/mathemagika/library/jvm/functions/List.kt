package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             List
 *
 * Full name:        System`List
 *
 *                   {e , e , …} is a list of elements.
 * Usage:              1   2
 *
 * Options:          None
 *
 *                   Locked
 * Attributes:       Protected
 *
 *                   local: paclet:ref/List
 * Documentation:    web: http://reference.wolfram.com/language/ref/List.html
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
fun list(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("List", arguments.toMutableList(), options)
}
