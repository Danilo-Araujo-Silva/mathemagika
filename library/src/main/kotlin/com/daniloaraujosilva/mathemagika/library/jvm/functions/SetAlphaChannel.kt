package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             SetAlphaChannel
 *
 * Full name:        System`SetAlphaChannel
 *
 *                   SetAlphaChannel[image] adds a fully opaque alpha channel to image.
 *                   SetAlphaChannel[image, a] sets the opacity of all pixels to a.
 * Usage:            SetAlphaChannel[image, aimage] sets the alpha channel of image to aimage.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SetAlphaChannel
 * Documentation:    web: http://reference.wolfram.com/language/ref/SetAlphaChannel.html
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
fun setAlphaChannel(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SetAlphaChannel", arguments.toMutableList(), options)
}
