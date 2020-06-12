package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FunctionCompileExportLibrary
 *
 * Full name:        System`FunctionCompileExportLibrary
 *
 * Usage:            FunctionCompileExportLibrary[file, func] exports a compiled version of func as a shared library suitable for external use.
 *
 * Options:          CompilerOptions -> Automatic
 *
 * Attributes:
 *
 *                   local: paclet:ref/FunctionCompileExportLibrary
 * Documentation:    web: http://reference.wolfram.com/language/ref/FunctionCompileExportLibrary.html
 *
 *                   FunctionCompileExportLibrary[Compile`API`ExportLibrary`Private`path_, Compile`API`ExportLibrary`Private`func_, Compile`API`ExportLibrary`Private`opts:OptionsPattern[]] := Module[{Compile`API`ExportLibrary`Private`res = Catch[Compile`API`ExportLibrary`Private`iFunctionCompileExportLibrary[Compile`API`ExportLibrary`Private`path, Compile`API`ExportLibrary`Private`func, Compile`API`ExportLibrary`Private`opts], _Compile`API`Utilities`compileExportException, #2[[1]] & ]}, Compile`API`ExportLibrary`Private`res /; Compile`API`ExportLibrary`Private`res =!= Null]
 * Definitions:      FunctionCompileExportLibrary[Compile`API`ExportLibrary`Private`args___ /; (Compile`API`Utilities`compileArgumentError[{Compile`API`ExportLibrary`Private`args}, FunctionCompileExportLibrary, 2]; False)] := Null
 *
 * Own values:       None
 *
 *                   FunctionCompileExportLibrary[Compile`API`ExportLibrary`Private`path_, Compile`API`ExportLibrary`Private`func_, Compile`API`ExportLibrary`Private`opts:OptionsPattern[]] := Module[{Compile`API`ExportLibrary`Private`res = Catch[Compile`API`ExportLibrary`Private`iFunctionCompileExportLibrary[Compile`API`ExportLibrary`Private`path, Compile`API`ExportLibrary`Private`func, Compile`API`ExportLibrary`Private`opts], _Compile`API`Utilities`compileExportException, #2[[1]] & ]}, Compile`API`ExportLibrary`Private`res /; Compile`API`ExportLibrary`Private`res =!= Null]
 * Down values:      FunctionCompileExportLibrary[Compile`API`ExportLibrary`Private`args___ /; (Compile`API`Utilities`compileArgumentError[{Compile`API`ExportLibrary`Private`args}, FunctionCompileExportLibrary, 2]; False)] := Null
 *
 * Up values:        None
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun functionCompileExportLibrary(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FunctionCompileExportLibrary", arguments.toMutableList(), options)
}
