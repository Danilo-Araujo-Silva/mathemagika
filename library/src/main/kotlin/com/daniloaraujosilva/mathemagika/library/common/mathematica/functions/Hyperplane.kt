package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Hyperplane
 *
 * Full name:        System`Hyperplane
 *
 *                   Hyperplane[n, p] represents the hyperplane with normal n passing through the point p.
 * Usage:            Hyperplane[n, c] represents the hyperplane with normal n given by the points x that satisfy n . x  c.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Hyperplane
 * Documentation:    web: http://reference.wolfram.com/language/ref/Hyperplane.html
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
fun hyperplane(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Hyperplane", arguments.toMutableList(), options)
}
