package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             MeshCellMarker
 *
 * Full name:        System`MeshCellMarker
 *
 * Usage:            MeshCellMarker is an option to MeshRegion and BoundaryMeshRegion that specifies integer markers to associate with mesh cells.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/MeshCellMarker
 * Documentation:    web: http://reference.wolfram.com/language/ref/MeshCellMarker.html
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
fun meshCellMarker(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MeshCellMarker", arguments.toMutableList(), options)
}
