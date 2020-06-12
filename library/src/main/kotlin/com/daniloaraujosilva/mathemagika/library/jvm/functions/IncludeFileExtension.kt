package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             IncludeFileExtension
 *
 * Full name:        System`IncludeFileExtension
 *
 * Usage:            IncludeFileExtension is an option for notebooks that specifies whether the suffix ".nb" is automatically appended to a notebook’s name when it is first saved.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/IncludeFileExtension
 * Documentation:    web: http://reference.wolfram.com/language/ref/IncludeFileExtension.html
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
fun includeFileExtension(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("IncludeFileExtension", arguments.toMutableList(), options)
}
