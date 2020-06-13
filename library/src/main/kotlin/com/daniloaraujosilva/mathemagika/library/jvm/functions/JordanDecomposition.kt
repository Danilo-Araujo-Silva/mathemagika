package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             JordanDecomposition
 *
 * Full name:        System`JordanDecomposition
 *
 * Usage:            JordanDecomposition[m] yields the Jordan decomposition of a square matrix m. The result is a list {s, j} where s is a similarity matrix and j is the Jordan canonical form of m.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/JordanDecomposition
 * Documentation:    web: http://reference.wolfram.com/language/ref/JordanDecomposition.html
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
fun jordanDecomposition(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("JordanDecomposition", arguments.toMutableList(), options)
}
