package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             PseudoInverse
 *
 * Full name:        System`PseudoInverse
 *
 * Usage:            PseudoInverse[m] finds the pseudoinverse of a rectangular matrix.
 *
 * Options:          Tolerance -> Automatic
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/PseudoInverse
 * Documentation:    web: http://reference.wolfram.com/language/ref/PseudoInverse.html
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
fun pseudoInverse(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PseudoInverse", arguments.toMutableList(), options)
}
