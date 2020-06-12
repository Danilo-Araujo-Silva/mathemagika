package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ColumnsEqual
 *
 * Full name:        System`ColumnsEqual
 *
 * Usage:            ColumnsEqual is an option for the low-level function GridBox which specifies whether all columns in the grid should be assigned equal width.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ColumnsEqual
 * Documentation:    web: http://reference.wolfram.com/language/ref/ColumnsEqual.html
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
fun columnsEqual(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ColumnsEqual", arguments.toMutableList(), options)
}
