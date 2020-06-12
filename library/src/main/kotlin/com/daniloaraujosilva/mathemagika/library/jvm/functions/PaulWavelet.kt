package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             PaulWavelet
 *
 * Full name:        System`PaulWavelet
 *
 *                   PaulWavelet[] represents a Paul wavelet of order 4.
 * Usage:            PaulWavelet[n] represents a Paul wavelet of order n.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PaulWavelet
 * Documentation:    web: http://reference.wolfram.com/language/ref/PaulWavelet.html
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
fun paulWavelet(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PaulWavelet", arguments.toMutableList(), options)
}
