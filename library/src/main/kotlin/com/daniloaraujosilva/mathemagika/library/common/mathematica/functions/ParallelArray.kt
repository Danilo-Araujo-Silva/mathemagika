package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ParallelArray
 *
 * Full name:        System`ParallelArray
 *
 *                   ParallelArray[f, n] generates in parallel a list of length n, with elements f[i], evaluated.
 *                   ParallelArray[f, {n , n , …}] generates in parallel an n   n   … array of nested lists, with elements f[i , i , …].
 *                                      1   2                                1    2                                             1   2
 *                   ParallelArray[f, {n , n , …}, {r , r , …}] generates in parallel a list using the index origins r  (default 1).
 *                                      1   2        1   2                                                            i
 * Usage:            ParallelArray[f, dims, origin, h] uses head h, rather than List, for each level of the array.
 *
 *                   DistributedContexts :> $DistributedContexts
 * Options:          Method -> Automatic
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ParallelArray
 * Documentation:    web: http://reference.wolfram.com/language/ref/ParallelArray.html
 *
 * Definitions:      ParallelArray[Parallel`Kernels`Private`args$___] := (Parallel`Protected`doAutolaunch[TrueQ[Parallel`Static`$enableLaunchFeedback]]; ParallelArray[Parallel`Kernels`Private`args$])
 *
 * Own values:       None
 *
 * Down values:      ParallelArray[Parallel`Kernels`Private`args$___] := (Parallel`Protected`doAutolaunch[TrueQ[Parallel`Static`$enableLaunchFeedback]]; ParallelArray[Parallel`Kernels`Private`args$])
 *
 * Up values:        None
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun parallelArray(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ParallelArray", arguments.toMutableList(), options)
}
