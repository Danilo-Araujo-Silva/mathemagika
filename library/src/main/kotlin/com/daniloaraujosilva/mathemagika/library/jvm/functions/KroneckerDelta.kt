package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             KroneckerDelta
 *
 * Full name:        System`KroneckerDelta
 *
 *                   KroneckerDelta[n , n , …] gives the Kronecker delta δ       , equal to 1 if all the n  are equal, and 0 otherwise.
 *                                   1   2                                n  n  …                         i
 * Usage:                                                                  1  2
 *
 * Options:          None
 *
 *                   NumericFunction
 *                   Orderless
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/KroneckerDelta
 * Documentation:    web: http://reference.wolfram.com/language/ref/KroneckerDelta.html
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
fun kroneckerDelta(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("KroneckerDelta", arguments.toMutableList(), options)
}
