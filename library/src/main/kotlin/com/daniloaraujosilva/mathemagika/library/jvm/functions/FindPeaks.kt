package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FindPeaks
 *
 * Full name:        System`FindPeaks
 *
 *                   FindPeaks[data] gives positions and values of the detected peaks in data.
 *                   FindPeaks[data, σ] finds peaks that survive Gaussian blurring up to scale σ.
 *                   FindPeaks[data, σ, s] finds peaks with minimum sharpness s.
 *                   FindPeaks[data, σ, s, t] finds only peaks with values greater than t.
 *                   FindPeaks[data, σ, {s, σ }, {t, σ }] uses different scales for thresholding sharpness and value.
 * Usage:                                    s        t
 *
 *                   InterpolationOrder -> 1
 * Options:          Padding -> Reversed
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FindPeaks
 * Documentation:    web: http://reference.wolfram.com/language/ref/FindPeaks.html
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
fun findPeaks(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FindPeaks", arguments.toMutableList(), options)
}
