package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             EmptyRegion
 *
 * Full name:        System`EmptyRegion
 *
 *                                                                  n
 * Usage:            EmptyRegion[n] represents the empty subset of  .
 *
 * Options:          None
 *
 *                   NHoldAll
 * Attributes:       Protected
 *
 *                   local: paclet:ref/EmptyRegion
 * Documentation:    web: http://reference.wolfram.com/language/ref/EmptyRegion.html
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
fun emptyRegion(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EmptyRegion", arguments.toMutableList(), options)
}
