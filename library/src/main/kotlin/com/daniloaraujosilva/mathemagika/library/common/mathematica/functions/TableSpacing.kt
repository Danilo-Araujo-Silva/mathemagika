package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             TableSpacing
 *
 * Full name:        System`TableSpacing
 *
 * Usage:            TableSpacing is an option for TableForm and MatrixForm that specifies how many spaces should be left between each successive row or column.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/TableSpacing
 * Documentation:    web: http://reference.wolfram.com/language/ref/TableSpacing.html
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
fun tableSpacing(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TableSpacing", arguments.toMutableList(), options)
}
