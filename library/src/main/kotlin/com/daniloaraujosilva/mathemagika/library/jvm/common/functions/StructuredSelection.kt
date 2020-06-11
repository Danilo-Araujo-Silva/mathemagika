package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             StructuredSelection
 *
 * Full name:        System`StructuredSelection
 *
 * Usage:            StructuredSelection is an option for Cell that specifies whether to allow only complete subexpressions in the cell to be selected interactively using the front end.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/StructuredSelection
 * Documentation:    web: http://reference.wolfram.com/language/ref/StructuredSelection.html
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
fun structuredSelection(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StructuredSelection", arguments.toMutableList(), options)
}
