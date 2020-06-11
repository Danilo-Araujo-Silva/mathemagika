package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ByteArrayToString
 *
 * Full name:        System`ByteArrayToString
 *
 *                   ByteArrayToString[ba] returns a string by decoding the data in the byte array ba, assuming UTF-8 encoding.
 * Usage:            ByteArrayToString[ba, "encoding"] interprets the data in the specified character encoding.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ByteArrayToString
 * Documentation:    web: http://reference.wolfram.com/language/ref/ByteArrayToString.html
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
fun byteArrayToString(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ByteArrayToString", arguments.toMutableList(), options)
}
