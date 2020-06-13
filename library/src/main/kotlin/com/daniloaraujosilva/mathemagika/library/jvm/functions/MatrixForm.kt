package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             MatrixForm
 *
 * Full name:        System`MatrixForm
 *
 * Usage:            MatrixForm[list] prints with the elements of list arranged in a regular array.
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
 *                   local: paclet:ref/MatrixForm
 * Documentation:    web: http://reference.wolfram.com/language/ref/MatrixForm.html
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
fun matrixForm(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MatrixForm", arguments.toMutableList(), options)
}
