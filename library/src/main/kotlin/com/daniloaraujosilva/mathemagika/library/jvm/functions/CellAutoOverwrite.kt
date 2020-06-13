package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             CellAutoOverwrite
 *
 * Full name:        System`CellAutoOverwrite
 *
 * Usage:            CellAutoOverwrite is an option for Cell which specifies whether an output cell should be overwritten by new output when the preceding input cell is evaluated.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/CellAutoOverwrite
 * Documentation:    web: http://reference.wolfram.com/language/ref/CellAutoOverwrite.html
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
fun cellAutoOverwrite(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CellAutoOverwrite", arguments.toMutableList(), options)
}
