package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             MissingValuePattern
 *
 * Full name:        System`MissingValuePattern
 *
 * Usage:            MissingValuePattern is an option for SynthesizeMissingValues to specify which elements are considered missing.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MissingValuePattern
 * Documentation:    web: http://reference.wolfram.com/language/ref/MissingValuePattern.html
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
fun missingValuePattern(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MissingValuePattern", arguments.toMutableList(), options)
}
