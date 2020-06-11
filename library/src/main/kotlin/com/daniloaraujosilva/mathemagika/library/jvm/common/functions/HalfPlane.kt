package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             HalfPlane
 *
 * Full name:        System`HalfPlane
 *
 *                   HalfPlane[{p , p }, w] represents the half-plane bounded by the line through p  and p  and extended in the direction w.
 *                               1   2                                                             1      2
 * Usage:            HalfPlane[p, v, w] represents the half-plane bounded by the line through p along v and extended in the direction w.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/HalfPlane
 * Documentation:    web: http://reference.wolfram.com/language/ref/HalfPlane.html
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
fun halfPlane(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HalfPlane", arguments.toMutableList(), options)
}
