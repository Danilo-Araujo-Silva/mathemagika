package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             GrowCutComponents
 *
 * Full name:        System`GrowCutComponents
 *
 *                   GrowCutComponents[image, {marker , marker , …}] creates a segmentation from image by growing each marker .
 * Usage:                                            1        2                                                              i
 *
 *                   CornerNeighbors -> True
 * Options:          MaxIterations -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GrowCutComponents
 * Documentation:    web: http://reference.wolfram.com/language/ref/GrowCutComponents.html
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
fun growCutComponents(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GrowCutComponents", arguments.toMutableList(), options)
}
