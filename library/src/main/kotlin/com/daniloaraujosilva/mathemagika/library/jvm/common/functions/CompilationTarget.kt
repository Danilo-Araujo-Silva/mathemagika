package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CompilationTarget
 *
 * Full name:        System`CompilationTarget
 *
 * Usage:            CompilationTarget is an option for Compile that specifies the target runtime for the compiled function.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/CompilationTarget
 * Documentation:    web: http://reference.wolfram.com/language/ref/CompilationTarget.html
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
fun compilationTarget(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CompilationTarget", arguments.toMutableList(), options)
}
