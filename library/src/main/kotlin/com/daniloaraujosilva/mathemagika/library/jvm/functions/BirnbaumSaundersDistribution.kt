package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             BirnbaumSaundersDistribution
 *
 * Full name:        System`BirnbaumSaundersDistribution
 *
 * Usage:            BirnbaumSaundersDistribution[α, λ] represents the Birnbaum–Saunders distribution with shape parameter α and scale parameter λ.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/BirnbaumSaundersDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/BirnbaumSaundersDistribution.html
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
fun birnbaumSaundersDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BirnbaumSaundersDistribution", arguments.toMutableList(), options)
}
