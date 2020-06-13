package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             RuntimeAttributes
 *
 * Full name:        System`RuntimeAttributes
 *
 * Usage:            RuntimeAttributes is an option for Compile that specifies attributes for the compiled function it creates.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/RuntimeAttributes
 * Documentation:    web: http://reference.wolfram.com/language/ref/RuntimeAttributes.html
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
fun runtimeAttributes(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RuntimeAttributes", arguments.toMutableList(), options)
}
