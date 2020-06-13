package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             NormalDistribution
 *
 * Full name:        System`NormalDistribution
 *
 *                   NormalDistribution[μ, σ] represents a normal (Gaussian) distribution with mean μ and standard deviation σ.
 * Usage:            NormalDistribution[] represents a normal distribution with zero mean and unit standard deviation.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/NormalDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/NormalDistribution.html
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
fun normalDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NormalDistribution", arguments.toMutableList(), options)
}
