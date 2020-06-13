package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             RiemannSiegelZ
 *
 * Full name:        System`RiemannSiegelZ
 *
 * Usage:            RiemannSiegelZ[t] gives the Riemann–Siegel function Z(t).
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/RiemannSiegelZ
 * Documentation:    web: http://reference.wolfram.com/language/ref/RiemannSiegelZ.html
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
fun riemannSiegelZ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RiemannSiegelZ", arguments.toMutableList(), options)
}
