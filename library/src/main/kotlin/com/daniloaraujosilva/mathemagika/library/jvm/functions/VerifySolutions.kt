package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             VerifySolutions
 *
 * Full name:        System`VerifySolutions
 *
 * Usage:            VerifySolutions is an option to Solve and related functions that controls whether to verify solutions.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/VerifySolutions
 * Documentation:    web: http://reference.wolfram.com/language/ref/VerifySolutions.html
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
fun verifySolutions(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("VerifySolutions", arguments.toMutableList(), options)
}
