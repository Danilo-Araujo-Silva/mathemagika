package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             WaitAll
 *
 * Full name:        System`WaitAll
 *
 * Usage:            WaitAll[expr] waits for all concurrent evaluations represented by EvaluationObject expressions in expr to finish, then returns the resulting expression obtained.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/WaitAll
 * Documentation:    web: http://reference.wolfram.com/language/ref/WaitAll.html
 *
 * Definitions:      WaitAll[Parallel`Kernels`Private`args$___] := (Parallel`Protected`doAutolaunch[TrueQ[Parallel`Static`$enableLaunchFeedback]]; WaitAll[Parallel`Kernels`Private`args$])
 *
 * Own values:       None
 *
 * Down values:      WaitAll[Parallel`Kernels`Private`args$___] := (Parallel`Protected`doAutolaunch[TrueQ[Parallel`Static`$enableLaunchFeedback]]; WaitAll[Parallel`Kernels`Private`args$])
 *
 * Up values:        None
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun waitAll(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WaitAll", arguments.toMutableList(), options)
}
