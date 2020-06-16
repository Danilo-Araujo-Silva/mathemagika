package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             SystemProcesses
 *
 * Full name:        System`SystemProcesses
 *
 * Usage:            SystemProcesses[] returns a list of ProcessObjects that represent system programs.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/SystemProcesses
 * Documentation:    web: http://reference.wolfram.com/language/ref/SystemProcesses.html
 *
 *                   SystemProcesses[] := ProcessLink`Private`makeExternalProcessObjects[Sort[ProcessLink`Private`getProcs[True]]]
 *                   SystemProcesses[All] := ProcessLink`Private`makeExternalProcessObjects[Sort[ProcessLink`Private`getProcs[False]]]
 *                   SystemProcesses[ProcessLink`Private`p:_String | _StringExpression | _RegularExpression] := Block[{ProcessLink`Private`processes}, ProcessLink`Private`processes = ProcessLink`Private`makeExternalProcessObjects[Sort[ProcessLink`Private`getProcs[False]]]; Select[ProcessLink`Private`processes, If[StringQ[#1["Path"]], StringContainsQ[#1["Path"], ProcessLink`Private`p], False] & ]]
 *                   SystemProcesses[ProcessLink`Private`p_Rule] := ProcessLink`Private`filter[ProcessLink`Private`makeExternalProcessObjects[Sort[ProcessLink`Private`getProcs[False]]], ProcessLink`Private`p]
 * Definitions:      SystemProcesses[ProcessLink`Private`p:{(_ -> _)..}] := Fold[ProcessLink`Private`filter, ProcessLink`Private`makeExternalProcessObjects[Sort[ProcessLink`Private`getProcs[False]]], ProcessLink`Private`p]
 *
 * Own values:       None
 *
 *                   SystemProcesses[] := ProcessLink`Private`makeExternalProcessObjects[Sort[ProcessLink`Private`getProcs[True]]]
 *                   SystemProcesses[All] := ProcessLink`Private`makeExternalProcessObjects[Sort[ProcessLink`Private`getProcs[False]]]
 *                   SystemProcesses[ProcessLink`Private`p:_String | _StringExpression | _RegularExpression] := Block[{ProcessLink`Private`processes}, ProcessLink`Private`processes = ProcessLink`Private`makeExternalProcessObjects[Sort[ProcessLink`Private`getProcs[False]]]; Select[ProcessLink`Private`processes, If[StringQ[#1["Path"]], StringContainsQ[#1["Path"], ProcessLink`Private`p], False] & ]]
 *                   SystemProcesses[ProcessLink`Private`p_Rule] := ProcessLink`Private`filter[ProcessLink`Private`makeExternalProcessObjects[Sort[ProcessLink`Private`getProcs[False]]], ProcessLink`Private`p]
 * Down values:      SystemProcesses[ProcessLink`Private`p:{(_ -> _)..}] := Fold[ProcessLink`Private`filter, ProcessLink`Private`makeExternalProcessObjects[Sort[ProcessLink`Private`getProcs[False]]], ProcessLink`Private`p]
 *
 * Up values:        None
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun systemProcesses(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SystemProcesses", arguments.toMutableList(), options)
}
