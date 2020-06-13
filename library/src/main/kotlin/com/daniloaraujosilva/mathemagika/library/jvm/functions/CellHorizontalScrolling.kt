package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             CellHorizontalScrolling
 *
 * Full name:        System`CellHorizontalScrolling
 *
 * Usage:            CellHorizontalScrolling is an option for cells that specifies whether the contents of a cell can be scrolled from left to right using the horizontal scroll bar of the notebook.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/CellHorizontalScrolling
 * Documentation:    web: http://reference.wolfram.com/language/ref/CellHorizontalScrolling.html
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
fun cellHorizontalScrolling(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CellHorizontalScrolling", arguments.toMutableList(), options)
}
