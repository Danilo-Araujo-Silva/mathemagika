package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             BinaryFormat
 *
 * Full name:        System`BinaryFormat
 *
 * Usage:            BinaryFormat is an option for OpenRead and related functions that specifies that a stream should be opened in binary format, so that no textual interpretation of newlines or other data is done.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/BinaryFormat
 * Documentation:    web: http://reference.wolfram.com/language/ref/BinaryFormat.html
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
fun binaryFormat(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BinaryFormat", arguments.toMutableList(), options)
}
