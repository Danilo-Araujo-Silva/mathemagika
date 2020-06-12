package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Depth
 *
 * Full name:        System`Depth
 *
 * Usage:            Depth[expr] gives the maximum number of indices needed to specify any part of expr, plus 1.
 *
 * Options:          Heads -> False
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Depth
 * Documentation:    web: http://reference.wolfram.com/language/ref/Depth.html
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
fun depth(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Depth", arguments.toMutableList(), options)
}
