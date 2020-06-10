package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             MandelbrotSetMemberQ
 * 
 * Full name:        System`MandelbrotSetMemberQ
 * 
 * Usage:            MandelbrotSetMemberQ[z] returns True if z is in the Mandelbrot set, and False otherwise.
 * 
 *                   MaxIterations -> 1000
 * Options:          WorkingPrecision -> Automatic
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/MandelbrotSetMemberQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/MandelbrotSetMemberQ.html
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
fun mandelbrotSetMemberQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MandelbrotSetMemberQ", arguments.toMutableList(), options)
}
