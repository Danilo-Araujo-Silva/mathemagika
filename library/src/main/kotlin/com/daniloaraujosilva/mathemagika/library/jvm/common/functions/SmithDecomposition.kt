package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SmithDecomposition
 *
 * Full name:        System`SmithDecomposition
 *
 * Usage:            SmithDecomposition[m] gives the Smith normal form decomposition of an integer matrix m.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SmithDecomposition
 * Documentation:    web: http://reference.wolfram.com/language/ref/SmithDecomposition.html
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
fun smithDecomposition(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SmithDecomposition", arguments.toMutableList(), options)
}
