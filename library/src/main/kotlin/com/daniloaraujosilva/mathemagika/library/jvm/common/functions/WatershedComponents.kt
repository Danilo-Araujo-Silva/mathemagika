package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             WatershedComponents
 *
 * Full name:        System`WatershedComponents
 *
 *                   WatershedComponents[image] computes the watershed transform of image, returning the result as an array in which positive integers label the catchment basins.
 * Usage:            WatershedComponents[image, marker] uses a binary image marker to indicate regions where basins may be created.
 *
 *                   CornerNeighbors -> Automatic
 * Options:          Method -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/WatershedComponents
 * Documentation:    web: http://reference.wolfram.com/language/ref/WatershedComponents.html
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
fun watershedComponents(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("WatershedComponents", arguments.toMutableList(), options)
}
