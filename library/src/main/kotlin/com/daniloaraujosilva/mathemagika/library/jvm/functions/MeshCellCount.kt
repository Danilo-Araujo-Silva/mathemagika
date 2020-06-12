package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             MeshCellCount
 *
 * Full name:        System`MeshCellCount
 *
 *                   MeshCellCount[mreg] gives a list {c , c , …} of counts c  of cells of dimension d in the mesh region mreg.
 *                                                      0   1                d
 *                   MeshCellCount[mreg, d] gives the total count of cells of dimension d.
 * Usage:            MeshCellCount[mreg, cellspec] gives the total count of cells specified by cellspec.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/MeshCellCount
 * Documentation:    web: http://reference.wolfram.com/language/ref/MeshCellCount.html
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
fun meshCellCount(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MeshCellCount", arguments.toMutableList(), options)
}
