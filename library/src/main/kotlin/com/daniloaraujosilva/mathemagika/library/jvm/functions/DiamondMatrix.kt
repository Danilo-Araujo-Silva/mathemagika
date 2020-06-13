package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             DiamondMatrix
 *
 * Full name:        System`DiamondMatrix
 *
 *                   DiamondMatrix[r] gives a matrix whose elements are 1 in a diamond-shaped region that extends r index positions to each side, and are 0 otherwise.
 *                   DiamondMatrix[r, w] gives a w × w matrix containing a diamond-shaped region of 1s.
 *                                                                                                                                                          th
 *                   DiamondMatrix[{r , r , …}, …] yields an array whose elements are 1 in a diamond-shaped region that extends r  index positions in the i   direction.
 * Usage:                            1   2                                                                                       i
 *
 * Options:
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DiamondMatrix
 * Documentation:    web: http://reference.wolfram.com/language/ref/DiamondMatrix.html
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
fun diamondMatrix(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DiamondMatrix", arguments.toMutableList(), options)
}
