package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             MeshCellStyle
 *
 * Full name:        System`MeshCellStyle
 *
 * Usage:            MeshCellStyle is an option and annotation of MeshRegion, BoundaryMeshRegion, and related functions that specifies styles to use for mesh cells.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/MeshCellStyle
 * Documentation:    web: http://reference.wolfram.com/language/ref/MeshCellStyle.html
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
fun meshCellStyle(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MeshCellStyle", arguments.toMutableList(), options)
}
