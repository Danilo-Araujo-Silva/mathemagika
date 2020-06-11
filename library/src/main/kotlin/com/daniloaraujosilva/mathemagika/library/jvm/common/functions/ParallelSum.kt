package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ParallelSum
 *
 * Full name:        System`ParallelSum
 *
 *                                                                              i
 *                   ParallelSum[expr, {i, i   }] evaluates in parallel the sum  max  expr.
 *                                          max                                   ∑
 *                                                                              i = 1
 *                   ParallelSum[expr, {i, i   , i   }] starts with i = i   .
 *                                          min   max                    min
 *                   ParallelSum[expr, {i, i   , i   , di}] uses steps di.
 *                                          min   max
 *                   ParallelSum[expr, {i, {i , i , …}}] uses successive values i , i , …..
 *                                           1   2                               1   2
 *                                                                                                                   i        j
 *                                                                                                                    max      max
 *                   ParallelSum[expr, {i, i   , i   }, {j, j   , j   }, …] evaluates in parallel the multiple sum    ∑        ∑     … expr.
 *                                          min   max        min   max                                             i = i    j = j
 * Usage:                                                                                                               min      min
 *
 *                   DistributedContexts :> $DistributedContexts
 * Options:          Method -> Automatic
 *
 *                   HoldAll
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ParallelSum
 * Documentation:    web: http://reference.wolfram.com/language/ref/ParallelSum.html
 *
 * Definitions:      ParallelSum[Parallel`Kernels`Private`args$___] := (Parallel`Protected`doAutolaunch[TrueQ[Parallel`Static`$enableLaunchFeedback]]; ParallelSum[Parallel`Kernels`Private`args$])
 *
 * Own values:       None
 *
 * Down values:      ParallelSum[Parallel`Kernels`Private`args$___] := (Parallel`Protected`doAutolaunch[TrueQ[Parallel`Static`$enableLaunchFeedback]]; ParallelSum[Parallel`Kernels`Private`args$])
 *
 * Up values:        None
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun parallelSum(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ParallelSum", arguments.toMutableList(), options)
}
