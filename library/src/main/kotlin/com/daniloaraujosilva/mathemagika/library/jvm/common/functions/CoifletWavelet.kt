package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CoifletWavelet
 *
 * Full name:        System`CoifletWavelet
 *
 *                   CoifletWavelet[] represents a Coiflet wavelet of order 2.
 * Usage:            CoifletWavelet[n] represents a Coiflet wavelet of order n.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CoifletWavelet
 * Documentation:    web: http://reference.wolfram.com/language/ref/CoifletWavelet.html
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
fun coifletWavelet(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CoifletWavelet", arguments.toMutableList(), options)
}
