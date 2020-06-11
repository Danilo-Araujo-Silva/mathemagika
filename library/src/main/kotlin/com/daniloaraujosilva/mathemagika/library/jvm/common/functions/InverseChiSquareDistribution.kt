package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             InverseChiSquareDistribution
 *
 * Full name:        System`InverseChiSquareDistribution
 *
 *                                                                          2
 *                   InverseChiSquareDistribution[ν] represents an inverse χ  distribution with ν degrees of freedom.
 *                                                                                   2
 * Usage:            InverseChiSquareDistribution[ν, ξ] represents a scaled inverse χ  distribution with ν degrees of freedom and scale ξ.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/InverseChiSquareDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/InverseChiSquareDistribution.html
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
fun inverseChiSquareDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("InverseChiSquareDistribution", arguments.toMutableList(), options)
}
