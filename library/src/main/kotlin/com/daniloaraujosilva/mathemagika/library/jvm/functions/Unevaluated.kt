package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Unevaluated
 *
 * Full name:        System`Unevaluated
 *
 * Usage:            Unevaluated[expr] represents the unevaluated form of expr when it appears as the argument to a function.
 *
 * Options:          None
 *
 *                   HoldAllComplete
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Unevaluated
 * Documentation:    web: http://reference.wolfram.com/language/ref/Unevaluated.html
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
fun unevaluated(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Unevaluated", arguments.toMutableList(), options)
}
