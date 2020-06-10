package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             AbortKernels
 * 
 * Full name:        System`AbortKernels
 * 
 * Usage:            AbortKernels[] aborts evaluations running in all parallel subkernels.
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/AbortKernels
 * Documentation:    web: http://reference.wolfram.com/language/ref/AbortKernels.html
 * 
 * Definitions:      AbortKernels[] := Module[{}, CompoundExpression @@ Parallel`Kernels`Private`$resetCode; Parallel`Kernels`Private`reset /@ Parallel`Protected`$kernels; Parallel`Protected`tryRelaunch[]; Parallel`Protected`$kernels]
 * 
 * Own values:       None
 * 
 * Down values:      AbortKernels[] := Module[{}, CompoundExpression @@ Parallel`Kernels`Private`$resetCode; Parallel`Kernels`Private`reset /@ Parallel`Protected`$kernels; Parallel`Protected`tryRelaunch[]; Parallel`Protected`$kernels]
 * 
 * Up values:        None
 * 
 * Sub values:       None
 * 
 * Default value:    None
 * 
 * Numeric values:   None
 */
fun abortKernels(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AbortKernels", arguments.toMutableList(), options)
}
