package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Parallelize
 * 
 * Full name:        System`Parallelize
 * 
 * Usage:            Parallelize[expr] evaluates expr using automatic parallelization.
 * 
 *                   DistributedContexts :> $Context
 * Options:          Method -> Automatic
 * 
 *                   HoldFirst
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/Parallelize
 * Documentation:    web: http://reference.wolfram.com/language/ref/Parallelize.html
 * 
 * Definitions:      Parallelize[Parallel`Kernels`Private`args$___] := (Parallel`Protected`doAutolaunch[TrueQ[Parallel`Static`$enableLaunchFeedback]]; Parallelize[Parallel`Kernels`Private`args$])
 * 
 * Own values:       None
 * 
 * Down values:      Parallelize[Parallel`Kernels`Private`args$___] := (Parallel`Protected`doAutolaunch[TrueQ[Parallel`Static`$enableLaunchFeedback]]; Parallelize[Parallel`Kernels`Private`args$])
 * 
 * Up values:        None
 * 
 * Sub values:       None
 * 
 * Default value:    None
 * 
 * Numeric values:   None
 */
fun parallelize(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Parallelize", arguments.toMutableList(), options)
}
