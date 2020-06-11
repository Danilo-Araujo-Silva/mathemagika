package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CommonDefaultFormatTypes
 *
 * Full name:        System`CommonDefaultFormatTypes
 *
 * Usage:            CommonDefaultFormatTypes is an option that specifies default formats for newly created cells.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/CommonDefaultFormatTypes
 * Documentation:    web: http://reference.wolfram.com/language/ref/CommonDefaultFormatTypes.html
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
fun commonDefaultFormatTypes(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CommonDefaultFormatTypes", arguments.toMutableList(), options)
}
