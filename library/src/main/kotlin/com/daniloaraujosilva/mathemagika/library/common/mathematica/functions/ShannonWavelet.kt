package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ShannonWavelet
 *
 * Full name:        System`ShannonWavelet
 *
 *                   ShannonWavelet[] represents the Shannon wavelet evaluated on the equally spaced interval {-10, 10}.
 * Usage:            ShannonWavelet[lim] represents the Shannon wavelet evaluated on the equally spaced interval {-lim, lim}.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ShannonWavelet
 * Documentation:    web: http://reference.wolfram.com/language/ref/ShannonWavelet.html
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
fun shannonWavelet(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ShannonWavelet", arguments.toMutableList(), options)
}
