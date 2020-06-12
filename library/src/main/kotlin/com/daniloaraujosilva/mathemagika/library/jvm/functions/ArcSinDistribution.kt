package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ArcSinDistribution
 *
 * Full name:        System`ArcSinDistribution
 *
 *                   ArcSinDistribution[{x   , x   }] represents the arc sine distribution supported between x    and x   .
 *                                        min   max                                                           min      max
 * Usage:            ArcSinDistribution[] represents the arc sine distribution supported between zero and one.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ArcSinDistribution
 * Documentation:    web: http://reference.wolfram.com/language/ref/ArcSinDistribution.html
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
fun arcSinDistribution(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ArcSinDistribution", arguments.toMutableList(), options)
}
