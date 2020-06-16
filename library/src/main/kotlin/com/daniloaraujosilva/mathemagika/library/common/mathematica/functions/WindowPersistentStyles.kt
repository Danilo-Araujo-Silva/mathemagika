package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             WindowPersistentStyles
 *
 * Full name:        System`WindowPersistentStyles
 *
 * Usage:            System`WindowPersistentStyles
 *
 * Options:          None
 *
 * Attributes:       Protected
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
fun windowPersistentStyles(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WindowPersistentStyles", arguments.toMutableList(), options)
}
