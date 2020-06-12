package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Parallelization
 *
 * Full name:        System`Parallelization
 *
 * Usage:            Parallelization is an option for Compile that specifies whether it should create a compiled function that could run in parallel.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Parallelization
 * Documentation:    web: http://reference.wolfram.com/language/ref/Parallelization.html
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
fun parallelization(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Parallelization", arguments.toMutableList(), options)
}
