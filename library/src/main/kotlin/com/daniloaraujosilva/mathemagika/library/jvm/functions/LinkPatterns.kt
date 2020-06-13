package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             LinkPatterns
 *
 * Full name:        System`LinkPatterns
 *
 * Usage:            LinkPatterns[link] gives a list of the patterns for which definitions were set up when the external program associated with the specified WSTP connection was installed.
 *
 * Options:          None
 *
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/LinkPatterns
 * Documentation:    web: http://reference.wolfram.com/language/ref/LinkPatterns.html
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
fun linkPatterns(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LinkPatterns", arguments.toMutableList(), options)
}
