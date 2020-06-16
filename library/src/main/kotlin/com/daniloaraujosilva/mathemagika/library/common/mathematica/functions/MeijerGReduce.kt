package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             MeijerGReduce
 *
 * Full name:        System`MeijerGReduce
 *
 * Usage:            MeijerGReduce[expr, x] attempts to reduce expr to a single MeijerG object as a function of x.
 *
 * Options:          Assumptions :> $Assumptions
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MeijerGReduce
 * Documentation:    web: http://reference.wolfram.com/language/ref/MeijerGReduce.html
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
fun meijerGReduce(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MeijerGReduce", arguments.toMutableList(), options)
}
