package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ProcessParameterAssumptions
 *
 * Full name:        System`ProcessParameterAssumptions
 *
 * Usage:            ProcessParameterAssumptions[proc] gives a logical expression for assumptions on parameters in the random process proc.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ProcessParameterAssumptions
 * Documentation:    web: http://reference.wolfram.com/language/ref/ProcessParameterAssumptions.html
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
fun processParameterAssumptions(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ProcessParameterAssumptions", arguments.toMutableList(), options)
}
