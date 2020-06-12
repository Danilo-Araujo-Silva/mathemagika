package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             RiemannSiegelTheta
 *
 * Full name:        System`RiemannSiegelTheta
 *
 * Usage:            RiemannSiegelTheta[t] gives the Riemann–Siegel function ϑ(t).
 *
 * Options:          None
 *
 *                   Listable
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/RiemannSiegelTheta
 * Documentation:    web: http://reference.wolfram.com/language/ref/RiemannSiegelTheta.html
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
fun riemannSiegelTheta(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RiemannSiegelTheta", arguments.toMutableList(), options)
}
