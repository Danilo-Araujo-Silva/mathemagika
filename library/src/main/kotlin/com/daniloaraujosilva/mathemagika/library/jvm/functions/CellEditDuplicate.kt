package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             CellEditDuplicate
 *
 * Full name:        System`CellEditDuplicate
 *
 * Usage:            CellEditDuplicate is an option for Cell which specifies whether the front end should make a copy of the cell before actually applying any changes in its contents that you request.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/CellEditDuplicate
 * Documentation:    web: http://reference.wolfram.com/language/ref/CellEditDuplicate.html
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
fun cellEditDuplicate(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CellEditDuplicate", arguments.toMutableList(), options)
}
