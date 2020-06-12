package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             RowBox
 *
 * Full name:        System`RowBox
 *
 *                   RowBox[{box , box , …}] is a low-level box construct that represents a row of boxes or strings in a notebook expression.
 * Usage:                       1     2
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/RowBox
 * Documentation:    web: http://reference.wolfram.com/language/ref/RowBox.html
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
fun rowBox(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RowBox", arguments.toMutableList(), options)
}
