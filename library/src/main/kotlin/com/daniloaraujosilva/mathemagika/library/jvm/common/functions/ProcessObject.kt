package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ProcessObject
 *
 * Full name:        System`ProcessObject
 *
 * Usage:            ProcessObject[...] is an object that represents a runnable external process.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ProcessObject
 * Documentation:    web: http://reference.wolfram.com/language/ref/ProcessObject.html
 *
 * Definitions:      ProcessObject[ProcessLink`Private`pid_Integer] := ProcessObject[Association["ManagedProcess" -> False, "PID" -> ProcessLink`Private`pid]] /; If[ProcessLink`Private`hasProcess[ProcessLink`Private`pid], True, Message[ProcessObject::badpid, ProcessLink`Private`pid]; False]
 *
 * Own values:       None
 *
 * Down values:      ProcessObject[ProcessLink`Private`pid_Integer] := ProcessObject[Association["ManagedProcess" -> False, "PID" -> ProcessLink`Private`pid]] /; If[ProcessLink`Private`hasProcess[ProcessLink`Private`pid], True, Message[ProcessObject::badpid, ProcessLink`Private`pid]; False]
 *
 *                   BinaryReadList[ProcessLink`Private`pr_ProcessObject, ProcessLink`Private`args___, ProcessLink`Private`opts:OptionsPattern[]] ^:= Block[{ProcessLink`Private`cachedStream}, If[ !ProcessLink`Private`subprocessQ[ProcessLink`Private`pr], Message[ProcessObject::noio, "I/O can only be performed on processes spawned by the Wolfram Engine."]; Abort[]]; With[{ProcessLink`Private`p = ProcessLink`Private`internalizeProcess[ProcessLink`Private`pr]}, ProcessLink`Private`cachedStream = ProcessLink`Private`getCachedStream[ProcessLink`Private`p["UID"], "StandardOutput"]; If[TrueQ[OptionValue["AllowIncomplete"]], While[Developer`EndOfStreamQ[ProcessLink`Private`cachedStream] && ProcessLink`Private`processRunningQ[ProcessLink`Private`internalizeProcess[ProcessLink`Private`p]]]; , While[ProcessLink`Private`processRunningQ[ProcessLink`Private`internalizeProcess[ProcessLink`Private`p]]]]; BinaryReadList[ProcessLink`Private`cachedStream, ProcessLink`Private`args, ProcessLink`Private`opts]]]
 *                   BinaryRead[ProcessLink`Private`pr_ProcessObject, ProcessLink`Private`args___, ProcessLink`Private`opts:OptionsPattern[]] ^:= Block[{ProcessLink`Private`cachedStream}, If[ !ProcessLink`Private`subprocessQ[ProcessLink`Private`pr], Message[ProcessObject::noio, "I/O can only be performed on processes spawned by the Wolfram Engine."]; Abort[]]; With[{ProcessLink`Private`p = ProcessLink`Private`internalizeProcess[ProcessLink`Private`pr]}, ProcessLink`Private`cachedStream = ProcessLink`Private`getCachedStream[ProcessLink`Private`p["UID"], "StandardOutput"]; While[Developer`EndOfStreamQ[ProcessLink`Private`cachedStream] && ProcessLink`Private`processRunningQ[ProcessLink`Private`p]]; BinaryRead[ProcessLink`Private`cachedStream, ProcessLink`Private`args, ProcessLink`Private`opts]]]
 *                   ReadByteArray[ProcessLink`Private`pr_ProcessObject, ProcessLink`Private`args___, ProcessLink`Private`opts:OptionsPattern[]] ^:= (If[ !ProcessLink`Private`subprocessQ[ProcessLink`Private`pr], Message[ProcessObject::noio, "I/O can only be performed on processes spawned by the Wolfram Engine."]; Abort[]]; ReadByteArray[ProcessLink`Private`getCachedStream[ProcessLink`Private`internalizeProcess[ProcessLink`Private`pr]["UID"], "StandardOutput"], ProcessLink`Private`args, ProcessLink`Private`opts])
 *                   BinaryWrite[ProcessLink`Private`pr_ProcessObject, ProcessLink`Private`args___] ^:= (If[ !ProcessLink`Private`subprocessQ[ProcessLink`Private`pr], Message[ProcessObject::noio, "I/O can only be performed on processes spawned by the Wolfram Engine."]; Abort[]]; BinaryWrite[ProcessLink`Private`getCachedStream[ProcessLink`Private`internalizeProcess[ProcessLink`Private`pr]["UID"], "StandardInput"], ProcessLink`Private`args])
 *                   Import[ProcessLink`Private`pr_ProcessObject, ProcessLink`Private`args___] ^:= (If[ !ProcessLink`Private`subprocessQ[ProcessLink`Private`pr], Message[ProcessObject::noio, "I/O can only be performed on processes spawned by the Wolfram Engine."]; Abort[]]; Import[ProcessLink`Private`getCachedStream[ProcessLink`Private`internalizeProcess[ProcessLink`Private`pr]["UID"], "StandardOutput"], ProcessLink`Private`args])
 *                   Read[ProcessLink`Private`pr_ProcessObject, ProcessLink`Private`args___, ProcessLink`Private`opts:OptionsPattern[]] ^:= (If[ !ProcessLink`Private`subprocessQ[ProcessLink`Private`pr], Message[ProcessObject::noio, "I/O can only be performed on processes spawned by the Wolfram Engine."]; Abort[]]; Read[ProcessLink`Private`getCachedStream[ProcessLink`Private`internalizeProcess[ProcessLink`Private`pr]["UID"], "StandardOutput"], ProcessLink`Private`args, ProcessLink`Private`opts])
 *                   Write[ProcessLink`Private`pr_ProcessObject, ProcessLink`Private`args___] ^:= (If[ !ProcessLink`Private`subprocessQ[ProcessLink`Private`pr], Message[ProcessObject::noio, "I/O can only be performed on processes spawned by the Wolfram Engine."]; Abort[]]; Write[ProcessLink`Private`getCachedStream[ProcessLink`Private`internalizeProcess[ProcessLink`Private`pr]["UID"], "StandardInput"], ProcessLink`Private`args])
 * Up values:        WriteString[ProcessLink`Private`pr_ProcessObject, ProcessLink`Private`args___] ^:= (If[ !ProcessLink`Private`subprocessQ[ProcessLink`Private`pr], Message[ProcessObject::noio, "I/O can only be performed on processes spawned by the Wolfram Engine."]; Abort[]]; BinaryWrite[ProcessLink`Private`pr, ProcessLink`Private`args])
 *
 *                   ProcessObject[ProcessLink`Private`data_Association]["Dataset"] := Dataset[Association[(#1 -> ProcessObject[ProcessLink`Private`data][#1] & ) /@ DeleteCases[ProcessObject[ProcessLink`Private`data]["Properties"], "Dataset"]]]
 *                   ProcessObject[ProcessLink`Private`data_Association]["StandardInput"] := CheckAbort[Quiet[ProcessConnection[ProcessObject[ProcessLink`Private`data], "StandardInput"]], Missing["NotAvailable"]]
 *                   ProcessObject[ProcessLink`Private`data_Association]["StandardOutput"] := CheckAbort[Quiet[ProcessConnection[ProcessObject[ProcessLink`Private`data], "StandardOutput"]], Missing["NotAvailable"]]
 *                   ProcessObject[ProcessLink`Private`data_Association]["StandardError"] := CheckAbort[Quiet[ProcessConnection[ProcessObject[ProcessLink`Private`data], "StandardError"]], Missing["NotAvailable"]]
 *                   ProcessObject[ProcessLink`Private`data:Association["ManagedProcess" -> True, ___]]["Properties"] := ProcessLink`Private`managedPropertiesList
 *                   ProcessObject[ProcessLink`Private`data:Association["ManagedProcess" -> False, ___]]["Properties"] := ProcessLink`Private`propertiesList
 *                   ProcessObject[ProcessLink`Private`data_Association][ProcessLink`Private`key_] := If[KeyExistsQ[ProcessLink`Private`data, ProcessLink`Private`key], ProcessLink`Private`data[ProcessLink`Private`key], If[ProcessLink`Private`data["ManagedProcess"] == True, ProcessLink`Private`getIDKey[ProcessLink`Private`getProcAssocForUID[ProcessLink`Private`data["UID"]], ProcessLink`Private`key], ProcessLink`Private`getIDKey[ProcessLink`Private`getProcAssocForPID[ProcessLink`Private`data["PID"]], ProcessLink`Private`key]]]
 * Sub values:       ProcessObject[ProcessLink`Private`data_Association][ProcessLink`Private`x___] := Message[ProcessObject::argx, Length[{ProcessLink`Private`x}]]
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun processObject(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ProcessObject", arguments.toMutableList(), options)
}
