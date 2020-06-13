package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Image3DSlices
 *
 * Full name:        System`Image3DSlices
 *
 *                   Image3DSlices[image] gives a list of 2D images corresponding to the slices in the Image3D object image.
 *                                                       th
 *                   Image3DSlices[image, n] gives the n   slice as a 2D image.
 *                   Image3DSlices[image, {s , s , …}] extracts the specified slices s .
 *                                          1   2                                     i
 *                   Image3DSlices[image, s  ;; s ] extracts slices s  through s .
 *                                         m     n                   m          n
 * Usage:            Image3DSlices[image, …, d] takes slices in dimension d.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Image3DSlices
 * Documentation:    web: http://reference.wolfram.com/language/ref/Image3DSlices.html
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
fun image3DSlices(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Image3DSlices", arguments.toMutableList(), options)
}
