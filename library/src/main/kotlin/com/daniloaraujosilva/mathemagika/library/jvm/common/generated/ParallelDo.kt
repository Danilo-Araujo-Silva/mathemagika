package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ParallelDo
 * 
 * Full name:        System`ParallelDo
 * 
 *                   ParallelDo[expr, {i   }] evaluates expr in parallel i    times. 
 *                                      max                               max
 *                   ParallelDo[expr, {i, i   }] evaluates expr in parallel with the variable i successively taking on the values 1 through i    (in steps of 1). 
 *                                         max                                                                                               max
 *                   ParallelDo[expr, {i, i   , i   }] starts with i = i   . 
 *                                         min   max                    min
 *                   ParallelDo[expr, {i, i   , i   , di}] uses steps di. 
 *                                         min   max
 *                   ParallelDo[expr, {i, {i , i , …}}] uses the successive values i , i , ….
 *                                          1   2                                   1   2
 *                   ParallelDo[expr, {i, i   , i   }, {j, j   , j   }, …] evaluates expr looping in parallel over different values of j, etc. for each i. 
 * Usage:                                  min   max        min   max
 * 
 *                   DistributedContexts :> $DistributedContexts
 * Options:          Method -> Automatic
 * 
 *                   HoldAll
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/ParallelDo
 * Documentation:    web: http://reference.wolfram.com/language/ref/ParallelDo.html
 * 
 * Definitions:      ParallelDo[Parallel`Kernels`Private`args$___] := (Parallel`Protected`doAutolaunch[TrueQ[Parallel`Static`$enableLaunchFeedback]]; ParallelDo[Parallel`Kernels`Private`args$])
 * 
 * Own values:       None
 * 
 * Down values:      ParallelDo[Parallel`Kernels`Private`args$___] := (Parallel`Protected`doAutolaunch[TrueQ[Parallel`Static`$enableLaunchFeedback]]; ParallelDo[Parallel`Kernels`Private`args$])
 * 
 * Up values:        None
 * 
 * Sub values:       None
 * 
 * Default value:    None
 * 
 * Numeric values:   None
 */
fun parallelDo(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ParallelDo", arguments.toMutableList(), options)
}
