package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             StartProcess
 *
 * Full name:        System`StartProcess
 *
 *                   StartProcess["executable"] executes an external program, yielding a ProcessObject to represent the resulting subprocess.
 * Usage:            StartProcess[{"executable", arg 1, arg 2, ...}] executes an external program, passing it the specified arguments arg i.
 *
 *                   ProcessDirectory -> Inherited
 * Options:          ProcessEnvironment -> Inherited
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/StartProcess
 * Documentation:    web: http://reference.wolfram.com/language/ref/StartProcess.html
 *
 *                   StartProcess[ProcessLink`Private`arg:_List | _String | _File, ProcessLink`Private`args___, ProcessLink`Private`opts:OptionsPattern[]] := Block[{ProcessLink`Private`$inStartProcessF = True, ProcessLink`Private`procCommand}, ProcessLink`Private`procCommand = ProcessLink`Private`handleFileWrapper[ProcessLink`Private`arg]; If[FailureQ[ProcessLink`Private`procCommand], Message[StartProcess::invsys1, ProcessLink`Private`arg, "command specification"]; Return[$Failed]]; StartProcess[ProcessLink`Private`procCommand, ProcessLink`Private`args, ProcessLink`Private`opts]] /;  !TrueQ[ProcessLink`Private`$inStartProcessF]
 *                   StartProcess[ProcessLink`Private`command_String, ProcessLink`Private`opts:OptionsPattern[]] := ProcessLink`Private`startProcess["StartProcess", {ProcessLink`Private`command}, OptionValue[ProcessEnvironment], OptionValue[ProcessDirectory]]
 *                   StartProcess[{ProcessLink`Private`command_String, ProcessLink`Private`args:(_ | (_ -> _))...}, ProcessLink`Private`opts:OptionsPattern[]] := With[{ProcessLink`Private`cmdlist = Prepend[Flatten[Replace[{ProcessLink`Private`args}, Verbatim[Rule][ProcessLink`Private`a___] :> {ProcessLink`Private`a}, {1}]], ProcessLink`Private`command]}, ProcessLink`Private`startProcess["StartProcess", ProcessLink`Private`cmdlist, OptionValue[ProcessEnvironment], OptionValue[ProcessDirectory]]]
 * Definitions:      StartProcess[ProcessLink`Private`args___] /; (If[Length[{ProcessLink`Private`args}] < 1 || Length[{ProcessLink`Private`args}] > 2, Message[StartProcess::argt, StartProcess, Length[{ProcessLink`Private`args}], 1, 2]]; False) := None
 *
 * Own values:       None
 *
 *                   StartProcess[ProcessLink`Private`arg:_List | _String | _File, ProcessLink`Private`args___, ProcessLink`Private`opts:OptionsPattern[]] := Block[{ProcessLink`Private`$inStartProcessF = True, ProcessLink`Private`procCommand}, ProcessLink`Private`procCommand = ProcessLink`Private`handleFileWrapper[ProcessLink`Private`arg]; If[FailureQ[ProcessLink`Private`procCommand], Message[StartProcess::invsys1, ProcessLink`Private`arg, "command specification"]; Return[$Failed]]; StartProcess[ProcessLink`Private`procCommand, ProcessLink`Private`args, ProcessLink`Private`opts]] /;  !TrueQ[ProcessLink`Private`$inStartProcessF]
 *                   StartProcess[ProcessLink`Private`command_String, ProcessLink`Private`opts:OptionsPattern[]] := ProcessLink`Private`startProcess["StartProcess", {ProcessLink`Private`command}, OptionValue[ProcessEnvironment], OptionValue[ProcessDirectory]]
 *                   StartProcess[{ProcessLink`Private`command_String, ProcessLink`Private`args:(_ | (_ -> _))...}, ProcessLink`Private`opts:OptionsPattern[]] := With[{ProcessLink`Private`cmdlist = Prepend[Flatten[Replace[{ProcessLink`Private`args}, Verbatim[Rule][ProcessLink`Private`a___] :> {ProcessLink`Private`a}, {1}]], ProcessLink`Private`command]}, ProcessLink`Private`startProcess["StartProcess", ProcessLink`Private`cmdlist, OptionValue[ProcessEnvironment], OptionValue[ProcessDirectory]]]
 * Down values:      StartProcess[ProcessLink`Private`args___] /; (If[Length[{ProcessLink`Private`args}] < 1 || Length[{ProcessLink`Private`args}] > 2, Message[StartProcess::argt, StartProcess, Length[{ProcessLink`Private`args}], 1, 2]]; False) := None
 *
 * Up values:        None
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun startProcess(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StartProcess", arguments.toMutableList(), options)
}
