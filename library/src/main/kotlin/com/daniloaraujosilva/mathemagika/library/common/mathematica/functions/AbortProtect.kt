package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             AbortProtect
 *
 * Full name:        System`AbortProtect
 *
 * Usage:            AbortProtect[expr] evaluates expr, saving any aborts until the evaluation is complete.
 *
 * Options:          None
 *
 *                   HoldAll
 * Attributes:       Protected
 *
 *                   local: paclet:ref/AbortProtect
 * Documentation:    web: http://reference.wolfram.com/language/ref/AbortProtect.html
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
fun abortProtect(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AbortProtect", arguments.toMutableList(), options)
}
