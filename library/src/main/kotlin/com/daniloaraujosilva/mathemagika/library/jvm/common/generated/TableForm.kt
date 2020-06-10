package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             TableForm
 * 
 * Full name:        System`TableForm
 * 
 * Usage:            TableForm[list] prints with the elements of list arranged in an array of rectangular cells. 
 * 
 *                   TableAlignments -> Automatic
 *                   TableDepth -> Infinity
 *                   TableDirections -> Column
 *                   TableHeadings -> None
 * Options:          TableSpacing -> Automatic
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/TableForm
 * Documentation:    web: http://reference.wolfram.com/language/ref/TableForm.html
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
fun tableForm(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TableForm", arguments.toMutableList(), options)
}
