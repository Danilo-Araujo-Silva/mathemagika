package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             EvaluationCell
 * 
 * Full name:        System`EvaluationCell
 * 
 * Usage:            EvaluationCell[] returns a CellObject corresponding to the cell in which this function is being evaluated.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/EvaluationCell
 * Documentation:    web: http://reference.wolfram.com/language/ref/EvaluationCell.html
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
fun evaluationCell(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EvaluationCell", arguments.toMutableList(), options)
}
