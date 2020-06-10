package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             AngleVector
 * 
 * Full name:        System`AngleVector
 * 
 *                   AngleVector[θ] gives the list representing the 2D unit vector at angle θ relative to the x axis.
 *                   AngleVector[{r, θ}] gives the list representing the 2D vector of length r at angle θ.
 *                   AngleVector[{x, y}, θ] gives the result of starting from the point {x, y}, then going a unit distance at angle θ.
 * Usage:            AngleVector[{x, y}, {r, θ}] gives the result of starting from the point {x, y}, then going distance r at angle θ.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/AngleVector
 * Documentation:    web: http://reference.wolfram.com/language/ref/AngleVector.html
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
fun angleVector(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AngleVector", arguments.toMutableList(), options)
}
