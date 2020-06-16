package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             DefaultTextFormatType
 *
 * Full name:        System`DefaultTextFormatType
 *
 * Usage:            System`DefaultTextFormatType
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
fun defaultTextFormatType(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DefaultTextFormatType", arguments.toMutableList(), options)
}
