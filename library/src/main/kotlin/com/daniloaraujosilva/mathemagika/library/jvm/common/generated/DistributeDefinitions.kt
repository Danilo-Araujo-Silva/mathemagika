package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             DistributeDefinitions
 * 
 * Full name:        System`DistributeDefinitions
 * 
 *                   DistributeDefinitions[s , s , …] distributes all definitions for the symbols s  to all parallel kernels.
 *                                          1   2                                                  i
 * Usage:            DistributeDefinitions["context`"] distributes definitions for all symbols in the specified context.
 * 
 * Options:          DistributedContexts -> Automatic
 * 
 *                   HoldAll
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/DistributeDefinitions
 * Documentation:    web: http://reference.wolfram.com/language/ref/DistributeDefinitions.html
 * 
 *                   DistributeDefinitions[Parallel`Parallel`Private`c_String, Parallel`Parallel`Private`opts:OptionsPattern[]] /; Length[Contexts[Parallel`Parallel`Private`c]] > 0 := ((DistributeDefinitions[Evaluate[Thread[(ToExpression[#1, InputForm, Hold] & ) /@ Names[StringJoin[#1, "*"]], Hold]], Parallel`Parallel`Private`opts]; #1) & ) /@ Contexts[Parallel`Parallel`Private`c]
 *                   DistributeDefinitions[Parallel`Parallel`Private`c_String, Parallel`Parallel`Private`opts:OptionsPattern[]] /; Length[Contexts[Parallel`Parallel`Private`c]] == 0 && Message[DistributeDefinitions::ctx, Parallel`Parallel`Private`c] := Null
 *                   DistributeDefinitions[Parallel`Parallel`Private`expr_, OptionsPattern[]] := Module[{Parallel`Parallel`Private`optval}, Parallel`Parallel`Private`optval = Parallel`Protected`DistOptCheck[DistributeDefinitions, OptionValue[DistributedContexts]]; If[Parallel`Parallel`Private`optval === Automatic, Parallel`Parallel`Private`optval = Parallel`Parallel`Private`allContexts[Parallel`Parallel`Private`expr]]; Parallel`Protected`DistDefs[Parallel`Parallel`Private`expr, {}, Parallel`Parallel`Private`optval]]
 * Definitions:      DistributeDefinitions[Parallel`Parallel`Private`exprs__, Longest[Parallel`Parallel`Private`opts:OptionsPattern[]]] := DistributeDefinitions[{Parallel`Parallel`Private`exprs}, Parallel`Parallel`Private`opts]
 * 
 * Own values:       None
 * 
 *                   DistributeDefinitions[Parallel`Parallel`Private`c_String, Parallel`Parallel`Private`opts:OptionsPattern[]] /; Length[Contexts[Parallel`Parallel`Private`c]] > 0 := ((DistributeDefinitions[Evaluate[Thread[(ToExpression[#1, InputForm, Hold] & ) /@ Names[StringJoin[#1, "*"]], Hold]], Parallel`Parallel`Private`opts]; #1) & ) /@ Contexts[Parallel`Parallel`Private`c]
 *                   DistributeDefinitions[Parallel`Parallel`Private`c_String, Parallel`Parallel`Private`opts:OptionsPattern[]] /; Length[Contexts[Parallel`Parallel`Private`c]] == 0 && Message[DistributeDefinitions::ctx, Parallel`Parallel`Private`c] := Null
 *                   DistributeDefinitions[Parallel`Parallel`Private`expr_, OptionsPattern[]] := Module[{Parallel`Parallel`Private`optval}, Parallel`Parallel`Private`optval = Parallel`Protected`DistOptCheck[DistributeDefinitions, OptionValue[DistributedContexts]]; If[Parallel`Parallel`Private`optval === Automatic, Parallel`Parallel`Private`optval = Parallel`Parallel`Private`allContexts[Parallel`Parallel`Private`expr]]; Parallel`Protected`DistDefs[Parallel`Parallel`Private`expr, {}, Parallel`Parallel`Private`optval]]
 * Down values:      DistributeDefinitions[Parallel`Parallel`Private`exprs__, Longest[Parallel`Parallel`Private`opts:OptionsPattern[]]] := DistributeDefinitions[{Parallel`Parallel`Private`exprs}, Parallel`Parallel`Private`opts]
 * 
 * Up values:        None
 * 
 * Sub values:       None
 * 
 * Default value:    None
 * 
 * Numeric values:   None
 */
fun distributeDefinitions(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DistributeDefinitions", arguments.toMutableList(), options)
}
