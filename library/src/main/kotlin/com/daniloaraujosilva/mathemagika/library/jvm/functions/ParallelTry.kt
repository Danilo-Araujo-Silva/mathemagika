package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ParallelTry
 *
 * Full name:        System`ParallelTry
 *
 *                   ParallelTry[f, {arg , arg , …}] evaluates f[arg ] in parallel, returning the first result received.
 *                                      1     2                     i
 *                   ParallelTry[f, {arg , arg , …}, k] returns a list of the first k results.
 * Usage:                               1     2
 *
 * Options:          DistributedContexts :> $DistributedContexts
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ParallelTry
 * Documentation:    web: http://reference.wolfram.com/language/ref/ParallelTry.html
 *
 * Definitions:      ParallelTry[Parallel`Kernels`Private`args$___] := (Parallel`Protected`doAutolaunch[TrueQ[Parallel`Static`$enableLaunchFeedback]]; ParallelTry[Parallel`Kernels`Private`args$])
 *
 * Own values:       None
 *
 * Down values:      ParallelTry[Parallel`Kernels`Private`args$___] := (Parallel`Protected`doAutolaunch[TrueQ[Parallel`Static`$enableLaunchFeedback]]; ParallelTry[Parallel`Kernels`Private`args$])
 *
 * Up values:        None
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun parallelTry(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ParallelTry", arguments.toMutableList(), options)
}
