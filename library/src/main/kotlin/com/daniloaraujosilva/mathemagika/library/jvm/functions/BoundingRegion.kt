package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             BoundingRegion
 *
 * Full name:        System`BoundingRegion
 *
 *                   BoundingRegion[{pt , pt , …}] gives the minimal axis-aligned bounding box for the points pt , pt , ….
 *                                     1    2                                                                   1    2
 *                   BoundingRegion[{pt , pt , …}, form] gives a bounding region of type form.
 *                                     1    2
 * Usage:            BoundingRegion[mreg, …] gives a bounding region for a MeshRegion or BoundaryMeshRegion.
 *
 * Options:          WorkingPrecision -> MachinePrecision
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/BoundingRegion
 * Documentation:    web: http://reference.wolfram.com/language/ref/BoundingRegion.html
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
fun boundingRegion(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BoundingRegion", arguments.toMutableList(), options)
}
