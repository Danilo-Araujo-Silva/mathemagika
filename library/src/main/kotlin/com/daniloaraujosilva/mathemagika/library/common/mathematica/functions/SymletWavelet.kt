package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             SymletWavelet
 *
 * Full name:        System`SymletWavelet
 *
 *                   SymletWavelet[] represents the Symlet wavelet of order 4.
 * Usage:            SymletWavelet[n] represents the Symlet wavelet of order n.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SymletWavelet
 * Documentation:    web: http://reference.wolfram.com/language/ref/SymletWavelet.html
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
fun symletWavelet(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SymletWavelet", arguments.toMutableList(), options)
}
