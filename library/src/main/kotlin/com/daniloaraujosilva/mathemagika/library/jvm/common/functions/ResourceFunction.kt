package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ResourceFunction
 *
 * Full name:        System`ResourceFunction
 *
 *                   ResourceFunction[resource] represents the function associated with the specified resource.
 * Usage:            ResourceFunction[resource, prop] gives the specified property of the resource.
 *
 *                   ResourceSystemPath :> $ResourceSystemPath
 *                   ResourceVersion -> Automatic
 *                   ResourceSystemBase :> Automatic
 *                   Version -> Automatic
 * Options:          WolframLanguageVersion -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ResourceFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/ResourceFunction.html
 *
 * Definitions:      None
 *
 * Own values:       None
 *
 * Down values:      None
 *
 * Up values:        None
 *
 * Sub values:       None
 *
 * Default value:    SyntaxInformation[ResourceFunction] = {"ArgumentsPattern" -> {_, _., OptionsPattern[]}, "OptionNames" -> {"ResourceSystemPath", "ResourceVersion", "ResourceSystemBase", "\"Version\"", "\"WolframLanguageVersion\""}}
 *
 * Numeric values:   None
 */
fun resourceFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ResourceFunction", arguments.toMutableList(), options)
}
