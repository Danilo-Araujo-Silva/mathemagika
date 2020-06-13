package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             NullSpace
 *
 * Full name:        System`NullSpace
 *
 * Usage:            NullSpace[m] gives a list of vectors that forms a basis for the null space of the matrix m.
 *
 *                   Method -> Automatic
 *                   Modulus -> 0
 *                   Tolerance -> Automatic
 * Options:          ZeroTest -> Automatic
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/NullSpace
 * Documentation:    web: http://reference.wolfram.com/language/ref/NullSpace.html
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
fun nullSpace(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NullSpace", arguments.toMutableList(), options)
}
