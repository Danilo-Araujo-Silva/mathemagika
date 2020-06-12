package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             NumericalOrder
 *
 * Full name:        System`NumericalOrder
 *
 *                   NumericalOrder[e , e ] gives 1 if e  < e , -1 if e  > e , 0 if e  and e  are identical or numerically the same and Order[e , e ] if e  and e  are not numerically comparable.
 * Usage:                            1   2              1    2         1    2        1      2                                                  1   2      1      2
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/NumericalOrder
 * Documentation:    web: http://reference.wolfram.com/language/ref/NumericalOrder.html
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
fun numericalOrder(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NumericalOrder", arguments.toMutableList(), options)
}
