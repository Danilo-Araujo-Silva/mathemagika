package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Share
 *
 * Full name:        System`Share
 *
 *                   Share[expr] changes the way expr is stored internally, to try and minimize the amount of memory used.
 * Usage:            Share[] tries to minimize the memory used to store all expressions.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Share
 * Documentation:    web: http://reference.wolfram.com/language/ref/Share.html
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
fun share(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Share", arguments.toMutableList(), options)
}
