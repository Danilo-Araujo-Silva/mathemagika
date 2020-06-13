package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ObservabilityGramian
 *
 * Full name:        System`ObservabilityGramian
 *
 * Usage:            ObservabilityGramian[ssm] gives the observability Gramian of the state-space model ssm.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ObservabilityGramian
 * Documentation:    web: http://reference.wolfram.com/language/ref/ObservabilityGramian.html
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
 * Default value:    Options[ObservabilityGramian] := Options[ControllabilityGramian]
 *
 * Numeric values:   None
 */
fun observabilityGramian(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ObservabilityGramian", arguments.toMutableList(), options)
}
