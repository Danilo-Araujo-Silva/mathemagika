package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             DefineResourceFunction
 * 
 * Full name:        System`DefineResourceFunction
 * 
 *                   DefineResourceFunction[f] defines a resource function that can be applied to arguments to give the same result as f[…].
 * Usage:            DefineResourceFunction[f, name] uses name as the name of the resource function.
 * 
 *                   ContextPreserved -> False
 *                   FunctionLocation -> Automatic
 * Options:          PersistenceLocations -> {KernelSession}
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/DefineResourceFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/DefineResourceFunction.html
 * 
 *                   DefineResourceFunction[] := FunctionResource`Private`iDefineResourceFunction[]
 * Definitions:      DefineResourceFunction[FunctionResource`Private`args__] := FunctionResource`Private`failOnMessage[FunctionResource`Private`registerNewFunction[FunctionResource`Private`withContext[FunctionResource`Private`saveResourceFunction[FunctionResource`Private`iDefineResourceFunction[FunctionResource`Private`args]]]]]
 * 
 * Own values:       None
 * 
 *                   DefineResourceFunction[] := FunctionResource`Private`iDefineResourceFunction[]
 * Down values:      DefineResourceFunction[FunctionResource`Private`args__] := FunctionResource`Private`failOnMessage[FunctionResource`Private`registerNewFunction[FunctionResource`Private`withContext[FunctionResource`Private`saveResourceFunction[FunctionResource`Private`iDefineResourceFunction[FunctionResource`Private`args]]]]]
 * 
 * Up values:        None
 * 
 * Sub values:       None
 * 
 * Default value:    None
 * 
 * Numeric values:   None
 */
fun defineResourceFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DefineResourceFunction", arguments.toMutableList(), options)
}
