package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             GaborWavelet
 * 
 * Full name:        System`GaborWavelet
 * 
 *                   GaborWavelet[] represents a Gabor wavelet of frequency 6.
 * Usage:            GaborWavelet[w] represents a Gabor wavelet of frequency w.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/GaborWavelet
 * Documentation:    web: http://reference.wolfram.com/language/ref/GaborWavelet.html
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
fun gaborWavelet(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GaborWavelet", arguments.toMutableList(), options)
}
