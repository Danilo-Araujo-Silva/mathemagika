package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ImagePartition
 *
 * Full name:        System`ImagePartition
 *
 *                   ImagePartition[image, s] partitions an image into an array of ss-pixel subimages.
 *                   ImagePartition[image, {w, h}] partitions an image into an array of subimages of pixel width w and pixel height h.
 * Usage:            ImagePartition[image, {w, h}, {dw, dh}] uses pixel offsets dw and dh.
 *
 * Options:          Padding -> None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ImagePartition
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImagePartition.html
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
fun imagePartition(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImagePartition", arguments.toMutableList(), options)
}
