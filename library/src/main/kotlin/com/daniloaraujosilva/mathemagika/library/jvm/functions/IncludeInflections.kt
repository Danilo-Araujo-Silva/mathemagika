package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             IncludeInflections
 *
 * Full name:        System`IncludeInflections
 *
 * Usage:            IncludeInflections is an option for linguistic functions that specifies whether inflected forms of words should be included in results.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/IncludeInflections
 * Documentation:    web: http://reference.wolfram.com/language/ref/IncludeInflections.html
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
fun includeInflections(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("IncludeInflections", arguments.toMutableList(), options)
}
