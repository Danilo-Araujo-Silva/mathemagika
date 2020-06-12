package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ExportByteArray
 *
 * Full name:        System`ExportByteArray
 *
 *                   ExportByteArray[expr, "format"] generates a ByteArray object corresponding to expr exported in the specified format.
 * Usage:            ExportByteArray[exprs, elems] generates a ByteArray object by treating exprs as elements specified by elems.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ExportByteArray
 * Documentation:    web: http://reference.wolfram.com/language/ref/ExportByteArray.html
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
fun exportByteArray(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ExportByteArray", arguments.toMutableList(), options)
}
