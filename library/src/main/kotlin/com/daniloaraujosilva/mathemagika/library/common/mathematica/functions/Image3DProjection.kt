package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Image3DProjection
 *
 * Full name:        System`Image3DProjection
 *
 *                   Image3DProjection[image] takes a 3D image and returns a 2D image of maximum projection onto the x-y plane.
 *                   Image3DProjection[image, dir] performs a projection in the direction specified by dir.
 * Usage:            Image3DProjection[image, dir, mode] specifies the projection mode.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Image3DProjection
 * Documentation:    web: http://reference.wolfram.com/language/ref/Image3DProjection.html
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
fun image3DProjection(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Image3DProjection", arguments.toMutableList(), options)
}
