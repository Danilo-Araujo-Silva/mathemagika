package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             MatrixPropertyDistribution
 *
 * Full name:        System`MatrixPropertyDistribution
 *
 *                   MatrixPropertyDistribution[expr, x  mdist] represents the distribution of the matrix property expr where the matrix-valued random variable x follows the matrix distribution mdist.
 *                   MatrixPropertyDistribution[expr, {x   mdist , x   mdist , …}] represents the distribution where x , x , … are independent and follow the matrix distributions mdist , mdist , ….
 * Usage:                                               1        1   2        2                                         1   2                                                             1       2
 *
 * Options:          None
 *
 *                   HoldAll
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MatrixPropertyDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/MatrixPropertyDistribution.html
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
fun matrixPropertyDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MatrixPropertyDistribution", arguments.toMutableList(), options)
}
