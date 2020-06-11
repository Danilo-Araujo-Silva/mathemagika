package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CellEvaluationFunction
 *
 * Full name:        System`CellEvaluationFunction
 *
 * Usage:            CellEvaluationFunction is an option for Cell that gives a function to be applied to every expression from the cell that is sent to the kernel for ordinary evaluation.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/CellEvaluationFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/CellEvaluationFunction.html
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
fun cellEvaluationFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CellEvaluationFunction", arguments.toMutableList(), options)
}
