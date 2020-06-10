package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ParallelEvaluate
 * 
 * Full name:        System`ParallelEvaluate
 * 
 *                   ParallelEvaluate[expr] evaluates the expression expr on all available parallel kernels and returns the list of results obtained.
 *                   ParallelEvaluate[expr, kernel] evaluates expr on the parallel kernel specified. 
 *                   ParallelEvaluate[expr, {ker , ker , …}] evaluates expr on the parallel kernels ker .
 *                                              1     2                                                i
 * Usage:            ParallelEvaluate[expr, kernels, h] wraps the head h around the results before returning them.
 * 
 * Options:          DistributedContexts :> $DistributedContexts
 * 
 *                   HoldFirst
 *                   Protected
 * Attributes:       SequenceHold
 * 
 *                   local: paclet:ref/ParallelEvaluate
 * Documentation:    web: http://reference.wolfram.com/language/ref/ParallelEvaluate.html
 * 
 * Definitions:      ParallelEvaluate[Parallel`Kernels`Private`args$___] := (Parallel`Protected`doAutolaunch[TrueQ[Parallel`Static`$enableLaunchFeedback]]; ParallelEvaluate[Parallel`Kernels`Private`args$])
 * 
 * Own values:       None
 * 
 * Down values:      ParallelEvaluate[Parallel`Kernels`Private`args$___] := (Parallel`Protected`doAutolaunch[TrueQ[Parallel`Static`$enableLaunchFeedback]]; ParallelEvaluate[Parallel`Kernels`Private`args$])
 * 
 * Up values:        None
 * 
 * Sub values:       None
 * 
 * Default value:    None
 * 
 * Numeric values:   None
 */
fun parallelEvaluate(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ParallelEvaluate", arguments.toMutableList(), options)
}
