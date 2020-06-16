package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             SiegelTheta
 *
 * Full name:        System`SiegelTheta
 *
 *                   SiegelTheta[Ω, s] gives the Siegel theta function Θ (Ω, s) with Riemann modular matrix Ω and vector s.
 *                   SiegelTheta[{ν , ν }, Ω, s] gives the Siegel theta function Θ [ν , ν ] ( Ω, s) with characteristics ν  and ν .
 * Usage:                          1   2                                             1   2                                1      2
 *
 * Options:          None
 *
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SiegelTheta
 * Documentation:    web: http://reference.wolfram.com/language/ref/SiegelTheta.html
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
fun siegelTheta(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SiegelTheta", arguments.toMutableList(), options)
}
