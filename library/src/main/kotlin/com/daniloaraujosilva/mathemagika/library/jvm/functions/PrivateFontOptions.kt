package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             PrivateFontOptions
 *
 * Full name:        System`PrivateFontOptions
 *
 * Usage:            PrivateFontOptions is an option for selections that specifies settings for various font suboptions.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/PrivateFontOptions
 * Documentation:    web: http://reference.wolfram.com/language/ref/PrivateFontOptions.html
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
fun privateFontOptions(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PrivateFontOptions", arguments.toMutableList(), options)
}
