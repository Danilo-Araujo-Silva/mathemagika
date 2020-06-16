package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             DockedCells
 *
 * Full name:        System`DockedCells
 *
 * Usage:            DockedCells is an option for notebooks that gives a list of cells that are to be displayed "docked" at the top of the notebook.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/DockedCells
 * Documentation:    web: http://reference.wolfram.com/language/ref/DockedCells.html
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
fun dockedCells(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DockedCells", arguments.toMutableList(), options)
}
