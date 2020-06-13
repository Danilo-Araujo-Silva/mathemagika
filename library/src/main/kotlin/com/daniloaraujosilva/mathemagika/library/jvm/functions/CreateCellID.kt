package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             CreateCellID
 *
 * Full name:        System`CreateCellID
 *
 * Usage:            CreateCellID is an option for Notebook that specifies whether to assign a CellID to cells created in the notebook.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/CreateCellID
 * Documentation:    web: http://reference.wolfram.com/language/ref/CreateCellID.html
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
fun createCellID(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CreateCellID", arguments.toMutableList(), options)
}
