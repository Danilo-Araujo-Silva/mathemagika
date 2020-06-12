package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SliceDistribution
 *
 * Full name:        System`SliceDistribution
 *
 *                   SliceDistribution[proc, t] represents the distribution of the process state at time t.
 *                   SliceDistribution[proc, {t , …, t }] represents the joint distribution of process states at times t  < ⋯ < t .
 * Usage:                                      1      k                                                                 1        k
 *
 * Options:
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SliceDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/SliceDistribution.html
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
fun sliceDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SliceDistribution", arguments.toMutableList(), options)
}
