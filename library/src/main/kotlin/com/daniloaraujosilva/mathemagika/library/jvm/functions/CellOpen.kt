package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             CellOpen
 *
 * Full name:        System`CellOpen
 *
 * Usage:            CellOpen is an option for Cell that specifies whether the contents of a cell should be explicitly displayed.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/CellOpen
 * Documentation:    web: http://reference.wolfram.com/language/ref/CellOpen.html
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
fun cellOpen(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CellOpen", arguments.toMutableList(), options)
}
