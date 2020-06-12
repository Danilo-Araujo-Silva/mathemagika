package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ScrollingOptions
 *
 * Full name:        System`ScrollingOptions
 *
 * Usage:            ScrollingOptions is an option for notebooks that specifies settings for scrolling.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ScrollingOptions
 * Documentation:    web: http://reference.wolfram.com/language/ref/ScrollingOptions.html
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
fun scrollingOptions(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ScrollingOptions", arguments.toMutableList(), options)
}
