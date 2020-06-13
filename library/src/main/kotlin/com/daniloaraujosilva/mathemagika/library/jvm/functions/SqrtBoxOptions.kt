package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             SqrtBoxOptions
 *
 * Full name:        System`SqrtBoxOptions
 *
 * Usage:            SqrtBoxOptions is an option that specifies settings for SqrtBox objects.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/SqrtBoxOptions
 * Documentation:    web: http://reference.wolfram.com/language/ref/SqrtBoxOptions.html
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
fun sqrtBoxOptions(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SqrtBoxOptions", arguments.toMutableList(), options)
}
