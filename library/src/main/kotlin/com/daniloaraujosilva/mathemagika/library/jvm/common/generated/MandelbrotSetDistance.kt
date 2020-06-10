package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             MandelbrotSetDistance
 * 
 * Full name:        System`MandelbrotSetDistance
 * 
 *                   MandelbrotSetDistance[c] estimates the distance from c to the nearest point in the Mandelbrot set.
 * Usage:            MandelbrotSetDistance[c, "Interior"] estimates the distance from c to the nearest point in the complement of the Mandelbrot set.
 * 
 *                   MaxIterations -> 100
 * Options:          WorkingPrecision -> Automatic
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/MandelbrotSetDistance
 * Documentation:    web: http://reference.wolfram.com/language/ref/MandelbrotSetDistance.html
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
fun mandelbrotSetDistance(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MandelbrotSetDistance", arguments.toMutableList(), options)
}
