package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Erosion
 *
 * Full name:        System`Erosion
 *
 *                   Erosion[image, ker] gives the morphological erosion of image with respect to the structuring element ker.
 *                   Erosion[image, r] gives the erosion with respect to a range-r square.
 * Usage:            Erosion[data, …] applies erosion to an array of data.
 *
 * Options:          Padding -> Automatic
 *
 *                   HoldRest
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Erosion
 * Documentation:    web: http://reference.wolfram.com/language/ref/Erosion.html
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
fun erosion(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Erosion", arguments.toMutableList(), options)
}
