package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             OptionValueBox
 *
 * Full name:        System`OptionValueBox
 *
 * Usage:            System`OptionValueBox
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: <>None[Local]
 * Documentation:    web: <>None[Web]
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
fun optionValueBox(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("OptionValueBox", arguments.toMutableList(), options)
}
