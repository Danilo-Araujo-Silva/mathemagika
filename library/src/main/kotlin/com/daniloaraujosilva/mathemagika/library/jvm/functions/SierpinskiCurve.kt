package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SierpinskiCurve
 *
 * Full name:        System`SierpinskiCurve
 *
 *                                                                                 th
 * Usage:            SierpinskiCurve[n] gives the line segments representing the n  -step Sierpiński curve.
 *
 * Options:          DataRange -> Automatic
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/SierpinskiCurve
 * Documentation:    web: http://reference.wolfram.com/language/ref/SierpinskiCurve.html
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
fun sierpinskiCurve(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SierpinskiCurve", arguments.toMutableList(), options)
}
