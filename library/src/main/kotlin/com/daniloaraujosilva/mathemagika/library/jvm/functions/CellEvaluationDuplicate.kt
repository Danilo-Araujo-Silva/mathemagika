package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CellEvaluationDuplicate
 *
 * Full name:        System`CellEvaluationDuplicate
 *
 * Usage:            CellEvaluationDuplicate is an option for Cell which specifies whether the front end should make a copy of the cell before performing any evaluation of its contents that you request.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/CellEvaluationDuplicate
 * Documentation:    web: http://reference.wolfram.com/language/ref/CellEvaluationDuplicate.html
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
fun cellEvaluationDuplicate(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CellEvaluationDuplicate", arguments.toMutableList(), options)
}
