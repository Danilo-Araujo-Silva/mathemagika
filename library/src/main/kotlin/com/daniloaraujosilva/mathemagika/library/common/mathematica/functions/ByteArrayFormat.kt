package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ByteArrayFormat
 *
 * Full name:        System`ByteArrayFormat
 *
 * Usage:            ByteArrayFormat[ba] attempts to determine what ImportByteArray format could be used to import the ByteArray object ba.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ByteArrayFormat
 * Documentation:    web: http://reference.wolfram.com/language/ref/ByteArrayFormat.html
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
fun byteArrayFormat(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ByteArrayFormat", arguments.toMutableList(), options)
}
