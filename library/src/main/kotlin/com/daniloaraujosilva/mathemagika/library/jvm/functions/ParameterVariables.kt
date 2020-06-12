package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ParameterVariables
 *
 * Full name:        System`ParameterVariables
 *
 * Usage:            ParameterVariables is an option for GroebnerBasis and PolynomialReduce. These variables will always be last in the ordering. By default, all variables that are not otherwise classified will become parameter variables. By specifying them explicitly one fixes their relative positions in the overall variable ordering.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: <>None[Local]
 * Documentation:    web: <>None[Web]
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
fun parameterVariables(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ParameterVariables", arguments.toMutableList(), options)
}
