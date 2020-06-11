package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DifferentiatorFilter
 *
 * Full name:        System`DifferentiatorFilter
 *
 *                   DifferentiatorFilter[data, ω ] applies a differentiator filter with a cutoff frequency ω  to an array of data.
 *                                               c                                                           c
 *                   DifferentiatorFilter[data, ω , n] uses a filter kernel of length n.
 *                                               c
 *                   DifferentiatorFilter[data, ω , n, wfun] applies a smoothing window wfun to the filter kernel.
 * Usage:                                        c
 *
 *                   Padding -> Automatic
 * Options:          SampleRate -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DifferentiatorFilter
 * Documentation:    web: http://reference.wolfram.com/language/ref/DifferentiatorFilter.html
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
fun differentiatorFilter(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DifferentiatorFilter", arguments.toMutableList(), options)
}
