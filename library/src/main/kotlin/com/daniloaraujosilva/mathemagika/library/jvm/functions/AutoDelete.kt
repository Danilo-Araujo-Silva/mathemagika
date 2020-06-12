package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             AutoDelete
 *
 * Full name:        System`AutoDelete
 *
 * Usage:            AutoDelete is an option for boxes that specifies whether a box is automatically deleted when its contents are edited.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/AutoDelete
 * Documentation:    web: http://reference.wolfram.com/language/ref/AutoDelete.html
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
fun autoDelete(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AutoDelete", arguments.toMutableList(), options)
}
