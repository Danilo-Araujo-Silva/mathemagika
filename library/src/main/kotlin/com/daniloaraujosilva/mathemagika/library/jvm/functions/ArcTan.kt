package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ArcTan
 *
 * Full name:        System`ArcTan
 *
 *                                                      -1
 *                   ArcTan[z] gives the arc tangent tan  (z) of the complex number z.
 *                                                         y
 *                   ArcTan[x, y] gives the arc tangent of -, taking into account which quadrant the point (x, y) is in.
 * Usage:                                                  x
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ArcTan
 * Documentation:    web: http://reference.wolfram.com/language/ref/ArcTan.html
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
fun arcTan(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ArcTan", arguments.toMutableList(), options)
}
