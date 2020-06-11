package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ParallelMap
 *
 * Full name:        System`ParallelMap
 *
 *                   ParallelMap[f, expr] applies f in parallel to each element on the first level in expr.
 * Usage:            ParallelMap[f, expr, levelspec] applies f in parallel to parts of expr specified by levelspec.
 *
 *                   DistributedContexts :> $DistributedContexts
 * Options:          Method -> Automatic
 *
 *                   HoldRest
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ParallelMap
 * Documentation:    web: http://reference.wolfram.com/language/ref/ParallelMap.html
 *
 * Definitions:      ParallelMap[Parallel`Kernels`Private`args$___] := (Parallel`Protected`doAutolaunch[TrueQ[Parallel`Static`$enableLaunchFeedback]]; ParallelMap[Parallel`Kernels`Private`args$])
 *
 * Own values:       None
 *
 * Down values:      ParallelMap[Parallel`Kernels`Private`args$___] := (Parallel`Protected`doAutolaunch[TrueQ[Parallel`Static`$enableLaunchFeedback]]; ParallelMap[Parallel`Kernels`Private`args$])
 *
 * Up values:        None
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun parallelMap(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ParallelMap", arguments.toMutableList(), options)
}
