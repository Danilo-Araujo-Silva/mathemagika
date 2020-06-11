package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             MemoryConstraint
 *
 * Full name:        System`MemoryConstraint
 *
 * Usage:            MemoryConstraint is an option for TestReport and VerificationTest that specifies how much memory (in bytes) the test is allowed to use.
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/MemoryConstraint
 * Documentation:    web: http://reference.wolfram.com/language/ref/MemoryConstraint.html
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
fun memoryConstraint(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MemoryConstraint", arguments.toMutableList(), options)
}
