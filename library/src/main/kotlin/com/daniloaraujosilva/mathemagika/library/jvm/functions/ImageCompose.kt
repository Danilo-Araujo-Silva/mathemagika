package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ImageCompose
 *
 * Full name:        System`ImageCompose
 *
 *                   ImageCompose[image, overlay] gives the result of overlaying overlay onto image.
 *                   ImageCompose[image, {overlay, α}] gives the result of alpha blending overlay into image using blending fraction α.
 *                   ImageCompose[image, overlay, pos] places the center of overlay at position pos in image.
 *                   ImageCompose[image, overlay, pos, opos] places the point opos in overlay at position pos in image.
 *                   ImageCompose[image, overlay, pos, opos, {f , f , mode}] uses the compositing fractions f  and the specified compositing mode.
 * Usage:                                                      i   o                                         k
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ImageCompose
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImageCompose.html
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
fun imageCompose(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImageCompose", arguments.toMutableList(), options)
}
