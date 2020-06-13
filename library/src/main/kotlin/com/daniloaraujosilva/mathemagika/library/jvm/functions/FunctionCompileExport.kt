package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             FunctionCompileExport
 *
 * Full name:        System`FunctionCompileExport
 *
 *                   FunctionCompileExport["file.ext", func] exports a compiled version of func in the format specified by the file extension ext.
 * Usage:            FunctionCompileExport[path, func, "format"] exports in the specified format.
 *
 *                   CompilerOptions -> Automatic
 * Options:          TargetSystem -> Automatic
 *
 * Attributes:
 *
 *                   local: paclet:ref/FunctionCompileExport
 * Documentation:    web: http://reference.wolfram.com/language/ref/FunctionCompileExport.html
 *
 *                   FunctionCompileExport[Compile`API`Export`Private`path_, Compile`API`Export`Private`func_, Compile`API`Export`Private`opts:OptionsPattern[]] := Module[{Compile`API`Export`Private`res = Catch[Compile`API`Export`Private`iFunctionCompileExportDriver[Compile`API`Export`Private`exportData, Compile`API`Export`Private`path, Compile`API`Export`Private`func, Compile`API`Export`Private`determineFormat[Compile`API`Export`Private`path], Compile`API`Export`Private`opts], _Compile`API`Utilities`compileExportException, #2[[1]] & ]}, Compile`API`Export`Private`res /; Compile`API`Export`Private`res =!= Null]
 *                   FunctionCompileExport[Compile`API`Export`Private`path_, Compile`API`Export`Private`func_, Compile`API`Export`Private`format_ /;  !OptionQ[Compile`API`Export`Private`format], Compile`API`Export`Private`opts:OptionsPattern[]] := Module[{Compile`API`Export`Private`res = Catch[Compile`API`Export`Private`iFunctionCompileExportDriver[Compile`API`Export`Private`exportData, Compile`API`Export`Private`path, Compile`API`Export`Private`func, Compile`API`Export`Private`format, Compile`API`Export`Private`opts], _Compile`API`Utilities`compileExportException, #2[[1]] & ]}, Compile`API`Export`Private`res /; Compile`API`Export`Private`res =!= Null]
 * Definitions:      FunctionCompileExport[Compile`API`Export`Private`args___ /; (Compile`API`Utilities`compileArgumentError[{Compile`API`Export`Private`args}, FunctionCompileExport, 2, 3]; False)] := Null
 *
 * Own values:       None
 *
 *                   FunctionCompileExport[Compile`API`Export`Private`path_, Compile`API`Export`Private`func_, Compile`API`Export`Private`opts:OptionsPattern[]] := Module[{Compile`API`Export`Private`res = Catch[Compile`API`Export`Private`iFunctionCompileExportDriver[Compile`API`Export`Private`exportData, Compile`API`Export`Private`path, Compile`API`Export`Private`func, Compile`API`Export`Private`determineFormat[Compile`API`Export`Private`path], Compile`API`Export`Private`opts], _Compile`API`Utilities`compileExportException, #2[[1]] & ]}, Compile`API`Export`Private`res /; Compile`API`Export`Private`res =!= Null]
 *                   FunctionCompileExport[Compile`API`Export`Private`path_, Compile`API`Export`Private`func_, Compile`API`Export`Private`format_ /;  !OptionQ[Compile`API`Export`Private`format], Compile`API`Export`Private`opts:OptionsPattern[]] := Module[{Compile`API`Export`Private`res = Catch[Compile`API`Export`Private`iFunctionCompileExportDriver[Compile`API`Export`Private`exportData, Compile`API`Export`Private`path, Compile`API`Export`Private`func, Compile`API`Export`Private`format, Compile`API`Export`Private`opts], _Compile`API`Utilities`compileExportException, #2[[1]] & ]}, Compile`API`Export`Private`res /; Compile`API`Export`Private`res =!= Null]
 * Down values:      FunctionCompileExport[Compile`API`Export`Private`args___ /; (Compile`API`Utilities`compileArgumentError[{Compile`API`Export`Private`args}, FunctionCompileExport, 2, 3]; False)] := Null
 *
 * Up values:        None
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun functionCompileExport(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FunctionCompileExport", arguments.toMutableList(), options)
}
