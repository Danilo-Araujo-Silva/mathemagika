package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ParallelTable
 * 
 * Full name:        System`ParallelTable
 * 
 *                   ParallelTable[expr, {i   }] generates in parallel a list of i    copies of expr.
 *                                         max                                    max
 *                   ParallelTable[expr, {i, i   }] generates in parallel a list of the values of expr when i runs from 1 to i   . 
 *                                            max                                                                             max
 *                   ParallelTable[expr, {i, i   , i   }] starts with i = i   . 
 *                                            min   max                    min
 *                   ParallelTable[expr, {i, i   , i   , di}] uses steps di. 
 *                                            min   max
 *                   ParallelTable[expr, {i, {i , i , …}}] uses the successive values i , i , ….
 *                                             1   2                                   1   2
 *                   ParallelTable[expr, {i, i   , i   }, {j, j   , j   }, …] gives a nested list. The list associated with i is outermost.
 * Usage:                                     min   max        min   max
 * 
 *                   DistributedContexts :> $DistributedContexts
 * Options:          Method -> Automatic
 * 
 *                   HoldAll
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/ParallelTable
 * Documentation:    web: http://reference.wolfram.com/language/ref/ParallelTable.html
 * 
 * Definitions:      ParallelTable[Parallel`Kernels`Private`args$___] := (Parallel`Protected`doAutolaunch[TrueQ[Parallel`Static`$enableLaunchFeedback]]; ParallelTable[Parallel`Kernels`Private`args$])
 * 
 * Own values:       None
 * 
 * Down values:      ParallelTable[Parallel`Kernels`Private`args$___] := (Parallel`Protected`doAutolaunch[TrueQ[Parallel`Static`$enableLaunchFeedback]]; ParallelTable[Parallel`Kernels`Private`args$])
 * 
 * Up values:        None
 * 
 * Sub values:       None
 * 
 * Default value:    None
 * 
 * Numeric values:   None
 */
fun parallelTable(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ParallelTable", arguments.toMutableList(), options)
}
