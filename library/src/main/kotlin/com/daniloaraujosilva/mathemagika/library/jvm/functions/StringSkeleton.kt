package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             StringSkeleton
 *
 * Full name:        System`StringSkeleton
 *
 * Usage:            StringSkeleton[n] represents a sequence of n omitted characters in a string printed with Short. The standard print form for StringSkeleton is an ellipsis.
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/StringSkeleton
 * Documentation:    web: http://reference.wolfram.com/language/ref/StringSkeleton.html
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
fun stringSkeleton(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StringSkeleton", arguments.toMutableList(), options)
}
