package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             BiorthogonalSplineWavelet
 *
 * Full name:        System`BiorthogonalSplineWavelet
 *
 *                   BiorthogonalSplineWavelet[] represents a biorthogonal spline wavelet of order 4 and dual order 2.
 * Usage:            BiorthogonalSplineWavelet[n, m] represents a biorthogonal spline wavelet of order n and dual order m.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/BiorthogonalSplineWavelet
 * Documentation:    web: http://reference.wolfram.com/language/ref/BiorthogonalSplineWavelet.html
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
fun biorthogonalSplineWavelet(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BiorthogonalSplineWavelet", arguments.toMutableList(), options)
}
