package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             PasteBoxFormInlineCells
 *
 * Full name:        System`PasteBoxFormInlineCells
 *
 * Usage:            PasteBoxFormInlineCells is an option for cells that specifies whether a new inline cell is created when a typeset expression is pasted into a non-box-type cell.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/PasteBoxFormInlineCells
 * Documentation:    web: http://reference.wolfram.com/language/ref/PasteBoxFormInlineCells.html
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
fun pasteBoxFormInlineCells(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PasteBoxFormInlineCells", arguments.toMutableList(), options)
}
