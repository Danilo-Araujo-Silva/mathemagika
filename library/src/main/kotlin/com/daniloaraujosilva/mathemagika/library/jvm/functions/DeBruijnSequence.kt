package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DeBruijnSequence
 *
 * Full name:        System`DeBruijnSequence
 *
 *                   DeBruijnSequence[list, n] gives a de Bruijn sequence on the elements in list taken n at a time.
 *                   DeBruijnSequence[k, n] gives a de Bruijn sequence on the elements 0, …, k - 1.
 * Usage:            DeBruijnSequence["string", n] gives a de Bruijn sequence on the characters in "string".
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DeBruijnSequence
 * Documentation:    web: http://reference.wolfram.com/language/ref/DeBruijnSequence.html
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
fun deBruijnSequence(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DeBruijnSequence", arguments.toMutableList(), options)
}
