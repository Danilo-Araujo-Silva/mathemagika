package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             SpanSymmetric
 *
 * Full name:        System`SpanSymmetric
 *
 * Usage:            SpanSymmetric is an option for selections that specifies whether vertically expandable characters are symmetric about the axis of the selection.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/SpanSymmetric
 * Documentation:    web: http://reference.wolfram.com/language/ref/SpanSymmetric.html
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
fun spanSymmetric(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SpanSymmetric", arguments.toMutableList(), options)
}
