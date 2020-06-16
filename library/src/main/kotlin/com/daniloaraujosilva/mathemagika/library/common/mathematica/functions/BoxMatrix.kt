package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             BoxMatrix
 *
 * Full name:        System`BoxMatrix
 *
 *                   BoxMatrix[r] gives a (2 r + 1) × (2r + 1) matrix of 1s.
 *                   BoxMatrix[r, w] gives a (2 r + 1) × (2r + 1) block of 1s centered in a w × w matrix of 0s.
 *                   BoxMatrix[{r , r , …}, …] gives a (2 r  + 1) × (2 r  + 1) × … array of 1s.
 * Usage:                        1   2                     1            2
 *
 * Options:
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/BoxMatrix
 * Documentation:    web: http://reference.wolfram.com/language/ref/BoxMatrix.html
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
fun boxMatrix(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BoxMatrix", arguments.toMutableList(), options)
}
