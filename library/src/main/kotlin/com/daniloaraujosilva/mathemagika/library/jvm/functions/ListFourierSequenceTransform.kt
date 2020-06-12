package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ListFourierSequenceTransform
 *
 * Full name:        System`ListFourierSequenceTransform
 *
 *                   ListFourierSequenceTransform[list, ω] gives the discrete-time Fourier transform (DTFT) of a list as a function of the parameter ω.
 *                   ListFourierSequenceTransform[list, ω, k] places the first element of list at integer time k on the infinite time axis.
 *                   ListFourierSequenceTransform[list, {ω , ω , …}, {k , k , …}] gives the multidimensional discrete-time Fourier transform
 * Usage:                                                 1   2        1   2
 *
 * Options:          FourierParameters -> {1, 1}
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ListFourierSequenceTransform
 * Documentation:    web: http://reference.wolfram.com/language/ref/ListFourierSequenceTransform.html
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
fun listFourierSequenceTransform(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ListFourierSequenceTransform", arguments.toMutableList(), options)
}
