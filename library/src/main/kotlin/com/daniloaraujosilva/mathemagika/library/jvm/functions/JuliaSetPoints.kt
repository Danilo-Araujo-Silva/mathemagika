package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             JuliaSetPoints
 *
 * Full name:        System`JuliaSetPoints
 *
 *                   JuliaSetPoints[f, z] returns a list of coordinates approximating the real and imaginary parts of the complex numbers in the Julia set of the rational function f of the variable z.
 *                                                                                                                                 2
 * Usage:            JuliaSetPoints[c] returns a list of coordinates of points approximating the Julia set of the function f(z)  z  + c.
 *
 *                   Bound -> 6
 *                   ClosenessTolerance -> 0.004
 *                   ForwardIterations -> Automatic
 * Options:          ReverseIterations -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/JuliaSetPoints
 * Documentation:    web: http://reference.wolfram.com/language/ref/JuliaSetPoints.html
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
fun juliaSetPoints(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("JuliaSetPoints", arguments.toMutableList(), options)
}
