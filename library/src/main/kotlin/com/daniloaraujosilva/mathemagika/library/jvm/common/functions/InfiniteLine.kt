package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             InfiniteLine
 *
 * Full name:        System`InfiniteLine
 *
 *                   InfiniteLine[{p , p }] represents the infinite straight line passing through the points p  and p .
 *                                  1   2                                                                     1      2
 * Usage:            InfiniteLine[p, v] represents the infinite straight line passing through the point p in the direction v.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/InfiniteLine
 * Documentation:    web: http://reference.wolfram.com/language/ref/InfiniteLine.html
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
fun infiniteLine(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("InfiniteLine", arguments.toMutableList(), options)
}
