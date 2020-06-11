package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ParallelNeeds
 *
 * Full name:        System`ParallelNeeds
 *
 * Usage:            ParallelNeeds["context`"] evaluates Needs["context`"] on all available parallel kernels.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ParallelNeeds
 * Documentation:    web: http://reference.wolfram.com/language/ref/ParallelNeeds.html
 *
 *                   ParallelNeeds[Parallel`Parallel`Private`s_String] := (Parallel`Protected`AddInitCode[Parallel`Parallel`Private`holdCompound[Needs[Parallel`Parallel`Private`s]]]; Parallel`Protected`addBadContext[Parallel`Parallel`Private`s]; )
 *                   ParallelNeeds[Parallel`Parallel`Private`s__String] := ParallelNeeds[{Parallel`Parallel`Private`s}]
 * Definitions:      ParallelNeeds[Parallel`Parallel`Private`s:{__String}] := (ParallelNeeds /@ Parallel`Parallel`Private`s; )
 *
 * Own values:       None
 *
 *                   ParallelNeeds[Parallel`Parallel`Private`s_String] := (Parallel`Protected`AddInitCode[Parallel`Parallel`Private`holdCompound[Needs[Parallel`Parallel`Private`s]]]; Parallel`Protected`addBadContext[Parallel`Parallel`Private`s]; )
 *                   ParallelNeeds[Parallel`Parallel`Private`s__String] := ParallelNeeds[{Parallel`Parallel`Private`s}]
 * Down values:      ParallelNeeds[Parallel`Parallel`Private`s:{__String}] := (ParallelNeeds /@ Parallel`Parallel`Private`s; )
 *
 * Up values:        None
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun parallelNeeds(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ParallelNeeds", arguments.toMutableList(), options)
}
