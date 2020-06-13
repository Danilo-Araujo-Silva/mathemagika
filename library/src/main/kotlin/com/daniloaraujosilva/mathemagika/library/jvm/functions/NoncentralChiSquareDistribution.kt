package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             NoncentralChiSquareDistribution
 *
 * Full name:        System`NoncentralChiSquareDistribution
 *
 *                                                                                  2
 * Usage:            NoncentralChiSquareDistribution[ν, λ] represents a noncentral χ  distribution with ν degrees of freedom and noncentrality parameter λ.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/NoncentralChiSquareDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/NoncentralChiSquareDistribution.html
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
fun noncentralChiSquareDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NoncentralChiSquareDistribution", arguments.toMutableList(), options)
}
