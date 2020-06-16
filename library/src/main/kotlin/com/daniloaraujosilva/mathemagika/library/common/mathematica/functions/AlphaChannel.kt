package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             AlphaChannel
 *
 * Full name:        System`AlphaChannel
 *
 * Usage:            AlphaChannel[image] returns the alpha channel of image.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AlphaChannel
 * Documentation:    web: http://reference.wolfram.com/language/ref/AlphaChannel.html
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
fun alphaChannel(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AlphaChannel", arguments.toMutableList(), options)
}
