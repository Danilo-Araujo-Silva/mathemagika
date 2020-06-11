package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CompiledFunction
 *
 * Full name:        System`CompiledFunction
 *
 * Usage:            CompiledFunction[args…] represents compiled code for evaluating a compiled function.
 *
 * Options:          None
 *
 *                   HoldAll
 *                   NHoldAll
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CompiledFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/CompiledFunction.html
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
fun compiledFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CompiledFunction", arguments.toMutableList(), options)
}
