package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             DifferentialRootReduce
 *
 * Full name:        System`DifferentialRootReduce
 *
 *                   DifferentialRootReduce[expr, x] attempts to reduce expr to a single DifferentialRoot object as a function of x.
 *                   DifferentialRootReduce[expr, {x, x }] takes the initial conditions to be specified at x = x .
 * Usage:                                              0                                                        0
 *
 *                   Assumptions :> $Assumptions
 * Options:          Method -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DifferentialRootReduce
 * Documentation:    web: http://reference.wolfram.com/language/ref/DifferentialRootReduce.html
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
fun differentialRootReduce(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DifferentialRootReduce", arguments.toMutableList(), options)
}
