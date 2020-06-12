package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             MeshRegionQ
 *
 * Full name:        System`MeshRegionQ
 *
 * Usage:            MeshRegionQ[reg] yields True if the region reg is a valid MeshRegion object and False otherwise.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/MeshRegionQ
 * Documentation:    web: http://reference.wolfram.com/language/ref/MeshRegionQ.html
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
fun meshRegionQ(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MeshRegionQ", arguments.toMutableList(), options)
}
