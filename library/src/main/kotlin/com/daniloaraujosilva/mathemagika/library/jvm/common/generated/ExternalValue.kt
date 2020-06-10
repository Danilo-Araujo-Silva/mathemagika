package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ExternalValue
 * 
 * Full name:        System`ExternalValue
 * 
 *                   ExternalValue[sys, "sym"] gives the value of "sym" in external evaluator sys. 
 * Usage:            ExternalValue[session, "sym"] gives the value of "sym" in the specified external session.
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/ExternalValue
 * Documentation:    web: http://reference.wolfram.com/language/ref/ExternalValue.html
 * 
 *                   ExternalValue[ExternalEvaluate`Private`system_String, ExternalEvaluate`Private`symbol_String] := Replace[ExternalEvaluate`Private`getExternalSession[ExternalEvaluate`Private`system], ExternalEvaluate`Private`session:_ExternalSessionObject | _String :> ExternalEvaluate[ExternalEvaluate`Private`session, ExternalEvaluate`Private`symbol]]
 * Definitions:      ExternalValue[ExternalEvaluate`Private`session_ExternalSessionObject, ExternalEvaluate`Private`symbol_String] := ExternalEvaluate[ExternalEvaluate`Private`session, ExternalEvaluate`Private`symbol]
 * 
 * Own values:       None
 * 
 *                   ExternalValue[ExternalEvaluate`Private`system_String, ExternalEvaluate`Private`symbol_String] := Replace[ExternalEvaluate`Private`getExternalSession[ExternalEvaluate`Private`system], ExternalEvaluate`Private`session:_ExternalSessionObject | _String :> ExternalEvaluate[ExternalEvaluate`Private`session, ExternalEvaluate`Private`symbol]]
 * Down values:      ExternalValue[ExternalEvaluate`Private`session_ExternalSessionObject, ExternalEvaluate`Private`symbol_String] := ExternalEvaluate[ExternalEvaluate`Private`session, ExternalEvaluate`Private`symbol]
 * 
 * Up values:        None
 * 
 * Sub values:       None
 * 
 * Default value:    None
 * 
 * Numeric values:   None
 */
fun externalValue(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ExternalValue", arguments.toMutableList(), options)
}
