package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             MeshCellHighlight
 *
 * Full name:        System`MeshCellHighlight
 *
 * Usage:            MeshCellHighlight is an option and annotation of MeshRegion, BoundaryMeshRegion, and related functions that specifies mesh cells to highlight.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/MeshCellHighlight
 * Documentation:    web: http://reference.wolfram.com/language/ref/MeshCellHighlight.html
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
fun meshCellHighlight(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MeshCellHighlight", arguments.toMutableList(), options)
}
