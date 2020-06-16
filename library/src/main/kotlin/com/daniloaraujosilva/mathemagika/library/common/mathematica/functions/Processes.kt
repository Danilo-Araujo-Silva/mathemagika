package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Processes
 *
 * Full name:        System`Processes
 *
 * Usage:            Processes[] returns a list of currently running external processes, started in this Wolfram Language session.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Processes
 * Documentation:    web: http://reference.wolfram.com/language/ref/Processes.html
 *
 *                   Processes[] := (ProcessLink`Private`removeRunningProcesses[Select[ProcessLink`Private`$RunningProcesses, ProcessLink`Private`hasFinishedQ[#1, 100] & ]]; (ProcessObject[Association["ManagedProcess" -> True, "UID" -> #1]] & ) /@ ProcessLink`Private`$RunningProcesses)
 * Definitions:      Processes[ProcessLink`Private`args__] /; (Message[Processes::argrx, Processes, Length[{ProcessLink`Private`args}], 0]; False) := None
 *
 * Own values:       None
 *
 *                   Processes[] := (ProcessLink`Private`removeRunningProcesses[Select[ProcessLink`Private`$RunningProcesses, ProcessLink`Private`hasFinishedQ[#1, 100] & ]]; (ProcessObject[Association["ManagedProcess" -> True, "UID" -> #1]] & ) /@ ProcessLink`Private`$RunningProcesses)
 * Down values:      Processes[ProcessLink`Private`args__] /; (Message[Processes::argrx, Processes, Length[{ProcessLink`Private`args}], 0]; False) := None
 *
 * Up values:        None
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun processes(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Processes", arguments.toMutableList(), options)
}
