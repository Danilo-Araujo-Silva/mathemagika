package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             NorlundB
 *
 * Full name:        System`NorlundB
 *
 *                                                             (a)
 *                   NorlundB[n, a] gives Nørlund polynomials B    of degree n in a.
 *                                                             n
 *                                                                              (a)
 *                   NorlundB[n, a, x] gives generalized Bernoulli polynomials B   (x).
 * Usage:                                                                       n
 *
 * Options:          None
 *
 *                   Listable
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/NorlundB
 * Documentation:    web: http://reference.wolfram.com/language/ref/NorlundB.html
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
fun norlundB(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NorlundB", arguments.toMutableList(), options)
}
