package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             NumericalSort
 *
 * Full name:        System`NumericalSort
 *
 * Usage:            NumericalSort[list] sorts the elements of list into numerical order.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/NumericalSort
 * Documentation:    web: http://reference.wolfram.com/language/ref/NumericalSort.html
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
fun numericalSort(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NumericalSort", arguments.toMutableList(), options)
}
