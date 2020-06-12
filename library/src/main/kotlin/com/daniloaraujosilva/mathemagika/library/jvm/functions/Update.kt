package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Update
 *
 * Full name:        System`Update
 *
 *                   Update[symbol] tells the Wolfram Language that hidden changes have been made that could affect values associated with a symbol.
 * Usage:            Update[] specifies that the value of any symbol could be affected.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Update
 * Documentation:    web: http://reference.wolfram.com/language/ref/Update.html
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
fun update(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Update", arguments.toMutableList(), options)
}
