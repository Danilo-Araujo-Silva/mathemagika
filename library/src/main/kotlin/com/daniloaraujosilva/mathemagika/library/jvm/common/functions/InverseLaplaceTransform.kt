package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             InverseLaplaceTransform
 *
 * Full name:        System`InverseLaplaceTransform
 *
 *                   InverseLaplaceTransform[expr, s, t] gives the inverse Laplace transform of expr.
 *                   InverseLaplaceTransform[expr, {s , s , …}, {t , t , …}] gives the multidimensional inverse Laplace transform of expr.
 * Usage:                                            1   2        1   2
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/InverseLaplaceTransform
 * Documentation:    web: http://reference.wolfram.com/language/ref/InverseLaplaceTransform.html
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
fun inverseLaplaceTransform(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("InverseLaplaceTransform", arguments.toMutableList(), options)
}
