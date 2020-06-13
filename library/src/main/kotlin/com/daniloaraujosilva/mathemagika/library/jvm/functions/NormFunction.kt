package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             NormFunction
 *
 * Full name:        System`NormFunction
 *
 * Usage:            NormFunction is an option for functions such as FindFit and NDSolve which gives a function to be minimized in generating results.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/NormFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/NormFunction.html
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
fun normFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NormFunction", arguments.toMutableList(), options)
}
