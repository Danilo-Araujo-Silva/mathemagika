package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             MandelbrotSetIterationCount
 *
 * Full name:        System`MandelbrotSetIterationCount
 *
 *                                                                                                           2
 * Usage:            MandelbrotSetIterationCount[c] returns the number of iterations of the function f(z)  z  + c, beginning with z  0, that are needed to determine whether c is in the Mandelbrot set.
 *
 *                   MaxIterations -> 1000
 * Options:          WorkingPrecision -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MandelbrotSetIterationCount
 * Documentation:    web: http://reference.wolfram.com/language/ref/MandelbrotSetIterationCount.html
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
fun mandelbrotSetIterationCount(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MandelbrotSetIterationCount", arguments.toMutableList(), options)
}
