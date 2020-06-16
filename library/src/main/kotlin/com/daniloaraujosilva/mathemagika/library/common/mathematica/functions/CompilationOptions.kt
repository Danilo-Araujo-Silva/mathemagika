package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             CompilationOptions
 *
 * Full name:        System`CompilationOptions
 *
 * Usage:            CompilationOptions is an option for Compile that specifies settings for the compilation process.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/CompilationOptions
 * Documentation:    web: http://reference.wolfram.com/language/ref/CompilationOptions.html
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
fun compilationOptions(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CompilationOptions", arguments.toMutableList(), options)
}
