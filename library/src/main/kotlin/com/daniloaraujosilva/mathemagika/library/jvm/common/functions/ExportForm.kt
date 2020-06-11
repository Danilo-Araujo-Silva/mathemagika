package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ExportForm
 *
 * Full name:        System`ExportForm
 *
 *                   ExportForm[expr, "fmt"] specifies that expr should be exported in the specified format in functions like CloudDeploy and in external results from APIFunction and FormFunction.
 * Usage:            ExportForm[expr, {"fmt", "type"}] specifies that when expr is exported, it should be tagged as having the specified MIME type.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ExportForm
 * Documentation:    web: http://reference.wolfram.com/language/ref/ExportForm.html
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
fun exportForm(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ExportForm", arguments.toMutableList(), options)
}
