package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SavitzkyGolayMatrix
 *
 * Full name:        System`SavitzkyGolayMatrix
 *
 *                   SavitzkyGolayMatrix[r, k] gives a matrix corresponding to a smoothing kernel of radius r for performing polynomial regression of degree k.
 *                   SavitzkyGolayMatrix[{r , r }, {k , k }] gives a matrix for performing polynomial regression of degree k  over a window of radius r  along rows, and degree k  over a window of radius r  along columns.
 *                                         1   2     1   2                                                                  1                          1                         2                          2
 *                                                                                    th
 *                   SavitzkyGolayMatrix[r, k, n] gives a matrix for performing the n   derivative of a polynomial regression of degree k.
 *                   SavitzkyGolayMatrix[{r , r  … }, {k , k , …}, …] gives an array using the specified parameters for each direction i.
 * Usage:                                  1   2        1   2
 *
 * Options:          WorkingPrecision -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SavitzkyGolayMatrix
 * Documentation:    web: http://reference.wolfram.com/language/ref/SavitzkyGolayMatrix.html
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
fun savitzkyGolayMatrix(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SavitzkyGolayMatrix", arguments.toMutableList(), options)
}
