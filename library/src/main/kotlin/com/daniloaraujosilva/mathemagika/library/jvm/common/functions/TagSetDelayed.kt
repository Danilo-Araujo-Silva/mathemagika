package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             TagSetDelayed
 *
 * Full name:        System`TagSetDelayed
 *
 * Usage:            f/:lhs := rhs assigns rhs to be the delayed value of lhs, and associates the assignment with the symbol f.
 *
 * Options:          None
 *
 *                   HoldAll
 *                   Protected
 * Attributes:       SequenceHold
 *
 *                   local: paclet:ref/TagSetDelayed
 * Documentation:    web: http://reference.wolfram.com/language/ref/TagSetDelayed.html
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
fun tagSetDelayed(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TagSetDelayed", arguments.toMutableList(), options)
}
