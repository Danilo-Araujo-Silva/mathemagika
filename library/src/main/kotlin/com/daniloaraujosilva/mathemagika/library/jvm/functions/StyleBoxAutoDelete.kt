package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             StyleBoxAutoDelete
 *
 * Full name:        System`StyleBoxAutoDelete
 *
 * Usage:            StyleBoxAutoDelete is an option for selections that specifies whether a StyleBox wrapped around them should be automatically removed when the expression is edited.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/StyleBoxAutoDelete
 * Documentation:    web: http://reference.wolfram.com/language/ref/StyleBoxAutoDelete.html
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
fun styleBoxAutoDelete(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StyleBoxAutoDelete", arguments.toMutableList(), options)
}
