package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             DifferentialD
 *
 * Full name:        System`DifferentialD
 *
 * Usage:            DifferentialD[x] displays as  x.
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/DifferentialD
 * Documentation:    web: http://reference.wolfram.com/language/ref/DifferentialD.html
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
fun differentialD(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DifferentialD", arguments.toMutableList(), options)
}
