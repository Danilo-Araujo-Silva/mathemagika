package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             EscapeRadius
 * 
 * Full name:        System`EscapeRadius
 * 
 * Usage:            EscapeRadius is an option to MandelbrotSetPlot that specifies the criterion to use to decide that a point is not in the Mandelbrot set.
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/EscapeRadius
 * Documentation:    web: http://reference.wolfram.com/language/ref/EscapeRadius.html
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
fun escapeRadius(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EscapeRadius", arguments.toMutableList(), options)
}
