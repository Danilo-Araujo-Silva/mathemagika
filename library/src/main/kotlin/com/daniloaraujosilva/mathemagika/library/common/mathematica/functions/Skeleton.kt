package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Skeleton
 *
 * Full name:        System`Skeleton
 *
 * Usage:            Skeleton[n] represents a sequence of n omitted elements in an expression printed with Short or Shallow. The standard print form for Skeleton is  n .
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/Skeleton
 * Documentation:    web: http://reference.wolfram.com/language/ref/Skeleton.html
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
fun skeleton(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Skeleton", arguments.toMutableList(), options)
}
