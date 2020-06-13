package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             CirclePoints
 *
 * Full name:        System`CirclePoints
 *
 *                   CirclePoints[n] gives the positions of n points equally spaced around the unit circle.
 *                   CirclePoints[r, n] gives the positions of n points equally spaced around a circle of radius r.
 *                   CirclePoints[{r, θ }, n] starts at angle θ  with respect to the x axis.
 *                                     1                       1
 * Usage:            CirclePoints[{x, y}, rspec, n] centers the circle at {x, y}.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CirclePoints
 * Documentation:    web: http://reference.wolfram.com/language/ref/CirclePoints.html
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
fun circlePoints(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CirclePoints", arguments.toMutableList(), options)
}
