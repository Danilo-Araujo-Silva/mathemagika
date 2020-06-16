package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             AutoloadPath
 *
 * Full name:        System`AutoloadPath
 *
 * Usage:            AutoloadPath is a global option that specifies from which directories packages are automatically loaded when the Wolfram System is started.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/AutoloadPath
 * Documentation:    web: http://reference.wolfram.com/language/ref/AutoloadPath.html
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
fun autoloadPath(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AutoloadPath", arguments.toMutableList(), options)
}
