package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             RootIntervals
 *
 * Full name:        System`RootIntervals
 *
 *                   RootIntervals[{poly , poly , …}] gives a list of isolating intervals for the real roots of any of the poly , together with a list of which polynomials actually have each successive root.
 *                                      1      2                                                                               i
 *                   RootIntervals[poly] gives isolating intervals for real roots of a single polynomial.
 * Usage:            RootIntervals[polys, Complexes] gives bounding rectangles for complex roots.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/RootIntervals
 * Documentation:    web: http://reference.wolfram.com/language/ref/RootIntervals.html
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
fun rootIntervals(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RootIntervals", arguments.toMutableList(), options)
}
