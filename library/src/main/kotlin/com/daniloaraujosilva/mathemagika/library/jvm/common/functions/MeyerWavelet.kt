package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             MeyerWavelet
 *
 * Full name:        System`MeyerWavelet
 *
 *                   MeyerWavelet[] represents the Meyer wavelet of order 3.
 *                   MeyerWavelet[n] represents the Meyer wavelet of order n evaluated on the equally spaced interval {-10, 10}.
 * Usage:            MeyerWavelet[n, lim] represents the Meyer wavelet of order n evaluated on the equally spaced interval {-lim, lim}.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MeyerWavelet
 * Documentation:    web: http://reference.wolfram.com/language/ref/MeyerWavelet.html
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
fun meyerWavelet(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MeyerWavelet", arguments.toMutableList(), options)
}
