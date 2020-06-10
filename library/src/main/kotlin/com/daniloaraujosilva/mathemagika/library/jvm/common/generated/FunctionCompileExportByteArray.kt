package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             FunctionCompileExportByteArray
 * 
 * Full name:        System`FunctionCompileExportByteArray
 * 
 *                   FunctionCompileExportByteArray[func] gives a byte array of binary LLVM code obtained by compiling the function func.
 * Usage:            FunctionCompileExportByteArray[func, "format"] gives a byte array of binary code in the specified format.
 * 
 *                   CompilerOptions -> Automatic
 * Options:          TargetSystem -> Automatic
 * 
 * Attributes:
 * 
 *                   local: paclet:ref/FunctionCompileExportByteArray
 * Documentation:    web: http://reference.wolfram.com/language/ref/FunctionCompileExportByteArray.html
 * 
 *                   FunctionCompileExportByteArray[Compile`API`Export`Private`func_, Compile`API`Export`Private`opts:OptionsPattern[]] := Module[{Compile`API`Export`Private`res = Catch[Compile`API`Export`Private`iFunctionCompileExportDriver[Compile`API`Export`Private`exportByteArrayData, Null, Compile`API`Export`Private`func, "LLVMBinary", Compile`API`Export`Private`opts], _Compile`API`Utilities`compileExportException, #2[[1]] & ]}, Compile`API`Export`Private`res /; Compile`API`Export`Private`res =!= Null]
 *                   FunctionCompileExportByteArray[Compile`API`Export`Private`func_, Compile`API`Export`Private`format_ /;  !OptionQ[Compile`API`Export`Private`format], Compile`API`Export`Private`opts:OptionsPattern[]] := Module[{Compile`API`Export`Private`res = Catch[Compile`API`Export`Private`iFunctionCompileExportDriver[Compile`API`Export`Private`exportByteArrayData, Null, Compile`API`Export`Private`func, Compile`API`Export`Private`format, Compile`API`Export`Private`opts], _Compile`API`Utilities`compileExportException, #2[[1]] & ]}, Compile`API`Export`Private`res /; Compile`API`Export`Private`res =!= Null]
 * Definitions:      FunctionCompileExportByteArray[Compile`API`Export`Private`args___ /; (Compile`API`Utilities`compileArgumentError[{Compile`API`Export`Private`args}, FunctionCompileExportByteArray, 1, 2]; False)] := Null
 * 
 * Own values:       None
 * 
 *                   FunctionCompileExportByteArray[Compile`API`Export`Private`func_, Compile`API`Export`Private`opts:OptionsPattern[]] := Module[{Compile`API`Export`Private`res = Catch[Compile`API`Export`Private`iFunctionCompileExportDriver[Compile`API`Export`Private`exportByteArrayData, Null, Compile`API`Export`Private`func, "LLVMBinary", Compile`API`Export`Private`opts], _Compile`API`Utilities`compileExportException, #2[[1]] & ]}, Compile`API`Export`Private`res /; Compile`API`Export`Private`res =!= Null]
 *                   FunctionCompileExportByteArray[Compile`API`Export`Private`func_, Compile`API`Export`Private`format_ /;  !OptionQ[Compile`API`Export`Private`format], Compile`API`Export`Private`opts:OptionsPattern[]] := Module[{Compile`API`Export`Private`res = Catch[Compile`API`Export`Private`iFunctionCompileExportDriver[Compile`API`Export`Private`exportByteArrayData, Null, Compile`API`Export`Private`func, Compile`API`Export`Private`format, Compile`API`Export`Private`opts], _Compile`API`Utilities`compileExportException, #2[[1]] & ]}, Compile`API`Export`Private`res /; Compile`API`Export`Private`res =!= Null]
 * Down values:      FunctionCompileExportByteArray[Compile`API`Export`Private`args___ /; (Compile`API`Utilities`compileArgumentError[{Compile`API`Export`Private`args}, FunctionCompileExportByteArray, 1, 2]; False)] := Null
 * 
 * Up values:        None
 * 
 * Sub values:       None
 * 
 * Default value:    None
 * 
 * Numeric values:   None
 */
fun functionCompileExportByteArray(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FunctionCompileExportByteArray", arguments.toMutableList(), options)
}
