package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             InfinitePlane
 *
 * Full name:        System`InfinitePlane
 *
 *                   InfinitePlane[{p , p , p }] represents the plane passing through the points p , p , and p .
 *                                   1   2   3                                                    1   2       3
 *                   InfinitePlane[p, {v , v }] represents the plane passing through the point p in the directions v  and v .
 * Usage:                               1   2                                                                       1      2
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/InfinitePlane
 * Documentation:    web: http://reference.wolfram.com/language/ref/InfinitePlane.html
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
fun infinitePlane(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("InfinitePlane", arguments.toMutableList(), options)
}
