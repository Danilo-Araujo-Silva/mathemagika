package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             MeshCellQuality
 *
 * Full name:        System`MeshCellQuality
 *
 * Usage:            MeshCellQuality is an annotation of MeshRegion and BoundaryMeshRegion objects that gives a quality measure for mesh cells.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/MeshCellQuality
 * Documentation:    web: http://reference.wolfram.com/language/ref/MeshCellQuality.html
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
fun meshCellQuality(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MeshCellQuality", arguments.toMutableList(), options)
}
