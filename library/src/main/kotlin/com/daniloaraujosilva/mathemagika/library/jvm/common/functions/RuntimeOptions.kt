package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             RuntimeOptions
 *
 * Full name:        System`RuntimeOptions
 *
 * Usage:            RuntimeOptions is an option for Compile that specifies runtime settings for the compiled function it creates.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/RuntimeOptions
 * Documentation:    web: http://reference.wolfram.com/language/ref/RuntimeOptions.html
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
fun runtimeOptions(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RuntimeOptions", arguments.toMutableList(), options)
}
