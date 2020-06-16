package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             RemoveBackground
 *
 * Full name:        System`RemoveBackground
 *
 *                   RemoveBackground[image] returns an image with an alpha channel where the background is transparent.
 * Usage:            RemoveBackground[image, model] uses foreground or background model specification.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/RemoveBackground
 * Documentation:    web: http://reference.wolfram.com/language/ref/RemoveBackground.html
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
fun removeBackground(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RemoveBackground", arguments.toMutableList(), options)
}
