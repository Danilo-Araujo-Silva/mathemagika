package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             CloseKernels
 * 
 * Full name:        System`CloseKernels
 * 
 *                   CloseKernels[] terminates all parallel kernels from the list Kernels[].
 *                   CloseKernels[k] terminates the kernel k.
 *                   CloseKernels[{k , k , …}] terminates the kernels k , k , ….
 * Usage:                           1   2                              1   2
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/CloseKernels
 * Documentation:    web: http://reference.wolfram.com/language/ref/CloseKernels.html
 * 
 *                   CloseKernels[$Failed] := $Failed
 *                   CloseKernels[] := CloseKernels[Parallel`Protected`$kernels]
 *                   CloseKernels[Parallel`Kernels`Private`kernel_KernelObject] := Close[Parallel`Kernels`Private`kernel]
 *                   CloseKernels[(Parallel`Kernels`Private`id_Integer)?Positive] := CloseKernels[Parallel`Developer`KernelFromID[Parallel`Kernels`Private`id]]
 * Definitions:      CloseKernels[Parallel`Kernels`Private`l_List] := CloseKernels /@ Parallel`Kernels`Private`l
 * 
 * Own values:       None
 * 
 *                   CloseKernels[$Failed] := $Failed
 *                   CloseKernels[] := CloseKernels[Parallel`Protected`$kernels]
 *                   CloseKernels[Parallel`Kernels`Private`kernel_KernelObject] := Close[Parallel`Kernels`Private`kernel]
 *                   CloseKernels[(Parallel`Kernels`Private`id_Integer)?Positive] := CloseKernels[Parallel`Developer`KernelFromID[Parallel`Kernels`Private`id]]
 * Down values:      CloseKernels[Parallel`Kernels`Private`l_List] := CloseKernels /@ Parallel`Kernels`Private`l
 * 
 * Up values:        None
 * 
 * Sub values:       None
 * 
 * Default value:    None
 * 
 * Numeric values:   None
 */
fun closeKernels(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CloseKernels", arguments.toMutableList(), options)
}
