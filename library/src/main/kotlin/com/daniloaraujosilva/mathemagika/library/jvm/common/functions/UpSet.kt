package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             UpSet
 *
 * Full name:        System`UpSet
 *
 * Usage:            lhs^=rhs assigns rhs to be the value of lhs, and associates the assignment with symbols that occur at level one in lhs.
 *
 * Options:          None
 *
 *                   HoldFirst
 *                   Protected
 * Attributes:       SequenceHold
 *
 *                   local: paclet:ref/UpSet
 * Documentation:    web: http://reference.wolfram.com/language/ref/UpSet.html
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
fun upSet(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("UpSet", arguments.toMutableList(), options)
}
