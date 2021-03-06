package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             General
 *
 * Full name:        System`General
 *
 * Usage:            General is a symbol to which general system messages are attached.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/General
 * Documentation:    web: http://reference.wolfram.com/language/ref/General.html
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
fun general(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("General", arguments.toMutableList(), options)
}
