package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CopyToClipboard
 *
 * Full name:        System`CopyToClipboard
 *
 * Usage:            CopyToClipboard[expr] replaces the contents of the clipboard with expr.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CopyToClipboard
 * Documentation:    web: http://reference.wolfram.com/language/ref/CopyToClipboard.html
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
fun copyToClipboard(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CopyToClipboard", arguments.toMutableList(), options)
}
