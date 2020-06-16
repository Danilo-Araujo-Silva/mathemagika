package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             LocalAdaptiveBinarize
 *
 * Full name:        System`LocalAdaptiveBinarize
 *
 *                   LocalAdaptiveBinarize[image, r] creates a binary image from image by replacing values above the mean of the range-r neighborhood with 1 and others with 0.
 * Usage:            LocalAdaptiveBinarize[image, r, {α, β, γ}] replaces values above α μ + β σ + γ with 1 and others with 0, where μ and σ are the local mean and standard deviation.
 *
 *                   Padding -> Fixed
 * Options:          PerformanceGoal :> $PerformanceGoal
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/LocalAdaptiveBinarize
 * Documentation:    web: http://reference.wolfram.com/language/ref/LocalAdaptiveBinarize.html
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
fun localAdaptiveBinarize(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LocalAdaptiveBinarize", arguments.toMutableList(), options)
}
