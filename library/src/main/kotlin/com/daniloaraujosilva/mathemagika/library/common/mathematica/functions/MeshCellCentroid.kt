package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             MeshCellCentroid
 *
 * Full name:        System`MeshCellCentroid
 *
 * Usage:            MeshCellCentroid is an annotation of MeshRegion and BoundaryMeshRegion objects that gives the centroids of mesh cells.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/MeshCellCentroid
 * Documentation:    web: http://reference.wolfram.com/language/ref/MeshCellCentroid.html
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
fun meshCellCentroid(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MeshCellCentroid", arguments.toMutableList(), options)
}
