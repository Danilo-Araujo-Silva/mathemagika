package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ListPickerBox
 *
 * Full name:        System`ListPickerBox
 *
 *                   ListPickerBox[list, {val   lbl , val   lbl , …}] is a low-level box structure that represents a list pane control.
 * Usage:                                    1      1     2      2
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ListPickerBox
 * Documentation:    web: http://reference.wolfram.com/language/ref/ListPickerBox.html
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
fun listPickerBox(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ListPickerBox", arguments.toMutableList(), options)
}
