package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             CircleThrough
 *
 * Full name:        System`CircleThrough
 *
 *                   CircleThrough[{p , p , …}] represents a circle passing through the points p .
 *                                   1   2                                                      i
 *                   CircleThrough[{p , p , …}, q] represents a circle with center q.
 *                                   1   2
 *                   CircleThrough[{p , p , …}, q, r] represents a circle with radius r.
 * Usage:                            1   2
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CircleThrough
 * Documentation:    web: http://reference.wolfram.com/language/ref/CircleThrough.html
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
fun circleThrough(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CircleThrough", arguments.toMutableList(), options)
}
