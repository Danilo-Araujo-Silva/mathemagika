package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             AxesOrigin
 *
 * Full name:        System`AxesOrigin
 *
 * Usage:            AxesOrigin is an option for graphics functions that specifies where any axes drawn should cross.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/AxesOrigin
 * Documentation:    web: http://reference.wolfram.com/language/ref/AxesOrigin.html
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
fun axesOrigin(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AxesOrigin", arguments.toMutableList(), options)
}
