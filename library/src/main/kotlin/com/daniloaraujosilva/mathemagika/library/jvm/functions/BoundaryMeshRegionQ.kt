package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             BoundaryMeshRegionQ
 *
 * Full name:        System`BoundaryMeshRegionQ
 *
 * Usage:            BoundaryMeshRegionQ[reg] yields True if the region reg is a valid BoundaryMeshRegion object and False otherwise.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/BoundaryMeshRegionQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/BoundaryMeshRegionQ.html
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
fun boundaryMeshRegionQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BoundaryMeshRegionQ", arguments.toMutableList(), options)
}
