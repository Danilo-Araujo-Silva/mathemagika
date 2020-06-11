package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             MeshCells
 *
 * Full name:        System`MeshCells
 *
 *                   MeshCells[mreg, d] gives the cells of dimension d in the mesh region mreg.
 * Usage:            MeshCells[mreg, cellspec] gives the cells specified by cellspec.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/MeshCells
 * Documentation:    web: http://reference.wolfram.com/language/ref/MeshCells.html
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
fun meshCells(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MeshCells", arguments.toMutableList(), options)
}
