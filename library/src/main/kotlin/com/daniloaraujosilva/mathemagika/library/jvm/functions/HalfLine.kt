package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             HalfLine
 *
 * Full name:        System`HalfLine
 *
 *                   HalfLine[{p , p }] represents the half-line from the point p  through p .
 *                              1   2                                            1          2
 * Usage:            HalfLine[p, v] represents the half-line from the point p in the direction v.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/HalfLine
 * Documentation:    web: http://reference.wolfram.com/language/ref/HalfLine.html
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
fun halfLine(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HalfLine", arguments.toMutableList(), options)
}
