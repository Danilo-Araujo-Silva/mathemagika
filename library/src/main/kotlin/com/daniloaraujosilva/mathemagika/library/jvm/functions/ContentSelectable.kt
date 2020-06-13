package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ContentSelectable
 *
 * Full name:        System`ContentSelectable
 *
 * Usage:            ContentSelectable is an option to constructs such as Inset, Graphics, and GraphicsGroup that specifies whether and how content within them should be selectable.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ContentSelectable
 * Documentation:    web: http://reference.wolfram.com/language/ref/ContentSelectable.html
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
fun contentSelectable(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ContentSelectable", arguments.toMutableList(), options)
}
