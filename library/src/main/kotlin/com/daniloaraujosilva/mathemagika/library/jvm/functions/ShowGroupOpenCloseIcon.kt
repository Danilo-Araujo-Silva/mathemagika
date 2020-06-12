package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ShowGroupOpenCloseIcon
 *
 * Full name:        System`ShowGroupOpenCloseIcon
 *
 * Usage:            ShowGroupOpenCloseIcon is an option for cells that specifies whether a triangular icon is displayed next to the leading cell in a cell group to indicate whether the cell group is open or closed.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: <>None[Local]
 * Documentation:    web: <>None[Web]
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
fun showGroupOpenCloseIcon(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ShowGroupOpenCloseIcon", arguments.toMutableList(), options)
}
