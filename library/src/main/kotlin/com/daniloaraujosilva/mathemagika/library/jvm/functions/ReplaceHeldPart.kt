package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ReplaceHeldPart
 *
 * Full name:        System`ReplaceHeldPart
 *
 * Usage:            System`ReplaceHeldPart
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ReplaceHeldPart
 * Documentation:    web: http://reference.wolfram.com/language/ref/ReplaceHeldPart.html
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
fun replaceHeldPart(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ReplaceHeldPart", arguments.toMutableList(), options)
}
