package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CrossMatrix
 *
 * Full name:        System`CrossMatrix
 *
 *                   CrossMatrix[r] gives a matrix whose elements are 1 in a centered cross-shaped region that extends r positions along each index direction, and are 0 otherwise.
 *                   CrossMatrix[r, w] gives a w × w matrix containing a cross-shaped region of 1s.
 *                                                                                                                                                         th
 *                   CrossMatrix[{r , r , …}, …] yields an array whose elements are 1 in a centered cross-shaped region that extends r  positions in the i   index direction.
 * Usage:                          1   2                                                                                              i
 *
 * Options:
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CrossMatrix
 * Documentation:    web: http://reference.wolfram.com/language/ref/CrossMatrix.html
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
fun crossMatrix(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CrossMatrix", arguments.toMutableList(), options)
}
