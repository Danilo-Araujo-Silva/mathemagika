package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             EvaluationObject
 *
 * Full name:        System`EvaluationObject
 *
 * Usage:            EvaluationObject[n, expr, …] represents an expression submitted for evaluation on any available parallel kernel.
 *
 * Options:          None
 *
 *                   HoldAllComplete
 * Attributes:       Protected
 *
 *                   local: paclet:ref/EvaluationObject
 * Documentation:    web: http://reference.wolfram.com/language/ref/EvaluationObject.html
 *
 * Definitions:      None
 *
 * Own values:       None
 *
 * Down values:      None
 *
 *                   Parallel`Concurrency`Private`id[EvaluationObject[Parallel`Concurrency`Private`id_, Parallel`Concurrency`Private`cmd_, Parallel`Concurrency`Private`sched_, Parallel`Concurrency`Private`state_]] ^:= Parallel`Concurrency`Private`id
 *                   Parallel`Concurrency`Private`cmd[EvaluationObject[Parallel`Concurrency`Private`id_, Parallel`Concurrency`Private`cmd_, Parallel`Concurrency`Private`sched_, Parallel`Concurrency`Private`state_]] ^:= HoldComplete[Parallel`Concurrency`Private`cmd]
 *                   Parallel`Concurrency`Private`sched[EvaluationObject[Parallel`Concurrency`Private`id_, Parallel`Concurrency`Private`cmd_, Parallel`Concurrency`Private`sched_, Parallel`Concurrency`Private`state_]] ^:= Parallel`Concurrency`Private`sched
 *                   Parallel`Concurrency`Private`state[EvaluationObject[Parallel`Concurrency`Private`id_, Parallel`Concurrency`Private`cmd_, Parallel`Concurrency`Private`sched_, Parallel`Concurrency`Private`state_]] ^:= Parallel`Concurrency`Private`state
 *                   Parallel`Concurrency`Private`setState[EvaluationObject[Parallel`Concurrency`Private`id_, Parallel`Concurrency`Private`cmd_, Parallel`Concurrency`Private`sched_, Parallel`Concurrency`Private`state_], Parallel`Concurrency`Private`new_] ^:= Parallel`Concurrency`Private`state = Parallel`Concurrency`Private`new
 *                   Parallel`Concurrency`Private`delete[EvaluationObject[Parallel`Concurrency`Private`id_, Parallel`Concurrency`Private`cmd_, Parallel`Concurrency`Private`sched_, Parallel`Concurrency`Private`state_]] ^:= Clear[Parallel`Concurrency`Private`state]
 *                   Parallel`Developer`Process[Parallel`Concurrency`Private`job_EvaluationObject] ^:= HoldForm @@ Parallel`Concurrency`Private`cmd[Parallel`Concurrency`Private`job]
 *                   Parallel`Developer`ProcessID[Parallel`Concurrency`Private`job_EvaluationObject] ^:= Parallel`Concurrency`Private`id[Parallel`Concurrency`Private`job]
 *                   Parallel`Developer`Scheduling[Parallel`Concurrency`Private`job_EvaluationObject] ^:= Parallel`Concurrency`Private`sched[Parallel`Concurrency`Private`job]
 *                   Parallel`Developer`ProcessState[Parallel`Concurrency`Private`job_EvaluationObject] ^:= Parallel`Concurrency`Private`state[Parallel`Concurrency`Private`job] /. Parallel`Concurrency`Private`pubtrans
 *                   Parallel`Developer`ProcessResult[Parallel`Concurrency`Private`job_EvaluationObject] ^:= Parallel`Concurrency`Private`state[Parallel`Concurrency`Private`job] /. {Parallel`Developer`finished[] | Parallel`Developer`dequeued[] :> HoldComplete[Sequence[]], Parallel`Developer`finished[Parallel`Concurrency`Private`r__] | Parallel`Developer`dequeued[Parallel`Concurrency`Private`r__] :> HoldComplete[Parallel`Concurrency`Private`r], _ :> $Failed}
 *                   Parallel`Queue`Interface`Priority[Parallel`Concurrency`Private`job_EvaluationObject] ^:= Parallel`Concurrency`Private`sched[Parallel`Concurrency`Private`job]
 *                   Parallel`Concurrency`Private`traceform[Parallel`Concurrency`Private`job_EvaluationObject] ^:= Subscripted["eid"[Parallel`Concurrency`Private`id[Parallel`Concurrency`Private`job]]][Short[Parallel`Developer`Process[Parallel`Concurrency`Private`job], 0.3]]
 *                   Parallel`Concurrency`Private`queue[Parallel`Concurrency`Private`job_EvaluationObject] ^:= (AbortProtect[PreemptProtect[Parallel`Queue`Interface`EnQueue[Parallel`Concurrency`Private`$queue, Parallel`Concurrency`Private`job]]; Parallel`Concurrency`Private`setState[Parallel`Concurrency`Private`job, Parallel`Developer`queued]]; Parallel`Debug`Private`trace[Parallel`Debug`Queueing, "`1` queued (`2`)", Parallel`Concurrency`Private`traceform[Parallel`Concurrency`Private`job], Parallel`Developer`$QueueLength - 1]; Parallel`Concurrency`Private`job)
 *                   Parallel`Concurrency`Private`reQueue[Parallel`Concurrency`Private`job_EvaluationObject] ^:= (AbortProtect[PreemptProtect[Parallel`Queue`Interface`EnQueue[Parallel`Concurrency`Private`$queue, Parallel`Concurrency`Private`job]]; Parallel`Concurrency`Private`setState[Parallel`Concurrency`Private`job, Parallel`Developer`queued]]; Parallel`Debug`Private`trace[Parallel`Debug`Queueing, "`1` requeued (`2`)", Parallel`Concurrency`Private`traceform[Parallel`Concurrency`Private`job], Parallel`Developer`$QueueLength - 1]; )
 * Up values:        Parallel`Concurrency`Private`hot[Parallel`Concurrency`Private`job_EvaluationObject] ^:= (While[ !Parallel`Concurrency`Private`doneQ[Parallel`Concurrency`Private`job], If[ !Parallel`Concurrency`Private`queueRun[{Parallel`Concurrency`Private`job}], Parallel`Protected`tryRelaunch[]; Pause[Parallel`Settings`$BusyWait]]; ]; Parallel`Concurrency`Private`deQueue[Parallel`Concurrency`Private`job])
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun evaluationObject(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EvaluationObject", arguments.toMutableList(), options)
}
