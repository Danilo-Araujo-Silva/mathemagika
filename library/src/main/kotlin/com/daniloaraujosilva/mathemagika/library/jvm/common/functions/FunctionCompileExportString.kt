package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FunctionCompileExportString
 *
 * Full name:        System`FunctionCompileExportString
 *
 *                   FunctionCompileExportString[func] gives a string of textual LLVM code obtained by compiling the function func.
 * Usage:            FunctionCompileExportString[func, "format"] gives a string of textual code in the specified format.
 *
 *                   CompilerOptions -> Automatic
 * Options:          TargetSystem -> Automatic
 *
 * Attributes:
 *
 *                   local: paclet:ref/FunctionCompileExportString
 * Documentation:    web: http://reference.wolfram.com/language/ref/FunctionCompileExportString.html
 *
 *                   FunctionCompileExportString[Compile`API`Export`Private`func_, Compile`API`Export`Private`opts:OptionsPattern[]] := Module[{Compile`API`Export`Private`res = Catch[Compile`API`Export`Private`iFunctionCompileExportDriver[Compile`API`Export`Private`exportStringData, Null, Compile`API`Export`Private`func, "LLVM", Compile`API`Export`Private`opts], _Compile`API`Utilities`compileExportException, #2[[1]] & ]}, Compile`API`Export`Private`res /; Compile`API`Export`Private`res =!= Null]
 *                   FunctionCompileExportString[Compile`API`Export`Private`func_, Compile`API`Export`Private`format_ /;  !OptionQ[Compile`API`Export`Private`format], Compile`API`Export`Private`opts:OptionsPattern[]] := Module[{Compile`API`Export`Private`res = Catch[Compile`API`Export`Private`iFunctionCompileExportDriver[Compile`API`Export`Private`exportStringData, Null, Compile`API`Export`Private`func, Compile`API`Export`Private`format, Compile`API`Export`Private`opts], _Compile`API`Utilities`compileExportException, #2[[1]] & ]}, Compile`API`Export`Private`res /; Compile`API`Export`Private`res =!= Null]
 * Definitions:      FunctionCompileExportString[Compile`API`Export`Private`args___ /; (Compile`API`Utilities`compileArgumentError[{Compile`API`Export`Private`args}, FunctionCompileExportString, 1, 2]; False)] := Null
 *
 * Own values:       None
 *
 *                   FunctionCompileExportString[Compile`API`Export`Private`func_, Compile`API`Export`Private`opts:OptionsPattern[]] := Module[{Compile`API`Export`Private`res = Catch[Compile`API`Export`Private`iFunctionCompileExportDriver[Compile`API`Export`Private`exportStringData, Null, Compile`API`Export`Private`func, "LLVM", Compile`API`Export`Private`opts], _Compile`API`Utilities`compileExportException, #2[[1]] & ]}, Compile`API`Export`Private`res /; Compile`API`Export`Private`res =!= Null]
 *                   FunctionCompileExportString[Compile`API`Export`Private`func_, Compile`API`Export`Private`format_ /;  !OptionQ[Compile`API`Export`Private`format], Compile`API`Export`Private`opts:OptionsPattern[]] := Module[{Compile`API`Export`Private`res = Catch[Compile`API`Export`Private`iFunctionCompileExportDriver[Compile`API`Export`Private`exportStringData, Null, Compile`API`Export`Private`func, Compile`API`Export`Private`format, Compile`API`Export`Private`opts], _Compile`API`Utilities`compileExportException, #2[[1]] & ]}, Compile`API`Export`Private`res /; Compile`API`Export`Private`res =!= Null]
 * Down values:      FunctionCompileExportString[Compile`API`Export`Private`args___ /; (Compile`API`Utilities`compileArgumentError[{Compile`API`Export`Private`args}, FunctionCompileExportString, 1, 2]; False)] := Null
 *
 * Up values:        None
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun functionCompileExportString(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FunctionCompileExportString", arguments.toMutableList(), options)
}
