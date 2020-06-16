package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Vectors
 *
 * Full name:        System`Vectors
 *
 *                   Vectors[d] represents the domain of vectors of dimension d.
 * Usage:            Vectors[d, dom] represents the domain of vectors of dimension d, with components in the domain dom.
 *
 * Options:          None
 *
 *                   NHoldAll
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Vectors
 * Documentation:    web: http://reference.wolfram.com/language/ref/Vectors.html
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
fun vectors(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Vectors", arguments.toMutableList(), options)
}
