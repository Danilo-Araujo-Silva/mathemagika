package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DifferenceRootReduce
 *
 * Full name:        System`DifferenceRootReduce
 *
 * Usage:            DifferenceRootReduce[expr, n] attempts to reduce expr to a single DifferenceRoot object as a function of n.
 *
 *                   Assumptions :> $Assumptions
 * Options:          Method -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DifferenceRootReduce
 * Documentation:    web: http://reference.wolfram.com/language/ref/DifferenceRootReduce.html
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
fun differenceRootReduce(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DifferenceRootReduce", arguments.toMutableList(), options)
}
