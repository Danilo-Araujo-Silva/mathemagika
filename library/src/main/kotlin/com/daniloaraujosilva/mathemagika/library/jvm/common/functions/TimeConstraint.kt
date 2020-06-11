package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             TimeConstraint
 *
 * Full name:        System`TimeConstraint
 *
 * Usage:            TimeConstraint is an option for various functions that specifies the maximum time to spend doing a particular operation.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/TimeConstraint
 * Documentation:    web: http://reference.wolfram.com/language/ref/TimeConstraint.html
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
fun timeConstraint(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TimeConstraint", arguments.toMutableList(), options)
}
