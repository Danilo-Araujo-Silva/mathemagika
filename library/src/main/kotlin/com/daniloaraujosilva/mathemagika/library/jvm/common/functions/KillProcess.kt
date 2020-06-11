package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             KillProcess
 *
 * Full name:        System`KillProcess
 *
 * Usage:            KillProcess[proc] kills the external process represented by the ProcessObject proc.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/KillProcess
 * Documentation:    web: http://reference.wolfram.com/language/ref/KillProcess.html
 *
 *                   KillProcess[ProcessLink`Private`po:ProcessObject[(Association["ManagedProcess" -> ProcessLink`Private`t_, ProcessLink`Private`rest___])?AssociationQ], ProcessLink`Private`signal_:-1] := If[TrueQ[ProcessLink`Private`t] && KeyExistsQ[{ProcessLink`Private`rest}, "UID"], Quiet[(Close[ProcessConnection[ProcessLink`Private`po, #1]] & ) /@ {"StandardInput", "StandardOutput", "StandardError"}]; ProcessLink`Private`killProcess[ProcessLink`Private`po["UID"], ProcessLink`Private`signal]; ProcessLink`Private`FreeProcess[ProcessLink`Private`po]; , Module[{ProcessLink`Private`pid = ProcessLink`Private`po["PID"], ProcessLink`Private`match}, If[MemberQ[ProcessLink`Private`pidforuid /@ ProcessLink`Private`$RunningProcesses, ProcessLink`Private`pid], ProcessLink`Private`match = Cases[ProcessLink`Private`$RunningProcesses, ProcessLink`Private`x_Integer /; ProcessLink`Private`pidforuid[ProcessLink`Private`x] == ProcessLink`Private`pid][[1]]; ProcessLink`Private`killProcess[ProcessLink`Private`match, ProcessLink`Private`signal]; ProcessLink`Private`FreeProcess[ProcessLink`Private`match]; ]; ProcessLink`Private`killExtProcess[ProcessLink`Private`pid, ProcessLink`Private`signal]; ]] /; KeyExistsQ[{ProcessLink`Private`rest}, "UID"] || KeyExistsQ[{ProcessLink`Private`rest}, "PID"]
 *                   KillProcess[ProcessLink`Private`po_ProcessObject] := $Failed /; (Message[KillProcess::invpo, HoldForm[DisableFormatting[ProcessLink`Private`po]]]; False)
 * Definitions:      KillProcess[ProcessLink`Private`args___ /; ArgumentCountQ[KillProcess, Length[{ProcessLink`Private`args}], 1, 2]] := $Failed /; False
 *
 * Own values:       None
 *
 *                   KillProcess[ProcessLink`Private`po:ProcessObject[(Association["ManagedProcess" -> ProcessLink`Private`t_, ProcessLink`Private`rest___])?AssociationQ], ProcessLink`Private`signal_:-1] := If[TrueQ[ProcessLink`Private`t] && KeyExistsQ[{ProcessLink`Private`rest}, "UID"], Quiet[(Close[ProcessConnection[ProcessLink`Private`po, #1]] & ) /@ {"StandardInput", "StandardOutput", "StandardError"}]; ProcessLink`Private`killProcess[ProcessLink`Private`po["UID"], ProcessLink`Private`signal]; ProcessLink`Private`FreeProcess[ProcessLink`Private`po]; , Module[{ProcessLink`Private`pid = ProcessLink`Private`po["PID"], ProcessLink`Private`match}, If[MemberQ[ProcessLink`Private`pidforuid /@ ProcessLink`Private`$RunningProcesses, ProcessLink`Private`pid], ProcessLink`Private`match = Cases[ProcessLink`Private`$RunningProcesses, ProcessLink`Private`x_Integer /; ProcessLink`Private`pidforuid[ProcessLink`Private`x] == ProcessLink`Private`pid][[1]]; ProcessLink`Private`killProcess[ProcessLink`Private`match, ProcessLink`Private`signal]; ProcessLink`Private`FreeProcess[ProcessLink`Private`match]; ]; ProcessLink`Private`killExtProcess[ProcessLink`Private`pid, ProcessLink`Private`signal]; ]] /; KeyExistsQ[{ProcessLink`Private`rest}, "UID"] || KeyExistsQ[{ProcessLink`Private`rest}, "PID"]
 *                   KillProcess[ProcessLink`Private`po_ProcessObject] := $Failed /; (Message[KillProcess::invpo, HoldForm[DisableFormatting[ProcessLink`Private`po]]]; False)
 * Down values:      KillProcess[ProcessLink`Private`args___ /; ArgumentCountQ[KillProcess, Length[{ProcessLink`Private`args}], 1, 2]] := $Failed /; False
 *
 * Up values:        None
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun killProcess(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("KillProcess", arguments.toMutableList(), options)
}
