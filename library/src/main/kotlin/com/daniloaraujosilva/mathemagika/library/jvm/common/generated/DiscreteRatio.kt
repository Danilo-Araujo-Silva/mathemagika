package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             DiscreteRatio
 * 
 * Full name:        System`DiscreteRatio
 * 
 *                                                                f(i + 1)
 *                   DiscreteRatio[f, i] gives the discrete ratio --------.
 *                                                                  f(i)
 *                   DiscreteRatio[f, {i, n}] gives the multiple discrete ratio.
 *                   DiscreteRatio[f, {i, n, h}] gives the multiple discrete ratio with step h. 
 * Usage:            DiscreteRatio[f, i, j, …] computes the partial difference ratio with respect to i, j, ….
 * 
 * Options:          Assumptions :> $Assumptions
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/DiscreteRatio
 * Documentation:    web: http://reference.wolfram.com/language/ref/DiscreteRatio.html
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
fun discreteRatio(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DiscreteRatio", arguments.toMutableList(), options)
}
