package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             CompilerOptions
 *
 * Full name:        System`CompilerOptions
 *
 * Usage:            CompilerOptions is an option for FunctionCompile and related functions that allows options for the compilation pipeline to be specified.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/CompilerOptions
 * Documentation:    web: http://reference.wolfram.com/language/ref/CompilerOptions.html
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
 * Default value:    None
 *
 * Numeric values:   None
 */
fun compilerOptions(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CompilerOptions", arguments.toMutableList(), options)
}
