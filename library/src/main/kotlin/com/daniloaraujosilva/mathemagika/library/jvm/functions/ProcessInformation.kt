package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ProcessInformation
 *
 * Full name:        System`ProcessInformation
 *
 *                   ProcessInformation[proc] gives information about an external process proc.
 * Usage:            ProcessInformation[proc, "prop"] gives information about the property "prop".
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ProcessInformation
 * Documentation:    web: http://reference.wolfram.com/language/ref/ProcessInformation.html
 *
 *                   ProcessInformation[ProcessLink`Private`pr:ProcessObject[Association["ManagedProcess" -> True, "UID" -> ProcessLink`Private`p_, ___]]] := With[{ProcessLink`Private`t = {"ExitCode" -> ProcessInformation[ProcessLink`Private`pr, "ExitCode"]}}, Association[ProcessLink`Private`t]]
 *                   ProcessInformation[ProcessLink`Private`pr:ProcessObject[Association["ManagedProcess" -> True, "UID" -> ProcessLink`Private`p_, ___]], "ExitCode"] := ProcessLink`Private`iGetExitValue[ProcessLink`Private`pr]
 *                   ProcessInformation[ProcessLink`Private`pr:ProcessObject[Association["ManagedProcess" -> False, ___]]] := Association[]
 * Definitions:      ProcessInformation[ProcessLink`Private`args___] /; (If[Length[{ProcessLink`Private`args}] < 1 || Length[{ProcessLink`Private`args}] > 2, Message[ProcessInformation::argt, ProcessInformation, Length[{ProcessLink`Private`args}], 1, 2]]; False) := None
 *
 * Own values:       None
 *
 *                   ProcessInformation[ProcessLink`Private`pr:ProcessObject[Association["ManagedProcess" -> True, "UID" -> ProcessLink`Private`p_, ___]]] := With[{ProcessLink`Private`t = {"ExitCode" -> ProcessInformation[ProcessLink`Private`pr, "ExitCode"]}}, Association[ProcessLink`Private`t]]
 *                   ProcessInformation[ProcessLink`Private`pr:ProcessObject[Association["ManagedProcess" -> True, "UID" -> ProcessLink`Private`p_, ___]], "ExitCode"] := ProcessLink`Private`iGetExitValue[ProcessLink`Private`pr]
 *                   ProcessInformation[ProcessLink`Private`pr:ProcessObject[Association["ManagedProcess" -> False, ___]]] := Association[]
 * Down values:      ProcessInformation[ProcessLink`Private`args___] /; (If[Length[{ProcessLink`Private`args}] < 1 || Length[{ProcessLink`Private`args}] > 2, Message[ProcessInformation::argt, ProcessInformation, Length[{ProcessLink`Private`args}], 1, 2]]; False) := None
 *
 * Up values:        None
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun processInformation(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ProcessInformation", arguments.toMutableList(), options)
}
