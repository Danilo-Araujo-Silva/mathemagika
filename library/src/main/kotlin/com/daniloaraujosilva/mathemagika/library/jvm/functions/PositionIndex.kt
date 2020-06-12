package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             PositionIndex
 *
 * Full name:        System`PositionIndex
 *
 *                   PositionIndex[list] gives an association between unique elements in list and the positions at which they occur.
 * Usage:            PositionIndex[assoc] gives an association whose keys are the distinct values in assoc, and whose values are lists of the keys with which they are associated.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/PositionIndex
 * Documentation:    web: http://reference.wolfram.com/language/ref/PositionIndex.html
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
fun positionIndex(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PositionIndex", arguments.toMutableList(), options)
}
