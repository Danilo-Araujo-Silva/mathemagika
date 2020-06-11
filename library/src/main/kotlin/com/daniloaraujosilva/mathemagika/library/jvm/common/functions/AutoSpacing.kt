package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             AutoSpacing
 *
 * Full name:        System`AutoSpacing
 *
 * Usage:            AutoSpacing is an option for Style and Cell that specifies whether spaces between successive characters should be adjusted automatically.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/AutoSpacing
 * Documentation:    web: http://reference.wolfram.com/language/ref/AutoSpacing.html
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
fun autoSpacing(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AutoSpacing", arguments.toMutableList(), options)
}
