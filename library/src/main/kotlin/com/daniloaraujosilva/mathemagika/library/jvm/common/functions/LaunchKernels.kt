package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             LaunchKernels
 *
 * Full name:        System`LaunchKernels
 *
 *                   LaunchKernels[] launches all currently configured parallel subkernels.
 *                   LaunchKernels[n] launches n local subkernels on the current computer.
 *                   LaunchKernels[ker] launches the kernel specified by ker.
 *                   LaunchKernels[{ker , ker , …}] launches the kernels ker .
 * Usage:                              1     2                              i
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/LaunchKernels
 * Documentation:    web: http://reference.wolfram.com/language/ref/LaunchKernels.html
 *
 *                   LaunchKernels[Parallel`Kernels`Private`l_List, Parallel`Kernels`Private`opts:OptionsPattern[]] := Flatten[Parallel`Kernels`launchFeedback[(Parallel`Developer`LaunchKernel[#1, Parallel`Kernels`Private`opts] & ) /@ Parallel`Kernels`Private`l]]
 *                   LaunchKernels[Parallel`Kernels`Private`descr__, Parallel`Kernels`Private`opts:OptionsPattern[]] := Parallel`Kernels`launchFeedback[Parallel`Developer`LaunchKernel[Parallel`Kernels`Private`descr, Parallel`Kernels`Private`opts]]
 *                   LaunchKernels[Parallel`Kernels`Private`opts:OptionsPattern[]] /; $KernelCount > 0 := (Message[LaunchKernels::nodef]; $Failed)
 *                   LaunchKernels[Parallel`Kernels`Private`opts:OptionsPattern[]] /; ListQ[$ConfiguredKernels] && Total[SubKernels`KernelCount /@ $ConfiguredKernels] == 0 && $ProcessorCount == 1 := (Message[LaunchKernels::unicore]; LaunchKernels[$ConfiguredKernels, Parallel`Kernels`Private`opts])
 * Definitions:      LaunchKernels[Parallel`Kernels`Private`opts:OptionsPattern[]] /; ListQ[$ConfiguredKernels] := LaunchKernels[$ConfiguredKernels, Parallel`Kernels`Private`opts]
 *
 * Own values:       None
 *
 *                   LaunchKernels[Parallel`Kernels`Private`l_List, Parallel`Kernels`Private`opts:OptionsPattern[]] := Flatten[Parallel`Kernels`launchFeedback[(Parallel`Developer`LaunchKernel[#1, Parallel`Kernels`Private`opts] & ) /@ Parallel`Kernels`Private`l]]
 *                   LaunchKernels[Parallel`Kernels`Private`descr__, Parallel`Kernels`Private`opts:OptionsPattern[]] := Parallel`Kernels`launchFeedback[Parallel`Developer`LaunchKernel[Parallel`Kernels`Private`descr, Parallel`Kernels`Private`opts]]
 *                   LaunchKernels[Parallel`Kernels`Private`opts:OptionsPattern[]] /; $KernelCount > 0 := (Message[LaunchKernels::nodef]; $Failed)
 *                   LaunchKernels[Parallel`Kernels`Private`opts:OptionsPattern[]] /; ListQ[$ConfiguredKernels] && Total[SubKernels`KernelCount /@ $ConfiguredKernels] == 0 && $ProcessorCount == 1 := (Message[LaunchKernels::unicore]; LaunchKernels[$ConfiguredKernels, Parallel`Kernels`Private`opts])
 * Down values:      LaunchKernels[Parallel`Kernels`Private`opts:OptionsPattern[]] /; ListQ[$ConfiguredKernels] := LaunchKernels[$ConfiguredKernels, Parallel`Kernels`Private`opts]
 *
 * Up values:        None
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun launchKernels(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LaunchKernels", arguments.toMutableList(), options)
}
