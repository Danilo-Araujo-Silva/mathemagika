package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FormatType
 *
 * Full name:        System`FormatType
 *
 * Usage:            FormatType is an option for output streams, graphics, and functions such as Text that specifies the default format type to use when outputting expressions.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/FormatType
 * Documentation:    web: http://reference.wolfram.com/language/ref/FormatType.html
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
fun formatType(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FormatType", arguments.toMutableList(), options)
}
