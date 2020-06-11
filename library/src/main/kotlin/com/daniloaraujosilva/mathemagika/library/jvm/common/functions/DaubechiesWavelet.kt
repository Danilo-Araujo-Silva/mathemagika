package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DaubechiesWavelet
 *
 * Full name:        System`DaubechiesWavelet
 *
 *                   DaubechiesWavelet[] represents a Daubechies wavelet of order 2.
 * Usage:            DaubechiesWavelet[n] represents a Daubechies wavelet of order n.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DaubechiesWavelet
 * Documentation:    web: http://reference.wolfram.com/language/ref/DaubechiesWavelet.html
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
fun daubechiesWavelet(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DaubechiesWavelet", arguments.toMutableList(), options)
}
