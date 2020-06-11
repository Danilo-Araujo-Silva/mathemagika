package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             MeshCellIndex
 *
 * Full name:        System`MeshCellIndex
 *
 *                   MeshCellIndex[mreg, d] gives the cell indices for cells of dimension d in the mesh region mreg.
 * Usage:            MeshCellIndex[mreg, cellspec] gives the cell indices for the cells specified by cellspec.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/MeshCellIndex
 * Documentation:    web: http://reference.wolfram.com/language/ref/MeshCellIndex.html
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
fun meshCellIndex(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MeshCellIndex", arguments.toMutableList(), options)
}
