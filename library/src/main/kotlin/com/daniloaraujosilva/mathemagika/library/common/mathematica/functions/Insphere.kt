package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Insphere
 *
 * Full name:        System`Insphere
 *
 *                                                                                                                            n
 *                   Insphere[{p , …, p     }] gives the sphere that can be inscribed in the simplex defined by points p  in  .
 *                              1      n + 1                                                                            i
 * Usage:            Insphere[poly] gives the insphere of a polyhedron or polygon poly.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Insphere
 * Documentation:    web: http://reference.wolfram.com/language/ref/Insphere.html
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
fun insphere(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Insphere", arguments.toMutableList(), options)
}
