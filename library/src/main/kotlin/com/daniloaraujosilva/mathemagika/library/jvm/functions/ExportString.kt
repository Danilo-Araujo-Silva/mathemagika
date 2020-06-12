package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ExportString
 *
 * Full name:        System`ExportString
 *
 *                   ExportString[expr, "format"] generates a string corresponding to expr exported in the specified format.
 *                   ExportString[rules, {"format", "Rules"}] gives explicit rules for different elements of the data to be exported.
 * Usage:            ExportString[exprs, elems] generates a string by treating exprs as elements specified by elems.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ExportString
 * Documentation:    web: http://reference.wolfram.com/language/ref/ExportString.html
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
fun exportString(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ExportString", arguments.toMutableList(), options)
}
