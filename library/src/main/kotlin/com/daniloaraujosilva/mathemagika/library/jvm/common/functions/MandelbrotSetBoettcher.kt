package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             MandelbrotSetBoettcher
 *
 * Full name:        System`MandelbrotSetBoettcher
 *
 * Usage:            MandelbrotSetBoettcher[z] gives the Böttcher coordinate of z with respect to the Mandelbrot set.
 *
 * Options:          MaxIterations -> 100
 *
 *                   NumericFunction
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MandelbrotSetBoettcher
 * Documentation:    web: http://reference.wolfram.com/language/ref/MandelbrotSetBoettcher.html
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
fun mandelbrotSetBoettcher(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MandelbrotSetBoettcher", arguments.toMutableList(), options)
}
