package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ListDeconvolve
 *
 * Full name:        System`ListDeconvolve
 *
 * Usage:            ListDeconvolve[ker, list] gives a deconvolution of list using kernel ker.
 *
 *                   MaxIterations -> 10
 *                   Method -> DampedLS
 * Options:          Padding -> Reversed
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ListDeconvolve
 * Documentation:    web: http://reference.wolfram.com/language/ref/ListDeconvolve.html
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
fun listDeconvolve(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ListDeconvolve", arguments.toMutableList(), options)
}
