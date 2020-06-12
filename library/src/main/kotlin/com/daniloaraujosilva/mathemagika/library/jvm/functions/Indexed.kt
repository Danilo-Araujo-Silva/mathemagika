package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Indexed
 *
 * Full name:        System`Indexed
 *
 *                   Indexed[expr, i] represents the component of expr with index i and formats as expr .
 *                                                                                                     i
 *                   Indexed[expr, {i, j, …}] represents the component with indices i, j, … and formats as expr       .
 * Usage:                                                                                                      i, j, …
 *
 * Options:          None
 *
 *                   NHoldRest
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Indexed
 * Documentation:    web: http://reference.wolfram.com/language/ref/Indexed.html
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
fun indexed(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Indexed", arguments.toMutableList(), options)
}
