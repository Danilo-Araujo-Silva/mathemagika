package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Cell
 *
 * Full name:        System`Cell
 *
 *                   Cell[contents] is the low-level representation of a cell inside a Wolfram System notebook.
 *                   Cell[contents, "style"] represents a cell in the specified style.
 *                   Cell[contents, style , style , …] represents a cell with multiple styles applied to it.
 * Usage:                                1       2
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Cell
 * Documentation:    web: http://reference.wolfram.com/language/ref/Cell.html
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
fun cell(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Cell", arguments.toMutableList(), options)
}
