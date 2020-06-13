package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             AllowInlineCells
 *
 * Full name:        System`AllowInlineCells
 *
 * Usage:            AllowInlineCells is an option for SelectedCells, Cell, and related constructs that specifies whether inline cells are permitted.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/AllowInlineCells
 * Documentation:    web: http://reference.wolfram.com/language/ref/AllowInlineCells.html
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
fun allowInlineCells(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AllowInlineCells", arguments.toMutableList(), options)
}
