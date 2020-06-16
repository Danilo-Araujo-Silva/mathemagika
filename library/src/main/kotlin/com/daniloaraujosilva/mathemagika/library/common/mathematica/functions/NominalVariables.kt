package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             NominalVariables
 *
 * Full name:        System`NominalVariables
 *
 * Usage:            NominalVariables is an option for statistical functions such as LinearModelFit that specifies which variables should be treated as having discrete values specified by names.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/NominalVariables
 * Documentation:    web: http://reference.wolfram.com/language/ref/NominalVariables.html
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
fun nominalVariables(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NominalVariables", arguments.toMutableList(), options)
}
