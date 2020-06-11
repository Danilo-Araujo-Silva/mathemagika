package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FunctionCompile
 *
 * Full name:        System`FunctionCompile
 *
 * Usage:            FunctionCompile[func] generates a compiled code function from a Wolfram Language function.
 *
 * Options:          CompilerOptions -> Automatic
 *
 * Attributes:
 *
 *                   local: paclet:ref/FunctionCompile
 * Documentation:    web: http://reference.wolfram.com/language/ref/FunctionCompile.html
 *
 *                   FunctionCompile[Compile`API`FunctionCompile`Private`func_, Compile`API`FunctionCompile`Private`opts:OptionsPattern[]] := Module[{Compile`API`FunctionCompile`Private`res = Catch[Compile`API`FunctionCompile`Private`iFunctionCompileDriver[Compile`API`FunctionCompile`Private`functionCompileData, Compile`API`FunctionCompile`Private`func, Compile`API`FunctionCompile`Private`opts], _Compile`API`FunctionCompile`Private`functionCompileException, #2[[1]] & ]}, Compile`API`FunctionCompile`Private`res /; Compile`API`FunctionCompile`Private`res =!= Null]
 * Definitions:      FunctionCompile[Compile`API`FunctionCompile`Private`args___ /; (Compile`API`Utilities`compileArgumentError[{Compile`API`FunctionCompile`Private`args}, FunctionCompile, 1]; False)] := Null
 *
 * Own values:       None
 *
 *                   FunctionCompile[Compile`API`FunctionCompile`Private`func_, Compile`API`FunctionCompile`Private`opts:OptionsPattern[]] := Module[{Compile`API`FunctionCompile`Private`res = Catch[Compile`API`FunctionCompile`Private`iFunctionCompileDriver[Compile`API`FunctionCompile`Private`functionCompileData, Compile`API`FunctionCompile`Private`func, Compile`API`FunctionCompile`Private`opts], _Compile`API`FunctionCompile`Private`functionCompileException, #2[[1]] & ]}, Compile`API`FunctionCompile`Private`res /; Compile`API`FunctionCompile`Private`res =!= Null]
 * Down values:      FunctionCompile[Compile`API`FunctionCompile`Private`args___ /; (Compile`API`Utilities`compileArgumentError[{Compile`API`FunctionCompile`Private`args}, FunctionCompile, 1]; False)] := Null
 *
 * Up values:        None
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun functionCompile(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FunctionCompile", arguments.toMutableList(), options)
}
