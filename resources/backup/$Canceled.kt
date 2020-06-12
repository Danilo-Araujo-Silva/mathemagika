package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             $Canceled
 *
 * Full name:        System`$Canceled
 *
 * Usage:            $Canceled is a symbol returned when notebook input is canceled, for example from a dialog box.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/$Canceled
 * Documentation:    web: http://reference.wolfram.com/language/ref/$Canceled.html
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
fun `$Canceled`(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("\$Canceled", arguments.toMutableList(), options)
}
