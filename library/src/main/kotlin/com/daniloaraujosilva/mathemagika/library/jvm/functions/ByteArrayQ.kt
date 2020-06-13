package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ByteArrayQ
 *
 * Full name:        System`ByteArrayQ
 *
 * Usage:            ByteArrayQ[expr] gives True if expr is a valid ByteArray object, and False otherwise.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ByteArrayQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/ByteArrayQ.html
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
fun byteArrayQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ByteArrayQ", arguments.toMutableList(), options)
}
