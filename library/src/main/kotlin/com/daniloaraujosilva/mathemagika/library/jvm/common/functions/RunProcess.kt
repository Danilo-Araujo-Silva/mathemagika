package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             RunProcess
 *
 * Full name:        System`RunProcess
 *
 *                   RunProcess["command"] runs the specified external command, returning information on the outcome.
 *                   RunProcess[{"command", arg 1, arg 2, …}] runs the specified command, with command-line arguments arg i.
 *                   RunProcess[command, "prop"] returns only the specified property.
 * Usage:            RunProcess[command, prop, input] feeds the specified initial input to the command.
 *
 *                   ProcessDirectory -> Inherited
 * Options:          ProcessEnvironment -> Inherited
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/RunProcess
 * Documentation:    web: http://reference.wolfram.com/language/ref/RunProcess.html
 *
 *                   RunProcess[ProcessLink`Private`arg:_List | _String | _File, ProcessLink`Private`args___, ProcessLink`Private`opts:OptionsPattern[]] := Block[{ProcessLink`Private`$inRunProcessF = True, ProcessLink`Private`procCommand}, ProcessLink`Private`procCommand = ProcessLink`Private`handleFileWrapper[ProcessLink`Private`arg]; If[FailureQ[ProcessLink`Private`procCommand], Message[RunProcess::invsys1, ProcessLink`Private`arg, "command specification"]; Return[$Failed]]; RunProcess[ProcessLink`Private`procCommand, ProcessLink`Private`args, ProcessLink`Private`opts]] /;  !TrueQ[ProcessLink`Private`$inRunProcessF]
 *                   RunProcess[ProcessLink`Private`command_String, ProcessLink`Private`opts:OptionsPattern[]] := If[ProcessLink`Private`commandExistQ[ProcessLink`Private`command, OptionValue[ProcessEnvironment], OptionValue[ProcessDirectory]], RunProcess[{ProcessLink`Private`command}, ProcessLink`Private`opts], If[ProcessLink`Private`containsSpaceQ[ProcessLink`Private`command], Message[RunProcess::pnfds, ProcessLink`Private`command], Message[RunProcess::pnfd, ProcessLink`Private`command]]; $Failed]
 *                   RunProcess[ProcessLink`Private`commands_List, ProcessLink`Private`opts:OptionsPattern[]] := ProcessLink`Private`runProcess[ProcessLink`Private`commands, OptionValue[ProcessEnvironment], OptionValue[ProcessDirectory], ProcessLink`Private`NoInputProvided, All]
 *                   RunProcess[ProcessLink`Private`command_String, ProcessLink`Private`ret:All | ("ExitCode" | "StandardOutput" | "StandardError"), ProcessLink`Private`inputexpr_:ProcessLink`Private`NoInputProvided, ProcessLink`Private`opts:OptionsPattern[]] /;  !MatchQ[ProcessLink`Private`inputexpr, _Rule | _RuleDelayed] := If[ProcessLink`Private`commandExistQ[ProcessLink`Private`command, OptionValue[ProcessEnvironment], OptionValue[ProcessDirectory]], RunProcess @@ {{ProcessLink`Private`command}, ProcessLink`Private`ret, ProcessLink`Private`inputexpr, ProcessLink`Private`opts}, If[ProcessLink`Private`containsSpaceQ[ProcessLink`Private`command], Message[RunProcess::pnfds, ProcessLink`Private`command], Message[RunProcess::pnfd, ProcessLink`Private`command]]; $Failed]
 *                   RunProcess[ProcessLink`Private`commands_List, ProcessLink`Private`ret:All | ("ExitCode" | "StandardOutput" | "StandardError"), ProcessLink`Private`inputexpr_:ProcessLink`Private`NoInputProvided, ProcessLink`Private`opts:OptionsPattern[]] /;  !MatchQ[ProcessLink`Private`inputexpr, _Rule | _RuleDelayed] := ProcessLink`Private`runProcess[ProcessLink`Private`commands, OptionValue[ProcessEnvironment], OptionValue[ProcessDirectory], ProcessLink`Private`inputexpr, ProcessLink`Private`ret]
 *                   RunProcess[ProcessLink`Private`commands:_List | _String, ProcessLink`Private`ret_String, ProcessLink`Private`inputexpr_:ProcessLink`Private`NoInputProvided, ProcessLink`Private`opts:OptionsPattern[]] /;  !MatchQ[ProcessLink`Private`inputexpr, _Rule | _RuleDelayed] := With[{ProcessLink`Private`values = StringJoin @@ Riffle[Append[(ToString[#1, InputForm] & ) /@ ProcessLink`Private`runProcessOutputs, "and All"], ", "]}, Message[General::optvp, 2, "RunProcess", ProcessLink`Private`values]; ]
 * Definitions:      RunProcess[ProcessLink`Private`args___] /; (If[Length[{ProcessLink`Private`args}] < 1 || Length[{ProcessLink`Private`args}] > 3, Message[RunProcess::argb, RunProcess, Length[{ProcessLink`Private`args}], 1, 3]]; False) := None
 *
 * Own values:       None
 *
 *                   RunProcess[ProcessLink`Private`arg:_List | _String | _File, ProcessLink`Private`args___, ProcessLink`Private`opts:OptionsPattern[]] := Block[{ProcessLink`Private`$inRunProcessF = True, ProcessLink`Private`procCommand}, ProcessLink`Private`procCommand = ProcessLink`Private`handleFileWrapper[ProcessLink`Private`arg]; If[FailureQ[ProcessLink`Private`procCommand], Message[RunProcess::invsys1, ProcessLink`Private`arg, "command specification"]; Return[$Failed]]; RunProcess[ProcessLink`Private`procCommand, ProcessLink`Private`args, ProcessLink`Private`opts]] /;  !TrueQ[ProcessLink`Private`$inRunProcessF]
 *                   RunProcess[ProcessLink`Private`command_String, ProcessLink`Private`opts:OptionsPattern[]] := If[ProcessLink`Private`commandExistQ[ProcessLink`Private`command, OptionValue[ProcessEnvironment], OptionValue[ProcessDirectory]], RunProcess[{ProcessLink`Private`command}, ProcessLink`Private`opts], If[ProcessLink`Private`containsSpaceQ[ProcessLink`Private`command], Message[RunProcess::pnfds, ProcessLink`Private`command], Message[RunProcess::pnfd, ProcessLink`Private`command]]; $Failed]
 *                   RunProcess[ProcessLink`Private`commands_List, ProcessLink`Private`opts:OptionsPattern[]] := ProcessLink`Private`runProcess[ProcessLink`Private`commands, OptionValue[ProcessEnvironment], OptionValue[ProcessDirectory], ProcessLink`Private`NoInputProvided, All]
 *                   RunProcess[ProcessLink`Private`command_String, ProcessLink`Private`ret:All | ("ExitCode" | "StandardOutput" | "StandardError"), ProcessLink`Private`inputexpr_:ProcessLink`Private`NoInputProvided, ProcessLink`Private`opts:OptionsPattern[]] /;  !MatchQ[ProcessLink`Private`inputexpr, _Rule | _RuleDelayed] := If[ProcessLink`Private`commandExistQ[ProcessLink`Private`command, OptionValue[ProcessEnvironment], OptionValue[ProcessDirectory]], RunProcess @@ {{ProcessLink`Private`command}, ProcessLink`Private`ret, ProcessLink`Private`inputexpr, ProcessLink`Private`opts}, If[ProcessLink`Private`containsSpaceQ[ProcessLink`Private`command], Message[RunProcess::pnfds, ProcessLink`Private`command], Message[RunProcess::pnfd, ProcessLink`Private`command]]; $Failed]
 *                   RunProcess[ProcessLink`Private`commands_List, ProcessLink`Private`ret:All | ("ExitCode" | "StandardOutput" | "StandardError"), ProcessLink`Private`inputexpr_:ProcessLink`Private`NoInputProvided, ProcessLink`Private`opts:OptionsPattern[]] /;  !MatchQ[ProcessLink`Private`inputexpr, _Rule | _RuleDelayed] := ProcessLink`Private`runProcess[ProcessLink`Private`commands, OptionValue[ProcessEnvironment], OptionValue[ProcessDirectory], ProcessLink`Private`inputexpr, ProcessLink`Private`ret]
 *                   RunProcess[ProcessLink`Private`commands:_List | _String, ProcessLink`Private`ret_String, ProcessLink`Private`inputexpr_:ProcessLink`Private`NoInputProvided, ProcessLink`Private`opts:OptionsPattern[]] /;  !MatchQ[ProcessLink`Private`inputexpr, _Rule | _RuleDelayed] := With[{ProcessLink`Private`values = StringJoin @@ Riffle[Append[(ToString[#1, InputForm] & ) /@ ProcessLink`Private`runProcessOutputs, "and All"], ", "]}, Message[General::optvp, 2, "RunProcess", ProcessLink`Private`values]; ]
 * Down values:      RunProcess[ProcessLink`Private`args___] /; (If[Length[{ProcessLink`Private`args}] < 1 || Length[{ProcessLink`Private`args}] > 3, Message[RunProcess::argb, RunProcess, Length[{ProcessLink`Private`args}], 1, 3]]; False) := None
 *
 * Up values:        None
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun runProcess(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RunProcess", arguments.toMutableList(), options)
}
