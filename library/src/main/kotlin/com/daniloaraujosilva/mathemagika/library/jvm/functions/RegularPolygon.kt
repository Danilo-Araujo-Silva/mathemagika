package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             RegularPolygon
 *
 * Full name:        System`RegularPolygon
 *
 *                   RegularPolygon[n] gives the regular polygon with n vertices equally spaced around the unit circle.
 *                   RegularPolygon[r, n] gives the regular polygon of radius r.
 *                   RegularPolygon[{r, θ}, n] starts at angle θ with respect to the x axis.
 * Usage:            RegularPolygon[{x, y}, rspec, n] centers the polygon at {x, y}.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/RegularPolygon
 * Documentation:    web: http://reference.wolfram.com/language/ref/RegularPolygon.html
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
fun regularPolygon(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RegularPolygon", arguments.toMutableList(), options)
}
