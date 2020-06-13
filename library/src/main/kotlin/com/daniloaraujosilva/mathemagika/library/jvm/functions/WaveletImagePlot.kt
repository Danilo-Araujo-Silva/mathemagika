package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             WaveletImagePlot
 *
 * Full name:        System`WaveletImagePlot
 *
 *                   WaveletImagePlot[dwd] plots the basis tree of wavelet image coefficients in the DiscreteWaveletData dwd.
 *                   WaveletImagePlot[dwd, r] plots coefficients up to refinement level r.
 * Usage:            WaveletImagePlot[dwd, r, ifunc] applies the image function ifunc to coefficients and wavelet indexes before plotting.
 *
 *                   AlignmentPoint -> Center
 *                   BaselinePosition -> Automatic
 *                   BaseStyle -> GrayLevel[0.85]
 *                   ColorSpace -> Automatic
 *                   ImageSize -> Automatic
 *                   Magnification -> Automatic
 *                   Method -> {}
 *                   PlotLayout -> Automatic
 * Options:          TaggingRules -> {}
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/WaveletImagePlot
 * Documentation:    web: http://reference.wolfram.com/language/ref/WaveletImagePlot.html
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
fun waveletImagePlot(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WaveletImagePlot", arguments.toMutableList(), options)
}
