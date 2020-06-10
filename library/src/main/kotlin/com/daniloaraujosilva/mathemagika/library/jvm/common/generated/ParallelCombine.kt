package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ParallelCombine
 * 
 * Full name:        System`ParallelCombine
 * 
 *                   ParallelCombine[f, h[e , e , …], comb] evaluates f[h[e , e , …]] in parallel by distributing parts of the computation to all parallel kernels and combining the partial results with comb.
 *                                         1   2                           1   2
 *                   ParallelCombine[f, h[e , e , …]] is equivalent to ParallelCombine[f, h[e , e , …], h] if h has attribute Flat, and ParallelCombine[f, h[e , e , …], Join] otherwise.
 * Usage:                                  1   2                                             1   2                                                            1   2
 * 
 *                   DistributedContexts :> $DistributedContexts
 * Options:          Method -> Automatic
 * 
 *                   HoldAllComplete
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/ParallelCombine
 * Documentation:    web: http://reference.wolfram.com/language/ref/ParallelCombine.html
 * 
 * Definitions:      ParallelCombine[Parallel`Kernels`Private`args$___] := (Parallel`Protected`doAutolaunch[TrueQ[Parallel`Static`$enableLaunchFeedback]]; ParallelCombine[Parallel`Kernels`Private`args$])
 * 
 * Own values:       None
 * 
 * Down values:      ParallelCombine[Parallel`Kernels`Private`args$___] := (Parallel`Protected`doAutolaunch[TrueQ[Parallel`Static`$enableLaunchFeedback]]; ParallelCombine[Parallel`Kernels`Private`args$])
 * 
 * Up values:        None
 * 
 * Sub values:       None
 * 
 * Default value:    None
 * 
 * Numeric values:   None
 */
fun parallelCombine(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ParallelCombine", arguments.toMutableList(), options)
}
