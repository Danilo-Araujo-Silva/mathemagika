package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             InsertResults
 * 
 * Full name:        System`InsertResults
 * 
 * Usage:            InsertResults is an option for NotebookEvaluate that determines whether to place the results of evaluation in the notebook being evaluated.
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/InsertResults
 * Documentation:    web: http://reference.wolfram.com/language/ref/InsertResults.html
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
fun insertResults(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("InsertResults", arguments.toMutableList(), options)
}
