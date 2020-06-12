package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ByteArray
 *
 * Full name:        System`ByteArray
 *
 *                   ByteArray[{b , b , …}] constructs a ByteArray object containing the byte values b .
 *                               1   2                                                                i
 * Usage:            ByteArray["string"] constructs a ByteArray object by extracting byte values from a Base64-encoded string.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ByteArray
 * Documentation:    web: http://reference.wolfram.com/language/ref/ByteArray.html
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
fun byteArray(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ByteArray", arguments.toMutableList(), options)
}
