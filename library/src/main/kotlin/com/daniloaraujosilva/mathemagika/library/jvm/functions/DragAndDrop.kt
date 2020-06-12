package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DragAndDrop
 *
 * Full name:        System`DragAndDrop
 *
 * Usage:            DragAndDrop is a global front end option that specifies whether to allow drag‐and‐drop editing.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/DragAndDrop
 * Documentation:    web: http://reference.wolfram.com/language/ref/DragAndDrop.html
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
fun dragAndDrop(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DragAndDrop", arguments.toMutableList(), options)
}
