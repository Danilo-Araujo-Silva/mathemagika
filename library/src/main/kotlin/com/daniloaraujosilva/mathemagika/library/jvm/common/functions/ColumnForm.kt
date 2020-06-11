package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ColumnForm
 *
 * Full name:        System`ColumnForm
 *
 *                   ColumnForm[{e , e , …}] prints as a column with e  above e , etc.
 *                                1   2                               1        2
 *                   ColumnForm[list, horiz] specifies the horizontal alignment of each element.
 * Usage:            ColumnForm[list, horiz, vert] also specifies the vertical alignment of the whole column.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ColumnForm
 * Documentation:    web: http://reference.wolfram.com/language/ref/ColumnForm.html
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
fun columnForm(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ColumnForm", arguments.toMutableList(), options)
}
