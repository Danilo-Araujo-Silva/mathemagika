package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Circle
 *
 * Full name:        System`Circle
 *
 *                   Circle[{x, y}, r] represents a circle of radius r centered at {x, y}.
 *                   Circle[{x, y}] gives a circle of radius 1.
 *                   Circle[{x, y}, {r , r }] gives an axis-aligned ellipse with semiaxes lengths r  and r .
 *                                    x   y                                                        x      y
 *                   Circle[{x, y}, …, {θ , θ }] gives a circular or ellipse arc from angle θ  to θ .
 * Usage:                                1   2                                               1     2
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Circle
 * Documentation:    web: http://reference.wolfram.com/language/ref/Circle.html
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
fun circle(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Circle", arguments.toMutableList(), options)
}
