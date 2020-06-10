package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             HilbertCurve
 * 
 * Full name:        System`HilbertCurve
 * 
 *                                                                              th
 *                   HilbertCurve[n] gives the line segments representing the n  -step Hilbert curve.
 *                                                  th
 * Usage:            HilbertCurve[n, d] gives the n  -step Hilbert curve in dimension d.
 * 
 * Options:          DataRange -> Automatic
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/HilbertCurve
 * Documentation:    web: http://reference.wolfram.com/language/ref/HilbertCurve.html
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
fun hilbertCurve(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("HilbertCurve", arguments.toMutableList(), options)
}
