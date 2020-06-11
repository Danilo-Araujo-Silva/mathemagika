package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             MeshCellLabel
 *
 * Full name:        System`MeshCellLabel
 *
 * Usage:            MeshCellLabel is an option to MeshRegion, BoundaryMeshRegion and related functions that specifies labels and placements for mesh cells.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/MeshCellLabel
 * Documentation:    web: http://reference.wolfram.com/language/ref/MeshCellLabel.html
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
fun meshCellLabel(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MeshCellLabel", arguments.toMutableList(), options)
}
