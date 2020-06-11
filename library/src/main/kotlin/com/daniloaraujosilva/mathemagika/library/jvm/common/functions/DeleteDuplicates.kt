package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DeleteDuplicates
 *
 * Full name:        System`DeleteDuplicates
 *
 *                   DeleteDuplicates[list] deletes all duplicates from list.
 * Usage:            DeleteDuplicates[list, test] applies test to pairs of elements to determine whether they should be considered duplicates.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/DeleteDuplicates
 * Documentation:    web: http://reference.wolfram.com/language/ref/DeleteDuplicates.html
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
fun deleteDuplicates(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DeleteDuplicates", arguments.toMutableList(), options)
}
