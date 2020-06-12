package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             NearestFunction
 *
 * Full name:        System`NearestFunction
 *
 * Usage:            NearestFunction[data] represents a function whose values give the elements closest to an element that is supplied.
 *
 * Options:
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/NearestFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/NearestFunction.html
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
fun nearestFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NearestFunction", arguments.toMutableList(), options)
}
