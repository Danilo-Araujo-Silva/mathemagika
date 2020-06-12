package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ContentPadding
 *
 * Full name:        System`ContentPadding
 *
 * Usage:            ContentPadding is an option for objects that can be displayed with frames that specifies whether the vertical margins should shrink wrap tightly around the contents.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ContentPadding
 * Documentation:    web: http://reference.wolfram.com/language/ref/ContentPadding.html
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
fun contentPadding(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ContentPadding", arguments.toMutableList(), options)
}
