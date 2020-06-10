package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             PeakDetect
 * 
 * Full name:        System`PeakDetect
 * 
 *                   PeakDetect[data] gives a binary list in which 1s correspond to peak positions in data.
 *                   PeakDetect[data, σ] detects peaks that survive Gaussian blurring up to scale σ.
 *                   PeakDetect[data, σ, s] detects peaks with minimum sharpness s.
 *                   PeakDetect[data, σ, s, t] detects only peaks with values greater than t.
 *                   PeakDetect[data, σ, {s, σ }, {t, σ }] uses different scales for thresholding sharpness and value.
 * Usage:                                     s        t
 * 
 * Options:          Padding -> Reversed
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/PeakDetect
 * Documentation:    web: http://reference.wolfram.com/language/ref/PeakDetect.html
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
fun peakDetect(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PeakDetect", arguments.toMutableList(), options)
}
