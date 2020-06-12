package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SystemProcessData
 *
 * Full name:        System`SystemProcessData
 *
 * Usage:            SystemProcessData[] returns a Dataset containing information on the processes running on the host computer.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/SystemProcessData
 * Documentation:    web: http://reference.wolfram.com/language/ref/SystemProcessData.html
 *
 *                   SystemProcessData[] := Dataset[ProcessLink`Private`renderForDataset[Sort[ProcessLink`Private`getProcs[True]]]]
 *                   SystemProcessData[All] := Dataset[ProcessLink`Private`renderForDataset[Sort[ProcessLink`Private`getProcs[False]]]]
 *                   SystemProcessData[ProcessLink`Private`p:_String | _StringExpression | _RegularExpression] := Block[{ProcessLink`Private`processes, ProcessLink`Private`filtered}, ProcessLink`Private`processes = ProcessLink`Private`renderForDataset[Sort[ProcessLink`Private`getProcs[False]]]; ProcessLink`Private`filtered = Select[ProcessLink`Private`processes, If[StringQ[#1["Path"]], StringContainsQ[#1["Path"], ProcessLink`Private`p], False] & ]; Dataset[ProcessLink`Private`filtered]]
 *                   SystemProcessData[ProcessLink`Private`p:{(_ -> _)..}] := Dataset[Fold[ProcessLink`Private`filter, ProcessLink`Private`renderForDataset[Sort[ProcessLink`Private`getProcs[False]]], ProcessLink`Private`p]]
 * Definitions:      SystemProcessData[ProcessLink`Private`p_Rule] := Dataset[ProcessLink`Private`filter[ProcessLink`Private`renderForDataset[Sort[ProcessLink`Private`getProcs[False]]], ProcessLink`Private`p]]
 *
 * Own values:       None
 *
 *                   SystemProcessData[] := Dataset[ProcessLink`Private`renderForDataset[Sort[ProcessLink`Private`getProcs[True]]]]
 *                   SystemProcessData[All] := Dataset[ProcessLink`Private`renderForDataset[Sort[ProcessLink`Private`getProcs[False]]]]
 *                   SystemProcessData[ProcessLink`Private`p:_String | _StringExpression | _RegularExpression] := Block[{ProcessLink`Private`processes, ProcessLink`Private`filtered}, ProcessLink`Private`processes = ProcessLink`Private`renderForDataset[Sort[ProcessLink`Private`getProcs[False]]]; ProcessLink`Private`filtered = Select[ProcessLink`Private`processes, If[StringQ[#1["Path"]], StringContainsQ[#1["Path"], ProcessLink`Private`p], False] & ]; Dataset[ProcessLink`Private`filtered]]
 *                   SystemProcessData[ProcessLink`Private`p:{(_ -> _)..}] := Dataset[Fold[ProcessLink`Private`filter, ProcessLink`Private`renderForDataset[Sort[ProcessLink`Private`getProcs[False]]], ProcessLink`Private`p]]
 * Down values:      SystemProcessData[ProcessLink`Private`p_Rule] := Dataset[ProcessLink`Private`filter[ProcessLink`Private`renderForDataset[Sort[ProcessLink`Private`getProcs[False]]], ProcessLink`Private`p]]
 *
 * Up values:        None
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun systemProcessData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SystemProcessData", arguments.toMutableList(), options)
}
