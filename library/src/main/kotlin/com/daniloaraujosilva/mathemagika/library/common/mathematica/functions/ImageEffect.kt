package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ImageEffect
 *
 * Full name:        System`ImageEffect
 *
 *                   ImageEffect[image, "effect"] applies the specified image effect to image.
 * Usage:            ImageEffect[image, {"effect", params}] uses parameters params.
 *
 * Options:          RandomSeeding -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ImageEffect
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImageEffect.html
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
fun imageEffect(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImageEffect", arguments.toMutableList(), options)
}
