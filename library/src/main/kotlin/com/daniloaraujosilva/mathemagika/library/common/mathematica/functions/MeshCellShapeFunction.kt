package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             MeshCellShapeFunction
 *
 * Full name:        System`MeshCellShapeFunction
 *
 * Usage:            MeshCellShapeFunction is an option and annotation for MeshRegion, BoundaryMeshRegion, and related functions that specifies functions to use to generate primitives for rendering mesh cells.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/MeshCellShapeFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/MeshCellShapeFunction.html
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
fun meshCellShapeFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MeshCellShapeFunction", arguments.toMutableList(), options)
}
