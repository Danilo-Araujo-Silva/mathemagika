package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             LineSpacing
 *
 * Full name:        System`LineSpacing
 *
 * Usage:            LineSpacing is an option for Style and Cell that specifies the spacing between successive lines of text.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/LineSpacing
 * Documentation:    web: http://reference.wolfram.com/language/ref/LineSpacing.html
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
fun lineSpacing(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LineSpacing", arguments.toMutableList(), options)
}
