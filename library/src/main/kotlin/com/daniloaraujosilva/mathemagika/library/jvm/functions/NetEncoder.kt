package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             NetEncoder
 *
 * Full name:        System`NetEncoder
 *
 *                   NetEncoder["name"] represents an encoder that takes a given form of input and encodes it as an array for use in a net.
 * Usage:            NetEncoder[{"name", …}] represents an encoder with additional parameters specified.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/NetEncoder
 * Documentation:    web: http://reference.wolfram.com/language/ref/NetEncoder.html
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
fun netEncoder(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NetEncoder", arguments.toMutableList(), options)
}
