package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             GuidedFilter
 *
 * Full name:        System`GuidedFilter
 *
 *                   GuidedFilter[image, guide, r, ϵ] filters image using the guide image guide over range-r neighborhoods with pixel-value regularizer ϵ.
 * Usage:            GuidedFilter[image, r, ϵ] filters image so as to reduce noise, using image as the guide.
 *
 * Options:          MaxIterations -> 1
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GuidedFilter
 * Documentation:    web: http://reference.wolfram.com/language/ref/GuidedFilter.html
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
fun guidedFilter(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GuidedFilter", arguments.toMutableList(), options)
}
