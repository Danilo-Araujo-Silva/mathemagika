package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DuplicateFreeQ
 *
 * Full name:        System`DuplicateFreeQ
 *
 *                   DuplicateFreeQ[list] gives True if list has no duplicates, and False otherwise.
 * Usage:            DuplicateFreeQ[list, test] applies test to pairs of elements to determine whether they should be considered duplicates.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/DuplicateFreeQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/DuplicateFreeQ.html
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
fun duplicateFreeQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DuplicateFreeQ", arguments.toMutableList(), options)
}
