package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             MeshCellMeasure
 *
 * Full name:        System`MeshCellMeasure
 *
 * Usage:            MeshCellMeasure is an annotation of MeshRegion and BoundaryMeshRegion objects that gives the measures of mesh cells.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/MeshCellMeasure
 * Documentation:    web: http://reference.wolfram.com/language/ref/MeshCellMeasure.html
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
fun meshCellMeasure(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MeshCellMeasure", arguments.toMutableList(), options)
}
