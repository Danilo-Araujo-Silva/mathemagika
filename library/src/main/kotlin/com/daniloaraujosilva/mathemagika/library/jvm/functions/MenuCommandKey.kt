package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             MenuCommandKey
 *
 * Full name:        System`MenuCommandKey
 *
 * Usage:            MenuCommandKey is an option for cells that specifies the keyboard shortcut to be associated with a style listed in the Format ▶ Style submenu.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/MenuCommandKey
 * Documentation:    web: http://reference.wolfram.com/language/ref/MenuCommandKey.html
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
fun menuCommandKey(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MenuCommandKey", arguments.toMutableList(), options)
}
