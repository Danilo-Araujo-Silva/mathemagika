package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             NetDecoder
 *
 * Full name:        System`NetDecoder
 *
 *                   NetDecoder["name"] represents a decoder that takes a net representation and decodes it into an expression of a given form.
 * Usage:            NetDecoder[{"name", …}] represents a decoder with additional parameters specified.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/NetDecoder
 * Documentation:    web: http://reference.wolfram.com/language/ref/NetDecoder.html
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
fun netDecoder(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NetDecoder", arguments.toMutableList(), options)
}
