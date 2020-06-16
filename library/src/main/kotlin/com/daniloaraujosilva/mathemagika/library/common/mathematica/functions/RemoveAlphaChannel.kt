package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             RemoveAlphaChannel
 *
 * Full name:        System`RemoveAlphaChannel
 *
 *                   RemoveAlphaChannel[image] removes all opacity information from image.
 * Usage:            RemoveAlphaChannel[image, c] removes opacity by blending all pixels with the background color c.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/RemoveAlphaChannel
 * Documentation:    web: http://reference.wolfram.com/language/ref/RemoveAlphaChannel.html
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
fun removeAlphaChannel(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RemoveAlphaChannel", arguments.toMutableList(), options)
}
