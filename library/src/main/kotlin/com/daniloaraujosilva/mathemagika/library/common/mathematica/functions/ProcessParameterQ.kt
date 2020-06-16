package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ProcessParameterQ
 *
 * Full name:        System`ProcessParameterQ
 *
 * Usage:            ProcessParameterQ[proc] yields True if proc is a valid random process, and yields False otherwise.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ProcessParameterQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/ProcessParameterQ.html
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
fun processParameterQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ProcessParameterQ", arguments.toMutableList(), options)
}
