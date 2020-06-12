package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             PerpendicularBisector
 *
 * Full name:        System`PerpendicularBisector
 *
 *                   PerpendicularBisector[{p , p }] gives the perpendicular bisector of the line segment connecting p  and p .
 *                                           1   2                                                                    1      2
 *                   PerpendicularBisector[Line[{p , p }]] gives the perpendicular bisector of a line segment.
 * Usage:                                         1   2
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PerpendicularBisector
 * Documentation:    web: http://reference.wolfram.com/language/ref/PerpendicularBisector.html
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
fun perpendicularBisector(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PerpendicularBisector", arguments.toMutableList(), options)
}
