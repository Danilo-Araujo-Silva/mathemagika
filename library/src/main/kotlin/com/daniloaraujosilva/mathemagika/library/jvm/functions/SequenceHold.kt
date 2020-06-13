package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             SequenceHold
 *
 * Full name:        System`SequenceHold
 *
 * Usage:            SequenceHold is an attribute that specifies that Sequence objects appearing in the arguments of a function should not automatically be flattened out.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/SequenceHold
 * Documentation:    web: http://reference.wolfram.com/language/ref/SequenceHold.html
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
fun sequenceHold(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SequenceHold", arguments.toMutableList(), options)
}
