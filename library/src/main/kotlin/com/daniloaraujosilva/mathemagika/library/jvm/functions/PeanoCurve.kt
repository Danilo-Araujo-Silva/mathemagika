package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             PeanoCurve
 *
 * Full name:        System`PeanoCurve
 *
 *                                                                            th
 * Usage:            PeanoCurve[n] gives the line segments representing the n  -step Peano curve.
 *
 * Options:          DataRange -> Automatic
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/PeanoCurve
 * Documentation:    web: http://reference.wolfram.com/language/ref/PeanoCurve.html
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
fun peanoCurve(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PeanoCurve", arguments.toMutableList(), options)
}
