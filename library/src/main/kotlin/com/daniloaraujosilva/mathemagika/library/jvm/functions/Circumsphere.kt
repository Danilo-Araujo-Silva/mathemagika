package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Circumsphere
 *
 * Full name:        System`Circumsphere
 *
 *                                                                                                       n
 *                   Circumsphere[{p , …, p     }] gives the sphere that circumscribes the points p  in  .
 *                                  1      n + 1                                                   i
 * Usage:            Circumsphere[poly] gives the circumsphere of a polyhedron or polygon poly.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Circumsphere
 * Documentation:    web: http://reference.wolfram.com/language/ref/Circumsphere.html
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
fun circumsphere(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Circumsphere", arguments.toMutableList(), options)
}
