package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             MexicanHatWavelet
 *
 * Full name:        System`MexicanHatWavelet
 *
 *                   MexicanHatWavelet[] represents the Mexican hat wavelet of width 1.
 * Usage:            MexicanHatWavelet[σ] represents the Mexican hat wavelet of width σ.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MexicanHatWavelet
 * Documentation:    web: http://reference.wolfram.com/language/ref/MexicanHatWavelet.html
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
fun mexicanHatWavelet(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MexicanHatWavelet", arguments.toMutableList(), options)
}
