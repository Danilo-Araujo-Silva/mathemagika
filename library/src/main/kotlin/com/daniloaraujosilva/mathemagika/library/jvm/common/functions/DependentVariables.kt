package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DependentVariables
 *
 * Full name:        System`DependentVariables
 *
 * Usage:            DependentVariables is an option for NDSolve and other functions that specifies the list of all objects that should be considered as dependent variables in equations that have been supplied.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/DependentVariables
 * Documentation:    web: http://reference.wolfram.com/language/ref/DependentVariables.html
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
fun dependentVariables(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DependentVariables", arguments.toMutableList(), options)
}
