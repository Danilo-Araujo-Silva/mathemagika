package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FollowRedirects
 *
 * Full name:        System`FollowRedirects
 *
 * Usage:            FollowRedirects is an option for URLRead and related functions that specifies whether to follow HTTP redirects when retrieving a URL.
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/FollowRedirects
 * Documentation:    web: http://reference.wolfram.com/language/ref/FollowRedirects.html
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
fun followRedirects(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FollowRedirects", arguments.toMutableList(), options)
}
