package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ParallelProduct
 *
 * Full name:        System`ParallelProduct
 *
 *                                                                          i
 *                   ParallelProduct[expr, {i, i   }] evaluates the product  max  expr in parallel.
 *                                              max                           ∏
 *                                                                          i = 1
 *                   ParallelProduct[expr, {i, i   , i   }] starts with i = i   .
 *                                              min   max                    min
 *                   ParallelProduct[expr, {i, i   , i   , di}] uses steps di.
 *                                              min   max
 *                   ParallelProduct[expr, {i, {i , i , …}}] uses successive values i , i , ….
 *                                               1   2                               1   2
 *                                                                                                               i        j
 *                                                                                                                max      max
 *                   ParallelProduct[expr, {i, i   , i   }, {j, j   , j   }, …] evaluates the multiple product    ∏        ∏     … expr in parallel.
 *                                              min   max        min   max                                     i = i    j = j
 * Usage:                                                                                                           min      min
 *
 *                   DistributedContexts :> $DistributedContexts
 * Options:          Method -> Automatic
 *
 *                   HoldAll
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ParallelProduct
 * Documentation:    web: http://reference.wolfram.com/language/ref/ParallelProduct.html
 *
 * Definitions:      ParallelProduct[Parallel`Kernels`Private`args$___] := (Parallel`Protected`doAutolaunch[TrueQ[Parallel`Static`$enableLaunchFeedback]]; ParallelProduct[Parallel`Kernels`Private`args$])
 *
 * Own values:       None
 *
 * Down values:      ParallelProduct[Parallel`Kernels`Private`args$___] := (Parallel`Protected`doAutolaunch[TrueQ[Parallel`Static`$enableLaunchFeedback]]; ParallelProduct[Parallel`Kernels`Private`args$])
 *
 * Up values:        None
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun parallelProduct(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ParallelProduct", arguments.toMutableList(), options)
}
