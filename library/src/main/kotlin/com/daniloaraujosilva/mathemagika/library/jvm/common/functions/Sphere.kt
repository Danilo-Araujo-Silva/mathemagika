package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Sphere
 *
 * Full name:        System`Sphere
 *
 *                   Sphere[p] represents a unit sphere centered at the point p.
 *                   Sphere[p, r] represents a sphere of radius r centered at the point p.
 *                   Sphere[{p , p , …}, r] represents a collection of spheres of radius r.
 * Usage:                     1   2
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Sphere
 * Documentation:    web: http://reference.wolfram.com/language/ref/Sphere.html
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
fun sphere(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Sphere", arguments.toMutableList(), options)
}
