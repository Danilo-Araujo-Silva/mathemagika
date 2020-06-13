package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             MarchenkoPasturDistribution
 *
 * Full name:        System`MarchenkoPasturDistribution
 *
 *                   MarchenkoPasturDistribution[λ, σ] represents a Marchenko–Pastur distribution with asymptotic ratio λ and scale parameter σ.
 * Usage:            MarchenkoPasturDistribution[λ] represents a Marchenko–Pastur distribution with unit scale parameter.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MarchenkoPasturDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/MarchenkoPasturDistribution.html
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
fun marchenkoPasturDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MarchenkoPasturDistribution", arguments.toMutableList(), options)
}
