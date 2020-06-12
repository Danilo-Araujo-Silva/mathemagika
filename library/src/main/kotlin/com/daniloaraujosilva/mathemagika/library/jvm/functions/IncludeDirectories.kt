package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             IncludeDirectories
 *
 * Full name:        System`IncludeDirectories
 *
 * Usage:            IncludeDirectories is an option that specifies whether directories are included in evaluations.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/IncludeDirectories
 * Documentation:    web: http://reference.wolfram.com/language/ref/IncludeDirectories.html
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
fun includeDirectories(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("IncludeDirectories", arguments.toMutableList(), options)
}
