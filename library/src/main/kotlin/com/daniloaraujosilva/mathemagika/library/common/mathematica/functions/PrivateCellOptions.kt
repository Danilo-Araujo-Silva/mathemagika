package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             PrivateCellOptions
 *
 * Full name:        System`PrivateCellOptions
 *
 * Usage:            PrivateCellOptions is an option for cells that specifies various low-level cell settings.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/PrivateCellOptions
 * Documentation:    web: http://reference.wolfram.com/language/ref/PrivateCellOptions.html
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
fun privateCellOptions(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PrivateCellOptions", arguments.toMutableList(), options)
}
