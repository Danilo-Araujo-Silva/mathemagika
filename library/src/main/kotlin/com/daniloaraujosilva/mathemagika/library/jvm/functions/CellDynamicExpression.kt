package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CellDynamicExpression
 *
 * Full name:        System`CellDynamicExpression
 *
 * Usage:            CellDynamicExpression is an option for cells that specifies an expression to be dynamically updated whenever the cell is visible on screen.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/CellDynamicExpression
 * Documentation:    web: http://reference.wolfram.com/language/ref/CellDynamicExpression.html
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
fun cellDynamicExpression(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CellDynamicExpression", arguments.toMutableList(), options)
}
