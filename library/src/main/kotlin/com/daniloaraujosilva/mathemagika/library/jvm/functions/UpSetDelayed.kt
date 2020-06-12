package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             UpSetDelayed
 *
 * Full name:        System`UpSetDelayed
 *
 * Usage:            lhs^:=rhs assigns rhs to be the delayed value of lhs, and associates the assignment with symbols that occur at level one in lhs.
 *
 * Options:          None
 *
 *                   HoldAll
 *                   Protected
 * Attributes:       SequenceHold
 *
 *                   local: paclet:ref/UpSetDelayed
 * Documentation:    web: http://reference.wolfram.com/language/ref/UpSetDelayed.html
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
fun upSetDelayed(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("UpSetDelayed", arguments.toMutableList(), options)
}
