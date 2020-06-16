package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ParallelSubmit
 *
 * Full name:        System`ParallelSubmit
 *
 *                   ParallelSubmit[expr] submits expr for evaluation on the next available parallel kernel and returns an EvaluationObject expression representing the submitted evaluation.
 *                   ParallelSubmit[{var , var , …}, expr] builds a closure for the variables given before submitting expr.
 * Usage:                               1     2
 *
 * Options:          Parallel`Developer`Scheduling -> Null
 *
 *                   HoldAllComplete
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ParallelSubmit
 * Documentation:    web: http://reference.wolfram.com/language/ref/ParallelSubmit.html
 *
 *                   ParallelSubmit[Parallel`Concurrency`Private`cmd_] := Parallel`Concurrency`Private`Queue0[HoldComplete[Parallel`Concurrency`Private`cmd], Parallel`Developer`Scheduling /. Options[ParallelSubmit]]
 *                   ParallelSubmit[Parallel`Concurrency`Private`cmd_, (Parallel`Concurrency`Private`opts__)?Parallel`Concurrency`Private`optionQ] := Parallel`Concurrency`Private`Queue0[HoldComplete[Parallel`Concurrency`Private`cmd], Parallel`Developer`Scheduling /. Flatten[{Parallel`Concurrency`Private`opts}] /. Options[ParallelSubmit]]
 * Definitions:      ParallelSubmit[{Parallel`Concurrency`Private`vars___Symbol}, Parallel`Concurrency`Private`cmd_, (Parallel`Concurrency`Private`opts___)?Parallel`Concurrency`Private`optionQ] := Parallel`Concurrency`Private`Queue0[HoldComplete[Parallel`Concurrency`Private`cmd], Hold[Parallel`Concurrency`Private`vars], Parallel`Developer`Scheduling /. Flatten[{Parallel`Concurrency`Private`opts}] /. Options[ParallelSubmit]]
 *
 * Own values:       None
 *
 *                   ParallelSubmit[Parallel`Concurrency`Private`cmd_] := Parallel`Concurrency`Private`Queue0[HoldComplete[Parallel`Concurrency`Private`cmd], Parallel`Developer`Scheduling /. Options[ParallelSubmit]]
 *                   ParallelSubmit[Parallel`Concurrency`Private`cmd_, (Parallel`Concurrency`Private`opts__)?Parallel`Concurrency`Private`optionQ] := Parallel`Concurrency`Private`Queue0[HoldComplete[Parallel`Concurrency`Private`cmd], Parallel`Developer`Scheduling /. Flatten[{Parallel`Concurrency`Private`opts}] /. Options[ParallelSubmit]]
 * Down values:      ParallelSubmit[{Parallel`Concurrency`Private`vars___Symbol}, Parallel`Concurrency`Private`cmd_, (Parallel`Concurrency`Private`opts___)?Parallel`Concurrency`Private`optionQ] := Parallel`Concurrency`Private`Queue0[HoldComplete[Parallel`Concurrency`Private`cmd], Hold[Parallel`Concurrency`Private`vars], Parallel`Developer`Scheduling /. Flatten[{Parallel`Concurrency`Private`opts}] /. Options[ParallelSubmit]]
 *
 * Up values:        None
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun parallelSubmit(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ParallelSubmit", arguments.toMutableList(), options)
}
