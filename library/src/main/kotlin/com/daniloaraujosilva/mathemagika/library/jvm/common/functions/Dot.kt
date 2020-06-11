package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Dot
 *
 * Full name:        System`Dot
 *
 * Usage:            a . b . c or Dot[a, b, c] gives products of vectors, matrices, and tensors.
 *
 * Options:          None
 *
 *                   Flat
 *                   OneIdentity
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Dot
 * Documentation:    web: http://reference.wolfram.com/language/ref/Dot.html
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
fun dot(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Dot", arguments.toMutableList(), options)
}
