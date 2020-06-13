package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ItemSize
 *
 * Full name:        System`ItemSize
 *
 * Usage:            ItemSize is an option for Grid, Column, and related constructs that specifies the sizes to allow for items.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/ItemSize
 * Documentation:    web: http://reference.wolfram.com/language/ref/ItemSize.html
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
fun itemSize(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ItemSize", arguments.toMutableList(), options)
}
