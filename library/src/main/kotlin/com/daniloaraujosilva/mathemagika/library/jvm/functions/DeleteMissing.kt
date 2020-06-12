package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DeleteMissing
 *
 * Full name:        System`DeleteMissing
 *
 *                   DeleteMissing[list] drops elements with head Missing from a list.
 *                   DeleteMissing[assoc] drops elements whose values have head Missing from the association assoc.
 *                   DeleteMissing[expr, n] applies DeleteMissing to any lists or associations that occur within the first n levels of expr.
 * Usage:            DeleteMissing[expr, n, d] considers an element at level n to be missing if Missing occurs within the first d levels of the element.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DeleteMissing
 * Documentation:    web: http://reference.wolfram.com/language/ref/DeleteMissing.html
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
fun deleteMissing(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DeleteMissing", arguments.toMutableList(), options)
}
