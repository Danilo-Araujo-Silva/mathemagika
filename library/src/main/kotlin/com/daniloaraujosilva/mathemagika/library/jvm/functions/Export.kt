package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Export
 *
 * Full name:        System`Export
 *
 *                   Export["dest.ext", expr] exports data to a file, converting it to the format corresponding to the file extension ext.
 *                   Export[dest, expr, "format"] exports data in the specified format.
 *                   Export[dest, exprs, elements] exports data by treating exprs as elements.
 * Usage:            Export[dest, exprs, elements, options] uses the specified options.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Export
 * Documentation:    web: http://reference.wolfram.com/language/ref/Export.html
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
fun export(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Export", arguments.toMutableList(), options)
}
