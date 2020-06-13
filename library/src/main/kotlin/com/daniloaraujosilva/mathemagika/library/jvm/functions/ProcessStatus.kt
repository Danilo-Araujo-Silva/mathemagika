package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ProcessStatus
 *
 * Full name:        System`ProcessStatus
 *
 *                   ProcessStatus[proc] gives the current status of the external process represented by the ProcessObject proc.
 * Usage:            ProcessStatus[proc, "status"] returns True if the process has the status given, and returns False otherwise.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ProcessStatus
 * Documentation:    web: http://reference.wolfram.com/language/ref/ProcessStatus.html
 *
 *                   ProcessStatus[ProcessLink`Private`pr:ProcessObject[Association["ManagedProcess" -> True, "UID" -> ProcessLink`Private`id_, ___]]] := If[ProcessLink`Private`isNotValidProcess[ProcessLink`Private`pr] || ProcessLink`Private`hasFinishedQ[ProcessLink`Private`id, 100], "Finished", "Running", "Finished"]
 *                   ProcessStatus[ProcessLink`Private`pr:ProcessObject[Association["ManagedProcess" -> False, "PID" -> ProcessLink`Private`pid_, ___]]] := If[ProcessLink`Private`hasProcess[ProcessLink`Private`pid], "Finished", "Running"]
 *                   ProcessStatus[ProcessLink`Private`pr:ProcessObject[___], ProcessLink`Private`r_] := ProcessStatus[ProcessLink`Private`pr] === ProcessLink`Private`r
 * Definitions:      ProcessStatus[ProcessLink`Private`args___] /; (If[Length[{ProcessLink`Private`args}] < 1 || Length[{ProcessLink`Private`args}] > 2, Message[ProcessStatus::argt, ProcessStatus, Length[{ProcessLink`Private`args}], 1, 2]]; False) := None
 *
 * Own values:       None
 *
 *                   ProcessStatus[ProcessLink`Private`pr:ProcessObject[Association["ManagedProcess" -> True, "UID" -> ProcessLink`Private`id_, ___]]] := If[ProcessLink`Private`isNotValidProcess[ProcessLink`Private`pr] || ProcessLink`Private`hasFinishedQ[ProcessLink`Private`id, 100], "Finished", "Running", "Finished"]
 *                   ProcessStatus[ProcessLink`Private`pr:ProcessObject[Association["ManagedProcess" -> False, "PID" -> ProcessLink`Private`pid_, ___]]] := If[ProcessLink`Private`hasProcess[ProcessLink`Private`pid], "Finished", "Running"]
 *                   ProcessStatus[ProcessLink`Private`pr:ProcessObject[___], ProcessLink`Private`r_] := ProcessStatus[ProcessLink`Private`pr] === ProcessLink`Private`r
 * Down values:      ProcessStatus[ProcessLink`Private`args___] /; (If[Length[{ProcessLink`Private`args}] < 1 || Length[{ProcessLink`Private`args}] > 2, Message[ProcessStatus::argt, ProcessStatus, Length[{ProcessLink`Private`args}], 1, 2]]; False) := None
 *
 * Up values:        None
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun processStatus(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ProcessStatus", arguments.toMutableList(), options)
}
