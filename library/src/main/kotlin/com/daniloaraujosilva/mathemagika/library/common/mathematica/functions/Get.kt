package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Get
 *
 * Full name:        System`Get
 *
 *                   << name reads in a file, evaluating each expression in it and returning the last one.
 *                   Get[stream] reads from a stream, evaluating each expression in it and returning the last one.
 * Usage:            Get["file", "key"] reads a file that has been encoded using Encode["source", "file", "key"].
 *
 *                   CharacterEncoding :> $CharacterEncoding
 *                   Method -> Automatic
 * Options:          Path :> $Path
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Get
 * Documentation:    web: http://reference.wolfram.com/language/ref/Get.html
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
fun `get`(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Get", arguments.toMutableList(), options)
}
